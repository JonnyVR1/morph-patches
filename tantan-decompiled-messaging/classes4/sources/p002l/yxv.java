package p002l;

import com.tantanapp.common.utils.CrashHelper;
import l.hfw;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public abstract class yxv {

    /* JADX INFO: renamed from: l.yxv$a */
    public static class C0932a extends yxv {
        @Override // p002l.yxv
        /* JADX INFO: renamed from: a */
        public void mo26978a(String str) {
            hfw.a("[live][longlink]", str);
        }

        @Override // p002l.yxv
        /* JADX INFO: renamed from: b */
        public void mo26979b(Throwable th) {
            hfw.b("[live][longlink]", th);
            CrashHelper.c(th);
        }
    }

    /* JADX INFO: renamed from: c */
    public static yxv m26977c() {
        return new C0932a();
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo26978a(String str);

    /* JADX INFO: renamed from: b */
    public abstract void mo26979b(Throwable th);
}
