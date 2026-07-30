package com.p046p1.mobile.putong.core.newui.profile.newmine.newprofile.view;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.android.p048ui.label.CommonTextureFrameLayout;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ExtraInfos;
import com.p046p1.mobile.putong.core.data.MyTabTask;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.core.newui.profile.newmine.newprofile.view.IdentifyView;
import com.p046p1.mobile.putong.core.p053ui.verification.VerificationCenterAct;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import java.util.List;
import p133rx.C22306c;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VOnlineIndicator;
import p147v.VText;
import p149l.bs30;
import p149l.djj;
import p149l.e30;
import p149l.e51;
import p149l.eqh0;
import p149l.j760;
import p149l.jcm;
import p149l.mkd0;
import p149l.qib0;
import p149l.t100;
import p149l.upa;
import p149l.vwb;
import p149l.w9j;
import p149l.x2c0;
import p149l.xdl0;
import p149l.xjc0;
import p149l.yz9;
import p149l.zvf0;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes11.dex */
public class IdentifyView extends VLinear {

    /* JADX INFO: renamed from: c */
    public RelativeLayout f26687c;

    /* JADX INFO: renamed from: d */
    public CommonTextureFrameLayout f26688d;

    /* JADX INFO: renamed from: e */
    public VLinear f26689e;

    /* JADX INFO: renamed from: f */
    public VImage f26690f;

    /* JADX INFO: renamed from: g */
    public VText f26691g;

    /* JADX INFO: renamed from: h */
    public VImage f26692h;

    /* JADX INFO: renamed from: i */
    public VOnlineIndicator f26693i;

    /* JADX INFO: renamed from: j */
    public Act f26694j;

    /* JADX INFO: renamed from: k */
    public TipType f26695k;

    public enum TipType {
        INVITE,
        ONLY_CERT,
        SWIPE_LIMIT
    }

