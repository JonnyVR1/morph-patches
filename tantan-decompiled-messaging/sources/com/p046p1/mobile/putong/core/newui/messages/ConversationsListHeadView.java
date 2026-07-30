package com.p046p1.mobile.putong.core.newui.messages;

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
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.android.p048ui.bubble.C4345a;
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.WechatNotifySetting;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.core.newui.messages.ConversationsListHeadView;
import com.p046p1.mobile.putong.core.newui.messages.promotion.PrivilegePromotionHeaderView;
import com.p046p1.mobile.putong.core.newui.view.PicCertGuideView;
import com.p046p1.mobile.putong.core.newui.view.WeakenedTipsView;
import com.p046p1.mobile.putong.core.newui.view.WechatNotifyBannerView;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.SettingGroups;
import com.p046p1.mobile.putong.notifications.NotificationCheckerCommon;
import com.tantanapp.common.utils.NullChecker;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.d30;
import p149l.e30;
import p149l.hmb;
import p149l.hpd0;
import p149l.hu40;
import p149l.iq6;
import p149l.jq6;
import p149l.lsi0;
import p149l.mkd0;
import p149l.mqi0;
import p149l.o6j0;
import p149l.o7r;
import p149l.p36;
import p149l.qqi0;
import p149l.roj0;
import p149l.t100;
import p149l.upa;
import p149l.uq40;
import p149l.vwb;
import p149l.w0c0;
import p149l.w9j;
import p149l.x2c0;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationsListHeadView extends VLinear {

    /* JADX INFO: renamed from: Q */
    public static hpd0 f25148Q = new hpd0("is_operated_filter" + CoreModule.m29931H().userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: R */
    public static String[] f25149R = {"全部", "未读", "在线", "群聊"};

    /* JADX INFO: renamed from: S */
    public static int[] f25150S = {0, 1, 2, 6};

    /* JADX INFO: renamed from: A */
    public RelativeLayout f25151A;

    /* JADX INFO: renamed from: B */
    public LinearLayout f25152B;

    /* JADX INFO: renamed from: C */
    public VText f25153C;

    /* JADX INFO: renamed from: D */
    public VImage f25154D;

    /* JADX INFO: renamed from: E */
    public ViewStub f25155E;

    /* JADX INFO: renamed from: F */
    public ViewStub f25156F;

    /* JADX INFO: renamed from: G */
    public ViewStub f25157G;

    /* JADX INFO: renamed from: H */
    public ViewStub f25158H;

    /* JADX INFO: renamed from: I */
    public ViewStub f25159I;

    /* JADX INFO: renamed from: J */
    public int f25160J;

    /* JADX INFO: renamed from: K */
    public PopupWindow f25161K;

    /* JADX INFO: renamed from: L */
    public View f25162L;

    /* JADX INFO: renamed from: M */
    public PicCertGuideView f25163M;

    /* JADX INFO: renamed from: N */
    public WechatNotifyBannerView f25164N;

    /* JADX INFO: renamed from: O */
    public WeakenedTipsView f25165O;

    /* JADX INFO: renamed from: P */
    public Runnable f25166P;

    /* JADX INFO: renamed from: c */
    public FrameLayout f25167c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f25168d;

    /* JADX INFO: renamed from: e */
    public VText f25169e;

    /* JADX INFO: renamed from: f */
    public VImage f25170f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f25171g;

    /* JADX INFO: renamed from: h */
    public VText f25172h;

    /* JADX INFO: renamed from: i */
    public VImage f25173i;

    /* JADX INFO: renamed from: j */
    public LinearLayout f25174j;

    /* JADX INFO: renamed from: k */
    public VText f25175k;

    /* JADX INFO: renamed from: l */
    public VImage f25176l;

    /* JADX INFO: renamed from: m */
    public View f25177m;

    /* JADX INFO: renamed from: n */
    public PrivilegePromotionHeaderView f25178n;

    /* JADX INFO: renamed from: o */
    public ConversationRealEcrGuideLayout f25179o;

    /* JADX INFO: renamed from: p */
    public ConversationHeadRecommendLayout f25180p;

    /* JADX INFO: renamed from: q */
    public ConversationCityCentreCardLayout f25181q;

    /* JADX INFO: renamed from: r */
    public FrameLayout f25182r;

    /* JADX INFO: renamed from: s */
    public View f25183s;

    /* JADX INFO: renamed from: t */
    public LinearLayout f25184t;

    /* JADX INFO: renamed from: u */
    public RelativeLayout f25185u;

    /* JADX INFO: renamed from: v */
    public VText f25186v;

    /* JADX INFO: renamed from: w */
    public View f25187w;

    /* JADX INFO: renamed from: x */
    public VImage f25188x;

    /* JADX INFO: renamed from: y */
    public VImage f25189y;

    /* JADX INFO: renamed from: z */
    public VImage f25190z;

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
        this.f25160J = 0;
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m41531T(Throwable th) {
    }

    private String getMessageHeaderRes() {
        return getMessageTabRevisionEnable() ? "筛选" : getResources().getString(R$string.f18442d2);
    }

    private boolean getMessageTabRevisionEnable() {
        return upa.m194632F0() || upa.m194741d3();
    }

    @SuppressLint({"SetTextI18n"})
    private void setLayoutCheckByType(int i) {
        m41572x0();
        if (i == 0) {
            m41573y0(this.f25169e, this.f25170f);
        } else if (i == 9) {
            m41573y0(this.f25172h, this.f25173i);
        } else {
            if (i != 10) {
                return;
            }
            m41573y0(this.f25175k, this.f25176l);
        }
    }

    /* JADX INFO: renamed from: A0 */
    public final void m41540A0(boolean z, boolean z2) {
        if (z) {
            if (!f25148Q.get().booleanValue()) {
                f25148Q.put(Boolean.TRUE);
            }
            this.f25189y.setVisibility(8);
            this.f25188x.setImageResource(x2c0.f190476q1);
            return;
        }
        if (f25148Q.get().booleanValue()) {
            VImage vImage = this.f25189y;
            if (z2) {
                vImage.setVisibility(8);
            } else {
                vImage.setVisibility(0);
                this.f25189y.setImageResource(x2c0.f190357ma);
            }
        } else {
            this.f25189y.setVisibility(0);
            this.f25189y.setImageResource(x2c0.f190325la);
        }
        this.f25188x.setImageResource(x2c0.f190508r1);
    }

    /* JADX INFO: renamed from: B0 */
    public final void m41541B0(VText vText, VImage vImage) {
        vText.setTextColor(getResources().getColor(w0c0.f183773I));
        xdl0.m208345M0(vImage, true);
    }

    /* JADX INFO: renamed from: D0 */
    public final void m41542D0(VText vText, VImage vImage) {
        vText.setTextColor(getResources().getColor(w0c0.f183869n));
        xdl0.m208345M0(vImage, false);
    }

    /* JADX INFO: renamed from: E0 */
    public void m41543E0(int i) {
        ViewGroup.LayoutParams layoutParams = this.f25177m.getLayoutParams();
        layoutParams.height = i;
        this.f25177m.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: G0 */
    public void m41544G0(View view) {
        if (!NullChecker.m81303a(this.f25161K)) {
            this.f25161K = new PopupWindow(m41554f0());
        }
        if (this.f25161K.isShowing()) {
            return;
        }
        View viewM41553e0 = m41553e0(o7r.m163037a(m41554f0()), null);
        m41558j0();
        setLayoutCheckByType(this.f25160J);
        this.f25161K.setWidth(-2);
        this.f25161K.setHeight(-2);
        this.f25161K.setContentView(viewM41553e0);
        this.f25161K.setOutsideTouchable(true);
        this.f25161K.setTouchable(true);
        this.f25161K.setFocusable(true);
        viewM41553e0.setOnClickListener(new View.OnClickListener() { // from class: l.fq6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f98765a.m41563o0(view2);
            }
        });
        m41540A0(true, true);
        this.f25161K.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: l.gq6
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                this.f103886a.m41564p0();
            }
        });
        this.f25161K.setBackgroundDrawable(new ColorDrawable(0));
        this.f25161K.showAsDropDown(view, t100.m186889c().widthPixels - t100.m186890d(12.0f), -t100.m186890d(getMessageTabRevisionEnable() ? 15.0f : 20.0f));
    }

    /* JADX INFO: renamed from: H0 */
    public void m41545H0() {
        if (this.f25162L == null) {
            this.f25162L = this.f25155E.inflate();
        }
        m41549L0(TipType.INVALID_FILTER);
    }

    /* JADX INFO: renamed from: I0 */
    public void m41546I0(String str) {
        C4345a c4345a = new C4345a(m41554f0());
        c4345a.m20847B(t100.m186890d(2.0f)).m20871l(t100.m186890d(9.0f)).m20874p(75).m20855J(13.0f).m20881w(t100.m186890d(2.0f)).m20864e(true).m20858M(true).m20883y(true).m20861b(3000L).m20849D(str).m20882x(t100.m186890d(3.0f)).m20875q(C4345a.f15683Q | C4345a.f15684R);
        C4348d.m20896l().m20908t(c4345a, this.f25188x);
        zvf0.m220402x("e_quickchat_relationship_timeout_tips", OMSDialogPositon.p_messages_view);
    }

    /* JADX INFO: renamed from: J0 */
    public void m41547J0() {
        String str = !qqi0.m175940h(mqi0.m155944o(), (long) CoreModule.f17545c.f19639e0.m169520na().createdTime, 7) ? "完成认证，将收获更多聊天" : "完成认证，被回复率提升3倍";
        if (this.f25163M == null) {
            this.f25163M = (PicCertGuideView) this.f25157G.inflate();
            CoreModule.f17545c.f19639e0.f149297W3.m189988a(1);
            CoreModule.f17545c.f19639e0.f149289V3.put(Long.valueOf(mqi0.m155944o() + 86400000));
        }
        this.f25163M.m43736k0(m41554f0(), str, "去认证", "e_messages_view_verification", OMSDialogPositon.p_messages_view, null, null);
        m41549L0(TipType.PIC_CERT);
        this.f25163M.m43737l0();
    }

    /* JADX INFO: renamed from: K0 */
    public void m41548K0() {
        CoreModule.f17545c.f19639e0.f149429n0.put(Long.valueOf(mqi0.m155944o()));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("当前无法接收新消息通知，点击立即开启");
        spannableStringBuilder.setSpan(new ForegroundColorSpan(m41554f0().getResources().getColor(w0c0.f183773I)), 14, "当前无法接收新消息通知，点击立即开启".length(), 33);
        xdl0.m208329E0(this.f25151A, new View.OnClickListener() { // from class: l.vp6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f182454a.m41566r0(view);
            }
        });
        if (upa.m194847z()) {
            this.f25154D.setImageResource(x2c0.f189329Ff);
        }
        xdl0.m208329E0(this.f25154D, new View.OnClickListener() { // from class: l.zp6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f204180a.m41567s0(view);
            }
        });
        this.f25153C.setText(spannableStringBuilder);
        m41549L0(TipType.NOTICE);
        zvf0.m220402x("e_open_click", OMSDialogPositon.p_messages_view);
        m41554f0().lifecycle().filter(new w9j() { // from class: l.aq6
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj) == C4319c.f15548i);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.bq6
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f76755a.m41568t0((C4319c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: L0 */
    public void m41549L0(TipType tipType) {
        hmb.m131701M(this.f25151A, false);
        hmb.m131701M(this.f25162L, false);
        hmb.m131701M(this.f25163M, false);
        hmb.m131701M(this.f25164N, false);
        hmb.m131701M(this.f25165O, false);
        if (tipType == TipType.WECHAT_NOTIFY) {
            hmb.m131701M(this.f25164N, true);
            return;
        }
        if (tipType == TipType.PIC_CERT) {
            hmb.m131701M(this.f25163M, true);
            return;
        }
        if (tipType == TipType.NOTICE) {
            hmb.m131701M(this.f25151A, true);
        } else if (tipType == TipType.INVALID_FILTER) {
            hmb.m131701M(this.f25162L, true);
        } else if (tipType == TipType.WEAKENED_TIPS) {
            hmb.m131701M(this.f25165O, true);
        }
    }

    /* JADX INFO: renamed from: M0 */
    public void m41550M0(p36 p36Var, int i) {
        if (this.f25165O == null) {
            this.f25165O = (WeakenedTipsView) this.f25159I.inflate();
            CoreModule.f17545c.f19639e0.f149160D5.put(Long.valueOf(mqi0.m155944o()));
        }
        this.f25165O.m43805s0(p36Var, i);
        m41549L0(TipType.WEAKENED_TIPS);
        zvf0.m220368A("e_old_messagesweaken_tips", OMSDialogPositon.p_messages_view, vwb.m200311Y("tips_show_position", "up"));
    }

    /* JADX INFO: renamed from: N0 */
    public void m41551N0(WechatNotifySetting wechatNotifySetting) {
        if (this.f25164N == null) {
            this.f25164N = (WechatNotifyBannerView) this.f25158H.inflate();
            if (!mqi0.m155929D(CoreModule.f17545c.f19639e0.f149402j5.get().longValue())) {
                CoreModule.f17545c.f19639e0.f149394i5.put(0);
                CoreModule.f17545c.f19639e0.f149410k5.m189988a(1);
            }
            CoreModule.f17545c.f19639e0.f149394i5.m189988a(1);
            CoreModule.f17545c.f19639e0.f149402j5.put(Long.valueOf(mqi0.m155944o()));
        }
        this.f25164N.m43809d(wechatNotifySetting, new d30() { // from class: l.yp6
            @Override // p149l.d30
            public final void call() {
                this.f199398a.m41569u0();
            }
        });
        m41549L0(TipType.WECHAT_NOTIFY);
    }

    /* JADX INFO: renamed from: d0 */
    public final void m41552d0(View view) {
        jq6.m142777a(this, view);
    }

    /* JADX INFO: renamed from: e0 */
    public View m41553e0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return iq6.m137629b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: f0 */
    public PutongAct m41554f0() {
        return (PutongAct) getContext();
    }

    /* JADX INFO: renamed from: g0 */
    public String m41555g0(int i) {
        if (i == 0) {
            return getMessageHeaderRes();
        }
        if (i == 1) {
            return getMessageHeaderRes() + " · " + m41554f0().getResources().getString(R$string.f18380b2);
        }
        if (i == 6) {
            return getMessageHeaderRes() + " · " + m41554f0().getResources().getString(R$string.f18930t1);
        }
        if (i == 2) {
            return getMessageHeaderRes() + " · " + m41554f0().getResources().getString(R$string.f18411c2);
        }
        if (i == 3) {
            return getMessageHeaderRes() + " · " + m41554f0().getResources().getString(R$string.f18349a2);
        }
        if (i == 4) {
            return getMessageHeaderRes() + " · " + m41554f0().getResources().getString(R$string.f18992v3);
        }
        if (i == 7) {
            return getMessageHeaderRes() + " · " + m41554f0().getResources().getString(R$string.f17930M3);
        }
        if (i == 8) {
            return getMessageHeaderRes() + " · " + m41554f0().getResources().getString(R$string.f17724F7);
        }
        if (i != 11) {
            return "";
        }
        return getMessageHeaderRes() + " · 异常会话";
    }

    public ConversationHeadRecommendLayout getConversationHeadRecommendLayout() {
        return this.f25180p;
    }

    public int getCurrentSortType() {
        return this.f25160J;
    }

    /* JADX INFO: renamed from: h0 */
    public void m41556h0() {
        xdl0.m208344M(this.f25151A, false);
    }

    /* JADX INFO: renamed from: i0 */
    public void m41557i0(boolean z) {
        xdl0.m208344M(this.f25184t, !z);
    }

    public void init() {
        ((LinearLayout.LayoutParams) this.f25184t.getLayoutParams()).setMargins(0, t100.m186890d(10.0f), 0, 0);
        xdl0.m208344M(this.f25185u, true);
        this.f25186v.setTextSize(2, 15.0f);
        this.f25186v.setTypeface(Typeface.DEFAULT_BOLD);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f25185u.getLayoutParams();
        layoutParams.setMargins(0, 0, 0, 0);
        this.f25185u.setLayoutParams(layoutParams);
        this.f25186v.setText(getMessageHeaderRes());
        m41540A0(false, this.f25160J == 0);
        xdl0.m208329E0(this.f25188x, new View.OnClickListener() { // from class: l.cq6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f82041a.m41560l0(view);
            }
        });
        m41554f0().duringCreated(getConversationHeadRecommendLayout().getVisibleObs()).distinctUntilChanged().subscribe(mkd0.m154956H(new e30() { // from class: l.dq6
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f87392a.m41561m0((Boolean) obj);
            }
        }, new e30() { // from class: l.eq6
            @Override // p149l.e30
            public final void call(Object obj) {
                ConversationsListHeadView.m41531T((Throwable) obj);
            }
        }));
        if (upa.m194624D2() && !hu40.m133026a().m133031f(m41554f0(), false) && !uq40.m194981w() && !m41559k0() && hu40.m133026a().m133028c()) {
            m41548K0();
        }
        if (getMessageTabRevisionEnable()) {
            xdl0.m208344M(this.f25188x, false);
            xdl0.m208344M(this.f25185u, false);
            xdl0.m208325C0(this.f25186v, t100.m186890d(36.0f));
        }
        if (upa.m194741d3() || upa.m194637G0()) {
            xdl0.m208344M(this.f25183s, true);
        } else {
            xdl0.m208344M(this.f25183s, false);
        }
        if (upa.m194752g() && (m41554f0() instanceof NewMainAct)) {
            this.f25179o.m41252W(m41554f0());
        } else {
            xdl0.m208344M(this.f25179o, false);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final void m41558j0() {
        m41574z0(this.f25168d, 0, "e_intl_messages_filter_default");
        m41574z0(this.f25171g, 9, "e_intl_messages_filter_chat");
        m41574z0(this.f25174j, 10, "e_intl_messages_filter_matches");
    }

    /* JADX INFO: renamed from: k0 */
    public boolean m41559k0() {
        return xdl0.m208349O0(this.f25151A);
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m41560l0(View view) {
        m41544G0(this.f25188x);
        o6j0.m162859c("e_intl_messages_filter", OMSDialogPositon.p_messages_view, new o6j0.C18854a[0]);
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m41561m0(Boolean bool) {
        xdl0.m208344M(this.f25187w, bool.booleanValue());
        xdl0.m208344M(this.f25186v, bool.booleanValue());
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m41562n0(String str, int i, View view) {
        o6j0.m162859c(str, OMSDialogPositon.p_messages_view, new o6j0.C18854a[0]);
        if (this.f25160J != i) {
            this.f25160J = i;
            CoreModule.f17545c.f19642f0.f19966p2.onNext(roj0.f160388a);
        }
        this.f25161K.dismiss();
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m41563o0(View view) {
        this.f25161K.dismiss();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m41552d0(this);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m41564p0() {
        m41540A0(false, this.f25160J == 0);
        setLayoutCheckByType(this.f25160J);
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m41565q0(SettingGroups settingGroups) {
        lsi0.m151595y("已开启消息通知");
        m41556h0();
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m41566r0(View view) {
        zvf0.m220396r("e_open_click", OMSDialogPositon.p_messages_view);
        if (NotificationCheckerCommon.m79220a() != NotificationCheckerCommon.State.closed && !CoreModule.f17545c.f19639e0.m169527p9().getUserPushAllEnable()) {
            m41554f0().duringCreated(CoreModule.f17545c.f19639e0.m169409K9("allPushEnable", true, 0, 0)).subscribe(mkd0.m154956H(new e30() { // from class: l.hq6
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f109033a.m41565q0((SettingGroups) obj);
                }
            }, new e30() { // from class: l.wp6
                @Override // p149l.e30
                public final void call(Object obj) {
                    yij0.m214926D((Throwable) obj);
                }
            }));
        } else {
            uq40.m194951A();
            m41554f0().duringCreated(CoreModule.f17545c.f19639e0.m169409K9("allPushEnable", true, 0, 0)).subscribe(mkd0.m154960L(mkd0.m154950B()));
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m41567s0(View view) {
        zvf0.m220396r("e_close_click", OMSDialogPositon.p_messages_view);
        m41556h0();
        hu40.m133026a().m133032g();
    }

    public void setFilterPopShow(Runnable runnable) {
        this.f25166P = runnable;
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m41568t0(C4319c c4319c) {
        if (NotificationCheckerCommon.m79220a() == NotificationCheckerCommon.State.closed || !CoreModule.f17545c.f19639e0.m169527p9().getUserPushAllEnable()) {
            return;
        }
        m41556h0();
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m41569u0() {
        CoreModule.f17545c.f19639e0.f149456q5.put(Long.valueOf(mqi0.m155944o()));
        m41549L0(TipType.NONE);
    }

    /* JADX INFO: renamed from: v0 */
    public void m41570v0() {
        if (NullChecker.m81303a(this.f25163M) && xdl0.m208349O0(this.f25163M)) {
            this.f25163M.m43737l0();
        } else if (NullChecker.m81303a(this.f25164N) && xdl0.m208349O0(this.f25164N)) {
            this.f25164N.m43810e();
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final void m41571w0(VText vText, VImage vImage) {
        m41542D0(vText, vImage);
        vText.setTypeface(Typeface.defaultFromStyle(0));
    }

    /* JADX INFO: renamed from: x0 */
    public final void m41572x0() {
        m41571w0(this.f25169e, this.f25170f);
        m41571w0(this.f25172h, this.f25173i);
        m41571w0(this.f25175k, this.f25176l);
    }

    /* JADX INFO: renamed from: y0 */
    public final void m41573y0(VText vText, VImage vImage) {
        m41541B0(vText, vImage);
        vText.setTypeface(Typeface.defaultFromStyle(1));
    }

    /* JADX INFO: renamed from: z0 */
    public final void m41574z0(LinearLayout linearLayout, final int i, final String str) {
        xdl0.m208329E0(linearLayout, new View.OnClickListener() { // from class: l.xp6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f193897a.m41562n0(str, i, view);
            }
        });
    }

    public ConversationsListHeadView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f25160J = 0;
    }

    public ConversationsListHeadView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f25160J = 0;
    }
}
