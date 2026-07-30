package p153l;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.opengl.GLES20;
import java.nio.IntBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class k6j extends jt2 {

    /* JADX INFO: renamed from: a */
    private boolean f124184a = true;

    /* JADX INFO: renamed from: l.k6j$a */
    public interface InterfaceC18110a {
    }

    @Override // p153l.gfj
    public void drawSub() {
        super.drawSub();
        if (this.f124184a) {
            int width = getWidth();
            int height = getHeight();
            if (height <= 0 || width <= 0) {
                this.f124184a = false;
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
    public void m148517Q1(InterfaceC18110a interfaceC18110a) {
    }
}
