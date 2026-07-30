package com.p046p1.mobile.putong.core.p053ui.gift.opt.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.CoreGiftInfo;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PrivilegeGift;
import com.p046p1.mobile.putong.core.data.PrivilegeGiftType;
import com.p046p1.mobile.putong.core.data.ProductCategory;
import com.p046p1.mobile.putong.core.p053ui.gift.opt.view.GiftInnerPagerItemView;
import com.p046p1.mobile.putong.data.CoreGiftPanelName;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Locale;
import p147v.VDraweeView;
import p147v.VMarqueeText;
import p147v.VRelative;
import p147v.VText;
import p149l.a1c0;
import p149l.bkb0;
import p149l.brj;
import p149l.c3c0;
import p149l.d30;
import p149l.e30;
import p149l.e51;
import p149l.lsi0;
import p149l.ltj;
import p149l.osi0;
import p149l.qib0;
import p149l.t100;
import p149l.vuj;
import p149l.vwb;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes10.dex */
public class GiftInnerPagerItemView extends VRelative implements Checkable {

    /* JADX INFO: renamed from: d */
    public VDraweeView f29237d;

    /* JADX INFO: renamed from: e */
    public VText f29238e;

    /* JADX INFO: renamed from: f */
    public VMarqueeText f29239f;

    /* JADX INFO: renamed from: g */
    public VText f29240g;

    /* JADX INFO: renamed from: h */
    public VText f29241h;

    /* JADX INFO: renamed from: i */
    public CoreGiftInfo f29242i;

    /* JADX INFO: renamed from: j */
    public ltj f29243j;

    /* JADX INFO: renamed from: k */
    public boolean f29244k;

    /* JADX INFO: renamed from: l */
    public boolean f29245l;

