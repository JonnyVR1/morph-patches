package p028v;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import p003l.e30;
import p003l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VFrame_Anim extends VFrame {

    /* JADX INFO: renamed from: a */
    public View f12714a;

    /* JADX INFO: renamed from: v.VFrame_Anim$a */
    public class C1331a implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f12715a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f12716b;

        public C1331a(View view, boolean z) {
            this.f12715a = view;
            this.f12716b = z;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            int i;
            View view = this.f12715a;
            if (view == VFrame_Anim.this.f12714a) {
                i = 0;
            } else {
                i = this.f12716b ? 8 : 4;
            }
            view.setVisibility(i);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public VFrame_Anim(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: B */
    public void m11499B(View view, e30<View> e30Var, e30<View> e30Var2, boolean z) {
        if (this.f12714a != view) {
            this.f12714a = view;
            for (int i = 0; i < getChildCount(); i++) {
                final View childAt = getChildAt(i);
                boolean z2 = z || childAt.hasOnClickListeners();
                if (view == childAt) {
                    childAt.setVisibility(0);
                    if (z2) {
                        childAt.post(new Runnable() { // from class: l.qok0
                            @Override // java.lang.Runnable
                            public final void run() {
                                childAt.setClickable(true);
                            }
                        });
                    }
                    e30Var.call(childAt);
                } else if (childAt.getVisibility() == 0) {
                    childAt.setPressed(false);
                    if (z2) {
                        childAt.setClickable(false);
                    }
                    e30Var2.call(childAt);
                }
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public void m11500C(View view, w9j<View, ViewPropertyAnimator> w9jVar, w9j<View, ViewPropertyAnimator> w9jVar2) {
        m11501E(view, w9jVar, w9jVar2, false, true);
    }

    /* JADX INFO: renamed from: E */
    public void m11501E(View view, final w9j<View, ViewPropertyAnimator> w9jVar, final w9j<View, ViewPropertyAnimator> w9jVar2, final boolean z, boolean z2) {
        m11499B(view, new e30() { // from class: l.ook0
            @Override // p003l.e30
            public final void call(Object obj) {
                ((ViewPropertyAnimator) w9jVar.call((View) obj)).start();
            }
        }, new e30() { // from class: l.pok0
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f6469a.m11504z(w9jVar2, z, (View) obj);
            }
        }, z2);
    }

    /* JADX INFO: renamed from: F */
    public void m11502F(View view, w9j<View, ViewPropertyAnimator> w9jVar, w9j<View, ViewPropertyAnimator> w9jVar2) {
        m11501E(view, w9jVar, w9jVar2, false, false);
    }

    /* JADX INFO: renamed from: G */
    public void m11503G(View view) {
        m11499B(view, new e30() { // from class: l.mok0
            @Override // p003l.e30
            public final void call(Object obj) {
                ((View) obj).setVisibility(0);
            }
        }, new e30() { // from class: l.nok0
            @Override // p003l.e30
            public final void call(Object obj) {
                ((View) obj).setVisibility(4);
            }
        }, true);
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m11504z(w9j w9jVar, boolean z, View view) {
        ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) w9jVar.call(view);
        viewPropertyAnimator.setListener(new C1331a(view, z));
        viewPropertyAnimator.start();
    }

    public VFrame_Anim(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VFrame_Anim(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
