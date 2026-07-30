package p149l;

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
public class z2j extends a3j {

    /* JADX INFO: renamed from: l.z2j$a */
    public class C21606a extends Transition.EpicenterCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Rect f201237a;

        public C21606a(Rect rect) {
            this.f201237a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            return this.f201237a;
        }
    }

    /* JADX INFO: renamed from: l.z2j$e */
    public class C21610e extends Transition.EpicenterCallback {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Rect f201251a;

        public C21610e(Rect rect) {
            this.f201251a = rect;
        }

        @Override // android.transition.Transition.EpicenterCallback
        public Rect onGetEpicenter(Transition transition) {
            Rect rect = this.f201251a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f201251a;
        }
    }

    /* JADX INFO: renamed from: C */
    public static boolean m216969C(Transition transition) {
        return (a3j.m94695l(transition.getTargetIds()) && a3j.m94695l(transition.getTargetNames()) && a3j.m94695l(transition.getTargetTypes())) ? false : true;
    }

    @Override // p149l.a3j
    /* JADX INFO: renamed from: A */
    public void mo94696A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        TransitionSet transitionSet = (TransitionSet) obj;
        if (transitionSet != null) {
            transitionSet.getTargets().clear();
            transitionSet.getTargets().addAll(arrayList2);
            mo94710q(transitionSet, arrayList, arrayList2);
        }
    }

    @Override // p149l.a3j
    /* JADX INFO: renamed from: B */
    public Object mo94697B(Object obj) {
        if (obj == null) {
            return null;
        }
        TransitionSet transitionSet = new TransitionSet();
        transitionSet.addTransition((Transition) obj);
        return transitionSet;
    }

    @Override // p149l.a3j
    /* JADX INFO: renamed from: a */
    public void mo94698a(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).addTarget(view);
        }
    }

    @Override // p149l.a3j
    /* JADX INFO: renamed from: b */
    public void mo94699b(Object obj, ArrayList<View> arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                mo94699b(transitionSet.getTransitionAt(i), arrayList);
                i++;
            }
            return;
        }
        if (m216969C(transition) || !a3j.m94695l(transition.getTargets())) {
            return;
        }
        int size = arrayList.size();
        while (i < size) {
            transition.addTarget(arrayList.get(i));
            i++;
        }
    }

    @Override // p149l.a3j
    /* JADX INFO: renamed from: c */
    public void mo94700c(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // p149l.a3j
    /* JADX INFO: renamed from: e */
    public boolean mo94701e(Object obj) {
        return obj instanceof Transition;
    }

    @Override // p149l.a3j
    /* JADX INFO: renamed from: g */
    public Object mo94703g(Object obj) {
        if (obj != null) {
            return ((Transition) obj).clone();
        }
        return null;
    }

    @Override // p149l.a3j
    /* JADX INFO: renamed from: m */
    public Object mo94706m(Object obj, Object obj2, Object obj3) {
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

    @Override // p149l.a3j
    /* JADX INFO: renamed from: n */
    public Object mo94707n(Object obj, Object obj2, Object obj3) {
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

    @Override // p149l.a3j
    /* JADX INFO: renamed from: p */
    public void mo94709p(Object obj, View view) {
        if (obj != null) {
            ((Transition) obj).removeTarget(view);
        }
    }

    @Override // p149l.a3j
    /* JADX INFO: renamed from: q */
    public void mo94710q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        List<View> targets;
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                mo94710q(transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (m216969C(transition) || (targets = transition.getTargets()) == null || targets.size() != arrayList.size() || !targets.containsAll(arrayList)) {
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

    @Override // p149l.a3j
    /* JADX INFO: renamed from: r */
    public void mo94711r(Object obj, View view, ArrayList<View> arrayList) {
        ((Transition) obj).addListener(new C21607b(view, arrayList));
    }

    @Override // p149l.a3j
    /* JADX INFO: renamed from: t */
    public void mo94713t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((Transition) obj).addListener(new C21608c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // p149l.a3j
    /* JADX INFO: renamed from: u */
    public void mo94714u(Object obj, Rect rect) {
        if (obj != null) {
            ((Transition) obj).setEpicenterCallback(new C21610e(rect));
        }
    }

    @Override // p149l.a3j
    /* JADX INFO: renamed from: v */
    public void mo94715v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            m94705k(view, rect);
            ((Transition) obj).setEpicenterCallback(new C21606a(rect));
        }
    }

    @Override // p149l.a3j
    /* JADX INFO: renamed from: w */
    public void mo94716w(@NonNull Fragment fragment, @NonNull Object obj, @NonNull gf4 gf4Var, @NonNull Runnable runnable) {
        ((Transition) obj).addListener(new C21609d(runnable));
    }

    @Override // p149l.a3j
    /* JADX INFO: renamed from: z */
    public void mo94719z(Object obj, View view, ArrayList<View> arrayList) {
        TransitionSet transitionSet = (TransitionSet) obj;
        List<View> targets = transitionSet.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            a3j.m94692d(targets, arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        mo94699b(transitionSet, arrayList);
    }

    /* JADX INFO: renamed from: l.z2j$b */
    public class C21607b implements Transition.TransitionListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f201239a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ArrayList f201240b;

        public C21607b(View view, ArrayList arrayList) {
            this.f201239a = view;
            this.f201240b = arrayList;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
            this.f201239a.setVisibility(8);
            int size = this.f201240b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f201240b.get(i)).setVisibility(0);
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

    /* JADX INFO: renamed from: l.z2j$c */
    public class C21608c implements Transition.TransitionListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object f201242a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ArrayList f201243b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Object f201244c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ ArrayList f201245d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ Object f201246e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ ArrayList f201247f;

        public C21608c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f201242a = obj;
            this.f201243b = arrayList;
            this.f201244c = obj2;
            this.f201245d = arrayList2;
            this.f201246e = obj3;
            this.f201247f = arrayList3;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            transition.removeListener(this);
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionStart(Transition transition) {
            Object obj = this.f201242a;
            if (obj != null) {
                z2j.this.mo94710q(obj, this.f201243b, null);
            }
            Object obj2 = this.f201244c;
            if (obj2 != null) {
                z2j.this.mo94710q(obj2, this.f201245d, null);
            }
            Object obj3 = this.f201246e;
            if (obj3 != null) {
                z2j.this.mo94710q(obj3, this.f201247f, null);
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

    /* JADX INFO: renamed from: l.z2j$d */
    public class C21609d implements Transition.TransitionListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Runnable f201249a;

        public C21609d(Runnable runnable) {
            this.f201249a = runnable;
        }

        @Override // android.transition.Transition.TransitionListener
        public void onTransitionEnd(Transition transition) {
            this.f201249a.run();
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
