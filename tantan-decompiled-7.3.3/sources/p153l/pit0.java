package p153l;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* JADX INFO: loaded from: classes6.dex */
public final class pit0 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ JsResult f152617a;

    public pit0(JsResult jsResult) {
        this.f152617a = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f152617a.cancel();
    }
}
