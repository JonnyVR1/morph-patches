package p153l;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import com.google.android.gms.ads.internal.util.C2098b;

/* JADX INFO: loaded from: classes6.dex */
public final class s4s0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Context f166272a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f166273b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f166274c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f166275d;

    public s4s0(d6s0 d6s0Var, Context context, String str, boolean z, boolean z2) {
        this.f166272a = context;
        this.f166273b = str;
        this.f166274c = z;
        this.f166275d = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bxy0.m106934r();
        AlertDialog.Builder builderM12371j = C2098b.m12371j(this.f166272a);
        builderM12371j.setMessage(this.f166273b);
        if (this.f166274c) {
            builderM12371j.setTitle("Error");
        } else {
            builderM12371j.setTitle("Info");
        }
        if (this.f166275d) {
            builderM12371j.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            builderM12371j.setPositiveButton("Learn More", new k3s0(this));
            builderM12371j.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        builderM12371j.create().show();
    }
}
