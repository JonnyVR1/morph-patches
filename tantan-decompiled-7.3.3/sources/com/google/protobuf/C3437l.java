package com.google.protobuf;

import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.List;
import java.util.RandomAccess;
import p153l.u1d0;

/* JADX INFO: renamed from: com.google.protobuf.l */
/* JADX INFO: loaded from: classes7.dex */
public final class C3437l {

    /* JADX INFO: renamed from: a */
    public static final Charset f11643a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: b */
    public static final Charset f11644b = Charset.forName("ISO-8859-1");

    /* JADX INFO: renamed from: c */
    public static final byte[] f11645c;

    /* JADX INFO: renamed from: d */
    public static final ByteBuffer f11646d;

    /* JADX INFO: renamed from: e */
    public static final C3430e f11647e;

    /* JADX INFO: renamed from: com.google.protobuf.l$a */
    public interface a extends h<Boolean> {
        @Override // 
        /* JADX INFO: renamed from: d */
        h<Boolean> mo17143d(int i);
    }

    /* JADX INFO: renamed from: com.google.protobuf.l$b */
    public interface b extends h<Double> {
        @Override // com.google.protobuf.C3437l.h, com.google.protobuf.C3437l.a
        /* JADX INFO: renamed from: d */
        h<Double> mo17143d(int i);
    }

    /* JADX INFO: renamed from: com.google.protobuf.l$c */
    public interface c {
        int getNumber();
    }

    /* JADX INFO: renamed from: com.google.protobuf.l$d */
    public interface d<T extends c> {
        T findValueByNumber(int i);
    }

    /* JADX INFO: renamed from: com.google.protobuf.l$e */
    public interface e extends h<Float> {
        /* JADX INFO: renamed from: M */
        void mo17246M(float f);

        @Override // com.google.protobuf.C3437l.h, com.google.protobuf.C3437l.a
        /* JADX INFO: renamed from: d */
        h<Float> mo17143d(int i);

        float getFloat(int i);

        float setFloat(int i, float f);
    }

    /* JADX INFO: renamed from: com.google.protobuf.l$f */
    public interface f extends h<Integer> {
        /* JADX INFO: renamed from: U */
        void mo17255U(int i);

        @Override // com.google.protobuf.C3437l.h, com.google.protobuf.C3437l.a
        /* JADX INFO: renamed from: d */
        h<Integer> mo17143d(int i);

        int getInt(int i);

        int setInt(int i, int i2);
    }

    /* JADX INFO: renamed from: com.google.protobuf.l$g */
    public interface g extends h<Long> {
        @Override // com.google.protobuf.C3437l.h, com.google.protobuf.C3437l.a
        /* JADX INFO: renamed from: d */
        h<Long> mo17143d(int i);

        long getLong(int i);

        long setLong(int i, long j);

        /* JADX INFO: renamed from: u */
        void mo17267u(long j);
    }

    /* JADX INFO: renamed from: com.google.protobuf.l$h */
    public interface h<E> extends List<E>, RandomAccess {
        /* JADX INFO: renamed from: d */
        h<E> mo17143d(int i);

        /* JADX INFO: renamed from: n */
        void mo17139n();

        /* JADX INFO: renamed from: q */
        boolean mo17140q();
    }

    static {
        byte[] bArr = new byte[0];
        f11645c = bArr;
        f11646d = ByteBuffer.wrap(bArr);
        f11647e = C3430e.m17157h(bArr);
    }

    /* JADX INFO: renamed from: a */
    public static <T extends InterfaceC3442q> T m17261a(Class<T> cls) {
        try {
            Method method = cls.getMethod("getDefaultInstance", null);
            return (T) method.invoke(method, null);
        } catch (Exception e2) {
            u1d0.m193953a("Failed to get default instance for ", cls, e2);
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static int m17262b(boolean z) {
        return z ? 1231 : 1237;
    }

    /* JADX INFO: renamed from: c */
    public static int m17263c(byte[] bArr) {
        return m17264d(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: d */
    public static int m17264d(byte[] bArr, int i, int i2) {
        int iM17266f = m17266f(i2, bArr, i, i2);
        if (iM17266f == 0) {
            return 1;
        }
        return iM17266f;
    }

    /* JADX INFO: renamed from: e */
    public static int m17265e(long j) {
        return (int) (j ^ (j >>> 32));
    }

    /* JADX INFO: renamed from: f */
    public static int m17266f(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }
}
