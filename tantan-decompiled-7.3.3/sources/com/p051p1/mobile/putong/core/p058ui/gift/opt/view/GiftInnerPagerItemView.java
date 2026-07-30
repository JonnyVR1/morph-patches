package com.p051p1.mobile.putong.core.p058ui.gift.opt.view;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.CoreGiftInfo;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PrivilegeGift;
import com.p051p1.mobile.putong.core.data.PrivilegeGiftType;
import com.p051p1.mobile.putong.core.data.ProductCategory;
import com.p051p1.mobile.putong.core.p058ui.gift.opt.view.GiftInnerPagerItemView;
import com.p051p1.mobile.putong.data.CoreGiftPanelName;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.Locale;
import p151v.VDraweeView;
import p151v.VMarqueeText;
import p151v.VRelative;
import p151v.VText;
import p153l.bnl0;
import p153l.bwj;
import p153l.fsb0;
import p153l.g9c0;
import p153l.i4g0;
import p153l.ibc0;
import p153l.jyb;
import p153l.l51;
import p153l.lxj;
import p153l.o1j0;
import p153l.qa00;
import p153l.r1j0;
import p153l.rtj;
import p153l.uqb0;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
public class GiftInnerPagerItemView extends VRelative implements Checkable {

    /* JADX INFO: renamed from: d */
    public VDraweeView f30085d;

    /* JADX INFO: renamed from: e */
    public VText f30086e;

    /* JADX INFO: renamed from: f */
    public VMarqueeText f30087f;

    /* JADX INFO: renamed from: g */
    public VText f30088g;

    /* JADX INFO: renamed from: h */
    public VText f30089h;

    /* JADX INFO: renamed from: i */
    public CoreGiftInfo f30090i;

    /* JADX INFO: renamed from: j */
    public bwj f30091j;

    /* JADX INFO: renamed from: k */
    public boolean f30092k;

    /* JADX INFO: renamed from: l */
    public boolean f30093l;

    public GiftInnerPagerItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f30092k = true;
        this.f30093l = true;
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ void m46661H(Throwable th) {
    }

    /* JADX INFO: renamed from: L */
    public static /* synthetic */ void m46663L(Boolean bool) {
    }

