package p153l;

import android.os.Looper;

/* JADX INFO: loaded from: classes11.dex */
public interface qsw {

    /* JADX INFO: renamed from: l.qsw$a */
    public static class C19649a implements qsw {

        /* JADX INFO: renamed from: a */
        private final Looper f159356a;

        public C19649a(Looper looper) {
            this.f159356a = looper;
        }

        @Override // p153l.qsw
        /* JADX INFO: renamed from: a */
        public boolean mo177817a() {
            return this.f159356a == Looper.myLooper();
        }

        @Override // p153l.qsw
        /* JADX INFO: renamed from: b */
        public <T> dm80<T> mo177818b(v3f.C20734b<T, ?> c20734b) {
            return new pxk(c20734b, this.f159356a, 10);
        }
    }

    /* JADX INFO: renamed from: a */
    boolean mo177817a();

    /* JADX INFO: renamed from: b */
    <T> dm80<T> mo177818b(v3f.C20734b<T, ?> c20734b);
}
