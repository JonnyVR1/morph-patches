package p153l;

import com.google.android.gms.internal.ads.AbstractC2243p3;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class vuw0 extends suw0 {
    public /* synthetic */ vuw0(uuw0 uuw0Var) {
        super(null);
    }

    @Override // p153l.suw0
    /* JADX INFO: renamed from: a */
    public final int mo188098a(AbstractC2243p3 abstractC2243p3) {
        int i;
        synchronized (abstractC2243p3) {
            i = abstractC2243p3.f10060i - 1;
            abstractC2243p3.f10060i = i;
        }
        return i;
    }

    @Override // p153l.suw0
    /* JADX INFO: renamed from: b */
    public final void mo188099b(AbstractC2243p3 abstractC2243p3, Set set, Set set2) {
        synchronized (abstractC2243p3) {
            try {
                if (abstractC2243p3.f10059h == null) {
                    abstractC2243p3.f10059h = set2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
