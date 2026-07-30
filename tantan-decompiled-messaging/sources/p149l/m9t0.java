package p149l;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;

/* JADX INFO: loaded from: classes6.dex */
public final class m9t0 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ JsPromptResult f132801a;

    public m9t0(JsPromptResult jsPromptResult) {
        this.f132801a = jsPromptResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f132801a.cancel();
    }
}
