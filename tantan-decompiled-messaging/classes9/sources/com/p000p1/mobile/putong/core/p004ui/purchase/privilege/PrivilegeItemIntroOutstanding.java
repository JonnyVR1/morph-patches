package com.p000p1.mobile.putong.core.p004ui.purchase.privilege;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableString;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.api.CoreLikers;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.pay.R;
import com.p1.mobile.putong.data.User;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import l.b1c0;
import l.c4g0;
import l.eqh0;
import l.j760;
import l.m6c0;
import l.mkd0;
import l.n3b0;
import l.o7r;
import l.sab0;
import l.t100;
import l.y590;
import p006l.c8e0;
import p006l.g6a;
import p006l.wx80;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class PrivilegeItemIntroOutstanding extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f4833a;

    /* JADX INFO: renamed from: b */
    public VText f4834b;

    /* JADX INFO: renamed from: c */
    public VText f4835c;

    /* JADX INFO: renamed from: d */
    public Privilege f4836d;

    /* JADX INFO: renamed from: e */
    public ExplodeLayout f4837e;

    /* JADX INFO: renamed from: f */
    public QuickChatPrivilegeAnimView f4838f;

    /* JADX INFO: renamed from: g */
    public SvipDlgSeeAnimLayout f4839g;

    /* JADX INFO: renamed from: h */
    public c4g0 f4840h;

    /* JADX INFO: renamed from: i */
    public AudioMatchPrivilegeView f4841i;

    /* JADX INFO: renamed from: j */
    public PrivilegeSVGAContainerView f4842j;

    /* JADX INFO: renamed from: k */
    public PrivilegeSVGAContainerView f4843k;

    /* JADX INFO: renamed from: l */
    public PrivilegeSVGAContainerView f4844l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.privilege.PrivilegeItemIntroOutstanding$a */
    public static /* synthetic */ class C0230a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f4845a;

        static {
            int[] iArr = new int[Privilege.values().length];
            f4845a = iArr;
            try {
                iArr[Privilege.vip_badge.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4845a[Privilege.vip_undo.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4845a[Privilege.vip_unlimited_likes.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4845a[Privilege.vip_super_like.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4845a[Privilege.vip_independent_super_like.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4845a[Privilege.youth_superlike.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4845a[Privilege.see_who_likes_me.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f4845a[Privilege.online_match_tickets.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4845a[Privilege.voice_quick_chat.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f4845a[Privilege.letter.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f4845a[Privilege.greet.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f4845a[Privilege.vip_greet.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f4845a[Privilege.svip_greet.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f4845a[Privilege.leave_message.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f4845a[Privilege.top_like.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f4845a[Privilege.immediately_match.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f4845a[Privilege.nearby_people.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f4845a[Privilege.top_chat.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f4845a[Privilege.vip_location.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f4845a[Privilege.message_read_state.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f4845a[Privilege.privacy_membership.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f4845a[Privilege.advanced_filter.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f4845a[Privilege.recover_unmatches.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f4845a[Privilege.liked_user.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f4845a[Privilege.boost.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f4845a[Privilege.svipPicksMembership.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f4845a[Privilege.picksMembership.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f4845a[Privilege.oDiamondSvipExtra.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f4845a[Privilege.oDiamondVisitor.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f4845a[Privilege.moment_boost.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f4845a[Privilege.live_entry_animation.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f4845a[Privilege.unlock_learn_about_him_module.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f4845a[Privilege.ads_not_disturb.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f4845a[Privilege.block_harassing_words.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f4845a[Privilege.pick_tantan_credits_users.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f4845a[Privilege.youth_roaming.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f4845a[Privilege.youth_find_partner.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f4845a[Privilege.youth_blind_box.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                f4845a[Privilege.youth_message_read.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f4845a[Privilege.private_custom.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f4845a[Privilege.svip_badge.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                f4845a[Privilege.oDiamondSvipSkin.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                f4845a[Privilege.oDiamondGreetings.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                f4845a[Privilege.customer_service.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                f4845a[Privilege.say_hi_pkg.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                f4845a[Privilege.accelerate_pairing.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                f4845a[Privilege.visitor_hide_footprint.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                f4845a[Privilege.confession_first.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                f4845a[Privilege.hide_me_from_nearby.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
        }
    }

    public PrivilegeItemIntroOutstanding(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m7580a(View view) {
        y590.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final Act m7581b() {
        return getContext();
    }

    /* JADX INFO: renamed from: c */
    public void m7582c() {
        Privilege privilege = this.f4836d;
        Privilege privilege2 = Privilege.see_who_likes_me;
        if (privilege == privilege2 && NullChecker.a(this.f4837e)) {
            this.f4837e.m7563l(true);
            return;
        }
        if (this.f4836d == Privilege.online_match_tickets && NullChecker.a(this.f4838f)) {
            this.f4838f.m7644t0();
            return;
        }
        if (this.f4836d == privilege2 && NullChecker.a(this.f4839g)) {
            this.f4839g.m7658l0();
            return;
        }
        if (this.f4836d == Privilege.voice_quick_chat && NullChecker.a(this.f4841i)) {
            this.f4841i.m7551m0();
            return;
        }
        if (this.f4836d == Privilege.top_like && NullChecker.a(this.f4842j)) {
            this.f4842j.m7608f();
            return;
        }
        if (this.f4836d == privilege2 && NullChecker.a(this.f4843k)) {
            this.f4843k.m7608f();
        } else if (this.f4836d == Privilege.immediately_match && NullChecker.a(this.f4844l)) {
            this.f4844l.m7608f();
        }
    }

    /* JADX INFO: renamed from: d */
    public void m7583d(wx80 wx80Var, int i, PurchaseType purchaseType) {
        if (sab0.i(purchaseType) || sab0.p(purchaseType) || sab0.j(purchaseType)) {
            this.f4834b.setTextColor(m7581b().color(b1c0.x));
            this.f4835c.setTextColor(m7581b().color(b1c0.y));
        }
        this.f4834b.setTypeface(eqh0.c(3));
        Privilege privilegeM26841l = wx80Var.m26841l();
        this.f4836d = privilegeM26841l;
        if (privilegeM26841l == null) {
            this.f4834b.setText(wx80Var.m26849t());
            PrivilegeImageContainerView privilegeImageContainerView = (PrivilegeImageContainerView) o7r.a(getContext()).inflate(m6c0.H0, (ViewGroup) this.f4833a, false);
            privilegeImageContainerView.m7575b(wx80Var, purchaseType);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 16;
            this.f4833a.addView(privilegeImageContainerView, layoutParams);
            this.f4835c.setText(wx80Var.m26829d());
            return;
        }
        switch (C0230a.f4845a[privilegeM26841l.ordinal()]) {
            case 1:
                this.f4834b.setText(wx80Var.m26849t());
                PrivilegeVIPBadgeView privilegeVIPBadgeView = (PrivilegeVIPBadgeView) o7r.a(getContext()).inflate(m6c0.V0, (ViewGroup) this.f4833a, false);
                privilegeVIPBadgeView.m7622b();
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams2.gravity = 16;
                this.f4833a.addView(privilegeVIPBadgeView, layoutParams2);
                this.f4835c.setText(wx80Var.m26829d());
                return;
            case 2:
                this.f4834b.setText(wx80Var.m26849t());
                PrivilegeUndoView privilegeUndoView = (PrivilegeUndoView) o7r.a(getContext()).inflate(m6c0.S0, (ViewGroup) this.f4833a, false);
                privilegeUndoView.m7618b();
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams3.gravity = 16;
                this.f4833a.addView(privilegeUndoView, layoutParams3);
                this.f4835c.setText(wx80Var.m26829d());
                return;
            case CameraSticker.STATE_COMPLETE /* 3 */:
                this.f4834b.setText(wx80Var.m26849t());
                PrivilegeUnLimitLikeView privilegeUnLimitLikeView = (PrivilegeUnLimitLikeView) o7r.a(getContext()).inflate(m6c0.T0, (ViewGroup) this.f4833a, false);
                privilegeUnLimitLikeView.m7616b();
                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams4.gravity = 16;
                this.f4833a.addView(privilegeUnLimitLikeView, layoutParams4);
                this.f4835c.setText(wx80Var.m26829d());
                return;
            case CameraSticker.STATE_ERROR /* 4 */:
            case 5:
            case 6:
                this.f4834b.setText(wx80Var.m26849t());
                this.f4835c.setText(wx80Var.m26829d());
                if (!sab0.i(purchaseType) && !sab0.j(purchaseType)) {
                    PrivilegeSuperLikeView privilegeSuperLikeView = (PrivilegeSuperLikeView) o7r.a(getContext()).inflate(m6c0.P0, (ViewGroup) this.f4833a, false);
                    privilegeSuperLikeView.m7614b();
                    FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, -2);
                    layoutParams5.gravity = 16;
                    this.f4833a.addView(privilegeSuperLikeView, layoutParams5);
                    return;
                }
                View viewM7584e = m7584e(this.f4836d);
                FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, -2);
                layoutParams6.topMargin = 0;
                layoutParams6.bottomMargin = 0;
                layoutParams6.gravity = 17;
                this.f4833a.addView(viewM7584e, layoutParams6);
                return;
            case 7:
                this.f4834b.setText(getContext().getString(R.string.m7));
                if (g6a.m15585h() && sab0.q(purchaseType)) {
                    PrivilegeSVGAContainerView privilegeSVGAContainerView = (PrivilegeSVGAContainerView) o7r.a(getContext()).inflate(m6c0.Q0, (ViewGroup) this.f4833a, false);
                    this.f4843k = privilegeSVGAContainerView;
                    privilegeSVGAContainerView.m7606d(wx80Var, purchaseType);
                    FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams7.gravity = 16;
                    this.f4833a.addView(this.f4843k, layoutParams7);
                    if (CoreModule.m1854P().m11706a().m5372W9() && NullChecker.a(n3b0.f()) && i == 0) {
                        m7586g();
                        return;
                    }
                    CoreLikers.C0145a c0145aM2399r5 = CoreModule.f1534c.f3676u0.m2399r5();
                    User userM2411v5 = CoreModule.f1534c.f3676u0.m2411v5();
                    boolean zM5545vb = CoreModule.m1854P().m11706a().m5545vb(userM2411v5, c0145aM2399r5);
                    VText vText = this.f4835c;
                    if (zM5545vb) {
                        vText.setText(CoreModule.m1854P().m11706a().m5567yl(userM2411v5));
                        return;
                    } else {
                        vText.setText(c8e0.m13312e(c0145aM2399r5 != null ? c0145aM2399r5.f3259b : 0));
                        return;
                    }
                }
                if (CoreModule.m1854P().m11706a().m5372W9() && NullChecker.a(n3b0.f()) && i == 0) {
                    SvipDlgSeeAnimLayout svipDlgSeeAnimLayout = (SvipDlgSeeAnimLayout) o7r.a(getContext()).inflate(m6c0.X2, (ViewGroup) this.f4833a, false);
                    this.f4839g = svipDlgSeeAnimLayout;
                    svipDlgSeeAnimLayout.m7655d(n3b0.f());
                    FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams8.gravity = 17;
                    this.f4833a.addView((View) this.f4839g, (ViewGroup.LayoutParams) layoutParams8);
                    ((ViewGroup.MarginLayoutParams) this.f4833a.getLayoutParams()).topMargin = 0;
                    m7586g();
                    return;
                }
                ExplodeLayout explodeLayout = (ExplodeLayout) o7r.a(getContext()).inflate(m6c0.L2, (ViewGroup) this.f4833a, false);
                this.f4837e = explodeLayout;
                explodeLayout.setScale(0.8f);
                FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams9.gravity = 17;
                this.f4833a.addView(this.f4837e, layoutParams9);
                CoreLikers.C0145a c0145aM2399r6 = CoreModule.f1534c.f3676u0.m2399r5();
                User userM2411v6 = CoreModule.f1534c.f3676u0.m2411v5();
                boolean zM5545vb2 = CoreModule.m1854P().m11706a().m5545vb(userM2411v6, c0145aM2399r6);
                VText vText2 = this.f4835c;
                if (zM5545vb2) {
                    vText2.setText(CoreModule.m1854P().m11706a().m5567yl(userM2411v6));
                    return;
                } else {
                    vText2.setText(c8e0.m13312e(c0145aM2399r6 != null ? c0145aM2399r6.f3259b : 0));
                    return;
                }
            case 8:
                this.f4834b.setText(wx80Var.m26849t());
                this.f4835c.setText(wx80Var.m26829d());
                if (g6a.m15585h() && sab0.q(purchaseType)) {
                    PrivilegeImageContainerView privilegeImageContainerView2 = (PrivilegeImageContainerView) o7r.a(getContext()).inflate(m6c0.H0, (ViewGroup) this.f4833a, false);
                    privilegeImageContainerView2.m7576c(wx80Var, purchaseType);
                    FrameLayout.LayoutParams layoutParams10 = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams10.gravity = 16;
                    this.f4833a.addView(privilegeImageContainerView2, layoutParams10);
                    return;
                }
                if (sab0.i(purchaseType) || sab0.j(purchaseType)) {
                    View viewM7584e2 = m7584e(this.f4836d);
                    FrameLayout.LayoutParams layoutParams11 = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams11.gravity = 16;
                    this.f4833a.addView(viewM7584e2, layoutParams11);
                    return;
                }
                this.f4838f = new QuickChatPrivilegeAnimView(getContext());
                FrameLayout.LayoutParams layoutParams12 = new FrameLayout.LayoutParams(-1, -2);
                layoutParams12.gravity = 16;
                this.f4833a.addView((View) this.f4838f, (ViewGroup.LayoutParams) layoutParams12);
                return;
            case 9:
                this.f4834b.setText(wx80Var.m26849t());
                this.f4835c.setText(wx80Var.m26829d());
                AudioMatchPrivilegeView audioMatchPrivilegeView = (AudioMatchPrivilegeView) o7r.a(getContext()).inflate(m6c0.s2, (ViewGroup) null);
                this.f4841i = audioMatchPrivilegeView;
                audioMatchPrivilegeView.m7549i0(purchaseType);
                FrameLayout.LayoutParams layoutParams13 = new FrameLayout.LayoutParams(-1, -2);
                layoutParams13.gravity = 16;
                this.f4833a.addView((View) this.f4841i, (ViewGroup.LayoutParams) layoutParams13);
                return;
            case 10:
                this.f4834b.setText(wx80Var.m26849t());
                PrivilegeLetterView privilegeLetterView = (PrivilegeLetterView) o7r.a(getContext()).inflate(m6c0.K0, (ViewGroup) this.f4833a, false);
                privilegeLetterView.m7596b();
                FrameLayout.LayoutParams layoutParams14 = new FrameLayout.LayoutParams(-1, -2);
                layoutParams14.gravity = 16;
                this.f4833a.addView(privilegeLetterView, layoutParams14);
                this.f4835c.setText(wx80Var.m26829d());
                return;
            case 11:
            case 12:
            case 13:
            case 14:
                Privilege privilege = this.f4836d;
                Privilege privilege2 = Privilege.leave_message;
                VText vText3 = this.f4834b;
                if (privilege == privilege2) {
                    vText3.setText("每天5条资料留言");
                } else {
                    vText3.setText(wx80Var.m26849t());
                }
                ImageView imageView = new ImageView(getContext());
                imageView.setImageResource(wx80Var.m26839j());
                imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                FrameLayout.LayoutParams layoutParams15 = new FrameLayout.LayoutParams(-1, -2);
                layoutParams15.gravity = 16;
                this.f4833a.addView(imageView, layoutParams15);
                this.f4835c.setText(wx80Var.m26829d());
                return;
            case 15:
                this.f4834b.setText(wx80Var.m26849t());
                if (g6a.m15595r()) {
                    PrivilegeSVGAContainerView privilegeSVGAContainerView2 = (PrivilegeSVGAContainerView) o7r.a(getContext()).inflate(m6c0.Q0, (ViewGroup) this.f4833a, false);
                    this.f4842j = privilegeSVGAContainerView2;
                    privilegeSVGAContainerView2.m7604b(wx80Var, purchaseType);
                    FrameLayout.LayoutParams layoutParams16 = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams16.gravity = 16;
                    this.f4833a.addView(this.f4842j, layoutParams16);
                } else {
                    PrivilegeImageContainerView privilegeImageContainerView3 = (PrivilegeImageContainerView) o7r.a(getContext()).inflate(m6c0.H0, (ViewGroup) this.f4833a, false);
                    privilegeImageContainerView3.m7575b(wx80Var, purchaseType);
                    FrameLayout.LayoutParams layoutParams17 = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams17.gravity = 16;
                    this.f4833a.addView(privilegeImageContainerView3, layoutParams17);
                }
                this.f4835c.setText(wx80Var.m26829d());
                return;
            case 16:
                if (g6a.m15585h() && (sab0.i(purchaseType) || sab0.j(purchaseType))) {
                    this.f4834b.setText(wx80Var.m26849t());
                    this.f4835c.setText(wx80Var.m26829d());
                    PrivilegeSVGAContainerView privilegeSVGAContainerView3 = (PrivilegeSVGAContainerView) o7r.a(getContext()).inflate(m6c0.Q0, (ViewGroup) this.f4833a, false);
                    this.f4844l = privilegeSVGAContainerView3;
                    privilegeSVGAContainerView3.m7605c(wx80Var, purchaseType);
                    FrameLayout.LayoutParams layoutParams18 = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams18.gravity = 16;
                    this.f4833a.addView(this.f4844l, layoutParams18);
                    return;
                }
                break;
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 27:
            case 28:
            case 29:
            case 30:
            case 31:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case 37:
            case 38:
            case 39:
            case 40:
                break;
            case 41:
                this.f4834b.setText(wx80Var.m26849t());
                PrivilegeSVIPBadgeView privilegeSVIPBadgeView = (PrivilegeSVIPBadgeView) o7r.a(getContext()).inflate(m6c0.R0, (ViewGroup) this.f4833a, false);
                privilegeSVIPBadgeView.m7610b(purchaseType);
                FrameLayout.LayoutParams layoutParams19 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams19.gravity = 16;
                this.f4833a.addView(privilegeSVIPBadgeView, layoutParams19);
                this.f4835c.setText(wx80Var.m26829d());
                return;
            case 42:
                this.f4834b.setText(wx80Var.m26849t());
                this.f4835c.setText(wx80Var.m26829d());
                PrivilegeODiamondSkin privilegeODiamondSkin = (PrivilegeODiamondSkin) o7r.a(getContext()).inflate(m6c0.N0, (ViewGroup) this.f4833a, false);
                privilegeODiamondSkin.m7602b();
                FrameLayout.LayoutParams layoutParams20 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams20.gravity = 16;
                this.f4833a.addView(privilegeODiamondSkin, layoutParams20);
                return;
            case 43:
                this.f4834b.setText(wx80Var.m26849t());
                this.f4835c.setText(wx80Var.m26829d());
                View viewM7584e3 = m7584e(this.f4836d);
                FrameLayout.LayoutParams layoutParams21 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams21.gravity = 16;
                this.f4833a.addView(viewM7584e3, layoutParams21);
                return;
            case 44:
                this.f4834b.setText(wx80Var.m26849t());
                this.f4835c.setText(wx80Var.m26829d());
                PrivilegeODiamondService privilegeODiamondService = (PrivilegeODiamondService) o7r.a(getContext()).inflate(m6c0.M0, (ViewGroup) this.f4833a, false);
                privilegeODiamondService.m7600b();
                FrameLayout.LayoutParams layoutParams22 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams22.gravity = 16;
                this.f4833a.addView(privilegeODiamondService, layoutParams22);
                return;
            case 45:
                this.f4834b.setText(wx80Var.m26849t());
                this.f4835c.setText(wx80Var.m26829d());
                View viewM7585f = m7585f(Privilege.say_hi_pkg);
                FrameLayout.LayoutParams layoutParams23 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams23.gravity = 16;
                this.f4833a.addView(viewM7585f, layoutParams23);
                return;
            case 46:
                this.f4834b.setText(wx80Var.m26849t());
                this.f4835c.setText(wx80Var.m26829d());
                View sVGAnimationView = new SVGAnimationView(getContext());
                SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/5b7b48e6-7289-4204-acc9-eb6b424938fa14.so").repeatCount(-1).into(sVGAnimationView);
                FrameLayout.LayoutParams layoutParams24 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams24.gravity = 16;
                this.f4833a.addView(sVGAnimationView, layoutParams24);
                sVGAnimationView.startAnimation();
                return;
            case 47:
                PurchaseDlgItemVisitorHideFootPrint purchaseDlgItemVisitorHideFootPrint = (PurchaseDlgItemVisitorHideFootPrint) LayoutInflater.from(getContext()).inflate(m6c0.h1, (ViewGroup) this.f4833a, false);
                purchaseDlgItemVisitorHideFootPrint.m7628b();
                FrameLayout.LayoutParams layoutParams25 = new FrameLayout.LayoutParams(-1, t100.d(110.0f));
                layoutParams25.gravity = 16;
                this.f4833a.addView(purchaseDlgItemVisitorHideFootPrint, layoutParams25);
                this.f4834b.setText(wx80Var.m26849t());
                this.f4835c.setText(wx80Var.m26829d());
                return;
            case 48:
                this.f4834b.setText(wx80Var.m26849t());
                this.f4835c.setText(wx80Var.m26829d());
                View viewM7585f2 = m7585f(Privilege.confession_first);
                FrameLayout.LayoutParams layoutParams26 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams26.gravity = 16;
                this.f4833a.addView(viewM7585f2, layoutParams26);
                return;
            case 49:
                this.f4834b.setText(wx80Var.m26849t());
                this.f4835c.setText(wx80Var.m26829d());
                PurchaseDlgItemHideMeFromNearby purchaseDlgItemHideMeFromNearby = (PurchaseDlgItemHideMeFromNearby) LayoutInflater.from(getContext()).inflate(m6c0.f1, (ViewGroup) this.f4833a, false);
                purchaseDlgItemHideMeFromNearby.m7624b();
                FrameLayout.LayoutParams layoutParams27 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams27.gravity = 16;
                this.f4833a.addView(purchaseDlgItemHideMeFromNearby, layoutParams27);
                return;
            default:
                return;
        }
        this.f4834b.setText(wx80Var.m26849t());
        PrivilegeImageContainerView privilegeImageContainerView4 = (PrivilegeImageContainerView) o7r.a(getContext()).inflate(m6c0.H0, (ViewGroup) this.f4833a, false);
        privilegeImageContainerView4.m7575b(wx80Var, purchaseType);
        FrameLayout.LayoutParams layoutParams28 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams28.gravity = 16;
        this.f4833a.addView(privilegeImageContainerView4, layoutParams28);
        this.f4835c.setText(wx80Var.m26829d());
    }

    /* JADX INFO: renamed from: e */
    public final View m7584e(Privilege privilege) {
        PrivilegeODiamondMatchView privilegeODiamondMatchView = (PrivilegeODiamondMatchView) o7r.a(getContext()).inflate(m6c0.L0, (ViewGroup) this.f4833a, false);
        privilegeODiamondMatchView.m7598b(privilege);
        return privilegeODiamondMatchView;
    }

    /* JADX INFO: renamed from: f */
    public final View m7585f(Privilege privilege) {
        PurchaseDlgItemSVipSayHiView purchaseDlgItemSVipSayHiView = (PurchaseDlgItemSVipSayHiView) LayoutInflater.from(getContext()).inflate(m6c0.g1, (ViewGroup) this.f4833a, false);
        purchaseDlgItemSVipSayHiView.m7626b(privilege);
        return purchaseDlgItemSVipSayHiView;
    }

    /* JADX INFO: renamed from: g */
    public final void m7586g() {
        User userF = n3b0.f();
        if (!NullChecker.a(userF)) {
            CoreLikers.C0145a c0145aM2399r5 = CoreModule.f1534c.f3676u0.m2399r5();
            this.f4835c.setText(c8e0.m13312e(c0145aM2399r5 == null ? 0 : c0145aM2399r5.f3259b));
            return;
        }
        String string = getContext().getString(R.string.l7, userF.age.intValue() > 30 ? "30+" : userF.age);
        j760<String, String> j760VarM5494oi = CoreModule.m1854P().m11706a().m5494oi(userF.location.distance);
        String str = ((String) j760VarM5494oi.a) + ((String) j760VarM5494oi.b);
        String string2 = getContext().getString(userF.isFemale() ? R.string.r7 : R.string.q7, string, str);
        SpannableString spannableString = new SpannableString(string2);
        CoreModule.m1854P().m11706a().m5301Lp(spannableString, string2, string, String.valueOf(userF.age).length(), t100.f(13), t100.f(13), Color.parseColor("#ffe8aa"));
        CoreModule.m1854P().m11706a().m5301Lp(spannableString, string2, str, ((String) j760VarM5494oi.a).length(), t100.f(13), t100.f(13), Color.parseColor("#ffe8aa"));
        this.f4835c.setText(spannableString);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mkd0.z(this.f4840h);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7580a(this);
        this.f4834b.getPaint().setFakeBoldText(true);
    }

    public PrivilegeItemIntroOutstanding(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeItemIntroOutstanding(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
