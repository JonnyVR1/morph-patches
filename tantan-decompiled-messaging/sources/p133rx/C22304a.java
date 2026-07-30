package p133rx;

import p133rx.exceptions.MissingBackpressureException;

/* JADX INFO: renamed from: rx.a */
/* JADX INFO: loaded from: classes3.dex */
public final class C22304a {

    /* JADX INFO: renamed from: a */
    public static final d f207097a;

    /* JADX INFO: renamed from: b */
    public static final d f207098b;

    /* JADX INFO: renamed from: c */
    public static final d f207099c;

    /* JADX INFO: renamed from: d */
    public static final d f207100d;

    /* JADX INFO: renamed from: rx.a$a */
    public static class a implements d {
        static final a INSTANCE = new a();

        @Override // p133rx.C22304a.d
        /* JADX INFO: renamed from: a */
        public boolean mo221301a() {
            return false;
        }
    }

    /* JADX INFO: renamed from: rx.a$b */
    public static class b implements d {
        static final b INSTANCE = new b();

        @Override // p133rx.C22304a.d
        /* JADX INFO: renamed from: a */
        public boolean mo221301a() {
            return true;
        }
    }

    /* JADX INFO: renamed from: rx.a$c */
    public static class c implements d {
        static final c INSTANCE = new c();

        @Override // p133rx.C22304a.d
        /* JADX INFO: renamed from: a */
        public boolean mo221301a() throws MissingBackpressureException {
            throw new MissingBackpressureException("Overflowed buffer");
        }
    }

    /* JADX INFO: renamed from: rx.a$d */
    public interface d {
        /* JADX INFO: renamed from: a */
        boolean mo221301a() throws MissingBackpressureException;
    }

    static {
        c cVar = c.INSTANCE;
        f207097a = cVar;
        f207098b = cVar;
        f207099c = b.INSTANCE;
        f207100d = a.INSTANCE;
    }
}
