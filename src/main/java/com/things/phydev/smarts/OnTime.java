/**
 * Copyright (c)  2016 Ivelin Yanev <bgfortran@gmail.com>.
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

public interface OnTime {
    /**
     * Sets the time in seconds that the device has been on. Writing a value of
     * 0 resets the counter
     *
     * @param time the time in seconds that the device has been on.
     */
    public void setOnTime(int time);

    /**
     * Returns the time in seconds that the device has been on. Writing a value
     * of 0 resets the counter.
     *
     * @return the time in seconds that the device has been on.
     */
    public int getOnTime();
}
