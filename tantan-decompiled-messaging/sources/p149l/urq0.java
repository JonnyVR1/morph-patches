package p149l;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes2.dex */
public class urq0 {

    /* JADX INFO: renamed from: e */
    public static final byte[] f177864e = {80, 85, 83, 72};

    /* JADX INFO: renamed from: a */
    private short f177865a;

    /* JADX INFO: renamed from: b */
    private byte f177866b;

    /* JADX INFO: renamed from: c */
    private int f177867c;

    /* JADX INFO: renamed from: d */
    private byte[] f177868d;

    /* JADX INFO: renamed from: l.urq0$a */
    public static class C20491a {

        /* JADX INFO: renamed from: a */
        public static final C20493c f177869a = new C20493c();

        /* JADX INFO: renamed from: b */
        public static final C20494d f177870b = new C20494d();

        /* JADX INFO: renamed from: a */
        public static byte[] m195115a(byte[] bArr) {
            return m195116b(bArr, f177870b);
        }

        /* JADX INFO: renamed from: b */
        public static byte[] m195116b(byte[] bArr, InterfaceC20492b interfaceC20492b) {
            if (!urq0.m195112f(bArr)) {
                return bArr;
            }
            urq0 urq0VarM195111e = urq0.m195111e(bArr);
            return (urq0VarM195111e.f177866b == 0 || urq0VarM195111e.f177866b != interfaceC20492b.mo195117a()) ? urq0VarM195111e.f177868d : interfaceC20492b.mo195118a(urq0VarM195111e.f177868d, urq0VarM195111e.f177867c);
        }
    }

    /* JADX INFO: renamed from: l.urq0$b */
    public interface InterfaceC20492b {
        /* JADX INFO: renamed from: a */
        byte mo195117a();

        /* JADX INFO: renamed from: a */
        byte[] mo195118a(byte[] bArr, int i);
    }

    /* JADX INFO: renamed from: l.urq0$c */
    public static final class C20493c {
    }

    public urq0(short s, byte b, int i, byte[] bArr) {
        this.f177865a = s;
        this.f177866b = b;
        this.f177867c = i;
        this.f177868d = bArr;
    }

    /* JADX INFO: renamed from: c */
    public static urq0 m195109c(byte b, int i, byte[] bArr) {
        return new urq0(b, i, bArr);
    }

    /* JADX INFO: renamed from: d */
    public static urq0 m195110d(short s, byte b, int i, byte[] bArr) {
        return new urq0(s, b, i, bArr);
    }

    /* JADX INFO: renamed from: e */
    public static urq0 m195111e(byte[] bArr) {
        if (!m195112f(bArr)) {
            return m195109c((byte) 0, bArr.length, bArr);
        }
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN);
        byteBufferOrder.getInt();
        short s = byteBufferOrder.getShort();
        byte b = byteBufferOrder.get();
        int i = byteBufferOrder.getInt();
        byte[] bArr2 = new byte[byteBufferOrder.getInt()];
        byteBufferOrder.get(bArr2);
        return m195110d(s, b, i, bArr2);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m195112f(byte[] bArr) {
        byte[] bArr2 = f177864e;
        return m195113g(bArr2, bArr, bArr2.length);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m195113g(byte[] bArr, byte[] bArr2, int i) {
        if (bArr.length < i || bArr2.length < i) {
            return false;
        }
        for (int i2 = 0; i2 < i; i2++) {
            if (bArr[i2] != bArr2[i2]) {
                return false;
            }
        }
        return true;
    }

    public urq0(byte b, int i, byte[] bArr) {
        this((short) 1, b, i, bArr);
    }

    /* JADX INFO: renamed from: l.urq0$d */
    public static final class C20494d implements InterfaceC20492b {
        @Override // p149l.urq0.InterfaceC20492b
        /* JADX INFO: renamed from: a */
        public byte[] mo195118a(byte[] bArr, int i) throws Throwable {
            GZIPInputStream gZIPInputStream;
            Throwable th;
            GZIPInputStream gZIPInputStream2 = null;
            try {
                gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr), i);
                try {
                    byte[] bArr2 = new byte[i];
                    gZIPInputStream.read(bArr2);
                    try {
                        gZIPInputStream.close();
                    } catch (IOException unused) {
                    }
                    return bArr2;
                } catch (IOException unused2) {
                    gZIPInputStream2 = gZIPInputStream;
                    if (gZIPInputStream2 != null) {
                        try {
                            gZIPInputStream2.close();
                        } catch (IOException unused3) {
                        }
                    }
                    return bArr;
                } catch (Throwable th2) {
                    th = th2;
                    if (gZIPInputStream != null) {
                        try {
                            gZIPInputStream.close();
                        } catch (IOException unused4) {
                        }
                    }
                    throw th;
                }
            } catch (IOException unused5) {
            } catch (Throwable th3) {
                gZIPInputStream = null;
                th = th3;
            }
        }

        @Override // p149l.urq0.InterfaceC20492b
        /* JADX INFO: renamed from: a */
        public byte mo195117a() {
            return (byte) 2;
        }
    }
}
