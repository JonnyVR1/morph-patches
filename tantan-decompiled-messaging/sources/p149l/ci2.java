package p149l;

import android.annotation.SuppressLint;

/* JADX INFO: loaded from: classes.dex */
public abstract class ci2<T> implements uz5<T> {

    /* JADX INFO: renamed from: a */
    public boolean f81029a = false;

    /* JADX INFO: renamed from: d */
    public static boolean m107028d(int i) {
        return (i & 1) == 1;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m107029e(int i) {
        return !m107028d(i);
    }

    /* JADX INFO: renamed from: l */
    public static boolean m107031l(int i, int i2) {
        return (i & i2) != 0;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m107032m(int i, int i2) {
        return (i & i2) == i2;
    }

    /* JADX INFO: renamed from: n */
    public static int m107033n(int i, int i2) {
        return i & (~i2);
    }

    @Override // p149l.uz5
    /* JADX INFO: renamed from: a */
    public synchronized void mo107034a() {
        if (this.f81029a) {
            return;
        }
        this.f81029a = true;
        try {
            mo8521f();
        } catch (Exception e) {
            m107037j(e);
        }
    }

    @Override // p149l.uz5
    /* JADX INFO: renamed from: b */
    public synchronized void mo107035b(T t, int i) {
        if (this.f81029a) {
            return;
        }
        this.f81029a = m107028d(i);
        try {
            mo8523h(t, i);
        } catch (Exception e) {
            m107037j(e);
        }
    }

    @Override // p149l.uz5
    /* JADX INFO: renamed from: c */
    public synchronized void mo107036c(float f) {
        if (this.f81029a) {
            return;
        }
        try {
            mo8524i(f);
        } catch (Exception e) {
            m107037j(e);
        }
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo8521f();

    /* JADX INFO: renamed from: g */
    public abstract void mo8522g(Throwable th);

    /* JADX INFO: renamed from: h */
    public abstract void mo8523h(T t, int i);

    /* JADX INFO: renamed from: j */
    public void m107037j(Exception exc) {
        tsf.m190533A(getClass(), "unhandled exception", exc);
    }

    @Override // p149l.uz5
    public synchronized void onFailure(Throwable th) {
        if (this.f81029a) {
            return;
        }
        this.f81029a = true;
        try {
            mo8522g(th);
        } catch (Exception e) {
            m107037j(e);
        }
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: k */
    public static int m107030k(boolean z) {
        return z ? 1 : 0;
    }

    /* JADX INFO: renamed from: i */
    public void mo8524i(float f) {
    }
}
