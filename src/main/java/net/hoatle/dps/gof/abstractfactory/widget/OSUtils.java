/*
 * Copyright (C) 2011 hoatle.net.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package net.hoatle.dps.gof.abstractfactory.widget;

/**
 * The Utility class for detecting os environment.
 * <p/>
 * Inspiration taken from: http://commons.apache.org/lang/api-release/org/apache/commons/lang/SystemUtils.html
 *
 * @author <a href="http://hoatle.net">hoatle (hoatlevan at gmail dot com)</a>
 * @since Jun 9, 2011
 */
public class OSUtils {

  /**
   * <p> The <code>os.name</code> System Property. Operating system name. </p>
   * <p/>
   * <p> Defaults to <code>null</code> if the runtime does not have security access to read this property or the
   * property does not exist. </p>
   * <p/>
   * <p> This value is initialized when the class is loaded. If {@link System#setProperty(String, String)} or {@link
   * System#setProperties(java.util.Properties)} is called after this class is loaded, the value will be out of sync
   * with that System property. </p>
   */
  public static final String OS_NAME = getSystemProperty("os.name");

  /**
   * <p> Is <code>true</code> if this is Windows. </p>
   * <p/>
   * <p> The field will return <code>false</code> if <code>OS_NAME</code> is <code>null</code>. </p>
   */
  public static boolean IS_WINDOWS = getOSMatchesName("Windows");

  /**
   * <p> Is <code>true</code> if this is Linux. </p>
   * <p/>
   * <p> The field will return <code>false</code> if <code>OS_NAME</code> is <code>null</code>. </p>
   */
  public static boolean IS_LINUX = getOSMatchesName("Linux") || getOSMatchesName("LINUX");

  /**
   * <p> Is <code>true</code> if this is Mac. </p>
   * <p/>
   * <p> The field will return <code>false</code> if <code>OS_NAME</code> is <code>null</code>. </p>
   */
  public static boolean IS_MAC_OSX = getOSMatchesName("Mac OS X");


  /**
   * Decides if the operating system matches.
   *
   * @param osNamePrefix the prefix for the os name
   * @return true if matches, or false if not or can't determine
   */
  private static boolean getOSMatchesName(String osNamePrefix) {
    if (OS_NAME == null) {
      return false;
    }
    return OS_NAME.startsWith(osNamePrefix);
  }


  /**
   * <p> Gets a System property, defaulting to <code>null</code> if the property cannot be read. </p>
   * <p/>
   * <p> If a <code>SecurityException</code> is caught, the return value is <code>null</code> and a message is written
   * to <code>System.err</code>. </p>
   *
   * @param property the system property name
   * @return the system property value or <code>null</code> if a security problem occurs
   */
  private static String getSystemProperty(String property) {
    try {
      return System.getProperty(property);
    } catch (SecurityException ex) {
      // we are not allowed to look at this property
      System.err.println("Caught a SecurityException reading the system property '" + property
              + "'; the SystemUtils property value will default to null.");
      return null;
    }
  }

}
