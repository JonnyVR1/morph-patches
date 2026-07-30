package com.p000p1.mobile.putong.core.p004ui.quickaudio.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p006l.ogl0;
import p006l.x2c0;
import v.VFrame;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00108\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012¨\u0006\u0016"}, d2 = {"Lcom/p1/mobile/putong/core/ui/quickaudio/view/DropDownBgView;", "Lv/VFrame;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "", "p", "()Z", "Lv/VImage;", "a", "Lv/VImage;", "imgView1", "b", "imgView2", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DropDownBgView extends VFrame {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public VImage imgView1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VImage imgView2;

    public /* synthetic */ DropDownBgView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        int i;
        int i2;
        int i3;
        super/*android.view.View*/.onFinishInflate();
        if (m7936p()) {
            i = x2c0.f25708Ai;
        } else {
            i = ogl0.m20636Y() ? x2c0.f26948o1 : x2c0.f26916n1;
        }
        setBackgroundResource(i);
        this.imgView1 = new VImage(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 8388661;
        ImageView imageView = this.imgView1;
        View view = null;
        if (imageView == null) {
            Intrinsics.r("imgView1");
            imageView = null;
        }
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
        imageView.setScaleType(scaleType);
        AppCompatImageView appCompatImageView = this.imgView1;
        if (appCompatImageView == null) {
            Intrinsics.r("imgView1");
            appCompatImageView = null;
        }
        if (m7936p()) {
            i2 = x2c0.f26906mn;
        } else {
            i2 = ogl0.m20636Y() ? x2c0.f26206Qe : x2c0.f26852l1;
        }
        appCompatImageView.setImageResource(i2);
        View view2 = this.imgView1;
        if (view2 == null) {
            Intrinsics.r("imgView1");
            view2 = null;
        }
        addView(view2, layoutParams);
        this.imgView2 = new VImage(getContext());
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        if (m7936p() || ogl0.m20636Y()) {
            layoutParams2.gravity = 8388691;
        } else {
            layoutParams2.gravity = 8388693;
        }
        ImageView imageView2 = this.imgView2;
        if (imageView2 == null) {
            Intrinsics.r("imgView2");
            imageView2 = null;
        }
        imageView2.setScaleType(scaleType);
        AppCompatImageView appCompatImageView2 = this.imgView2;
        if (appCompatImageView2 == null) {
            Intrinsics.r("imgView2");
            appCompatImageView2 = null;
        }
        if (m7936p()) {
            i3 = x2c0.f26874ln;
        } else {
            i3 = ogl0.m20636Y() ? x2c0.f26175Pe : x2c0.f26884m1;
        }
        appCompatImageView2.setImageResource(i3);
        View view3 = this.imgView2;
        if (view3 == null) {
            Intrinsics.r("imgView2");
        } else {
            view = view3;
        }
        addView(view, layoutParams2);
    }

    /* JADX INFO: renamed from: p */
    public final boolean m7936p() {
        return false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DropDownBgView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DropDownBgView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public DropDownBgView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
