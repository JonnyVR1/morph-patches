package org.java_websocket.protocols;

import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import p153l.fig0;

/* JADX INFO: loaded from: classes3.dex */
public class Protocol implements IProtocol {
    private final String providedProtocol;

    public Protocol(String str) {
        if (str != null) {
            this.providedProtocol = str;
        } else {
            fig0.m125680a();
            throw null;
        }
    }

    @Override // org.java_websocket.protocols.IProtocol
    public boolean acceptProvidedProtocol(String str) {
        for (String str2 : str.replaceAll(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR, "").split(Constants.SEPARATOR_COMMA)) {
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
