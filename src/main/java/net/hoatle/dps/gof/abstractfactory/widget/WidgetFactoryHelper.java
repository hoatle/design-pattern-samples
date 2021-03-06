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
   * Gets {@link WidgetFactory} based on its environment.
   *
   * @return WidgetFactory a widget factory. If no supported os, returns null.
   */
  public static WidgetFactory getWidgetFactory() {
    if (OSUtils.IS_WINDOWS) {
      return new WinWidgetFactory();
    } else if (OSUtils.IS_LINUX) {
      return new LinuxWidgetFactory();
    } else if (OSUtils.IS_MAC_OSX) {
      return new OSXWidgetFactory();
    }
    return null;
  }
}
