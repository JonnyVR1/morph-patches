package p149l;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* JADX INFO: loaded from: classes6.dex */
public final class i9t0 implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ JsResult f112257a;

    public i9t0(JsResult jsResult) {
        this.f112257a = jsResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f112257a.cancel();
    }
}
