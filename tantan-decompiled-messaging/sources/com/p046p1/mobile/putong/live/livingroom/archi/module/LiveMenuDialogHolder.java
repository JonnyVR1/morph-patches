package com.p046p1.mobile.putong.live.livingroom.archi.module;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12611a;
import com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import p149l.aq2;
import p149l.d30;
import p149l.d8c0;
import p149l.e30;
import p149l.s7m;
import p149l.x6s;

/* JADX INFO: loaded from: classes4.dex */
public abstract class LiveMenuDialogHolder<T extends x6s> implements s7m<T> {

    /* JADX INFO: renamed from: a */
    @LayoutRes
    public final int f47756a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final T f47757b;

    /* JADX INFO: renamed from: c */
    public DialogC12611a f47758c;

    /* JADX INFO: renamed from: d */
    public int f47759d;

    /* JADX INFO: renamed from: e */
    public Act f47760e;

    /* JADX INFO: renamed from: f */
    public aq2 f47761f;

    /* JADX INFO: renamed from: g */
    public boolean f47762g;

    /* JADX INFO: renamed from: h */
    public LiveDialogEnum f47763h;

    /* JADX INFO: renamed from: i */
    public e30<View> f47764i;

    /* JADX INFO: renamed from: j */
    @StyleRes
    public int f47765j;

    public LiveMenuDialogHolder(@LayoutRes int i, Act act, @NonNull T t) {
        this.f47759d = 17;
        this.f47762g = false;
        this.f47765j = d8c0.f84856k;
        this.f47756a = i;
        this.f47760e = act;
        this.f47757b = t;
    }

    private void init() {
        DialogC12611a dialogC12611a = this.f47761f == null ? new DialogC12611a(this.f47757b, this.f47765j, this.f47756a, this.f47759d) : new DialogC12611a(this.f47757b, this.f47756a, this.f47761f);
        this.f47758c = dialogC12611a;
        dialogC12611a.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.f3t
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f94717a.m71840s(dialogInterface);
            }
        });
        this.f47758c.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.g3t
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f100508a.m71829u(dialogInterface);
            }
        });
        this.f47758c.m71776h0(new e30() { // from class: l.h3t
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f105762a.m71830v((View) obj);
            }
        });
        this.f47758c.m71775g0(this.f47764i);
        LiveDialogEnum liveDialogEnum = this.f47763h;
        if (liveDialogEnum != null) {
            this.f47758c.m71778j0(liveDialogEnum);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ void m71829u(DialogInterface dialogInterface) {
        this.f47757b.mo94471O3();
        mo71841w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m71830v(View view) {
        mo71836m(view);
        this.f47757b.mo96985R3();
        mo71835l();
    }

    /* JADX INFO: renamed from: A */
    public final void m71831A(int i) {
        this.f47759d = i;
        DialogC12611a dialogC12611a = this.f47758c;
        if (dialogC12611a != null) {
            dialogC12611a.m71773e0(i);
        }
    }

    /* JADX INFO: renamed from: B */
    public void m71832B(boolean z) {
        this.f47762g = z;
    }

    /* JADX INFO: renamed from: C */
    public void m71833C(e30<View> e30Var) {
        this.f47764i = e30Var;
        DialogC12611a dialogC12611a = this.f47758c;
        if (dialogC12611a != null) {
            dialogC12611a.m71775g0(e30Var);
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: E */
    public final void m71834E() {
        if (this.f47758c == null) {
            init();
        }
        if (this.f47758c.isShowing()) {
            return;
        }
        this.f47758c.m71777i0(this.f47762g);
        this.f47758c.show();
    }

    @Override // p149l.s7m
    public void destroy() {
        mo71838p();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public final boolean isShowing() {
        DialogC12611a dialogC12611a = this.f47758c;
        return dialogC12611a != null && dialogC12611a.isShowing();
    }

    /* JADX INFO: renamed from: l */
    public void mo71835l() {
    }

    /* JADX INFO: renamed from: m */
    public void mo71836m(View view) {
    }

    /* JADX INFO: renamed from: p */
    public void mo71838p() {
        DialogC12611a dialogC12611a = this.f47758c;
        if (dialogC12611a == null || !dialogC12611a.isShowing()) {
            return;
        }
        this.f47758c.dismiss();
    }

    /* JADX INFO: renamed from: q */
    public final void m71839q(d30 d30Var) {
        DialogC12611a dialogC12611a = this.f47758c;
        if (dialogC12611a == null || !dialogC12611a.isShowing()) {
            return;
        }
        this.f47758c.m71779k0(d30Var);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m71840s(DialogInterface dialogInterface) {
        this.f47757b.mo99576P3();
        mo71842x();
    }

    /* JADX INFO: renamed from: w */
    public void mo71841w() {
    }

    /* JADX INFO: renamed from: x */
    public void mo71842x() {
    }

    /* JADX INFO: renamed from: y */
    public void m71843y(DialogC12611a.c cVar) {
        DialogC12611a dialogC12611a = this.f47758c;
        if (dialogC12611a != null) {
            dialogC12611a.setCancelable(false);
            this.f47758c.m71774f0(cVar);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m71844z(LiveDialogEnum liveDialogEnum) {
        this.f47763h = liveDialogEnum;
        DialogC12611a dialogC12611a = this.f47758c;
        if (dialogC12611a != null) {
            dialogC12611a.m71778j0(liveDialogEnum);
        }
    }

    public LiveMenuDialogHolder(@LayoutRes int i, @StyleRes int i2, Act act, @NonNull T t) {
        this(i, act, t);
        this.f47765j = i2;
    }

    public LiveMenuDialogHolder(@LayoutRes int i, Act act, @NonNull T t, aq2 aq2Var) {
        this(i, act, t);
        this.f47761f = aq2Var;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(T t) {
    }
}
