package p153l;

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
public class w5j extends v5j {

    /* JADX INFO: renamed from: l.w5j$a */
    public class C21025a extends ygj0.AbstractC21592f {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Rect f187520a;

        public C21025a(Rect rect) {
            this.f187520a = rect;
        }

        @Override // p153l.ygj0.AbstractC21592f
        /* JADX INFO: renamed from: a */
        public Rect mo204980a(@NonNull ygj0 ygj0Var) {
            return this.f187520a;
        }
    }

    /* JADX INFO: renamed from: l.w5j$c */
    public class C21027c extends yhj0 {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Object f187525a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ArrayList f187526b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ Object f187527c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ ArrayList f187528d;

        /* JADX INFO: renamed from: e */
        public final /* synthetic */ Object f187529e;

        /* JADX INFO: renamed from: f */
        public final /* synthetic */ ArrayList f187530f;

        public C21027c(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2, Object obj3, ArrayList arrayList3) {
            this.f187525a = obj;
            this.f187526b = arrayList;
            this.f187527c = obj2;
            this.f187528d = arrayList2;
            this.f187529e = obj3;
            this.f187530f = arrayList3;
        }

        @Override // p153l.yhj0, p153l.ygj0.InterfaceC21593g
        /* JADX INFO: renamed from: a */
        public void mo120913a(@NonNull ygj0 ygj0Var) {
            Object obj = this.f187525a;
            if (obj != null) {
                w5j.this.mo194599q(obj, this.f187526b, null);
            }
            Object obj2 = this.f187527c;
            if (obj2 != null) {
                w5j.this.mo194599q(obj2, this.f187528d, null);
            }
            Object obj3 = this.f187529e;
            if (obj3 != null) {
                w5j.this.mo194599q(obj3, this.f187530f, null);
            }
        }

        @Override // p153l.yhj0, p153l.ygj0.InterfaceC21593g
        /* JADX INFO: renamed from: c */
        public void mo106211c(@NonNull ygj0 ygj0Var) {
            ygj0Var.removeListener(this);
        }
    }

    /* JADX INFO: renamed from: l.w5j$d */
    public class C21028d extends ygj0.AbstractC21592f {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Rect f187532a;

        public C21028d(Rect rect) {
            this.f187532a = rect;
        }

        @Override // p153l.ygj0.AbstractC21592f
        /* JADX INFO: renamed from: a */
        public Rect mo204980a(@NonNull ygj0 ygj0Var) {
            Rect rect = this.f187532a;
            if (rect == null || rect.isEmpty()) {
                return null;
            }
            return this.f187532a;
        }
    }

    /* JADX INFO: renamed from: C */
    public static boolean m204979C(ygj0 ygj0Var) {
        return (v5j.m199880l(ygj0Var.getTargetIds()) && v5j.m199880l(ygj0Var.getTargetNames()) && v5j.m199880l(ygj0Var.getTargetTypes())) ? false : true;
    }

    @Override // p153l.v5j
    /* JADX INFO: renamed from: A */
    public void mo194589A(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        eij0 eij0Var = (eij0) obj;
        if (eij0Var != null) {
            eij0Var.getTargets().clear();
            eij0Var.getTargets().addAll(arrayList2);
            mo194599q(eij0Var, arrayList, arrayList2);
        }
    }

    @Override // p153l.v5j
    /* JADX INFO: renamed from: B */
    public Object mo194590B(Object obj) {
        if (obj == null) {
            return null;
        }
        eij0 eij0Var = new eij0();
        eij0Var.m120898f((ygj0) obj);
        return eij0Var;
    }

    @Override // p153l.v5j
    /* JADX INFO: renamed from: a */
    public void mo194591a(Object obj, View view) {
        if (obj != null) {
            ((ygj0) obj).addTarget(view);
        }
    }

    @Override // p153l.v5j
    /* JADX INFO: renamed from: b */
    public void mo194592b(Object obj, ArrayList<View> arrayList) {
        ygj0 ygj0Var = (ygj0) obj;
        if (ygj0Var == null) {
            return;
        }
        int i = 0;
        if (ygj0Var instanceof eij0) {
            eij0 eij0Var = (eij0) ygj0Var;
            int iM120901l = eij0Var.m120901l();
            while (i < iM120901l) {
                mo194592b(eij0Var.m120900k(i), arrayList);
                i++;
            }
            return;
        }
        if (m204979C(ygj0Var) || !v5j.m199880l(ygj0Var.getTargets())) {
            return;
        }
        int size = arrayList.size();
        while (i < size) {
            ygj0Var.addTarget(arrayList.get(i));
            i++;
        }
    }

    @Override // p153l.v5j
    /* JADX INFO: renamed from: c */
    public void mo194593c(ViewGroup viewGroup, Object obj) {
        zhj0.m219688a(viewGroup, (ygj0) obj);
    }

    @Override // p153l.v5j
    /* JADX INFO: renamed from: e */
    public boolean mo194594e(Object obj) {
        return obj instanceof ygj0;
    }

    @Override // p153l.v5j
    /* JADX INFO: renamed from: g */
    public Object mo194595g(Object obj) {
        if (obj != null) {
            return ((ygj0) obj).clone();
        }
        return null;
    }

