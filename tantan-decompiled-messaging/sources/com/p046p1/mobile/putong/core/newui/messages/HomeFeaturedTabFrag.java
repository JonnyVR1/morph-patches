package com.p046p1.mobile.putong.core.newui.messages;

import android.os.Bundle;
import android.widget.FrameLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.core.p053ui.MKWebViewFrag;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import java.util.Objects;
import p133rx.C22306c;
import p147v.navigationbar.VNavigationBar;
import p149l.e30;
import p149l.hpd0;
import p149l.jo0;
import p149l.mkd0;
import p149l.qqi0;
import p149l.t100;
import p149l.v930;
import p149l.v9j;
import p149l.w9j;
import p149l.x2c0;
import p149l.xdl0;
import p149l.zpd0;

/* JADX INFO: loaded from: classes11.dex */
public class HomeFeaturedTabFrag extends MKWebViewFrag {

    /* JADX INFO: renamed from: N */
    public final zpd0 f25228N = new zpd0("featured_tab_last_suggest_time" + CoreModule.m29931H().userId(), 0L);

    /* JADX INFO: renamed from: O */
    public final hpd0 f25229O = new hpd0("featured_tab_red_point_clicked" + CoreModule.m29931H().userId(), Boolean.TRUE);

    /* JADX INFO: renamed from: b5 */
    public final void m41656b5(Long l2) {
        if (qqi0.m175940h(l2.longValue(), this.f25228N.get().longValue(), 1)) {
            this.f25228N.put(l2);
            m41659e5();
        }
    }

    /* JADX INFO: renamed from: c5 */
    public final void m41657c5() {
        this.f25229O.put(Boolean.TRUE);
        ((NewMainAct) act()).m39802Z6(false);
    }

    /* JADX INFO: renamed from: d5 */
    public final /* synthetic */ void m41658d5(TabName tabName) {
        m41657c5();
    }

    /* JADX INFO: renamed from: e5 */
    public final void m41659e5() {
        if (v930.m197534h() == TabName.FEATURED) {
            return;
        }
        Act act = act();
        if (act instanceof NewMainAct) {
            ((NewMainAct) act).m39802Z6(true);
            this.f25229O.put(Boolean.FALSE);
        }
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        C22306c c22306cDuringCreated = duringCreated(v930.m197537k());
        final TabName tabName = TabName.FEATURED;
        Objects.requireNonNull(tabName);
        c22306cDuringCreated.filter(new w9j() { // from class: l.h7l
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(tabName.equals((TabName) obj));
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.i7l
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f111926a.m41658d5((TabName) obj);
            }
        }));
        duringCreated(new v9j() { // from class: l.j7l
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return CoreModule.f17545c.f19677q2.f114450e0.asObservable();
            }
        }, false).observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.k7l
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f121608a.m41656b5((Long) obj);
            }
        }));
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        if (!this.f25229O.get().booleanValue()) {
            m41659e5();
        }
        VNavigationBar vNavigationBar = new VNavigationBar(getContext());
        vNavigationBar.setTitle("每日精选");
        vNavigationBar.setBackgroundResource(x2c0.f190601tu);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(xdl0.f192403e, t100.m186890d(44.0f));
        layoutParams.topMargin = xdl0.m208333G0(true);
        this.f28003z.addView(vNavigationBar, layoutParams);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (z) {
            return;
        }
        CoreModule.f17545c.f19677q2.m137709o3(false);
        m43908S4("reloadPage");
    }
}
