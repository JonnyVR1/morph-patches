package p153l;

import android.hardware.Camera;
import android.os.Handler;

/* JADX INFO: loaded from: classes2.dex */
public final class te1 implements Camera.AutoFocusCallback {

    /* JADX INFO: renamed from: a */
    private Handler f173421a;

    /* JADX INFO: renamed from: b */
    private int f173422b;

    /* JADX INFO: renamed from: a */
    public void m190675a(Handler handler, int i) {
        this.f173421a = handler;
        this.f173422b = i;
    }

    @Override // android.hardware.Camera.AutoFocusCallback
    public void onAutoFocus(boolean z, Camera camera) {
        Handler handler = this.f173421a;
        if (handler != null) {
            this.f173421a.sendMessageDelayed(handler.obtainMessage(this.f173422b, Boolean.valueOf(z)), 1500L);
            this.f173421a = null;
        }
    }
}
