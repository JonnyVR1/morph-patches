package com.p000p1.mobile.putong.core.p004ui.vip.privilege.dlg;

import android.content.Context;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p000p1.mobile.putong.app.PutongFrag;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.biz.service.CorePayInnerService;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.RoamedLocationData;
import com.p1.mobile.putong.core.member.R;
import com.p1.mobile.putong.core.ui.likedusers.tablayout.NewMyLikedUsersAct;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantan.library.svga.compose.SVGADynamicEntity;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.eqh0;
import l.ftd0;
import l.hu80;
import l.k6c0;
import l.mb90;
import l.mkd0;
import l.o7r;
import l.s5h0;
import l.sab0;
import l.t100;
import l.x4c0;
import l.xdl0;
import l.zz6;
import p006l.gr9;
import p006l.qib0;
import p006l.ura;
import p006l.wx80;
import v.VDraweeView;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class PrivilegeContentDlgItemView extends VLinear {

    /* JADX INFO: renamed from: c */
    public FrameLayout f7552c;

    /* JADX INFO: renamed from: d */
    public VText f7553d;

    /* JADX INFO: renamed from: e */
    public TextView f7554e;

    /* JADX INFO: renamed from: f */
    public TextView f7555f;

    /* JADX INFO: renamed from: g */
    public RoamedLocationData f7556g;

    /* JADX INFO: renamed from: h */
    public PurchaseType f7557h;

    /* JADX INFO: renamed from: i */
    public C0444a.e f7558i;

    /* JADX INFO: renamed from: j */
    public PutongFrag f7559j;

    /* JADX INFO: renamed from: k */
    public Privilege f7560k;

    /* JADX INFO: renamed from: l */
    public Act f7561l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.dlg.PrivilegeContentDlgItemView$a */
    public static /* synthetic */ class C0440a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f7562a;

        static {
            int[] iArr = new int[Privilege.values().length];
            f7562a = iArr;
            try {
                iArr[Privilege.top_like.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7562a[Privilege.top_chat.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7562a[Privilege.vip_badge.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7562a[Privilege.svip_badge.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7562a[Privilege.vip_super_like.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7562a[Privilege.vip_undo.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7562a[Privilege.vip_unlimited_likes.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f7562a[Privilege.vip_location.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f7562a[Privilege.message_read_state.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f7562a[Privilege.advanced_filter.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f7562a[Privilege.letter.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f7562a[Privilege.greet.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f7562a[Privilege.vip_greet.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f7562a[Privilege.svip_greet.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f7562a[Privilege.privacy_membership.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f7562a[Privilege.recover_unmatches.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f7562a[Privilege.see_who_likes_me.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f7562a[Privilege.online_match_tickets.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f7562a[Privilege.voice_quick_chat.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f7562a[Privilege.boost.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f7562a[Privilege.liked_user.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f7562a[Privilege.customer_service.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f7562a[Privilege.oDiamondSvipSkin.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f7562a[Privilege.oDiamondVisitor.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f7562a[Privilege.oDiamondGreetings.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f7562a[Privilege.picksMembership.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f7562a[Privilege.oDiamondSvipExtra.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f7562a[Privilege.immediately_match.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f7562a[Privilege.leave_message.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f7562a[Privilege.live_entry_animation.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f7562a[Privilege.say_hi_pkg.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f7562a[Privilege.moment_boost.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f7562a[Privilege.accelerate_pairing.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f7562a[Privilege.city_topping.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f7562a[Privilege.personal_customization.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f7562a[Privilege.mysterious_mode.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f7562a[Privilege.nearby_people.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f7562a[Privilege.exclusive_dressing_up.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                f7562a[Privilege.visitor_hide_footprint.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f7562a[Privilege.confession_first.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f7562a[Privilege.block_harassing_words.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                f7562a[Privilege.ads_not_disturb.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                f7562a[Privilege.pick_tantan_credits_users.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                f7562a[Privilege.unlock_learn_about_him_module.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                f7562a[Privilege.youth_roaming.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                f7562a[Privilege.youth_find_partner.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                f7562a[Privilege.youth_blind_box.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                f7562a[Privilege.youth_superlike.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                f7562a[Privilege.youth_message_read.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                f7562a[Privilege.hide_me_from_nearby.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
        }
    }

    public PrivilegeContentDlgItemView(@NonNull Context context) {
        super(context);
        this.f7556g = RoamedLocationData.new_();
    }

    /* JADX INFO: renamed from: A0 */
    private void m10823A0() {
        CorePayInnerService corePayInnerServiceM11711g = CoreModule.m1854P().m11711g();
        Privilege privilege = Privilege.privacy_membership;
        wx80 wx80VarM6986bf = corePayInnerServiceM11711g.m6986bf(privilege);
        this.f7553d.setText(wx80VarM6986bf.m26849t());
        m10856W0(privilege);
        this.f7554e.setText(wx80VarM6986bf.m26829d());
    }

    /* JADX INFO: renamed from: B0 */
    private void m10824B0() {
        if (sab0.i(this.f7557h)) {
            this.f7553d.setText("无限次在线闪聊");
            boolean zU0 = zz6.u0();
            TextView textView = this.f7554e;
            if (zU0) {
                textView.setText("无限次在线闪聊匹配附近在线的小哥哥，无需相互喜欢，直接在线开聊");
            } else {
                textView.setText("无限次在线闪聊匹配附近在线的小姐姐，无需相互喜欢，直接在线开聊");
            }
            m10856W0(Privilege.online_match_tickets_oDiamond);
            return;
        }
        if (!sab0.u(this.f7557h)) {
            m10856W0(Privilege.online_match_tickets);
            this.f7553d.setText(CoreModule.m1854P().m11706a().m5410bk());
            this.f7554e.setText(String.format(CoreModule.m1854P().m11706a().m5278Il(), CoreModule.m1854P().m11706a().m5284Jj()));
        } else {
            wx80 wx80VarM6950Hm = CoreModule.m1854P().m11711g().m6950Hm(this.f7557h, Privilege.online_match_tickets);
            this.f7553d.setText(wx80VarM6950Hm.m26849t());
            this.f7554e.setText(wx80VarM6950Hm.m26829d());
            m10831X0(zz6.u0() ? "https://static.tancdn.com/pe-webplatform/xeCKbwBwsyO_2S_aqVZBAcih.webp" : "https://static.tancdn.com/pe-webplatform/zcF1NEaP1bhvbIlGHlxTj8AR.webp");
        }
    }

    /* JADX INFO: renamed from: D0 */
    private void m10825D0() {
        CorePayInnerService corePayInnerServiceM11711g = CoreModule.m1854P().m11711g();
        Privilege privilege = Privilege.recover_unmatches;
        wx80 wx80VarM6986bf = corePayInnerServiceM11711g.m6986bf(privilege);
        this.f7553d.setText(wx80VarM6986bf.m26849t());
        m10856W0(privilege);
        this.f7554e.setText(wx80VarM6986bf.m26846q());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H0 */
    private void m10826H0() {
        CorePayInnerService corePayInnerServiceM11711g = CoreModule.m1854P().m11711g();
        Privilege privilege = Privilege.see_who_likes_me;
        wx80 wx80VarM6986bf = corePayInnerServiceM11711g.m6986bf(privilege);
        this.f7553d.setText(wx80VarM6986bf != null ? wx80VarM6986bf.m26849t() : getResources().getString(R.string.E0));
        m10856W0(privilege);
        this.f7554e.setText(R.string.D0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T */
    private String m10830T(@StringRes int i) {
        return getContext().getString(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: X0 */
    private void m10831X0(String str) {
        SimpleDraweeView vDraweeView = new VDraweeView(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(t100.m, 0, 0, 0);
        layoutParams.gravity = 83;
        vDraweeView.setLayoutParams(layoutParams);
        vDraweeView.getHierarchy().w(ftd0.d);
        this.f7552c.removeAllViews();
        this.f7552c.addView(vDraweeView);
        qib0.f19782G.m12744L0(vDraweeView, str);
    }

    /* JADX INFO: renamed from: b0 */
    private void m10832b0() {
        CorePayInnerService corePayInnerServiceM11711g = CoreModule.m1854P().m11711g();
        Privilege privilege = Privilege.advanced_filter;
        wx80 wx80VarM6986bf = corePayInnerServiceM11711g.m6986bf(privilege);
        this.f7553d.setText(wx80VarM6986bf != null ? wx80VarM6986bf.m26849t() : "高级筛选");
        m10856W0(privilege);
        this.f7554e.setText(wx80VarM6986bf.m26829d());
    }

    /* JADX INFO: renamed from: d0 */
    private void m10833d0() {
        wx80 wx80VarM6950Hm = CoreModule.m1854P().m11711g().m6950Hm(this.f7557h, Privilege.boost);
        this.f7553d.setText(wx80VarM6950Hm.m26849t());
        m10851T0(this.f7557h);
        this.f7554e.setText(wx80VarM6950Hm.m26829d());
    }

    /* JADX INFO: renamed from: l0 */
    private void m10834l0() {
        CorePayInnerService corePayInnerServiceM11711g = CoreModule.m1854P().m11711g();
        Privilege privilege = Privilege.letter;
        wx80 wx80VarM6986bf = corePayInnerServiceM11711g.m6986bf(privilege);
        this.f7553d.setText(wx80VarM6986bf.m26849t());
        m10856W0(privilege);
        this.f7554e.setText(wx80VarM6986bf.m26829d());
    }

    /* JADX INFO: renamed from: m0 */
    private void m10835m0() {
        CorePayInnerService corePayInnerServiceM11711g = CoreModule.m1854P().m11711g();
        Privilege privilege = Privilege.liked_user;
        wx80 wx80VarM6986bf = corePayInnerServiceM11711g.m6986bf(privilege);
        this.f7553d.setText(wx80VarM6986bf.m26849t());
        m10856W0(privilege);
        this.f7554e.setText(wx80VarM6986bf.m26829d());
    }

    /* JADX INFO: renamed from: o0 */
    private void m10836o0() {
        CorePayInnerService corePayInnerServiceM11711g = CoreModule.m1854P().m11711g();
        Privilege privilege = Privilege.message_read_state;
        wx80 wx80VarM6986bf = corePayInnerServiceM11711g.m6986bf(privilege);
        this.f7553d.setText(wx80VarM6986bf != null ? wx80VarM6986bf.m26849t() : "查看消息已读状态");
        m10856W0(privilege);
        this.f7554e.setText(wx80VarM6986bf.m26829d());
    }

    /* JADX INFO: renamed from: E0 */
    public final void m10837E0() {
        wx80 wx80VarM6986bf = CoreModule.m1854P().m11711g().m6986bf(Privilege.svip_greet);
        this.f7553d.setText(wx80VarM6986bf.m26849t());
        m10852U0(wx80VarM6986bf.m26825b());
        this.f7554e.setText(wx80VarM6986bf.m26829d());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: G0 */
    public final void m10838G0() {
        wx80 wx80VarM6986bf = CoreModule.m1854P().m11711g().m6986bf(Privilege.say_hi_pkg);
        this.f7553d.setText(wx80VarM6986bf.m26849t());
        this.f7554e.setText(wx80VarM6986bf.m26846q());
        LayoutInflater.from(getContext()).inflate(k6c0.t1, (ViewGroup) this.f7552c, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: I0 */
    public final void m10839I0(PurchaseType purchaseType) {
        CorePayInnerService corePayInnerServiceM11711g = CoreModule.m1854P().m11711g();
        Privilege privilege = Privilege.vip_super_like;
        wx80 wx80VarM6950Hm = corePayInnerServiceM11711g.m6950Hm(purchaseType, privilege);
        if (sab0.i(purchaseType) || sab0.u(purchaseType)) {
            this.f7553d.setText(wx80VarM6950Hm.m26849t());
        } else {
            boolean zM5671Oi = ura.m25555e().m25559d().m5671Oi();
            VText vText = this.f7553d;
            if (zM5671Oi) {
                vText.setText(wx80VarM6950Hm.m26849t());
            } else {
                vText.setText(getContext().getString(R.string.D1, 5));
            }
        }
        if (gr9.INSTANCE.m15947g() && purchaseType == PurchaseType.TYPE_GET_VIP) {
            m10861Z0(privilege);
        } else if (sab0.u(purchaseType)) {
            m10831X0(zz6.u0() ? "https://static.tancdn.com/pe-webplatform/np-NSKBh576ah-F-vkAXzwZL.webp" : "https://static.tancdn.com/pe-webplatform/r0rStyaGok5vSlMsIhLqiokx.webp");
        } else {
            m10856W0(privilege);
        }
        this.f7554e.setText(wx80VarM6950Hm.m26829d());
    }

    /* JADX INFO: renamed from: J0 */
    public final void m10840J0() {
        wx80 wx80VarM6986bf = CoreModule.m1854P().m11711g().m6986bf(Privilege.top_chat);
        this.f7553d.setText(wx80VarM6986bf.m26849t());
        m10852U0(wx80VarM6986bf.m26825b());
        this.f7554e.setText(wx80VarM6986bf.m26846q());
    }

    /* JADX INFO: renamed from: K0 */
    public final void m10841K0() {
        wx80 wx80VarM6986bf = CoreModule.m1854P().m11711g().m6986bf(Privilege.top_like);
        this.f7553d.setText(wx80VarM6986bf.m26849t());
        m10852U0(wx80VarM6986bf.m26825b());
        this.f7554e.setText(wx80VarM6986bf.m26846q());
    }

    /* JADX INFO: renamed from: L0 */
    public final void m10842L0(PurchaseType purchaseType) {
        CorePayInnerService corePayInnerServiceM11711g = CoreModule.m1854P().m11711g();
        Privilege privilege = Privilege.vip_undo;
        wx80 wx80VarM6986bf = corePayInnerServiceM11711g.m6986bf(privilege);
        this.f7553d.setText(wx80VarM6986bf != null ? wx80VarM6986bf.m26849t() : m10830T(R.string.B1));
        if (gr9.INSTANCE.m15947g() && purchaseType == PurchaseType.TYPE_GET_VIP) {
            m10861Z0(privilege);
        } else {
            m10856W0(privilege);
        }
        this.f7554e.setText(wx80VarM6986bf.m26829d());
        if (CoreModule.m1854P().m11706a().m5370Vf()) {
            xdl0.M(this.f7555f, true);
            this.f7555f.setText("使用反悔特权");
            this.f7555f.setOnClickListener(new View.OnClickListener() { // from class: l.eu80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f11452a.m10860Z(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: M0 */
    public final void m10843M0(PurchaseType purchaseType) {
        CorePayInnerService corePayInnerServiceM11711g = CoreModule.m1854P().m11711g();
        Privilege privilege = Privilege.vip_unlimited_likes;
        wx80 wx80VarM6986bf = corePayInnerServiceM11711g.m6986bf(privilege);
        this.f7553d.setText(wx80VarM6986bf != null ? wx80VarM6986bf.m26849t() : m10830T(R.string.z1));
        if (gr9.INSTANCE.m15947g() && purchaseType == PurchaseType.TYPE_GET_VIP) {
            m10861Z0(privilege);
        } else {
            m10856W0(privilege);
        }
        this.f7554e.setText(wx80VarM6986bf.m26829d());
    }

    /* JADX INFO: renamed from: N0 */
    public final void m10844N0() {
        wx80 wx80VarM6986bf = CoreModule.m1854P().m11711g().m6986bf(Privilege.vip_greet);
        this.f7553d.setText(wx80VarM6986bf.m26849t());
        m10852U0(wx80VarM6986bf.m26825b());
        this.f7554e.setText(wx80VarM6986bf.m26829d());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O0 */
    public final void m10845O0() {
        wx80 wx80VarM6950Hm = CoreModule.m1854P().m11711g().m6950Hm(this.f7557h, Privilege.visitor_hide_footprint);
        this.f7553d.setText(wx80VarM6950Hm.m26849t());
        this.f7554e.setText(wx80VarM6950Hm.m26846q());
        LayoutInflater.from(getContext()).inflate(k6c0.u1, (ViewGroup) this.f7552c, true);
    }

    /* JADX INFO: renamed from: P0 */
    public final void m10846P0() {
        String str;
        m10856W0(Privilege.voice_quick_chat);
        this.f7553d.setText("语音闪聊");
        if (sab0.i(this.f7557h)) {
            str = CoreModule.f1534c.f3628e0.m21490p9().isFemale() ? "21" : "4";
        } else {
            str = "1";
        }
        this.f7554e.setText(String.format("每天额外%s次语音闪聊，随时连线附近的%s", str, zz6.u0() ? "小哥哥" : "小姐姐"));
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m10847Q0(Privilege privilege) {
        wx80 wx80VarM6950Hm = CoreModule.m1854P().m11711g().m6950Hm(this.f7557h, privilege);
        this.f7553d.setText(wx80VarM6950Hm.m26849t());
        this.f7554e.setText(wx80VarM6950Hm.m26846q());
        if (privilege == Privilege.youth_roaming) {
            m10856W0(Privilege.vip_location);
            return;
        }
        if (privilege == Privilege.youth_superlike) {
            m10856W0(Privilege.vip_super_like);
            return;
        }
        if (privilege == Privilege.youth_message_read) {
            m10856W0(Privilege.message_read_state);
        } else if (privilege == Privilege.youth_find_partner) {
            m10831X0("https://auto.tancdn.com/v1/images/eyJpZCI6IjVQSFIyWk5aU1haTk9KWEZSUkVJQlNONjNPRElLUzE0IiwidyI6NDk1LCJoIjo2MTgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo0NTI1NDYwMzczMjc3MjUzMzI3fQ.png");
        } else {
            m10831X0("https://auto.tancdn.com/v1/images/eyJpZCI6IllQVVA2V0I2NU9QVlBUQ0U0TVE0TFJJS0MyWUJYVzE0IiwidyI6NDk1LCJoIjo2MTgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMjU4NjY0MzA1ODg2MDY3MjB9.png");
        }
    }

    /* JADX INFO: renamed from: R0 */
    public void m10848R0() {
        switch (C0440a.f7562a[this.f7560k.ordinal()]) {
            case 1:
                m10841K0();
                break;
            case 2:
                m10840J0();
                break;
            case CameraSticker.STATE_COMPLETE /* 3 */:
            case CameraSticker.STATE_ERROR /* 4 */:
                m10864c0(this.f7560k, this.f7557h);
                break;
            case 5:
                m10839I0(this.f7557h);
                break;
            case 6:
                m10842L0(this.f7557h);
                break;
            case 7:
                m10843M0(this.f7557h);
                break;
            case 8:
                m10872n0(this.f7557h);
                break;
            case 9:
                m10836o0();
                break;
            case 10:
                m10832b0();
                break;
            case 11:
                m10834l0();
                break;
            case 12:
                m10870j0();
                break;
            case 13:
                m10844N0();
                break;
            case 14:
                m10837E0();
                break;
            case 15:
                if (!sab0.g(this.f7557h)) {
                    m10823A0();
                } else {
                    m10869i0(this.f7560k);
                }
                break;
            case 16:
                m10825D0();
                break;
            case 17:
                m10826H0();
                break;
            case 18:
                m10824B0();
                break;
            case 19:
                m10846P0();
                break;
            case 20:
                m10833d0();
                break;
            case 21:
                m10835m0();
                break;
            case 22:
                m10867g0();
                break;
            case 23:
                m10879v0();
                break;
            case 24:
                m10881x0();
                break;
            case 25:
                m10876s0();
                break;
            case 26:
                m10883z0(this.f7557h);
                break;
            case 27:
                m10880w0();
                break;
            case 28:
                m10877t0();
                break;
            case 29:
                m10871k0(this.f7557h);
                break;
            case 30:
                m10878u0();
                break;
            case 31:
                m10838G0();
                break;
            case 32:
                m10873p0(this.f7557h);
                break;
            case 33:
                m10862a0();
                break;
            case 34:
                m10865e0();
                break;
            case 35:
                m10882y0();
                break;
            case 36:
                m10874q0();
                break;
            case 37:
                m10875r0();
                break;
            case 38:
                m10868h0();
                break;
            case 39:
                m10845O0();
                break;
            case 40:
                m10866f0();
                break;
            case 41:
            case 42:
            case 43:
            case 44:
                m10869i0(this.f7560k);
                break;
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                m10847Q0(this.f7560k);
                break;
            case 50:
                m10859Y0(this.f7560k);
                break;
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m10849S(View view) {
        hu80.a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: S0 */
    public final void m10850S0(Privilege privilege, PurchaseType purchaseType) {
        String strM10853V = m10853V(privilege);
        SVGAnimationView sVGAnimationView = new SVGAnimationView(getContext());
        SVGADynamicEntity sVGADynamicEntity = new SVGADynamicEntity();
        s5h0.INSTANCE.f(this.f7561l, sVGADynamicEntity, CoreModule.f1534c.f3628e0.m21483na().fp().profileSmall().formatted(), "head01", 256, 349, (e30) null);
        SVGALoader.with(getContext()).from(strM10853V).autoPlay(false).repeatCount(0).dynamic(sVGADynamicEntity).into(sVGAnimationView);
        if (!sVGAnimationView.isAnimating()) {
            sVGAnimationView.startAnimation();
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(t100.d(230.0f), t100.d(180.0f));
        layoutParams.setMargins(t100.d(40.0f), t100.d(16.0f), t100.d(0.0f), -4);
        layoutParams.gravity = 83;
        sVGAnimationView.setScaleType(ImageView.ScaleType.FIT_START);
        sVGAnimationView.setLayoutParams(layoutParams);
        this.f7552c.removeAllViews();
        this.f7552c.addView(sVGAnimationView);
    }

    /* JADX INFO: renamed from: T0 */
    public final void m10851T0(PurchaseType purchaseType) {
        String strM10886a = PrivilegeItemPicUtils.m10886a(Privilege.boost);
        if (NullChecker.b(strM10886a)) {
            m10831X0(strM10886a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: U0 */
    public final void m10852U0(int i) {
        VImage vImage = new VImage(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(t100.d(24.0f), t100.d(16.0f), t100.d(24.0f), 0);
        layoutParams.gravity = 83;
        vImage.setLayoutParams(layoutParams);
        vImage.setScaleType(ImageView.ScaleType.FIT_START);
        vImage.setImageResource(i);
        this.f7552c.removeAllViews();
        this.f7552c.addView(vImage);
    }

    /* JADX INFO: renamed from: V */
    public String m10853V(Privilege privilege) {
        boolean zU0 = zz6.u0();
        int i = C0440a.f7562a[privilege.ordinal()];
        if (i == 3) {
            return "https://fe-static.tancdn.com/v1/raw/23062852-0e3d-4764-a4d6-2f8de6c1cb6414.svga";
        }
        if (i == 5) {
            return Build.VERSION.SDK_INT >= 26 ? "https://fe-static.tancdn.com/v1/raw/a0f91ef4-557e-42ee-b8d4-49cc214b420114.svga" : "https://fe-static.tancdn.com/v1/raw/bc84c4bf-a22a-4581-a960-5bf284b495d114.svga";
        }
        if (i == 6) {
            return zU0 ? "https://fe-static.tancdn.com/v1/raw/ffd9f6bb-4ebc-4e09-9360-8068cd517d2114.svga" : "https://fe-static.tancdn.com/v1/raw/186c6451-d385-4a2c-9d10-20a5a80a41ea14.svga";
        }
        if (i == 7) {
            return zU0 ? "https://fe-static.tancdn.com/v1/raw/8fc25c33-a059-4bd2-860d-dbbcfe3c802e14.svga" : "https://fe-static.tancdn.com/v1/raw/bbbd2b04-46f6-472c-8c15-b6af4d9d3e5214.svga";
        }
        if (i != 8) {
            return null;
        }
        return "https://fe-static.tancdn.com/v1/raw/92d066a1-5685-4352-807f-a34721fe7a7814.svga";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V0 */
    public final void m10854V0(int i) {
        VImage vImage = new VImage(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 83;
        vImage.setLayoutParams(layoutParams);
        vImage.setScaleType(ImageView.ScaleType.FIT_START);
        vImage.setImageResource(i);
        this.f7552c.removeAllViews();
        this.f7552c.addView(vImage);
    }

    /* JADX INFO: renamed from: W */
    public void m10855W(PutongFrag putongFrag, C0444a.e eVar, Privilege privilege, Act act, PurchaseType purchaseType) {
        this.f7558i = eVar;
        this.f7559j = putongFrag;
        this.f7560k = privilege;
        this.f7561l = act;
        this.f7557h = purchaseType;
        if (sab0.u(purchaseType)) {
            this.f7553d.setTextColor(Color.parseColor("#CCFFD489"));
            this.f7554e.setTextColor(Color.parseColor("#66FFD489"));
        }
    }

    /* JADX INFO: renamed from: W0 */
    public final void m10856W0(Privilege privilege) {
        String strM10886a = PrivilegeItemPicUtils.m10886a(privilege);
        if (NullChecker.b(strM10886a)) {
            m10831X0(strM10886a);
        }
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m10857X(RoamedLocationData roamedLocationData) {
        this.f7556g = roamedLocationData;
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m10858Y(View view) {
        CoreModule.m1854P().m11706a().m5330Q8(this.f7561l, this.f7556g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y0 */
    public final void m10859Y0(Privilege privilege) {
        wx80 wx80VarM6950Hm = CoreModule.m1854P().m11711g().m6950Hm(this.f7557h, privilege);
        this.f7553d.setText(wx80VarM6950Hm.m26849t());
        this.f7554e.setText(wx80VarM6950Hm.m26846q());
        this.f7552c.removeAllViews();
        LayoutInflater.from(getContext()).inflate(k6c0.r1, (ViewGroup) this.f7552c, true);
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m10860Z(View view) {
        Act act = this.f7561l;
        act.startActivity(NewMyLikedUsersAct.Z1(act, "undoUser"));
    }

    /* JADX INFO: renamed from: Z0 */
    public final void m10861Z0(Privilege privilege) {
        String strM10853V = m10853V(privilege);
        if (NullChecker.b(strM10853V)) {
            m10863a1(strM10853V);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final void m10862a0() {
        CorePayInnerService corePayInnerServiceM11711g = CoreModule.m1854P().m11711g();
        PurchaseType purchaseType = this.f7557h;
        Privilege privilege = Privilege.accelerate_pairing;
        wx80 wx80VarM6950Hm = corePayInnerServiceM11711g.m6950Hm(purchaseType, privilege);
        this.f7553d.setText(wx80VarM6950Hm.m26849t());
        this.f7554e.setText(wx80VarM6950Hm.m26846q());
        String strM10886a = PrivilegeItemPicUtils.m10886a(privilege);
        if (NullChecker.b(strM10886a)) {
            m10831X0(strM10886a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: a1 */
    public final void m10863a1(String str) {
        SVGAnimationView sVGAnimationView = new SVGAnimationView(getContext());
        SVGALoader.with(getContext()).from(str).autoPlay(false).repeatCount(0).into(sVGAnimationView);
        if (!sVGAnimationView.isAnimating()) {
            sVGAnimationView.startAnimation();
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(t100.d(230.0f), t100.d(180.0f));
        layoutParams.setMargins(t100.d(40.0f), t100.d(16.0f), t100.d(0.0f), -4);
        layoutParams.gravity = 83;
        sVGAnimationView.setScaleType(ImageView.ScaleType.FIT_START);
        sVGAnimationView.setLayoutParams(layoutParams);
        this.f7552c.removeAllViews();
        this.f7552c.addView(sVGAnimationView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c0 */
    public final void m10864c0(Privilege privilege, PurchaseType purchaseType) {
        wx80 wx80VarM6986bf = CoreModule.m1854P().m11711g().m6986bf(privilege);
        this.f7553d.setText(wx80VarM6986bf != null ? wx80VarM6986bf.m26849t() : m10830T(R.string.C1));
        if (gr9.INSTANCE.m15947g() && purchaseType == PurchaseType.TYPE_GET_VIP) {
            m10850S0(Privilege.vip_badge, purchaseType);
        } else {
            ((PrivilegeContentDlgItemBadgeView) o7r.a(getContext()).inflate(k6c0.m1, (ViewGroup) this.f7552c, true).findViewById(x4c0.b)).m10807b(privilege, purchaseType);
        }
        boolean zO = sab0.o(purchaseType);
        TextView textView = this.f7554e;
        if (zO) {
            textView.setText("展示 白金会员 尊贵标识，或者低调地隐藏会员身份");
        } else {
            textView.setText(privilege == Privilege.svip_badge ? R.string.C : R.string.E);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e0 */
    public final void m10865e0() {
        wx80 wx80VarM6950Hm = CoreModule.m1854P().m11711g().m6950Hm(this.f7557h, Privilege.city_topping);
        this.f7553d.setText(wx80VarM6950Hm.m26849t());
        this.f7554e.setText(wx80VarM6950Hm.m26829d());
        this.f7552c.removeAllViews();
        LayoutInflater.from(getContext()).inflate(k6c0.n1, (ViewGroup) this.f7552c, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f0 */
    public final void m10866f0() {
        wx80 wx80VarM6986bf = CoreModule.m1854P().m11711g().m6986bf(Privilege.confession_first);
        this.f7553d.setText(wx80VarM6986bf.m26849t());
        this.f7554e.setText(wx80VarM6986bf.m26846q());
        this.f7552c.removeAllViews();
        LayoutInflater.from(getContext()).inflate(k6c0.t1, (ViewGroup) this.f7552c, true);
        View childAt = this.f7552c.getChildAt(0);
        if (childAt instanceof PrivilegeContentDlgItemSVipSayHiView) {
            ((PrivilegeContentDlgItemSVipSayHiView) childAt).m10816c();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g0 */
    public final void m10867g0() {
        wx80 wx80VarM6950Hm = CoreModule.m1854P().m11711g().m6950Hm(this.f7557h, Privilege.customer_service);
        this.f7553d.setText(wx80VarM6950Hm.m26849t());
        this.f7554e.setText(wx80VarM6950Hm.m26846q());
        if (!sab0.u(this.f7557h)) {
            ((PrivilegeContentDlgItemDiamondServiceView) o7r.a(getContext()).inflate(k6c0.o1, (ViewGroup) this.f7552c, true).findViewById(x4c0.D)).m10809b();
        } else {
            this.f7552c.removeAllViews();
            o7r.a(getContext()).inflate(k6c0.s1, (ViewGroup) this.f7552c, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h0 */
    public final void m10868h0() {
        wx80 wx80VarM6950Hm = CoreModule.m1854P().m11711g().m6950Hm(this.f7557h, Privilege.exclusive_dressing_up);
        this.f7553d.setText(wx80VarM6950Hm.m26849t());
        this.f7554e.setText(wx80VarM6950Hm.m26829d());
        this.f7552c.removeAllViews();
        LayoutInflater.from(getContext()).inflate(k6c0.q1, (ViewGroup) this.f7552c, true);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m10869i0(Privilege privilege) {
        wx80 wx80VarM6950Hm = CoreModule.m1854P().m11711g().m6950Hm(this.f7557h, privilege);
        this.f7553d.setText(wx80VarM6950Hm.m26849t());
        this.f7554e.setText(wx80VarM6950Hm.m26846q());
        m10852U0(wx80VarM6950Hm.m26825b());
    }

    /* JADX INFO: renamed from: j0 */
    public final void m10870j0() {
        wx80 wx80VarM6950Hm = CoreModule.m1854P().m11711g().m6950Hm(this.f7557h, Privilege.greet);
        this.f7553d.setText(wx80VarM6950Hm.m26849t());
        m10852U0(wx80VarM6950Hm.m26825b());
        this.f7554e.setText(wx80VarM6950Hm.m26829d());
    }

    /* JADX INFO: renamed from: k0 */
    public final void m10871k0(PurchaseType purchaseType) {
        CorePayInnerService corePayInnerServiceM11711g = CoreModule.m1854P().m11711g();
        Privilege privilege = Privilege.leave_message;
        wx80 wx80VarM6986bf = corePayInnerServiceM11711g.m6986bf(privilege);
        this.f7553d.setText("每天5条资料留言");
        m10856W0(privilege);
        this.f7554e.setText(wx80VarM6986bf.m26829d());
    }

    /* JADX INFO: renamed from: n0 */
    public final void m10872n0(PurchaseType purchaseType) {
        CorePayInnerService corePayInnerServiceM11711g = CoreModule.m1854P().m11711g();
        Privilege privilege = Privilege.vip_location;
        wx80 wx80VarM6986bf = corePayInnerServiceM11711g.m6986bf(privilege);
        this.f7553d.setText(wx80VarM6986bf != null ? wx80VarM6986bf.m26849t() : m10830T(R.string.A1));
        this.f7554e.setText(wx80VarM6986bf.m26829d());
        if (gr9.INSTANCE.m15947g() && purchaseType == PurchaseType.TYPE_GET_VIP) {
            m10861Z0(privilege);
        } else {
            m10856W0(privilege);
        }
        if (mb90.b(PurchaseType.TYPE_ROAMING_PKG)) {
            xdl0.M(this.f7555f, true);
            this.f7555f.setText(m10830T(R.string.y1));
            this.f7558i.n(this.f7559j, CoreModule.f1534c.f3646k0.f4077R.k()).take(1).subscribe(mkd0.G(new e30() { // from class: l.fu80
                public final void call(Object obj) {
                    this.f12920a.m10857X((RoamedLocationData) obj);
                }
            }));
            this.f7555f.setOnClickListener(new View.OnClickListener() { // from class: l.gu80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f13511a.m10858Y(view);
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m10849S(this);
        this.f7553d.setTypeface(eqh0.c(3), 1);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m10873p0(PurchaseType purchaseType) {
        CorePayInnerService corePayInnerServiceM11711g = CoreModule.m1854P().m11711g();
        Privilege privilege = Privilege.moment_boost;
        wx80 wx80VarM6950Hm = corePayInnerServiceM11711g.m6950Hm(purchaseType, privilege);
        if (sab0.i(purchaseType)) {
            m10831X0(zz6.u0() ? "https://auto.tancdn.com/v1/raw/c311e8b5-c0ab-4594-a2bd-c6820de4dd9d13.webp" : "https://auto.tancdn.com/v1/raw/feb9b413-c633-45c5-ba56-2f35a1acc87c12.webp");
        } else {
            m10856W0(privilege);
        }
        this.f7553d.setText(wx80VarM6950Hm.m26849t());
        this.f7554e.setText(wx80VarM6950Hm.m26846q());
    }

    /* JADX INFO: renamed from: q0 */
    public final void m10874q0() {
        wx80 wx80VarM6950Hm = CoreModule.m1854P().m11711g().m6950Hm(this.f7557h, Privilege.mysterious_mode);
        this.f7553d.setText(wx80VarM6950Hm.m26849t());
        this.f7554e.setText(wx80VarM6950Hm.m26829d());
        String str = zz6.u0() ? "https://static.tancdn.com/pe-webplatform/4k6oow3xpt5qgqNfRIe51ZQC.webp" : "https://static.tancdn.com/pe-webplatform/fugcVz2_GhwzRjvaYY-TfFQX.webp";
        if (NullChecker.b(str)) {
            m10831X0(str);
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final void m10875r0() {
        wx80 wx80VarM6950Hm = CoreModule.m1854P().m11711g().m6950Hm(this.f7557h, Privilege.nearby_people);
        this.f7553d.setText(wx80VarM6950Hm.m26849t());
        this.f7554e.setText(wx80VarM6950Hm.m26829d());
        String str = zz6.u0() ? "https://static.tancdn.com/pe-webplatform/6LRexqdNGQAaCHkaMOrf98XD.webp" : "https://static.tancdn.com/pe-webplatform/x-IUiN-PejudNCvVnUlJwHMo.webp";
        if (CoreModule.m1854P().m11711g().m6941D9() && (sab0.q(this.f7557h) || sab0.i(this.f7557h))) {
            str = zz6.u0() ? "https://auto.tancdn.com/v1/raw/8a8beca9-31c9-487c-a103-351eeacd36cc14.webp" : "https://auto.tancdn.com/v1/raw/f2ae8713-c3b2-401f-ab2f-00038efd9a5c14.webp";
        } else if (CoreModule.m1854P().m11711g().m6954Ki() && sab0.o(this.f7557h)) {
            str = zz6.u0() ? "https://auto.tancdn.com/v1/raw/60c8d055-cb62-4c9e-a3bc-cbac2ce51c9a14.webp" : "https://auto.tancdn.com/v1/raw/57a96d00-8658-49c5-a45b-7d1a52b50d8914.webp";
        }
        if (NullChecker.b(str)) {
            m10831X0(str);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s0 */
    public final void m10876s0() {
        wx80 wx80VarM6986bf = CoreModule.m1854P().m11711g().m6986bf(Privilege.oDiamondGreetings);
        this.f7553d.setText(wx80VarM6986bf.m26849t());
        this.f7554e.setText(wx80VarM6986bf.m26846q());
        LayoutInflater.from(getContext()).inflate(k6c0.t1, (ViewGroup) this.f7552c, true);
    }

    /* JADX INFO: renamed from: t0 */
    public final void m10877t0() {
        CorePayInnerService corePayInnerServiceM11711g = CoreModule.m1854P().m11711g();
        PurchaseType purchaseType = this.f7557h;
        Privilege privilege = Privilege.immediately_match;
        wx80 wx80VarM6950Hm = corePayInnerServiceM11711g.m6950Hm(purchaseType, privilege);
        if (sab0.u(this.f7557h)) {
            m10831X0(zz6.u0() ? "https://static.tancdn.com/pe-webplatform/8nPaE2uG8jPQEGffEVJ4jJkB.webp" : "https://static.tancdn.com/pe-webplatform/vivHEa6wkdFHKU0PKLkNaj2u.webp");
        } else {
            m10856W0(privilege);
        }
        this.f7553d.setText(wx80VarM6950Hm.m26849t());
        this.f7554e.setText(wx80VarM6950Hm.m26846q());
    }

    /* JADX INFO: renamed from: u0 */
    public final void m10878u0() {
        wx80 wx80VarM6986bf = CoreModule.m1854P().m11711g().m6986bf(Privilege.live_entry_animation);
        m10852U0(wx80VarM6986bf.m26825b());
        this.f7553d.setText(wx80VarM6986bf.m26849t());
        this.f7554e.setText(wx80VarM6986bf.m26846q());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: v0 */
    public final void m10879v0() {
        wx80 wx80VarM6986bf = CoreModule.m1854P().m11711g().m6986bf(Privilege.oDiamondSvipSkin);
        this.f7553d.setText(wx80VarM6986bf.m26849t());
        this.f7554e.setText(wx80VarM6986bf.m26846q());
        ((PrivilegeContentDlgItemDiamondSkinView) o7r.a(getContext()).inflate(k6c0.p1, (ViewGroup) this.f7552c, true).findViewById(x4c0.D)).m10811b();
    }

    /* JADX INFO: renamed from: w0 */
    public final void m10880w0() {
        wx80 wx80VarM6986bf = CoreModule.m1854P().m11711g().m6986bf(Privilege.oDiamondSvipExtra);
        if (sab0.u(this.f7557h)) {
            m10831X0("https://static.tancdn.com/pe-webplatform/aG1xQE9fUqiUSct3f8qvjX4y.webp");
        } else {
            m10854V0(wx80VarM6986bf.m26825b());
        }
        this.f7553d.setText(wx80VarM6986bf.m26849t());
        this.f7554e.setText(wx80VarM6986bf.m26846q());
    }

    /* JADX INFO: renamed from: x0 */
    public final void m10881x0() {
        CorePayInnerService corePayInnerServiceM11711g = CoreModule.m1854P().m11711g();
        Privilege privilege = Privilege.oDiamondVisitor;
        wx80 wx80VarM6986bf = corePayInnerServiceM11711g.m6986bf(privilege);
        m10856W0(privilege);
        this.f7553d.setText(wx80VarM6986bf.m26849t());
        this.f7554e.setText(wx80VarM6986bf.m26846q());
    }

    /* JADX INFO: renamed from: y0 */
    public final void m10882y0() {
        wx80 wx80VarM6950Hm = CoreModule.m1854P().m11711g().m6950Hm(this.f7557h, Privilege.personal_customization);
        this.f7553d.setText(wx80VarM6950Hm.m26849t());
        this.f7554e.setText(wx80VarM6950Hm.m26829d());
        String str = zz6.u0() ? "https://static.tancdn.com/pe-webplatform/aaGGiuxW60ADoOO_MxDtST58.webp" : "https://static.tancdn.com/pe-webplatform/60oshsV4Fu2iaZfEuqxNeSji.webp";
        if (NullChecker.b(str)) {
            m10831X0(str);
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final void m10883z0(PurchaseType purchaseType) {
        CorePayInnerService corePayInnerServiceM11711g = CoreModule.m1854P().m11711g();
        Privilege privilege = Privilege.picksMembership;
        wx80 wx80VarM6950Hm = corePayInnerServiceM11711g.m6950Hm(purchaseType, privilege);
        if (sab0.u(purchaseType)) {
            m10831X0(zz6.u0() ? "https://static.tancdn.com/pe-webplatform/SVhzDulIxVOWEQ7y44VOsVaH.webp" : "https://static.tancdn.com/pe-webplatform/GefWPXpePA0KOkKaH1VV51tL.webp");
        } else {
            m10856W0(privilege);
        }
        this.f7553d.setText(wx80VarM6950Hm.m26849t());
        this.f7554e.setText(wx80VarM6950Hm.m26846q());
    }

    public PrivilegeContentDlgItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7556g = RoamedLocationData.new_();
    }

    public PrivilegeContentDlgItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7556g = RoamedLocationData.new_();
    }
}
