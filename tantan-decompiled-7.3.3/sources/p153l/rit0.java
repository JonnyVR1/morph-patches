package p153l;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* JADX INFO: loaded from: classes6.dex */
public final class rit0 implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ JsPromptResult f163394a;

    public rit0(JsPromptResult jsPromptResult) {
        this.f163394a = jsPromptResult;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f163394a.cancel();
    }
}
