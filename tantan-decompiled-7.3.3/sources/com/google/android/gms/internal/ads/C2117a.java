package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import android.util.Pair;
import com.bytedance.hume.readapk.C1133a;
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
import p153l.gvr0;
import p153l.ivr0;
import p153l.jvr0;
import p153l.uur0;
import p153l.vtq0;
import p153l.vur0;
import p153l.wg3;
import p153l.yll;
import p153l.za50;
import p153l.zpg0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.a */
/* JADX INFO: loaded from: classes6.dex */
public final class C2117a {
    /* JADX INFO: renamed from: a */
    public static X509Certificate[][] m12543a(String str) throws Throwable {
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2 = new RandomAccessFile(str, "r");
        try {
            Pair pairM147101c = jvr0.m147101c(randomAccessFile2);
            try {
                if (pairM147101c == null) {
                    throw new zzapd("Not an APK file: ZIP End of Central Directory record not found in file with " + randomAccessFile2.length() + " bytes");
                }
                ByteBuffer byteBuffer = (ByteBuffer) pairM147101c.first;
                long jLongValue = ((Long) pairM147101c.second).longValue();
                long j = jLongValue - 20;
                if (j >= 0) {
                    randomAccessFile2.seek(j);
                    if (randomAccessFile2.readInt() == 1347094023) {
                        throw new zzapd("ZIP64 APK not supported");
                    }
                }
                long jM147099a = jvr0.m147099a(byteBuffer);
                if (jM147099a >= jLongValue) {
                    throw new zzapd("ZIP Central Directory offset out of range: " + jM147099a + ". ZIP End of Central Directory offset: " + jLongValue);
                }
                if (jvr0.m147100b(byteBuffer) + jM147099a != jLongValue) {
                    throw new zzapd("ZIP Central Directory is not immediately followed by End of Central Directory");
                }
                if (jM147099a < 32) {
                    throw new zzapd("APK too small for APK Signing Block. ZIP Central Directory offset: " + jM147099a);
                }
                ByteBuffer byteBufferAllocate = ByteBuffer.allocate(24);
                ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
                byteBufferAllocate.order(byteOrder);
                randomAccessFile2.seek(jM147099a - ((long) byteBufferAllocate.capacity()));
                randomAccessFile2.readFully(byteBufferAllocate.array(), byteBufferAllocate.arrayOffset(), byteBufferAllocate.capacity());
                if (byteBufferAllocate.getLong(8) != C1133a.f4747b || byteBufferAllocate.getLong(16) != C1133a.f4746a) {
                    throw new zzapd("No APK Signing Block before ZIP Central Directory");
                }
                long j2 = byteBufferAllocate.getLong(0);
                if (j2 < byteBufferAllocate.capacity() || j2 > 2147483639) {
                    throw new zzapd("APK Signing Block size out of range: " + j2);
                }
                int i = (int) (8 + j2);
                long j3 = jM147099a - ((long) i);
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
                            X509Certificate[][] x509CertificateArrM12554l = m12554l(randomAccessFile.getChannel(), new ivr0(m12547e(byteBufferSlice, i3 - 4), jLongValue2, jM147099a, jLongValue, byteBuffer, null));
                            randomAccessFile.close();
                            try {
                                randomAccessFile.close();
                            } catch (IOException unused) {
                            }
                            return x509CertificateArrM12554l;
                        }
                        long j6 = jLongValue2;
                        long j7 = jM147099a;
                        long j8 = jLongValue;
                        byteBufferSlice.position(iPosition2);
                        jLongValue = j8;
                        jM147099a = j7;
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
    public static int m12544b(int i) {
        if (i == 1) {
            return 32;
        }
        if (i == 2) {
            return 64;
        }
        za50.m219101a("Unknown content digest algorthm: ", i);
        return 0;
    }

    /* JADX INFO: renamed from: c */
    public static int m12545c(int i) {
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
                wg3.m206174a("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
                return 0;
        }
    }

    /* JADX INFO: renamed from: d */
    public static String m12546d(int i) {
        if (i == 1) {
            return "SHA-256";
        }
        if (i == 2) {
            return "SHA-512";
        }
        za50.m219101a("Unknown content digest algorthm: ", i);
        return null;
    }

    /* JADX INFO: renamed from: e */
    public static ByteBuffer m12547e(ByteBuffer byteBuffer, int i) throws BufferUnderflowException {
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
    public static ByteBuffer m12548f(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer.remaining() < 4) {
            yll.m216601a("Remaining buffer too short to contain length of length-prefixed field. Remaining: ", byteBuffer.remaining());
            return null;
        }
        int i = byteBuffer.getInt();
        if (i < 0) {
            wg3.m206174a("Negative length");
            return null;
        }
        if (i <= byteBuffer.remaining()) {
            return m12547e(byteBuffer, i);
        }
        throw new IOException("Length-prefixed field longer than remaining buffer. Field length: " + i + ", remaining: " + byteBuffer.remaining());
    }

    /* JADX INFO: renamed from: g */
    public static void m12549g(int i, byte[] bArr, int i2) {
        bArr[1] = (byte) (i & 255);
        bArr[2] = (byte) ((i >>> 8) & 255);
        bArr[3] = (byte) ((i >>> 16) & 255);
        bArr[4] = (byte) (i >> 24);
    }

    /* JADX INFO: renamed from: h */
    public static void m12550h(Map map, FileChannel fileChannel, long j, long j2, long j3, ByteBuffer byteBuffer) throws SecurityException {
        if (map.isEmpty()) {
            throw new SecurityException("No digests provided");
        }
        gvr0 gvr0Var = new gvr0(fileChannel, 0L, j);
        gvr0 gvr0Var2 = new gvr0(fileChannel, j2, j3 - j2);
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        byteBufferDuplicate.order(ByteOrder.LITTLE_ENDIAN);
        jvr0.m147102d(byteBufferDuplicate, j);
        uur0 uur0Var = new uur0(byteBufferDuplicate);
        int size = map.size();
        int[] iArr = new int[size];
        Iterator it = map.keySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Integer) it.next()).intValue();
            i++;
        }
        try {
            byte[][] bArrM12553k = m12553k(iArr, new vur0[]{gvr0Var, gvr0Var2, uur0Var});
            for (int i2 = 0; i2 < size; i2++) {
                int i3 = iArr[i2];
                if (!MessageDigest.isEqual((byte[]) map.get(Integer.valueOf(i3)), bArrM12553k[i2])) {
                    throw new SecurityException(m12546d(i3).concat(" digest of contents did not verify"));
                }
            }
        } catch (DigestException e) {
            throw new SecurityException("Failed to compute digest(s) of contents", e);
        }
    }

    /* JADX INFO: renamed from: i */
    public static byte[] m12551i(ByteBuffer byteBuffer) throws IOException {
        int i = byteBuffer.getInt();
        if (i < 0) {
            zpg0.m220844a("Negative length");
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
    public static X509Certificate[] m12552j(ByteBuffer byteBuffer, Map map, CertificateFactory certificateFactory) throws IOException, SecurityException {
        String str;
        Pair pairCreate;
        ByteBuffer byteBufferM12548f = m12548f(byteBuffer);
        ByteBuffer byteBufferM12548f2 = m12548f(byteBuffer);
        byte[] bArrM12551i = m12551i(byteBuffer);
        ArrayList arrayList = new ArrayList();
        byte[] bArrM12551i2 = null;
        byte[] bArrM12551i3 = null;
        int i = -1;
        int i2 = 0;
        while (byteBufferM12548f2.hasRemaining()) {
            i2++;
            try {
                ByteBuffer byteBufferM12548f3 = m12548f(byteBufferM12548f2);
                if (byteBufferM12548f3.remaining() < 8) {
                    throw new SecurityException("Signature record too short");
                }
                int i3 = byteBufferM12548f3.getInt();
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
                    int iM12545c = m12545c(i3);
                    int iM12545c2 = m12545c(i);
                    if (iM12545c != 1 && iM12545c2 == 1) {
                    }
                }
                bArrM12551i3 = m12551i(byteBufferM12548f3);
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
                    wg3.m206174a("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
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
                    wg3.m206174a("Unknown signature algorithm: 0x".concat(String.valueOf(Long.toHexString(i))));
                    return null;
            }
        } else {
            pairCreate = Pair.create("SHA256withDSA", null);
        }
        String str2 = (String) pairCreate.first;
        AlgorithmParameterSpec algorithmParameterSpec = (AlgorithmParameterSpec) pairCreate.second;
        try {
            PublicKey publicKeyGeneratePublic = KeyFactory.getInstance(str).generatePublic(new X509EncodedKeySpec(bArrM12551i));
            Signature signature = Signature.getInstance(str2);
            signature.initVerify(publicKeyGeneratePublic);
            if (algorithmParameterSpec != null) {
                signature.setParameter(algorithmParameterSpec);
            }
            signature.update(byteBufferM12548f);
            if (!signature.verify(bArrM12551i3)) {
                throw new SecurityException(String.valueOf(str2).concat(" signature did not verify"));
            }
            byteBufferM12548f.clear();
            ByteBuffer byteBufferM12548f4 = m12548f(byteBufferM12548f);
            ArrayList arrayList2 = new ArrayList();
            int i4 = 0;
            while (byteBufferM12548f4.hasRemaining()) {
                i4++;
                try {
                    ByteBuffer byteBufferM12548f5 = m12548f(byteBufferM12548f4);
                    if (byteBufferM12548f5.remaining() < 8) {
                        throw new IOException("Record too short");
                    }
                    int i5 = byteBufferM12548f5.getInt();
                    arrayList2.add(Integer.valueOf(i5));
                    if (i5 == i) {
                        bArrM12551i2 = m12551i(byteBufferM12548f5);
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
            int iM12545c3 = m12545c(i);
            byte[] bArr = (byte[]) map.put(Integer.valueOf(iM12545c3), bArrM12551i2);
            if (bArr != null && !MessageDigest.isEqual(bArr, bArrM12551i2)) {
                throw new SecurityException(m12546d(iM12545c3).concat(" contents digest does not match the digest specified by a preceding signer"));
            }
            ByteBuffer byteBufferM12548f6 = m12548f(byteBufferM12548f);
            ArrayList arrayList3 = new ArrayList();
            int i6 = 0;
            while (byteBufferM12548f6.hasRemaining()) {
                i6++;
                byte[] bArrM12551i4 = m12551i(byteBufferM12548f6);
                try {
                    arrayList3.add(new zzape((X509Certificate) certificateFactory.generateCertificate(new ByteArrayInputStream(bArrM12551i4)), bArrM12551i4));
                } catch (CertificateException e5) {
                    throw new SecurityException("Failed to decode certificate #" + i6, e5);
                }
            }
            if (arrayList3.isEmpty()) {
                throw new SecurityException("No certificates listed");
            }
            if (Arrays.equals(bArrM12551i, ((X509Certificate) arrayList3.get(0)).getPublicKey().getEncoded())) {
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
    public static byte[][] m12553k(int[] iArr, vur0[] vur0VarArr) throws DigestException {
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
            jZza += (vur0VarArr[i3].zza() + 1048575) / PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED;
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
            byte[] bArr3 = new byte[(m12544b(iArr[i4]) * i5) + 5];
            bArr3[0] = 90;
            m12549g(i5, bArr3, 1);
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
            String strM12546d = m12546d(iArr[i6]);
            try {
                messageDigestArr[i6] = MessageDigest.getInstance(strM12546d);
                i6++;
            } catch (NoSuchAlgorithmException e) {
                vtq0.m202761a(strM12546d.concat(" digest not supported"), e);
                return null;
            }
        }
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (i8 < i) {
            vur0 vur0Var = vur0VarArr[i8];
            int i10 = i8;
            long jZza2 = vur0Var.zza();
            long j2 = 0;
            while (jZza2 > 0) {
                String str2 = str;
                int i11 = i7;
                int iMin = (int) Math.min(jZza2, j);
                m12549g(iMin, bArr4, i2);
                for (int i12 = 0; i12 < length; i12++) {
                    messageDigestArr[i12].update(bArr4);
                }
                long j3 = j2;
                try {
                    vur0Var.mo132579a(messageDigestArr, j3, iMin);
                    char c2 = c;
                    int i13 = 0;
                    while (i13 < iArr.length) {
                        int i14 = iArr[i13];
                        byte[] bArr5 = bArr2[i13];
                        int iM12544b = m12544b(i14);
                        byte[][] bArr6 = bArr;
                        MessageDigest messageDigest = messageDigestArr[i13];
                        int i15 = i13;
                        int iDigest = messageDigest.digest(bArr5, (i9 * iM12544b) + 5, iM12544b);
                        if (iDigest != iM12544b) {
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
            String strM12546d2 = m12546d(i17);
            try {
                bArr8[i16] = MessageDigest.getInstance(strM12546d2).digest(bArr9);
            } catch (NoSuchAlgorithmException e3) {
                vtq0.m202761a(strM12546d2.concat(str3), e3);
                return bArr7;
            }
        }
        return bArr8;
    }

    /* JADX INFO: renamed from: l */
    public static X509Certificate[][] m12554l(FileChannel fileChannel, ivr0 ivr0Var) throws SecurityException {
        HashMap map = new HashMap();
        ArrayList arrayList = new ArrayList();
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            try {
                ByteBuffer byteBufferM12548f = m12548f(ivr0Var.f117114a);
                int i = 0;
                while (byteBufferM12548f.hasRemaining()) {
                    i++;
                    try {
                        arrayList.add(m12552j(m12548f(byteBufferM12548f), map, certificateFactory));
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
                m12550h(map, fileChannel, ivr0Var.f117115b, ivr0Var.f117116c, ivr0Var.f117117d, ivr0Var.f117118e);
                return (X509Certificate[][]) arrayList.toArray(new X509Certificate[arrayList.size()][]);
            } catch (IOException e2) {
                throw new SecurityException("Failed to read list of signers", e2);
            }
        } catch (CertificateException e3) {
            vtq0.m202761a("Failed to obtain X.509 CertificateFactory", e3);
            return null;
        }
    }
}
