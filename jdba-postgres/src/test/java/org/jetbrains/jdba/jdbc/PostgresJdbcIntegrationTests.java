package org.jetbrains.jdba.jdbc;

/**
 * @author Leonid Bushuev from JetBrains
 */

import org.junit.runner.RunWith;
import org.junit.runners.Suite;



@RunWith(Suite.class)
@Suite.SuiteClasses({
                            PostgresInterServiceProviderTest.class
})
public class PostgresJdbcIntegrationTests {

  static {
    System.setProperty("java.awt.headless", "true");
  }

}