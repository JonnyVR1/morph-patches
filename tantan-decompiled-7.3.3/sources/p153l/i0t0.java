package p153l;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes6.dex */
public final class i0t0 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ j0t0 f112451a;

    public i0t0(j0t0 j0t0Var) {
        this.f112451a = j0t0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f112451a.m183979c("Operation denied by user.");
    }
}
