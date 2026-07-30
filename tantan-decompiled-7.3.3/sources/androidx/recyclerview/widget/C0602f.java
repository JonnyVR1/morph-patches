package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p153l.kkl0;

/* JADX INFO: renamed from: androidx.recyclerview.widget.f */
/* JADX INFO: loaded from: classes.dex */
public class C0602f extends AbstractC0618v {
    private static final boolean DEBUG = false;
    private static TimeInterpolator sDefaultInterpolator;
    private ArrayList<RecyclerView.AbstractC0569e0> mPendingRemovals = new ArrayList<>();
    private ArrayList<RecyclerView.AbstractC0569e0> mPendingAdditions = new ArrayList<>();
    private ArrayList<j> mPendingMoves = new ArrayList<>();
    private ArrayList<i> mPendingChanges = new ArrayList<>();
    ArrayList<ArrayList<RecyclerView.AbstractC0569e0>> mAdditionsList = new ArrayList<>();
    ArrayList<ArrayList<j>> mMovesList = new ArrayList<>();
    ArrayList<ArrayList<i>> mChangesList = new ArrayList<>();
    ArrayList<RecyclerView.AbstractC0569e0> mAddAnimations = new ArrayList<>();
    ArrayList<RecyclerView.AbstractC0569e0> mMoveAnimations = new ArrayList<>();
    ArrayList<RecyclerView.AbstractC0569e0> mRemoveAnimations = new ArrayList<>();
    ArrayList<RecyclerView.AbstractC0569e0> mChangeAnimations = new ArrayList<>();

    /* JADX INFO: renamed from: androidx.recyclerview.widget.f$a */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f2723a;

