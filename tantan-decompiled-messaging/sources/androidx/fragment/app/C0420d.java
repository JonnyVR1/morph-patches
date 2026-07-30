package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import androidx.annotation.AnimRes;
import androidx.annotation.NonNull;
import p149l.a0c0;
import p149l.gf4;
import p149l.p5c0;
import p149l.qkq0;
import p149l.yh50;

/* JADX INFO: renamed from: androidx.fragment.app.d */
/* JADX INFO: loaded from: classes.dex */
public class C0420d {

    /* JADX INFO: renamed from: androidx.fragment.app.d$a */
    public class a implements gf4.InterfaceC17068a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Fragment f2039a;

        public a(Fragment fragment) {
            this.f2039a = fragment;
        }

        @Override // p149l.gf4.InterfaceC17068a
        public void onCancel() {
            if (this.f2039a.getAnimatingAway() != null) {
                View animatingAway = this.f2039a.getAnimatingAway();
                this.f2039a.setAnimatingAway(null);
                animatingAway.clearAnimation();
            }
            this.f2039a.setAnimator(null);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.d$b */
    public class b implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewGroup f2040a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Fragment f2041b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ C0428l.g f2042c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ gf4 f2043d;

        /* JADX INFO: renamed from: androidx.fragment.app.d$b$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (b.this.f2041b.getAnimatingAway() != null) {
                    b.this.f2041b.setAnimatingAway(null);
                    b bVar = b.this;
                    bVar.f2042c.mo2613a(bVar.f2041b, bVar.f2043d);
                }
            }
        }

        public b(ViewGroup viewGroup, Fragment fragment, C0428l.g gVar, gf4 gf4Var) {
            this.f2040a = viewGroup;
            this.f2041b = fragment;
            this.f2042c = gVar;
            this.f2043d = gf4Var;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f2040a.post(new a());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.d$c */
    public class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewGroup f2045a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f2046b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Fragment f2047c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ C0428l.g f2048d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ gf4 f2049e;

        public c(ViewGroup viewGroup, View view, Fragment fragment, C0428l.g gVar, gf4 gf4Var) {
            this.f2045a = viewGroup;
            this.f2046b = view;
            this.f2047c = fragment;
            this.f2048d = gVar;
            this.f2049e = gf4Var;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2045a.endViewTransition(this.f2046b);
            Animator animator2 = this.f2047c.getAnimator();
            this.f2047c.setAnimator(null);
            if (animator2 == null || this.f2045a.indexOfChild(this.f2046b) >= 0) {
                return;
            }
            this.f2048d.mo2613a(this.f2047c, this.f2049e);
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m2737a(@NonNull Fragment fragment, @NonNull d dVar, @NonNull C0428l.g gVar) {
        View view = fragment.mView;
        ViewGroup viewGroup = fragment.mContainer;
        viewGroup.startViewTransition(view);
        gf4 gf4Var = new gf4();
        gf4Var.m125876d(new a(fragment));
        gVar.mo2614b(fragment, gf4Var);
        if (dVar.f2050a != null) {
            e eVar = new e(dVar.f2050a, viewGroup, view);
            fragment.setAnimatingAway(fragment.mView);
            eVar.setAnimationListener(new b(viewGroup, fragment, gVar, gf4Var));
            fragment.mView.startAnimation(eVar);
            return;
        }
        Animator animator = dVar.f2051b;
        fragment.setAnimator(animator);
        animator.addListener(new c(viewGroup, view, fragment, gVar, gf4Var));
        animator.setTarget(fragment.mView);
        animator.start();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0071 A[Catch: RuntimeException -> 0x0077, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x0077, blocks: (B:32:0x006b, B:34:0x0071), top: B:45:0x006b }] */
    /* JADX INFO: renamed from: b */
    public static d m2738b(@NonNull Context context, @NonNull Fragment fragment, boolean z) {
        Animator animatorLoadAnimator;
        int nextTransition = fragment.getNextTransition();
        int nextAnim = fragment.getNextAnim();
        fragment.setNextAnim(0);
        ViewGroup viewGroup = fragment.mContainer;
        if (viewGroup != null && viewGroup.getTag(p5c0.f147285c) != null) {
            fragment.mContainer.setTag(p5c0.f147285c, null);
        }
        ViewGroup viewGroup2 = fragment.mContainer;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation animationOnCreateAnimation = fragment.onCreateAnimation(nextTransition, z, nextAnim);
        if (animationOnCreateAnimation != null) {
            return new d(animationOnCreateAnimation);
        }
        Animator animatorOnCreateAnimator = fragment.onCreateAnimator(nextTransition, z, nextAnim);
        if (animatorOnCreateAnimator != null) {
            return new d(animatorOnCreateAnimator);
        }
        if (nextAnim == 0 && nextTransition != 0) {
            nextAnim = m2739c(nextTransition, z);
        }
        if (nextAnim != 0) {
            boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(nextAnim));
            if (zEquals) {
                try {
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, nextAnim);
                    if (animationLoadAnimation != null) {
                        return new d(animationLoadAnimation);
                    }
                } catch (Resources.NotFoundException e2) {
                    throw e2;
                } catch (RuntimeException unused) {
                    try {
                        animatorLoadAnimator = AnimatorInflater.loadAnimator(context, nextAnim);
                        if (animatorLoadAnimator != null) {
                            return new d(animatorLoadAnimator);
                        }
                    } catch (RuntimeException e3) {
                        if (zEquals) {
                            throw e3;
                        }
                        Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, nextAnim);
                        if (animationLoadAnimation2 != null) {
                            return new d(animationLoadAnimation2);
                        }
                    }
                }
            } else {
                animatorLoadAnimator = AnimatorInflater.loadAnimator(context, nextAnim);
                if (animatorLoadAnimator != null) {
                    return new d(animatorLoadAnimator);
                }
            }
        }
        return null;
    }

    @AnimRes
    /* JADX INFO: renamed from: c */
    public static int m2739c(int i, boolean z) {
        if (i == 4097) {
            return z ? a0c0.f67035e : a0c0.f67036f;
        }
        if (i == 4099) {
            return z ? a0c0.f67033c : a0c0.f67034d;
        }
        if (i != 8194) {
            return -1;
        }
        return z ? a0c0.f67031a : a0c0.f67032b;
    }

    /* JADX INFO: renamed from: androidx.fragment.app.d$d */
    public static class d {

        /* JADX INFO: renamed from: a */
        public final Animation f2050a;

        /* JADX INFO: renamed from: b */
        public final Animator f2051b;

        public d(Animation animation) {
            this.f2050a = animation;
            this.f2051b = null;
            if (animation != null) {
                return;
            }
            qkq0.m175383a("Animation cannot be null");
            throw null;
        }

        public d(Animator animator) {
            this.f2050a = null;
            this.f2051b = animator;
            if (animator != null) {
                return;
            }
            qkq0.m175383a("Animator cannot be null");
            throw null;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.d$e */
    public static class e extends AnimationSet implements Runnable {

        /* JADX INFO: renamed from: a */
        public final ViewGroup f2052a;

        /* JADX INFO: renamed from: b */
        public final View f2053b;

        /* JADX INFO: renamed from: c */
        public boolean f2054c;

        /* JADX INFO: renamed from: d */
        public boolean f2055d;

        /* JADX INFO: renamed from: e */
        public boolean f2056e;

        public e(@NonNull Animation animation, @NonNull ViewGroup viewGroup, @NonNull View view) {
            super(false);
            this.f2056e = true;
            this.f2052a = viewGroup;
            this.f2053b = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j, @NonNull Transformation transformation) {
            this.f2056e = true;
            if (this.f2054c) {
                return !this.f2055d;
            }
            if (!super.getTransformation(j, transformation)) {
                this.f2054c = true;
                yh50.m214787a(this.f2052a, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f2054c || !this.f2056e) {
                this.f2052a.endViewTransition(this.f2053b);
                this.f2055d = true;
            } else {
                this.f2056e = false;
                this.f2052a.post(this);
            }
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j, @NonNull Transformation transformation, float f) {
            this.f2056e = true;
            if (this.f2054c) {
                return !this.f2055d;
            }
            if (!super.getTransformation(j, transformation, f)) {
                this.f2054c = true;
                yh50.m214787a(this.f2052a, this);
            }
            return true;
        }
    }
}
