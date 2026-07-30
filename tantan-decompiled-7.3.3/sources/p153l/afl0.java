package p153l;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes7.dex */
public class afl0 extends it2 {

    /* JADX INFO: renamed from: E */
    public String f70922E = "mediump";

    /* JADX INFO: renamed from: F */
    private int f70923F = 0;

    /* JADX INFO: renamed from: G */
    private float[] f70924G = new float[8];

    /* JADX INFO: renamed from: H */
    private FloatBuffer f70925H = null;

    /* JADX INFO: renamed from: I */
    private float[] f70926I = new float[8];

    /* JADX INFO: renamed from: J */
    private FloatBuffer f70927J = null;

    /* JADX INFO: renamed from: Q */
    public void m97354Q(float[] fArr) {
        if (fArr == null || fArr.length != 8) {
            return;
        }
        float f = fArr[4];
        float f2 = fArr[5];
        float f3 = fArr[7];
        float f4 = 1.0f - (f2 + f3);
        float f5 = fArr[6] + f;
        float f6 = f3 + f4;
        float[] fArr2 = this.f70926I;
        fArr2[0] = f;
        fArr2[1] = f4;
        fArr2[2] = f5;
        fArr2[3] = f4;
        fArr2[4] = f;
        fArr2[5] = f6;
        fArr2[6] = f5;
        fArr2[7] = f6;
        float f7 = fArr[0];
        float f8 = fArr[1];
        float f9 = fArr[3];
        float f10 = 1.0f - (f8 + f9);
        float f11 = fArr[2] + f7;
        float f12 = f9 + f10;
        float[] fArr3 = this.f70924G;
        fArr3[0] = f7;
        fArr3[1] = f10;
        fArr3[2] = f11;
        fArr3[3] = f10;
        fArr3[4] = f7;
        fArr3[5] = f12;
        fArr3[6] = f11;
        fArr3[7] = f12;
    }

    @Override // p153l.ffj, p153l.vej
    /* JADX INFO: renamed from: i */
    public void mo97355i() {
        super.mo97355i();
    }

    @Override // p153l.vej
    /* JADX INFO: renamed from: p */
    public String mo97356p() {
        return "precision " + this.f70922E + " float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nvarying vec2 textureCoordinate1;\nvoid main(){\n   vec2 origin_uv = textureCoordinate;\n   vec2 mask_uv = textureCoordinate1;\n   vec4 color1 = texture2D(inputImageTexture0, origin_uv);\n   vec4 color2 = texture2D(inputImageTexture0, vec2(mask_uv.x, mask_uv.y));\n   color1.a = color2.r;    color1.rgb = color1.rgb * color2.r;    gl_FragColor = color1;\n}\n";
    }

    @Override // p153l.vej
    /* JADX INFO: renamed from: r */
    public String mo97357r() {
        return "attribute vec4 position;\nattribute vec2 inputTextureCoordinate;\nattribute vec2 inputTextureCoordinate1;\nvarying vec2 textureCoordinate;\nvarying vec2 textureCoordinate1;\nvoid main() {\n  textureCoordinate = inputTextureCoordinate;\n  textureCoordinate1 = inputTextureCoordinate1;\n   gl_Position = position;\n}\n";
    }

    @Override // p153l.vej
    /* JADX INFO: renamed from: u */
    public void mo97358u() {
        super.mo97358u();
        this.f70923F = GLES20.glGetAttribLocation(this.f183782d, "inputTextureCoordinate1");
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(this.f70924G.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f70925H = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(this.f70924G).position(0);
        FloatBuffer floatBufferAsFloatBuffer2 = ByteBuffer.allocateDirect(this.f70926I.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f70927J = floatBufferAsFloatBuffer2;
        floatBufferAsFloatBuffer2.put(this.f70926I).position(0);
    }

    @Override // p153l.vej
    /* JADX INFO: renamed from: x */
    public void mo97359x() {
        this.f183780b.position(0);
        GLES20.glVertexAttribPointer(this.f183784f, 2, 5126, false, 8, (Buffer) this.f183780b);
        GLES20.glEnableVertexAttribArray(this.f183784f);
        this.f70927J.position(0);
        GLES20.glVertexAttribPointer(this.f183785g, 2, 5126, false, 8, (Buffer) this.f70927J);
        GLES20.glEnableVertexAttribArray(this.f183785g);
        this.f70925H.position(0);
        GLES20.glVertexAttribPointer(this.f70923F, 2, 5126, false, 8, (Buffer) this.f70925H);
        GLES20.glEnableVertexAttribArray(this.f70923F);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.f183786h);
        GLES20.glUniform1i(this.f183783e, 0);
    }
}
