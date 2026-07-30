package com.p051p1.mobile.putong.core.newui.profile.newmine.newprofile.view;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.android.p053ui.label.CommonTextureFrameLayout;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ExtraInfos;
import com.p051p1.mobile.putong.core.data.MyTabTask;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.newui.profile.newmine.newprofile.view.IdentifyView;
import com.p051p1.mobile.putong.core.p058ui.verification.VerificationCenterAct;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import java.util.List;
import p137rx.C22421c;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VOnlineIndicator;
import p151v.VText;
import p153l.bnl0;
import p153l.dbc0;
import p153l.esc0;
import p153l.gra;
import p153l.i4g0;
import p153l.j1a;
import p153l.jyb;
import p153l.l51;
import p153l.lyh0;
import p153l.p040;
import p153l.pf60;
import p153l.psd0;
import p153l.qa00;
import p153l.qcj;
import p153l.uqb0;
import p153l.wlj;
import p153l.y20;
import p153l.zem;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes11.dex */
public class IdentifyView extends VLinear {

    /* JADX INFO: renamed from: c */
    public RelativeLayout f27535c;

    /* JADX INFO: renamed from: d */
    public CommonTextureFrameLayout f27536d;

    /* JADX INFO: renamed from: e */
    public VLinear f27537e;

    /* JADX INFO: renamed from: f */
    public VImage f27538f;

    /* JADX INFO: renamed from: g */
    public VText f27539g;

    /* JADX INFO: renamed from: h */
    public VImage f27540h;

    /* JADX INFO: renamed from: i */
    public VOnlineIndicator f27541i;

    /* JADX INFO: renamed from: j */
    public Act f27542j;

    /* JADX INFO: renamed from: k */
    public TipType f27543k;

    public enum TipType {
        INVITE,
        ONLY_CERT,
        SWIPE_LIMIT
    }

