package com.p051p1.mobile.putong.core.newui.messages;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.android.p053ui.bubble.C4496a;
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.WechatNotifySetting;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.newui.messages.ConversationsListHeadView;
import com.p051p1.mobile.putong.core.newui.messages.promotion.PrivilegePromotionHeaderView;
import com.p051p1.mobile.putong.core.newui.view.PicCertGuideView;
import com.p051p1.mobile.putong.core.newui.view.WeakenedTipsView;
import com.p051p1.mobile.putong.core.newui.view.WechatNotifyBannerView;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.SettingGroups;
import com.p051p1.mobile.putong.notifications.NotificationCheckerCommon;
import com.tantanapp.common.utils.NullChecker;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.c9c0;
import p153l.dbc0;
import p153l.gra;
import p153l.i4g0;
import p153l.iz40;
import p153l.jxd0;
import p153l.jyb;
import p153l.lr6;
import p153l.mr6;
import p153l.o1j0;
import p153l.p9r;
import p153l.psd0;
import p153l.pzi0;
import p153l.qa00;
import p153l.qcj;
import p153l.sfj0;
import p153l.tzi0;
import p153l.u46;
import p153l.uxj0;
import p153l.vnb;
import p153l.w250;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationsListHeadView extends VLinear {

    /* JADX INFO: renamed from: Q */
    public static jxd0 f25890Q = new jxd0("is_operated_filter" + CoreModule.m30929H().userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: R */
    public static String[] f25891R = {"全部", "未读", "在线", "群聊"};

    /* JADX INFO: renamed from: S */
    public static int[] f25892S = {0, 1, 2, 6};

    /* JADX INFO: renamed from: A */
    public RelativeLayout f25893A;

    /* JADX INFO: renamed from: B */
    public LinearLayout f25894B;

    /* JADX INFO: renamed from: C */
    public VText f25895C;

    /* JADX INFO: renamed from: D */
    public VImage f25896D;

    /* JADX INFO: renamed from: E */
    public ViewStub f25897E;

    /* JADX INFO: renamed from: F */
    public ViewStub f25898F;

    /* JADX INFO: renamed from: G */
    public ViewStub f25899G;

    /* JADX INFO: renamed from: H */
    public ViewStub f25900H;

    /* JADX INFO: renamed from: I */
    public ViewStub f25901I;

    /* JADX INFO: renamed from: J */
    public int f25902J;

    /* JADX INFO: renamed from: K */
    public PopupWindow f25903K;

    /* JADX INFO: renamed from: L */
    public View f25904L;

    /* JADX INFO: renamed from: M */
    public PicCertGuideView f25905M;

    /* JADX INFO: renamed from: N */
    public WechatNotifyBannerView f25906N;

    /* JADX INFO: renamed from: O */
    public WeakenedTipsView f25907O;

    /* JADX INFO: renamed from: P */
    public Runnable f25908P;

    /* JADX INFO: renamed from: c */
    public FrameLayout f25909c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f25910d;

    /* JADX INFO: renamed from: e */
    public VText f25911e;

    /* JADX INFO: renamed from: f */
    public VImage f25912f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f25913g;

    /* JADX INFO: renamed from: h */
    public VText f25914h;

    /* JADX INFO: renamed from: i */
    public VImage f25915i;

    /* JADX INFO: renamed from: j */
    public LinearLayout f25916j;

    /* JADX INFO: renamed from: k */
    public VText f25917k;

    /* JADX INFO: renamed from: l */
    public VImage f25918l;

    /* JADX INFO: renamed from: m */
    public View f25919m;

    /* JADX INFO: renamed from: n */
    public PrivilegePromotionHeaderView f25920n;

    /* JADX INFO: renamed from: o */
    public ConversationRealEcrGuideLayout f25921o;

    /* JADX INFO: renamed from: p */
    public ConversationHeadRecommendLayout f25922p;

    /* JADX INFO: renamed from: q */
    public ConversationCityCentreCardLayout f25923q;

    /* JADX INFO: renamed from: r */
    public FrameLayout f25924r;

    /* JADX INFO: renamed from: s */
    public View f25925s;

    /* JADX INFO: renamed from: t */
    public LinearLayout f25926t;

    /* JADX INFO: renamed from: u */
    public RelativeLayout f25927u;

    /* JADX INFO: renamed from: v */
    public VText f25928v;

    /* JADX INFO: renamed from: w */
    public View f25929w;

    /* JADX INFO: renamed from: x */
    public VImage f25930x;

    /* JADX INFO: renamed from: y */
    public VImage f25931y;

    /* JADX INFO: renamed from: z */
    public VImage f25932z;

    public enum TipType {
        NONE,
        NOTICE,
        INVALID_FILTER,
        PIC_CERT,
        WECHAT_NOTIFY,
        WEAKENED_TIPS
    }

    public ConversationsListHeadView(Context context) {
        super(context);
        this.f25902J = 0;
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m42542T(Throwable th) {
    }

    private String getMessageHeaderRes() {
        return getMessageTabRevisionEnable() ? "筛选" : getResources().getString(R$string.f19172d2);
    }

    private boolean getMessageTabRevisionEnable() {
        return gra.m131563F0() || gra.m131672d3();
    }

    @SuppressLint({"SetTextI18n"})
    private void setLayoutCheckByType(int i) {
        m42583x0();
        if (i == 0) {
            m42584y0(this.f25911e, this.f25912f);
        } else if (i == 9) {
            m42584y0(this.f25914h, this.f25915i);
        } else {
            if (i != 10) {
                return;
            }
            m42584y0(this.f25917k, this.f25918l);
        }
    }

    /* JADX INFO: renamed from: A0 */
    public final void m42551A0(boolean z, boolean z2) {
        if (z) {
            if (!f25890Q.get().booleanValue()) {
                f25890Q.put(Boolean.TRUE);
            }
            this.f25931y.setVisibility(8);
            this.f25930x.setImageResource(dbc0.f87368r1);
            return;
        }
        if (f25890Q.get().booleanValue()) {
            VImage vImage = this.f25931y;
            if (z2) {
                vImage.setVisibility(8);
            } else {
                vImage.setVisibility(0);
                this.f25931y.setImageResource(dbc0.f87245na);
            }
        } else {
            this.f25931y.setVisibility(0);
            this.f25931y.setImageResource(dbc0.f87212ma);
        }
        this.f25930x.setImageResource(dbc0.f87401s1);
    }

    /* JADX INFO: renamed from: B0 */
    public final void m42552B0(VText vText, VImage vImage) {
        vText.setTextColor(getResources().getColor(c9c0.f80342I));
        bnl0.m105525M0(vImage, true);
    }

    /* JADX INFO: renamed from: D0 */
    public final void m42553D0(VText vText, VImage vImage) {
        vText.setTextColor(getResources().getColor(c9c0.f80439n));
        bnl0.m105525M0(vImage, false);
    }

    /* JADX INFO: renamed from: E0 */
    public void m42554E0(int i) {
        ViewGroup.LayoutParams layoutParams = this.f25919m.getLayoutParams();
        layoutParams.height = i;
        this.f25919m.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: G0 */
    public void m42555G0(View view) {
        if (!NullChecker.m82486a(this.f25903K)) {
            this.f25903K = new PopupWindow(m42565f0());
        }
        if (this.f25903K.isShowing()) {
            return;
        }
        View viewM42564e0 = m42564e0(p9r.m171370a(m42565f0()), null);
        m42569j0();
        setLayoutCheckByType(this.f25902J);
        this.f25903K.setWidth(-2);
        this.f25903K.setHeight(-2);
        this.f25903K.setContentView(viewM42564e0);
        this.f25903K.setOutsideTouchable(true);
        this.f25903K.setTouchable(true);
        this.f25903K.setFocusable(true);
        viewM42564e0.setOnClickListener(new View.OnClickListener() { // from class: l.ir6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f116510a.m42574o0(view2);
            }
        });
        m42551A0(true, true);
        this.f25903K.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: l.jr6
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                this.f122308a.m42575p0();
            }
        });
        this.f25903K.setBackgroundDrawable(new ColorDrawable(0));
        this.f25903K.showAsDropDown(view, qa00.m175858c().widthPixels - qa00.m175859d(12.0f), -qa00.m175859d(getMessageTabRevisionEnable() ? 15.0f : 20.0f));
    }

    /* JADX INFO: renamed from: H0 */
    public void m42556H0() {
        if (this.f25904L == null) {
            this.f25904L = this.f25897E.inflate();
        }
        m42560L0(TipType.INVALID_FILTER);
    }

    /* JADX INFO: renamed from: I0 */
    public void m42557I0(String str) {
        C4496a c4496a = new C4496a(m42565f0());
        c4496a.m21846B(qa00.m175859d(2.0f)).m21870l(qa00.m175859d(9.0f)).m21873p(75).m21854J(13.0f).m21880w(qa00.m175859d(2.0f)).m21863e(true).m21857M(true).m21882y(true).m21860b(3000L).m21848D(str).m21881x(qa00.m175859d(3.0f)).m21874q(C4496a.f16402Q | C4496a.f16403R);
        C4499d.m21895l().m21907t(c4496a, this.f25930x);
        i4g0.m138526x("e_quickchat_relationship_timeout_tips", OMSDialogPositon.p_messages_view);
    }

    /* JADX INFO: renamed from: J0 */
    public void m42558J0() {
        String str = !tzi0.m193670h(pzi0.m174454o(), (long) CoreModule.f18264c.f20381e0.m116593na().createdTime, 7) ? "完成认证，将收获更多聊天" : "完成认证，被回复率提升3倍";
        if (this.f25905M == null) {
            this.f25905M = (PicCertGuideView) this.f25899G.inflate();
            CoreModule.f18264c.f20381e0.f89154W3.m203841a(1);
            CoreModule.f18264c.f20381e0.f89146V3.put(Long.valueOf(pzi0.m174454o() + 86400000));
        }
        this.f25905M.m44922k0(m42565f0(), str, "去认证", "e_messages_view_verification", OMSDialogPositon.p_messages_view, null, null);
        m42560L0(TipType.PIC_CERT);
        this.f25905M.m44923l0();
    }

    /* JADX INFO: renamed from: K0 */
    public void m42559K0() {
        CoreModule.f18264c.f20381e0.f89286n0.put(Long.valueOf(pzi0.m174454o()));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("当前无法接收新消息通知，点击立即开启");
        spannableStringBuilder.setSpan(new ForegroundColorSpan(m42565f0().getResources().getColor(c9c0.f80342I)), 14, "当前无法接收新消息通知，点击立即开启".length(), 33);
        bnl0.m105509E0(this.f25893A, new View.OnClickListener() { // from class: l.yq6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f201153a.m42577r0(view);
            }
        });
        if (gra.m131778z()) {
            this.f25896D.setImageResource(dbc0.f87449tg);
        }
        bnl0.m105509E0(this.f25896D, new View.OnClickListener() { // from class: l.cr6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f83301a.m42578s0(view);
            }
        });
        this.f25895C.setText(spannableStringBuilder);
        m42560L0(TipType.NOTICE);
        i4g0.m138526x("e_open_click", OMSDialogPositon.p_messages_view);
        m42565f0().lifecycle().filter(new qcj() { // from class: l.dr6
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj) == C4470c.f16267i);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.er6
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f95449a.m42579t0((C4470c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: L0 */
    public void m42560L0(TipType tipType) {
        vnb.m201946M(this.f25893A, false);
        vnb.m201946M(this.f25904L, false);
        vnb.m201946M(this.f25905M, false);
        vnb.m201946M(this.f25906N, false);
        vnb.m201946M(this.f25907O, false);
        if (tipType == TipType.WECHAT_NOTIFY) {
            vnb.m201946M(this.f25906N, true);
            return;
        }
        if (tipType == TipType.PIC_CERT) {
            vnb.m201946M(this.f25905M, true);
            return;
        }
        if (tipType == TipType.NOTICE) {
            vnb.m201946M(this.f25893A, true);
        } else if (tipType == TipType.INVALID_FILTER) {
            vnb.m201946M(this.f25904L, true);
        } else if (tipType == TipType.WEAKENED_TIPS) {
            vnb.m201946M(this.f25907O, true);
        }
    }

    /* JADX INFO: renamed from: M0 */
    public void m42561M0(u46 u46Var, int i) {
        if (this.f25907O == null) {
            this.f25907O = (WeakenedTipsView) this.f25901I.inflate();
            CoreModule.f18264c.f20381e0.f89017D5.put(Long.valueOf(pzi0.m174454o()));
        }
        this.f25907O.m44991s0(u46Var, i);
        m42560L0(TipType.WEAKENED_TIPS);
        i4g0.m138492A("e_old_messagesweaken_tips", OMSDialogPositon.p_messages_view, jyb.m147494Y("tips_show_position", "up"));
    }

    /* JADX INFO: renamed from: N0 */
    public void m42562N0(WechatNotifySetting wechatNotifySetting) {
        if (this.f25906N == null) {
            this.f25906N = (WechatNotifyBannerView) this.f25900H.inflate();
            if (!pzi0.m174439D(CoreModule.f18264c.f20381e0.f89259j5.get().longValue())) {
                CoreModule.f18264c.f20381e0.f89251i5.put(0);
                CoreModule.f18264c.f20381e0.f89267k5.m203841a(1);
            }
            CoreModule.f18264c.f20381e0.f89251i5.m203841a(1);
            CoreModule.f18264c.f20381e0.f89259j5.put(Long.valueOf(pzi0.m174454o()));
        }
        this.f25906N.m44995d(wechatNotifySetting, new x20() { // from class: l.br6
            @Override // p153l.x20
            public final void call() {
                this.f77981a.m42580u0();
            }
        });
        m42560L0(TipType.WECHAT_NOTIFY);
    }

    /* JADX INFO: renamed from: d0 */
    public final void m42563d0(View view) {
        mr6.m159621a(this, view);
    }

    /* JADX INFO: renamed from: e0 */
    public View m42564e0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return lr6.m155581b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: f0 */
    public PutongAct m42565f0() {
        return (PutongAct) getContext();
    }

    /* JADX INFO: renamed from: g0 */
    public String m42566g0(int i) {
        if (i == 0) {
            return getMessageHeaderRes();
        }
        if (i == 1) {
            return getMessageHeaderRes() + " · " + m42565f0().getResources().getString(R$string.f19110b2);
        }
        if (i == 6) {
            return getMessageHeaderRes() + " · " + m42565f0().getResources().getString(R$string.f19664t1);
        }
        if (i == 2) {
            return getMessageHeaderRes() + " · " + m42565f0().getResources().getString(R$string.f19141c2);
        }
        if (i == 3) {
            return getMessageHeaderRes() + " · " + m42565f0().getResources().getString(R$string.f19079a2);
        }
        if (i == 4) {
            return getMessageHeaderRes() + " · " + m42565f0().getResources().getString(R$string.f19790x3);
        }
        if (i == 7) {
            return getMessageHeaderRes() + " · " + m42565f0().getResources().getString(R$string.f18720O3);
        }
        if (i == 8) {
            return getMessageHeaderRes() + " · " + m42565f0().getResources().getString(R$string.f18510H7);
        }
        if (i != 11) {
            return "";
        }
        return getMessageHeaderRes() + " · 异常会话";
    }

    public ConversationHeadRecommendLayout getConversationHeadRecommendLayout() {
        return this.f25922p;
    }

    public int getCurrentSortType() {
        return this.f25902J;
    }

    /* JADX INFO: renamed from: h0 */
    public void m42567h0() {
        bnl0.m105524M(this.f25893A, false);
    }

    /* JADX INFO: renamed from: i0 */
    public void m42568i0(boolean z) {
        bnl0.m105524M(this.f25926t, !z);
    }

    public void init() {
        ((LinearLayout.LayoutParams) this.f25926t.getLayoutParams()).setMargins(0, qa00.m175859d(10.0f), 0, 0);
        bnl0.m105524M(this.f25927u, true);
        this.f25928v.setTextSize(2, 15.0f);
        this.f25928v.setTypeface(Typeface.DEFAULT_BOLD);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f25927u.getLayoutParams();
        layoutParams.setMargins(0, 0, 0, 0);
        this.f25927u.setLayoutParams(layoutParams);
        this.f25928v.setText(getMessageHeaderRes());
        m42551A0(false, this.f25902J == 0);
        bnl0.m105509E0(this.f25930x, new View.OnClickListener() { // from class: l.fr6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f100399a.m42571l0(view);
            }
        });
        m42565f0().duringCreated(getConversationHeadRecommendLayout().getVisibleObs()).distinctUntilChanged().subscribe(psd0.m173597H(new y20() { // from class: l.gr6
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f106007a.m42572m0((Boolean) obj);
            }
        }, new y20() { // from class: l.hr6
            @Override // p153l.y20
            public final void call(Object obj) {
                ConversationsListHeadView.m42542T((Throwable) obj);
            }
        }));
        if (gra.m131555D2() && !w250.m204531a().m204536f(m42565f0(), false) && !iz40.m142786w() && !m42570k0() && w250.m204531a().m204533c()) {
            m42559K0();
        }
        if (getMessageTabRevisionEnable()) {
            bnl0.m105524M(this.f25930x, false);
            bnl0.m105524M(this.f25927u, false);
            bnl0.m105505C0(this.f25928v, qa00.m175859d(36.0f));
        }
        if (gra.m131672d3() || gra.m131568G0()) {
            bnl0.m105524M(this.f25925s, true);
        } else {
            bnl0.m105524M(this.f25925s, false);
        }
        if (gra.m131683g() && (m42565f0() instanceof NewMainAct)) {
            this.f25921o.m42263W(m42565f0());
        } else {
            bnl0.m105524M(this.f25921o, false);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final void m42569j0() {
        m42585z0(this.f25910d, 0, "e_intl_messages_filter_default");
        m42585z0(this.f25913g, 9, "e_intl_messages_filter_chat");
        m42585z0(this.f25916j, 10, "e_intl_messages_filter_matches");
    }

    /* JADX INFO: renamed from: k0 */
    public boolean m42570k0() {
        return bnl0.m105529O0(this.f25893A);
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m42571l0(View view) {
        m42555G0(this.f25930x);
        sfj0.m185596c("e_intl_messages_filter", OMSDialogPositon.p_messages_view, new sfj0.C20032a[0]);
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m42572m0(Boolean bool) {
        bnl0.m105524M(this.f25929w, bool.booleanValue());
        bnl0.m105524M(this.f25928v, bool.booleanValue());
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m42573n0(String str, int i, View view) {
        sfj0.m185596c(str, OMSDialogPositon.p_messages_view, new sfj0.C20032a[0]);
        if (this.f25902J != i) {
            this.f25902J = i;
            CoreModule.f18264c.f20384f0.f20708p2.onNext(uxj0.f181467a);
        }
        this.f25903K.dismiss();
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m42574o0(View view) {
        this.f25903K.dismiss();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m42563d0(this);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m42575p0() {
        m42551A0(false, this.f25902J == 0);
        setLayoutCheckByType(this.f25902J);
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m42576q0(SettingGroups settingGroups) {
        o1j0.m165651y("已开启消息通知");
        m42567h0();
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m42577r0(View view) {
        i4g0.m138520r("e_open_click", OMSDialogPositon.p_messages_view);
        if (NotificationCheckerCommon.m80403a() != NotificationCheckerCommon.State.closed && !CoreModule.f18264c.f20381e0.m116600p9().getUserPushAllEnable()) {
            m42565f0().duringCreated(CoreModule.f18264c.f20381e0.m116482K9("allPushEnable", true, 0, 0)).subscribe(psd0.m173597H(new y20() { // from class: l.kr6
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f128423a.m42576q0((SettingGroups) obj);
                }
            }, new y20() { // from class: l.zq6
                @Override // p153l.y20
                public final void call(Object obj) {
                    bsj0.m106246D((Throwable) obj);
                }
            }));
        } else {
            iz40.m142756A();
            m42565f0().duringCreated(CoreModule.f18264c.f20381e0.m116482K9("allPushEnable", true, 0, 0)).subscribe(psd0.m173601L(psd0.m173591B()));
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m42578s0(View view) {
        i4g0.m138520r("e_close_click", OMSDialogPositon.p_messages_view);
        m42567h0();
        w250.m204531a().m204537g();
    }

    public void setFilterPopShow(Runnable runnable) {
        this.f25908P = runnable;
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m42579t0(C4470c c4470c) {
        if (NotificationCheckerCommon.m80403a() == NotificationCheckerCommon.State.closed || !CoreModule.f18264c.f20381e0.m116600p9().getUserPushAllEnable()) {
            return;
        }
        m42567h0();
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m42580u0() {
        CoreModule.f18264c.f20381e0.f89313q5.put(Long.valueOf(pzi0.m174454o()));
        m42560L0(TipType.NONE);
    }

    /* JADX INFO: renamed from: v0 */
    public void m42581v0() {
        if (NullChecker.m82486a(this.f25905M) && bnl0.m105529O0(this.f25905M)) {
            this.f25905M.m44923l0();
        } else if (NullChecker.m82486a(this.f25906N) && bnl0.m105529O0(this.f25906N)) {
            this.f25906N.m44996e();
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final void m42582w0(VText vText, VImage vImage) {
        m42553D0(vText, vImage);
        vText.setTypeface(Typeface.defaultFromStyle(0));
    }

    /* JADX INFO: renamed from: x0 */
    public final void m42583x0() {
        m42582w0(this.f25911e, this.f25912f);
        m42582w0(this.f25914h, this.f25915i);
        m42582w0(this.f25917k, this.f25918l);
    }

    /* JADX INFO: renamed from: y0 */
    public final void m42584y0(VText vText, VImage vImage) {
        m42552B0(vText, vImage);
        vText.setTypeface(Typeface.defaultFromStyle(1));
    }

    /* JADX INFO: renamed from: z0 */
    public final void m42585z0(LinearLayout linearLayout, final int i, final String str) {
        bnl0.m105509E0(linearLayout, new View.OnClickListener() { // from class: l.ar6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f72913a.m42573n0(str, i, view);
            }
        });
    }

    public ConversationsListHeadView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f25902J = 0;
    }

    public ConversationsListHeadView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f25902J = 0;
    }
}
