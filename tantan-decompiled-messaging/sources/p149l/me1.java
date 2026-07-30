package p149l;

import android.hardware.Camera;
import android.os.Handler;

/* JADX INFO: loaded from: classes2.dex */
public final class me1 implements Camera.AutoFocusCallback {

    /* JADX INFO: renamed from: a */
    private Handler f133334a;

    /* JADX INFO: renamed from: b */
    private int f133335b;

    /* JADX INFO: renamed from: a */
    public void m154110a(Handler handler, int i) {
        this.f133334a = handler;
        this.f133335b = i;
    }

    @Override // android.hardware.Camera.AutoFocusCallback
    public void onAutoFocus(boolean z, Camera camera) {
        Handler handler = this.f133334a;
        if (handler != null) {
            this.f133334a.sendMessageDelayed(handler.obtainMessage(this.f133335b, Boolean.valueOf(z)), 1500L);
            this.f133334a = null;
        }
    }
}
