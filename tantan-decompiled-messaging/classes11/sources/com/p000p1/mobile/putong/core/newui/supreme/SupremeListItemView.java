package com.p000p1.mobile.putong.core.newui.supreme;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.newui.supreme.SupremeListItemView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.data.User;
import com.sina.weibo.sdk.web.WebPicUploadResult;
import com.tantanapp.common.data.DbObject;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l.d30;
import l.j760;
import l.l5b;
import l.m0h0;
import l.qib0;
import l.vwb;
import l.xdl0;
import l.zvf0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import v.VDraweeView;
import v.VImage;
import v.VLinear_FillerMeasure;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010'\u001a\u00020 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00106\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u00109\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0012\u0010*\u001a\u0004\b7\u0010,\"\u0004\b8\u0010.R\"\u0010<\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001a\u0010*\u001a\u0004\b:\u0010,\"\u0004\b;\u0010.R\"\u0010D\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010C¨\u0006E"}, d2 = {"Lcom/p1/mobile/putong/core/newui/supreme/SupremeListItemView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "Lcom/p1/mobile/android/app/Act;", "d", "()Lcom/p1/mobile/android/app/Act;", "Ll/l5b$a;", WebPicUploadResult.RESP_UPLOAD_PIC_PARAM_DATA, "", "hasSupremePartner", "", "pageId", "e", "(Ll/l5b$a;ZLjava/lang/String;)V", "Landroid/view/View;", "view", "c", "(Landroid/view/View;)V", "Lv/VDraweeView;", "a", "Lv/VDraweeView;", "get_image", "()Lv/VDraweeView;", "set_image", "(Lv/VDraweeView;)V", "_image", "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "get_tag", "()Landroid/widget/TextView;", "set_tag", "(Landroid/widget/TextView;)V", "_tag", "Lv/VLinear_FillerMeasure;", "Lv/VLinear_FillerMeasure;", "get_user_info", "()Lv/VLinear_FillerMeasure;", "set_user_info", "(Lv/VLinear_FillerMeasure;)V", "_user_info", "get_user_name", "set_user_name", "_user_name", "get_user_age", "set_user_age", "_user_age", "Lv/VImage;", "f", "Lv/VImage;", "get_like_image", "()Lv/VImage;", "set_like_image", "(Lv/VImage;)V", "_like_image", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SupremeListItemView extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public VDraweeView _image;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public TextView _tag;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VLinear_FillerMeasure _user_info;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public TextView _user_name;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public TextView _user_age;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VImage _like_image;

    public /* synthetic */ SupremeListItemView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: a */
    public static void m7868a(String str, l5b.a aVar, final SupremeListItemView supremeListItemView, View view) {
        zvf0.u("e_odiamond_sayhi", str, new j760[]{vwb.Y("other_user_id", ((DbObject) aVar.a).id)});
        CoreModule.P().a().Dl(supremeListItemView.m7872d(), aVar.a, "", new d30() { // from class: l.l0h0
            public final void call() {
                SupremeListItemView.m7870f(this.f15904a);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public static final void m7870f(SupremeListItemView supremeListItemView) {
        xdl0.M(supremeListItemView.get_like_image(), false);
    }

    /* JADX INFO: renamed from: c */
    public final void m7871c(View view) {
        m0h0.a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final Act m7872d() {
        Act actD = xdl0.D(getContext());
        actD.getClass();
        return actD;
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: e */
    public final void m7873e(@NotNull final l5b.a data, boolean hasSupremePartner, @Nullable final String pageId) {
        data.getClass();
        if (hasSupremePartner) {
            qib0.G.N0(get_image(), data.a.fp().profile480().formatted(), false);
        } else {
            qib0.G.O(get_image(), data.a.fp().profileBig().formatted(), 4, 30);
        }
        if (CoreModule.K().sg(((DbObject) data.a).id) || User.isMatched(data.a)) {
            xdl0.M(get_like_image(), false);
        } else {
            xdl0.M(get_like_image(), true);
        }
        if (hasSupremePartner) {
            xdl0.E0(get_like_image(), new View.OnClickListener() { // from class: l.k0h0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SupremeListItemView.m7868a(pageId, data, this, view);
                }
            });
        }
        if (vwb.J(data.b)) {
            get_tag().setVisibility(8);
        } else {
            get_tag().setVisibility(0);
            if (data.b.size() == 1) {
                get_tag().setText((CharSequence) data.b.get(0));
            } else {
                get_tag().setText("满足" + data.b.size() + "个定制");
            }
        }
        get_user_name().setText(data.a.name);
        Integer num = data.a.age;
        num.getClass();
        int iIntValue = num.intValue();
        get_user_age().setText(iIntValue + "岁");
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
    public final VImage get_like_image() {
        VImage vImage = this._like_image;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.r("_like_image");
        return null;
    }

    @NotNull
    public final TextView get_tag() {
        TextView textView = this._tag;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_tag");
        return null;
    }

    @NotNull
    public final TextView get_user_age() {
        TextView textView = this._user_age;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_user_age");
        return null;
    }

    @NotNull
    public final VLinear_FillerMeasure get_user_info() {
        VLinear_FillerMeasure vLinear_FillerMeasure = this._user_info;
        if (vLinear_FillerMeasure != null) {
            return vLinear_FillerMeasure;
        }
        Intrinsics.r("_user_info");
        return null;
    }

    @NotNull
    public final TextView get_user_name() {
        TextView textView = this._user_name;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_user_name");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7871c(this);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, View.MeasureSpec.makeMeasureSpec((int) (((double) View.MeasureSpec.getSize(widthMeasureSpec)) * 1.33d), View.MeasureSpec.getMode(heightMeasureSpec)));
    }

    public final void set_image(@NotNull VDraweeView vDraweeView) {
        vDraweeView.getClass();
        this._image = vDraweeView;
    }

    public final void set_like_image(@NotNull VImage vImage) {
        vImage.getClass();
        this._like_image = vImage;
    }

    public final void set_tag(@NotNull TextView textView) {
        textView.getClass();
        this._tag = textView;
    }

    public final void set_user_age(@NotNull TextView textView) {
        textView.getClass();
        this._user_age = textView;
    }

    public final void set_user_info(@NotNull VLinear_FillerMeasure vLinear_FillerMeasure) {
        vLinear_FillerMeasure.getClass();
        this._user_info = vLinear_FillerMeasure;
    }

    public final void set_user_name(@NotNull TextView textView) {
        textView.getClass();
        this._user_name = textView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SupremeListItemView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SupremeListItemView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SupremeListItemView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
