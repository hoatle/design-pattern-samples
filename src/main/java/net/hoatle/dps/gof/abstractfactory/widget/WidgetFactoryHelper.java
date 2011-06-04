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

import net.hoatle.dps.gof.abstractfactory.widget.linux.LinuxWidgetFactory;
import net.hoatle.dps.gof.abstractfactory.widget.osx.OSXWidgetFactory;
import net.hoatle.dps.gof.abstractfactory.widget.win.WinWidgetFactory;

/**
 * The helper class to get {@link WidgetFactory} based on its environment.
 *
 * @author <a href="http://hoatle.net">hoatle (hoatlevan at gmail dot com)</a>
 * @since Jun 5, 2011
 */
public class WidgetFactoryHelper {

  /**
   * Public Enum for its supported environments.
   */
  public enum ENV {
    WINDOWS,
    LINUX,
    OSX
  }

  /**
   * Gets {@link WidgetFactory} based on its environment.
   *
   * @param env the enum environment.
   * @return WidgetFactory a widget factory
   */
  public static WidgetFactory getWidgetFactory(ENV env) {
    switch (env) {
      case WINDOWS:
        return new WinWidgetFactory();
      case LINUX:
        return new LinuxWidgetFactory();
      case OSX:
        return new OSXWidgetFactory();
    }
    //Default
    return new WinWidgetFactory();
  }
}
