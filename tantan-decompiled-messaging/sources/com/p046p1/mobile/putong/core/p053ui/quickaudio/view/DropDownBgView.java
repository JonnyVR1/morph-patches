package com.p046p1.mobile.putong.core.p053ui.quickaudio.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.material.badge.BadgeDrawable;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VFrame;
import p147v.VImage;
import p149l.ogl0;
import p149l.x2c0;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00108\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012¨\u0006\u0016"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/quickaudio/view/DropDownBgView;", "Lv/VFrame;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "", "p", "()Z", "Lv/VImage;", "a", "Lv/VImage;", "imgView1", "b", "imgView2", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class DropDownBgView extends VFrame {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public VImage imgView1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VImage imgView2;

    public /* synthetic */ DropDownBgView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        int i;
        int i2;
        int i3;
        super.onFinishInflate();
        if (m54587p()) {
            i = x2c0.f189172Ai;
        } else {
            i = ogl0.m164246Y() ? x2c0.f190412o1 : x2c0.f190380n1;
        }
        setBackgroundResource(i);
        this.imgView1 = new VImage(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = BadgeDrawable.TOP_END;
        VImage vImage = this.imgView1;
        View view = null;
        if (vImage == null) {
            Intrinsics.m87502r("imgView1");
            vImage = null;
        }
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
        vImage.setScaleType(scaleType);
        VImage vImage2 = this.imgView1;
        if (vImage2 == null) {
            Intrinsics.m87502r("imgView1");
            vImage2 = null;
        }
        if (m54587p()) {
            i2 = x2c0.f190370mn;
        } else {
            i2 = ogl0.m164246Y() ? x2c0.f189670Qe : x2c0.f190316l1;
        }
        vImage2.setImageResource(i2);
        View view2 = this.imgView1;
        if (view2 == null) {
            Intrinsics.m87502r("imgView1");
            view2 = null;
        }
        addView(view2, layoutParams);
        this.imgView2 = new VImage(getContext());
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        if (m54587p() || ogl0.m164246Y()) {
            layoutParams2.gravity = BadgeDrawable.BOTTOM_START;
        } else {
            layoutParams2.gravity = BadgeDrawable.BOTTOM_END;
        }
        VImage vImage3 = this.imgView2;
        if (vImage3 == null) {
            Intrinsics.m87502r("imgView2");
            vImage3 = null;
        }
        vImage3.setScaleType(scaleType);
        VImage vImage4 = this.imgView2;
        if (vImage4 == null) {
            Intrinsics.m87502r("imgView2");
            vImage4 = null;
        }
        if (m54587p()) {
            i3 = x2c0.f190338ln;
        } else {
            i3 = ogl0.m164246Y() ? x2c0.f189639Pe : x2c0.f190348m1;
        }
        vImage4.setImageResource(i3);
        View view3 = this.imgView2;
        if (view3 == null) {
            Intrinsics.m87502r("imgView2");
        } else {
            view = view3;
        }
        addView(view, layoutParams2);
    }

    /* JADX INFO: renamed from: p */
    public final boolean m54587p() {
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
