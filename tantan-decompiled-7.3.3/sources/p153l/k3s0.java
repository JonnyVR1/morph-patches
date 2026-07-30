package p153l;

import android.content.DialogInterface;
import android.net.Uri;
import com.google.android.gms.ads.internal.util.C2098b;

/* JADX INFO: loaded from: classes6.dex */
public final class k3s0 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ s4s0 f123771a;

    public k3s0(s4s0 s4s0Var) {
        this.f123771a = s4s0Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        bxy0.m106934r();
        C2098b.m12381t(this.f123771a.f166272a, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
    }
}
