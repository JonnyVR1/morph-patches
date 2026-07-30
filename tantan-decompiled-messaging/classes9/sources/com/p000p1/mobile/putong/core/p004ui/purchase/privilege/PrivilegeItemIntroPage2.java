package com.p000p1.mobile.putong.core.p004ui.purchase.privilege;

import android.content.Context;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
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
import com.tantanapp.common.utils.NullChecker;
import l.a690;
import l.b1c0;
import l.eqh0;
import l.m6c0;
import l.o7r;
import l.qed0;
import l.sab0;
import l.vtd;
import l.xdl0;
import p006l.c8e0;
import p006l.g6a;
import p006l.wx80;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class PrivilegeItemIntroPage2 extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f4855a;

    /* JADX INFO: renamed from: b */
    public VText f4856b;

    /* JADX INFO: renamed from: c */
    public VText f4857c;

    /* JADX INFO: renamed from: d */
    public Privilege f4858d;

    /* JADX INFO: renamed from: e */
    public ExplodeLayout f4859e;

    /* JADX INFO: renamed from: f */
    public QuickChatPrivilegeAnimView f4860f;

    /* JADX INFO: renamed from: g */
    public AudioMatchPrivilegeView f4861g;

    /* JADX INFO: renamed from: h */
    public PrivilegeSVGAContainerView f4862h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.privilege.PrivilegeItemIntroPage2$a */
    public static /* synthetic */ class C0231a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f4863a;

        static {
            int[] iArr = new int[Privilege.values().length];
            f4863a = iArr;
            try {
                iArr[Privilege.vip_badge.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4863a[Privilege.vip_undo.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4863a[Privilege.undo_pkg.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4863a[Privilege.likeNoLimit_pkg.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4863a[Privilege.vip_unlimited_likes.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4863a[Privilege.vip_super_like.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4863a[Privilege.superlike_pkg.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f4863a[Privilege.vip_independent_super_like.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4863a[Privilege.see_who_likes_me.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f4863a[Privilege.online_match_tickets.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f4863a[Privilege.voice_quick_chat.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f4863a[Privilege.letter.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f4863a[Privilege.greet.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f4863a[Privilege.vip_greet.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f4863a[Privilege.svip_greet.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f4863a[Privilege.leave_message.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f4863a[Privilege.see_theme_unlock_more.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f4863a[Privilege.see_theme_unlock_online.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f4863a[Privilege.svip_badge.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f4863a[Privilege.oDiamondSvipSkin.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f4863a[Privilege.oDiamondGreetings.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f4863a[Privilege.customer_service.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f4863a[Privilege.say_hi_pkg.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f4863a[Privilege.hide_me_from_nearby.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f4863a[Privilege.oDiamondSvipExtra.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f4863a[Privilege.vip_location.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f4863a[Privilege.roaming_pkg.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f4863a[Privilege.message_read_state.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f4863a[Privilege.privacy_membership.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f4863a[Privilege.advanced_filter.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f4863a[Privilege.recover_unmatches.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f4863a[Privilege.liked_user.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f4863a[Privilege.boost.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f4863a[Privilege.see_theme_unlock_pop.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f4863a[Privilege.picks.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f4863a[Privilege.svipPicksMembership.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f4863a[Privilege.oDiamondVisitor.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f4863a[Privilege.immediately_match.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                f4863a[Privilege.live_entry_animation.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f4863a[Privilege.moment_boost.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
        }
    }

    public PrivilegeItemIntroPage2(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m7589a(View view) {
        a690.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final Act m7590b() {
        return getContext();
    }

    /* JADX INFO: renamed from: c */
    public void m7591c() {
        Privilege privilege = this.f4858d;
        Privilege privilege2 = Privilege.see_who_likes_me;
        if (privilege == privilege2 && NullChecker.a(this.f4859e)) {
            this.f4859e.m7563l(true);
            return;
        }
        if (this.f4858d == Privilege.online_match_tickets && NullChecker.a(this.f4860f)) {
            this.f4860f.m7644t0();
            return;
        }
        if (this.f4858d == Privilege.voice_quick_chat && NullChecker.a(this.f4861g)) {
            this.f4861g.m7551m0();
        } else if (this.f4858d == privilege2 && NullChecker.a(this.f4862h)) {
            this.f4862h.m7608f();
        }
    }

    /* JADX INFO: renamed from: d */
    public void m7592d(wx80 wx80Var, PurchaseType purchaseType) {
        this.f4858d = wx80Var.m26841l();
        this.f4856b.setTypeface(eqh0.c(3));
        Privilege privilege = this.f4858d;
        VText vText = this.f4856b;
        if (privilege == null) {
            vText.setText(wx80Var.m26849t());
            ((PrivilegeImageContainerView) o7r.a(getContext()).inflate(m6c0.H0, (ViewGroup) this.f4855a, false)).m7575b(wx80Var, purchaseType);
            new FrameLayout.LayoutParams(-1, -1).gravity = 16;
            this.f4857c.setText(wx80Var.m26829d());
            xdl0.M0(this.f4856b, false);
            return;
        }
        xdl0.M0(vText, true);
        switch (C0231a.f4863a[this.f4858d.ordinal()]) {
            case 1:
                this.f4856b.setText(wx80Var.m26849t());
                PrivilegeVIPBadgeView privilegeVIPBadgeView = (PrivilegeVIPBadgeView) o7r.a(getContext()).inflate(m6c0.V0, (ViewGroup) this.f4855a, false);
                privilegeVIPBadgeView.m7622b();
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                layoutParams.gravity = 16;
                this.f4855a.addView(privilegeVIPBadgeView, layoutParams);
                this.f4857c.setText(wx80Var.m26829d());
                break;
            case 2:
            case CameraSticker.STATE_COMPLETE /* 3 */:
                this.f4856b.setText(wx80Var.m26849t());
                PrivilegeUndoView privilegeUndoView = (PrivilegeUndoView) o7r.a(getContext()).inflate(m6c0.S0, (ViewGroup) this.f4855a, false);
                privilegeUndoView.m7618b();
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams2.gravity = 16;
                this.f4855a.addView(privilegeUndoView, layoutParams2);
                this.f4857c.setText(wx80Var.m26829d());
                break;
            case CameraSticker.STATE_ERROR /* 4 */:
            case 5:
                this.f4856b.setText(wx80Var.m26849t());
                this.f4857c.setText(wx80Var.m26829d());
                if (g6a.m15585h() && sab0.w(purchaseType)) {
                    PrivilegeImageContainerView privilegeImageContainerView = (PrivilegeImageContainerView) o7r.a(getContext()).inflate(m6c0.H0, (ViewGroup) this.f4855a, false);
                    privilegeImageContainerView.m7578e(wx80Var, purchaseType);
                    FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams3.gravity = 16;
                    this.f4855a.addView(privilegeImageContainerView, layoutParams3);
                } else {
                    PrivilegeUnLimitLikeView privilegeUnLimitLikeView = (PrivilegeUnLimitLikeView) o7r.a(getContext()).inflate(m6c0.T0, (ViewGroup) this.f4855a, false);
                    privilegeUnLimitLikeView.m7616b();
                    FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams4.gravity = 16;
                    this.f4855a.addView(privilegeUnLimitLikeView, layoutParams4);
                }
                break;
            case 6:
            case 7:
            case 8:
                this.f4856b.setText(wx80Var.m26849t());
                this.f4857c.setText(wx80Var.m26829d());
                if (g6a.m15585h() && sab0.w(purchaseType)) {
                    PrivilegeImageContainerView privilegeImageContainerView2 = (PrivilegeImageContainerView) o7r.a(getContext()).inflate(m6c0.H0, (ViewGroup) this.f4855a, false);
                    privilegeImageContainerView2.m7577d(wx80Var, purchaseType);
                    FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams5.gravity = 16;
                    this.f4855a.addView(privilegeImageContainerView2, layoutParams5);
                } else if (!sab0.i(purchaseType)) {
                    PrivilegeSuperLikeView privilegeSuperLikeView = (PrivilegeSuperLikeView) o7r.a(getContext()).inflate(m6c0.P0, (ViewGroup) this.f4855a, false);
                    privilegeSuperLikeView.m7614b();
                    FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, -2);
                    layoutParams6.gravity = 16;
                    this.f4855a.addView(privilegeSuperLikeView, layoutParams6);
                } else {
                    View viewM7593e = m7593e(this.f4858d);
                    FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams7.gravity = 16;
                    this.f4855a.addView(viewM7593e, layoutParams7);
                }
                break;
            case 9:
                this.f4856b.setText(getContext().getString(R.string.m7));
                if (g6a.m15585h() && sab0.q(purchaseType)) {
                    PrivilegeSVGAContainerView privilegeSVGAContainerView = (PrivilegeSVGAContainerView) o7r.a(getContext()).inflate(m6c0.Q0, (ViewGroup) this.f4855a, false);
                    this.f4862h = privilegeSVGAContainerView;
                    privilegeSVGAContainerView.m7606d(wx80Var, purchaseType);
                    FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams8.gravity = 16;
                    this.f4855a.addView(this.f4862h, layoutParams8);
                } else {
                    ExplodeLayout explodeLayout = (ExplodeLayout) o7r.a(getContext()).inflate(m6c0.L2, (ViewGroup) this.f4855a, false);
                    this.f4859e = explodeLayout;
                    explodeLayout.setScale(0.8f);
                    FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams9.gravity = 17;
                    this.f4855a.addView(this.f4859e, layoutParams9);
                }
                CoreLikers.C0145a c0145aM2399r5 = CoreModule.f1534c.f3676u0.m2399r5();
                User userM2411v5 = CoreModule.f1534c.f3676u0.m2411v5();
                boolean zM5545vb = CoreModule.m1854P().m11706a().m5545vb(userM2411v5, c0145aM2399r5);
                VText vText2 = this.f4857c;
                if (!zM5545vb) {
                    vText2.setText(c8e0.m13312e(c0145aM2399r5 != null ? c0145aM2399r5.f3259b : 0));
                } else {
                    vText2.setText(CoreModule.m1854P().m11706a().m5567yl(userM2411v5));
                }
                break;
            case 10:
                this.f4856b.setText(wx80Var.m26849t());
                this.f4857c.setText(wx80Var.m26829d());
                if (g6a.m15585h() && sab0.q(purchaseType)) {
                    PrivilegeImageContainerView privilegeImageContainerView3 = (PrivilegeImageContainerView) o7r.a(getContext()).inflate(m6c0.H0, (ViewGroup) this.f4855a, false);
                    privilegeImageContainerView3.m7576c(wx80Var, purchaseType);
                    FrameLayout.LayoutParams layoutParams10 = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams10.gravity = 16;
                    this.f4855a.addView(privilegeImageContainerView3, layoutParams10);
                } else if (!sab0.i(purchaseType)) {
                    this.f4860f = new QuickChatPrivilegeAnimView(getContext());
                    FrameLayout.LayoutParams layoutParams11 = new FrameLayout.LayoutParams(-1, -2);
                    layoutParams11.gravity = 16;
                    this.f4855a.addView((View) this.f4860f, (ViewGroup.LayoutParams) layoutParams11);
                } else {
                    View viewM7593e2 = m7593e(this.f4858d);
                    FrameLayout.LayoutParams layoutParams12 = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams12.gravity = 16;
                    this.f4855a.addView(viewM7593e2, layoutParams12);
                }
                break;
            case 11:
                this.f4856b.setText(wx80Var.m26849t());
                this.f4857c.setText(wx80Var.m26829d());
                AudioMatchPrivilegeView audioMatchPrivilegeView = (AudioMatchPrivilegeView) o7r.a(getContext()).inflate(m6c0.s2, (ViewGroup) null);
                this.f4861g = audioMatchPrivilegeView;
                audioMatchPrivilegeView.m7549i0(purchaseType);
                FrameLayout.LayoutParams layoutParams13 = new FrameLayout.LayoutParams(-1, -2);
                layoutParams13.gravity = 16;
                this.f4855a.addView((View) this.f4861g, (ViewGroup.LayoutParams) layoutParams13);
                break;
            case 12:
                this.f4856b.setText(wx80Var.m26849t());
                PrivilegeLetterView privilegeLetterView = (PrivilegeLetterView) o7r.a(getContext()).inflate(m6c0.K0, (ViewGroup) this.f4855a, false);
                privilegeLetterView.m7596b();
                FrameLayout.LayoutParams layoutParams14 = new FrameLayout.LayoutParams(-1, -2);
                layoutParams14.gravity = 16;
                this.f4855a.addView(privilegeLetterView, layoutParams14);
                this.f4857c.setText(wx80Var.m26829d());
                break;
            case 13:
                this.f4856b.setText(wx80Var.m26849t());
                ImageView imageView = new ImageView(getContext());
                imageView.setImageResource(wx80Var.m26839j());
                imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                FrameLayout.LayoutParams layoutParams15 = new FrameLayout.LayoutParams(-1, -2);
                layoutParams15.gravity = 16;
                this.f4855a.addView(imageView, layoutParams15);
                this.f4857c.setText(wx80Var.m26829d());
                break;
            case 14:
            case 15:
            case 16:
                Privilege privilege2 = this.f4858d;
                Privilege privilege3 = Privilege.leave_message;
                VText vText3 = this.f4856b;
                if (privilege2 == privilege3) {
                    vText3.setText("每天5条资料留言");
                } else {
                    vText3.setText(wx80Var.m26849t());
                }
                ImageView imageView2 = new ImageView(getContext());
                imageView2.setImageResource(wx80Var.m26839j());
                imageView2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                FrameLayout.LayoutParams layoutParams16 = new FrameLayout.LayoutParams(-1, -2);
                layoutParams16.gravity = 16;
                this.f4855a.addView(imageView2, layoutParams16);
                this.f4857c.setText(wx80Var.m26829d());
                break;
            case 17:
                this.f4856b.setText(wx80Var.m26849t());
                PrivilegeImageContainerView privilegeImageContainerView4 = (PrivilegeImageContainerView) o7r.a(getContext()).inflate(m6c0.H0, (ViewGroup) this.f4855a, false);
                privilegeImageContainerView4.m7575b(wx80Var, purchaseType);
                FrameLayout.LayoutParams layoutParams17 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams17.gravity = 17;
                this.f4855a.addView(privilegeImageContainerView4, layoutParams17);
                CharSequence charSequenceM26829d = wx80Var.m26829d();
                String string = wx80Var.m26829d().toString();
                int iIndexOf = string.indexOf("1000+");
                if (iIndexOf == -1) {
                    this.f4857c.setText(string);
                } else {
                    int i = iIndexOf + 5;
                    qed0 qed0Var = new qed0(vtd.a(getContext(), 3.0f), Color.parseColor("#f2bd61"), Color.parseColor("#ffffff"), new qed0.a[]{new qed0.a(3, this.f4857c.getTextSize(), i)});
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequenceM26829d);
                    spannableStringBuilder.setSpan(qed0Var, iIndexOf, i, 18);
                    this.f4857c.setText(spannableStringBuilder);
                }
                break;
            case 18:
                PrivilegeUnlockOnlineView privilegeUnlockOnlineView = (PrivilegeUnlockOnlineView) o7r.a(getContext()).inflate(m6c0.U0, (ViewGroup) this.f4855a, false);
                privilegeUnlockOnlineView.m7620b(CoreModule.m1854P().m11706a().m5428eg());
                FrameLayout.LayoutParams layoutParams18 = new FrameLayout.LayoutParams(-1, -2);
                layoutParams18.gravity = 17;
                this.f4855a.addView(privilegeUnlockOnlineView, layoutParams18);
                this.f4856b.setText(wx80Var.m26849t());
                this.f4857c.setText(wx80Var.m26829d());
                break;
            case 19:
                this.f4856b.setText(wx80Var.m26849t());
                PrivilegeSVIPBadgeView privilegeSVIPBadgeView = (PrivilegeSVIPBadgeView) o7r.a(getContext()).inflate(m6c0.R0, (ViewGroup) this.f4855a, false);
                privilegeSVIPBadgeView.m7610b(purchaseType);
                FrameLayout.LayoutParams layoutParams19 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams19.gravity = 16;
                this.f4855a.addView(privilegeSVIPBadgeView, layoutParams19);
                this.f4857c.setText(wx80Var.m26829d());
                break;
            case 20:
                this.f4856b.setText(wx80Var.m26849t());
                this.f4857c.setText(wx80Var.m26829d());
                PrivilegeODiamondSkin privilegeODiamondSkin = (PrivilegeODiamondSkin) o7r.a(getContext()).inflate(m6c0.N0, (ViewGroup) this.f4855a, false);
                privilegeODiamondSkin.m7602b();
                FrameLayout.LayoutParams layoutParams20 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams20.gravity = 16;
                this.f4855a.addView(privilegeODiamondSkin, layoutParams20);
                break;
            case 21:
                this.f4856b.setText(wx80Var.m26849t());
                this.f4857c.setText(wx80Var.m26829d());
                View viewM7593e3 = m7593e(this.f4858d);
                FrameLayout.LayoutParams layoutParams21 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams21.gravity = 16;
                this.f4855a.addView(viewM7593e3, layoutParams21);
                break;
            case 22:
                this.f4856b.setText(wx80Var.m26849t());
                this.f4857c.setText(wx80Var.m26829d());
                PrivilegeODiamondService privilegeODiamondService = (PrivilegeODiamondService) o7r.a(getContext()).inflate(m6c0.M0, (ViewGroup) this.f4855a, false);
                privilegeODiamondService.m7600b();
                FrameLayout.LayoutParams layoutParams22 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams22.gravity = 16;
                this.f4855a.addView(privilegeODiamondService, layoutParams22);
                break;
            case 23:
                this.f4856b.setText(wx80Var.m26849t());
                this.f4857c.setText(wx80Var.m26829d());
                View viewM7594f = m7594f(Privilege.say_hi_pkg);
                FrameLayout.LayoutParams layoutParams23 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams23.gravity = 16;
                this.f4855a.addView(viewM7594f, layoutParams23);
                break;
            case 24:
                this.f4856b.setText(wx80Var.m26849t());
                this.f4857c.setText(wx80Var.m26829d());
                PurchaseDlgItemHideMeFromNearby purchaseDlgItemHideMeFromNearby = (PurchaseDlgItemHideMeFromNearby) LayoutInflater.from(getContext()).inflate(m6c0.f1, (ViewGroup) this.f4855a, false);
                purchaseDlgItemHideMeFromNearby.m7624b();
                FrameLayout.LayoutParams layoutParams24 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams24.gravity = 16;
                this.f4855a.addView(purchaseDlgItemHideMeFromNearby, layoutParams24);
                break;
            default:
                this.f4856b.setText(wx80Var.m26849t());
                PrivilegeImageContainerView privilegeImageContainerView5 = (PrivilegeImageContainerView) o7r.a(getContext()).inflate(m6c0.H0, (ViewGroup) this.f4855a, false);
                privilegeImageContainerView5.m7575b(wx80Var, purchaseType);
                FrameLayout.LayoutParams layoutParams25 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams25.gravity = 16;
                this.f4855a.addView(privilegeImageContainerView5, layoutParams25);
                this.f4857c.setText(wx80Var.m26829d());
                break;
        }
        if (sab0.i(purchaseType)) {
            this.f4856b.setTextColor(m7590b().color(b1c0.x));
            this.f4857c.setTextColor(m7590b().color(b1c0.y));
        }
    }

    /* JADX INFO: renamed from: e */
    public final View m7593e(Privilege privilege) {
        PrivilegeODiamondMatchView privilegeODiamondMatchView = (PrivilegeODiamondMatchView) o7r.a(getContext()).inflate(m6c0.L0, (ViewGroup) this.f4855a, false);
        privilegeODiamondMatchView.m7598b(privilege);
        return privilegeODiamondMatchView;
    }

    /* JADX INFO: renamed from: f */
    public final View m7594f(Privilege privilege) {
        PurchaseDlgItemSVipSayHiView purchaseDlgItemSVipSayHiView = (PurchaseDlgItemSVipSayHiView) LayoutInflater.from(getContext()).inflate(m6c0.g1, (ViewGroup) this.f4855a, false);
        purchaseDlgItemSVipSayHiView.m7626b(privilege);
        return purchaseDlgItemSVipSayHiView;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7589a(this);
        this.f4856b.getPaint().setFakeBoldText(true);
    }

    public PrivilegeItemIntroPage2(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeItemIntroPage2(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
