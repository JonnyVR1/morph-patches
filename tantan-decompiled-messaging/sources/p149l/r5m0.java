package p149l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
public abstract class r5m0 extends u7j0 {

    /* JADX INFO: renamed from: b */
    public static final String[] f157840b = {"android:visibility:visibility", "android:visibility:parent"};

    /* JADX INFO: renamed from: a */
    public int f157841a = 3;

    /* JADX INFO: renamed from: l.r5m0$a */
    public class C19643a extends u8j0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewGroup f157842a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f157843b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ View f157844c;

        public C19643a(ViewGroup viewGroup, View view, View view2) {
            this.f157842a = viewGroup;
            this.f157843b = view;
            this.f157844c = view2;
        }

        @Override // p149l.u8j0, p149l.u7j0.InterfaceC20375g
        /* JADX INFO: renamed from: b */
        public void mo100097b(@NonNull u7j0 u7j0Var) {
            zbl0.m217910a(this.f157842a).mo202579d(this.f157843b);
        }

        @Override // p149l.u8j0, p149l.u7j0.InterfaceC20375g
        /* JADX INFO: renamed from: c */
        public void mo95445c(@NonNull u7j0 u7j0Var) {
            this.f157844c.setTag(a4c0.f67494c, null);
            zbl0.m217910a(this.f157842a).mo202579d(this.f157843b);
            u7j0Var.removeListener(this);
        }

