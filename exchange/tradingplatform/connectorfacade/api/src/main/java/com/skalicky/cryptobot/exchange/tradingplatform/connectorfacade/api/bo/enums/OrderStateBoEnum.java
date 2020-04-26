/*
 * A program to automatically trade cryptocurrencies.
 * Copyright (C) 2020 Tomas Skalicky
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.skalicky.cryptobot.exchange.tradingplatform.connectorfacade.api.bo.enums;

import org.jetbrains.annotations.NotNull;

public enum OrderStateBoEnum {

    // @formatter:off
    NEW                               ("new -> no trades yet"),
    PARTIALLY_EXECUTED                ("partially executed -> trades exist"),
    FULLY_EXECUTED                    ("fully executed -> trades exist"),
    PARTIALLY_EXECUTED_THEN_CANCELED  ("partially executed, then canceled -> trades exist"),
    FULLY_CANCELED                    ("fully canceled -> no trades"),
    PARTIALLY_EXECUTED_THEN_EXPIRED   ("partially executed, then expired -> trades exist"),
    FULLY_EXPIRED                     ("fully expired -> no trades"),
    ;
    // @formatter:on

    @NotNull
    private final String label;

    OrderStateBoEnum(@NotNull final String label) {
        this.label = label;
    }

    @NotNull
    public String getLabel() {
        return label;
    }
}
