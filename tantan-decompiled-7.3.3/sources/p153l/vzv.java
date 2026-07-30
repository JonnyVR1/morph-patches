package p153l;

import com.tantanapp.common.utils.CrashHelper;

/* JADX INFO: loaded from: classes5.dex */
public abstract class vzv {

    /* JADX INFO: renamed from: l.vzv$a */
    public static class C20964a extends vzv {
        @Override // p153l.vzv
        /* JADX INFO: renamed from: a */
        public void mo204126a(String str) {
            fhw.m125605a("[live][longlink]", str);
        }

        @Override // p153l.vzv
        /* JADX INFO: renamed from: b */
        public void mo204127b(Throwable th) {
            fhw.m125606b("[live][longlink]", th);
            CrashHelper.m82479c(th);
        }
    }

    /* JADX INFO: renamed from: c */
    public static vzv m204125c() {
        return new C20964a();
    }

    /* JADX INFO: renamed from: a */
    public abstract void mo204126a(String str);

    /* JADX INFO: renamed from: b */
    public abstract void mo204127b(Throwable th);
}
