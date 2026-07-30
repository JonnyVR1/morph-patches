package p149l;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import com.google.android.gms.ads.internal.util.C2075b;

/* JADX INFO: loaded from: classes6.dex */
public final class mvr0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ Context f135971a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f135972b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ boolean f135973c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ boolean f135974d;

    public mvr0(xwr0 xwr0Var, Context context, String str, boolean z, boolean z2) {
        this.f135971a = context;
        this.f135972b = str;
        this.f135973c = z;
        this.f135974d = z2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vny0.m199080r();
        AlertDialog.Builder builderM12317j = C2075b.m12317j(this.f135971a);
        builderM12317j.setMessage(this.f135972b);
        if (this.f135973c) {
            builderM12317j.setTitle("Error");
        } else {
            builderM12317j.setTitle("Info");
        }
        if (this.f135974d) {
            builderM12317j.setNeutralButton("Dismiss", (DialogInterface.OnClickListener) null);
        } else {
            builderM12317j.setPositiveButton("Learn More", new eur0(this));
            builderM12317j.setNegativeButton("Dismiss", (DialogInterface.OnClickListener) null);
        }
        builderM12317j.create().show();
    }
}
