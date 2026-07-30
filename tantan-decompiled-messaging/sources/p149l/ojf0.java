package p149l;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: loaded from: classes8.dex */
public class ojf0 extends Animation {

    /* JADX INFO: renamed from: a */
    public final View f144272a;

    /* JADX INFO: renamed from: b */
    public final int f144273b;

    /* JADX INFO: renamed from: c */
    public final int f144274c;

    /* JADX INFO: renamed from: d */
    public final z9j<Float, Transformation, Integer, Integer, Object> f144275d;

    public ojf0(View view, int i, int i2, long j, z9j<Float, Transformation, Integer, Integer, Object> z9jVar) {
        this.f144272a = view;
        this.f144273b = i;
        this.f144274c = i2;
        this.f144275d = z9jVar;
        setDuration(j);
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f, Transformation transformation) {
        int i = this.f144274c;
        int i2 = this.f144273b;
        int i3 = (int) (((i - i2) * f) + i2);
        z9j<Float, Transformation, Integer, Integer, Object> z9jVar = this.f144275d;
        if (z9jVar != null) {
            z9jVar.mo100621b(Float.valueOf(f), transformation, Integer.valueOf(this.f144273b), Integer.valueOf(this.f144274c));
        }
        this.f144272a.getLayoutParams().height = i3;
        this.f144272a.setVisibility(0);
        this.f144272a.requestLayout();
    }

    @Override // android.view.animation.Animation
    public void initialize(int i, int i2, int i3, int i4) {
        super.initialize(i, i2, i3, i4);
    }

    @Override // android.view.animation.Animation
    public boolean willChangeBounds() {
        return true;
    }
}
