package p149l;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* JADX INFO: loaded from: classes6.dex */
public final class j9t0 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ JsResult f116962a;

    public j9t0(JsResult jsResult) {
        this.f116962a = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f116962a.cancel();
    }
}
