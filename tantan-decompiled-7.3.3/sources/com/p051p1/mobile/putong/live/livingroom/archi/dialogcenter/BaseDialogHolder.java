package com.p051p1.mobile.putong.live.livingroom.archi.dialogcenter;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import p153l.c0s;
import p153l.hj2;
import p153l.isl;
import p153l.obc0;
import p153l.yec0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BaseDialogHolder<P extends hj2, T> implements isl<P, T> {

    /* JADX INFO: renamed from: a */
    public DialogC12774a f48553a;

    /* JADX INFO: renamed from: b */
    public P f48554b;

    /* JADX INFO: renamed from: c */
    public boolean f48555c;

    /* JADX INFO: renamed from: d */
    public boolean f48556d;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m72904n(View view) {
        mo72910j();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f48554b.act();
    }

    @Override // p153l.isl
    /* JADX INFO: renamed from: F0 */
    public void mo72905F0(boolean z) {
        this.f48556d = z;
        if (!NullChecker.m82486a(this.f48553a) || this.f48553a.isShowing()) {
            return;
        }
        this.f48553a.show();
    }

    @Override // p153l.iam
    public Act act() {
        return this.f48554b.act();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(P p) {
        this.f48554b = p;
    }

    @Override // p153l.iam
    public void destroy() {
        mo72910j();
    }

    /* JADX INFO: renamed from: e */
    public boolean mo72907e() {
        return true;
    }

    /* JADX INFO: renamed from: f */
    public void mo72908f() {
        if (NullChecker.m82486a(this.f48554b)) {
            this.f48554b.mo135320M3();
        }
    }

    /* JADX INFO: renamed from: i */
    public LiveDialogEnum m72909i() {
        return LiveDialogEnum.UNKNOWN;
    }

    @Override // p153l.isl
    public void init() {
        Act actM72913m = m72913m();
        if (this.f48555c || !NullChecker.m82486a(actM72913m)) {
            return;
        }
        DialogContentView dialogContentView = (DialogContentView) actM72913m.inflater().inflate(yec0.f199264u0, (ViewGroup) null);
        dialogContentView.m72919R(this.f48556d);
        if (mo72907e()) {
            dialogContentView.setShadowClick(new View.OnClickListener() { // from class: l.fj2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f99293a.m72904n(view);
                }
            });
        }
        dialogContentView.setContentBackground(mo72911k());
        dialogContentView.m72918Q(inflateView(actM72913m.inflater(), null));
        if (this.f48553a == null) {
            c0s c0sVar = new c0s(this.f48554b, dialogContentView);
            this.f48553a = c0sVar;
            c0sVar.m72961j0(m72909i());
        }
        this.f48553a.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.gj2
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f104548a.m72914p(dialogInterface);
            }
        });
        this.f48555c = true;
    }

    @Override // p153l.isl
    public boolean isShowing() {
        return NullChecker.m82486a(this.f48553a) && this.f48553a.isShowing();
    }

    /* JADX INFO: renamed from: j */
    public void mo72910j() {
        if (NullChecker.m82486a(this.f48553a) && this.f48553a.isShowing()) {
            this.f48553a.dismiss();
        }
    }

    @DrawableRes
    /* JADX INFO: renamed from: k */
    public int mo72911k() {
        return obc0.f146363i1;
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public View m72912l() {
        DialogC12774a dialogC12774a = this.f48553a;
        if (dialogC12774a != null) {
            return dialogC12774a.m72943R();
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public Act m72913m() {
        Act act = act();
        if (act == null || act.isFinishing()) {
            return null;
        }
        return act;
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m72914p(DialogInterface dialogInterface) {
        mo72908f();
    }

    /* JADX INFO: renamed from: q */
    public void m72915q(T t) {
    }

    /* JADX INFO: renamed from: s */
    public void m72916s(DialogC12774a.c cVar) {
        this.f48553a.setCancelable(false);
        this.f48553a.m72957f0(cVar);
    }
}
