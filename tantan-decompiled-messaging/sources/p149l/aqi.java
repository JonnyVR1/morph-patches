package p149l;

import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class aqi extends ts2 {
    public aqi(int i) {
        m98299Q1(i);
    }

    /* JADX INFO: renamed from: Q1 */
    private void m98299Q1(int i) {
        float f;
        float f2;
        FloatBuffer[] floatBufferArr = new FloatBuffer[4];
        this.textureVertices = floatBufferArr;
        float f3 = 0.0f;
        float f4 = 1.0f;
        if (i == 0) {
            f = 0.0f;
            f2 = 1.0f;
            f4 = 0.0f;
            f3 = 1.0f;
        } else if (i == 1) {
            f2 = 0.0f;
            f = 1.0f;
        } else if (i != 2) {
            f = 1.0f;
            f2 = 1.0f;
            f4 = 0.0f;
        } else {
            f = 0.0f;
            f2 = 0.0f;
            f3 = 1.0f;
        }
        floatBufferArr[0] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.textureVertices[0].put(new float[]{f3, f4, f, f4, f3, f2, f, f2}).position(0);
        this.textureVertices[1] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.textureVertices[1].put(new float[]{f4, f, f4, f3, f2, f, f2, f3}).position(0);
        this.textureVertices[2] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.textureVertices[2].put(new float[]{f, f2, f3, f2, f, f4, f3, f4}).position(0);
        this.textureVertices[3] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.textureVertices[3].put(new float[]{f2, f3, f2, f, f4, f3, f4, f}).position(0);
        for (int i2 = 0; i2 < 4; i2++) {
        }
    }

    @Override // p149l.mcj, p149l.ccj
    public void destroy() {
        super.destroy();
        int i = this.texture_in;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.texture_in = 0;
        }
    }
}
