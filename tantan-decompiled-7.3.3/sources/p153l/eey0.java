package p153l;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
public final class eey0 extends hey0 {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ scy0 f93687b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eey0(scy0 scy0Var) {
        super(scy0Var);
        this.f93687b = scy0Var;
    }

    @Override // p153l.hey0, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zcy0(this.f93687b);
    }
}
