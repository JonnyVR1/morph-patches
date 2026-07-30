package p153l;

import android.annotation.SuppressLint;

/* JADX INFO: loaded from: classes.dex */
public abstract class ji2<T> implements z06<T> {

    /* JADX INFO: renamed from: a */
    public boolean f121034a = false;

    /* JADX INFO: renamed from: d */
    public static boolean m144947d(int i) {
        return (i & 1) == 1;
    }

    /* JADX INFO: renamed from: e */
    public static boolean m144948e(int i) {
        return !m144947d(i);
    }

    /* JADX INFO: renamed from: l */
    public static boolean m144950l(int i, int i2) {
        return (i & i2) != 0;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m144951m(int i, int i2) {
        return (i & i2) == i2;
    }

    /* JADX INFO: renamed from: n */
    public static int m144952n(int i, int i2) {
        return i & (~i2);
    }

    @Override // p153l.z06
    /* JADX INFO: renamed from: a */
    public synchronized void mo144953a() {
        if (this.f121034a) {
            return;
        }
        this.f121034a = true;
        try {
            mo8575f();
        } catch (Exception e) {
            m144956j(e);
        }
    }

    @Override // p153l.z06
    /* JADX INFO: renamed from: b */
    public synchronized void mo144954b(T t, int i) {
        try {
            if (this.f121034a) {
                return;
            }
            this.f121034a = m144947d(i);
            try {
                mo8577h(t, i);
            } catch (Exception e) {
                m144956j(e);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p153l.z06
    /* JADX INFO: renamed from: c */
    public synchronized void mo144955c(float f) {
        if (this.f121034a) {
            return;
        }
        try {
            mo8578i(f);
        } catch (Exception e) {
            m144956j(e);
        }
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo8575f();

    /* JADX INFO: renamed from: g */
    public abstract void mo8576g(Throwable th);

    /* JADX INFO: renamed from: h */
    public abstract void mo8577h(T t, int i);

    /* JADX INFO: renamed from: j */
    public void m144956j(Exception exc) {
        huf.m137171A(getClass(), "unhandled exception", exc);
    }

    @Override // p153l.z06
    public synchronized void onFailure(Throwable th) {
        if (this.f121034a) {
            return;
        }
        this.f121034a = true;
        try {
            mo8576g(th);
        } catch (Exception e) {
            m144956j(e);
        }
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: k */
    public static int m144949k(boolean z) {
        return z ? 1 : 0;
    }

    /* JADX INFO: renamed from: i */
    public void mo8578i(float f) {
    }
}
