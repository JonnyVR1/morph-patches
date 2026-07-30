package com.p046p1.mobile.putong.core.p053ui.vip.privilege.dlg;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.biz.service.CorePayInnerService;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.RoamedLocationData;
import com.p046p1.mobile.putong.core.member.R$string;
import com.p046p1.mobile.putong.core.p053ui.likedusers.tablayout.NewMyLikedUsersAct;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantan.library.svga.compose.SVGADynamicEntity;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.djj;
import p149l.e30;
import p149l.eqh0;
import p149l.ftd0;
import p149l.gr9;
import p149l.hu80;
import p149l.k6c0;
import p149l.mb90;
import p149l.mkd0;
import p149l.o7r;
import p149l.qib0;
import p149l.s5h0;
import p149l.sab0;
import p149l.t100;
import p149l.ura;
import p149l.wx80;
import p149l.x4c0;
import p149l.xdl0;
import p149l.zz6;

/* JADX INFO: loaded from: classes9.dex */
public class PrivilegeContentDlgItemView extends VLinear {

    /* JADX INFO: renamed from: c */
    public FrameLayout f37771c;

    /* JADX INFO: renamed from: d */
    public VText f37772d;

    /* JADX INFO: renamed from: e */
    public TextView f37773e;

    /* JADX INFO: renamed from: f */
    public TextView f37774f;

    /* JADX INFO: renamed from: g */
    public RoamedLocationData f37775g;

    /* JADX INFO: renamed from: h */
    public PurchaseType f37776h;

    /* JADX INFO: renamed from: i */
    public C9008a.e f37777i;

    /* JADX INFO: renamed from: j */
    public PutongFrag f37778j;

    /* JADX INFO: renamed from: k */
    public Privilege f37779k;

    /* JADX INFO: renamed from: l */
    public Act f37780l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.dlg.PrivilegeContentDlgItemView$a */
    public static /* synthetic */ class C9004a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f37781a;

