package p149l;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes13.dex */
public class dt0 extends bt0 {

    /* JADX INFO: renamed from: m */
    public static final Property<View, Integer> f87801m;

    /* JADX INFO: renamed from: n */
    public static final Property<View, Integer> f87802n;

    /* JADX INFO: renamed from: l.dt0$a */
    public class C16466a extends Property<View, Integer> {
        public C16466a(Class cls, String str) {
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

    /* JADX INFO: renamed from: l.dt0$b */
    public class C16467b extends Property<View, Integer> {
        public C16467b(Class cls, String str) {
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
        f87801m = new C16466a(cls, "viewHeight");
        f87802n = new C16467b(cls, "viewWidth");
    }

    /* JADX INFO: renamed from: A */
    public static void m113501A(Animator animator) {
        if (NullChecker.m81303a(animator)) {
            if (animator instanceof ValueAnimator) {
                ((ValueAnimator) animator).removeAllUpdateListeners();
            }
            animator.removeAllListeners();
            animator.cancel();
        }
    }

    /* JADX INFO: renamed from: B */
    public static void m113502B(Animator animator) {
        if (animator == null || !animator.isRunning()) {
            return;
        }
        animator.end();
    }

    /* JADX INFO: renamed from: C */
    public static void m113503C(Animator animator) {
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
    public static void m113504D(Act act) {
        act.lambda$debugItems$19();
        act.overridePendingTransition(0, 0);
    }
}
