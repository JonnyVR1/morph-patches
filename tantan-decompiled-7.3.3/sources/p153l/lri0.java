package p153l;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public class lri0 extends ygj0 {

    /* JADX INFO: renamed from: a */
    public static final String[] f133332a = {"tantan:textColorTransition:textColor"};

    private void captureValues(@NonNull kij0 kij0Var) {
        View view = kij0Var.f127001b;
        if (view instanceof TextView) {
            kij0Var.f127000a.put("tantan:textColorTransition:textColor", Integer.valueOf(((TextView) view).getCurrentTextColor()));
        }
    }

    @Override // p153l.ygj0
    public void captureEndValues(@NonNull kij0 kij0Var) {
        captureValues(kij0Var);
    }

    @Override // p153l.ygj0
    public void captureStartValues(@NonNull kij0 kij0Var) {
        captureValues(kij0Var);
    }

    @Override // p153l.ygj0
    @Nullable
    public Animator createAnimator(@NonNull ViewGroup viewGroup, @Nullable kij0 kij0Var, @Nullable kij0 kij0Var2) {
        if (kij0Var == null || kij0Var2 == null) {
            return null;
        }
        final Integer num = (Integer) kij0Var.f127000a.get("tantan:textColorTransition:textColor");
        final Integer num2 = (Integer) kij0Var2.f127000a.get("tantan:textColorTransition:textColor");
        final TextView textView = (TextView) kij0Var2.f127001b;
        final ArgbEvaluator argbEvaluator = new ArgbEvaluator();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.kri0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                textView.setTextColor(((Integer) argbEvaluator.evaluate(valueAnimator.getAnimatedFraction(), num, num2)).intValue());
            }
        });
        return valueAnimatorOfFloat;
    }

    @Override // p153l.ygj0
    @Nullable
    public String[] getTransitionProperties() {
        return f133332a;
    }
}
