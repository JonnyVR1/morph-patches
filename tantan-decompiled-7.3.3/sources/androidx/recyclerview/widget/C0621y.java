package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import p153l.j4w;
import p153l.nj80;
import p153l.oof0;
import p153l.pj80;
import p153l.wg3;

/* JADX INFO: renamed from: androidx.recyclerview.widget.y */
/* JADX INFO: loaded from: classes.dex */
public class C0621y {

    /* JADX INFO: renamed from: a */
    @VisibleForTesting
    public final oof0<RecyclerView.AbstractC0569e0, a> f2933a = new oof0<>();

    /* JADX INFO: renamed from: b */
    @VisibleForTesting
    public final j4w<RecyclerView.AbstractC0569e0> f2934b = new j4w<>();

    /* JADX INFO: renamed from: androidx.recyclerview.widget.y$a */
    public static class a {

        /* JADX INFO: renamed from: d */
        public static nj80<a> f2935d = new pj80(20);

        /* JADX INFO: renamed from: a */
        public int f2936a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public RecyclerView.AbstractC0576l.c f2937b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public RecyclerView.AbstractC0576l.c f2938c;

        /* JADX INFO: renamed from: a */
        public static void m3889a() {
            while (f2935d.acquire() != null) {
            }
        }

        /* JADX INFO: renamed from: b */
        public static a m3890b() {
            a aVarAcquire = f2935d.acquire();
            return aVarAcquire == null ? new a() : aVarAcquire;
        }

        /* JADX INFO: renamed from: c */
        public static void m3891c(a aVar) {
            aVar.f2936a = 0;
            aVar.f2937b = null;
            aVar.f2938c = null;
            f2935d.release(aVar);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.y$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo3369a(RecyclerView.AbstractC0569e0 abstractC0569e0, @Nullable RecyclerView.AbstractC0576l.c cVar, RecyclerView.AbstractC0576l.c cVar2);

        /* JADX INFO: renamed from: b */
        void mo3370b(RecyclerView.AbstractC0569e0 abstractC0569e0);

        /* JADX INFO: renamed from: c */
        void mo3371c(RecyclerView.AbstractC0569e0 abstractC0569e0, @NonNull RecyclerView.AbstractC0576l.c cVar, @Nullable RecyclerView.AbstractC0576l.c cVar2);

        /* JADX INFO: renamed from: d */
        void mo3372d(RecyclerView.AbstractC0569e0 abstractC0569e0, @NonNull RecyclerView.AbstractC0576l.c cVar, @NonNull RecyclerView.AbstractC0576l.c cVar2);
    }

    /* JADX INFO: renamed from: a */
    public void m3872a(RecyclerView.AbstractC0569e0 abstractC0569e0, RecyclerView.AbstractC0576l.c cVar) {
        a aVarM3890b = this.f2933a.get(abstractC0569e0);
        if (aVarM3890b == null) {
            aVarM3890b = a.m3890b();
            this.f2933a.put(abstractC0569e0, aVarM3890b);
        }
        aVarM3890b.f2936a |= 2;
        aVarM3890b.f2937b = cVar;
    }

    /* JADX INFO: renamed from: b */
    public void m3873b(RecyclerView.AbstractC0569e0 abstractC0569e0) {
        a aVarM3890b = this.f2933a.get(abstractC0569e0);
        if (aVarM3890b == null) {
            aVarM3890b = a.m3890b();
            this.f2933a.put(abstractC0569e0, aVarM3890b);
        }
        aVarM3890b.f2936a |= 1;
    }

    /* JADX INFO: renamed from: c */
    public void m3874c(long j, RecyclerView.AbstractC0569e0 abstractC0569e0) {
        this.f2934b.m143464m(j, abstractC0569e0);
    }

    /* JADX INFO: renamed from: d */
    public void m3875d(RecyclerView.AbstractC0569e0 abstractC0569e0, RecyclerView.AbstractC0576l.c cVar) {
        a aVarM3890b = this.f2933a.get(abstractC0569e0);
        if (aVarM3890b == null) {
            aVarM3890b = a.m3890b();
            this.f2933a.put(abstractC0569e0, aVarM3890b);
        }
        aVarM3890b.f2938c = cVar;
        aVarM3890b.f2936a |= 8;
    }

    /* JADX INFO: renamed from: e */
    public void m3876e(RecyclerView.AbstractC0569e0 abstractC0569e0, RecyclerView.AbstractC0576l.c cVar) {
        a aVarM3890b = this.f2933a.get(abstractC0569e0);
        if (aVarM3890b == null) {
            aVarM3890b = a.m3890b();
            this.f2933a.put(abstractC0569e0, aVarM3890b);
        }
        aVarM3890b.f2937b = cVar;
        aVarM3890b.f2936a |= 4;
    }

