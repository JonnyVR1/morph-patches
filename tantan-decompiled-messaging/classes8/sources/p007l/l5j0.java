package p007l;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.p003p1.mobile.android.app.Act;
import com.p003p1.mobile.android.app.Dialog;
import com.tantanapp.common.utils.NullChecker;
import l.roj0;
import l.v9j;
import rx.c;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class l5j0 extends BottomSheetDialog implements e0e, l0m, j0m {

    /* JADX INFO: renamed from: a */
    public d0e f3209a;

    /* JADX INFO: renamed from: b */
    public InterfaceC0595a f3210b;

    /* JADX INFO: renamed from: c */
    public final b<roj0> f3211c;

    /* JADX INFO: renamed from: d */
    public f0m f3212d;

    /* JADX INFO: renamed from: e */
    public Dialog.AbstractC0222f f3213e;

    /* JADX INFO: renamed from: l.l5j0$a */
    public interface InterfaceC0595a {
        /* JADX INFO: renamed from: a */
        void m9808a(l5j0 l5j0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l5j0(@NonNull Context context) {
        super(context);
        this.f3211c = b.b();
        if (context instanceof d0e) {
            m9807w((d0e) context);
        }
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ c m9801q(c cVar) {
        return cVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007l.j0m
    /* JADX INFO: renamed from: a */
    public boolean mo1131a() {
        Activity activityM9803s = m9803s();
        if (!NullChecker.a(activityM9803s) || activityM9803s.isFinishing() || activityM9803s.isDestroyed()) {
            return false;
        }
        show();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void dismiss() {
        super/*android.app.Dialog*/.dismiss();
        if (NullChecker.a(this.f3212d)) {
            this.f3212d.mo1381a(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean dispatchTouchEvent(@NonNull MotionEvent motionEvent) {
        if (NullChecker.a(this.f3210b) && motionEvent.getAction() == 0 && NullChecker.a(getWindow())) {
            View viewFindViewById = getWindow().getDecorView().findViewById(p4c0.f3611E);
            if (NullChecker.a(viewFindViewById) && m9804t(viewFindViewById, motionEvent)) {
                this.f3210b.m9808a(this);
                return false;
            }
        }
        return super/*android.app.Dialog*/.dispatchTouchEvent(motionEvent);
    }

    @Override // p007l.e0e
    public final <V> c<V> duringCreated(c<V> cVar) {
        return m9802r(cVar, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007l.l0m
    /* JADX INFO: renamed from: h */
    public boolean mo1138h(uc80 uc80Var) {
        Activity activityM9803s = m9803s();
        if (!NullChecker.a(activityM9803s) || activityM9803s.isFinishing() || activityM9803s.isDestroyed()) {
            return false;
        }
        show();
        return true;
    }

    @Override // p007l.g0m
    /* JADX INFO: renamed from: i */
    public void mo1139i(f0m f0mVar) {
        this.f3212d = f0mVar;
    }

    @Override // p007l.l0m
    /* JADX INFO: renamed from: m */
    public Act mo1411m() {
        return (Act) m9803s();
    }

    @Override // p007l.j0m
    /* JADX INFO: renamed from: n */
    public void mo1143n(boolean z) {
        dismiss();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttachedToWindow() {
        super/*android.app.Dialog*/.onAttachedToWindow();
        this.f3209a.onDialogAttachToWindow(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDetachedFromWindow() {
        super/*android.app.Dialog*/.onDetachedFromWindow();
        this.f3209a.onDialogDetachFromWindow(this);
        this.f3211c.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: r */
    public final <V> c<V> m9802r(final c<V> cVar, boolean z) {
        return mkd0.m9871D(new v9j() { // from class: l.k5j0
            public final Object call() {
                return l5j0.m9801q(cVar);
            }
        }, this.f3209a.lifecycle().compose(mkd0.m9872E()).takeUntil(this.f3211c), z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: s */
    public Activity m9803s() {
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m9804t(View view, MotionEvent motionEvent) {
        return motionEvent.getY() < ((float) view.getTop());
    }

    /* JADX INFO: renamed from: u */
    public void m9805u(Dialog.AbstractC0222f abstractC0222f) {
        this.f3213e = abstractC0222f;
    }

    /* JADX INFO: renamed from: v */
    public void m9806v(InterfaceC0595a interfaceC0595a) {
        this.f3210b = interfaceC0595a;
    }

    /* JADX INFO: renamed from: w */
    public void m9807w(d0e d0eVar) {
        this.f3209a = d0eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l5j0(@NonNull Context context, int i) {
        super(context, i);
        this.f3211c = b.b();
        if (context instanceof d0e) {
            m9807w((d0e) context);
        }
    }

    @Override // p007l.j0m
    /* JADX INFO: renamed from: f */
    public void mo1136f(boolean z) {
    }
}
