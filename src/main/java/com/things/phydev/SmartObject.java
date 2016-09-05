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

import java.util.List;

public interface SmartObject {
    /**
     * This method returns the name of the SMART Object. Each SMART objects have
     * name, that name is not unique. The name is user-friendly for
     * applications, that used this method.
     *
     * @return the name of the SMART Object.
     */
    public String getName();

    /**
     * This method returns all SMART resources that are supported. The SMART
     * resources are dynamic and this method allows of the application/s to
     * understand what kinds SMART objects are supported.
     *
     * @return a list of SMART resources that are supported.
     */
    public List<SmartObject> getSupportedResources();

    /**
     * This method returns all SMART resources that are optional. According to
     * SMART specification the SMART objects has resource that are optional and
     * each application/s can gets that resource, using this method.
     *
     * @return list of all optional resources.
     */
    public List<SmartObject> getOptionalResources();

    /**
     * This method returns all SMART resources that are mandatory. Some of the
     * resource objects contain mandatory resources. This method allows of the
     * application/s to understand that SMART resource are mandatory.
     *
     * @return list of all mandatory resources.
     */
    public List<SmartObject> getMandatoryResources();

    /**
     * This method verifies whether the <b>SMART resource</b> is supported.
     *
     * @param resource the <b>SMART resource</b>.
     * @return <code>true</code> if the <b>SMART resource</b> is supported;
     * <code>false</code> otherwise.
     */
    public boolean isResourceSupported(SmartObject resource);
}
