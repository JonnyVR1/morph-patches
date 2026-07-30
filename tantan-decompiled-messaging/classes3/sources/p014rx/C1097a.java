package p014rx;

import p014rx.exceptions.MissingBackpressureException;

/* JADX INFO: renamed from: rx.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class C1097a {

    /* JADX INFO: renamed from: a */
    public static final d f10722a;

    /* JADX INFO: renamed from: b */
    public static final d f10723b;

    /* JADX INFO: renamed from: c */
    public static final d f10724c;

    /* JADX INFO: renamed from: d */
    public static final d f10725d;

    /* JADX INFO: renamed from: rx.a$a */
    public static class a implements d {
        static final a INSTANCE = new a();

        @Override // p014rx.C1097a.d
        /* JADX INFO: renamed from: a */
        public boolean mo9758a() {
            return false;
        }
    }

    /* JADX INFO: renamed from: rx.a$b */
    public static class b implements d {
        static final b INSTANCE = new b();

        @Override // p014rx.C1097a.d
        /* JADX INFO: renamed from: a */
        public boolean mo9758a() {
            return true;
        }
    }

    /* JADX INFO: renamed from: rx.a$c */
    public static class c implements d {
        static final c INSTANCE = new c();

        @Override // p014rx.C1097a.d
        /* JADX INFO: renamed from: a */
        public boolean mo9758a() throws MissingBackpressureException {
            throw new MissingBackpressureException("Overflowed buffer");
        }
    }

    /* JADX INFO: renamed from: rx.a$d */
    public interface d {
        /* JADX INFO: renamed from: a */
        boolean mo9758a() throws MissingBackpressureException;
    }

    static {
        c cVar = c.INSTANCE;
        f10722a = cVar;
        f10723b = cVar;
        f10724c = b.INSTANCE;
        f10725d = a.INSTANCE;
    }
}
