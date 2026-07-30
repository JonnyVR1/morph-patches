package org.spongycastle.crypto.util;

import java.io.IOException;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1Null;
import org.spongycastle.asn1.DERNull;
import org.spongycastle.asn1.p132x9.X962Parameters;
import org.spongycastle.asn1.p132x9.X9ECParameters;
import org.spongycastle.asn1.p132x9.X9ObjectIdentifiers;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.asn1.pkcs.PrivateKeyInfo;
import org.spongycastle.asn1.pkcs.RSAPrivateKey;
import org.spongycastle.asn1.sec.ECPrivateKey;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.asn1.x509.DSAParameter;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.crypto.params.DSAParameters;
import org.spongycastle.crypto.params.DSAPrivateKeyParameters;
import org.spongycastle.crypto.params.ECDomainParameters;
import org.spongycastle.crypto.params.ECNamedDomainParameters;
import org.spongycastle.crypto.params.ECPrivateKeyParameters;
import org.spongycastle.crypto.params.RSAKeyParameters;
import org.spongycastle.crypto.params.RSAPrivateCrtKeyParameters;
import p153l.zpg0;

/* JADX INFO: loaded from: classes3.dex */
public class PrivateKeyInfoFactory {
    public static PrivateKeyInfo createPrivateKeyInfo(AsymmetricKeyParameter asymmetricKeyParameter) throws IOException {
        X962Parameters x962Parameters;
        int iBitLength;
        int iBitLength2;
        X962Parameters x962Parameters2;
        if (asymmetricKeyParameter instanceof RSAKeyParameters) {
            RSAPrivateCrtKeyParameters rSAPrivateCrtKeyParameters = (RSAPrivateCrtKeyParameters) asymmetricKeyParameter;
            return new PrivateKeyInfo(new AlgorithmIdentifier(PKCSObjectIdentifiers.rsaEncryption, DERNull.INSTANCE), new RSAPrivateKey(rSAPrivateCrtKeyParameters.getModulus(), rSAPrivateCrtKeyParameters.getPublicExponent(), rSAPrivateCrtKeyParameters.getExponent(), rSAPrivateCrtKeyParameters.getP(), rSAPrivateCrtKeyParameters.getQ(), rSAPrivateCrtKeyParameters.getDP(), rSAPrivateCrtKeyParameters.getDQ(), rSAPrivateCrtKeyParameters.getQInv()));
        }
        if (asymmetricKeyParameter instanceof DSAPrivateKeyParameters) {
            DSAPrivateKeyParameters dSAPrivateKeyParameters = (DSAPrivateKeyParameters) asymmetricKeyParameter;
            DSAParameters parameters = dSAPrivateKeyParameters.getParameters();
            return new PrivateKeyInfo(new AlgorithmIdentifier(X9ObjectIdentifiers.id_dsa, new DSAParameter(parameters.getP(), parameters.getQ(), parameters.getG())), new ASN1Integer(dSAPrivateKeyParameters.getX()));
        }
        if (!(asymmetricKeyParameter instanceof ECPrivateKeyParameters)) {
            zpg0.m220844a("key parameters not recognised.");
            return null;
        }
        ECPrivateKeyParameters eCPrivateKeyParameters = (ECPrivateKeyParameters) asymmetricKeyParameter;
        ECDomainParameters parameters2 = eCPrivateKeyParameters.getParameters();
        if (parameters2 == null) {
            x962Parameters2 = new X962Parameters((ASN1Null) DERNull.INSTANCE);
            iBitLength2 = eCPrivateKeyParameters.getD().bitLength();
        } else {
            if (parameters2 instanceof ECNamedDomainParameters) {
                x962Parameters = new X962Parameters(((ECNamedDomainParameters) parameters2).getName());
                iBitLength = parameters2.getN().bitLength();
            } else {
                x962Parameters = new X962Parameters(new X9ECParameters(parameters2.getCurve(), parameters2.getG(), parameters2.getN(), parameters2.getH(), parameters2.getSeed()));
                iBitLength = parameters2.getN().bitLength();
            }
            X962Parameters x962Parameters3 = x962Parameters;
            iBitLength2 = iBitLength;
            x962Parameters2 = x962Parameters3;
        }
        return new PrivateKeyInfo(new AlgorithmIdentifier(X9ObjectIdentifiers.id_ecPublicKey, x962Parameters2), new ECPrivateKey(iBitLength2, eCPrivateKeyParameters.getD(), x962Parameters2));
    }
}
