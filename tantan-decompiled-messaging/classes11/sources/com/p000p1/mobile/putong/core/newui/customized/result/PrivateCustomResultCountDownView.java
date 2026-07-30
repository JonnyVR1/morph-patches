package com.p000p1.mobile.putong.core.newui.customized.result;

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
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l.yq80;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p009l.mqi0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B)\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\"\u0010\u001f\u001a\u00020\u00198\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0017\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\"\u0010$\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0013\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010\u000eR\"\u0010(\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\"\"\u0004\b'\u0010\u000eR\"\u0010,\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b)\u0010 \u001a\u0004\b*\u0010\"\"\u0004\b+\u0010\u000eR\"\u00100\u001a\u00020\n8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010 \u001a\u0004\b.\u0010\"\"\u0004\b/\u0010\u000eR\"\u00108\u001a\u0002018\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b2\u00103\u001a\u0004\b4\u00105\"\u0004\b6\u00107¨\u00069"}, d2 = {"Lcom/p1/mobile/putong/core/newui/customized/result/PrivateCustomResultCountDownView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Landroid/widget/TextView;", "textView", "", "setTitleStyles", "(Landroid/widget/TextView;)V", "onFinishInflate", "()V", "", "time", "b", "(J)V", "Landroid/view/View;", "view", "a", "(Landroid/view/View;)V", "Landroid/widget/RelativeLayout;", "Landroid/widget/RelativeLayout;", "get_rl_content", "()Landroid/widget/RelativeLayout;", "set_rl_content", "(Landroid/widget/RelativeLayout;)V", "_rl_content", "Landroid/widget/TextView;", "get_rl_content_title", "()Landroid/widget/TextView;", "set_rl_content_title", "_rl_content_title", "c", "get_rl_content_tv_hour", "set_rl_content_tv_hour", "_rl_content_tv_hour", "d", "get_rl_content_tv_minute", "set_rl_content_tv_minute", "_rl_content_tv_minute", "e", "get_rl_content_tv_second", "set_rl_content_tv_second", "_rl_content_tv_second", "Landroid/widget/ImageView;", "f", "Landroid/widget/ImageView;", "get_image", "()Landroid/widget/ImageView;", "set_image", "(Landroid/widget/ImageView;)V", "_image", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PrivateCustomResultCountDownView extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public RelativeLayout _rl_content;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public TextView _rl_content_title;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public TextView _rl_content_tv_hour;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public TextView _rl_content_tv_minute;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public TextView _rl_content_tv_second;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public ImageView _image;

    public /* synthetic */ PrivateCustomResultCountDownView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final void setTitleStyles(TextView textView) {
        textView.getPaint().setShader(new LinearGradient(0.0f, 0.0f, textView.getPaint().getTextSize() * textView.getText().length(), 0.0f, new int[]{Color.parseColor("#C5AD7D"), Color.parseColor("#F9ECCA"), Color.parseColor("#C5AD7D")}, new float[]{0.0f, 0.7f, 1.0f}, Shader.TileMode.CLAMP));
        textView.invalidate();
    }

    /* JADX INFO: renamed from: a */
    public final void m106a(View view) {
        yq80.a(this, view);
    }

    /* JADX INFO: renamed from: b */
    public final void m107b(long time) {
        List<String> listM18546k = mqi0.m18546k(time);
        if (listM18546k.size() == 1) {
            get_rl_content_tv_hour().setText("0");
            get_rl_content_tv_minute().setText("0");
            get_rl_content_tv_second().setText("1");
        } else {
            get_rl_content_tv_hour().setText(listM18546k.get(0));
            get_rl_content_tv_minute().setText(listM18546k.get(1));
            get_rl_content_tv_second().setText(listM18546k.get(2));
        }
    }

    @NotNull
    public final ImageView get_image() {
        ImageView imageView = this._image;
        if (imageView != null) {
            return imageView;
        }
        Intrinsics.r("_image");
        return null;
    }

    @NotNull
    public final RelativeLayout get_rl_content() {
        RelativeLayout relativeLayout = this._rl_content;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        Intrinsics.r("_rl_content");
        return null;
    }

    @NotNull
    public final TextView get_rl_content_title() {
        TextView textView = this._rl_content_title;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_rl_content_title");
        return null;
    }

    @NotNull
    public final TextView get_rl_content_tv_hour() {
        TextView textView = this._rl_content_tv_hour;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_rl_content_tv_hour");
        return null;
    }

    @NotNull
    public final TextView get_rl_content_tv_minute() {
        TextView textView = this._rl_content_tv_minute;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_rl_content_tv_minute");
        return null;
    }

    @NotNull
    public final TextView get_rl_content_tv_second() {
        TextView textView = this._rl_content_tv_second;
        if (textView != null) {
            return textView;
        }
        Intrinsics.r("_rl_content_tv_second");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m106a(this);
        setTitleStyles(get_rl_content_title());
    }

    public final void set_image(@NotNull ImageView imageView) {
        imageView.getClass();
        this._image = imageView;
    }

    public final void set_rl_content(@NotNull RelativeLayout relativeLayout) {
        relativeLayout.getClass();
        this._rl_content = relativeLayout;
    }

    public final void set_rl_content_title(@NotNull TextView textView) {
        textView.getClass();
        this._rl_content_title = textView;
    }

    public final void set_rl_content_tv_hour(@NotNull TextView textView) {
        textView.getClass();
        this._rl_content_tv_hour = textView;
    }

    public final void set_rl_content_tv_minute(@NotNull TextView textView) {
        textView.getClass();
        this._rl_content_tv_minute = textView;
    }

    public final void set_rl_content_tv_second(@NotNull TextView textView) {
        textView.getClass();
        this._rl_content_tv_second = textView;
    }

    @JvmOverloads
    public PrivateCustomResultCountDownView(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    @JvmOverloads
    public PrivateCustomResultCountDownView(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @JvmOverloads
    public PrivateCustomResultCountDownView(@Nullable Context context) {
        this(context, null, 0, 6, null);
    }
}
