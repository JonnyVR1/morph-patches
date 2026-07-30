package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p153l.eq50;
import p153l.fg4;
import p153l.j3f0;
import p153l.kkl0;
import p153l.l01;
import p153l.src0;
import p153l.v5j;
import p153l.yn80;
import p153l.zkl0;

/* JADX INFO: renamed from: androidx.fragment.app.b */
/* JADX INFO: loaded from: classes.dex */
public class C0419b extends SpecialEffectsController {

    /* JADX INFO: renamed from: androidx.fragment.app.b$a */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f1998a;

        static {
            int[] iArr = new int[SpecialEffectsController.Operation.State.values().length];
            f1998a = iArr;
            try {
                iArr[SpecialEffectsController.Operation.State.GONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f1998a[SpecialEffectsController.Operation.State.INVISIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f1998a[SpecialEffectsController.Operation.State.REMOVED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f1998a[SpecialEffectsController.Operation.State.VISIBLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.b$b */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f1999a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ SpecialEffectsController.Operation f2000b;

        public b(List list, SpecialEffectsController.Operation operation) {
            this.f1999a = list;
            this.f2000b = operation;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f1999a.contains(this.f2000b)) {
                this.f1999a.remove(this.f2000b);
                C0419b.this.m2720s(this.f2000b);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.b$c */
    public class c extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewGroup f2002a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f2003b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f2004c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ SpecialEffectsController.Operation f2005d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ k f2006e;

        public c(ViewGroup viewGroup, View view, boolean z, SpecialEffectsController.Operation operation, k kVar) {
            this.f2002a = viewGroup;
            this.f2003b = view;
            this.f2004c = z;
            this.f2005d = operation;
            this.f2006e = kVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f2002a.endViewTransition(this.f2003b);
            if (this.f2004c) {
                this.f2005d.m2686e().applyState(this.f2003b);
            }
            this.f2006e.m2727a();
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.b$d */
    public class d implements fg4.InterfaceC16973a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Animator f2008a;

        public d(Animator animator) {
            this.f2008a = animator;
        }

        @Override // p153l.fg4.InterfaceC16973a
        public void onCancel() {
            this.f2008a.end();
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.b$e */
    public class e implements Animation.AnimationListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ViewGroup f2010a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f2011b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ k f2012c;

        /* JADX INFO: renamed from: androidx.fragment.app.b$e$a */
        public class a implements Runnable {
            public a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                e eVar = e.this;
                eVar.f2010a.endViewTransition(eVar.f2011b);
                e.this.f2012c.m2727a();
            }
        }

        public e(ViewGroup viewGroup, View view, k kVar) {
            this.f2010a = viewGroup;
            this.f2011b = view;
            this.f2012c = kVar;
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationEnd(Animation animation) {
            this.f2010a.post(new a());
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public void onAnimationStart(Animation animation) {
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.b$f */
    public class f implements fg4.InterfaceC16973a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f2015a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ViewGroup f2016b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ k f2017c;

        public f(View view, ViewGroup viewGroup, k kVar) {
            this.f2015a = view;
            this.f2016b = viewGroup;
            this.f2017c = kVar;
        }

        @Override // p153l.fg4.InterfaceC16973a
        public void onCancel() {
            this.f2015a.clearAnimation();
            this.f2016b.endViewTransition(this.f2015a);
            this.f2017c.m2727a();
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.b$g */
    public class g implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ SpecialEffectsController.Operation f2019a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ SpecialEffectsController.Operation f2020b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ boolean f2021c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ l01 f2022d;

        public g(SpecialEffectsController.Operation operation, SpecialEffectsController.Operation operation2, boolean z, l01 l01Var) {
            this.f2019a = operation;
            this.f2020b = operation2;
            this.f2021c = z;
            this.f2022d = l01Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0429l.m2825f(this.f2019a.m2687f(), this.f2020b.m2687f(), this.f2021c, this.f2022d, false);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.b$h */
    public class h implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ v5j f2024a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f2025b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Rect f2026c;

        public h(v5j v5jVar, View view, Rect rect) {
            this.f2024a = v5jVar;
            this.f2025b = view;
            this.f2026c = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2024a.m199883k(this.f2025b, this.f2026c);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.b$i */
    public class i implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ArrayList f2028a;

        public i(ArrayList arrayList) {
            this.f2028a = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0429l.m2818B(this.f2028a, 4);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.b$j */
    public class j implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ m f2030a;

        public j(m mVar) {
            this.f2030a = mVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2030a.m2727a();
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.b$k */
    public static class k extends l {

        /* JADX INFO: renamed from: c */
        public boolean f2032c;

        /* JADX INFO: renamed from: d */
        @Nullable
        public C0421d.d f2033d;

        public k(@NonNull SpecialEffectsController.Operation operation, @NonNull fg4 fg4Var) {
            super(operation, fg4Var);
            this.f2032c = false;
        }

        @Nullable
        /* JADX INFO: renamed from: e */
        public C0421d.d m2726e(@NonNull Context context) {
            if (this.f2032c) {
                return this.f2033d;
            }
            C0421d.d dVarM2739b = C0421d.m2739b(context, m2728b().m2687f(), m2728b().m2686e() == SpecialEffectsController.Operation.State.VISIBLE);
            this.f2033d = dVarM2739b;
            this.f2032c = true;
            return dVarM2739b;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.b$l */
    public static class l {

        /* JADX INFO: renamed from: a */
        @NonNull
        public final SpecialEffectsController.Operation f2034a;

        /* JADX INFO: renamed from: b */
        @NonNull
        public final fg4 f2035b;

        public l(@NonNull SpecialEffectsController.Operation operation, @NonNull fg4 fg4Var) {
            this.f2034a = operation;
            this.f2035b = fg4Var;
        }

        /* JADX INFO: renamed from: a */
        public void m2727a() {
            this.f2034a.m2685d(this.f2035b);
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public SpecialEffectsController.Operation m2728b() {
            return this.f2034a;
        }

        @NonNull
        /* JADX INFO: renamed from: c */
        public fg4 m2729c() {
            return this.f2035b;
        }

        /* JADX INFO: renamed from: d */
        public boolean m2730d() {
            SpecialEffectsController.Operation.State stateFrom = SpecialEffectsController.Operation.State.from(this.f2034a.m2687f().mView);
            SpecialEffectsController.Operation.State stateM2686e = this.f2034a.m2686e();
            if (stateFrom == stateM2686e) {
                return true;
            }
            SpecialEffectsController.Operation.State state = SpecialEffectsController.Operation.State.VISIBLE;
            return (stateFrom == state || stateM2686e == state) ? false : true;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.b$m */
    public static class m extends l {

        /* JADX INFO: renamed from: c */
        @Nullable
        public final Object f2036c;

        /* JADX INFO: renamed from: d */
        public final boolean f2037d;

        /* JADX INFO: renamed from: e */
        @Nullable
        public final Object f2038e;

        public m(@NonNull SpecialEffectsController.Operation operation, @NonNull fg4 fg4Var, boolean z, boolean z2) {
            super(operation, fg4Var);
            if (operation.m2686e() == SpecialEffectsController.Operation.State.VISIBLE) {
                this.f2036c = z ? operation.m2687f().getReenterTransition() : operation.m2687f().getEnterTransition();
                this.f2037d = z ? operation.m2687f().getAllowReturnTransitionOverlap() : operation.m2687f().getAllowEnterTransitionOverlap();
            } else {
                this.f2036c = z ? operation.m2687f().getReturnTransition() : operation.m2687f().getExitTransition();
                this.f2037d = true;
            }
            if (!z2) {
                this.f2038e = null;
            } else if (z) {
                this.f2038e = operation.m2687f().getSharedElementReturnTransition();
            } else {
                this.f2038e = operation.m2687f().getSharedElementEnterTransition();
            }
        }

        @Nullable
        /* JADX INFO: renamed from: e */
        public v5j m2731e() {
            v5j v5jVarM2732f = m2732f(this.f2036c);
            v5j v5jVarM2732f2 = m2732f(this.f2038e);
            if (v5jVarM2732f == null || v5jVarM2732f2 == null || v5jVarM2732f == v5jVarM2732f2) {
                return v5jVarM2732f != null ? v5jVarM2732f : v5jVarM2732f2;
            }
            StringBuilder sb = new StringBuilder("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
            sb.append(m2728b().m2687f());
            sb.append(" returned Transition ");
            sb.append(this.f2036c);
            src0.m187593a(sb, " which uses a different Transition  type than its shared element transition ", this.f2038e);
            return null;
        }

        @Nullable
        /* JADX INFO: renamed from: f */
        public final v5j m2732f(Object obj) {
            if (obj == null) {
                return null;
            }
            v5j v5jVar = C0429l.f2110b;
            if (v5jVar != null && v5jVar.mo194594e(obj)) {
                return v5jVar;
            }
            v5j v5jVar2 = C0429l.f2111c;
            if (v5jVar2 != null && v5jVar2.mo194594e(obj)) {
                return v5jVar2;
            }
            StringBuilder sb = new StringBuilder("Transition ");
            sb.append(obj);
            Fragment fragmentM2687f = m2728b().m2687f();
            sb.append(" for fragment ");
            sb.append(fragmentM2687f);
            sb.append(" is not a valid framework Transition or AndroidX Transition");
            throw new IllegalArgumentException(sb.toString());
        }

        @Nullable
        /* JADX INFO: renamed from: g */
        public Object m2733g() {
            return this.f2038e;
        }

        @Nullable
        /* JADX INFO: renamed from: h */
        public Object m2734h() {
            return this.f2036c;
        }

        /* JADX INFO: renamed from: i */
        public boolean m2735i() {
            return this.f2038e != null;
        }

        /* JADX INFO: renamed from: j */
        public boolean m2736j() {
            return this.f2037d;
        }
    }

    public C0419b(@NonNull ViewGroup viewGroup) {
        super(viewGroup);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0081  */
    @Override // androidx.fragment.app.SpecialEffectsController
    /* JADX INFO: renamed from: f */
    public void mo2671f(@NonNull List<SpecialEffectsController.Operation> list, boolean z) {
        SpecialEffectsController.Operation operation = null;
        SpecialEffectsController.Operation operation2 = null;
        for (SpecialEffectsController.Operation operation3 : list) {
            SpecialEffectsController.Operation.State stateFrom = SpecialEffectsController.Operation.State.from(operation3.m2687f().mView);
            int i2 = a.f1998a[operation3.m2686e().ordinal()];
            if (i2 == 1 || i2 == 2 || i2 == 3) {
                if (stateFrom == SpecialEffectsController.Operation.State.VISIBLE && operation == null) {
                    operation = operation3;
                }
            } else if (i2 == 4 && stateFrom != SpecialEffectsController.Operation.State.VISIBLE) {
                operation2 = operation3;
            }
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList(list);
        for (SpecialEffectsController.Operation operation4 : list) {
            fg4 fg4Var = new fg4();
            operation4.m2691j(fg4Var);
            arrayList.add(new k(operation4, fg4Var));
            fg4 fg4Var2 = new fg4();
            operation4.m2691j(fg4Var2);
            boolean z2 = false;
            if (z) {
                if (operation4 == operation) {
                    z2 = true;
                }
            } else if (operation4 == operation2) {
                z2 = true;
            }
            arrayList2.add(new m(operation4, fg4Var2, z, z2));
            operation4.m2682a(new b(arrayList3, operation4));
        }
        Map<SpecialEffectsController.Operation, Boolean> mapM2725x = m2725x(arrayList2, z, operation, operation2);
        m2724w(arrayList, arrayList3, mapM2725x.containsValue(Boolean.TRUE), mapM2725x);
        Iterator<SpecialEffectsController.Operation> it = arrayList3.iterator();
        while (it.hasNext()) {
            m2720s(it.next());
        }
        arrayList3.clear();
    }

    /* JADX INFO: renamed from: s */
    public void m2720s(@NonNull SpecialEffectsController.Operation operation) {
        operation.m2686e().applyState(operation.m2687f().mView);
    }

    /* JADX INFO: renamed from: t */
    public void m2721t(ArrayList<View> arrayList, View view) {
        if (!(view instanceof ViewGroup)) {
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (zkl0.m220115b(viewGroup)) {
            arrayList.add(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt.getVisibility() == 0) {
                m2721t(arrayList, childAt);
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public void m2722u(Map<String, View> map, @NonNull View view) {
        String strM150120F = kkl0.m150120F(view);
        if (strM150120F != null) {
            map.put(strM150120F, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt.getVisibility() == 0) {
                    m2722u(map, childAt);
                }
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public void m2723v(@NonNull l01<String, View> l01Var, @NonNull Collection<String> collection) {
        Iterator<Map.Entry<String, View>> it = l01Var.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(kkl0.m150120F(it.next().getValue()))) {
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m2724w(@NonNull List<k> list, @NonNull List<SpecialEffectsController.Operation> list2, boolean z, @NonNull Map<SpecialEffectsController.Operation, Boolean> map) {
        ViewGroup viewGroupM2678m = m2678m();
        Context context = viewGroupM2678m.getContext();
        ArrayList<k> arrayList = new ArrayList();
        boolean z2 = false;
        for (k kVar : list) {
            if (kVar.m2730d()) {
                kVar.m2727a();
            } else {
                C0421d.d dVarM2726e = kVar.m2726e(context);
                if (dVarM2726e == null) {
                    kVar.m2727a();
                } else {
                    Animator animator = dVarM2726e.f2051b;
                    if (animator == null) {
                        arrayList.add(kVar);
                    } else {
                        SpecialEffectsController.Operation operationM2728b = kVar.m2728b();
                        Fragment fragmentM2687f = operationM2728b.m2687f();
                        if (Boolean.TRUE.equals(map.get(operationM2728b))) {
                            if (FragmentManager.m2481G0(2)) {
                                Objects.toString(fragmentM2687f);
                            }
                            kVar.m2727a();
                        } else {
                            boolean z3 = operationM2728b.m2686e() == SpecialEffectsController.Operation.State.GONE;
                            if (z3) {
                                list2.remove(operationM2728b);
                            }
                            View view = fragmentM2687f.mView;
                            viewGroupM2678m.startViewTransition(view);
                            animator.addListener(new c(viewGroupM2678m, view, z3, operationM2728b, kVar));
                            animator.setTarget(view);
                            animator.start();
                            kVar.m2729c().m125478d(new d(animator));
                            z2 = true;
                        }
                    }
                }
            }
        }
        for (k kVar2 : arrayList) {
            SpecialEffectsController.Operation operationM2728b2 = kVar2.m2728b();
            Fragment fragmentM2687f2 = operationM2728b2.m2687f();
            if (z) {
                if (FragmentManager.m2481G0(2)) {
                    Objects.toString(fragmentM2687f2);
                }
                kVar2.m2727a();
            } else if (z2) {
                if (FragmentManager.m2481G0(2)) {
                    Objects.toString(fragmentM2687f2);
                }
                kVar2.m2727a();
            } else {
                View view2 = fragmentM2687f2.mView;
                Animation animation = (Animation) yn80.m216775e(((C0421d.d) yn80.m216775e(kVar2.m2726e(context))).f2050a);
                if (operationM2728b2.m2686e() != SpecialEffectsController.Operation.State.REMOVED) {
                    view2.startAnimation(animation);
                    kVar2.m2727a();
                } else {
                    viewGroupM2678m.startViewTransition(view2);
                    C0421d.e eVar = new C0421d.e(animation, viewGroupM2678m, view2);
                    eVar.setAnimationListener(new e(viewGroupM2678m, view2, kVar2));
                    view2.startAnimation(eVar);
                }
                kVar2.m2729c().m125478d(new f(view2, viewGroupM2678m, kVar2));
            }
        }
    }

    @NonNull
    /* JADX INFO: renamed from: x */
    public final Map<SpecialEffectsController.Operation, Boolean> m2725x(@NonNull List<m> list, boolean z, @Nullable SpecialEffectsController.Operation operation, @Nullable SpecialEffectsController.Operation operation2) {
        Object obj;
        ArrayList<View> arrayList;
        SpecialEffectsController.Operation operation3;
        Object objMo194597n;
        Object objMo194597n2;
        View view;
        View view2;
        ArrayList<View> arrayList2;
        ArrayList arrayList3;
        Rect rect;
        ArrayList<View> arrayList4;
        View view3;
        j3f0 enterTransitionCallback;
        j3f0 exitTransitionCallback;
        View view4;
        int i2;
        String strM2836q;
        int i3;
        C0419b c0419b = this;
        HashMap map = new HashMap();
        v5j v5jVar = null;
        for (m mVar : list) {
            if (!mVar.m2730d()) {
                v5j v5jVarM2731e = mVar.m2731e();
                if (v5jVar == null) {
                    v5jVar = v5jVarM2731e;
                } else if (v5jVarM2731e != null && v5jVar != v5jVarM2731e) {
                    StringBuilder sb = new StringBuilder("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
                    sb.append(mVar.m2728b().m2687f());
                    Object objM2734h = mVar.m2734h();
                    sb.append(" returned Transition ");
                    sb.append(objM2734h);
                    sb.append(" which uses a different Transition  type than other Fragments.");
                    throw new IllegalArgumentException(sb.toString());
                }
            }
        }
        if (v5jVar == null) {
            for (m mVar2 : list) {
                map.put(mVar2.m2728b(), Boolean.FALSE);
                mVar2.m2727a();
            }
        } else {
            View view5 = new View(c0419b.m2678m().getContext());
            Rect rect2 = new Rect();
            ArrayList<View> arrayList5 = new ArrayList<>();
            ArrayList<View> arrayList6 = new ArrayList<>();
            l01 l01Var = new l01();
            Object obj2 = null;
            View view6 = null;
            boolean z2 = false;
            for (m mVar3 : list) {
                if (!mVar3.m2735i() || operation == null || operation2 == null) {
                    rect = rect2;
                    arrayList4 = arrayList5;
                    view3 = view6;
                } else {
                    Object objMo194590B = v5jVar.mo194590B(v5jVar.mo194595g(mVar3.m2733g()));
                    ArrayList<String> sharedElementSourceNames = operation2.m2687f().getSharedElementSourceNames();
                    ArrayList<String> sharedElementSourceNames2 = operation.m2687f().getSharedElementSourceNames();
                    ArrayList<String> sharedElementTargetNames = operation.m2687f().getSharedElementTargetNames();
                    int i4 = 0;
                    while (i4 < sharedElementTargetNames.size()) {
                        int iIndexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i4));
                        Object obj3 = objMo194590B;
                        if (iIndexOf != -1) {
                            sharedElementSourceNames.set(iIndexOf, sharedElementSourceNames2.get(i4));
                        }
                        i4++;
                        objMo194590B = obj3;
                    }
                    Object obj4 = objMo194590B;
                    ArrayList<String> sharedElementTargetNames2 = operation2.m2687f().getSharedElementTargetNames();
                    if (z == 0) {
                        enterTransitionCallback = operation.m2687f().getExitTransitionCallback();
                        exitTransitionCallback = operation2.m2687f().getEnterTransitionCallback();
                    } else {
                        enterTransitionCallback = operation.m2687f().getEnterTransitionCallback();
                        exitTransitionCallback = operation2.m2687f().getExitTransitionCallback();
                    }
                    int i5 = 0;
                    for (int size = sharedElementSourceNames.size(); i5 < size; size = size) {
                        l01Var.put(sharedElementSourceNames.get(i5), sharedElementTargetNames2.get(i5));
                        i5++;
                    }
                    l01<String, View> l01Var2 = new l01<>();
                    c0419b.m2722u(l01Var2, operation.m2687f().mView);
                    l01Var2.m152243o(sharedElementSourceNames);
                    if (enterTransitionCallback != null) {
                        enterTransitionCallback.m143344d(sharedElementSourceNames, l01Var2);
                        int size2 = sharedElementSourceNames.size() - 1;
                        while (size2 >= 0) {
                            String str = sharedElementSourceNames.get(size2);
                            View view7 = l01Var2.get(str);
                            if (view7 == null) {
                                l01Var.remove(str);
                                i3 = size2;
                            } else {
                                i3 = size2;
                                if (!str.equals(kkl0.m150120F(view7))) {
                                    l01Var.put(kkl0.m150120F(view7), (String) l01Var.remove(str));
                                }
                            }
                            size2 = i3 - 1;
                        }
                    } else {
                        l01Var.m152243o(l01Var2.keySet());
                    }
                    l01<String, View> l01Var3 = new l01<>();
                    c0419b.m2722u(l01Var3, operation2.m2687f().mView);
                    l01Var3.m152243o(sharedElementTargetNames2);
                    l01Var3.m152243o(l01Var.values());
                    if (exitTransitionCallback != null) {
                        exitTransitionCallback.m143344d(sharedElementTargetNames2, l01Var3);
                        int size3 = sharedElementTargetNames2.size() - 1;
                        while (size3 >= 0) {
                            String str2 = sharedElementTargetNames2.get(size3);
                            View view8 = l01Var3.get(str2);
                            if (view8 == null) {
                                String strM2836q2 = C0429l.m2836q(l01Var, str2);
                                if (strM2836q2 != null) {
                                    l01Var.remove(strM2836q2);
                                }
                                i2 = size3;
                            } else {
                                i2 = size3;
                                if (!str2.equals(kkl0.m150120F(view8)) && (strM2836q = C0429l.m2836q(l01Var, str2)) != null) {
                                    l01Var.put(strM2836q, kkl0.m150120F(view8));
                                }
                            }
                            size3 = i2 - 1;
                        }
                    } else {
                        C0429l.m2844y(l01Var, l01Var3);
                    }
                    c0419b.m2723v(l01Var2, l01Var.keySet());
                    c0419b.m2723v(l01Var3, l01Var.values());
                    if (l01Var.isEmpty()) {
                        arrayList5.clear();
                        arrayList6.clear();
                        view5 = view5;
                        rect = rect2;
                        arrayList4 = arrayList5;
                        l01Var = l01Var;
                        arrayList6 = arrayList6;
                        obj2 = null;
                    } else {
                        C0429l.m2825f(operation2.m2687f(), operation.m2687f(), z, l01Var2, true);
                        view3 = view6;
                        c0419b = this;
                        eq50.m121892a(m2678m(), c0419b.new g(operation2, operation, z, l01Var3));
                        Iterator<View> it = l01Var2.values().iterator();
                        while (it.hasNext()) {
                            c0419b.m2721t(arrayList5, it.next());
                        }
                        if (!sharedElementSourceNames.isEmpty()) {
                            View view9 = l01Var2.get(sharedElementSourceNames.get(0));
                            v5jVar.mo194603v(obj4, view9);
                            view3 = view9;
                        }
                        Iterator<View> it2 = l01Var3.values().iterator();
                        while (it2.hasNext()) {
                            c0419b.m2721t(arrayList6, it2.next());
                        }
                        if (!sharedElementTargetNames2.isEmpty() && (view4 = l01Var3.get(sharedElementTargetNames2.get(0))) != null) {
                            eq50.m121892a(c0419b.m2678m(), c0419b.new h(v5jVar, view4, rect2));
                            z2 = true;
                        }
                        v5jVar.mo194605z(obj4, view5, arrayList5);
                        rect = rect2;
                        v5jVar.mo194601t(obj4, null, null, null, null, obj4, arrayList6);
                        Boolean bool = Boolean.TRUE;
                        map.put(operation, bool);
                        map.put(operation2, bool);
                        arrayList4 = arrayList5;
                        obj2 = obj4;
                    }
                    arrayList6 = arrayList6;
                    arrayList5 = arrayList4;
                    l01Var = l01Var;
                    view5 = view5;
                    rect2 = rect;
                }
                view6 = view3;
                arrayList6 = arrayList6;
                arrayList5 = arrayList4;
                l01Var = l01Var;
                view5 = view5;
                rect2 = rect;
            }
            SpecialEffectsController.Operation operation4 = operation;
            SpecialEffectsController.Operation operation5 = operation2;
            View view10 = view5;
            Rect rect3 = rect2;
            ArrayList<View> arrayList7 = arrayList5;
            l01 l01Var4 = l01Var;
            View view11 = view6;
            ArrayList<View> arrayList8 = arrayList6;
            boolean z3 = false;
            ArrayList arrayList9 = new ArrayList();
            Object obj5 = null;
            Object obj6 = null;
            for (m mVar4 : list) {
                if (mVar4.m2730d()) {
                    map.put(mVar4.m2728b(), Boolean.FALSE);
                    mVar4.m2727a();
                } else {
                    Object objMo194595g = v5jVar.mo194595g(mVar4.m2734h());
                    SpecialEffectsController.Operation operationM2728b = mVar4.m2728b();
                    boolean z4 = (obj2 == null || !(operationM2728b == operation4 || operationM2728b == operation5)) ? z3 : true;
                    if (objMo194595g == null) {
                        if (!z4) {
                            map.put(operationM2728b, Boolean.FALSE);
                            mVar4.m2727a();
                        }
                        view = view10;
                        arrayList = arrayList7;
                        arrayList3 = arrayList9;
                        view2 = view11;
                        arrayList2 = arrayList8;
                    } else {
                        ArrayList arrayList10 = arrayList9;
                        ArrayList<View> arrayList11 = new ArrayList<>();
                        c0419b.m2721t(arrayList11, operationM2728b.m2687f().mView);
                        if (z4) {
                            if (operationM2728b == operation4) {
                                arrayList11.removeAll(arrayList7);
                            } else {
                                arrayList11.removeAll(arrayList8);
                            }
                        }
                        if (arrayList11.isEmpty()) {
                            v5jVar.mo194591a(objMo194595g, view10);
                            view = view10;
                            arrayList = arrayList7;
                            objMo194597n = obj5;
                            objMo194597n2 = obj6;
                            operation3 = operationM2728b;
                            view2 = view11;
                            arrayList3 = arrayList10;
                            arrayList2 = arrayList8;
                            obj = objMo194595g;
                        } else {
                            v5jVar.mo194592b(objMo194595g, arrayList11);
                            ArrayList<View> arrayList12 = arrayList8;
                            obj = objMo194595g;
                            arrayList = arrayList7;
                            operation3 = operationM2728b;
                            objMo194597n = obj5;
                            objMo194597n2 = obj6;
                            view = view10;
                            view2 = view11;
                            arrayList2 = arrayList12;
                            arrayList3 = arrayList10;
                            v5jVar.mo194601t(obj, obj, arrayList11, null, null, null, null);
                            if (operation3.m2686e() == SpecialEffectsController.Operation.State.GONE) {
                                v5jVar.mo194600r(obj, operation3.m2687f().mView, arrayList11);
                                eq50.m121892a(c0419b.m2678m(), c0419b.new i(arrayList11));
                            }
                        }
                        if (operation3.m2686e() == SpecialEffectsController.Operation.State.VISIBLE) {
                            arrayList3.addAll(arrayList11);
                            if (z2) {
                                v5jVar.mo194602u(obj, rect3);
                            }
                        } else {
                            v5jVar.mo194603v(obj, view2);
                        }
                        map.put(operation3, Boolean.TRUE);
                        if (mVar4.m2736j()) {
                            objMo194597n = v5jVar.mo194597n(objMo194597n, obj, null);
                        } else {
                            objMo194597n2 = v5jVar.mo194597n(objMo194597n2, obj, null);
                        }
                        obj5 = objMo194597n;
                        obj6 = objMo194597n2;
                    }
                    operation4 = operation;
                    operation5 = operation2;
                    arrayList9 = arrayList3;
                    arrayList8 = arrayList2;
                    arrayList7 = arrayList;
                    z3 = false;
                    view11 = view2;
                    view10 = view;
                }
            }
            ArrayList<View> arrayList13 = arrayList8;
            ArrayList<View> arrayList14 = arrayList7;
            ArrayList arrayList15 = arrayList9;
            Object objMo194596m = v5jVar.mo194596m(obj5, obj6, obj2);
            for (m mVar5 : list) {
                if (!mVar5.m2730d()) {
                    Object objM2734h2 = mVar5.m2734h();
                    SpecialEffectsController.Operation operationM2728b2 = mVar5.m2728b();
                    boolean z5 = obj2 != null && (operationM2728b2 == operation || operationM2728b2 == operation2);
                    if (objM2734h2 != null || z5) {
                        if (kkl0.m150134P(c0419b.m2678m())) {
                            v5jVar.mo194604w(mVar5.m2728b().m2687f(), objMo194596m, mVar5.m2729c(), c0419b.new j(mVar5));
                        } else {
                            if (FragmentManager.m2481G0(2)) {
                                Objects.toString(c0419b.m2678m());
                                Objects.toString(operationM2728b2);
                            }
                            mVar5.m2727a();
                        }
                    }
                }
            }
            if (kkl0.m150134P(c0419b.m2678m())) {
                C0429l.m2818B(arrayList15, 4);
                ArrayList<String> arrayListM199884o = v5jVar.m199884o(arrayList13);
                v5jVar.mo194593c(c0419b.m2678m(), objMo194596m);
                v5jVar.m199887y(c0419b.m2678m(), arrayList14, arrayList13, arrayListM199884o, l01Var4);
                C0429l.m2818B(arrayList15, 0);
                v5jVar.mo194589A(obj2, arrayList14, arrayList13);
                return map;
            }
        }
        return map;
    }
}
