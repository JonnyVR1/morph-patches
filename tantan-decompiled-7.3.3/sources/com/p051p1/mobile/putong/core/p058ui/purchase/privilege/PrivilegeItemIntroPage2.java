package com.p051p1.mobile.putong.core.p058ui.purchase.privilege;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreLikers;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p151v.VText;
import p153l.a690;
import p153l.bnl0;
import p153l.ee90;
import p153l.h9c0;
import p153l.hge0;
import p153l.jvd;
import p153l.lyh0;
import p153l.p9r;
import p153l.rec0;
import p153l.s7a;
import p153l.smd0;
import p153l.wib0;

/* JADX INFO: loaded from: classes12.dex */
public class PrivilegeItemIntroPage2 extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f35922a;

    /* JADX INFO: renamed from: b */
    public VText f35923b;

    /* JADX INFO: renamed from: c */
    public VText f35924c;

    /* JADX INFO: renamed from: d */
    public Privilege f35925d;

    /* JADX INFO: renamed from: e */
    public ExplodeLayout f35926e;

    /* JADX INFO: renamed from: f */
    public QuickChatPrivilegeAnimView f35927f;

    /* JADX INFO: renamed from: g */
    public AudioMatchPrivilegeView f35928g;

    /* JADX INFO: renamed from: h */
    public PrivilegeSVGAContainerView f35929h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.privilege.PrivilegeItemIntroPage2$a */
    public static /* synthetic */ class C8958a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f35930a;

        static {
            int[] iArr = new int[Privilege.values().length];
            f35930a = iArr;
            try {
                iArr[Privilege.vip_badge.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35930a[Privilege.vip_undo.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35930a[Privilege.undo_pkg.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35930a[Privilege.likeNoLimit_pkg.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f35930a[Privilege.vip_unlimited_likes.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f35930a[Privilege.vip_super_like.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f35930a[Privilege.superlike_pkg.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f35930a[Privilege.vip_independent_super_like.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f35930a[Privilege.see_who_likes_me.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f35930a[Privilege.online_match_tickets.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f35930a[Privilege.voice_quick_chat.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f35930a[Privilege.letter.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f35930a[Privilege.greet.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f35930a[Privilege.vip_greet.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f35930a[Privilege.svip_greet.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f35930a[Privilege.leave_message.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f35930a[Privilege.see_theme_unlock_more.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f35930a[Privilege.see_theme_unlock_online.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f35930a[Privilege.svip_badge.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f35930a[Privilege.oDiamondSvipSkin.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f35930a[Privilege.oDiamondGreetings.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f35930a[Privilege.customer_service.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f35930a[Privilege.say_hi_pkg.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f35930a[Privilege.hide_me_from_nearby.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f35930a[Privilege.oDiamondSvipExtra.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f35930a[Privilege.vip_location.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f35930a[Privilege.roaming_pkg.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f35930a[Privilege.message_read_state.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f35930a[Privilege.privacy_membership.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f35930a[Privilege.advanced_filter.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f35930a[Privilege.recover_unmatches.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f35930a[Privilege.liked_user.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f35930a[Privilege.boost.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f35930a[Privilege.see_theme_unlock_pop.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f35930a[Privilege.picks.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f35930a[Privilege.svipPicksMembership.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f35930a[Privilege.oDiamondVisitor.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f35930a[Privilege.immediately_match.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                f35930a[Privilege.live_entry_animation.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f35930a[Privilege.moment_boost.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
        }
    }

    public PrivilegeItemIntroPage2(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m55437a(View view) {
        ee90.m120541a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final Act m55438b() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: c */
    public void m55439c() {
        Privilege privilege = this.f35925d;
        Privilege privilege2 = Privilege.see_who_likes_me;
        if (privilege == privilege2 && NullChecker.m82486a(this.f35926e)) {
            this.f35926e.m55411l(true);
            return;
        }
        if (this.f35925d == Privilege.online_match_tickets && NullChecker.m82486a(this.f35927f)) {
            this.f35927f.m55492t0();
            return;
        }
        if (this.f35925d == Privilege.voice_quick_chat && NullChecker.m82486a(this.f35928g)) {
            this.f35928g.m55399m0();
        } else if (this.f35925d == privilege2 && NullChecker.m82486a(this.f35929h)) {
            this.f35929h.m55456f();
        }
    }

    /* JADX INFO: renamed from: d */
    public void m55440d(a690 a690Var, PurchaseType purchaseType) {
        this.f35925d = a690Var.m96306l();
        this.f35923b.setTypeface(lyh0.m156283c(3));
        Privilege privilege = this.f35925d;
        VText vText = this.f35923b;
        if (privilege == null) {
            vText.setText(a690Var.m96314t());
            ((PrivilegeImageContainerView) p9r.m171370a(getContext()).inflate(rec0.f162446H0, (ViewGroup) this.f35922a, false)).m55423b(a690Var, purchaseType);
            new FrameLayout.LayoutParams(-1, -1).gravity = 16;
            this.f35924c.setText(a690Var.m96294d());
            bnl0.m105525M0(this.f35923b, false);
            return;
        }
        bnl0.m105525M0(vText, true);
        switch (C8958a.f35930a[this.f35925d.ordinal()]) {
            case 1:
                this.f35923b.setText(a690Var.m96314t());
                PrivilegeVIPBadgeView privilegeVIPBadgeView = (PrivilegeVIPBadgeView) p9r.m171370a(getContext()).inflate(rec0.f162502V0, (ViewGroup) this.f35922a, false);
                privilegeVIPBadgeView.m55470b();
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                layoutParams.gravity = 16;
                this.f35922a.addView(privilegeVIPBadgeView, layoutParams);
                this.f35924c.setText(a690Var.m96294d());
                break;
            case 2:
            case 3:
                this.f35923b.setText(a690Var.m96314t());
                PrivilegeUndoView privilegeUndoView = (PrivilegeUndoView) p9r.m171370a(getContext()).inflate(rec0.f162490S0, (ViewGroup) this.f35922a, false);
                privilegeUndoView.m55466b();
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams2.gravity = 16;
                this.f35922a.addView(privilegeUndoView, layoutParams2);
                this.f35924c.setText(a690Var.m96294d());
                break;
            case 4:
            case 5:
                this.f35923b.setText(a690Var.m96314t());
                this.f35924c.setText(a690Var.m96294d());
                if (s7a.m184979h() && wib0.m206579w(purchaseType)) {
                    PrivilegeImageContainerView privilegeImageContainerView = (PrivilegeImageContainerView) p9r.m171370a(getContext()).inflate(rec0.f162446H0, (ViewGroup) this.f35922a, false);
                    privilegeImageContainerView.m55426e(a690Var, purchaseType);
                    FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams3.gravity = 16;
                    this.f35922a.addView(privilegeImageContainerView, layoutParams3);
                } else {
                    PrivilegeUnLimitLikeView privilegeUnLimitLikeView = (PrivilegeUnLimitLikeView) p9r.m171370a(getContext()).inflate(rec0.f162494T0, (ViewGroup) this.f35922a, false);
                    privilegeUnLimitLikeView.m55464b();
                    FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams4.gravity = 16;
                    this.f35922a.addView(privilegeUnLimitLikeView, layoutParams4);
                }
                break;
            case 6:
            case 7:
            case 8:
                this.f35923b.setText(a690Var.m96314t());
                this.f35924c.setText(a690Var.m96294d());
                if (s7a.m184979h() && wib0.m206579w(purchaseType)) {
                    PrivilegeImageContainerView privilegeImageContainerView2 = (PrivilegeImageContainerView) p9r.m171370a(getContext()).inflate(rec0.f162446H0, (ViewGroup) this.f35922a, false);
                    privilegeImageContainerView2.m55425d(a690Var, purchaseType);
                    FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams5.gravity = 16;
                    this.f35922a.addView(privilegeImageContainerView2, layoutParams5);
                } else if (!wib0.m206565i(purchaseType)) {
                    PrivilegeSuperLikeView privilegeSuperLikeView = (PrivilegeSuperLikeView) p9r.m171370a(getContext()).inflate(rec0.f162478P0, (ViewGroup) this.f35922a, false);
                    privilegeSuperLikeView.m55462b();
                    FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, -2);
                    layoutParams6.gravity = 16;
                    this.f35922a.addView(privilegeSuperLikeView, layoutParams6);
                } else {
                    View viewM55441e = m55441e(this.f35925d);
                    FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams7.gravity = 16;
                    this.f35922a.addView(viewM55441e, layoutParams7);
                }
                break;
            case 9:
                this.f35923b.setText(getContext().getString(R$string.f28376m7));
                if (s7a.m184979h() && wib0.m206573q(purchaseType)) {
                    PrivilegeSVGAContainerView privilegeSVGAContainerView = (PrivilegeSVGAContainerView) p9r.m171370a(getContext()).inflate(rec0.f162482Q0, (ViewGroup) this.f35922a, false);
                    this.f35929h = privilegeSVGAContainerView;
                    privilegeSVGAContainerView.m55454d(a690Var, purchaseType);
                    FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams8.gravity = 16;
                    this.f35922a.addView(this.f35929h, layoutParams8);
                } else {
                    ExplodeLayout explodeLayout = (ExplodeLayout) p9r.m171370a(getContext()).inflate(rec0.f162464L2, (ViewGroup) this.f35922a, false);
                    this.f35926e = explodeLayout;
                    explodeLayout.setScale(0.8f);
                    FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams9.gravity = 17;
                    this.f35922a.addView(this.f35926e, layoutParams9);
                }
                CoreLikers.C4870a c4870aM31479t5 = CoreModule.f18264c.f20429u0.m31479t5();
                User userM31491x5 = CoreModule.f18264c.f20429u0.m31491x5();
                boolean zMo34611vb = CoreModule.m30933P().m143405a().mo34611vb(userM31491x5, c4870aM31479t5);
                VText vText2 = this.f35924c;
                if (!zMo34611vb) {
                    vText2.setText(hge0.m134921e(c4870aM31479t5 != null ? c4870aM31479t5.f20012b : 0));
                } else {
                    vText2.setText(CoreModule.m30933P().m143405a().mo34633yl(userM31491x5));
                }
                break;
            case 10:
                this.f35923b.setText(a690Var.m96314t());
                this.f35924c.setText(a690Var.m96294d());
                if (s7a.m184979h() && wib0.m206573q(purchaseType)) {
                    PrivilegeImageContainerView privilegeImageContainerView3 = (PrivilegeImageContainerView) p9r.m171370a(getContext()).inflate(rec0.f162446H0, (ViewGroup) this.f35922a, false);
                    privilegeImageContainerView3.m55424c(a690Var, purchaseType);
                    FrameLayout.LayoutParams layoutParams10 = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams10.gravity = 16;
                    this.f35922a.addView(privilegeImageContainerView3, layoutParams10);
                } else if (!wib0.m206565i(purchaseType)) {
                    this.f35927f = new QuickChatPrivilegeAnimView(getContext());
                    FrameLayout.LayoutParams layoutParams11 = new FrameLayout.LayoutParams(-1, -2);
                    layoutParams11.gravity = 16;
                    this.f35922a.addView(this.f35927f, layoutParams11);
                } else {
                    View viewM55441e2 = m55441e(this.f35925d);
                    FrameLayout.LayoutParams layoutParams12 = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams12.gravity = 16;
                    this.f35922a.addView(viewM55441e2, layoutParams12);
                }
                break;
            case 11:
                this.f35923b.setText(a690Var.m96314t());
                this.f35924c.setText(a690Var.m96294d());
                AudioMatchPrivilegeView audioMatchPrivilegeView = (AudioMatchPrivilegeView) p9r.m171370a(getContext()).inflate(rec0.f162604s2, (ViewGroup) null);
                this.f35928g = audioMatchPrivilegeView;
                audioMatchPrivilegeView.m55397i0(purchaseType);
                FrameLayout.LayoutParams layoutParams13 = new FrameLayout.LayoutParams(-1, -2);
                layoutParams13.gravity = 16;
                this.f35922a.addView(this.f35928g, layoutParams13);
                break;
            case 12:
                this.f35923b.setText(a690Var.m96314t());
                PrivilegeLetterView privilegeLetterView = (PrivilegeLetterView) p9r.m171370a(getContext()).inflate(rec0.f162458K0, (ViewGroup) this.f35922a, false);
                privilegeLetterView.m55444b();
                FrameLayout.LayoutParams layoutParams14 = new FrameLayout.LayoutParams(-1, -2);
                layoutParams14.gravity = 16;
                this.f35922a.addView(privilegeLetterView, layoutParams14);
                this.f35924c.setText(a690Var.m96294d());
                break;
            case 13:
                this.f35923b.setText(a690Var.m96314t());
                ImageView imageView = new ImageView(getContext());
                imageView.setImageResource(a690Var.m96304j());
                imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                FrameLayout.LayoutParams layoutParams15 = new FrameLayout.LayoutParams(-1, -2);
                layoutParams15.gravity = 16;
                this.f35922a.addView(imageView, layoutParams15);
                this.f35924c.setText(a690Var.m96294d());
                break;
            case 14:
            case 15:
            case 16:
                Privilege privilege2 = this.f35925d;
                Privilege privilege3 = Privilege.leave_message;
                VText vText3 = this.f35923b;
                if (privilege2 == privilege3) {
                    vText3.setText("每天5条资料留言");
                } else {
                    vText3.setText(a690Var.m96314t());
                }
                ImageView imageView2 = new ImageView(getContext());
                imageView2.setImageResource(a690Var.m96304j());
                imageView2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                FrameLayout.LayoutParams layoutParams16 = new FrameLayout.LayoutParams(-1, -2);
                layoutParams16.gravity = 16;
                this.f35922a.addView(imageView2, layoutParams16);
                this.f35924c.setText(a690Var.m96294d());
                break;
            case 17:
                this.f35923b.setText(a690Var.m96314t());
                PrivilegeImageContainerView privilegeImageContainerView4 = (PrivilegeImageContainerView) p9r.m171370a(getContext()).inflate(rec0.f162446H0, (ViewGroup) this.f35922a, false);
                privilegeImageContainerView4.m55423b(a690Var, purchaseType);
                FrameLayout.LayoutParams layoutParams17 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams17.gravity = 17;
                this.f35922a.addView(privilegeImageContainerView4, layoutParams17);
                CharSequence charSequenceM96294d = a690Var.m96294d();
                String string = a690Var.m96294d().toString();
                int iIndexOf = string.indexOf("1000+");
                if (iIndexOf == -1) {
                    this.f35924c.setText(string);
                } else {
                    int i = iIndexOf + 5;
                    smd0 smd0Var = new smd0(jvd.m147011a(getContext(), 3.0f), Color.parseColor("#f2bd61"), Color.parseColor("#ffffff"), new smd0.C20104a(3, this.f35924c.getTextSize(), i));
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequenceM96294d);
                    spannableStringBuilder.setSpan(smd0Var, iIndexOf, i, 18);
                    this.f35924c.setText(spannableStringBuilder);
                }
                break;
            case 18:
                PrivilegeUnlockOnlineView privilegeUnlockOnlineView = (PrivilegeUnlockOnlineView) p9r.m171370a(getContext()).inflate(rec0.f162498U0, (ViewGroup) this.f35922a, false);
                privilegeUnlockOnlineView.m55468b(CoreModule.m30933P().m143405a().mo34494eg());
                FrameLayout.LayoutParams layoutParams18 = new FrameLayout.LayoutParams(-1, -2);
                layoutParams18.gravity = 17;
                this.f35922a.addView(privilegeUnlockOnlineView, layoutParams18);
                this.f35923b.setText(a690Var.m96314t());
                this.f35924c.setText(a690Var.m96294d());
                break;
            case 19:
                this.f35923b.setText(a690Var.m96314t());
                PrivilegeSVIPBadgeView privilegeSVIPBadgeView = (PrivilegeSVIPBadgeView) p9r.m171370a(getContext()).inflate(rec0.f162486R0, (ViewGroup) this.f35922a, false);
                privilegeSVIPBadgeView.m55458b(purchaseType);
                FrameLayout.LayoutParams layoutParams19 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams19.gravity = 16;
                this.f35922a.addView(privilegeSVIPBadgeView, layoutParams19);
                this.f35924c.setText(a690Var.m96294d());
                break;
            case 20:
                this.f35923b.setText(a690Var.m96314t());
                this.f35924c.setText(a690Var.m96294d());
                PrivilegeODiamondSkin privilegeODiamondSkin = (PrivilegeODiamondSkin) p9r.m171370a(getContext()).inflate(rec0.f162470N0, (ViewGroup) this.f35922a, false);
                privilegeODiamondSkin.m55450b();
                FrameLayout.LayoutParams layoutParams20 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams20.gravity = 16;
                this.f35922a.addView(privilegeODiamondSkin, layoutParams20);
                break;
            case 21:
                this.f35923b.setText(a690Var.m96314t());
                this.f35924c.setText(a690Var.m96294d());
                View viewM55441e3 = m55441e(this.f35925d);
                FrameLayout.LayoutParams layoutParams21 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams21.gravity = 16;
                this.f35922a.addView(viewM55441e3, layoutParams21);
                break;
            case 22:
                this.f35923b.setText(a690Var.m96314t());
                this.f35924c.setText(a690Var.m96294d());
                PrivilegeODiamondService privilegeODiamondService = (PrivilegeODiamondService) p9r.m171370a(getContext()).inflate(rec0.f162466M0, (ViewGroup) this.f35922a, false);
                privilegeODiamondService.m55448b();
                FrameLayout.LayoutParams layoutParams22 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams22.gravity = 16;
                this.f35922a.addView(privilegeODiamondService, layoutParams22);
                break;
            case 23:
                this.f35923b.setText(a690Var.m96314t());
                this.f35924c.setText(a690Var.m96294d());
                View viewM55442f = m55442f(Privilege.say_hi_pkg);
                FrameLayout.LayoutParams layoutParams23 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams23.gravity = 16;
                this.f35922a.addView(viewM55442f, layoutParams23);
                break;
            case 24:
                this.f35923b.setText(a690Var.m96314t());
                this.f35924c.setText(a690Var.m96294d());
                PurchaseDlgItemHideMeFromNearby purchaseDlgItemHideMeFromNearby = (PurchaseDlgItemHideMeFromNearby) LayoutInflater.from(getContext()).inflate(rec0.f162548f1, (ViewGroup) this.f35922a, false);
                purchaseDlgItemHideMeFromNearby.m55472b();
                FrameLayout.LayoutParams layoutParams24 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams24.gravity = 16;
                this.f35922a.addView(purchaseDlgItemHideMeFromNearby, layoutParams24);
                break;
            default:
                this.f35923b.setText(a690Var.m96314t());
                PrivilegeImageContainerView privilegeImageContainerView5 = (PrivilegeImageContainerView) p9r.m171370a(getContext()).inflate(rec0.f162446H0, (ViewGroup) this.f35922a, false);
                privilegeImageContainerView5.m55423b(a690Var, purchaseType);
                FrameLayout.LayoutParams layoutParams25 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams25.gravity = 16;
                this.f35922a.addView(privilegeImageContainerView5, layoutParams25);
                this.f35924c.setText(a690Var.m96294d());
                break;
        }
        if (wib0.m206565i(purchaseType)) {
            this.f35923b.setTextColor(m55438b().color(h9c0.f108401x));
            this.f35924c.setTextColor(m55438b().color(h9c0.f108402y));
        }
    }

    /* JADX INFO: renamed from: e */
    public final View m55441e(Privilege privilege) {
        PrivilegeODiamondMatchView privilegeODiamondMatchView = (PrivilegeODiamondMatchView) p9r.m171370a(getContext()).inflate(rec0.f162462L0, (ViewGroup) this.f35922a, false);
        privilegeODiamondMatchView.m55446b(privilege);
        return privilegeODiamondMatchView;
    }

    /* JADX INFO: renamed from: f */
    public final View m55442f(Privilege privilege) {
        PurchaseDlgItemSVipSayHiView purchaseDlgItemSVipSayHiView = (PurchaseDlgItemSVipSayHiView) LayoutInflater.from(getContext()).inflate(rec0.f162553g1, (ViewGroup) this.f35922a, false);
        purchaseDlgItemSVipSayHiView.m55474b(privilege);
        return purchaseDlgItemSVipSayHiView;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m55437a(this);
        this.f35923b.getPaint().setFakeBoldText(true);
    }

    public PrivilegeItemIntroPage2(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeItemIntroPage2(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
