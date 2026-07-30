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
import p149l.a3j;
import p149l.cve0;
import p149l.e01;
import p149l.gbl0;
import p149l.gf4;
import p149l.ljc0;
import p149l.tf80;
import p149l.vbl0;
import p149l.yh50;

/* JADX INFO: renamed from: androidx.fragment.app.b */
/* JADX INFO: loaded from: classes.dex */
public class C0418b extends SpecialEffectsController {

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
                C0418b.this.m2719s(this.f2000b);
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
                this.f2005d.m2685e().applyState(this.f2003b);
            }
            this.f2006e.m2726a();
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.b$d */
    public class d implements gf4.InterfaceC17068a {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Animator f2008a;

        public d(Animator animator) {
            this.f2008a = animator;
        }

        @Override // p149l.gf4.InterfaceC17068a
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
                e.this.f2012c.m2726a();
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
    public class f implements gf4.InterfaceC17068a {

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

        @Override // p149l.gf4.InterfaceC17068a
        public void onCancel() {
            this.f2015a.clearAnimation();
            this.f2016b.endViewTransition(this.f2015a);
            this.f2017c.m2726a();
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
        public final /* synthetic */ e01 f2022d;

        public g(SpecialEffectsController.Operation operation, SpecialEffectsController.Operation operation2, boolean z, e01 e01Var) {
            this.f2019a = operation;
            this.f2020b = operation2;
            this.f2021c = z;
            this.f2022d = e01Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            C0428l.m2824f(this.f2019a.m2686f(), this.f2020b.m2686f(), this.f2021c, this.f2022d, false);
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.b$h */
    public class h implements Runnable {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ a3j f2024a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ View f2025b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Rect f2026c;

        public h(a3j a3jVar, View view, Rect rect) {
            this.f2024a = a3jVar;
            this.f2025b = view;
            this.f2026c = rect;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f2024a.m94705k(this.f2025b, this.f2026c);
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
            C0428l.m2817B(this.f2028a, 4);
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
            this.f2030a.m2726a();
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.b$k */
    public static class k extends l {

        /* JADX INFO: renamed from: c */
        public boolean f2032c;

        /* JADX INFO: renamed from: d */
        @Nullable
        public C0420d.d f2033d;

        public k(@NonNull SpecialEffectsController.Operation operation, @NonNull gf4 gf4Var) {
            super(operation, gf4Var);
            this.f2032c = false;
        }

        @Nullable
        /* JADX INFO: renamed from: e */
        public C0420d.d m2725e(@NonNull Context context) {
            if (this.f2032c) {
                return this.f2033d;
            }
            C0420d.d dVarM2738b = C0420d.m2738b(context, m2727b().m2686f(), m2727b().m2685e() == SpecialEffectsController.Operation.State.VISIBLE);
            this.f2033d = dVarM2738b;
            this.f2032c = true;
            return dVarM2738b;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.b$l */
    public static class l {

        /* JADX INFO: renamed from: a */
        @NonNull
        public final SpecialEffectsController.Operation f2034a;

        /* JADX INFO: renamed from: b */
        @NonNull
        public final gf4 f2035b;

        public l(@NonNull SpecialEffectsController.Operation operation, @NonNull gf4 gf4Var) {
            this.f2034a = operation;
            this.f2035b = gf4Var;
        }

        /* JADX INFO: renamed from: a */
        public void m2726a() {
            this.f2034a.m2684d(this.f2035b);
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public SpecialEffectsController.Operation m2727b() {
            return this.f2034a;
        }

        @NonNull
        /* JADX INFO: renamed from: c */
        public gf4 m2728c() {
            return this.f2035b;
        }

        /* JADX INFO: renamed from: d */
        public boolean m2729d() {
            SpecialEffectsController.Operation.State stateFrom = SpecialEffectsController.Operation.State.from(this.f2034a.m2686f().mView);
            SpecialEffectsController.Operation.State stateM2685e = this.f2034a.m2685e();
            if (stateFrom == stateM2685e) {
                return true;
            }
            SpecialEffectsController.Operation.State state = SpecialEffectsController.Operation.State.VISIBLE;
            return (stateFrom == state || stateM2685e == state) ? false : true;
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

        public m(@NonNull SpecialEffectsController.Operation operation, @NonNull gf4 gf4Var, boolean z, boolean z2) {
            super(operation, gf4Var);
            if (operation.m2685e() == SpecialEffectsController.Operation.State.VISIBLE) {
                this.f2036c = z ? operation.m2686f().getReenterTransition() : operation.m2686f().getEnterTransition();
                this.f2037d = z ? operation.m2686f().getAllowReturnTransitionOverlap() : operation.m2686f().getAllowEnterTransitionOverlap();
            } else {
                this.f2036c = z ? operation.m2686f().getReturnTransition() : operation.m2686f().getExitTransition();
                this.f2037d = true;
            }
            if (!z2) {
                this.f2038e = null;
            } else if (z) {
                this.f2038e = operation.m2686f().getSharedElementReturnTransition();
            } else {
                this.f2038e = operation.m2686f().getSharedElementEnterTransition();
            }
        }

        @Nullable
        /* JADX INFO: renamed from: e */
        public a3j m2730e() {
            a3j a3jVarM2731f = m2731f(this.f2036c);
            a3j a3jVarM2731f2 = m2731f(this.f2038e);
            if (a3jVarM2731f == null || a3jVarM2731f2 == null || a3jVarM2731f == a3jVarM2731f2) {
                return a3jVarM2731f != null ? a3jVarM2731f : a3jVarM2731f2;
            }
            StringBuilder sb = new StringBuilder("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
            sb.append(m2727b().m2686f());
            sb.append(" returned Transition ");
            sb.append(this.f2036c);
            ljc0.m149958a(sb, " which uses a different Transition  type than its shared element transition ", this.f2038e);
            return null;
        }

        @Nullable
        /* JADX INFO: renamed from: f */
        public final a3j m2731f(Object obj) {
            if (obj == null) {
                return null;
            }
            a3j a3jVar = C0428l.f2110b;
            if (a3jVar != null && a3jVar.mo94701e(obj)) {
                return a3jVar;
            }
            a3j a3jVar2 = C0428l.f2111c;
            if (a3jVar2 != null && a3jVar2.mo94701e(obj)) {
                return a3jVar2;
            }
            StringBuilder sb = new StringBuilder("Transition ");
            sb.append(obj);
            Fragment fragmentM2686f = m2727b().m2686f();
            sb.append(" for fragment ");
            sb.append(fragmentM2686f);
            sb.append(" is not a valid framework Transition or AndroidX Transition");
            throw new IllegalArgumentException(sb.toString());
        }

        @Nullable
        /* JADX INFO: renamed from: g */
        public Object m2732g() {
            return this.f2038e;
        }

        @Nullable
        /* JADX INFO: renamed from: h */
        public Object m2733h() {
            return this.f2036c;
        }

        /* JADX INFO: renamed from: i */
        public boolean m2734i() {
            return this.f2038e != null;
        }

        /* JADX INFO: renamed from: j */
        public boolean m2735j() {
            return this.f2037d;
        }
    }

    public C0418b(@NonNull ViewGroup viewGroup) {
        super(viewGroup);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0081  */
    @Override // androidx.fragment.app.SpecialEffectsController
    /* JADX INFO: renamed from: f */
    public void mo2670f(@NonNull List<SpecialEffectsController.Operation> list, boolean z) {
        SpecialEffectsController.Operation operation = null;
        SpecialEffectsController.Operation operation2 = null;
        for (SpecialEffectsController.Operation operation3 : list) {
            SpecialEffectsController.Operation.State stateFrom = SpecialEffectsController.Operation.State.from(operation3.m2686f().mView);
            int i2 = a.f1998a[operation3.m2685e().ordinal()];
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
            gf4 gf4Var = new gf4();
            operation4.m2690j(gf4Var);
            arrayList.add(new k(operation4, gf4Var));
            gf4 gf4Var2 = new gf4();
            operation4.m2690j(gf4Var2);
            boolean z2 = false;
            if (z) {
                if (operation4 == operation) {
                    z2 = true;
                }
            } else if (operation4 == operation2) {
                z2 = true;
            }
            arrayList2.add(new m(operation4, gf4Var2, z, z2));
            operation4.m2681a(new b(arrayList3, operation4));
        }
        Map<SpecialEffectsController.Operation, Boolean> mapM2724x = m2724x(arrayList2, z, operation, operation2);
        m2723w(arrayList, arrayList3, mapM2724x.containsValue(Boolean.TRUE), mapM2724x);
        Iterator<SpecialEffectsController.Operation> it = arrayList3.iterator();
        while (it.hasNext()) {
            m2719s(it.next());
        }
        arrayList3.clear();
    }

    /* JADX INFO: renamed from: s */
    public void m2719s(@NonNull SpecialEffectsController.Operation operation) {
        operation.m2685e().applyState(operation.m2686f().mView);
    }

    /* JADX INFO: renamed from: t */
    public void m2720t(ArrayList<View> arrayList, View view) {
        if (!(view instanceof ViewGroup)) {
            arrayList.add(view);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (vbl0.m197723b(viewGroup)) {
            arrayList.add(viewGroup);
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt.getVisibility() == 0) {
                m2720t(arrayList, childAt);
            }
        }
    }

    /* JADX INFO: renamed from: u */
    public void m2721u(Map<String, View> map, @NonNull View view) {
        String strM125157F = gbl0.m125157F(view);
        if (strM125157F != null) {
            map.put(strM125157F, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt.getVisibility() == 0) {
                    m2721u(map, childAt);
                }
            }
        }
    }

    /* JADX INFO: renamed from: v */
    public void m2722v(@NonNull e01<String, View> e01Var, @NonNull Collection<String> collection) {
        Iterator<Map.Entry<String, View>> it = e01Var.entrySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(gbl0.m125157F(it.next().getValue()))) {
                it.remove();
            }
        }
    }

    /* JADX INFO: renamed from: w */
    public final void m2723w(@NonNull List<k> list, @NonNull List<SpecialEffectsController.Operation> list2, boolean z, @NonNull Map<SpecialEffectsController.Operation, Boolean> map) {
        ViewGroup viewGroupM2677m = m2677m();
        Context context = viewGroupM2677m.getContext();
        ArrayList<k> arrayList = new ArrayList();
        boolean z2 = false;
        for (k kVar : list) {
            if (kVar.m2729d()) {
                kVar.m2726a();
            } else {
                C0420d.d dVarM2725e = kVar.m2725e(context);
                if (dVarM2725e == null) {
                    kVar.m2726a();
                } else {
                    Animator animator = dVarM2725e.f2051b;
                    if (animator == null) {
                        arrayList.add(kVar);
                    } else {
                        SpecialEffectsController.Operation operationM2727b = kVar.m2727b();
                        Fragment fragmentM2686f = operationM2727b.m2686f();
                        if (Boolean.TRUE.equals(map.get(operationM2727b))) {
                            if (FragmentManager.m2480G0(2)) {
                                Objects.toString(fragmentM2686f);
                            }
                            kVar.m2726a();
                        } else {
                            boolean z3 = operationM2727b.m2685e() == SpecialEffectsController.Operation.State.GONE;
                            if (z3) {
                                list2.remove(operationM2727b);
                            }
                            View view = fragmentM2686f.mView;
                            viewGroupM2677m.startViewTransition(view);
                            animator.addListener(new c(viewGroupM2677m, view, z3, operationM2727b, kVar));
                            animator.setTarget(view);
                            animator.start();
                            kVar.m2728c().m125876d(new d(animator));
                            z2 = true;
                        }
                    }
                }
            }
        }
        for (k kVar2 : arrayList) {
            SpecialEffectsController.Operation operationM2727b2 = kVar2.m2727b();
            Fragment fragmentM2686f2 = operationM2727b2.m2686f();
            if (z) {
                if (FragmentManager.m2480G0(2)) {
                    Objects.toString(fragmentM2686f2);
                }
                kVar2.m2726a();
            } else if (z2) {
                if (FragmentManager.m2480G0(2)) {
                    Objects.toString(fragmentM2686f2);
                }
                kVar2.m2726a();
            } else {
                View view2 = fragmentM2686f2.mView;
                Animation animation = (Animation) tf80.m188658e(((C0420d.d) tf80.m188658e(kVar2.m2725e(context))).f2050a);
                if (operationM2727b2.m2685e() != SpecialEffectsController.Operation.State.REMOVED) {
                    view2.startAnimation(animation);
                    kVar2.m2726a();
                } else {
                    viewGroupM2677m.startViewTransition(view2);
                    C0420d.e eVar = new C0420d.e(animation, viewGroupM2677m, view2);
                    eVar.setAnimationListener(new e(viewGroupM2677m, view2, kVar2));
                    view2.startAnimation(eVar);
                }
                kVar2.m2728c().m125876d(new f(view2, viewGroupM2677m, kVar2));
            }
        }
    }

    @NonNull
    /* JADX INFO: renamed from: x */
    public final Map<SpecialEffectsController.Operation, Boolean> m2724x(@NonNull List<m> list, boolean z, @Nullable SpecialEffectsController.Operation operation, @Nullable SpecialEffectsController.Operation operation2) {
        Object obj;
        ArrayList<View> arrayList;
        SpecialEffectsController.Operation operation3;
        Object objMo94707n;
        Object objMo94707n2;
        View view;
        View view2;
        ArrayList<View> arrayList2;
        ArrayList arrayList3;
        Rect rect;
        ArrayList<View> arrayList4;
        View view3;
        cve0 enterTransitionCallback;
        cve0 exitTransitionCallback;
        View view4;
        int i2;
        String strM2835q;
        int i3;
        C0418b c0418b = this;
        HashMap map = new HashMap();
        a3j a3jVar = null;
        for (m mVar : list) {
            if (!mVar.m2729d()) {
                a3j a3jVarM2730e = mVar.m2730e();
                if (a3jVar == null) {
                    a3jVar = a3jVarM2730e;
                } else if (a3jVarM2730e != null && a3jVar != a3jVarM2730e) {
                    StringBuilder sb = new StringBuilder("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
                    sb.append(mVar.m2727b().m2686f());
                    Object objM2733h = mVar.m2733h();
                    sb.append(" returned Transition ");
                    sb.append(objM2733h);
                    sb.append(" which uses a different Transition  type than other Fragments.");
                    throw new IllegalArgumentException(sb.toString());
                }
            }
        }
        if (a3jVar == null) {
            for (m mVar2 : list) {
                map.put(mVar2.m2727b(), Boolean.FALSE);
                mVar2.m2726a();
            }
        } else {
            View view5 = new View(c0418b.m2677m().getContext());
            Rect rect2 = new Rect();
            ArrayList<View> arrayList5 = new ArrayList<>();
            ArrayList<View> arrayList6 = new ArrayList<>();
            e01 e01Var = new e01();
            Object obj2 = null;
            View view6 = null;
            boolean z2 = false;
            for (m mVar3 : list) {
                if (!mVar3.m2734i() || operation == null || operation2 == null) {
                    rect = rect2;
                    arrayList4 = arrayList5;
                    view3 = view6;
                } else {
                    Object objMo94697B = a3jVar.mo94697B(a3jVar.mo94703g(mVar3.m2732g()));
                    ArrayList<String> sharedElementSourceNames = operation2.m2686f().getSharedElementSourceNames();
                    ArrayList<String> sharedElementSourceNames2 = operation.m2686f().getSharedElementSourceNames();
                    ArrayList<String> sharedElementTargetNames = operation.m2686f().getSharedElementTargetNames();
                    int i4 = 0;
                    while (i4 < sharedElementTargetNames.size()) {
                        int iIndexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i4));
                        Object obj3 = objMo94697B;
                        if (iIndexOf != -1) {
                            sharedElementSourceNames.set(iIndexOf, sharedElementSourceNames2.get(i4));
                        }
                        i4++;
                        objMo94697B = obj3;
                    }
                    Object obj4 = objMo94697B;
                    ArrayList<String> sharedElementTargetNames2 = operation2.m2686f().getSharedElementTargetNames();
                    if (z == 0) {
                        enterTransitionCallback = operation.m2686f().getExitTransitionCallback();
                        exitTransitionCallback = operation2.m2686f().getEnterTransitionCallback();
                    } else {
                        enterTransitionCallback = operation.m2686f().getEnterTransitionCallback();
                        exitTransitionCallback = operation2.m2686f().getExitTransitionCallback();
                    }
                    int i5 = 0;
                    for (int size = sharedElementSourceNames.size(); i5 < size; size = size) {
                        e01Var.put(sharedElementSourceNames.get(i5), sharedElementTargetNames2.get(i5));
                        i5++;
                    }
                    e01<String, View> e01Var2 = new e01<>();
                    c0418b.m2721u(e01Var2, operation.m2686f().mView);
                    e01Var2.m114143o(sharedElementSourceNames);
                    if (enterTransitionCallback != null) {
                        enterTransitionCallback.m108856d(sharedElementSourceNames, e01Var2);
                        int size2 = sharedElementSourceNames.size() - 1;
                        while (size2 >= 0) {
                            String str = sharedElementSourceNames.get(size2);
                            View view7 = e01Var2.get(str);
                            if (view7 == null) {
                                e01Var.remove(str);
                                i3 = size2;
                            } else {
                                i3 = size2;
                                if (!str.equals(gbl0.m125157F(view7))) {
                                    e01Var.put(gbl0.m125157F(view7), (String) e01Var.remove(str));
                                }
                            }
                            size2 = i3 - 1;
                        }
                    } else {
                        e01Var.m114143o(e01Var2.keySet());
                    }
                    e01<String, View> e01Var3 = new e01<>();
                    c0418b.m2721u(e01Var3, operation2.m2686f().mView);
                    e01Var3.m114143o(sharedElementTargetNames2);
                    e01Var3.m114143o(e01Var.values());
                    if (exitTransitionCallback != null) {
                        exitTransitionCallback.m108856d(sharedElementTargetNames2, e01Var3);
                        int size3 = sharedElementTargetNames2.size() - 1;
                        while (size3 >= 0) {
                            String str2 = sharedElementTargetNames2.get(size3);
                            View view8 = e01Var3.get(str2);
                            if (view8 == null) {
                                String strM2835q2 = C0428l.m2835q(e01Var, str2);
                                if (strM2835q2 != null) {
                                    e01Var.remove(strM2835q2);
                                }
                                i2 = size3;
                            } else {
                                i2 = size3;
                                if (!str2.equals(gbl0.m125157F(view8)) && (strM2835q = C0428l.m2835q(e01Var, str2)) != null) {
                                    e01Var.put(strM2835q, gbl0.m125157F(view8));
                                }
                            }
                            size3 = i2 - 1;
                        }
                    } else {
                        C0428l.m2843y(e01Var, e01Var3);
                    }
                    c0418b.m2722v(e01Var2, e01Var.keySet());
                    c0418b.m2722v(e01Var3, e01Var.values());
                    if (e01Var.isEmpty()) {
                        arrayList5.clear();
                        arrayList6.clear();
                        view5 = view5;
                        rect = rect2;
                        arrayList4 = arrayList5;
                        e01Var = e01Var;
                        arrayList6 = arrayList6;
                        obj2 = null;
                    } else {
                        C0428l.m2824f(operation2.m2686f(), operation.m2686f(), z, e01Var2, true);
                        view3 = view6;
                        c0418b = this;
                        yh50.m214787a(m2677m(), c0418b.new g(operation2, operation, z, e01Var3));
                        Iterator<View> it = e01Var2.values().iterator();
                        while (it.hasNext()) {
                            c0418b.m2720t(arrayList5, it.next());
                        }
                        if (!sharedElementSourceNames.isEmpty()) {
                            View view9 = e01Var2.get(sharedElementSourceNames.get(0));
                            a3jVar.mo94715v(obj4, view9);
                            view3 = view9;
                        }
                        Iterator<View> it2 = e01Var3.values().iterator();
                        while (it2.hasNext()) {
                            c0418b.m2720t(arrayList6, it2.next());
                        }
                        if (!sharedElementTargetNames2.isEmpty() && (view4 = e01Var3.get(sharedElementTargetNames2.get(0))) != null) {
                            yh50.m214787a(c0418b.m2677m(), c0418b.new h(a3jVar, view4, rect2));
                            z2 = true;
                        }
                        a3jVar.mo94719z(obj4, view5, arrayList5);
                        rect = rect2;
                        a3jVar.mo94713t(obj4, null, null, null, null, obj4, arrayList6);
                        Boolean bool = Boolean.TRUE;
                        map.put(operation, bool);
                        map.put(operation2, bool);
                        arrayList4 = arrayList5;
                        obj2 = obj4;
                    }
                    arrayList6 = arrayList6;
                    arrayList5 = arrayList4;
                    e01Var = e01Var;
                    view5 = view5;
                    rect2 = rect;
                }
                view6 = view3;
                arrayList6 = arrayList6;
                arrayList5 = arrayList4;
                e01Var = e01Var;
                view5 = view5;
                rect2 = rect;
            }
            SpecialEffectsController.Operation operation4 = operation;
            SpecialEffectsController.Operation operation5 = operation2;
            View view10 = view5;
            Rect rect3 = rect2;
            ArrayList<View> arrayList7 = arrayList5;
            e01 e01Var4 = e01Var;
            View view11 = view6;
            ArrayList<View> arrayList8 = arrayList6;
            boolean z3 = false;
            ArrayList arrayList9 = new ArrayList();
            Object obj5 = null;
            Object obj6 = null;
            for (m mVar4 : list) {
                if (mVar4.m2729d()) {
                    map.put(mVar4.m2727b(), Boolean.FALSE);
                    mVar4.m2726a();
                } else {
                    Object objMo94703g = a3jVar.mo94703g(mVar4.m2733h());
                    SpecialEffectsController.Operation operationM2727b = mVar4.m2727b();
                    boolean z4 = (obj2 == null || !(operationM2727b == operation4 || operationM2727b == operation5)) ? z3 : true;
                    if (objMo94703g == null) {
                        if (!z4) {
                            map.put(operationM2727b, Boolean.FALSE);
                            mVar4.m2726a();
                        }
                        view = view10;
                        arrayList = arrayList7;
                        arrayList3 = arrayList9;
                        view2 = view11;
                        arrayList2 = arrayList8;
                    } else {
                        ArrayList arrayList10 = arrayList9;
                        ArrayList<View> arrayList11 = new ArrayList<>();
                        c0418b.m2720t(arrayList11, operationM2727b.m2686f().mView);
                        if (z4) {
                            if (operationM2727b == operation4) {
                                arrayList11.removeAll(arrayList7);
                            } else {
                                arrayList11.removeAll(arrayList8);
                            }
                        }
                        if (arrayList11.isEmpty()) {
                            a3jVar.mo94698a(objMo94703g, view10);
                            view = view10;
                            arrayList = arrayList7;
                            objMo94707n = obj5;
                            objMo94707n2 = obj6;
                            operation3 = operationM2727b;
                            view2 = view11;
                            arrayList3 = arrayList10;
                            arrayList2 = arrayList8;
                            obj = objMo94703g;
                        } else {
                            a3jVar.mo94699b(objMo94703g, arrayList11);
                            ArrayList<View> arrayList12 = arrayList8;
                            obj = objMo94703g;
                            arrayList = arrayList7;
                            operation3 = operationM2727b;
                            objMo94707n = obj5;
                            objMo94707n2 = obj6;
                            view = view10;
                            view2 = view11;
                            arrayList2 = arrayList12;
                            arrayList3 = arrayList10;
                            a3jVar.mo94713t(obj, obj, arrayList11, null, null, null, null);
                            if (operation3.m2685e() == SpecialEffectsController.Operation.State.GONE) {
                                a3jVar.mo94711r(obj, operation3.m2686f().mView, arrayList11);
                                yh50.m214787a(c0418b.m2677m(), c0418b.new i(arrayList11));
                            }
                        }
                        if (operation3.m2685e() == SpecialEffectsController.Operation.State.VISIBLE) {
                            arrayList3.addAll(arrayList11);
                            if (z2) {
                                a3jVar.mo94714u(obj, rect3);
                            }
                        } else {
                            a3jVar.mo94715v(obj, view2);
                        }
                        map.put(operation3, Boolean.TRUE);
                        if (mVar4.m2735j()) {
                            objMo94707n = a3jVar.mo94707n(objMo94707n, obj, null);
                        } else {
                            objMo94707n2 = a3jVar.mo94707n(objMo94707n2, obj, null);
                        }
                        obj5 = objMo94707n;
                        obj6 = objMo94707n2;
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
            Object objMo94706m = a3jVar.mo94706m(obj5, obj6, obj2);
            for (m mVar5 : list) {
                if (!mVar5.m2729d()) {
                    Object objM2733h2 = mVar5.m2733h();
                    SpecialEffectsController.Operation operationM2727b2 = mVar5.m2727b();
                    boolean z5 = obj2 != null && (operationM2727b2 == operation || operationM2727b2 == operation2);
                    if (objM2733h2 != null || z5) {
                        if (gbl0.m125171P(c0418b.m2677m())) {
                            a3jVar.mo94716w(mVar5.m2727b().m2686f(), objMo94706m, mVar5.m2728c(), c0418b.new j(mVar5));
                        } else {
                            if (FragmentManager.m2480G0(2)) {
                                Objects.toString(c0418b.m2677m());
                                Objects.toString(operationM2727b2);
                            }
                            mVar5.m2726a();
                        }
                    }
                }
            }
            if (gbl0.m125171P(c0418b.m2677m())) {
                C0428l.m2817B(arrayList15, 4);
                ArrayList<String> arrayListM94708o = a3jVar.m94708o(arrayList13);
                a3jVar.mo94700c(c0418b.m2677m(), objMo94706m);
                a3jVar.m94718y(c0418b.m2677m(), arrayList14, arrayList13, arrayListM94708o, e01Var4);
                C0428l.m2817B(arrayList15, 0);
                a3jVar.mo94696A(obj2, arrayList14, arrayList13);
                return map;
            }
        }
        return map;
    }
}
