package org.spongycastle.asn1.p127ua;

import org.spongycastle.asn1.ASN1ObjectIdentifier;

/* JADX INFO: loaded from: classes3.dex */
public interface UAObjectIdentifiers {
    public static final ASN1ObjectIdentifier UaOid;
    public static final ASN1ObjectIdentifier dstu4145be;
    public static final ASN1ObjectIdentifier dstu4145le;

    static {
        ASN1ObjectIdentifier aSN1ObjectIdentifier = new ASN1ObjectIdentifier("1.2.804.2.1.1.1");
        UaOid = aSN1ObjectIdentifier;
        dstu4145le = aSN1ObjectIdentifier.branch("1.3.1.1");
        dstu4145be = aSN1ObjectIdentifier.branch("1.3.1.1.1.1");
    }
}
