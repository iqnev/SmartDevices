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

package com.things.phydev;

public interface SmartResource {
    /**
     * Returns the id of the SMART resource.
     *
     * @return the id of the SMART resource.
     */
    public int getSmartId();

    /**
     * Returns <code>true</code> if the resource is mandatory.
     *
     * @return <code>true</code> if the resource is mandatory;
     * <code>false</code> otherwise.
     */
    public boolean isMandatory();

    /**
     * @return
     */
    public String getResource();

}
