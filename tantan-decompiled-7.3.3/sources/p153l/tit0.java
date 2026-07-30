package p153l;

import android.content.DialogInterface;
import android.webkit.JsPromptResult;
import android.widget.EditText;

/* JADX INFO: loaded from: classes6.dex */
public final class tit0 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ JsPromptResult f174508a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ EditText f174509b;

    public tit0(JsPromptResult jsPromptResult, EditText editText) {
        this.f174508a = jsPromptResult;
        this.f174509b = editText;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f174508a.confirm(this.f174509b.getText().toString());
    }
}
