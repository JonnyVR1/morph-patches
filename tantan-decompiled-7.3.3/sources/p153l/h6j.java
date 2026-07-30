package p153l;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import com.momo.mcamera.mask.BigEyeFilter;

/* JADX INFO: loaded from: classes3.dex */
public class h6j extends g6j {

    /* JADX INFO: renamed from: m */
    protected int f108032m;

    /* JADX INFO: renamed from: n */
    protected float[] f108033n = {-1.0f, -1.0f, 0.0f, 1.0f, 1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f};

    @Override // p153l.g6j
    /* JADX INFO: renamed from: R1 */
    public synchronized void mo129266R1(Bitmap bitmap) {
        super.mo129266R1(bitmap);
    }

    @Override // p153l.g6j
    public synchronized int bitmapToTexture(Bitmap bitmap) {
        int[] iArr;
        try {
            iArr = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            GLES20.glBindTexture(3553, iArr[0]);
            GLES20.glTexParameterf(3553, 10240, 9987.0f);
            GLES20.glTexParameterf(3553, 10241, 9987.0f);
            GLES20.glTexParameterf(3553, 10242, 33071.0f);
            GLES20.glTexParameterf(3553, 10243, 33071.0f);
            if (bitmap != null) {
                GLUtils.texImage2D(3553, 0, bitmap, 0);
            }
            GLES20.glGenerateMipmap(3553);
        } catch (Throwable th) {
            throw th;
        }
        return iArr[0];
    }

    @Override // p153l.g6j, p153l.wej
    public String getFragmentShader() {
        return "precision highp float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\n  uniform float scale;\nvec2 scaleFromCenter(vec2 coord, float scale) {\n  if (scale > 1.0 || scale < 0.0) { return coord; }\n  vec2 scaleCenter = vec2(0.5);\n  return (coord - scaleCenter) * scale + scaleCenter;\n}\nvoid main(){\n    vec2 uv = textureCoordinate;\n    uv.y = 1.0 - uv.y;\n    if (uv.x >=  0.0  && uv.x <= 1.0        && uv.y >= 0.0 && uv.y <= 1.0) {\n    gl_FragColor = texture2D(inputImageTexture0, uv);\n    } else {\n    vec2 newCoord = scaleFromCenter(uv, scale);\n    gl_FragColor = texture2D(inputImageTexture0,newCoord, 7.0);\n    }\n}\n";
    }

    @Override // p153l.wej
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f108032m = GLES20.glGetUniformLocation(this.programHandle, BigEyeFilter.UNIFORM_SCALE);
    }

    @Override // p153l.g6j, p153l.wej
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glUniform1f(this.f108032m, (getWidth() / getHeight()) * (this.f102456d / this.f102455c));
    }
}
