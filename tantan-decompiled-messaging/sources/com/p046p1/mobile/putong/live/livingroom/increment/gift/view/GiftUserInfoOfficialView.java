package com.p046p1.mobile.putong.live.livingroom.increment.gift.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.livingroom.common.usercard.bean.UserCardData;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.view.GiftUserInfoOfficialView;
import com.tantan.live.eventbus.LiveEventBus;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;
import p147v.VDraweeView;
import p147v.VText;
import p149l.bqq;
import p149l.hxs;
import p149l.jxj;
import p149l.pfc0;
import p149l.q2f;
import p149l.s7m;
import p149l.t100;
import p149l.xdl0;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u0002B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0011J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\r2\u0006\u0010\"\u001a\u00020\u001fH\u0002¢\u0006\u0004\b#\u0010$R\"\u0010,\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u00104\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u00108\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u0010/\u001a\u0004\b6\u00101\"\u0004\b7\u00103R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010:¨\u0006;"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/increment/gift/view/GiftUserInfoOfficialView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Ll/s7m;", "Ll/pfc0;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "presenter", "", "l0", "(Ll/pfc0;)V", "onFinishInflate", "()V", "destroy", "C0", "()Landroid/content/Context;", "", "userId", "userName", "avatarUrl", "m0", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", OMSTemplateModeType.view, "k0", "(Landroid/view/View;)V", "Lv/VDraweeView;", Constants.INAPP_DATA_TAG, "Lv/VDraweeView;", "get_avatar", "()Lv/VDraweeView;", "set_avatar", "(Lv/VDraweeView;)V", "_avatar", "Lv/VText;", "e", "Lv/VText;", "get_tv_name", "()Lv/VText;", "set_tv_name", "(Lv/VText;)V", "_tv_name", "f", "get_button", "set_button", "_button", "g", "Ll/pfc0;", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class GiftUserInfoOfficialView extends ConstraintLayout implements s7m<pfc0> {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VDraweeView _avatar;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VText _tv_name;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VText _button;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public pfc0 presenter;

    public /* synthetic */ GiftUserInfoOfficialView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: h0 */
    public static void m74527h0(Function1 function1, View view) {
        function1.invoke(view);
    }

    /* JADX INFO: renamed from: i0 */
    public static void m74528i0(Function1 function1, View view) {
        function1.invoke(view);
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r3v7, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r4v3, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r5v7, types: [l.ho2] */
    /* JADX INFO: renamed from: j0 */
    public static Unit m74529j0(GiftUserInfoOfficialView giftUserInfoOfficialView, String str, View view) {
        LiveEventBus liveEventBusM206028F2;
        LiveEventBus.OpenUserCardDialogEvent openUserCardDialogEvent;
        q2f.C19397d<UserCardData, C22306c<UserCardData>> c19397dShow;
        ?? M206027E2;
        User userM132146l0;
        ?? M206027E3;
        User userM132146l1;
        ?? M206027E4;
        User userM132146l2;
        ?? M206027E5;
        User userM132146l3;
        view.getClass();
        pfc0 pfc0Var = giftUserInfoOfficialView.presenter;
        if (pfc0Var != null && (liveEventBusM206028F2 = pfc0Var.m206028F2()) != null && (openUserCardDialogEvent = liveEventBusM206028F2.OpenUserCardDialogEvent) != null && (c19397dShow = openUserCardDialogEvent.show()) != null) {
            UserCardData.Builder source = UserCardData.builder(700).userId(str).setSource("officialShow");
            pfc0 pfc0Var2 = giftUserInfoOfficialView.presenter;
            String str2 = null;
            String str3 = (pfc0Var2 == null || (M206027E5 = pfc0Var2.m206027E2()) == 0 || (userM132146l3 = M206027E5.m132146l0()) == null) ? null : userM132146l3.f56011id;
            pfc0 pfc0Var3 = giftUserInfoOfficialView.presenter;
            UserCardData.Builder fromIdentity = source.setFromIdentity(bqq.m103386a(pfc0Var2, str3, (pfc0Var3 == null || (M206027E4 = pfc0Var3.m206027E2()) == 0 || (userM132146l2 = M206027E4.m132146l0()) == null) ? null : userM132146l2.f56011id, 700));
            pfc0 pfc0Var4 = giftUserInfoOfficialView.presenter;
            String str4 = (pfc0Var4 == null || (M206027E3 = pfc0Var4.m206027E2()) == 0 || (userM132146l1 = M206027E3.m132146l0()) == null) ? null : userM132146l1.f56011id;
            pfc0 pfc0Var5 = giftUserInfoOfficialView.presenter;
            if (pfc0Var5 != null && (M206027E2 = pfc0Var5.m206027E2()) != 0 && (userM132146l0 = M206027E2.m132146l0()) != null) {
                str2 = userM132146l0.f56011id;
            }
            c19397dShow.mo172463j(fromIdentity.setTo(bqq.m103389d(pfc0Var4, str4, str2, 700)).setScene("live").build());
        }
        return Unit.INSTANCE;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        pfc0 pfc0Var = this.presenter;
        if (pfc0Var != null) {
            return pfc0Var.m104249C0();
        }
        return null;
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @NotNull
    public final VDraweeView get_avatar() {
        VDraweeView vDraweeView = this._avatar;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_avatar");
        return null;
    }

    @NotNull
    public final VText get_button() {
        VText vText = this._button;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_button");
        return null;
    }

    @NotNull
    public final VText get_tv_name() {
        VText vText = this._tv_name;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_tv_name");
        return null;
    }

    @Override // p149l.s7m
    @Nullable
    public View inflateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup parent) {
        return null;
    }

    /* JADX INFO: renamed from: k0 */
    public final void m74530k0(View view) {
        jxj.m143808a(this, view);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: l0, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(@Nullable pfc0 presenter) {
        this.presenter = presenter;
    }

    @SuppressLint({"SetTextI18n", "WrongConstant"})
    /* JADX INFO: renamed from: m0 */
    public final void m74532m0(@NotNull final String userId, @NotNull String userName, @NotNull String avatarUrl) {
        userId.getClass();
        userName.getClass();
        avatarUrl.getClass();
        hxs.m133407t("context_livingAct", get_avatar(), avatarUrl, t100.m186890d(32.0f));
        get_tv_name().setText("送给" + userName);
        final Function1 function1 = new Function1() { // from class: l.gxj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GiftUserInfoOfficialView.m74529j0(this.f104901a, userId, (View) obj);
            }
        };
        xdl0.m208329E0(get_avatar(), new View.OnClickListener() { // from class: l.hxj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GiftUserInfoOfficialView.m74528i0(function1, view);
            }
        });
        xdl0.m208329E0(get_button(), new View.OnClickListener() { // from class: l.ixj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GiftUserInfoOfficialView.m74527h0(function1, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74530k0(this);
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
