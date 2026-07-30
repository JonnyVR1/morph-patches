package p149l;

import android.graphics.Point;
import android.hardware.Camera;
import android.os.Handler;

/* JADX INFO: loaded from: classes2.dex */
public final class ki80 implements Camera.PreviewCallback {

    /* JADX INFO: renamed from: a */
    private final n84 f123278a;

    /* JADX INFO: renamed from: b */
    private final boolean f123279b;

    /* JADX INFO: renamed from: c */
    private Handler f123280c;

    /* JADX INFO: renamed from: d */
    private int f123281d;

    public ki80(n84 n84Var, boolean z) {
        this.f123278a = n84Var;
        this.f123279b = z;
    }

    /* JADX INFO: renamed from: a */
    public void m146054a(Handler handler, int i) {
        this.f123280c = handler;
        this.f123281d = i;
    }

    @Override // android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] bArr, Camera camera) {
        Point pointM158182c = this.f123278a.m158182c();
        if (!this.f123279b) {
            camera.setPreviewCallback(null);
        }
        Handler handler = this.f123280c;
        if (handler != null) {
            handler.obtainMessage(this.f123281d, pointM158182c.x, pointM158182c.y, bArr).sendToTarget();
            this.f123280c = null;
        }
    }
}
