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
import p153l.fg4;
import p153l.kkl0;
import p153l.ovf0;
import p153l.udc0;
import p153l.za50;

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
    public class RunnableC0414a implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C0417d f1988a;

        public RunnableC0414a(C0417d c0417d) {
            this.f1988a = c0417d;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (SpecialEffectsController.this.f1976b.contains(this.f1988a)) {
                this.f1988a.m2686e().applyState(this.f1988a.m2687f().mView);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.SpecialEffectsController$b */
    public class RunnableC0415b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ C0417d f1990a;

        public RunnableC0415b(C0417d c0417d) {
            this.f1990a = c0417d;
        }

        @Override // java.lang.Runnable
        public void run() {
            SpecialEffectsController.this.f1976b.remove(this.f1990a);
            SpecialEffectsController.this.f1977c.remove(this.f1990a);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.SpecialEffectsController$c */
    public static /* synthetic */ class C0416c {

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
    public static class C0417d extends Operation {

        /* JADX INFO: renamed from: h */
        @NonNull
        public final C0425h f1994h;

        public C0417d(@NonNull Operation.State state, @NonNull Operation.LifecycleImpact lifecycleImpact, @NonNull C0425h c0425h, @NonNull fg4 fg4Var) {
            super(state, lifecycleImpact, c0425h.m2767k(), fg4Var);
            this.f1994h = c0425h;
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Operation
        /* JADX INFO: renamed from: c */
        public void mo2684c() {
            super.mo2684c();
            this.f1994h.m2769m();
        }

        @Override // androidx.fragment.app.SpecialEffectsController.Operation
        /* JADX INFO: renamed from: l */
        public void mo2693l() {
            if (m2688g() == Operation.LifecycleImpact.ADDING) {
                Fragment fragmentM2767k = this.f1994h.m2767k();
                View viewFindFocus = fragmentM2767k.mView.findFocus();
                if (viewFindFocus != null) {
                    fragmentM2767k.setFocusedView(viewFindFocus);
                    if (FragmentManager.m2481G0(2)) {
                        viewFindFocus.toString();
                        fragmentM2767k.toString();
                    }
                }
                View viewRequireView = m2687f().requireView();
                if (viewRequireView.getParent() == null) {
                    this.f1994h.m2758b();
                    viewRequireView.setAlpha(0.0f);
                }
                if (viewRequireView.getAlpha() == 0.0f && viewRequireView.getVisibility() == 0) {
                    viewRequireView.setVisibility(4);
                }
                viewRequireView.setAlpha(fragmentM2767k.getPostOnViewCreatedAlpha());
            }
        }
    }

    public SpecialEffectsController(@NonNull ViewGroup viewGroup) {
        this.f1975a = viewGroup;
    }

    @NonNull
    /* JADX INFO: renamed from: n */
    public static SpecialEffectsController m2664n(@NonNull ViewGroup viewGroup, @NonNull FragmentManager fragmentManager) {
        return m2665o(viewGroup, fragmentManager.m2608z0());
    }

    @NonNull
    /* JADX INFO: renamed from: o */
    public static SpecialEffectsController m2665o(@NonNull ViewGroup viewGroup, @NonNull ovf0 ovf0Var) {
        Object tag = viewGroup.getTag(udc0.f178517b);
        if (tag instanceof SpecialEffectsController) {
            return (SpecialEffectsController) tag;
        }
        SpecialEffectsController specialEffectsControllerMo2616a = ovf0Var.mo2616a(viewGroup);
        viewGroup.setTag(udc0.f178517b, specialEffectsControllerMo2616a);
        return specialEffectsControllerMo2616a;
    }

    /* JADX INFO: renamed from: a */
    public final void m2666a(@NonNull Operation.State state, @NonNull Operation.LifecycleImpact lifecycleImpact, @NonNull C0425h c0425h) {
        synchronized (this.f1976b) {
            try {
                fg4 fg4Var = new fg4();
                Operation operationM2673h = m2673h(c0425h.m2767k());
                if (operationM2673h != null) {
                    operationM2673h.m2692k(state, lifecycleImpact);
                    return;
                }
                C0417d c0417d = new C0417d(state, lifecycleImpact, c0425h, fg4Var);
                this.f1976b.add(c0417d);
                c0417d.m2682a(new RunnableC0414a(c0417d));
                c0417d.m2682a(new RunnableC0415b(c0417d));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public void m2667b(@NonNull Operation.State state, @NonNull C0425h c0425h) {
        if (FragmentManager.m2481G0(2)) {
            Objects.toString(c0425h.m2767k());
        }
        m2666a(state, Operation.LifecycleImpact.ADDING, c0425h);
    }

    /* JADX INFO: renamed from: c */
    public void m2668c(@NonNull C0425h c0425h) {
        if (FragmentManager.m2481G0(2)) {
            Objects.toString(c0425h.m2767k());
        }
        m2666a(Operation.State.GONE, Operation.LifecycleImpact.NONE, c0425h);
    }

    /* JADX INFO: renamed from: d */
    public void m2669d(@NonNull C0425h c0425h) {
        if (FragmentManager.m2481G0(2)) {
            Objects.toString(c0425h.m2767k());
        }
        m2666a(Operation.State.REMOVED, Operation.LifecycleImpact.REMOVING, c0425h);
    }

    /* JADX INFO: renamed from: e */
    public void m2670e(@NonNull C0425h c0425h) {
        if (FragmentManager.m2481G0(2)) {
            Objects.toString(c0425h.m2767k());
        }
        m2666a(Operation.State.VISIBLE, Operation.LifecycleImpact.NONE, c0425h);
    }

    /* JADX INFO: renamed from: f */
    public abstract void mo2671f(@NonNull List<Operation> list, boolean z);

    /* JADX INFO: renamed from: g */
    public void m2672g() {
        if (this.f1979e) {
            return;
        }
        if (!kkl0.m150133O(this.f1975a)) {
            m2675j();
            this.f1978d = false;
            return;
        }
        synchronized (this.f1976b) {
            try {
                if (!this.f1976b.isEmpty()) {
                    ArrayList<Operation> arrayList = new ArrayList(this.f1977c);
                    this.f1977c.clear();
                    for (Operation operation : arrayList) {
                        if (FragmentManager.m2481G0(2)) {
                            Objects.toString(operation);
                        }
                        operation.m2683b();
                        if (!operation.m2690i()) {
                            this.f1977c.add(operation);
                        }
                    }
                    m2680q();
                    ArrayList arrayList2 = new ArrayList(this.f1976b);
                    this.f1976b.clear();
                    this.f1977c.addAll(arrayList2);
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        ((Operation) it.next()).mo2693l();
                    }
                    mo2671f(arrayList2, this.f1978d);
                    this.f1978d = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: h */
    public final Operation m2673h(@NonNull Fragment fragment) {
        for (Operation operation : this.f1976b) {
            if (operation.m2687f().equals(fragment) && !operation.m2689h()) {
                return operation;
            }
        }
        return null;
    }

    @Nullable
    /* JADX INFO: renamed from: i */
    public final Operation m2674i(@NonNull Fragment fragment) {
        for (Operation operation : this.f1977c) {
            if (operation.m2687f().equals(fragment) && !operation.m2689h()) {
                return operation;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: j */
    public void m2675j() {
        boolean zM150133O = kkl0.m150133O(this.f1975a);
        synchronized (this.f1976b) {
            try {
                m2680q();
                Iterator<Operation> it = this.f1976b.iterator();
                while (it.hasNext()) {
                    it.next().mo2693l();
                }
                for (Operation operation : new ArrayList(this.f1977c)) {
                    if (FragmentManager.m2481G0(2)) {
                        if (!zM150133O) {
                            StringBuilder sb = new StringBuilder();
                            sb.append("Container ");
                            sb.append(this.f1975a);
                            sb.append(" is not attached to window. ");
                        }
                        Objects.toString(operation);
                    }
                    operation.m2683b();
                }
                for (Operation operation2 : new ArrayList(this.f1976b)) {
                    if (FragmentManager.m2481G0(2)) {
                        if (!zM150133O) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("Container ");
                            sb2.append(this.f1975a);
                            sb2.append(" is not attached to window. ");
                        }
                        Objects.toString(operation2);
                    }
                    operation2.m2683b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m2676k() {
        if (this.f1979e) {
            this.f1979e = false;
            m2672g();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public Operation.LifecycleImpact m2677l(@NonNull C0425h c0425h) {
        Operation operationM2673h = m2673h(c0425h.m2767k());
        if (operationM2673h != null) {
            return operationM2673h.m2688g();
        }
        Operation operationM2674i = m2674i(c0425h.m2767k());
        if (operationM2674i != null) {
            return operationM2674i.m2688g();
        }
        return null;
    }

    @NonNull
    /* JADX INFO: renamed from: m */
    public ViewGroup m2678m() {
        return this.f1975a;
    }

    /* JADX INFO: renamed from: p */
    public void m2679p() {
        synchronized (this.f1976b) {
            try {
                m2680q();
                this.f1979e = false;
                for (int size = this.f1976b.size() - 1; size >= 0; size--) {
                    Operation operation = this.f1976b.get(size);
                    Operation.State stateFrom = Operation.State.from(operation.m2687f().mView);
                    Operation.State stateM2686e = operation.m2686e();
                    Operation.State state = Operation.State.VISIBLE;
                    if (stateM2686e == state && stateFrom != state) {
                        this.f1979e = operation.m2687f().isPostponed();
                        break;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m2680q() {
        for (Operation operation : this.f1976b) {
            if (operation.m2688g() == Operation.LifecycleImpact.ADDING) {
                operation.m2692k(Operation.State.from(operation.m2687f().requireView().getVisibility()), Operation.LifecycleImpact.NONE);
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public void m2681r(boolean z) {
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
        public final HashSet<fg4> f1984e = new HashSet<>();

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
        public class C0413a implements fg4.InterfaceC16973a {
            public C0413a() {
            }

            @Override // p153l.fg4.InterfaceC16973a
            public void onCancel() {
                Operation.this.m2683b();
            }
        }

        public Operation(@NonNull State state, @NonNull LifecycleImpact lifecycleImpact, @NonNull Fragment fragment, @NonNull fg4 fg4Var) {
            this.f1980a = state;
            this.f1981b = lifecycleImpact;
            this.f1982c = fragment;
            fg4Var.m125478d(new C0413a());
        }

        /* JADX INFO: renamed from: a */
        public final void m2682a(@NonNull Runnable runnable) {
            this.f1983d.add(runnable);
        }

        /* JADX INFO: renamed from: b */
        public final void m2683b() {
            if (m2689h()) {
                return;
            }
            this.f1985f = true;
            if (this.f1984e.isEmpty()) {
                mo2684c();
                return;
            }
            Iterator it = new ArrayList(this.f1984e).iterator();
            while (it.hasNext()) {
                ((fg4) it.next()).m125475a();
            }
        }

        @CallSuper
        /* JADX INFO: renamed from: c */
        public void mo2684c() {
            if (this.f1986g) {
                return;
            }
            if (FragmentManager.m2481G0(2)) {
                toString();
            }
            this.f1986g = true;
            Iterator<Runnable> it = this.f1983d.iterator();
            while (it.hasNext()) {
                it.next().run();
            }
        }

        /* JADX INFO: renamed from: d */
        public final void m2685d(@NonNull fg4 fg4Var) {
            if (this.f1984e.remove(fg4Var) && this.f1984e.isEmpty()) {
                mo2684c();
            }
        }

        @NonNull
        /* JADX INFO: renamed from: e */
        public State m2686e() {
            return this.f1980a;
        }

        @NonNull
        /* JADX INFO: renamed from: f */
        public final Fragment m2687f() {
            return this.f1982c;
        }

        @NonNull
        /* JADX INFO: renamed from: g */
        public LifecycleImpact m2688g() {
            return this.f1981b;
        }

        /* JADX INFO: renamed from: h */
        public final boolean m2689h() {
            return this.f1985f;
        }

        /* JADX INFO: renamed from: i */
        public final boolean m2690i() {
            return this.f1986g;
        }

        /* JADX INFO: renamed from: j */
        public final void m2691j(@NonNull fg4 fg4Var) {
            mo2693l();
            this.f1984e.add(fg4Var);
        }

        /* JADX INFO: renamed from: k */
        public final void m2692k(@NonNull State state, @NonNull LifecycleImpact lifecycleImpact) {
            int i = C0416c.f1993b[lifecycleImpact.ordinal()];
            if (i == 1) {
                if (this.f1980a == State.REMOVED) {
                    if (FragmentManager.m2481G0(2)) {
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
                if (FragmentManager.m2481G0(2)) {
                    Objects.toString(this.f1982c);
                    Objects.toString(this.f1980a);
                    Objects.toString(this.f1981b);
                }
                this.f1980a = State.REMOVED;
                this.f1981b = LifecycleImpact.REMOVING;
                return;
            }
            if (i == 3 && this.f1980a != State.REMOVED) {
                if (FragmentManager.m2481G0(2)) {
                    Objects.toString(this.f1982c);
                    Objects.toString(this.f1980a);
                    Objects.toString(state);
                }
                this.f1980a = state;
            }
        }

        /* JADX INFO: renamed from: l */
        public void mo2693l() {
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
                int i = C0416c.f1992a[ordinal()];
                if (i == 1) {
                    ViewGroup viewGroup = (ViewGroup) view.getParent();
                    if (viewGroup != null) {
                        if (FragmentManager.m2481G0(2)) {
                            view.toString();
                            viewGroup.toString();
                        }
                        viewGroup.removeView(view);
                        return;
                    }
                    return;
                }
                if (i == 2) {
                    if (FragmentManager.m2481G0(2)) {
                        Objects.toString(view);
                    }
                    view.setVisibility(0);
                } else if (i == 3) {
                    if (FragmentManager.m2481G0(2)) {
                        Objects.toString(view);
                    }
                    view.setVisibility(8);
                } else {
                    if (i != 4) {
                        return;
                    }
                    if (FragmentManager.m2481G0(2)) {
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
                za50.m219101a("Unknown visibility ", i);
                return null;
            }
        }
    }
}
