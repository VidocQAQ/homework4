package org.apache.commons.lang3;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringUtilsTest {
    // 测试 isEmpty 方法
    @Test
    public void testIsEmptyWithNullInput() {
        boolean result = StringUtils.isEmpty(null);
        assertTrue("输入null应该返回true", result);
    }

    @Test
    public void testIsEmptyWithEmptyString() {
        boolean result = StringUtils.isEmpty("");
        assertTrue("输入空字符串\"\"应该返回true", result);
    }

    @Test
    public void testIsEmptyWithNormalString() {
        boolean result = StringUtils.isEmpty("test");
        assertFalse("输入非空字符串应该返回false", result);
    }

    // 测试 isBlank 方法
    @Test
    public void testIsBlankWithAllSpaces() {
        boolean result = StringUtils.isBlank("   ");
        assertTrue("全空格字符串应该返回true", result);
    }

    @Test
    public void testIsBlankWithMixedSpaces() {
        boolean result = StringUtils.isBlank(" test ");
        assertFalse("含非空格字符应该返回false", result);
    }

    // 测试 trim 方法
    @Test
    public void testTrimWithSpaces() {
        String input = "  test  ";
        String result = StringUtils.trim(input);
        assertEquals("带空格的字符串应被修剪", "test", result);
    }

    @Test
    public void testTrimWithNullInput() {
        String result = StringUtils.trim(null);
        assertNull("输入null应该返回null", result);
    }
}