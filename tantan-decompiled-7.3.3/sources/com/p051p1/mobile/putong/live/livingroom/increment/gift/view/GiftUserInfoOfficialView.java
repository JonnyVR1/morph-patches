package com.p051p1.mobile.putong.live.livingroom.increment.gift.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.view.GiftUserInfoOfficialView;
import com.tantan.live.eventbus.LiveEventBus;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p137rx.C22421c;
import p151v.VDraweeView;
import p151v.VText;
import p153l.bnl0;
import p153l.csq;
import p153l.iam;
import p153l.izs;
import p153l.qa00;
import p153l.v3f;
import p153l.wnc0;
import p153l.zzj;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\u001fH\u0002¢\u0006\u0004\b#\u0010$R\"\u0010,\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u00104\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u00108\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u0010/\u001a\u0004\b6\u00101\"\u0004\b7\u00103R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006;"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/increment/gift/view/GiftUserInfoOfficialView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Ll/iam;", "Ll/wnc0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "presenter", "", "l0", "(Ll/wnc0;)V", "onFinishInflate", "()V", "destroy", "C0", "()Landroid/content/Context;", "", "userId", "userName", "avatarUrl", "m0", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", OMSTemplateModeType.view, "k0", "(Landroid/view/View;)V", "Lv/VDraweeView;", Constants.INAPP_DATA_TAG, "Lv/VDraweeView;", "get_avatar", "()Lv/VDraweeView;", "set_avatar", "(Lv/VDraweeView;)V", "_avatar", "Lv/VText;", "e", "Lv/VText;", "get_tv_name", "()Lv/VText;", "set_tv_name", "(Lv/VText;)V", "_tv_name", "f", "get_button", "set_button", "_button", "g", "Ll/wnc0;", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class GiftUserInfoOfficialView extends ConstraintLayout implements iam<wnc0> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VDraweeView _avatar;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VText _tv_name;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VText _button;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public wnc0 presenter;

    public /* synthetic */ GiftUserInfoOfficialView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: h0 */
    public static void m75710h0(Function1 function1, View view) {
        function1.invoke(view);
    }

    /* JADX INFO: renamed from: i0 */
    public static void m75711i0(Function1 function1, View view) {
        function1.invoke(view);
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r3v7, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r4v3, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r5v7, types: [l.oo2] */
    /* JADX INFO: renamed from: j0 */
    public static Unit m75712j0(GiftUserInfoOfficialView giftUserInfoOfficialView, String str, View view) {
        LiveEventBus liveEventBusM213811F2;
        LiveEventBus.OpenUserCardDialogEvent openUserCardDialogEvent;
        v3f.C20736d<UserCardData, C22421c<UserCardData>> c20736dShow;
        ?? M213810E2;
        User userM168532l0;
        ?? M213810E3;
        User userM168532l1;
        ?? M213810E4;
        User userM168532l2;
        ?? M213810E5;
        User userM168532l3;
        view.getClass();
        wnc0 wnc0Var = giftUserInfoOfficialView.presenter;
        if (wnc0Var != null && (liveEventBusM213811F2 = wnc0Var.m213811F2()) != null && (openUserCardDialogEvent = liveEventBusM213811F2.OpenUserCardDialogEvent) != null && (c20736dShow = openUserCardDialogEvent.show()) != null) {
            UserCardData.Builder source = UserCardData.builder(700).userId(str).setSource("officialShow");
            wnc0 wnc0Var2 = giftUserInfoOfficialView.presenter;
            String str2 = null;
            String str3 = (wnc0Var2 == null || (M213810E5 = wnc0Var2.m213810E2()) == 0 || (userM168532l3 = M213810E5.m168532l0()) == null) ? null : userM168532l3.f56859id;
            wnc0 wnc0Var3 = giftUserInfoOfficialView.presenter;
            UserCardData.Builder fromIdentity = source.setFromIdentity(csq.m112227a(wnc0Var2, str3, (wnc0Var3 == null || (M213810E4 = wnc0Var3.m213810E2()) == 0 || (userM168532l2 = M213810E4.m168532l0()) == null) ? null : userM168532l2.f56859id, 700));
            wnc0 wnc0Var4 = giftUserInfoOfficialView.presenter;
            String str4 = (wnc0Var4 == null || (M213810E3 = wnc0Var4.m213810E2()) == 0 || (userM168532l1 = M213810E3.m168532l0()) == null) ? null : userM168532l1.f56859id;
            wnc0 wnc0Var5 = giftUserInfoOfficialView.presenter;
            if (wnc0Var5 != null && (M213810E2 = wnc0Var5.m213810E2()) != 0 && (userM168532l0 = M213810E2.m168532l0()) != null) {
                str2 = userM168532l0.f56859id;
            }
            c20736dShow.mo199273j(fromIdentity.setTo(csq.m112230d(wnc0Var4, str4, str2, 700)).setScene("live").build());
        }
        return Unit.INSTANCE;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        wnc0 wnc0Var = this.presenter;
        if (wnc0Var != null) {
            return wnc0Var.m113230C0();
        }
        return null;
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @NotNull
    public final VDraweeView get_avatar() {
        VDraweeView vDraweeView = this._avatar;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_avatar");
        return null;
    }

    @NotNull
    public final VText get_button() {
        VText vText = this._button;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_button");
        return null;
    }

    @NotNull
    public final VText get_tv_name() {
        VText vText = this._tv_name;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_tv_name");
        return null;
    }

    @Override // p153l.iam
    @Nullable
    public View inflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup parent) {
        return null;
    }

    /* JADX INFO: renamed from: k0 */
    public final void m75713k0(View view) {
        zzj.m222258a(this, view);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(@Nullable wnc0 presenter) {
        this.presenter = presenter;
    }

    @SuppressLint({"SetTextI18n", "WrongConstant"})
    /* JADX INFO: renamed from: m0 */
    public final void m75715m0(@NotNull final String userId, @NotNull String userName, @NotNull String avatarUrl) {
        userId.getClass();
        userName.getClass();
        avatarUrl.getClass();
        izs.m142869t("context_livingAct", get_avatar(), avatarUrl, qa00.m175859d(32.0f));
        get_tv_name().setText("送给" + userName);
        final Function1 function1 = new Function1() { // from class: l.wzj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GiftUserInfoOfficialView.m75712j0(this.f191804a, userId, (View) obj);
            }
        };
        bnl0.m105509E0(get_avatar(), new View.OnClickListener() { // from class: l.xzj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GiftUserInfoOfficialView.m75711i0(function1, view);
            }
        });
        bnl0.m105509E0(get_button(), new View.OnClickListener() { // from class: l.yzj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GiftUserInfoOfficialView.m75710h0(function1, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75713k0(this);
    }

    public final void set_avatar(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._avatar = vDraweeView;
    }

    public final void set_button(@NotNull VText vText) {
        vText.getClass();
        this._button = vText;
    }

    public final void set_tv_name(@NotNull VText vText) {
        vText.getClass();
        this._tv_name = vText;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GiftUserInfoOfficialView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GiftUserInfoOfficialView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GiftUserInfoOfficialView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
