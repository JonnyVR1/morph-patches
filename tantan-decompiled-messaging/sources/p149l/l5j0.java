package p149l;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.tantanapp.common.utils.NullChecker;
import p133rx.C22306c;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes8.dex */
public class l5j0 extends BottomSheetDialog implements e0e, l0m, j0m {

    /* JADX INFO: renamed from: a */
    public d0e f126178a;

    /* JADX INFO: renamed from: b */
    public InterfaceC18152a f126179b;

    /* JADX INFO: renamed from: c */
    public final C22393b<roj0> f126180c;

    /* JADX INFO: renamed from: d */
    public f0m f126181d;

    /* JADX INFO: renamed from: e */
    public Dialog.AbstractC4310f f126182e;

    /* JADX INFO: renamed from: l.l5j0$a */
    public interface InterfaceC18152a {
        /* JADX INFO: renamed from: a */
        void mo99733a(l5j0 l5j0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l5j0(@NonNull Context context) {
        super(context);
        this.f126180c = C22393b.m221521b();
        if (context instanceof d0e) {
            m148651w((d0e) context);
        }
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ C22306c m148645q(C22306c c22306c) {
        return c22306c;
    }

    @Override // p149l.j0m
    /* JADX INFO: renamed from: a */
    public boolean mo20860a() {
        Activity activityM148647s = m148647s();
        if (!NullChecker.m81303a(activityM148647s) || activityM148647s.isFinishing() || activityM148647s.isDestroyed()) {
            return false;
        }
        show();
        return true;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        if (NullChecker.m81303a(this.f126181d)) {
            this.f126181d.mo21109a(this);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchTouchEvent(@NonNull MotionEvent motionEvent) {
        if (NullChecker.m81303a(this.f126179b) && motionEvent.getAction() == 0 && NullChecker.m81303a(getWindow())) {
            View viewFindViewById = getWindow().getDecorView().findViewById(p4c0.f147063E);
            if (NullChecker.m81303a(viewFindViewById) && m148648t(viewFindViewById, motionEvent)) {
                this.f126179b.mo99733a(this);
                return false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // p149l.e0e
    public final <V> C22306c<V> duringCreated(C22306c<V> c22306c) {
        return m148646r(c22306c, true);
    }

    @Override // p149l.l0m
    /* JADX INFO: renamed from: h */
    public boolean mo20867h(uc80 uc80Var) {
        Activity activityM148647s = m148647s();
        if (!NullChecker.m81303a(activityM148647s) || activityM148647s.isFinishing() || activityM148647s.isDestroyed()) {
            return false;
        }
        show();
        return true;
    }

    @Override // p149l.g0m
    /* JADX INFO: renamed from: i */
    public void mo20868i(f0m f0mVar) {
        this.f126181d = f0mVar;
    }

    @Override // p149l.l0m
    /* JADX INFO: renamed from: m */
    public Act mo21139m() {
        return (Act) m148647s();
    }

    @Override // p149l.j0m
    /* JADX INFO: renamed from: n */
    public void mo20872n(boolean z) {
        dismiss();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f126178a.onDialogAttachToWindow(this);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f126178a.onDialogDetachFromWindow(this);
        this.f126180c.onNext(roj0.f160388a);
    }

    /* JADX INFO: renamed from: r */
    public final <V> C22306c<V> m148646r(final C22306c<V> c22306c, boolean z) {
        return mkd0.m154952D(new v9j() { // from class: l.k5j0
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return l5j0.m148645q(c22306c);
            }
        }, this.f126178a.lifecycle().compose(mkd0.m154953E()).takeUntil(this.f126180c), z);
    }

    /* JADX INFO: renamed from: s */
    public Activity m148647s() {
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m148648t(View view, MotionEvent motionEvent) {
        return motionEvent.getY() < ((float) view.getTop());
    }

    /* JADX INFO: renamed from: u */
    public void m148649u(Dialog.AbstractC4310f abstractC4310f) {
        this.f126182e = abstractC4310f;
    }

    /* JADX INFO: renamed from: v */
    public void m148650v(InterfaceC18152a interfaceC18152a) {
        this.f126179b = interfaceC18152a;
    }

    /* JADX INFO: renamed from: w */
    public void m148651w(d0e d0eVar) {
        this.f126178a = d0eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l5j0(@NonNull Context context, int i) {
        super(context, i);
        this.f126180c = C22393b.m221521b();
        if (context instanceof d0e) {
            m148651w((d0e) context);
        }
    }

    @Override // p149l.j0m
    /* JADX INFO: renamed from: f */
    public void mo20865f(boolean z) {
    }
}