    /* JADX INFO: renamed from: f */
    public void m3877f() {
        this.f2933a.clear();
        this.f2934b.clear();
    }

    /* JADX INFO: renamed from: g */
    public RecyclerView.AbstractC0569e0 m3878g(long j) {
        return this.f2934b.m143459e(j);
    }

    /* JADX INFO: renamed from: h */
    public boolean m3879h(RecyclerView.AbstractC0569e0 abstractC0569e0) {
        a aVar = this.f2933a.get(abstractC0569e0);
        return (aVar == null || (aVar.f2936a & 1) == 0) ? false : true;
    }

    /* JADX INFO: renamed from: i */
    public boolean m3880i(RecyclerView.AbstractC0569e0 abstractC0569e0) {
        a aVar = this.f2933a.get(abstractC0569e0);
        return (aVar == null || (aVar.f2936a & 4) == 0) ? false : true;
    }

    /* JADX INFO: renamed from: j */
    public void m3881j() {
        a.m3889a();
    }

    /* JADX INFO: renamed from: k */
    public void m3882k(RecyclerView.AbstractC0569e0 abstractC0569e0) {
        m3887p(abstractC0569e0);
    }

    /* JADX INFO: renamed from: l */
    public final RecyclerView.AbstractC0576l.c m3883l(RecyclerView.AbstractC0569e0 abstractC0569e0, int i) {
        a aVarM168583m;
        RecyclerView.AbstractC0576l.c cVar;
        int iM168579f = this.f2933a.m168579f(abstractC0569e0);
        if (iM168579f >= 0 && (aVarM168583m = this.f2933a.m168583m(iM168579f)) != null) {
            int i2 = aVarM168583m.f2936a;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                aVarM168583m.f2936a = i3;
                if (i == 4) {
                    cVar = aVarM168583m.f2937b;
                } else if (i == 8) {
                    cVar = aVarM168583m.f2938c;
                } else {
                    wg3.m206174a("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    this.f2933a.mo147463k(iM168579f);
                    a.m3891c(aVarM168583m);
                }
                return cVar;
            }
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: m */
    public RecyclerView.AbstractC0576l.c m3884m(RecyclerView.AbstractC0569e0 abstractC0569e0) {
        return m3883l(abstractC0569e0, 8);
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public RecyclerView.AbstractC0576l.c m3885n(RecyclerView.AbstractC0569e0 abstractC0569e0) {
        return m3883l(abstractC0569e0, 4);
    }

    /* JADX INFO: renamed from: o */
    public void m3886o(b bVar) {
        for (int size = this.f2933a.size() - 1; size >= 0; size--) {
            RecyclerView.AbstractC0569e0 abstractC0569e0M168582i = this.f2933a.m168582i(size);
            a aVarMo147463k = this.f2933a.mo147463k(size);
            int i = aVarMo147463k.f2936a;
            if ((i & 3) == 3) {
                bVar.mo3370b(abstractC0569e0M168582i);
            } else if ((i & 1) != 0) {
                RecyclerView.AbstractC0576l.c cVar = aVarMo147463k.f2937b;
                if (cVar == null) {
                    bVar.mo3370b(abstractC0569e0M168582i);
                } else {
                    bVar.mo3371c(abstractC0569e0M168582i, cVar, aVarMo147463k.f2938c);
                }
            } else if ((i & 14) == 14) {
                bVar.mo3369a(abstractC0569e0M168582i, aVarMo147463k.f2937b, aVarMo147463k.f2938c);
            } else if ((i & 12) == 12) {
                bVar.mo3372d(abstractC0569e0M168582i, aVarMo147463k.f2937b, aVarMo147463k.f2938c);
            } else if ((i & 4) != 0) {
                bVar.mo3371c(abstractC0569e0M168582i, aVarMo147463k.f2937b, null);
            } else if ((i & 8) != 0) {
                bVar.mo3369a(abstractC0569e0M168582i, aVarMo147463k.f2937b, aVarMo147463k.f2938c);
            }
            a.m3891c(aVarMo147463k);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m3887p(RecyclerView.AbstractC0569e0 abstractC0569e0) {
        a aVar = this.f2933a.get(abstractC0569e0);
        if (aVar == null) {
            return;
        }
        aVar.f2936a &= -2;
    }

    /* JADX INFO: renamed from: q */
    public void m3888q(RecyclerView.AbstractC0569e0 abstractC0569e0) {
        for (int iM143467p = this.f2934b.m143467p() - 1; iM143467p >= 0; iM143467p--) {
            if (abstractC0569e0 == this.f2934b.m143468q(iM143467p)) {
                this.f2934b.m143466o(iM143467p);
                break;
            }
        }
        a aVarRemove = this.f2933a.remove(abstractC0569e0);
        if (aVarRemove != null) {
            a.m3891c(aVarRemove);
        }
    }
}
