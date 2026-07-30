package p153l;

import android.graphics.Rect;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@RequiresApi(21)
public class u5j extends v5j {

    /* JADX INFO: renamed from: l.u5j$a */
    public class C20490a extends Transition.EpicenterCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Rect f177639a;

        public C20490a(Rect rect) {
            this.f177639a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            return this.f177639a;
        }
    }

    /* JADX INFO: renamed from: l.u5j$e */
    public class C20494e extends Transition.EpicenterCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Rect f177653a;

        public C20494e(Rect rect) {
            this.f177653a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f177653a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f177653a;
        }
    }

    /* JADX INFO: renamed from: C */
    public static boolean m194588C(Transition transition) {
        return (v5j.m199880l(transition.getTargetIds()) && v5j.m199880l(transition.getTargetNames()) && v5j.m199880l(transition.getTargetTypes())) ? false : true;
    }

    @Override // p153l.v5j
    /* JADX INFO: renamed from: A */
    public void mo194589A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            mo194599q(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // p153l.v5j
    /* JADX INFO: renamed from: B */
    public Object mo194590B(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    @Override // p153l.v5j
    /* JADX INFO: renamed from: a */
    public void mo194591a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    @Override // p153l.v5j
    /* JADX INFO: renamed from: b */
    public void mo194592b(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                mo194592b(transitionSet.getTransitionAt(i), arrayList);
                i++;
            }
            return;
        }
        if (m194588C(transition) || !v5j.m199880l(transition.getTargets())) {
            return;
        }
        int size = arrayList.size();
        while (i < size) {
            transition.addTarget(arrayList.get(i));
            i++;
        }
    }

    @Override // p153l.v5j
    /* JADX INFO: renamed from: c */
    public void mo194593c(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // p153l.v5j
    /* JADX INFO: renamed from: e */
    public boolean mo194594e(Object obj) {
        return obj instanceof Transition;
    }

    @Override // p153l.v5j
    /* JADX INFO: renamed from: g */
    public Object mo194595g(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // p153l.v5j
    /* JADX INFO: renamed from: m */
    public Object mo194596m(Object obj, Object obj2, Object obj3) {
        Transition ordering = (Transition) obj;
        Transition transition = (Transition) obj2;
        Transition transition2 = (Transition) obj3;
        if (ordering != null && transition != null) {
            ordering = new TransitionSet().addTransition(ordering).addTransition(transition).setOrdering(1);
        } else if (ordering == null) {
            ordering = transition != null ? transition : null;
        }
        if (transition2 == null) {
            return ordering;
        }
        TransitionSet transitionSet = new TransitionSet();
        if (ordering != null) {
            transitionSet.addTransition(ordering);
        }
        transitionSet.addTransition(transition2);
        return transitionSet;
    }

    @Override // p153l.v5j
    /* JADX INFO: renamed from: n */
    public Object mo194597n(Object obj, Object obj2, Object obj3) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        if (obj2 != null) {
            transitionSet.addTransition((Transition) obj2);
        }
        if (obj3 != null) {
            transitionSet.addTransition((Transition) obj3);
        }
        return transitionSet;
    }

    @Override // p153l.v5j
    /* JADX INFO: renamed from: p */
    public void mo194598p(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }

    @Override // p153l.v5j
    /* JADX INFO: renamed from: q */
    public void mo194599q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                mo194599q(transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (m194588C(transition) || (targets = transition.getTargets()) == null || targets.size() != arrayList.size() || !targets.containsAll(arrayList)) {
            return;
        }
        int size = arrayList2 == null ? 0 : arrayList2.size();
        while (i < size) {
            transition.addTarget(arrayList2.get(i));
            i++;
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            transition.removeTarget(arrayList.get(size2));
        }
    }

    @Override // p153l.v5j
    /* JADX INFO: renamed from: r */
    public void mo194600r(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new C20491b(view, arrayList));
    }

    @Override // p153l.v5j
    /* JADX INFO: renamed from: t */
    public void mo194601t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).addListener(new C20492c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // p153l.v5j
    /* JADX INFO: renamed from: u */
    public void mo194602u(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new C20494e(rect));
        }
    }

    @Override // p153l.v5j
    /* JADX INFO: renamed from: v */
    public void mo194603v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            m199883k(view, rect);
            ((Transition) obj).setEpicenterCallback(new C20490a(rect));
        }
    }

    @Override // p153l.v5j
    /* JADX INFO: renamed from: w */
    public void mo194604w(@NonNull Fragment fragment, @NonNull Object obj, @NonNull fg4 fg4Var, @NonNull Runnable runnable) {
        ((Transition) obj).addListener(new C20493d(runnable));
    }

    @Override // p153l.v5j
    /* JADX INFO: renamed from: z */
    public void mo194605z(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            v5j.m199877d(targets, arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        mo194592b(transitionSet, arrayList);
    }

    /* JADX INFO: renamed from: l.u5j$b */
    public class C20491b implements Transition.TransitionListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f177641a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ArrayList f177642b;

        public C20491b(View view, ArrayList arrayList) {
            this.f177641a = view;
            this.f177642b = arrayList;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f177641a.setVisibility(8);
            int size = this.f177642b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f177642b.get(i)).setVisibility(0);
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            transition.removeListener(this);
            transition.addListener(this);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }
    }

    /* JADX INFO: renamed from: l.u5j$c */
    public class C20492c implements Transition.TransitionListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object f177644a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ArrayList f177645b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Object f177646c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ ArrayList f177647d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ Object f177648e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ ArrayList f177649f;

        public C20492c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f177644a = obj;
            this.f177645b = arrayList;
            this.f177646c = obj2;
            this.f177647d = arrayList2;
            this.f177648e = obj3;
            this.f177649f = arrayList3;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            Object obj = this.f177644a;
            if (obj != null) {
                u5j.this.mo194599q(obj, this.f177645b, null);
            }
            Object obj2 = this.f177646c;
            if (obj2 != null) {
                u5j.this.mo194599q(obj2, this.f177647d, null);
            }
            Object obj3 = this.f177648e;
            if (obj3 != null) {
                u5j.this.mo194599q(obj3, this.f177649f, null);
            }
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }
    }

    /* JADX INFO: renamed from: l.u5j$d */
    public class C20493d implements Transition.TransitionListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f177651a;

        public C20493d(Runnable runnable) {
            this.f177651a = runnable;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            this.f177651a.run();
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionCancel(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionPause(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionResume(Transition transition) {
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
        }
    }
}
