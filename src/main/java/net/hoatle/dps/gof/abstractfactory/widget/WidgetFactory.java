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
 * The WidgetFactory to create corresponding widgets based on its environment: Windows, Linux or OSX.
 *
 * @author <a href="http://hoatle.net">hoatle (hoatlevan at gmail dot com)</a>
 * @since Jun 5, 2011
 */
public interface WidgetFactory {
  /**
   * Creates a scroll bar.
   *
   * @return a {@link ScrollBar} instance.
   */
  ScrollBar createScrollBar();

  /**
   * Creates a window.
   *
   * @return a {@link Window} instance.
   */
  Window createWindow();
}
