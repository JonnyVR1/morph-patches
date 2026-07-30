package p153l;

import android.graphics.Point;
import android.hardware.Camera;
import android.os.Handler;

/* JADX INFO: loaded from: classes2.dex */
public final class oq80 implements Camera.PreviewCallback {

    /* JADX INFO: renamed from: a */
    private final m94 f148557a;

    /* JADX INFO: renamed from: b */
    private final boolean f148558b;

    /* JADX INFO: renamed from: c */
    private Handler f148559c;

    /* JADX INFO: renamed from: d */
    private int f148560d;

    public oq80(m94 m94Var, boolean z) {
        this.f148557a = m94Var;
        this.f148558b = z;
    }

    /* JADX INFO: renamed from: a */
    public void m168798a(Handler handler, int i) {
        this.f148559c = handler;
        this.f148560d = i;
    }

    @Override // android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] bArr, Camera camera) {
        Point pointM157554c = this.f148557a.m157554c();
        if (!this.f148558b) {
            camera.setPreviewCallback(null);
        }
        Handler handler = this.f148559c;
        if (handler != null) {
            handler.obtainMessage(this.f148560d, pointM157554c.x, pointM157554c.y, bArr).sendToTarget();
            this.f148559c = null;
        }
    }
}
