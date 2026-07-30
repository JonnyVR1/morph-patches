package com.p000p1.mobile.putong.live.livingroom.archi.dialogcenter;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.DrawableRes;
import androidx.annotation.Nullable;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.utils.NullChecker;
import p002l.byr;
import p002l.i3c0;
import p002l.t6c0;
import p002l.vpl;
import p002l.zi2;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public abstract class BaseDialogHolder<P extends zi2, T> implements vpl<P, T> {

    /* JADX INFO: renamed from: a */
    public C0200a f3747a;

    /* JADX INFO: renamed from: b */
    public P f3748b;

    /* JADX INFO: renamed from: c */
    public boolean f3749c;

    /* JADX INFO: renamed from: d */
    public boolean f3750d;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m5087n(View view) {
        mo5095j();
    }

    /* JADX INFO: renamed from: C0 */
    public Context m5088C0() {
        return this.f3748b.act();
    }

    @Override // p002l.vpl
    /* JADX INFO: renamed from: F0 */
    public void mo5089F0(boolean z) {
        this.f3750d = z;
        if (!NullChecker.a(this.f3747a) || this.f3747a.isShowing()) {
            return;
        }
        this.f3747a.show();
    }

    public Act act() {
        return this.f3748b.act();
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void m5094i1(P p) {
        this.f3748b = p;
    }

    public void destroy() {
        mo5095j();
    }

    /* JADX INFO: renamed from: e */
    public boolean m5091e() {
        return true;
    }

    /* JADX INFO: renamed from: f */
    public void m5092f() {
        if (NullChecker.a(this.f3748b)) {
            this.f3748b.mo15348M3();
        }
    }

    /* JADX INFO: renamed from: i */
    public LiveDialogEnum m5093i() {
        return LiveDialogEnum.UNKNOWN;
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [android.view.View, com.p1.mobile.putong.live.livingroom.archi.dialogcenter.DialogContentView] */
    @Override // p002l.vpl
    public void init() {
        Act actM5098m = m5098m();
        if (this.f3749c || !NullChecker.a(actM5098m)) {
            return;
        }
        ?? r1 = (DialogContentView) actM5098m.inflater().inflate(t6c0.f20028u0, (ViewGroup) null);
        r1.m5104R(this.f3750d);
        if (m5091e()) {
            r1.setShadowClick(new View.OnClickListener() { // from class: l.xi2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f22288a.m5087n(view);
                }
            });
        }
        r1.setContentBackground(mo5096k());
        r1.m5103Q(inflateView(actM5098m.inflater(), (ViewGroup) null));
        if (this.f3747a == null) {
            byr byrVar = new byr(this.f3748b, (View) r1);
            this.f3747a = byrVar;
            byrVar.m5146j0(m5093i());
        }
        this.f3747a.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.yi2
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f22895a.m5099p(dialogInterface);
            }
        });
        this.f3749c = true;
    }

    @Override // p002l.vpl
    public boolean isShowing() {
        return NullChecker.a(this.f3747a) && this.f3747a.isShowing();
    }

    /* JADX INFO: renamed from: j */
    public void mo5095j() {
        if (NullChecker.a(this.f3747a) && this.f3747a.isShowing()) {
            this.f3747a.dismiss();
        }
    }

    @DrawableRes
    /* JADX INFO: renamed from: k */
    public int mo5096k() {
        return i3c0.f12820i1;
    }

    @Nullable
    /* JADX INFO: renamed from: l */
    public View m5097l() {
        C0200a c0200a = this.f3747a;
        if (c0200a != null) {
            return c0200a.m5128R();
        }
        return null;
    }

    /* JADX INFO: renamed from: m */
    public Act m5098m() {
        Act act = act();
        if (act == null || act.isFinishing()) {
            return null;
        }
        return act;
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m5099p(DialogInterface dialogInterface) {
        m5092f();
    }

    /* JADX INFO: renamed from: q */
    public void m5100q(T t) {
    }

    /* JADX INFO: renamed from: s */
    public void m5101s(C0200a.c cVar) {
        this.f3747a.setCancelable(false);
        this.f3747a.m5142f0(cVar);
    }
}
