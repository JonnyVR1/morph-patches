package com.p051p1.mobile.putong.core.newui.profile.newme;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Active;
import com.p051p1.mobile.putong.core.data.IntlTabMePayGuide;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.newui.profile.newme.ProfilePrivilegePayGuide;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.byd0;
import p153l.c9c0;
import p153l.dbc0;
import p153l.i4g0;
import p153l.jyb;
import p153l.pya0;
import p153l.pzi0;
import p153l.uqb0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\nB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\f2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\f2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J!\u0010\"\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0002¢\u0006\u0004\b\"\u0010\u0017J\u0017\u0010#\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b#\u0010$R\"\u0010+\u001a\u00020\u00008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u00103\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010;\u001a\u0002048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010C\u001a\u00020<8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR\"\u0010G\u001a\u0002048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bD\u00106\u001a\u0004\bE\u00108\"\u0004\bF\u0010:R\u0017\u0010M\u001a\u00020H8\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010O¨\u0006P"}, m88121d2 = {"Lcom/p1/mobile/putong/core/newui/profile/newme/ProfilePrivilegePayGuide;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "(Landroid/content/Context;)V", "", "onFinishInflate", "()V", "", "l0", "()Z", "Lcom/p1/mobile/putong/core/data/IntlTabMePayGuide;", "intlTabMePayGuide", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "m0", "(Lcom/p1/mobile/putong/core/data/IntlTabMePayGuide;Lcom/p1/mobile/android/app/Act;)V", "o0", "(Lcom/p1/mobile/android/app/Act;)V", "", "navigationType", "n0", "(Ljava/lang/String;)V", "Landroid/view/View;", OMSTemplateModeType.view, "i0", "(Landroid/view/View;)V", "j0", "k0", "(Lcom/p1/mobile/putong/core/data/IntlTabMePayGuide;)V", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/core/newui/profile/newme/ProfilePrivilegePayGuide;", "get_container", "()Lcom/p1/mobile/putong/core/newui/profile/newme/ProfilePrivilegePayGuide;", "set_container", "(Lcom/p1/mobile/putong/core/newui/profile/newme/ProfilePrivilegePayGuide;)V", "_container", "Lv/VDraweeView;", "e", "Lv/VDraweeView;", "get_privilege_icon", "()Lv/VDraweeView;", "set_privilege_icon", "(Lv/VDraweeView;)V", "_privilege_icon", "Lv/VText;", "f", "Lv/VText;", "get_title", "()Lv/VText;", "set_title", "(Lv/VText;)V", "_title", "Landroidx/appcompat/widget/AppCompatTextView;", "g", "Landroidx/appcompat/widget/AppCompatTextView;", "get_desc", "()Landroidx/appcompat/widget/AppCompatTextView;", "set_desc", "(Landroidx/appcompat/widget/AppCompatTextView;)V", "_desc", "h", "get_buy", "set_buy", "_buy", "Ll/byd0;", RXScreenCaptureService.KEY_INDEX, "Ll/byd0;", "getGuideClickTime", "()Ll/byd0;", "guideClickTime", "j", "Lcom/p1/mobile/putong/core/data/IntlTabMePayGuide;", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class ProfilePrivilegePayGuide extends ConstraintLayout {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public ProfilePrivilegePayGuide _container;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VDraweeView _privilege_icon;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VText _title;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public AppCompatTextView _desc;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VText _buy;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final byd0 guideClickTime;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public IntlTabMePayGuide intlTabMePayGuide;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfilePrivilegePayGuide(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.guideClickTime = new byd0("pay_guide_click_time" + uqb0.f180397c0.userId(), 0L);
    }

    /* JADX INFO: renamed from: h0 */
    public static void m44302h0(ProfilePrivilegePayGuide profilePrivilegePayGuide, Act act, IntlTabMePayGuide intlTabMePayGuide, View view) {
        Integer num = CoreModule.f18264c.f20396j0.f20043n0.get();
        if (num != null && num.intValue() == 1) {
            CoreModule.f18264c.f20396j0.f20043n0.put(0);
            profilePrivilegePayGuide.m44309o0(act);
        }
        if (profilePrivilegePayGuide.m44306l0()) {
            profilePrivilegePayGuide.guideClickTime.put(Long.valueOf(pzi0.m174454o()));
            profilePrivilegePayGuide.m44308n0("iap");
            if (act == null) {
                Activity activityM105508E = bnl0.m105508E(profilePrivilegePayGuide);
                act = activityM105508E instanceof Act ? (Act) activityM105508E : null;
            }
            Act act2 = act;
            String str = intlTabMePayGuide.membershipType;
            str.getClass();
            C8927c.m54619Y0(act2, str, intlTabMePayGuide.contractIntervalDays, null, 8, null);
        }
        bnl0.m105524M(profilePrivilegePayGuide, false);
    }

    @NotNull
    public final byd0 getGuideClickTime() {
        return this.guideClickTime;
    }

    @NotNull
    public final VText get_buy() {
        VText vText = this._buy;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_buy");
        return null;
    }

    @NotNull
    public final ProfilePrivilegePayGuide get_container() {
        ProfilePrivilegePayGuide profilePrivilegePayGuide = this._container;
        if (profilePrivilegePayGuide != null) {
            return profilePrivilegePayGuide;
        }
        Intrinsics.m88391r("_container");
        return null;
    }

    @NotNull
    public final AppCompatTextView get_desc() {
        AppCompatTextView appCompatTextView = this._desc;
        if (appCompatTextView != null) {
            return appCompatTextView;
        }
        Intrinsics.m88391r("_desc");
        return null;
    }

    @NotNull
    public final VDraweeView get_privilege_icon() {
        VDraweeView vDraweeView = this._privilege_icon;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_privilege_icon");
        return null;
    }

    @NotNull
    public final VText get_title() {
        VText vText = this._title;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_title");
        return null;
    }

    /* JADX INFO: renamed from: i0 */
    public final void m44303i0(View view) {
        pya0.m174274a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m44304j0(final IntlTabMePayGuide intlTabMePayGuide, final Act act) {
        this.intlTabMePayGuide = intlTabMePayGuide;
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.oya0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ProfilePrivilegePayGuide.m44302h0(this.f149781a, act, intlTabMePayGuide, view);
            }
        });
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:19:0x0073  */
    /* JADX INFO: renamed from: k0 */
    public final void m44305k0(IntlTabMePayGuide intlTabMePayGuide) {
        int color;
        int color2;
        int i;
        int i2;
        String str;
        String str2;
        boolean z = false;
        String str3 = "";
        switch (intlTabMePayGuide.membershipType) {
            case "premium":
                color = getContext().getColor(c9c0.f80387X);
                color2 = getContext().getColor(c9c0.f80346J0);
                i = dbc0.f86852ba;
                i2 = dbc0.f86885ca;
                str = "https://fe-static.tancdn.com/v1/images/eyJpZCI6IjI2REZGOTA0Q0JGRjQ5RDg4NzdBNzIwQzEzRDBFQTA1IiwidyI6OTYsImgiOjk2LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MTMwNzU1NTM5MTAxMjQxMTEzNiwicHQiOjIwMjUxMTA1MTl9.webp";
                break;
            case "see":
                int color3 = Color.parseColor("#9C4200");
                int color4 = Color.parseColor("#9C4200");
                i = dbc0.f86918da;
                i2 = dbc0.f86950ea;
                str = "https://fe-static.tancdn.com/v1/images/eyJpZCI6IkVEQjc5OUQyMjY5MjRBRDE5NzYyOTdDQkU4MDdDMjg2IiwidyI6OTYsImgiOjk2LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6NDc5NTU2NjE2ODc4MjM1MDA4MCwicHQiOjIwMjUxMTA1MTl9.webp";
                color2 = color4;
                color = color3;
                break;
            case "vip":
                color = getContext().getColor(c9c0.f80470x0);
                color2 = getContext().getColor(c9c0.f80470x0);
                i = dbc0.f87082ia;
                i2 = dbc0.f87113ja;
                str = "https://fe-static.tancdn.com/v1/images/eyJpZCI6IkE4QjYyRkExMEFGNzQ4RDQ4QjFFQTZGRjgyNTVFMTUxIiwidyI6OTYsImgiOjk2LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6OTM4MDA5ODc1MzgyMzc3NywicHQiOjIwMjUxMTA1MTl9.webp";
                break;
            case "ultra":
                color = Color.parseColor("#5F486A");
                color2 = Color.parseColor("#F9E7FF");
                i = dbc0.f87049ha;
                i2 = dbc0.f87016ga;
                str = "https://fe-static.tancdn.com/v1/images/eyJpZCI6IjdCMjlFMDZBOTQzRDQzODc4QjdGRjU2NzJDQUYyMTY0IiwidyI6OTYsImgiOjk2LCJkIjowLCJtdCI6ImltYWdlL2pwZWciLCJkaCI6MzE3ODQyNjUzMTgwOTkyMDc5NCwicHQiOjIwMjUxMTA1MTl9.webp";
                break;
            default:
                color = 0;
                color2 = 0;
                i = 0;
                i2 = 0;
                str = "";
                break;
        }
        String str4 = intlTabMePayGuide.bannerType;
        int iHashCode = str4.hashCode();
        if (iHashCode == -1422950650 ? str4.equals(Active.TYPE) : iHashCode == 985221495 && str4.equals("expiringSoon")) {
            String str5 = intlTabMePayGuide.text.f21171in.title;
            str5.getClass();
            str3 = intlTabMePayGuide.text.f21171in.text;
            str3.getClass();
            z = true;
            str2 = str5;
        } else {
            str2 = intlTabMePayGuide.text.expired.text;
            str2.getClass();
        }
        bnl0.m105524M(get_desc(), z);
        bnl0.m105524M(get_buy(), !z);
        get_title().setTextSize(!z ? 14.0f : 12.0f);
        get_desc().setText(str3);
        get_title().setText(str2);
        uqb0.f180374G.m127115L0(get_privilege_icon(), str);
        get_buy().setTextColor(color);
        get_title().setTextColor(color2);
        get_desc().setTextColor(color2);
        get_buy().setBackgroundResource(i);
        setBackgroundResource(i2);
    }

    /* JADX INFO: renamed from: l0 */
    public final boolean m44306l0() {
        Long l2 = this.guideClickTime.get();
        l2.getClass();
        return !pzi0.m174438C(l2.longValue(), pzi0.m174454o());
    }

    /* JADX INFO: renamed from: m0 */
    public final void m44307m0(@NotNull IntlTabMePayGuide intlTabMePayGuide, @Nullable Act act) {
        intlTabMePayGuide.getClass();
        m44309o0(act);
        m44304j0(intlTabMePayGuide, act);
        m44305k0(intlTabMePayGuide);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0063  */
    /* JADX INFO: renamed from: n0 */
    public final void m44308n0(@NotNull String navigationType) {
        String str;
        navigationType.getClass();
        IntlTabMePayGuide intlTabMePayGuide = this.intlTabMePayGuide;
        if (intlTabMePayGuide != null) {
            String str2 = intlTabMePayGuide.membershipType;
            str2.getClass();
            String str3 = intlTabMePayGuide.membershipType;
            int iHashCode = str3.hashCode();
            if (iHashCode != -318452137) {
                if (iHashCode == 111384492 && str3.equals("ultra")) {
                    str2 = intlTabMePayGuide.isUpgraded ? "premiumUpgradeToUltra" : SummarizedPrivilegesId.ultraPremium;
                }
            } else if (str3.equals("premium") && intlTabMePayGuide.isUpgraded) {
                str2 = "UpgradeToPremium";
            }
            String str4 = intlTabMePayGuide.bannerType;
            int iHashCode2 = str4.hashCode();
            if (iHashCode2 != -1422950650) {
                if (iHashCode2 == 985221495 && str4.equals("expiringSoon")) {
                    str = "will_expire";
                } else {
                    str = "expired";
                }
            } else if (str4.equals(Active.TYPE)) {
                str = "in_effect";
            } else {
                str = "expired";
            }
            if (TextUtils.isEmpty(navigationType)) {
                i4g0.m138492A("e_intl_renew_guiding_banner", OMSDialogPositon.p_navigation_view, jyb.m147494Y("subtype", str2), jyb.m147494Y("renewal_type", str));
            } else {
                i4g0.m138523u("e_intl_renew_guiding_banner", OMSDialogPositon.p_navigation_view, jyb.m147494Y("subtype", str2), jyb.m147494Y("navigation_type", navigationType), jyb.m147494Y("renewal_type", str));
            }
        }
    }

    /* JADX INFO: renamed from: o0 */
    public final void m44309o0(@Nullable Act act) {
        if (act instanceof NewMainAct) {
            ((NewMainAct) act).m40836t7();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m44303i0(this);
    }

    public final void set_buy(@NotNull VText vText) {
        vText.getClass();
        this._buy = vText;
    }

    public final void set_container(@NotNull ProfilePrivilegePayGuide profilePrivilegePayGuide) {
        profilePrivilegePayGuide.getClass();
        this._container = profilePrivilegePayGuide;
    }

    public final void set_desc(@NotNull AppCompatTextView appCompatTextView) {
        appCompatTextView.getClass();
        this._desc = appCompatTextView;
    }

    public final void set_privilege_icon(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._privilege_icon = vDraweeView;
    }

    public final void set_title(@NotNull VText vText) {
        vText.getClass();
        this._title = vText;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProfilePrivilegePayGuide(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProfilePrivilegePayGuide(@NotNull Context context) {
        this(context, null);
        context.getClass();
    }
}
