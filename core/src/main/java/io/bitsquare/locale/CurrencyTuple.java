/*
 * This file is part of Bitsquare.
 *
 * Bitsquare is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or (at
 * your option) any later version.
 *
 * Bitsquare is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU Affero General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with Bitsquare. If not, see <http://www.gnu.org/licenses/>.
 */

package io.bitsquare.locale;

import java.io.Serializable;

public class CurrencyTuple implements Serializable {
    // That object is used for serializing to a Json file.

    public final String code;
    public final String name;
    public final int precision; // precision 4 is 1/10000 -> 0.0001 is smallest unit

    public CurrencyTuple(String code, String name) {
        // We use Fiat class and there precision is 4
        // In future we might add custom precision per currency 
        this(code, name, 4);
    }

    public CurrencyTuple(String code, String name, int precision) {
        this.code = code;
        this.name = name;
        this.precision = precision;
    }
}