        static {
            int[] iArr = new int[Privilege.values().length];
            f37781a = iArr;
            try {
                iArr[Privilege.top_like.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f37781a[Privilege.top_chat.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f37781a[Privilege.vip_badge.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f37781a[Privilege.svip_badge.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f37781a[Privilege.vip_super_like.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f37781a[Privilege.vip_undo.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f37781a[Privilege.vip_unlimited_likes.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f37781a[Privilege.vip_location.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f37781a[Privilege.message_read_state.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f37781a[Privilege.advanced_filter.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f37781a[Privilege.letter.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f37781a[Privilege.greet.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f37781a[Privilege.vip_greet.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f37781a[Privilege.svip_greet.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f37781a[Privilege.privacy_membership.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f37781a[Privilege.recover_unmatches.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f37781a[Privilege.see_who_likes_me.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f37781a[Privilege.online_match_tickets.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f37781a[Privilege.voice_quick_chat.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f37781a[Privilege.boost.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f37781a[Privilege.liked_user.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f37781a[Privilege.customer_service.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f37781a[Privilege.oDiamondSvipSkin.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f37781a[Privilege.oDiamondVisitor.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f37781a[Privilege.oDiamondGreetings.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f37781a[Privilege.picksMembership.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f37781a[Privilege.oDiamondSvipExtra.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f37781a[Privilege.immediately_match.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f37781a[Privilege.leave_message.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f37781a[Privilege.live_entry_animation.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f37781a[Privilege.say_hi_pkg.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f37781a[Privilege.moment_boost.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f37781a[Privilege.accelerate_pairing.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f37781a[Privilege.city_topping.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f37781a[Privilege.personal_customization.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f37781a[Privilege.mysterious_mode.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f37781a[Privilege.nearby_people.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f37781a[Privilege.exclusive_dressing_up.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                f37781a[Privilege.visitor_hide_footprint.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f37781a[Privilege.confession_first.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f37781a[Privilege.block_harassing_words.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                f37781a[Privilege.ads_not_disturb.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                f37781a[Privilege.pick_tantan_credits_users.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                f37781a[Privilege.unlock_learn_about_him_module.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                f37781a[Privilege.youth_roaming.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                f37781a[Privilege.youth_find_partner.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                f37781a[Privilege.youth_blind_box.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                f37781a[Privilege.youth_superlike.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                f37781a[Privilege.youth_message_read.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                f37781a[Privilege.hide_me_from_nearby.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
        }
    }

    public PrivilegeContentDlgItemView(@NonNull Context context) {
        super(context);
        this.f37775g = RoamedLocationData.new_();
    }

    /* JADX INFO: renamed from: A0 */
    private void m57340A0() {
        CorePayInnerService corePayInnerServiceM94656g = CoreModule.m29935P().m94656g();
        Privilege privilege = Privilege.privacy_membership;
        wx80 wx80VarMo35049bf = corePayInnerServiceM94656g.mo35049bf(privilege);
        this.f37772d.setText(wx80VarMo35049bf.m205968t());
        m57373W0(privilege);
        this.f37773e.setText(wx80VarMo35049bf.m205948d());
    }

    /* JADX INFO: renamed from: B0 */
    private void m57341B0() {
        if (sab0.m182891i(this.f37776h)) {
            this.f37772d.setText("无限次在线闪聊");
            boolean zM221004u0 = zz6.m221004u0();
            TextView textView = this.f37773e;
            if (zM221004u0) {
                textView.setText("无限次在线闪聊匹配附近在线的小哥哥，无需相互喜欢，直接在线开聊");
            } else {
                textView.setText("无限次在线闪聊匹配附近在线的小姐姐，无需相互喜欢，直接在线开聊");
            }
            m57373W0(Privilege.online_match_tickets_oDiamond);
            return;
        }
        if (!sab0.m182903u(this.f37776h)) {
            m57373W0(Privilege.online_match_tickets);
            this.f37772d.setText(CoreModule.m29935P().m94651a().mo33473bk());
            this.f37773e.setText(String.format(CoreModule.m29935P().m94651a().mo33341Il(), CoreModule.m29935P().m94651a().mo33347Jj()));
        } else {
            wx80 wx80VarMo35013Hm = CoreModule.m29935P().m94656g().mo35013Hm(this.f37776h, Privilege.online_match_tickets);
            this.f37772d.setText(wx80VarMo35013Hm.m205968t());
            this.f37773e.setText(wx80VarMo35013Hm.m205948d());
            m57348X0(zz6.m221004u0() ? "https://static.tancdn.com/pe-webplatform/xeCKbwBwsyO_2S_aqVZBAcih.webp" : "https://static.tancdn.com/pe-webplatform/zcF1NEaP1bhvbIlGHlxTj8AR.webp");
        }
    }

    /* JADX INFO: renamed from: D0 */
    private void m57342D0() {
        CorePayInnerService corePayInnerServiceM94656g = CoreModule.m29935P().m94656g();
        Privilege privilege = Privilege.recover_unmatches;
        wx80 wx80VarMo35049bf = corePayInnerServiceM94656g.mo35049bf(privilege);
        this.f37772d.setText(wx80VarMo35049bf.m205968t());
        m57373W0(privilege);
        this.f37773e.setText(wx80VarMo35049bf.m205965q());
    }

    /* JADX INFO: renamed from: H0 */
    private void m57343H0() {
        CorePayInnerService corePayInnerServiceM94656g = CoreModule.m29935P().m94656g();
        Privilege privilege = Privilege.see_who_likes_me;
        wx80 wx80VarMo35049bf = corePayInnerServiceM94656g.mo35049bf(privilege);
        this.f37772d.setText(wx80VarMo35049bf != null ? wx80VarMo35049bf.m205968t() : getResources().getString(R$string.f20576E0));
        m57373W0(privilege);
        this.f37773e.setText(R$string.f20573D0);
    }

    /* JADX INFO: renamed from: T */
    private String m57347T(@StringRes int i) {
        return getContext().getString(i);
    }

    /* JADX INFO: renamed from: X0 */
    private void m57348X0(String str) {
        SimpleDraweeView vDraweeView = new VDraweeView(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(t100.f167264m, 0, 0, 0);
        layoutParams.gravity = 83;
        vDraweeView.setLayoutParams(layoutParams);
        ((djj) vDraweeView.getHierarchy()).m112076w(ftd0.f99180d);
        this.f37771c.removeAllViews();
        this.f37771c.addView(vDraweeView);
        qib0.f154691G.m102331L0(vDraweeView, str);
    }

    /* JADX INFO: renamed from: b0 */
    private void m57349b0() {
        CorePayInnerService corePayInnerServiceM94656g = CoreModule.m29935P().m94656g();
        Privilege privilege = Privilege.advanced_filter;
        wx80 wx80VarMo35049bf = corePayInnerServiceM94656g.mo35049bf(privilege);
        this.f37772d.setText(wx80VarMo35049bf != null ? wx80VarMo35049bf.m205968t() : "高级筛选");
        m57373W0(privilege);
        this.f37773e.setText(wx80VarMo35049bf.m205948d());
    }

    /* JADX INFO: renamed from: d0 */
    private void m57350d0() {
        wx80 wx80VarMo35013Hm = CoreModule.m29935P().m94656g().mo35013Hm(this.f37776h, Privilege.boost);
        this.f37772d.setText(wx80VarMo35013Hm.m205968t());
        m57368T0(this.f37776h);
        this.f37773e.setText(wx80VarMo35013Hm.m205948d());
    }

    /* JADX INFO: renamed from: l0 */
    private void m57351l0() {
        CorePayInnerService corePayInnerServiceM94656g = CoreModule.m29935P().m94656g();
        Privilege privilege = Privilege.letter;
        wx80 wx80VarMo35049bf = corePayInnerServiceM94656g.mo35049bf(privilege);
        this.f37772d.setText(wx80VarMo35049bf.m205968t());
        m57373W0(privilege);
        this.f37773e.setText(wx80VarMo35049bf.m205948d());
    }

    /* JADX INFO: renamed from: m0 */
    private void m57352m0() {
        CorePayInnerService corePayInnerServiceM94656g = CoreModule.m29935P().m94656g();
        Privilege privilege = Privilege.liked_user;
        wx80 wx80VarMo35049bf = corePayInnerServiceM94656g.mo35049bf(privilege);
        this.f37772d.setText(wx80VarMo35049bf.m205968t());
        m57373W0(privilege);
        this.f37773e.setText(wx80VarMo35049bf.m205948d());
    }

    /* JADX INFO: renamed from: o0 */
    private void m57353o0() {
        CorePayInnerService corePayInnerServiceM94656g = CoreModule.m29935P().m94656g();
        Privilege privilege = Privilege.message_read_state;
        wx80 wx80VarMo35049bf = corePayInnerServiceM94656g.mo35049bf(privilege);
        this.f37772d.setText(wx80VarMo35049bf != null ? wx80VarMo35049bf.m205968t() : "查看消息已读状态");
        m57373W0(privilege);
        this.f37773e.setText(wx80VarMo35049bf.m205948d());
    }

    /* JADX INFO: renamed from: E0 */
    public final void m57354E0() {
        wx80 wx80VarMo35049bf = CoreModule.m29935P().m94656g().mo35049bf(Privilege.svip_greet);
        this.f37772d.setText(wx80VarMo35049bf.m205968t());
        m57369U0(wx80VarMo35049bf.m205944b());
        this.f37773e.setText(wx80VarMo35049bf.m205948d());
    }

    /* JADX INFO: renamed from: G0 */
    public final void m57355G0() {
        wx80 wx80VarMo35049bf = CoreModule.m29935P().m94656g().mo35049bf(Privilege.say_hi_pkg);
        this.f37772d.setText(wx80VarMo35049bf.m205968t());
        this.f37773e.setText(wx80VarMo35049bf.m205965q());
        LayoutInflater.from(getContext()).inflate(k6c0.f121434t1, (ViewGroup) this.f37771c, true);
    }

    /* JADX INFO: renamed from: I0 */
    public final void m57356I0(PurchaseType purchaseType) {
        CorePayInnerService corePayInnerServiceM94656g = CoreModule.m29935P().m94656g();
        Privilege privilege = Privilege.vip_super_like;
        wx80 wx80VarMo35013Hm = corePayInnerServiceM94656g.mo35013Hm(purchaseType, privilege);
        if (sab0.m182891i(purchaseType) || sab0.m182903u(purchaseType)) {
            this.f37772d.setText(wx80VarMo35013Hm.m205968t());
        } else {
            boolean zMo33734Oi = ura.m195053e().m195057d().mo33734Oi();
            VText vText = this.f37772d;
            if (zMo33734Oi) {
                vText.setText(wx80VarMo35013Hm.m205968t());
            } else {
                vText.setText(getContext().getString(R$string.f20574D1, 5));
            }
        }
        if (gr9.INSTANCE.m127691g() && purchaseType == PurchaseType.TYPE_GET_VIP) {
            m57378Z0(privilege);
        } else if (sab0.m182903u(purchaseType)) {
            m57348X0(zz6.m221004u0() ? "https://static.tancdn.com/pe-webplatform/np-NSKBh576ah-F-vkAXzwZL.webp" : "https://static.tancdn.com/pe-webplatform/r0rStyaGok5vSlMsIhLqiokx.webp");
        } else {
            m57373W0(privilege);
        }
        this.f37773e.setText(wx80VarMo35013Hm.m205948d());
    }

    /* JADX INFO: renamed from: J0 */
    public final void m57357J0() {
        wx80 wx80VarMo35049bf = CoreModule.m29935P().m94656g().mo35049bf(Privilege.top_chat);
        this.f37772d.setText(wx80VarMo35049bf.m205968t());
        m57369U0(wx80VarMo35049bf.m205944b());
        this.f37773e.setText(wx80VarMo35049bf.m205965q());
    }

    /* JADX INFO: renamed from: K0 */
    public final void m57358K0() {
        wx80 wx80VarMo35049bf = CoreModule.m29935P().m94656g().mo35049bf(Privilege.top_like);
        this.f37772d.setText(wx80VarMo35049bf.m205968t());
        m57369U0(wx80VarMo35049bf.m205944b());
        this.f37773e.setText(wx80VarMo35049bf.m205965q());
    }

    /* JADX INFO: renamed from: L0 */
    public final void m57359L0(PurchaseType purchaseType) {
        CorePayInnerService corePayInnerServiceM94656g = CoreModule.m29935P().m94656g();
        Privilege privilege = Privilege.vip_undo;
        wx80 wx80VarMo35049bf = corePayInnerServiceM94656g.mo35049bf(privilege);
        this.f37772d.setText(wx80VarMo35049bf != null ? wx80VarMo35049bf.m205968t() : m57347T(R$string.f20568B1));
        if (gr9.INSTANCE.m127691g() && purchaseType == PurchaseType.TYPE_GET_VIP) {
            m57378Z0(privilege);
        } else {
            m57373W0(privilege);
        }
        this.f37773e.setText(wx80VarMo35049bf.m205948d());
        if (CoreModule.m29935P().m94651a().mo33433Vf()) {
            xdl0.m208344M(this.f37774f, true);
            this.f37774f.setText("使用反悔特权");
            this.f37774f.setOnClickListener(new View.OnClickListener() { // from class: l.eu80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f93220a.m57377Z(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: M0 */
    public final void m57360M0(PurchaseType purchaseType) {
        CorePayInnerService corePayInnerServiceM94656g = CoreModule.m29935P().m94656g();
        Privilege privilege = Privilege.vip_unlimited_likes;
        wx80 wx80VarMo35049bf = corePayInnerServiceM94656g.mo35049bf(privilege);
        this.f37772d.setText(wx80VarMo35049bf != null ? wx80VarMo35049bf.m205968t() : m57347T(R$string.f20704z1));
        if (gr9.INSTANCE.m127691g() && purchaseType == PurchaseType.TYPE_GET_VIP) {
            m57378Z0(privilege);
        } else {
            m57373W0(privilege);
        }
        this.f37773e.setText(wx80VarMo35049bf.m205948d());
    }

    /* JADX INFO: renamed from: N0 */
    public final void m57361N0() {
        wx80 wx80VarMo35049bf = CoreModule.m29935P().m94656g().mo35049bf(Privilege.vip_greet);
        this.f37772d.setText(wx80VarMo35049bf.m205968t());
        m57369U0(wx80VarMo35049bf.m205944b());
        this.f37773e.setText(wx80VarMo35049bf.m205948d());
    }

    /* JADX INFO: renamed from: O0 */
    public final void m57362O0() {
        wx80 wx80VarMo35013Hm = CoreModule.m29935P().m94656g().mo35013Hm(this.f37776h, Privilege.visitor_hide_footprint);
        this.f37772d.setText(wx80VarMo35013Hm.m205968t());
        this.f37773e.setText(wx80VarMo35013Hm.m205965q());
        LayoutInflater.from(getContext()).inflate(k6c0.f121437u1, (ViewGroup) this.f37771c, true);
    }

    /* JADX INFO: renamed from: P0 */
    public final void m57363P0() {
        String str;
        m57373W0(Privilege.voice_quick_chat);
        this.f37772d.setText("语音闪聊");
        if (sab0.m182891i(this.f37776h)) {
            str = CoreModule.f17545c.f19639e0.m169527p9().isFemale() ? "21" : "4";
        } else {
            str = "1";
        }
        this.f37773e.setText(String.format("每天额外%s次语音闪聊，随时连线附近的%s", str, zz6.m221004u0() ? "小哥哥" : "小姐姐"));
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m57364Q0(Privilege privilege) {
        wx80 wx80VarMo35013Hm = CoreModule.m29935P().m94656g().mo35013Hm(this.f37776h, privilege);
        this.f37772d.setText(wx80VarMo35013Hm.m205968t());
        this.f37773e.setText(wx80VarMo35013Hm.m205965q());
        if (privilege == Privilege.youth_roaming) {
            m57373W0(Privilege.vip_location);
            return;
        }
        if (privilege == Privilege.youth_superlike) {
            m57373W0(Privilege.vip_super_like);
            return;
        }
        if (privilege == Privilege.youth_message_read) {
            m57373W0(Privilege.message_read_state);
        } else if (privilege == Privilege.youth_find_partner) {
            m57348X0("https://auto.tancdn.com/v1/images/eyJpZCI6IjVQSFIyWk5aU1haTk9KWEZSUkVJQlNONjNPRElLUzE0IiwidyI6NDk1LCJoIjo2MTgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo0NTI1NDYwMzczMjc3MjUzMzI3fQ.png");
        } else {
            m57348X0("https://auto.tancdn.com/v1/images/eyJpZCI6IllQVVA2V0I2NU9QVlBUQ0U0TVE0TFJJS0MyWUJYVzE0IiwidyI6NDk1LCJoIjo2MTgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMjU4NjY0MzA1ODg2MDY3MjB9.png");
        }
    }

    /* JADX INFO: renamed from: R0 */
    public void m57365R0() {
        switch (C9004a.f37781a[this.f37779k.ordinal()]) {
            case 1:
                m57358K0();
                break;
            case 2:
                m57357J0();
                break;
            case 3:
            case 4:
                m57381c0(this.f37779k, this.f37776h);
                break;
            case 5:
                m57356I0(this.f37776h);
                break;
            case 6:
                m57359L0(this.f37776h);
                break;
            case 7:
                m57360M0(this.f37776h);
                break;
            case 8:
                m57389n0(this.f37776h);
                break;
            case 9:
                m57353o0();
                break;
            case 10:
                m57349b0();
                break;
            case 11:
                m57351l0();
                break;
            case 12:
                m57387j0();
                break;
            case 13:
                m57361N0();
                break;
            case 14:
                m57354E0();
                break;
            case 15:
                if (!sab0.m182889g(this.f37776h)) {
                    m57340A0();
                } else {
                    m57386i0(this.f37779k);
                }
                break;
            case 16:
                m57342D0();
                break;
            case 17:
                m57343H0();
                break;
            case 18:
                m57341B0();
                break;
            case 19:
                m57363P0();
                break;
            case 20:
                m57350d0();
                break;
            case 21:
                m57352m0();
                break;
            case 22:
                m57384g0();
                break;
            case 23:
                m57396v0();
                break;
            case 24:
                m57398x0();
                break;
            case 25:
                m57393s0();
                break;
            case 26:
                m57400z0(this.f37776h);
                break;
            case 27:
                m57397w0();
                break;
            case 28:
                m57394t0();
                break;
            case 29:
                m57388k0(this.f37776h);
                break;
            case 30:
                m57395u0();
                break;
            case 31:
                m57355G0();
                break;
            case 32:
                m57390p0(this.f37776h);
                break;
            case 33:
                m57379a0();
                break;
            case 34:
                m57382e0();
                break;
            case 35:
                m57399y0();
                break;
            case 36:
                m57391q0();
                break;
            case 37:
                m57392r0();
                break;
            case 38:
                m57385h0();
                break;
            case 39:
                m57362O0();
                break;
            case 40:
                m57383f0();
                break;
            case 41:
            case 42:
            case 43:
            case 44:
                m57386i0(this.f37779k);
                break;
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                m57364Q0(this.f37779k);
                break;
            case 50:
                m57376Y0(this.f37779k);
                break;
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m57366S(View view) {
        hu80.m133097a(this, view);
    }

    /* JADX INFO: renamed from: S0 */
    public final void m57367S0(Privilege privilege, PurchaseType purchaseType) {
        String strM57370V = m57370V(privilege);
        SVGAnimationView sVGAnimationView = new SVGAnimationView(getContext());
        SVGADynamicEntity sVGADynamicEntity = new SVGADynamicEntity();
        s5h0.INSTANCE.m182350f(this.f37780l, sVGADynamicEntity, CoreModule.f17545c.f19639e0.m169520na().m60124fp().profileSmall().formatted(), "head01", 256, 349, null);
        SVGALoader.with(getContext()).from(strM57370V).autoPlay(false).repeatCount(0).dynamic(sVGADynamicEntity).into(sVGAnimationView);
        if (!sVGAnimationView.isAnimating()) {
            sVGAnimationView.startAnimation();
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(t100.m186890d(230.0f), t100.m186890d(180.0f));
        layoutParams.setMargins(t100.m186890d(40.0f), t100.m186890d(16.0f), t100.m186890d(0.0f), -4);
        layoutParams.gravity = 83;
        sVGAnimationView.setScaleType(ImageView.ScaleType.FIT_START);
        sVGAnimationView.setLayoutParams(layoutParams);
        this.f37771c.removeAllViews();
        this.f37771c.addView(sVGAnimationView);
    }

    /* JADX INFO: renamed from: T0 */
    public final void m57368T0(PurchaseType purchaseType) {
        String strM57403a = PrivilegeItemPicUtils.m57403a(Privilege.boost);
        if (NullChecker.m81304b(strM57403a)) {
            m57348X0(strM57403a);
        }
    }

    /* JADX INFO: renamed from: U0 */
    public final void m57369U0(int i) {
        VImage vImage = new VImage(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(t100.m186890d(24.0f), t100.m186890d(16.0f), t100.m186890d(24.0f), 0);
        layoutParams.gravity = 83;
        vImage.setLayoutParams(layoutParams);
        vImage.setScaleType(ImageView.ScaleType.FIT_START);
        vImage.setImageResource(i);
        this.f37771c.removeAllViews();
        this.f37771c.addView(vImage);
    }

    /* JADX INFO: renamed from: V */
    public String m57370V(Privilege privilege) {
        boolean zM221004u0 = zz6.m221004u0();
        int i = C9004a.f37781a[privilege.ordinal()];
        if (i == 3) {
            return "https://fe-static.tancdn.com/v1/raw/23062852-0e3d-4764-a4d6-2f8de6c1cb6414.svga";
        }
        if (i == 5) {
            return Build.VERSION.SDK_INT >= 26 ? "https://fe-static.tancdn.com/v1/raw/a0f91ef4-557e-42ee-b8d4-49cc214b420114.svga" : "https://fe-static.tancdn.com/v1/raw/bc84c4bf-a22a-4581-a960-5bf284b495d114.svga";
        }
        if (i == 6) {
            return zM221004u0 ? "https://fe-static.tancdn.com/v1/raw/ffd9f6bb-4ebc-4e09-9360-8068cd517d2114.svga" : "https://fe-static.tancdn.com/v1/raw/186c6451-d385-4a2c-9d10-20a5a80a41ea14.svga";
        }
        if (i == 7) {
            return zM221004u0 ? "https://fe-static.tancdn.com/v1/raw/8fc25c33-a059-4bd2-860d-dbbcfe3c802e14.svga" : "https://fe-static.tancdn.com/v1/raw/bbbd2b04-46f6-472c-8c15-b6af4d9d3e5214.svga";
        }
        if (i != 8) {
            return null;
        }
        return "https://fe-static.tancdn.com/v1/raw/92d066a1-5685-4352-807f-a34721fe7a7814.svga";
    }

    /* JADX INFO: renamed from: V0 */
    public final void m57371V0(int i) {
        VImage vImage = new VImage(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 83;
        vImage.setLayoutParams(layoutParams);
        vImage.setScaleType(ImageView.ScaleType.FIT_START);
        vImage.setImageResource(i);
        this.f37771c.removeAllViews();
        this.f37771c.addView(vImage);
    }

    /* JADX INFO: renamed from: W */
    public void m57372W(PutongFrag putongFrag, C9008a.e eVar, Privilege privilege, Act act, PurchaseType purchaseType) {
        this.f37777i = eVar;
        this.f37778j = putongFrag;
        this.f37779k = privilege;
        this.f37780l = act;
        this.f37776h = purchaseType;
        if (sab0.m182903u(purchaseType)) {
            this.f37772d.setTextColor(Color.parseColor("#CCFFD489"));
            this.f37773e.setTextColor(Color.parseColor("#66FFD489"));
        }
    }

    /* JADX INFO: renamed from: W0 */
    public final void m57373W0(Privilege privilege) {
        String strM57403a = PrivilegeItemPicUtils.m57403a(privilege);
        if (NullChecker.m81304b(strM57403a)) {
            m57348X0(strM57403a);
        }
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m57374X(RoamedLocationData roamedLocationData) {
        this.f37775g = roamedLocationData;
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m57375Y(View view) {
        CoreModule.m29935P().m94651a().mo33393Q8(this.f37780l, this.f37775g);
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m57376Y0(Privilege privilege) {
        wx80 wx80VarMo35013Hm = CoreModule.m29935P().m94656g().mo35013Hm(this.f37776h, privilege);
        this.f37772d.setText(wx80VarMo35013Hm.m205968t());
        this.f37773e.setText(wx80VarMo35013Hm.m205965q());
        this.f37771c.removeAllViews();
        LayoutInflater.from(getContext()).inflate(k6c0.f121427r1, (ViewGroup) this.f37771c, true);
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m57377Z(View view) {
        Act act = this.f37780l;
        act.startActivity(NewMyLikedUsersAct.m46821Z1(act, "undoUser"));
    }

    /* JADX INFO: renamed from: Z0 */
    public final void m57378Z0(Privilege privilege) {
        String strM57370V = m57370V(privilege);
        if (NullChecker.m81304b(strM57370V)) {
            m57380a1(strM57370V);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final void m57379a0() {
        CorePayInnerService corePayInnerServiceM94656g = CoreModule.m29935P().m94656g();
        PurchaseType purchaseType = this.f37776h;
        Privilege privilege = Privilege.accelerate_pairing;
        wx80 wx80VarMo35013Hm = corePayInnerServiceM94656g.mo35013Hm(purchaseType, privilege);
        this.f37772d.setText(wx80VarMo35013Hm.m205968t());
        this.f37773e.setText(wx80VarMo35013Hm.m205965q());
        String strM57403a = PrivilegeItemPicUtils.m57403a(privilege);
        if (NullChecker.m81304b(strM57403a)) {
            m57348X0(strM57403a);
        }
    }

    /* JADX INFO: renamed from: a1 */
    public final void m57380a1(String str) {
        SVGAnimationView sVGAnimationView = new SVGAnimationView(getContext());
        SVGALoader.with(getContext()).from(str).autoPlay(false).repeatCount(0).into(sVGAnimationView);
        if (!sVGAnimationView.isAnimating()) {
            sVGAnimationView.startAnimation();
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(t100.m186890d(230.0f), t100.m186890d(180.0f));
        layoutParams.setMargins(t100.m186890d(40.0f), t100.m186890d(16.0f), t100.m186890d(0.0f), -4);
        layoutParams.gravity = 83;
        sVGAnimationView.setScaleType(ImageView.ScaleType.FIT_START);
        sVGAnimationView.setLayoutParams(layoutParams);
        this.f37771c.removeAllViews();
        this.f37771c.addView(sVGAnimationView);
    }

    /* JADX INFO: renamed from: c0 */
    public final void m57381c0(Privilege privilege, PurchaseType purchaseType) {
        wx80 wx80VarMo35049bf = CoreModule.m29935P().m94656g().mo35049bf(privilege);
        this.f37772d.setText(wx80VarMo35049bf != null ? wx80VarMo35049bf.m205968t() : m57347T(R$string.f20571C1));
        if (gr9.INSTANCE.m127691g() && purchaseType == PurchaseType.TYPE_GET_VIP) {
            m57367S0(Privilege.vip_badge, purchaseType);
        } else {
            ((PrivilegeContentDlgItemBadgeView) o7r.m163037a(getContext()).inflate(k6c0.f121407m1, (ViewGroup) this.f37771c, true).findViewById(x4c0.f190991b)).m57324b(privilege, purchaseType);
        }
        boolean zM182897o = sab0.m182897o(purchaseType);
        TextView textView = this.f37773e;
        if (zM182897o) {
            textView.setText("展示 白金会员 尊贵标识，或者低调地隐藏会员身份");
        } else {
            textView.setText(privilege == Privilege.svip_badge ? R$string.f20569C : R$string.f20575E);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final void m57382e0() {
        wx80 wx80VarMo35013Hm = CoreModule.m29935P().m94656g().mo35013Hm(this.f37776h, Privilege.city_topping);
        this.f37772d.setText(wx80VarMo35013Hm.m205968t());
        this.f37773e.setText(wx80VarMo35013Hm.m205948d());
        this.f37771c.removeAllViews();
        LayoutInflater.from(getContext()).inflate(k6c0.f121411n1, (ViewGroup) this.f37771c, true);
    }

    /* JADX INFO: renamed from: f0 */
    public final void m57383f0() {
        wx80 wx80VarMo35049bf = CoreModule.m29935P().m94656g().mo35049bf(Privilege.confession_first);
        this.f37772d.setText(wx80VarMo35049bf.m205968t());
        this.f37773e.setText(wx80VarMo35049bf.m205965q());
        this.f37771c.removeAllViews();
        LayoutInflater.from(getContext()).inflate(k6c0.f121434t1, (ViewGroup) this.f37771c, true);
        View childAt = this.f37771c.getChildAt(0);
        if (childAt instanceof PrivilegeContentDlgItemSVipSayHiView) {
            ((PrivilegeContentDlgItemSVipSayHiView) childAt).m57333c();
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final void m57384g0() {
        wx80 wx80VarMo35013Hm = CoreModule.m29935P().m94656g().mo35013Hm(this.f37776h, Privilege.customer_service);
        this.f37772d.setText(wx80VarMo35013Hm.m205968t());
        this.f37773e.setText(wx80VarMo35013Hm.m205965q());
        if (!sab0.m182903u(this.f37776h)) {
            ((PrivilegeContentDlgItemDiamondServiceView) o7r.m163037a(getContext()).inflate(k6c0.f121415o1, (ViewGroup) this.f37771c, true).findViewById(x4c0.f190969D)).m57326b();
        } else {
            this.f37771c.removeAllViews();
            o7r.m163037a(getContext()).inflate(k6c0.f121431s1, (ViewGroup) this.f37771c, true);
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final void m57385h0() {
        wx80 wx80VarMo35013Hm = CoreModule.m29935P().m94656g().mo35013Hm(this.f37776h, Privilege.exclusive_dressing_up);
        this.f37772d.setText(wx80VarMo35013Hm.m205968t());
        this.f37773e.setText(wx80VarMo35013Hm.m205948d());
        this.f37771c.removeAllViews();
        LayoutInflater.from(getContext()).inflate(k6c0.f121423q1, (ViewGroup) this.f37771c, true);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m57386i0(Privilege privilege) {
        wx80 wx80VarMo35013Hm = CoreModule.m29935P().m94656g().mo35013Hm(this.f37776h, privilege);
        this.f37772d.setText(wx80VarMo35013Hm.m205968t());
        this.f37773e.setText(wx80VarMo35013Hm.m205965q());
        m57369U0(wx80VarMo35013Hm.m205944b());
    }

    /* JADX INFO: renamed from: j0 */
    public final void m57387j0() {
        wx80 wx80VarMo35013Hm = CoreModule.m29935P().m94656g().mo35013Hm(this.f37776h, Privilege.greet);
        this.f37772d.setText(wx80VarMo35013Hm.m205968t());
        m57369U0(wx80VarMo35013Hm.m205944b());
        this.f37773e.setText(wx80VarMo35013Hm.m205948d());
    }

    /* JADX INFO: renamed from: k0 */
    public final void m57388k0(PurchaseType purchaseType) {
        CorePayInnerService corePayInnerServiceM94656g = CoreModule.m29935P().m94656g();
        Privilege privilege = Privilege.leave_message;
        wx80 wx80VarMo35049bf = corePayInnerServiceM94656g.mo35049bf(privilege);
        this.f37772d.setText("每天5条资料留言");
        m57373W0(privilege);
        this.f37773e.setText(wx80VarMo35049bf.m205948d());
    }

    /* JADX INFO: renamed from: n0 */
    public final void m57389n0(PurchaseType purchaseType) {
        CorePayInnerService corePayInnerServiceM94656g = CoreModule.m29935P().m94656g();
        Privilege privilege = Privilege.vip_location;
        wx80 wx80VarMo35049bf = corePayInnerServiceM94656g.mo35049bf(privilege);
        this.f37772d.setText(wx80VarMo35049bf != null ? wx80VarMo35049bf.m205968t() : m57347T(R$string.f20565A1));
        this.f37773e.setText(wx80VarMo35049bf.m205948d());
        if (gr9.INSTANCE.m127691g() && purchaseType == PurchaseType.TYPE_GET_VIP) {
            m57378Z0(privilege);
        } else {
            m57373W0(privilege);
        }
        if (mb90.m153866b(PurchaseType.TYPE_ROAMING_PKG)) {
            xdl0.m208344M(this.f37774f, true);
            this.f37774f.setText(m57347T(R$string.f20701y1));
            this.f37777i.m115452n(this.f37778j, CoreModule.f17545c.f19657k0.f20088R.m121230k()).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.fu80
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f99319a.m57374X((RoamedLocationData) obj);
                }
            }));
            this.f37774f.setOnClickListener(new View.OnClickListener() { // from class: l.gu80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f104382a.m57375Y(view);
                }
            });
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57366S(this);
        this.f37772d.setTypeface(eqh0.m117752c(3), 1);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m57390p0(PurchaseType purchaseType) {
        CorePayInnerService corePayInnerServiceM94656g = CoreModule.m29935P().m94656g();
        Privilege privilege = Privilege.moment_boost;
        wx80 wx80VarMo35013Hm = corePayInnerServiceM94656g.mo35013Hm(purchaseType, privilege);
        if (sab0.m182891i(purchaseType)) {
            m57348X0(zz6.m221004u0() ? "https://auto.tancdn.com/v1/raw/c311e8b5-c0ab-4594-a2bd-c6820de4dd9d13.webp" : "https://auto.tancdn.com/v1/raw/feb9b413-c633-45c5-ba56-2f35a1acc87c12.webp");
        } else {
            m57373W0(privilege);
        }
        this.f37772d.setText(wx80VarMo35013Hm.m205968t());
        this.f37773e.setText(wx80VarMo35013Hm.m205965q());
    }

    /* JADX INFO: renamed from: q0 */
    public final void m57391q0() {
        wx80 wx80VarMo35013Hm = CoreModule.m29935P().m94656g().mo35013Hm(this.f37776h, Privilege.mysterious_mode);
        this.f37772d.setText(wx80VarMo35013Hm.m205968t());
        this.f37773e.setText(wx80VarMo35013Hm.m205948d());
        String str = zz6.m221004u0() ? "https://static.tancdn.com/pe-webplatform/4k6oow3xpt5qgqNfRIe51ZQC.webp" : "https://static.tancdn.com/pe-webplatform/fugcVz2_GhwzRjvaYY-TfFQX.webp";
        if (NullChecker.m81304b(str)) {
            m57348X0(str);
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final void m57392r0() {
        wx80 wx80VarMo35013Hm = CoreModule.m29935P().m94656g().mo35013Hm(this.f37776h, Privilege.nearby_people);
        this.f37772d.setText(wx80VarMo35013Hm.m205968t());
        this.f37773e.setText(wx80VarMo35013Hm.m205948d());
        String str = zz6.m221004u0() ? "https://static.tancdn.com/pe-webplatform/6LRexqdNGQAaCHkaMOrf98XD.webp" : "https://static.tancdn.com/pe-webplatform/x-IUiN-PejudNCvVnUlJwHMo.webp";
        if (CoreModule.m29935P().m94656g().mo35004D9() && (sab0.m182899q(this.f37776h) || sab0.m182891i(this.f37776h))) {
            str = zz6.m221004u0() ? "https://auto.tancdn.com/v1/raw/8a8beca9-31c9-487c-a103-351eeacd36cc14.webp" : "https://auto.tancdn.com/v1/raw/f2ae8713-c3b2-401f-ab2f-00038efd9a5c14.webp";
        } else if (CoreModule.m29935P().m94656g().mo35017Ki() && sab0.m182897o(this.f37776h)) {
            str = zz6.m221004u0() ? "https://auto.tancdn.com/v1/raw/60c8d055-cb62-4c9e-a3bc-cbac2ce51c9a14.webp" : "https://auto.tancdn.com/v1/raw/57a96d00-8658-49c5-a45b-7d1a52b50d8914.webp";
        }
        if (NullChecker.m81304b(str)) {
            m57348X0(str);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final void m57393s0() {
        wx80 wx80VarMo35049bf = CoreModule.m29935P().m94656g().mo35049bf(Privilege.oDiamondGreetings);
        this.f37772d.setText(wx80VarMo35049bf.m205968t());
        this.f37773e.setText(wx80VarMo35049bf.m205965q());
        LayoutInflater.from(getContext()).inflate(k6c0.f121434t1, (ViewGroup) this.f37771c, true);
    }

    /* JADX INFO: renamed from: t0 */
    public final void m57394t0() {
        CorePayInnerService corePayInnerServiceM94656g = CoreModule.m29935P().m94656g();
        PurchaseType purchaseType = this.f37776h;
        Privilege privilege = Privilege.immediately_match;
        wx80 wx80VarMo35013Hm = corePayInnerServiceM94656g.mo35013Hm(purchaseType, privilege);
        if (sab0.m182903u(this.f37776h)) {
            m57348X0(zz6.m221004u0() ? "https://static.tancdn.com/pe-webplatform/8nPaE2uG8jPQEGffEVJ4jJkB.webp" : "https://static.tancdn.com/pe-webplatform/vivHEa6wkdFHKU0PKLkNaj2u.webp");
        } else {
            m57373W0(privilege);
        }
        this.f37772d.setText(wx80VarMo35013Hm.m205968t());
        this.f37773e.setText(wx80VarMo35013Hm.m205965q());
    }

    /* JADX INFO: renamed from: u0 */
    public final void m57395u0() {
        wx80 wx80VarMo35049bf = CoreModule.m29935P().m94656g().mo35049bf(Privilege.live_entry_animation);
        m57369U0(wx80VarMo35049bf.m205944b());
        this.f37772d.setText(wx80VarMo35049bf.m205968t());
        this.f37773e.setText(wx80VarMo35049bf.m205965q());
    }

    /* JADX INFO: renamed from: v0 */
    public final void m57396v0() {
        wx80 wx80VarMo35049bf = CoreModule.m29935P().m94656g().mo35049bf(Privilege.oDiamondSvipSkin);
        this.f37772d.setText(wx80VarMo35049bf.m205968t());
        this.f37773e.setText(wx80VarMo35049bf.m205965q());
        ((PrivilegeContentDlgItemDiamondSkinView) o7r.m163037a(getContext()).inflate(k6c0.f121419p1, (ViewGroup) this.f37771c, true).findViewById(x4c0.f190969D)).m57328b();
    }

    /* JADX INFO: renamed from: w0 */
    public final void m57397w0() {
        wx80 wx80VarMo35049bf = CoreModule.m29935P().m94656g().mo35049bf(Privilege.oDiamondSvipExtra);
        if (sab0.m182903u(this.f37776h)) {
            m57348X0("https://static.tancdn.com/pe-webplatform/aG1xQE9fUqiUSct3f8qvjX4y.webp");
        } else {
            m57371V0(wx80VarMo35049bf.m205944b());
        }
        this.f37772d.setText(wx80VarMo35049bf.m205968t());
        this.f37773e.setText(wx80VarMo35049bf.m205965q());
    }

    /* JADX INFO: renamed from: x0 */
    public final void m57398x0() {
        CorePayInnerService corePayInnerServiceM94656g = CoreModule.m29935P().m94656g();
        Privilege privilege = Privilege.oDiamondVisitor;
        wx80 wx80VarMo35049bf = corePayInnerServiceM94656g.mo35049bf(privilege);
        m57373W0(privilege);
        this.f37772d.setText(wx80VarMo35049bf.m205968t());
        this.f37773e.setText(wx80VarMo35049bf.m205965q());
    }

    /* JADX INFO: renamed from: y0 */
    public final void m57399y0() {
        wx80 wx80VarMo35013Hm = CoreModule.m29935P().m94656g().mo35013Hm(this.f37776h, Privilege.personal_customization);
        this.f37772d.setText(wx80VarMo35013Hm.m205968t());
        this.f37773e.setText(wx80VarMo35013Hm.m205948d());
        String str = zz6.m221004u0() ? "https://static.tancdn.com/pe-webplatform/aaGGiuxW60ADoOO_MxDtST58.webp" : "https://static.tancdn.com/pe-webplatform/60oshsV4Fu2iaZfEuqxNeSji.webp";
        if (NullChecker.m81304b(str)) {
            m57348X0(str);
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final void m57400z0(PurchaseType purchaseType) {
        CorePayInnerService corePayInnerServiceM94656g = CoreModule.m29935P().m94656g();
        Privilege privilege = Privilege.picksMembership;
        wx80 wx80VarMo35013Hm = corePayInnerServiceM94656g.mo35013Hm(purchaseType, privilege);
        if (sab0.m182903u(purchaseType)) {
            m57348X0(zz6.m221004u0() ? "https://static.tancdn.com/pe-webplatform/SVhzDulIxVOWEQ7y44VOsVaH.webp" : "https://static.tancdn.com/pe-webplatform/GefWPXpePA0KOkKaH1VV51tL.webp");
        } else {
            m57373W0(privilege);
        }
        this.f37772d.setText(wx80VarMo35013Hm.m205968t());
        this.f37773e.setText(wx80VarMo35013Hm.m205965q());
    }

    public PrivilegeContentDlgItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f37775g = RoamedLocationData.new_();
    }

    public PrivilegeContentDlgItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f37775g = RoamedLocationData.new_();
    }
}
