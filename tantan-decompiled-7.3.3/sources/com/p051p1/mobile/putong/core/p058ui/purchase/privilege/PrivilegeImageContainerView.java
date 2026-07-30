package com.p051p1.mobile.putong.core.p058ui.purchase.privilege;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import java.util.Locale;
import p153l.a690;
import p153l.ae90;
import p153l.c17;
import p153l.jbc0;
import p153l.s7a;
import p153l.wib0;

/* JADX INFO: loaded from: classes12.dex */
public class PrivilegeImageContainerView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public ImageView f35898a;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.privilege.PrivilegeImageContainerView$a */
    public static /* synthetic */ class C8956a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f35899a;

        static {
            int[] iArr = new int[Privilege.values().length];
            f35899a = iArr;
            try {
                iArr[Privilege.advanced_filter.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35899a[Privilege.message_read_state.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35899a[Privilege.privacy_membership.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35899a[Privilege.recover_unmatches.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f35899a[Privilege.vip_location.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f35899a[Privilege.youth_roaming.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f35899a[Privilege.liked_user.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f35899a[Privilege.boost.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f35899a[Privilege.see_theme_unlock_more.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f35899a[Privilege.see_theme_unlock_pop.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f35899a[Privilege.svipPicksMembership.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f35899a[Privilege.picksMembership.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f35899a[Privilege.oDiamondVisitor.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f35899a[Privilege.live_entry_animation.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f35899a[Privilege.nearby_people.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f35899a[Privilege.moment_boost.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f35899a[Privilege.oDiamondSvipExtra.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f35899a[Privilege.immediately_match.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f35899a[Privilege.top_chat.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f35899a[Privilege.top_like.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f35899a[Privilege.unlock_learn_about_him_module.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f35899a[Privilege.ads_not_disturb.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f35899a[Privilege.block_harassing_words.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f35899a[Privilege.pick_tantan_credits_users.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f35899a[Privilege.youth_find_partner.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f35899a[Privilege.youth_blind_box.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f35899a[Privilege.youth_message_read.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f35899a[Privilege.private_custom.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f35899a[Privilege.hide_me_from_nearby.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
        }
    }

    public PrivilegeImageContainerView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m55422a(View view) {
        ae90.m97234a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m55423b(a690 a690Var, PurchaseType purchaseType) {
        Privilege privilegeM96306l = a690Var.m96306l();
        if (privilegeM96306l == null) {
            this.f35898a.setImageResource(a690Var.m96304j());
        }
        switch (C8956a.f35899a[privilegeM96306l.ordinal()]) {
            case 1:
                m55427f(0, 0);
                if (!"en".equals(Locale.getDefault().getLanguage())) {
                    boolean zMo34634z1 = CoreModule.m30933P().m143405a().mo34634z1();
                    ImageView imageView = this.f35898a;
                    if (!zMo34634z1) {
                        imageView.setImageResource(jbc0.f119551dc);
                    } else {
                        imageView.setImageResource(jbc0.f119497a0);
                    }
                } else {
                    this.f35898a.setImageResource(jbc0.f119179C8);
                }
                break;
            case 2:
                m55427f(0, 0);
                this.f35898a.setImageResource(jbc0.f119593gc);
                break;
            case 3:
                m55427f(0, 0);
                int i = c17.m107528u0() ? jbc0.f119165B8 : jbc0.f119151A8;
                if (s7a.m184982k() && wib0.m206563g(purchaseType)) {
                    i = jbc0.f119379R;
                }
                this.f35898a.setImageResource(i);
                break;
            case 4:
                m55427f(0, 0);
                this.f35898a.setImageResource(c17.m107528u0() ? jbc0.f119621ic : jbc0.f119607hc);
                break;
            case 5:
            case 6:
                m55427f(0, 0);
                this.f35898a.setImageResource(jbc0.f119775tc);
                break;
            case 7:
                m55427f(0, 0);
                this.f35898a.setImageResource(c17.m107528u0() ? jbc0.f119401S8 : jbc0.f119388R8);
                break;
            case 8:
                if (wib0.m206565i(purchaseType) || wib0.m206566j(purchaseType)) {
                    this.f35898a.setImageResource(c17.m107528u0() ? jbc0.f119147A4 : jbc0.f119851z4);
                } else {
                    this.f35898a.setImageResource(c17.m107528u0() ? jbc0.f119365Pc : jbc0.f119351Oc);
                }
                m55427f(0, 0);
                break;
            case 9:
                m55427f(0, 0);
                this.f35898a.setImageResource(CoreModule.m30933P().m143405a().mo34494eg() ? jbc0.f119702o9 : jbc0.f119688n9);
                break;
            case 10:
                m55427f(0, 0);
                this.f35898a.setImageResource(CoreModule.m30933P().m143405a().mo34494eg() ? jbc0.f119730q9 : jbc0.f119716p9);
                break;
            case 11:
                m55427f(0, 0);
                this.f35898a.setImageResource(jbc0.f119316M5);
                break;
            case 12:
                if (wib0.m206565i(purchaseType) || wib0.m206566j(purchaseType)) {
                    m55427f(0, 0);
                    this.f35898a.setImageResource(c17.m107528u0() ? jbc0.f119343O4 : jbc0.f119329N4);
                } else {
                    m55427f(0, 0);
                    this.f35898a.setImageResource(c17.m107528u0() ? jbc0.f119302L5 : jbc0.f119288K5);
                }
                break;
            case 13:
                m55427f(0, 0);
                if (s7a.m184979h() && (wib0.m206565i(purchaseType) || wib0.m206566j(purchaseType))) {
                    this.f35898a.setImageResource(jbc0.f119628j5);
                } else {
                    this.f35898a.setImageResource(c17.m107528u0() ? jbc0.f119384R4 : jbc0.f119371Q4);
                }
                break;
            case 14:
                m55427f(0, 0);
                this.f35898a.setImageResource(c17.m107528u0() ? jbc0.f119539d0 : jbc0.f119525c0);
                break;
            case 15:
                m55427f(0, 0);
                break;
            case 16:
                if (wib0.m206565i(purchaseType) || wib0.m206566j(purchaseType)) {
                    m55427f(0, 0);
                    this.f35898a.setImageResource(c17.m107528u0() ? jbc0.f119315M4 : jbc0.f119301L4);
                } else {
                    m55427f(0, 0);
                    this.f35898a.setImageResource(c17.m107528u0() ? jbc0.f119651l0 : jbc0.f119637k0);
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
                m55427f(0, 0);
                this.f35898a.setImageResource(a690Var.m96304j());
                break;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m55424c(a690 a690Var, PurchaseType purchaseType) {
        m55427f(0, 0);
        this.f35898a.setImageResource(jbc0.f119855z8);
    }

    /* JADX INFO: renamed from: d */
    public void m55425d(a690 a690Var, PurchaseType purchaseType) {
        m55427f(0, 0);
        this.f35898a.setImageResource(jbc0.f119307La);
    }

    /* JADX INFO: renamed from: e */
    public void m55426e(a690 a690Var, PurchaseType purchaseType) {
        m55427f(0, 0);
        this.f35898a.setImageResource(jbc0.f119321Ma);
    }

    /* JADX INFO: renamed from: f */
    public final void m55427f(int i, int i2) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f35898a.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.bottomMargin = i2;
        this.f35898a.setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m55422a(this);
    }

    public PrivilegeImageContainerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeImageContainerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
