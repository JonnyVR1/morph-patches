package com.p051p1.mobile.putong.core.newui.discovery;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.CoreMomentInfo;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.newui.main.NewMainContextFrag;
import com.p051p1.mobile.putong.data.BannerLoc;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import p137rx.C22421c;
import p151v.VDraweeView;
import p151v.VText;
import p153l.a9g0;
import p153l.bkj0;
import p153l.bnl0;
import p153l.f7e;
import p153l.mge;
import p153l.mxd0;
import p153l.p3e;
import p153l.psd0;
import p153l.qa00;
import p153l.qcj;
import p153l.scj;
import p153l.uqb0;
import p153l.vg60;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class DiscoveryFrag extends NewMainContextFrag {

    /* JADX INFO: renamed from: B */
    public FrameLayout f22086B;

    /* JADX INFO: renamed from: C */
    public TextView f22087C;

    /* JADX INFO: renamed from: D */
    public RelativeLayout f22088D;

    /* JADX INFO: renamed from: E */
    public LinearLayout f22089E;

    /* JADX INFO: renamed from: F */
    public VText f22090F;

    /* JADX INFO: renamed from: G */
    public FrameLayout f22091G;

    /* JADX INFO: renamed from: H */
    public FrameLayout f22092H;

    /* JADX INFO: renamed from: I */
    public VDraweeView f22093I;

    /* JADX INFO: renamed from: J */
    public ViewStub f22094J;

    /* JADX INFO: renamed from: K */
    public mxd0 f22095K = new mxd0("latestUnreadMomentInNewUi" + CoreModule.m30929H().userId(), FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g5 */
    public /* synthetic */ void m37272g5(View view) {
        m37273h5(act());
    }

    /* JADX INFO: renamed from: h5 */
    public static void m37273h5(Act act) {
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (NullChecker.m82486a(userM116600p9)) {
            uqb0.f180374G.m127157u0(userM116600p9.m61308fp().profileSmall());
        }
        act.startActivity(CoreModule.m30932N().argsToMomentsFeedAct(act));
    }

    /* JADX INFO: renamed from: c5 */
    public View m37274c5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return p3e.m170490b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: d5 */
    public final C22421c<User> m37275d5() {
        return psd0.m173626s(CoreModule.m30932N().coreMomentMoments(CoreMomentInfo.JSON_ADAPTER), Act.foreground().map(new qcj() { // from class: l.m3e
            @Override // p153l.qcj
            public final Object call(Object obj) {
                Act.C4450r c4450r = (Act.C4450r) obj;
                return Boolean.valueOf(c4450r != null && CoreModule.m30932N().isMomentsFeedAct(c4450r.f16062a.get()));
            }
        }).distinctUntilChanged(), this.f22095K.obs(), new scj() { // from class: l.n3e
            @Override // p153l.scj
            /* JADX INFO: renamed from: a */
            public final Object mo95332a(Object obj, Object obj2, Object obj3) {
                return bkj0.m104818a((vg60) obj, (Boolean) obj2, (Double) obj3);
            }
        }).switchMap(new qcj() { // from class: l.o3e
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f144833a.m37276e5((bkj0) obj);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e5 */
    public final /* synthetic */ C22421c m37276e5(bkj0 bkj0Var) {
        CoreMomentInfo coreMomentInfo;
        vg60 vg60Var = (vg60) bkj0Var.f77081a;
        boolean zBooleanValue = ((Boolean) bkj0Var.f77082b).booleanValue();
        Iterator it = vg60Var.f184001a.iterator();
        do {
            if (it.hasNext()) {
                coreMomentInfo = (CoreMomentInfo) it.next();
                if (coreMomentInfo.createdTime <= ((Double) bkj0Var.f77083c).doubleValue()) {
                }
            }
            coreMomentInfo = null;
            break;
        } while (coreMomentInfo.owner.equals(CoreModule.m30929H().userId()));
        if (!NullChecker.m82486a(coreMomentInfo)) {
            return C22421c.just(null);
        }
        if (!zBooleanValue) {
            return CoreModule.f18264c.f20381e0.m116483Ka(coreMomentInfo.owner);
        }
        this.f22095K.put(Double.valueOf(coreMomentInfo.createdTime));
        return C22421c.just(null);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: f4 */
    public void mo21584f4() {
        super.mo21584f4();
        duringCreated(psd0.m173626s(m37275d5(), CoreModule.f18264c.m32486n3().map(new qcj() { // from class: l.i3e
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Integer.valueOf(((Counter) obj).activities.unread);
            }
        }).distinctUntilChanged(), mge.m158199o().f136705a.map(new qcj() { // from class: l.j3e
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Pair.create(Boolean.valueOf(mge.m158199o().m158201k(BannerLoc.get("moment"))), Boolean.valueOf(mge.m158199o().m158201k(BannerLoc.get(BannerLoc.moment_feed))));
            }
        }), new scj() { // from class: l.k3e
            @Override // p153l.scj
            /* JADX INFO: renamed from: a */
            public final Object mo95332a(Object obj, Object obj2, Object obj3) {
                return new bkj0((User) obj, (Integer) obj2, (Pair) obj3);
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.l3e
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f129870a.m37277f5((bkj0) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f5 */
    public final /* synthetic */ void m37277f5(bkj0 bkj0Var) {
        int iIntValue = ((Integer) bkj0Var.f77082b).intValue();
        this.f22090F.setText(a9g0.m96571f(iIntValue));
        VText vText = this.f22090F;
        if (iIntValue > 99) {
            vText.setPadding(qa00.m175859d(4.0f), qa00.m175859d(2.0f), qa00.m175859d(4.0f), qa00.m175859d(2.0f));
        } else {
            vText.setPadding(qa00.m175859d(2.0f), qa00.m175859d(2.0f), qa00.m175859d(2.0f), qa00.m175859d(2.0f));
        }
        bnl0.m105525M0(this.f22090F, iIntValue > 0);
        if (NullChecker.m82486a(act()) && (!f7e.m124437a() || App.f16092i.get().intValue() > 3)) {
            ((NewMainAct) act()).m40825k7(TabName.Moment, iIntValue);
        }
        User user = (User) bkj0Var.f77081a;
        if (NullChecker.m82486a(user)) {
            this.f22092H.setVisibility(0);
            uqb0.f180374G.m127125Q0(this.f22093I, user.m61308fp().profileSmall());
        } else if (mge.m158199o().m158201k(BannerLoc.get(BannerLoc.moment_feed))) {
            this.f22092H.setVisibility(0);
            String strM158203m = mge.m158199o().m158203m(BannerLoc.get(BannerLoc.moment_feed));
            if (!TextUtils.isEmpty(strM158203m)) {
                uqb0.f180374G.m127115L0(this.f22093I, strM158203m);
            }
        } else {
            uqb0.f180374G.m98798o(this.f22093I);
            this.f22092H.setVisibility(4);
        }
        if (NullChecker.m82486a(act())) {
            if (!f7e.m124437a() || App.f16092i.get().intValue() > 3) {
                ((NewMainAct) act()).m40813e7(TabName.Moment, user != null && iIntValue == 0);
            }
        }
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(Bundle bundle) {
        super.mo21585g4(bundle);
        bnl0.m105556g0(this.f22086B);
        this.f22088D.setOnClickListener(new View.OnClickListener() { // from class: l.h3e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f107638a.m37272g5(view);
            }
        });
    }

    @Override // com.p051p1.mobile.android.app.Frag
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m37274c5(layoutInflater, viewGroup);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag, p153l.e6m
    public String pageId() {
        return "p_explore_view";
    }
}
