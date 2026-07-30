package com.p051p1.mobile.putong.core.p058ui.vip.privilege.dlg;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.biz.service.CorePayInnerService;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.RoamedLocationData;
import com.p051p1.mobile.putong.core.member.R$string;
import com.p051p1.mobile.putong.core.p058ui.likedusers.tablayout.NewMyLikedUsersAct;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantan.library.svga.compose.SVGADynamicEntity;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p153l.a690;
import p153l.aeh0;
import p153l.bnl0;
import p153l.c17;
import p153l.ddc0;
import p153l.gta;
import p153l.h1e0;
import p153l.l290;
import p153l.lyh0;
import p153l.p9r;
import p153l.pec0;
import p153l.psd0;
import p153l.qa00;
import p153l.qj90;
import p153l.rs9;
import p153l.uqb0;
import p153l.wib0;
import p153l.wlj;
import p153l.y20;

/* JADX INFO: loaded from: classes12.dex */
public class PrivilegeContentDlgItemView extends VLinear {

    /* JADX INFO: renamed from: c */
    public FrameLayout f38619c;

    /* JADX INFO: renamed from: d */
    public VText f38620d;

    /* JADX INFO: renamed from: e */
    public TextView f38621e;

    /* JADX INFO: renamed from: f */
    public TextView f38622f;

    /* JADX INFO: renamed from: g */
    public RoamedLocationData f38623g;

    /* JADX INFO: renamed from: h */
    public PurchaseType f38624h;

    /* JADX INFO: renamed from: i */
    public C9171a.e f38625i;

    /* JADX INFO: renamed from: j */
    public PutongFrag f38626j;

    /* JADX INFO: renamed from: k */
    public Privilege f38627k;

    /* JADX INFO: renamed from: l */
    public Act f38628l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.dlg.PrivilegeContentDlgItemView$a */
    public static /* synthetic */ class C9167a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f38629a;

