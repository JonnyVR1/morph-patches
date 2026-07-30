package org.spongycastle.asn1;

import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import org.spongycastle.util.p136io.Streams;
import p153l.C20990w1;
import p153l.p3r0;
import p153l.zpg0;

/* JADX INFO: loaded from: classes3.dex */
public class ASN1InputStream extends FilterInputStream implements BERTags {
    private final boolean lazyEvaluate;
    private final int limit;
    private final byte[][] tmpBuffers;

    public ASN1InputStream(InputStream inputStream, int i, boolean z) {
        super(inputStream);
        this.limit = i;
        this.lazyEvaluate = z;
        this.tmpBuffers = new byte[11][];
    }

    public static ASN1Primitive createPrimitiveDERObject(int i, DefiniteLengthInputStream definiteLengthInputStream, byte[][] bArr) throws IOException {
        if (i == 10) {
            return ASN1Enumerated.fromOctetString(getBuffer(definiteLengthInputStream, bArr));
        }
        if (i == 12) {
            return new DERUTF8String(definiteLengthInputStream.toByteArray());
        }
        if (i == 30) {
            return new DERBMPString(getBMPCharBuffer(definiteLengthInputStream));
        }
        switch (i) {
            case 1:
                return ASN1Boolean.fromOctetString(getBuffer(definiteLengthInputStream, bArr));
            case 2:
                return new ASN1Integer(definiteLengthInputStream.toByteArray(), false);
            case 3:
                return ASN1BitString.fromInputStream(definiteLengthInputStream.getRemaining(), definiteLengthInputStream);
            case 4:
                return new DEROctetString(definiteLengthInputStream.toByteArray());
            case 5:
                return DERNull.INSTANCE;
            case 6:
                return ASN1ObjectIdentifier.fromOctetString(getBuffer(definiteLengthInputStream, bArr));
            default:
                switch (i) {
                    case 18:
                        return new DERNumericString(definiteLengthInputStream.toByteArray());
                    case 19:
                        return new DERPrintableString(definiteLengthInputStream.toByteArray());
                    case 20:
                        return new DERT61String(definiteLengthInputStream.toByteArray());
                    case 21:
                        return new DERVideotexString(definiteLengthInputStream.toByteArray());
                    case 22:
                        return new DERIA5String(definiteLengthInputStream.toByteArray());
                    case 23:
                        return new ASN1UTCTime(definiteLengthInputStream.toByteArray());
                    case 24:
                        return new ASN1GeneralizedTime(definiteLengthInputStream.toByteArray());
                    case 25:
                        return new DERGraphicString(definiteLengthInputStream.toByteArray());
                    case 26:
                        return new DERVisibleString(definiteLengthInputStream.toByteArray());
                    case 27:
                        return new DERGeneralString(definiteLengthInputStream.toByteArray());
                    case 28:
                        return new DERUniversalString(definiteLengthInputStream.toByteArray());
                    default:
                        C20990w1.m204364a("unknown tag ", i, " encountered");
                        return null;
                }
        }
    }

    private static char[] getBMPCharBuffer(DefiniteLengthInputStream definiteLengthInputStream) throws IOException {
        int i;
        int remaining = definiteLengthInputStream.getRemaining() / 2;
        char[] cArr = new char[remaining];
        for (int i2 = 0; i2 < remaining; i2++) {
            int i3 = definiteLengthInputStream.read();
            if (i3 < 0 || (i = definiteLengthInputStream.read()) < 0) {
                break;
            }
            cArr[i2] = (char) ((i3 << 8) | (i & 255));
        }
        return cArr;
    }

    private static byte[] getBuffer(DefiniteLengthInputStream definiteLengthInputStream, byte[][] bArr) throws IOException {
        int remaining = definiteLengthInputStream.getRemaining();
        if (definiteLengthInputStream.getRemaining() >= bArr.length) {
            return definiteLengthInputStream.toByteArray();
        }
        byte[] bArr2 = bArr[remaining];
        if (bArr2 == null) {
            bArr2 = new byte[remaining];
            bArr[remaining] = bArr2;
        }
        Streams.readFully(definiteLengthInputStream, bArr2);
        return bArr2;
    }

    public static int readLength(InputStream inputStream, int i) throws IOException {
        int i2 = inputStream.read();
        if (i2 < 0) {
            throw new EOFException("EOF found when length expected");
        }
        if (i2 == 128) {
            return -1;
        }
        if (i2 <= 127) {
            return i2;
        }
        int i3 = i2 & 127;
        if (i3 > 4) {
            p3r0.m170507a("DER length more than 4 bytes: ", i3);
            return 0;
        }
        int i4 = 0;
        for (int i5 = 0; i5 < i3; i5++) {
            int i6 = inputStream.read();
            if (i6 < 0) {
                throw new EOFException("EOF found reading length");
            }
            i4 = (i4 << 8) + i6;
        }
        if (i4 < 0) {
            zpg0.m220844a("corrupted stream - negative length found");
            return 0;
        }
        if (i4 < i) {
            return i4;
        }
        zpg0.m220844a("corrupted stream - out of bounds length found");
        return 0;
    }

