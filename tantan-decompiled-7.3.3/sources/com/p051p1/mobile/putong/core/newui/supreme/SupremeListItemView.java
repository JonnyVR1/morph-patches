package com.p051p1.mobile.putong.core.newui.supreme;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.newui.supreme.SupremeListItemView;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.User;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear_FillerMeasure;
import p153l.bnl0;
import p153l.i4g0;
import p153l.jyb;
import p153l.u8h0;
import p153l.uqb0;
import p153l.x20;
import p153l.y6b;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\n2\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010'\u001a\u00020 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\"\u0010/\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00106\u001a\u0002008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001e\u00101\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\"\u00109\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0012\u0010*\u001a\u0004\b7\u0010,\"\u0004\b8\u0010.R\"\u0010<\u001a\u00020(8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001a\u0010*\u001a\u0004\b:\u0010,\"\u0004\b;\u0010.R\"\u0010D\u001a\u00020=8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010C¨\u0006E"}, m88121d2 = {"Lcom/p1/mobile/putong/core/newui/supreme/SupremeListItemView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "Lcom/p1/mobile/android/app/Act;", Constants.INAPP_DATA_TAG, "()Lcom/p1/mobile/android/app/Act;", "Ll/y6b$a;", "data", "", "hasSupremePartner", "", "pageId", "e", "(Ll/y6b$a;ZLjava/lang/String;)V", "Landroid/view/View;", OMSTemplateModeType.view, "c", "(Landroid/view/View;)V", "Lv/VDraweeView;", "a", "Lv/VDraweeView;", "get_image", "()Lv/VDraweeView;", "set_image", "(Lv/VDraweeView;)V", "_image", "Landroid/widget/TextView;", "b", "Landroid/widget/TextView;", "get_tag", "()Landroid/widget/TextView;", "set_tag", "(Landroid/widget/TextView;)V", "_tag", "Lv/VLinear_FillerMeasure;", "Lv/VLinear_FillerMeasure;", "get_user_info", "()Lv/VLinear_FillerMeasure;", "set_user_info", "(Lv/VLinear_FillerMeasure;)V", "_user_info", "get_user_name", "set_user_name", "_user_name", "get_user_age", "set_user_age", "_user_age", "Lv/VImage;", "f", "Lv/VImage;", "get_like_image", "()Lv/VImage;", "set_like_image", "(Lv/VImage;)V", "_like_image", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
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
    public static void m44801a(String str, y6b.C21531a c21531a, final SupremeListItemView supremeListItemView, View view) {
        i4g0.m138523u("e_odiamond_sayhi", str, jyb.m147494Y("other_user_id", c21531a.f197670a.f56859id));
        CoreModule.m30933P().m143405a().mo34308Dl(supremeListItemView.m44805d(), c21531a.f197670a, "", new x20() { // from class: l.t8h0
            @Override // p153l.x20
            public final void call() {
                SupremeListItemView.m44803f(this.f172534a);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public static final void m44803f(SupremeListItemView supremeListItemView) {
        bnl0.m105524M(supremeListItemView.get_like_image(), false);
    }

    /* JADX INFO: renamed from: c */
    public final void m44804c(View view) {
        u8h0.m195040a(this, view);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final Act m44805d() {
        Activity activityM105506D = bnl0.m105506D(getContext());
        activityM105506D.getClass();
        return (Act) activityM105506D;
    }

    @SuppressLint({"SetTextI18n"})
    /* JADX INFO: renamed from: e */
    public final void m44806e(@NotNull final y6b.C21531a data, boolean hasSupremePartner, @Nullable final String pageId) {
        data.getClass();
        if (hasSupremePartner) {
            uqb0.f180374G.m127119N0(get_image(), data.f197670a.m61308fp().profile480().formatted(), false);
        } else {
            uqb0.f180374G.m127120O(get_image(), data.f197670a.m61308fp().profileBig().formatted(), 4, 30);
        }
        if (CoreModule.m30930K().mo31822sg(data.f197670a.f56859id) || User.isMatched(data.f197670a)) {
            bnl0.m105524M(get_like_image(), false);
        } else {
            bnl0.m105524M(get_like_image(), true);
        }
        if (hasSupremePartner) {
            bnl0.m105509E0(get_like_image(), new View.OnClickListener() { // from class: l.s8h0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SupremeListItemView.m44801a(pageId, data, this, view);
                }
            });
        }
        if (jyb.m147479J(data.f197671b)) {
            get_tag().setVisibility(8);
        } else {
            get_tag().setVisibility(0);
            if (data.f197671b.size() == 1) {
                get_tag().setText(data.f197671b.get(0));
            } else {
                get_tag().setText("满足" + data.f197671b.size() + "个定制");
            }
        }
        get_user_name().setText(data.f197670a.name);
        Integer num = data.f197670a.age;
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
        Intrinsics.m88391r("_image");
        return null;
    }

    @NotNull
    public final VImage get_like_image() {
        VImage vImage = this._like_image;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_like_image");
        return null;
    }

    @NotNull
    public final TextView get_tag() {
        TextView textView = this._tag;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_tag");
        return null;
    }

    @NotNull
    public final TextView get_user_age() {
        TextView textView = this._user_age;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_user_age");
        return null;
    }

    @NotNull
    public final VLinear_FillerMeasure get_user_info() {
        VLinear_FillerMeasure vLinear_FillerMeasure = this._user_info;
        if (vLinear_FillerMeasure != null) {
            return vLinear_FillerMeasure;
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

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m44804c(this);
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
