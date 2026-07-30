package p153l;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes.dex */
public class frc0 implements TypeEvaluator<Rect> {

    /* JADX INFO: renamed from: a */
    public Rect f100410a;

    @Override // android.animation.TypeEvaluator
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Rect evaluate(float f, Rect rect, Rect rect2) {
        int i = rect.left;
        int i2 = i + ((int) ((rect2.left - i) * f));
        int i3 = rect.top;
        int i4 = i3 + ((int) ((rect2.top - i3) * f));
        int i5 = rect.right;
        int i6 = i5 + ((int) ((rect2.right - i5) * f));
        int i7 = rect.bottom;
        int i8 = i7 + ((int) ((rect2.bottom - i7) * f));
        Rect rect3 = this.f100410a;
        if (rect3 == null) {
            return new Rect(i2, i4, i6, i8);
        }
        rect3.set(i2, i4, i6, i8);
        return this.f100410a;
    }
}
