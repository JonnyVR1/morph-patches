package p149l;

import android.os.RemoteException;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes6.dex */
public final class oos0 implements wyx {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ dos0 f144906a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ f80 f144907b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vos0 f144908c;

    public oos0(vos0 vos0Var, dos0 dos0Var, f80 f80Var) {
        this.f144906a = dos0Var;
        this.f144907b = f80Var;
        this.f144908c = vos0Var;
    }

    @Override // p149l.wyx
    /* JADX INFO: renamed from: a */
    public final void mo127630a(@NonNull f70 f70Var) {
        try {
            x2t0.m206864b(this.f144907b.getClass().getCanonicalName() + "failed to load mediation ad: ErrorCode = " + f70Var.m119703a() + ". ErrorMessage = " + f70Var.m119705c() + ". ErrorDomain = " + f70Var.m119704b());
            this.f144906a.mo105942N4(f70Var.m119706d());
            this.f144906a.mo105938G0(f70Var.m119703a(), f70Var.m119705c());
            this.f144906a.zzg(f70Var.m119703a());
        } catch (RemoteException e) {
            x2t0.m206867e("", e);
        }
    }
}
