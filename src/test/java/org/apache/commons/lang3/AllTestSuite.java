
package org.apache.commons.lang3;

import org.apache.commons.lang3.StringUtilsTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
/**
 * JUnit 4 测试套件：聚合所有相关测试类
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({
        StringUtilsTest.class,  // 包含的测试类1

})
public class  AllTestSuite {
    // 空类，仅用于组织测试类
}