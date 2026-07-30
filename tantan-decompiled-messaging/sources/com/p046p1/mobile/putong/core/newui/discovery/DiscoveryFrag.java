package com.p046p1.mobile.putong.core.newui.discovery;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.CoreMomentInfo;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.core.newui.main.NewMainContextFrag;
import com.p046p1.mobile.putong.data.BannerLoc;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import p133rx.C22306c;
import p147v.VDraweeView;
import p147v.VText;
import p149l.b2e;
import p149l.e30;
import p149l.ife;
import p149l.kpd0;
import p149l.mkd0;
import p149l.q5e;
import p149l.q860;
import p149l.qib0;
import p149l.t0g0;
import p149l.t100;
import p149l.w9j;
import p149l.xaj0;
import p149l.xdl0;
import p149l.y9j;

/* JADX INFO: loaded from: classes11.dex */
public class DiscoveryFrag extends NewMainContextFrag {

    /* JADX INFO: renamed from: B */
    public FrameLayout f21344B;

    /* JADX INFO: renamed from: C */
    public TextView f21345C;

    /* JADX INFO: renamed from: D */
    public RelativeLayout f21346D;

    /* JADX INFO: renamed from: E */
    public LinearLayout f21347E;

    /* JADX INFO: renamed from: F */
    public VText f21348F;

    /* JADX INFO: renamed from: G */
    public FrameLayout f21349G;

    /* JADX INFO: renamed from: H */
    public FrameLayout f21350H;

    /* JADX INFO: renamed from: I */
    public VDraweeView f21351I;

    /* JADX INFO: renamed from: J */
    public ViewStub f21352J;

