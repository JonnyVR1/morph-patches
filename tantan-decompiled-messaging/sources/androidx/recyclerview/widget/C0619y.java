package androidx.recyclerview.widget;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import p149l.hb80;
import p149l.hgf0;
import p149l.ig3;
import p149l.jb80;
import p149l.l2w;

/* JADX INFO: renamed from: androidx.recyclerview.widget.y */
/* JADX INFO: loaded from: classes.dex */
public class C0619y {

    /* JADX INFO: renamed from: a */
    @VisibleForTesting
    public final hgf0<RecyclerView.AbstractC0566d0, a> f2933a = new hgf0<>();

    /* JADX INFO: renamed from: b */
    @VisibleForTesting
    public final l2w<RecyclerView.AbstractC0566d0> f2934b = new l2w<>();

    /* JADX INFO: renamed from: androidx.recyclerview.widget.y$a */
    public static class a {

        /* JADX INFO: renamed from: d */
        public static hb80<a> f2935d = new jb80(20);

        /* JADX INFO: renamed from: a */
        public int f2936a;

        /* JADX INFO: renamed from: b */
        @Nullable
        public RecyclerView.AbstractC0574l.c f2937b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public RecyclerView.AbstractC0574l.c f2938c;

        /* JADX INFO: renamed from: a */
        public static void m3888a() {
            while (f2935d.acquire() != null) {
            }
        }

        /* JADX INFO: renamed from: b */
        public static a m3889b() {
            a aVarAcquire = f2935d.acquire();
            return aVarAcquire == null ? new a() : aVarAcquire;
        }

