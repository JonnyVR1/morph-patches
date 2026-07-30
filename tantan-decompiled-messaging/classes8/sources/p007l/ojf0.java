package p007l;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import l.z9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class ojf0 extends Animation {

    /* JADX INFO: renamed from: a */
    public final View f3543a;

    /* JADX INFO: renamed from: b */
    public final int f3544b;

    /* JADX INFO: renamed from: c */
    public final int f3545c;

    /* JADX INFO: renamed from: d */
    public final z9j<Float, Transformation, Integer, Integer, Object> f3546d;

    public ojf0(View view, int i, int i2, long j, z9j<Float, Transformation, Integer, Integer, Object> z9jVar) {
        this.f3543a = view;
        this.f3544b = i;
        this.f3545c = i2;
        this.f3546d = z9jVar;
        setDuration(j);
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f, Transformation transformation) {
        int i = this.f3545c;
        int i2 = this.f3544b;
        int i3 = (int) (((i - i2) * f) + i2);
        z9j<Float, Transformation, Integer, Integer, Object> z9jVar = this.f3546d;
        if (z9jVar != null) {
            z9jVar.b(Float.valueOf(f), transformation, Integer.valueOf(this.f3544b), Integer.valueOf(this.f3545c));
        }
        this.f3543a.getLayoutParams().height = i3;
        this.f3543a.setVisibility(0);
        this.f3543a.requestLayout();
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
