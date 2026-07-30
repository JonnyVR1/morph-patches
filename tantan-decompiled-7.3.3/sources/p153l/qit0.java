package p153l;

import android.content.DialogInterface;
import android.webkit.JsResult;

/* JADX INFO: loaded from: classes6.dex */
public final class qit0 implements DialogInterface.OnClickListener {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ JsResult f157886a;

    public qit0(JsResult jsResult) {
        this.f157886a = jsResult;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.f157886a.confirm();
    }
}
