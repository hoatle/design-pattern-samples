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
package net.hoatle.dps.gof.abstractfactory.widget.win;

import net.hoatle.dps.gof.abstractfactory.widget.ScrollBar;

/**
 * The {@link ScrollBar} implementation on Windows environment.
 *
 * @author <a href="http://hoatle.net">hoatle (hoatlevan at gmail dot com)</a>
 * @since Jun 5, 2011
 */
public final class WinScrollBar implements ScrollBar {

  /**
   * {@inheritDoc}
   */
  @Override
  public void scroll() {
    System.out.println(this.getClass().getSimpleName() + " is scrolling.");
  }
}
