package p153l;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class s6r0 implements wl50 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ xtd f166602a;

    public s6r0(xtd xtdVar) {
        this.f166602a = xtdVar;
    }

    @Override // p153l.wl50
    /* JADX INFO: renamed from: a */
    public final void mo184919a(her herVar) {
        this.f166602a.f196199a = herVar;
        Iterator it = this.f166602a.f196201c.iterator();
        while (it.hasNext()) {
            ((z7r0) it.next()).mo108324a(this.f166602a.f196199a);
        }
        this.f166602a.f196201c.clear();
        this.f166602a.f196200b = null;
    }
}
