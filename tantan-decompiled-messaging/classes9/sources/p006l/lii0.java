package p006l;

import android.animation.Animator;
import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import l.g9j0;
import l.u7j0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class lii0 extends u7j0 {

    /* JADX INFO: renamed from: a */
    public static final String[] f16430a = {"tantan:textColorTransition:textColor"};

    private void captureValues(@NonNull g9j0 g9j0Var) {
        View view = g9j0Var.b;
        if (view instanceof TextView) {
            g9j0Var.a.put("tantan:textColorTransition:textColor", Integer.valueOf(((TextView) view).getCurrentTextColor()));
        }
    }

    public void captureEndValues(@NonNull g9j0 g9j0Var) {
        captureValues(g9j0Var);
    }

    public void captureStartValues(@NonNull g9j0 g9j0Var) {
        captureValues(g9j0Var);
    }

    @Nullable
    public Animator createAnimator(@NonNull ViewGroup viewGroup, @Nullable g9j0 g9j0Var, @Nullable g9j0 g9j0Var2) {
        if (g9j0Var == null || g9j0Var2 == null) {
            return null;
        }
        final Integer num = (Integer) g9j0Var.a.get("tantan:textColorTransition:textColor");
        final Integer num2 = (Integer) g9j0Var2.a.get("tantan:textColorTransition:textColor");
        final TextView textView = (TextView) g9j0Var2.b;
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

    @Nullable
    public String[] getTransitionProperties() {
        return f16430a;
    }
}
