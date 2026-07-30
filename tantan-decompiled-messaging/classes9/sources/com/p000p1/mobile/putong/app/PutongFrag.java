package com.p000p1.mobile.putong.app;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import androidx.annotation.CallSuper;
import com.p000p1.mobile.putong.api.ABManager;
import com.p1.mobile.android.app.Frag;
import com.p1.mobile.android.app.c;
import java.util.ArrayList;
import java.util.Collection;
import l.cwf0;
import l.d30;
import l.ddq0;
import l.e30;
import l.j760;
import l.mkd0;
import l.n3m;
import l.vwb;
import l.zvf0;
import p006l.cdq0;
import p006l.edq0;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class PutongFrag extends Frag implements n3m {
    protected cwf0 pageHelper = null;
    private boolean mPVFirstControl = false;
    private a<Boolean> showBs = a.b();
    private boolean isHidden = false;
    private boolean isOnResume = false;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E4 */
    public /* synthetic */ void m1535E4(c cVar) {
        if (cVar == c.j) {
            this.isOnResume = false;
            m1546K4(false);
            this.pageHelper.g();
            return;
        }
        if (cVar == c.i) {
            this.isOnResume = true;
            m1546K4(true);
            if (!this.mPVFirstControl) {
                this.pageHelper.r();
            }
            this.mPVFirstControl = false;
            return;
        }
        if (cVar == c.g) {
            this.mPVFirstControl = true;
            this.pageHelper.r();
            return;
        }
        if (cVar == c.l) {
            this.mPVFirstControl = false;
            return;
        }
        if (cVar instanceof c.a) {
            this.pageHelper.i();
        } else if (cVar == c.m) {
            this.pageHelper.j();
            this.showBs.onCompleted();
            this.showBs = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F4 */
    public /* synthetic */ void m1536F4(Boolean bool) {
        if (TextUtils.equals("sub_a", ABManager.m1256i0("frag_page_show"))) {
            zvf0.B("e_frag_page_show", pageId(), new j760[]{new j760("page", pageId()), new j760("page_show_type", bool.booleanValue() ? "show" : "dismiss")});
        }
    }

    /* JADX INFO: renamed from: B4 */
    public boolean m1538B4() {
        return true;
    }

    /* JADX INFO: renamed from: C4 */
    public Collection<? extends j760<String, d30>> m1539C4() {
        return new ArrayList();
    }

    /* JADX INFO: renamed from: D4 */
    public boolean m1540D4(MotionEvent motionEvent, boolean z) {
        return z;
    }

    /* JADX INFO: renamed from: G4 */
    public boolean m1541G4() {
        return this instanceof cdq0;
    }

    /* JADX INFO: renamed from: H2 */
    public LayoutInflater m1542H2() {
        if (!m1541G4() || !(act() instanceof PutongAct) || !ddq0.a().b()) {
            return super.H2();
        }
        if (((PutongAct) act()).getXmlMonitorLayoutInflater() == null) {
            ((PutongAct) act()).setXmlMonitorLayoutInflater(new edq0(act()));
        }
        ((PutongAct) act()).getXmlMonitorLayoutInflater().m14486a(pageId());
        return ((PutongAct) act()).getXmlMonitorLayoutInflater();
    }

    /* JADX INFO: renamed from: H4 */
    public void m1543H4() {
    }

    /* JADX INFO: renamed from: I4 */
    public void m1544I4() {
    }

    /* JADX INFO: renamed from: J4 */
    public cwf0 m1545J4() {
        return this.pageHelper;
    }

    /* JADX INFO: renamed from: K4 */
    public final void m1546K4(boolean z) {
        this.showBs.onNext(Boolean.valueOf(!this.isHidden && this.isOnResume && z));
    }

    /* JADX INFO: renamed from: L4 */
    public rx.c<Boolean> m1547L4() {
        return this.showBs.distinctUntilChanged();
    }

    /* JADX INFO: renamed from: d4 */
    public void mo1548d4() {
        super.d4();
        this.pageHelper = new cwf0(this);
        if (this.showBs == null) {
            this.showBs = a.b();
        }
    }

    public boolean disableAutoPV() {
        return true;
    }

    /* JADX INFO: renamed from: f4 */
    public void mo1549f4() {
        super.f4();
        lifecycle().subscribe(mkd0.G(new e30() { // from class: l.ljb0
            public final void call(Object obj) {
                this.f16452a.m1535E4((c) obj);
            }
        }));
        m1547L4().subscribe(mkd0.G(new e30() { // from class: l.mjb0
            public final void call(Object obj) {
                this.f16999a.m1536F4((Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: j4 */
    public void m1550j4(long j) {
        if ((m1541G4() || act().needXmlMonitor()) && ddq0.a().b()) {
            long jCurrentTimeMillis = System.currentTimeMillis() - j;
            if (jCurrentTimeMillis > ddq0.a().c()) {
                zvf0.B("e_inflate_view", pageId(), new j760[]{vwb.Y("page_name", pageId()), vwb.Y("time_consume", Long.valueOf(jCurrentTimeMillis))});
            }
        }
    }

    @CallSuper
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        this.isHidden = z;
        m1546K4(!z);
        if (isAdded() && getContext() != null && m1538B4()) {
            for (PutongFrag putongFrag : getChildFragmentManager().t0()) {
                if ((putongFrag instanceof PutongFrag) && z != putongFrag.isHidden) {
                    putongFrag.onHiddenChanged(z);
                }
            }
        }
    }

    public String pageId() {
        return getClass().getName();
    }
}
