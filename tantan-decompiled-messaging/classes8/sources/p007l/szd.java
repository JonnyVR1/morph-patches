package p007l;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.appcompat.app.a;
import com.p003p1.mobile.android.app.DialogAct;
import com.p003p1.mobile.android.p005ui.UIModeHelper;
import com.tantanapp.common.utils.CrashHelper;
import java.lang.ref.WeakReference;
import l.bd50;
import l.gbl0;
import l.n11;
import l.roj0;
import l.v9j;
import l.xdl0;
import l.y6q0;
import rx.c;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class szd extends a implements DialogInterface.OnShowListener, DialogInterface.OnDismissListener, vzd.InterfaceC0747b, e0e {

    /* JADX INFO: renamed from: b */
    public WeakReference<Context> f4203b;

    /* JADX INFO: renamed from: c */
    public int f4204c;

    /* JADX INFO: renamed from: d */
    public long f4205d;

    /* JADX INFO: renamed from: e */
    public DialogInterface.OnShowListener f4206e;

    /* JADX INFO: renamed from: f */
    public DialogInterface.OnDismissListener f4207f;

    /* JADX INFO: renamed from: g */
    public d0e f4208g;

    /* JADX INFO: renamed from: h */
    public final b<roj0> f4209h;

    /* JADX INFO: renamed from: i */
    public final b<Boolean> f4210i;

    /* JADX WARN: Multi-variable type inference failed */
    public szd(Context context, boolean z, int i) {
        super(context, i == 0 ? z ? n8c0.f3372k : 0 : i);
        this.f4204c = 0;
        this.f4209h = b.b();
        this.f4210i = b.b();
        this.f4203b = new WeakReference<>(context);
        requestWindowFeature(1);
        ComponentCallbacks2 componentCallbacks2D = xdl0.D(this.f4203b.get());
        if (componentCallbacks2D instanceof d0e) {
            m10763D((d0e) componentCallbacks2D);
        }
    }

    /* JADX INFO: renamed from: t */
    public static /* synthetic */ c m10759t(c cVar) {
        return cVar;
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ y6q0 m10760u(int i, int i2, int i3, int i4, View view, y6q0 y6q0Var) {
        view.setPadding(i, i2, i3, i4 + y6q0Var.f(y6q0.l.d()).d);
        return y6q0Var;
    }

    /* JADX INFO: renamed from: A */
    public void m10761A() {
        this.f4204c = 2147482647;
        m10762C();
    }

    /* JADX INFO: renamed from: C */
    public final void m10762C() {
        if (this.f4203b.get() instanceof DialogAct) {
            mo10765p();
            return;
        }
        this.f4205d = System.currentTimeMillis();
        n11.c();
        vzd.m11301i().m11302d(this.f4203b.get(), this);
    }

    /* JADX INFO: renamed from: D */
    public void m10763D(@NonNull d0e d0eVar) {
        this.f4208g = d0eVar;
    }

    @Override // p007l.vzd.InterfaceC0747b
    /* JADX INFO: renamed from: c */
    public long mo10764c() {
        return this.f4205d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007l.vzd.InterfaceC0747b
    public void dismiss() {
        if (this.f4204c == 0) {
            super/*android.app.Dialog*/.dismiss();
            return;
        }
        n11.c();
        if (isShowing()) {
            super/*android.app.Dialog*/.dismiss();
        } else {
            vzd.m11301i().m11307j(this.f4203b.get(), this);
        }
    }

    @Override // p007l.e0e
    public final <V> c<V> duringCreated(c<V> cVar) {
        return m10767w(cVar, true);
    }

    @Override // p007l.vzd.InterfaceC0747b
    public int getPriority() {
        return this.f4204c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onAttachedToWindow() {
        super/*android.app.Dialog*/.onAttachedToWindow();
        d0e d0eVar = this.f4208g;
        if (d0eVar != null) {
            d0eVar.onDialogAttachToWindow(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDetachedFromWindow() {
        super/*android.app.Dialog*/.onDetachedFromWindow();
        d0e d0eVar = this.f4208g;
        if (d0eVar != null) {
            d0eVar.onDialogDetachFromWindow(this);
        }
        this.f4209h.onNext(roj0.a);
        this.f4210i.onNext(Boolean.FALSE);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        DialogInterface.OnDismissListener onDismissListener = this.f4207f;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(dialogInterface);
        }
        this.f4210i.onNext(Boolean.TRUE);
        if (this.f4204c == 0 || (this.f4203b.get() instanceof DialogAct)) {
            return;
        }
        vzd.m11301i().m11309l(this.f4203b.get(), true);
    }

    public void onShow(DialogInterface dialogInterface) {
        this.f4210i.onNext(Boolean.FALSE);
        DialogInterface.OnShowListener onShowListener = this.f4206e;
        if (onShowListener != null) {
            onShowListener.onShow(dialogInterface);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p007l.vzd.InterfaceC0747b
    /* JADX INFO: renamed from: p */
    public void mo10765p() {
        try {
            super/*android.app.Dialog*/.show();
        } catch (WindowManager.BadTokenException e) {
            CrashHelper.c(e);
        }
    }

    public final void setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        this.f4207f = onDismissListener;
    }

    public final void setOnShowListener(DialogInterface.OnShowListener onShowListener) {
        this.f4206e = onShowListener;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void show() {
        UIModeHelper.m1091d(this, true);
        mo10765p();
    }

    /* JADX INFO: renamed from: v */
    public void m10766v(View view) {
        if (view == null) {
            return;
        }
        final int paddingLeft = view.getPaddingLeft();
        final int paddingTop = view.getPaddingTop();
        final int paddingRight = view.getPaddingRight();
        final int paddingBottom = view.getPaddingBottom();
        gbl0.y0(view, new bd50() { // from class: l.qzd
            public final y6q0 onApplyWindowInsets(View view2, y6q0 y6q0Var) {
                return szd.m10760u(paddingLeft, paddingTop, paddingRight, paddingBottom, view2, y6q0Var);
            }
        });
        gbl0.g0(view);
    }

    /* JADX INFO: renamed from: w */
    public final <V> c<V> m10767w(final c<V> cVar, boolean z) {
        return mkd0.m9871D(new v9j() { // from class: l.rzd
            public final Object call() {
                return szd.m10759t(cVar);
            }
        }, this.f4208g.lifecycle().compose(mkd0.m9872E()).takeUntil(this.f4209h), z);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x */
    public final void m10768x() {
        super/*android.app.Dialog*/.setOnDismissListener(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y */
    public final void m10769y() {
        super/*android.app.Dialog*/.setOnShowListener(this);
    }

    /* JADX INFO: renamed from: z */
    public void m10770z(View view) {
        s(view);
    }
}
