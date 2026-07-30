package p149l;

import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes4.dex */
public abstract class yxv {

    /* JADX INFO: renamed from: l.yxv$a */
    public static class C21574a extends yxv {
        @Override // p149l.yxv
        /* JADX INFO: renamed from: a */
        public void mo216485a(String str) {
            hfw.m130790a("[live][longlink]", str);
        }

        @Override // p149l.yxv
        /* JADX INFO: renamed from: b */
        public void mo216486b(Throwable th) {
            hfw.m130791b("[live][longlink]", th);
            CrashHelper.m81296c(th);
        }
    }

    /* JADX INFO: renamed from: c */
    public static yxv m216484c() {
        return new C21574a();
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo216485a(String str);

    /* JADX INFO: renamed from: b */
    public abstract void mo216486b(Throwable th);
}
