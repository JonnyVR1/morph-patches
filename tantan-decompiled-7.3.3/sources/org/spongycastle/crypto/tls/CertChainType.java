package org.spongycastle.crypto.tls;

/* JADX INFO: loaded from: classes3.dex */
public class CertChainType {
    public static final short individual_certs = 0;
    public static final short pkipath = 1;

    public static boolean isValid(short s) {
        return s >= 0 && s <= 1;
    }
}