    public IdentifyView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m43448P(Throwable th) {
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: c0 */
    private void m43457c0(List<String> list, ViewGroup viewGroup, int i, int i2, int i3, int i4) {
        for (String str : list) {
            VDraweeView vDraweeView = new VDraweeView(this.f26694j);
            RoundingParams roundingParams = new RoundingParams();
            roundingParams.m8268v(true);
            ((djj) vDraweeView.getHierarchy()).m112053H(roundingParams);
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
            qib0.f154691G.m102325I0(vDraweeView, str, i, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public /* synthetic */ void m43458d0(View view) {
        m43466i0();
    }

    private String getTrackGuidanceStatus() {
        TipType tipType = this.f26695k;
        if (tipType == TipType.INVITE) {
            return "invite_verify";
        }
        if (tipType == TipType.ONLY_CERT) {
            return "trial_like";
        }
        if (tipType == TipType.SWIPE_LIMIT) {
            return "like_limit";
        }
        return CoreModule.f17545c.f19639e0.m169527p9().isPicVerificationVerified() ? "verified" : "unverified_default";
    }

    /* JADX INFO: renamed from: Z */
    public final void m43459Z(View view) {
        jcm.m140981a(this, view);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m43460a0() {
        zvf0.m220368A("e_verification_entrance", OMSDialogPositon.p_navigation_view, j760.m140076a("red_dot", Boolean.valueOf(xdl0.m208349O0(this.f26693i))), j760.m140076a("verification_guidance_status", getTrackGuidanceStatus()));
    }

    /* JADX INFO: renamed from: b0 */
    public final void m43461b0(List<String> list, ViewGroup viewGroup, int i) {
        viewGroup.removeAllViews();
        m43457c0(list, viewGroup, t100.f167267p, t100.m186890d(7.0f), t100.f167254c, (list.size() == 1 && list.get(0).startsWith(ShareConstants.RES_PATH)) ? 0 : i);
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m43462e0(j760 j760Var) {
        if (upa.m194800p2()) {
            e51.m114743H(getContext(), new Runnable() { // from class: l.icm
                @Override // java.lang.Runnable
                public final void run() {
                    this.f112470a.m43460a0();
                }
            }, 200L);
        }
        m43467j0();
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m43463f0(Object obj) {
        m43467j0();
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m43464g0(User user) {
        m43467j0();
    }

    /* JADX INFO: renamed from: h0 */
    public final void m43465h0() {
        for (int i = 0; i < upa.m194615B3(); i++) {
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final void m43466i0() {
        zvf0.m220396r("e_avatarVerification_main_entrance_click", OMSDialogPositon.p_navigation_view);
        Act act = this.f26694j;
        act.startActivity(VerificationCenterAct.m55990V1(act, "button", this.f26695k));
        if (upa.m194800p2()) {
            CoreModule.f17545c.f19639e0.m169548ua();
            if (this.f26695k != null && xdl0.m208349O0(this.f26693i)) {
                TipType tipType = TipType.INVITE;
            }
            zvf0.m220399u("e_verification_entrance", OMSDialogPositon.p_navigation_view, j760.m140076a("red_dot", Boolean.valueOf(xdl0.m208349O0(this.f26693i))), j760.m140076a("verification_guidance_status", getTrackGuidanceStatus()));
            m43469l0(false);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public void m43467j0() {
        this.f26695k = null;
        if ((upa.m194795o2() || upa.m194800p2()) && CoreModule.f17545c.f19639e0.m169527p9().isPicVerificationVerified()) {
            this.f26691g.setText("认证权益生效中");
            xdl0.m208344M(this.f26689e, false);
            xdl0.m208344M(this.f26690f, true);
            return;
        }
        if (!upa.m194800p2()) {
            this.f26691g.setText("认证中心");
            xdl0.m208344M(this.f26689e, false);
            xdl0.m208344M(this.f26690f, true);
            return;
        }
        if (upa.m194723Z2() && !CoreModule.f17545c.f19639e0.m169527p9().isSVIP()) {
            MyTabTask myTabTask = (MyTabTask) vwb.m200346r(CoreModule.f17545c.f19639e0.f149396i7.m221515e(), new w9j() { // from class: l.hcm
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf("verification".equals(((MyTabTask) obj).type));
                }
            });
            if (NullChecker.m81303a(myTabTask)) {
                ExtraInfos extraInfos = myTabTask.extraInfos;
                if (extraInfos.trialLikedCount > 0 && !vwb.m200296J(extraInfos.trialLikedAvatars)) {
                    m43461b0(vwb.m200334k0(myTabTask.extraInfos.trialLikedAvatars, 2), this.f26689e, Color.parseColor("#f7f7f7"));
                    this.f26691g.setText("\"只看认证\"待解锁");
                    xdl0.m208344M(this.f26689e, true);
                    xdl0.m208344M(this.f26690f, false);
                    this.f26695k = TipType.ONLY_CERT;
                    if (xjc0.m209688c(xjc0.f193203f) < 1) {
                        m43469l0(true);
                    }
                    m43465h0();
                    return;
                }
            }
        }
        if (!yz9.m216606C() || CoreModule.f17545c.f19639e0.m169527p9().isVIP()) {
            this.f26691g.setText("完成认证，解锁多项权益");
            xdl0.m208344M(this.f26689e, false);
            xdl0.m208344M(this.f26690f, true);
            return;
        }
        this.f26691g.setText("认证后提升每日右滑上限");
        xdl0.m208344M(this.f26689e, false);
        xdl0.m208344M(this.f26690f, true);
        this.f26695k = TipType.SWIPE_LIMIT;
        if (xjc0.m209688c(xjc0.f193204g) < 1) {
            m43469l0(true);
        }
        m43465h0();
    }

    /* JADX INFO: renamed from: k0 */
    public void m43468k0() {
        this.f26688d.setBackground(null);
        xdl0.m208325C0(this.f26688d, t100.m186890d(34.0f));
        VText vText = this.f26691g;
        int i = t100.f167256e;
        xdl0.m208358V(vText, i);
        xdl0.m208359W(this.f26691g, i);
        this.f26688d.setPadding(0, 0, 0, 0);
        this.f26691g.setTextSize(12.0f);
        this.f26691g.setTextColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        this.f26691g.setTypeface(eqh0.m117752c(3), 0);
        this.f26690f.setImageResource(x2c0.f189180Aq);
        xdl0.m208358V(this.f26690f, t100.f167259h);
        xdl0.m208359W(this.f26692h, t100.f167260i);
        this.f26692h.setImageResource(x2c0.f190789zq);
        this.f26688d.m21094f(x2c0.f190100e7);
        this.f26688d.m21093e(true, -8264961, t100.m186890d(10.0f));
    }

    /* JADX INFO: renamed from: l0 */
    public void m43469l0(boolean z) {
        if (upa.m194800p2()) {
            boolean z2 = z && xjc0.m209688c(xjc0.f193202e) < upa.m194646I() && this.f26695k != null;
            xdl0.m208344M(this.f26693i, z2);
            CoreModule.f17545c.f19552B0.f19761i0.put(Boolean.valueOf(z2));
            ((NewMainAct) this.f26694j).m39824n7();
        }
        if (this.f26695k == null) {
            xdl0.m208344M(this.f26693i, z);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m43459Z(this);
        this.f26694j = (Act) xdl0.m208328E(this);
        xdl0.m208329E0(this.f26688d, new View.OnClickListener() { // from class: l.acm
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f68865a.m43458d0(view);
            }
        });
        if (upa.m194665L3()) {
            xdl0.m208325C0(this.f26687c, t100.m186890d(44.0f));
            if (!upa.m194800p2()) {
                xdl0.m208325C0(this.f26688d, t100.m186890d(36.0f));
            }
        }
        Act act = this.f26694j;
        act.duringCreated(mkd0.m154984r(((NewMainAct) act).m39819i7().distinctUntilChanged(), this.f26694j.lifecycle().distinctUntilChanged(), new bs30()).filter(new w9j() { // from class: l.bcm
            @Override // p149l.w9j
            public final Object call(Object obj) {
                j760 j760Var = (j760) obj;
                return Boolean.valueOf(j760Var.f116565b == C4319c.f15548i && TextUtils.equals(((TabName) j760Var.f116564a).name(), TabName.Me.name()));
            }
        })).subscribe(mkd0.m154956H(new e30() { // from class: l.ccm
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f80261a.m43462e0((j760) obj);
            }
        }, new e30() { // from class: l.dcm
            @Override // p149l.e30
            public final void call(Object obj) {
                IdentifyView.m43448P((Throwable) obj);
            }
        }));
        boolean zM194800p2 = upa.m194800p2();
        Act act2 = this.f26694j;
        if (zM194800p2) {
            act2.duringCreated((C22306c) CoreModule.f17545c.f19552B0.m31611j4().distinctUntilChanged(), false).subscribe(mkd0.m154955G(new e30() { // from class: l.ecm
                @Override // p149l.e30
                public final void call(Object obj) {
                    CoreModule.f17545c.f19639e0.m169367A7();
                }
            }));
            this.f26694j.duringCreated(C22306c.merge(CoreModule.f17545c.f19639e0.f149396i7.distinctUntilChanged(), CoreModule.f17545c.f19704z2.m30250m3().distinctUntilChanged(), CoreModule.f17545c.f19610U0.distinctUntilChanged()), false).subscribe(mkd0.m154955G(new e30() { // from class: l.fcm
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f96838a.m43463f0(obj);
                }
            }));
        } else {
            act2.duringCreated((C22306c) CoreModule.f17545c.f19639e0.m169523o9().distinctUntilChanged(), false).subscribe(mkd0.m154955G(new e30() { // from class: l.gcm
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f102040a.m43464g0((User) obj);
                }
            }));
        }
        m43467j0();
    }

    public IdentifyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IdentifyView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
