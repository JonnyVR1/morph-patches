package com.p000p1.mobile.putong.core.p004ui.purchase.privilege;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import java.util.Locale;
import l.d3c0;
import l.sab0;
import l.w590;
import l.zz6;
import p006l.g6a;
import p006l.wx80;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class PrivilegeImageContainerView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public ImageView f4831a;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.privilege.PrivilegeImageContainerView$a */
    public static /* synthetic */ class C0229a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f4832a;

        static {
            int[] iArr = new int[Privilege.values().length];
            f4832a = iArr;
            try {
                iArr[Privilege.advanced_filter.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4832a[Privilege.message_read_state.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4832a[Privilege.privacy_membership.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4832a[Privilege.recover_unmatches.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4832a[Privilege.vip_location.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4832a[Privilege.youth_roaming.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4832a[Privilege.liked_user.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f4832a[Privilege.boost.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4832a[Privilege.see_theme_unlock_more.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f4832a[Privilege.see_theme_unlock_pop.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f4832a[Privilege.svipPicksMembership.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f4832a[Privilege.picksMembership.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f4832a[Privilege.oDiamondVisitor.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f4832a[Privilege.live_entry_animation.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f4832a[Privilege.nearby_people.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f4832a[Privilege.moment_boost.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f4832a[Privilege.oDiamondSvipExtra.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f4832a[Privilege.immediately_match.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f4832a[Privilege.top_chat.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f4832a[Privilege.top_like.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f4832a[Privilege.unlock_learn_about_him_module.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f4832a[Privilege.ads_not_disturb.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f4832a[Privilege.block_harassing_words.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f4832a[Privilege.pick_tantan_credits_users.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f4832a[Privilege.youth_find_partner.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f4832a[Privilege.youth_blind_box.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f4832a[Privilege.youth_message_read.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f4832a[Privilege.private_custom.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f4832a[Privilege.hide_me_from_nearby.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
        }
    }

    public PrivilegeImageContainerView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m7574a(View view) {
        w590.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m7575b(wx80 wx80Var, PurchaseType purchaseType) {
        Privilege privilegeM26841l = wx80Var.m26841l();
        if (privilegeM26841l == null) {
            this.f4831a.setImageResource(wx80Var.m26839j());
        }
        switch (C0229a.f4832a[privilegeM26841l.ordinal()]) {
            case 1:
                m7579f(0, 0);
                if (!"en".equals(Locale.getDefault().getLanguage())) {
                    boolean zM5568z1 = CoreModule.m1854P().m11706a().m5568z1();
                    ImageView imageView = this.f4831a;
                    if (!zM5568z1) {
                        imageView.setImageResource(d3c0.dc);
                    } else {
                        imageView.setImageResource(d3c0.a0);
                    }
                } else {
                    this.f4831a.setImageResource(d3c0.C8);
                }
                break;
            case 2:
                m7579f(0, 0);
                this.f4831a.setImageResource(d3c0.gc);
                break;
            case CameraSticker.STATE_COMPLETE /* 3 */:
                m7579f(0, 0);
                int i = zz6.u0() ? d3c0.B8 : d3c0.A8;
                if (g6a.m15588k() && sab0.g(purchaseType)) {
                    i = d3c0.R;
                }
                this.f4831a.setImageResource(i);
                break;
            case CameraSticker.STATE_ERROR /* 4 */:
                m7579f(0, 0);
                this.f4831a.setImageResource(zz6.u0() ? d3c0.ic : d3c0.hc);
                break;
            case 5:
            case 6:
                m7579f(0, 0);
                this.f4831a.setImageResource(d3c0.tc);
                break;
            case 7:
                m7579f(0, 0);
                this.f4831a.setImageResource(zz6.u0() ? d3c0.S8 : d3c0.R8);
                break;
            case 8:
                if (sab0.i(purchaseType) || sab0.j(purchaseType)) {
                    this.f4831a.setImageResource(zz6.u0() ? d3c0.A4 : d3c0.z4);
                } else {
                    this.f4831a.setImageResource(zz6.u0() ? d3c0.Pc : d3c0.Oc);
                }
                m7579f(0, 0);
                break;
            case 9:
                m7579f(0, 0);
                this.f4831a.setImageResource(CoreModule.m1854P().m11706a().m5428eg() ? d3c0.o9 : d3c0.n9);
                break;
            case 10:
                m7579f(0, 0);
                this.f4831a.setImageResource(CoreModule.m1854P().m11706a().m5428eg() ? d3c0.q9 : d3c0.p9);
                break;
            case 11:
                m7579f(0, 0);
                this.f4831a.setImageResource(d3c0.M5);
                break;
            case 12:
                if (sab0.i(purchaseType) || sab0.j(purchaseType)) {
                    m7579f(0, 0);
                    this.f4831a.setImageResource(zz6.u0() ? d3c0.O4 : d3c0.N4);
                } else {
                    m7579f(0, 0);
                    this.f4831a.setImageResource(zz6.u0() ? d3c0.L5 : d3c0.K5);
                }
                break;
            case 13:
                m7579f(0, 0);
                if (g6a.m15585h() && (sab0.i(purchaseType) || sab0.j(purchaseType))) {
                    this.f4831a.setImageResource(d3c0.j5);
                } else {
                    this.f4831a.setImageResource(zz6.u0() ? d3c0.R4 : d3c0.Q4);
                }
                break;
            case 14:
                m7579f(0, 0);
                this.f4831a.setImageResource(zz6.u0() ? d3c0.d0 : d3c0.c0);
                break;
            case 15:
                m7579f(0, 0);
                break;
            case 16:
                if (sab0.i(purchaseType) || sab0.j(purchaseType)) {
                    m7579f(0, 0);
                    this.f4831a.setImageResource(zz6.u0() ? d3c0.M4 : d3c0.L4);
                } else {
                    m7579f(0, 0);
                    this.f4831a.setImageResource(zz6.u0() ? d3c0.l0 : d3c0.k0);
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
                m7579f(0, 0);
                this.f4831a.setImageResource(wx80Var.m26839j());
                break;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m7576c(wx80 wx80Var, PurchaseType purchaseType) {
        m7579f(0, 0);
        this.f4831a.setImageResource(d3c0.z8);
    }

    /* JADX INFO: renamed from: d */
    public void m7577d(wx80 wx80Var, PurchaseType purchaseType) {
        m7579f(0, 0);
        this.f4831a.setImageResource(d3c0.La);
    }

    /* JADX INFO: renamed from: e */
    public void m7578e(wx80 wx80Var, PurchaseType purchaseType) {
        m7579f(0, 0);
        this.f4831a.setImageResource(d3c0.Ma);
    }

    /* JADX INFO: renamed from: f */
    public final void m7579f(int i, int i2) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f4831a.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.bottomMargin = i2;
        this.f4831a.setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7574a(this);
    }

    public PrivilegeImageContainerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeImageContainerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
