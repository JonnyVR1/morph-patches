package com.p046p1.mobile.putong.live.livingroom.archi.dialogcenter;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import p149l.byr;
import p149l.i3c0;
import p149l.t6c0;
import p149l.vpl;
import p149l.zi2;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BaseDialogHolder<P extends zi2, T> implements vpl<P, T> {

    /* JADX INFO: renamed from: a */
    public DialogC12611a f47705a;

    /* JADX INFO: renamed from: b */
    public P f47706b;

    /* JADX INFO: renamed from: c */
    public boolean f47707c;

    /* JADX INFO: renamed from: d */
    public boolean f47708d;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m71721n(View view) {
        mo71727j();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f47706b.act();
    }

    @Override // p149l.vpl
    /* JADX INFO: renamed from: F0 */
    public void mo71722F0(boolean z) {
        this.f47708d = z;
        if (!NullChecker.m81303a(this.f47705a) || this.f47705a.isShowing()) {
            return;
        }
        this.f47705a.show();
    }

    @Override // p149l.s7m
    public Act act() {
        return this.f47706b.act();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(P p) {
        this.f47706b = p;
    }

    @Override // p149l.s7m
    public void destroy() {
        mo71727j();
    }

    /* JADX INFO: renamed from: e */
    public boolean mo71724e() {
        return true;
    }

    /* JADX INFO: renamed from: f */
    public void mo71725f() {
        if (NullChecker.m81303a(this.f47706b)) {
            this.f47706b.mo138009M3();
        }
    }

    /* JADX INFO: renamed from: i */
    public LiveDialogEnum m71726i() {
        return LiveDialogEnum.UNKNOWN;
    }

    @Override // p149l.vpl
    public void init() {
        Act actM71730m = m71730m();
        if (this.f47707c || !NullChecker.m81303a(actM71730m)) {
            return;
        }
        DialogContentView dialogContentView = (DialogContentView) actM71730m.inflater().inflate(t6c0.f168532u0, (ViewGroup) null);
        dialogContentView.m71736R(this.f47708d);
        if (mo71724e()) {
            dialogContentView.setShadowClick(new View.OnClickListener() { // from class: l.xi2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f192956a.m71721n(view);
                }
            });
        }
        dialogContentView.setContentBackground(mo71728k());
        dialogContentView.m71735Q(inflateView(actM71730m.inflater(), null));
        if (this.f47705a == null) {
            byr byrVar = new byr(this.f47706b, dialogContentView);
            this.f47705a = byrVar;
            byrVar.m71778j0(m71726i());
        }
        this.f47705a.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.yi2
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f198438a.m71731p(dialogInterface);
            }
        });
        this.f47707c = true;
    }

    @Override // p149l.vpl
    public boolean isShowing() {
        return NullChecker.m81303a(this.f47705a) && this.f47705a.isShowing();
    }

    /* JADX INFO: renamed from: j */
    public void mo71727j() {
        if (NullChecker.m81303a(this.f47705a) && this.f47705a.isShowing()) {
            this.f47705a.dismiss();
        }
    }

    @DrawableRes
    /* JADX INFO: renamed from: k */
    public int mo71728k() {
        return i3c0.f111035i1;
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public View m71729l() {
        DialogC12611a dialogC12611a = this.f47705a;
        if (dialogC12611a != null) {
            return dialogC12611a.m71760R();
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public Act m71730m() {
        Act act = act();
        if (act == null || act.isFinishing()) {
            return null;
        }
        return act;
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m71731p(DialogInterface dialogInterface) {
        mo71725f();
    }

    /* JADX INFO: renamed from: q */
    public void m71732q(T t) {
    }

    /* JADX INFO: renamed from: s */
    public void m71733s(DialogC12611a.c cVar) {
        this.f47705a.setCancelable(false);
        this.f47705a.m71774f0(cVar);
    }
}
