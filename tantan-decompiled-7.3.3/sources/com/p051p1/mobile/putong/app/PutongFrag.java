package com.p051p1.mobile.putong.app;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import androidx.annotation.CallSuper;
import androidx.fragment.app.Fragment;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.android.app.Frag;
import com.p051p1.mobile.putong.api.ABManager;
import com.p051p1.mobile.putong.core.p058ui.notifications.SysnotifListener;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import java.util.ArrayList;
import java.util.Collection;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p153l.e6m;
import p153l.hmq0;
import p153l.i4g0;
import p153l.imq0;
import p153l.jmq0;
import p153l.jyb;
import p153l.l4g0;
import p153l.pf60;
import p153l.psd0;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes9.dex */
public class PutongFrag extends Frag implements e6m {
    protected l4g0 pageHelper = null;
    private boolean mPVFirstControl = false;
    private C22507a<Boolean> showBs = C22507a.m222758b();
    private boolean isHidden = false;
    private boolean isOnResume = false;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: E4 */
    public /* synthetic */ void m30627E4(C4470c c4470c) {
        if (c4470c == C4470c.f16268j) {
            this.isOnResume = false;
            m30637K4(false);
            this.pageHelper.m152772g();
            return;
        }
        if (c4470c == C4470c.f16267i) {
            this.isOnResume = true;
            m30637K4(true);
            if (!this.mPVFirstControl) {
                this.pageHelper.m152783r();
            }
            this.mPVFirstControl = false;
            return;
        }
        if (c4470c == C4470c.f16265g) {
            this.mPVFirstControl = true;
            this.pageHelper.m152783r();
            return;
        }
        if (c4470c == C4470c.f16270l) {
            this.mPVFirstControl = false;
            return;
        }
        if (c4470c instanceof C4470c.a) {
            this.pageHelper.m152774i();
        } else if (c4470c == C4470c.f16271m) {
            this.pageHelper.m152775j();
            this.showBs.onCompleted();
            this.showBs = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: F4 */
    public /* synthetic */ void m30628F4(Boolean bool) {
        if (TextUtils.equals("sub_a", ABManager.m30348i0("frag_page_show"))) {
            i4g0.m138493B("e_frag_page_show", pageId(), new pf60(OMSTemplateModeType.page, pageId()), new pf60("page_show_type", bool.booleanValue() ? "show" : SysnotifListener.ACTION_DISMISS));
        }
    }

    /* JADX INFO: renamed from: B4 */
    public boolean mo30630B4() {
        return true;
    }

    /* JADX INFO: renamed from: C4 */
    public Collection<? extends pf60<String, x20>> mo30631C4() {
        return new ArrayList();
    }

    /* JADX INFO: renamed from: D4 */
    public boolean mo30632D4(MotionEvent motionEvent, boolean z) {
        return z;
    }

    /* JADX INFO: renamed from: G4 */
    public boolean m30633G4() {
        return this instanceof hmq0;
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: H2 */
    public LayoutInflater mo21577H2() {
        if (!m30633G4() || !(act() instanceof PutongAct) || !imq0.m140986a().m140987b()) {
            return super.mo21577H2();
        }
        if (((PutongAct) act()).getXmlMonitorLayoutInflater() == null) {
            ((PutongAct) act()).setXmlMonitorLayoutInflater(new jmq0(act()));
        }
        ((PutongAct) act()).getXmlMonitorLayoutInflater().m146167a(pageId());
        return ((PutongAct) act()).getXmlMonitorLayoutInflater();
    }

    /* JADX INFO: renamed from: H4 */
    public void mo30634H4() {
    }

    /* JADX INFO: renamed from: I4 */
    public void mo30635I4() {
    }

    /* JADX INFO: renamed from: J4 */
    public l4g0 mo30636J4() {
        return this.pageHelper;
    }

    /* JADX INFO: renamed from: K4 */
    public final void m30637K4(boolean z) {
        this.showBs.onNext(Boolean.valueOf(!this.isHidden && this.isOnResume && z));
    }

    /* JADX INFO: renamed from: L4 */
    public C22421c<Boolean> m30638L4() {
        return this.showBs.distinctUntilChanged();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        this.pageHelper = new l4g0(this);
        if (this.showBs == null) {
            this.showBs = C22507a.m222758b();
        }
    }

    public boolean disableAutoPV() {
        return true;
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.prb0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f153744a.m30627E4((C4470c) obj);
            }
        }));
        m30638L4().subscribe(psd0.m173596G(new y20() { // from class: l.qrb0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f159086a.m30628F4((Boolean) obj);
            }
        }));
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: j4 */
    public void mo21588j4(long j) {
        if ((m30633G4() || act().needXmlMonitor()) && imq0.m140986a().m140987b()) {
            long jCurrentTimeMillis = System.currentTimeMillis() - j;
            if (jCurrentTimeMillis > imq0.m140986a().m140988c()) {
                i4g0.m138493B("e_inflate_view", pageId(), jyb.m147494Y("page_name", pageId()), jyb.m147494Y("time_consume", Long.valueOf(jCurrentTimeMillis)));
            }
        }
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    @CallSuper
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        this.isHidden = z;
        m30637K4(!z);
        if (isAdded() && getContext() != null && mo30630B4()) {
            for (Fragment fragment : getChildFragmentManager().m2590t0()) {
                if ((fragment instanceof PutongFrag) && z != ((PutongFrag) fragment).isHidden) {
                    fragment.onHiddenChanged(z);
                }
            }
        }
    }

    @Override // com.p051p1.mobile.android.app.Frag, p153l.e6m
    public String pageId() {
        return getClass().getName();
    }
}
