package p149l;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.opengl.GLES20;
import java.nio.IntBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class p3j extends ts2 {

    /* JADX INFO: renamed from: a */
    private boolean f146988a = true;

    /* JADX INFO: renamed from: l.p3j$a */
    public interface InterfaceC19124a {
    }

    @Override // p149l.mcj
    public void drawSub() {
        super.drawSub();
        if (this.f146988a) {
            int width = getWidth();
            int height = getHeight();
            if (height <= 0 || width <= 0) {
                this.f146988a = false;
                return;
            }
            IntBuffer intBufferAllocate = IntBuffer.allocate(width * height);
            GLES20.glReadPixels(0, 0, width, height, 6408, 5121, intBufferAllocate);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            bitmapCreateBitmap.copyPixelsFromBuffer(intBufferAllocate);
            Matrix matrix = new Matrix();
            matrix.postScale(1.0f, -1.0f);
            matrix.postRotate(0.0f);
            Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, width, height, matrix, true);
            throw null;
        }
    }

    /* JADX INFO: renamed from: Q1 */
    public void m167249Q1(InterfaceC19124a interfaceC19124a) {
    }
}
