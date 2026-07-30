package p149l;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public class v8j0 {

    /* JADX INFO: renamed from: c */
    public static u7j0 f180538c = new lj1();

    /* JADX INFO: renamed from: d */
    public static ThreadLocal<WeakReference<e01<ViewGroup, ArrayList<u7j0>>>> f180539d = new ThreadLocal<>();

    /* JADX INFO: renamed from: e */
    public static ArrayList<ViewGroup> f180540e = new ArrayList<>();

    /* JADX INFO: renamed from: a */
    public e01<utd0, u7j0> f180541a = new e01<>();

    /* JADX INFO: renamed from: b */
    public e01<utd0, e01<utd0, u7j0>> f180542b = new e01<>();

    /* JADX INFO: renamed from: a */
    public static void m197458a(@NonNull ViewGroup viewGroup, @Nullable u7j0 u7j0Var) {
        if (f180540e.contains(viewGroup) || !gbl0.m125171P(viewGroup)) {
            return;
        }
        f180540e.add(viewGroup);
        if (u7j0Var == null) {
            u7j0Var = f180538c;
        }
        u7j0 u7j0VarClone = u7j0Var.clone();
        m197462e(viewGroup, u7j0VarClone);
        utd0.m195302c(viewGroup, null);
        m197461d(viewGroup, u7j0VarClone);
    }

    /* JADX INFO: renamed from: b */
    public static void m197459b(ViewGroup viewGroup) {
        f180540e.remove(viewGroup);
        ArrayList<u7j0> arrayList = m197460c().get(viewGroup);
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            ((u7j0) arrayList2.get(size)).forceToEnd(viewGroup);
        }
    }

    /* JADX INFO: renamed from: c */
    public static e01<ViewGroup, ArrayList<u7j0>> m197460c() {
        e01<ViewGroup, ArrayList<u7j0>> e01Var;
        WeakReference<e01<ViewGroup, ArrayList<u7j0>>> weakReference = f180539d.get();
        if (weakReference != null && (e01Var = weakReference.get()) != null) {
            return e01Var;
        }
        e01<ViewGroup, ArrayList<u7j0>> e01Var2 = new e01<>();
        f180539d.set(new WeakReference<>(e01Var2));
        return e01Var2;
    }

    /* JADX INFO: renamed from: d */
    public static void m197461d(ViewGroup viewGroup, u7j0 u7j0Var) {
        if (u7j0Var == null || viewGroup == null) {
            return;
        }
        ViewTreeObserverOnPreDrawListenerC20599a viewTreeObserverOnPreDrawListenerC20599a = new ViewTreeObserverOnPreDrawListenerC20599a(u7j0Var, viewGroup);
        viewGroup.addOnAttachStateChangeListener(viewTreeObserverOnPreDrawListenerC20599a);
        viewGroup.getViewTreeObserver().addOnPreDrawListener(viewTreeObserverOnPreDrawListenerC20599a);
    }

    /* JADX INFO: renamed from: e */
    public static void m197462e(ViewGroup viewGroup, u7j0 u7j0Var) {
        ArrayList<u7j0> arrayList = m197460c().get(viewGroup);
        if (arrayList != null && arrayList.size() > 0) {
            Iterator<u7j0> it = arrayList.iterator();
            while (it.hasNext()) {
                it.next().pause(viewGroup);
            }
        }
        if (u7j0Var != null) {
            u7j0Var.captureValues(viewGroup, true);
        }
        utd0 utd0VarM195301b = utd0.m195301b(viewGroup);
        if (utd0VarM195301b != null) {
            utd0VarM195301b.m195303a();
        }
    }

    /* JADX INFO: renamed from: l.v8j0$a */
    public static class ViewTreeObserverOnPreDrawListenerC20599a implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a */
        public u7j0 f180543a;

        /* JADX INFO: renamed from: b */
        public ViewGroup f180544b;

        /* JADX INFO: renamed from: l.v8j0$a$a */
        public class a extends u8j0 {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ e01 f180545a;

            public a(e01 e01Var) {
                this.f180545a = e01Var;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // p149l.u8j0, p149l.u7j0.InterfaceC20375g
            /* JADX INFO: renamed from: c */
            public void mo95445c(@NonNull u7j0 u7j0Var) {
                ((ArrayList) this.f180545a.get(ViewTreeObserverOnPreDrawListenerC20599a.this.f180544b)).remove(u7j0Var);
                u7j0Var.removeListener(this);
            }
        }

        public ViewTreeObserverOnPreDrawListenerC20599a(u7j0 u7j0Var, ViewGroup viewGroup) {
            this.f180543a = u7j0Var;
            this.f180544b = viewGroup;
        }

        /* JADX INFO: renamed from: a */
        public final void m197463a() {
            this.f180544b.getViewTreeObserver().removeOnPreDrawListener(this);
            this.f180544b.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            m197463a();
            if (!v8j0.f180540e.remove(this.f180544b)) {
                return true;
            }
            e01<ViewGroup, ArrayList<u7j0>> e01VarM197460c = v8j0.m197460c();
            ArrayList<u7j0> arrayList = e01VarM197460c.get(this.f180544b);
            ArrayList arrayList2 = null;
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                e01VarM197460c.put(this.f180544b, arrayList);
            } else if (arrayList.size() > 0) {
                arrayList2 = new ArrayList(arrayList);
            }
            arrayList.add(this.f180543a);
            this.f180543a.addListener(new a(e01VarM197460c));
            this.f180543a.captureValues(this.f180544b, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((u7j0) it.next()).resume(this.f180544b);
                }
            }
            this.f180543a.playTransition(this.f180544b);
            return true;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            m197463a();
            v8j0.f180540e.remove(this.f180544b);
            ArrayList<u7j0> arrayList = v8j0.m197460c().get(this.f180544b);
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<u7j0> it = arrayList.iterator();
                while (it.hasNext()) {
                    it.next().resume(this.f180544b);
                }
            }
            this.f180543a.clearValues(true);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }
    }
}
