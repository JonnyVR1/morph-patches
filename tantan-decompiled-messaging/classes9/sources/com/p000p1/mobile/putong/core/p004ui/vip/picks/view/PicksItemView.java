package com.p000p1.mobile.putong.core.p004ui.vip.picks.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.core.p004ui.vip.picks.view.PicksItemView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.core.data.PicksUser;
import com.p1.mobile.putong.core.member.module.CoreMemberModule;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import l.b3c0;
import l.e30;
import l.j760;
import l.t100;
import l.vwb;
import l.xdl0;
import l.ze70;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p006l.qib0;
import v.VDraweeView;
import v.VImage;
import v.VRelative;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0019\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016JC\u0010\u001f\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00142\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00190\u001c2\u000e\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u001c¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\n2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$R\"\u0010,\u001a\u00020%8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u00104\u001a\u00020-8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010;\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010>\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0012\u00106\u001a\u0004\b<\u00108\"\u0004\b=\u0010:R\"\u0010E\u001a\u00020?8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010H\u001a\u00020?8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001f\u0010@\u001a\u0004\bF\u0010B\"\u0004\bG\u0010DR\"\u0010N\u001a\u00020!8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010$R\u0016\u0010\u001b\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\"\u0010W\u001a\u00020\u00178\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010T\"\u0004\bU\u0010V¨\u0006X"}, d2 = {"Lcom/p1/mobile/putong/core/ui/vip/picks/view/PicksItemView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "Lcom/p1/mobile/android/app/Act;", "d", "()Lcom/p1/mobile/android/app/Act;", "", "e", "()Z", "Lcom/p1/mobile/putong/core/data/PicksUser;", "picksUser", "Lcom/p1/mobile/putong/data/User;", "user", "withMask", "Ll/e30;", "onClick", "onSuperLikeSend", "f", "(Lcom/p1/mobile/putong/core/data/PicksUser;Lcom/p1/mobile/putong/data/User;ZLl/e30;Ll/e30;)V", "Landroid/view/View;", "view", "c", "(Landroid/view/View;)V", "Lv/VDraweeView;", "a", "Lv/VDraweeView;", "get_image", "()Lv/VDraweeView;", "set_image", "(Lv/VDraweeView;)V", "_image", "Lv/VRelative;", "b", "Lv/VRelative;", "get_personal_info", "()Lv/VRelative;", "set_personal_info", "(Lv/VRelative;)V", "_personal_info", "Lv/VText;", "Lv/VText;", "get_age", "()Lv/VText;", "set_age", "(Lv/VText;)V", "_age", "get_name", "set_name", "_name", "Lv/VImage;", "Lv/VImage;", "get_action_btn", "()Lv/VImage;", "set_action_btn", "(Lv/VImage;)V", "_action_btn", "get_verification_icon", "set_verification_icon", "_verification_icon", "g", "Landroid/view/View;", "get_mask", "()Landroid/view/View;", "set_mask", "_mask", "h", "Z", "i", "Lcom/p1/mobile/putong/core/data/PicksUser;", "getMUser", "()Lcom/p1/mobile/putong/core/data/PicksUser;", "setMUser", "(Lcom/p1/mobile/putong/core/data/PicksUser;)V", "mUser", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PicksItemView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public VDraweeView _image;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VRelative _personal_info;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VText _age;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public VText _name;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VImage _action_btn;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VImage _verification_icon;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public View _mask;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public boolean withMask;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public PicksUser mUser;

    public /* synthetic */ PicksItemView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: a */
    public static void m10286a(PicksItemView picksItemView, boolean z, PicksUser picksUser, e30 e30Var, User user, View view) {
        zvf0.u(CoreMemberModule.F().b().ge(picksItemView.m10289d().act()) ? "e_picks_card" : "e_picks_module_card", picksItemView.m10289d().pageId(), new j760[]{vwb.Y("picks_card_type", z ? "grayed" : "clear"), vwb.Y("other_user_id", picksUser.id)});
        if (picksItemView.m10289d().lifecycle_() == c.i && NullChecker.a(e30Var)) {
            e30Var.call(user);
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m10287b(PicksItemView picksItemView, PicksUser picksUser, e30 e30Var, View view) {
        zvf0.u(CoreMemberModule.F().b().ge(picksItemView.m10289d().act()) ? "e_picks_card_superlike" : "e_picks_module_card_superlike", picksItemView.m10289d().pageId(), new j760[]{vwb.Y("other_user_id", picksUser.id)});
        if (picksItemView.m10289d().lifecycle_() != c.i) {
            return;
        }
        e30Var.call(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: c */
    public final void m10288c(View view) {
        ze70.a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final Act m10289d() {
        Act actD = xdl0.D(getContext());
        actD.getClass();
        return actD;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getWithMask() {
        return this.withMask;
    }

    /* JADX INFO: renamed from: f */
    public final void m10291f(@NotNull final PicksUser picksUser, @NotNull final User user, final boolean withMask, @NotNull final e30<User> onClick, @NotNull final e30<Boolean> onSuperLikeSend) {
        picksUser.getClass();
        user.getClass();
        onClick.getClass();
        onSuperLikeSend.getClass();
        setMUser(picksUser);
        this.withMask = withMask;
        xdl0.L(this, new View.OnClickListener() { // from class: l.xe70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PicksItemView.m10286a(this.f27474a, withMask, picksUser, onClick, user, view);
            }
        });
        xdl0.L(get_action_btn(), new View.OnClickListener() { // from class: l.ye70
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PicksItemView.m10287b(this.f28173a, picksUser, onSuperLikeSend, view);
            }
        });
        qib0.f19782G.m12748N0(get_image(), user.fp().profile480().formatted(), false);
        if (withMask) {
            xdl0.M(get_mask(), true);
            xdl0.M(get_personal_info(), false);
            xdl0.M(get_action_btn(), false);
            xdl0.M(get_verification_icon(), false);
        } else {
            xdl0.M(get_mask(), withMask);
            xdl0.M(get_personal_info(), true);
            xdl0.M(get_action_btn(), true);
            qib0.f19804b0.f17707b.showUserVerificationLogo(m10289d(), user, get_verification_icon());
            VText vText = get_age();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            vText.setText(String.format("%s岁", Arrays.copyOf(new Object[]{user.age}, 1)));
            get_name().setText(user.name);
            get_action_btn().setImageResource(b3c0.s0);
            get_personal_info().setBackground(m10289d().drawable(b3c0.q0));
        }
        if (CoreMemberModule.F().b().k()) {
            get_action_btn().setImageResource(b3c0.Q1);
            setBackgroundResource(0);
        }
    }

    @NotNull
    public final PicksUser getMUser() {
        PicksUser picksUser = this.mUser;
        if (picksUser != null) {
            return picksUser;
        }
        Intrinsics.r("mUser");
        return null;
    }

    @NotNull
    public final VImage get_action_btn() {
        VImage vImage = this._action_btn;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_action_btn");
        return null;
    }

    @NotNull
    public final VText get_age() {
        VText vText = this._age;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_age");
        return null;
    }

    @NotNull
    public final VDraweeView get_image() {
        VDraweeView vDraweeView = this._image;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.r("_image");
        return null;
    }

    @NotNull
    public final View get_mask() {
        View view = this._mask;
        if (view != null) {
            return view;
        }
        Intrinsics.r("_mask");
        return null;
    }

    @NotNull
    public final VText get_name() {
        VText vText = this._name;
        if (vText != null) {
            return vText;
        }
        Intrinsics.r("_name");
        return null;
    }

    @NotNull
    public final VRelative get_personal_info() {
        VRelative vRelative = this._personal_info;
        if (vRelative != null) {
            return vRelative;
        }
        Intrinsics.r("_personal_info");
        return null;
    }

    @NotNull
    public final VImage get_verification_icon() {
        VImage vImage = this._verification_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_verification_icon");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m10288c(this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec((int) (((double) View.MeasureSpec.getSize(widthMeasureSpec)) * 1.33d), View.MeasureSpec.getMode(heightMeasureSpec)));
        ViewGroup.LayoutParams layoutParams = get_personal_info().getLayoutParams();
        layoutParams.getClass();
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        int iY0 = (int) (((double) ((xdl0.y0() / 2) - t100.j)) * 1.33d * 0.3799999952316284d);
        if (layoutParams2.height != iY0) {
            layoutParams2.height = iY0;
            get_personal_info().setLayoutParams(layoutParams2);
        }
    }

    public final void setMUser(@NotNull PicksUser picksUser) {
        picksUser.getClass();
        this.mUser = picksUser;
    }

    public final void set_action_btn(@NotNull VImage vImage) {
        vImage.getClass();
        this._action_btn = vImage;
    }

    public final void set_age(@NotNull VText vText) {
        vText.getClass();
        this._age = vText;
    }

    public final void set_image(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._image = vDraweeView;
    }

    public final void set_mask(@NotNull View view) {
        view.getClass();
        this._mask = view;
    }

    public final void set_name(@NotNull VText vText) {
        vText.getClass();
        this._name = vText;
    }

    public final void set_personal_info(@NotNull VRelative vRelative) {
        vRelative.getClass();
        this._personal_info = vRelative;
    }

    public final void set_verification_icon(@NotNull VImage vImage) {
        vImage.getClass();
        this._verification_icon = vImage;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PicksItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PicksItemView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public PicksItemView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
