package p153l;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.zip.GZIPInputStream;

/* JADX INFO: loaded from: classes2.dex */
public class a1r0 {

    /* JADX INFO: renamed from: e */
    public static final byte[] f67833e = {80, 85, 83, 72};

    /* JADX INFO: renamed from: a */
    private short f67834a;

    /* JADX INFO: renamed from: b */
    private byte f67835b;

    /* JADX INFO: renamed from: c */
    private int f67836c;

    /* JADX INFO: renamed from: d */
    private byte[] f67837d;

    /* JADX INFO: renamed from: l.a1r0$a */
    public static class C15616a {

        /* JADX INFO: renamed from: a */
        public static final C15618c f67838a = new C15618c();

        /* JADX INFO: renamed from: b */
        public static final C15619d f67839b = new C15619d();

        /* JADX INFO: renamed from: a */
        public static byte[] m95548a(byte[] bArr) {
            return m95549b(bArr, f67839b);
        }

        /* JADX INFO: renamed from: b */
        public static byte[] m95549b(byte[] bArr, InterfaceC15617b interfaceC15617b) {
            if (!a1r0.m95545f(bArr)) {
                return bArr;
            }
            a1r0 a1r0VarM95544e = a1r0.m95544e(bArr);
            return (a1r0VarM95544e.f67835b == 0 || a1r0VarM95544e.f67835b != interfaceC15617b.mo95550a()) ? a1r0VarM95544e.f67837d : interfaceC15617b.mo95551a(a1r0VarM95544e.f67837d, a1r0VarM95544e.f67836c);
        }
    }

    /* JADX INFO: renamed from: l.a1r0$b */
    public interface InterfaceC15617b {
        /* JADX INFO: renamed from: a */
        byte mo95550a();

        /* JADX INFO: renamed from: a */
        byte[] mo95551a(byte[] bArr, int i);
    }

    /* JADX INFO: renamed from: l.a1r0$c */
    public static final class C15618c {
    }

    public a1r0(short s, byte b, int i, byte[] bArr) {
        this.f67834a = s;
        this.f67835b = b;
        this.f67836c = i;
        this.f67837d = bArr;
    }

    /* JADX INFO: renamed from: c */
    public static a1r0 m95542c(byte b, int i, byte[] bArr) {
        return new a1r0(b, i, bArr);
    }

    /* JADX INFO: renamed from: d */
    public static a1r0 m95543d(short s, byte b, int i, byte[] bArr) {
        return new a1r0(s, b, i, bArr);
    }

    /* JADX INFO: renamed from: e */
    public static a1r0 m95544e(byte[] bArr) {
        if (!m95545f(bArr)) {
            return m95542c((byte) 0, bArr.length, bArr);
        }
        ByteBuffer byteBufferOrder = ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN);
        byteBufferOrder.getInt();
        short s = byteBufferOrder.getShort();
        byte b = byteBufferOrder.get();
        int i = byteBufferOrder.getInt();
        byte[] bArr2 = new byte[byteBufferOrder.getInt()];
        byteBufferOrder.get(bArr2);
        return m95543d(s, b, i, bArr2);
    }

    /* JADX INFO: renamed from: f */
    public static boolean m95545f(byte[] bArr) {
        byte[] bArr2 = f67833e;
        return m95546g(bArr2, bArr, bArr2.length);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m95546g(byte[] bArr, byte[] bArr2, int i) {
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

    public a1r0(byte b, int i, byte[] bArr) {
        this((short) 1, b, i, bArr);
    }

    /* JADX INFO: renamed from: l.a1r0$d */
    public static final class C15619d implements InterfaceC15617b {
        @Override // p153l.a1r0.InterfaceC15617b
        /* JADX INFO: renamed from: a */
        public byte[] mo95551a(byte[] bArr, int i) throws Throwable {
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

        @Override // p153l.a1r0.InterfaceC15617b
        /* JADX INFO: renamed from: a */
        public byte mo95550a() {
            return (byte) 2;
        }
    }
}