    /* JADX INFO: renamed from: P */
    public final void m46669P(View view) {
        rtj.m183121a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m46670Q(CoreGiftInfo coreGiftInfo) {
        return NullChecker.m82486a(coreGiftInfo) && NullChecker.m82486a(coreGiftInfo.extra) && NullChecker.m82486a(coreGiftInfo.extra.style);
    }

    /* JADX INFO: renamed from: R */
    public final boolean m46671R() {
        CoreGiftInfo coreGiftInfo = this.f30090i;
        boolean z = coreGiftInfo.quota != 0 && this.f30093l && NullChecker.m82486a(coreGiftInfo.extra) && NullChecker.m82486a(this.f30090i.extra.style) && NullChecker.m82486a(this.f30090i.extra.style.tag) && !TextUtils.isEmpty(this.f30090i.extra.style.tag.text);
        if (z) {
            PrivilegeGift privilegeGiftM155891Q3 = CoreModule.f18264c.f20385f1.m155891Q3(this.f30090i.f56859id);
            if (NullChecker.m82486a(privilegeGiftM155891Q3) && privilegeGiftM155891Q3.highProbabilityBuyUser) {
                return m46673T(privilegeGiftM155891Q3);
            }
        }
        return z;
    }

    /* JADX INFO: renamed from: S */
    public final boolean m46672S(PrivilegeGift privilegeGift) {
        return NullChecker.m82486a(privilegeGift) && PrivilegeGiftType.isSVipGift(privilegeGift.privilegeType) && NullChecker.m82486a(this.f30090i.extra.style) && NullChecker.m82486a(this.f30090i.extra.style.tag) && !TextUtils.isEmpty(this.f30090i.extra.style.tag.privilegeName);
    }

    /* JADX INFO: renamed from: T */
    public final boolean m46673T(PrivilegeGift privilegeGift) {
        return this.f30091j.m106709m() && NullChecker.m82486a(privilegeGift) && PrivilegeGiftType.isGreetGift(privilegeGift.privilegeType) && !CoreModule.m30933P().m143410g().mo36014Fs() && CoreModule.f18264c.f20385f1.m155893S3();
    }

    /* JADX INFO: renamed from: V */
    public final boolean m46674V(PrivilegeGift privilegeGift) {
        return NullChecker.m82486a(privilegeGift) && PrivilegeGiftType.isVipGift(privilegeGift.privilegeType) && NullChecker.m82486a(this.f30090i.extra.style) && NullChecker.m82486a(this.f30090i.extra.style.tag) && !TextUtils.isEmpty(this.f30090i.extra.style.tag.privilegeName);
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m46675W(Boolean bool) {
        m46681c0();
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m46676X(final bwj bwjVar, CoreGiftInfo coreGiftInfo, final x20 x20Var, View view) {
        String strM178293F = bwjVar.m106714t().m178293F();
        if (!TextUtils.equals(strM178293F, "from_meet_picks") && !TextUtils.equals(strM178293F, "from_meet_liked")) {
            i4g0.m138523u("e_chat_gift_bar_gift_send", bwjVar.m106714t().m178294G() == CoreGiftPanelName.get("note") ? "p_meet" : bwjVar.m106714t().m178298L(), jyb.m147494Y("chat_gift_id", this.f30090i.f56859id));
        }
        PrivilegeGift privilegeGiftM155891Q3 = CoreModule.f18264c.f20385f1.m155891Q3(coreGiftInfo.f56859id);
        if (CoreModule.m30933P().m143412i().mo180463f() && TextUtils.equals(coreGiftInfo.f56859id, "o_diamond_gift_id")) {
            i4g0.m138520r("e_unlimit_sayhi_diamond", bwjVar.m106714t().m178298L());
            CoreModule.m30933P().m143412i().mo34621wh(bwjVar.m140179b(), "p_chat,gift_odiamond", new y20() { // from class: l.ktj
                @Override // p153l.y20
                public final void call(Object obj) {
                    bwjVar.m106714t().dismiss();
                }
            }, null, null, Privilege.oDiamondGreetings);
            return;
        }
        if (NullChecker.m82486a(privilegeGiftM155891Q3) && privilegeGiftM155891Q3.highProbabilityBuyUser && m46673T(privilegeGiftM155891Q3)) {
            CoreModule.f18264c.f20385f1.m155912l4();
            CoreModule.m30933P().m143412i().mo34365Lf(bwjVar.m140179b(), "p_chat,gift_send", Privilege.greet, null, new y20() { // from class: l.ltj
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f133550a.m46675W((Boolean) obj);
                }
            });
            return;
        }
        if (m46674V(privilegeGiftM155891Q3) && (!CoreModule.m30933P().m143410g().mo36011Fd() || (NullChecker.m82486a(privilegeGiftM155891Q3) && privilegeGiftM155891Q3.remaining <= 0))) {
            if (CoreModule.m30933P().m143410g().mo36011Fd()) {
                r1j0.m179420g("该礼物本月已用完");
                return;
            } else {
                CoreModule.m30933P().m143405a().mo34316Eq(bwjVar.m140179b(), "p_chat,gift_send", new x20() { // from class: l.mtj
                    @Override // p153l.x20
                    public final void call() {
                        this.f138633a.m46681c0();
                    }
                }, Privilege.vip_greet, false, null);
                return;
            }
        }
        if (!m46672S(privilegeGiftM155891Q3) || (CoreModule.m30933P().m143410g().mo36014Fs() && (!NullChecker.m82486a(privilegeGiftM155891Q3) || privilegeGiftM155891Q3.remaining > 0))) {
            if (coreGiftInfo.quota == 0) {
                o1j0.m165652z(coreGiftInfo.extra.noQuotaToast, bwjVar.m106714t().getWindow().getDecorView());
                return;
            } else {
                bwjVar.m106716v(coreGiftInfo);
                return;
            }
        }
        if (CoreModule.m30933P().m143410g().mo36014Fs()) {
            r1j0.m179420g("该礼物本月已用完");
        } else {
            CoreModule.m30933P().m143412i().mo34365Lf(bwjVar.m140179b(), "p_chat,gift_send", Privilege.svip_greet, new y20() { // from class: l.ntj
                @Override // p153l.y20
                public final void call(Object obj) {
                    bwjVar.duringCreated(CoreModule.f18264c.f20297C0.m146425v4()).subscribe(psd0.m173597H(new y20() { // from class: l.ptj
                        @Override // p153l.y20
                        public final void call(Object obj2) {
                            x20Var.call();
                        }
                    }, new y20() { // from class: l.qtj
                        @Override // p153l.y20
                        public final void call(Object obj2) {
                            GiftInnerPagerItemView.m46661H((Throwable) obj2);
                        }
                    }));
                }
            }, new y20() { // from class: l.otj
                @Override // p153l.y20
                public final void call(Object obj) {
                    GiftInnerPagerItemView.m46663L((Boolean) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m46677Y() {
        this.f30087f.onWindowFocusChanged(true);
    }

    /* JADX INFO: renamed from: Z */
    public void m46678Z(lxj lxjVar, final bwj bwjVar, final CoreGiftInfo coreGiftInfo, boolean z, boolean z2, final x20 x20Var) {
        this.f30090i = coreGiftInfo;
        this.f30091j = bwjVar;
        this.f30093l = z2;
        if (TextUtils.equals(coreGiftInfo.f56859id, "o_diamond_gift_id")) {
            uqb0.f180374G.m127138Y0(this.f30085d, ibc0.f113856M5);
        } else if (z2 || TextUtils.isEmpty(coreGiftInfo.extra.grayURL)) {
            fsb0 fsb0Var = uqb0.f180374G;
            VDraweeView vDraweeView = this.f30085d;
            String str = coreGiftInfo.url;
            int i = qa00.f156337x;
            fsb0Var.m127109I0(vDraweeView, str, i, i);
        } else {
            fsb0 fsb0Var2 = uqb0.f180374G;
            VDraweeView vDraweeView2 = this.f30085d;
            String str2 = coreGiftInfo.extra.grayURL;
            int i2 = qa00.f156337x;
            fsb0Var2.m127109I0(vDraweeView2, str2, i2, i2);
        }
        m46680b0();
        m46681c0();
        m46683g0();
        bnl0.m105509E0(this.f30088g, new View.OnClickListener() { // from class: l.jtj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f122595a.m46676X(bwjVar, coreGiftInfo, x20Var, view);
            }
        });
        bwjVar.m106706h(coreGiftInfo);
        int i3 = coreGiftInfo.quota;
        VText vText = this.f30086e;
        if (i3 == 0) {
            vText.setTextColor(getResources().getColor(g9c0.f102823m));
            this.f30087f.setTextColor(getResources().getColor(g9c0.f102829s));
            this.f30085d.setAlpha(0.5f);
        } else {
            vText.setTextColor(getResources().getColor(g9c0.f102816f));
            this.f30087f.setTextColor(getResources().getColor(g9c0.f102823m));
            this.f30085d.setAlpha(1.0f);
        }
        setSelected(z);
    }

    /* JADX INFO: renamed from: a0 */
    public final void m46679a0() {
        boolean zEquals = this.f30090i.f56859id.equals("o_diamond_gift_id");
        VText vText = this.f30088g;
        if (zEquals) {
            vText.setText("解锁");
        } else {
            vText.setText("赠送");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f30085d.getLayoutParams();
        marginLayoutParams.topMargin = qa00.f156321h;
        int i = qa00.f156337x;
        marginLayoutParams.height = i;
        marginLayoutParams.width = i;
        bnl0.m105540X(this.f30086e, 0);
        bnl0.m105524M(this.f30088g, true);
    }

    /* JADX INFO: renamed from: b0 */
    public final void m46680b0() {
        PrivilegeGift privilegeGiftM155891Q3 = CoreModule.f18264c.f20385f1.m155891Q3(this.f30090i.f56859id);
        if ((!m46674V(privilegeGiftM155891Q3) || CoreModule.m30933P().m143410g().mo36011Fd() || CoreModule.m30933P().m143410g().mo36014Fs()) && (!m46672S(privilegeGiftM155891Q3) || CoreModule.m30933P().m143410g().mo36014Fs())) {
            this.f30086e.setText(this.f30090i.name);
        } else {
            this.f30086e.setText(this.f30090i.extra.style.tag.privilegeName);
        }
        try {
            if (!m46670Q(this.f30090i) || TextUtils.isEmpty(this.f30090i.extra.style.nameColor)) {
                return;
            }
            this.f30086e.setTextColor(Color.parseColor(this.f30090i.extra.style.nameColor));
        } catch (Exception e) {
            CrashHelper.m82482f(e, "b_core_gift", CrashHelper.ReportLevel.p9, 10);
        }
    }

    /* JADX INFO: renamed from: c0 */
    public final void m46681c0() {
        if (!m46671R()) {
            bnl0.m105524M(this.f30089h, false);
            return;
        }
        try {
            if (NullChecker.m82486a(this.f30090i.extra.style.tag.backgroundColors) && this.f30090i.extra.style.tag.backgroundColors.size() > 1) {
                GradientDrawable gradientDrawable = (GradientDrawable) this.f30089h.getBackground();
                gradientDrawable.setOrientation(GradientDrawable.Orientation.LEFT_RIGHT);
                gradientDrawable.setColors(new int[]{Color.parseColor(this.f30090i.extra.style.tag.backgroundColors.get(0)), Color.parseColor(this.f30090i.extra.style.tag.backgroundColors.get(1))});
                this.f30089h.setBackground(gradientDrawable.mutate());
            }
            this.f30089h.setText(this.f30090i.extra.style.tag.text);
            PrivilegeGift privilegeGiftM155891Q3 = CoreModule.f18264c.f20385f1.m155891Q3(this.f30090i.f56859id);
            if (NullChecker.m82486a(privilegeGiftM155891Q3) && privilegeGiftM155891Q3.highProbabilityBuyUser && m46673T(privilegeGiftM155891Q3)) {
                i4g0.m138526x("e_chat_gift_bar_special_label", this.f30091j.m106714t().m178298L());
            }
            bnl0.m105524M(this.f30089h, true);
        } catch (Throwable unused) {
            bnl0.m105524M(this.f30089h, false);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final void m46682e0() {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f30085d.getLayoutParams();
        marginLayoutParams.topMargin = qa00.m175859d(11.0f);
        int i = qa00.f156293F;
        marginLayoutParams.height = i;
        marginLayoutParams.width = i;
        bnl0.m105540X(this.f30086e, qa00.f156317d);
        bnl0.m105524M(this.f30088g, false);
    }

    /* JADX INFO: renamed from: g0 */
    public final void m46683g0() {
        PrivilegeGift privilegeGiftM155891Q3 = CoreModule.f18264c.f20385f1.m155891Q3(this.f30090i.f56859id);
        if (CoreModule.m30933P().m143412i().mo180463f() && TextUtils.equals("o_diamond_gift_id", this.f30090i.f56859id)) {
            i4g0.m138526x("e_unlimit_sayhi_diamond", this.f30091j.m106714t().m178298L());
            this.f30087f.setText("无需送礼随时打招呼");
            return;
        }
        if (!m46674V(privilegeGiftM155891Q3) && !m46672S(privilegeGiftM155891Q3)) {
            int i = (int) this.f30090i.unitCoinPrice;
            VMarqueeText vMarqueeText = this.f30087f;
            if (i == 0) {
                vMarqueeText.setText("免费");
                return;
            } else {
                vMarqueeText.setText(String.format(Locale.getDefault(), "%d 探探币", Integer.valueOf((int) this.f30090i.unitCoinPrice)));
                return;
            }
        }
        if (m46674V(privilegeGiftM155891Q3) && CoreModule.m30933P().m143410g().mo36014Fs()) {
            this.f30087f.setText("SVIP尊享");
            return;
        }
        if ((m46674V(privilegeGiftM155891Q3) && (CoreModule.m30933P().m143410g().mo36011Fd() || CoreModule.m30933P().m143410g().mo36014Fs())) || (m46672S(privilegeGiftM155891Q3) && CoreModule.m30933P().m143410g().mo36014Fs())) {
            this.f30087f.setText(this.f30090i.extra.style.tag.privilegeName);
        } else {
            this.f30087f.setText(CoreModule.f18273l.m143412i().mo180442b1(ProductCategory.get(m46674V(privilegeGiftM155891Q3) ? ProductCategory.tttVip : "svip")));
        }
    }

    @Override // android.widget.Checkable
    public boolean isChecked() {
        return this.f30092k;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m46669P(this);
    }

    @Override // p151v.VRelative, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (isSelected()) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (this.f30092k != z) {
            setSelected(z);
        }
    }

    @Override // android.view.View
    public void setSelected(boolean z) {
        super.setSelected(z);
        this.f30092k = z;
        if (z) {
            m46679a0();
        } else {
            m46682e0();
        }
        if (TextUtils.equals("o_diamond_gift_id", this.f30090i.f56859id)) {
            l51.m152887G(new Runnable() { // from class: l.itj
                @Override // java.lang.Runnable
                public final void run() {
                    this.f116848a.m46677Y();
                }
            });
        }
    }

    @Override // android.widget.Checkable
    public void toggle() {
        setChecked(!this.f30092k);
        boolean z = this.f30092k;
        bwj bwjVar = this.f30091j;
        if (z) {
            bwjVar.m106715u(this.f30090i);
        } else {
            bwjVar.m106718x();
        }
    }

    public GiftInnerPagerItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GiftInnerPagerItemView(Context context) {
        this(context, null);
    }
}
