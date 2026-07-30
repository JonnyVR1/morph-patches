package p149l;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class oiw0 extends igw0 {

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ Iterator f144205c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ ofw0 f144206d;

    public oiw0(Iterator it, ofw0 ofw0Var) {
        this.f144205c = it;
        this.f144206d = ofw0Var;
    }

    @Override // p149l.igw0
    public final Object zza() {
        while (this.f144205c.hasNext()) {
            Iterator it = this.f144205c;
            ofw0 ofw0Var = this.f144206d;
            Object next = it.next();
            if (ofw0Var.zza(next)) {
                return next;
            }
        }
        m136179a();
        return null;
    }
}
