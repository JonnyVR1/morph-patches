package com.p000p1.mobile.putong.core.newui.messages;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.core.newui.main.NewMainAct;
import com.p000p1.mobile.putong.newui.main.base.TabName;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.MKWebViewFrag;
import java.util.Objects;
import l.e30;
import l.hpd0;
import l.jo0;
import l.mkd0;
import l.qqi0;
import l.t100;
import l.v930;
import l.v9j;
import l.w9j;
import l.x2c0;
import l.xdl0;
import l.zpd0;
import rx.c;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class HomeFeaturedTabFrag extends MKWebViewFrag {

    /* JADX INFO: renamed from: N */
    public final zpd0 f4006N = new zpd0("featured_tab_last_suggest_time" + CoreModule.H().userId(), 0L);

    /* JADX INFO: renamed from: O */
    public final hpd0 f4007O = new hpd0("featured_tab_red_point_clicked" + CoreModule.H().userId(), Boolean.TRUE);

    /* JADX INFO: renamed from: b5 */
    public final void m5778b5(Long l2) {
        if (qqi0.h(l2.longValue(), ((Long) this.f4006N.get()).longValue(), 1)) {
            this.f4006N.put(l2);
            m5781e5();
        }
    }

    /* JADX INFO: renamed from: c5 */
    public final void m5779c5() {
        this.f4007O.put(Boolean.TRUE);
        act().m3878Z6(false);
    }

    /* JADX INFO: renamed from: d5 */
    public final /* synthetic */ void m5780d5(TabName tabName) {
        m5779c5();
    }

    /* JADX INFO: renamed from: e5 */
    public final void m5781e5() {
        if (v930.h() == TabName.FEATURED) {
            return;
        }
        NewMainAct newMainActAct = act();
        if (newMainActAct instanceof NewMainAct) {
            newMainActAct.m3878Z6(true);
            this.f4007O.put(Boolean.FALSE);
        }
    }

    /* JADX INFO: renamed from: f4 */
    public void m5782f4() {
        super/*com.p1.mobile.putong.app.PutongFrag*/.f4();
        c cVarDuringCreated = duringCreated(v930.k());
        final TabName tabName = TabName.FEATURED;
        Objects.requireNonNull(tabName);
        cVarDuringCreated.filter(new w9j() { // from class: l.h7l
            public final Object call(Object obj) {
                return Boolean.valueOf(tabName.equals((TabName) obj));
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.i7l
            public final void call(Object obj) {
                this.f14433a.m5780d5((TabName) obj);
            }
        }));
        duringCreated(new v9j() { // from class: l.j7l
            public final Object call() {
                return CoreModule.c.q2.e0.asObservable();
            }
        }, false).observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.k7l
            public final void call(Object obj) {
                this.f15456a.m5778b5((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g4 */
    public void m5783g4(Bundle bundle) {
        super/*com.p1.mobile.android.app.Frag*/.g4(bundle);
        if (!((Boolean) this.f4007O.get()).booleanValue()) {
            m5781e5();
        }
        View vNavigationBar = new VNavigationBar(getContext());
        vNavigationBar.setTitle("每日精选");
        vNavigationBar.setBackgroundResource(x2c0.tu);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(xdl0.e, t100.d(44.0f));
        layoutParams.topMargin = xdl0.G0(true);
        ((MKWebViewFrag) this).z.addView(vNavigationBar, layoutParams);
    }

    public void onHiddenChanged(boolean z) {
        super/*com.p1.mobile.putong.app.PutongFrag*/.onHiddenChanged(z);
        if (z) {
            return;
        }
        CoreModule.c.q2.o3(false);
        S4("reloadPage");
    }
}
