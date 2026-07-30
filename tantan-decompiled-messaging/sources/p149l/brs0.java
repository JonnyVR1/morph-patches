package p149l;

import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.gms.ads.internal.util.C2075b;

/* JADX INFO: loaded from: classes6.dex */
public final class brs0 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ drs0 f76939a;

    public brs0(drs0 drs0Var) {
        this.f76939a = drs0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        drs0 drs0Var = this.f76939a;
        Intent intentM113335i = drs0Var.m113335i();
        vny0.m199080r();
        C2075b.m12326s(drs0Var.f87666d, intentM113335i);
    }
}
