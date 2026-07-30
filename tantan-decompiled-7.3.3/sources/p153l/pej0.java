package p153l;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.tantanapp.common.utils.NullChecker;
import p137rx.C22421c;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes8.dex */
public class pej0 extends BottomSheetDialog implements s1e, f3m, d3m {

    /* JADX INFO: renamed from: a */
    public r1e f152094a;

    /* JADX INFO: renamed from: b */
    public InterfaceC19357a f152095b;

    /* JADX INFO: renamed from: c */
    public final C22508b<uxj0> f152096c;

    /* JADX INFO: renamed from: d */
    public z2m f152097d;

    /* JADX INFO: renamed from: e */
    public Dialog.AbstractC4461f f152098e;

    /* JADX INFO: renamed from: l.pej0$a */
    public interface InterfaceC19357a {
        /* JADX INFO: renamed from: a */
        void mo172035a(pej0 pej0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public pej0(@NonNull Context context) {
        super(context);
        this.f152096c = C22508b.m222767b();
        if (context instanceof r1e) {
            m172034w((r1e) context);
        }
    }

    /* JADX INFO: renamed from: q */
    public static /* synthetic */ C22421c m172028q(C22421c c22421c) {
        return c22421c;
    }

    @Override // p153l.d3m
    /* JADX INFO: renamed from: a */
    public boolean mo21859a() {
        Activity activityM172030s = m172030s();
        if (!NullChecker.m82486a(activityM172030s) || activityM172030s.isFinishing() || activityM172030s.isDestroyed()) {
            return false;
        }
        show();
        return true;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        if (NullChecker.m82486a(this.f152097d)) {
            this.f152097d.mo22108a(this);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchTouchEvent(@NonNull MotionEvent motionEvent) {
        if (NullChecker.m82486a(this.f152095b) && motionEvent.getAction() == 0 && NullChecker.m82486a(getWindow())) {
            View viewFindViewById = getWindow().getDecorView().findViewById(vcc0.f183363E);
            if (NullChecker.m82486a(viewFindViewById) && m172031t(viewFindViewById, motionEvent)) {
                this.f152095b.mo172035a(this);
                return false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // p153l.s1e
    public final <V> C22421c<V> duringCreated(C22421c<V> c22421c) {
        return m172029r(c22421c, true);
    }

    @Override // p153l.f3m
    /* JADX INFO: renamed from: h */
    public boolean mo21866h(al80 al80Var) {
        Activity activityM172030s = m172030s();
        if (!NullChecker.m82486a(activityM172030s) || activityM172030s.isFinishing() || activityM172030s.isDestroyed()) {
            return false;
        }
        show();
        return true;
    }

    @Override // p153l.a3m
    /* JADX INFO: renamed from: i */
    public void mo21867i(z2m z2mVar) {
        this.f152097d = z2mVar;
    }

    @Override // p153l.f3m
    /* JADX INFO: renamed from: m */
    public Act mo22138m() {
        return (Act) m172030s();
    }

    @Override // p153l.d3m
    /* JADX INFO: renamed from: n */
    public void mo21871n(boolean z) {
        dismiss();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f152094a.onDialogAttachToWindow(this);
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f152094a.onDialogDetachFromWindow(this);
        this.f152096c.onNext(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: r */
    public final <V> C22421c<V> m172029r(final C22421c<V> c22421c, boolean z) {
        return psd0.m173593D(new pcj() { // from class: l.oej0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return pej0.m172028q(c22421c);
            }
        }, this.f152094a.lifecycle().compose(psd0.m173594E()).takeUntil(this.f152096c), z);
    }

    /* JADX INFO: renamed from: s */
    public Activity m172030s() {
        for (Context context = getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: t */
    public final boolean m172031t(View view, MotionEvent motionEvent) {
        return motionEvent.getY() < ((float) view.getTop());
    }

    /* JADX INFO: renamed from: u */
    public void m172032u(Dialog.AbstractC4461f abstractC4461f) {
        this.f152098e = abstractC4461f;
    }

    /* JADX INFO: renamed from: v */
    public void m172033v(InterfaceC19357a interfaceC19357a) {
        this.f152095b = interfaceC19357a;
    }

    /* JADX INFO: renamed from: w */
    public void m172034w(r1e r1eVar) {
        this.f152094a = r1eVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public pej0(@NonNull Context context, int i) {
        super(context, i);
        this.f152096c = C22508b.m222767b();
        if (context instanceof r1e) {
            m172034w((r1e) context);
        }
    }

    @Override // p153l.d3m
    /* JADX INFO: renamed from: f */
    public void mo21864f(boolean z) {
    }
}
