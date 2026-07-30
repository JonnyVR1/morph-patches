package p153l;

import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.gms.ads.internal.util.C2098b;

/* JADX INFO: loaded from: classes6.dex */
public final class h0t0 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ j0t0 f107330a;

    public h0t0(j0t0 j0t0Var) {
        this.f107330a = j0t0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        j0t0 j0t0Var = this.f107330a;
        Intent intentM143003i = j0t0Var.m143003i();
        bxy0.m106934r();
        C2098b.m12380s(j0t0Var.f117851d, intentM143003i);
    }
}
