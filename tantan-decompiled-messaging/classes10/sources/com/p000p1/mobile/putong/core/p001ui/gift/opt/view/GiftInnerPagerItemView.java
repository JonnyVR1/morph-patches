package com.p000p1.mobile.putong.core.p001ui.gift.opt.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import com.p000p1.mobile.putong.core.data.CoreGiftInfo;
import com.p000p1.mobile.putong.core.data.Privilege;
import com.p000p1.mobile.putong.core.data.PrivilegeGift;
import com.p000p1.mobile.putong.core.data.PrivilegeGiftType;
import com.p000p1.mobile.putong.core.data.ProductCategory;
import com.p000p1.mobile.putong.core.p001ui.gift.opt.view.GiftInnerPagerItemView;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.CoreGiftPanelName;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Locale;
import l.bkb0;
import l.d30;
import l.e30;
import l.e51;
import l.j760;
import l.lsi0;
import l.mkd0;
import l.osi0;
import l.qib0;
import l.t100;
import l.vwb;
import l.xdl0;
import l.zvf0;
import p003l.a1c0;
import p003l.brj;
import p003l.c3c0;
import p003l.ltj;
import p003l.vuj;
import v.VDraweeView;
import v.VMarqueeText;
import v.VRelative;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class GiftInnerPagerItemView extends VRelative implements Checkable {

    /* JADX INFO: renamed from: d */
    public VDraweeView f1631d;

    /* JADX INFO: renamed from: e */
    public VText f1632e;

    /* JADX INFO: renamed from: f */
    public VMarqueeText f1633f;

    /* JADX INFO: renamed from: g */
    public VText f1634g;

    /* JADX INFO: renamed from: h */
    public VText f1635h;

    /* JADX INFO: renamed from: i */
    public CoreGiftInfo f1636i;

    /* JADX INFO: renamed from: j */
    public ltj f1637j;

    /* JADX INFO: renamed from: k */
    public boolean f1638k;

    /* JADX INFO: renamed from: l */
    public boolean f1639l;

    public GiftInnerPagerItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1638k = true;
        this.f1639l = true;
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m2814H(Throwable th) {
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ void m2816L(Boolean bool) {
    }

    /* JADX INFO: renamed from: P */
    public final void m2822P(View view) {
        brj.m5784a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m2823Q(CoreGiftInfo coreGiftInfo) {
        return NullChecker.a(coreGiftInfo) && NullChecker.a(coreGiftInfo.extra) && NullChecker.a(coreGiftInfo.extra.style);
    }

    /* JADX INFO: renamed from: R */
    public final boolean m2824R() {
        CoreGiftInfo coreGiftInfo = this.f1636i;
        boolean z = coreGiftInfo.quota != 0 && this.f1639l && NullChecker.a(coreGiftInfo.extra) && NullChecker.a(this.f1636i.extra.style) && NullChecker.a(this.f1636i.extra.style.tag) && !TextUtils.isEmpty(this.f1636i.extra.style.tag.text);
        if (z) {
            PrivilegeGift privilegeGiftQ3 = CoreModule.c.f1.Q3(((DbObject) this.f1636i).id);
            if (NullChecker.a(privilegeGiftQ3) && privilegeGiftQ3.highProbabilityBuyUser) {
                return m2826T(privilegeGiftQ3);
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: S */
    public final boolean m2825S(PrivilegeGift privilegeGift) {
        return NullChecker.a(privilegeGift) && PrivilegeGiftType.isSVipGift(privilegeGift.privilegeType) && NullChecker.a(this.f1636i.extra.style) && NullChecker.a(this.f1636i.extra.style.tag) && !TextUtils.isEmpty(this.f1636i.extra.style.tag.privilegeName);
    }

    /* JADX INFO: renamed from: T */
    public final boolean m2826T(PrivilegeGift privilegeGift) {
        return this.f1637j.m7909m() && NullChecker.a(privilegeGift) && PrivilegeGiftType.isGreetGift(privilegeGift.privilegeType) && !CoreModule.P().g().Fs() && CoreModule.c.f1.S3();
    }

    /* JADX INFO: renamed from: V */
    public final boolean m2827V(PrivilegeGift privilegeGift) {
        return NullChecker.a(privilegeGift) && PrivilegeGiftType.isVipGift(privilegeGift.privilegeType) && NullChecker.a(this.f1636i.extra.style) && NullChecker.a(this.f1636i.extra.style.tag) && !TextUtils.isEmpty(this.f1636i.extra.style.tag.privilegeName);
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m2828W(Boolean bool) {
        m2834c0();
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m2829X(final ltj ltjVar, CoreGiftInfo coreGiftInfo, final d30 d30Var, View view) {
        String strM5630F = ltjVar.m7914t().m5630F();
        if (!TextUtils.equals(strM5630F, "from_meet_picks") && !TextUtils.equals(strM5630F, "from_meet_liked")) {
            zvf0.u("e_chat_gift_bar_gift_send", ltjVar.m7914t().m5631G() == CoreGiftPanelName.get("note") ? "p_meet" : ltjVar.m7914t().m5635L(), new j760[]{vwb.Y("chat_gift_id", ((DbObject) this.f1636i).id)});
        }
        PrivilegeGift privilegeGiftQ3 = CoreModule.c.f1.Q3(((DbObject) coreGiftInfo).id);
        if (CoreModule.P().i().f() && TextUtils.equals(((DbObject) coreGiftInfo).id, "o_diamond_gift_id")) {
            zvf0.r("e_unlimit_sayhi_diamond", ltjVar.m7914t().m5635L());
            CoreModule.P().i().wh(ltjVar.b(), "p_chat,gift_odiamond", new e30() { // from class: l.uqj
                public final void call(Object obj) {
                    ltjVar.m7914t().dismiss();
                }
            }, (d30) null, (d30) null, Privilege.oDiamondGreetings);
            return;
        }
        if (NullChecker.a(privilegeGiftQ3) && privilegeGiftQ3.highProbabilityBuyUser && m2826T(privilegeGiftQ3)) {
            CoreModule.c.f1.l4();
            CoreModule.P().i().Lf(ltjVar.b(), "p_chat,gift_send", Privilege.greet, (e30) null, new e30() { // from class: l.vqj
                public final void call(Object obj) {
                    this.f8027a.m2828W((Boolean) obj);
                }
            });
            return;
        }
        if (m2827V(privilegeGiftQ3) && (!CoreModule.P().g().Fd() || (NullChecker.a(privilegeGiftQ3) && privilegeGiftQ3.remaining <= 0))) {
            if (CoreModule.P().g().Fd()) {
                osi0.g("该礼物本月已用完");
                return;
            } else {
                CoreModule.P().a().Eq(ltjVar.b(), "p_chat,gift_send", new d30() { // from class: l.wqj
                    public final void call() {
                        this.f8223a.m2834c0();
                    }
                }, Privilege.vip_greet, false, (User) null);
                return;
            }
        }
        if (!m2825S(privilegeGiftQ3) || (CoreModule.P().g().Fs() && (!NullChecker.a(privilegeGiftQ3) || privilegeGiftQ3.remaining > 0))) {
            if (coreGiftInfo.quota == 0) {
                lsi0.z(coreGiftInfo.extra.noQuotaToast, ltjVar.m7914t().getWindow().getDecorView());
                return;
            } else {
                ltjVar.m7916v(coreGiftInfo);
                return;
            }
        }
        if (CoreModule.P().g().Fs()) {
            osi0.g("该礼物本月已用完");
        } else {
            CoreModule.P().i().Lf(ltjVar.b(), "p_chat,gift_send", Privilege.svip_greet, new e30() { // from class: l.xqj
                public final void call(Object obj) {
                    ltjVar.duringCreated(CoreModule.c.C0.u4()).subscribe(mkd0.H(new e30() { // from class: l.zqj
                        public final void call(Object obj2) {
                            d30Var.call();
                        }
                    }, new e30() { // from class: l.arj
                        public final void call(Object obj2) {
                            GiftInnerPagerItemView.m2814H((Throwable) obj2);
                        }
                    }));
                }
            }, new e30() { // from class: l.yqj
                public final void call(Object obj) {
                    GiftInnerPagerItemView.m2816L((Boolean) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m2830Y() {
        this.f1633f.onWindowFocusChanged(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Z */
    public void m2831Z(vuj vujVar, final ltj ltjVar, final CoreGiftInfo coreGiftInfo, boolean z, boolean z2, final d30 d30Var) {
        this.f1636i = coreGiftInfo;
        this.f1637j = ltjVar;
        this.f1639l = z2;
        if (TextUtils.equals(((DbObject) coreGiftInfo).id, "o_diamond_gift_id")) {
            qib0.G.Y0(this.f1631d, c3c0.f3618M5);
        } else if (z2 || TextUtils.isEmpty(coreGiftInfo.extra.grayURL)) {
            bkb0 bkb0Var = qib0.G;
            VDraweeView vDraweeView = this.f1631d;
            String str = coreGiftInfo.url;
            int i = t100.x;
            bkb0Var.I0(vDraweeView, str, i, i);
        } else {
            bkb0 bkb0Var2 = qib0.G;
            VDraweeView vDraweeView2 = this.f1631d;
            String str2 = coreGiftInfo.extra.grayURL;
            int i2 = t100.x;
            bkb0Var2.I0(vDraweeView2, str2, i2, i2);
        }
        m2833b0();
        m2834c0();
        m2836g0();
        xdl0.E0(this.f1634g, new View.OnClickListener() { // from class: l.tqj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f7608a.m2829X(ltjVar, coreGiftInfo, d30Var, view);
            }
        });
        ltjVar.m7906h(coreGiftInfo);
        int i3 = coreGiftInfo.quota;
        VText vText = this.f1632e;
        if (i3 == 0) {
            vText.setTextColor(getResources().getColor(a1c0.f2705m));
            this.f1633f.setTextColor(getResources().getColor(a1c0.f2711s));
            this.f1631d.setAlpha(0.5f);
        } else {
            vText.setTextColor(getResources().getColor(a1c0.f2698f));
            this.f1633f.setTextColor(getResources().getColor(a1c0.f2705m));
            this.f1631d.setAlpha(1.0f);
        }
        setSelected(z);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m2832a0() {
        boolean zEquals = ((DbObject) this.f1636i).id.equals("o_diamond_gift_id");
        VText vText = this.f1634g;
        if (zEquals) {
            vText.setText("解锁");
        } else {
            vText.setText("赠送");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1631d.getLayoutParams();
        marginLayoutParams.topMargin = t100.h;
        int i = t100.x;
        marginLayoutParams.height = i;
        marginLayoutParams.width = i;
        xdl0.X(this.f1632e, 0);
        xdl0.M(this.f1634g, true);
    }

    /* JADX INFO: renamed from: b0 */
    public final void m2833b0() {
        PrivilegeGift privilegeGiftQ3 = CoreModule.c.f1.Q3(((DbObject) this.f1636i).id);
        if ((!m2827V(privilegeGiftQ3) || CoreModule.P().g().Fd() || CoreModule.P().g().Fs()) && (!m2825S(privilegeGiftQ3) || CoreModule.P().g().Fs())) {
            this.f1632e.setText(this.f1636i.name);
        } else {
            this.f1632e.setText(this.f1636i.extra.style.tag.privilegeName);
        }
        try {
            if (!m2823Q(this.f1636i) || TextUtils.isEmpty(this.f1636i.extra.style.nameColor)) {
                return;
            }
            this.f1632e.setTextColor(Color.parseColor(this.f1636i.extra.style.nameColor));
        } catch (Exception e) {
            CrashHelper.f(e, "b_core_gift", CrashHelper.ReportLevel.p9, 10);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final void m2834c0() {
        if (!m2824R()) {
            xdl0.M(this.f1635h, false);
            return;
        }
        try {
            if (NullChecker.a(this.f1636i.extra.style.tag.backgroundColors) && this.f1636i.extra.style.tag.backgroundColors.size() > 1) {
                GradientDrawable gradientDrawable = (GradientDrawable) this.f1635h.getBackground();
                gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
                gradientDrawable.setColors(new int[]{Color.parseColor(this.f1636i.extra.style.tag.backgroundColors.get(0)), Color.parseColor(this.f1636i.extra.style.tag.backgroundColors.get(1))});
                this.f1635h.setBackground(gradientDrawable.mutate());
            }
            this.f1635h.setText(this.f1636i.extra.style.tag.text);
            PrivilegeGift privilegeGiftQ3 = CoreModule.c.f1.Q3(((DbObject) this.f1636i).id);
            if (NullChecker.a(privilegeGiftQ3) && privilegeGiftQ3.highProbabilityBuyUser && m2826T(privilegeGiftQ3)) {
                zvf0.x("e_chat_gift_bar_special_label", this.f1637j.m7914t().m5635L());
            }
            xdl0.M(this.f1635h, true);
        } catch (Throwable unused) {
            xdl0.M(this.f1635h, false);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final void m2835e0() {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f1631d.getLayoutParams();
        marginLayoutParams.topMargin = t100.d(11.0f);
        int i = t100.F;
        marginLayoutParams.height = i;
        marginLayoutParams.width = i;
        xdl0.X(this.f1632e, t100.d);
        xdl0.M(this.f1634g, false);
    }

    /* JADX INFO: renamed from: g0 */
    public final void m2836g0() {
        PrivilegeGift privilegeGiftQ3 = CoreModule.c.f1.Q3(((DbObject) this.f1636i).id);
        if (CoreModule.P().i().f() && TextUtils.equals("o_diamond_gift_id", ((DbObject) this.f1636i).id)) {
            zvf0.x("e_unlimit_sayhi_diamond", this.f1637j.m7914t().m5635L());
            this.f1633f.setText("无需送礼随时打招呼");
            return;
        }
        if (!m2827V(privilegeGiftQ3) && !m2825S(privilegeGiftQ3)) {
            int i = (int) this.f1636i.unitCoinPrice;
            VMarqueeText vMarqueeText = this.f1633f;
            if (i == 0) {
                vMarqueeText.setText("免费");
                return;
            } else {
                vMarqueeText.setText(String.format(Locale.getDefault(), "%d 探探币", Integer.valueOf((int) this.f1636i.unitCoinPrice)));
                return;
            }
        }
        if (m2827V(privilegeGiftQ3) && CoreModule.P().g().Fs()) {
            this.f1633f.setText("SVIP尊享");
            return;
        }
        if ((m2827V(privilegeGiftQ3) && (CoreModule.P().g().Fd() || CoreModule.P().g().Fs())) || (m2825S(privilegeGiftQ3) && CoreModule.P().g().Fs())) {
            this.f1633f.setText(this.f1636i.extra.style.tag.privilegeName);
        } else {
            this.f1633f.setText(CoreModule.l.i().b1(ProductCategory.get(m2827V(privilegeGiftQ3) ? ProductCategory.tttVip : "svip")));
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f1638k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m2822P(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (isSelected()) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.f1638k != z) {
            setSelected(z);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setSelected(boolean z) {
        super/*android.view.View*/.setSelected(z);
        this.f1638k = z;
        if (z) {
            m2832a0();
        } else {
            m2835e0();
        }
        if (TextUtils.equals("o_diamond_gift_id", ((DbObject) this.f1636i).id)) {
            e51.G(new Runnable() { // from class: l.sqj
                @Override // java.lang.Runnable
                public final void run() {
                    this.f7439a.m2830Y();
                }
            });
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f1638k);
        boolean z = this.f1638k;
        ltj ltjVar = this.f1637j;
        if (z) {
            ltjVar.m7915u(this.f1636i);
        } else {
            ltjVar.m7918x();
        }
    }

    public GiftInnerPagerItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GiftInnerPagerItemView(Context context) {
        this(context, null);
    }
}
