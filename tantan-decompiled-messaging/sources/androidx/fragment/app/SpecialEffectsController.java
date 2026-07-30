package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p149l.fnf0;
import p149l.gbl0;
import p149l.gf4;
import p149l.k250;
import p149l.p5c0;

/* JADX INFO: loaded from: classes.dex */
public abstract class SpecialEffectsController {

    /* JADX INFO: renamed from: a */
    public final ViewGroup f1975a;

    /* JADX INFO: renamed from: b */
    public final ArrayList<Operation> f1976b = new ArrayList<>();

    /* JADX INFO: renamed from: c */
    public final ArrayList<Operation> f1977c = new ArrayList<>();

    /* JADX INFO: renamed from: d */
    public boolean f1978d = false;

    /* JADX INFO: renamed from: e */
    public boolean f1979e = false;

    /* JADX INFO: renamed from: androidx.fragment.app.SpecialEffectsController$a */
    public class RunnableC0413a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C0416d f1988a;

        public RunnableC0413a(C0416d c0416d) {
            this.f1988a = c0416d;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (SpecialEffectsController.this.f1976b.contains(this.f1988a)) {
                this.f1988a.m2685e().applyState(this.f1988a.m2686f().mView);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.SpecialEffectsController$b */
    public class RunnableC0414b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C0416d f1990a;

        public RunnableC0414b(C0416d c0416d) {
            this.f1990a = c0416d;
        }

        @Override // java.lang.Runnable
        public void run() {
            SpecialEffectsController.this.f1976b.remove(this.f1990a);
            SpecialEffectsController.this.f1977c.remove(this.f1990a);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.SpecialEffectsController$c */
    public static /* synthetic */ class C0415c {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f1992a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f1993b;

        static {
            int[] iArr = new int[Operation.LifecycleImpact.values().length];
            f1993b = iArr;
            try {
                iArr[Operation.LifecycleImpact.ADDING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1993b[Operation.LifecycleImpact.REMOVING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1993b[Operation.LifecycleImpact.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[Operation.State.values().length];
            f1992a = iArr2;
            try {
                iArr2[Operation.State.REMOVED.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f1992a[Operation.State.VISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f1992a[Operation.State.GONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f1992a[Operation.State.INVISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.SpecialEffectsController$d */
    public static class C0416d extends Operation {

        /* JADX INFO: renamed from: h */
        @NonNull
        public final C0424h f1994h;

        public C0416d(@NonNull Operation.State state, @NonNull Operation.LifecycleImpact lifecycleImpact, @NonNull C0424h c0424h, @NonNull gf4 gf4Var) {
            super(state, lifecycleImpact, c0424h.m2766k(), gf4Var);
            this.f1994h = c0424h;
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Operation
        /* JADX INFO: renamed from: c */
        public void mo2683c() {
            super.mo2683c();
            this.f1994h.m2768m();
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Operation
        /* JADX INFO: renamed from: l */
        public void mo2692l() {
            if (m2687g() == Operation.LifecycleImpact.ADDING) {
                Fragment fragmentM2766k = this.f1994h.m2766k();
                View viewFindFocus = fragmentM2766k.mView.findFocus();
                if (viewFindFocus != null) {
                    fragmentM2766k.setFocusedView(viewFindFocus);
                    if (FragmentManager.m2480G0(2)) {
                        viewFindFocus.toString();
                        fragmentM2766k.toString();
                    }
                }
                View viewRequireView = m2686f().requireView();
                if (viewRequireView.getParent() == null) {
                    this.f1994h.m2757b();
                    viewRequireView.setAlpha(0.0f);
                }
                if (viewRequireView.getAlpha() == 0.0f && viewRequireView.getVisibility() == 0) {
                    viewRequireView.setVisibility(4);
                }
                viewRequireView.setAlpha(fragmentM2766k.getPostOnViewCreatedAlpha());
            }
        }
    }

    public SpecialEffectsController(@NonNull ViewGroup viewGroup) {
        this.f1975a = viewGroup;
    }

    @NonNull
    /* JADX INFO: renamed from: n */
    public static SpecialEffectsController m2663n(@NonNull ViewGroup viewGroup, @NonNull FragmentManager fragmentManager) {
        return m2664o(viewGroup, fragmentManager.m2607z0());
    }

    @NonNull
    /* JADX INFO: renamed from: o */
    public static SpecialEffectsController m2664o(@NonNull ViewGroup viewGroup, @NonNull fnf0 fnf0Var) {
        Object tag = viewGroup.getTag(p5c0.f147284b);
        if (tag instanceof SpecialEffectsController) {
            return (SpecialEffectsController) tag;
        }
        SpecialEffectsController specialEffectsControllerMo2615a = fnf0Var.mo2615a(viewGroup);
        viewGroup.setTag(p5c0.f147284b, specialEffectsControllerMo2615a);
        return specialEffectsControllerMo2615a;
    }

    /* JADX INFO: renamed from: a */
    public final void m2665a(@NonNull Operation.State state, @NonNull Operation.LifecycleImpact lifecycleImpact, @NonNull C0424h c0424h) {
        synchronized (this.f1976b) {
            try {
                gf4 gf4Var = new gf4();
                Operation operationM2672h = m2672h(c0424h.m2766k());
                if (operationM2672h != null) {
                    operationM2672h.m2691k(state, lifecycleImpact);
                    return;
                }
                C0416d c0416d = new C0416d(state, lifecycleImpact, c0424h, gf4Var);
                this.f1976b.add(c0416d);
                c0416d.m2681a(new RunnableC0413a(c0416d));
                c0416d.m2681a(new RunnableC0414b(c0416d));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m2666b(@NonNull Operation.State state, @NonNull C0424h c0424h) {
        if (FragmentManager.m2480G0(2)) {
            Objects.toString(c0424h.m2766k());
        }
        m2665a(state, Operation.LifecycleImpact.ADDING, c0424h);
    }

    /* JADX INFO: renamed from: c */
    public void m2667c(@NonNull C0424h c0424h) {
        if (FragmentManager.m2480G0(2)) {
            Objects.toString(c0424h.m2766k());
        }
        m2665a(Operation.State.GONE, Operation.LifecycleImpact.NONE, c0424h);
    }

    /* JADX INFO: renamed from: d */
    public void m2668d(@NonNull C0424h c0424h) {
        if (FragmentManager.m2480G0(2)) {
            Objects.toString(c0424h.m2766k());
        }
        m2665a(Operation.State.REMOVED, Operation.LifecycleImpact.REMOVING, c0424h);
    }

    /* JADX INFO: renamed from: e */
    public void m2669e(@NonNull C0424h c0424h) {
        if (FragmentManager.m2480G0(2)) {
            Objects.toString(c0424h.m2766k());
        }
        m2665a(Operation.State.VISIBLE, Operation.LifecycleImpact.NONE, c0424h);
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo2670f(@NonNull List<Operation> list, boolean z);

    /* JADX INFO: renamed from: g */
    public void m2671g() {
        if (this.f1979e) {
            return;
        }
        if (!gbl0.m125170O(this.f1975a)) {
            m2674j();
            this.f1978d = false;
            return;
        }
        synchronized (this.f1976b) {
            try {
                if (!this.f1976b.isEmpty()) {
                    ArrayList<Operation> arrayList = new ArrayList(this.f1977c);
                    this.f1977c.clear();
                    for (Operation operation : arrayList) {
                        if (FragmentManager.m2480G0(2)) {
                            Objects.toString(operation);
                        }
                        operation.m2682b();
                        if (!operation.m2689i()) {
                            this.f1977c.add(operation);
                        }
                    }
                    m2679q();
                    ArrayList arrayList2 = new ArrayList(this.f1976b);
                    this.f1976b.clear();
                    this.f1977c.addAll(arrayList2);
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ((Operation) it.next()).mo2692l();
                    }
                    mo2670f(arrayList2, this.f1978d);
                    this.f1978d = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public final Operation m2672h(@NonNull Fragment fragment) {
        for (Operation operation : this.f1976b) {
            if (operation.m2686f().equals(fragment) && !operation.m2688h()) {
                return operation;
            }
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public final Operation m2673i(@NonNull Fragment fragment) {
        for (Operation operation : this.f1977c) {
            if (operation.m2686f().equals(fragment) && !operation.m2688h()) {
                return operation;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m2674j() {
        boolean zM125170O = gbl0.m125170O(this.f1975a);
        synchronized (this.f1976b) {
            try {
                m2679q();
                Iterator<Operation> it = this.f1976b.iterator();
                while (it.hasNext()) {
                    it.next().mo2692l();
                }
                for (Operation operation : new ArrayList(this.f1977c)) {
                    if (FragmentManager.m2480G0(2)) {
                        if (!zM125170O) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Container ");
                            sb.append(this.f1975a);
                            sb.append(" is not attached to window. ");
                        }
                        Objects.toString(operation);
                    }
                    operation.m2682b();
                }
                for (Operation operation2 : new ArrayList(this.f1976b)) {
                    if (FragmentManager.m2480G0(2)) {
                        if (!zM125170O) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Container ");
                            sb2.append(this.f1975a);
                            sb2.append(" is not attached to window. ");
                        }
                        Objects.toString(operation2);
                    }
                    operation2.m2682b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m2675k() {
        if (this.f1979e) {
            this.f1979e = false;
            m2671g();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public Operation.LifecycleImpact m2676l(@NonNull C0424h c0424h) {
        Operation operationM2672h = m2672h(c0424h.m2766k());
        if (operationM2672h != null) {
            return operationM2672h.m2687g();
        }
        Operation operationM2673i = m2673i(c0424h.m2766k());
        if (operationM2673i != null) {
            return operationM2673i.m2687g();
        }
        return null;
    }

    @NonNull
    /* JADX INFO: renamed from: m */
    public ViewGroup m2677m() {
        return this.f1975a;
    }

    /* JADX INFO: renamed from: p */
    public void m2678p() {
        synchronized (this.f1976b) {
            try {
                m2679q();
                this.f1979e = false;
                for (int size = this.f1976b.size() - 1; size >= 0; size--) {
                    Operation operation = this.f1976b.get(size);
                    Operation.State stateFrom = Operation.State.from(operation.m2686f().mView);
                    Operation.State stateM2685e = operation.m2685e();
                    Operation.State state = Operation.State.VISIBLE;
                    if (stateM2685e == state && stateFrom != state) {
                        this.f1979e = operation.m2686f().isPostponed();
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m2679q() {
        for (Operation operation : this.f1976b) {
            if (operation.m2687g() == Operation.LifecycleImpact.ADDING) {
                operation.m2691k(Operation.State.from(operation.m2686f().requireView().getVisibility()), Operation.LifecycleImpact.NONE);
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public void m2680r(boolean z) {
        this.f1978d = z;
    }

    public static class Operation {

        /* JADX INFO: renamed from: a */
        @NonNull
        public State f1980a;

        /* JADX INFO: renamed from: b */
        @NonNull
        public LifecycleImpact f1981b;

        /* JADX INFO: renamed from: c */
        @NonNull
        public final Fragment f1982c;

        /* JADX INFO: renamed from: d */
        @NonNull
        public final List<Runnable> f1983d = new ArrayList();

        /* JADX INFO: renamed from: e */
        @NonNull
        public final HashSet<gf4> f1984e = new HashSet<>();

        /* JADX INFO: renamed from: f */
        public boolean f1985f = false;

        /* JADX INFO: renamed from: g */
        public boolean f1986g = false;

        public enum LifecycleImpact {
            NONE,
            ADDING,
            REMOVING
        }

        /* JADX INFO: renamed from: androidx.fragment.app.SpecialEffectsController$Operation$a */
        public class C0412a implements gf4.InterfaceC17068a {
            public C0412a() {
            }

            @Override // p149l.gf4.InterfaceC17068a
            public void onCancel() {
                Operation.this.m2682b();
            }
        }

        public Operation(@NonNull State state, @NonNull LifecycleImpact lifecycleImpact, @NonNull Fragment fragment, @NonNull gf4 gf4Var) {
            this.f1980a = state;
            this.f1981b = lifecycleImpact;
            this.f1982c = fragment;
            gf4Var.m125876d(new C0412a());
        }

        /* JADX INFO: renamed from: a */
        public final void m2681a(@NonNull Runnable runnable) {
            this.f1983d.add(runnable);
        }

        /* JADX INFO: renamed from: b */
        public final void m2682b() {
            if (m2688h()) {
                return;
            }
            this.f1985f = true;
            if (this.f1984e.isEmpty()) {
                mo2683c();
                return;
            }
            Iterator it = new ArrayList(this.f1984e).iterator();
            while (it.hasNext()) {
                ((gf4) it.next()).m125873a();
            }
        }

        @CallSuper
        /* JADX INFO: renamed from: c */
        public void mo2683c() {
            if (this.f1986g) {
                return;
            }
            if (FragmentManager.m2480G0(2)) {
                toString();
            }
            this.f1986g = true;
            Iterator<Runnable> it = this.f1983d.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
        }

        /* JADX INFO: renamed from: d */
        public final void m2684d(@NonNull gf4 gf4Var) {
            if (this.f1984e.remove(gf4Var) && this.f1984e.isEmpty()) {
                mo2683c();
            }
        }

        @NonNull
        /* JADX INFO: renamed from: e */
        public State m2685e() {
            return this.f1980a;
        }

        @NonNull
        /* JADX INFO: renamed from: f */
        public final Fragment m2686f() {
            return this.f1982c;
        }

        @NonNull
        /* JADX INFO: renamed from: g */
        public LifecycleImpact m2687g() {
            return this.f1981b;
        }

        /* JADX INFO: renamed from: h */
        public final boolean m2688h() {
            return this.f1985f;
        }

        /* JADX INFO: renamed from: i */
        public final boolean m2689i() {
            return this.f1986g;
        }

        /* JADX INFO: renamed from: j */
        public final void m2690j(@NonNull gf4 gf4Var) {
            mo2692l();
            this.f1984e.add(gf4Var);
        }

        /* JADX INFO: renamed from: k */
        public final void m2691k(@NonNull State state, @NonNull LifecycleImpact lifecycleImpact) {
            int i = C0415c.f1993b[lifecycleImpact.ordinal()];
            if (i == 1) {
                if (this.f1980a == State.REMOVED) {
                    if (FragmentManager.m2480G0(2)) {
                        Objects.toString(this.f1982c);
                        Objects.toString(this.f1981b);
                    }
                    this.f1980a = State.VISIBLE;
                    this.f1981b = LifecycleImpact.ADDING;
                    return;
                }
                return;
            }
            if (i == 2) {
                if (FragmentManager.m2480G0(2)) {
                    Objects.toString(this.f1982c);
                    Objects.toString(this.f1980a);
                    Objects.toString(this.f1981b);
                }
                this.f1980a = State.REMOVED;
                this.f1981b = LifecycleImpact.REMOVING;
                return;
            }
            if (i == 3 && this.f1980a != State.REMOVED) {
                if (FragmentManager.m2480G0(2)) {
                    Objects.toString(this.f1982c);
                    Objects.toString(this.f1980a);
                    Objects.toString(state);
                }
                this.f1980a = state;
            }
        }

        /* JADX INFO: renamed from: l */
        public void mo2692l() {
        }

        @NonNull
        public String toString() {
            return "Operation {" + Integer.toHexString(System.identityHashCode(this)) + "} {mFinalState = " + this.f1980a + "} {mLifecycleImpact = " + this.f1981b + "} {mFragment = " + this.f1982c + "}";
        }

        public enum State {
            REMOVED,
            VISIBLE,
            GONE,
            INVISIBLE;

            @NonNull
            public static State from(@NonNull View view) {
                return (view.getAlpha() == 0.0f && view.getVisibility() == 0) ? INVISIBLE : from(view.getVisibility());
            }

            public void applyState(@NonNull View view) {
                int i = C0415c.f1992a[ordinal()];
                if (i == 1) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        if (FragmentManager.m2480G0(2)) {
                            view.toString();
                            viewGroup.toString();
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (i == 2) {
                    if (FragmentManager.m2480G0(2)) {
                        Objects.toString(view);
                    }
                    view.setVisibility(0);
                } else if (i == 3) {
                    if (FragmentManager.m2480G0(2)) {
                        Objects.toString(view);
                    }
                    view.setVisibility(8);
                } else {
                    if (i != 4) {
                        return;
                    }
                    if (FragmentManager.m2480G0(2)) {
                        Objects.toString(view);
                    }
                    view.setVisibility(4);
                }
            }

            @NonNull
            public static State from(int i) {
                if (i == 0) {
                    return VISIBLE;
                }
                if (i == 4) {
                    return INVISIBLE;
                }
                if (i == 8) {
                    return GONE;
                }
                k250.m144273a("Unknown visibility ", i);
                return null;
            }
        }
    }
}
