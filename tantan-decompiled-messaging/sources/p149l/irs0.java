package p149l;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes6.dex */
public final class irs0 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ jrs0 f114679a;

    public irs0(jrs0 jrs0Var) {
        this.f114679a = jrs0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f114679a.m156080c("User canceled the download.");
    }
}
