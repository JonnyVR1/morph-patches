package com.p046p1.mobile.putong.core.p053ui.purchase.privilege;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreLikers;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.data.User;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import p147v.VText;
import p149l.b1c0;
import p149l.c4g0;
import p149l.c8e0;
import p149l.eqh0;
import p149l.g6a;
import p149l.j760;
import p149l.m6c0;
import p149l.mkd0;
import p149l.n3b0;
import p149l.o7r;
import p149l.sab0;
import p149l.t100;
import p149l.wx80;
import p149l.y590;

/* JADX INFO: loaded from: classes9.dex */
public class PrivilegeItemIntroOutstanding extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f35052a;

    /* JADX INFO: renamed from: b */
    public VText f35053b;

    /* JADX INFO: renamed from: c */
    public VText f35054c;

    /* JADX INFO: renamed from: d */
    public Privilege f35055d;

    /* JADX INFO: renamed from: e */
    public ExplodeLayout f35056e;

    /* JADX INFO: renamed from: f */
    public QuickChatPrivilegeAnimView f35057f;

    /* JADX INFO: renamed from: g */
    public SvipDlgSeeAnimLayout f35058g;

    /* JADX INFO: renamed from: h */
    public c4g0 f35059h;

    /* JADX INFO: renamed from: i */
    public AudioMatchPrivilegeView f35060i;

    /* JADX INFO: renamed from: j */
    public PrivilegeSVGAContainerView f35061j;

    /* JADX INFO: renamed from: k */
    public PrivilegeSVGAContainerView f35062k;

    /* JADX INFO: renamed from: l */
    public PrivilegeSVGAContainerView f35063l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.privilege.PrivilegeItemIntroOutstanding$a */
    public static /* synthetic */ class C8794a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f35064a;

        static {
            int[] iArr = new int[Privilege.values().length];
            f35064a = iArr;
            try {
                iArr[Privilege.vip_badge.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35064a[Privilege.vip_undo.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35064a[Privilege.vip_unlimited_likes.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35064a[Privilege.vip_super_like.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f35064a[Privilege.vip_independent_super_like.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f35064a[Privilege.youth_superlike.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f35064a[Privilege.see_who_likes_me.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f35064a[Privilege.online_match_tickets.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f35064a[Privilege.voice_quick_chat.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f35064a[Privilege.letter.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f35064a[Privilege.greet.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f35064a[Privilege.vip_greet.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f35064a[Privilege.svip_greet.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f35064a[Privilege.leave_message.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f35064a[Privilege.top_like.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f35064a[Privilege.immediately_match.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f35064a[Privilege.nearby_people.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f35064a[Privilege.top_chat.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f35064a[Privilege.vip_location.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f35064a[Privilege.message_read_state.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f35064a[Privilege.privacy_membership.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f35064a[Privilege.advanced_filter.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f35064a[Privilege.recover_unmatches.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f35064a[Privilege.liked_user.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f35064a[Privilege.boost.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f35064a[Privilege.svipPicksMembership.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f35064a[Privilege.picksMembership.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f35064a[Privilege.oDiamondSvipExtra.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f35064a[Privilege.oDiamondVisitor.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f35064a[Privilege.moment_boost.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f35064a[Privilege.live_entry_animation.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f35064a[Privilege.unlock_learn_about_him_module.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f35064a[Privilege.ads_not_disturb.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f35064a[Privilege.block_harassing_words.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f35064a[Privilege.pick_tantan_credits_users.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f35064a[Privilege.youth_roaming.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f35064a[Privilege.youth_find_partner.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f35064a[Privilege.youth_blind_box.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                f35064a[Privilege.youth_message_read.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f35064a[Privilege.private_custom.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f35064a[Privilege.svip_badge.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                f35064a[Privilege.oDiamondSvipSkin.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                f35064a[Privilege.oDiamondGreetings.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                f35064a[Privilege.customer_service.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                f35064a[Privilege.say_hi_pkg.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                f35064a[Privilege.accelerate_pairing.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                f35064a[Privilege.visitor_hide_footprint.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                f35064a[Privilege.confession_first.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                f35064a[Privilege.hide_me_from_nearby.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
        }
    }

    public PrivilegeItemIntroOutstanding(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m54245a(View view) {
        y590.m212965a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final Act m54246b() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: c */
    public void m54247c() {
        Privilege privilege = this.f35055d;
        Privilege privilege2 = Privilege.see_who_likes_me;
        if (privilege == privilege2 && NullChecker.m81303a(this.f35056e)) {
            this.f35056e.m54228l(true);
            return;
        }
        if (this.f35055d == Privilege.online_match_tickets && NullChecker.m81303a(this.f35057f)) {
            this.f35057f.m54309t0();
            return;
        }
        if (this.f35055d == privilege2 && NullChecker.m81303a(this.f35058g)) {
            this.f35058g.m54323l0();
            return;
        }
        if (this.f35055d == Privilege.voice_quick_chat && NullChecker.m81303a(this.f35060i)) {
            this.f35060i.m54216m0();
            return;
        }
        if (this.f35055d == Privilege.top_like && NullChecker.m81303a(this.f35061j)) {
            this.f35061j.m54273f();
            return;
        }
        if (this.f35055d == privilege2 && NullChecker.m81303a(this.f35062k)) {
            this.f35062k.m54273f();
        } else if (this.f35055d == Privilege.immediately_match && NullChecker.m81303a(this.f35063l)) {
            this.f35063l.m54273f();
        }
    }

    /* JADX INFO: renamed from: d */
    public void m54248d(wx80 wx80Var, int i, PurchaseType purchaseType) {
        if (sab0.m182891i(purchaseType) || sab0.m182898p(purchaseType) || sab0.m182892j(purchaseType)) {
            this.f35053b.setTextColor(m54246b().color(b1c0.f72581x));
            this.f35054c.setTextColor(m54246b().color(b1c0.f72582y));
        }
        this.f35053b.setTypeface(eqh0.m117752c(3));
        Privilege privilegeM205960l = wx80Var.m205960l();
        this.f35055d = privilegeM205960l;
        if (privilegeM205960l == null) {
            this.f35053b.setText(wx80Var.m205968t());
            PrivilegeImageContainerView privilegeImageContainerView = (PrivilegeImageContainerView) o7r.m163037a(getContext()).inflate(m6c0.f131486H0, (ViewGroup) this.f35052a, false);
            privilegeImageContainerView.m54240b(wx80Var, purchaseType);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 16;
            this.f35052a.addView(privilegeImageContainerView, layoutParams);
            this.f35054c.setText(wx80Var.m205948d());
            return;
        }
        switch (C8794a.f35064a[privilegeM205960l.ordinal()]) {
            case 1:
                this.f35053b.setText(wx80Var.m205968t());
                PrivilegeVIPBadgeView privilegeVIPBadgeView = (PrivilegeVIPBadgeView) o7r.m163037a(getContext()).inflate(m6c0.f131542V0, (ViewGroup) this.f35052a, false);
                privilegeVIPBadgeView.m54287b();
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams2.gravity = 16;
                this.f35052a.addView(privilegeVIPBadgeView, layoutParams2);
                this.f35054c.setText(wx80Var.m205948d());
                return;
            case 2:
                this.f35053b.setText(wx80Var.m205968t());
                PrivilegeUndoView privilegeUndoView = (PrivilegeUndoView) o7r.m163037a(getContext()).inflate(m6c0.f131530S0, (ViewGroup) this.f35052a, false);
                privilegeUndoView.m54283b();
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams3.gravity = 16;
                this.f35052a.addView(privilegeUndoView, layoutParams3);
                this.f35054c.setText(wx80Var.m205948d());
                return;
            case 3:
                this.f35053b.setText(wx80Var.m205968t());
                PrivilegeUnLimitLikeView privilegeUnLimitLikeView = (PrivilegeUnLimitLikeView) o7r.m163037a(getContext()).inflate(m6c0.f131534T0, (ViewGroup) this.f35052a, false);
                privilegeUnLimitLikeView.m54281b();
                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams4.gravity = 16;
                this.f35052a.addView(privilegeUnLimitLikeView, layoutParams4);
                this.f35054c.setText(wx80Var.m205948d());
                return;
            case 4:
            case 5:
            case 6:
                this.f35053b.setText(wx80Var.m205968t());
                this.f35054c.setText(wx80Var.m205948d());
                if (!sab0.m182891i(purchaseType) && !sab0.m182892j(purchaseType)) {
                    PrivilegeSuperLikeView privilegeSuperLikeView = (PrivilegeSuperLikeView) o7r.m163037a(getContext()).inflate(m6c0.f131518P0, (ViewGroup) this.f35052a, false);
                    privilegeSuperLikeView.m54279b();
                    FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, -2);
                    layoutParams5.gravity = 16;
                    this.f35052a.addView(privilegeSuperLikeView, layoutParams5);
                    return;
                }
                View viewM54249e = m54249e(this.f35055d);
                FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, -2);
                layoutParams6.topMargin = 0;
                layoutParams6.bottomMargin = 0;
                layoutParams6.gravity = 17;
                this.f35052a.addView(viewM54249e, layoutParams6);
                return;
            case 7:
                this.f35053b.setText(getContext().getString(R$string.f27528m7));
                if (g6a.m124559h() && sab0.m182899q(purchaseType)) {
                    PrivilegeSVGAContainerView privilegeSVGAContainerView = (PrivilegeSVGAContainerView) o7r.m163037a(getContext()).inflate(m6c0.f131522Q0, (ViewGroup) this.f35052a, false);
                    this.f35062k = privilegeSVGAContainerView;
                    privilegeSVGAContainerView.m54271d(wx80Var, purchaseType);
                    FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams7.gravity = 16;
                    this.f35052a.addView(this.f35062k, layoutParams7);
                    if (CoreModule.m29935P().m94651a().mo33435W9() && NullChecker.m81303a(n3b0.m157732f()) && i == 0) {
                        m54251g();
                        return;
                    }
                    CoreLikers.C4719a c4719aM30471r5 = CoreModule.f17545c.f19687u0.m30471r5();
                    User userM30483v5 = CoreModule.f17545c.f19687u0.m30483v5();
                    boolean zMo33608vb = CoreModule.m29935P().m94651a().mo33608vb(userM30483v5, c4719aM30471r5);
                    VText vText = this.f35054c;
                    if (zMo33608vb) {
                        vText.setText(CoreModule.m29935P().m94651a().mo33630yl(userM30483v5));
                        return;
                    } else {
                        vText.setText(c8e0.m105784e(c4719aM30471r5 != null ? c4719aM30471r5.f19270b : 0));
                        return;
                    }
                }
                if (CoreModule.m29935P().m94651a().mo33435W9() && NullChecker.m81303a(n3b0.m157732f()) && i == 0) {
                    SvipDlgSeeAnimLayout svipDlgSeeAnimLayout = (SvipDlgSeeAnimLayout) o7r.m163037a(getContext()).inflate(m6c0.f131552X2, (ViewGroup) this.f35052a, false);
                    this.f35058g = svipDlgSeeAnimLayout;
                    svipDlgSeeAnimLayout.m54320d(n3b0.m157732f());
                    FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams8.gravity = 17;
                    this.f35052a.addView(this.f35058g, layoutParams8);
                    ((ViewGroup.MarginLayoutParams) this.f35052a.getLayoutParams()).topMargin = 0;
                    m54251g();
                    return;
                }
                ExplodeLayout explodeLayout = (ExplodeLayout) o7r.m163037a(getContext()).inflate(m6c0.f131504L2, (ViewGroup) this.f35052a, false);
                this.f35056e = explodeLayout;
                explodeLayout.setScale(0.8f);
                FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams9.gravity = 17;
                this.f35052a.addView(this.f35056e, layoutParams9);
                CoreLikers.C4719a c4719aM30471r6 = CoreModule.f17545c.f19687u0.m30471r5();
                User userM30483v6 = CoreModule.f17545c.f19687u0.m30483v5();
                boolean zMo33608vb2 = CoreModule.m29935P().m94651a().mo33608vb(userM30483v6, c4719aM30471r6);
                VText vText2 = this.f35054c;
                if (zMo33608vb2) {
                    vText2.setText(CoreModule.m29935P().m94651a().mo33630yl(userM30483v6));
                    return;
                } else {
                    vText2.setText(c8e0.m105784e(c4719aM30471r6 != null ? c4719aM30471r6.f19270b : 0));
                    return;
                }
            case 8:
                this.f35053b.setText(wx80Var.m205968t());
                this.f35054c.setText(wx80Var.m205948d());
                if (g6a.m124559h() && sab0.m182899q(purchaseType)) {
                    PrivilegeImageContainerView privilegeImageContainerView2 = (PrivilegeImageContainerView) o7r.m163037a(getContext()).inflate(m6c0.f131486H0, (ViewGroup) this.f35052a, false);
                    privilegeImageContainerView2.m54241c(wx80Var, purchaseType);
                    FrameLayout.LayoutParams layoutParams10 = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams10.gravity = 16;
                    this.f35052a.addView(privilegeImageContainerView2, layoutParams10);
                    return;
                }
                if (sab0.m182891i(purchaseType) || sab0.m182892j(purchaseType)) {
                    View viewM54249e2 = m54249e(this.f35055d);
                    FrameLayout.LayoutParams layoutParams11 = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams11.gravity = 16;
                    this.f35052a.addView(viewM54249e2, layoutParams11);
                    return;
                }
                this.f35057f = new QuickChatPrivilegeAnimView(getContext());
                FrameLayout.LayoutParams layoutParams12 = new FrameLayout.LayoutParams(-1, -2);
                layoutParams12.gravity = 16;
                this.f35052a.addView(this.f35057f, layoutParams12);
                return;
            case 9:
                this.f35053b.setText(wx80Var.m205968t());
                this.f35054c.setText(wx80Var.m205948d());
                AudioMatchPrivilegeView audioMatchPrivilegeView = (AudioMatchPrivilegeView) o7r.m163037a(getContext()).inflate(m6c0.f131644s2, (ViewGroup) null);
                this.f35060i = audioMatchPrivilegeView;
                audioMatchPrivilegeView.m54214i0(purchaseType);
                FrameLayout.LayoutParams layoutParams13 = new FrameLayout.LayoutParams(-1, -2);
                layoutParams13.gravity = 16;
                this.f35052a.addView(this.f35060i, layoutParams13);
                return;
            case 10:
                this.f35053b.setText(wx80Var.m205968t());
                PrivilegeLetterView privilegeLetterView = (PrivilegeLetterView) o7r.m163037a(getContext()).inflate(m6c0.f131498K0, (ViewGroup) this.f35052a, false);
                privilegeLetterView.m54261b();
                FrameLayout.LayoutParams layoutParams14 = new FrameLayout.LayoutParams(-1, -2);
                layoutParams14.gravity = 16;
                this.f35052a.addView(privilegeLetterView, layoutParams14);
                this.f35054c.setText(wx80Var.m205948d());
                return;
            case 11:
            case 12:
            case 13:
            case 14:
                Privilege privilege = this.f35055d;
                Privilege privilege2 = Privilege.leave_message;
                VText vText3 = this.f35053b;
                if (privilege == privilege2) {
                    vText3.setText("每天5条资料留言");
                } else {
                    vText3.setText(wx80Var.m205968t());
                }
                ImageView imageView = new ImageView(getContext());
                imageView.setImageResource(wx80Var.m205958j());
                imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                FrameLayout.LayoutParams layoutParams15 = new FrameLayout.LayoutParams(-1, -2);
                layoutParams15.gravity = 16;
                this.f35052a.addView(imageView, layoutParams15);
                this.f35054c.setText(wx80Var.m205948d());
                return;
            case 15:
                this.f35053b.setText(wx80Var.m205968t());
                if (g6a.m124569r()) {
                    PrivilegeSVGAContainerView privilegeSVGAContainerView2 = (PrivilegeSVGAContainerView) o7r.m163037a(getContext()).inflate(m6c0.f131522Q0, (ViewGroup) this.f35052a, false);
                    this.f35061j = privilegeSVGAContainerView2;
                    privilegeSVGAContainerView2.m54269b(wx80Var, purchaseType);
                    FrameLayout.LayoutParams layoutParams16 = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams16.gravity = 16;
                    this.f35052a.addView(this.f35061j, layoutParams16);
                } else {
                    PrivilegeImageContainerView privilegeImageContainerView3 = (PrivilegeImageContainerView) o7r.m163037a(getContext()).inflate(m6c0.f131486H0, (ViewGroup) this.f35052a, false);
                    privilegeImageContainerView3.m54240b(wx80Var, purchaseType);
                    FrameLayout.LayoutParams layoutParams17 = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams17.gravity = 16;
                    this.f35052a.addView(privilegeImageContainerView3, layoutParams17);
                }
                this.f35054c.setText(wx80Var.m205948d());
                return;
            case 16:
                if (g6a.m124559h() && (sab0.m182891i(purchaseType) || sab0.m182892j(purchaseType))) {
                    this.f35053b.setText(wx80Var.m205968t());
                    this.f35054c.setText(wx80Var.m205948d());
                    PrivilegeSVGAContainerView privilegeSVGAContainerView3 = (PrivilegeSVGAContainerView) o7r.m163037a(getContext()).inflate(m6c0.f131522Q0, (ViewGroup) this.f35052a, false);
                    this.f35063l = privilegeSVGAContainerView3;
                    privilegeSVGAContainerView3.m54270c(wx80Var, purchaseType);
                    FrameLayout.LayoutParams layoutParams18 = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams18.gravity = 16;
                    this.f35052a.addView(this.f35063l, layoutParams18);
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
                this.f35053b.setText(wx80Var.m205968t());
                PrivilegeSVIPBadgeView privilegeSVIPBadgeView = (PrivilegeSVIPBadgeView) o7r.m163037a(getContext()).inflate(m6c0.f131526R0, (ViewGroup) this.f35052a, false);
                privilegeSVIPBadgeView.m54275b(purchaseType);
                FrameLayout.LayoutParams layoutParams19 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams19.gravity = 16;
                this.f35052a.addView(privilegeSVIPBadgeView, layoutParams19);
                this.f35054c.setText(wx80Var.m205948d());
                return;
            case 42:
                this.f35053b.setText(wx80Var.m205968t());
                this.f35054c.setText(wx80Var.m205948d());
                PrivilegeODiamondSkin privilegeODiamondSkin = (PrivilegeODiamondSkin) o7r.m163037a(getContext()).inflate(m6c0.f131510N0, (ViewGroup) this.f35052a, false);
                privilegeODiamondSkin.m54267b();
                FrameLayout.LayoutParams layoutParams20 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams20.gravity = 16;
                this.f35052a.addView(privilegeODiamondSkin, layoutParams20);
                return;
            case 43:
                this.f35053b.setText(wx80Var.m205968t());
                this.f35054c.setText(wx80Var.m205948d());
                View viewM54249e3 = m54249e(this.f35055d);
                FrameLayout.LayoutParams layoutParams21 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams21.gravity = 16;
                this.f35052a.addView(viewM54249e3, layoutParams21);
                return;
            case 44:
                this.f35053b.setText(wx80Var.m205968t());
                this.f35054c.setText(wx80Var.m205948d());
                PrivilegeODiamondService privilegeODiamondService = (PrivilegeODiamondService) o7r.m163037a(getContext()).inflate(m6c0.f131506M0, (ViewGroup) this.f35052a, false);
                privilegeODiamondService.m54265b();
                FrameLayout.LayoutParams layoutParams22 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams22.gravity = 16;
                this.f35052a.addView(privilegeODiamondService, layoutParams22);
                return;
            case 45:
                this.f35053b.setText(wx80Var.m205968t());
                this.f35054c.setText(wx80Var.m205948d());
                View viewM54250f = m54250f(Privilege.say_hi_pkg);
                FrameLayout.LayoutParams layoutParams23 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams23.gravity = 16;
                this.f35052a.addView(viewM54250f, layoutParams23);
                return;
            case 46:
                this.f35053b.setText(wx80Var.m205968t());
                this.f35054c.setText(wx80Var.m205948d());
                SVGAnimationView sVGAnimationView = new SVGAnimationView(getContext());
                SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/5b7b48e6-7289-4204-acc9-eb6b424938fa14.so").repeatCount(-1).into(sVGAnimationView);
                FrameLayout.LayoutParams layoutParams24 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams24.gravity = 16;
                this.f35052a.addView(sVGAnimationView, layoutParams24);
                sVGAnimationView.startAnimation();
                return;
            case 47:
                PurchaseDlgItemVisitorHideFootPrint purchaseDlgItemVisitorHideFootPrint = (PurchaseDlgItemVisitorHideFootPrint) LayoutInflater.from(getContext()).inflate(m6c0.f131598h1, (ViewGroup) this.f35052a, false);
                purchaseDlgItemVisitorHideFootPrint.m54293b();
                FrameLayout.LayoutParams layoutParams25 = new FrameLayout.LayoutParams(-1, t100.m186890d(110.0f));
                layoutParams25.gravity = 16;
                this.f35052a.addView(purchaseDlgItemVisitorHideFootPrint, layoutParams25);
                this.f35053b.setText(wx80Var.m205968t());
                this.f35054c.setText(wx80Var.m205948d());
                return;
            case 48:
                this.f35053b.setText(wx80Var.m205968t());
                this.f35054c.setText(wx80Var.m205948d());
                View viewM54250f2 = m54250f(Privilege.confession_first);
                FrameLayout.LayoutParams layoutParams26 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams26.gravity = 16;
                this.f35052a.addView(viewM54250f2, layoutParams26);
                return;
            case 49:
                this.f35053b.setText(wx80Var.m205968t());
                this.f35054c.setText(wx80Var.m205948d());
                PurchaseDlgItemHideMeFromNearby purchaseDlgItemHideMeFromNearby = (PurchaseDlgItemHideMeFromNearby) LayoutInflater.from(getContext()).inflate(m6c0.f131588f1, (ViewGroup) this.f35052a, false);
                purchaseDlgItemHideMeFromNearby.m54289b();
                FrameLayout.LayoutParams layoutParams27 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams27.gravity = 16;
                this.f35052a.addView(purchaseDlgItemHideMeFromNearby, layoutParams27);
                return;
            default:
                return;
        }
        this.f35053b.setText(wx80Var.m205968t());
        PrivilegeImageContainerView privilegeImageContainerView4 = (PrivilegeImageContainerView) o7r.m163037a(getContext()).inflate(m6c0.f131486H0, (ViewGroup) this.f35052a, false);
        privilegeImageContainerView4.m54240b(wx80Var, purchaseType);
        FrameLayout.LayoutParams layoutParams28 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams28.gravity = 16;
        this.f35052a.addView(privilegeImageContainerView4, layoutParams28);
        this.f35054c.setText(wx80Var.m205948d());
    }

    /* JADX INFO: renamed from: e */
    public final View m54249e(Privilege privilege) {
        PrivilegeODiamondMatchView privilegeODiamondMatchView = (PrivilegeODiamondMatchView) o7r.m163037a(getContext()).inflate(m6c0.f131502L0, (ViewGroup) this.f35052a, false);
        privilegeODiamondMatchView.m54263b(privilege);
        return privilegeODiamondMatchView;
    }

    /* JADX INFO: renamed from: f */
    public final View m54250f(Privilege privilege) {
        PurchaseDlgItemSVipSayHiView purchaseDlgItemSVipSayHiView = (PurchaseDlgItemSVipSayHiView) LayoutInflater.from(getContext()).inflate(m6c0.f131593g1, (ViewGroup) this.f35052a, false);
        purchaseDlgItemSVipSayHiView.m54291b(privilege);
        return purchaseDlgItemSVipSayHiView;
    }

    /* JADX INFO: renamed from: g */
    public final void m54251g() {
        User userM157732f = n3b0.m157732f();
        if (!NullChecker.m81303a(userM157732f)) {
            CoreLikers.C4719a c4719aM30471r5 = CoreModule.f17545c.f19687u0.m30471r5();
            this.f35054c.setText(c8e0.m105784e(c4719aM30471r5 == null ? 0 : c4719aM30471r5.f19270b));
            return;
        }
        String string = getContext().getString(R$string.f27516l7, userM157732f.age.intValue() > 30 ? "30+" : userM157732f.age);
        j760<String, String> j760VarMo33557oi = CoreModule.m29935P().m94651a().mo33557oi(userM157732f.location.distance);
        String str = j760VarMo33557oi.f116564a + j760VarMo33557oi.f116565b;
        String string2 = getContext().getString(userM157732f.isFemale() ? R$string.f27587r7 : R$string.f27576q7, string, str);
        SpannableString spannableString = new SpannableString(string2);
        CoreModule.m29935P().m94651a().mo33364Lp(spannableString, string2, string, String.valueOf(userM157732f.age).length(), t100.m186892f(13), t100.m186892f(13), Color.parseColor("#ffe8aa"));
        CoreModule.m29935P().m94651a().mo33364Lp(spannableString, string2, str, j760VarMo33557oi.f116564a.length(), t100.m186892f(13), t100.m186892f(13), Color.parseColor("#ffe8aa"));
        this.f35054c.setText(spannableString);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mkd0.m154992z(this.f35059h);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m54245a(this);
        this.f35053b.getPaint().setFakeBoldText(true);
    }

    public PrivilegeItemIntroOutstanding(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeItemIntroOutstanding(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
