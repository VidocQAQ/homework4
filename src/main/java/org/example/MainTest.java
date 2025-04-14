package org.example;
import org.apache.commons.lang3.StringUtils;

public class MainTest {
    public static void main(String[] args) {
        testIsEmpty();
        testIsBlank();
        testTrim();
    }

    // 测试 isEmpty 方法
    private static void testIsEmpty() {
        System.out.println("\n===== 测试 isEmpty() 方法 =====");

        // 用例1：输入为 null 应该返回 true
        boolean result1 = StringUtils.isEmpty(null);
        printResult("isEmpty(null)", result1, true);

        // 用例2：输入空字符串 "" 应该返回 true（但因缺陷会失败）
        boolean result2 = StringUtils.isEmpty("");
        printResult("isEmpty(\"\")", result2, true);

        // 用例3：输入普通字符串 "test" 应该返回 false
        boolean result3 = StringUtils.isEmpty("test");
        printResult("isEmpty(\"test\")", result3, false);
    }

    // 测试 isBlank 方法
    private static void testIsBlank() {
        System.out.println("\n===== 测试 isBlank() 方法 =====");

        // 用例1：全空格字符串 "   " 应该返回 true
        boolean result1 = StringUtils.isBlank("   ");
        printResult("isBlank(\"   \")", result1, true);

        // 用例2：包含内容的字符串 " test " 应该返回 false
        boolean result2 = StringUtils.isBlank(" test ");
        printResult("isBlank(\" test \")", result2, false);
    }

    // 测试 trim 方法
    private static void testTrim() {
        System.out.println("\n===== 测试 trim() 方法 =====");

        // 用例1：带前后空格的字符串 "  test  " 应该返回 "test"
        String result1 = StringUtils.trim("  test  ");
        printResult("trim(\"  test  \")", result1, "test");

        // 用例2：输入 null 应该返回 null
        String result2 = StringUtils.trim(null);
        printResult("trim(null)", result2, null);
    }

    // 通用的结果打印方法
    private static void printResult(String testName, Object actual, Object expected) {
        boolean isPassed = actual == null ?
                expected == null :
                actual.equals(expected);

        String status = isPassed ? "通过" : "失败";
        String message = String.format(
                "测试项: %-20s | 实际结果: %-10s | 预期结果: %-10s | 状态: %s",
                testName,
                formatValue(actual),
                formatValue(expected),
                status
        );
        System.out.println(message);
    }

    // 格式化显示值（处理 null 和字符串）
    private static String formatValue(Object value) {
        if (value == null) return "null";
        if (value instanceof String) return "\"" + value + "\"";
        return value.toString();
    }
}