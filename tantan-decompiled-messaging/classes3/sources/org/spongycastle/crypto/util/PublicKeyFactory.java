package org.spongycastle.crypto.util;

import java.io.IOException;
import java.io.InputStream;
import java.math.BigInteger;
import org.spongycastle.asn1.ASN1Encodable;
import org.spongycastle.asn1.ASN1InputStream;
import org.spongycastle.asn1.ASN1Integer;
import org.spongycastle.asn1.ASN1ObjectIdentifier;
import org.spongycastle.asn1.ASN1Primitive;
import org.spongycastle.asn1.DEROctetString;
import org.spongycastle.asn1.oiw.ElGamalParameter;
import org.spongycastle.asn1.oiw.OIWObjectIdentifiers;
import org.spongycastle.asn1.p009x9.DHPublicKey;
import org.spongycastle.asn1.p009x9.DomainParameters;
import org.spongycastle.asn1.p009x9.ECNamedCurveTable;
import org.spongycastle.asn1.p009x9.ValidationParams;
import org.spongycastle.asn1.p009x9.X962Parameters;
import org.spongycastle.asn1.p009x9.X9ECParameters;
import org.spongycastle.asn1.p009x9.X9ECPoint;
import org.spongycastle.asn1.p009x9.X9ObjectIdentifiers;
import org.spongycastle.asn1.pkcs.DHParameter;
import org.spongycastle.asn1.pkcs.PKCSObjectIdentifiers;
import org.spongycastle.asn1.pkcs.RSAPublicKey;
import org.spongycastle.asn1.x509.AlgorithmIdentifier;
import org.spongycastle.asn1.x509.DSAParameter;
import org.spongycastle.asn1.x509.SubjectPublicKeyInfo;
import org.spongycastle.asn1.x509.X509ObjectIdentifiers;
import org.spongycastle.crypto.p010ec.CustomNamedCurves;
import org.spongycastle.crypto.params.AsymmetricKeyParameter;
import org.spongycastle.crypto.params.DHParameters;
import org.spongycastle.crypto.params.DHPublicKeyParameters;
import org.spongycastle.crypto.params.DHValidationParameters;
import org.spongycastle.crypto.params.DSAParameters;
import org.spongycastle.crypto.params.DSAPublicKeyParameters;
import org.spongycastle.crypto.params.ECDomainParameters;
import org.spongycastle.crypto.params.ECNamedDomainParameters;
import org.spongycastle.crypto.params.ECPublicKeyParameters;
import org.spongycastle.crypto.params.ElGamalParameters;
import org.spongycastle.crypto.params.ElGamalPublicKeyParameters;
import org.spongycastle.crypto.params.RSAKeyParameters;
import p003l.upk0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class PublicKeyFactory {
    public static AsymmetricKeyParameter createKey(SubjectPublicKeyInfo subjectPublicKeyInfo) throws IOException {
        X9ECParameters x9ECParameters;
        ECDomainParameters eCDomainParameters;
        AlgorithmIdentifier algorithm = subjectPublicKeyInfo.getAlgorithm();
        if (algorithm.getAlgorithm().equals(PKCSObjectIdentifiers.rsaEncryption) || algorithm.getAlgorithm().equals(X509ObjectIdentifiers.id_ea_rsa)) {
            RSAPublicKey rSAPublicKey = RSAPublicKey.getInstance(subjectPublicKeyInfo.parsePublicKey());
            return new RSAKeyParameters(false, rSAPublicKey.getModulus(), rSAPublicKey.getPublicExponent());
        }
        DSAParameters dSAParameters = null;
        if (algorithm.getAlgorithm().equals(X9ObjectIdentifiers.dhpublicnumber)) {
            BigInteger y = DHPublicKey.getInstance(subjectPublicKeyInfo.parsePublicKey()).getY();
            DomainParameters domainParameters = DomainParameters.getInstance(algorithm.getParameters());
            BigInteger p = domainParameters.getP();
            BigInteger g = domainParameters.getG();
            BigInteger q = domainParameters.getQ();
            BigInteger j = domainParameters.getJ() != null ? domainParameters.getJ() : null;
            ValidationParams validationParams = domainParameters.getValidationParams();
            return new DHPublicKeyParameters(y, new DHParameters(p, g, q, j, validationParams != null ? new DHValidationParameters(validationParams.getSeed(), validationParams.getPgenCounter().intValue()) : null));
        }
        if (algorithm.getAlgorithm().equals(PKCSObjectIdentifiers.dhKeyAgreement)) {
            DHParameter dHParameter = DHParameter.getInstance(algorithm.getParameters());
            ASN1Integer aSN1Integer = (ASN1Integer) subjectPublicKeyInfo.parsePublicKey();
            BigInteger l2 = dHParameter.getL();
            return new DHPublicKeyParameters(aSN1Integer.getValue(), new DHParameters(dHParameter.getP(), dHParameter.getG(), null, l2 != null ? l2.intValue() : 0));
        }
        if (algorithm.getAlgorithm().equals(OIWObjectIdentifiers.elGamalAlgorithm)) {
            ElGamalParameter elGamalParameter = ElGamalParameter.getInstance(algorithm.getParameters());
            return new ElGamalPublicKeyParameters(((ASN1Integer) subjectPublicKeyInfo.parsePublicKey()).getValue(), new ElGamalParameters(elGamalParameter.getP(), elGamalParameter.getG()));
        }
        if (algorithm.getAlgorithm().equals(X9ObjectIdentifiers.id_dsa) || algorithm.getAlgorithm().equals(OIWObjectIdentifiers.dsaWithSHA1)) {
            ASN1Integer aSN1Integer2 = (ASN1Integer) subjectPublicKeyInfo.parsePublicKey();
            ASN1Encodable parameters = algorithm.getParameters();
            if (parameters != null) {
                DSAParameter dSAParameter = DSAParameter.getInstance(parameters.toASN1Primitive());
                dSAParameters = new DSAParameters(dSAParameter.getP(), dSAParameter.getQ(), dSAParameter.getG());
            }
            return new DSAPublicKeyParameters(aSN1Integer2.getValue(), dSAParameters);
        }
        if (!algorithm.getAlgorithm().equals(X9ObjectIdentifiers.id_ecPublicKey)) {
            upk0.m8197a("algorithm identifier in key not recognised");
            return null;
        }
        X962Parameters x962Parameters = X962Parameters.getInstance(algorithm.getParameters());
        if (x962Parameters.isNamedCurve()) {
            ASN1ObjectIdentifier aSN1ObjectIdentifier = (ASN1ObjectIdentifier) x962Parameters.getParameters();
            x9ECParameters = CustomNamedCurves.getByOID(aSN1ObjectIdentifier);
            if (x9ECParameters == null) {
                x9ECParameters = ECNamedCurveTable.getByOID(aSN1ObjectIdentifier);
            }
            eCDomainParameters = new ECNamedDomainParameters(aSN1ObjectIdentifier, x9ECParameters.getCurve(), x9ECParameters.getG(), x9ECParameters.getN(), x9ECParameters.getH(), x9ECParameters.getSeed());
        } else {
            x9ECParameters = X9ECParameters.getInstance(x962Parameters.getParameters());
            eCDomainParameters = new ECDomainParameters(x9ECParameters.getCurve(), x9ECParameters.getG(), x9ECParameters.getN(), x9ECParameters.getH(), x9ECParameters.getSeed());
        }
        return new ECPublicKeyParameters(new X9ECPoint(x9ECParameters.getCurve(), new DEROctetString(subjectPublicKeyInfo.getPublicKeyData().getBytes())).getPoint(), eCDomainParameters);
    }

    public static AsymmetricKeyParameter createKey(InputStream inputStream) throws IOException {
        return createKey(SubjectPublicKeyInfo.getInstance(new ASN1InputStream(inputStream).readObject()));
    }

    public static AsymmetricKeyParameter createKey(byte[] bArr) throws IOException {
        return createKey(SubjectPublicKeyInfo.getInstance(ASN1Primitive.fromByteArray(bArr)));
    }
}