        @Override // p149l.u8j0, p149l.u7j0.InterfaceC20375g
        /* JADX INFO: renamed from: d */
        public void mo100098d(@NonNull u7j0 u7j0Var) {
            if (this.f157843b.getParent() == null) {
                zbl0.m217910a(this.f157842a).mo202578c(this.f157843b);
            } else {
                r5m0.this.cancel();
            }
        }
    }

    /* JADX INFO: renamed from: l.r5m0$c */
    public static class C19645c {

        /* JADX INFO: renamed from: a */
        public boolean f157852a;

        /* JADX INFO: renamed from: b */
        public boolean f157853b;

        /* JADX INFO: renamed from: c */
        public int f157854c;

        /* JADX INFO: renamed from: d */
        public int f157855d;

        /* JADX INFO: renamed from: e */
        public ViewGroup f157856e;

        /* JADX INFO: renamed from: f */
        public ViewGroup f157857f;
    }

    private void captureValues(g9j0 g9j0Var) {
        g9j0Var.f101570a.put("android:visibility:visibility", Integer.valueOf(g9j0Var.f101571b.getVisibility()));
        g9j0Var.f101570a.put("android:visibility:parent", g9j0Var.f101571b.getParent());
        int[] iArr = new int[2];
        g9j0Var.f101571b.getLocationOnScreen(iArr);
        g9j0Var.f101570a.put("android:visibility:screenLocation", iArr);
    }

    /* JADX INFO: renamed from: a */
    public final C19645c m177947a(g9j0 g9j0Var, g9j0 g9j0Var2) {
        C19645c c19645c = new C19645c();
        c19645c.f157852a = false;
        c19645c.f157853b = false;
        if (g9j0Var == null || !g9j0Var.f101570a.containsKey("android:visibility:visibility")) {
            c19645c.f157854c = -1;
            c19645c.f157856e = null;
        } else {
            c19645c.f157854c = ((Integer) g9j0Var.f101570a.get("android:visibility:visibility")).intValue();
            c19645c.f157856e = (ViewGroup) g9j0Var.f101570a.get("android:visibility:parent");
        }
        if (g9j0Var2 == null || !g9j0Var2.f101570a.containsKey("android:visibility:visibility")) {
            c19645c.f157855d = -1;
            c19645c.f157857f = null;
        } else {
            c19645c.f157855d = ((Integer) g9j0Var2.f101570a.get("android:visibility:visibility")).intValue();
            c19645c.f157857f = (ViewGroup) g9j0Var2.f101570a.get("android:visibility:parent");
        }
        if (g9j0Var != null && g9j0Var2 != null) {
            int i = c19645c.f157854c;
            int i2 = c19645c.f157855d;
            if (i != i2 || c19645c.f157856e != c19645c.f157857f) {
                if (i != i2) {
                    if (i == 0) {
                        c19645c.f157853b = false;
                        c19645c.f157852a = true;
                        return c19645c;
                    }
                    if (i2 == 0) {
                        c19645c.f157853b = true;
                        c19645c.f157852a = true;
                        return c19645c;
                    }
                } else {
                    if (c19645c.f157857f == null) {
                        c19645c.f157853b = false;
                        c19645c.f157852a = true;
                        return c19645c;
                    }
                    if (c19645c.f157856e == null) {
                        c19645c.f157853b = true;
                        c19645c.f157852a = true;
                        return c19645c;
                    }
                }
            }
        } else {
            if (g9j0Var == null && c19645c.f157855d == 0) {
                c19645c.f157853b = true;
                c19645c.f157852a = true;
                return c19645c;
            }
            if (g9j0Var2 == null && c19645c.f157854c == 0) {
                c19645c.f157853b = false;
                c19645c.f157852a = true;
            }
        }
        return c19645c;
    }

    /* JADX INFO: renamed from: b */
    public Animator mo177948b(ViewGroup viewGroup, View view, g9j0 g9j0Var, g9j0 g9j0Var2) {
        return null;
    }

    /* JADX INFO: renamed from: c */
    public Animator m177949c(ViewGroup viewGroup, g9j0 g9j0Var, int i, g9j0 g9j0Var2, int i2) {
        if ((this.f157841a & 1) != 1 || g9j0Var2 == null) {
            return null;
        }
        if (g9j0Var == null) {
            View view = (View) g9j0Var2.f101571b.getParent();
            if (m177947a(getMatchedTransitionValues(view, false), getTransitionValues(view, false)).f157852a) {
                return null;
            }
        }
        return mo177948b(viewGroup, g9j0Var2.f101571b, g9j0Var, g9j0Var2);
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
        C19645c c19645cM177947a = m177947a(g9j0Var, g9j0Var2);
        if (!c19645cM177947a.f157852a) {
            return null;
        }
        if (c19645cM177947a.f157856e == null && c19645cM177947a.f157857f == null) {
            return null;
        }
        boolean z = c19645cM177947a.f157853b;
        int i = c19645cM177947a.f157854c;
        return z ? m177949c(viewGroup, g9j0Var, i, g9j0Var2, c19645cM177947a.f157855d) : m177951e(viewGroup, g9j0Var, i, g9j0Var2, c19645cM177947a.f157855d);
    }

    /* JADX INFO: renamed from: d */
    public Animator mo177950d(ViewGroup viewGroup, View view, g9j0 g9j0Var, g9j0 g9j0Var2) {
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0036  */
    /* JADX INFO: renamed from: e */
    public Animator m177951e(ViewGroup viewGroup, g9j0 g9j0Var, int i, g9j0 g9j0Var2, int i2) {
        View view;
        boolean z;
        View view2;
        boolean z2;
        if ((this.f157841a & 2) != 2 || g9j0Var == null) {
            return null;
        }
        View view3 = g9j0Var.f101571b;
        View viewM120085a = g9j0Var2 != null ? g9j0Var2.f101571b : null;
        View view4 = (View) view3.getTag(a4c0.f67494c);
        if (view4 != null) {
            view2 = null;
            z2 = true;
        } else {
            if (viewM120085a == null || viewM120085a.getParent() == null) {
                if (viewM120085a != null) {
                    view = null;
                    z = false;
                } else {
                    viewM120085a = null;
                    view = null;
                    z = true;
                }
            } else if (i2 == 4 || view3 == viewM120085a) {
                view = viewM120085a;
                z = false;
                viewM120085a = null;
            } else {
                viewM120085a = null;
                view = null;
                z = true;
            }
            if (z) {
                if (view3.getParent() != null) {
                    if (view3.getParent() instanceof View) {
                        View view5 = (View) view3.getParent();
                        if (m177947a(getTransitionValues(view5, true), getMatchedTransitionValues(view5, true)).f157852a) {
                            int id = view5.getId();
                            if (view5.getParent() != null || id == -1 || viewGroup.findViewById(id) == null || !this.mCanRemoveViews) {
                            }
                        } else {
                            viewM120085a = f9j0.m120085a(viewGroup, view3, view5);
                        }
                    }
                    View view6 = view;
                    view4 = viewM120085a;
                    view2 = view6;
                    z2 = false;
                }
                view2 = view;
                z2 = false;
                view4 = view3;
            } else {
                View view7 = view;
                view4 = viewM120085a;
                view2 = view7;
                z2 = false;
            }
        }
        if (view4 == null) {
            if (view2 == null) {
                return null;
            }
            int visibility = view2.getVisibility();
            del0.m111275h(view2, 0);
            Animator animatorMo177950d = mo177950d(viewGroup, view2, g9j0Var, g9j0Var2);
            if (animatorMo177950d == null) {
                del0.m111275h(view2, visibility);
                return animatorMo177950d;
            }
            C19644b c19644b = new C19644b(view2, i2, true);
            animatorMo177950d.addListener(c19644b);
            kr0.m146960a(animatorMo177950d, c19644b);
            addListener(c19644b);
            return animatorMo177950d;
        }
        if (!z2) {
            int[] iArr = (int[]) g9j0Var.f101570a.get("android:visibility:screenLocation");
            int i3 = iArr[0];
            int i4 = iArr[1];
            int[] iArr2 = new int[2];
            viewGroup.getLocationOnScreen(iArr2);
            view4.offsetLeftAndRight((i3 - iArr2[0]) - view4.getLeft());
            view4.offsetTopAndBottom((i4 - iArr2[1]) - view4.getTop());
            zbl0.m217910a(viewGroup).mo202578c(view4);
        }
        Animator animatorMo177950d2 = mo177950d(viewGroup, view4, g9j0Var, g9j0Var2);
        if (!z2) {
            if (animatorMo177950d2 == null) {
                zbl0.m217910a(viewGroup).mo202579d(view4);
                return animatorMo177950d2;
            }
            view3.setTag(a4c0.f67494c, view4);
            addListener(new C19643a(viewGroup, view4, view3));
        }
        return animatorMo177950d2;
    }

    /* JADX INFO: renamed from: f */
    public void m177952f(int i) {
        if ((i & (-4)) == 0) {
            this.f157841a = i;
        } else {
            ig3.m135964a("Only MODE_IN and MODE_OUT flags are allowed");
        }
    }

    @Override // p149l.u7j0
    @Nullable
    public String[] getTransitionProperties() {
        return f157840b;
    }

    @Override // p149l.u7j0
    public boolean isTransitionRequired(g9j0 g9j0Var, g9j0 g9j0Var2) {
        if (g9j0Var == null && g9j0Var2 == null) {
            return false;
        }
        if (g9j0Var != null && g9j0Var2 != null && g9j0Var2.f101570a.containsKey("android:visibility:visibility") != g9j0Var.f101570a.containsKey("android:visibility:visibility")) {
            return false;
        }
        C19645c c19645cM177947a = m177947a(g9j0Var, g9j0Var2);
        return c19645cM177947a.f157852a && (c19645cM177947a.f157854c == 0 || c19645cM177947a.f157855d == 0);
    }

    /* JADX INFO: renamed from: l.r5m0$b */
    public static class C19644b extends AnimatorListenerAdapter implements u7j0.InterfaceC20375g {

        /* JADX INFO: renamed from: a */
        public final View f157846a;

        /* JADX INFO: renamed from: b */
        public final int f157847b;

        /* JADX INFO: renamed from: c */
        public final ViewGroup f157848c;

        /* JADX INFO: renamed from: d */
        public final boolean f157849d;

        /* JADX INFO: renamed from: e */
        public boolean f157850e;

        /* JADX INFO: renamed from: f */
        public boolean f157851f = false;

        public C19644b(View view, int i, boolean z) {
            this.f157846a = view;
            this.f157847b = i;
            this.f157848c = (ViewGroup) view.getParent();
            this.f157849d = z;
            m177954g(true);
        }

        @Override // p149l.u7j0.InterfaceC20375g
        /* JADX INFO: renamed from: b */
        public void mo100097b(@NonNull u7j0 u7j0Var) {
            m177954g(false);
        }

        @Override // p149l.u7j0.InterfaceC20375g
        /* JADX INFO: renamed from: c */
        public void mo95445c(@NonNull u7j0 u7j0Var) {
            m177953f();
            u7j0Var.removeListener(this);
        }

        @Override // p149l.u7j0.InterfaceC20375g
        /* JADX INFO: renamed from: d */
        public void mo100098d(@NonNull u7j0 u7j0Var) {
            m177954g(true);
        }

        /* JADX INFO: renamed from: f */
        public final void m177953f() {
            if (!this.f157851f) {
                del0.m111275h(this.f157846a, this.f157847b);
                ViewGroup viewGroup = this.f157848c;
                if (viewGroup != null) {
                    viewGroup.invalidate();
                }
            }
            m177954g(false);
        }

        /* JADX INFO: renamed from: g */
        public final void m177954g(boolean z) {
            ViewGroup viewGroup;
            if (!this.f157849d || this.f157850e == z || (viewGroup = this.f157848c) == null) {
                return;
            }
            this.f157850e = z;
            zbl0.m217912c(viewGroup, z);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f157851f = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            m177953f();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            if (this.f157851f) {
                return;
            }
            del0.m111275h(this.f157846a, this.f157847b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            if (this.f157851f) {
                return;
            }
            del0.m111275h(this.f157846a, 0);
        }

        @Override // p149l.u7j0.InterfaceC20375g
        /* JADX INFO: renamed from: a */
        public void mo95446a(@NonNull u7j0 u7j0Var) {
        }

        @Override // p149l.u7j0.InterfaceC20375g
        /* JADX INFO: renamed from: e */
        public void mo100099e(@NonNull u7j0 u7j0Var) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }
}
