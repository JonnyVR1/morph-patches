package com.google.android.exoplayer2.p031ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import p153l.ygc0;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class AspectRatioFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final RunnableC2030c f9167a;

    /* JADX INFO: renamed from: b */
    public float f9168b;

    /* JADX INFO: renamed from: c */
    public int f9169c;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.AspectRatioFrameLayout$b */
    public interface InterfaceC2029b {
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.AspectRatioFrameLayout$c */
    public final class RunnableC2030c implements Runnable {

        /* JADX INFO: renamed from: a */
        public float f9170a;

        /* JADX INFO: renamed from: b */
        public float f9171b;

        /* JADX INFO: renamed from: c */
        public boolean f9172c;

        /* JADX INFO: renamed from: d */
        public boolean f9173d;

        public RunnableC2030c() {
        }

        /* JADX INFO: renamed from: a */
        public void m11859a(float f, float f2, boolean z) {
            this.f9170a = f;
            this.f9171b = f2;
            this.f9172c = z;
            if (this.f9173d) {
                return;
            }
            this.f9173d = true;
            AspectRatioFrameLayout.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f9173d = false;
            AspectRatioFrameLayout.m11858a(AspectRatioFrameLayout.this);
        }
    }

    public AspectRatioFrameLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9169c = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, ygc0.f199776a, 0, 0);
            try {
                this.f9169c = typedArrayObtainStyledAttributes.getInt(ygc0.f199778b, 0);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        this.f9167a = new RunnableC2030c();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ InterfaceC2029b m11858a(AspectRatioFrameLayout aspectRatioFrameLayout) {
        aspectRatioFrameLayout.getClass();
        return null;
    }

    public int getResizeMode() {
        return this.f9169c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0043, code lost:
    
        if (r4 > 0.0f) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0045, code lost:
    
        r2 = r2 * r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0048, code lost:
    
        r1 = r1 / r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0057, code lost:
    
        if (r4 > 0.0f) goto L21;
     */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void onMeasure(int i, int i2) {
        float f;
        super.onMeasure(i, i2);
        if (this.f9168b <= 0.0f) {
            return;
        }
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        float f2 = measuredWidth;
        float f3 = measuredHeight;
        float f4 = f2 / f3;
        float f5 = (this.f9168b / f4) - 1.0f;
        if (Math.abs(f5) <= 0.01f) {
            this.f9167a.m11859a(this.f9168b, f4, false);
            return;
        }
        int i3 = this.f9169c;
        if (i3 == 0) {
            f = this.f9168b;
        } else if (i3 == 1) {
            float f6 = f2 / this.f9168b;
            measuredHeight = (int) f6;
        } else if (i3 == 2) {
            float f7 = f3 * this.f9168b;
            measuredWidth = (int) f7;
        } else if (i3 == 4) {
            f = this.f9168b;
        }
        this.f9167a.m11859a(this.f9168b, f4, true);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824));
    }

    public void setAspectRatio(float f) {
        if (this.f9168b != f) {
            this.f9168b = f;
            requestLayout();
        }
    }

    public void setAspectRatioListener(@Nullable InterfaceC2029b interfaceC2029b) {
    }

    public void setResizeMode(int i) {
        if (this.f9169c != i) {
            this.f9169c = i;
            requestLayout();
        }
    }

    public AspectRatioFrameLayout(Context context) {
        this(context, null);
    }
}
