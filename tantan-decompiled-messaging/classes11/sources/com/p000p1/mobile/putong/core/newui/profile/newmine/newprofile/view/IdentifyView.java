package com.p000p1.mobile.putong.core.newui.profile.newmine.newprofile.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.facebook.drawee.generic.RoundingParams;
import com.p000p1.mobile.putong.core.newui.main.NewMainAct;
import com.p000p1.mobile.putong.core.newui.profile.newmine.newprofile.view.IdentifyView;
import com.p000p1.mobile.putong.newui.main.base.TabName;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.c;
import com.p1.mobile.android.ui.label.CommonTextureFrameLayout;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.ExtraInfos;
import com.p1.mobile.putong.core.data.MyTabTask;
import com.p1.mobile.putong.core.ui.verification.VerificationCenterAct;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.Collection;
import java.util.List;
import l.e30;
import l.e51;
import l.eqh0;
import l.j760;
import l.jcm;
import l.mkd0;
import l.qib0;
import l.t100;
import l.upa;
import l.vwb;
import l.w9j;
import l.x2c0;
import l.xdl0;
import l.xjc0;
import l.yz9;
import l.zvf0;
import p009l.bs30;
import v.VDraweeView;
import v.VImage;
import v.VLinear;
import v.VOnlineIndicator;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class IdentifyView extends VLinear {

    /* JADX INFO: renamed from: c */
    public RelativeLayout f5465c;

    /* JADX INFO: renamed from: d */
    public CommonTextureFrameLayout f5466d;

    /* JADX INFO: renamed from: e */
    public VLinear f5467e;

    /* JADX INFO: renamed from: f */
    public VImage f5468f;

    /* JADX INFO: renamed from: g */
    public VText f5469g;

    /* JADX INFO: renamed from: h */
    public VImage f5470h;

    /* JADX INFO: renamed from: i */
    public VOnlineIndicator f5471i;

    /* JADX INFO: renamed from: j */
    public Act f5472j;

    /* JADX INFO: renamed from: k */
    public TipType f5473k;

    public enum TipType {
        INVITE,
        ONLY_CERT,
        SWIPE_LIMIT
    }

    public IdentifyView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m7694P(Throwable th) {
    }

    /* JADX INFO: renamed from: c0 */
    private void m7703c0(List<String> list, ViewGroup viewGroup, int i, int i2, int i3, int i4) {
        for (String str : list) {
            View vDraweeView = new VDraweeView(this.f5472j);
            RoundingParams roundingParams = new RoundingParams();
            roundingParams.v(true);
            vDraweeView.getHierarchy().H(roundingParams);
            if (i4 != 0) {
                ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                shapeDrawable.getPaint().setColor(i4);
                vDraweeView.setBackground(shapeDrawable);
                vDraweeView.setPadding(i3, i3, i3, i3);
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
            if (viewGroup.getChildCount() > 0) {
                layoutParams.leftMargin = -i2;
            }
            viewGroup.addView(vDraweeView, layoutParams);
            qib0.G.I0(vDraweeView, str, i, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public /* synthetic */ void m7704d0(View view) {
        m7712i0();
    }

    private String getTrackGuidanceStatus() {
        TipType tipType = this.f5473k;
        if (tipType == TipType.INVITE) {
            return "invite_verify";
        }
        if (tipType == TipType.ONLY_CERT) {
            return "trial_like";
        }
        if (tipType == TipType.SWIPE_LIMIT) {
            return "like_limit";
        }
        return CoreModule.c.e0.p9().isPicVerificationVerified() ? "verified" : "unverified_default";
    }

    /* JADX INFO: renamed from: Z */
    public final void m7705Z(View view) {
        jcm.a(this, view);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m7706a0() {
        zvf0.A("e_verification_entrance", "p_navigation_view", new j760[]{j760.a("red_dot", Boolean.valueOf(xdl0.O0(this.f5471i))), j760.a("verification_guidance_status", getTrackGuidanceStatus())});
    }

    /* JADX INFO: renamed from: b0 */
    public final void m7707b0(List<String> list, ViewGroup viewGroup, int i) {
        viewGroup.removeAllViews();
        m7703c0(list, viewGroup, t100.p, t100.d(7.0f), t100.c, (list.size() == 1 && list.get(0).startsWith("res")) ? 0 : i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m7708e0(j760 j760Var) {
        if (upa.p2()) {
            e51.H(getContext(), new Runnable() { // from class: l.icm
                @Override // java.lang.Runnable
                public final void run() {
                    this.f14488a.m7706a0();
                }
            }, 200L);
        }
        m7713j0();
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m7709f0(Object obj) {
        m7713j0();
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m7710g0(User user) {
        m7713j0();
    }

    /* JADX INFO: renamed from: h0 */
    public final void m7711h0() {
        for (int i = 0; i < upa.B3(); i++) {
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final void m7712i0() {
        zvf0.r("e_avatarVerification_main_entrance_click", "p_navigation_view");
        Act act = this.f5472j;
        act.startActivity(VerificationCenterAct.V1(act, "button", this.f5473k));
        if (upa.p2()) {
            CoreModule.c.e0.ua();
            if (this.f5473k != null && xdl0.O0(this.f5471i)) {
                TipType tipType = TipType.INVITE;
            }
            zvf0.u("e_verification_entrance", "p_navigation_view", new j760[]{j760.a("red_dot", Boolean.valueOf(xdl0.O0(this.f5471i))), j760.a("verification_guidance_status", getTrackGuidanceStatus())});
            m7715l0(false);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public void m7713j0() {
        this.f5473k = null;
        if ((upa.o2() || upa.p2()) && CoreModule.c.e0.p9().isPicVerificationVerified()) {
            this.f5469g.setText("认证权益生效中");
            xdl0.M(this.f5467e, false);
            xdl0.M(this.f5468f, true);
            return;
        }
        if (!upa.p2()) {
            this.f5469g.setText("认证中心");
            xdl0.M(this.f5467e, false);
            xdl0.M(this.f5468f, true);
            return;
        }
        if (upa.Z2() && !CoreModule.c.e0.p9().isSVIP()) {
            MyTabTask myTabTask = (MyTabTask) vwb.r((Collection) CoreModule.c.e0.i7.e(), new w9j() { // from class: l.hcm
                public final Object call(Object obj) {
                    return Boolean.valueOf("verification".equals(((MyTabTask) obj).type));
                }
            });
            if (NullChecker.a(myTabTask)) {
                ExtraInfos extraInfos = myTabTask.extraInfos;
                if (extraInfos.trialLikedCount > 0 && !vwb.J(extraInfos.trialLikedAvatars)) {
                    m7707b0(vwb.k0(myTabTask.extraInfos.trialLikedAvatars, 2), this.f5467e, Color.parseColor("#f7f7f7"));
                    this.f5469g.setText("\"只看认证\"待解锁");
                    xdl0.M(this.f5467e, true);
                    xdl0.M(this.f5468f, false);
                    this.f5473k = TipType.ONLY_CERT;
                    if (xjc0.c(xjc0.f) < 1) {
                        m7715l0(true);
                    }
                    m7711h0();
                    return;
                }
            }
        }
        if (!yz9.C() || CoreModule.c.e0.p9().isVIP()) {
            this.f5469g.setText("完成认证，解锁多项权益");
            xdl0.M(this.f5467e, false);
            xdl0.M(this.f5468f, true);
            return;
        }
        this.f5469g.setText("认证后提升每日右滑上限");
        xdl0.M(this.f5467e, false);
        xdl0.M(this.f5468f, true);
        this.f5473k = TipType.SWIPE_LIMIT;
        if (xjc0.c(xjc0.g) < 1) {
            m7715l0(true);
        }
        m7711h0();
    }

    /* JADX INFO: renamed from: k0 */
    public void m7714k0() {
        this.f5466d.setBackground(null);
        xdl0.C0(this.f5466d, t100.d(34.0f));
        VText vText = this.f5469g;
        int i = t100.e;
        xdl0.V(vText, i);
        xdl0.W(this.f5469g, i);
        this.f5466d.setPadding(0, 0, 0, 0);
        this.f5469g.setTextSize(12.0f);
        this.f5469g.setTextColor(-16777216);
        this.f5469g.setTypeface(eqh0.c(3), 0);
        this.f5468f.setImageResource(x2c0.Aq);
        xdl0.V(this.f5468f, t100.h);
        xdl0.W(this.f5470h, t100.i);
        this.f5470h.setImageResource(x2c0.zq);
        this.f5466d.f(x2c0.e7);
        this.f5466d.e(true, -8264961, t100.d(10.0f));
    }

    /* JADX INFO: renamed from: l0 */
    public void m7715l0(boolean z) {
        if (upa.p2()) {
            boolean z2 = z && xjc0.c(xjc0.e) < upa.I() && this.f5473k != null;
            xdl0.M(this.f5471i, z2);
            CoreModule.c.B0.i0.put(Boolean.valueOf(z2));
            this.f5472j.m3900n7();
        }
        if (this.f5473k == null) {
            xdl0.M(this.f5471i, z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m7705Z(this);
        this.f5472j = xdl0.E(this);
        xdl0.E0(this.f5466d, new View.OnClickListener() { // from class: l.acm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9400a.m7704d0(view);
            }
        });
        if (upa.L3()) {
            xdl0.C0(this.f5465c, t100.d(44.0f));
            if (!upa.p2()) {
                xdl0.C0(this.f5466d, t100.d(36.0f));
            }
        }
        NewMainAct newMainAct = this.f5472j;
        newMainAct.duringCreated(mkd0.r(newMainAct.m3895i7().distinctUntilChanged(), this.f5472j.lifecycle().distinctUntilChanged(), new bs30()).filter(new w9j() { // from class: l.bcm
            public final Object call(Object obj) {
                j760 j760Var = (j760) obj;
                return Boolean.valueOf(j760Var.b == c.i && TextUtils.equals(((TabName) j760Var.a).name(), TabName.Me.name()));
            }
        })).subscribe(mkd0.H(new e30() { // from class: l.ccm
            public final void call(Object obj) {
                this.f10527a.m7708e0((j760) obj);
            }
        }, new e30() { // from class: l.dcm
            public final void call(Object obj) {
                IdentifyView.m7694P((Throwable) obj);
            }
        }));
        boolean zP2 = upa.p2();
        Act act = this.f5472j;
        if (zP2) {
            act.duringCreated(CoreModule.c.B0.j4().distinctUntilChanged(), false).subscribe(mkd0.G(new e30() { // from class: l.ecm
                public final void call(Object obj) {
                    CoreModule.c.e0.A7();
                }
            }));
            this.f5472j.duringCreated(rx.c.merge(CoreModule.c.e0.i7.distinctUntilChanged(), CoreModule.c.z2.m3().distinctUntilChanged(), CoreModule.c.U0.distinctUntilChanged()), false).subscribe(mkd0.G(new e30() { // from class: l.fcm
                public final void call(Object obj) {
                    this.f12922a.m7709f0(obj);
                }
            }));
        } else {
            act.duringCreated(CoreModule.c.e0.o9().distinctUntilChanged(), false).subscribe(mkd0.G(new e30() { // from class: l.gcm
                public final void call(Object obj) {
                    this.f13439a.m7710g0((User) obj);
                }
            }));
        }
        m7713j0();
    }

    public IdentifyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IdentifyView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
