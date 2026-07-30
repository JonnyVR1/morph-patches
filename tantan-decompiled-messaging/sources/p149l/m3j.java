package p149l;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import com.momo.mcamera.mask.BigEyeFilter;

/* JADX INFO: loaded from: classes3.dex */
public class m3j extends l3j {

    /* JADX INFO: renamed from: m */
    protected int f131097m;

    /* JADX INFO: renamed from: n */
    protected float[] f131098n = {-1.0f, -1.0f, 0.0f, 1.0f, 1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f};

    @Override // p149l.l3j
    /* JADX INFO: renamed from: R1 */
    public synchronized void mo148397R1(Bitmap bitmap) {
        super.mo148397R1(bitmap);
    }

    @Override // p149l.l3j
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

    @Override // p149l.l3j, p149l.ccj
    public String getFragmentShader() {
        return "precision highp float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\n  uniform float scale;\nvec2 scaleFromCenter(vec2 coord, float scale) {\n  if (scale > 1.0 || scale < 0.0) { return coord; }\n  vec2 scaleCenter = vec2(0.5);\n  return (coord - scaleCenter) * scale + scaleCenter;\n}\nvoid main(){\n    vec2 uv = textureCoordinate;\n    uv.y = 1.0 - uv.y;\n    if (uv.x >=  0.0  && uv.x <= 1.0        && uv.y >= 0.0 && uv.y <= 1.0) {\n    gl_FragColor = texture2D(inputImageTexture0, uv);\n    } else {\n    vec2 newCoord = scaleFromCenter(uv, scale);\n    gl_FragColor = texture2D(inputImageTexture0,newCoord, 7.0);\n    }\n}\n";
    }

    @Override // p149l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f131097m = GLES20.glGetUniformLocation(this.programHandle, BigEyeFilter.UNIFORM_SCALE);
    }

    @Override // p149l.l3j, p149l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glUniform1f(this.f131097m, (getWidth() / getHeight()) * (this.f125913d / this.f125912c));
    }
}
