package com.p046p1.mobile.putong.app;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import androidx.annotation.CallSuper;
import androidx.fragment.app.Fragment;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.android.app.Frag;
import com.p046p1.mobile.putong.api.ABManager;
import com.p046p1.mobile.putong.core.p053ui.notifications.SysnotifListener;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import java.util.ArrayList;
import java.util.Collection;
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p149l.cdq0;
import p149l.cwf0;
import p149l.d30;
import p149l.ddq0;
import p149l.e30;
import p149l.edq0;
import p149l.j760;
import p149l.mkd0;
import p149l.n3m;
import p149l.vwb;
import p149l.zvf0;

/* JADX INFO: loaded from: classes9.dex */
public class PutongFrag extends Frag implements n3m {
    protected cwf0 pageHelper = null;
    private boolean mPVFirstControl = false;
    private C22392a<Boolean> showBs = C22392a.m221512b();
    private boolean isHidden = false;
    private boolean isOnResume = false;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E4 */
    public /* synthetic */ void m29629E4(C4319c c4319c) {
        if (c4319c == C4319c.f15549j) {
            this.isOnResume = false;
            m29639K4(false);
            this.pageHelper.m109031g();
            return;
        }
        if (c4319c == C4319c.f15548i) {
            this.isOnResume = true;
            m29639K4(true);
            if (!this.mPVFirstControl) {
                this.pageHelper.m109042r();
            }
            this.mPVFirstControl = false;
            return;
        }
        if (c4319c == C4319c.f15546g) {
            this.mPVFirstControl = true;
            this.pageHelper.m109042r();
            return;
        }
        if (c4319c == C4319c.f15551l) {
            this.mPVFirstControl = false;
            return;
        }
        if (c4319c instanceof C4319c.a) {
            this.pageHelper.m109033i();
        } else if (c4319c == C4319c.f15552m) {
            this.pageHelper.m109034j();
            this.showBs.onCompleted();
            this.showBs = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F4 */
    public /* synthetic */ void m29630F4(Boolean bool) {
        if (TextUtils.equals("sub_a", ABManager.m29350i0("frag_page_show"))) {
            zvf0.m220369B("e_frag_page_show", pageId(), new j760(OMSTemplateModeType.page, pageId()), new j760("page_show_type", bool.booleanValue() ? "show" : SysnotifListener.ACTION_DISMISS));
        }
    }

    /* JADX INFO: renamed from: B4 */
    public boolean mo29632B4() {
        return true;
    }

    /* JADX INFO: renamed from: C4 */
    public Collection<? extends j760<String, d30>> mo29633C4() {
        return new ArrayList();
    }

    /* JADX INFO: renamed from: D4 */
    public boolean mo29634D4(MotionEvent motionEvent, boolean z) {
        return z;
    }

    /* JADX INFO: renamed from: G4 */
    public boolean m29635G4() {
        return this instanceof cdq0;
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: H2 */
    public LayoutInflater mo20578H2() {
        if (!m29635G4() || !(act() instanceof PutongAct) || !ddq0.m111055a().m111056b()) {
            return super.mo20578H2();
        }
        if (((PutongAct) act()).getXmlMonitorLayoutInflater() == null) {
            ((PutongAct) act()).setXmlMonitorLayoutInflater(new edq0(act()));
        }
        ((PutongAct) act()).getXmlMonitorLayoutInflater().m115827a(pageId());
        return ((PutongAct) act()).getXmlMonitorLayoutInflater();
    }

    /* JADX INFO: renamed from: H4 */
    public void mo29636H4() {
    }

    /* JADX INFO: renamed from: I4 */
    public void mo29637I4() {
    }

    /* JADX INFO: renamed from: J4 */
    public cwf0 mo29638J4() {
        return this.pageHelper;
    }

    /* JADX INFO: renamed from: K4 */
    public final void m29639K4(boolean z) {
        this.showBs.onNext(Boolean.valueOf(!this.isHidden && this.isOnResume && z));
    }

    /* JADX INFO: renamed from: L4 */
    public C22306c<Boolean> m29640L4() {
        return this.showBs.distinctUntilChanged();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        this.pageHelper = new cwf0(this);
        if (this.showBs == null) {
            this.showBs = C22392a.m221512b();
        }
    }

    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.ljb0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f128302a.m29629E4((C4319c) obj);
            }
        }));
        m29640L4().subscribe(mkd0.m154955G(new e30() { // from class: l.mjb0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f134117a.m29630F4((Boolean) obj);
            }
        }));
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: j4 */
    public void mo20589j4(long j) {
        if ((m29635G4() || act().needXmlMonitor()) && ddq0.m111055a().m111056b()) {
            long jCurrentTimeMillis = System.currentTimeMillis() - j;
            if (jCurrentTimeMillis > ddq0.m111055a().m111057c()) {
                zvf0.m220369B("e_inflate_view", pageId(), vwb.m200311Y("page_name", pageId()), vwb.m200311Y("time_consume", Long.valueOf(jCurrentTimeMillis)));
            }
        }
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    @CallSuper
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        this.isHidden = z;
        m29639K4(!z);
        if (isAdded() && getContext() != null && mo29632B4()) {
            for (Fragment fragment : getChildFragmentManager().m2589t0()) {
                if ((fragment instanceof PutongFrag) && z != ((PutongFrag) fragment).isHidden) {
                    fragment.onHiddenChanged(z);
                }
            }
        }
    }

    @Override // com.p046p1.mobile.android.app.Frag, p149l.n3m
    public String pageId() {
        return getClass().getName();
    }
}
