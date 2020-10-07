/*
 * Copyright © 2020 Techniker Krankenkasse
 * Copyright © 2020 BITMARCK Service GmbH
 *
 * This file is part of secon-tool
 * (see https://github.com/DieTechniker/secon-tool).
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */
package de.tk.opensource.secon;

import java.security.PrivateKey;
import java.security.cert.X509Certificate;

/**
 * Identifiziert einen Kommunikationsteilnehmer im SECON, welche durch einen privaten Schlüssel und das dazugehörige
 * Zertifikat gekennzeichnet ist.
 * Dies ist eine Schnittstelle für Serviceprovider.
 *
 * @author Christian Schlichtherle
 */
public interface Identity {

    /**
     * Gibt den privaten Schlüssel für diesen Kommunikationsteilnehmer zurück.
     * Der private Schlüssel wird verwendet um Nachrichten mit einer digitalen Signatur zu versehen und um
     * verschlüsselte Nachrichten zu entschlüsseln.
     */
    PrivateKey privateKey() throws Exception;

    /**
     * Gibt das Zertifikat für diesen Kommunikationsteilnehmer zurück.
     * Das Zertifikat wird verwendet um Nachrichten mit einer digitalen Signatur zu versehen und um verschlüsselte
     * Nachrichten zu entschlüsseln.
     */
    X509Certificate certificate() throws Exception;
}