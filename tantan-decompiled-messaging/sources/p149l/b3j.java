package p149l;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"RestrictedApi"})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class b3j extends a3j {

    /* JADX INFO: renamed from: l.b3j$a */
    public class C15789a extends u7j0.AbstractC20374f {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Rect f73224a;

        public C15789a(Rect rect) {
            this.f73224a = rect;
        }

        @Override // p149l.u7j0.AbstractC20374f
        /* JADX INFO: renamed from: a */
        public Rect mo100096a(@NonNull u7j0 u7j0Var) {
            return this.f73224a;
        }
    }

    /* JADX INFO: renamed from: l.b3j$c */
    public class C15791c extends u8j0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object f73229a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ArrayList f73230b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Object f73231c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ ArrayList f73232d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ Object f73233e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ ArrayList f73234f;

        public C15791c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f73229a = obj;
            this.f73230b = arrayList;
            this.f73231c = obj2;
            this.f73232d = arrayList2;
            this.f73233e = obj3;
            this.f73234f = arrayList3;
        }

        @Override // p149l.u8j0, p149l.u7j0.InterfaceC20375g
        /* JADX INFO: renamed from: a */
        public void mo95446a(@NonNull u7j0 u7j0Var) {
            Object obj = this.f73229a;
            if (obj != null) {
                b3j.this.mo94710q(obj, this.f73230b, null);
            }
            Object obj2 = this.f73231c;
            if (obj2 != null) {
                b3j.this.mo94710q(obj2, this.f73232d, null);
            }
            Object obj3 = this.f73233e;
            if (obj3 != null) {
                b3j.this.mo94710q(obj3, this.f73234f, null);
            }
        }

        @Override // p149l.u8j0, p149l.u7j0.InterfaceC20375g
        /* JADX INFO: renamed from: c */
        public void mo95445c(@NonNull u7j0 u7j0Var) {
            u7j0Var.removeListener(this);
        }
    }

    /* JADX INFO: renamed from: l.b3j$d */
    public class C15792d extends u7j0.AbstractC20374f {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Rect f73236a;

        public C15792d(Rect rect) {
            this.f73236a = rect;
        }

        @Override // p149l.u7j0.AbstractC20374f
        /* JADX INFO: renamed from: a */
        public Rect mo100096a(@NonNull u7j0 u7j0Var) {
            Rect rect = this.f73236a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f73236a;
        }
    }

    /* JADX INFO: renamed from: C */
    public static boolean m100095C(u7j0 u7j0Var) {
        return (a3j.m94695l(u7j0Var.getTargetIds()) && a3j.m94695l(u7j0Var.getTargetNames()) && a3j.m94695l(u7j0Var.getTargetTypes())) ? false : true;
    }

    @Override // p149l.a3j
    /* JADX INFO: renamed from: A */
    public void mo94696A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        a9j0 a9j0Var = (a9j0) obj;
        if (a9j0Var != null) {
            a9j0Var.getTargets().clear();
            a9j0Var.getTargets().addAll(arrayList2);
            mo94710q(a9j0Var, arrayList, arrayList2);
        }
    }

    @Override // p149l.a3j
    /* JADX INFO: renamed from: B */
    public Object mo94697B(Object obj) {
        if (obj == null) {
            return null;
        }
        a9j0 a9j0Var = new a9j0();
        a9j0Var.m95430f((u7j0) obj);
        return a9j0Var;
    }

    @Override // p149l.a3j
    /* JADX INFO: renamed from: a */
    public void mo94698a(Object obj, View view) {
        if (obj != null) {
            ((u7j0) obj).addTarget(view);
        }
    }

    @Override // p149l.a3j
    /* JADX INFO: renamed from: b */
    public void mo94699b(Object obj, ArrayList<View> arrayList) {
        u7j0 u7j0Var = (u7j0) obj;
        if (u7j0Var == null) {
            return;
        }
        int i = 0;
        if (u7j0Var instanceof a9j0) {
            a9j0 a9j0Var = (a9j0) u7j0Var;
            int iM95433l = a9j0Var.m95433l();
            while (i < iM95433l) {
                mo94699b(a9j0Var.m95432k(i), arrayList);
                i++;
            }
            return;
        }
        if (m100095C(u7j0Var) || !a3j.m94695l(u7j0Var.getTargets())) {
            return;
        }
        int size = arrayList.size();
        while (i < size) {
            u7j0Var.addTarget(arrayList.get(i));
            i++;
        }
    }

    @Override // p149l.a3j
    /* JADX INFO: renamed from: c */
    public void mo94700c(ViewGroup viewGroup, Object obj) {
        v8j0.m197458a(viewGroup, (u7j0) obj);
    }

    @Override // p149l.a3j
    /* JADX INFO: renamed from: e */
    public boolean mo94701e(Object obj) {
        return obj instanceof u7j0;
    }

    @Override // p149l.a3j
    /* JADX INFO: renamed from: g */
    public Object mo94703g(Object obj) {
        if (obj != null) {
            return ((u7j0) obj).clone();
        }
        return null;
    }

    @Override // p149l.a3j
    /* JADX INFO: renamed from: m */
    public Object mo94706m(Object obj, Object obj2, Object obj3) {
        u7j0 u7j0VarM95441t = (u7j0) obj;
        u7j0 u7j0Var = (u7j0) obj2;
        u7j0 u7j0Var2 = (u7j0) obj3;
        if (u7j0VarM95441t != null && u7j0Var != null) {
            u7j0VarM95441t = new a9j0().m95430f(u7j0VarM95441t).m95430f(u7j0Var).m95441t(1);
        } else if (u7j0VarM95441t == null) {
            u7j0VarM95441t = u7j0Var != null ? u7j0Var : null;
        }
        if (u7j0Var2 == null) {
            return u7j0VarM95441t;
        }
        a9j0 a9j0Var = new a9j0();
        if (u7j0VarM95441t != null) {
            a9j0Var.m95430f(u7j0VarM95441t);
        }
        a9j0Var.m95430f(u7j0Var2);
        return a9j0Var;
    }

    @Override // p149l.a3j
    /* JADX INFO: renamed from: n */
    public Object mo94707n(Object obj, Object obj2, Object obj3) {
        a9j0 a9j0Var = new a9j0();
        if (obj != null) {
            a9j0Var.m95430f((u7j0) obj);
        }
        if (obj2 != null) {
            a9j0Var.m95430f((u7j0) obj2);
        }
        if (obj3 != null) {
            a9j0Var.m95430f((u7j0) obj3);
        }
        return a9j0Var;
    }

    @Override // p149l.a3j
    /* JADX INFO: renamed from: p */
    public void mo94709p(Object obj, View view) {
        if (obj != null) {
            ((u7j0) obj).removeTarget(view);
        }
    }

    @Override // p149l.a3j
    /* JADX INFO: renamed from: q */
    public void mo94710q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        u7j0 u7j0Var = (u7j0) obj;
        int i = 0;
        if (u7j0Var instanceof a9j0) {
            a9j0 a9j0Var = (a9j0) u7j0Var;
            int iM95433l = a9j0Var.m95433l();
            while (i < iM95433l) {
                mo94710q(a9j0Var.m95432k(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (m100095C(u7j0Var)) {
            return;
        }
        List<View> targets = u7j0Var.getTargets();
        if (targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i < size) {
                u7j0Var.addTarget(arrayList2.get(i));
                i++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                u7j0Var.removeTarget(arrayList.get(size2));
            }
        }
    }

    @Override // p149l.a3j
    /* JADX INFO: renamed from: r */
    public void mo94711r(Object obj, View view, ArrayList<View> arrayList) {
        ((u7j0) obj).addListener(new C15790b(view, arrayList));
    }

    @Override // p149l.a3j
    /* JADX INFO: renamed from: t */
    public void mo94713t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((u7j0) obj).addListener(new C15791c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // p149l.a3j
    /* JADX INFO: renamed from: u */
    public void mo94714u(Object obj, Rect rect) {
        if (obj != null) {
            ((u7j0) obj).setEpicenterCallback(new C15792d(rect));
        }
    }

    @Override // p149l.a3j
    /* JADX INFO: renamed from: v */
    public void mo94715v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            m94705k(view, rect);
            ((u7j0) obj).setEpicenterCallback(new C15789a(rect));
        }
    }

    @Override // p149l.a3j
    /* JADX INFO: renamed from: z */
    public void mo94719z(Object obj, View view, ArrayList<View> arrayList) {
        a9j0 a9j0Var = (a9j0) obj;
        List<View> targets = a9j0Var.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            a3j.m94692d(targets, arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        mo94699b(a9j0Var, arrayList);
    }

    /* JADX INFO: renamed from: l.b3j$b */
    public class C15790b implements u7j0.InterfaceC20375g {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f73226a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ArrayList f73227b;

        public C15790b(View view, ArrayList arrayList) {
            this.f73226a = view;
            this.f73227b = arrayList;
        }

        @Override // p149l.u7j0.InterfaceC20375g
        /* JADX INFO: renamed from: c */
        public void mo95445c(@NonNull u7j0 u7j0Var) {
            u7j0Var.removeListener(this);
            this.f73226a.setVisibility(8);
            int size = this.f73227b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f73227b.get(i)).setVisibility(0);
            }
        }

        @Override // p149l.u7j0.InterfaceC20375g
        /* JADX INFO: renamed from: a */
        public void mo95446a(@NonNull u7j0 u7j0Var) {
        }

        @Override // p149l.u7j0.InterfaceC20375g
        /* JADX INFO: renamed from: b */
        public void mo100097b(@NonNull u7j0 u7j0Var) {
        }

        @Override // p149l.u7j0.InterfaceC20375g
        /* JADX INFO: renamed from: d */
        public void mo100098d(@NonNull u7j0 u7j0Var) {
        }

        @Override // p149l.u7j0.InterfaceC20375g
        /* JADX INFO: renamed from: e */
        public void mo100099e(@NonNull u7j0 u7j0Var) {
        }
    }
}
