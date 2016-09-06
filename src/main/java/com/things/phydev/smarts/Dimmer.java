/**
 * Copyright (c)  2016 Ivelin Yanev <qnev89@gmail.com>.
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or (at your option) any later version.
 * <p>
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details.
 * <p>
 * You should have received a copy of the GNU General Public License along with
 * this program; if not, write to the Free Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110, USA
 */

package com.things.phydev.smarts;

public interface Dimmer {
    /**
     * Returns proportional control.
     *
     * @return the value between 0 and 100.
     */
    public long getDimmerValue();

    /**
     * Sets proportional control.
     *
     * @param dimmer the value between 0 and 100.
     */
    public void setDimmerValue(long dimmer);
}

