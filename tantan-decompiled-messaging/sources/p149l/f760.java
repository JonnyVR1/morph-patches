package p149l;

import android.os.Bundle;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.live.external.square.fragments.LiveVPagerBaseFrag;
import p133rx.C22306c;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes13.dex */
public class f760 {

    /* JADX INFO: renamed from: a */
    public final LiveVPagerBaseFrag f96202a;

    /* JADX INFO: renamed from: e */
    public boolean f96206e;

    /* JADX INFO: renamed from: h */
    public long f96209h;

    /* JADX INFO: renamed from: i */
    public c4g0 f96210i;

    /* JADX INFO: renamed from: j */
    public c4g0 f96211j;

    /* JADX INFO: renamed from: b */
    public int f96203b = 0;

    /* JADX INFO: renamed from: c */
    public int f96204c = 0;

    /* JADX INFO: renamed from: d */
    public int f96205d = 0;

    /* JADX INFO: renamed from: f */
    public int f96207f = 9;

    /* JADX INFO: renamed from: g */
    public final C22392a<Boolean> f96208g = C22392a.m221512b();

    public f760(LiveVPagerBaseFrag liveVPagerBaseFrag) {
        this.f96202a = liveVPagerBaseFrag;
        liveVPagerBaseFrag.creates(new e30() { // from class: l.b760
            @Override // p149l.e30
            public final void call(Object obj) {
                f760.m119761c((Bundle) obj);
            }
        }, new d30() { // from class: l.c760
            @Override // p149l.d30
            public final void call() {
                this.f79597a.m119768j();
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m119761c(Bundle bundle) {
    }

    /* JADX INFO: renamed from: e */
    public final void m119763e(boolean z, int i) {
        int i2 = this.f96205d;
        if ((i | i2) == i2) {
            return;
        }
        int i3 = i2 | this.f96207f;
        this.f96207f = i3;
        if (z) {
            this.f96207f = i3 | i;
        } else {
            this.f96207f = (~i) & i3;
        }
        int i4 = this.f96207f;
        boolean z2 = i4 == 15;
        if (z2 == this.f96206e) {
            Integer.toBinaryString(i4);
            this.f96202a.getClass();
            this.f96202a.hashCode();
            return;
        }
        this.f96206e = z2;
        this.f96208g.m132487l(Boolean.valueOf(z2));
        Integer.toBinaryString(this.f96207f);
        this.f96202a.getClass();
        this.f96202a.hashCode();
        long jM119764f = m119764f(this.f96206e);
        this.f96202a.mo68930S4(this.f96206e, i, jM119764f);
        if (this.f96206e && this.f96202a.mo69865O4()) {
            s2u.m182083o(new s2u.C19834a(this.f96202a.pageId(), i, jM119764f));
        }
    }

    /* JADX INFO: renamed from: f */
    public final long m119764f(boolean z) {
        if (!z) {
            return 0L;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f96209h;
        this.f96209h = System.currentTimeMillis();
        return jCurrentTimeMillis;
    }

    /* JADX INFO: renamed from: g */
    public C22392a<Boolean> m119765g() {
        return this.f96208g;
    }

    /* JADX INFO: renamed from: h */
    public final void m119766h(C4319c c4319c) {
        if (c4319c == C4319c.f15548i) {
            m119763e(true, 8);
        } else if (c4319c == C4319c.f15550k) {
            m119763e(false, 8);
        }
    }

    /* JADX INFO: renamed from: i */
    public boolean m119767i() {
        return this.f96206e;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m119768j() {
        mkd0.m154992z(this.f96210i);
        mkd0.m154992z(this.f96211j);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m119769k(Boolean bool) {
        m119763e(!s2u.m182076h(), 4);
    }

    @CallSuper
    /* JADX INFO: renamed from: l */
    public void m119770l(Act act, @Nullable Bundle bundle) {
        mkd0.m154992z(this.f96210i);
        this.f96210i = act.duringCreated((C22306c) s2u.m182077i(), false).observeOn(jo0.m142408a()).subscribe(ffw.m121193d(new e30() { // from class: l.d760
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f84706a.m119769k((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m */
    public void m119771m() {
        mkd0.m154992z(this.f96211j);
        this.f96211j = this.f96202a.lifecycle().subscribe(ffw.m121193d(new e30() { // from class: l.e760
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f89670a.m119766h((C4319c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n */
    public void m119772n(boolean z) {
        m119763e(z, 2);
    }

    /* JADX INFO: renamed from: o */
    public void m119773o(boolean z) {
        m119763e(z, 1);
    }

    /* JADX INFO: renamed from: p */
    public void m119774p(boolean z, e30<Boolean> e30Var) {
        if (z) {
            int i = this.f96203b;
            if (i > 0) {
                this.f96203b = i - 1;
            } else {
                m119772n(true);
                e30Var.call(Boolean.TRUE);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public void m119775q(int i, int i2) {
        this.f96203b = i;
        this.f96204c = i2;
    }

    /* JADX INFO: renamed from: r */
    public void m119776r(boolean z, e30<Boolean> e30Var) {
        if (z) {
            int i = this.f96203b;
            if (i > 0) {
                this.f96203b = i - 1;
                return;
            } else {
                m119772n(true);
                e30Var.call(Boolean.TRUE);
                return;
            }
        }
        int i2 = this.f96204c;
        if (i2 > 0) {
            this.f96204c = i2 - 1;
        } else {
            m119772n(false);
            e30Var.call(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: s */
    public void m119777s(int i) {
        this.f96205d = i | this.f96205d;
    }
}