    public static int readTagNumber(InputStream inputStream, int i) throws IOException {
        int i2 = i & 31;
        if (i2 != 31) {
            return i2;
        }
        int i3 = inputStream.read();
        int i4 = 0;
        if ((i3 & 127) == 0) {
            zpg0.m220844a("corrupted stream - invalid high tag number found");
            return 0;
        }
        while (i3 >= 0 && (i3 & 128) != 0) {
            i4 = ((i3 & 127) | i4) << 7;
            i3 = inputStream.read();
        }
        if (i3 >= 0) {
            return (i3 & 127) | i4;
        }
        throw new EOFException("EOF found inside tag value.");
    }

    public ASN1EncodableVector buildDEREncodableVector(DefiniteLengthInputStream definiteLengthInputStream) throws IOException {
        return new ASN1InputStream(definiteLengthInputStream).buildEncodableVector();
    }

    public ASN1EncodableVector buildEncodableVector() throws IOException {
        ASN1EncodableVector aSN1EncodableVector = new ASN1EncodableVector();
        while (true) {
            ASN1Primitive object = readObject();
            if (object == null) {
                return aSN1EncodableVector;
            }
            aSN1EncodableVector.add(object);
        }
    }

    public ASN1Primitive buildObject(int i, int i2, int i3) throws IOException {
        boolean z = (i & 32) != 0;
        DefiniteLengthInputStream definiteLengthInputStream = new DefiniteLengthInputStream(this, i3);
        if ((i & 64) != 0) {
            return new DERApplicationSpecific(z, i2, definiteLengthInputStream.toByteArray());
        }
        if ((i & 128) != 0) {
            return new ASN1StreamParser(definiteLengthInputStream).readTaggedObject(z, i2);
        }
        if (!z) {
            return createPrimitiveDERObject(i2, definiteLengthInputStream, this.tmpBuffers);
        }
        if (i2 == 4) {
            ASN1EncodableVector aSN1EncodableVectorBuildDEREncodableVector = buildDEREncodableVector(definiteLengthInputStream);
            int size = aSN1EncodableVectorBuildDEREncodableVector.size();
            ASN1OctetString[] aSN1OctetStringArr = new ASN1OctetString[size];
            for (int i4 = 0; i4 != size; i4++) {
                aSN1OctetStringArr[i4] = (ASN1OctetString) aSN1EncodableVectorBuildDEREncodableVector.get(i4);
            }
            return new BEROctetString(aSN1OctetStringArr);
        }
        if (i2 == 8) {
            return new DERExternal(buildDEREncodableVector(definiteLengthInputStream));
        }
        if (i2 == 16) {
            return this.lazyEvaluate ? new LazyEncodedSequence(definiteLengthInputStream.toByteArray()) : DERFactory.createSequence(buildDEREncodableVector(definiteLengthInputStream));
        }
        if (i2 == 17) {
            return DERFactory.createSet(buildDEREncodableVector(definiteLengthInputStream));
        }
        C20990w1.m204364a("unknown tag ", i2, " encountered");
        return null;
    }

    public int getLimit() {
        return this.limit;
    }

    public void readFully(byte[] bArr) throws IOException {
        if (Streams.readFully(this, bArr) != bArr.length) {
            throw new EOFException("EOF encountered in middle of object");
        }
    }

    public ASN1Primitive readObject() throws IOException {
        int i = read();
        if (i <= 0) {
            if (i != 0) {
                return null;
            }
            zpg0.m220844a("unexpected end-of-contents marker");
            return null;
        }
        int tagNumber = readTagNumber(this, i);
        boolean z = (i & 32) != 0;
        int length = readLength();
        if (length >= 0) {
            try {
                return buildObject(i, tagNumber, length);
            } catch (IllegalArgumentException e) {
                throw new ASN1Exception("corrupted stream detected", e);
            }
        }
        if (!z) {
            zpg0.m220844a("indefinite-length primitive encoding encountered");
            return null;
        }
        ASN1StreamParser aSN1StreamParser = new ASN1StreamParser(new IndefiniteLengthInputStream(this, this.limit), this.limit);
        if ((i & 64) != 0) {
            return new BERApplicationSpecificParser(tagNumber, aSN1StreamParser).getLoadedObject();
        }
        if ((i & 128) != 0) {
            return new BERTaggedObjectParser(true, tagNumber, aSN1StreamParser).getLoadedObject();
        }
        if (tagNumber == 4) {
            return new BEROctetStringParser(aSN1StreamParser).getLoadedObject();
        }
        if (tagNumber == 8) {
            return new DERExternalParser(aSN1StreamParser).getLoadedObject();
        }
        if (tagNumber == 16) {
            return new BERSequenceParser(aSN1StreamParser).getLoadedObject();
        }
        if (tagNumber == 17) {
            return new BERSetParser(aSN1StreamParser).getLoadedObject();
        }
        zpg0.m220844a("unknown BER object encountered");
        return null;
    }

    public ASN1InputStream(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), bArr.length);
    }

    public ASN1InputStream(byte[] bArr, boolean z) {
        this(new ByteArrayInputStream(bArr), bArr.length, z);
    }

    public ASN1InputStream(InputStream inputStream, int i) {
        this(inputStream, i, false);
    }

    public ASN1InputStream(InputStream inputStream, boolean z) {
        this(inputStream, StreamUtil.findLimit(inputStream), z);
    }

    public ASN1InputStream(InputStream inputStream) {
        this(inputStream, StreamUtil.findLimit(inputStream));
    }

    public int readLength() throws IOException {
        return readLength(this, this.limit);
    }
}
