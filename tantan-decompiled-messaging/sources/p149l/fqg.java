package p149l;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.Window;

/* JADX INFO: loaded from: classes12.dex */
public class fqg extends Dialog {

    /* JADX INFO: renamed from: a */
    public cwf0 f98806a;

    public fqg(Context context) {
        super(context, a8c0.f68024m);
        this.f98806a = i0e.m133794c("p_pick_topic", Dialog.class.getName());
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window == null) {
            return;
        }
        window.setGravity(81);
        window.setWindowAnimations(a8c0.f68026o);
        getWindow().setLayout(-1, -2);
        getWindow().setBackgroundDrawableResource(R.color.transparent);
        setCanceledOnTouchOutside(true);
    }
}
