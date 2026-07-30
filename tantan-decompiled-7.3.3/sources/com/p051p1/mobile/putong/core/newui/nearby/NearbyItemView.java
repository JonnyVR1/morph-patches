package com.p051p1.mobile.putong.core.newui.nearby;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.member.R$string;
import com.p051p1.mobile.putong.core.newui.nearby.NearbyItemView;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p153l.bnl0;
import p153l.gbc0;
import p153l.mg20;
import p153l.pzi0;
import p153l.rs9;
import p153l.uqb0;
import p153l.x20;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0016\u0010\u0010J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010 \u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0015\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020\u0006¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\f2\b\u0010'\u001a\u0004\u0018\u00010&¢\u0006\u0004\b(\u0010)R\"\u00101\u001a\u00020*8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u00108\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\"\u0010?\u001a\u0002098\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0018\u0010:\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\"\u0010B\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u00103\u001a\u0004\b@\u00105\"\u0004\bA\u00107R\"\u0010E\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b \u00103\u001a\u0004\bC\u00105\"\u0004\bD\u00107R\"\u0010H\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u000f\u00103\u001a\u0004\bF\u00105\"\u0004\bG\u00107R\"\u0010O\u001a\u00020I8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR\"\u0010V\u001a\u00020P8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR\"\u0010Z\u001a\u00020P8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bW\u0010Q\u001a\u0004\bX\u0010S\"\u0004\bY\u0010UR\u0016\u0010]\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010`\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0018\u0010c\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\ba\u0010b¨\u0006d"}, m88121d2 = {"Lcom/p1/mobile/putong/core/newui/nearby/NearbyItemView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "b", "(Landroid/view/View;)V", "f", "()V", "Lcom/p1/mobile/putong/data/User;", "user", "h", "(Lcom/p1/mobile/putong/data/User;)V", "g", "onFinishInflate", "Lcom/p1/mobile/android/app/Act;", "c", "()Lcom/p1/mobile/android/app/Act;", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "", "hasPrivilege", "e", "(Lcom/p1/mobile/putong/data/User;Z)V", "distance", "", Constants.INAPP_DATA_TAG, "(I)Ljava/lang/String;", "Ll/x20;", "action", "setPairingClickAction", "(Ll/x20;)V", "Lv/VDraweeView;", "a", "Lv/VDraweeView;", "get_image", "()Lv/VDraweeView;", "set_image", "(Lv/VDraweeView;)V", "_image", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "get_online_tip", "()Landroid/widget/TextView;", "set_online_tip", "(Landroid/widget/TextView;)V", "_online_tip", "Lv/VLinear;", "Lv/VLinear;", "get_user_info", "()Lv/VLinear;", "set_user_info", "(Lv/VLinear;)V", "_user_info", "get_user_distance", "set_user_distance", "_user_distance", "get_user_name", "set_user_name", "_user_name", "get_blur_desc", "set_blur_desc", "_blur_desc", "Landroid/widget/ImageView;", "Landroid/widget/ImageView;", "get_pairing", "()Landroid/widget/ImageView;", "set_pairing", "(Landroid/widget/ImageView;)V", "_pairing", "Lv/VImage;", "Lv/VImage;", "get_dislike", "()Lv/VImage;", "set_dislike", "(Lv/VImage;)V", "_dislike", RXScreenCaptureService.KEY_INDEX, "get_like", "set_like", "_like", "j", "Z", "shouldBlur", "k", "I", "MINUTE_16", BLiveStormDanmakuGiftResourceType.f45292l, "Lcom/p1/mobile/putong/data/User;", "mUser", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class NearbyItemView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public VDraweeView _image;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public TextView _online_tip;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VLinear _user_info;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public TextView _user_distance;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public TextView _user_name;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public TextView _blur_desc;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public ImageView _pairing;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VImage _dislike;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public VImage _like;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public boolean shouldBlur;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public final int MINUTE_16;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @JvmField
    @Nullable
    public User mUser;

    public /* synthetic */ NearbyItemView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: a */
    public static void m43721a(x20 x20Var, View view) {
        if (x20Var != null) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m43722b(View view) {
        mg20.m158184a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final Act m43723c() {
        Activity activityM105506D = bnl0.m105506D(getContext());
        activityM105506D.getClass();
        return (Act) activityM105506D;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final String m43724d(int distance) {
        String strValueOf;
        String str = "km";
        if (distance >= 10000) {
            strValueOf = "10+";
        } else if (distance >= 1000) {
            strValueOf = String.valueOf(distance / 1000);
        } else {
            str = "m";
            strValueOf = distance >= 100 ? String.valueOf(distance) : "100";
        }
        return strValueOf + str;
    }

    /* JADX INFO: renamed from: e */
    public final void m43725e(@NotNull User user, boolean hasPrivilege) {
        user.getClass();
        this.shouldBlur = !hasPrivilege;
        this.mUser = user;
        bnl0.m105524M(get_like(), false);
        bnl0.m105524M(get_dislike(), false);
        if (this.shouldBlur) {
            uqb0.f180374G.m127120O(get_image(), user.m61308fp().profileBig().formatted(), 4, 30);
        } else {
            uqb0.f180374G.m127119N0(get_image(), user.m61308fp().profile480().formatted(), false);
        }
        m43728h(user);
        m43727g(user);
        m43726f();
    }

    /* JADX INFO: renamed from: f */
    public final void m43726f() {
        if (this.shouldBlur) {
            bnl0.m105524M(get_pairing(), false);
        } else {
            bnl0.m105524M(get_pairing(), true);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m43727g(User user) {
        if (this.shouldBlur) {
            get_blur_desc().setText(m43724d(user.location.distance));
            bnl0.m105524M(get_user_info(), false);
            bnl0.m105524M(get_blur_desc(), true);
        } else {
            get_user_name().setText(user.name);
            get_user_distance().setText(m43724d(user.location.distance));
            bnl0.m105524M(get_user_info(), true);
            bnl0.m105524M(get_blur_desc(), false);
        }
    }

    @NotNull
    public final TextView get_blur_desc() {
        TextView textView = this._blur_desc;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_blur_desc");
        return null;
    }

    @NotNull
    public final VImage get_dislike() {
        VImage vImage = this._dislike;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_dislike");
        return null;
    }

    @NotNull
    public final VDraweeView get_image() {
        VDraweeView vDraweeView = this._image;
        if (vDraweeView != null) {
            return vDraweeView;
        }
        Intrinsics.m88391r("_image");
        return null;
    }

    @NotNull
    public final VImage get_like() {
        VImage vImage = this._like;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_like");
        return null;
    }

    @NotNull
    public final TextView get_online_tip() {
        TextView textView = this._online_tip;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_online_tip");
        return null;
    }

    @NotNull
    public final ImageView get_pairing() {
        ImageView imageView = this._pairing;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.m88391r("_pairing");
        return null;
    }

    @NotNull
    public final TextView get_user_distance() {
        TextView textView = this._user_distance;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_user_distance");
        return null;
    }

    @NotNull
    public final VLinear get_user_info() {
        VLinear vLinear = this._user_info;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_user_info");
        return null;
    }

    @NotNull
    public final TextView get_user_name() {
        TextView textView = this._user_name;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_user_name");
        return null;
    }

    /* JADX INFO: renamed from: h */
    public final void m43728h(User user) {
        boolean zM141088w3 = CoreModule.f18264c.f20303E0.m141088w3(user);
        double dM174454o = pzi0.m174454o() - user.location.updatedTime;
        if (rs9.INSTANCE.m182943c() || zM141088w3 || dM174454o >= this.MINUTE_16) {
            bnl0.m105524M(get_online_tip(), false);
            return;
        }
        bnl0.m105524M(get_online_tip(), true);
        String string = m43723c().getString(R$string.f21419q1);
        string.getClass();
        String strM174442G = pzi0.m174442G(user.location.updatedTime);
        if (TextUtils.equals(string, strM174442G)) {
            get_online_tip().setText("当前在线");
            get_online_tip().setCompoundDrawablesWithIntrinsicBounds(gbc0.f103347l5, 0, 0, 0);
        } else {
            TextView textView = get_online_tip();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            textView.setText(String.format("%s活跃", Arrays.copyOf(new Object[]{strM174442G}, 1)));
            get_online_tip().setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m43722b(this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(widthMeasureSpec) * 1.33f), 1073741824));
    }

    public final void setPairingClickAction(@Nullable final x20 action) {
        bnl0.m105522L(get_pairing(), new View.OnClickListener() { // from class: l.lg20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NearbyItemView.m43721a(action, view);
            }
        });
    }

    public final void set_blur_desc(@NotNull TextView textView) {
        textView.getClass();
        this._blur_desc = textView;
    }

    public final void set_dislike(@NotNull VImage vImage) {
        vImage.getClass();
        this._dislike = vImage;
    }

    public final void set_image(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._image = vDraweeView;
    }

    public final void set_like(@NotNull VImage vImage) {
        vImage.getClass();
        this._like = vImage;
    }

    public final void set_online_tip(@NotNull TextView textView) {
        textView.getClass();
        this._online_tip = textView;
    }

    public final void set_pairing(@NotNull ImageView imageView) {
        imageView.getClass();
        this._pairing = imageView;
    }

    public final void set_user_distance(@NotNull TextView textView) {
        textView.getClass();
        this._user_distance = textView;
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
    public NearbyItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NearbyItemView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.MINUTE_16 = 960000;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public NearbyItemView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