        public a(ArrayList arrayList) {
            this.f2723a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (j jVar : this.f2723a) {
                C0602f.this.animateMoveImpl(jVar.f2757a, jVar.f2758b, jVar.f2759c, jVar.f2760d, jVar.f2761e);
            }
            this.f2723a.clear();
            C0602f.this.mMovesList.remove(this.f2723a);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.f$b */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f2725a;

        public b(ArrayList arrayList) {
            this.f2725a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f2725a.iterator();
            while (it.hasNext()) {
                C0602f.this.animateChangeImpl((i) it.next());
            }
            this.f2725a.clear();
            C0602f.this.mChangesList.remove(this.f2725a);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.f$c */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f2727a;

        public c(ArrayList arrayList) {
            this.f2727a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f2727a.iterator();
            while (it.hasNext()) {
                C0602f.this.animateAddImpl((RecyclerView.AbstractC0569e0) it.next());
            }
            this.f2727a.clear();
            C0602f.this.mAdditionsList.remove(this.f2727a);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.f$d */
    public class d extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ RecyclerView.AbstractC0569e0 f2729a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewPropertyAnimator f2730b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ View f2731c;

        public d(RecyclerView.AbstractC0569e0 abstractC0569e0, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f2729a = abstractC0569e0;
            this.f2730b = viewPropertyAnimator;
            this.f2731c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2730b.setListener(null);
            this.f2731c.setAlpha(1.0f);
            C0602f.this.dispatchRemoveFinished(this.f2729a);
            C0602f.this.mRemoveAnimations.remove(this.f2729a);
            C0602f.this.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C0602f.this.dispatchRemoveStarting(this.f2729a);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.f$e */
    public class e extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ RecyclerView.AbstractC0569e0 f2733a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f2734b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ ViewPropertyAnimator f2735c;

        public e(RecyclerView.AbstractC0569e0 abstractC0569e0, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f2733a = abstractC0569e0;
            this.f2734b = view;
            this.f2735c = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f2734b.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2735c.setListener(null);
            C0602f.this.dispatchAddFinished(this.f2733a);
            C0602f.this.mAddAnimations.remove(this.f2733a);
            C0602f.this.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C0602f.this.dispatchAddStarting(this.f2733a);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.f$f */
    public class f extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ RecyclerView.AbstractC0569e0 f2737a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f2738b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ View f2739c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ int f2740d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ ViewPropertyAnimator f2741e;

        public f(RecyclerView.AbstractC0569e0 abstractC0569e0, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
            this.f2737a = abstractC0569e0;
            this.f2738b = i;
            this.f2739c = view;
            this.f2740d = i2;
            this.f2741e = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f2738b != 0) {
                this.f2739c.setTranslationX(0.0f);
            }
            if (this.f2740d != 0) {
                this.f2739c.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2741e.setListener(null);
            C0602f.this.dispatchMoveFinished(this.f2737a);
            C0602f.this.mMoveAnimations.remove(this.f2737a);
            C0602f.this.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C0602f.this.dispatchMoveStarting(this.f2737a);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.f$g */
    public class g extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ i f2743a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewPropertyAnimator f2744b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ View f2745c;

        public g(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f2743a = iVar;
            this.f2744b = viewPropertyAnimator;
            this.f2745c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2744b.setListener(null);
            this.f2745c.setAlpha(1.0f);
            this.f2745c.setTranslationX(0.0f);
            this.f2745c.setTranslationY(0.0f);
            C0602f.this.dispatchChangeFinished(this.f2743a.f2751a, true);
            C0602f.this.mChangeAnimations.remove(this.f2743a.f2751a);
            C0602f.this.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C0602f.this.dispatchChangeStarting(this.f2743a.f2751a, true);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.f$h */
    public class h extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ i f2747a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewPropertyAnimator f2748b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ View f2749c;

        public h(i iVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f2747a = iVar;
            this.f2748b = viewPropertyAnimator;
            this.f2749c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2748b.setListener(null);
            this.f2749c.setAlpha(1.0f);
            this.f2749c.setTranslationX(0.0f);
            this.f2749c.setTranslationY(0.0f);
            C0602f.this.dispatchChangeFinished(this.f2747a.f2752b, false);
            C0602f.this.mChangeAnimations.remove(this.f2747a.f2752b);
            C0602f.this.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            C0602f.this.dispatchChangeStarting(this.f2747a.f2752b, false);
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.f$j */
    public static class j {

        /* JADX INFO: renamed from: a */
        public RecyclerView.AbstractC0569e0 f2757a;

        /* JADX INFO: renamed from: b */
        public int f2758b;

        /* JADX INFO: renamed from: c */
        public int f2759c;

        /* JADX INFO: renamed from: d */
        public int f2760d;

        /* JADX INFO: renamed from: e */
        public int f2761e;

        public j(RecyclerView.AbstractC0569e0 abstractC0569e0, int i, int i2, int i3, int i4) {
            this.f2757a = abstractC0569e0;
            this.f2758b = i;
            this.f2759c = i2;
            this.f2760d = i3;
            this.f2761e = i4;
        }
    }

    private void animateRemoveImpl(RecyclerView.AbstractC0569e0 abstractC0569e0) {
        View view = abstractC0569e0.itemView;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.mRemoveAnimations.add(abstractC0569e0);
        viewPropertyAnimatorAnimate.setDuration(getRemoveDuration()).alpha(0.0f).setListener(new d(abstractC0569e0, viewPropertyAnimatorAnimate, view)).start();
    }

    private void endChangeAnimation(List<i> list, RecyclerView.AbstractC0569e0 abstractC0569e0) {
        for (int size = list.size() - 1; size >= 0; size--) {
            i iVar = list.get(size);
            if (endChangeAnimationIfNecessary(iVar, abstractC0569e0) && iVar.f2751a == null && iVar.f2752b == null) {
                list.remove(iVar);
            }
        }
    }

    private boolean endChangeAnimationIfNecessary(i iVar, RecyclerView.AbstractC0569e0 abstractC0569e0) {
        boolean z = false;
        if (iVar.f2752b == abstractC0569e0) {
            iVar.f2752b = null;
        } else {
            if (iVar.f2751a != abstractC0569e0) {
                return false;
            }
            iVar.f2751a = null;
            z = true;
        }
        abstractC0569e0.itemView.setAlpha(1.0f);
        abstractC0569e0.itemView.setTranslationX(0.0f);
        abstractC0569e0.itemView.setTranslationY(0.0f);
        dispatchChangeFinished(abstractC0569e0, z);
        return true;
    }

    private void resetAnimation(RecyclerView.AbstractC0569e0 abstractC0569e0) {
        if (sDefaultInterpolator == null) {
            sDefaultInterpolator = new ValueAnimator().getInterpolator();
        }
        abstractC0569e0.itemView.animate().setInterpolator(sDefaultInterpolator);
        endAnimation(abstractC0569e0);
    }

    @Override // androidx.recyclerview.widget.AbstractC0618v
    @SuppressLint({"UnknownNullness"})
    public boolean animateAdd(RecyclerView.AbstractC0569e0 abstractC0569e0) {
        resetAnimation(abstractC0569e0);
        abstractC0569e0.itemView.setAlpha(0.0f);
        this.mPendingAdditions.add(abstractC0569e0);
        return true;
    }

    public void animateAddImpl(RecyclerView.AbstractC0569e0 abstractC0569e0) {
        View view = abstractC0569e0.itemView;
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.mAddAnimations.add(abstractC0569e0);
        viewPropertyAnimatorAnimate.alpha(1.0f).setDuration(getAddDuration()).setListener(new e(abstractC0569e0, view, viewPropertyAnimatorAnimate)).start();
    }

    @Override // androidx.recyclerview.widget.AbstractC0618v
    @SuppressLint({"UnknownNullness"})
    public boolean animateChange(RecyclerView.AbstractC0569e0 abstractC0569e0, RecyclerView.AbstractC0569e0 abstractC0569e1, int i2, int i3, int i4, int i5) {
        if (abstractC0569e0 == abstractC0569e1) {
            return animateMove(abstractC0569e0, i2, i3, i4, i5);
        }
        float translationX = abstractC0569e0.itemView.getTranslationX();
        float translationY = abstractC0569e0.itemView.getTranslationY();
        float alpha = abstractC0569e0.itemView.getAlpha();
        resetAnimation(abstractC0569e0);
        int i6 = (int) ((i4 - i2) - translationX);
        int i7 = (int) ((i5 - i3) - translationY);
        abstractC0569e0.itemView.setTranslationX(translationX);
        abstractC0569e0.itemView.setTranslationY(translationY);
        abstractC0569e0.itemView.setAlpha(alpha);
        if (abstractC0569e1 != null) {
            resetAnimation(abstractC0569e1);
            abstractC0569e1.itemView.setTranslationX(-i6);
            abstractC0569e1.itemView.setTranslationY(-i7);
            abstractC0569e1.itemView.setAlpha(0.0f);
        }
        this.mPendingChanges.add(new i(abstractC0569e0, abstractC0569e1, i2, i3, i4, i5));
        return true;
    }

    public void animateChangeImpl(i iVar) {
        RecyclerView.AbstractC0569e0 abstractC0569e0 = iVar.f2751a;
        View view = abstractC0569e0 == null ? null : abstractC0569e0.itemView;
        RecyclerView.AbstractC0569e0 abstractC0569e1 = iVar.f2752b;
        View view2 = abstractC0569e1 != null ? abstractC0569e1.itemView : null;
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(getChangeDuration());
            this.mChangeAnimations.add(iVar.f2751a);
            duration.translationX(iVar.f2755e - iVar.f2753c);
            duration.translationY(iVar.f2756f - iVar.f2754d);
            duration.alpha(0.0f).setListener(new g(iVar, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator viewPropertyAnimatorAnimate = view2.animate();
            this.mChangeAnimations.add(iVar.f2752b);
            viewPropertyAnimatorAnimate.translationX(0.0f).translationY(0.0f).setDuration(getChangeDuration()).alpha(1.0f).setListener(new h(iVar, viewPropertyAnimatorAnimate, view2)).start();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC0618v
    @SuppressLint({"UnknownNullness"})
    public boolean animateMove(RecyclerView.AbstractC0569e0 abstractC0569e0, int i2, int i3, int i4, int i5) {
        View view = abstractC0569e0.itemView;
        int translationX = i2 + ((int) view.getTranslationX());
        int translationY = i3 + ((int) abstractC0569e0.itemView.getTranslationY());
        resetAnimation(abstractC0569e0);
        int i6 = i4 - translationX;
        int i7 = i5 - translationY;
        if (i6 == 0 && i7 == 0) {
            dispatchMoveFinished(abstractC0569e0);
            return false;
        }
        if (i6 != 0) {
            view.setTranslationX(-i6);
        }
        if (i7 != 0) {
            view.setTranslationY(-i7);
        }
        this.mPendingMoves.add(new j(abstractC0569e0, translationX, translationY, i4, i5));
        return true;
    }

    public void animateMoveImpl(RecyclerView.AbstractC0569e0 abstractC0569e0, int i2, int i3, int i4, int i5) {
        View view = abstractC0569e0.itemView;
        int i6 = i4 - i2;
        int i7 = i5 - i3;
        if (i6 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i7 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator viewPropertyAnimatorAnimate = view.animate();
        this.mMoveAnimations.add(abstractC0569e0);
        viewPropertyAnimatorAnimate.setDuration(getMoveDuration()).setListener(new f(abstractC0569e0, i6, view, i7, viewPropertyAnimatorAnimate)).start();
    }

    @Override // androidx.recyclerview.widget.AbstractC0618v
    @SuppressLint({"UnknownNullness"})
    public boolean animateRemove(RecyclerView.AbstractC0569e0 abstractC0569e0) {
        resetAnimation(abstractC0569e0);
        this.mPendingRemovals.add(abstractC0569e0);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576l
    public boolean canReuseUpdatedViewHolder(@NonNull RecyclerView.AbstractC0569e0 abstractC0569e0, @NonNull List<Object> list) {
        return !list.isEmpty() || super.canReuseUpdatedViewHolder(abstractC0569e0, list);
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
    @SuppressLint({"UnknownNullness"})
    public void endAnimation(RecyclerView.AbstractC0569e0 abstractC0569e0) {
        View view = abstractC0569e0.itemView;
        view.animate().cancel();
        int size = this.mPendingMoves.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            if (this.mPendingMoves.get(size).f2757a == abstractC0569e0) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                dispatchMoveFinished(abstractC0569e0);
                this.mPendingMoves.remove(size);
            }
        }
        endChangeAnimation(this.mPendingChanges, abstractC0569e0);
        if (this.mPendingRemovals.remove(abstractC0569e0)) {
            view.setAlpha(1.0f);
            dispatchRemoveFinished(abstractC0569e0);
        }
        if (this.mPendingAdditions.remove(abstractC0569e0)) {
            view.setAlpha(1.0f);
            dispatchAddFinished(abstractC0569e0);
        }
        for (int size2 = this.mChangesList.size() - 1; size2 >= 0; size2--) {
            ArrayList<i> arrayList = this.mChangesList.get(size2);
            endChangeAnimation(arrayList, abstractC0569e0);
            if (arrayList.isEmpty()) {
                this.mChangesList.remove(size2);
            }
        }
        for (int size3 = this.mMovesList.size() - 1; size3 >= 0; size3--) {
            ArrayList<j> arrayList2 = this.mMovesList.get(size3);
            for (int size4 = arrayList2.size() - 1; size4 >= 0; size4--) {
                if (arrayList2.get(size4).f2757a == abstractC0569e0) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    dispatchMoveFinished(abstractC0569e0);
                    arrayList2.remove(size4);
                    if (!arrayList2.isEmpty()) {
                        break;
                    }
                    this.mMovesList.remove(size3);
                    break;
                }
            }
        }
        for (int size5 = this.mAdditionsList.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.AbstractC0569e0> arrayList3 = this.mAdditionsList.get(size5);
            if (arrayList3.remove(abstractC0569e0)) {
                view.setAlpha(1.0f);
                dispatchAddFinished(abstractC0569e0);
                if (arrayList3.isEmpty()) {
                    this.mAdditionsList.remove(size5);
                }
            }
        }
        this.mRemoveAnimations.remove(abstractC0569e0);
        this.mAddAnimations.remove(abstractC0569e0);
        this.mChangeAnimations.remove(abstractC0569e0);
        this.mMoveAnimations.remove(abstractC0569e0);
        dispatchFinishedWhenDone();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576l
    public void endAnimations() {
        ArrayList<i> arrayList;
        int size = this.mPendingMoves.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            j jVar = this.mPendingMoves.get(size);
            View view = jVar.f2757a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            dispatchMoveFinished(jVar.f2757a);
            this.mPendingMoves.remove(size);
        }
        for (int size2 = this.mPendingRemovals.size() - 1; size2 >= 0; size2--) {
            dispatchRemoveFinished(this.mPendingRemovals.get(size2));
            this.mPendingRemovals.remove(size2);
        }
        int size3 = this.mPendingAdditions.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.AbstractC0569e0 abstractC0569e0 = this.mPendingAdditions.get(size3);
            abstractC0569e0.itemView.setAlpha(1.0f);
            dispatchAddFinished(abstractC0569e0);
            this.mPendingAdditions.remove(size3);
        }
        int size4 = this.mPendingChanges.size();
        while (true) {
            size4--;
            arrayList = this.mPendingChanges;
            if (size4 < 0) {
                break;
            } else {
                endChangeAnimationIfNecessary(arrayList.get(size4));
            }
        }
        arrayList.clear();
        if (isRunning()) {
            for (int size5 = this.mMovesList.size() - 1; size5 >= 0; size5--) {
                ArrayList<j> arrayList2 = this.mMovesList.get(size5);
                for (int size6 = arrayList2.size() - 1; size6 >= 0; size6--) {
                    j jVar2 = arrayList2.get(size6);
                    View view2 = jVar2.f2757a.itemView;
                    view2.setTranslationY(0.0f);
                    view2.setTranslationX(0.0f);
                    dispatchMoveFinished(jVar2.f2757a);
                    arrayList2.remove(size6);
                    if (arrayList2.isEmpty()) {
                        this.mMovesList.remove(arrayList2);
                    }
                }
            }
            for (int size7 = this.mAdditionsList.size() - 1; size7 >= 0; size7--) {
                ArrayList<RecyclerView.AbstractC0569e0> arrayList3 = this.mAdditionsList.get(size7);
                for (int size8 = arrayList3.size() - 1; size8 >= 0; size8--) {
                    RecyclerView.AbstractC0569e0 abstractC0569e1 = arrayList3.get(size8);
                    abstractC0569e1.itemView.setAlpha(1.0f);
                    dispatchAddFinished(abstractC0569e1);
                    arrayList3.remove(size8);
                    if (arrayList3.isEmpty()) {
                        this.mAdditionsList.remove(arrayList3);
                    }
                }
            }
            for (int size9 = this.mChangesList.size() - 1; size9 >= 0; size9--) {
                ArrayList<i> arrayList4 = this.mChangesList.get(size9);
                for (int size10 = arrayList4.size() - 1; size10 >= 0; size10--) {
                    endChangeAnimationIfNecessary(arrayList4.get(size10));
                    if (arrayList4.isEmpty()) {
                        this.mChangesList.remove(arrayList4);
                    }
                }
            }
            cancelAll(this.mRemoveAnimations);
            cancelAll(this.mMoveAnimations);
            cancelAll(this.mAddAnimations);
            cancelAll(this.mChangeAnimations);
            dispatchAnimationsFinished();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576l
    public boolean isRunning() {
        return (this.mPendingAdditions.isEmpty() && this.mPendingChanges.isEmpty() && this.mPendingMoves.isEmpty() && this.mPendingRemovals.isEmpty() && this.mMoveAnimations.isEmpty() && this.mRemoveAnimations.isEmpty() && this.mAddAnimations.isEmpty() && this.mChangeAnimations.isEmpty() && this.mMovesList.isEmpty() && this.mAdditionsList.isEmpty() && this.mChangesList.isEmpty()) ? false : true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576l
    public void runPendingAnimations() {
        boolean zIsEmpty = this.mPendingRemovals.isEmpty();
        boolean zIsEmpty2 = this.mPendingMoves.isEmpty();
        boolean zIsEmpty3 = this.mPendingChanges.isEmpty();
        boolean zIsEmpty4 = this.mPendingAdditions.isEmpty();
        if (zIsEmpty && zIsEmpty2 && zIsEmpty4 && zIsEmpty3) {
            return;
        }
        Iterator<RecyclerView.AbstractC0569e0> it = this.mPendingRemovals.iterator();
        while (it.hasNext()) {
            animateRemoveImpl(it.next());
        }
        this.mPendingRemovals.clear();
        if (!zIsEmpty2) {
            ArrayList<j> arrayList = new ArrayList<>();
            arrayList.addAll(this.mPendingMoves);
            this.mMovesList.add(arrayList);
            this.mPendingMoves.clear();
            a aVar = new a(arrayList);
            if (zIsEmpty) {
                aVar.run();
            } else {
                kkl0.m150150c0(arrayList.get(0).f2757a.itemView, aVar, getRemoveDuration());
            }
        }
        if (!zIsEmpty3) {
            ArrayList<i> arrayList2 = new ArrayList<>();
            arrayList2.addAll(this.mPendingChanges);
            this.mChangesList.add(arrayList2);
            this.mPendingChanges.clear();
            b bVar = new b(arrayList2);
            if (zIsEmpty) {
                bVar.run();
            } else {
                kkl0.m150150c0(arrayList2.get(0).f2751a.itemView, bVar, getRemoveDuration());
            }
        }
        if (zIsEmpty4) {
            return;
        }
        ArrayList<RecyclerView.AbstractC0569e0> arrayList3 = new ArrayList<>();
        arrayList3.addAll(this.mPendingAdditions);
        this.mAdditionsList.add(arrayList3);
        this.mPendingAdditions.clear();
        c cVar = new c(arrayList3);
        if (zIsEmpty && zIsEmpty2 && zIsEmpty3) {
            cVar.run();
        } else {
            kkl0.m150150c0(arrayList3.get(0).itemView, cVar, (!zIsEmpty ? getRemoveDuration() : 0L) + Math.max(!zIsEmpty2 ? getMoveDuration() : 0L, zIsEmpty3 ? 0L : getChangeDuration()));
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.f$i */
    public static class i {

        /* JADX INFO: renamed from: a */
        public RecyclerView.AbstractC0569e0 f2751a;

        /* JADX INFO: renamed from: b */
        public RecyclerView.AbstractC0569e0 f2752b;

        /* JADX INFO: renamed from: c */
        public int f2753c;

        /* JADX INFO: renamed from: d */
        public int f2754d;

        /* JADX INFO: renamed from: e */
        public int f2755e;

        /* JADX INFO: renamed from: f */
        public int f2756f;

        public i(RecyclerView.AbstractC0569e0 abstractC0569e0, RecyclerView.AbstractC0569e0 abstractC0569e1, int i, int i2, int i3, int i4) {
            this(abstractC0569e0, abstractC0569e1);
            this.f2753c = i;
            this.f2754d = i2;
            this.f2755e = i3;
            this.f2756f = i4;
        }

        @SuppressLint({"UnknownNullness"})
        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f2751a + ", newHolder=" + this.f2752b + ", fromX=" + this.f2753c + ", fromY=" + this.f2754d + ", toX=" + this.f2755e + ", toY=" + this.f2756f + '}';
        }

        public i(RecyclerView.AbstractC0569e0 abstractC0569e0, RecyclerView.AbstractC0569e0 abstractC0569e1) {
            this.f2751a = abstractC0569e0;
            this.f2752b = abstractC0569e1;
        }
    }

    private void endChangeAnimationIfNecessary(i iVar) {
        RecyclerView.AbstractC0569e0 abstractC0569e0 = iVar.f2751a;
        if (abstractC0569e0 != null) {
            endChangeAnimationIfNecessary(iVar, abstractC0569e0);
        }
        RecyclerView.AbstractC0569e0 abstractC0569e1 = iVar.f2752b;
        if (abstractC0569e1 != null) {
            endChangeAnimationIfNecessary(iVar, abstractC0569e1);
        }
    }
}
