package p007l;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.Window;
import l.cwf0;
import l.i0e;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class fqg extends Dialog {

    /* JADX INFO: renamed from: a */
    public cwf0 f8191a;

    public fqg(Context context) {
        super(context, a8c0.f5644m);
        this.f8191a = i0e.c("p_pick_topic", Dialog.class.getName());
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window == null) {
            return;
        }
        window.setGravity(81);
        window.setWindowAnimations(a8c0.f5646o);
        getWindow().setLayout(-1, -2);
        getWindow().setBackgroundDrawableResource(R.color.transparent);
        setCanceledOnTouchOutside(true);
    }
}
