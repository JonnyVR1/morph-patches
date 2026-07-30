package com.p051p1.mobile.putong.live.livingroom.archi.module;

import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogC12774a;
import com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter.LiveDialogEnum;
import p153l.iam;
import p153l.jgc0;
import p153l.rq2;
import p153l.x20;
import p153l.y20;
import p153l.y8s;

/* JADX INFO: loaded from: classes4.dex */
public abstract class LiveMenuDialogHolder<T extends y8s> implements iam<T> {

    /* JADX INFO: renamed from: a */
    @LayoutRes
    public final int f48604a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public final T f48605b;

    /* JADX INFO: renamed from: c */
    public DialogC12774a f48606c;

    /* JADX INFO: renamed from: d */
    public int f48607d;

    /* JADX INFO: renamed from: e */
    public Act f48608e;

    /* JADX INFO: renamed from: f */
    public rq2 f48609f;

    /* JADX INFO: renamed from: g */
    public boolean f48610g;

    /* JADX INFO: renamed from: h */
    public LiveDialogEnum f48611h;

    /* JADX INFO: renamed from: i */
    public y20<View> f48612i;

    /* JADX INFO: renamed from: j */
    @StyleRes
    public int f48613j;

    public LiveMenuDialogHolder(@LayoutRes int i, Act act, @NonNull T t) {
        this.f48607d = 17;
        this.f48610g = false;
        this.f48613j = jgc0.f120704k;
        this.f48604a = i;
        this.f48608e = act;
        this.f48605b = t;
    }

    private void init() {
        DialogC12774a dialogC12774a = this.f48609f == null ? new DialogC12774a(this.f48605b, this.f48613j, this.f48604a, this.f48607d) : new DialogC12774a(this.f48605b, this.f48604a, this.f48609f);
        this.f48606c = dialogC12774a;
        dialogC12774a.setOnShowListener(new DialogInterface.OnShowListener() { // from class: l.g5t
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                this.f102360a.m73023s(dialogInterface);
            }
        });
        this.f48606c.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.h5t
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f107973a.m73012u(dialogInterface);
            }
        });
        this.f48606c.m72959h0(new y20() { // from class: l.i5t
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f113097a.m73013v((View) obj);
            }
        });
        this.f48606c.m72958g0(this.f48612i);
        LiveDialogEnum liveDialogEnum = this.f48611h;
        if (liveDialogEnum != null) {
            this.f48606c.m72961j0(liveDialogEnum);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ void m73012u(DialogInterface dialogInterface) {
        this.f48605b.mo96836O3();
        mo73024w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public /* synthetic */ void m73013v(View view) {
        mo73019m(view);
        this.f48605b.mo103124R3();
        mo73018l();
    }

    /* JADX INFO: renamed from: A */
    public final void m73014A(int i) {
        this.f48607d = i;
        DialogC12774a dialogC12774a = this.f48606c;
        if (dialogC12774a != null) {
            dialogC12774a.m72956e0(i);
        }
    }

    /* JADX INFO: renamed from: B */
    public void m73015B(boolean z) {
        this.f48610g = z;
    }

    /* JADX INFO: renamed from: C */
    public void m73016C(y20<View> y20Var) {
        this.f48612i = y20Var;
        DialogC12774a dialogC12774a = this.f48606c;
        if (dialogC12774a != null) {
            dialogC12774a.m72958g0(y20Var);
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    /* JADX INFO: renamed from: E */
    public final void m73017E() {
        if (this.f48606c == null) {
            init();
        }
        if (this.f48606c.isShowing()) {
            return;
        }
        this.f48606c.m72960i0(this.f48610g);
        this.f48606c.show();
    }

    @Override // p153l.iam
    public void destroy() {
        mo73021p();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public final boolean isShowing() {
        DialogC12774a dialogC12774a = this.f48606c;
        return dialogC12774a != null && dialogC12774a.isShowing();
    }

    /* JADX INFO: renamed from: l */
    public void mo73018l() {
    }

    /* JADX INFO: renamed from: m */
    public void mo73019m(View view) {
    }

    /* JADX INFO: renamed from: p */
    public void mo73021p() {
        DialogC12774a dialogC12774a = this.f48606c;
        if (dialogC12774a == null || !dialogC12774a.isShowing()) {
            return;
        }
        this.f48606c.dismiss();
    }

    /* JADX INFO: renamed from: q */
    public final void m73022q(x20 x20Var) {
        DialogC12774a dialogC12774a = this.f48606c;
        if (dialogC12774a == null || !dialogC12774a.isShowing()) {
            return;
        }
        this.f48606c.m72962k0(x20Var);
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m73023s(DialogInterface dialogInterface) {
        this.f48605b.mo96837P3();
        mo73025x();
    }

    /* JADX INFO: renamed from: w */
    public void mo73024w() {
    }

    /* JADX INFO: renamed from: x */
    public void mo73025x() {
    }

    /* JADX INFO: renamed from: y */
    public void m73026y(DialogC12774a.c cVar) {
        DialogC12774a dialogC12774a = this.f48606c;
        if (dialogC12774a != null) {
            dialogC12774a.setCancelable(false);
            this.f48606c.m72957f0(cVar);
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m73027z(LiveDialogEnum liveDialogEnum) {
        this.f48611h = liveDialogEnum;
        DialogC12774a dialogC12774a = this.f48606c;
        if (dialogC12774a != null) {
            dialogC12774a.m72961j0(liveDialogEnum);
        }
    }

    public LiveMenuDialogHolder(@LayoutRes int i, @StyleRes int i2, Act act, @NonNull T t) {
        this(i, act, t);
        this.f48613j = i2;
    }

    public LiveMenuDialogHolder(@LayoutRes int i, Act act, @NonNull T t, rq2 rq2Var) {
        this(i, act, t);
        this.f48609f = rq2Var;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(T t) {
    }
}
