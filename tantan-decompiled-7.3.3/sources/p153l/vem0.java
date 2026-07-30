package p153l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class vem0 extends ygj0 {

    /* JADX INFO: renamed from: b */
    public static final String[] f183815b = {"android:visibility:visibility", "android:visibility:parent"};

    /* JADX INFO: renamed from: a */
    public int f183816a = 3;

    /* JADX INFO: renamed from: l.vem0$a */
    public class C20821a extends yhj0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewGroup f183817a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f183818b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ View f183819c;

        public C20821a(ViewGroup viewGroup, View view, View view2) {
            this.f183817a = viewGroup;
            this.f183818b = view;
            this.f183819c = view2;
        }

        @Override // p153l.yhj0, p153l.ygj0.InterfaceC21593g
        /* JADX INFO: renamed from: b */
        public void mo106210b(@NonNull ygj0 ygj0Var) {
            dll0.m116770a(this.f183817a).mo98692d(this.f183818b);
        }

        @Override // p153l.yhj0, p153l.ygj0.InterfaceC21593g
        /* JADX INFO: renamed from: c */
        public void mo106211c(@NonNull ygj0 ygj0Var) {
            this.f183819c.setTag(gcc0.f103558c, null);
            dll0.m116770a(this.f183817a).mo98692d(this.f183818b);
            ygj0Var.removeListener(this);
        }

        @Override // p153l.yhj0, p153l.ygj0.InterfaceC21593g
        /* JADX INFO: renamed from: d */
        public void mo106212d(@NonNull ygj0 ygj0Var) {
            if (this.f183818b.getParent() == null) {
                dll0.m116770a(this.f183817a).mo98691c(this.f183818b);
            } else {
                vem0.this.cancel();
            }
        }
    }

    /* JADX INFO: renamed from: l.vem0$c */
    public static class C20823c {

        /* JADX INFO: renamed from: a */
        public boolean f183827a;

        /* JADX INFO: renamed from: b */
        public boolean f183828b;

        /* JADX INFO: renamed from: c */
        public int f183829c;

        /* JADX INFO: renamed from: d */
        public int f183830d;

        /* JADX INFO: renamed from: e */
        public ViewGroup f183831e;

        /* JADX INFO: renamed from: f */
        public ViewGroup f183832f;
    }

    private void captureValues(kij0 kij0Var) {
        kij0Var.f127000a.put("android:visibility:visibility", Integer.valueOf(kij0Var.f127001b.getVisibility()));
        kij0Var.f127000a.put("android:visibility:parent", kij0Var.f127001b.getParent());
        int[] iArr = new int[2];
        kij0Var.f127001b.getLocationOnScreen(iArr);
        kij0Var.f127000a.put("android:visibility:screenLocation", iArr);
    }

    /* JADX INFO: renamed from: a */
    public final C20823c m201069a(kij0 kij0Var, kij0 kij0Var2) {
        C20823c c20823c = new C20823c();
        c20823c.f183827a = false;
        c20823c.f183828b = false;
        if (kij0Var == null || !kij0Var.f127000a.containsKey("android:visibility:visibility")) {
            c20823c.f183829c = -1;
            c20823c.f183831e = null;
        } else {
            c20823c.f183829c = ((Integer) kij0Var.f127000a.get("android:visibility:visibility")).intValue();
            c20823c.f183831e = (ViewGroup) kij0Var.f127000a.get("android:visibility:parent");
        }
        if (kij0Var2 == null || !kij0Var2.f127000a.containsKey("android:visibility:visibility")) {
            c20823c.f183830d = -1;
            c20823c.f183832f = null;
        } else {
            c20823c.f183830d = ((Integer) kij0Var2.f127000a.get("android:visibility:visibility")).intValue();
            c20823c.f183832f = (ViewGroup) kij0Var2.f127000a.get("android:visibility:parent");
        }
        if (kij0Var != null && kij0Var2 != null) {
            int i = c20823c.f183829c;
            int i2 = c20823c.f183830d;
            if (i != i2 || c20823c.f183831e != c20823c.f183832f) {
                if (i != i2) {
                    if (i == 0) {
                        c20823c.f183828b = false;
                        c20823c.f183827a = true;
                        return c20823c;
                    }
                    if (i2 == 0) {
                        c20823c.f183828b = true;
                        c20823c.f183827a = true;
                        return c20823c;
                    }
                } else {
                    if (c20823c.f183832f == null) {
                        c20823c.f183828b = false;
                        c20823c.f183827a = true;
                        return c20823c;
                    }
                    if (c20823c.f183831e == null) {
                        c20823c.f183828b = true;
                        c20823c.f183827a = true;
                        return c20823c;
                    }
                }
            }
        } else {
            if (kij0Var == null && c20823c.f183830d == 0) {
                c20823c.f183828b = true;
                c20823c.f183827a = true;
                return c20823c;
            }
            if (kij0Var2 == null && c20823c.f183829c == 0) {
                c20823c.f183828b = false;
                c20823c.f183827a = true;
            }
        }
        return c20823c;
    }

    /* JADX INFO: renamed from: b */
    public Animator mo165114b(ViewGroup viewGroup, View view, kij0 kij0Var, kij0 kij0Var2) {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public Animator m201070c(ViewGroup viewGroup, kij0 kij0Var, int i, kij0 kij0Var2, int i2) {
        if ((this.f183816a & 1) != 1 || kij0Var2 == null) {
            return null;
        }
        if (kij0Var == null) {
            View view = (View) kij0Var2.f127001b.getParent();
            if (m201069a(getMatchedTransitionValues(view, false), getTransitionValues(view, false)).f183827a) {
                return null;
            }
        }
        return mo165114b(viewGroup, kij0Var2.f127001b, kij0Var, kij0Var2);
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
        C20823c c20823cM201069a = m201069a(kij0Var, kij0Var2);
        if (!c20823cM201069a.f183827a) {
            return null;
        }
        if (c20823cM201069a.f183831e == null && c20823cM201069a.f183832f == null) {
            return null;
        }
        boolean z = c20823cM201069a.f183828b;
        int i = c20823cM201069a.f183829c;
        return z ? m201070c(viewGroup, kij0Var, i, kij0Var2, c20823cM201069a.f183830d) : m201071e(viewGroup, kij0Var, i, kij0Var2, c20823cM201069a.f183830d);
    }

    /* JADX INFO: renamed from: d */
    public Animator mo165115d(ViewGroup viewGroup, View view, kij0 kij0Var, kij0 kij0Var2) {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0036  */
    /* JADX INFO: renamed from: e */
    public Animator m201071e(ViewGroup viewGroup, kij0 kij0Var, int i, kij0 kij0Var2, int i2) {
        View view;
        boolean z;
        View view2;
        boolean z2;
        if ((this.f183816a & 2) != 2 || kij0Var == null) {
            return null;
        }
        View view3 = kij0Var.f127001b;
        View viewM144980a = kij0Var2 != null ? kij0Var2.f127001b : null;
        View view4 = (View) view3.getTag(gcc0.f103558c);
        if (view4 != null) {
            view2 = null;
            z2 = true;
        } else {
            if (viewM144980a == null || viewM144980a.getParent() == null) {
                if (viewM144980a != null) {
                    view = null;
                    z = false;
                } else {
                    viewM144980a = null;
                    view = null;
                    z = true;
                }
            } else if (i2 == 4 || view3 == viewM144980a) {
                view = viewM144980a;
                z = false;
                viewM144980a = null;
            } else {
                viewM144980a = null;
                view = null;
                z = true;
            }
            if (z) {
                if (view3.getParent() != null) {
                    if (view3.getParent() instanceof View) {
                        View view5 = (View) view3.getParent();
                        if (m201069a(getTransitionValues(view5, true), getMatchedTransitionValues(view5, true)).f183827a) {
                            int id = view5.getId();
                            if (view5.getParent() != null || id == -1 || viewGroup.findViewById(id) == null || !this.mCanRemoveViews) {
                            }
                        } else {
                            viewM144980a = jij0.m144980a(viewGroup, view3, view5);
                        }
                    }
                    View view6 = view;
                    view4 = viewM144980a;
                    view2 = view6;
                    z2 = false;
                }
                view2 = view;
                z2 = false;
                view4 = view3;
            } else {
                View view7 = view;
                view4 = viewM144980a;
                view2 = view7;
                z2 = false;
            }
        }
        if (view4 == null) {
            if (view2 == null) {
                return null;
            }
            int visibility = view2.getVisibility();
            hnl0.m136154h(view2, 0);
            Animator animatorMo165115d = mo165115d(viewGroup, view2, kij0Var, kij0Var2);
            if (animatorMo165115d == null) {
                hnl0.m136154h(view2, visibility);
                return animatorMo165115d;
            }
            C20822b c20822b = new C20822b(view2, i2, true);
            animatorMo165115d.addListener(c20822b);
            pr0.m173423a(animatorMo165115d, c20822b);
            addListener(c20822b);
            return animatorMo165115d;
        }
        if (!z2) {
            int[] iArr = (int[]) kij0Var.f127000a.get("android:visibility:screenLocation");
            int i3 = iArr[0];
            int i4 = iArr[1];
            int[] iArr2 = new int[2];
            viewGroup.getLocationOnScreen(iArr2);
            view4.offsetLeftAndRight((i3 - iArr2[0]) - view4.getLeft());
            view4.offsetTopAndBottom((i4 - iArr2[1]) - view4.getTop());
            dll0.m116770a(viewGroup).mo98691c(view4);
        }
        Animator animatorMo165115d2 = mo165115d(viewGroup, view4, kij0Var, kij0Var2);
        if (!z2) {
            if (animatorMo165115d2 == null) {
                dll0.m116770a(viewGroup).mo98692d(view4);
                return animatorMo165115d2;
            }
            view3.setTag(gcc0.f103558c, view4);
            addListener(new C20821a(viewGroup, view4, view3));
        }
        return animatorMo165115d2;
    }

    /* JADX INFO: renamed from: f */
    public void m201072f(int i) {
        if ((i & (-4)) == 0) {
            this.f183816a = i;
        } else {
            wg3.m206174a("Only MODE_IN and MODE_OUT flags are allowed");
        }
    }

    @Override // p153l.ygj0
    @Nullable
    public String[] getTransitionProperties() {
        return f183815b;
    }

    @Override // p153l.ygj0
    public boolean isTransitionRequired(kij0 kij0Var, kij0 kij0Var2) {
        if (kij0Var == null && kij0Var2 == null) {
            return false;
        }
        if (kij0Var != null && kij0Var2 != null && kij0Var2.f127000a.containsKey("android:visibility:visibility") != kij0Var.f127000a.containsKey("android:visibility:visibility")) {
            return false;
        }
        C20823c c20823cM201069a = m201069a(kij0Var, kij0Var2);
        return c20823cM201069a.f183827a && (c20823cM201069a.f183829c == 0 || c20823cM201069a.f183830d == 0);
    }

    /* JADX INFO: renamed from: l.vem0$b */
    public static class C20822b extends AnimatorListenerAdapter implements ygj0.InterfaceC21593g {

        /* JADX INFO: renamed from: a */
        public final View f183821a;

        /* JADX INFO: renamed from: b */
        public final int f183822b;

        /* JADX INFO: renamed from: c */
        public final ViewGroup f183823c;

        /* JADX INFO: renamed from: d */
        public final boolean f183824d;

        /* JADX INFO: renamed from: e */
        public boolean f183825e;

        /* JADX INFO: renamed from: f */
        public boolean f183826f = false;

        public C20822b(View view, int i, boolean z) {
            this.f183821a = view;
            this.f183822b = i;
            this.f183823c = (ViewGroup) view.getParent();
            this.f183824d = z;
            m201074g(true);
        }

        @Override // p153l.ygj0.InterfaceC21593g
        /* JADX INFO: renamed from: b */
        public void mo106210b(@NonNull ygj0 ygj0Var) {
            m201074g(false);
        }

        @Override // p153l.ygj0.InterfaceC21593g
        /* JADX INFO: renamed from: c */
        public void mo106211c(@NonNull ygj0 ygj0Var) {
            m201073f();
            ygj0Var.removeListener(this);
        }

        @Override // p153l.ygj0.InterfaceC21593g
        /* JADX INFO: renamed from: d */
        public void mo106212d(@NonNull ygj0 ygj0Var) {
            m201074g(true);
        }

        /* JADX INFO: renamed from: f */
        public final void m201073f() {
            if (!this.f183826f) {
                hnl0.m136154h(this.f183821a, this.f183822b);
                ViewGroup viewGroup = this.f183823c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            m201074g(false);
        }

        /* JADX INFO: renamed from: g */
        public final void m201074g(boolean z) {
            ViewGroup viewGroup;
            if (!this.f183824d || this.f183825e == z || (viewGroup = this.f183823c) == null) {
                return;
            }
            this.f183825e = z;
            dll0.m116772c(viewGroup, z);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f183826f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            m201073f();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            if (this.f183826f) {
                return;
            }
            hnl0.m136154h(this.f183821a, this.f183822b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            if (this.f183826f) {
                return;
            }
            hnl0.m136154h(this.f183821a, 0);
        }

        @Override // p153l.ygj0.InterfaceC21593g
        /* JADX INFO: renamed from: a */
        public void mo120913a(@NonNull ygj0 ygj0Var) {
        }

        @Override // p153l.ygj0.InterfaceC21593g
        /* JADX INFO: renamed from: e */
        public void mo106213e(@NonNull ygj0 ygj0Var) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }
}
