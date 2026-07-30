package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import p153l.qhc0;

/* JADX INFO: loaded from: classes.dex */
public class Constraints extends ViewGroup {

    /* JADX INFO: renamed from: a */
    public C0223a f1277a;

    public Constraints(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m1142c(attributeSet);
        super.setVisibility(8);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public C0222a generateDefaultLayoutParams() {
        return new C0222a(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C0222a generateLayoutParams(AttributeSet attributeSet) {
        return new C0222a(getContext(), attributeSet);
    }

    /* JADX INFO: renamed from: c */
    public final void m1142c(AttributeSet attributeSet) {
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.C0221a(layoutParams);
    }

    public C0223a getConstraintSet() {
        if (this.f1277a == null) {
            this.f1277a = new C0223a();
        }
        this.f1277a.m1150d(this);
        return this.f1277a;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public Constraints(Context context) {
        super(context);
        super.setVisibility(8);
    }

    public Constraints(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m1142c(attributeSet);
        super.setVisibility(8);
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.Constraints$a */
    public static class C0222a extends ConstraintLayout.C0221a {

        /* JADX INFO: renamed from: n0 */
        public float f1278n0;

        /* JADX INFO: renamed from: o0 */
        public boolean f1279o0;

        /* JADX INFO: renamed from: p0 */
        public float f1280p0;

        /* JADX INFO: renamed from: q0 */
        public float f1281q0;

        /* JADX INFO: renamed from: r0 */
        public float f1282r0;

        /* JADX INFO: renamed from: s0 */
        public float f1283s0;

        /* JADX INFO: renamed from: t0 */
        public float f1284t0;

        /* JADX INFO: renamed from: u0 */
        public float f1285u0;

        /* JADX INFO: renamed from: v0 */
        public float f1286v0;

        /* JADX INFO: renamed from: w0 */
        public float f1287w0;

        /* JADX INFO: renamed from: x0 */
        public float f1288x0;

        /* JADX INFO: renamed from: y0 */
        public float f1289y0;

        /* JADX INFO: renamed from: z0 */
        public float f1290z0;

        public C0222a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f1278n0 = 1.0f;
            this.f1279o0 = false;
            this.f1280p0 = 0.0f;
            this.f1281q0 = 0.0f;
            this.f1282r0 = 0.0f;
            this.f1283s0 = 0.0f;
            this.f1284t0 = 1.0f;
            this.f1285u0 = 1.0f;
            this.f1286v0 = 0.0f;
            this.f1287w0 = 0.0f;
            this.f1288x0 = 0.0f;
            this.f1289y0 = 0.0f;
            this.f1290z0 = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, qhc0.f157621l0);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == qhc0.f157651v0) {
                    this.f1278n0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1278n0);
                } else if (index == qhc0.f157552I0) {
                    this.f1280p0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1280p0);
                    this.f1279o0 = true;
                } else if (index == qhc0.f157537D0) {
                    this.f1282r0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1282r0);
                } else if (index == qhc0.f157540E0) {
                    this.f1283s0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1283s0);
                } else if (index == qhc0.f157534C0) {
                    this.f1281q0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1281q0);
                } else if (index == qhc0.f157528A0) {
                    this.f1284t0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1284t0);
                } else if (index == qhc0.f157531B0) {
                    this.f1285u0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1285u0);
                } else if (index == qhc0.f157654w0) {
                    this.f1286v0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1286v0);
                } else if (index == qhc0.f157657x0) {
                    this.f1287w0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1287w0);
                } else if (index == qhc0.f157660y0) {
                    this.f1288x0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1288x0);
                } else if (index == qhc0.f157663z0) {
                    this.f1289y0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1289y0);
                } else if (index == qhc0.f157549H0) {
                    this.f1288x0 = typedArrayObtainStyledAttributes.getFloat(index, this.f1290z0);
                }
            }
        }

        public C0222a(int i, int i2) {
            super(i, i2);
            this.f1278n0 = 1.0f;
            this.f1279o0 = false;
            this.f1280p0 = 0.0f;
            this.f1281q0 = 0.0f;
            this.f1282r0 = 0.0f;
            this.f1283s0 = 0.0f;
            this.f1284t0 = 1.0f;
            this.f1285u0 = 1.0f;
            this.f1286v0 = 0.0f;
            this.f1287w0 = 0.0f;
            this.f1288x0 = 0.0f;
            this.f1289y0 = 0.0f;
            this.f1290z0 = 0.0f;
        }
    }
}