    public IdentifyView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m44634P(Throwable th) {
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
    private void m44643c0(List<String> list, ViewGroup viewGroup, int i, int i2, int i3, int i4) {
        for (String str : list) {
            VDraweeView vDraweeView = new VDraweeView(this.f27542j);
            RoundingParams roundingParams = new RoundingParams();
            roundingParams.m8322v(true);
            ((wlj) vDraweeView.getHierarchy()).m207045H(roundingParams);
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
            uqb0.f180374G.m127109I0(vDraweeView, str, i, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: d0 */
    public /* synthetic */ void m44644d0(View view) {
        m44652i0();
    }

    private String getTrackGuidanceStatus() {
        TipType tipType = this.f27543k;
        if (tipType == TipType.INVITE) {
            return "invite_verify";
        }
        if (tipType == TipType.ONLY_CERT) {
            return "trial_like";
        }
        if (tipType == TipType.SWIPE_LIMIT) {
            return "like_limit";
        }
        return CoreModule.f18264c.f20381e0.m116600p9().isPicVerificationVerified() ? "verified" : "unverified_default";
    }

    /* JADX INFO: renamed from: Z */
    public final void m44645Z(View view) {
        zem.m219500a(this, view);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m44646a0() {
        i4g0.m138492A("e_verification_entrance", OMSDialogPositon.p_navigation_view, pf60.m172085a("red_dot", Boolean.valueOf(bnl0.m105529O0(this.f27541i))), pf60.m172085a("verification_guidance_status", getTrackGuidanceStatus()));
    }

    /* JADX INFO: renamed from: b0 */
    public final void m44647b0(List<String> list, ViewGroup viewGroup, int i) {
        viewGroup.removeAllViews();
        m44643c0(list, viewGroup, qa00.f156329p, qa00.m175859d(7.0f), qa00.f156316c, (list.size() == 1 && list.get(0).startsWith(ShareConstants.RES_PATH)) ? 0 : i);
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m44648e0(pf60 pf60Var) {
        if (gra.m131731p2()) {
            l51.m152888H(getContext(), new Runnable() { // from class: l.yem
                @Override // java.lang.Runnable
                public final void run() {
                    this.f199380a.m44646a0();
                }
            }, 200L);
        }
        m44653j0();
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m44649f0(Object obj) {
        m44653j0();
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m44650g0(User user) {
        m44653j0();
    }

    /* JADX INFO: renamed from: h0 */
    public final void m44651h0() {
        for (int i = 0; i < gra.m131546B3(); i++) {
        }
    }

    /* JADX INFO: renamed from: i0 */
    public final void m44652i0() {
        i4g0.m138520r("e_avatarVerification_main_entrance_click", OMSDialogPositon.p_navigation_view);
        Act act = this.f27542j;
        act.startActivity(VerificationCenterAct.m57173X1(act, "button", this.f27543k));
        if (gra.m131731p2()) {
            CoreModule.f18264c.f20381e0.m116621ua();
            if (this.f27543k != null && bnl0.m105529O0(this.f27541i)) {
                TipType tipType = TipType.INVITE;
            }
            i4g0.m138523u("e_verification_entrance", OMSDialogPositon.p_navigation_view, pf60.m172085a("red_dot", Boolean.valueOf(bnl0.m105529O0(this.f27541i))), pf60.m172085a("verification_guidance_status", getTrackGuidanceStatus()));
            m44655l0(false);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public void m44653j0() {
        this.f27543k = null;
        if ((gra.m131726o2() || gra.m131731p2()) && CoreModule.f18264c.f20381e0.m116600p9().isPicVerificationVerified()) {
            this.f27539g.setText("认证权益生效中");
            bnl0.m105524M(this.f27537e, false);
            bnl0.m105524M(this.f27538f, true);
            return;
        }
        if (!gra.m131731p2()) {
            this.f27539g.setText("认证中心");
            bnl0.m105524M(this.f27537e, false);
            bnl0.m105524M(this.f27538f, true);
            return;
        }
        if (gra.m131654Z2() && !CoreModule.f18264c.f20381e0.m116600p9().isSVIP()) {
            MyTabTask myTabTask = (MyTabTask) jyb.m147529r(CoreModule.f18264c.f20381e0.f89253i7.m222761e(), new qcj() { // from class: l.xem
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf("verification".equals(((MyTabTask) obj).type));
                }
            });
            if (NullChecker.m82486a(myTabTask)) {
                ExtraInfos extraInfos = myTabTask.extraInfos;
                if (extraInfos.trialLikedCount > 0 && !jyb.m147479J(extraInfos.trialLikedAvatars)) {
                    m44647b0(jyb.m147517k0(myTabTask.extraInfos.trialLikedAvatars, 2), this.f27537e, Color.parseColor("#f7f7f7"));
                    this.f27539g.setText("\"只看认证\"待解锁");
                    bnl0.m105524M(this.f27537e, true);
                    bnl0.m105524M(this.f27538f, false);
                    this.f27543k = TipType.ONLY_CERT;
                    if (esc0.m122316c(esc0.f95590f) < 1) {
                        m44655l0(true);
                    }
                    m44651h0();
                    return;
                }
            }
        }
        if (!j1a.m143083C() || CoreModule.f18264c.f20381e0.m116600p9().isVIP()) {
            this.f27539g.setText("完成认证，解锁多项权益");
            bnl0.m105524M(this.f27537e, false);
            bnl0.m105524M(this.f27538f, true);
            return;
        }
        this.f27539g.setText("认证后提升每日右滑上限");
        bnl0.m105524M(this.f27537e, false);
        bnl0.m105524M(this.f27538f, true);
        this.f27543k = TipType.SWIPE_LIMIT;
        if (esc0.m122316c(esc0.f95591g) < 1) {
            m44655l0(true);
        }
        m44651h0();
    }

    /* JADX INFO: renamed from: k0 */
    public void m44654k0() {
        this.f27536d.setBackground(null);
        bnl0.m105505C0(this.f27536d, qa00.m175859d(34.0f));
        VText vText = this.f27539g;
        int i = qa00.f156318e;
        bnl0.m105538V(vText, i);
        bnl0.m105539W(this.f27539g, i);
        this.f27536d.setPadding(0, 0, 0, 0);
        this.f27539g.setTextSize(12.0f);
        this.f27539g.setTextColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        this.f27539g.setTypeface(lyh0.m156283c(3), 0);
        this.f27538f.setImageResource(dbc0.f87295or);
        bnl0.m105538V(this.f27538f, qa00.f156321h);
        bnl0.m105539W(this.f27540h, qa00.f156322i);
        this.f27540h.setImageResource(dbc0.f87262nr);
        this.f27536d.m22093f(dbc0.f86980f7);
        this.f27536d.m22092e(true, -8264961, qa00.m175859d(10.0f));
    }

    /* JADX INFO: renamed from: l0 */
    public void m44655l0(boolean z) {
        if (gra.m131731p2()) {
            boolean z2 = z && esc0.m122316c(esc0.f95589e) < gra.m131577I() && this.f27543k != null;
            bnl0.m105524M(this.f27541i, z2);
            CoreModule.f18264c.f20294B0.f20503i0.put(Boolean.valueOf(z2));
            ((NewMainAct) this.f27542j).m40836t7();
        }
        if (this.f27543k == null) {
            bnl0.m105524M(this.f27541i, z);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m44645Z(this);
        this.f27542j = (Act) bnl0.m105508E(this);
        bnl0.m105509E0(this.f27536d, new View.OnClickListener() { // from class: l.qem
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f157193a.m44644d0(view);
            }
        });
        if (gra.m131596L3()) {
            bnl0.m105505C0(this.f27535c, qa00.m175859d(44.0f));
            if (!gra.m131731p2()) {
                bnl0.m105505C0(this.f27536d, qa00.m175859d(36.0f));
            }
        }
        Act act = this.f27542j;
        act.duringCreated(psd0.m173625r(((NewMainAct) act).m40829o7().distinctUntilChanged(), this.f27542j.lifecycle().distinctUntilChanged(), new p040()).filter(new qcj() { // from class: l.rem
            @Override // p153l.qcj
            public final Object call(Object obj) {
                pf60 pf60Var = (pf60) obj;
                return Boolean.valueOf(pf60Var.f152157b == C4470c.f16267i && TextUtils.equals(((TabName) pf60Var.f152156a).name(), TabName.Me.name()));
            }
        })).subscribe(psd0.m173597H(new y20() { // from class: l.sem
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f167632a.m44648e0((pf60) obj);
            }
        }, new y20() { // from class: l.tem
            @Override // p153l.y20
            public final void call(Object obj) {
                IdentifyView.m44634P((Throwable) obj);
            }
        }));
        boolean zM131731p2 = gra.m131731p2();
        Act act2 = this.f27542j;
        if (zM131731p2) {
            act2.duringCreated((C22421c) CoreModule.f18264c.f20294B0.m32614j4().distinctUntilChanged(), false).subscribe(psd0.m173596G(new y20() { // from class: l.uem
                @Override // p153l.y20
                public final void call(Object obj) {
                    CoreModule.f18264c.f20381e0.m116440A7();
                }
            }));
            this.f27542j.duringCreated(C22421c.merge(CoreModule.f18264c.f20381e0.f89253i7.distinctUntilChanged(), CoreModule.f18264c.f20446z2.m31248m3().distinctUntilChanged(), CoreModule.f18264c.f20352U0.distinctUntilChanged()), false).subscribe(psd0.m173596G(new y20() { // from class: l.vem
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f183814a.m44649f0(obj);
                }
            }));
        } else {
            act2.duringCreated((C22421c) CoreModule.f18264c.f20381e0.m116596o9().distinctUntilChanged(), false).subscribe(psd0.m173596G(new y20() { // from class: l.wem
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f188715a.m44650g0((User) obj);
                }
            }));
        }
        m44653j0();
    }

    public IdentifyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public IdentifyView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
