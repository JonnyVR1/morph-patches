package p153l;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.appcompat.app.DialogInterfaceC0075a;
import com.p051p1.mobile.android.app.DialogAct;
import com.p051p1.mobile.android.p053ui.UIModeHelper;
import com.tantanapp.common.utils.CrashHelper;
import java.lang.ref.WeakReference;
import p137rx.C22421c;
import p137rx.subjects.C22508b;

/* JADX INFO: loaded from: classes8.dex */
public class g1e extends DialogInterfaceC0075a implements DialogInterface.OnShowListener, DialogInterface.OnDismissListener, j1e.InterfaceC17849b, s1e {

    /* JADX INFO: renamed from: b */
    public WeakReference<Context> f101739b;

    /* JADX INFO: renamed from: c */
    public int f101740c;

    /* JADX INFO: renamed from: d */
    public long f101741d;

    /* JADX INFO: renamed from: e */
    public DialogInterface.OnShowListener f101742e;

    /* JADX INFO: renamed from: f */
    public DialogInterface.OnDismissListener f101743f;

    /* JADX INFO: renamed from: g */
    public r1e f101744g;

    /* JADX INFO: renamed from: h */
    public final C22508b<uxj0> f101745h;

    /* JADX INFO: renamed from: i */
    public final C22508b<Boolean> f101746i;

    public g1e(Context context, boolean z, int i) {
        super(context, i == 0 ? z ? tgc0.f174065k : 0 : i);
        this.f101740c = 0;
        this.f101745h = C22508b.m222767b();
        this.f101746i = C22508b.m222767b();
        this.f101739b = new WeakReference<>(context);
        requestWindowFeature(1);
        ComponentCallbacks2 componentCallbacks2M105506D = bnl0.m105506D(this.f101739b.get());
        if (componentCallbacks2M105506D instanceof r1e) {
            m128495D((r1e) componentCallbacks2M105506D);
        }
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ C22421c m128491t(C22421c c22421c) {
        return c22421c;
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ dgq0 m128492u(int i, int i2, int i3, int i4, View view, dgq0 dgq0Var) {
        view.setPadding(i, i2, i3, i4 + dgq0Var.m115680f(dgq0.C16531l.m115735d()).f170860d);
        return dgq0Var;
    }

    /* JADX INFO: renamed from: A */
    public void m128493A() {
        this.f101740c = 2147482647;
        m128494C();
    }

    /* JADX INFO: renamed from: C */
    public final void m128494C() {
        if (this.f101739b.get() instanceof DialogAct) {
            mo128497p();
            return;
        }
        this.f101741d = System.currentTimeMillis();
        u11.m193889c();
        j1e.m143118i().m143119d(this.f101739b.get(), this);
    }

    /* JADX INFO: renamed from: D */
    public void m128495D(@NonNull r1e r1eVar) {
        this.f101744g = r1eVar;
    }

    @Override // p153l.j1e.InterfaceC17849b
    /* JADX INFO: renamed from: c */
    public long mo128496c() {
        return this.f101741d;
    }

    @Override // android.app.Dialog, android.content.DialogInterface, p153l.j1e.InterfaceC17849b
    public void dismiss() {
        if (this.f101740c == 0) {
            super.dismiss();
            return;
        }
        u11.m193889c();
        if (isShowing()) {
            super.dismiss();
        } else {
            j1e.m143118i().m143124j(this.f101739b.get(), this);
        }
    }

    @Override // p153l.s1e
    public final <V> C22421c<V> duringCreated(C22421c<V> c22421c) {
        return m128499w(c22421c, true);
    }

    @Override // p153l.j1e.InterfaceC17849b
    public int getPriority() {
        return this.f101740c;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        r1e r1eVar = this.f101744g;
        if (r1eVar != null) {
            r1eVar.onDialogAttachToWindow(this);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        r1e r1eVar = this.f101744g;
        if (r1eVar != null) {
            r1eVar.onDialogDetachFromWindow(this);
        }
        this.f101745h.onNext(uxj0.f181467a);
        this.f101746i.onNext(Boolean.FALSE);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        DialogInterface.OnDismissListener onDismissListener = this.f101743f;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
        this.f101746i.onNext(Boolean.TRUE);
        if (this.f101740c == 0 || (this.f101739b.get() instanceof DialogAct)) {
            return;
        }
        j1e.m143118i().m143126l(this.f101739b.get(), true);
    }

    public void onShow(DialogInterface dialogInterface) {
        this.f101746i.onNext(Boolean.FALSE);
        DialogInterface.OnShowListener onShowListener = this.f101742e;
        if (onShowListener != null) {
            onShowListener.onShow(dialogInterface);
        }
    }

    @Override // p153l.j1e.InterfaceC17849b
    /* JADX INFO: renamed from: p */
    public void mo128497p() {
        try {
            super.show();
        } catch (WindowManager.BadTokenException e) {
            CrashHelper.m82479c(e);
        }
    }

    @Override // android.app.Dialog
    public final void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        this.f101743f = onDismissListener;
    }

    @Override // android.app.Dialog
    public final void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        this.f101742e = onShowListener;
    }

    @Override // android.app.Dialog
    public void show() {
        UIModeHelper.m21819d(this, true);
        mo128497p();
    }

    /* JADX INFO: renamed from: v */
    public void m128498v(View view) {
        if (view == null) {
            return;
        }
        final int paddingLeft = view.getPaddingLeft();
        final int paddingTop = view.getPaddingTop();
        final int paddingRight = view.getPaddingRight();
        final int paddingBottom = view.getPaddingBottom();
        kkl0.m150194y0(view, new il50() { // from class: l.e1e
            @Override // p153l.il50
            public final dgq0 onApplyWindowInsets(View view2, dgq0 dgq0Var) {
                return g1e.m128492u(paddingLeft, paddingTop, paddingRight, paddingBottom, view2, dgq0Var);
            }
        });
        kkl0.m150158g0(view);
    }

    /* JADX INFO: renamed from: w */
    public final <V> C22421c<V> m128499w(final C22421c<V> c22421c, boolean z) {
        return psd0.m173593D(new pcj() { // from class: l.f1e
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return g1e.m128491t(c22421c);
            }
        }, this.f101744g.lifecycle().compose(psd0.m173594E()).takeUntil(this.f101745h), z);
    }

    /* JADX INFO: renamed from: x */
    public final void m128500x() {
        super.setOnDismissListener(this);
    }

    /* JADX INFO: renamed from: y */
    public final void m128501y() {
        super.setOnShowListener(this);
    }

    /* JADX INFO: renamed from: z */
    public void m128502z(View view) {
        m359s(view);
    }
}
