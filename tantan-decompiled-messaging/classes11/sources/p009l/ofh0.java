package p009l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.v;
import com.p000p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedAnimSwitchLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.gbl0;
import l.t100;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ofh0 extends v {

    /* JADX INFO: renamed from: m */
    public static final int f17945m = t100.e;

    /* JADX INFO: renamed from: a */
    public final ArrayList<RecyclerView.d0> f17946a = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    public final ArrayList<RecyclerView.d0> f17947b = new ArrayList<>();

    /* JADX INFO: renamed from: c */
    public final ArrayList<C1077j> f17948c = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    public final ArrayList<C1076i> f17949d = new ArrayList<>();

    /* JADX INFO: renamed from: e */
    public ArrayList<ArrayList<RecyclerView.d0>> f17950e = new ArrayList<>();

    /* JADX INFO: renamed from: f */
    public ArrayList<ArrayList<C1077j>> f17951f = new ArrayList<>();

    /* JADX INFO: renamed from: g */
    public ArrayList<ArrayList<C1076i>> f17952g = new ArrayList<>();

    /* JADX INFO: renamed from: h */
    public ArrayList<RecyclerView.d0> f17953h = new ArrayList<>();

    /* JADX INFO: renamed from: i */
    public ArrayList<RecyclerView.d0> f17954i = new ArrayList<>();

    /* JADX INFO: renamed from: j */
    public ArrayList<RecyclerView.d0> f17955j = new ArrayList<>();

    /* JADX INFO: renamed from: k */
    public ArrayList<RecyclerView.d0> f17956k = new ArrayList<>();

    /* JADX INFO: renamed from: l */
    public TimeInterpolator f17957l;

    /* JADX INFO: renamed from: l.ofh0$a */
    public class RunnableC1068a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f17958a;

        public RunnableC1068a(ArrayList arrayList) {
            this.f17958a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (C1077j c1077j : this.f17958a) {
                ofh0.this.animateMoveImpl(c1077j.f17992a, c1077j.f17993b, c1077j.f17994c, c1077j.f17995d, c1077j.f17996e);
            }
            this.f17958a.clear();
            ofh0.this.f17951f.remove(this.f17958a);
        }
    }

    /* JADX INFO: renamed from: l.ofh0$b */
    public class RunnableC1069b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f17960a;

        public RunnableC1069b(ArrayList arrayList) {
            this.f17960a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f17960a.iterator();
            while (it.hasNext()) {
                ofh0.this.m19731a((C1076i) it.next());
            }
            this.f17960a.clear();
            ofh0.this.f17952g.remove(this.f17960a);
        }
    }

    /* JADX INFO: renamed from: l.ofh0$c */
    public class RunnableC1070c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f17962a;

        public RunnableC1070c(ArrayList arrayList) {
            this.f17962a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f17962a.iterator();
            while (it.hasNext()) {
                ofh0.this.animateAddImpl((RecyclerView.d0) it.next());
            }
            this.f17962a.clear();
            ofh0.this.f17950e.remove(this.f17962a);
        }
    }

    /* JADX INFO: renamed from: l.ofh0$d */
    public class C1071d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ RecyclerView.d0 f17964a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f17965b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ViewPropertyAnimator f17966c;

        public C1071d(RecyclerView.d0 d0Var, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f17964a = d0Var;
            this.f17965b = view;
            this.f17966c = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f17965b.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f17966c.setListener(null);
            ofh0.this.dispatchAddFinished(this.f17964a);
            ofh0.this.f17953h.remove(this.f17964a);
            ofh0.this.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ofh0.this.dispatchAddStarting(this.f17964a);
        }
    }

    /* JADX INFO: renamed from: l.ofh0$e */
    public class C1072e extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ RecyclerView.d0 f17968a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewPropertyAnimator f17969b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ View f17970c;

        public C1072e(RecyclerView.d0 d0Var, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f17968a = d0Var;
            this.f17969b = viewPropertyAnimator;
            this.f17970c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f17969b.setListener(null);
            this.f17970c.setAlpha(1.0f);
            ofh0.this.dispatchRemoveFinished(this.f17968a);
            ofh0.this.f17955j.remove(this.f17968a);
            ofh0.this.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ofh0.this.dispatchRemoveStarting(this.f17968a);
        }
    }

    /* JADX INFO: renamed from: l.ofh0$f */
    public class C1073f extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ RecyclerView.d0 f17972a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f17973b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ View f17974c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f17975d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ ViewPropertyAnimator f17976e;

        public C1073f(RecyclerView.d0 d0Var, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
            this.f17972a = d0Var;
            this.f17973b = i;
            this.f17974c = view;
            this.f17975d = i2;
            this.f17976e = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f17973b != 0) {
                this.f17974c.setTranslationX(0.0f);
            }
            if (this.f17975d != 0) {
                this.f17974c.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f17976e.setListener(null);
            ofh0.this.dispatchMoveFinished(this.f17972a);
            ofh0.this.f17956k.remove(this.f17972a);
            ofh0.this.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ofh0.this.dispatchMoveStarting(this.f17972a);
        }
    }

    /* JADX INFO: renamed from: l.ofh0$g */
    public class C1074g extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C1076i f17978a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewPropertyAnimator f17979b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ View f17980c;

        public C1074g(C1076i c1076i, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f17978a = c1076i;
            this.f17979b = viewPropertyAnimator;
            this.f17980c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f17979b.setListener(null);
            this.f17980c.setAlpha(1.0f);
            this.f17980c.setTranslationX(0.0f);
            this.f17980c.setTranslationY(0.0f);
            ofh0.this.dispatchChangeFinished(this.f17978a.f17986a, true);
            ofh0.this.f17954i.remove(this.f17978a.f17986a);
            ofh0.this.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ofh0.this.dispatchChangeStarting(this.f17978a.f17986a, true);
        }
    }

    /* JADX INFO: renamed from: l.ofh0$h */
    public class C1075h extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C1076i f17982a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewPropertyAnimator f17983b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ View f17984c;

        public C1075h(C1076i c1076i, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f17982a = c1076i;
            this.f17983b = viewPropertyAnimator;
            this.f17984c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f17983b.setListener(null);
            this.f17984c.setAlpha(1.0f);
            this.f17984c.setTranslationX(0.0f);
            this.f17984c.setTranslationY(0.0f);
            ofh0.this.dispatchChangeFinished(this.f17982a.f17987b, false);
            ofh0.this.f17954i.remove(this.f17982a.f17987b);
            ofh0.this.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ofh0.this.dispatchChangeStarting(this.f17982a.f17987b, false);
        }
    }

    /* JADX INFO: renamed from: l.ofh0$j */
    public static class C1077j {

        /* JADX INFO: renamed from: a */
        public RecyclerView.d0 f17992a;

        /* JADX INFO: renamed from: b */
        public int f17993b;

        /* JADX INFO: renamed from: c */
        public int f17994c;

        /* JADX INFO: renamed from: d */
        public int f17995d;

        /* JADX INFO: renamed from: e */
        public int f17996e;

        public C1077j(RecyclerView.d0 d0Var, int i, int i2, int i3, int i4) {
            this.f17992a = d0Var;
            this.f17993b = i;
            this.f17994c = i2;
            this.f17995d = i3;
            this.f17996e = i4;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m19731a(C1076i c1076i) {
        RecyclerView.d0 d0Var = c1076i.f17986a;
        View view = d0Var == null ? null : d0Var.itemView;
        RecyclerView.d0 d0Var2 = c1076i.f17987b;
        View view2 = d0Var2 != null ? d0Var2.itemView : null;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(getChangeDuration());
            this.f17954i.add(c1076i.f17986a);
            int i = ((ExpandedAnimSwitchLayout.C0122d) c1076i.f17987b).f1280a;
            int i2 = ((ExpandedAnimSwitchLayout.C0122d) c1076i.f17986a).f1280a;
            int i3 = c1076i.f17990e;
            if (i > i2) {
                duration.translationX((i3 - c1076i.f17988c) - f17945m);
            } else {
                duration.translationX((i3 - c1076i.f17988c) + f17945m);
            }
            duration.translationY(c1076i.f17991f - c1076i.f17989d);
            duration.alpha(0.0f).setListener(new C1074g(c1076i, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
            this.f17954i.add(c1076i.f17987b);
            RecyclerView.d0 d0Var3 = c1076i.f17987b;
            if (((ExpandedAnimSwitchLayout.C0122d) d0Var3).f1280a > ((ExpandedAnimSwitchLayout.C0122d) c1076i.f17986a).f1280a) {
                d0Var3.itemView.setTranslationX(f17945m);
            } else {
                d0Var3.itemView.setTranslationX(-f17945m);
            }
            viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(getChangeDuration()).alpha(1.0f).setListener(new C1075h(c1076i, viewPropertyAnimatorAnimate, view2)).start();
        }
    }

    public boolean animateAdd(RecyclerView.d0 d0Var) {
        resetAnimation(d0Var);
        d0Var.itemView.setAlpha(0.0f);
        this.f17947b.add(d0Var);
        return true;
    }

    public void animateAddImpl(RecyclerView.d0 d0Var) {
        View view = d0Var.itemView;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f17953h.add(d0Var);
        viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(getAddDuration()).setListener(new C1071d(d0Var, view, viewPropertyAnimatorAnimate)).start();
    }

    public boolean animateChange(RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2, int i, int i2, int i3, int i4) {
        if (d0Var == d0Var2) {
            return animateMove(d0Var, i, i2, i3, i4);
        }
        float translationX = d0Var.itemView.getTranslationX();
        float translationY = d0Var.itemView.getTranslationY();
        float alpha = d0Var.itemView.getAlpha();
        resetAnimation(d0Var);
        int i5 = (int) ((i3 - i) - translationX);
        int i6 = (int) ((i4 - i2) - translationY);
        d0Var.itemView.setTranslationX(translationX);
        d0Var.itemView.setTranslationY(translationY);
        d0Var.itemView.setAlpha(alpha);
        if (d0Var2 != null) {
            resetAnimation(d0Var2);
            d0Var2.itemView.setTranslationX(-i5);
            d0Var2.itemView.setTranslationY(-i6);
            d0Var2.itemView.setAlpha(0.0f);
        }
        this.f17949d.add(new C1076i(d0Var, d0Var2, i, i2, i3, i4));
        return true;
    }

    public boolean animateMove(RecyclerView.d0 d0Var, int i, int i2, int i3, int i4) {
        View view = d0Var.itemView;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) d0Var.itemView.getTranslationY());
        resetAnimation(d0Var);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            dispatchMoveFinished(d0Var);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        this.f17948c.add(new C1077j(d0Var, translationX, translationY, i3, i4));
        return true;
    }

    public void animateMoveImpl(RecyclerView.d0 d0Var, int i, int i2, int i3, int i4) {
        View view = d0Var.itemView;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (i5 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i6 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f17956k.add(d0Var);
        viewPropertyAnimatorAnimate.setDuration(getMoveDuration()).setListener(new C1073f(d0Var, i5, view, i6, viewPropertyAnimatorAnimate)).start();
    }

    public boolean animateRemove(RecyclerView.d0 d0Var) {
        resetAnimation(d0Var);
        this.f17946a.add(d0Var);
        return true;
    }

    public final void animateRemoveImpl(RecyclerView.d0 d0Var) {
        View view = d0Var.itemView;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f17955j.add(d0Var);
        viewPropertyAnimatorAnimate.setDuration(getRemoveDuration()).alpha(0.0f).setListener(new C1072e(d0Var, viewPropertyAnimatorAnimate, view)).start();
    }

    /* JADX INFO: renamed from: b */
    public final void m19732b(C1076i c1076i) {
        RecyclerView.d0 d0Var = c1076i.f17986a;
        if (d0Var != null) {
            m19733c(c1076i, d0Var);
        }
        RecyclerView.d0 d0Var2 = c1076i.f17987b;
        if (d0Var2 != null) {
            m19733c(c1076i, d0Var2);
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m19733c(C1076i c1076i, RecyclerView.d0 d0Var) {
        boolean z = false;
        if (c1076i.f17987b == d0Var) {
            c1076i.f17987b = null;
        } else {
            if (c1076i.f17986a != d0Var) {
                return false;
            }
            c1076i.f17986a = null;
            z = true;
        }
        d0Var.itemView.setAlpha(1.0f);
        d0Var.itemView.setTranslationX(0.0f);
        d0Var.itemView.setTranslationY(0.0f);
        dispatchChangeFinished(d0Var, z);
        return true;
    }

    public void cancelAll(List<RecyclerView.d0> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).itemView.animate().cancel();
        }
    }

    public void dispatchFinishedWhenDone() {
        if (isRunning()) {
            return;
        }
        dispatchAnimationsFinished();
    }

    public void endAnimation(@NonNull RecyclerView.d0 d0Var) {
        View view = d0Var.itemView;
        view.animate().cancel();
        int size = this.f17948c.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (this.f17948c.get(size).f17992a == d0Var) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                dispatchMoveFinished(d0Var);
                this.f17948c.remove(size);
            }
        }
        endChangeAnimation(this.f17949d, d0Var);
        if (this.f17946a.remove(d0Var)) {
            view.setAlpha(1.0f);
            dispatchRemoveFinished(d0Var);
        }
        if (this.f17947b.remove(d0Var)) {
            view.setAlpha(1.0f);
            dispatchAddFinished(d0Var);
        }
        for (int size2 = this.f17952g.size() - 1; size2 >= 0; size2--) {
            ArrayList<C1076i> arrayList = this.f17952g.get(size2);
            endChangeAnimation(arrayList, d0Var);
            if (arrayList.isEmpty()) {
                this.f17952g.remove(size2);
            }
        }
        for (int size3 = this.f17951f.size() - 1; size3 >= 0; size3--) {
            ArrayList<C1077j> arrayList2 = this.f17951f.get(size3);
            for (int size4 = arrayList2.size() - 1; size4 >= 0; size4--) {
                if (arrayList2.get(size4).f17992a == d0Var) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    dispatchMoveFinished(d0Var);
                    arrayList2.remove(size4);
                    if (!arrayList2.isEmpty()) {
                        break;
                    }
                    this.f17951f.remove(size3);
                    break;
                }
            }
        }
        for (int size5 = this.f17950e.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.d0> arrayList3 = this.f17950e.get(size5);
            if (arrayList3.remove(d0Var)) {
                view.setAlpha(1.0f);
                dispatchAddFinished(d0Var);
                if (arrayList3.isEmpty()) {
                    this.f17950e.remove(size5);
                }
            }
        }
        dispatchFinishedWhenDone();
    }

    public void endAnimations() {
        ArrayList<C1076i> arrayList;
        int size = this.f17948c.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C1077j c1077j = this.f17948c.get(size);
            View view = c1077j.f17992a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            dispatchMoveFinished(c1077j.f17992a);
            this.f17948c.remove(size);
        }
        for (int size2 = this.f17946a.size() - 1; size2 >= 0; size2--) {
            dispatchRemoveFinished(this.f17946a.get(size2));
            this.f17946a.remove(size2);
        }
        int size3 = this.f17947b.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.d0 d0Var = this.f17947b.get(size3);
            d0Var.itemView.setAlpha(1.0f);
            dispatchAddFinished(d0Var);
            this.f17947b.remove(size3);
        }
        int size4 = this.f17949d.size();
        while (true) {
            size4--;
            arrayList = this.f17949d;
            if (size4 < 0) {
                break;
            } else {
                m19732b(arrayList.get(size4));
            }
        }
        arrayList.clear();
        if (isRunning()) {
            for (int size5 = this.f17951f.size() - 1; size5 >= 0; size5--) {
                ArrayList<C1077j> arrayList2 = this.f17951f.get(size5);
                for (int size6 = arrayList2.size() - 1; size6 >= 0; size6--) {
                    C1077j c1077j2 = arrayList2.get(size6);
                    View view2 = c1077j2.f17992a.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    dispatchMoveFinished(c1077j2.f17992a);
                    arrayList2.remove(size6);
                    if (arrayList2.isEmpty()) {
                        this.f17951f.remove(arrayList2);
                    }
                }
            }
            for (int size7 = this.f17950e.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.d0> arrayList3 = this.f17950e.get(size7);
                for (int size8 = arrayList3.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.d0 d0Var2 = arrayList3.get(size8);
                    d0Var2.itemView.setAlpha(1.0f);
                    dispatchAddFinished(d0Var2);
                    arrayList3.remove(size8);
                    if (arrayList3.isEmpty()) {
                        this.f17950e.remove(arrayList3);
                    }
                }
            }
            for (int size9 = this.f17952g.size() - 1; size9 >= 0; size9--) {
                ArrayList<C1076i> arrayList4 = this.f17952g.get(size9);
                for (int size10 = arrayList4.size() - 1; size10 >= 0; size10--) {
                    m19732b(arrayList4.get(size10));
                    if (arrayList4.isEmpty()) {
                        this.f17952g.remove(arrayList4);
                    }
                }
            }
            cancelAll(this.f17955j);
            cancelAll(this.f17956k);
            cancelAll(this.f17953h);
            cancelAll(this.f17954i);
            dispatchAnimationsFinished();
        }
    }

    public final void endChangeAnimation(List<C1076i> list, RecyclerView.d0 d0Var) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C1076i c1076i = list.get(size);
            if (m19733c(c1076i, d0Var) && c1076i.f17986a == null && c1076i.f17987b == null) {
                list.remove(c1076i);
            }
        }
    }

    public boolean isRunning() {
        return (this.f17947b.isEmpty() && this.f17949d.isEmpty() && this.f17948c.isEmpty() && this.f17946a.isEmpty() && this.f17956k.isEmpty() && this.f17955j.isEmpty() && this.f17953h.isEmpty() && this.f17954i.isEmpty() && this.f17951f.isEmpty() && this.f17950e.isEmpty() && this.f17952g.isEmpty()) ? false : true;
    }

    public final void resetAnimation(RecyclerView.d0 d0Var) {
        if (this.f17957l == null) {
            this.f17957l = new ValueAnimator().getInterpolator();
        }
        d0Var.itemView.animate().setInterpolator(this.f17957l);
        endAnimation(d0Var);
    }

    public void runPendingAnimations() {
        boolean zIsEmpty = this.f17946a.isEmpty();
        boolean zIsEmpty2 = this.f17948c.isEmpty();
        boolean zIsEmpty3 = this.f17949d.isEmpty();
        boolean zIsEmpty4 = this.f17947b.isEmpty();
        if (zIsEmpty4 && zIsEmpty3 && zIsEmpty && zIsEmpty2) {
            return;
        }
        Iterator<RecyclerView.d0> it = this.f17946a.iterator();
        while (it.hasNext()) {
            animateRemoveImpl(it.next());
        }
        this.f17946a.clear();
        if (!zIsEmpty2) {
            ArrayList<C1077j> arrayList = new ArrayList<>();
            arrayList.addAll(this.f17948c);
            this.f17951f.add(arrayList);
            this.f17948c.clear();
            new RunnableC1068a(arrayList).run();
        }
        if (!zIsEmpty3) {
            ArrayList<C1076i> arrayList2 = new ArrayList<>();
            arrayList2.addAll(this.f17949d);
            this.f17952g.add(arrayList2);
            this.f17949d.clear();
            new RunnableC1069b(arrayList2).run();
        }
        if (zIsEmpty4) {
            return;
        }
        ArrayList<RecyclerView.d0> arrayList3 = new ArrayList<>();
        arrayList3.addAll(this.f17947b);
        this.f17950e.add(arrayList3);
        this.f17947b.clear();
        RunnableC1070c runnableC1070c = new RunnableC1070c(arrayList3);
        if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
            runnableC1070c.run();
        } else {
            gbl0.c0(arrayList3.get(0).itemView, runnableC1070c, (!zIsEmpty ? getRemoveDuration() : 0L) + Math.max(!zIsEmpty2 ? getMoveDuration() : 0L, zIsEmpty3 ? 0L : getChangeDuration()));
        }
    }

    /* JADX INFO: renamed from: l.ofh0$i */
    public static class C1076i {

        /* JADX INFO: renamed from: a */
        public RecyclerView.d0 f17986a;

        /* JADX INFO: renamed from: b */
        public RecyclerView.d0 f17987b;

        /* JADX INFO: renamed from: c */
        public int f17988c;

        /* JADX INFO: renamed from: d */
        public int f17989d;

        /* JADX INFO: renamed from: e */
        public int f17990e;

        /* JADX INFO: renamed from: f */
        public int f17991f;

        public C1076i(RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2, int i, int i2, int i3, int i4) {
            this(d0Var, d0Var2);
            this.f17988c = i;
            this.f17989d = i2;
            this.f17990e = i3;
            this.f17991f = i4;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f17986a + ", newHolder=" + this.f17987b + ", fromX=" + this.f17988c + ", fromY=" + this.f17989d + ", toX=" + this.f17990e + ", toY=" + this.f17991f + '}';
        }

        public C1076i(RecyclerView.d0 d0Var, RecyclerView.d0 d0Var2) {
            this.f17986a = d0Var;
            this.f17987b = d0Var2;
        }
    }
}
