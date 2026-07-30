package com.p046p1.mobile.putong.core.p053ui.purchase.privilege;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreLikers;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p147v.VText;
import p149l.a690;
import p149l.b1c0;
import p149l.c8e0;
import p149l.eqh0;
import p149l.g6a;
import p149l.m6c0;
import p149l.o7r;
import p149l.qed0;
import p149l.sab0;
import p149l.vtd;
import p149l.wx80;
import p149l.xdl0;

/* JADX INFO: loaded from: classes9.dex */
public class PrivilegeItemIntroPage2 extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f35074a;

    /* JADX INFO: renamed from: b */
    public VText f35075b;

    /* JADX INFO: renamed from: c */
    public VText f35076c;

    /* JADX INFO: renamed from: d */
    public Privilege f35077d;

    /* JADX INFO: renamed from: e */
    public ExplodeLayout f35078e;

    /* JADX INFO: renamed from: f */
    public QuickChatPrivilegeAnimView f35079f;

    /* JADX INFO: renamed from: g */
    public AudioMatchPrivilegeView f35080g;

    /* JADX INFO: renamed from: h */
    public PrivilegeSVGAContainerView f35081h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.privilege.PrivilegeItemIntroPage2$a */
    public static /* synthetic */ class C8795a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f35082a;

        static {
            int[] iArr = new int[Privilege.values().length];
            f35082a = iArr;
            try {
                iArr[Privilege.vip_badge.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35082a[Privilege.vip_undo.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35082a[Privilege.undo_pkg.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35082a[Privilege.likeNoLimit_pkg.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f35082a[Privilege.vip_unlimited_likes.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f35082a[Privilege.vip_super_like.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f35082a[Privilege.superlike_pkg.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f35082a[Privilege.vip_independent_super_like.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f35082a[Privilege.see_who_likes_me.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f35082a[Privilege.online_match_tickets.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f35082a[Privilege.voice_quick_chat.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f35082a[Privilege.letter.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f35082a[Privilege.greet.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f35082a[Privilege.vip_greet.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f35082a[Privilege.svip_greet.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f35082a[Privilege.leave_message.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f35082a[Privilege.see_theme_unlock_more.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f35082a[Privilege.see_theme_unlock_online.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f35082a[Privilege.svip_badge.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f35082a[Privilege.oDiamondSvipSkin.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f35082a[Privilege.oDiamondGreetings.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f35082a[Privilege.customer_service.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f35082a[Privilege.say_hi_pkg.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f35082a[Privilege.hide_me_from_nearby.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f35082a[Privilege.oDiamondSvipExtra.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f35082a[Privilege.vip_location.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f35082a[Privilege.roaming_pkg.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f35082a[Privilege.message_read_state.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f35082a[Privilege.privacy_membership.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f35082a[Privilege.advanced_filter.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f35082a[Privilege.recover_unmatches.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f35082a[Privilege.liked_user.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f35082a[Privilege.boost.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f35082a[Privilege.see_theme_unlock_pop.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f35082a[Privilege.picks.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f35082a[Privilege.svipPicksMembership.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f35082a[Privilege.oDiamondVisitor.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f35082a[Privilege.immediately_match.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                f35082a[Privilege.live_entry_animation.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f35082a[Privilege.moment_boost.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
        }
    }

    public PrivilegeItemIntroPage2(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m54254a(View view) {
        a690.m95124a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final Act m54255b() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: c */
    public void m54256c() {
        Privilege privilege = this.f35077d;
        Privilege privilege2 = Privilege.see_who_likes_me;
        if (privilege == privilege2 && NullChecker.m81303a(this.f35078e)) {
            this.f35078e.m54228l(true);
            return;
        }
        if (this.f35077d == Privilege.online_match_tickets && NullChecker.m81303a(this.f35079f)) {
            this.f35079f.m54309t0();
            return;
        }
        if (this.f35077d == Privilege.voice_quick_chat && NullChecker.m81303a(this.f35080g)) {
            this.f35080g.m54216m0();
        } else if (this.f35077d == privilege2 && NullChecker.m81303a(this.f35081h)) {
            this.f35081h.m54273f();
        }
    }

    /* JADX INFO: renamed from: d */
    public void m54257d(wx80 wx80Var, PurchaseType purchaseType) {
        this.f35077d = wx80Var.m205960l();
        this.f35075b.setTypeface(eqh0.m117752c(3));
        Privilege privilege = this.f35077d;
        VText vText = this.f35075b;
        if (privilege == null) {
            vText.setText(wx80Var.m205968t());
            ((PrivilegeImageContainerView) o7r.m163037a(getContext()).inflate(m6c0.f131486H0, (ViewGroup) this.f35074a, false)).m54240b(wx80Var, purchaseType);
            new FrameLayout.LayoutParams(-1, -1).gravity = 16;
            this.f35076c.setText(wx80Var.m205948d());
            xdl0.m208345M0(this.f35075b, false);
            return;
        }
        xdl0.m208345M0(vText, true);
        switch (C8795a.f35082a[this.f35077d.ordinal()]) {
            case 1:
                this.f35075b.setText(wx80Var.m205968t());
                PrivilegeVIPBadgeView privilegeVIPBadgeView = (PrivilegeVIPBadgeView) o7r.m163037a(getContext()).inflate(m6c0.f131542V0, (ViewGroup) this.f35074a, false);
                privilegeVIPBadgeView.m54287b();
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
                layoutParams.gravity = 16;
                this.f35074a.addView(privilegeVIPBadgeView, layoutParams);
                this.f35076c.setText(wx80Var.m205948d());
                break;
            case 2:
            case 3:
                this.f35075b.setText(wx80Var.m205968t());
                PrivilegeUndoView privilegeUndoView = (PrivilegeUndoView) o7r.m163037a(getContext()).inflate(m6c0.f131530S0, (ViewGroup) this.f35074a, false);
                privilegeUndoView.m54283b();
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams2.gravity = 16;
                this.f35074a.addView(privilegeUndoView, layoutParams2);
                this.f35076c.setText(wx80Var.m205948d());
                break;
            case 4:
            case 5:
                this.f35075b.setText(wx80Var.m205968t());
                this.f35076c.setText(wx80Var.m205948d());
                if (g6a.m124559h() && sab0.m182905w(purchaseType)) {
                    PrivilegeImageContainerView privilegeImageContainerView = (PrivilegeImageContainerView) o7r.m163037a(getContext()).inflate(m6c0.f131486H0, (ViewGroup) this.f35074a, false);
                    privilegeImageContainerView.m54243e(wx80Var, purchaseType);
                    FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams3.gravity = 16;
                    this.f35074a.addView(privilegeImageContainerView, layoutParams3);
                } else {
                    PrivilegeUnLimitLikeView privilegeUnLimitLikeView = (PrivilegeUnLimitLikeView) o7r.m163037a(getContext()).inflate(m6c0.f131534T0, (ViewGroup) this.f35074a, false);
                    privilegeUnLimitLikeView.m54281b();
                    FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams4.gravity = 16;
                    this.f35074a.addView(privilegeUnLimitLikeView, layoutParams4);
                }
                break;
            case 6:
            case 7:
            case 8:
                this.f35075b.setText(wx80Var.m205968t());
                this.f35076c.setText(wx80Var.m205948d());
                if (g6a.m124559h() && sab0.m182905w(purchaseType)) {
                    PrivilegeImageContainerView privilegeImageContainerView2 = (PrivilegeImageContainerView) o7r.m163037a(getContext()).inflate(m6c0.f131486H0, (ViewGroup) this.f35074a, false);
                    privilegeImageContainerView2.m54242d(wx80Var, purchaseType);
                    FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams5.gravity = 16;
                    this.f35074a.addView(privilegeImageContainerView2, layoutParams5);
                } else if (!sab0.m182891i(purchaseType)) {
                    PrivilegeSuperLikeView privilegeSuperLikeView = (PrivilegeSuperLikeView) o7r.m163037a(getContext()).inflate(m6c0.f131518P0, (ViewGroup) this.f35074a, false);
                    privilegeSuperLikeView.m54279b();
                    FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, -2);
                    layoutParams6.gravity = 16;
                    this.f35074a.addView(privilegeSuperLikeView, layoutParams6);
                } else {
                    View viewM54258e = m54258e(this.f35077d);
                    FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams7.gravity = 16;
                    this.f35074a.addView(viewM54258e, layoutParams7);
                }
                break;
            case 9:
                this.f35075b.setText(getContext().getString(R$string.f27528m7));
                if (g6a.m124559h() && sab0.m182899q(purchaseType)) {
                    PrivilegeSVGAContainerView privilegeSVGAContainerView = (PrivilegeSVGAContainerView) o7r.m163037a(getContext()).inflate(m6c0.f131522Q0, (ViewGroup) this.f35074a, false);
                    this.f35081h = privilegeSVGAContainerView;
                    privilegeSVGAContainerView.m54271d(wx80Var, purchaseType);
                    FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams8.gravity = 16;
                    this.f35074a.addView(this.f35081h, layoutParams8);
                } else {
                    ExplodeLayout explodeLayout = (ExplodeLayout) o7r.m163037a(getContext()).inflate(m6c0.f131504L2, (ViewGroup) this.f35074a, false);
                    this.f35078e = explodeLayout;
                    explodeLayout.setScale(0.8f);
                    FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams9.gravity = 17;
                    this.f35074a.addView(this.f35078e, layoutParams9);
                }
                CoreLikers.C4719a c4719aM30471r5 = CoreModule.f17545c.f19687u0.m30471r5();
                User userM30483v5 = CoreModule.f17545c.f19687u0.m30483v5();
                boolean zMo33608vb = CoreModule.m29935P().m94651a().mo33608vb(userM30483v5, c4719aM30471r5);
                VText vText2 = this.f35076c;
                if (!zMo33608vb) {
                    vText2.setText(c8e0.m105784e(c4719aM30471r5 != null ? c4719aM30471r5.f19270b : 0));
                } else {
                    vText2.setText(CoreModule.m29935P().m94651a().mo33630yl(userM30483v5));
                }
                break;
            case 10:
                this.f35075b.setText(wx80Var.m205968t());
                this.f35076c.setText(wx80Var.m205948d());
                if (g6a.m124559h() && sab0.m182899q(purchaseType)) {
                    PrivilegeImageContainerView privilegeImageContainerView3 = (PrivilegeImageContainerView) o7r.m163037a(getContext()).inflate(m6c0.f131486H0, (ViewGroup) this.f35074a, false);
                    privilegeImageContainerView3.m54241c(wx80Var, purchaseType);
                    FrameLayout.LayoutParams layoutParams10 = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams10.gravity = 16;
                    this.f35074a.addView(privilegeImageContainerView3, layoutParams10);
                } else if (!sab0.m182891i(purchaseType)) {
                    this.f35079f = new QuickChatPrivilegeAnimView(getContext());
                    FrameLayout.LayoutParams layoutParams11 = new FrameLayout.LayoutParams(-1, -2);
                    layoutParams11.gravity = 16;
                    this.f35074a.addView(this.f35079f, layoutParams11);
                } else {
                    View viewM54258e2 = m54258e(this.f35077d);
                    FrameLayout.LayoutParams layoutParams12 = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams12.gravity = 16;
                    this.f35074a.addView(viewM54258e2, layoutParams12);
                }
                break;
            case 11:
                this.f35075b.setText(wx80Var.m205968t());
                this.f35076c.setText(wx80Var.m205948d());
                AudioMatchPrivilegeView audioMatchPrivilegeView = (AudioMatchPrivilegeView) o7r.m163037a(getContext()).inflate(m6c0.f131644s2, (ViewGroup) null);
                this.f35080g = audioMatchPrivilegeView;
                audioMatchPrivilegeView.m54214i0(purchaseType);
                FrameLayout.LayoutParams layoutParams13 = new FrameLayout.LayoutParams(-1, -2);
                layoutParams13.gravity = 16;
                this.f35074a.addView(this.f35080g, layoutParams13);
                break;
            case 12:
                this.f35075b.setText(wx80Var.m205968t());
                PrivilegeLetterView privilegeLetterView = (PrivilegeLetterView) o7r.m163037a(getContext()).inflate(m6c0.f131498K0, (ViewGroup) this.f35074a, false);
                privilegeLetterView.m54261b();
                FrameLayout.LayoutParams layoutParams14 = new FrameLayout.LayoutParams(-1, -2);
                layoutParams14.gravity = 16;
                this.f35074a.addView(privilegeLetterView, layoutParams14);
                this.f35076c.setText(wx80Var.m205948d());
                break;
            case 13:
                this.f35075b.setText(wx80Var.m205968t());
                ImageView imageView = new ImageView(getContext());
                imageView.setImageResource(wx80Var.m205958j());
                imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                FrameLayout.LayoutParams layoutParams15 = new FrameLayout.LayoutParams(-1, -2);
                layoutParams15.gravity = 16;
                this.f35074a.addView(imageView, layoutParams15);
                this.f35076c.setText(wx80Var.m205948d());
                break;
            case 14:
            case 15:
            case 16:
                Privilege privilege2 = this.f35077d;
                Privilege privilege3 = Privilege.leave_message;
                VText vText3 = this.f35075b;
                if (privilege2 == privilege3) {
                    vText3.setText("每天5条资料留言");
                } else {
                    vText3.setText(wx80Var.m205968t());
                }
                ImageView imageView2 = new ImageView(getContext());
                imageView2.setImageResource(wx80Var.m205958j());
                imageView2.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                FrameLayout.LayoutParams layoutParams16 = new FrameLayout.LayoutParams(-1, -2);
                layoutParams16.gravity = 16;
                this.f35074a.addView(imageView2, layoutParams16);
                this.f35076c.setText(wx80Var.m205948d());
                break;
            case 17:
                this.f35075b.setText(wx80Var.m205968t());
                PrivilegeImageContainerView privilegeImageContainerView4 = (PrivilegeImageContainerView) o7r.m163037a(getContext()).inflate(m6c0.f131486H0, (ViewGroup) this.f35074a, false);
                privilegeImageContainerView4.m54240b(wx80Var, purchaseType);
                FrameLayout.LayoutParams layoutParams17 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams17.gravity = 17;
                this.f35074a.addView(privilegeImageContainerView4, layoutParams17);
                CharSequence charSequenceM205948d = wx80Var.m205948d();
                String string = wx80Var.m205948d().toString();
                int iIndexOf = string.indexOf("1000+");
                if (iIndexOf == -1) {
                    this.f35076c.setText(string);
                } else {
                    int i = iIndexOf + 5;
                    qed0 qed0Var = new qed0(vtd.m199996a(getContext(), 3.0f), Color.parseColor("#f2bd61"), Color.parseColor("#ffffff"), new qed0.C19470a(3, this.f35076c.getTextSize(), i));
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequenceM205948d);
                    spannableStringBuilder.setSpan(qed0Var, iIndexOf, i, 18);
                    this.f35076c.setText(spannableStringBuilder);
                }
                break;
            case 18:
                PrivilegeUnlockOnlineView privilegeUnlockOnlineView = (PrivilegeUnlockOnlineView) o7r.m163037a(getContext()).inflate(m6c0.f131538U0, (ViewGroup) this.f35074a, false);
                privilegeUnlockOnlineView.m54285b(CoreModule.m29935P().m94651a().mo33491eg());
                FrameLayout.LayoutParams layoutParams18 = new FrameLayout.LayoutParams(-1, -2);
                layoutParams18.gravity = 17;
                this.f35074a.addView(privilegeUnlockOnlineView, layoutParams18);
                this.f35075b.setText(wx80Var.m205968t());
                this.f35076c.setText(wx80Var.m205948d());
                break;
            case 19:
                this.f35075b.setText(wx80Var.m205968t());
                PrivilegeSVIPBadgeView privilegeSVIPBadgeView = (PrivilegeSVIPBadgeView) o7r.m163037a(getContext()).inflate(m6c0.f131526R0, (ViewGroup) this.f35074a, false);
                privilegeSVIPBadgeView.m54275b(purchaseType);
                FrameLayout.LayoutParams layoutParams19 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams19.gravity = 16;
                this.f35074a.addView(privilegeSVIPBadgeView, layoutParams19);
                this.f35076c.setText(wx80Var.m205948d());
                break;
            case 20:
                this.f35075b.setText(wx80Var.m205968t());
                this.f35076c.setText(wx80Var.m205948d());
                PrivilegeODiamondSkin privilegeODiamondSkin = (PrivilegeODiamondSkin) o7r.m163037a(getContext()).inflate(m6c0.f131510N0, (ViewGroup) this.f35074a, false);
                privilegeODiamondSkin.m54267b();
                FrameLayout.LayoutParams layoutParams20 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams20.gravity = 16;
                this.f35074a.addView(privilegeODiamondSkin, layoutParams20);
                break;
            case 21:
                this.f35075b.setText(wx80Var.m205968t());
                this.f35076c.setText(wx80Var.m205948d());
                View viewM54258e3 = m54258e(this.f35077d);
                FrameLayout.LayoutParams layoutParams21 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams21.gravity = 16;
                this.f35074a.addView(viewM54258e3, layoutParams21);
                break;
            case 22:
                this.f35075b.setText(wx80Var.m205968t());
                this.f35076c.setText(wx80Var.m205948d());
                PrivilegeODiamondService privilegeODiamondService = (PrivilegeODiamondService) o7r.m163037a(getContext()).inflate(m6c0.f131506M0, (ViewGroup) this.f35074a, false);
                privilegeODiamondService.m54265b();
                FrameLayout.LayoutParams layoutParams22 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams22.gravity = 16;
                this.f35074a.addView(privilegeODiamondService, layoutParams22);
                break;
            case 23:
                this.f35075b.setText(wx80Var.m205968t());
                this.f35076c.setText(wx80Var.m205948d());
                View viewM54259f = m54259f(Privilege.say_hi_pkg);
                FrameLayout.LayoutParams layoutParams23 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams23.gravity = 16;
                this.f35074a.addView(viewM54259f, layoutParams23);
                break;
            case 24:
                this.f35075b.setText(wx80Var.m205968t());
                this.f35076c.setText(wx80Var.m205948d());
                PurchaseDlgItemHideMeFromNearby purchaseDlgItemHideMeFromNearby = (PurchaseDlgItemHideMeFromNearby) LayoutInflater.from(getContext()).inflate(m6c0.f131588f1, (ViewGroup) this.f35074a, false);
                purchaseDlgItemHideMeFromNearby.m54289b();
                FrameLayout.LayoutParams layoutParams24 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams24.gravity = 16;
                this.f35074a.addView(purchaseDlgItemHideMeFromNearby, layoutParams24);
                break;
            default:
                this.f35075b.setText(wx80Var.m205968t());
                PrivilegeImageContainerView privilegeImageContainerView5 = (PrivilegeImageContainerView) o7r.m163037a(getContext()).inflate(m6c0.f131486H0, (ViewGroup) this.f35074a, false);
                privilegeImageContainerView5.m54240b(wx80Var, purchaseType);
                FrameLayout.LayoutParams layoutParams25 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams25.gravity = 16;
                this.f35074a.addView(privilegeImageContainerView5, layoutParams25);
                this.f35076c.setText(wx80Var.m205948d());
                break;
        }
        if (sab0.m182891i(purchaseType)) {
            this.f35075b.setTextColor(m54255b().color(b1c0.f72581x));
            this.f35076c.setTextColor(m54255b().color(b1c0.f72582y));
        }
    }

    /* JADX INFO: renamed from: e */
    public final View m54258e(Privilege privilege) {
        PrivilegeODiamondMatchView privilegeODiamondMatchView = (PrivilegeODiamondMatchView) o7r.m163037a(getContext()).inflate(m6c0.f131502L0, (ViewGroup) this.f35074a, false);
        privilegeODiamondMatchView.m54263b(privilege);
        return privilegeODiamondMatchView;
    }

    /* JADX INFO: renamed from: f */
    public final View m54259f(Privilege privilege) {
        PurchaseDlgItemSVipSayHiView purchaseDlgItemSVipSayHiView = (PurchaseDlgItemSVipSayHiView) LayoutInflater.from(getContext()).inflate(m6c0.f131593g1, (ViewGroup) this.f35074a, false);
        purchaseDlgItemSVipSayHiView.m54291b(privilege);
        return purchaseDlgItemSVipSayHiView;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m54254a(this);
        this.f35075b.getPaint().setFakeBoldText(true);
    }

    public PrivilegeItemIntroPage2(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeItemIntroPage2(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
