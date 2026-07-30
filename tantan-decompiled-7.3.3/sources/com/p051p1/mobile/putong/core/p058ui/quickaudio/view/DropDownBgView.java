package com.p051p1.mobile.putong.core.p058ui.quickaudio.view;

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
import p151v.VFrame;
import p151v.VImage;
import p153l.dbc0;
import p153l.spl0;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0013\u001a\u00020\u00108\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00108\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012¨\u0006\u0016"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/quickaudio/view/DropDownBgView;", "Lv/VFrame;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "", "p", "()Z", "Lv/VImage;", "a", "Lv/VImage;", "imgView1", "b", "imgView2", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
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
        if (m55770p()) {
            i = dbc0.f87287oj;
        } else {
            i = spl0.m187373Y() ? dbc0.f87302p1 : dbc0.f87269o1;
        }
        setBackgroundResource(i);
        this.imgView1 = new VImage(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = BadgeDrawable.TOP_END;
        VImage vImage = this.imgView1;
        View view = null;
        if (vImage == null) {
            Intrinsics.m88391r("imgView1");
            vImage = null;
        }
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_CROP;
        vImage.setScaleType(scaleType);
        VImage vImage2 = this.imgView1;
        if (vImage2 == null) {
            Intrinsics.m88391r("imgView1");
            vImage2 = null;
        }
        if (m55770p()) {
            i2 = dbc0.f86833ao;
        } else {
            i2 = spl0.m187373Y() ? dbc0.f86152Ff : dbc0.f87203m1;
        }
        vImage2.setImageResource(i2);
        View view2 = this.imgView1;
        if (view2 == null) {
            Intrinsics.m88391r("imgView1");
            view2 = null;
        }
        addView(view2, layoutParams);
        this.imgView2 = new VImage(getContext());
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -2);
        if (m55770p() || spl0.m187373Y()) {
            layoutParams2.gravity = BadgeDrawable.BOTTOM_START;
        } else {
            layoutParams2.gravity = BadgeDrawable.BOTTOM_END;
        }
        VImage vImage3 = this.imgView2;
        if (vImage3 == null) {
            Intrinsics.m88391r("imgView2");
            vImage3 = null;
        }
        vImage3.setScaleType(scaleType);
        VImage vImage4 = this.imgView2;
        if (vImage4 == null) {
            Intrinsics.m88391r("imgView2");
            vImage4 = null;
        }
        if (m55770p()) {
            i3 = dbc0.f86800Zn;
        } else {
            i3 = spl0.m187373Y() ? dbc0.f86120Ef : dbc0.f87236n1;
        }
        vImage4.setImageResource(i3);
        View view3 = this.imgView2;
        if (view3 == null) {
            Intrinsics.m88391r("imgView2");
        } else {
            view = view3;
        }
        addView(view, layoutParams2);
    }

    /* JADX INFO: renamed from: p */
    public final boolean m55770p() {
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
