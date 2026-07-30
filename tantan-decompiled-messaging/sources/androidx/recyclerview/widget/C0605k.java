package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.ArrayList;
import java.util.List;
import p149l.gbl0;
import p149l.ig3;
import p149l.j2c0;
import p149l.sjj;

/* JADX INFO: renamed from: androidx.recyclerview.widget.k */
/* JADX INFO: loaded from: classes.dex */
public class C0605k extends RecyclerView.AbstractC0576n implements RecyclerView.InterfaceC0579q {

    /* JADX INFO: renamed from: B */
    public Rect f2843B;

    /* JADX INFO: renamed from: C */
    public long f2844C;

    /* JADX INFO: renamed from: d */
    public float f2848d;

    /* JADX INFO: renamed from: e */
    public float f2849e;

    /* JADX INFO: renamed from: f */
    public float f2850f;

    /* JADX INFO: renamed from: g */
    public float f2851g;

    /* JADX INFO: renamed from: h */
    public float f2852h;

    /* JADX INFO: renamed from: i */
    public float f2853i;

    /* JADX INFO: renamed from: j */
    public float f2854j;

    /* JADX INFO: renamed from: k */
    public float f2855k;

    /* JADX INFO: renamed from: m */
    @NonNull
    public e f2857m;

    /* JADX INFO: renamed from: o */
    public int f2859o;

    /* JADX INFO: renamed from: q */
    public int f2861q;

    /* JADX INFO: renamed from: r */
    public RecyclerView f2862r;

    /* JADX INFO: renamed from: t */
    public VelocityTracker f2864t;

    /* JADX INFO: renamed from: u */
    public List<RecyclerView.AbstractC0566d0> f2865u;

    /* JADX INFO: renamed from: v */
    public List<Integer> f2866v;

    /* JADX INFO: renamed from: y */
    public sjj f2869y;

    /* JADX INFO: renamed from: z */
    public f f2870z;

    /* JADX INFO: renamed from: a */
    public final List<View> f2845a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final float[] f2846b = new float[2];

    /* JADX INFO: renamed from: c */
    public RecyclerView.AbstractC0566d0 f2847c = null;

    /* JADX INFO: renamed from: l */
    public int f2856l = -1;

    /* JADX INFO: renamed from: n */
    public int f2858n = 0;

    /* JADX INFO: renamed from: p */
    @VisibleForTesting
    public List<g> f2860p = new ArrayList();

    /* JADX INFO: renamed from: s */
    public final Runnable f2863s = new a();

    /* JADX INFO: renamed from: w */
    public View f2867w = null;

    /* JADX INFO: renamed from: x */
    public int f2868x = -1;

    /* JADX INFO: renamed from: A */
    public final RecyclerView.InterfaceC0581s f2842A = new b();

