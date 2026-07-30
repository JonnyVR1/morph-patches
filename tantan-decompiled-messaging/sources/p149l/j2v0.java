package p149l;

import android.app.AlertDialog;
import com.google.android.gms.ads.internal.overlay.BinderC2073b;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes6.dex */
public final class j2v0 extends TimerTask {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AlertDialog f115971a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Timer f115972b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ BinderC2073b f115973c;

    public j2v0(k2v0 k2v0Var, AlertDialog alertDialog, Timer timer, BinderC2073b binderC2073b) {
        this.f115971a = alertDialog;
        this.f115972b = timer;
        this.f115973c = binderC2073b;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.f115971a.dismiss();
        this.f115972b.cancel();
        BinderC2073b binderC2073b = this.f115973c;
        if (binderC2073b != null) {
            binderC2073b.zzb();
        }
    }
}
