package p149l;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.AbstractC0616v;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.view.ExpandedAnimSwitchLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class ofh0 extends AbstractC0616v {

    /* JADX INFO: renamed from: m */
    public static final int f143641m = t100.f167256e;

    /* JADX INFO: renamed from: a */
    public final ArrayList<RecyclerView.AbstractC0566d0> f143642a = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    public final ArrayList<RecyclerView.AbstractC0566d0> f143643b = new ArrayList<>();

    /* JADX INFO: renamed from: c */
    public final ArrayList<C18922j> f143644c = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    public final ArrayList<C18921i> f143645d = new ArrayList<>();

    /* JADX INFO: renamed from: e */
    public ArrayList<ArrayList<RecyclerView.AbstractC0566d0>> f143646e = new ArrayList<>();

    /* JADX INFO: renamed from: f */
    public ArrayList<ArrayList<C18922j>> f143647f = new ArrayList<>();

    /* JADX INFO: renamed from: g */
    public ArrayList<ArrayList<C18921i>> f143648g = new ArrayList<>();

    /* JADX INFO: renamed from: h */
    public ArrayList<RecyclerView.AbstractC0566d0> f143649h = new ArrayList<>();

    /* JADX INFO: renamed from: i */
    public ArrayList<RecyclerView.AbstractC0566d0> f143650i = new ArrayList<>();

    /* JADX INFO: renamed from: j */
    public ArrayList<RecyclerView.AbstractC0566d0> f143651j = new ArrayList<>();

    /* JADX INFO: renamed from: k */
    public ArrayList<RecyclerView.AbstractC0566d0> f143652k = new ArrayList<>();

    /* JADX INFO: renamed from: l */
    public TimeInterpolator f143653l;

    /* JADX INFO: renamed from: l.ofh0$a */
    public class RunnableC18913a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f143654a;

        public RunnableC18913a(ArrayList arrayList) {
            this.f143654a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (C18922j c18922j : this.f143654a) {
                ofh0.this.animateMoveImpl(c18922j.f143688a, c18922j.f143689b, c18922j.f143690c, c18922j.f143691d, c18922j.f143692e);
            }
            this.f143654a.clear();
            ofh0.this.f143647f.remove(this.f143654a);
        }
    }

    /* JADX INFO: renamed from: l.ofh0$b */
    public class RunnableC18914b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f143656a;

        public RunnableC18914b(ArrayList arrayList) {
            this.f143656a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f143656a.iterator();
            while (it.hasNext()) {
                ofh0.this.m164070a((C18921i) it.next());
            }
            this.f143656a.clear();
            ofh0.this.f143648g.remove(this.f143656a);
        }
    }

    /* JADX INFO: renamed from: l.ofh0$c */
    public class RunnableC18915c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f143658a;

        public RunnableC18915c(ArrayList arrayList) {
            this.f143658a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f143658a.iterator();
            while (it.hasNext()) {
                ofh0.this.animateAddImpl((RecyclerView.AbstractC0566d0) it.next());
            }
            this.f143658a.clear();
            ofh0.this.f143646e.remove(this.f143658a);
        }
    }

    /* JADX INFO: renamed from: l.ofh0$d */
    public class C18916d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ RecyclerView.AbstractC0566d0 f143660a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f143661b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ViewPropertyAnimator f143662c;

        public C18916d(RecyclerView.AbstractC0566d0 abstractC0566d0, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f143660a = abstractC0566d0;
            this.f143661b = view;
            this.f143662c = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f143661b.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f143662c.setListener(null);
            ofh0.this.dispatchAddFinished(this.f143660a);
            ofh0.this.f143649h.remove(this.f143660a);
            ofh0.this.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ofh0.this.dispatchAddStarting(this.f143660a);
        }
    }

    /* JADX INFO: renamed from: l.ofh0$e */
    public class C18917e extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ RecyclerView.AbstractC0566d0 f143664a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewPropertyAnimator f143665b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ View f143666c;

        public C18917e(RecyclerView.AbstractC0566d0 abstractC0566d0, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f143664a = abstractC0566d0;
            this.f143665b = viewPropertyAnimator;
            this.f143666c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f143665b.setListener(null);
            this.f143666c.setAlpha(1.0f);
            ofh0.this.dispatchRemoveFinished(this.f143664a);
            ofh0.this.f143651j.remove(this.f143664a);
            ofh0.this.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ofh0.this.dispatchRemoveStarting(this.f143664a);
        }
    }

    /* JADX INFO: renamed from: l.ofh0$f */
    public class C18918f extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ RecyclerView.AbstractC0566d0 f143668a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f143669b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ View f143670c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f143671d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ ViewPropertyAnimator f143672e;

        public C18918f(RecyclerView.AbstractC0566d0 abstractC0566d0, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
            this.f143668a = abstractC0566d0;
            this.f143669b = i;
            this.f143670c = view;
            this.f143671d = i2;
            this.f143672e = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f143669b != 0) {
                this.f143670c.setTranslationX(0.0f);
            }
            if (this.f143671d != 0) {
                this.f143670c.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f143672e.setListener(null);
            ofh0.this.dispatchMoveFinished(this.f143668a);
            ofh0.this.f143652k.remove(this.f143668a);
            ofh0.this.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ofh0.this.dispatchMoveStarting(this.f143668a);
        }
    }

    /* JADX INFO: renamed from: l.ofh0$g */
    public class C18919g extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C18921i f143674a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewPropertyAnimator f143675b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ View f143676c;

        public C18919g(C18921i c18921i, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f143674a = c18921i;
            this.f143675b = viewPropertyAnimator;
            this.f143676c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f143675b.setListener(null);
            this.f143676c.setAlpha(1.0f);
            this.f143676c.setTranslationX(0.0f);
            this.f143676c.setTranslationY(0.0f);
            ofh0.this.dispatchChangeFinished(this.f143674a.f143682a, true);
            ofh0.this.f143650i.remove(this.f143674a.f143682a);
            ofh0.this.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ofh0.this.dispatchChangeStarting(this.f143674a.f143682a, true);
        }
    }

    /* JADX INFO: renamed from: l.ofh0$h */
    public class C18920h extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C18921i f143678a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewPropertyAnimator f143679b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ View f143680c;

        public C18920h(C18921i c18921i, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f143678a = c18921i;
            this.f143679b = viewPropertyAnimator;
            this.f143680c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f143679b.setListener(null);
            this.f143680c.setAlpha(1.0f);
            this.f143680c.setTranslationX(0.0f);
            this.f143680c.setTranslationY(0.0f);
            ofh0.this.dispatchChangeFinished(this.f143678a.f143683b, false);
            ofh0.this.f143650i.remove(this.f143678a.f143683b);
            ofh0.this.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ofh0.this.dispatchChangeStarting(this.f143678a.f143683b, false);
        }
    }

    /* JADX INFO: renamed from: l.ofh0$j */
    public static class C18922j {

        /* JADX INFO: renamed from: a */
        public RecyclerView.AbstractC0566d0 f143688a;

        /* JADX INFO: renamed from: b */
        public int f143689b;

        /* JADX INFO: renamed from: c */
        public int f143690c;

        /* JADX INFO: renamed from: d */
        public int f143691d;

        /* JADX INFO: renamed from: e */
        public int f143692e;

        public C18922j(RecyclerView.AbstractC0566d0 abstractC0566d0, int i, int i2, int i3, int i4) {
            this.f143688a = abstractC0566d0;
            this.f143689b = i;
            this.f143690c = i2;
            this.f143691d = i3;
            this.f143692e = i4;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m164070a(C18921i c18921i) {
        RecyclerView.AbstractC0566d0 abstractC0566d0 = c18921i.f143682a;
        View view = abstractC0566d0 == null ? null : abstractC0566d0.itemView;
        RecyclerView.AbstractC0566d0 abstractC0566d1 = c18921i.f143683b;
        View view2 = abstractC0566d1 != null ? abstractC0566d1.itemView : null;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(getChangeDuration());
            this.f143650i.add(c18921i.f143682a);
            int i = ((ExpandedAnimSwitchLayout.C7958d) c18921i.f143683b).f22502a;
            int i2 = ((ExpandedAnimSwitchLayout.C7958d) c18921i.f143682a).f22502a;
            int i3 = c18921i.f143686e;
            if (i > i2) {
                duration.translationX((i3 - c18921i.f143684c) - f143641m);
            } else {
                duration.translationX((i3 - c18921i.f143684c) + f143641m);
            }
            duration.translationY(c18921i.f143687f - c18921i.f143685d);
            duration.alpha(0.0f).setListener(new C18919g(c18921i, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
            this.f143650i.add(c18921i.f143683b);
            RecyclerView.AbstractC0566d0 abstractC0566d2 = c18921i.f143683b;
            if (((ExpandedAnimSwitchLayout.C7958d) abstractC0566d2).f22502a > ((ExpandedAnimSwitchLayout.C7958d) c18921i.f143682a).f22502a) {
                abstractC0566d2.itemView.setTranslationX(f143641m);
            } else {
                abstractC0566d2.itemView.setTranslationX(-f143641m);
            }
            viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(getChangeDuration()).alpha(1.0f).setListener(new C18920h(c18921i, viewPropertyAnimatorAnimate, view2)).start();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0616v
    public boolean animateAdd(RecyclerView.AbstractC0566d0 abstractC0566d0) {
        resetAnimation(abstractC0566d0);
        abstractC0566d0.itemView.setAlpha(0.0f);
        this.f143643b.add(abstractC0566d0);
        return true;
    }

    public void animateAddImpl(RecyclerView.AbstractC0566d0 abstractC0566d0) {
        View view = abstractC0566d0.itemView;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f143649h.add(abstractC0566d0);
        viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(getAddDuration()).setListener(new C18916d(abstractC0566d0, view, viewPropertyAnimatorAnimate)).start();
    }

    @Override // androidx.recyclerview.widget.AbstractC0616v
    public boolean animateChange(RecyclerView.AbstractC0566d0 abstractC0566d0, RecyclerView.AbstractC0566d0 abstractC0566d1, int i, int i2, int i3, int i4) {
        if (abstractC0566d0 == abstractC0566d1) {
            return animateMove(abstractC0566d0, i, i2, i3, i4);
        }
        float translationX = abstractC0566d0.itemView.getTranslationX();
        float translationY = abstractC0566d0.itemView.getTranslationY();
        float alpha = abstractC0566d0.itemView.getAlpha();
        resetAnimation(abstractC0566d0);
        int i5 = (int) ((i3 - i) - translationX);
        int i6 = (int) ((i4 - i2) - translationY);
        abstractC0566d0.itemView.setTranslationX(translationX);
        abstractC0566d0.itemView.setTranslationY(translationY);
        abstractC0566d0.itemView.setAlpha(alpha);
        if (abstractC0566d1 != null) {
            resetAnimation(abstractC0566d1);
            abstractC0566d1.itemView.setTranslationX(-i5);
            abstractC0566d1.itemView.setTranslationY(-i6);
            abstractC0566d1.itemView.setAlpha(0.0f);
        }
        this.f143645d.add(new C18921i(abstractC0566d0, abstractC0566d1, i, i2, i3, i4));
        return true;
    }

    @Override // androidx.recyclerview.widget.AbstractC0616v
    public boolean animateMove(RecyclerView.AbstractC0566d0 abstractC0566d0, int i, int i2, int i3, int i4) {
        View view = abstractC0566d0.itemView;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) abstractC0566d0.itemView.getTranslationY());
        resetAnimation(abstractC0566d0);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            dispatchMoveFinished(abstractC0566d0);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        this.f143644c.add(new C18922j(abstractC0566d0, translationX, translationY, i3, i4));
        return true;
    }

    public void animateMoveImpl(RecyclerView.AbstractC0566d0 abstractC0566d0, int i, int i2, int i3, int i4) {
        View view = abstractC0566d0.itemView;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (i5 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i6 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f143652k.add(abstractC0566d0);
        viewPropertyAnimatorAnimate.setDuration(getMoveDuration()).setListener(new C18918f(abstractC0566d0, i5, view, i6, viewPropertyAnimatorAnimate)).start();
    }

    @Override // androidx.recyclerview.widget.AbstractC0616v
    public boolean animateRemove(RecyclerView.AbstractC0566d0 abstractC0566d0) {
        resetAnimation(abstractC0566d0);
        this.f143642a.add(abstractC0566d0);
        return true;
    }

    public final void animateRemoveImpl(RecyclerView.AbstractC0566d0 abstractC0566d0) {
        View view = abstractC0566d0.itemView;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.f143651j.add(abstractC0566d0);
        viewPropertyAnimatorAnimate.setDuration(getRemoveDuration()).alpha(0.0f).setListener(new C18917e(abstractC0566d0, viewPropertyAnimatorAnimate, view)).start();
    }

    /* JADX INFO: renamed from: b */
    public final void m164071b(C18921i c18921i) {
        RecyclerView.AbstractC0566d0 abstractC0566d0 = c18921i.f143682a;
        if (abstractC0566d0 != null) {
            m164072c(c18921i, abstractC0566d0);
        }
        RecyclerView.AbstractC0566d0 abstractC0566d1 = c18921i.f143683b;
        if (abstractC0566d1 != null) {
            m164072c(c18921i, abstractC0566d1);
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m164072c(C18921i c18921i, RecyclerView.AbstractC0566d0 abstractC0566d0) {
        boolean z = false;
        if (c18921i.f143683b == abstractC0566d0) {
            c18921i.f143683b = null;
        } else {
            if (c18921i.f143682a != abstractC0566d0) {
                return false;
            }
            c18921i.f143682a = null;
            z = true;
        }
        abstractC0566d0.itemView.setAlpha(1.0f);
        abstractC0566d0.itemView.setTranslationX(0.0f);
        abstractC0566d0.itemView.setTranslationY(0.0f);
        dispatchChangeFinished(abstractC0566d0, z);
        return true;
    }

    public void cancelAll(List<RecyclerView.AbstractC0566d0> list) {
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

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0574l
    public void endAnimation(@NonNull RecyclerView.AbstractC0566d0 abstractC0566d0) {
        View view = abstractC0566d0.itemView;
        view.animate().cancel();
        int size = this.f143644c.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (this.f143644c.get(size).f143688a == abstractC0566d0) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                dispatchMoveFinished(abstractC0566d0);
                this.f143644c.remove(size);
            }
        }
        endChangeAnimation(this.f143645d, abstractC0566d0);
        if (this.f143642a.remove(abstractC0566d0)) {
            view.setAlpha(1.0f);
            dispatchRemoveFinished(abstractC0566d0);
        }
        if (this.f143643b.remove(abstractC0566d0)) {
            view.setAlpha(1.0f);
            dispatchAddFinished(abstractC0566d0);
        }
        for (int size2 = this.f143648g.size() - 1; size2 >= 0; size2--) {
            ArrayList<C18921i> arrayList = this.f143648g.get(size2);
            endChangeAnimation(arrayList, abstractC0566d0);
            if (arrayList.isEmpty()) {
                this.f143648g.remove(size2);
            }
        }
        for (int size3 = this.f143647f.size() - 1; size3 >= 0; size3--) {
            ArrayList<C18922j> arrayList2 = this.f143647f.get(size3);
            for (int size4 = arrayList2.size() - 1; size4 >= 0; size4--) {
                if (arrayList2.get(size4).f143688a == abstractC0566d0) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    dispatchMoveFinished(abstractC0566d0);
                    arrayList2.remove(size4);
                    if (!arrayList2.isEmpty()) {
                        break;
                    }
                    this.f143647f.remove(size3);
                    break;
                }
            }
        }
        for (int size5 = this.f143646e.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.AbstractC0566d0> arrayList3 = this.f143646e.get(size5);
            if (arrayList3.remove(abstractC0566d0)) {
                view.setAlpha(1.0f);
                dispatchAddFinished(abstractC0566d0);
                if (arrayList3.isEmpty()) {
                    this.f143646e.remove(size5);
                }
            }
        }
        dispatchFinishedWhenDone();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0574l
    public void endAnimations() {
        ArrayList<C18921i> arrayList;
        int size = this.f143644c.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C18922j c18922j = this.f143644c.get(size);
            View view = c18922j.f143688a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            dispatchMoveFinished(c18922j.f143688a);
            this.f143644c.remove(size);
        }
        for (int size2 = this.f143642a.size() - 1; size2 >= 0; size2--) {
            dispatchRemoveFinished(this.f143642a.get(size2));
            this.f143642a.remove(size2);
        }
        int size3 = this.f143643b.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.AbstractC0566d0 abstractC0566d0 = this.f143643b.get(size3);
            abstractC0566d0.itemView.setAlpha(1.0f);
            dispatchAddFinished(abstractC0566d0);
            this.f143643b.remove(size3);
        }
        int size4 = this.f143645d.size();
        while (true) {
            size4--;
            arrayList = this.f143645d;
            if (size4 < 0) {
                break;
            } else {
                m164071b(arrayList.get(size4));
            }
        }
        arrayList.clear();
        if (isRunning()) {
            for (int size5 = this.f143647f.size() - 1; size5 >= 0; size5--) {
                ArrayList<C18922j> arrayList2 = this.f143647f.get(size5);
                for (int size6 = arrayList2.size() - 1; size6 >= 0; size6--) {
                    C18922j c18922j2 = arrayList2.get(size6);
                    View view2 = c18922j2.f143688a.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    dispatchMoveFinished(c18922j2.f143688a);
                    arrayList2.remove(size6);
                    if (arrayList2.isEmpty()) {
                        this.f143647f.remove(arrayList2);
                    }
                }
            }
            for (int size7 = this.f143646e.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.AbstractC0566d0> arrayList3 = this.f143646e.get(size7);
                for (int size8 = arrayList3.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.AbstractC0566d0 abstractC0566d1 = arrayList3.get(size8);
                    abstractC0566d1.itemView.setAlpha(1.0f);
                    dispatchAddFinished(abstractC0566d1);
                    arrayList3.remove(size8);
                    if (arrayList3.isEmpty()) {
                        this.f143646e.remove(arrayList3);
                    }
                }
            }
            for (int size9 = this.f143648g.size() - 1; size9 >= 0; size9--) {
                ArrayList<C18921i> arrayList4 = this.f143648g.get(size9);
                for (int size10 = arrayList4.size() - 1; size10 >= 0; size10--) {
                    m164071b(arrayList4.get(size10));
                    if (arrayList4.isEmpty()) {
                        this.f143648g.remove(arrayList4);
                    }
                }
            }
            cancelAll(this.f143651j);
            cancelAll(this.f143652k);
            cancelAll(this.f143649h);
            cancelAll(this.f143650i);
            dispatchAnimationsFinished();
        }
    }

    public final void endChangeAnimation(List<C18921i> list, RecyclerView.AbstractC0566d0 abstractC0566d0) {
        for (int size = list.size() - 1; size >= 0; size--) {
            C18921i c18921i = list.get(size);
            if (m164072c(c18921i, abstractC0566d0) && c18921i.f143682a == null && c18921i.f143683b == null) {
                list.remove(c18921i);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0574l
    public boolean isRunning() {
        return (this.f143643b.isEmpty() && this.f143645d.isEmpty() && this.f143644c.isEmpty() && this.f143642a.isEmpty() && this.f143652k.isEmpty() && this.f143651j.isEmpty() && this.f143649h.isEmpty() && this.f143650i.isEmpty() && this.f143647f.isEmpty() && this.f143646e.isEmpty() && this.f143648g.isEmpty()) ? false : true;
    }

    public final void resetAnimation(RecyclerView.AbstractC0566d0 abstractC0566d0) {
        if (this.f143653l == null) {
            this.f143653l = new ValueAnimator().getInterpolator();
        }
        abstractC0566d0.itemView.animate().setInterpolator(this.f143653l);
        endAnimation(abstractC0566d0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0574l
    public void runPendingAnimations() {
        boolean zIsEmpty = this.f143642a.isEmpty();
        boolean zIsEmpty2 = this.f143644c.isEmpty();
        boolean zIsEmpty3 = this.f143645d.isEmpty();
        boolean zIsEmpty4 = this.f143643b.isEmpty();
        if (zIsEmpty4 && zIsEmpty3 && zIsEmpty && zIsEmpty2) {
            return;
        }
        Iterator<RecyclerView.AbstractC0566d0> it = this.f143642a.iterator();
        while (it.hasNext()) {
            animateRemoveImpl(it.next());
        }
        this.f143642a.clear();
        if (!zIsEmpty2) {
            ArrayList<C18922j> arrayList = new ArrayList<>();
            arrayList.addAll(this.f143644c);
            this.f143647f.add(arrayList);
            this.f143644c.clear();
            new RunnableC18913a(arrayList).run();
        }
        if (!zIsEmpty3) {
            ArrayList<C18921i> arrayList2 = new ArrayList<>();
            arrayList2.addAll(this.f143645d);
            this.f143648g.add(arrayList2);
            this.f143645d.clear();
            new RunnableC18914b(arrayList2).run();
        }
        if (zIsEmpty4) {
            return;
        }
        ArrayList<RecyclerView.AbstractC0566d0> arrayList3 = new ArrayList<>();
        arrayList3.addAll(this.f143643b);
        this.f143646e.add(arrayList3);
        this.f143643b.clear();
        RunnableC18915c runnableC18915c = new RunnableC18915c(arrayList3);
        if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
            runnableC18915c.run();
        } else {
            gbl0.m125187c0(arrayList3.get(0).itemView, runnableC18915c, (!zIsEmpty ? getRemoveDuration() : 0L) + Math.max(!zIsEmpty2 ? getMoveDuration() : 0L, zIsEmpty3 ? 0L : getChangeDuration()));
        }
    }

    /* JADX INFO: renamed from: l.ofh0$i */
    public static class C18921i {

        /* JADX INFO: renamed from: a */
        public RecyclerView.AbstractC0566d0 f143682a;

        /* JADX INFO: renamed from: b */
        public RecyclerView.AbstractC0566d0 f143683b;

        /* JADX INFO: renamed from: c */
        public int f143684c;

        /* JADX INFO: renamed from: d */
        public int f143685d;

        /* JADX INFO: renamed from: e */
        public int f143686e;

        /* JADX INFO: renamed from: f */
        public int f143687f;

        public C18921i(RecyclerView.AbstractC0566d0 abstractC0566d0, RecyclerView.AbstractC0566d0 abstractC0566d1, int i, int i2, int i3, int i4) {
            this(abstractC0566d0, abstractC0566d1);
            this.f143684c = i;
            this.f143685d = i2;
            this.f143686e = i3;
            this.f143687f = i4;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f143682a + ", newHolder=" + this.f143683b + ", fromX=" + this.f143684c + ", fromY=" + this.f143685d + ", toX=" + this.f143686e + ", toY=" + this.f143687f + '}';
        }

        public C18921i(RecyclerView.AbstractC0566d0 abstractC0566d0, RecyclerView.AbstractC0566d0 abstractC0566d1) {
            this.f143682a = abstractC0566d0;
            this.f143683b = abstractC0566d1;
        }
    }
}
