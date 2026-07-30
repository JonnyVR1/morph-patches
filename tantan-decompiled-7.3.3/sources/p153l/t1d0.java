package p153l;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.C1894k;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public abstract class t1d0 {

    /* JADX INFO: renamed from: a */
    public final long f171644a;

    /* JADX INFO: renamed from: b */
    public final C1894k f171645b;

    /* JADX INFO: renamed from: c */
    public final ImmutableList<fs2> f171646c;

    /* JADX INFO: renamed from: d */
    public final long f171647d;

    /* JADX INFO: renamed from: e */
    public final List<tvd> f171648e;

    /* JADX INFO: renamed from: f */
    public final List<tvd> f171649f;

    /* JADX INFO: renamed from: g */
    public final List<tvd> f171650g;

    /* JADX INFO: renamed from: h */
    public final mkc0 f171651h;

    /* JADX INFO: renamed from: l.t1d0$c */
    public static class C20211c extends t1d0 {

        /* JADX INFO: renamed from: i */
        public final Uri f171653i;

        /* JADX INFO: renamed from: j */
        public final long f171654j;

        /* JADX INFO: renamed from: k */
        @Nullable
        public final String f171655k;

        /* JADX INFO: renamed from: l */
        @Nullable
        public final mkc0 f171656l;

        /* JADX INFO: renamed from: m */
        @Nullable
        public final nqf0 f171657m;

        public C20211c(long j, C1894k c1894k, List<fs2> list, ske0.C20087e c20087e, @Nullable List<tvd> list2, List<tvd> list3, List<tvd> list4, @Nullable String str, long j2) {
            super(j, c1894k, list, c20087e, list2, list3, list4);
            this.f171653i = Uri.parse(list.get(0).f100517a);
            mkc0 mkc0VarM186443c = c20087e.m186443c();
            this.f171656l = mkc0VarM186443c;
            this.f171655k = str;
            this.f171654j = j2;
            this.f171657m = mkc0VarM186443c != null ? null : new nqf0(new mkc0(null, 0L, j2));
        }

        @Override // p153l.t1d0
        @Nullable
        /* JADX INFO: renamed from: a */
        public String mo188899a() {
            return this.f171655k;
        }

        @Override // p153l.t1d0
        @Nullable
        /* JADX INFO: renamed from: b */
        public l4c mo188900b() {
            return this.f171657m;
        }

        @Override // p153l.t1d0
        @Nullable
        /* JADX INFO: renamed from: m */
        public mkc0 mo188901m() {
            return this.f171656l;
        }
    }

    public t1d0(long j, C1894k c1894k, List<fs2> list, ske0 ske0Var, @Nullable List<tvd> list2, List<tvd> list3, List<tvd> list4) {
        w11.m204365a(!list.isEmpty());
        this.f171644a = j;
        this.f171645b = c1894k;
        this.f171646c = ImmutableList.copyOf((Collection) list);
        this.f171648e = list2 == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list2);
        this.f171649f = list3;
        this.f171650g = list4;
        this.f171651h = ske0Var.mo186431a(this);
        this.f171647d = ske0Var.m186432b();
    }

    /* JADX INFO: renamed from: o */
    public static t1d0 m188898o(long j, C1894k c1894k, List<fs2> list, ske0 ske0Var, @Nullable List<tvd> list2, List<tvd> list3, List<tvd> list4, @Nullable String str) {
        if (ske0Var instanceof ske0.C20087e) {
            return new C20211c(j, c1894k, list, (ske0.C20087e) ske0Var, list2, list3, list4, str, -1L);
        }
        if (ske0Var instanceof ske0.AbstractC20083a) {
            return new C20210b(j, c1894k, list, (ske0.AbstractC20083a) ske0Var, list2, list3, list4);
        }
        wg3.m206174a("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public abstract String mo188899a();

    @Nullable
    /* JADX INFO: renamed from: b */
    public abstract l4c mo188900b();

    @Nullable
    /* JADX INFO: renamed from: m */
    public abstract mkc0 mo188901m();

    @Nullable
    /* JADX INFO: renamed from: n */
    public mkc0 m188902n() {
        return this.f171651h;
    }

    /* JADX INFO: renamed from: l.t1d0$b */
    public static class C20210b extends t1d0 implements l4c {

        /* JADX INFO: renamed from: i */
        @VisibleForTesting
        public final ske0.AbstractC20083a f171652i;

        public C20210b(long j, C1894k c1894k, List<fs2> list, ske0.AbstractC20083a abstractC20083a, @Nullable List<tvd> list2, List<tvd> list3, List<tvd> list4) {
            super(j, c1894k, list, abstractC20083a, list2, list3, list4);
            this.f171652i = abstractC20083a;
        }

        @Override // p153l.t1d0
        @Nullable
        /* JADX INFO: renamed from: a */
        public String mo188899a() {
            return null;
        }

        @Override // p153l.l4c
        /* JADX INFO: renamed from: c */
        public long mo152751c(long j) {
            return this.f171652i.m186440j(j);
        }

        @Override // p153l.l4c
        /* JADX INFO: renamed from: d */
        public long mo152752d(long j, long j2) {
            return this.f171652i.m186438h(j, j2);
        }

        @Override // p153l.l4c
        /* JADX INFO: renamed from: e */
        public long mo152753e(long j, long j2) {
            return this.f171652i.m186434d(j, j2);
        }

        @Override // p153l.l4c
        /* JADX INFO: renamed from: f */
        public long mo152754f(long j, long j2) {
            return this.f171652i.m186436f(j, j2);
        }

        @Override // p153l.l4c
        /* JADX INFO: renamed from: g */
        public long mo152755g(long j, long j2) {
            return this.f171652i.m186439i(j, j2);
        }

        @Override // p153l.l4c
        /* JADX INFO: renamed from: h */
        public long mo152756h(long j) {
            return this.f171652i.mo186437g(j);
        }

        @Override // p153l.l4c
        /* JADX INFO: renamed from: i */
        public long mo152757i() {
            return this.f171652i.m186435e();
        }

        @Override // p153l.l4c
        /* JADX INFO: renamed from: j */
        public mkc0 mo152758j(long j) {
            return this.f171652i.mo186441k(this, j);
        }

        @Override // p153l.l4c
        /* JADX INFO: renamed from: k */
        public boolean mo152759k() {
            return this.f171652i.mo186442l();
        }

        @Override // p153l.l4c
        /* JADX INFO: renamed from: l */
        public long mo152760l(long j, long j2) {
            return this.f171652i.m186433c(j, j2);
        }

        @Override // p153l.t1d0
        @Nullable
        /* JADX INFO: renamed from: m */
        public mkc0 mo188901m() {
            return null;
        }

        @Override // p153l.t1d0
        /* JADX INFO: renamed from: b */
        public l4c mo188900b() {
            return this;
        }
    }
}
