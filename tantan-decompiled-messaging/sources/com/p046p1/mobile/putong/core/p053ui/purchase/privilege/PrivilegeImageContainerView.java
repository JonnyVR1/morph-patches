package com.p046p1.mobile.putong.core.p053ui.purchase.privilege;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import java.util.Locale;
import p149l.d3c0;
import p149l.g6a;
import p149l.sab0;
import p149l.w590;
import p149l.wx80;
import p149l.zz6;

/* JADX INFO: loaded from: classes9.dex */
public class PrivilegeImageContainerView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public ImageView f35050a;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.privilege.PrivilegeImageContainerView$a */
    public static /* synthetic */ class C8793a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f35051a;

        static {
            int[] iArr = new int[Privilege.values().length];
            f35051a = iArr;
            try {
                iArr[Privilege.advanced_filter.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f35051a[Privilege.message_read_state.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f35051a[Privilege.privacy_membership.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f35051a[Privilege.recover_unmatches.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f35051a[Privilege.vip_location.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f35051a[Privilege.youth_roaming.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f35051a[Privilege.liked_user.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f35051a[Privilege.boost.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f35051a[Privilege.see_theme_unlock_more.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f35051a[Privilege.see_theme_unlock_pop.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f35051a[Privilege.svipPicksMembership.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f35051a[Privilege.picksMembership.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f35051a[Privilege.oDiamondVisitor.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f35051a[Privilege.live_entry_animation.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f35051a[Privilege.nearby_people.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f35051a[Privilege.moment_boost.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f35051a[Privilege.oDiamondSvipExtra.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f35051a[Privilege.immediately_match.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f35051a[Privilege.top_chat.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f35051a[Privilege.top_like.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f35051a[Privilege.unlock_learn_about_him_module.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f35051a[Privilege.ads_not_disturb.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f35051a[Privilege.block_harassing_words.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f35051a[Privilege.pick_tantan_credits_users.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                f35051a[Privilege.youth_find_partner.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f35051a[Privilege.youth_blind_box.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f35051a[Privilege.youth_message_read.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                f35051a[Privilege.private_custom.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                f35051a[Privilege.hide_me_from_nearby.ordinal()] = 29;
            } catch (NoSuchFieldError unused29) {
            }
        }
    }

    public PrivilegeImageContainerView(@NonNull Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m54239a(View view) {
        w590.m201597a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public void m54240b(wx80 wx80Var, PurchaseType purchaseType) {
        Privilege privilegeM205960l = wx80Var.m205960l();
        if (privilegeM205960l == null) {
            this.f35050a.setImageResource(wx80Var.m205958j());
        }
        switch (C8793a.f35051a[privilegeM205960l.ordinal()]) {
            case 1:
                m54244f(0, 0);
                if (!"en".equals(Locale.getDefault().getLanguage())) {
                    boolean zMo33631z1 = CoreModule.m29935P().m94651a().mo33631z1();
                    ImageView imageView = this.f35050a;
                    if (!zMo33631z1) {
                        imageView.setImageResource(d3c0.f83896dc);
                    } else {
                        imageView.setImageResource(d3c0.f83842a0);
                    }
                } else {
                    this.f35050a.setImageResource(d3c0.f83524C8);
                }
                break;
            case 2:
                m54244f(0, 0);
                this.f35050a.setImageResource(d3c0.f83938gc);
                break;
            case 3:
                m54244f(0, 0);
                int i = zz6.m221004u0() ? d3c0.f83510B8 : d3c0.f83496A8;
                if (g6a.m124562k() && sab0.m182889g(purchaseType)) {
                    i = d3c0.f83724R;
                }
                this.f35050a.setImageResource(i);
                break;
            case 4:
                m54244f(0, 0);
                this.f35050a.setImageResource(zz6.m221004u0() ? d3c0.f83966ic : d3c0.f83952hc);
                break;
            case 5:
            case 6:
                m54244f(0, 0);
                this.f35050a.setImageResource(d3c0.f84120tc);
                break;
            case 7:
                m54244f(0, 0);
                this.f35050a.setImageResource(zz6.m221004u0() ? d3c0.f83746S8 : d3c0.f83733R8);
                break;
            case 8:
                if (sab0.m182891i(purchaseType) || sab0.m182892j(purchaseType)) {
                    this.f35050a.setImageResource(zz6.m221004u0() ? d3c0.f83492A4 : d3c0.f84196z4);
                } else {
                    this.f35050a.setImageResource(zz6.m221004u0() ? d3c0.f83710Pc : d3c0.f83696Oc);
                }
                m54244f(0, 0);
                break;
            case 9:
                m54244f(0, 0);
                this.f35050a.setImageResource(CoreModule.m29935P().m94651a().mo33491eg() ? d3c0.f84047o9 : d3c0.f84033n9);
                break;
            case 10:
                m54244f(0, 0);
                this.f35050a.setImageResource(CoreModule.m29935P().m94651a().mo33491eg() ? d3c0.f84075q9 : d3c0.f84061p9);
                break;
            case 11:
                m54244f(0, 0);
                this.f35050a.setImageResource(d3c0.f83661M5);
                break;
            case 12:
                if (sab0.m182891i(purchaseType) || sab0.m182892j(purchaseType)) {
                    m54244f(0, 0);
                    this.f35050a.setImageResource(zz6.m221004u0() ? d3c0.f83688O4 : d3c0.f83674N4);
                } else {
                    m54244f(0, 0);
                    this.f35050a.setImageResource(zz6.m221004u0() ? d3c0.f83647L5 : d3c0.f83633K5);
                }
                break;
            case 13:
                m54244f(0, 0);
                if (g6a.m124559h() && (sab0.m182891i(purchaseType) || sab0.m182892j(purchaseType))) {
                    this.f35050a.setImageResource(d3c0.f83973j5);
                } else {
                    this.f35050a.setImageResource(zz6.m221004u0() ? d3c0.f83729R4 : d3c0.f83716Q4);
                }
                break;
            case 14:
                m54244f(0, 0);
                this.f35050a.setImageResource(zz6.m221004u0() ? d3c0.f83884d0 : d3c0.f83870c0);
                break;
            case 15:
                m54244f(0, 0);
                break;
            case 16:
                if (sab0.m182891i(purchaseType) || sab0.m182892j(purchaseType)) {
                    m54244f(0, 0);
                    this.f35050a.setImageResource(zz6.m221004u0() ? d3c0.f83660M4 : d3c0.f83646L4);
                } else {
                    m54244f(0, 0);
                    this.f35050a.setImageResource(zz6.m221004u0() ? d3c0.f83996l0 : d3c0.f83982k0);
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
                m54244f(0, 0);
                this.f35050a.setImageResource(wx80Var.m205958j());
                break;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m54241c(wx80 wx80Var, PurchaseType purchaseType) {
        m54244f(0, 0);
        this.f35050a.setImageResource(d3c0.f84200z8);
    }

    /* JADX INFO: renamed from: d */
    public void m54242d(wx80 wx80Var, PurchaseType purchaseType) {
        m54244f(0, 0);
        this.f35050a.setImageResource(d3c0.f83652La);
    }

    /* JADX INFO: renamed from: e */
    public void m54243e(wx80 wx80Var, PurchaseType purchaseType) {
        m54244f(0, 0);
        this.f35050a.setImageResource(d3c0.f83666Ma);
    }

    /* JADX INFO: renamed from: f */
    public final void m54244f(int i, int i2) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f35050a.getLayoutParams();
        layoutParams.topMargin = i;
        layoutParams.bottomMargin = i2;
        this.f35050a.setLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m54239a(this);
    }

    public PrivilegeImageContainerView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public PrivilegeImageContainerView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
