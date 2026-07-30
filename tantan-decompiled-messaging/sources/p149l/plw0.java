package p149l;

import com.google.android.gms.internal.ads.AbstractC2220p3;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class plw0 extends mlw0 {
    public /* synthetic */ plw0(olw0 olw0Var) {
        super(null);
    }

    @Override // p149l.mlw0
    /* JADX INFO: renamed from: a */
    public final int mo155282a(AbstractC2220p3 abstractC2220p3) {
        int i;
        synchronized (abstractC2220p3) {
            i = abstractC2220p3.f10023i - 1;
            abstractC2220p3.f10023i = i;
        }
        return i;
    }

    @Override // p149l.mlw0
    /* JADX INFO: renamed from: b */
    public final void mo155283b(AbstractC2220p3 abstractC2220p3, Set set, Set set2) {
        synchronized (abstractC2220p3) {
            try {
                if (abstractC2220p3.f10022h == null) {
                    abstractC2220p3.f10022h = set2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
