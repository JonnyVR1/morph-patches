package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Pair;
import com.bytedance.hume.readapk.C1110a;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.security.DigestException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.security.SignatureException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.MGF1ParameterSpec;
import java.security.spec.PSSParameterSpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p149l.amr0;
import p149l.cmr0;
import p149l.dmr0;
import p149l.hjl;
import p149l.ig3;
import p149l.k250;
import p149l.olr0;
import p149l.pkq0;
import p149l.plr0;
import p149l.rhg0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C2094a {
    /* JADX INFO: renamed from: a */
    public static X509Certificate[][] m12489a(String str) throws Throwable {
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(str, "r");
        try {
            Pair pairM112523c = dmr0.m112523c(randomAccessFile2);
            try {
                if (pairM112523c == null) {
                    throw new zzapd("Not an APK file: ZIP End of Central Directory record not found in file with " + randomAccessFile2.length() + " bytes");
                }
                ByteBuffer byteBuffer = (ByteBuffer) pairM112523c.first;
                long jLongValue = ((Long) pairM112523c.second).longValue();
                long j = jLongValue - 20;
                if (j >= 0) {
                    randomAccessFile2.seek(j);
                    if (randomAccessFile2.readInt() == 1347094023) {
                        throw new zzapd("ZIP64 APK not supported");
                    }
                }
                long jM112521a = dmr0.m112521a(byteBuffer);
                if (jM112521a >= jLongValue) {
                    throw new zzapd("ZIP Central Directory offset out of range: " + jM112521a + ". ZIP End of Central Directory offset: " + jLongValue);
                }
                if (dmr0.m112522b(byteBuffer) + jM112521a != jLongValue) {
                    throw new zzapd("ZIP Central Directory is not immediately followed by End of Central Directory");
                }
                if (jM112521a < 32) {
                    throw new zzapd("APK too small for APK Signing Block. ZIP Central Directory offset: " + jM112521a);
                }
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(24);
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                byteBufferAllocate.order(byteOrder);
                randomAccessFile2.seek(jM112521a - ((long) byteBufferAllocate.capacity()));
                randomAccessFile2.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
                if (byteBufferAllocate.getLong(8) != C1110a.f4710b || byteBufferAllocate.getLong(16) != C1110a.f4709a) {
                    throw new zzapd("No APK Signing Block before ZIP Central Directory");
                }
                long j2 = byteBufferAllocate.getLong(0);
                if (j2 < byteBufferAllocate.capacity() || j2 > 2147483639) {
                    throw new zzapd("APK Signing Block size out of range: " + j2);
                }
                int i = (int) (8 + j2);
                long j3 = jM112521a - ((long) i);
                if (j3 < 0) {
                    throw new zzapd("APK Signing Block offset out of range: " + j3);
                }
                ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(i);
                byteBufferAllocate2.order(byteOrder);
                randomAccessFile2.seek(j3);
                randomAccessFile2.readFully(byteBufferAllocate2.array(), byteBufferAllocate2.arrayOffset(), byteBufferAllocate2.capacity());
                randomAccessFile = randomAccessFile2;
                long j4 = byteBufferAllocate2.getLong(0);
                if (j4 != j2) {
                    throw new zzapd("APK Signing Block sizes in header and footer do not match: " + j4 + " vs " + j2);
                }
                Pair pairCreate = Pair.create(byteBufferAllocate2, Long.valueOf(j3));
                ByteBuffer byteBuffer2 = (ByteBuffer) pairCreate.first;
                long jLongValue2 = ((Long) pairCreate.second).longValue();
                if (byteBuffer2.order() != byteOrder) {
                    throw new IllegalArgumentException("ByteBuffer byte order must be little endian");
                }
                int iCapacity = byteBuffer2.capacity() - 24;
                if (iCapacity < 8) {
                    throw new IllegalArgumentException("end < start: " + iCapacity + " < 8");
                }
                int iCapacity2 = byteBuffer2.capacity();
                if (iCapacity > byteBuffer2.capacity()) {
                    throw new IllegalArgumentException("end > capacity: " + iCapacity + " > " + iCapacity2);
                }
                int iLimit = byteBuffer2.limit();
                int iPosition = byteBuffer2.position();
                try {
                    byteBuffer2.position(0);
                    byteBuffer2.limit(iCapacity);
                    byteBuffer2.position(8);
                    ByteBuffer byteBufferSlice = byteBuffer2.slice();
                    byteBufferSlice.order(byteBuffer2.order());
                    byteBuffer2.position(0);
                    byteBuffer2.limit(iLimit);
                    byteBuffer2.position(iPosition);
                    int i2 = 0;
                    while (byteBufferSlice.hasRemaining()) {
                        i2++;
                        if (byteBufferSlice.remaining() < 8) {
                            throw new zzapd("Insufficient data to read size of APK Signing Block entry #" + i2);
                        }
                        long j5 = byteBufferSlice.getLong();
                        if (j5 < 4 || j5 > 2147483647L) {
                            throw new zzapd("APK Signing Block entry #" + i2 + " size out of range: " + j5);
                        }
                        int i3 = (int) j5;
                        int iPosition2 = byteBufferSlice.position() + i3;
                        if (i3 > byteBufferSlice.remaining()) {
                            throw new zzapd("APK Signing Block entry #" + i2 + " size out of range: " + i3 + ", available: " + byteBufferSlice.remaining());
                        }
                        if (byteBufferSlice.getInt() == 1896449818) {
                            X509Certificate[][] x509CertificateArrM12500l = m12500l(randomAccessFile.getChannel(), new cmr0(m12493e(byteBufferSlice, i3 - 4), jLongValue2, jM112521a, jLongValue, byteBuffer, null));
                            randomAccessFile.close();
                            try {
                                randomAccessFile.close();
                            } catch (IOException unused) {
                            }
                            return x509CertificateArrM12500l;
                        }
                        long j6 = jLongValue2;
                        long j7 = jM112521a;
                        long j8 = jLongValue;
                        byteBufferSlice.position(iPosition2);
                        jLongValue = j8;
                        jM112521a = j7;
                        jLongValue2 = j6;
                    }
                    throw new zzapd("No APK Signature Scheme v2 block in APK Signing Block");
                } catch (Throwable th) {
                    byteBuffer2.position(0);
                    byteBuffer2.limit(iLimit);
                    byteBuffer2.position(iPosition);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                try {
                    randomAccessFile.close();
                } catch (IOException unused2) {
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            randomAccessFile = randomAccessFile2;
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m12490b(int i) {
        if (i == 1) {
            return 32;
        }
        if (i == 2) {
            return 64;
        }
        k250.m144273a("Unknown content digest algorthm: ", i);
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public static int m12491c(int i) {
        if (i == 513) {
            return 1;
        }
        if (i == 514) {
            return 2;
        }
        if (i == 769) {
            return 1;
        }
        switch (i) {
            case 257:
            case 259:
                return 1;
            case 258:
            case 260:
                return 2;
            default:
                ig3.m135964a("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
                return 0;
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m12492d(int i) {
        if (i == 1) {
            return "SHA-256";
        }
        if (i == 2) {
            return "SHA-512";
        }
        k250.m144273a("Unknown content digest algorthm: ", i);
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static ByteBuffer m12493e(ByteBuffer byteBuffer, int i) throws BufferUnderflowException {
        int iLimit = byteBuffer.limit();
        int iPosition = byteBuffer.position();
        int i2 = i + iPosition;
        if (i2 < iPosition || i2 > iLimit) {
            throw new BufferUnderflowException();
        }
        byteBuffer.limit(i2);
        try {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            byteBufferSlice.order(byteBuffer.order());
            byteBuffer.position(i2);
            return byteBufferSlice;
        } finally {
            byteBuffer.limit(iLimit);
        }
    }

    /* JADX INFO: renamed from: f */
    public static ByteBuffer m12494f(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() < 4) {
            hjl.m131386a("Remaining buffer too short to contain length of length-prefixed field. Remaining: ", byteBuffer.remaining());
            return null;
        }
        int i = byteBuffer.getInt();
        if (i < 0) {
            ig3.m135964a("Negative length");
            return null;
        }
        if (i <= byteBuffer.remaining()) {
            return m12493e(byteBuffer, i);
        }
        throw new IOException("Length-prefixed field longer than remaining buffer. Field length: " + i + ", remaining: " + byteBuffer.remaining());
    }

    /* JADX INFO: renamed from: g */
    public static void m12495g(int i, byte[] bArr, int i2) {
        bArr[1] = (byte) (i & 255);
        bArr[2] = (byte) ((i >>> 8) & 255);
        bArr[3] = (byte) ((i >>> 16) & 255);
        bArr[4] = (byte) (i >> 24);
    }

    /* JADX INFO: renamed from: h */
    public static void m12496h(Map map, FileChannel fileChannel, long j, long j2, long j3, ByteBuffer byteBuffer) throws SecurityException {
        if (map.isEmpty()) {
            throw new SecurityException("No digests provided");
        }
        amr0 amr0Var = new amr0(fileChannel, 0L, j);
        amr0 amr0Var2 = new amr0(fileChannel, j2, j3 - j2);
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
        dmr0.m112524d(byteBufferDuplicate, j);
        olr0 olr0Var = new olr0(byteBufferDuplicate);
        int size = map.size();
        int[] iArr = new int[size];
        Iterator it = map.keySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Integer) it.next()).intValue();
            i++;
        }
        try {
            byte[][] bArrM12499k = m12499k(iArr, new plr0[]{amr0Var, amr0Var2, olr0Var});
            for (int i2 = 0; i2 < size; i2++) {
                int i3 = iArr[i2];
                if (!MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i3)), bArrM12499k[i2])) {
                    throw new SecurityException(m12492d(i3).concat(" digest of contents did not verify"));
                }
            }
        } catch (DigestException e) {
            throw new SecurityException("Failed to compute digest(s) of contents", e);
        }
    }

    /* JADX INFO: renamed from: i */
    public static byte[] m12497i(ByteBuffer byteBuffer) throws IOException {
        int i = byteBuffer.getInt();
        if (i < 0) {
            rhg0.m179353a("Negative length");
            return null;
        }
        if (i <= byteBuffer.remaining()) {
            byte[] bArr = new byte[i];
            byteBuffer.get(bArr);
            return bArr;
        }
        throw new IOException("Underflow while reading length-prefixed value. Length: " + i + ", available: " + byteBuffer.remaining());
    }

    /* JADX INFO: renamed from: j */
    public static X509Certificate[] m12498j(ByteBuffer byteBuffer, Map map, CertificateFactory certificateFactory) throws IOException, SecurityException {
        String str;
        Pair pairCreate;
        ByteBuffer byteBufferM12494f = m12494f(byteBuffer);
        ByteBuffer byteBufferM12494f2 = m12494f(byteBuffer);
        byte[] bArrM12497i = m12497i(byteBuffer);
        ArrayList arrayList = new ArrayList();
        byte[] bArrM12497i2 = null;
        byte[] bArrM12497i3 = null;
        int i = -1;
        int i2 = 0;
        while (byteBufferM12494f2.hasRemaining()) {
            i2++;
            try {
                ByteBuffer byteBufferM12494f3 = m12494f(byteBufferM12494f2);
                if (byteBufferM12494f3.remaining() < 8) {
                    throw new SecurityException("Signature record too short");
                }
                int i3 = byteBufferM12494f3.getInt();
                arrayList.add(Integer.valueOf(i3));
                if (i3 != 513 && i3 != 514 && i3 != 769) {
                    switch (i3) {
                        case 257:
                        case 258:
                        case 259:
                        case 260:
                            break;
                        default:
                            continue;
                    }
                }
                if (i != -1) {
                    int iM12491c = m12491c(i3);
                    int iM12491c2 = m12491c(i);
                    if (iM12491c != 1 && iM12491c2 == 1) {
                    }
                }
                bArrM12497i3 = m12497i(byteBufferM12494f3);
                i = i3;
            } catch (IOException e) {
                e = e;
                throw new SecurityException("Failed to parse signature record #" + i2, e);
            } catch (BufferUnderflowException e2) {
                e = e2;
                throw new SecurityException("Failed to parse signature record #" + i2, e);
            }
        }
        if (i == -1) {
            if (i2 == 0) {
                throw new SecurityException("No signatures found");
            }
            throw new SecurityException("No supported signatures found");
        }
        if (i == 513 || i == 514) {
            str = "EC";
        } else if (i != 769) {
            switch (i) {
                case 257:
                case 258:
                case 259:
                case 260:
                    str = "RSA";
                    break;
                default:
                    ig3.m135964a("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
                    return null;
            }
        } else {
            str = "DSA";
        }
        if (i == 513) {
            pairCreate = Pair.create("SHA256withECDSA", null);
        } else if (i == 514) {
            pairCreate = Pair.create("SHA512withECDSA", null);
        } else if (i != 769) {
            switch (i) {
                case 257:
                    pairCreate = Pair.create("SHA256withRSA/PSS", new PSSParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, 32, 1));
                    break;
                case 258:
                    pairCreate = Pair.create("SHA512withRSA/PSS", new PSSParameterSpec("SHA-512", "MGF1", MGF1ParameterSpec.SHA512, 64, 1));
                    break;
                case 259:
                    pairCreate = Pair.create("SHA256withRSA", null);
                    break;
                case 260:
                    pairCreate = Pair.create("SHA512withRSA", null);
                    break;
                default:
                    ig3.m135964a("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
                    return null;
            }
        } else {
            pairCreate = Pair.create("SHA256withDSA", null);
        }
        String str2 = (String) pairCreate.first;
        AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) pairCreate.second;
        try {
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(bArrM12497i));
            Signature signature = Signature.getInstance(str2);
            signature.initVerify(publicKeyGeneratePublic);
            if (algorithmParameterSpec != null) {
                signature.setParameter(algorithmParameterSpec);
            }
            signature.update(byteBufferM12494f);
            if (!signature.verify(bArrM12497i3)) {
                throw new SecurityException(String.valueOf(str2).concat(" signature did not verify"));
            }
            byteBufferM12494f.clear();
            ByteBuffer byteBufferM12494f4 = m12494f(byteBufferM12494f);
            ArrayList arrayList2 = new ArrayList();
            int i4 = 0;
            while (byteBufferM12494f4.hasRemaining()) {
                i4++;
                try {
                    ByteBuffer byteBufferM12494f5 = m12494f(byteBufferM12494f4);
                    if (byteBufferM12494f5.remaining() < 8) {
                        throw new IOException("Record too short");
                    }
                    int i5 = byteBufferM12494f5.getInt();
                    arrayList2.add(Integer.valueOf(i5));
                    if (i5 == i) {
                        bArrM12497i2 = m12497i(byteBufferM12494f5);
                    }
                } catch (IOException e3) {
                    e = e3;
                    throw new IOException("Failed to parse digest record #" + i4, e);
                } catch (BufferUnderflowException e4) {
                    e = e4;
                    throw new IOException("Failed to parse digest record #" + i4, e);
                }
            }
            if (!arrayList.equals(arrayList2)) {
                throw new SecurityException("Signature algorithms don't match between digests and signatures records");
            }
            int iM12491c3 = m12491c(i);
            byte[] bArr = (byte[]) map.put(Integer.valueOf(iM12491c3), bArrM12497i2);
            if (bArr != null && !MessageDigest.isEqual(bArr, bArrM12497i2)) {
                throw new SecurityException(m12492d(iM12491c3).concat(" contents digest does not match the digest specified by a preceding signer"));
            }
            ByteBuffer byteBufferM12494f6 = m12494f(byteBufferM12494f);
            ArrayList arrayList3 = new ArrayList();
            int i6 = 0;
            while (byteBufferM12494f6.hasRemaining()) {
                i6++;
                byte[] bArrM12497i4 = m12497i(byteBufferM12494f6);
                try {
                    arrayList3.add(new zzape((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(bArrM12497i4)), bArrM12497i4));
                } catch (CertificateException e5) {
                    throw new SecurityException("Failed to decode certificate #" + i6, e5);
                }
            }
            if (arrayList3.isEmpty()) {
                throw new SecurityException("No certificates listed");
            }
            if (Arrays.equals(bArrM12497i, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
                return (X509Certificate[]) arrayList3.toArray(new X509Certificate[arrayList3.size()]);
            }
            throw new SecurityException("Public key mismatch between certificate and signature record");
        } catch (InvalidAlgorithmParameterException e6) {
            e = e6;
            throw new SecurityException("Failed to verify " + str2 + " signature", e);
        } catch (InvalidKeyException e7) {
            e = e7;
            throw new SecurityException("Failed to verify " + str2 + " signature", e);
        } catch (NoSuchAlgorithmException e8) {
            e = e8;
            throw new SecurityException("Failed to verify " + str2 + " signature", e);
        } catch (SignatureException e9) {
            e = e9;
            throw new SecurityException("Failed to verify " + str2 + " signature", e);
        } catch (InvalidKeySpecException e10) {
            e = e10;
            throw new SecurityException("Failed to verify " + str2 + " signature", e);
        }
    }

    /* JADX INFO: renamed from: k */
    public static byte[][] m12499k(int[] iArr, plr0[] plr0VarArr) throws DigestException {
        long j;
        int i;
        int length;
        char c;
        int i2;
        byte[][] bArr;
        String str;
        int i3 = 0;
        long jZza = 0;
        while (true) {
            j = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
            i = 3;
            if (i3 >= 3) {
                break;
            }
            jZza += (plr0VarArr[i3].zza() + 1048575) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
            i3++;
        }
        if (jZza >= 2097151) {
            throw new DigestException("Too many chunks: " + jZza);
        }
        byte[][] bArr2 = new byte[iArr.length][];
        int i4 = 0;
        while (true) {
            length = iArr.length;
            c = 5;
            i2 = 1;
            if (i4 >= length) {
                break;
            }
            int i5 = (int) jZza;
            byte[] bArr3 = new byte[(m12490b(iArr[i4]) * i5) + 5];
            bArr3[0] = 90;
            m12495g(i5, bArr3, 1);
            bArr2[i4] = bArr3;
            i4++;
        }
        byte[] bArr4 = new byte[5];
        bArr4[0] = -91;
        MessageDigest[] messageDigestArr = new MessageDigest[length];
        int i6 = 0;
        while (true) {
            bArr = null;
            str = " digest not supported";
            if (i6 >= iArr.length) {
                break;
            }
            String strM12492d = m12492d(iArr[i6]);
            try {
                messageDigestArr[i6] = MessageDigest.getInstance(strM12492d);
                i6++;
            } catch (NoSuchAlgorithmException e) {
                pkq0.m170054a(strM12492d.concat(" digest not supported"), e);
                return null;
            }
        }
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i8 < i) {
            plr0 plr0Var = plr0VarArr[i8];
            int i10 = i8;
            long jZza2 = plr0Var.zza();
            long j2 = 0;
            while (jZza2 > 0) {
                String str2 = str;
                int i11 = i7;
                int iMin = (int) Math.min(jZza2, j);
                m12495g(iMin, bArr4, i2);
                for (int i12 = 0; i12 < length; i12++) {
                    messageDigestArr[i12].update(bArr4);
                }
                long j3 = j2;
                try {
                    plr0Var.mo97685a(messageDigestArr, j3, iMin);
                    char c2 = c;
                    int i13 = 0;
                    while (i13 < iArr.length) {
                        int i14 = iArr[i13];
                        byte[] bArr5 = bArr2[i13];
                        int iM12490b = m12490b(i14);
                        byte[][] bArr6 = bArr;
                        MessageDigest messageDigest = messageDigestArr[i13];
                        int i15 = i13;
                        int iDigest = messageDigest.digest(bArr5, (i9 * iM12490b) + 5, iM12490b);
                        if (iDigest != iM12490b) {
                            throw new RuntimeException("Unexpected output size of " + messageDigest.getAlgorithm() + " digest: " + iDigest);
                        }
                        i13 = i15 + 1;
                        bArr = bArr6;
                    }
                    long j4 = iMin;
                    long j5 = j3 + j4;
                    jZza2 -= j4;
                    i9++;
                    c = c2;
                    str = str2;
                    i7 = i11;
                    i2 = 1;
                    j2 = j5;
                    j = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
                } catch (IOException e2) {
                    throw new DigestException("Failed to digest chunk #" + i9 + " of section #" + i11, e2);
                }
            }
            i7++;
            i8 = i10 + 1;
            j = PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
            i = 3;
            i2 = 1;
        }
        String str3 = str;
        byte[][] bArr7 = bArr;
        byte[][] bArr8 = new byte[iArr.length][];
        for (int i16 = 0; i16 < iArr.length; i16++) {
            int i17 = iArr[i16];
            byte[] bArr9 = bArr2[i16];
            String strM12492d2 = m12492d(i17);
            try {
                bArr8[i16] = MessageDigest.getInstance(strM12492d2).digest(bArr9);
            } catch (NoSuchAlgorithmException e3) {
                pkq0.m170054a(strM12492d2.concat(str3), e3);
                return bArr7;
            }
        }
        return bArr8;
    }

    /* JADX INFO: renamed from: l */
    public static X509Certificate[][] m12500l(FileChannel fileChannel, cmr0 cmr0Var) throws SecurityException {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer byteBufferM12494f = m12494f(cmr0Var.f81600a);
                int i = 0;
                while (byteBufferM12494f.hasRemaining()) {
                    i++;
                    try {
                        arrayList.add(m12498j(m12494f(byteBufferM12494f), map, certificateFactory));
                    } catch (IOException | SecurityException | BufferUnderflowException e) {
                        throw new SecurityException("Failed to parse/verify signer #" + i + " block", e);
                    }
                }
                if (i <= 0) {
                    throw new SecurityException("No signers found");
                }
                if (map.isEmpty()) {
                    throw new SecurityException("No content digests found");
                }
                m12496h(map, fileChannel, cmr0Var.f81601b, cmr0Var.f81602c, cmr0Var.f81603d, cmr0Var.f81604e);
                return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
            } catch (IOException e2) {
                throw new SecurityException("Failed to read list of signers", e2);
            }
        } catch (CertificateException e3) {
            pkq0.m170054a("Failed to obtain X.509 CertificateFactory", e3);
            return null;
        }
    }
}
