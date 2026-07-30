package com.p051p1.mobile.putong.core.newui.messages;

import android.os.Bundle;
import android.widget.FrameLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.p058ui.MKWebViewFrag;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import java.util.Objects;
import p137rx.C22421c;
import p151v.navigationbar.VNavigationBar;
import p153l.bnl0;
import p153l.byd0;
import p153l.dbc0;
import p153l.fo0;
import p153l.ji30;
import p153l.jxd0;
import p153l.pcj;
import p153l.psd0;
import p153l.qa00;
import p153l.qcj;
import p153l.tzi0;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class HomeFeaturedTabFrag extends MKWebViewFrag {

    /* JADX INFO: renamed from: N */
    public final byd0 f25970N = new byd0("featured_tab_last_suggest_time" + CoreModule.m30929H().userId(), 0L);

    /* JADX INFO: renamed from: O */
    public final jxd0 f25971O = new jxd0("featured_tab_red_point_clicked" + CoreModule.m30929H().userId(), Boolean.TRUE);

    /* JADX INFO: renamed from: b5 */
    public final void m42667b5(Long l2) {
        if (tzi0.m193670h(l2.longValue(), this.f25970N.get().longValue(), 1)) {
            this.f25970N.put(l2);
            m42670e5();
        }
    }

    /* JADX INFO: renamed from: c5 */
    public final void m42668c5() {
        this.f25971O.put(Boolean.TRUE);
        ((NewMainAct) act()).m40815f7(false);
    }

    /* JADX INFO: renamed from: d5 */
    public final /* synthetic */ void m42669d5(TabName tabName) {
        m42668c5();
    }

    /* JADX INFO: renamed from: e5 */
    public final void m42670e5() {
        if (ji30.m144964h() == TabName.FEATURED) {
            return;
        }
        Act act = act();
        if (act instanceof NewMainAct) {
            ((NewMainAct) act).m40815f7(true);
            this.f25971O.put(Boolean.FALSE);
        }
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        C22421c c22421cDuringCreated = duringCreated(ji30.m144967k());
        final TabName tabName = TabName.FEATURED;
        Objects.requireNonNull(tabName);
        c22421cDuringCreated.filter(new qcj() { // from class: l.x9l
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(tabName.equals((TabName) obj));
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.y9l
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f198103a.m42669d5((TabName) obj);
            }
        }));
        duringCreated(new pcj() { // from class: l.z9l
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return CoreModule.f18264c.f20419q2.f180591e0.asObservable();
            }
        }, false).observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.aal
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f69152a.m42667b5((Long) obj);
            }
        }));
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        if (!this.f25971O.get().booleanValue()) {
            m42670e5();
        }
        VNavigationBar vNavigationBar = new VNavigationBar(getContext());
        vNavigationBar.setTitle("每日精选");
        vNavigationBar.setBackgroundResource(dbc0.f87070hv);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(bnl0.f77544e, qa00.m175859d(44.0f));
        layoutParams.topMargin = bnl0.m105513G0(true);
        this.f28851z.addView(vNavigationBar, layoutParams);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (z) {
            return;
        }
        CoreModule.f18264c.f20419q2.m197490o3(false);
        m45094S4("reloadPage");
    }
}
