package p149l;

import android.os.Looper;

/* JADX INFO: loaded from: classes13.dex */
public interface rpw {

    /* JADX INFO: renamed from: l.rpw$a */
    public static class C19750a implements rpw {

        /* JADX INFO: renamed from: a */
        private final Looper f160570a;

        public C19750a(Looper looper) {
            this.f160570a = looper;
        }

        @Override // p149l.rpw
        /* JADX INFO: renamed from: a */
        public boolean mo180400a() {
            return this.f160570a == Looper.myLooper();
        }

        @Override // p149l.rpw
        /* JADX INFO: renamed from: b */
        public <T> wd80<T> mo180401b(q2f.C19395b<T, ?> c19395b) {
            return new zuk(c19395b, this.f160570a, 10);
        }
    }

    /* JADX INFO: renamed from: a */
    boolean mo180400a();

    /* JADX INFO: renamed from: b */
    <T> wd80<T> mo180401b(q2f.C19395b<T, ?> c19395b);
}
