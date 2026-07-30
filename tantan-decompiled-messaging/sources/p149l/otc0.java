package p149l;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.C1871k;
import com.google.common.collect.ImmutableList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public abstract class otc0 {

    /* JADX INFO: renamed from: a */
    public final long f145561a;

    /* JADX INFO: renamed from: b */
    public final C1871k f145562b;

    /* JADX INFO: renamed from: c */
    public final ImmutableList<pr2> f145563c;

    /* JADX INFO: renamed from: d */
    public final long f145564d;

    /* JADX INFO: renamed from: e */
    public final List<fud> f145565e;

    /* JADX INFO: renamed from: f */
    public final List<fud> f145566f;

    /* JADX INFO: renamed from: g */
    public final List<fud> f145567g;

    /* JADX INFO: renamed from: h */
    public final fcc0 f145568h;

    /* JADX INFO: renamed from: l.otc0$c */
    public static class C19037c extends otc0 {

        /* JADX INFO: renamed from: i */
        public final Uri f145570i;

        /* JADX INFO: renamed from: j */
        public final long f145571j;

        /* JADX INFO: renamed from: k */
        @Nullable
        public final String f145572k;

        /* JADX INFO: renamed from: l */
        @Nullable
        public final fcc0 f145573l;

        /* JADX INFO: renamed from: m */
        @Nullable
        public final eif0 f145574m;

        public C19037c(long j, C1871k c1871k, List<pr2> list, nce0.C18676e c18676e, @Nullable List<fud> list2, List<fud> list3, List<fud> list4, @Nullable String str, long j2) {
            super(j, c1871k, list, c18676e, list2, list3, list4);
            this.f145570i = Uri.parse(list.get(0).f150850a);
            fcc0 fcc0VarM158942c = c18676e.m158942c();
            this.f145573l = fcc0VarM158942c;
            this.f145572k = str;
            this.f145571j = j2;
            this.f145574m = fcc0VarM158942c != null ? null : new eif0(new fcc0(null, 0L, j2));
        }

        @Override // p149l.otc0
        @Nullable
        /* JADX INFO: renamed from: a */
        public String mo165936a() {
            return this.f145572k;
        }

        @Override // p149l.otc0
        @Nullable
        /* JADX INFO: renamed from: b */
        public c3c mo165937b() {
            return this.f145574m;
        }

        @Override // p149l.otc0
        @Nullable
        /* JADX INFO: renamed from: m */
        public fcc0 mo165938m() {
            return this.f145573l;
        }
    }

    public otc0(long j, C1871k c1871k, List<pr2> list, nce0 nce0Var, @Nullable List<fud> list2, List<fud> list3, List<fud> list4) {
        p11.m167007a(!list.isEmpty());
        this.f145561a = j;
        this.f145562b = c1871k;
        this.f145563c = ImmutableList.copyOf((Collection) list);
        this.f145565e = list2 == null ? Collections.EMPTY_LIST : Collections.unmodifiableList(list2);
        this.f145566f = list3;
        this.f145567g = list4;
        this.f145568h = nce0Var.mo158930a(this);
        this.f145564d = nce0Var.m158931b();
    }

    /* JADX INFO: renamed from: o */
    public static otc0 m165935o(long j, C1871k c1871k, List<pr2> list, nce0 nce0Var, @Nullable List<fud> list2, List<fud> list3, List<fud> list4, @Nullable String str) {
        if (nce0Var instanceof nce0.C18676e) {
            return new C19037c(j, c1871k, list, (nce0.C18676e) nce0Var, list2, list3, list4, str, -1L);
        }
        if (nce0Var instanceof nce0.AbstractC18672a) {
            return new C19036b(j, c1871k, list, (nce0.AbstractC18672a) nce0Var, list2, list3, list4);
        }
        ig3.m135964a("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public abstract String mo165936a();

    @Nullable
    /* JADX INFO: renamed from: b */
    public abstract c3c mo165937b();

    @Nullable
    /* JADX INFO: renamed from: m */
    public abstract fcc0 mo165938m();

    @Nullable
    /* JADX INFO: renamed from: n */
    public fcc0 m165939n() {
        return this.f145568h;
    }

    /* JADX INFO: renamed from: l.otc0$b */
    public static class C19036b extends otc0 implements c3c {

        /* JADX INFO: renamed from: i */
        @VisibleForTesting
        public final nce0.AbstractC18672a f145569i;

        public C19036b(long j, C1871k c1871k, List<pr2> list, nce0.AbstractC18672a abstractC18672a, @Nullable List<fud> list2, List<fud> list3, List<fud> list4) {
            super(j, c1871k, list, abstractC18672a, list2, list3, list4);
            this.f145569i = abstractC18672a;
        }

        @Override // p149l.otc0
        @Nullable
        /* JADX INFO: renamed from: a */
        public String mo165936a() {
            return null;
        }

        @Override // p149l.c3c
        /* JADX INFO: renamed from: c */
        public long mo104993c(long j) {
            return this.f145569i.m158939j(j);
        }

        @Override // p149l.c3c
        /* JADX INFO: renamed from: d */
        public long mo104994d(long j, long j2) {
            return this.f145569i.m158937h(j, j2);
        }

        @Override // p149l.c3c
        /* JADX INFO: renamed from: e */
        public long mo104995e(long j, long j2) {
            return this.f145569i.m158933d(j, j2);
        }

        @Override // p149l.c3c
        /* JADX INFO: renamed from: f */
        public long mo104996f(long j, long j2) {
            return this.f145569i.m158935f(j, j2);
        }

        @Override // p149l.c3c
        /* JADX INFO: renamed from: g */
        public long mo104997g(long j, long j2) {
            return this.f145569i.m158938i(j, j2);
        }

        @Override // p149l.c3c
        /* JADX INFO: renamed from: h */
        public long mo104998h(long j) {
            return this.f145569i.mo158936g(j);
        }

        @Override // p149l.c3c
        /* JADX INFO: renamed from: i */
        public long mo104999i() {
            return this.f145569i.m158934e();
        }

        @Override // p149l.c3c
        /* JADX INFO: renamed from: j */
        public fcc0 mo105000j(long j) {
            return this.f145569i.mo158940k(this, j);
        }

        @Override // p149l.c3c
        /* JADX INFO: renamed from: k */
        public boolean mo105001k() {
            return this.f145569i.mo158941l();
        }

        @Override // p149l.c3c
        /* JADX INFO: renamed from: l */
        public long mo105002l(long j, long j2) {
            return this.f145569i.m158932c(j, j2);
        }

        @Override // p149l.otc0
        @Nullable
        /* JADX INFO: renamed from: m */
        public fcc0 mo165938m() {
            return null;
        }

        @Override // p149l.otc0
        /* JADX INFO: renamed from: b */
        public c3c mo165937b() {
            return this;
        }
    }
}
