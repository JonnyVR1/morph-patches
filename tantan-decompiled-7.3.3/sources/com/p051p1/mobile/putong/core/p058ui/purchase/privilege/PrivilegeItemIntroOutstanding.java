package com.p051p1.mobile.putong.core.p058ui.purchase.privilege;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreLikers;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.data.User;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import p151v.VText;
import p153l.a690;
import p153l.ce90;
import p153l.h9c0;
import p153l.hge0;
import p153l.kcg0;
import p153l.lyh0;
import p153l.p9r;
import p153l.pf60;
import p153l.psd0;
import p153l.qa00;
import p153l.rbb0;
import p153l.rec0;
import p153l.s7a;
import p153l.wib0;

/* JADX INFO: loaded from: classes12.dex */
public class PrivilegeItemIntroOutstanding extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public FrameLayout f35900a;

    /* JADX INFO: renamed from: b */
    public VText f35901b;

    /* JADX INFO: renamed from: c */
    public VText f35902c;

    /* JADX INFO: renamed from: d */
    public Privilege f35903d;

    /* JADX INFO: renamed from: e */
    public ExplodeLayout f35904e;

    /* JADX INFO: renamed from: f */
    public QuickChatPrivilegeAnimView f35905f;

    /* JADX INFO: renamed from: g */
    public SvipDlgSeeAnimLayout f35906g;

    /* JADX INFO: renamed from: h */
    public kcg0 f35907h;

    /* JADX INFO: renamed from: i */
    public AudioMatchPrivilegeView f35908i;

    /* JADX INFO: renamed from: j */
    public PrivilegeSVGAContainerView f35909j;

    /* JADX INFO: renamed from: k */
    public PrivilegeSVGAContainerView f35910k;

    /* JADX INFO: renamed from: l */
    public PrivilegeSVGAContainerView f35911l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.privilege.PrivilegeItemIntroOutstanding$a */
    public static /* synthetic */ class C8957a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f35912a;

        static {
            int[] iArr = new int[Privilege.values().length];
            f35912a = iArr;
            try {
                iArr[Privilege.vip_badge.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35912a[Privilege.vip_undo.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35912a[Privilege.vip_unlimited_likes.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35912a[Privilege.vip_super_like.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f35912a[Privilege.vip_independent_super_like.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f35912a[Privilege.youth_superlike.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f35912a[Privilege.see_who_likes_me.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f35912a[Privilege.online_match_tickets.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f35912a[Privilege.voice_quick_chat.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f35912a[Privilege.letter.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f35912a[Privilege.greet.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f35912a[Privilege.vip_greet.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f35912a[Privilege.svip_greet.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f35912a[Privilege.leave_message.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f35912a[Privilege.top_like.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f35912a[Privilege.immediately_match.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f35912a[Privilege.nearby_people.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f35912a[Privilege.top_chat.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f35912a[Privilege.vip_location.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f35912a[Privilege.message_read_state.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f35912a[Privilege.privacy_membership.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f35912a[Privilege.advanced_filter.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f35912a[Privilege.recover_unmatches.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f35912a[Privilege.liked_user.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f35912a[Privilege.boost.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f35912a[Privilege.svipPicksMembership.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f35912a[Privilege.picksMembership.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f35912a[Privilege.oDiamondSvipExtra.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f35912a[Privilege.oDiamondVisitor.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                f35912a[Privilege.moment_boost.ordinal()] = 30;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                f35912a[Privilege.live_entry_animation.ordinal()] = 31;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                f35912a[Privilege.unlock_learn_about_him_module.ordinal()] = 32;
            } catch (NoSuchFieldError unused32) {
            }
            try {
                f35912a[Privilege.ads_not_disturb.ordinal()] = 33;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                f35912a[Privilege.block_harassing_words.ordinal()] = 34;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                f35912a[Privilege.pick_tantan_credits_users.ordinal()] = 35;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                f35912a[Privilege.youth_roaming.ordinal()] = 36;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                f35912a[Privilege.youth_find_partner.ordinal()] = 37;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                f35912a[Privilege.youth_blind_box.ordinal()] = 38;
            } catch (NoSuchFieldError unused38) {
            }
            try {
                f35912a[Privilege.youth_message_read.ordinal()] = 39;
            } catch (NoSuchFieldError unused39) {
            }
            try {
                f35912a[Privilege.private_custom.ordinal()] = 40;
            } catch (NoSuchFieldError unused40) {
            }
            try {
                f35912a[Privilege.svip_badge.ordinal()] = 41;
            } catch (NoSuchFieldError unused41) {
            }
            try {
                f35912a[Privilege.oDiamondSvipSkin.ordinal()] = 42;
            } catch (NoSuchFieldError unused42) {
            }
            try {
                f35912a[Privilege.oDiamondGreetings.ordinal()] = 43;
            } catch (NoSuchFieldError unused43) {
            }
            try {
                f35912a[Privilege.customer_service.ordinal()] = 44;
            } catch (NoSuchFieldError unused44) {
            }
            try {
                f35912a[Privilege.say_hi_pkg.ordinal()] = 45;
            } catch (NoSuchFieldError unused45) {
            }
            try {
                f35912a[Privilege.accelerate_pairing.ordinal()] = 46;
            } catch (NoSuchFieldError unused46) {
            }
            try {
                f35912a[Privilege.visitor_hide_footprint.ordinal()] = 47;
            } catch (NoSuchFieldError unused47) {
            }
            try {
                f35912a[Privilege.confession_first.ordinal()] = 48;
            } catch (NoSuchFieldError unused48) {
            }
            try {
                f35912a[Privilege.hide_me_from_nearby.ordinal()] = 49;
            } catch (NoSuchFieldError unused49) {
            }
        }
    }

    public PrivilegeItemIntroOutstanding(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m55428a(View view) {
        ce90.m109343a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final Act m55429b() {
        return (Act) getContext();
    }

    /* JADX INFO: renamed from: c */
    public void m55430c() {
        Privilege privilege = this.f35903d;
        Privilege privilege2 = Privilege.see_who_likes_me;
        if (privilege == privilege2 && NullChecker.m82486a(this.f35904e)) {
            this.f35904e.m55411l(true);
            return;
        }
        if (this.f35903d == Privilege.online_match_tickets && NullChecker.m82486a(this.f35905f)) {
            this.f35905f.m55492t0();
            return;
        }
        if (this.f35903d == privilege2 && NullChecker.m82486a(this.f35906g)) {
            this.f35906g.m55506l0();
            return;
        }
        if (this.f35903d == Privilege.voice_quick_chat && NullChecker.m82486a(this.f35908i)) {
            this.f35908i.m55399m0();
            return;
        }
        if (this.f35903d == Privilege.top_like && NullChecker.m82486a(this.f35909j)) {
            this.f35909j.m55456f();
            return;
        }
        if (this.f35903d == privilege2 && NullChecker.m82486a(this.f35910k)) {
            this.f35910k.m55456f();
        } else if (this.f35903d == Privilege.immediately_match && NullChecker.m82486a(this.f35911l)) {
            this.f35911l.m55456f();
        }
    }

    /* JADX INFO: renamed from: d */
    public void m55431d(a690 a690Var, int i, PurchaseType purchaseType) {
        if (wib0.m206565i(purchaseType) || wib0.m206572p(purchaseType) || wib0.m206566j(purchaseType)) {
            this.f35901b.setTextColor(m55429b().color(h9c0.f108401x));
            this.f35902c.setTextColor(m55429b().color(h9c0.f108402y));
        }
        this.f35901b.setTypeface(lyh0.m156283c(3));
        Privilege privilegeM96306l = a690Var.m96306l();
        this.f35903d = privilegeM96306l;
        if (privilegeM96306l == null) {
            this.f35901b.setText(a690Var.m96314t());
            PrivilegeImageContainerView privilegeImageContainerView = (PrivilegeImageContainerView) p9r.m171370a(getContext()).inflate(rec0.f162446H0, (ViewGroup) this.f35900a, false);
            privilegeImageContainerView.m55423b(a690Var, purchaseType);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
            layoutParams.gravity = 16;
            this.f35900a.addView(privilegeImageContainerView, layoutParams);
            this.f35902c.setText(a690Var.m96294d());
            return;
        }
        switch (C8957a.f35912a[privilegeM96306l.ordinal()]) {
            case 1:
                this.f35901b.setText(a690Var.m96314t());
                PrivilegeVIPBadgeView privilegeVIPBadgeView = (PrivilegeVIPBadgeView) p9r.m171370a(getContext()).inflate(rec0.f162502V0, (ViewGroup) this.f35900a, false);
                privilegeVIPBadgeView.m55470b();
                FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams2.gravity = 16;
                this.f35900a.addView(privilegeVIPBadgeView, layoutParams2);
                this.f35902c.setText(a690Var.m96294d());
                return;
            case 2:
                this.f35901b.setText(a690Var.m96314t());
                PrivilegeUndoView privilegeUndoView = (PrivilegeUndoView) p9r.m171370a(getContext()).inflate(rec0.f162490S0, (ViewGroup) this.f35900a, false);
                privilegeUndoView.m55466b();
                FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams3.gravity = 16;
                this.f35900a.addView(privilegeUndoView, layoutParams3);
                this.f35902c.setText(a690Var.m96294d());
                return;
            case 3:
                this.f35901b.setText(a690Var.m96314t());
                PrivilegeUnLimitLikeView privilegeUnLimitLikeView = (PrivilegeUnLimitLikeView) p9r.m171370a(getContext()).inflate(rec0.f162494T0, (ViewGroup) this.f35900a, false);
                privilegeUnLimitLikeView.m55464b();
                FrameLayout.LayoutParams layoutParams4 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams4.gravity = 16;
                this.f35900a.addView(privilegeUnLimitLikeView, layoutParams4);
                this.f35902c.setText(a690Var.m96294d());
                return;
            case 4:
            case 5:
            case 6:
                this.f35901b.setText(a690Var.m96314t());
                this.f35902c.setText(a690Var.m96294d());
                if (!wib0.m206565i(purchaseType) && !wib0.m206566j(purchaseType)) {
                    PrivilegeSuperLikeView privilegeSuperLikeView = (PrivilegeSuperLikeView) p9r.m171370a(getContext()).inflate(rec0.f162478P0, (ViewGroup) this.f35900a, false);
                    privilegeSuperLikeView.m55462b();
                    FrameLayout.LayoutParams layoutParams5 = new FrameLayout.LayoutParams(-1, -2);
                    layoutParams5.gravity = 16;
                    this.f35900a.addView(privilegeSuperLikeView, layoutParams5);
                    return;
                }
                View viewM55432e = m55432e(this.f35903d);
                FrameLayout.LayoutParams layoutParams6 = new FrameLayout.LayoutParams(-1, -2);
                layoutParams6.topMargin = 0;
                layoutParams6.bottomMargin = 0;
                layoutParams6.gravity = 17;
                this.f35900a.addView(viewM55432e, layoutParams6);
                return;
            case 7:
                this.f35901b.setText(getContext().getString(R$string.f28376m7));
                if (s7a.m184979h() && wib0.m206573q(purchaseType)) {
                    PrivilegeSVGAContainerView privilegeSVGAContainerView = (PrivilegeSVGAContainerView) p9r.m171370a(getContext()).inflate(rec0.f162482Q0, (ViewGroup) this.f35900a, false);
                    this.f35910k = privilegeSVGAContainerView;
                    privilegeSVGAContainerView.m55454d(a690Var, purchaseType);
                    FrameLayout.LayoutParams layoutParams7 = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams7.gravity = 16;
                    this.f35900a.addView(this.f35910k, layoutParams7);
                    if (CoreModule.m30933P().m143405a().mo34438W9() && NullChecker.m82486a(rbb0.m180734f()) && i == 0) {
                        m55434g();
                        return;
                    }
                    CoreLikers.C4870a c4870aM31479t5 = CoreModule.f18264c.f20429u0.m31479t5();
                    User userM31491x5 = CoreModule.f18264c.f20429u0.m31491x5();
                    boolean zMo34611vb = CoreModule.m30933P().m143405a().mo34611vb(userM31491x5, c4870aM31479t5);
                    VText vText = this.f35902c;
                    if (zMo34611vb) {
                        vText.setText(CoreModule.m30933P().m143405a().mo34633yl(userM31491x5));
                        return;
                    } else {
                        vText.setText(hge0.m134921e(c4870aM31479t5 != null ? c4870aM31479t5.f20012b : 0));
                        return;
                    }
                }
                if (CoreModule.m30933P().m143405a().mo34438W9() && NullChecker.m82486a(rbb0.m180734f()) && i == 0) {
                    SvipDlgSeeAnimLayout svipDlgSeeAnimLayout = (SvipDlgSeeAnimLayout) p9r.m171370a(getContext()).inflate(rec0.f162512X2, (ViewGroup) this.f35900a, false);
                    this.f35906g = svipDlgSeeAnimLayout;
                    svipDlgSeeAnimLayout.m55503d(rbb0.m180734f());
                    FrameLayout.LayoutParams layoutParams8 = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams8.gravity = 17;
                    this.f35900a.addView(this.f35906g, layoutParams8);
                    ((ViewGroup.MarginLayoutParams) this.f35900a.getLayoutParams()).topMargin = 0;
                    m55434g();
                    return;
                }
                ExplodeLayout explodeLayout = (ExplodeLayout) p9r.m171370a(getContext()).inflate(rec0.f162464L2, (ViewGroup) this.f35900a, false);
                this.f35904e = explodeLayout;
                explodeLayout.setScale(0.8f);
                FrameLayout.LayoutParams layoutParams9 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams9.gravity = 17;
                this.f35900a.addView(this.f35904e, layoutParams9);
                CoreLikers.C4870a c4870aM31479t6 = CoreModule.f18264c.f20429u0.m31479t5();
                User userM31491x6 = CoreModule.f18264c.f20429u0.m31491x5();
                boolean zMo34611vb2 = CoreModule.m30933P().m143405a().mo34611vb(userM31491x6, c4870aM31479t6);
                VText vText2 = this.f35902c;
                if (zMo34611vb2) {
                    vText2.setText(CoreModule.m30933P().m143405a().mo34633yl(userM31491x6));
                    return;
                } else {
                    vText2.setText(hge0.m134921e(c4870aM31479t6 != null ? c4870aM31479t6.f20012b : 0));
                    return;
                }
            case 8:
                this.f35901b.setText(a690Var.m96314t());
                this.f35902c.setText(a690Var.m96294d());
                if (s7a.m184979h() && wib0.m206573q(purchaseType)) {
                    PrivilegeImageContainerView privilegeImageContainerView2 = (PrivilegeImageContainerView) p9r.m171370a(getContext()).inflate(rec0.f162446H0, (ViewGroup) this.f35900a, false);
                    privilegeImageContainerView2.m55424c(a690Var, purchaseType);
                    FrameLayout.LayoutParams layoutParams10 = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams10.gravity = 16;
                    this.f35900a.addView(privilegeImageContainerView2, layoutParams10);
                    return;
                }
                if (wib0.m206565i(purchaseType) || wib0.m206566j(purchaseType)) {
                    View viewM55432e2 = m55432e(this.f35903d);
                    FrameLayout.LayoutParams layoutParams11 = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams11.gravity = 16;
                    this.f35900a.addView(viewM55432e2, layoutParams11);
                    return;
                }
                this.f35905f = new QuickChatPrivilegeAnimView(getContext());
                FrameLayout.LayoutParams layoutParams12 = new FrameLayout.LayoutParams(-1, -2);
                layoutParams12.gravity = 16;
                this.f35900a.addView(this.f35905f, layoutParams12);
                return;
            case 9:
                this.f35901b.setText(a690Var.m96314t());
                this.f35902c.setText(a690Var.m96294d());
                AudioMatchPrivilegeView audioMatchPrivilegeView = (AudioMatchPrivilegeView) p9r.m171370a(getContext()).inflate(rec0.f162604s2, (ViewGroup) null);
                this.f35908i = audioMatchPrivilegeView;
                audioMatchPrivilegeView.m55397i0(purchaseType);
                FrameLayout.LayoutParams layoutParams13 = new FrameLayout.LayoutParams(-1, -2);
                layoutParams13.gravity = 16;
                this.f35900a.addView(this.f35908i, layoutParams13);
                return;
            case 10:
                this.f35901b.setText(a690Var.m96314t());
                PrivilegeLetterView privilegeLetterView = (PrivilegeLetterView) p9r.m171370a(getContext()).inflate(rec0.f162458K0, (ViewGroup) this.f35900a, false);
                privilegeLetterView.m55444b();
                FrameLayout.LayoutParams layoutParams14 = new FrameLayout.LayoutParams(-1, -2);
                layoutParams14.gravity = 16;
                this.f35900a.addView(privilegeLetterView, layoutParams14);
                this.f35902c.setText(a690Var.m96294d());
                return;
            case 11:
            case 12:
            case 13:
            case 14:
                Privilege privilege = this.f35903d;
                Privilege privilege2 = Privilege.leave_message;
                VText vText3 = this.f35901b;
                if (privilege == privilege2) {
                    vText3.setText("每天5条资料留言");
                } else {
                    vText3.setText(a690Var.m96314t());
                }
                ImageView imageView = new ImageView(getContext());
                imageView.setImageResource(a690Var.m96304j());
                imageView.setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                FrameLayout.LayoutParams layoutParams15 = new FrameLayout.LayoutParams(-1, -2);
                layoutParams15.gravity = 16;
                this.f35900a.addView(imageView, layoutParams15);
                this.f35902c.setText(a690Var.m96294d());
                return;
            case 15:
                this.f35901b.setText(a690Var.m96314t());
                if (s7a.m184989r()) {
                    PrivilegeSVGAContainerView privilegeSVGAContainerView2 = (PrivilegeSVGAContainerView) p9r.m171370a(getContext()).inflate(rec0.f162482Q0, (ViewGroup) this.f35900a, false);
                    this.f35909j = privilegeSVGAContainerView2;
                    privilegeSVGAContainerView2.m55452b(a690Var, purchaseType);
                    FrameLayout.LayoutParams layoutParams16 = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams16.gravity = 16;
                    this.f35900a.addView(this.f35909j, layoutParams16);
                } else {
                    PrivilegeImageContainerView privilegeImageContainerView3 = (PrivilegeImageContainerView) p9r.m171370a(getContext()).inflate(rec0.f162446H0, (ViewGroup) this.f35900a, false);
                    privilegeImageContainerView3.m55423b(a690Var, purchaseType);
                    FrameLayout.LayoutParams layoutParams17 = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams17.gravity = 16;
                    this.f35900a.addView(privilegeImageContainerView3, layoutParams17);
                }
                this.f35902c.setText(a690Var.m96294d());
                return;
            case 16:
                if (s7a.m184979h() && (wib0.m206565i(purchaseType) || wib0.m206566j(purchaseType))) {
                    this.f35901b.setText(a690Var.m96314t());
                    this.f35902c.setText(a690Var.m96294d());
                    PrivilegeSVGAContainerView privilegeSVGAContainerView3 = (PrivilegeSVGAContainerView) p9r.m171370a(getContext()).inflate(rec0.f162482Q0, (ViewGroup) this.f35900a, false);
                    this.f35911l = privilegeSVGAContainerView3;
                    privilegeSVGAContainerView3.m55453c(a690Var, purchaseType);
                    FrameLayout.LayoutParams layoutParams18 = new FrameLayout.LayoutParams(-1, -1);
                    layoutParams18.gravity = 16;
                    this.f35900a.addView(this.f35911l, layoutParams18);
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
                this.f35901b.setText(a690Var.m96314t());
                PrivilegeSVIPBadgeView privilegeSVIPBadgeView = (PrivilegeSVIPBadgeView) p9r.m171370a(getContext()).inflate(rec0.f162486R0, (ViewGroup) this.f35900a, false);
                privilegeSVIPBadgeView.m55458b(purchaseType);
                FrameLayout.LayoutParams layoutParams19 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams19.gravity = 16;
                this.f35900a.addView(privilegeSVIPBadgeView, layoutParams19);
                this.f35902c.setText(a690Var.m96294d());
                return;
            case 42:
                this.f35901b.setText(a690Var.m96314t());
                this.f35902c.setText(a690Var.m96294d());
                PrivilegeODiamondSkin privilegeODiamondSkin = (PrivilegeODiamondSkin) p9r.m171370a(getContext()).inflate(rec0.f162470N0, (ViewGroup) this.f35900a, false);
                privilegeODiamondSkin.m55450b();
                FrameLayout.LayoutParams layoutParams20 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams20.gravity = 16;
                this.f35900a.addView(privilegeODiamondSkin, layoutParams20);
                return;
            case 43:
                this.f35901b.setText(a690Var.m96314t());
                this.f35902c.setText(a690Var.m96294d());
                View viewM55432e3 = m55432e(this.f35903d);
                FrameLayout.LayoutParams layoutParams21 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams21.gravity = 16;
                this.f35900a.addView(viewM55432e3, layoutParams21);
                return;
            case 44:
                this.f35901b.setText(a690Var.m96314t());
                this.f35902c.setText(a690Var.m96294d());
                PrivilegeODiamondService privilegeODiamondService = (PrivilegeODiamondService) p9r.m171370a(getContext()).inflate(rec0.f162466M0, (ViewGroup) this.f35900a, false);
                privilegeODiamondService.m55448b();
                FrameLayout.LayoutParams layoutParams22 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams22.gravity = 16;
                this.f35900a.addView(privilegeODiamondService, layoutParams22);
                return;
            case 45:
                this.f35901b.setText(a690Var.m96314t());
                this.f35902c.setText(a690Var.m96294d());
                View viewM55433f = m55433f(Privilege.say_hi_pkg);
                FrameLayout.LayoutParams layoutParams23 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams23.gravity = 16;
                this.f35900a.addView(viewM55433f, layoutParams23);
                return;
            case 46:
                this.f35901b.setText(a690Var.m96314t());
                this.f35902c.setText(a690Var.m96294d());
                SVGAnimationView sVGAnimationView = new SVGAnimationView(getContext());
                SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/5b7b48e6-7289-4204-acc9-eb6b424938fa14.so").repeatCount(-1).into(sVGAnimationView);
                FrameLayout.LayoutParams layoutParams24 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams24.gravity = 16;
                this.f35900a.addView(sVGAnimationView, layoutParams24);
                sVGAnimationView.startAnimation();
                return;
            case 47:
                PurchaseDlgItemVisitorHideFootPrint purchaseDlgItemVisitorHideFootPrint = (PurchaseDlgItemVisitorHideFootPrint) LayoutInflater.from(getContext()).inflate(rec0.f162558h1, (ViewGroup) this.f35900a, false);
                purchaseDlgItemVisitorHideFootPrint.m55476b();
                FrameLayout.LayoutParams layoutParams25 = new FrameLayout.LayoutParams(-1, qa00.m175859d(110.0f));
                layoutParams25.gravity = 16;
                this.f35900a.addView(purchaseDlgItemVisitorHideFootPrint, layoutParams25);
                this.f35901b.setText(a690Var.m96314t());
                this.f35902c.setText(a690Var.m96294d());
                return;
            case 48:
                this.f35901b.setText(a690Var.m96314t());
                this.f35902c.setText(a690Var.m96294d());
                View viewM55433f2 = m55433f(Privilege.confession_first);
                FrameLayout.LayoutParams layoutParams26 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams26.gravity = 16;
                this.f35900a.addView(viewM55433f2, layoutParams26);
                return;
            case 49:
                this.f35901b.setText(a690Var.m96314t());
                this.f35902c.setText(a690Var.m96294d());
                PurchaseDlgItemHideMeFromNearby purchaseDlgItemHideMeFromNearby = (PurchaseDlgItemHideMeFromNearby) LayoutInflater.from(getContext()).inflate(rec0.f162548f1, (ViewGroup) this.f35900a, false);
                purchaseDlgItemHideMeFromNearby.m55472b();
                FrameLayout.LayoutParams layoutParams27 = new FrameLayout.LayoutParams(-1, -1);
                layoutParams27.gravity = 16;
                this.f35900a.addView(purchaseDlgItemHideMeFromNearby, layoutParams27);
                return;
            default:
                return;
        }
        this.f35901b.setText(a690Var.m96314t());
        PrivilegeImageContainerView privilegeImageContainerView4 = (PrivilegeImageContainerView) p9r.m171370a(getContext()).inflate(rec0.f162446H0, (ViewGroup) this.f35900a, false);
        privilegeImageContainerView4.m55423b(a690Var, purchaseType);
        FrameLayout.LayoutParams layoutParams28 = new FrameLayout.LayoutParams(-1, -1);
        layoutParams28.gravity = 16;
        this.f35900a.addView(privilegeImageContainerView4, layoutParams28);
        this.f35902c.setText(a690Var.m96294d());
    }

    /* JADX INFO: renamed from: e */
    public final View m55432e(Privilege privilege) {
        PrivilegeODiamondMatchView privilegeODiamondMatchView = (PrivilegeODiamondMatchView) p9r.m171370a(getContext()).inflate(rec0.f162462L0, (ViewGroup) this.f35900a, false);
        privilegeODiamondMatchView.m55446b(privilege);
        return privilegeODiamondMatchView;
    }

    /* JADX INFO: renamed from: f */
    public final View m55433f(Privilege privilege) {
        PurchaseDlgItemSVipSayHiView purchaseDlgItemSVipSayHiView = (PurchaseDlgItemSVipSayHiView) LayoutInflater.from(getContext()).inflate(rec0.f162553g1, (ViewGroup) this.f35900a, false);
        purchaseDlgItemSVipSayHiView.m55474b(privilege);
        return purchaseDlgItemSVipSayHiView;
    }

    /* JADX INFO: renamed from: g */
    public final void m55434g() {
        User userM180734f = rbb0.m180734f();
        if (!NullChecker.m82486a(userM180734f)) {
            CoreLikers.C4870a c4870aM31479t5 = CoreModule.f18264c.f20429u0.m31479t5();
            this.f35902c.setText(hge0.m134921e(c4870aM31479t5 == null ? 0 : c4870aM31479t5.f20012b));
            return;
        }
        String string = getContext().getString(R$string.f28364l7, userM180734f.age.intValue() > 30 ? "30+" : userM180734f.age);
        pf60<String, String> pf60VarMo34560oi = CoreModule.m30933P().m143405a().mo34560oi(userM180734f.location.distance);
        String str = pf60VarMo34560oi.f152156a + pf60VarMo34560oi.f152157b;
        String string2 = getContext().getString(userM180734f.isFemale() ? R$string.f28435r7 : R$string.f28424q7, string, str);
        SpannableString spannableString = new SpannableString(string2);
        CoreModule.m30933P().m143405a().mo34367Lp(spannableString, string2, string, String.valueOf(userM180734f.age).length(), qa00.m175861f(13), qa00.m175861f(13), Color.parseColor("#ffe8aa"));
        CoreModule.m30933P().m143405a().mo34367Lp(spannableString, string2, str, pf60VarMo34560oi.f152156a.length(), qa00.m175861f(13), qa00.m175861f(13), Color.parseColor("#ffe8aa"));
        this.f35902c.setText(spannableString);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        psd0.m173633z(this.f35907h);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m55428a(this);
        this.f35901b.getPaint().setFakeBoldText(true);
    }

    public PrivilegeItemIntroOutstanding(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeItemIntroOutstanding(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
