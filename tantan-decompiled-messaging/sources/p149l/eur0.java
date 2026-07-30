package p149l;

import android.content.DialogInterface;
import android.net.Uri;
import com.google.android.gms.ads.internal.util.C2075b;

/* JADX INFO: loaded from: classes6.dex */
public final class eur0 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ mvr0 f93271a;

    public eur0(mvr0 mvr0Var) {
        this.f93271a = mvr0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        vny0.m199080r();
        C2075b.m12327t(this.f93271a.f135971a, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
    }
}
