package p153l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class zhj0 {

    /* JADX INFO: renamed from: c */
    public static ygj0 f204421c = new sj1();

    /* JADX INFO: renamed from: d */
    public static ThreadLocal<WeakReference<l01<ViewGroup, ArrayList<ygj0>>>> f204422d = new ThreadLocal<>();

    /* JADX INFO: renamed from: e */
    public static ArrayList<ViewGroup> f204423e = new ArrayList<>();

    /* JADX INFO: renamed from: a */
    public l01<w1e0, ygj0> f204424a = new l01<>();

    /* JADX INFO: renamed from: b */
    public l01<w1e0, l01<w1e0, ygj0>> f204425b = new l01<>();

    /* JADX INFO: renamed from: a */
    public static void m219688a(@NonNull ViewGroup viewGroup, @Nullable ygj0 ygj0Var) {
        if (f204423e.contains(viewGroup) || !kkl0.m150134P(viewGroup)) {
            return;
        }
        f204423e.add(viewGroup);
        if (ygj0Var == null) {
            ygj0Var = f204421c;
        }
        ygj0 ygj0VarClone = ygj0Var.clone();
        m219692e(viewGroup, ygj0VarClone);
        w1e0.m204440c(viewGroup, null);
        m219691d(viewGroup, ygj0VarClone);
    }

    /* JADX INFO: renamed from: b */
    public static void m219689b(ViewGroup viewGroup) {
        f204423e.remove(viewGroup);
        ArrayList<ygj0> arrayList = m219690c().get(viewGroup);
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            ((ygj0) arrayList2.get(size)).forceToEnd(viewGroup);
        }
    }

    /* JADX INFO: renamed from: c */
    public static l01<ViewGroup, ArrayList<ygj0>> m219690c() {
        l01<ViewGroup, ArrayList<ygj0>> l01Var;
        WeakReference<l01<ViewGroup, ArrayList<ygj0>>> weakReference = f204422d.get();
        if (weakReference != null && (l01Var = weakReference.get()) != null) {
            return l01Var;
        }
        l01<ViewGroup, ArrayList<ygj0>> l01Var2 = new l01<>();
        f204422d.set(new WeakReference<>(l01Var2));
        return l01Var2;
    }

    /* JADX INFO: renamed from: d */
    public static void m219691d(ViewGroup viewGroup, ygj0 ygj0Var) {
        if (ygj0Var == null || viewGroup == null) {
            return;
        }
        ViewTreeObserverOnPreDrawListenerC21808a viewTreeObserverOnPreDrawListenerC21808a = new ViewTreeObserverOnPreDrawListenerC21808a(ygj0Var, viewGroup);
        viewGroup.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC21808a);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC21808a);
    }

    /* JADX INFO: renamed from: e */
    public static void m219692e(ViewGroup viewGroup, ygj0 ygj0Var) {
        ArrayList<ygj0> arrayList = m219690c().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<ygj0> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().pause(viewGroup);
            }
        }
        if (ygj0Var != null) {
            ygj0Var.captureValues(viewGroup, true);
        }
        w1e0 w1e0VarM204439b = w1e0.m204439b(viewGroup);
        if (w1e0VarM204439b != null) {
            w1e0VarM204439b.m204441a();
        }
    }

    /* JADX INFO: renamed from: l.zhj0$a */
    public static class ViewTreeObserverOnPreDrawListenerC21808a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a */
        public ygj0 f204426a;

        /* JADX INFO: renamed from: b */
        public ViewGroup f204427b;

        /* JADX INFO: renamed from: l.zhj0$a$a */
        public class a extends yhj0 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ l01 f204428a;

            public a(l01 l01Var) {
                this.f204428a = l01Var;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p153l.yhj0, p153l.ygj0.InterfaceC21593g
            /* JADX INFO: renamed from: c */
            public void mo106211c(@NonNull ygj0 ygj0Var) {
                ((ArrayList) this.f204428a.get(ViewTreeObserverOnPreDrawListenerC21808a.this.f204427b)).remove(ygj0Var);
                ygj0Var.removeListener(this);
            }
        }

        public ViewTreeObserverOnPreDrawListenerC21808a(ygj0 ygj0Var, ViewGroup viewGroup) {
            this.f204426a = ygj0Var;
            this.f204427b = viewGroup;
        }

        /* JADX INFO: renamed from: a */
        public final void m219693a() {
            this.f204427b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f204427b.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            m219693a();
            if (!zhj0.f204423e.remove(this.f204427b)) {
                return true;
            }
            l01<ViewGroup, ArrayList<ygj0>> l01VarM219690c = zhj0.m219690c();
            ArrayList<ygj0> arrayList = l01VarM219690c.get(this.f204427b);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                l01VarM219690c.put(this.f204427b, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f204426a);
            this.f204426a.addListener(new a(l01VarM219690c));
            this.f204426a.captureValues(this.f204427b, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((ygj0) it.next()).resume(this.f204427b);
                }
            }
            this.f204426a.playTransition(this.f204427b);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            m219693a();
            zhj0.f204423e.remove(this.f204427b);
            ArrayList<ygj0> arrayList = zhj0.m219690c().get(this.f204427b);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<ygj0> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().resume(this.f204427b);
                }
            }
            this.f204426a.clearValues(true);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }
    }
}
