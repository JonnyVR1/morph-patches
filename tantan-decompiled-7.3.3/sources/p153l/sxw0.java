package p153l;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes6.dex */
public final class sxw0 {

    /* JADX INFO: renamed from: a */
    public final ConcurrentMap f171197a;

    /* JADX INFO: renamed from: b */
    public final List f171198b;

    /* JADX INFO: renamed from: c */
    public final oxw0 f171199c;

    /* JADX INFO: renamed from: d */
    public final Class f171200d;

    /* JADX INFO: renamed from: e */
    public final nax0 f171201e;

    public /* synthetic */ sxw0(ConcurrentMap concurrentMap, List list, oxw0 oxw0Var, nax0 nax0Var, Class cls, rxw0 rxw0Var) {
        this.f171197a = concurrentMap;
        this.f171198b = list;
        this.f171199c = oxw0Var;
        this.f171200d = cls;
        this.f171201e = nax0Var;
    }

    /* JADX INFO: renamed from: a */
    public final oxw0 m188521a() {
        return this.f171199c;
    }

    /* JADX INFO: renamed from: b */
    public final nax0 m188522b() {
        return this.f171201e;
    }

    /* JADX INFO: renamed from: c */
    public final Class m188523c() {
        return this.f171200d;
    }

    /* JADX INFO: renamed from: d */
    public final Collection m188524d() {
        return this.f171197a.values();
    }

    /* JADX INFO: renamed from: e */
    public final List m188525e(byte[] bArr) {
        List list = (List) this.f171197a.get(new qxw0(bArr, null));
        return list != null ? list : Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m188526f() {
        return !this.f171201e.m162105a().isEmpty();
    }
}
