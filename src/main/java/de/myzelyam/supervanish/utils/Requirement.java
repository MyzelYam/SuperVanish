/*
 * Copyright © 2015, Leon Mangler and the SuperVanish contributors
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * license, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */

package de.myzelyam.supervanish.utils;

public interface Requirement<T> {
    boolean fulfilledBy(T testSubject);
}
