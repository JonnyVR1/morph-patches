package p153l;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes6.dex */
public final class o0t0 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ p0t0 f144575a;

    public o0t0(p0t0 p0t0Var) {
        this.f144575a = p0t0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f144575a.m183979c("User canceled the download.");
    }
}