        /* JADX INFO: renamed from: c */
        public static void m3890c(a aVar) {
            aVar.f2936a = 0;
            aVar.f2937b = null;
            aVar.f2938c = null;
            f2935d.release(aVar);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.y$b */
    public interface b {
        /* JADX INFO: renamed from: a */
        void mo3365a(RecyclerView.AbstractC0566d0 abstractC0566d0, @Nullable RecyclerView.AbstractC0574l.c cVar, RecyclerView.AbstractC0574l.c cVar2);

        /* JADX INFO: renamed from: b */
        void mo3366b(RecyclerView.AbstractC0566d0 abstractC0566d0);

        /* JADX INFO: renamed from: c */
        void mo3367c(RecyclerView.AbstractC0566d0 abstractC0566d0, @NonNull RecyclerView.AbstractC0574l.c cVar, @Nullable RecyclerView.AbstractC0574l.c cVar2);

        /* JADX INFO: renamed from: d */
        void mo3368d(RecyclerView.AbstractC0566d0 abstractC0566d0, @NonNull RecyclerView.AbstractC0574l.c cVar, @NonNull RecyclerView.AbstractC0574l.c cVar2);
    }

    /* JADX INFO: renamed from: a */
    public void m3871a(RecyclerView.AbstractC0566d0 abstractC0566d0, RecyclerView.AbstractC0574l.c cVar) {
        a aVarM3889b = this.f2933a.get(abstractC0566d0);
        if (aVarM3889b == null) {
            aVarM3889b = a.m3889b();
            this.f2933a.put(abstractC0566d0, aVarM3889b);
        }
        aVarM3889b.f2936a |= 2;
        aVarM3889b.f2937b = cVar;
    }

    /* JADX INFO: renamed from: b */
    public void m3872b(RecyclerView.AbstractC0566d0 abstractC0566d0) {
        a aVarM3889b = this.f2933a.get(abstractC0566d0);
        if (aVarM3889b == null) {
            aVarM3889b = a.m3889b();
            this.f2933a.put(abstractC0566d0, aVarM3889b);
        }
        aVarM3889b.f2936a |= 1;
    }

    /* JADX INFO: renamed from: c */
    public void m3873c(long j, RecyclerView.AbstractC0566d0 abstractC0566d0) {
        this.f2934b.m148316m(j, abstractC0566d0);
    }

    /* JADX INFO: renamed from: d */
    public void m3874d(RecyclerView.AbstractC0566d0 abstractC0566d0, RecyclerView.AbstractC0574l.c cVar) {
        a aVarM3889b = this.f2933a.get(abstractC0566d0);
        if (aVarM3889b == null) {
            aVarM3889b = a.m3889b();
            this.f2933a.put(abstractC0566d0, aVarM3889b);
        }
        aVarM3889b.f2938c = cVar;
        aVarM3889b.f2936a |= 8;
    }

    /* JADX INFO: renamed from: e */
    public void m3875e(RecyclerView.AbstractC0566d0 abstractC0566d0, RecyclerView.AbstractC0574l.c cVar) {
        a aVarM3889b = this.f2933a.get(abstractC0566d0);
        if (aVarM3889b == null) {
            aVarM3889b = a.m3889b();
            this.f2933a.put(abstractC0566d0, aVarM3889b);
        }
        aVarM3889b.f2937b = cVar;
        aVarM3889b.f2936a |= 4;
    }

    /* JADX INFO: renamed from: f */
    public void m3876f() {
        this.f2933a.clear();
        this.f2934b.clear();
    }

    /* JADX INFO: renamed from: g */
    public RecyclerView.AbstractC0566d0 m3877g(long j) {
        return this.f2934b.m148311e(j);
    }

    /* JADX INFO: renamed from: h */
    public boolean m3878h(RecyclerView.AbstractC0566d0 abstractC0566d0) {
        a aVar = this.f2933a.get(abstractC0566d0);
        return (aVar == null || (aVar.f2936a & 1) == 0) ? false : true;
    }

    /* JADX INFO: renamed from: i */
    public boolean m3879i(RecyclerView.AbstractC0566d0 abstractC0566d0) {
        a aVar = this.f2933a.get(abstractC0566d0);
        return (aVar == null || (aVar.f2936a & 4) == 0) ? false : true;
    }

    /* JADX INFO: renamed from: j */
    public void m3880j() {
        a.m3888a();
    }

    /* JADX INFO: renamed from: k */
    public void m3881k(RecyclerView.AbstractC0566d0 abstractC0566d0) {
        m3886p(abstractC0566d0);
    }

    /* JADX INFO: renamed from: l */
    public final RecyclerView.AbstractC0574l.c m3882l(RecyclerView.AbstractC0566d0 abstractC0566d0, int i) {
        a aVarM130827m;
        RecyclerView.AbstractC0574l.c cVar;
        int iM130820f = this.f2933a.m130820f(abstractC0566d0);
        if (iM130820f >= 0 && (aVarM130827m = this.f2933a.m130827m(iM130820f)) != null) {
            int i2 = aVarM130827m.f2936a;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                aVarM130827m.f2936a = i3;
                if (i == 4) {
                    cVar = aVarM130827m.f2937b;
                } else if (i == 8) {
                    cVar = aVarM130827m.f2938c;
                } else {
                    ig3.m135964a("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    this.f2933a.mo130825k(iM130820f);
                    a.m3890c(aVarM130827m);
                }
                return cVar;
            }
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: m */
    public RecyclerView.AbstractC0574l.c m3883m(RecyclerView.AbstractC0566d0 abstractC0566d0) {
        return m3882l(abstractC0566d0, 8);
    }

    @Nullable
    /* JADX INFO: renamed from: n */
    public RecyclerView.AbstractC0574l.c m3884n(RecyclerView.AbstractC0566d0 abstractC0566d0) {
        return m3882l(abstractC0566d0, 4);
    }

    /* JADX INFO: renamed from: o */
    public void m3885o(b bVar) {
        for (int size = this.f2933a.size() - 1; size >= 0; size--) {
            RecyclerView.AbstractC0566d0 abstractC0566d0M130823i = this.f2933a.m130823i(size);
            a aVarMo130825k = this.f2933a.mo130825k(size);
            int i = aVarMo130825k.f2936a;
            if ((i & 3) == 3) {
                bVar.mo3366b(abstractC0566d0M130823i);
            } else if ((i & 1) != 0) {
                RecyclerView.AbstractC0574l.c cVar = aVarMo130825k.f2937b;
                if (cVar == null) {
                    bVar.mo3366b(abstractC0566d0M130823i);
                } else {
                    bVar.mo3367c(abstractC0566d0M130823i, cVar, aVarMo130825k.f2938c);
                }
            } else if ((i & 14) == 14) {
                bVar.mo3365a(abstractC0566d0M130823i, aVarMo130825k.f2937b, aVarMo130825k.f2938c);
            } else if ((i & 12) == 12) {
                bVar.mo3368d(abstractC0566d0M130823i, aVarMo130825k.f2937b, aVarMo130825k.f2938c);
            } else if ((i & 4) != 0) {
                bVar.mo3367c(abstractC0566d0M130823i, aVarMo130825k.f2937b, null);
            } else if ((i & 8) != 0) {
                bVar.mo3365a(abstractC0566d0M130823i, aVarMo130825k.f2937b, aVarMo130825k.f2938c);
            }
            a.m3890c(aVarMo130825k);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m3886p(RecyclerView.AbstractC0566d0 abstractC0566d0) {
        a aVar = this.f2933a.get(abstractC0566d0);
        if (aVar == null) {
            return;
        }
        aVar.f2936a &= -2;
    }

    /* JADX INFO: renamed from: q */
    public void m3887q(RecyclerView.AbstractC0566d0 abstractC0566d0) {
        for (int iM148319p = this.f2934b.m148319p() - 1; iM148319p >= 0; iM148319p--) {
            if (abstractC0566d0 == this.f2934b.m148320q(iM148319p)) {
                this.f2934b.m148318o(iM148319p);
                break;
            }
        }
        a aVarRemove = this.f2933a.remove(abstractC0566d0);
        if (aVarRemove != null) {
            a.m3890c(aVarRemove);
        }
    }
}
