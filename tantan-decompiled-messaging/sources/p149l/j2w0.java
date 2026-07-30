package p149l;

import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class j2w0 {

    /* JADX INFO: renamed from: a */
    public final Object f115974a;

    /* JADX INFO: renamed from: b */
    public final List f115975b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ y2w0 f115976c;

    public /* synthetic */ j2w0(y2w0 y2w0Var, Object obj, List list, i2w0 i2w0Var) {
        this.f115976c = y2w0Var;
        this.f115974a = obj;
        this.f115975b = list;
    }

    /* JADX INFO: renamed from: a */
    public final x2w0 m139497a(Callable callable) {
        imw0 imw0VarM142229b = jmw0.m142229b(this.f115975b);
        gnr gnrVarM137091a = imw0VarM142229b.m137091a(new Callable() { // from class: l.h2w0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return null;
            }
        }, i3t0.f111377f);
        gnr gnrVarM137091a2 = imw0VarM142229b.m137091a(callable, this.f115976c.f195717a);
        return new x2w0(this.f115976c, this.f115974a, gnrVarM137091a, this.f115975b, gnrVarM137091a2);
    }
}
