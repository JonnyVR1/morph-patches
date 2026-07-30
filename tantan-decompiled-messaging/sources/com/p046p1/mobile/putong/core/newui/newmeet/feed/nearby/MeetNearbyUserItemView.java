package com.p046p1.mobile.putong.core.newui.newmeet.feed.nearby;

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
import com.p046p1.mobile.putong.core.newui.newmeet.feed.nearby.MeetNearbyUserItemView;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p149l.b3c0;
import p149l.d30;
import p149l.mqi0;
import p149l.n5y;
import p149l.qib0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\f2\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u001f\u0010 J%\u0010\"\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010!\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\"\u0010#J\u0015\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020\u0006¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\f2\b\u0010)\u001a\u0004\u0018\u00010(¢\u0006\u0004\b*\u0010+R\"\u00103\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010:\u001a\u0002048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\r\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010A\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001b\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010D\u001a\u0002048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u00105\u001a\u0004\bB\u00107\"\u0004\bC\u00109R\"\u0010G\u001a\u0002048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\"\u00105\u001a\u0004\bE\u00107\"\u0004\bF\u00109R\"\u0010J\u001a\u0002048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0011\u00105\u001a\u0004\bH\u00107\"\u0004\bI\u00109R\"\u0010Q\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010X\u001a\u00020R8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0015\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010\\\u001a\u00020R8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bY\u0010S\u001a\u0004\bZ\u0010U\"\u0004\b[\u0010WR\u0016\u0010_\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0014\u0010b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0018\u0010e\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bc\u0010d¨\u0006f"}, m87232d2 = {"Lcom/p1/mobile/putong/core/newui/newmeet/feed/nearby/MeetNearbyUserItemView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "b", "(Landroid/view/View;)V", "", "fromMyTab", "f", "(Z)V", "Lcom/p1/mobile/putong/data/User;", "user", "h", "(Lcom/p1/mobile/putong/data/User;)V", "g", "onFinishInflate", "()V", "Lcom/p1/mobile/android/app/Act;", "c", "()Lcom/p1/mobile/android/app/Act;", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "hasPrivilege", "e", "(Lcom/p1/mobile/putong/data/User;ZZ)V", "distance", "", Constants.INAPP_DATA_TAG, "(I)Ljava/lang/String;", "Ll/d30;", "action", "setPairingClickAction", "(Ll/d30;)V", "Lv/VDraweeView;", "a", "Lv/VDraweeView;", "get_image", "()Lv/VDraweeView;", "set_image", "(Lv/VDraweeView;)V", "_image", "Landroid/widget/TextView;", "Landroid/widget/TextView;", "get_online_tip", "()Landroid/widget/TextView;", "set_online_tip", "(Landroid/widget/TextView;)V", "_online_tip", "Lv/VLinear;", "Lv/VLinear;", "get_user_info", "()Lv/VLinear;", "set_user_info", "(Lv/VLinear;)V", "_user_info", "get_user_distance", "set_user_distance", "_user_distance", "get_user_name", "set_user_name", "_user_name", "get_blur_desc", "set_blur_desc", "_blur_desc", "Landroid/widget/ImageView;", "Landroid/widget/ImageView;", "get_pairing", "()Landroid/widget/ImageView;", "set_pairing", "(Landroid/widget/ImageView;)V", "_pairing", "Lv/VImage;", "Lv/VImage;", "get_dislike", "()Lv/VImage;", "set_dislike", "(Lv/VImage;)V", "_dislike", RXScreenCaptureService.KEY_INDEX, "get_like", "set_like", "_like", "j", "Z", "shouldBlur", "k", "I", "MINUTE_16", BLiveStormDanmakuGiftResourceType.f44444l, "Lcom/p1/mobile/putong/data/User;", "mUser", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class MeetNearbyUserItemView extends FrameLayout {

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

    public /* synthetic */ MeetNearbyUserItemView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: a */
    public static void m42919a(d30 d30Var, View view) {
        if (d30Var != null) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m42920b(View view) {
        n5y.m158022a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final Act m42921c() {
        Activity activityM208326D = xdl0.m208326D(getContext());
        activityM208326D.getClass();
        return (Act) activityM208326D;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final String m42922d(int distance) {
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
    public final void m42923e(@NotNull User user, boolean hasPrivilege, boolean fromMyTab) {
        user.getClass();
        this.shouldBlur = !hasPrivilege;
        this.mUser = user;
        xdl0.m208344M(get_like(), false);
        xdl0.m208344M(get_dislike(), false);
        if (this.shouldBlur) {
            qib0.f154691G.m102336O(get_image(), user.m60124fp().profile480().formatted(), 4, 30);
        } else {
            qib0.f154691G.m102335N0(get_image(), user.m60124fp().profile480().formatted(), false);
        }
        m42926h(user);
        m42925g(user);
        m42924f(fromMyTab);
    }

    /* JADX INFO: renamed from: f */
    public final void m42924f(boolean fromMyTab) {
        if (this.shouldBlur) {
            xdl0.m208344M(get_pairing(), false);
            return;
        }
        if (fromMyTab && CoreModule.m29935P().m94651a().mo33606v4()) {
            get_pairing().setImageResource(b3c0.f73148s1);
        }
        xdl0.m208344M(get_pairing(), true);
    }

    /* JADX INFO: renamed from: g */
    public final void m42925g(User user) {
        if (this.shouldBlur) {
            get_blur_desc().setText(m42922d(user.location.distance));
            xdl0.m208344M(get_user_info(), false);
            xdl0.m208344M(get_blur_desc(), true);
        } else {
            get_user_name().setText(user.name);
            get_user_distance().setText(m42922d(user.location.distance));
            xdl0.m208344M(get_user_info(), true);
            xdl0.m208344M(get_blur_desc(), false);
        }
    }

    @NotNull
    public final TextView get_blur_desc() {
        TextView textView = this._blur_desc;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_blur_desc");
        return null;
    }

    @NotNull
    public final VImage get_dislike() {
        VImage vImage = this._dislike;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_dislike");
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
    public final VImage get_like() {
        VImage vImage = this._like;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_like");
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
    public final ImageView get_pairing() {
        ImageView imageView = this._pairing;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.m87502r("_pairing");
        return null;
    }

    @NotNull
    public final TextView get_user_distance() {
        TextView textView = this._user_distance;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_user_distance");
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

    /* JADX INFO: renamed from: h */
    public final void m42926h(User user) {
        boolean zM203800w3 = CoreModule.f17545c.f19561E0.m203800w3(user);
        double dM155944o = mqi0.m155944o() - user.location.updatedTime;
        if (zM203800w3 || dM155944o >= this.MINUTE_16) {
            xdl0.m208344M(get_online_tip(), false);
            return;
        }
        xdl0.m208344M(get_online_tip(), true);
        String string = m42921c().getString(R$string.f20677q1);
        string.getClass();
        String strM155932G = mqi0.m155932G(user.location.updatedTime);
        if (TextUtils.equals(string, strM155932G)) {
            get_online_tip().setText("当前在线");
            get_online_tip().setCompoundDrawablesWithIntrinsicBounds(b3c0.f73096l5, 0, 0, 0);
        } else {
            TextView textView = get_online_tip();
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            textView.setText(String.format("%s活跃", Arrays.copyOf(new Object[]{strM155932G}, 1)));
            get_online_tip().setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m42920b(this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec((int) (View.MeasureSpec.getSize(widthMeasureSpec) * 1.33f), 1073741824));
    }

    public final void setPairingClickAction(@Nullable final d30 action) {
        xdl0.m208342L(get_pairing(), new View.OnClickListener() { // from class: l.m5y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MeetNearbyUserItemView.m42919a(action, view);
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
    public MeetNearbyUserItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MeetNearbyUserItemView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.MINUTE_16 = 960000;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MeetNearbyUserItemView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