    /* JADX INFO: renamed from: K */
    public kpd0 f21353K = new kpd0("latestUnreadMomentInNewUi" + CoreModule.m29931H().userId(), FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g5 */
    public /* synthetic */ void m36269g5(View view) {
        m36270h5(act());
    }

    /* JADX INFO: renamed from: h5 */
    public static void m36270h5(Act act) {
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (NullChecker.m81303a(userM169527p9)) {
            qib0.f154691G.m102374u0(userM169527p9.m60124fp().profileSmall());
        }
        act.startActivity(CoreModule.m29934N().argsToMomentsFeedAct(act));
    }

    /* JADX INFO: renamed from: c5 */
    public View m36271c5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return b2e.m99962b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: d5 */
    public final C22306c<User> m36272d5() {
        return mkd0.m154985s(CoreModule.m29934N().coreMomentMoments(CoreMomentInfo.JSON_ADAPTER), Act.foreground().map(new w9j() { // from class: l.y1e
            @Override // p149l.w9j
            public final Object call(Object obj) {
                Act.C4299r c4299r = (Act.C4299r) obj;
                return Boolean.valueOf(c4299r != null && CoreModule.m29934N().isMomentsFeedAct(c4299r.f15343a.get()));
            }
        }).distinctUntilChanged(), this.f21353K.obs(), new y9j() { // from class: l.z1e
            @Override // p149l.y9j
            /* JADX INFO: renamed from: a */
            public final Object mo94599a(Object obj, Object obj2, Object obj3) {
                return xaj0.m207578a((q860) obj, (Boolean) obj2, (Double) obj3);
            }
        }).switchMap(new w9j() { // from class: l.a2e
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f67252a.m36273e5((xaj0) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e5 */
    public final /* synthetic */ C22306c m36273e5(xaj0 xaj0Var) {
        CoreMomentInfo coreMomentInfo;
        q860 q860Var = (q860) xaj0Var.f191751a;
        boolean zBooleanValue = ((Boolean) xaj0Var.f191752b).booleanValue();
        Iterator it = q860Var.f153135a.iterator();
        do {
            if (it.hasNext()) {
                coreMomentInfo = (CoreMomentInfo) it.next();
                if (coreMomentInfo.createdTime <= ((Double) xaj0Var.f191753c).doubleValue()) {
                }
            }
            coreMomentInfo = null;
            break;
        } while (coreMomentInfo.owner.equals(CoreModule.m29931H().userId()));
        if (!NullChecker.m81303a(coreMomentInfo)) {
            return C22306c.just(null);
        }
        if (!zBooleanValue) {
            return CoreModule.f17545c.f19639e0.m169410Ka(coreMomentInfo.owner);
        }
        this.f21353K.put(Double.valueOf(coreMomentInfo.createdTime));
        return C22306c.just(null);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo20585f4() {
        super.mo20585f4();
        duringCreated(mkd0.m154985s(m36272d5(), CoreModule.f17545c.m31483n3().map(new w9j() { // from class: l.u1e
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Integer.valueOf(((Counter) obj).activities.unread);
            }
        }).distinctUntilChanged(), ife.m135906o().f112985a.map(new w9j() { // from class: l.v1e
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Pair.create(Boolean.valueOf(ife.m135906o().m135908k(BannerLoc.get("moment"))), Boolean.valueOf(ife.m135906o().m135908k(BannerLoc.get(BannerLoc.moment_feed))));
            }
        }), new y9j() { // from class: l.w1e
            @Override // p149l.y9j
            /* JADX INFO: renamed from: a */
            public final Object mo94599a(Object obj, Object obj2, Object obj3) {
                return new xaj0((User) obj, (Integer) obj2, (Pair) obj3);
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.x1e
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f189060a.m36274f5((xaj0) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f5 */
    public final /* synthetic */ void m36274f5(xaj0 xaj0Var) {
        int iIntValue = ((Integer) xaj0Var.f191752b).intValue();
        this.f21348F.setText(t0g0.m186865f(iIntValue));
        VText vText = this.f21348F;
        if (iIntValue > 99) {
            vText.setPadding(t100.m186890d(4.0f), t100.m186890d(2.0f), t100.m186890d(4.0f), t100.m186890d(2.0f));
        } else {
            vText.setPadding(t100.m186890d(2.0f), t100.m186890d(2.0f), t100.m186890d(2.0f), t100.m186890d(2.0f));
        }
        xdl0.m208345M0(this.f21348F, iIntValue > 0);
        if (NullChecker.m81303a(act()) && (!q5e.m173001a() || App.f15373i.get().intValue() > 3)) {
            ((NewMainAct) act()).m39813e7(TabName.Moment, iIntValue);
        }
        User user = (User) xaj0Var.f191751a;
        if (NullChecker.m81303a(user)) {
            this.f21350H.setVisibility(0);
            qib0.f154691G.m102341Q0(this.f21351I, user.m60124fp().profileSmall());
        } else if (ife.m135906o().m135908k(BannerLoc.get(BannerLoc.moment_feed))) {
            this.f21350H.setVisibility(0);
            String strM135910m = ife.m135906o().m135910m(BannerLoc.get(BannerLoc.moment_feed));
            if (!TextUtils.isEmpty(strM135910m)) {
                qib0.f154691G.m102331L0(this.f21351I, strM135910m);
            }
        } else {
            qib0.f154691G.m184725o(this.f21351I);
            this.f21350H.setVisibility(4);
        }
        if (NullChecker.m81303a(act())) {
            if (!q5e.m173001a() || App.f15373i.get().intValue() > 3) {
                ((NewMainAct) act()).m39800Y6(TabName.Moment, user != null && iIntValue == 0);
            }
        }
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(Bundle bundle) {
        super.mo20586g4(bundle);
        xdl0.m208376g0(this.f21344B);
        this.f21346D.setOnClickListener(new View.OnClickListener() { // from class: l.t1e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f167314a.m36269g5(view);
            }
        });
    }

    @Override // com.p046p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m36271c5(layoutInflater, viewGroup);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag, p149l.n3m
    public String pageId() {
        return "p_explore_view";
    }
}
