package p153l;

import android.os.Bundle;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.live.external.square.fragments.LiveVPagerBaseFrag;
import p137rx.C22421c;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes9.dex */
public class lf60 {

    /* JADX INFO: renamed from: a */
    public final LiveVPagerBaseFrag f131810a;

    /* JADX INFO: renamed from: e */
    public boolean f131814e;

    /* JADX INFO: renamed from: h */
    public long f131817h;

    /* JADX INFO: renamed from: i */
    public kcg0 f131818i;

    /* JADX INFO: renamed from: j */
    public kcg0 f131819j;

    /* JADX INFO: renamed from: b */
    public int f131811b = 0;

    /* JADX INFO: renamed from: c */
    public int f131812c = 0;

    /* JADX INFO: renamed from: d */
    public int f131813d = 0;

    /* JADX INFO: renamed from: f */
    public int f131815f = 9;

    /* JADX INFO: renamed from: g */
    public final C22507a<Boolean> f131816g = C22507a.m222758b();

    public lf60(LiveVPagerBaseFrag liveVPagerBaseFrag) {
        this.f131810a = liveVPagerBaseFrag;
        liveVPagerBaseFrag.creates(new y20() { // from class: l.hf60
            @Override // p153l.y20
            public final void call(Object obj) {
                lf60.m153974c((Bundle) obj);
            }
        }, new x20() { // from class: l.if60
            @Override // p153l.x20
            public final void call() {
                this.f114650a.m153981j();
            }
        });
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m153974c(Bundle bundle) {
    }

    /* JADX INFO: renamed from: e */
    public final void m153976e(boolean z, int i) {
        int i2 = this.f131813d;
        if ((i | i2) == i2) {
            return;
        }
        int i3 = i2 | this.f131815f;
        this.f131815f = i3;
        if (z) {
            this.f131815f = i3 | i;
        } else {
            this.f131815f = (~i) & i3;
        }
        int i4 = this.f131815f;
        boolean z2 = i4 == 15;
        if (z2 == this.f131814e) {
            Integer.toBinaryString(i4);
            this.f131810a.getClass();
            this.f131810a.hashCode();
            return;
        }
        this.f131814e = z2;
        this.f131816g.m137019l(Boolean.valueOf(z2));
        Integer.toBinaryString(this.f131815f);
        this.f131810a.getClass();
        this.f131810a.hashCode();
        long jM153977f = m153977f(this.f131814e);
        this.f131810a.mo70113S4(this.f131814e, i, jM153977f);
        if (this.f131814e && this.f131810a.mo71048O4()) {
            t4u.m189326o(new t4u.C20236a(this.f131810a.pageId(), i, jM153977f));
        }
    }

    /* JADX INFO: renamed from: f */
    public final long m153977f(boolean z) {
        if (!z) {
            return 0L;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f131817h;
        this.f131817h = System.currentTimeMillis();
        return jCurrentTimeMillis;
    }

    /* JADX INFO: renamed from: g */
    public C22507a<Boolean> m153978g() {
        return this.f131816g;
    }

    /* JADX INFO: renamed from: h */
    public final void m153979h(C4470c c4470c) {
        if (c4470c == C4470c.f16267i) {
            m153976e(true, 8);
        } else if (c4470c == C4470c.f16269k) {
            m153976e(false, 8);
        }
    }

    /* JADX INFO: renamed from: i */
    public boolean m153980i() {
        return this.f131814e;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m153981j() {
        psd0.m173633z(this.f131818i);
        psd0.m173633z(this.f131819j);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m153982k(Boolean bool) {
        m153976e(!t4u.m189319h(), 4);
    }

    @CallSuper
    /* JADX INFO: renamed from: l */
    public void m153983l(Act act, @Nullable Bundle bundle) {
        psd0.m173633z(this.f131818i);
        this.f131818i = act.duringCreated((C22421c) t4u.m189320i(), false).observeOn(fo0.m126432a()).subscribe(dhw.m115825d(new y20() { // from class: l.jf60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f120567a.m153982k((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: m */
    public void m153984m() {
        psd0.m173633z(this.f131819j);
        this.f131819j = this.f131810a.lifecycle().subscribe(dhw.m115825d(new y20() { // from class: l.kf60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f126252a.m153979h((C4470c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n */
    public void m153985n(boolean z) {
        m153976e(z, 2);
    }

    /* JADX INFO: renamed from: o */
    public void m153986o(boolean z) {
        m153976e(z, 1);
    }

    /* JADX INFO: renamed from: p */
    public void m153987p(boolean z, y20<Boolean> y20Var) {
        if (z) {
            int i = this.f131811b;
            if (i > 0) {
                this.f131811b = i - 1;
            } else {
                m153985n(true);
                y20Var.call(Boolean.TRUE);
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public void m153988q(int i, int i2) {
        this.f131811b = i;
        this.f131812c = i2;
    }

    /* JADX INFO: renamed from: r */
    public void m153989r(boolean z, y20<Boolean> y20Var) {
        if (z) {
            int i = this.f131811b;
            if (i > 0) {
                this.f131811b = i - 1;
                return;
            } else {
                m153985n(true);
                y20Var.call(Boolean.TRUE);
                return;
            }
        }
        int i2 = this.f131812c;
        if (i2 > 0) {
            this.f131812c = i2 - 1;
        } else {
            m153985n(false);
            y20Var.call(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: s */
    public void m153990s(int i) {
        this.f131813d = i | this.f131813d;
    }
}
