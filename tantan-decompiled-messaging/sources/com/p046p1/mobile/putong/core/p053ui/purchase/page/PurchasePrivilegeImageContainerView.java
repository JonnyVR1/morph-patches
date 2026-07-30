package com.p046p1.mobile.putong.core.p053ui.purchase.page;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.a8b0;
import p149l.d3c0;
import p149l.g6a;
import p149l.sab0;
import p149l.zz6;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0011\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0012\u0010\u0010J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\"\u0010\u001d\u001a\u00020\u00178\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/purchase/page/PurchasePrivilegeImageContainerView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "onFinishInflate", "()V", "Lcom/p1/mobile/putong/core/data/PurchaseType;", "type", "Lcom/p1/mobile/putong/core/data/Privilege;", "privilege", "b", "(Lcom/p1/mobile/putong/core/data/PurchaseType;Lcom/p1/mobile/putong/core/data/Privilege;)V", Constants.INAPP_DATA_TAG, "c", "Landroid/view/View;", OMSTemplateModeType.view, "a", "(Landroid/view/View;)V", "Landroid/widget/ImageView;", "Landroid/widget/ImageView;", "get_image", "()Landroid/widget/ImageView;", "set_image", "(Landroid/widget/ImageView;)V", "_image", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class PurchasePrivilegeImageContainerView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public ImageView _image;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.purchase.page.PurchasePrivilegeImageContainerView$a */
    @Metadata(m87233k = 3, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final /* synthetic */ class C8786a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f34962a;

        static {
            int[] iArr = new int[Privilege.values().length];
            try {
                iArr[Privilege.vip_location.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Privilege.vip_unlimited_likes.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Privilege.advanced_filter.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Privilege.message_read_state.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Privilege.privacy_membership.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Privilege.recover_unmatches.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Privilege.liked_user.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[Privilege.boost.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[Privilege.see_theme_unlock_more.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[Privilege.see_theme_unlock_pop.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[Privilege.svipPicksMembership.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[Privilege.picksMembership.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[Privilege.oDiamondSvipExtra.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[Privilege.immediately_match.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[Privilege.oDiamondVisitor.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[Privilege.live_entry_animation.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[Privilege.moment_boost.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                iArr[Privilege.greet.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                iArr[Privilege.leave_message.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                iArr[Privilege.nearby_people.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                iArr[Privilege.block_harassing_words.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                iArr[Privilege.ads_not_disturb.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                iArr[Privilege.unlock_learn_about_him_module.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                iArr[Privilege.pick_tantan_credits_users.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                iArr[Privilege.youth_roaming.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                iArr[Privilege.youth_find_partner.ordinal()] = 26;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                iArr[Privilege.youth_blind_box.ordinal()] = 27;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                iArr[Privilege.youth_message_read.ordinal()] = 28;
            } catch (NoSuchFieldError unused28) {
            }
            f34962a = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public PurchasePrivilegeImageContainerView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    /* JADX INFO: renamed from: a */
    public final void m54186a(View view) {
        a8b0.m95338a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final void m54187b(@NotNull PurchaseType type, @Nullable Privilege privilege) {
        type.getClass();
        switch (privilege == null ? -1 : C8786a.f34962a[privilege.ordinal()]) {
            case 1:
                get_image().setImageResource(d3c0.f84120tc);
                break;
            case 2:
                if (g6a.m124559h() && sab0.m182905w(type)) {
                    get_image().setImageResource(d3c0.f83666Ma);
                } else if (!zz6.m221004u0()) {
                    get_image().setImageResource(d3c0.f83542Dc);
                } else {
                    get_image().setImageResource(d3c0.f83584Gc);
                }
                break;
            case 3:
                if (Intrinsics.m87488d("en", Locale.getDefault().getLanguage())) {
                    get_image().setImageResource(d3c0.f83524C8);
                } else if (!CoreModule.m29935P().m94651a().mo33631z1()) {
                    get_image().setImageResource(d3c0.f83896dc);
                } else {
                    get_image().setImageResource(d3c0.f83842a0);
                }
                break;
            case 4:
                get_image().setImageResource(d3c0.f83938gc);
                break;
            case 5:
                get_image().setImageResource(sab0.m182889g(type) ? d3c0.f83815Y : zz6.m221004u0() ? d3c0.f83510B8 : d3c0.f83496A8);
                break;
            case 6:
                get_image().setImageResource(zz6.m221004u0() ? d3c0.f83966ic : d3c0.f83952hc);
                break;
            case 7:
                get_image().setImageResource(zz6.m221004u0() ? d3c0.f83746S8 : d3c0.f83733R8);
                break;
            case 8:
                if (!sab0.m182891i(type)) {
                    get_image().setImageResource(zz6.m221004u0() ? d3c0.f83710Pc : d3c0.f83696Oc);
                } else {
                    get_image().setImageResource(zz6.m221004u0() ? d3c0.f83492A4 : d3c0.f84196z4);
                }
                break;
            case 9:
                get_image().setImageResource(CoreModule.m29935P().m94651a().mo33491eg() ? d3c0.f84047o9 : d3c0.f84033n9);
                break;
            case 10:
                get_image().setImageResource(CoreModule.m29935P().m94651a().mo33491eg() ? d3c0.f84075q9 : d3c0.f84061p9);
                break;
            case 11:
                get_image().setImageResource(d3c0.f83661M5);
                break;
            case 12:
                if (!sab0.m182891i(type)) {
                    get_image().setImageResource(zz6.m221004u0() ? d3c0.f83647L5 : d3c0.f83633K5);
                } else {
                    get_image().setImageResource(zz6.m221004u0() ? d3c0.f83688O4 : d3c0.f83674N4);
                }
                break;
            case 13:
                get_image().setImageResource(d3c0.f83903e5);
                break;
            case 14:
                get_image().setImageResource(zz6.m221004u0() ? d3c0.f84084r4 : d3c0.f84098s4);
                break;
            case 15:
                if (g6a.m124559h() && sab0.m182891i(type)) {
                    get_image().setImageResource(d3c0.f83973j5);
                } else {
                    get_image().setImageResource(zz6.m221004u0() ? d3c0.f83729R4 : d3c0.f83716Q4);
                }
                break;
            case 16:
                get_image().setImageResource(zz6.m221004u0() ? d3c0.f83884d0 : d3c0.f83870c0);
                break;
            case 17:
                if (!sab0.m182891i(type)) {
                    get_image().setImageResource(zz6.m221004u0() ? d3c0.f83996l0 : d3c0.f83982k0);
                } else {
                    get_image().setImageResource(zz6.m221004u0() ? d3c0.f83660M4 : d3c0.f83646L4);
                }
                break;
            case 18:
                get_image().setImageResource(d3c0.f83936ga);
                break;
            case 19:
                get_image().setImageResource(zz6.m221004u0() ? d3c0.f84118ta : d3c0.f84104sa);
                break;
            case 20:
                get_image().setImageResource(zz6.m221004u0() ? d3c0.f84156w6 : d3c0.f84142v6);
                break;
            case 21:
                get_image().setImageResource(d3c0.f83763U);
                break;
            case 22:
                get_image().setImageResource(d3c0.f83802X);
                break;
            case 23:
                int i = d3c0.f83789W;
                if (sab0.m182899q(type)) {
                    i = zz6.m221004u0() ? d3c0.f83789W : d3c0.f83692O8;
                }
                get_image().setImageResource(i);
                break;
            case 24:
                get_image().setImageResource(d3c0.f83776V);
                break;
            case 25:
                get_image().setImageResource(d3c0.f84120tc);
                break;
            case 26:
                get_image().setImageResource(d3c0.f83513Bb);
                break;
            case 27:
                get_image().setImageResource(d3c0.f83527Cb);
                break;
            case 28:
                get_image().setImageResource(d3c0.f83938gc);
                break;
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m54188c(@NotNull PurchaseType type, @Nullable Privilege privilege) {
        type.getClass();
        get_image().setImageResource(d3c0.f84200z8);
    }

    /* JADX INFO: renamed from: d */
    public final void m54189d(@NotNull PurchaseType type, @Nullable Privilege privilege) {
        type.getClass();
        get_image().setImageResource(d3c0.f83652La);
    }

    @NotNull
    public final ImageView get_image() {
        ImageView imageView = this._image;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.m87502r("_image");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m54186a(this);
    }

    public final void set_image(@NotNull ImageView imageView) {
        imageView.getClass();
        this._image = imageView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PurchasePrivilegeImageContainerView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    public /* synthetic */ PurchasePrivilegeImageContainerView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
