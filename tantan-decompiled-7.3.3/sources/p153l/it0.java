package p153l;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes13.dex */
public class it0 extends gt0 {

    /* JADX INFO: renamed from: m */
    public static final Property<View, Integer> f116780m;

    /* JADX INFO: renamed from: n */
    public static final Property<View, Integer> f116781n;

    /* JADX INFO: renamed from: l.it0$a */
    public class C17801a extends Property<View, Integer> {
        public C17801a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(View view) {
            return Integer.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Integer num) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.height = num.intValue();
            view.setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: l.it0$b */
    public class C17802b extends Property<View, Integer> {
        public C17802b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(View view) {
            return Integer.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Integer num) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = num.intValue();
            view.setLayoutParams(layoutParams);
        }
    }

    static {
        Class cls = Integer.TYPE;
        f116780m = new C17801a(cls, "viewHeight");
        f116781n = new C17802b(cls, "viewWidth");
    }

    /* JADX INFO: renamed from: A */
    public static void m142007A(Animator animator) {
        if (NullChecker.m82486a(animator)) {
            if (animator instanceof ValueAnimator) {
                ((ValueAnimator) animator).removeAllUpdateListeners();
            }
            animator.removeAllListeners();
            animator.cancel();
        }
    }

    /* JADX INFO: renamed from: B */
    public static void m142008B(Animator animator) {
        if (animator == null || !animator.isRunning()) {
            return;
        }
        animator.end();
    }

    /* JADX INFO: renamed from: C */
    public static void m142009C(Animator animator) {
        if (animator != null) {
            if (animator.isRunning()) {
                animator.end();
            } else {
                animator.cancel();
            }
            animator.removeAllListeners();
        }
    }

    /* JADX INFO: renamed from: D */
    public static void m142010D(Act act) {
        act.lambda$debugItems$19();
        act.overridePendingTransition(0, 0);
    }
}
