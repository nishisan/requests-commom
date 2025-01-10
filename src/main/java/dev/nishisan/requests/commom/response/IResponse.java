/*
 * Copyright (C) 2025 Lucas Nishimura < lucas at nishisan.dev > 
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package dev.nishisan.requests.commom.response;

import java.util.Map;

/**
 *
 * @author Lucas Nishimura < lucas at nishisan.dev >
 */
public interface IResponse<T> {

    public String getSourceRequestId();

    public void setSourceRequestId(String id);

    public void setResponseId(String id);

    public String getResponseId();

    public T getPayload();

    public void setPayload(T payload);

    public void setStatusCode(int code);

    public int getStatusCode();

    public void addResponseHeader(String name, String value);

    public String getResponseHeader(String name);

    public Map<String, String> getResponseHeaders();
}