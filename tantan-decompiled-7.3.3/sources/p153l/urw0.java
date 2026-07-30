package p153l;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class urw0 extends opw0 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Iterator f180712c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ uow0 f180713d;

    public urw0(Iterator it, uow0 uow0Var) {
        this.f180712c = it;
        this.f180713d = uow0Var;
    }

    @Override // p153l.opw0
    public final Object zza() {
        while (this.f180712c.hasNext()) {
            Iterator it = this.f180712c;
            uow0 uow0Var = this.f180713d;
            Object next = it.next();
            if (uow0Var.zza(next)) {
                return next;
            }
        }
        m168775a();
        return null;
    }
}
