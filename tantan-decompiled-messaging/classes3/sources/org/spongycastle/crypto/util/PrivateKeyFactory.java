package org.spongycastle.crypto.util;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1InputStream;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.oiw.ElGamalParameter;
import org.spongycastle.asn1.oiw.OIWObjectIdentifiers;
import org.spongycastle.asn1.p009x9.ECNamedCurveTable;
import org.spongycastle.asn1.p009x9.X962Parameters;
import org.spongycastle.asn1.p009x9.X9ECParameters;
import org.spongycastle.asn1.p009x9.X9ObjectIdentifiers;
import org.spongycastle.asn1.pkcs.DHParameter;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.asn1.pkcs.PrivateKeyInfo;
import org.spongycastle.asn1.pkcs.RSAPrivateKey;
import org.spongycastle.asn1.sec.ECPrivateKey;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.asn1.x509.DSAParameter;
import org.spongycastle.crypto.p010ec.CustomNamedCurves;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.crypto.params.DHParameters;
import org.spongycastle.crypto.params.DHPrivateKeyParameters;
import org.spongycastle.crypto.params.DSAParameters;
import org.spongycastle.crypto.params.DSAPrivateKeyParameters;
import org.spongycastle.crypto.params.ECDomainParameters;
import org.spongycastle.crypto.params.ECNamedDomainParameters;
import org.spongycastle.crypto.params.ECPrivateKeyParameters;
import org.spongycastle.crypto.params.ElGamalParameters;
import org.spongycastle.crypto.params.ElGamalPrivateKeyParameters;
import org.spongycastle.crypto.params.RSAPrivateCrtKeyParameters;
import p003l.upk0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class PrivateKeyFactory {
    public static AsymmetricKeyParameter createKey(PrivateKeyInfo privateKeyInfo) throws IOException {
        ECDomainParameters eCDomainParameters;
        AlgorithmIdentifier privateKeyAlgorithm = privateKeyInfo.getPrivateKeyAlgorithm();
        if (privateKeyAlgorithm.getAlgorithm().equals(PKCSObjectIdentifiers.rsaEncryption)) {
            RSAPrivateKey rSAPrivateKey = RSAPrivateKey.getInstance(privateKeyInfo.parsePrivateKey());
            return new RSAPrivateCrtKeyParameters(rSAPrivateKey.getModulus(), rSAPrivateKey.getPublicExponent(), rSAPrivateKey.getPrivateExponent(), rSAPrivateKey.getPrime1(), rSAPrivateKey.getPrime2(), rSAPrivateKey.getExponent1(), rSAPrivateKey.getExponent2(), rSAPrivateKey.getCoefficient());
        }
        DSAParameters dSAParameters = null;
        if (privateKeyAlgorithm.getAlgorithm().equals(PKCSObjectIdentifiers.dhKeyAgreement)) {
            DHParameter dHParameter = DHParameter.getInstance(privateKeyAlgorithm.getParameters());
            ASN1Integer aSN1Integer = (ASN1Integer) privateKeyInfo.parsePrivateKey();
            BigInteger l2 = dHParameter.getL();
            return new DHPrivateKeyParameters(aSN1Integer.getValue(), new DHParameters(dHParameter.getP(), dHParameter.getG(), null, l2 == null ? 0 : l2.intValue()));
        }
        if (privateKeyAlgorithm.getAlgorithm().equals(OIWObjectIdentifiers.elGamalAlgorithm)) {
            ElGamalParameter elGamalParameter = ElGamalParameter.getInstance(privateKeyAlgorithm.getParameters());
            return new ElGamalPrivateKeyParameters(((ASN1Integer) privateKeyInfo.parsePrivateKey()).getValue(), new ElGamalParameters(elGamalParameter.getP(), elGamalParameter.getG()));
        }
        if (privateKeyAlgorithm.getAlgorithm().equals(X9ObjectIdentifiers.id_dsa)) {
            ASN1Integer aSN1Integer2 = (ASN1Integer) privateKeyInfo.parsePrivateKey();
            ASN1Encodable parameters = privateKeyAlgorithm.getParameters();
            if (parameters != null) {
                DSAParameter dSAParameter = DSAParameter.getInstance(parameters.toASN1Primitive());
                dSAParameters = new DSAParameters(dSAParameter.getP(), dSAParameter.getQ(), dSAParameter.getG());
            }
            return new DSAPrivateKeyParameters(aSN1Integer2.getValue(), dSAParameters);
        }
        if (!privateKeyAlgorithm.getAlgorithm().equals(X9ObjectIdentifiers.id_ecPublicKey)) {
            upk0.m8197a("algorithm identifier in key not recognised");
            return null;
        }
        X962Parameters x962Parameters = new X962Parameters((ASN1Primitive) privateKeyAlgorithm.getParameters());
        if (x962Parameters.isNamedCurve()) {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) x962Parameters.getParameters();
            X9ECParameters byOID = CustomNamedCurves.getByOID(aSN1ObjectIdentifier);
            if (byOID == null) {
                byOID = ECNamedCurveTable.getByOID(aSN1ObjectIdentifier);
            }
            eCDomainParameters = new ECNamedDomainParameters(aSN1ObjectIdentifier, byOID.getCurve(), byOID.getG(), byOID.getN(), byOID.getH(), byOID.getSeed());
        } else {
            X9ECParameters x9ECParameters = X9ECParameters.getInstance(x962Parameters.getParameters());
            eCDomainParameters = new ECDomainParameters(x9ECParameters.getCurve(), x9ECParameters.getG(), x9ECParameters.getN(), x9ECParameters.getH(), x9ECParameters.getSeed());
        }
        return new ECPrivateKeyParameters(ECPrivateKey.getInstance(privateKeyInfo.parsePrivateKey()).getKey(), eCDomainParameters);
    }

    public static AsymmetricKeyParameter createKey(InputStream inputStream) throws IOException {
        return createKey(PrivateKeyInfo.getInstance(new ASN1InputStream(inputStream).readObject()));
    }

    public static AsymmetricKeyParameter createKey(byte[] bArr) throws IOException {
        return createKey(PrivateKeyInfo.getInstance(ASN1Primitive.fromByteArray(bArr)));
    }
}
