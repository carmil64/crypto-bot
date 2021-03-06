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

package com.skalicky.cryptobot.application;

import com.skalicky.cryptobot.exchange.shared.connectorfacade.api.converter.NonnullConverter;
import com.tngtech.archunit.junit.AnalyzeClasses;
import com.tngtech.archunit.junit.ArchTest;
import com.tngtech.archunit.lang.ArchRule;
import org.jetbrains.annotations.NotNull;

import static com.skalicky.cryptobot.application.TestConstants.BASE_PACKAGE;
import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.classes;

@AnalyzeClasses(packages = BASE_PACKAGE)
public class ClassNamingUTest {

    @ArchTest
    @NotNull
    static final ArchRule test_classes_when_implementNonnullConverter_then_haveNameWithConverterSuffix =
            classes()

                    .that()
                    .implement(NonnullConverter.class)

                    .should().haveNameMatching(".*Converter$");

}
