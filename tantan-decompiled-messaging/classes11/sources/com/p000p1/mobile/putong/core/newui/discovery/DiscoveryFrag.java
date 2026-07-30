package com.p000p1.mobile.putong.core.newui.discovery;

import android.app.Activity;
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
import com.p000p1.mobile.putong.core.newui.main.NewMainContextFrag;
import com.p000p1.mobile.putong.newui.main.base.TabName;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.CoreMomentInfo;
import com.p1.mobile.putong.data.BannerLoc;
import com.p1.mobile.putong.data.Counter;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import l.b2e;
import l.e30;
import l.ife;
import l.kpd0;
import l.mkd0;
import l.qib0;
import l.t0g0;
import l.t100;
import l.w9j;
import l.xaj0;
import l.xdl0;
import l.y9j;
import p009l.q5e;
import p009l.q860;
import rx.c;
import v.VDraweeView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class DiscoveryFrag extends NewMainContextFrag {

    /* JADX INFO: renamed from: B */
    public FrameLayout f122B;

    /* JADX INFO: renamed from: C */
    public TextView f123C;

    /* JADX INFO: renamed from: D */
    public RelativeLayout f124D;

    /* JADX INFO: renamed from: E */
    public LinearLayout f125E;

    /* JADX INFO: renamed from: F */
    public VText f126F;

    /* JADX INFO: renamed from: G */
    public FrameLayout f127G;

    /* JADX INFO: renamed from: H */
    public FrameLayout f128H;

    /* JADX INFO: renamed from: I */
    public VDraweeView f129I;

    /* JADX INFO: renamed from: J */
    public ViewStub f130J;

    /* JADX INFO: renamed from: K */
    public kpd0 f131K = new kpd0("latestUnreadMomentInNewUi" + CoreModule.H().userId(), 0.0d);

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g5 */
    public /* synthetic */ void m183g5(View view) {
        m184h5(act());
    }

    /* JADX INFO: renamed from: h5 */
    public static void m184h5(Act act) {
        User userP9 = CoreModule.c.e0.p9();
        if (NullChecker.a(userP9)) {
            qib0.G.u0(userP9.fp().profileSmall());
        }
        act.startActivity(CoreModule.N().argsToMomentsFeedAct(act));
    }

    /* JADX INFO: renamed from: c5 */
    public View m185c5(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return b2e.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: d5 */
    public final c<User> m186d5() {
        return mkd0.s(CoreModule.N().coreMomentMoments(CoreMomentInfo.JSON_ADAPTER), Act.foreground().map(new w9j() { // from class: l.y1e
            public final Object call(Object obj) {
                Act.r rVar = (Act.r) obj;
                return Boolean.valueOf(rVar != null && CoreModule.N().isMomentsFeedAct((Activity) rVar.a.get()));
            }
        }).distinctUntilChanged(), this.f131K.obs(), new y9j() { // from class: l.z1e
            /* JADX INFO: renamed from: a */
            public final Object m25577a(Object obj, Object obj2, Object obj3) {
                return xaj0.a((q860) obj, (Boolean) obj2, (Double) obj3);
            }
        }).switchMap(new w9j() { // from class: l.a2e
            public final Object call(Object obj) {
                return this.f9187a.m187e5((xaj0) obj);
            }
        });
    }

    /* JADX INFO: renamed from: e5 */
    public final /* synthetic */ c m187e5(xaj0 xaj0Var) {
        CoreMomentInfo coreMomentInfo;
        q860 q860Var = (q860) xaj0Var.a;
        boolean zBooleanValue = ((Boolean) xaj0Var.b).booleanValue();
        Iterator it = q860Var.f19068a.iterator();
        do {
            if (it.hasNext()) {
                coreMomentInfo = (CoreMomentInfo) it.next();
                if (coreMomentInfo.createdTime <= ((Double) xaj0Var.c).doubleValue()) {
                }
            }
            coreMomentInfo = null;
            break;
        } while (coreMomentInfo.owner.equals(CoreModule.H().userId()));
        if (!NullChecker.a(coreMomentInfo)) {
            return c.just((Object) null);
        }
        if (!zBooleanValue) {
            return CoreModule.c.e0.Ka(coreMomentInfo.owner);
        }
        this.f131K.put(Double.valueOf(coreMomentInfo.createdTime));
        return c.just((Object) null);
    }

    /* JADX INFO: renamed from: f4 */
    public void m188f4() {
        super/*com.p1.mobile.putong.app.PutongFrag*/.f4();
        duringCreated(mkd0.s(m186d5(), CoreModule.c.n3().map(new w9j() { // from class: l.u1e
            public final Object call(Object obj) {
                return Integer.valueOf(((Counter) obj).activities.unread);
            }
        }).distinctUntilChanged(), ife.o().a.map(new w9j() { // from class: l.v1e
            public final Object call(Object obj) {
                return Pair.create(Boolean.valueOf(ife.o().k(BannerLoc.get("moment"))), Boolean.valueOf(ife.o().k(BannerLoc.get("moment_feed"))));
            }
        }), new y9j() { // from class: l.w1e
            /* JADX INFO: renamed from: a */
            public final Object m23769a(Object obj, Object obj2, Object obj3) {
                return new xaj0((User) obj, (Integer) obj2, (Pair) obj3);
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.x1e
            public final void call(Object obj) {
                this.f22397a.m189f5((xaj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: f5 */
    public final /* synthetic */ void m189f5(xaj0 xaj0Var) {
        int iIntValue = ((Integer) xaj0Var.b).intValue();
        this.f126F.setText(t0g0.f(iIntValue));
        VText vText = this.f126F;
        if (iIntValue > 99) {
            vText.setPadding(t100.d(4.0f), t100.d(2.0f), t100.d(4.0f), t100.d(2.0f));
        } else {
            vText.setPadding(t100.d(2.0f), t100.d(2.0f), t100.d(2.0f), t100.d(2.0f));
        }
        xdl0.M0(this.f126F, iIntValue > 0);
        if (NullChecker.a(act()) && (!q5e.m20808a() || ((Integer) App.i.get()).intValue() > 3)) {
            act().m3889e7(TabName.Moment, iIntValue);
        }
        User user = (User) xaj0Var.a;
        if (NullChecker.a(user)) {
            this.f128H.setVisibility(0);
            qib0.G.Q0(this.f129I, user.fp().profileSmall());
        } else if (ife.o().k(BannerLoc.get("moment_feed"))) {
            this.f128H.setVisibility(0);
            String strM = ife.o().m(BannerLoc.get("moment_feed"));
            if (!TextUtils.isEmpty(strM)) {
                qib0.G.L0(this.f129I, strM);
            }
        } else {
            qib0.G.o(this.f129I);
            this.f128H.setVisibility(4);
        }
        if (NullChecker.a(act())) {
            if (!q5e.m20808a() || ((Integer) App.i.get()).intValue() > 3) {
                act().m3876Y6(TabName.Moment, user != null && iIntValue == 0);
            }
        }
    }

    /* JADX INFO: renamed from: g4 */
    public void m190g4(Bundle bundle) {
        super/*com.p1.mobile.android.app.Frag*/.g4(bundle);
        xdl0.g0(new View[]{this.f122B});
        this.f124D.setOnClickListener(new View.OnClickListener() { // from class: l.t1e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20516a.m183g5(view);
            }
        });
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m185c5(layoutInflater, viewGroup);
    }

    public void onHiddenChanged(boolean z) {
        super/*com.p1.mobile.putong.app.PutongFrag*/.onHiddenChanged(z);
    }

    public String pageId() {
        return "p_explore_view";
    }
}
