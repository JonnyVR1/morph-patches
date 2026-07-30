package p149l;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* JADX INFO: loaded from: classes6.dex */
public final class l9t0 implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ JsPromptResult f127145a;

    public l9t0(JsPromptResult jsPromptResult) {
        this.f127145a = jsPromptResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f127145a.cancel();
    }
}
