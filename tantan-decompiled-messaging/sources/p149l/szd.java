package p149l;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.appcompat.app.DialogInterfaceC0074a;
import com.p046p1.mobile.android.app.DialogAct;
import com.p046p1.mobile.android.p048ui.UIModeHelper;
import com.tantanapp.common.utils.CrashHelper;
import java.lang.ref.WeakReference;
import p133rx.C22306c;
import p133rx.subjects.C22393b;

/* JADX INFO: loaded from: classes8.dex */
public class szd extends DialogInterfaceC0074a implements DialogInterface.OnShowListener, DialogInterface.OnDismissListener, vzd.InterfaceC20772b, e0e {

    /* JADX INFO: renamed from: b */
    public WeakReference<Context> f167039b;

    /* JADX INFO: renamed from: c */
    public int f167040c;

    /* JADX INFO: renamed from: d */
    public long f167041d;

    /* JADX INFO: renamed from: e */
    public DialogInterface.OnShowListener f167042e;

    /* JADX INFO: renamed from: f */
    public DialogInterface.OnDismissListener f167043f;

    /* JADX INFO: renamed from: g */
    public d0e f167044g;

    /* JADX INFO: renamed from: h */
    public final C22393b<roj0> f167045h;

    /* JADX INFO: renamed from: i */
    public final C22393b<Boolean> f167046i;

    public szd(Context context, boolean z, int i) {
        super(context, i == 0 ? z ? n8c0.f137627k : 0 : i);
        this.f167040c = 0;
        this.f167045h = C22393b.m221521b();
        this.f167046i = C22393b.m221521b();
        this.f167039b = new WeakReference<>(context);
        requestWindowFeature(1);
        ComponentCallbacks2 componentCallbacks2M208326D = xdl0.m208326D(this.f167039b.get());
        if (componentCallbacks2M208326D instanceof d0e) {
            m186753D((d0e) componentCallbacks2M208326D);
        }
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ C22306c m186749t(C22306c c22306c) {
        return c22306c;
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ y6q0 m186750u(int i, int i2, int i3, int i4, View view, y6q0 y6q0Var) {
        view.setPadding(i, i2, i3, i4 + y6q0Var.m213179f(y6q0.C21326l.m213234d()).f160975d);
        return y6q0Var;
    }

    /* JADX INFO: renamed from: A */
    public void m186751A() {
        this.f167040c = 2147482647;
        m186752C();
    }

    /* JADX INFO: renamed from: C */
    public final void m186752C() {
        if (this.f167039b.get() instanceof DialogAct) {
            mo186755p();
            return;
        }
        this.f167041d = System.currentTimeMillis();
        n11.m157330c();
        vzd.m200742i().m200743d(this.f167039b.get(), this);
    }

    /* JADX INFO: renamed from: D */
    public void m186753D(@NonNull d0e d0eVar) {
        this.f167044g = d0eVar;
    }

    @Override // p149l.vzd.InterfaceC20772b
    /* JADX INFO: renamed from: c */
    public long mo186754c() {
        return this.f167041d;
    }

    @Override // android.app.Dialog, android.content.DialogInterface, p149l.vzd.InterfaceC20772b
    public void dismiss() {
        if (this.f167040c == 0) {
            super.dismiss();
            return;
        }
        n11.m157330c();
        if (isShowing()) {
            super.dismiss();
        } else {
            vzd.m200742i().m200748j(this.f167039b.get(), this);
        }
    }

    @Override // p149l.e0e
    public final <V> C22306c<V> duringCreated(C22306c<V> c22306c) {
        return m186757w(c22306c, true);
    }

    @Override // p149l.vzd.InterfaceC20772b
    public int getPriority() {
        return this.f167040c;
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        d0e d0eVar = this.f167044g;
        if (d0eVar != null) {
            d0eVar.onDialogAttachToWindow(this);
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        d0e d0eVar = this.f167044g;
        if (d0eVar != null) {
            d0eVar.onDialogDetachFromWindow(this);
        }
        this.f167045h.onNext(roj0.f160388a);
        this.f167046i.onNext(Boolean.FALSE);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        DialogInterface.OnDismissListener onDismissListener = this.f167043f;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
        this.f167046i.onNext(Boolean.TRUE);
        if (this.f167040c == 0 || (this.f167039b.get() instanceof DialogAct)) {
            return;
        }
        vzd.m200742i().m200750l(this.f167039b.get(), true);
    }

    public void onShow(DialogInterface dialogInterface) {
        this.f167046i.onNext(Boolean.FALSE);
        DialogInterface.OnShowListener onShowListener = this.f167042e;
        if (onShowListener != null) {
            onShowListener.onShow(dialogInterface);
        }
    }

    @Override // p149l.vzd.InterfaceC20772b
    /* JADX INFO: renamed from: p */
    public void mo186755p() {
        try {
            super.show();
        } catch (WindowManager.BadTokenException e) {
            CrashHelper.m81296c(e);
        }
    }

    @Override // android.app.Dialog
    public final void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        this.f167043f = onDismissListener;
    }

    @Override // android.app.Dialog
    public final void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        this.f167042e = onShowListener;
    }

    @Override // android.app.Dialog
    public void show() {
        UIModeHelper.m20820d(this, true);
        mo186755p();
    }

    /* JADX INFO: renamed from: v */
    public void m186756v(View view) {
        if (view == null) {
            return;
        }
        final int paddingLeft = view.getPaddingLeft();
        final int paddingTop = view.getPaddingTop();
        final int paddingRight = view.getPaddingRight();
        final int paddingBottom = view.getPaddingBottom();
        gbl0.m125231y0(view, new bd50() { // from class: l.qzd
            @Override // p149l.bd50
            public final y6q0 onApplyWindowInsets(View view2, y6q0 y6q0Var) {
                return szd.m186750u(paddingLeft, paddingTop, paddingRight, paddingBottom, view2, y6q0Var);
            }
        });
        gbl0.m125195g0(view);
    }

    /* JADX INFO: renamed from: w */
    public final <V> C22306c<V> m186757w(final C22306c<V> c22306c, boolean z) {
        return mkd0.m154952D(new v9j() { // from class: l.rzd
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return szd.m186749t(c22306c);
            }
        }, this.f167044g.lifecycle().compose(mkd0.m154953E()).takeUntil(this.f167045h), z);
    }

    /* JADX INFO: renamed from: x */
    public final void m186758x() {
        super.setOnDismissListener(this);
    }

    /* JADX INFO: renamed from: y */
    public final void m186759y() {
        super.setOnShowListener(this);
    }

    /* JADX INFO: renamed from: z */
    public void m186760z(View view) {
        m358s(view);
    }
}