    @Override // p153l.v5j
    /* JADX INFO: renamed from: m */
    public Object mo194596m(Object obj, Object obj2, Object obj3) {
        ygj0 ygj0VarM120909t = (ygj0) obj;
        ygj0 ygj0Var = (ygj0) obj2;
        ygj0 ygj0Var2 = (ygj0) obj3;
        if (ygj0VarM120909t != null && ygj0Var != null) {
            ygj0VarM120909t = new eij0().m120898f(ygj0VarM120909t).m120898f(ygj0Var).m120909t(1);
        } else if (ygj0VarM120909t == null) {
            ygj0VarM120909t = ygj0Var != null ? ygj0Var : null;
        }
        if (ygj0Var2 == null) {
            return ygj0VarM120909t;
        }
        eij0 eij0Var = new eij0();
        if (ygj0VarM120909t != null) {
            eij0Var.m120898f(ygj0VarM120909t);
        }
        eij0Var.m120898f(ygj0Var2);
        return eij0Var;
    }

    @Override // p153l.v5j
    /* JADX INFO: renamed from: n */
    public Object mo194597n(Object obj, Object obj2, Object obj3) {
        eij0 eij0Var = new eij0();
        if (obj != null) {
            eij0Var.m120898f((ygj0) obj);
        }
        if (obj2 != null) {
            eij0Var.m120898f((ygj0) obj2);
        }
        if (obj3 != null) {
            eij0Var.m120898f((ygj0) obj3);
        }
        return eij0Var;
    }

    @Override // p153l.v5j
    /* JADX INFO: renamed from: p */
    public void mo194598p(Object obj, View view) {
        if (obj != null) {
            ((ygj0) obj).removeTarget(view);
        }
    }

    @Override // p153l.v5j
    /* JADX INFO: renamed from: q */
    public void mo194599q(Object obj, ArrayList<View> arrayList, ArrayList<View> arrayList2) {
        ygj0 ygj0Var = (ygj0) obj;
        int i = 0;
        if (ygj0Var instanceof eij0) {
            eij0 eij0Var = (eij0) ygj0Var;
            int iM120901l = eij0Var.m120901l();
            while (i < iM120901l) {
                mo194599q(eij0Var.m120900k(i), arrayList, arrayList2);
                i++;
            }
            return;
        }
        if (m204979C(ygj0Var)) {
            return;
        }
        List<View> targets = ygj0Var.getTargets();
        if (targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            int size = arrayList2 == null ? 0 : arrayList2.size();
            while (i < size) {
                ygj0Var.addTarget(arrayList2.get(i));
                i++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                ygj0Var.removeTarget(arrayList.get(size2));
            }
        }
    }

    @Override // p153l.v5j
    /* JADX INFO: renamed from: r */
    public void mo194600r(Object obj, View view, ArrayList<View> arrayList) {
        ((ygj0) obj).addListener(new C21026b(view, arrayList));
    }

    @Override // p153l.v5j
    /* JADX INFO: renamed from: t */
    public void mo194601t(Object obj, Object obj2, ArrayList<View> arrayList, Object obj3, ArrayList<View> arrayList2, Object obj4, ArrayList<View> arrayList3) {
        ((ygj0) obj).addListener(new C21027c(obj2, arrayList, obj3, arrayList2, obj4, arrayList3));
    }

    @Override // p153l.v5j
    /* JADX INFO: renamed from: u */
    public void mo194602u(Object obj, Rect rect) {
        if (obj != null) {
            ((ygj0) obj).setEpicenterCallback(new C21028d(rect));
        }
    }

    @Override // p153l.v5j
    /* JADX INFO: renamed from: v */
    public void mo194603v(Object obj, View view) {
        if (view != null) {
            Rect rect = new Rect();
            m199883k(view, rect);
            ((ygj0) obj).setEpicenterCallback(new C21025a(rect));
        }
    }

    @Override // p153l.v5j
    /* JADX INFO: renamed from: z */
    public void mo194605z(Object obj, View view, ArrayList<View> arrayList) {
        eij0 eij0Var = (eij0) obj;
        List<View> targets = eij0Var.getTargets();
        targets.clear();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            v5j.m199877d(targets, arrayList.get(i));
        }
        targets.add(view);
        arrayList.add(view);
        mo194592b(eij0Var, arrayList);
    }

    /* JADX INFO: renamed from: l.w5j$b */
    public class C21026b implements ygj0.InterfaceC21593g {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ View f187522a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ ArrayList f187523b;

        public C21026b(View view, ArrayList arrayList) {
            this.f187522a = view;
            this.f187523b = arrayList;
        }

        @Override // p153l.ygj0.InterfaceC21593g
        /* JADX INFO: renamed from: c */
        public void mo106211c(@NonNull ygj0 ygj0Var) {
            ygj0Var.removeListener(this);
            this.f187522a.setVisibility(8);
            int size = this.f187523b.size();
            for (int i = 0; i < size; i++) {
                ((View) this.f187523b.get(i)).setVisibility(0);
            }
        }

        @Override // p153l.ygj0.InterfaceC21593g
        /* JADX INFO: renamed from: a */
        public void mo120913a(@NonNull ygj0 ygj0Var) {
        }

        @Override // p153l.ygj0.InterfaceC21593g
        /* JADX INFO: renamed from: b */
        public void mo106210b(@NonNull ygj0 ygj0Var) {
        }

        @Override // p153l.ygj0.InterfaceC21593g
        /* JADX INFO: renamed from: d */
        public void mo106212d(@NonNull ygj0 ygj0Var) {
        }

        @Override // p153l.ygj0.InterfaceC21593g
        /* JADX INFO: renamed from: e */
        public void mo106213e(@NonNull ygj0 ygj0Var) {
        }
    }
}
