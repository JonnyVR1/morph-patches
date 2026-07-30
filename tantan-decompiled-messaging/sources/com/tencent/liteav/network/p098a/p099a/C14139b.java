package com.tencent.liteav.network.p098a.p099a;

import com.tencent.liteav.network.p098a.C14137a;
import com.tencent.liteav.network.p098a.C14145e;
import com.tencent.liteav.network.p098a.p100b.C14142a;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.IDN;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashSet;
import p149l.y9g0;

/* JADX INFO: renamed from: com.tencent.liteav.network.a.a.b */
/* JADX INFO: loaded from: classes2.dex */
public final class C14139b {
    /* JADX INFO: renamed from: a */
    private static String m83678a(byte[] bArr, int i, HashSet<Integer> hashSet) throws IOException {
        int i2 = bArr[i];
        int i3 = i2 & 255;
        if ((i2 & 192) == 192) {
            int i4 = ((i2 & 63) << 8) + (bArr[i + 1] & 255);
            if (hashSet.contains(Integer.valueOf(i4))) {
                throw new C14137a("", "Cyclic offsets detected.");
            }
            hashSet.add(Integer.valueOf(i4));
            return m83678a(bArr, i4, hashSet);
        }
        if (i3 == 0) {
            return "";
        }
        int i5 = i + 1;
        String str = new String(bArr, i5, i3);
        String strM83678a = m83678a(bArr, i5 + i3, hashSet);
        if (strM83678a.length() <= 0) {
            return str;
        }
        return str + "." + strM83678a;
    }

    /* JADX INFO: renamed from: b */
    private static C14145e m83683b(DataInputStream dataInputStream, byte[] bArr) throws IOException {
        String hostAddress;
        m83677a(dataInputStream, bArr);
        int unsignedShort = dataInputStream.readUnsignedShort();
        dataInputStream.readUnsignedShort();
        long unsignedShort2 = (((long) dataInputStream.readUnsignedShort()) << 16) + ((long) dataInputStream.readUnsignedShort());
        int unsignedShort3 = dataInputStream.readUnsignedShort();
        if (unsignedShort == 1) {
            byte[] bArr2 = new byte[4];
            dataInputStream.readFully(bArr2);
            hostAddress = InetAddress.getByAddress(bArr2).getHostAddress();
        } else if (unsignedShort != 5) {
            for (int i = 0; i < unsignedShort3; i++) {
                dataInputStream.readByte();
            }
            hostAddress = null;
        } else {
            hostAddress = m83677a(dataInputStream, bArr);
        }
        if (hostAddress == null) {
            throw new UnknownHostException("no record");
        }
        return new C14145e(hostAddress, unsignedShort, (int) unsignedShort2, System.currentTimeMillis() / 1000);
    }

    /* JADX INFO: renamed from: b */
    private static C14145e[] m83685b(DataInputStream dataInputStream, byte[] bArr, int i) throws IOException {
        C14145e[] c14145eArr = new C14145e[i];
        int i2 = 0;
        while (true) {
            int i3 = i - 1;
            if (i <= 0) {
                return c14145eArr;
            }
            c14145eArr[i2] = m83683b(dataInputStream, bArr);
            i2++;
            i = i3;
        }
    }

    /* JADX INFO: renamed from: b */
    private static void m83684b(OutputStream outputStream, String str) throws IOException {
        DataOutputStream dataOutputStream = new DataOutputStream(outputStream);
        m83680a(outputStream, str);
        dataOutputStream.writeShort(1);
        dataOutputStream.writeShort(1);
    }

    /* JADX INFO: renamed from: a */
    private static void m83680a(OutputStream outputStream, String str) throws IOException {
        for (String str2 : str.split("[.。．｡]")) {
            byte[] bytes = IDN.toASCII(str2).getBytes();
            outputStream.write(bytes.length);
            outputStream.write(bytes, 0, bytes.length);
        }
        outputStream.write(0);
    }

    /* JADX INFO: renamed from: a */
    public static C14145e[] m83682a(byte[] bArr, int i, String str) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(new ByteArrayInputStream(bArr));
        int unsignedShort = dataInputStream.readUnsignedShort();
        if (unsignedShort == i) {
            int unsignedShort2 = dataInputStream.readUnsignedShort();
            boolean z = ((unsignedShort2 >> 8) & 1) == 1;
            if (((unsignedShort2 >> 7) & 1) == 1 && z) {
                int unsignedShort3 = dataInputStream.readUnsignedShort();
                int unsignedShort4 = dataInputStream.readUnsignedShort();
                dataInputStream.readUnsignedShort();
                dataInputStream.readUnsignedShort();
                m83679a(dataInputStream, bArr, unsignedShort3);
                return m83685b(dataInputStream, bArr, unsignedShort4);
            }
            throw new C14137a(str, "the dns server cant support recursion ");
        }
        throw new C14137a(str, "the answer id " + unsignedShort + " is not match " + i);
    }

    /* JADX INFO: renamed from: a */
    private static String m83677a(DataInputStream dataInputStream, byte[] bArr) throws IOException {
        int unsignedByte = dataInputStream.readUnsignedByte();
        if ((unsignedByte & 192) == 192) {
            int unsignedByte2 = ((unsignedByte & 63) << 8) + dataInputStream.readUnsignedByte();
            HashSet hashSet = new HashSet();
            hashSet.add(Integer.valueOf(unsignedByte2));
            return m83678a(bArr, unsignedByte2, (HashSet<Integer>) hashSet);
        }
        if (unsignedByte == 0) {
            return "";
        }
        byte[] bArr2 = new byte[unsignedByte];
        dataInputStream.readFully(bArr2);
        String unicode = IDN.toUnicode(new String(bArr2));
        String strM83677a = m83677a(dataInputStream, bArr);
        if (strM83677a.length() <= 0) {
            return unicode;
        }
        return unicode + "." + strM83677a;
    }

    /* JADX INFO: renamed from: a */
    public static byte[] m83681a(String str, int i) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(512);
        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
        C14142a c14142a = new C14142a();
        c14142a.m83688a(8);
        try {
            dataOutputStream.writeShort((short) i);
            dataOutputStream.writeShort((short) c14142a.m83687a());
            dataOutputStream.writeShort(1);
            dataOutputStream.writeShort(0);
            dataOutputStream.writeShort(0);
            dataOutputStream.writeShort(0);
            dataOutputStream.flush();
            m83684b(byteArrayOutputStream, str);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            y9g0.m213537a(e);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    private static void m83679a(DataInputStream dataInputStream, byte[] bArr, int i) throws IOException {
        while (true) {
            int i2 = i - 1;
            if (i <= 0) {
                return;
            }
            m83677a(dataInputStream, bArr);
            dataInputStream.readUnsignedShort();
            dataInputStream.readUnsignedShort();
            i = i2;
        }
    }
}
