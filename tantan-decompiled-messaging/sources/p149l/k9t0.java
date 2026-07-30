package p149l;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* JADX INFO: loaded from: classes6.dex */
public final class k9t0 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ JsResult f122071a;

    public k9t0(JsResult jsResult) {
        this.f122071a = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f122071a.confirm();
    }
}