    public GiftInnerPagerItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f29244k = true;
        this.f29245l = true;
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m45478H(Throwable th) {
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ void m45480L(Boolean bool) {
    }

    /* JADX INFO: renamed from: P */
    public final void m45486P(View view) {
        brj.m103550a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m45487Q(CoreGiftInfo coreGiftInfo) {
        return NullChecker.m81303a(coreGiftInfo) && NullChecker.m81303a(coreGiftInfo.extra) && NullChecker.m81303a(coreGiftInfo.extra.style);
    }

    /* JADX INFO: renamed from: R */
    public final boolean m45488R() {
        CoreGiftInfo coreGiftInfo = this.f29242i;
        boolean z = coreGiftInfo.quota != 0 && this.f29245l && NullChecker.m81303a(coreGiftInfo.extra) && NullChecker.m81303a(this.f29242i.extra.style) && NullChecker.m81303a(this.f29242i.extra.style.tag) && !TextUtils.isEmpty(this.f29242i.extra.style.tag.text);
        if (z) {
            PrivilegeGift privilegeGiftM118053Q3 = CoreModule.f17545c.f19643f1.m118053Q3(this.f29242i.f56011id);
            if (NullChecker.m81303a(privilegeGiftM118053Q3) && privilegeGiftM118053Q3.highProbabilityBuyUser) {
                return m45490T(privilegeGiftM118053Q3);
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: S */
    public final boolean m45489S(PrivilegeGift privilegeGift) {
        return NullChecker.m81303a(privilegeGift) && PrivilegeGiftType.isSVipGift(privilegeGift.privilegeType) && NullChecker.m81303a(this.f29242i.extra.style) && NullChecker.m81303a(this.f29242i.extra.style.tag) && !TextUtils.isEmpty(this.f29242i.extra.style.tag.privilegeName);
    }

    /* JADX INFO: renamed from: T */
    public final boolean m45490T(PrivilegeGift privilegeGift) {
        return this.f29243j.m151700m() && NullChecker.m81303a(privilegeGift) && PrivilegeGiftType.isGreetGift(privilegeGift.privilegeType) && !CoreModule.m29935P().m94656g().mo35011Fs() && CoreModule.f17545c.f19643f1.m118055S3();
    }

    /* JADX INFO: renamed from: V */
    public final boolean m45491V(PrivilegeGift privilegeGift) {
        return NullChecker.m81303a(privilegeGift) && PrivilegeGiftType.isVipGift(privilegeGift.privilegeType) && NullChecker.m81303a(this.f29242i.extra.style) && NullChecker.m81303a(this.f29242i.extra.style.tag) && !TextUtils.isEmpty(this.f29242i.extra.style.tag.privilegeName);
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m45492W(Boolean bool) {
        m45498c0();
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m45493X(final ltj ltjVar, CoreGiftInfo coreGiftInfo, final d30 d30Var, View view) {
        String strM98805F = ltjVar.m151705t().m98805F();
        if (!TextUtils.equals(strM98805F, "from_meet_picks") && !TextUtils.equals(strM98805F, "from_meet_liked")) {
            zvf0.m220399u("e_chat_gift_bar_gift_send", ltjVar.m151705t().m98806G() == CoreGiftPanelName.get("note") ? "p_meet" : ltjVar.m151705t().m98810L(), vwb.m200311Y("chat_gift_id", this.f29242i.f56011id));
        }
        PrivilegeGift privilegeGiftM118053Q3 = CoreModule.f17545c.f19643f1.m118053Q3(coreGiftInfo.f56011id);
        if (CoreModule.m29935P().m94658i().mo158371f() && TextUtils.equals(coreGiftInfo.f56011id, "o_diamond_gift_id")) {
            zvf0.m220396r("e_unlimit_sayhi_diamond", ltjVar.m151705t().m98810L());
            CoreModule.m29935P().m94658i().mo33618wh(ltjVar.m96966b(), "p_chat,gift_odiamond", new e30() { // from class: l.uqj
                @Override // p149l.e30
                public final void call(Object obj) {
                    ltjVar.m151705t().dismiss();
                }
            }, null, null, Privilege.oDiamondGreetings);
            return;
        }
        if (NullChecker.m81303a(privilegeGiftM118053Q3) && privilegeGiftM118053Q3.highProbabilityBuyUser && m45490T(privilegeGiftM118053Q3)) {
            CoreModule.f17545c.f19643f1.m118074l4();
            CoreModule.m29935P().m94658i().mo33362Lf(ltjVar.m96966b(), "p_chat,gift_send", Privilege.greet, null, new e30() { // from class: l.vqj
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f182653a.m45492W((Boolean) obj);
                }
            });
            return;
        }
        if (m45491V(privilegeGiftM118053Q3) && (!CoreModule.m29935P().m94656g().mo35008Fd() || (NullChecker.m81303a(privilegeGiftM118053Q3) && privilegeGiftM118053Q3.remaining <= 0))) {
            if (CoreModule.m29935P().m94656g().mo35008Fd()) {
                osi0.m165783g("该礼物本月已用完");
                return;
            } else {
                CoreModule.m29935P().m94651a().mo33313Eq(ltjVar.m96966b(), "p_chat,gift_send", new d30() { // from class: l.wqj
                    @Override // p149l.d30
                    public final void call() {
                        this.f187694a.m45498c0();
                    }
                }, Privilege.vip_greet, false, null);
                return;
            }
        }
        if (!m45489S(privilegeGiftM118053Q3) || (CoreModule.m29935P().m94656g().mo35011Fs() && (!NullChecker.m81303a(privilegeGiftM118053Q3) || privilegeGiftM118053Q3.remaining > 0))) {
            if (coreGiftInfo.quota == 0) {
                lsi0.m151596z(coreGiftInfo.extra.noQuotaToast, ltjVar.m151705t().getWindow().getDecorView());
                return;
            } else {
                ltjVar.m151707v(coreGiftInfo);
                return;
            }
        }
        if (CoreModule.m29935P().m94656g().mo35011Fs()) {
            osi0.m165783g("该礼物本月已用完");
        } else {
            CoreModule.m29935P().m94658i().mo33362Lf(ltjVar.m96966b(), "p_chat,gift_send", Privilege.svip_greet, new e30() { // from class: l.xqj
                @Override // p149l.e30
                public final void call(Object obj) {
                    ltjVar.duringCreated(CoreModule.f17545c.f19555C0.m210112u4()).subscribe(mkd0.m154956H(new e30() { // from class: l.zqj
                        @Override // p149l.e30
                        public final void call(Object obj2) {
                            d30Var.call();
                        }
                    }, new e30() { // from class: l.arj
                        @Override // p149l.e30
                        public final void call(Object obj2) {
                            GiftInnerPagerItemView.m45478H((Throwable) obj2);
                        }
                    }));
                }
            }, new e30() { // from class: l.yqj
                @Override // p149l.e30
                public final void call(Object obj) {
                    GiftInnerPagerItemView.m45480L((Boolean) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m45494Y() {
        this.f29239f.onWindowFocusChanged(true);
    }

    /* JADX INFO: renamed from: Z */
    public void m45495Z(vuj vujVar, final ltj ltjVar, final CoreGiftInfo coreGiftInfo, boolean z, boolean z2, final d30 d30Var) {
        this.f29242i = coreGiftInfo;
        this.f29243j = ltjVar;
        this.f29245l = z2;
        if (TextUtils.equals(coreGiftInfo.f56011id, "o_diamond_gift_id")) {
            qib0.f154691G.m102354Y0(this.f29237d, c3c0.f78581M5);
        } else if (z2 || TextUtils.isEmpty(coreGiftInfo.extra.grayURL)) {
            bkb0 bkb0Var = qib0.f154691G;
            VDraweeView vDraweeView = this.f29237d;
            String str = coreGiftInfo.url;
            int i = t100.f167275x;
            bkb0Var.m102325I0(vDraweeView, str, i, i);
        } else {
            bkb0 bkb0Var2 = qib0.f154691G;
            VDraweeView vDraweeView2 = this.f29237d;
            String str2 = coreGiftInfo.extra.grayURL;
            int i2 = t100.f167275x;
            bkb0Var2.m102325I0(vDraweeView2, str2, i2, i2);
        }
        m45497b0();
        m45498c0();
        m45500g0();
        xdl0.m208329E0(this.f29240g, new View.OnClickListener() { // from class: l.tqj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f171596a.m45493X(ltjVar, coreGiftInfo, d30Var, view);
            }
        });
        ltjVar.m151697h(coreGiftInfo);
        int i3 = coreGiftInfo.quota;
        VText vText = this.f29238e;
        if (i3 == 0) {
            vText.setTextColor(getResources().getColor(a1c0.f67159m));
            this.f29239f.setTextColor(getResources().getColor(a1c0.f67165s));
            this.f29237d.setAlpha(0.5f);
        } else {
            vText.setTextColor(getResources().getColor(a1c0.f67152f));
            this.f29239f.setTextColor(getResources().getColor(a1c0.f67159m));
            this.f29237d.setAlpha(1.0f);
        }
        setSelected(z);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m45496a0() {
        boolean zEquals = this.f29242i.f56011id.equals("o_diamond_gift_id");
        VText vText = this.f29240g;
        if (zEquals) {
            vText.setText("解锁");
        } else {
            vText.setText("赠送");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f29237d.getLayoutParams();
        marginLayoutParams.topMargin = t100.f167259h;
        int i = t100.f167275x;
        marginLayoutParams.height = i;
        marginLayoutParams.width = i;
        xdl0.m208360X(this.f29238e, 0);
        xdl0.m208344M(this.f29240g, true);
    }

    /* JADX INFO: renamed from: b0 */
    public final void m45497b0() {
        PrivilegeGift privilegeGiftM118053Q3 = CoreModule.f17545c.f19643f1.m118053Q3(this.f29242i.f56011id);
        if ((!m45491V(privilegeGiftM118053Q3) || CoreModule.m29935P().m94656g().mo35008Fd() || CoreModule.m29935P().m94656g().mo35011Fs()) && (!m45489S(privilegeGiftM118053Q3) || CoreModule.m29935P().m94656g().mo35011Fs())) {
            this.f29238e.setText(this.f29242i.name);
        } else {
            this.f29238e.setText(this.f29242i.extra.style.tag.privilegeName);
        }
        try {
            if (!m45487Q(this.f29242i) || TextUtils.isEmpty(this.f29242i.extra.style.nameColor)) {
                return;
            }
            this.f29238e.setTextColor(Color.parseColor(this.f29242i.extra.style.nameColor));
        } catch (Exception e) {
            CrashHelper.m81299f(e, "b_core_gift", CrashHelper.ReportLevel.p9, 10);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final void m45498c0() {
        if (!m45488R()) {
            xdl0.m208344M(this.f29241h, false);
            return;
        }
        try {
            if (NullChecker.m81303a(this.f29242i.extra.style.tag.backgroundColors) && this.f29242i.extra.style.tag.backgroundColors.size() > 1) {
                GradientDrawable gradientDrawable = (GradientDrawable) this.f29241h.getBackground();
                gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
                gradientDrawable.setColors(new int[]{Color.parseColor(this.f29242i.extra.style.tag.backgroundColors.get(0)), Color.parseColor(this.f29242i.extra.style.tag.backgroundColors.get(1))});
                this.f29241h.setBackground(gradientDrawable.mutate());
            }
            this.f29241h.setText(this.f29242i.extra.style.tag.text);
            PrivilegeGift privilegeGiftM118053Q3 = CoreModule.f17545c.f19643f1.m118053Q3(this.f29242i.f56011id);
            if (NullChecker.m81303a(privilegeGiftM118053Q3) && privilegeGiftM118053Q3.highProbabilityBuyUser && m45490T(privilegeGiftM118053Q3)) {
                zvf0.m220402x("e_chat_gift_bar_special_label", this.f29243j.m151705t().m98810L());
            }
            xdl0.m208344M(this.f29241h, true);
        } catch (Throwable unused) {
            xdl0.m208344M(this.f29241h, false);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final void m45499e0() {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f29237d.getLayoutParams();
        marginLayoutParams.topMargin = t100.m186890d(11.0f);
        int i = t100.f167231F;
        marginLayoutParams.height = i;
        marginLayoutParams.width = i;
        xdl0.m208360X(this.f29238e, t100.f167255d);
        xdl0.m208344M(this.f29240g, false);
    }

    /* JADX INFO: renamed from: g0 */
    public final void m45500g0() {
        PrivilegeGift privilegeGiftM118053Q3 = CoreModule.f17545c.f19643f1.m118053Q3(this.f29242i.f56011id);
        if (CoreModule.m29935P().m94658i().mo158371f() && TextUtils.equals("o_diamond_gift_id", this.f29242i.f56011id)) {
            zvf0.m220402x("e_unlimit_sayhi_diamond", this.f29243j.m151705t().m98810L());
            this.f29239f.setText("无需送礼随时打招呼");
            return;
        }
        if (!m45491V(privilegeGiftM118053Q3) && !m45489S(privilegeGiftM118053Q3)) {
            int i = (int) this.f29242i.unitCoinPrice;
            VMarqueeText vMarqueeText = this.f29239f;
            if (i == 0) {
                vMarqueeText.setText("免费");
                return;
            } else {
                vMarqueeText.setText(String.format(Locale.getDefault(), "%d 探探币", Integer.valueOf((int) this.f29242i.unitCoinPrice)));
                return;
            }
        }
        if (m45491V(privilegeGiftM118053Q3) && CoreModule.m29935P().m94656g().mo35011Fs()) {
            this.f29239f.setText("SVIP尊享");
            return;
        }
        if ((m45491V(privilegeGiftM118053Q3) && (CoreModule.m29935P().m94656g().mo35008Fd() || CoreModule.m29935P().m94656g().mo35011Fs())) || (m45489S(privilegeGiftM118053Q3) && CoreModule.m29935P().m94656g().mo35011Fs())) {
            this.f29239f.setText(this.f29242i.extra.style.tag.privilegeName);
        } else {
            this.f29239f.setText(CoreModule.f17554l.m94658i().mo158350b1(ProductCategory.get(m45491V(privilegeGiftM118053Q3) ? ProductCategory.tttVip : "svip")));
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f29244k;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m45486P(this);
    }

    @Override // p147v.VRelative, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (isSelected()) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.f29244k != z) {
            setSelected(z);
        }
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        this.f29244k = z;
        if (z) {
            m45496a0();
        } else {
            m45499e0();
        }
        if (TextUtils.equals("o_diamond_gift_id", this.f29242i.f56011id)) {
            e51.m114742G(new Runnable() { // from class: l.sqj
                @Override // java.lang.Runnable
                public final void run() {
                    this.f165989a.m45494Y();
                }
            });
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f29244k);
        boolean z = this.f29244k;
        ltj ltjVar = this.f29243j;
        if (z) {
            ltjVar.m151706u(this.f29242i);
        } else {
            ltjVar.m151709x();
        }
    }

    public GiftInnerPagerItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GiftInnerPagerItemView(Context context) {
        this(context, null);
    }
}
