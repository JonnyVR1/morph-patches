package com.p046p1.mobile.putong.core.newui.supreme;

import android.content.Context;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.newui.supreme.SupremeUserHeaderView;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VLinear;
import p147v.VText;
import p149l.d30;
import p149l.r1h0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B)\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0012\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010)\u001a\u00020\u001e8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b&\u0010 \u001a\u0004\b'\u0010\"\"\u0004\b(\u0010$R\"\u0010/\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0016\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\"\u00102\u001a\u00020\u00188\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0012\u0010*\u001a\u0004\b0\u0010,\"\u0004\b1\u0010.R\"\u0010:\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010A\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u001c\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010I\u001a\u00020B8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010H¨\u0006J"}, m87232d2 = {"Lcom/p1/mobile/putong/core/newui/supreme/SupremeUserHeaderView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "", "isEmpty", "hasIdealTypesSelected", Constants.INAPP_DATA_TAG, "(Lcom/p1/mobile/android/app/Act;ZZ)V", "Landroid/view/View;", OMSTemplateModeType.view, "c", "(Landroid/view/View;)V", "Landroid/widget/TextView;", "textView", "", "colors", "f", "(Landroid/widget/TextView;[I)V", "Landroid/widget/RelativeLayout;", "a", "Landroid/widget/RelativeLayout;", "get_custom_layout", "()Landroid/widget/RelativeLayout;", "set_custom_layout", "(Landroid/widget/RelativeLayout;)V", "_custom_layout", "b", "get_custom_layout_rl_content", "set_custom_layout_rl_content", "_custom_layout_rl_content", "Landroid/widget/TextView;", "get_custom_layout_rl_content_title", "()Landroid/widget/TextView;", "set_custom_layout_rl_content_title", "(Landroid/widget/TextView;)V", "_custom_layout_rl_content_title", "get_custom_layout_rl_content_subtitle", "set_custom_layout_rl_content_subtitle", "_custom_layout_rl_content_subtitle", "Landroid/widget/ImageView;", "e", "Landroid/widget/ImageView;", "get_custom_layout_image", "()Landroid/widget/ImageView;", "set_custom_layout_image", "(Landroid/widget/ImageView;)V", "_custom_layout_image", "Lv/VLinear;", "Lv/VLinear;", "get_empty", "()Lv/VLinear;", "set_empty", "(Lv/VLinear;)V", "_empty", "Lv/VText;", "g", "Lv/VText;", "get_empty_tip", "()Lv/VText;", "set_empty_tip", "(Lv/VText;)V", "_empty_tip", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class SupremeUserHeaderView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public RelativeLayout _custom_layout;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public RelativeLayout _custom_layout_rl_content;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public TextView _custom_layout_rl_content_title;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public TextView _custom_layout_rl_content_subtitle;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public ImageView _custom_layout_image;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VLinear _empty;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VText _empty_tip;

    public /* synthetic */ SupremeUserHeaderView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: a */
    public static void m43668a(final Act act, View view) {
        if (CoreModule.f17545c.f19644f2.m148613u3() != null && CoreModule.f17545c.f19644f2.m148613u3().hasIdealTypesSelected()) {
            CoreModule.f17545c.f19644f2.m148607L3(act, new d30() { // from class: l.q1h0
                @Override // p149l.d30
                public final void call() {
                    SupremeUserHeaderView.m43670e(act);
                }
            });
        } else if (act != null) {
            act.startActivity(SupremeCustomAct.Companion.m43600c(SupremeCustomAct.INSTANCE, act, 0, 2, null));
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m43670e(Act act) {
        if (act != null) {
            act.startActivity(SupremeCustomAct.Companion.m43600c(SupremeCustomAct.INSTANCE, act, 0, 2, null));
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m43671c(View view) {
        r1h0.m177464a(this, view);
    }

    /* JADX INFO: renamed from: d */
    public final void m43672d(@Nullable final Act act, boolean isEmpty, boolean hasIdealTypesSelected) {
        xdl0.m208329E0(get_custom_layout(), new View.OnClickListener() { // from class: l.p1h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SupremeUserHeaderView.m43668a(act, view);
            }
        });
        if (!isEmpty) {
            get_empty().setVisibility(8);
            return;
        }
        get_empty().setVisibility(0);
        if (hasIdealTypesSelected) {
            get_empty_tip().setText("私人助理暂时没有找到符合您私人定制的用户，点击右上角可放宽私人定制条件");
        } else {
            get_empty_tip().setText("您还没有完成私人定制，请点击右上角进行设置");
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m43673f(TextView textView, int[] colors) {
        textView.getPaint().setShader(new LinearGradient(0.0f, 0.0f, textView.getPaint().getTextSize() * textView.getText().length(), 0.0f, colors, new float[]{0.0f, 0.7f, 1.0f}, Shader.TileMode.CLAMP));
        textView.invalidate();
    }

    @NotNull
    public final RelativeLayout get_custom_layout() {
        RelativeLayout relativeLayout = this._custom_layout;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        Intrinsics.m87502r("_custom_layout");
        return null;
    }

    @NotNull
    public final ImageView get_custom_layout_image() {
        ImageView imageView = this._custom_layout_image;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.m87502r("_custom_layout_image");
        return null;
    }

    @NotNull
    public final RelativeLayout get_custom_layout_rl_content() {
        RelativeLayout relativeLayout = this._custom_layout_rl_content;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        Intrinsics.m87502r("_custom_layout_rl_content");
        return null;
    }

    @NotNull
    public final TextView get_custom_layout_rl_content_subtitle() {
        TextView textView = this._custom_layout_rl_content_subtitle;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_custom_layout_rl_content_subtitle");
        return null;
    }

    @NotNull
    public final TextView get_custom_layout_rl_content_title() {
        TextView textView = this._custom_layout_rl_content_title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_custom_layout_rl_content_title");
        return null;
    }

    @NotNull
    public final VLinear get_empty() {
        VLinear vLinear = this._empty;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m87502r("_empty");
        return null;
    }

    @NotNull
    public final VText get_empty_tip() {
        VText vText = this._empty_tip;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_empty_tip");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m43671c(this);
        m43673f(get_custom_layout_rl_content_title(), new int[]{Color.parseColor("#C5AD7D"), Color.parseColor("#F9ECCA"), Color.parseColor("#C5AD7D")});
        m43673f(get_custom_layout_rl_content_subtitle(), new int[]{Color.parseColor("#B3C5AD7D"), Color.parseColor("#B3F9ECCA"), Color.parseColor("#B3C5AD7D")});
    }

    public final void set_custom_layout(@NotNull RelativeLayout relativeLayout) {
        relativeLayout.getClass();
        this._custom_layout = relativeLayout;
    }

    public final void set_custom_layout_image(@NotNull ImageView imageView) {
        imageView.getClass();
        this._custom_layout_image = imageView;
    }

    public final void set_custom_layout_rl_content(@NotNull RelativeLayout relativeLayout) {
        relativeLayout.getClass();
        this._custom_layout_rl_content = relativeLayout;
    }

    public final void set_custom_layout_rl_content_subtitle(@NotNull TextView textView) {
        textView.getClass();
        this._custom_layout_rl_content_subtitle = textView;
    }

    public final void set_custom_layout_rl_content_title(@NotNull TextView textView) {
        textView.getClass();
        this._custom_layout_rl_content_title = textView;
    }

    public final void set_empty(@NotNull VLinear vLinear) {
        vLinear.getClass();
        this._empty = vLinear;
    }

    public final void set_empty_tip(@NotNull VText vText) {
        vText.getClass();
        this._empty_tip = vText;
    }

    @JvmOverloads
    public SupremeUserHeaderView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @JvmOverloads
    public SupremeUserHeaderView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @JvmOverloads
    public SupremeUserHeaderView(@Nullable Context context) {
        this(context, null, 0, 6, null);
    }
}
