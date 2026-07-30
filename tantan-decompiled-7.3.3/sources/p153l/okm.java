package p153l;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes3.dex */
public class okm extends jt2 {

    /* JADX INFO: renamed from: a */
    private FloatBuffer f147763a = null;

    /* JADX INFO: renamed from: b */
    private float f147764b = 1.0f;

    /* JADX INFO: renamed from: Q1 */
    private synchronized void m168040Q1() {
        try {
            float[] fArr = new float[8];
            this.textureVertices[this.curRotation].position(0);
            this.textureVertices[this.curRotation].get(fArr);
            float f = this.f147764b;
            float f2 = (1.0f - f) / 2.0f;
            float f3 = (1.0f - f) / 2.0f;
            this.f147763a = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
            if (this.curRotation % 2 != 0) {
                for (int i = 0; i < 4; i++) {
                    int i2 = i * 2;
                    float f4 = fArr[i2];
                    fArr[i2] = ((double) f4) < 0.5d ? f4 + f2 : f4 - f2;
                    int i3 = i2 + 1;
                    float f5 = fArr[i3];
                    fArr[i3] = ((double) f5) < 0.5d ? f5 + f3 : f5 - f3;
                }
            } else {
                for (int i4 = 0; i4 < 4; i4++) {
                    int i5 = i4 * 2;
                    float f6 = fArr[i5];
                    fArr[i5] = ((double) f6) < 0.5d ? f6 + f3 : f6 - f3;
                    int i6 = i5 + 1;
                    float f7 = fArr[i6];
                    fArr[i6] = ((double) f7) < 0.5d ? f7 + f2 : f7 - f2;
                }
            }
            this.f147763a.position(0);
            this.f147763a.put(fArr);
            this.f147763a.position(0);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: R1 */
    public synchronized void m168041R1(float f) {
        this.f147764b = f;
    }

    @Override // p153l.wej
    public void passShaderValues() {
        m168040Q1();
        if (this.f147763a == null) {
            super.passShaderValues();
            return;
        }
        this.renderVertices.position(0);
        GLES20.glVertexAttribPointer(this.positionHandle, 2, 5126, false, 8, (Buffer) this.renderVertices);
        GLES20.glEnableVertexAttribArray(this.positionHandle);
        this.f147763a.position(0);
        GLES20.glVertexAttribPointer(this.texCoordHandle, 2, 5126, false, 8, (Buffer) this.f147763a);
        GLES20.glEnableVertexAttribArray(this.texCoordHandle);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.texture_in);
        GLES20.glUniform1i(this.textureHandle, 0);
    }
}
