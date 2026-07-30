package p151v;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;
import p153l.qcj;
import p153l.y20;

/* JADX INFO: loaded from: classes3.dex */
public class VFrame_Anim extends VFrame {

    /* JADX INFO: renamed from: a */
    public View f210011a;

    /* JADX INFO: renamed from: v.VFrame_Anim$a */
    public class C22653a implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f210012a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f210013b;

        public C22653a(View view, boolean z) {
            this.f210012a = view;
            this.f210013b = z;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            int i;
            View view = this.f210012a;
            if (view == VFrame_Anim.this.f210011a) {
                i = 0;
            } else {
                i = this.f210013b ? 8 : 4;
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
    public void m224268B(View view, y20<View> y20Var, y20<View> y20Var2, boolean z) {
        if (this.f210011a != view) {
            this.f210011a = view;
            for (int i = 0; i < getChildCount(); i++) {
                final View childAt = getChildAt(i);
                boolean z2 = z || childAt.hasOnClickListeners();
                if (view == childAt) {
                    childAt.setVisibility(0);
                    if (z2) {
                        childAt.post(new Runnable() { // from class: l.wxk0
                            @Override // java.lang.Runnable
                            public final void run() {
                                childAt.setClickable(true);
                            }
                        });
                    }
                    y20Var.call(childAt);
                } else if (childAt.getVisibility() == 0) {
                    childAt.setPressed(false);
                    if (z2) {
                        childAt.setClickable(false);
                    }
                    y20Var2.call(childAt);
                }
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public void m224269C(View view, qcj<View, ViewPropertyAnimator> qcjVar, qcj<View, ViewPropertyAnimator> qcjVar2) {
        m224270E(view, qcjVar, qcjVar2, false, true);
    }

    /* JADX INFO: renamed from: E */
    public void m224270E(View view, final qcj<View, ViewPropertyAnimator> qcjVar, final qcj<View, ViewPropertyAnimator> qcjVar2, final boolean z, boolean z2) {
        m224268B(view, new y20() { // from class: l.uxk0
            @Override // p153l.y20
            public final void call(Object obj) {
                ((ViewPropertyAnimator) qcjVar.call((View) obj)).start();
            }
        }, new y20() { // from class: l.vxk0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f186276a.m224273z(qcjVar2, z, (View) obj);
            }
        }, z2);
    }

    /* JADX INFO: renamed from: F */
    public void m224271F(View view, qcj<View, ViewPropertyAnimator> qcjVar, qcj<View, ViewPropertyAnimator> qcjVar2) {
        m224270E(view, qcjVar, qcjVar2, false, false);
    }

    /* JADX INFO: renamed from: G */
    public void m224272G(View view) {
        m224268B(view, new y20() { // from class: l.sxk0
            @Override // p153l.y20
            public final void call(Object obj) {
                ((View) obj).setVisibility(0);
            }
        }, new y20() { // from class: l.txk0
            @Override // p153l.y20
            public final void call(Object obj) {
                ((View) obj).setVisibility(4);
            }
        }, true);
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ void m224273z(qcj qcjVar, boolean z, View view) {
        ViewPropertyAnimator viewPropertyAnimator = (ViewPropertyAnimator) qcjVar.call(view);
        viewPropertyAnimator.setListener(new C22653a(view, z));
        viewPropertyAnimator.start();
    }

    public VFrame_Anim(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VFrame_Anim(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
