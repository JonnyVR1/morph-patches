package p153l;

import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Transformation;

/* JADX INFO: loaded from: classes8.dex */
public class xrf0 extends Animation {

    /* JADX INFO: renamed from: a */
    public final View f195904a;

    /* JADX INFO: renamed from: b */
    public final int f195905b;

    /* JADX INFO: renamed from: c */
    public final int f195906c;

    /* JADX INFO: renamed from: d */
    public final tcj<Float, Transformation, Integer, Integer, Object> f195907d;

    public xrf0(View view, int i, int i2, long j, tcj<Float, Transformation, Integer, Integer, Object> tcjVar) {
        this.f195904a = view;
        this.f195905b = i;
        this.f195906c = i2;
        this.f195907d = tcjVar;
        setDuration(j);
    }

    @Override // android.view.animation.Animation
    public void applyTransformation(float f, Transformation transformation) {
        int i = this.f195906c;
        int i2 = this.f195905b;
        int i3 = (int) (((i - i2) * f) + i2);
        tcj<Float, Transformation, Integer, Integer, Object> tcjVar = this.f195907d;
        if (tcjVar != null) {
            tcjVar.mo112959b(Float.valueOf(f), transformation, Integer.valueOf(this.f195905b), Integer.valueOf(this.f195906c));
        }
        this.f195904a.getLayoutParams().height = i3;
        this.f195904a.setVisibility(0);
        this.f195904a.requestLayout();
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
