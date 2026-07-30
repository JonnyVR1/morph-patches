package p149l;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.widget.EditText;

/* JADX INFO: loaded from: classes6.dex */
public final class n9t0 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ JsPromptResult f137833a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ EditText f137834b;

    public n9t0(JsPromptResult jsPromptResult, EditText editText) {
        this.f137833a = jsPromptResult;
        this.f137834b = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f137833a.confirm(this.f137834b.getText().toString());
    }
}
