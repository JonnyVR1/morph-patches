package p153l;

import android.R;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.Window;

/* JADX INFO: loaded from: classes13.dex */
public class urg extends Dialog {

    /* JADX INFO: renamed from: a */
    public l4g0 f180614a;

    public urg(Context context) {
        super(context, fgc0.f98910m);
        this.f180614a = w1e.m204399c("p_pick_topic", Dialog.class.getName());
    }

    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Window window = getWindow();
        if (window == null) {
            return;
        }
        window.setGravity(81);
        window.setWindowAnimations(fgc0.f98912o);
        getWindow().setLayout(-1, -2);
        getWindow().setBackgroundDrawableResource(R.color.transparent);
        setCanceledOnTouchOutside(true);
    }
}
