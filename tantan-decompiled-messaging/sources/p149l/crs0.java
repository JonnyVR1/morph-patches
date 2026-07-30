package p149l;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes6.dex */
public final class crs0 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ drs0 f82305a;

    public crs0(drs0 drs0Var) {
        this.f82305a = drs0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f82305a.m156080c("Operation denied by user.");
    }
}
