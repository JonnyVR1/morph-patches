package com.p000p1.mobile.putong.core.newui.messages;

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
import com.p000p1.mobile.putong.core.newui.main.NewMainAct;
import com.p000p1.mobile.putong.core.newui.messages.ConversationsListHeadView;
import com.p000p1.mobile.putong.core.newui.messages.promotion.PrivilegePromotionHeaderView;
import com.p000p1.mobile.putong.core.newui.view.PicCertGuideView;
import com.p000p1.mobile.putong.core.newui.view.WeakenedTipsView;
import com.p000p1.mobile.putong.core.newui.view.WechatNotifyBannerView;
import com.p000p1.mobile.putong.notifications.NotificationCheckerCommon;
import com.p1.mobile.android.app.c;
import com.p1.mobile.android.ui.bubble.a;
import com.p1.mobile.android.ui.bubble.d;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.WechatNotifySetting;
import com.p1.mobile.putong.data.SettingGroups;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.e30;
import l.hmb;
import l.hpd0;
import l.hu40;
import l.iq6;
import l.j760;
import l.jq6;
import l.lsi0;
import l.mkd0;
import l.o6j0;
import l.qqi0;
import l.roj0;
import l.t100;
import l.upa;
import l.uq40;
import l.vwb;
import l.w0c0;
import l.w9j;
import l.x2c0;
import l.xdl0;
import l.zvf0;
import p009l.mqi0;
import p009l.o7r;
import p009l.p36;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ConversationsListHeadView extends VLinear {

    /* JADX INFO: renamed from: Q */
    public static hpd0 f3926Q = new hpd0("is_operated_filter" + CoreModule.H().userId(), Boolean.FALSE);

    /* JADX INFO: renamed from: R */
    public static String[] f3927R = {"全部", "未读", "在线", "群聊"};

    /* JADX INFO: renamed from: S */
    public static int[] f3928S = {0, 1, 2, 6};

    /* JADX INFO: renamed from: A */
    public RelativeLayout f3929A;

    /* JADX INFO: renamed from: B */
    public LinearLayout f3930B;

    /* JADX INFO: renamed from: C */
    public VText f3931C;

    /* JADX INFO: renamed from: D */
    public VImage f3932D;

    /* JADX INFO: renamed from: E */
    public ViewStub f3933E;

    /* JADX INFO: renamed from: F */
    public ViewStub f3934F;

    /* JADX INFO: renamed from: G */
    public ViewStub f3935G;

    /* JADX INFO: renamed from: H */
    public ViewStub f3936H;

    /* JADX INFO: renamed from: I */
    public ViewStub f3937I;

    /* JADX INFO: renamed from: J */
    public int f3938J;

    /* JADX INFO: renamed from: K */
    public PopupWindow f3939K;

    /* JADX INFO: renamed from: L */
    public View f3940L;

    /* JADX INFO: renamed from: M */
    public PicCertGuideView f3941M;

    /* JADX INFO: renamed from: N */
    public WechatNotifyBannerView f3942N;

    /* JADX INFO: renamed from: O */
    public WeakenedTipsView f3943O;

    /* JADX INFO: renamed from: P */
    public Runnable f3944P;

    /* JADX INFO: renamed from: c */
    public FrameLayout f3945c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f3946d;

    /* JADX INFO: renamed from: e */
    public VText f3947e;

    /* JADX INFO: renamed from: f */
    public VImage f3948f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f3949g;

    /* JADX INFO: renamed from: h */
    public VText f3950h;

    /* JADX INFO: renamed from: i */
    public VImage f3951i;

    /* JADX INFO: renamed from: j */
    public LinearLayout f3952j;

    /* JADX INFO: renamed from: k */
    public VText f3953k;

    /* JADX INFO: renamed from: l */
    public VImage f3954l;

    /* JADX INFO: renamed from: m */
    public View f3955m;

    /* JADX INFO: renamed from: n */
    public PrivilegePromotionHeaderView f3956n;

    /* JADX INFO: renamed from: o */
    public ConversationRealEcrGuideLayout f3957o;

    /* JADX INFO: renamed from: p */
    public ConversationHeadRecommendLayout f3958p;

    /* JADX INFO: renamed from: q */
    public ConversationCityCentreCardLayout f3959q;

    /* JADX INFO: renamed from: r */
    public FrameLayout f3960r;

    /* JADX INFO: renamed from: s */
    public View f3961s;

    /* JADX INFO: renamed from: t */
    public LinearLayout f3962t;

    /* JADX INFO: renamed from: u */
    public RelativeLayout f3963u;

    /* JADX INFO: renamed from: v */
    public VText f3964v;

    /* JADX INFO: renamed from: w */
    public View f3965w;

    /* JADX INFO: renamed from: x */
    public VImage f3966x;

    /* JADX INFO: renamed from: y */
    public VImage f3967y;

    /* JADX INFO: renamed from: z */
    public VImage f3968z;

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
        this.f3938J = 0;
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m5640T(Throwable th) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    private String getMessageHeaderRes() {
        return getMessageTabRevisionEnable() ? "筛选" : getResources().getString(R.string.d2);
    }

    private boolean getMessageTabRevisionEnable() {
        return upa.F0() || upa.d3();
    }

    @SuppressLint({"SetTextI18n"})
    private void setLayoutCheckByType(int i) {
        m5681x0();
        if (i == 0) {
            m5682y0(this.f3947e, this.f3948f);
        } else if (i == 9) {
            m5682y0(this.f3950h, this.f3951i);
        } else {
            if (i != 10) {
                return;
            }
            m5682y0(this.f3953k, this.f3954l);
        }
    }

    /* JADX INFO: renamed from: A0 */
    public final void m5649A0(boolean z, boolean z2) {
        if (z) {
            if (!((Boolean) f3926Q.get()).booleanValue()) {
                f3926Q.put(Boolean.TRUE);
            }
            this.f3967y.setVisibility(8);
            this.f3966x.setImageResource(x2c0.q1);
            return;
        }
        if (((Boolean) f3926Q.get()).booleanValue()) {
            VImage vImage = this.f3967y;
            if (z2) {
                vImage.setVisibility(8);
            } else {
                vImage.setVisibility(0);
                this.f3967y.setImageResource(x2c0.ma);
            }
        } else {
            this.f3967y.setVisibility(0);
            this.f3967y.setImageResource(x2c0.la);
        }
        this.f3966x.setImageResource(x2c0.r1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: B0 */
    public final void m5650B0(VText vText, VImage vImage) {
        vText.setTextColor(getResources().getColor(w0c0.I));
        xdl0.M0(vImage, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: D0 */
    public final void m5651D0(VText vText, VImage vImage) {
        vText.setTextColor(getResources().getColor(w0c0.n));
        xdl0.M0(vImage, false);
    }

    /* JADX INFO: renamed from: E0 */
    public void m5652E0(int i) {
        ViewGroup.LayoutParams layoutParams = this.f3955m.getLayoutParams();
        layoutParams.height = i;
        this.f3955m.setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: G0 */
    public void m5653G0(View view) {
        if (!NullChecker.a(this.f3939K)) {
            this.f3939K = new PopupWindow((Context) m5663f0());
        }
        if (this.f3939K.isShowing()) {
            return;
        }
        View viewM5662e0 = m5662e0(o7r.m19649a(m5663f0()), null);
        m5667j0();
        setLayoutCheckByType(this.f3938J);
        this.f3939K.setWidth(-2);
        this.f3939K.setHeight(-2);
        this.f3939K.setContentView(viewM5662e0);
        this.f3939K.setOutsideTouchable(true);
        this.f3939K.setTouchable(true);
        this.f3939K.setFocusable(true);
        viewM5662e0.setOnClickListener(new View.OnClickListener() { // from class: l.fq6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f13137a.m5672o0(view2);
            }
        });
        m5649A0(true, true);
        this.f3939K.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: l.gq6
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                this.f13686a.m5673p0();
            }
        });
        this.f3939K.setBackgroundDrawable(new ColorDrawable(0));
        this.f3939K.showAsDropDown(view, t100.c().widthPixels - t100.d(12.0f), -t100.d(getMessageTabRevisionEnable() ? 15.0f : 20.0f));
    }

    /* JADX INFO: renamed from: H0 */
    public void m5654H0() {
        if (this.f3940L == null) {
            this.f3940L = this.f3933E.inflate();
        }
        m5658L0(TipType.INVALID_FILTER);
    }

    /* JADX INFO: renamed from: I0 */
    public void m5655I0(String str) {
        a aVar = new a(m5663f0());
        aVar.B(t100.d(2.0f)).l(t100.d(9.0f)).p(75).J(13.0f).w(t100.d(2.0f)).e(true).M(true).y(true).b(3000L).D(str).x(t100.d(3.0f)).q(a.Q | a.R);
        d.l().t(aVar, this.f3966x);
        zvf0.x("e_quickchat_relationship_timeout_tips", "p_messages_view");
    }

    /* JADX INFO: renamed from: J0 */
    public void m5656J0() {
        String str = !qqi0.h(mqi0.m18550o(), (long) CoreModule.c.e0.na().createdTime, 7) ? "完成认证，将收获更多聊天" : "完成认证，被回复率提升3倍";
        if (this.f3941M == null) {
            this.f3941M = (PicCertGuideView) this.f3935G.inflate();
            CoreModule.c.e0.W3.a(1);
            CoreModule.c.e0.V3.put(Long.valueOf(mqi0.m18550o() + 86400000));
        }
        this.f3941M.m8000k0(m5663f0(), str, "去认证", "e_messages_view_verification", "p_messages_view", null, null);
        m5658L0(TipType.PIC_CERT);
        this.f3941M.m8001l0();
    }

    /* JADX INFO: renamed from: K0 */
    public void m5657K0() {
        CoreModule.c.e0.n0.put(Long.valueOf(mqi0.m18550o()));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("当前无法接收新消息通知，点击立即开启");
        spannableStringBuilder.setSpan(new ForegroundColorSpan(m5663f0().getResources().getColor(w0c0.I)), 14, "当前无法接收新消息通知，点击立即开启".length(), 33);
        xdl0.E0(this.f3929A, new View.OnClickListener() { // from class: l.vp6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21715a.m5675r0(view);
            }
        });
        if (upa.z()) {
            this.f3932D.setImageResource(x2c0.Ff);
        }
        xdl0.E0(this.f3932D, new View.OnClickListener() { // from class: l.zp6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23823a.m5676s0(view);
            }
        });
        this.f3931C.setText(spannableStringBuilder);
        m5658L0(TipType.NOTICE);
        zvf0.x("e_open_click", "p_messages_view");
        m5663f0().lifecycle().filter(new w9j() { // from class: l.aq6
            public final Object call(Object obj) {
                return Boolean.valueOf(((c) obj) == c.i);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.bq6
            public final void call(Object obj) {
                this.f10237a.m5677t0((c) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: L0 */
    public void m5658L0(TipType tipType) {
        hmb.M(this.f3929A, false);
        hmb.M(this.f3940L, false);
        hmb.M(this.f3941M, false);
        hmb.M(this.f3942N, false);
        hmb.M(this.f3943O, false);
        if (tipType == TipType.WECHAT_NOTIFY) {
            hmb.M(this.f3942N, true);
            return;
        }
        if (tipType == TipType.PIC_CERT) {
            hmb.M(this.f3941M, true);
            return;
        }
        if (tipType == TipType.NOTICE) {
            hmb.M(this.f3929A, true);
        } else if (tipType == TipType.INVALID_FILTER) {
            hmb.M(this.f3940L, true);
        } else if (tipType == TipType.WEAKENED_TIPS) {
            hmb.M(this.f3943O, true);
        }
    }

    /* JADX INFO: renamed from: M0 */
    public void m5659M0(p36 p36Var, int i) {
        if (this.f3943O == null) {
            this.f3943O = (WeakenedTipsView) this.f3937I.inflate();
            CoreModule.c.e0.D5.put(Long.valueOf(mqi0.m18550o()));
        }
        this.f3943O.m8069s0(p36Var, i);
        m5658L0(TipType.WEAKENED_TIPS);
        zvf0.A("e_old_messagesweaken_tips", "p_messages_view", new j760[]{vwb.Y("tips_show_position", "up")});
    }

    /* JADX INFO: renamed from: N0 */
    public void m5660N0(WechatNotifySetting wechatNotifySetting) {
        if (this.f3942N == null) {
            this.f3942N = (WechatNotifyBannerView) this.f3936H.inflate();
            if (!mqi0.m18535D(((Long) CoreModule.c.e0.j5.get()).longValue())) {
                CoreModule.c.e0.i5.put(0);
                CoreModule.c.e0.k5.a(1);
            }
            CoreModule.c.e0.i5.a(1);
            CoreModule.c.e0.j5.put(Long.valueOf(mqi0.m18550o()));
        }
        this.f3942N.m8073d(wechatNotifySetting, new d30() { // from class: l.yp6
            public final void call() {
                this.f23190a.m5678u0();
            }
        });
        m5658L0(TipType.WECHAT_NOTIFY);
    }

    /* JADX INFO: renamed from: d0 */
    public final void m5661d0(View view) {
        jq6.a(this, view);
    }

    /* JADX INFO: renamed from: e0 */
    public View m5662e0(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return iq6.b(this, layoutInflater, viewGroup);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f0 */
    public PutongAct m5663f0() {
        return getContext();
    }

    /* JADX INFO: renamed from: g0 */
    public String m5664g0(int i) {
        if (i == 0) {
            return getMessageHeaderRes();
        }
        if (i == 1) {
            return getMessageHeaderRes() + " · " + m5663f0().getResources().getString(R.string.b2);
        }
        if (i == 6) {
            return getMessageHeaderRes() + " · " + m5663f0().getResources().getString(R.string.t1);
        }
        if (i == 2) {
            return getMessageHeaderRes() + " · " + m5663f0().getResources().getString(R.string.c2);
        }
        if (i == 3) {
            return getMessageHeaderRes() + " · " + m5663f0().getResources().getString(R.string.a2);
        }
        if (i == 4) {
            return getMessageHeaderRes() + " · " + m5663f0().getResources().getString(R.string.v3);
        }
        if (i == 7) {
            return getMessageHeaderRes() + " · " + m5663f0().getResources().getString(R.string.M3);
        }
        if (i == 8) {
            return getMessageHeaderRes() + " · " + m5663f0().getResources().getString(R.string.F7);
        }
        if (i != 11) {
            return "";
        }
        return getMessageHeaderRes() + " · 异常会话";
    }

    public ConversationHeadRecommendLayout getConversationHeadRecommendLayout() {
        return this.f3958p;
    }

    public int getCurrentSortType() {
        return this.f3938J;
    }

    /* JADX INFO: renamed from: h0 */
    public void m5665h0() {
        xdl0.M(this.f3929A, false);
    }

    /* JADX INFO: renamed from: i0 */
    public void m5666i0(boolean z) {
        xdl0.M(this.f3962t, !z);
    }

    public void init() {
        ((LinearLayout.LayoutParams) this.f3962t.getLayoutParams()).setMargins(0, t100.d(10.0f), 0, 0);
        xdl0.M(this.f3963u, true);
        this.f3964v.setTextSize(2, 15.0f);
        this.f3964v.setTypeface(Typeface.DEFAULT_BOLD);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f3963u.getLayoutParams();
        layoutParams.setMargins(0, 0, 0, 0);
        this.f3963u.setLayoutParams(layoutParams);
        this.f3964v.setText(getMessageHeaderRes());
        m5649A0(false, this.f3938J == 0);
        xdl0.E0(this.f3966x, new View.OnClickListener() { // from class: l.cq6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10725a.m5669l0(view);
            }
        });
        m5663f0().duringCreated(getConversationHeadRecommendLayout().getVisibleObs()).distinctUntilChanged().subscribe(mkd0.H(new e30() { // from class: l.dq6
            public final void call(Object obj) {
                this.f11950a.m5670m0((Boolean) obj);
            }
        }, new e30() { // from class: l.eq6
            public final void call(Object obj) {
                ConversationsListHeadView.m5640T((Throwable) obj);
            }
        }));
        if (upa.D2() && !hu40.a().f(m5663f0(), false) && !uq40.w() && !m5668k0() && hu40.a().c()) {
            m5657K0();
        }
        if (getMessageTabRevisionEnable()) {
            xdl0.M(this.f3966x, false);
            xdl0.M(this.f3963u, false);
            xdl0.C0(this.f3964v, t100.d(36.0f));
        }
        if (upa.d3() || upa.G0()) {
            xdl0.M(this.f3961s, true);
        } else {
            xdl0.M(this.f3961s, false);
        }
        if (upa.g() && (m5663f0() instanceof NewMainAct)) {
            this.f3957o.m5358W(m5663f0());
        } else {
            xdl0.M(this.f3957o, false);
        }
    }

    /* JADX INFO: renamed from: j0 */
    public final void m5667j0() {
        m5683z0(this.f3946d, 0, "e_intl_messages_filter_default");
        m5683z0(this.f3949g, 9, "e_intl_messages_filter_chat");
        m5683z0(this.f3952j, 10, "e_intl_messages_filter_matches");
    }

    /* JADX INFO: renamed from: k0 */
    public boolean m5668k0() {
        return xdl0.O0(this.f3929A);
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m5669l0(View view) {
        m5653G0(this.f3966x);
        o6j0.c("e_intl_messages_filter", "p_messages_view", new o6j0.a[0]);
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m5670m0(Boolean bool) {
        xdl0.M(this.f3965w, bool.booleanValue());
        xdl0.M(this.f3964v, bool.booleanValue());
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m5671n0(String str, int i, View view) {
        o6j0.c(str, "p_messages_view", new o6j0.a[0]);
        if (this.f3938J != i) {
            this.f3938J = i;
            CoreModule.c.f0.p2.onNext(roj0.a);
        }
        this.f3939K.dismiss();
    }

    /* JADX INFO: renamed from: o0 */
    public final /* synthetic */ void m5672o0(View view) {
        this.f3939K.dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m5661d0(this);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m5673p0() {
        m5649A0(false, this.f3938J == 0);
        setLayoutCheckByType(this.f3938J);
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m5674q0(SettingGroups settingGroups) {
        lsi0.y("已开启消息通知");
        m5665h0();
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m5675r0(View view) {
        zvf0.r("e_open_click", "p_messages_view");
        if (NotificationCheckerCommon.m9539a() != NotificationCheckerCommon.State.closed && !CoreModule.c.e0.p9().getUserPushAllEnable()) {
            m5663f0().duringCreated(CoreModule.c.e0.K9("allPushEnable", true, 0, 0)).subscribe(mkd0.H(new e30() { // from class: l.hq6
                public final void call(Object obj) {
                    this.f14218a.m5674q0((SettingGroups) obj);
                }
            }, new e30() { // from class: l.wp6
                public final void call(Object obj) {
                    yij0.m25382D((Throwable) obj);
                }
            }));
        } else {
            uq40.A();
            m5663f0().duringCreated(CoreModule.c.e0.K9("allPushEnable", true, 0, 0)).subscribe(mkd0.L(mkd0.B()));
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m5676s0(View view) {
        zvf0.r("e_close_click", "p_messages_view");
        m5665h0();
        hu40.a().g();
    }

    public void setFilterPopShow(Runnable runnable) {
        this.f3944P = runnable;
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m5677t0(c cVar) {
        if (NotificationCheckerCommon.m9539a() == NotificationCheckerCommon.State.closed || !CoreModule.c.e0.p9().getUserPushAllEnable()) {
            return;
        }
        m5665h0();
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m5678u0() {
        CoreModule.c.e0.q5.put(Long.valueOf(mqi0.m18550o()));
        m5658L0(TipType.NONE);
    }

    /* JADX INFO: renamed from: v0 */
    public void m5679v0() {
        if (NullChecker.a(this.f3941M) && xdl0.O0(this.f3941M)) {
            this.f3941M.m8001l0();
        } else if (NullChecker.a(this.f3942N) && xdl0.O0(this.f3942N)) {
            this.f3942N.m8074e();
        }
    }

    /* JADX INFO: renamed from: w0 */
    public final void m5680w0(VText vText, VImage vImage) {
        m5651D0(vText, vImage);
        vText.setTypeface(Typeface.defaultFromStyle(0));
    }

    /* JADX INFO: renamed from: x0 */
    public final void m5681x0() {
        m5680w0(this.f3947e, this.f3948f);
        m5680w0(this.f3950h, this.f3951i);
        m5680w0(this.f3953k, this.f3954l);
    }

    /* JADX INFO: renamed from: y0 */
    public final void m5682y0(VText vText, VImage vImage) {
        m5650B0(vText, vImage);
        vText.setTypeface(Typeface.defaultFromStyle(1));
    }

    /* JADX INFO: renamed from: z0 */
    public final void m5683z0(LinearLayout linearLayout, final int i, final String str) {
        xdl0.E0(linearLayout, new View.OnClickListener() { // from class: l.xp6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22687a.m5671n0(str, i, view);
            }
        });
    }

    public ConversationsListHeadView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3938J = 0;
    }

    public ConversationsListHeadView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3938J = 0;
    }
}
