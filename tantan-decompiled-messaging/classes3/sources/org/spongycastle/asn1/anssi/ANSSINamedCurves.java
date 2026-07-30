package org.spongycastle.asn1.anssi;

import java.math.BigInteger;
import java.util.Enumeration;
import java.util.Hashtable;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.p009x9.X9ECParameters;
import org.spongycastle.asn1.p009x9.X9ECParametersHolder;
import org.spongycastle.asn1.p009x9.X9ECPoint;
import org.spongycastle.math.p012ec.ECCurve;
import org.spongycastle.util.Strings;
import org.spongycastle.util.encoders.Hex;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ANSSINamedCurves {
    static X9ECParametersHolder FRP256v1 = new X9ECParametersHolder() { // from class: org.spongycastle.asn1.anssi.ANSSINamedCurves.1
        @Override // org.spongycastle.asn1.p009x9.X9ECParametersHolder
        public X9ECParameters createParameters() {
            BigInteger bigIntegerFromHex = ANSSINamedCurves.fromHex("F1FD178C0B3AD58F10126DE8CE42435B3961ADBCABC8CA6DE8FCF353D86E9C03");
            BigInteger bigIntegerFromHex2 = ANSSINamedCurves.fromHex("F1FD178C0B3AD58F10126DE8CE42435B3961ADBCABC8CA6DE8FCF353D86E9C00");
            BigInteger bigIntegerFromHex3 = ANSSINamedCurves.fromHex("EE353FCA5428A9300D4ABA754A44C00FDFEC0C9AE4B1A1803075ED967B7BB73F");
            BigInteger bigIntegerFromHex4 = ANSSINamedCurves.fromHex("F1FD178C0B3AD58F10126DE8CE42435B53DC67E140D2BF941FFDD459C6D655E1");
            BigInteger bigIntegerValueOf = BigInteger.valueOf(1L);
            ECCurve eCCurveConfigureCurve = ANSSINamedCurves.configureCurve(new ECCurve.C1073Fp(bigIntegerFromHex, bigIntegerFromHex2, bigIntegerFromHex3, bigIntegerFromHex4, bigIntegerValueOf));
            return new X9ECParameters(eCCurveConfigureCurve, new X9ECPoint(eCCurveConfigureCurve, Hex.decode("04B6B3D4C356C139EB31183D4749D423958C27D2DCAF98B70164C97A2DD98F5CFF6142E0F7C8B204911F9271F0F3ECEF8C2701C307E8E4C9E183115A1554062CFB")), bigIntegerFromHex4, bigIntegerValueOf, (byte[]) null);
        }
    };
    static final Hashtable objIds = new Hashtable();
    static final Hashtable curves = new Hashtable();
    static final Hashtable names = new Hashtable();

    static {
        defineCurve("FRP256v1", ANSSIObjectIdentifiers.FRP256v1, FRP256v1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ECCurve configureCurve(ECCurve eCCurve) {
        return eCCurve;
    }

    public static void defineCurve(String str, ASN1ObjectIdentifier aSN1ObjectIdentifier, X9ECParametersHolder x9ECParametersHolder) {
        objIds.put(str.toLowerCase(), aSN1ObjectIdentifier);
        names.put(aSN1ObjectIdentifier, str);
        curves.put(aSN1ObjectIdentifier, x9ECParametersHolder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static BigInteger fromHex(String str) {
        return new BigInteger(1, Hex.decode(str));
    }

    public static X9ECParameters getByName(String str) {
        ASN1ObjectIdentifier oid = getOID(str);
        if (oid == null) {
            return null;
        }
        return getByOID(oid);
    }

    public static X9ECParameters getByOID(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        X9ECParametersHolder x9ECParametersHolder = (X9ECParametersHolder) curves.get(aSN1ObjectIdentifier);
        if (x9ECParametersHolder == null) {
            return null;
        }
        return x9ECParametersHolder.getParameters();
    }

    public static String getName(ASN1ObjectIdentifier aSN1ObjectIdentifier) {
        return (String) names.get(aSN1ObjectIdentifier);
    }

    public static Enumeration getNames() {
        return names.elements();
    }

    public static ASN1ObjectIdentifier getOID(String str) {
        return (ASN1ObjectIdentifier) objIds.get(Strings.toLowerCase(str));
    }
}
