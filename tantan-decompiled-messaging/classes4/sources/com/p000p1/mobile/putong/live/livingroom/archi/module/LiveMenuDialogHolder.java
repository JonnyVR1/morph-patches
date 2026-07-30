package com.p000p1.mobile.putong.live.livingroom.archi.module;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.appcompat.app.a;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.C0200a;
import com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import com.p1.mobile.android.app.Act;
import l.d30;
import l.e30;
import l.s7m;
import p002l.aq2;
import p002l.d8c0;
import p002l.x6s;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public abstract class LiveMenuDialogHolder<T extends x6s> implements s7m<T> {

    /* JADX INFO: renamed from: a */
    @LayoutRes
    public final int f3798a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final T f3799b;

    /* JADX INFO: renamed from: c */
    public C0200a f3800c;

    /* JADX INFO: renamed from: d */
    public int f3801d;

    /* JADX INFO: renamed from: e */
    public Act f3802e;

    /* JADX INFO: renamed from: f */
    public aq2 f3803f;

    /* JADX INFO: renamed from: g */
    public boolean f3804g;

    /* JADX INFO: renamed from: h */
    public LiveDialogEnum f3805h;

    /* JADX INFO: renamed from: i */
    public e30<View> f3806i;

    /* JADX INFO: renamed from: j */
    @StyleRes
    public int f3807j;

    public LiveMenuDialogHolder(@LayoutRes int i, Act act, @NonNull T t) {
        this.f3801d = 17;
        this.f3804g = false;
        this.f3807j = d8c0.f9106k;
        this.f3798a = i;
        this.f3802e = act;
        this.f3799b = t;
    }

    private void init() {
        C0200a c0200a = this.f3803f == null ? new C0200a(this.f3799b, this.f3807j, this.f3798a, this.f3801d) : new C0200a(this.f3799b, this.f3798a, this.f3803f);
        this.f3800c = c0200a;
        c0200a.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.f3t
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f10115a.m5218s(dialogInterface);
            }
        });
        this.f3800c.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.g3t
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f10749a.m5205u(dialogInterface);
            }
        });
        this.f3800c.m5144h0(new e30() { // from class: l.h3t
            public final void call(Object obj) {
                this.f11866a.m5206v((View) obj);
            }
        });
        this.f3800c.m5143g0(this.f3806i);
        LiveDialogEnum liveDialogEnum = this.f3805h;
        if (liveDialogEnum != null) {
            this.f3800c.m5146j0(liveDialogEnum);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ void m5205u(DialogInterface dialogInterface) {
        this.f3799b.mo9256O3();
        mo5219w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m5206v(View view) {
        mo5214m(view);
        this.f3799b.mo9823R3();
        mo5213l();
    }

    /* JADX INFO: renamed from: A */
    public final void m5207A(int i) {
        this.f3801d = i;
        C0200a c0200a = this.f3800c;
        if (c0200a != null) {
            c0200a.m5141e0(i);
        }
    }

    /* JADX INFO: renamed from: B */
    public void m5208B(boolean z) {
        this.f3804g = z;
    }

    /* JADX INFO: renamed from: C */
    public void m5209C(e30<View> e30Var) {
        this.f3806i = e30Var;
        C0200a c0200a = this.f3800c;
        if (c0200a != null) {
            c0200a.m5143g0(e30Var);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context mo5210C0() {
        return null;
    }

    /* JADX INFO: renamed from: E */
    public final void m5211E() {
        if (this.f3800c == null) {
            init();
        }
        if (this.f3800c.isShowing()) {
            return;
        }
        this.f3800c.m5145i0(this.f3804g);
        this.f3800c.show();
    }

    public void destroy() {
        mo5216p();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public final boolean isShowing() {
        a aVar = this.f3800c;
        return aVar != null && aVar.isShowing();
    }

    /* JADX INFO: renamed from: l */
    public void mo5213l() {
    }

    /* JADX INFO: renamed from: m */
    public void mo5214m(View view) {
    }

    /* JADX INFO: renamed from: p */
    public void mo5216p() {
        a aVar = this.f3800c;
        if (aVar == null || !aVar.isShowing()) {
            return;
        }
        this.f3800c.dismiss();
    }

    /* JADX INFO: renamed from: q */
    public final void m5217q(d30 d30Var) {
        a aVar = this.f3800c;
        if (aVar == null || !aVar.isShowing()) {
            return;
        }
        this.f3800c.m5147k0(d30Var);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m5218s(DialogInterface dialogInterface) {
        this.f3799b.mo10254P3();
        mo5220x();
    }

    /* JADX INFO: renamed from: w */
    public void mo5219w() {
    }

    /* JADX INFO: renamed from: x */
    public void mo5220x() {
    }

    /* JADX INFO: renamed from: y */
    public void m5221y(C0200a.c cVar) {
        a aVar = this.f3800c;
        if (aVar != null) {
            aVar.setCancelable(false);
            this.f3800c.m5142f0(cVar);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m5222z(LiveDialogEnum liveDialogEnum) {
        this.f3805h = liveDialogEnum;
        C0200a c0200a = this.f3800c;
        if (c0200a != null) {
            c0200a.m5146j0(liveDialogEnum);
        }
    }

    public LiveMenuDialogHolder(@LayoutRes int i, @StyleRes int i2, Act act, @NonNull T t) {
        this(i, act, t);
        this.f3807j = i2;
    }

    public LiveMenuDialogHolder(@LayoutRes int i, Act act, @NonNull T t, aq2 aq2Var) {
        this(i, act, t);
        this.f3803f = aq2Var;
    }

    @Override // 
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo5212i1(T t) {
    }
}
