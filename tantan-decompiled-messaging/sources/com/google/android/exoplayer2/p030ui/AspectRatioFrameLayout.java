package com.google.android.exoplayer2.p030ui;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import p149l.t8c0;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class AspectRatioFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public final RunnableC2007c f9130a;

    /* JADX INFO: renamed from: b */
    public float f9131b;

    /* JADX INFO: renamed from: c */
    public int f9132c;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.AspectRatioFrameLayout$b */
    public interface InterfaceC2006b {
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.AspectRatioFrameLayout$c */
    public final class RunnableC2007c implements Runnable {

        /* JADX INFO: renamed from: a */
        public float f9133a;

        /* JADX INFO: renamed from: b */
        public float f9134b;

        /* JADX INFO: renamed from: c */
        public boolean f9135c;

        /* JADX INFO: renamed from: d */
        public boolean f9136d;

        public RunnableC2007c() {
        }

        /* JADX INFO: renamed from: a */
        public void m11805a(float f, float f2, boolean z) {
            this.f9133a = f;
            this.f9134b = f2;
            this.f9135c = z;
            if (this.f9136d) {
                return;
            }
            this.f9136d = true;
            AspectRatioFrameLayout.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f9136d = false;
            AspectRatioFrameLayout.m11804a(AspectRatioFrameLayout.this);
        }
    }

    public AspectRatioFrameLayout(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f9132c = 0;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, t8c0.f168845a, 0, 0);
            try {
                this.f9132c = typedArrayObtainStyledAttributes.getInt(t8c0.f168847b, 0);
                typedArrayObtainStyledAttributes.recycle();
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        this.f9130a = new RunnableC2007c();
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ InterfaceC2006b m11804a(AspectRatioFrameLayout aspectRatioFrameLayout) {
        aspectRatioFrameLayout.getClass();
        return null;
    }

    public int getResizeMode() {
        return this.f9132c;
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
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r9, int r10) {
        /*
            r8 = this;
            super.onMeasure(r9, r10)
            float r9 = r8.f9131b
            r10 = 0
            int r9 = (r9 > r10 ? 1 : (r9 == r10 ? 0 : -1))
            if (r9 > 0) goto Lb
            return
        Lb:
            int r9 = r8.getMeasuredWidth()
            int r0 = r8.getMeasuredHeight()
            float r1 = (float) r9
            float r2 = (float) r0
            float r3 = r1 / r2
            float r4 = r8.f9131b
            float r4 = r4 / r3
            r5 = 1065353216(0x3f800000, float:1.0)
            float r4 = r4 - r5
            float r5 = java.lang.Math.abs(r4)
            r6 = 1008981770(0x3c23d70a, float:0.01)
            int r5 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r5 > 0) goto L31
            com.google.android.exoplayer2.ui.AspectRatioFrameLayout$c r9 = r8.f9130a
            float r8 = r8.f9131b
            r10 = 0
            r9.m11805a(r8, r3, r10)
            return
        L31:
            int r5 = r8.f9132c
            r6 = 1
            if (r5 == 0) goto L53
            if (r5 == r6) goto L4f
            r7 = 2
            if (r5 == r7) goto L4b
            r7 = 4
            if (r5 == r7) goto L3f
            goto L5a
        L3f:
            int r10 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            float r4 = r8.f9131b
            if (r10 <= 0) goto L48
        L45:
            float r2 = r2 * r4
        L46:
            int r9 = (int) r2
            goto L5a
        L48:
            float r1 = r1 / r4
        L49:
            int r0 = (int) r1
            goto L5a
        L4b:
            float r9 = r8.f9131b
            float r2 = r2 * r9
            goto L46
        L4f:
            float r10 = r8.f9131b
            float r1 = r1 / r10
            goto L49
        L53:
            int r10 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            float r4 = r8.f9131b
            if (r10 <= 0) goto L45
            goto L48
        L5a:
            com.google.android.exoplayer2.ui.AspectRatioFrameLayout$c r10 = r8.f9130a
            float r1 = r8.f9131b
            r10.m11805a(r1, r3, r6)
            r10 = 1073741824(0x40000000, float:2.0)
            int r9 = android.view.View.MeasureSpec.makeMeasureSpec(r9, r10)
            int r10 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r10)
            super.onMeasure(r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p030ui.AspectRatioFrameLayout.onMeasure(int, int):void");
    }

    public void setAspectRatio(float f) {
        if (this.f9131b != f) {
            this.f9131b = f;
            requestLayout();
        }
    }

    public void setAspectRatioListener(@Nullable InterfaceC2006b interfaceC2006b) {
    }

    public void setResizeMode(int i) {
        if (this.f9132c != i) {
            this.f9132c = i;
            requestLayout();
        }
    }

    public AspectRatioFrameLayout(Context context) {
        this(context, null);
    }
}