        static {
            int[] iArr = new int[Privilege.values().length];
            f38629a = iArr;
            try {
                iArr[Privilege.top_like.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38629a[Privilege.top_chat.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f38629a[Privilege.vip_badge.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f38629a[Privilege.svip_badge.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f38629a[Privilege.vip_super_like.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f38629a[Privilege.vip_undo.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f38629a[Privilege.vip_unlimited_likes.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f38629a[Privilege.vip_location.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f38629a[Privilege.message_read_state.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f38629a[Privilege.advanced_filter.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f38629a[Privilege.letter.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f38629a[Privilege.greet.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f38629a[Privilege.vip_greet.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f38629a[Privilege.svip_greet.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f38629a[Privilege.privacy_membership.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f38629a[Privilege.recover_unmatches.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f38629a[Privilege.see_who_likes_me.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f38629a[Privilege.online_match_tickets.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f38629a[Privilege.voice_quick_chat.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f38629a[Privilege.boost.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f38629a[Privilege.liked_user.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f38629a[Privilege.customer_service.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f38629a[Privilege.oDiamondSvipSkin.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f38629a[Privilege.oDiamondVisitor.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f38629a[Privilege.oDiamondGreetings.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f38629a[Privilege.picksMembership.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f38629a[Privilege.oDiamondSvipExtra.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f38629a[Privilege.immediately_match.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f38629a[Privilege.leave_message.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f38629a[Privilege.live_entry_animation.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f38629a[Privilege.say_hi_pkg.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f38629a[Privilege.moment_boost.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f38629a[Privilege.accelerate_pairing.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f38629a[Privilege.city_topping.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f38629a[Privilege.personal_customization.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f38629a[Privilege.mysterious_mode.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f38629a[Privilege.nearby_people.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f38629a[Privilege.exclusive_dressing_up.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                f38629a[Privilege.visitor_hide_footprint.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f38629a[Privilege.confession_first.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f38629a[Privilege.block_harassing_words.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                f38629a[Privilege.ads_not_disturb.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                f38629a[Privilege.pick_tantan_credits_users.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                f38629a[Privilege.unlock_learn_about_him_module.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                f38629a[Privilege.youth_roaming.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                f38629a[Privilege.youth_find_partner.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                f38629a[Privilege.youth_blind_box.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                f38629a[Privilege.youth_superlike.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                f38629a[Privilege.youth_message_read.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
            try {
                f38629a[Privilege.hide_me_from_nearby.ordinal()] = 50;
            } catch (NoSuchFieldError unused50) {
            }
        }
    }

    public PrivilegeContentDlgItemView(@NonNull Context context) {
        super(context);
        this.f38623g = RoamedLocationData.new_();
    }

    /* JADX INFO: renamed from: A0 */
    private void m58523A0() {
        CorePayInnerService corePayInnerServiceM143410g = CoreModule.m30933P().m143410g();
        Privilege privilege = Privilege.privacy_membership;
        a690 a690VarMo36052bf = corePayInnerServiceM143410g.mo36052bf(privilege);
        this.f38620d.setText(a690VarMo36052bf.m96314t());
        m58556W0(privilege);
        this.f38621e.setText(a690VarMo36052bf.m96294d());
    }

    /* JADX INFO: renamed from: B0 */
    private void m58524B0() {
        if (wib0.m206565i(this.f38624h)) {
            this.f38620d.setText("无限次在线闪聊");
            boolean zM107528u0 = c17.m107528u0();
            TextView textView = this.f38621e;
            if (zM107528u0) {
                textView.setText("无限次在线闪聊匹配附近在线的小哥哥，无需相互喜欢，直接在线开聊");
            } else {
                textView.setText("无限次在线闪聊匹配附近在线的小姐姐，无需相互喜欢，直接在线开聊");
            }
            m58556W0(Privilege.online_match_tickets_oDiamond);
            return;
        }
        if (!wib0.m206577u(this.f38624h)) {
            m58556W0(Privilege.online_match_tickets);
            this.f38620d.setText(CoreModule.m30933P().m143405a().mo34476bk());
            this.f38621e.setText(String.format(CoreModule.m30933P().m143405a().mo34344Il(), CoreModule.m30933P().m143405a().mo34350Jj()));
        } else {
            a690 a690VarMo36016Hm = CoreModule.m30933P().m143410g().mo36016Hm(this.f38624h, Privilege.online_match_tickets);
            this.f38620d.setText(a690VarMo36016Hm.m96314t());
            this.f38621e.setText(a690VarMo36016Hm.m96294d());
            m58531X0(c17.m107528u0() ? "https://static.tancdn.com/pe-webplatform/xeCKbwBwsyO_2S_aqVZBAcih.webp" : "https://static.tancdn.com/pe-webplatform/zcF1NEaP1bhvbIlGHlxTj8AR.webp");
        }
    }

    /* JADX INFO: renamed from: D0 */
    private void m58525D0() {
        CorePayInnerService corePayInnerServiceM143410g = CoreModule.m30933P().m143410g();
        Privilege privilege = Privilege.recover_unmatches;
        a690 a690VarMo36052bf = corePayInnerServiceM143410g.mo36052bf(privilege);
        this.f38620d.setText(a690VarMo36052bf.m96314t());
        m58556W0(privilege);
        this.f38621e.setText(a690VarMo36052bf.m96311q());
    }

    /* JADX INFO: renamed from: H0 */
    private void m58526H0() {
        CorePayInnerService corePayInnerServiceM143410g = CoreModule.m30933P().m143410g();
        Privilege privilege = Privilege.see_who_likes_me;
        a690 a690VarMo36052bf = corePayInnerServiceM143410g.mo36052bf(privilege);
        this.f38620d.setText(a690VarMo36052bf != null ? a690VarMo36052bf.m96314t() : getResources().getString(R$string.f21318E0));
        m58556W0(privilege);
        this.f38621e.setText(R$string.f21315D0);
    }

    /* JADX INFO: renamed from: T */
    private String m58530T(@StringRes int i) {
        return getContext().getString(i);
    }

    /* JADX INFO: renamed from: X0 */
    private void m58531X0(String str) {
        SimpleDraweeView vDraweeView = new VDraweeView(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(qa00.f156326m, 0, 0, 0);
        layoutParams.gravity = 83;
        vDraweeView.setLayoutParams(layoutParams);
        ((wlj) vDraweeView.getHierarchy()).m207062w(h1e0.f107447d);
        this.f38619c.removeAllViews();
        this.f38619c.addView(vDraweeView);
        uqb0.f180374G.m127115L0(vDraweeView, str);
    }

    /* JADX INFO: renamed from: b0 */
    private void m58532b0() {
        CorePayInnerService corePayInnerServiceM143410g = CoreModule.m30933P().m143410g();
        Privilege privilege = Privilege.advanced_filter;
        a690 a690VarMo36052bf = corePayInnerServiceM143410g.mo36052bf(privilege);
        this.f38620d.setText(a690VarMo36052bf != null ? a690VarMo36052bf.m96314t() : "高级筛选");
        m58556W0(privilege);
        this.f38621e.setText(a690VarMo36052bf.m96294d());
    }

    /* JADX INFO: renamed from: d0 */
    private void m58533d0() {
        a690 a690VarMo36016Hm = CoreModule.m30933P().m143410g().mo36016Hm(this.f38624h, Privilege.boost);
        this.f38620d.setText(a690VarMo36016Hm.m96314t());
        m58551T0(this.f38624h);
        this.f38621e.setText(a690VarMo36016Hm.m96294d());
    }

    /* JADX INFO: renamed from: l0 */
    private void m58534l0() {
        CorePayInnerService corePayInnerServiceM143410g = CoreModule.m30933P().m143410g();
        Privilege privilege = Privilege.letter;
        a690 a690VarMo36052bf = corePayInnerServiceM143410g.mo36052bf(privilege);
        this.f38620d.setText(a690VarMo36052bf.m96314t());
        m58556W0(privilege);
        this.f38621e.setText(a690VarMo36052bf.m96294d());
    }

    /* JADX INFO: renamed from: m0 */
    private void m58535m0() {
        CorePayInnerService corePayInnerServiceM143410g = CoreModule.m30933P().m143410g();
        Privilege privilege = Privilege.liked_user;
        a690 a690VarMo36052bf = corePayInnerServiceM143410g.mo36052bf(privilege);
        this.f38620d.setText(a690VarMo36052bf.m96314t());
        m58556W0(privilege);
        this.f38621e.setText(a690VarMo36052bf.m96294d());
    }

    /* JADX INFO: renamed from: o0 */
    private void m58536o0() {
        CorePayInnerService corePayInnerServiceM143410g = CoreModule.m30933P().m143410g();
        Privilege privilege = Privilege.message_read_state;
        a690 a690VarMo36052bf = corePayInnerServiceM143410g.mo36052bf(privilege);
        this.f38620d.setText(a690VarMo36052bf != null ? a690VarMo36052bf.m96314t() : "查看消息已读状态");
        m58556W0(privilege);
        this.f38621e.setText(a690VarMo36052bf.m96294d());
    }

    /* JADX INFO: renamed from: E0 */
    public final void m58537E0() {
        a690 a690VarMo36052bf = CoreModule.m30933P().m143410g().mo36052bf(Privilege.svip_greet);
        this.f38620d.setText(a690VarMo36052bf.m96314t());
        m58552U0(a690VarMo36052bf.m96290b());
        this.f38621e.setText(a690VarMo36052bf.m96294d());
    }

    /* JADX INFO: renamed from: G0 */
    public final void m58538G0() {
        a690 a690VarMo36052bf = CoreModule.m30933P().m143410g().mo36052bf(Privilege.say_hi_pkg);
        this.f38620d.setText(a690VarMo36052bf.m96314t());
        this.f38621e.setText(a690VarMo36052bf.m96311q());
        LayoutInflater.from(getContext()).inflate(pec0.f152042t1, (ViewGroup) this.f38619c, true);
    }

    /* JADX INFO: renamed from: I0 */
    public final void m58539I0(PurchaseType purchaseType) {
        CorePayInnerService corePayInnerServiceM143410g = CoreModule.m30933P().m143410g();
        Privilege privilege = Privilege.vip_super_like;
        a690 a690VarMo36016Hm = corePayInnerServiceM143410g.mo36016Hm(purchaseType, privilege);
        if (wib0.m206565i(purchaseType) || wib0.m206577u(purchaseType)) {
            this.f38620d.setText(a690VarMo36016Hm.m96314t());
        } else {
            boolean zMo34737Oi = gta.m132210e().m132214d().mo34737Oi();
            VText vText = this.f38620d;
            if (zMo34737Oi) {
                vText.setText(a690VarMo36016Hm.m96314t());
            } else {
                vText.setText(getContext().getString(R$string.f21316D1, 5));
            }
        }
        if (rs9.INSTANCE.m182947g() && purchaseType == PurchaseType.TYPE_GET_VIP) {
            m58561Z0(privilege);
        } else if (wib0.m206577u(purchaseType)) {
            m58531X0(c17.m107528u0() ? "https://static.tancdn.com/pe-webplatform/np-NSKBh576ah-F-vkAXzwZL.webp" : "https://static.tancdn.com/pe-webplatform/r0rStyaGok5vSlMsIhLqiokx.webp");
        } else {
            m58556W0(privilege);
        }
        this.f38621e.setText(a690VarMo36016Hm.m96294d());
    }

    /* JADX INFO: renamed from: J0 */
    public final void m58540J0() {
        a690 a690VarMo36052bf = CoreModule.m30933P().m143410g().mo36052bf(Privilege.top_chat);
        this.f38620d.setText(a690VarMo36052bf.m96314t());
        m58552U0(a690VarMo36052bf.m96290b());
        this.f38621e.setText(a690VarMo36052bf.m96311q());
    }

    /* JADX INFO: renamed from: K0 */
    public final void m58541K0() {
        a690 a690VarMo36052bf = CoreModule.m30933P().m143410g().mo36052bf(Privilege.top_like);
        this.f38620d.setText(a690VarMo36052bf.m96314t());
        m58552U0(a690VarMo36052bf.m96290b());
        this.f38621e.setText(a690VarMo36052bf.m96311q());
    }

    /* JADX INFO: renamed from: L0 */
    public final void m58542L0(PurchaseType purchaseType) {
        CorePayInnerService corePayInnerServiceM143410g = CoreModule.m30933P().m143410g();
        Privilege privilege = Privilege.vip_undo;
        a690 a690VarMo36052bf = corePayInnerServiceM143410g.mo36052bf(privilege);
        this.f38620d.setText(a690VarMo36052bf != null ? a690VarMo36052bf.m96314t() : m58530T(R$string.f21310B1));
        if (rs9.INSTANCE.m182947g() && purchaseType == PurchaseType.TYPE_GET_VIP) {
            m58561Z0(privilege);
        } else {
            m58556W0(privilege);
        }
        this.f38621e.setText(a690VarMo36052bf.m96294d());
        if (CoreModule.m30933P().m143405a().mo34436Vf()) {
            bnl0.m105524M(this.f38622f, true);
            this.f38622f.setText("使用反悔特权");
            this.f38622f.setOnClickListener(new View.OnClickListener() { // from class: l.i290
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f112591a.m58560Z(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: M0 */
    public final void m58543M0(PurchaseType purchaseType) {
        CorePayInnerService corePayInnerServiceM143410g = CoreModule.m30933P().m143410g();
        Privilege privilege = Privilege.vip_unlimited_likes;
        a690 a690VarMo36052bf = corePayInnerServiceM143410g.mo36052bf(privilege);
        this.f38620d.setText(a690VarMo36052bf != null ? a690VarMo36052bf.m96314t() : m58530T(R$string.f21446z1));
        if (rs9.INSTANCE.m182947g() && purchaseType == PurchaseType.TYPE_GET_VIP) {
            m58561Z0(privilege);
        } else {
            m58556W0(privilege);
        }
        this.f38621e.setText(a690VarMo36052bf.m96294d());
    }

    /* JADX INFO: renamed from: N0 */
    public final void m58544N0() {
        a690 a690VarMo36052bf = CoreModule.m30933P().m143410g().mo36052bf(Privilege.vip_greet);
        this.f38620d.setText(a690VarMo36052bf.m96314t());
        m58552U0(a690VarMo36052bf.m96290b());
        this.f38621e.setText(a690VarMo36052bf.m96294d());
    }

    /* JADX INFO: renamed from: O0 */
    public final void m58545O0() {
        a690 a690VarMo36016Hm = CoreModule.m30933P().m143410g().mo36016Hm(this.f38624h, Privilege.visitor_hide_footprint);
        this.f38620d.setText(a690VarMo36016Hm.m96314t());
        this.f38621e.setText(a690VarMo36016Hm.m96311q());
        LayoutInflater.from(getContext()).inflate(pec0.f152045u1, (ViewGroup) this.f38619c, true);
    }

    /* JADX INFO: renamed from: P0 */
    public final void m58546P0() {
        String str;
        m58556W0(Privilege.voice_quick_chat);
        this.f38620d.setText("语音闪聊");
        if (wib0.m206565i(this.f38624h)) {
            str = CoreModule.f18264c.f20381e0.m116600p9().isFemale() ? "21" : "4";
        } else {
            str = "1";
        }
        this.f38621e.setText(String.format("每天额外%s次语音闪聊，随时连线附近的%s", str, c17.m107528u0() ? "小哥哥" : "小姐姐"));
    }

    /* JADX INFO: renamed from: Q0 */
    public final void m58547Q0(Privilege privilege) {
        a690 a690VarMo36016Hm = CoreModule.m30933P().m143410g().mo36016Hm(this.f38624h, privilege);
        this.f38620d.setText(a690VarMo36016Hm.m96314t());
        this.f38621e.setText(a690VarMo36016Hm.m96311q());
        if (privilege == Privilege.youth_roaming) {
            m58556W0(Privilege.vip_location);
            return;
        }
        if (privilege == Privilege.youth_superlike) {
            m58556W0(Privilege.vip_super_like);
            return;
        }
        if (privilege == Privilege.youth_message_read) {
            m58556W0(Privilege.message_read_state);
        } else if (privilege == Privilege.youth_find_partner) {
            m58531X0("https://auto.tancdn.com/v1/images/eyJpZCI6IjVQSFIyWk5aU1haTk9KWEZSUkVJQlNONjNPRElLUzE0IiwidyI6NDk1LCJoIjo2MTgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjo0NTI1NDYwMzczMjc3MjUzMzI3fQ.png");
        } else {
            m58531X0("https://auto.tancdn.com/v1/images/eyJpZCI6IllQVVA2V0I2NU9QVlBUQ0U0TVE0TFJJS0MyWUJYVzE0IiwidyI6NDk1LCJoIjo2MTgsImQiOjAsIm10IjoiaW1hZ2UvanBlZyIsImRoIjoyMjU4NjY0MzA1ODg2MDY3MjB9.png");
        }
    }

    /* JADX INFO: renamed from: R0 */
    public void m58548R0() {
        switch (C9167a.f38629a[this.f38627k.ordinal()]) {
            case 1:
                m58541K0();
                break;
            case 2:
                m58540J0();
                break;
            case 3:
            case 4:
                m58564c0(this.f38627k, this.f38624h);
                break;
            case 5:
                m58539I0(this.f38624h);
                break;
            case 6:
                m58542L0(this.f38624h);
                break;
            case 7:
                m58543M0(this.f38624h);
                break;
            case 8:
                m58572n0(this.f38624h);
                break;
            case 9:
                m58536o0();
                break;
            case 10:
                m58532b0();
                break;
            case 11:
                m58534l0();
                break;
            case 12:
                m58570j0();
                break;
            case 13:
                m58544N0();
                break;
            case 14:
                m58537E0();
                break;
            case 15:
                if (!wib0.m206563g(this.f38624h)) {
                    m58523A0();
                } else {
                    m58569i0(this.f38627k);
                }
                break;
            case 16:
                m58525D0();
                break;
            case 17:
                m58526H0();
                break;
            case 18:
                m58524B0();
                break;
            case 19:
                m58546P0();
                break;
            case 20:
                m58533d0();
                break;
            case 21:
                m58535m0();
                break;
            case 22:
                m58567g0();
                break;
            case 23:
                m58579v0();
                break;
            case 24:
                m58581x0();
                break;
            case 25:
                m58576s0();
                break;
            case 26:
                m58583z0(this.f38624h);
                break;
            case 27:
                m58580w0();
                break;
            case 28:
                m58577t0();
                break;
            case 29:
                m58571k0(this.f38624h);
                break;
            case 30:
                m58578u0();
                break;
            case 31:
                m58538G0();
                break;
            case 32:
                m58573p0(this.f38624h);
                break;
            case 33:
                m58562a0();
                break;
            case 34:
                m58565e0();
                break;
            case 35:
                m58582y0();
                break;
            case 36:
                m58574q0();
                break;
            case 37:
                m58575r0();
                break;
            case 38:
                m58568h0();
                break;
            case 39:
                m58545O0();
                break;
            case 40:
                m58566f0();
                break;
            case 41:
            case 42:
            case 43:
            case 44:
                m58569i0(this.f38627k);
                break;
            case 45:
            case 46:
            case 47:
            case 48:
            case 49:
                m58547Q0(this.f38627k);
                break;
            case 50:
                m58559Y0(this.f38627k);
                break;
        }
    }

    /* JADX INFO: renamed from: S */
    public final void m58549S(View view) {
        l290.m152598a(this, view);
    }

    /* JADX INFO: renamed from: S0 */
    public final void m58550S0(Privilege privilege, PurchaseType purchaseType) {
        String strM58553V = m58553V(privilege);
        SVGAnimationView sVGAnimationView = new SVGAnimationView(getContext());
        SVGADynamicEntity sVGADynamicEntity = new SVGADynamicEntity();
        aeh0.INSTANCE.m97248f(this.f38628l, sVGADynamicEntity, CoreModule.f18264c.f20381e0.m116593na().m61308fp().profileSmall().formatted(), "head01", 256, 349, null);
        SVGALoader.with(getContext()).from(strM58553V).autoPlay(false).repeatCount(0).dynamic(sVGADynamicEntity).into(sVGAnimationView);
        if (!sVGAnimationView.isAnimating()) {
            sVGAnimationView.startAnimation();
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(qa00.m175859d(230.0f), qa00.m175859d(180.0f));
        layoutParams.setMargins(qa00.m175859d(40.0f), qa00.m175859d(16.0f), qa00.m175859d(0.0f), -4);
        layoutParams.gravity = 83;
        sVGAnimationView.setScaleType(ImageView.ScaleType.FIT_START);
        sVGAnimationView.setLayoutParams(layoutParams);
        this.f38619c.removeAllViews();
        this.f38619c.addView(sVGAnimationView);
    }

    /* JADX INFO: renamed from: T0 */
    public final void m58551T0(PurchaseType purchaseType) {
        String strM58586a = PrivilegeItemPicUtils.m58586a(Privilege.boost);
        if (NullChecker.m82487b(strM58586a)) {
            m58531X0(strM58586a);
        }
    }

    /* JADX INFO: renamed from: U0 */
    public final void m58552U0(int i) {
        VImage vImage = new VImage(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.setMargins(qa00.m175859d(24.0f), qa00.m175859d(16.0f), qa00.m175859d(24.0f), 0);
        layoutParams.gravity = 83;
        vImage.setLayoutParams(layoutParams);
        vImage.setScaleType(ImageView.ScaleType.FIT_START);
        vImage.setImageResource(i);
        this.f38619c.removeAllViews();
        this.f38619c.addView(vImage);
    }

    /* JADX INFO: renamed from: V */
    public String m58553V(Privilege privilege) {
        boolean zM107528u0 = c17.m107528u0();
        int i = C9167a.f38629a[privilege.ordinal()];
        if (i == 3) {
            return "https://fe-static.tancdn.com/v1/raw/23062852-0e3d-4764-a4d6-2f8de6c1cb6414.svga";
        }
        if (i == 5) {
            return Build.VERSION.SDK_INT >= 26 ? "https://fe-static.tancdn.com/v1/raw/a0f91ef4-557e-42ee-b8d4-49cc214b420114.svga" : "https://fe-static.tancdn.com/v1/raw/bc84c4bf-a22a-4581-a960-5bf284b495d114.svga";
        }
        if (i == 6) {
            return zM107528u0 ? "https://fe-static.tancdn.com/v1/raw/ffd9f6bb-4ebc-4e09-9360-8068cd517d2114.svga" : "https://fe-static.tancdn.com/v1/raw/186c6451-d385-4a2c-9d10-20a5a80a41ea14.svga";
        }
        if (i == 7) {
            return zM107528u0 ? "https://fe-static.tancdn.com/v1/raw/8fc25c33-a059-4bd2-860d-dbbcfe3c802e14.svga" : "https://fe-static.tancdn.com/v1/raw/bbbd2b04-46f6-472c-8c15-b6af4d9d3e5214.svga";
        }
        if (i != 8) {
            return null;
        }
        return "https://fe-static.tancdn.com/v1/raw/92d066a1-5685-4352-807f-a34721fe7a7814.svga";
    }

    /* JADX INFO: renamed from: V0 */
    public final void m58554V0(int i) {
        VImage vImage = new VImage(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 83;
        vImage.setLayoutParams(layoutParams);
        vImage.setScaleType(ImageView.ScaleType.FIT_START);
        vImage.setImageResource(i);
        this.f38619c.removeAllViews();
        this.f38619c.addView(vImage);
    }

    /* JADX INFO: renamed from: W */
    public void m58555W(PutongFrag putongFrag, C9171a.e eVar, Privilege privilege, Act act, PurchaseType purchaseType) {
        this.f38625i = eVar;
        this.f38626j = putongFrag;
        this.f38627k = privilege;
        this.f38628l = act;
        this.f38624h = purchaseType;
        if (wib0.m206577u(purchaseType)) {
            this.f38620d.setTextColor(Color.parseColor("#CCFFD489"));
            this.f38621e.setTextColor(Color.parseColor("#66FFD489"));
        }
    }

    /* JADX INFO: renamed from: W0 */
    public final void m58556W0(Privilege privilege) {
        String strM58586a = PrivilegeItemPicUtils.m58586a(privilege);
        if (NullChecker.m82487b(strM58586a)) {
            m58531X0(strM58586a);
        }
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m58557X(RoamedLocationData roamedLocationData) {
        this.f38623g = roamedLocationData;
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m58558Y(View view) {
        CoreModule.m30933P().m143405a().mo34396Q8(this.f38628l, this.f38623g);
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m58559Y0(Privilege privilege) {
        a690 a690VarMo36016Hm = CoreModule.m30933P().m143410g().mo36016Hm(this.f38624h, privilege);
        this.f38620d.setText(a690VarMo36016Hm.m96314t());
        this.f38621e.setText(a690VarMo36016Hm.m96311q());
        this.f38619c.removeAllViews();
        LayoutInflater.from(getContext()).inflate(pec0.f152035r1, (ViewGroup) this.f38619c, true);
    }

    /* JADX INFO: renamed from: Z */
    public final /* synthetic */ void m58560Z(View view) {
        Act act = this.f38628l;
        act.startActivity(NewMyLikedUsersAct.m48004a2(act, "undoUser"));
    }

    /* JADX INFO: renamed from: Z0 */
    public final void m58561Z0(Privilege privilege) {
        String strM58553V = m58553V(privilege);
        if (NullChecker.m82487b(strM58553V)) {
            m58563a1(strM58553V);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final void m58562a0() {
        CorePayInnerService corePayInnerServiceM143410g = CoreModule.m30933P().m143410g();
        PurchaseType purchaseType = this.f38624h;
        Privilege privilege = Privilege.accelerate_pairing;
        a690 a690VarMo36016Hm = corePayInnerServiceM143410g.mo36016Hm(purchaseType, privilege);
        this.f38620d.setText(a690VarMo36016Hm.m96314t());
        this.f38621e.setText(a690VarMo36016Hm.m96311q());
        String strM58586a = PrivilegeItemPicUtils.m58586a(privilege);
        if (NullChecker.m82487b(strM58586a)) {
            m58531X0(strM58586a);
        }
    }

    /* JADX INFO: renamed from: a1 */
    public final void m58563a1(String str) {
        SVGAnimationView sVGAnimationView = new SVGAnimationView(getContext());
        SVGALoader.with(getContext()).from(str).autoPlay(false).repeatCount(0).into(sVGAnimationView);
        if (!sVGAnimationView.isAnimating()) {
            sVGAnimationView.startAnimation();
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(qa00.m175859d(230.0f), qa00.m175859d(180.0f));
        layoutParams.setMargins(qa00.m175859d(40.0f), qa00.m175859d(16.0f), qa00.m175859d(0.0f), -4);
        layoutParams.gravity = 83;
        sVGAnimationView.setScaleType(ImageView.ScaleType.FIT_START);
        sVGAnimationView.setLayoutParams(layoutParams);
        this.f38619c.removeAllViews();
        this.f38619c.addView(sVGAnimationView);
    }

    /* JADX INFO: renamed from: c0 */
    public final void m58564c0(Privilege privilege, PurchaseType purchaseType) {
        a690 a690VarMo36052bf = CoreModule.m30933P().m143410g().mo36052bf(privilege);
        this.f38620d.setText(a690VarMo36052bf != null ? a690VarMo36052bf.m96314t() : m58530T(R$string.f21313C1));
        if (rs9.INSTANCE.m182947g() && purchaseType == PurchaseType.TYPE_GET_VIP) {
            m58550S0(Privilege.vip_badge, purchaseType);
        } else {
            ((PrivilegeContentDlgItemBadgeView) p9r.m171370a(getContext()).inflate(pec0.f152015m1, (ViewGroup) this.f38619c, true).findViewById(ddc0.f87896b)).m58507b(privilege, purchaseType);
        }
        boolean zM206571o = wib0.m206571o(purchaseType);
        TextView textView = this.f38621e;
        if (zM206571o) {
            textView.setText("展示 白金会员 尊贵标识，或者低调地隐藏会员身份");
        } else {
            textView.setText(privilege == Privilege.svip_badge ? R$string.f21311C : R$string.f21317E);
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final void m58565e0() {
        a690 a690VarMo36016Hm = CoreModule.m30933P().m143410g().mo36016Hm(this.f38624h, Privilege.city_topping);
        this.f38620d.setText(a690VarMo36016Hm.m96314t());
        this.f38621e.setText(a690VarMo36016Hm.m96294d());
        this.f38619c.removeAllViews();
        LayoutInflater.from(getContext()).inflate(pec0.f152019n1, (ViewGroup) this.f38619c, true);
    }

    /* JADX INFO: renamed from: f0 */
    public final void m58566f0() {
        a690 a690VarMo36052bf = CoreModule.m30933P().m143410g().mo36052bf(Privilege.confession_first);
        this.f38620d.setText(a690VarMo36052bf.m96314t());
        this.f38621e.setText(a690VarMo36052bf.m96311q());
        this.f38619c.removeAllViews();
        LayoutInflater.from(getContext()).inflate(pec0.f152042t1, (ViewGroup) this.f38619c, true);
        View childAt = this.f38619c.getChildAt(0);
        if (childAt instanceof PrivilegeContentDlgItemSVipSayHiView) {
            ((PrivilegeContentDlgItemSVipSayHiView) childAt).m58516c();
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final void m58567g0() {
        a690 a690VarMo36016Hm = CoreModule.m30933P().m143410g().mo36016Hm(this.f38624h, Privilege.customer_service);
        this.f38620d.setText(a690VarMo36016Hm.m96314t());
        this.f38621e.setText(a690VarMo36016Hm.m96311q());
        if (!wib0.m206577u(this.f38624h)) {
            ((PrivilegeContentDlgItemDiamondServiceView) p9r.m171370a(getContext()).inflate(pec0.f152023o1, (ViewGroup) this.f38619c, true).findViewById(ddc0.f87874D)).m58509b();
        } else {
            this.f38619c.removeAllViews();
            p9r.m171370a(getContext()).inflate(pec0.f152039s1, (ViewGroup) this.f38619c, true);
        }
    }

    /* JADX INFO: renamed from: h0 */
    public final void m58568h0() {
        a690 a690VarMo36016Hm = CoreModule.m30933P().m143410g().mo36016Hm(this.f38624h, Privilege.exclusive_dressing_up);
        this.f38620d.setText(a690VarMo36016Hm.m96314t());
        this.f38621e.setText(a690VarMo36016Hm.m96294d());
        this.f38619c.removeAllViews();
        LayoutInflater.from(getContext()).inflate(pec0.f152031q1, (ViewGroup) this.f38619c, true);
    }

    /* JADX INFO: renamed from: i0 */
    public final void m58569i0(Privilege privilege) {
        a690 a690VarMo36016Hm = CoreModule.m30933P().m143410g().mo36016Hm(this.f38624h, privilege);
        this.f38620d.setText(a690VarMo36016Hm.m96314t());
        this.f38621e.setText(a690VarMo36016Hm.m96311q());
        m58552U0(a690VarMo36016Hm.m96290b());
    }

    /* JADX INFO: renamed from: j0 */
    public final void m58570j0() {
        a690 a690VarMo36016Hm = CoreModule.m30933P().m143410g().mo36016Hm(this.f38624h, Privilege.greet);
        this.f38620d.setText(a690VarMo36016Hm.m96314t());
        m58552U0(a690VarMo36016Hm.m96290b());
        this.f38621e.setText(a690VarMo36016Hm.m96294d());
    }

    /* JADX INFO: renamed from: k0 */
    public final void m58571k0(PurchaseType purchaseType) {
        CorePayInnerService corePayInnerServiceM143410g = CoreModule.m30933P().m143410g();
        Privilege privilege = Privilege.leave_message;
        a690 a690VarMo36052bf = corePayInnerServiceM143410g.mo36052bf(privilege);
        this.f38620d.setText("每天5条资料留言");
        m58556W0(privilege);
        this.f38621e.setText(a690VarMo36052bf.m96294d());
    }

    /* JADX INFO: renamed from: n0 */
    public final void m58572n0(PurchaseType purchaseType) {
        CorePayInnerService corePayInnerServiceM143410g = CoreModule.m30933P().m143410g();
        Privilege privilege = Privilege.vip_location;
        a690 a690VarMo36052bf = corePayInnerServiceM143410g.mo36052bf(privilege);
        this.f38620d.setText(a690VarMo36052bf != null ? a690VarMo36052bf.m96314t() : m58530T(R$string.f21307A1));
        this.f38621e.setText(a690VarMo36052bf.m96294d());
        if (rs9.INSTANCE.m182947g() && purchaseType == PurchaseType.TYPE_GET_VIP) {
            m58561Z0(privilege);
        } else {
            m58556W0(privilege);
        }
        if (qj90.m176830b(PurchaseType.TYPE_ROAMING_PKG)) {
            bnl0.m105524M(this.f38622f, true);
            this.f38622f.setText(m58530T(R$string.f21443y1));
            this.f38625i.m153557n(this.f38626j, CoreModule.f18264c.f20399k0.f20830R.m159274k()).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.j290
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f118039a.m58557X((RoamedLocationData) obj);
                }
            }));
            this.f38622f.setOnClickListener(new View.OnClickListener() { // from class: l.k290
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f123585a.m58558Y(view);
                }
            });
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m58549S(this);
        this.f38620d.setTypeface(lyh0.m156283c(3), 1);
    }

    /* JADX INFO: renamed from: p0 */
    public final void m58573p0(PurchaseType purchaseType) {
        CorePayInnerService corePayInnerServiceM143410g = CoreModule.m30933P().m143410g();
        Privilege privilege = Privilege.moment_boost;
        a690 a690VarMo36016Hm = corePayInnerServiceM143410g.mo36016Hm(purchaseType, privilege);
        if (wib0.m206565i(purchaseType)) {
            m58531X0(c17.m107528u0() ? "https://auto.tancdn.com/v1/raw/c311e8b5-c0ab-4594-a2bd-c6820de4dd9d13.webp" : "https://auto.tancdn.com/v1/raw/feb9b413-c633-45c5-ba56-2f35a1acc87c12.webp");
        } else {
            m58556W0(privilege);
        }
        this.f38620d.setText(a690VarMo36016Hm.m96314t());
        this.f38621e.setText(a690VarMo36016Hm.m96311q());
    }

    /* JADX INFO: renamed from: q0 */
    public final void m58574q0() {
        a690 a690VarMo36016Hm = CoreModule.m30933P().m143410g().mo36016Hm(this.f38624h, Privilege.mysterious_mode);
        this.f38620d.setText(a690VarMo36016Hm.m96314t());
        this.f38621e.setText(a690VarMo36016Hm.m96294d());
        String str = c17.m107528u0() ? "https://static.tancdn.com/pe-webplatform/4k6oow3xpt5qgqNfRIe51ZQC.webp" : "https://static.tancdn.com/pe-webplatform/fugcVz2_GhwzRjvaYY-TfFQX.webp";
        if (NullChecker.m82487b(str)) {
            m58531X0(str);
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final void m58575r0() {
        a690 a690VarMo36016Hm = CoreModule.m30933P().m143410g().mo36016Hm(this.f38624h, Privilege.nearby_people);
        this.f38620d.setText(a690VarMo36016Hm.m96314t());
        this.f38621e.setText(a690VarMo36016Hm.m96294d());
        String str = c17.m107528u0() ? "https://static.tancdn.com/pe-webplatform/6LRexqdNGQAaCHkaMOrf98XD.webp" : "https://static.tancdn.com/pe-webplatform/x-IUiN-PejudNCvVnUlJwHMo.webp";
        if (CoreModule.m30933P().m143410g().mo36007D9() && (wib0.m206573q(this.f38624h) || wib0.m206565i(this.f38624h))) {
            str = c17.m107528u0() ? "https://auto.tancdn.com/v1/raw/8a8beca9-31c9-487c-a103-351eeacd36cc14.webp" : "https://auto.tancdn.com/v1/raw/f2ae8713-c3b2-401f-ab2f-00038efd9a5c14.webp";
        } else if (CoreModule.m30933P().m143410g().mo36020Ki() && wib0.m206571o(this.f38624h)) {
            str = c17.m107528u0() ? "https://auto.tancdn.com/v1/raw/60c8d055-cb62-4c9e-a3bc-cbac2ce51c9a14.webp" : "https://auto.tancdn.com/v1/raw/57a96d00-8658-49c5-a45b-7d1a52b50d8914.webp";
        }
        if (NullChecker.m82487b(str)) {
            m58531X0(str);
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final void m58576s0() {
        a690 a690VarMo36052bf = CoreModule.m30933P().m143410g().mo36052bf(Privilege.oDiamondGreetings);
        this.f38620d.setText(a690VarMo36052bf.m96314t());
        this.f38621e.setText(a690VarMo36052bf.m96311q());
        LayoutInflater.from(getContext()).inflate(pec0.f152042t1, (ViewGroup) this.f38619c, true);
    }

    /* JADX INFO: renamed from: t0 */
    public final void m58577t0() {
        CorePayInnerService corePayInnerServiceM143410g = CoreModule.m30933P().m143410g();
        PurchaseType purchaseType = this.f38624h;
        Privilege privilege = Privilege.immediately_match;
        a690 a690VarMo36016Hm = corePayInnerServiceM143410g.mo36016Hm(purchaseType, privilege);
        if (wib0.m206577u(this.f38624h)) {
            m58531X0(c17.m107528u0() ? "https://static.tancdn.com/pe-webplatform/8nPaE2uG8jPQEGffEVJ4jJkB.webp" : "https://static.tancdn.com/pe-webplatform/vivHEa6wkdFHKU0PKLkNaj2u.webp");
        } else {
            m58556W0(privilege);
        }
        this.f38620d.setText(a690VarMo36016Hm.m96314t());
        this.f38621e.setText(a690VarMo36016Hm.m96311q());
    }

    /* JADX INFO: renamed from: u0 */
    public final void m58578u0() {
        a690 a690VarMo36052bf = CoreModule.m30933P().m143410g().mo36052bf(Privilege.live_entry_animation);
        m58552U0(a690VarMo36052bf.m96290b());
        this.f38620d.setText(a690VarMo36052bf.m96314t());
        this.f38621e.setText(a690VarMo36052bf.m96311q());
    }

    /* JADX INFO: renamed from: v0 */
    public final void m58579v0() {
        a690 a690VarMo36052bf = CoreModule.m30933P().m143410g().mo36052bf(Privilege.oDiamondSvipSkin);
        this.f38620d.setText(a690VarMo36052bf.m96314t());
        this.f38621e.setText(a690VarMo36052bf.m96311q());
        ((PrivilegeContentDlgItemDiamondSkinView) p9r.m171370a(getContext()).inflate(pec0.f152027p1, (ViewGroup) this.f38619c, true).findViewById(ddc0.f87874D)).m58511b();
    }

    /* JADX INFO: renamed from: w0 */
    public final void m58580w0() {
        a690 a690VarMo36052bf = CoreModule.m30933P().m143410g().mo36052bf(Privilege.oDiamondSvipExtra);
        if (wib0.m206577u(this.f38624h)) {
            m58531X0("https://static.tancdn.com/pe-webplatform/aG1xQE9fUqiUSct3f8qvjX4y.webp");
        } else {
            m58554V0(a690VarMo36052bf.m96290b());
        }
        this.f38620d.setText(a690VarMo36052bf.m96314t());
        this.f38621e.setText(a690VarMo36052bf.m96311q());
    }

    /* JADX INFO: renamed from: x0 */
    public final void m58581x0() {
        CorePayInnerService corePayInnerServiceM143410g = CoreModule.m30933P().m143410g();
        Privilege privilege = Privilege.oDiamondVisitor;
        a690 a690VarMo36052bf = corePayInnerServiceM143410g.mo36052bf(privilege);
        m58556W0(privilege);
        this.f38620d.setText(a690VarMo36052bf.m96314t());
        this.f38621e.setText(a690VarMo36052bf.m96311q());
    }

    /* JADX INFO: renamed from: y0 */
    public final void m58582y0() {
        a690 a690VarMo36016Hm = CoreModule.m30933P().m143410g().mo36016Hm(this.f38624h, Privilege.personal_customization);
        this.f38620d.setText(a690VarMo36016Hm.m96314t());
        this.f38621e.setText(a690VarMo36016Hm.m96294d());
        String str = c17.m107528u0() ? "https://static.tancdn.com/pe-webplatform/aaGGiuxW60ADoOO_MxDtST58.webp" : "https://static.tancdn.com/pe-webplatform/60oshsV4Fu2iaZfEuqxNeSji.webp";
        if (NullChecker.m82487b(str)) {
            m58531X0(str);
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final void m58583z0(PurchaseType purchaseType) {
        CorePayInnerService corePayInnerServiceM143410g = CoreModule.m30933P().m143410g();
        Privilege privilege = Privilege.picksMembership;
        a690 a690VarMo36016Hm = corePayInnerServiceM143410g.mo36016Hm(purchaseType, privilege);
        if (wib0.m206577u(purchaseType)) {
            m58531X0(c17.m107528u0() ? "https://static.tancdn.com/pe-webplatform/SVhzDulIxVOWEQ7y44VOsVaH.webp" : "https://static.tancdn.com/pe-webplatform/GefWPXpePA0KOkKaH1VV51tL.webp");
        } else {
            m58556W0(privilege);
        }
        this.f38620d.setText(a690VarMo36016Hm.m96314t());
        this.f38621e.setText(a690VarMo36016Hm.m96311q());
    }

    public PrivilegeContentDlgItemView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f38623g = RoamedLocationData.new_();
    }

    public PrivilegeContentDlgItemView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f38623g = RoamedLocationData.new_();
    }
}
