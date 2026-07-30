package androidx.datastore.preferences.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;
import p153l.mnd0;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.s */
/* JADX INFO: loaded from: classes.dex */
public final class C0351s {

    /* JADX INFO: renamed from: a */
    public static final Charset f1737a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: b */
    public static final Charset f1738b = Charset.forName("ISO-8859-1");

    /* JADX INFO: renamed from: c */
    public static final byte[] f1739c;

    /* JADX INFO: renamed from: d */
    public static final ByteBuffer f1740d;

    /* JADX INFO: renamed from: e */
    public static final AbstractC0331g f1741e;

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.s$a */
    public interface a extends i<Boolean> {
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.s$b */
    public interface b extends i<Double> {
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.s$c */
    public interface c {
        int getNumber();
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.s$d */
    public interface d<T extends c> {
        T findValueByNumber(int i);
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.s$e */
    public interface e {
        /* JADX INFO: renamed from: a */
        boolean mo1620a(int i);
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.s$f */
    public interface f extends i<Float> {
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.s$g */
    public interface g extends i<Integer> {
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.s$h */
    public interface h extends i<Long> {
    }

    /* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.s$i */
    public interface i<E> extends List<E>, RandomAccess {
        /* JADX INFO: renamed from: d */
        i<E> mo2015d(int i);

        /* JADX INFO: renamed from: n */
        void mo1820n();

        /* JADX INFO: renamed from: q */
        boolean mo1821q();
    }

    static {
        byte[] bArr = new byte[0];
        f1739c = bArr;
        f1740d = ByteBuffer.wrap(bArr);
        f1741e = AbstractC0331g.m2033i(bArr);
    }

    /* JADX INFO: renamed from: a */
    public static <T> T m2340a(T t) {
        t.getClass();
        return t;
    }

    /* JADX INFO: renamed from: b */
    public static <T> T m2341b(T t, String str) {
        if (t != null) {
            return t;
        }
        mnd0.m159157a(str);
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static int m2342c(boolean z) {
        return z ? 1231 : 1237;
    }

    /* JADX INFO: renamed from: d */
    public static int m2343d(byte[] bArr) {
        return m2344e(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: e */
    public static int m2344e(byte[] bArr, int i2, int i3) {
        int iM2348i = m2348i(i3, bArr, i2, i3);
        if (iM2348i == 0) {
            return 1;
        }
        return iM2348i;
    }

    /* JADX INFO: renamed from: f */
    public static int m2345f(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* JADX INFO: renamed from: g */
    public static boolean m2346g(byte[] bArr) {
        return Utf8.m1704s(bArr);
    }

    /* JADX INFO: renamed from: h */
    public static Object m2347h(Object obj, Object obj2) {
        return ((InterfaceC0322b0) obj).toBuilder().mo1800g((InterfaceC0322b0) obj2).buildPartial();
    }

    /* JADX INFO: renamed from: i */
    public static int m2348i(int i2, byte[] bArr, int i3, int i4) {
        for (int i5 = i3; i5 < i3 + i4; i5++) {
            i2 = (i2 * 31) + bArr[i5];
        }
        return i2;
    }

    /* JADX INFO: renamed from: j */
    public static String m2349j(byte[] bArr) {
        return new String(bArr, f1737a);
    }
}
