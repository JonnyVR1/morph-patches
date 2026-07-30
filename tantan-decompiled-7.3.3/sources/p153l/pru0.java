package p153l;

import java.lang.ref.WeakReference;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class pru0 implements bqs0 {

    /* JADX INFO: renamed from: a */
    public final WeakReference f153848a;

    /* JADX INFO: renamed from: b */
    public final String f153849b;

    /* JADX INFO: renamed from: c */
    public final bqs0 f153850c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ qru0 f153851d;

    public /* synthetic */ pru0(qru0 qru0Var, WeakReference weakReference, String str, bqs0 bqs0Var, oru0 oru0Var) {
        this.f153851d = qru0Var;
        this.f153848a = weakReference;
        this.f153849b = str;
        this.f153850c = bqs0Var;
    }

    @Override // p153l.bqs0
    /* JADX INFO: renamed from: a */
    public final void mo12917a(Object obj, Map map) {
        Object obj2 = this.f153848a.get();
        if (obj2 == null) {
            this.f153851d.m177709k(this.f153849b, this);
        } else {
            this.f153850c.mo12917a(obj2, map);
        }
    }
}
