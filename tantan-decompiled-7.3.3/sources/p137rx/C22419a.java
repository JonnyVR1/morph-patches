package p137rx;

import p137rx.exceptions.MissingBackpressureException;

/* JADX INFO: renamed from: rx.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C22419a {

    /* JADX INFO: renamed from: a */
    public static final d f208019a;

    /* JADX INFO: renamed from: b */
    public static final d f208020b;

    /* JADX INFO: renamed from: c */
    public static final d f208021c;

    /* JADX INFO: renamed from: d */
    public static final d f208022d;

    /* JADX INFO: renamed from: rx.a$a */
    public static class a implements d {
        static final a INSTANCE = new a();

        @Override // p137rx.C22419a.d
        /* JADX INFO: renamed from: a */
        public boolean mo222547a() {
            return false;
        }
    }

    /* JADX INFO: renamed from: rx.a$b */
    public static class b implements d {
        static final b INSTANCE = new b();

        @Override // p137rx.C22419a.d
        /* JADX INFO: renamed from: a */
        public boolean mo222547a() {
            return true;
        }
    }

    /* JADX INFO: renamed from: rx.a$c */
    public static class c implements d {
        static final c INSTANCE = new c();

        @Override // p137rx.C22419a.d
        /* JADX INFO: renamed from: a */
        public boolean mo222547a() throws MissingBackpressureException {
            throw new MissingBackpressureException("Overflowed buffer");
        }
    }

    /* JADX INFO: renamed from: rx.a$d */
    public interface d {
        /* JADX INFO: renamed from: a */
        boolean mo222547a() throws MissingBackpressureException;
    }

    static {
        c cVar = c.INSTANCE;
        f208019a = cVar;
        f208020b = cVar;
        f208021c = b.INSTANCE;
        f208022d = a.INSTANCE;
    }
}
