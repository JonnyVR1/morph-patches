package com.p046p1.mobile.putong.core.newui.onlinezone;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.member.R$string;
import com.p046p1.mobile.putong.core.newui.onlinezone.OnlineZoneItemView;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.RelationshipExtensions;
import com.p046p1.mobile.putong.data.RelationshipStatus;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p149l.b3c0;
import p149l.d30;
import p149l.mqi0;
import p149l.qib0;
import p149l.rn50;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\n2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010$\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b$\u0010#J\u0017\u0010%\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b%\u0010#R\"\u0010-\u001a\u00020&8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u00104\u001a\u00020.8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\"\u0010;\u001a\u0002058\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000e\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\"\u0010B\u001a\u00020<8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0018\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010E\u001a\u00020<8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010=\u001a\u0004\bC\u0010?\"\u0004\bD\u0010AR\"\u0010H\u001a\u00020<8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010=\u001a\u0004\bF\u0010?\"\u0004\bG\u0010AR\"\u0010O\u001a\u00020I8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\u0016\u0010R\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010QR\u0018\u0010U\u001a\u0004\u0018\u00010\u00148\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bS\u0010T¨\u0006V"}, m87232d2 = {"Lcom/p1/mobile/putong/core/newui/onlinezone/OnlineZoneItemView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "Lcom/p1/mobile/android/app/Act;", "c", "()Lcom/p1/mobile/android/app/Act;", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "Lcom/p1/mobile/putong/data/User;", "user", "", "hasPrivilege", Constants.INAPP_DATA_TAG, "(Lcom/p1/mobile/putong/data/User;Z)V", "Ll/d30;", "action", "setSuperLikeClickAction", "(Ll/d30;)V", "Landroid/view/View;", OMSTemplateModeType.view, "b", "(Landroid/view/View;)V", "g", "(Lcom/p1/mobile/putong/data/User;)V", "e", "f", "Lv/VDraweeView;", "a", "Lv/VDraweeView;", "get_image", "()Lv/VDraweeView;", "set_image", "(Lv/VDraweeView;)V", "_image", "Lv/VLinear;", "Lv/VLinear;", "get_user_info", "()Lv/VLinear;", "set_user_info", "(Lv/VLinear;)V", "_user_info", "Lv/VImage;", "Lv/VImage;", "get_super_like_tag", "()Lv/VImage;", "set_super_like_tag", "(Lv/VImage;)V", "_super_like_tag", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "get_online_tip", "()Landroid/widget/TextView;", "set_online_tip", "(Landroid/widget/TextView;)V", "_online_tip", "get_user_name", "set_user_name", "_user_name", "get_blur_online_tip", "set_blur_online_tip", "_blur_online_tip", "Landroid/widget/ImageView;", "Landroid/widget/ImageView;", "get_super_like", "()Landroid/widget/ImageView;", "set_super_like", "(Landroid/widget/ImageView;)V", "_super_like", "h", "Z", "shouldBlur", RXScreenCaptureService.KEY_INDEX, "Lcom/p1/mobile/putong/data/User;", "mUser", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class OnlineZoneItemView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public VDraweeView _image;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VLinear _user_info;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VImage _super_like_tag;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public TextView _online_tip;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public TextView _user_name;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public TextView _blur_online_tip;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public ImageView _super_like;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public boolean shouldBlur;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @JvmField
    @Nullable
    public User mUser;

    public /* synthetic */ OnlineZoneItemView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: a */
    public static void m43054a(d30 d30Var, View view) {
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m43055b(View view) {
        rn50.m180063a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final Act m43056c() {
        Activity activityM208326D = xdl0.m208326D(getContext());
        activityM208326D.getClass();
        return (Act) activityM208326D;
    }

    /* JADX INFO: renamed from: d */
    public final void m43057d(@NotNull User user, boolean hasPrivilege) {
        user.getClass();
        this.shouldBlur = !hasPrivilege;
        this.mUser = user;
        if (hasPrivilege) {
            qib0.f154691G.m102335N0(get_image(), user.m60124fp().profile480().formatted(), false);
        } else {
            qib0.f154691G.m102336O(get_image(), user.m60124fp().profileBig().formatted(), 4, 30);
        }
        m43060g(user);
        m43058e(user);
        m43059f(user);
    }

    /* JADX INFO: renamed from: e */
    public final void m43058e(User user) {
        RelationshipExtensions relationshipExtensions;
        if (this.shouldBlur) {
            xdl0.m208344M(get_user_info(), false);
            return;
        }
        get_super_like_tag().setImageResource(TEnum.equals(user.gender, "female") ? b3c0.f72864G1 : b3c0.f72871H1);
        VImage vImage = get_super_like_tag();
        Relationship relationship = user.localRelationship;
        xdl0.m208344M(vImage, TEnum.equals((relationship == null || (relationshipExtensions = relationship.relationshipExtensions) == null) ? null : relationshipExtensions.relationType, RelationshipStatus.SUPERLIKED));
        get_user_name().setText(user.name);
        xdl0.m208344M(get_user_info(), true);
    }

    /* JADX INFO: renamed from: f */
    public final void m43059f(User user) {
        RelationshipExtensions relationshipExtensions;
        if (this.shouldBlur) {
            xdl0.m208344M(get_super_like(), false);
            return;
        }
        ImageView imageView = get_super_like();
        Relationship relationship = user.localRelationship;
        xdl0.m208344M(imageView, !TEnum.equals((relationship == null || (relationshipExtensions = relationship.relationshipExtensions) == null) ? null : relationshipExtensions.relationType, RelationshipStatus.SUPERLIKED));
    }

    /* JADX INFO: renamed from: g */
    public final void m43060g(User user) {
        if (CoreModule.f17545c.f19561E0.m203800w3(user)) {
            xdl0.m208344M(get_online_tip(), false);
            xdl0.m208344M(get_blur_online_tip(), false);
            return;
        }
        xdl0.m208344M(get_blur_online_tip(), this.shouldBlur);
        xdl0.m208344M(get_online_tip(), !this.shouldBlur);
        String string = m43056c().getString(R$string.f20677q1);
        string.getClass();
        if (TextUtils.equals(string, mqi0.m155932G(user.location.updatedTime))) {
            get_online_tip().setText("当前在线");
            get_online_tip().setCompoundDrawablesWithIntrinsicBounds(b3c0.f73096l5, 0, 0, 0);
            get_blur_online_tip().setText("当前在线");
            get_blur_online_tip().setCompoundDrawablesWithIntrinsicBounds(b3c0.f73096l5, 0, 0, 0);
            return;
        }
        get_online_tip().setText("刚刚在线");
        get_online_tip().setCompoundDrawables(null, null, null, null);
        get_blur_online_tip().setText("刚刚在线");
        get_blur_online_tip().setCompoundDrawables(null, null, null, null);
    }

    @NotNull
    public final TextView get_blur_online_tip() {
        TextView textView = this._blur_online_tip;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_blur_online_tip");
        return null;
    }

    @NotNull
    public final VDraweeView get_image() {
        VDraweeView vDraweeView = this._image;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m87502r("_image");
        return null;
    }

    @NotNull
    public final TextView get_online_tip() {
        TextView textView = this._online_tip;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_online_tip");
        return null;
    }

    @NotNull
    public final ImageView get_super_like() {
        ImageView imageView = this._super_like;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.m87502r("_super_like");
        return null;
    }

    @NotNull
    public final VImage get_super_like_tag() {
        VImage vImage = this._super_like_tag;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_super_like_tag");
        return null;
    }

    @NotNull
    public final VLinear get_user_info() {
        VLinear vLinear = this._user_info;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m87502r("_user_info");
        return null;
    }

    @NotNull
    public final TextView get_user_name() {
        TextView textView = this._user_name;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_user_name");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m43055b(this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(widthMeasureSpec) * 1.33f), 1073741824));
    }

    public final void setSuperLikeClickAction(@Nullable final d30 action) {
        xdl0.m208342L(get_super_like(), new View.OnClickListener() { // from class: l.qn50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                OnlineZoneItemView.m43054a(action, view);
            }
        });
    }

    public final void set_blur_online_tip(@NotNull TextView textView) {
        textView.getClass();
        this._blur_online_tip = textView;
    }

    public final void set_image(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._image = vDraweeView;
    }

    public final void set_online_tip(@NotNull TextView textView) {
        textView.getClass();
        this._online_tip = textView;
    }

    public final void set_super_like(@NotNull ImageView imageView) {
        imageView.getClass();
        this._super_like = imageView;
    }

    public final void set_super_like_tag(@NotNull VImage vImage) {
        vImage.getClass();
        this._super_like_tag = vImage;
    }

    public final void set_user_info(@NotNull VLinear vLinear) {
        vLinear.getClass();
        this._user_info = vLinear;
    }

    public final void set_user_name(@NotNull TextView textView) {
        textView.getClass();
        this._user_name = textView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OnlineZoneItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OnlineZoneItemView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public OnlineZoneItemView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
