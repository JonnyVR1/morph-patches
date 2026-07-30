package p153l;

import android.app.AlertDialog;
import com.google.android.gms.ads.internal.overlay.BinderC2096b;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes6.dex */
public final class pbv0 extends TimerTask {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ AlertDialog f151433a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Timer f151434b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ BinderC2096b f151435c;

    public pbv0(qbv0 qbv0Var, AlertDialog alertDialog, Timer timer, BinderC2096b binderC2096b) {
        this.f151433a = alertDialog;
        this.f151434b = timer;
        this.f151435c = binderC2096b;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        this.f151433a.dismiss();
        this.f151434b.cancel();
        BinderC2096b binderC2096b = this.f151435c;
        if (binderC2096b != null) {
            binderC2096b.zzb();
        }
    }
}
