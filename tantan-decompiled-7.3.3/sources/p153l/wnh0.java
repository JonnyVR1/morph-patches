package p153l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.AbstractC0618v;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedAnimSwitchLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class wnh0 extends AbstractC0618v {

    /* JADX INFO: renamed from: m */
    public static final int f189908m = qa00.f156318e;

    /* JADX INFO: renamed from: a */
    public final ArrayList<RecyclerView.AbstractC0569e0> f189909a = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    public final ArrayList<RecyclerView.AbstractC0569e0> f189910b = new ArrayList<>();

    /* JADX INFO: renamed from: c */
    public final ArrayList<C21154j> f189911c = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    public final ArrayList<C21153i> f189912d = new ArrayList<>();

    /* JADX INFO: renamed from: e */
    public ArrayList<ArrayList<RecyclerView.AbstractC0569e0>> f189913e = new ArrayList<>();

    /* JADX INFO: renamed from: f */
    public ArrayList<ArrayList<C21154j>> f189914f = new ArrayList<>();

    /* JADX INFO: renamed from: g */
    public ArrayList<ArrayList<C21153i>> f189915g = new ArrayList<>();

    /* JADX INFO: renamed from: h */
    public ArrayList<RecyclerView.AbstractC0569e0> f189916h = new ArrayList<>();

    /* JADX INFO: renamed from: i */
    public ArrayList<RecyclerView.AbstractC0569e0> f189917i = new ArrayList<>();

    /* JADX INFO: renamed from: j */
    public ArrayList<RecyclerView.AbstractC0569e0> f189918j = new ArrayList<>();

    /* JADX INFO: renamed from: k */
    public ArrayList<RecyclerView.AbstractC0569e0> f189919k = new ArrayList<>();

    /* JADX INFO: renamed from: l */
    public TimeInterpolator f189920l;

    /* JADX INFO: renamed from: l.wnh0$a */
    public class RunnableC21145a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f189921a;

        public RunnableC21145a(ArrayList arrayList) {
            this.f189921a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (C21154j c21154j : this.f189921a) {
                wnh0.this.animateMoveImpl(c21154j.f189955a, c21154j.f189956b, c21154j.f189957c, c21154j.f189958d, c21154j.f189959e);
            }
            this.f189921a.clear();
            wnh0.this.f189914f.remove(this.f189921a);
        }
    }

    /* JADX INFO: renamed from: l.wnh0$b */
    public class RunnableC21146b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f189923a;

        public RunnableC21146b(ArrayList arrayList) {
            this.f189923a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f189923a.iterator();
            while (it.hasNext()) {
                wnh0.this.m207208a((C21153i) it.next());
            }
            this.f189923a.clear();
            wnh0.this.f189915g.remove(this.f189923a);
        }
    }

    /* JADX INFO: renamed from: l.wnh0$c */
    public class RunnableC21147c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f189925a;

        public RunnableC21147c(ArrayList arrayList) {
            this.f189925a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f189925a.iterator();
            while (it.hasNext()) {
                wnh0.this.animateAddImpl((RecyclerView.AbstractC0569e0) it.next());
            }
            this.f189925a.clear();
            wnh0.this.f189913e.remove(this.f189925a);
        }
    }

    /* JADX INFO: renamed from: l.wnh0$d */
    public class C21148d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ RecyclerView.AbstractC0569e0 f189927a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f189928b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ViewPropertyAnimator f189929c;

        public C21148d(RecyclerView.AbstractC0569e0 abstractC0569e0, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f189927a = abstractC0569e0;
            this.f189928b = view;
            this.f189929c = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f189928b.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f189929c.setListener(null);
            wnh0.this.dispatchAddFinished(this.f189927a);
            wnh0.this.f189916h.remove(this.f189927a);
            wnh0.this.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            wnh0.this.dispatchAddStarting(this.f189927a);
        }
    }

    /* JADX INFO: renamed from: l.wnh0$e */
    public class C21149e extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ RecyclerView.AbstractC0569e0 f189931a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewPropertyAnimator f189932b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ View f189933c;

        public C21149e(RecyclerView.AbstractC0569e0 abstractC0569e0, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f189931a = abstractC0569e0;
            this.f189932b = viewPropertyAnimator;
            this.f189933c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f189932b.setListener(null);
            this.f189933c.setAlpha(1.0f);
            wnh0.this.dispatchRemoveFinished(this.f189931a);
            wnh0.this.f189918j.remove(this.f189931a);
            wnh0.this.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            wnh0.this.dispatchRemoveStarting(this.f189931a);
        }
    }

    /* JADX INFO: renamed from: l.wnh0$f */
    public class C21150f extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ RecyclerView.AbstractC0569e0 f189935a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f189936b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ View f189937c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f189938d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ ViewPropertyAnimator f189939e;

        public C21150f(RecyclerView.AbstractC0569e0 abstractC0569e0, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
            this.f189935a = abstractC0569e0;
            this.f189936b = i;
            this.f189937c = view;
            this.f189938d = i2;
            this.f189939e = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f189936b != 0) {
                this.f189937c.setTranslationX(0.0f);
            }
            if (this.f189938d != 0) {
                this.f189937c.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f189939e.setListener(null);
            wnh0.this.dispatchMoveFinished(this.f189935a);
            wnh0.this.f189919k.remove(this.f189935a);
            wnh0.this.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            wnh0.this.dispatchMoveStarting(this.f189935a);
        }
    }

    /* JADX INFO: renamed from: l.wnh0$g */
    public class C21151g extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C21153i f189941a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewPropertyAnimator f189942b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ View f189943c;

        public C21151g(C21153i c21153i, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f189941a = c21153i;
            this.f189942b = viewPropertyAnimator;
            this.f189943c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f189942b.setListener(null);
            this.f189943c.setAlpha(1.0f);
            this.f189943c.setTranslationX(0.0f);
            this.f189943c.setTranslationY(0.0f);
            wnh0.this.dispatchChangeFinished(this.f189941a.f189949a, true);
            wnh0.this.f189917i.remove(this.f189941a.f189949a);
            wnh0.this.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            wnh0.this.dispatchChangeStarting(this.f189941a.f189949a, true);
        }
    }

    /* JADX INFO: renamed from: l.wnh0$h */
    public class C21152h extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C21153i f189945a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewPropertyAnimator f189946b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ View f189947c;

        public C21152h(C21153i c21153i, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f189945a = c21153i;
            this.f189946b = viewPropertyAnimator;
            this.f189947c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f189946b.setListener(null);
            this.f189947c.setAlpha(1.0f);
            this.f189947c.setTranslationX(0.0f);
            this.f189947c.setTranslationY(0.0f);
            wnh0.this.dispatchChangeFinished(this.f189945a.f189950b, false);
            wnh0.this.f189917i.remove(this.f189945a.f189950b);
            wnh0.this.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            wnh0.this.dispatchChangeStarting(this.f189945a.f189950b, false);
        }
    }

    /* JADX INFO: renamed from: l.wnh0$j */
    public static class C21154j {

        /* JADX INFO: renamed from: a */
        public RecyclerView.AbstractC0569e0 f189955a;

        /* JADX INFO: renamed from: b */
        public int f189956b;

        /* JADX INFO: renamed from: c */
        public int f189957c;

        /* JADX INFO: renamed from: d */
        public int f189958d;

        /* JADX INFO: renamed from: e */
        public int f189959e;

        public C21154j(RecyclerView.AbstractC0569e0 abstractC0569e0, int i, int i2, int i3, int i4) {
            this.f189955a = abstractC0569e0;
            this.f189956b = i;
            this.f189957c = i2;
            this.f189958d = i3;
            this.f189959e = i4;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m207208a(C21153i c21153i) {
        RecyclerView.AbstractC0569e0 abstractC0569e0 = c21153i.f189949a;
        View view = abstractC0569e0 == null ? null : abstractC0569e0.itemView;
        RecyclerView.AbstractC0569e0 abstractC0569e1 = c21153i.f189950b;
        View view2 = abstractC0569e1 != null ? abstractC0569e1.itemView : null;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(getChangeDuration());
            this.f189917i.add(c21153i.f189949a);
            int i = ((ExpandedAnimSwitchLayout.C8109d) c21153i.f189950b).f23244a;
            int i2 = ((ExpandedAnimSwitchLayout.C8109d) c21153i.f189949a).f23244a;
            int i3 = c21153i.f189953e;
            if (i > i2) {
                duration.translationX((i3 - c21153i.f189951c) - f189908m);
            } else {
                duration.translationX((i3 - c21153i.f189951c) + f189908m);
            }
            duration.translationY(c21153i.f189954f - c21153i.f189952d);
            duration.alpha(0.0f).setListener(new C21151g(c21153i, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
            this.f189917i.add(c21153i.f189950b);
            RecyclerView.AbstractC0569e0 abstractC0569e2 = c21153i.f189950b;
            if (((ExpandedAnimSwitchLayout.C8109d) abstractC0569e2).f23244a > ((ExpandedAnimSwitchLayout.C8109d) c21153i.f189949a).f23244a) {
                abstractC0569e2.itemView.setTranslationX(f189908m);
            } else {
                abstractC0569e2.itemView.setTranslationX(-f189908m);
            }
            viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(getChangeDuration()).alpha(1.0f).setListener(new C21152h(c21153i, viewPropertyAnimatorAnimate, view2)).start();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0618v
    public boolean animateAdd(RecyclerView.AbstractC0569e0 abstractC0569e0) {
        resetAnimation(abstractC0569e0);
        abstractC0569e0.itemView.setAlpha(0.0f);
        this.f189910b.add(abstractC0569e0);
        return true;
    }

    public void animateAddImpl(RecyclerView.AbstractC0569e0 abstractC0569e0) {
        View view = abstractC0569e0.itemView;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f189916h.add(abstractC0569e0);
        viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(getAddDuration()).setListener(new C21148d(abstractC0569e0, view, viewPropertyAnimatorAnimate)).start();
    }

    @Override // androidx.recyclerview.widget.AbstractC0618v
    public boolean animateChange(RecyclerView.AbstractC0569e0 abstractC0569e0, RecyclerView.AbstractC0569e0 abstractC0569e1, int i, int i2, int i3, int i4) {
        if (abstractC0569e0 == abstractC0569e1) {
            return animateMove(abstractC0569e0, i, i2, i3, i4);
        }
        float translationX = abstractC0569e0.itemView.getTranslationX();
        float translationY = abstractC0569e0.itemView.getTranslationY();
        float alpha = abstractC0569e0.itemView.getAlpha();
        resetAnimation(abstractC0569e0);
        int i5 = (int) ((i3 - i) - translationX);
        int i6 = (int) ((i4 - i2) - translationY);
        abstractC0569e0.itemView.setTranslationX(translationX);
        abstractC0569e0.itemView.setTranslationY(translationY);
        abstractC0569e0.itemView.setAlpha(alpha);
        if (abstractC0569e1 != null) {
            resetAnimation(abstractC0569e1);
            abstractC0569e1.itemView.setTranslationX(-i5);
            abstractC0569e1.itemView.setTranslationY(-i6);
            abstractC0569e1.itemView.setAlpha(0.0f);
        }
        this.f189912d.add(new C21153i(abstractC0569e0, abstractC0569e1, i, i2, i3, i4));
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC0618v
    public boolean animateMove(RecyclerView.AbstractC0569e0 abstractC0569e0, int i, int i2, int i3, int i4) {
        View view = abstractC0569e0.itemView;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) abstractC0569e0.itemView.getTranslationY());
        resetAnimation(abstractC0569e0);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            dispatchMoveFinished(abstractC0569e0);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        this.f189911c.add(new C21154j(abstractC0569e0, translationX, translationY, i3, i4));
        return true;
    }

    public void animateMoveImpl(RecyclerView.AbstractC0569e0 abstractC0569e0, int i, int i2, int i3, int i4) {
        View view = abstractC0569e0.itemView;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (i5 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i6 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f189919k.add(abstractC0569e0);
        viewPropertyAnimatorAnimate.setDuration(getMoveDuration()).setListener(new C21150f(abstractC0569e0, i5, view, i6, viewPropertyAnimatorAnimate)).start();
    }

    @Override // androidx.recyclerview.widget.AbstractC0618v
    public boolean animateRemove(RecyclerView.AbstractC0569e0 abstractC0569e0) {
        resetAnimation(abstractC0569e0);
        this.f189909a.add(abstractC0569e0);
        return true;
    }

    public final void animateRemoveImpl(RecyclerView.AbstractC0569e0 abstractC0569e0) {
        View view = abstractC0569e0.itemView;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f189918j.add(abstractC0569e0);
        viewPropertyAnimatorAnimate.setDuration(getRemoveDuration()).alpha(0.0f).setListener(new C21149e(abstractC0569e0, viewPropertyAnimatorAnimate, view)).start();
    }

    /* JADX INFO: renamed from: b */
    public final void m207209b(C21153i c21153i) {
        RecyclerView.AbstractC0569e0 abstractC0569e0 = c21153i.f189949a;
        if (abstractC0569e0 != null) {
            m207210c(c21153i, abstractC0569e0);
        }
        RecyclerView.AbstractC0569e0 abstractC0569e1 = c21153i.f189950b;
        if (abstractC0569e1 != null) {
            m207210c(c21153i, abstractC0569e1);
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m207210c(C21153i c21153i, RecyclerView.AbstractC0569e0 abstractC0569e0) {
        boolean z = false;
        if (c21153i.f189950b == abstractC0569e0) {
            c21153i.f189950b = null;
        } else {
            if (c21153i.f189949a != abstractC0569e0) {
                return false;
            }
            c21153i.f189949a = null;
            z = true;
        }
        abstractC0569e0.itemView.setAlpha(1.0f);
        abstractC0569e0.itemView.setTranslationX(0.0f);
        abstractC0569e0.itemView.setTranslationY(0.0f);
        dispatchChangeFinished(abstractC0569e0, z);
        return true;
    }

    public void cancelAll(List<RecyclerView.AbstractC0569e0> list) {
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

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576l
    public void endAnimation(@NonNull RecyclerView.AbstractC0569e0 abstractC0569e0) {
        View view = abstractC0569e0.itemView;
        view.animate().cancel();
        int size = this.f189911c.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (this.f189911c.get(size).f189955a == abstractC0569e0) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                dispatchMoveFinished(abstractC0569e0);
                this.f189911c.remove(size);
            }
        }
        endChangeAnimation(this.f189912d, abstractC0569e0);
        if (this.f189909a.remove(abstractC0569e0)) {
            view.setAlpha(1.0f);
            dispatchRemoveFinished(abstractC0569e0);
        }
        if (this.f189910b.remove(abstractC0569e0)) {
            view.setAlpha(1.0f);
            dispatchAddFinished(abstractC0569e0);
        }
        for (int size2 = this.f189915g.size() - 1; size2 >= 0; size2--) {
            ArrayList<C21153i> arrayList = this.f189915g.get(size2);
            endChangeAnimation(arrayList, abstractC0569e0);
            if (arrayList.isEmpty()) {
                this.f189915g.remove(size2);
            }
        }
        for (int size3 = this.f189914f.size() - 1; size3 >= 0; size3--) {
            ArrayList<C21154j> arrayList2 = this.f189914f.get(size3);
            for (int size4 = arrayList2.size() - 1; size4 >= 0; size4--) {
                if (arrayList2.get(size4).f189955a == abstractC0569e0) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    dispatchMoveFinished(abstractC0569e0);
                    arrayList2.remove(size4);
                    if (!arrayList2.isEmpty()) {
                        break;
                    }
                    this.f189914f.remove(size3);
                    break;
                }
            }
        }
        for (int size5 = this.f189913e.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.AbstractC0569e0> arrayList3 = this.f189913e.get(size5);
            if (arrayList3.remove(abstractC0569e0)) {
                view.setAlpha(1.0f);
                dispatchAddFinished(abstractC0569e0);
                if (arrayList3.isEmpty()) {
                    this.f189913e.remove(size5);
                }
            }
        }
        dispatchFinishedWhenDone();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576l
    public void endAnimations() {
        ArrayList<C21153i> arrayList;
        int size = this.f189911c.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C21154j c21154j = this.f189911c.get(size);
            View view = c21154j.f189955a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            dispatchMoveFinished(c21154j.f189955a);
            this.f189911c.remove(size);
        }
        for (int size2 = this.f189909a.size() - 1; size2 >= 0; size2--) {
            dispatchRemoveFinished(this.f189909a.get(size2));
            this.f189909a.remove(size2);
        }
        int size3 = this.f189910b.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.AbstractC0569e0 abstractC0569e0 = this.f189910b.get(size3);
            abstractC0569e0.itemView.setAlpha(1.0f);
            dispatchAddFinished(abstractC0569e0);
            this.f189910b.remove(size3);
        }
        int size4 = this.f189912d.size();
        while (true) {
            size4--;
            arrayList = this.f189912d;
            if (size4 < 0) {
                break;
            } else {
                m207209b(arrayList.get(size4));
            }
        }
        arrayList.clear();
        if (isRunning()) {
            for (int size5 = this.f189914f.size() - 1; size5 >= 0; size5--) {
                ArrayList<C21154j> arrayList2 = this.f189914f.get(size5);
                for (int size6 = arrayList2.size() - 1; size6 >= 0; size6--) {
                    C21154j c21154j2 = arrayList2.get(size6);
                    View view2 = c21154j2.f189955a.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    dispatchMoveFinished(c21154j2.f189955a);
                    arrayList2.remove(size6);
                    if (arrayList2.isEmpty()) {
                        this.f189914f.remove(arrayList2);
                    }
                }
            }
            for (int size7 = this.f189913e.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.AbstractC0569e0> arrayList3 = this.f189913e.get(size7);
                for (int size8 = arrayList3.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.AbstractC0569e0 abstractC0569e1 = arrayList3.get(size8);
                    abstractC0569e1.itemView.setAlpha(1.0f);
                    dispatchAddFinished(abstractC0569e1);
                    arrayList3.remove(size8);
                    if (arrayList3.isEmpty()) {
                        this.f189913e.remove(arrayList3);
                    }
                }
            }
            for (int size9 = this.f189915g.size() - 1; size9 >= 0; size9--) {
                ArrayList<C21153i> arrayList4 = this.f189915g.get(size9);
                for (int size10 = arrayList4.size() - 1; size10 >= 0; size10--) {
                    m207209b(arrayList4.get(size10));
                    if (arrayList4.isEmpty()) {
                        this.f189915g.remove(arrayList4);
                    }
                }
            }
            cancelAll(this.f189918j);
            cancelAll(this.f189919k);
            cancelAll(this.f189916h);
            cancelAll(this.f189917i);
            dispatchAnimationsFinished();
        }
    }

    public final void endChangeAnimation(List<C21153i> list, RecyclerView.AbstractC0569e0 abstractC0569e0) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C21153i c21153i = list.get(size);
            if (m207210c(c21153i, abstractC0569e0) && c21153i.f189949a == null && c21153i.f189950b == null) {
                list.remove(c21153i);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576l
    public boolean isRunning() {
        return (this.f189910b.isEmpty() && this.f189912d.isEmpty() && this.f189911c.isEmpty() && this.f189909a.isEmpty() && this.f189919k.isEmpty() && this.f189918j.isEmpty() && this.f189916h.isEmpty() && this.f189917i.isEmpty() && this.f189914f.isEmpty() && this.f189913e.isEmpty() && this.f189915g.isEmpty()) ? false : true;
    }

    public final void resetAnimation(RecyclerView.AbstractC0569e0 abstractC0569e0) {
        if (this.f189920l == null) {
            this.f189920l = new ValueAnimator().getInterpolator();
        }
        abstractC0569e0.itemView.animate().setInterpolator(this.f189920l);
        endAnimation(abstractC0569e0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576l
    public void runPendingAnimations() {
        boolean zIsEmpty = this.f189909a.isEmpty();
        boolean zIsEmpty2 = this.f189911c.isEmpty();
        boolean zIsEmpty3 = this.f189912d.isEmpty();
        boolean zIsEmpty4 = this.f189910b.isEmpty();
        if (zIsEmpty4 && zIsEmpty3 && zIsEmpty && zIsEmpty2) {
            return;
        }
        Iterator<RecyclerView.AbstractC0569e0> it = this.f189909a.iterator();
        while (it.hasNext()) {
            animateRemoveImpl(it.next());
        }
        this.f189909a.clear();
        if (!zIsEmpty2) {
            ArrayList<C21154j> arrayList = new ArrayList<>();
            arrayList.addAll(this.f189911c);
            this.f189914f.add(arrayList);
            this.f189911c.clear();
            new RunnableC21145a(arrayList).run();
        }
        if (!zIsEmpty3) {
            ArrayList<C21153i> arrayList2 = new ArrayList<>();
            arrayList2.addAll(this.f189912d);
            this.f189915g.add(arrayList2);
            this.f189912d.clear();
            new RunnableC21146b(arrayList2).run();
        }
        if (zIsEmpty4) {
            return;
        }
        ArrayList<RecyclerView.AbstractC0569e0> arrayList3 = new ArrayList<>();
        arrayList3.addAll(this.f189910b);
        this.f189913e.add(arrayList3);
        this.f189910b.clear();
        RunnableC21147c runnableC21147c = new RunnableC21147c(arrayList3);
        if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
            runnableC21147c.run();
        } else {
            kkl0.m150150c0(arrayList3.get(0).itemView, runnableC21147c, (!zIsEmpty ? getRemoveDuration() : 0L) + Math.max(!zIsEmpty2 ? getMoveDuration() : 0L, zIsEmpty3 ? 0L : getChangeDuration()));
        }
    }

    /* JADX INFO: renamed from: l.wnh0$i */
    public static class C21153i {

        /* JADX INFO: renamed from: a */
        public RecyclerView.AbstractC0569e0 f189949a;

        /* JADX INFO: renamed from: b */
        public RecyclerView.AbstractC0569e0 f189950b;

        /* JADX INFO: renamed from: c */
        public int f189951c;

        /* JADX INFO: renamed from: d */
        public int f189952d;

        /* JADX INFO: renamed from: e */
        public int f189953e;

        /* JADX INFO: renamed from: f */
        public int f189954f;

        public C21153i(RecyclerView.AbstractC0569e0 abstractC0569e0, RecyclerView.AbstractC0569e0 abstractC0569e1, int i, int i2, int i3, int i4) {
            this(abstractC0569e0, abstractC0569e1);
            this.f189951c = i;
            this.f189952d = i2;
            this.f189953e = i3;
            this.f189954f = i4;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f189949a + ", newHolder=" + this.f189950b + ", fromX=" + this.f189951c + ", fromY=" + this.f189952d + ", toX=" + this.f189953e + ", toY=" + this.f189954f + '}';
        }

        public C21153i(RecyclerView.AbstractC0569e0 abstractC0569e0, RecyclerView.AbstractC0569e0 abstractC0569e1) {
            this.f189949a = abstractC0569e0;
            this.f189950b = abstractC0569e1;
        }
    }
}
