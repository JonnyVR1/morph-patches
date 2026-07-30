package p153l;

import android.app.Activity;
import android.content.DialogInterface;

/* JADX INFO: loaded from: classes2.dex */
public final class moi implements DialogInterface.OnClickListener, DialogInterface.OnCancelListener, Runnable {

    /* JADX INFO: renamed from: a */
    private final Activity f137829a;

    public moi(Activity activity) {
        this.f137829a = activity;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
        run();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        run();
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f137829a.finish();
    }
}
