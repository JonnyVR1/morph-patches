package p149l;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes9.dex */
public class lii0 extends u7j0 {

    /* JADX INFO: renamed from: a */
    public static final String[] f128213a = {"tantan:textColorTransition:textColor"};

    private void captureValues(@NonNull g9j0 g9j0Var) {
        View view = g9j0Var.f101571b;
        if (view instanceof TextView) {
            g9j0Var.f101570a.put("tantan:textColorTransition:textColor", Integer.valueOf(((TextView) view).getCurrentTextColor()));
        }
    }

    @Override // p149l.u7j0
    public void captureEndValues(@NonNull g9j0 g9j0Var) {
        captureValues(g9j0Var);
    }

    @Override // p149l.u7j0
    public void captureStartValues(@NonNull g9j0 g9j0Var) {
        captureValues(g9j0Var);
    }

    @Override // p149l.u7j0
    @Nullable
    public Animator createAnimator(@NonNull ViewGroup viewGroup, @Nullable g9j0 g9j0Var, @Nullable g9j0 g9j0Var2) {
        if (g9j0Var == null || g9j0Var2 == null) {
            return null;
        }
        final Integer num = (Integer) g9j0Var.f101570a.get("tantan:textColorTransition:textColor");
        final Integer num2 = (Integer) g9j0Var2.f101570a.get("tantan:textColorTransition:textColor");
        final TextView textView = (TextView) g9j0Var2.f101571b;
        final ArgbEvaluator argbEvaluator = new ArgbEvaluator();
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.kii0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                textView.setTextColor(((Integer) argbEvaluator.evaluate(valueAnimator.getAnimatedFraction(), num, num2)).intValue());
            }
        });
        return valueAnimatorOfFloat;
    }

    @Override // p149l.u7j0
    @Nullable
    public String[] getTransitionProperties() {
        return f128213a;
    }
}
