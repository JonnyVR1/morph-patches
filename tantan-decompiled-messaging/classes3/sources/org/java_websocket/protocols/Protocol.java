package org.java_websocket.protocols;

import l.x9g0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class Protocol implements IProtocol {
    private final String providedProtocol;

    public Protocol(String str) {
        if (str != null) {
            this.providedProtocol = str;
        } else {
            x9g0.a();
            throw null;
        }
    }

    @Override // org.java_websocket.protocols.IProtocol
    public boolean acceptProvidedProtocol(String str) {
        for (String str2 : str.replaceAll(" ", "").split(",")) {
            if (this.providedProtocol.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    @Override // org.java_websocket.protocols.IProtocol
    public IProtocol copyInstance() {
        return new Protocol(getProvidedProtocol());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.providedProtocol.equals(((Protocol) obj).providedProtocol);
    }

    @Override // org.java_websocket.protocols.IProtocol
    public String getProvidedProtocol() {
        return this.providedProtocol;
    }

    public int hashCode() {
        return this.providedProtocol.hashCode();
    }

    @Override // org.java_websocket.protocols.IProtocol
    public String toString() {
        return getProvidedProtocol();
    }
}
