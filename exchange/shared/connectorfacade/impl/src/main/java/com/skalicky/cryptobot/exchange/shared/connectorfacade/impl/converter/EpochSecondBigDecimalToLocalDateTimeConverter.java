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

package com.skalicky.cryptobot.exchange.shared.connectorfacade.impl.converter;

import com.skalicky.cryptobot.exchange.shared.connectorfacade.api.converter.NonnullConverter;
import com.skalicky.cryptobot.exchange.shared.connectorfacade.impl.util.DateTimeUtil;
import org.jetbrains.annotations.NotNull;

import java.math.BigDecimal;
import java.time.Instant;
import java.time.LocalDateTime;

public final class EpochSecondBigDecimalToLocalDateTimeConverter implements NonnullConverter<BigDecimal, LocalDateTime> {

    @Override
    @NotNull
    public LocalDateTime convert(@NotNull final BigDecimal epochSecond) {
        final long epochInNanos = epochSecond.multiply(BigDecimal.valueOf(1_000_000_000)).longValue();
        final var instant = Instant.ofEpochSecond(0, epochInNanos);
        return LocalDateTime.ofInstant(instant, DateTimeUtil.BERLIN_ZONE_ID);
    }
}