    /* JADX INFO: renamed from: androidx.recyclerview.widget.k$a */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C0605k c0605k = C0605k.this;
            if (c0605k.f2847c == null || !c0605k.m3767y()) {
                return;
            }
            C0605k c0605k2 = C0605k.this;
            RecyclerView.AbstractC0566d0 abstractC0566d0 = c0605k2.f2847c;
            if (abstractC0566d0 != null) {
                c0605k2.m3762t(abstractC0566d0);
            }
            C0605k c0605k3 = C0605k.this;
            c0605k3.f2862r.removeCallbacks(c0605k3.f2863s);
            gbl0.m125185b0(C0605k.this.f2862r, this);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.k$b */
    public class b implements RecyclerView.InterfaceC0581s {
        public b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0581s
        /* JADX INFO: renamed from: a */
        public void mo3416a(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
            C0605k.this.f2869y.m184493a(motionEvent);
            VelocityTracker velocityTracker = C0605k.this.f2864t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (C0605k.this.f2856l == -1) {
                return;
            }
            int actionMasked = motionEvent.getActionMasked();
            int iFindPointerIndex = motionEvent.findPointerIndex(C0605k.this.f2856l);
            if (iFindPointerIndex >= 0) {
                C0605k.this.m3752i(actionMasked, motionEvent, iFindPointerIndex);
            }
            C0605k c0605k = C0605k.this;
            RecyclerView.AbstractC0566d0 abstractC0566d0 = c0605k.f2847c;
            if (abstractC0566d0 == null) {
                return;
            }
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    if (iFindPointerIndex >= 0) {
                        c0605k.m3748E(motionEvent, c0605k.f2859o, iFindPointerIndex);
                        C0605k.this.m3762t(abstractC0566d0);
                        C0605k c0605k2 = C0605k.this;
                        c0605k2.f2862r.removeCallbacks(c0605k2.f2863s);
                        C0605k.this.f2863s.run();
                        C0605k.this.f2862r.invalidate();
                        return;
                    }
                    return;
                }
                if (actionMasked != 3) {
                    if (actionMasked != 6) {
                        return;
                    }
                    int actionIndex = motionEvent.getActionIndex();
                    int pointerId = motionEvent.getPointerId(actionIndex);
                    C0605k c0605k3 = C0605k.this;
                    if (pointerId == c0605k3.f2856l) {
                        c0605k3.f2856l = motionEvent.getPointerId(actionIndex == 0 ? 1 : 0);
                        C0605k c0605k4 = C0605k.this;
                        c0605k4.m3748E(motionEvent, c0605k4.f2859o, actionIndex);
                        return;
                    }
                    return;
                }
                VelocityTracker velocityTracker2 = c0605k.f2864t;
                if (velocityTracker2 != null) {
                    velocityTracker2.clear();
                }
            }
            C0605k.this.m3768z(null, 0);
            C0605k.this.f2856l = -1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0581s
        /* JADX INFO: renamed from: c */
        public boolean mo3417c(@NonNull RecyclerView recyclerView, @NonNull MotionEvent motionEvent) {
            int iFindPointerIndex;
            g gVarM3756m;
            C0605k.this.f2869y.m184493a(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                C0605k.this.f2856l = motionEvent.getPointerId(0);
                C0605k.this.f2848d = motionEvent.getX();
                C0605k.this.f2849e = motionEvent.getY();
                C0605k.this.m3763u();
                C0605k c0605k = C0605k.this;
                if (c0605k.f2847c == null && (gVarM3756m = c0605k.m3756m(motionEvent)) != null) {
                    C0605k c0605k2 = C0605k.this;
                    c0605k2.f2848d -= gVarM3756m.f2893j;
                    c0605k2.f2849e -= gVarM3756m.f2894k;
                    c0605k2.m3755l(gVarM3756m.f2888e, true);
                    if (C0605k.this.f2845a.remove(gVarM3756m.f2888e.itemView)) {
                        C0605k c0605k3 = C0605k.this;
                        c0605k3.f2857m.mo3776c(c0605k3.f2862r, gVarM3756m.f2888e);
                    }
                    C0605k.this.m3768z(gVarM3756m.f2888e, gVarM3756m.f2889f);
                    C0605k c0605k4 = C0605k.this;
                    c0605k4.m3748E(motionEvent, c0605k4.f2859o, 0);
                }
            } else if (actionMasked == 3 || actionMasked == 1) {
                C0605k c0605k5 = C0605k.this;
                c0605k5.f2856l = -1;
                c0605k5.m3768z(null, 0);
            } else {
                int i = C0605k.this.f2856l;
                if (i != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                    C0605k.this.m3752i(actionMasked, motionEvent, iFindPointerIndex);
                }
            }
            VelocityTracker velocityTracker = C0605k.this.f2864t;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            return C0605k.this.f2847c != null;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0581s
        /* JADX INFO: renamed from: e */
        public void mo3418e(boolean z) {
            if (z) {
                C0605k.this.m3768z(null, 0);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.k$c */
    public class c extends g {

        /* JADX INFO: renamed from: o */
        public final /* synthetic */ int f2873o;

        /* JADX INFO: renamed from: p */
        public final /* synthetic */ RecyclerView.AbstractC0566d0 f2874p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(RecyclerView.AbstractC0566d0 abstractC0566d0, int i, int i2, float f, float f2, float f3, float f4, int i3, RecyclerView.AbstractC0566d0 abstractC0566d1) {
            super(abstractC0566d0, i, i2, f, f2, f3, f4);
            this.f2873o = i3;
            this.f2874p = abstractC0566d1;
        }

        @Override // androidx.recyclerview.widget.C0605k.g, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (this.f2895l) {
                return;
            }
            int i = this.f2873o;
            C0605k c0605k = C0605k.this;
            if (i <= 0) {
                c0605k.f2857m.mo3776c(c0605k.f2862r, this.f2874p);
            } else {
                c0605k.f2845a.add(this.f2874p.itemView);
                this.f2892i = true;
                int i2 = this.f2873o;
                if (i2 > 0) {
                    C0605k.this.m3764v(this, i2);
                }
            }
            C0605k c0605k2 = C0605k.this;
            View view = c0605k2.f2867w;
            View view2 = this.f2874p.itemView;
            if (view == view2) {
                c0605k2.m3766x(view2);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.k$d */
    public class d implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ g f2876a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f2877b;

        public d(g gVar, int i) {
            this.f2876a = gVar;
            this.f2877b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            RecyclerView recyclerView = C0605k.this.f2862r;
            if (recyclerView == null || !recyclerView.isAttachedToWindow()) {
                return;
            }
            g gVar = this.f2876a;
            if (gVar.f2895l || gVar.f2888e.getAbsoluteAdapterPosition() == -1) {
                return;
            }
            RecyclerView.AbstractC0574l itemAnimator = C0605k.this.f2862r.getItemAnimator();
            if ((itemAnimator == null || !itemAnimator.isRunning(null)) && !C0605k.this.m3761r()) {
                C0605k.this.f2857m.mo3773B(this.f2876a.f2888e, this.f2877b);
            } else {
                C0605k.this.f2862r.post(this);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.k$e */
    public static abstract class e {

        /* JADX INFO: renamed from: b */
        public static final Interpolator f2879b = new a();

        /* JADX INFO: renamed from: c */
        public static final Interpolator f2880c = new b();

        /* JADX INFO: renamed from: a */
        public int f2881a = -1;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.k$e$a */
        public class a implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                return f * f * f * f * f;
            }
        }

        /* JADX INFO: renamed from: androidx.recyclerview.widget.k$e$b */
        public class b implements Interpolator {
            @Override // android.animation.TimeInterpolator
            public float getInterpolation(float f) {
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            }
        }

        /* JADX INFO: renamed from: e */
        public static int m3769e(int i, int i2) {
            int i3;
            int i4 = i & 789516;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (~i4);
            if (i2 == 0) {
                i3 = i4 << 2;
            } else {
                int i6 = i4 << 1;
                i5 |= (-789517) & i6;
                i3 = (i6 & 789516) << 2;
            }
            return i5 | i3;
        }

        /* JADX INFO: renamed from: s */
        public static int m3770s(int i, int i2) {
            return i2 << (i * 8);
        }

        /* JADX INFO: renamed from: t */
        public static int m3771t(int i, int i2) {
            return m3770s(2, i) | m3770s(1, i2) | m3770s(0, i2 | i);
        }

        /* JADX INFO: renamed from: A */
        public void mo3772A(@Nullable RecyclerView.AbstractC0566d0 abstractC0566d0, int i) {
            if (abstractC0566d0 != null) {
                C0606l.INSTANCE.mo3804a(abstractC0566d0.itemView);
            }
        }

        /* JADX INFO: renamed from: B */
        public abstract void mo3773B(@NonNull RecyclerView.AbstractC0566d0 abstractC0566d0, int i);

        /* JADX INFO: renamed from: a */
        public boolean m3774a(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.AbstractC0566d0 abstractC0566d0, @NonNull RecyclerView.AbstractC0566d0 abstractC0566d1) {
            return true;
        }

        @SuppressLint({"UnknownNullness"})
        /* JADX INFO: renamed from: b */
        public RecyclerView.AbstractC0566d0 m3775b(@NonNull RecyclerView.AbstractC0566d0 abstractC0566d0, @NonNull List<RecyclerView.AbstractC0566d0> list, int i, int i2) {
            int bottom;
            int iAbs;
            int top;
            int iAbs2;
            int left;
            int iAbs3;
            int right;
            int iAbs4;
            int width = abstractC0566d0.itemView.getWidth() + i;
            int height = abstractC0566d0.itemView.getHeight() + i2;
            int left2 = i - abstractC0566d0.itemView.getLeft();
            int top2 = i2 - abstractC0566d0.itemView.getTop();
            int size = list.size();
            RecyclerView.AbstractC0566d0 abstractC0566d1 = null;
            int i3 = -1;
            for (int i4 = 0; i4 < size; i4++) {
                RecyclerView.AbstractC0566d0 abstractC0566d2 = list.get(i4);
                if (left2 > 0 && (right = abstractC0566d2.itemView.getRight() - width) < 0 && abstractC0566d2.itemView.getRight() > abstractC0566d0.itemView.getRight() && (iAbs4 = Math.abs(right)) > i3) {
                    abstractC0566d1 = abstractC0566d2;
                    i3 = iAbs4;
                }
                if (left2 < 0 && (left = abstractC0566d2.itemView.getLeft() - i) > 0 && abstractC0566d2.itemView.getLeft() < abstractC0566d0.itemView.getLeft() && (iAbs3 = Math.abs(left)) > i3) {
                    abstractC0566d1 = abstractC0566d2;
                    i3 = iAbs3;
                }
                if (top2 < 0 && (top = abstractC0566d2.itemView.getTop() - i2) > 0 && abstractC0566d2.itemView.getTop() < abstractC0566d0.itemView.getTop() && (iAbs2 = Math.abs(top)) > i3) {
                    abstractC0566d1 = abstractC0566d2;
                    i3 = iAbs2;
                }
                if (top2 > 0 && (bottom = abstractC0566d2.itemView.getBottom() - height) < 0 && abstractC0566d2.itemView.getBottom() > abstractC0566d0.itemView.getBottom() && (iAbs = Math.abs(bottom)) > i3) {
                    abstractC0566d1 = abstractC0566d2;
                    i3 = iAbs;
                }
            }
            return abstractC0566d1;
        }

        /* JADX INFO: renamed from: c */
        public void mo3776c(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.AbstractC0566d0 abstractC0566d0) {
            C0606l.INSTANCE.mo3806c(abstractC0566d0.itemView);
        }

        /* JADX INFO: renamed from: d */
        public int m3777d(int i, int i2) {
            int i3;
            int i4 = i & 3158064;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (~i4);
            if (i2 == 0) {
                i3 = i4 >> 2;
            } else {
                int i6 = i4 >> 1;
                i5 |= (-3158065) & i6;
                i3 = (3158064 & i6) >> 2;
            }
            return i3 | i5;
        }

        /* JADX INFO: renamed from: f */
        public final int m3778f(RecyclerView recyclerView, RecyclerView.AbstractC0566d0 abstractC0566d0) {
            return m3777d(mo3783k(recyclerView, abstractC0566d0), gbl0.m125228x(recyclerView));
        }

        /* JADX INFO: renamed from: g */
        public long m3779g(@NonNull RecyclerView recyclerView, int i, float f, float f2) {
            RecyclerView.AbstractC0574l itemAnimator = recyclerView.getItemAnimator();
            if (itemAnimator == null) {
                return i == 8 ? 200L : 250L;
            }
            return i == 8 ? itemAnimator.getMoveDuration() : itemAnimator.getRemoveDuration();
        }

        /* JADX INFO: renamed from: h */
        public int m3780h() {
            return 0;
        }

        /* JADX INFO: renamed from: i */
        public final int m3781i(RecyclerView recyclerView) {
            if (this.f2881a == -1) {
                this.f2881a = recyclerView.getResources().getDimensionPixelSize(j2c0.f115911d);
            }
            return this.f2881a;
        }

        /* JADX INFO: renamed from: j */
        public float m3782j(@NonNull RecyclerView.AbstractC0566d0 abstractC0566d0) {
            return 0.5f;
        }

        /* JADX INFO: renamed from: k */
        public abstract int mo3783k(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.AbstractC0566d0 abstractC0566d0);

        /* JADX INFO: renamed from: l */
        public float mo3784l(float f) {
            return f;
        }

        /* JADX INFO: renamed from: m */
        public float mo3785m(@NonNull RecyclerView.AbstractC0566d0 abstractC0566d0) {
            return 0.5f;
        }

        /* JADX INFO: renamed from: n */
        public float m3786n(float f) {
            return f;
        }

        /* JADX INFO: renamed from: o */
        public boolean m3787o(RecyclerView recyclerView, RecyclerView.AbstractC0566d0 abstractC0566d0) {
            return (m3778f(recyclerView, abstractC0566d0) & 16711680) != 0;
        }

        /* JADX INFO: renamed from: p */
        public int m3788p(@NonNull RecyclerView recyclerView, int i, int i2, int i3, long j) {
            int iSignum = (int) (((int) (((int) Math.signum(i2)) * m3781i(recyclerView) * f2880c.getInterpolation(Math.min(1.0f, (Math.abs(i2) * 1.0f) / i)))) * f2879b.getInterpolation(j <= 2000 ? j / 2000.0f : 1.0f));
            if (iSignum == 0) {
                return i2 > 0 ? 1 : -1;
            }
            return iSignum;
        }

        /* JADX INFO: renamed from: q */
        public boolean mo3789q() {
            return true;
        }

        /* JADX INFO: renamed from: r */
        public boolean mo3790r() {
            return true;
        }

        /* JADX INFO: renamed from: u */
        public void mo3791u(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.AbstractC0566d0 abstractC0566d0, float f, float f2, int i, boolean z) {
            C0606l.INSTANCE.mo3805b(canvas, recyclerView, abstractC0566d0.itemView, f, f2, i, z);
        }

        /* JADX INFO: renamed from: v */
        public void m3792v(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @SuppressLint({"UnknownNullness"}) RecyclerView.AbstractC0566d0 abstractC0566d0, float f, float f2, int i, boolean z) {
            C0606l.INSTANCE.mo3807d(canvas, recyclerView, abstractC0566d0.itemView, f, f2, i, z);
        }

        /* JADX INFO: renamed from: w */
        public void m3793w(Canvas canvas, RecyclerView recyclerView, RecyclerView.AbstractC0566d0 abstractC0566d0, List<g> list, int i, float f, float f2) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                g gVar = list.get(i2);
                gVar.m3802e();
                int iSave = canvas.save();
                mo3791u(canvas, recyclerView, gVar.f2888e, gVar.f2893j, gVar.f2894k, gVar.f2889f, false);
                canvas.restoreToCount(iSave);
            }
            if (abstractC0566d0 != null) {
                int iSave2 = canvas.save();
                mo3791u(canvas, recyclerView, abstractC0566d0, f, f2, i, true);
                canvas.restoreToCount(iSave2);
            }
        }

        /* JADX INFO: renamed from: x */
        public void m3794x(Canvas canvas, RecyclerView recyclerView, RecyclerView.AbstractC0566d0 abstractC0566d0, List<g> list, int i, float f, float f2) {
            int size = list.size();
            boolean z = false;
            for (int i2 = 0; i2 < size; i2++) {
                g gVar = list.get(i2);
                int iSave = canvas.save();
                m3792v(canvas, recyclerView, gVar.f2888e, gVar.f2893j, gVar.f2894k, gVar.f2889f, false);
                canvas.restoreToCount(iSave);
            }
            if (abstractC0566d0 != null) {
                int iSave2 = canvas.save();
                m3792v(canvas, recyclerView, abstractC0566d0, f, f2, i, true);
                canvas.restoreToCount(iSave2);
            }
            for (int i3 = size - 1; i3 >= 0; i3--) {
                g gVar2 = list.get(i3);
                boolean z2 = gVar2.f2896m;
                if (z2 && !gVar2.f2892i) {
                    list.remove(i3);
                } else if (!z2) {
                    z = true;
                }
            }
            if (z) {
                recyclerView.invalidate();
            }
        }

        /* JADX INFO: renamed from: y */
        public abstract boolean mo3795y(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.AbstractC0566d0 abstractC0566d0, @NonNull RecyclerView.AbstractC0566d0 abstractC0566d1);

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: z */
        public void m3796z(@NonNull RecyclerView recyclerView, @NonNull RecyclerView.AbstractC0566d0 abstractC0566d0, int i, @NonNull RecyclerView.AbstractC0566d0 abstractC0566d1, int i2, int i3, int i4) {
            RecyclerView.AbstractC0577o layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof h) {
                ((h) layoutManager).prepareForDrop(abstractC0566d0.itemView, abstractC0566d1.itemView, i3, i4);
                return;
            }
            if (layoutManager.canScrollHorizontally()) {
                if (layoutManager.getDecoratedLeft(abstractC0566d1.itemView) <= recyclerView.getPaddingLeft()) {
                    recyclerView.scrollToPosition(i2);
                }
                if (layoutManager.getDecoratedRight(abstractC0566d1.itemView) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.scrollToPosition(i2);
                }
            }
            if (layoutManager.canScrollVertically()) {
                if (layoutManager.getDecoratedTop(abstractC0566d1.itemView) <= recyclerView.getPaddingTop()) {
                    recyclerView.scrollToPosition(i2);
                }
                if (layoutManager.getDecoratedBottom(abstractC0566d1.itemView) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.scrollToPosition(i2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.k$f */
    public class f extends GestureDetector.SimpleOnGestureListener {

        /* JADX INFO: renamed from: a */
        public boolean f2882a = true;

        public f() {
        }

        /* JADX INFO: renamed from: a */
        public void m3797a() {
            this.f2882a = false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public void onLongPress(MotionEvent motionEvent) {
            View viewM3757n;
            RecyclerView.AbstractC0566d0 childViewHolder;
            if (!this.f2882a || (viewM3757n = C0605k.this.m3757n(motionEvent)) == null || (childViewHolder = C0605k.this.f2862r.getChildViewHolder(viewM3757n)) == null) {
                return;
            }
            C0605k c0605k = C0605k.this;
            if (c0605k.f2857m.m3787o(c0605k.f2862r, childViewHolder)) {
                int pointerId = motionEvent.getPointerId(0);
                int i = C0605k.this.f2856l;
                if (pointerId == i) {
                    int iFindPointerIndex = motionEvent.findPointerIndex(i);
                    float x = motionEvent.getX(iFindPointerIndex);
                    float y = motionEvent.getY(iFindPointerIndex);
                    C0605k c0605k2 = C0605k.this;
                    c0605k2.f2848d = x;
                    c0605k2.f2849e = y;
                    c0605k2.f2853i = 0.0f;
                    c0605k2.f2852h = 0.0f;
                    if (c0605k2.f2857m.mo3790r()) {
                        C0605k.this.m3768z(childViewHolder, 2);
                    }
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.k$g */
    @VisibleForTesting
    public static class g implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public final float f2884a;

        /* JADX INFO: renamed from: b */
        public final float f2885b;

        /* JADX INFO: renamed from: c */
        public final float f2886c;

        /* JADX INFO: renamed from: d */
        public final float f2887d;

        /* JADX INFO: renamed from: e */
        public final RecyclerView.AbstractC0566d0 f2888e;

        /* JADX INFO: renamed from: f */
        public final int f2889f;

        /* JADX INFO: renamed from: g */
        @VisibleForTesting
        public final ValueAnimator f2890g;

        /* JADX INFO: renamed from: h */
        public final int f2891h;

        /* JADX INFO: renamed from: i */
        public boolean f2892i;

        /* JADX INFO: renamed from: j */
        public float f2893j;

        /* JADX INFO: renamed from: k */
        public float f2894k;

        /* JADX INFO: renamed from: l */
        public boolean f2895l = false;

        /* JADX INFO: renamed from: m */
        public boolean f2896m = false;

        /* JADX INFO: renamed from: n */
        public float f2897n;

        /* JADX INFO: renamed from: androidx.recyclerview.widget.k$g$a */
        public class a implements ValueAnimator.AnimatorUpdateListener {
            public a() {
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                g.this.m3800c(valueAnimator.getAnimatedFraction());
            }
        }

        public g(RecyclerView.AbstractC0566d0 abstractC0566d0, int i, int i2, float f, float f2, float f3, float f4) {
            this.f2889f = i2;
            this.f2891h = i;
            this.f2888e = abstractC0566d0;
            this.f2884a = f;
            this.f2885b = f2;
            this.f2886c = f3;
            this.f2887d = f4;
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.f2890g = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new a());
            valueAnimatorOfFloat.setTarget(abstractC0566d0.itemView);
            valueAnimatorOfFloat.addListener(this);
            m3800c(0.0f);
        }

        /* JADX INFO: renamed from: a */
        public void m3798a() {
            this.f2890g.cancel();
        }

        /* JADX INFO: renamed from: b */
        public void m3799b(long j) {
            this.f2890g.setDuration(j);
        }

        /* JADX INFO: renamed from: c */
        public void m3800c(float f) {
            this.f2897n = f;
        }

        /* JADX INFO: renamed from: d */
        public void m3801d() {
            this.f2888e.setIsRecyclable(false);
            this.f2890g.start();
        }

        /* JADX INFO: renamed from: e */
        public void m3802e() {
            float f = this.f2884a;
            float f2 = this.f2886c;
            if (f == f2) {
                this.f2893j = this.f2888e.itemView.getTranslationX();
            } else {
                this.f2893j = f + (this.f2897n * (f2 - f));
            }
            float f3 = this.f2885b;
            float f4 = this.f2887d;
            if (f3 == f4) {
                this.f2894k = this.f2888e.itemView.getTranslationY();
            } else {
                this.f2894k = f3 + (this.f2897n * (f4 - f3));
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            m3800c(1.0f);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (!this.f2896m) {
                this.f2888e.setIsRecyclable(true);
            }
            this.f2896m = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.k$h */
    public interface h {
        void prepareForDrop(@NonNull View view, @NonNull View view2, int i, int i2);
    }

    public C0605k(@NonNull e eVar) {
        this.f2857m = eVar;
    }

    /* JADX INFO: renamed from: s */
    public static boolean m3743s(View view, float f2, float f3, float f4, float f5) {
        return f2 >= f4 && f2 <= f4 + ((float) view.getWidth()) && f3 >= f5 && f3 <= f5 + ((float) view.getHeight());
    }

    /* JADX INFO: renamed from: A */
    public final void m3744A() {
        this.f2861q = ViewConfiguration.get(this.f2862r.getContext()).getScaledTouchSlop();
        this.f2862r.addItemDecoration(this);
        this.f2862r.addOnItemTouchListener(this.f2842A);
        this.f2862r.addOnChildAttachStateChangeListener(this);
        m3745B();
    }

    /* JADX INFO: renamed from: B */
    public final void m3745B() {
        this.f2870z = new f();
        this.f2869y = new sjj(this.f2862r.getContext(), this.f2870z);
    }

    /* JADX INFO: renamed from: C */
    public final void m3746C() {
        f fVar = this.f2870z;
        if (fVar != null) {
            fVar.m3797a();
            this.f2870z = null;
        }
        if (this.f2869y != null) {
            this.f2869y = null;
        }
    }

    /* JADX INFO: renamed from: D */
    public final int m3747D(RecyclerView.AbstractC0566d0 abstractC0566d0) {
        if (this.f2858n == 2) {
            return 0;
        }
        int iMo3783k = this.f2857m.mo3783k(this.f2862r, abstractC0566d0);
        int iM3777d = (this.f2857m.m3777d(iMo3783k, gbl0.m125228x(this.f2862r)) & 65280) >> 8;
        if (iM3777d == 0) {
            return 0;
        }
        int i = (iMo3783k & 65280) >> 8;
        if (Math.abs(this.f2852h) > Math.abs(this.f2853i)) {
            int iM3751h = m3751h(abstractC0566d0, iM3777d);
            if (iM3751h > 0) {
                return (i & iM3751h) == 0 ? e.m3769e(iM3751h, gbl0.m125228x(this.f2862r)) : iM3751h;
            }
            int iM3753j = m3753j(abstractC0566d0, iM3777d);
            if (iM3753j > 0) {
                return iM3753j;
            }
        } else {
            int iM3753j2 = m3753j(abstractC0566d0, iM3777d);
            if (iM3753j2 > 0) {
                return iM3753j2;
            }
            int iM3751h2 = m3751h(abstractC0566d0, iM3777d);
            if (iM3751h2 > 0) {
                return (i & iM3751h2) == 0 ? e.m3769e(iM3751h2, gbl0.m125228x(this.f2862r)) : iM3751h2;
            }
        }
        return 0;
    }

    /* JADX INFO: renamed from: E */
    public void m3748E(MotionEvent motionEvent, int i, int i2) {
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f2 = x - this.f2848d;
        this.f2852h = f2;
        this.f2853i = y - this.f2849e;
        if ((i & 4) == 0) {
            this.f2852h = Math.max(0.0f, f2);
        }
        if ((i & 8) == 0) {
            this.f2852h = Math.min(0.0f, this.f2852h);
        }
        if ((i & 1) == 0) {
            this.f2853i = Math.max(0.0f, this.f2853i);
        }
        if ((i & 2) == 0) {
            this.f2853i = Math.min(0.0f, this.f2853i);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0579q
    /* JADX INFO: renamed from: b */
    public void mo3413b(@NonNull View view) {
        m3766x(view);
        RecyclerView.AbstractC0566d0 childViewHolder = this.f2862r.getChildViewHolder(view);
        if (childViewHolder == null) {
            return;
        }
        RecyclerView.AbstractC0566d0 abstractC0566d0 = this.f2847c;
        if (abstractC0566d0 != null && childViewHolder == abstractC0566d0) {
            m3768z(null, 0);
            return;
        }
        m3755l(childViewHolder, false);
        if (this.f2845a.remove(childViewHolder.itemView)) {
            this.f2857m.mo3776c(this.f2862r, childViewHolder);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.InterfaceC0579q
    /* JADX INFO: renamed from: d */
    public void mo3414d(@NonNull View view) {
    }

    /* JADX INFO: renamed from: f */
    public final void m3749f() {
    }

    /* JADX INFO: renamed from: g */
    public void m3750g(@Nullable RecyclerView recyclerView) {
        RecyclerView recyclerView2 = this.f2862r;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            m3754k();
        }
        this.f2862r = recyclerView;
        if (recyclerView != null) {
            Resources resources = recyclerView.getResources();
            this.f2850f = resources.getDimension(j2c0.f115913f);
            this.f2851g = resources.getDimension(j2c0.f115912e);
            m3744A();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
    @SuppressLint({"UnknownNullness"})
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0588z c0588z) {
        rect.setEmpty();
    }

    /* JADX INFO: renamed from: h */
    public final int m3751h(RecyclerView.AbstractC0566d0 abstractC0566d0, int i) {
        if ((i & 12) == 0) {
            return 0;
        }
        int i2 = this.f2852h > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.f2864t;
        if (velocityTracker != null && this.f2856l > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.f2857m.m3786n(this.f2851g));
            float xVelocity = this.f2864t.getXVelocity(this.f2856l);
            float yVelocity = this.f2864t.getYVelocity(this.f2856l);
            int i3 = xVelocity > 0.0f ? 8 : 4;
            float fAbs = Math.abs(xVelocity);
            if ((i3 & i) != 0 && i2 == i3 && fAbs >= this.f2857m.mo3784l(this.f2850f) && fAbs > Math.abs(yVelocity)) {
                return i3;
            }
        }
        float width = this.f2862r.getWidth() * this.f2857m.mo3785m(abstractC0566d0);
        if ((i & i2) == 0 || Math.abs(this.f2852h) <= width) {
            return 0;
        }
        return i2;
    }

    /* JADX INFO: renamed from: i */
    public void m3752i(int i, MotionEvent motionEvent, int i2) {
        RecyclerView.AbstractC0566d0 abstractC0566d0M3759p;
        int iM3778f;
        if (this.f2847c != null || i != 2 || this.f2858n == 2 || !this.f2857m.mo3789q() || this.f2862r.getScrollState() == 1 || (abstractC0566d0M3759p = m3759p(motionEvent)) == null || (iM3778f = (this.f2857m.m3778f(this.f2862r, abstractC0566d0M3759p) & 65280) >> 8) == 0) {
            return;
        }
        float x = motionEvent.getX(i2);
        float y = motionEvent.getY(i2);
        float f2 = x - this.f2848d;
        float f3 = y - this.f2849e;
        float fAbs = Math.abs(f2);
        float fAbs2 = Math.abs(f3);
        int i3 = this.f2861q;
        if (fAbs >= i3 || fAbs2 >= i3) {
            if (fAbs > fAbs2) {
                if (f2 < 0.0f && (iM3778f & 4) == 0) {
                    return;
                }
                if (f2 > 0.0f && (iM3778f & 8) == 0) {
                    return;
                }
            } else {
                if (f3 < 0.0f && (iM3778f & 1) == 0) {
                    return;
                }
                if (f3 > 0.0f && (iM3778f & 2) == 0) {
                    return;
                }
            }
            this.f2853i = 0.0f;
            this.f2852h = 0.0f;
            this.f2856l = motionEvent.getPointerId(0);
            m3768z(abstractC0566d0M3759p, 1);
        }
    }

    /* JADX INFO: renamed from: j */
    public final int m3753j(RecyclerView.AbstractC0566d0 abstractC0566d0, int i) {
        if ((i & 3) == 0) {
            return 0;
        }
        int i2 = this.f2853i > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.f2864t;
        if (velocityTracker != null && this.f2856l > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.f2857m.m3786n(this.f2851g));
            float xVelocity = this.f2864t.getXVelocity(this.f2856l);
            float yVelocity = this.f2864t.getYVelocity(this.f2856l);
            int i3 = yVelocity > 0.0f ? 2 : 1;
            float fAbs = Math.abs(yVelocity);
            if ((i3 & i) != 0 && i3 == i2 && fAbs >= this.f2857m.mo3784l(this.f2850f) && fAbs > Math.abs(xVelocity)) {
                return i3;
            }
        }
        float height = this.f2862r.getHeight() * this.f2857m.mo3785m(abstractC0566d0);
        if ((i & i2) == 0 || Math.abs(this.f2853i) <= height) {
            return 0;
        }
        return i2;
    }

    /* JADX INFO: renamed from: k */
    public final void m3754k() {
        this.f2862r.removeItemDecoration(this);
        this.f2862r.removeOnItemTouchListener(this.f2842A);
        this.f2862r.removeOnChildAttachStateChangeListener(this);
        int size = this.f2860p.size();
        while (true) {
            size--;
            List<g> list = this.f2860p;
            if (size < 0) {
                list.clear();
                this.f2867w = null;
                this.f2868x = -1;
                m3765w();
                m3746C();
                return;
            }
            g gVar = list.get(0);
            gVar.m3798a();
            this.f2857m.mo3776c(this.f2862r, gVar.f2888e);
        }
    }

    /* JADX INFO: renamed from: l */
    public void m3755l(RecyclerView.AbstractC0566d0 abstractC0566d0, boolean z) {
        for (int size = this.f2860p.size() - 1; size >= 0; size--) {
            g gVar = this.f2860p.get(size);
            if (gVar.f2888e == abstractC0566d0) {
                gVar.f2895l |= z;
                if (!gVar.f2896m) {
                    gVar.m3798a();
                }
                this.f2860p.remove(size);
                return;
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public g m3756m(MotionEvent motionEvent) {
        if (this.f2860p.isEmpty()) {
            return null;
        }
        View viewM3757n = m3757n(motionEvent);
        for (int size = this.f2860p.size() - 1; size >= 0; size--) {
            g gVar = this.f2860p.get(size);
            if (gVar.f2888e.itemView == viewM3757n) {
                return gVar;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public View m3757n(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        RecyclerView.AbstractC0566d0 abstractC0566d0 = this.f2847c;
        if (abstractC0566d0 != null) {
            View view = abstractC0566d0.itemView;
            if (m3743s(view, x, y, this.f2854j + this.f2852h, this.f2855k + this.f2853i)) {
                return view;
            }
        }
        for (int size = this.f2860p.size() - 1; size >= 0; size--) {
            g gVar = this.f2860p.get(size);
            View view2 = gVar.f2888e.itemView;
            if (m3743s(view2, x, y, gVar.f2893j, gVar.f2894k)) {
                return view2;
            }
        }
        return this.f2862r.findChildViewUnder(x, y);
    }

    /* JADX INFO: renamed from: o */
    public final List<RecyclerView.AbstractC0566d0> m3758o(RecyclerView.AbstractC0566d0 abstractC0566d0) {
        RecyclerView.AbstractC0566d0 abstractC0566d1 = abstractC0566d0;
        List<RecyclerView.AbstractC0566d0> list = this.f2865u;
        if (list == null) {
            this.f2865u = new ArrayList();
            this.f2866v = new ArrayList();
        } else {
            list.clear();
            this.f2866v.clear();
        }
        int iM3780h = this.f2857m.m3780h();
        int iRound = Math.round(this.f2854j + this.f2852h) - iM3780h;
        int iRound2 = Math.round(this.f2855k + this.f2853i) - iM3780h;
        int i = iM3780h * 2;
        int width = abstractC0566d1.itemView.getWidth() + iRound + i;
        int height = abstractC0566d1.itemView.getHeight() + iRound2 + i;
        int i2 = (iRound + width) / 2;
        int i3 = (iRound2 + height) / 2;
        RecyclerView.AbstractC0577o layoutManager = this.f2862r.getLayoutManager();
        int childCount = layoutManager.getChildCount();
        int i4 = 0;
        while (i4 < childCount) {
            View childAt = layoutManager.getChildAt(i4);
            if (childAt != abstractC0566d1.itemView && childAt.getBottom() >= iRound2 && childAt.getTop() <= height && childAt.getRight() >= iRound && childAt.getLeft() <= width) {
                RecyclerView.AbstractC0566d0 childViewHolder = this.f2862r.getChildViewHolder(childAt);
                if (this.f2857m.m3774a(this.f2862r, this.f2847c, childViewHolder)) {
                    int iAbs = Math.abs(i2 - ((childAt.getLeft() + childAt.getRight()) / 2));
                    int iAbs2 = Math.abs(i3 - ((childAt.getTop() + childAt.getBottom()) / 2));
                    int i5 = (iAbs * iAbs) + (iAbs2 * iAbs2);
                    int size = this.f2865u.size();
                    int i6 = 0;
                    for (int i7 = 0; i7 < size && i5 > this.f2866v.get(i7).intValue(); i7++) {
                        i6++;
                    }
                    this.f2865u.add(i6, childViewHolder);
                    this.f2866v.add(i6, Integer.valueOf(i5));
                }
            }
            i4++;
            abstractC0566d1 = abstractC0566d0;
        }
        return this.f2865u;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
    @SuppressLint({"UnknownNullness"})
    public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.C0588z c0588z) {
        float f2;
        float f3;
        this.f2868x = -1;
        if (this.f2847c != null) {
            m3760q(this.f2846b);
            float[] fArr = this.f2846b;
            float f4 = fArr[0];
            f3 = fArr[1];
            f2 = f4;
        } else {
            f2 = 0.0f;
            f3 = 0.0f;
        }
        this.f2857m.m3793w(canvas, recyclerView, this.f2847c, this.f2860p, this.f2858n, f2, f3);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
    public void onDrawOver(@NonNull Canvas canvas, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0588z c0588z) {
        float f2;
        float f3;
        if (this.f2847c != null) {
            m3760q(this.f2846b);
            float[] fArr = this.f2846b;
            float f4 = fArr[0];
            f3 = fArr[1];
            f2 = f4;
        } else {
            f2 = 0.0f;
            f3 = 0.0f;
        }
        this.f2857m.m3794x(canvas, recyclerView, this.f2847c, this.f2860p, this.f2858n, f2, f3);
    }

    /* JADX INFO: renamed from: p */
    public final RecyclerView.AbstractC0566d0 m3759p(MotionEvent motionEvent) {
        View viewM3757n;
        RecyclerView.AbstractC0577o layoutManager = this.f2862r.getLayoutManager();
        int i = this.f2856l;
        if (i == -1) {
            return null;
        }
        int iFindPointerIndex = motionEvent.findPointerIndex(i);
        float x = motionEvent.getX(iFindPointerIndex) - this.f2848d;
        float y = motionEvent.getY(iFindPointerIndex) - this.f2849e;
        float fAbs = Math.abs(x);
        float fAbs2 = Math.abs(y);
        int i2 = this.f2861q;
        if (fAbs < i2 && fAbs2 < i2) {
            return null;
        }
        if (fAbs > fAbs2 && layoutManager.canScrollHorizontally()) {
            return null;
        }
        if ((fAbs2 <= fAbs || !layoutManager.canScrollVertically()) && (viewM3757n = m3757n(motionEvent)) != null) {
            return this.f2862r.getChildViewHolder(viewM3757n);
        }
        return null;
    }

    /* JADX INFO: renamed from: q */
    public final void m3760q(float[] fArr) {
        if ((this.f2859o & 12) != 0) {
            fArr[0] = (this.f2854j + this.f2852h) - this.f2847c.itemView.getLeft();
        } else {
            fArr[0] = this.f2847c.itemView.getTranslationX();
        }
        if ((this.f2859o & 3) != 0) {
            fArr[1] = (this.f2855k + this.f2853i) - this.f2847c.itemView.getTop();
        } else {
            fArr[1] = this.f2847c.itemView.getTranslationY();
        }
    }

    /* JADX INFO: renamed from: r */
    public boolean m3761r() {
        int size = this.f2860p.size();
        for (int i = 0; i < size; i++) {
            if (!this.f2860p.get(i).f2896m) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: t */
    public void m3762t(RecyclerView.AbstractC0566d0 abstractC0566d0) {
        if (!this.f2862r.isLayoutRequested() && this.f2858n == 2) {
            float fM3782j = this.f2857m.m3782j(abstractC0566d0);
            int i = (int) (this.f2854j + this.f2852h);
            int i2 = (int) (this.f2855k + this.f2853i);
            if (Math.abs(i2 - abstractC0566d0.itemView.getTop()) >= abstractC0566d0.itemView.getHeight() * fM3782j || Math.abs(i - abstractC0566d0.itemView.getLeft()) >= abstractC0566d0.itemView.getWidth() * fM3782j) {
                List<RecyclerView.AbstractC0566d0> listM3758o = m3758o(abstractC0566d0);
                if (listM3758o.size() == 0) {
                    return;
                }
                RecyclerView.AbstractC0566d0 abstractC0566d0M3775b = this.f2857m.m3775b(abstractC0566d0, listM3758o, i, i2);
                if (abstractC0566d0M3775b == null) {
                    this.f2865u.clear();
                    this.f2866v.clear();
                    return;
                }
                int absoluteAdapterPosition = abstractC0566d0M3775b.getAbsoluteAdapterPosition();
                int absoluteAdapterPosition2 = abstractC0566d0.getAbsoluteAdapterPosition();
                if (this.f2857m.mo3795y(this.f2862r, abstractC0566d0, abstractC0566d0M3775b)) {
                    this.f2857m.m3796z(this.f2862r, abstractC0566d0, absoluteAdapterPosition2, abstractC0566d0M3775b, absoluteAdapterPosition, i, i2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public void m3763u() {
        VelocityTracker velocityTracker = this.f2864t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
        }
        this.f2864t = VelocityTracker.obtain();
    }

    /* JADX INFO: renamed from: v */
    public void m3764v(g gVar, int i) {
        this.f2862r.post(new d(gVar, i));
    }

    /* JADX INFO: renamed from: w */
    public final void m3765w() {
        VelocityTracker velocityTracker = this.f2864t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f2864t = null;
        }
    }

    /* JADX INFO: renamed from: x */
    public void m3766x(View view) {
        if (view == this.f2867w) {
            this.f2867w = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x007d  */
    /* JADX WARN: Code duplicated, block: B:37:0x00c4  */
    /* JADX INFO: renamed from: y */
    public boolean m3767y() {
        int iM3788p;
        int iM3788p2;
        if (this.f2847c == null) {
            this.f2844C = Long.MIN_VALUE;
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j = this.f2844C;
        long j2 = j == Long.MIN_VALUE ? 0L : jCurrentTimeMillis - j;
        RecyclerView.AbstractC0577o layoutManager = this.f2862r.getLayoutManager();
        if (this.f2843B == null) {
            this.f2843B = new Rect();
        }
        layoutManager.calculateItemDecorationsForChild(this.f2847c.itemView, this.f2843B);
        if (layoutManager.canScrollHorizontally()) {
            int i = (int) (this.f2854j + this.f2852h);
            int paddingLeft = (i - this.f2843B.left) - this.f2862r.getPaddingLeft();
            float f2 = this.f2852h;
            if ((f2 >= 0.0f || paddingLeft >= 0) && (f2 <= 0.0f || (paddingLeft = ((i + this.f2847c.itemView.getWidth()) + this.f2843B.right) - (this.f2862r.getWidth() - this.f2862r.getPaddingRight())) <= 0)) {
                iM3788p = 0;
            } else {
                iM3788p = paddingLeft;
            }
        } else {
            iM3788p = 0;
        }
        if (layoutManager.canScrollVertically()) {
            int i2 = (int) (this.f2855k + this.f2853i);
            iM3788p2 = (i2 - this.f2843B.top) - this.f2862r.getPaddingTop();
            float f3 = this.f2853i;
            if ((f3 >= 0.0f || iM3788p2 >= 0) && (f3 <= 0.0f || (iM3788p2 = ((i2 + this.f2847c.itemView.getHeight()) + this.f2843B.bottom) - (this.f2862r.getHeight() - this.f2862r.getPaddingBottom())) <= 0)) {
                iM3788p2 = 0;
            }
        } else {
            iM3788p2 = 0;
        }
        if (iM3788p != 0) {
            iM3788p = this.f2857m.m3788p(this.f2862r, this.f2847c.itemView.getWidth(), iM3788p, this.f2862r.getWidth(), j2);
        }
        int i3 = iM3788p;
        if (iM3788p2 != 0) {
            iM3788p2 = this.f2857m.m3788p(this.f2862r, this.f2847c.itemView.getHeight(), iM3788p2, this.f2862r.getHeight(), j2);
        }
        if (i3 == 0 && iM3788p2 == 0) {
            this.f2844C = Long.MIN_VALUE;
            return false;
        }
        if (this.f2844C == Long.MIN_VALUE) {
            this.f2844C = jCurrentTimeMillis;
        }
        this.f2862r.scrollBy(i3, iM3788p2);
        return true;
    }

    /* JADX INFO: renamed from: z */
    public void m3768z(@Nullable RecyclerView.AbstractC0566d0 abstractC0566d0, int i) {
        boolean z;
        float fSignum;
        float fSignum2;
        if (abstractC0566d0 == this.f2847c && i == this.f2858n) {
            return;
        }
        this.f2844C = Long.MIN_VALUE;
        int i2 = this.f2858n;
        m3755l(abstractC0566d0, true);
        this.f2858n = i;
        if (i == 2) {
            if (abstractC0566d0 == null) {
                ig3.m135964a("Must pass a ViewHolder when dragging");
                return;
            } else {
                this.f2867w = abstractC0566d0.itemView;
                m3749f();
            }
        }
        int i3 = (1 << ((i * 8) + 8)) - 1;
        RecyclerView.AbstractC0566d0 abstractC0566d1 = this.f2847c;
        boolean z2 = false;
        if (abstractC0566d1 != null) {
            if (abstractC0566d1.itemView.getParent() != null) {
                int iM3747D = i2 == 2 ? 0 : m3747D(abstractC0566d1);
                m3765w();
                int i4 = 4;
                if (iM3747D == 1 || iM3747D == 2) {
                    fSignum = 0.0f;
                    fSignum2 = Math.signum(this.f2853i) * this.f2862r.getHeight();
                } else if (iM3747D == 4 || iM3747D == 8 || iM3747D == 16 || iM3747D == 32) {
                    fSignum2 = 0.0f;
                    fSignum = Math.signum(this.f2852h) * this.f2862r.getWidth();
                } else {
                    fSignum = 0.0f;
                    fSignum2 = 0.0f;
                }
                if (i2 == 2) {
                    i4 = 8;
                } else if (iM3747D > 0) {
                    i4 = 2;
                }
                m3760q(this.f2846b);
                float[] fArr = this.f2846b;
                float f2 = fArr[0];
                float f3 = fArr[1];
                z = false;
                c cVar = new c(abstractC0566d1, i4, i2, f2, f3, fSignum, fSignum2, iM3747D, abstractC0566d1);
                cVar.m3799b(this.f2857m.m3779g(this.f2862r, i4, fSignum - f2, fSignum2 - f3));
                this.f2860p.add(cVar);
                cVar.m3801d();
                z2 = true;
            } else {
                z = false;
                m3766x(abstractC0566d1.itemView);
                this.f2857m.mo3776c(this.f2862r, abstractC0566d1);
                z2 = false;
            }
            this.f2847c = null;
        } else {
            z = false;
        }
        if (abstractC0566d0 != null) {
            this.f2859o = (this.f2857m.m3778f(this.f2862r, abstractC0566d0) & i3) >> (this.f2858n * 8);
            this.f2854j = abstractC0566d0.itemView.getLeft();
            this.f2855k = abstractC0566d0.itemView.getTop();
            this.f2847c = abstractC0566d0;
            if (i == 2) {
                abstractC0566d0.itemView.performHapticFeedback(z ? 1 : 0);
            }
        }
        ViewParent parent = this.f2862r.getParent();
        if (parent != null) {
            if (this.f2847c != null) {
                z = true;
            }
            parent.requestDisallowInterceptTouchEvent(z);
        }
        if (!z2) {
            this.f2862r.getLayoutManager().requestSimpleAnimationsInNextLayout();
        }
        this.f2857m.mo3772A(this.f2847c, this.f2858n);
        this.f2862r.invalidate();
    }
}
