package p149l;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes6.dex */
public final class mow0 {

    /* JADX INFO: renamed from: a */
    public final ConcurrentMap f134959a;

    /* JADX INFO: renamed from: b */
    public final List f134960b;

    /* JADX INFO: renamed from: c */
    public final iow0 f134961c;

    /* JADX INFO: renamed from: d */
    public final Class f134962d;

    /* JADX INFO: renamed from: e */
    public final h1x0 f134963e;

    public /* synthetic */ mow0(ConcurrentMap concurrentMap, List list, iow0 iow0Var, h1x0 h1x0Var, Class cls, low0 low0Var) {
        this.f134959a = concurrentMap;
        this.f134960b = list;
        this.f134961c = iow0Var;
        this.f134962d = cls;
        this.f134963e = h1x0Var;
    }

    /* JADX INFO: renamed from: a */
    public final iow0 m155722a() {
        return this.f134961c;
    }

    /* JADX INFO: renamed from: b */
    public final h1x0 m155723b() {
        return this.f134963e;
    }

    /* JADX INFO: renamed from: c */
    public final Class m155724c() {
        return this.f134962d;
    }

    /* JADX INFO: renamed from: d */
    public final Collection m155725d() {
        return this.f134959a.values();
    }

    /* JADX INFO: renamed from: e */
    public final List m155726e(byte[] bArr) {
        List list = (List) this.f134959a.get(new kow0(bArr, null));
        return list != null ? list : Collections.EMPTY_LIST;
    }

    /* JADX INFO: renamed from: f */
    public final boolean m155727f() {
        return !this.f134963e.m129088a().isEmpty();
    }
}
