package p149l;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes7.dex */
public class w5l0 extends ss2 {

    /* JADX INFO: renamed from: E */
    public String f184709E = "mediump";

    /* JADX INFO: renamed from: F */
    private int f184710F = 0;

    /* JADX INFO: renamed from: G */
    private float[] f184711G = new float[8];

    /* JADX INFO: renamed from: H */
    private FloatBuffer f184712H = null;

    /* JADX INFO: renamed from: I */
    private float[] f184713I = new float[8];

    /* JADX INFO: renamed from: J */
    private FloatBuffer f184714J = null;

    /* JADX INFO: renamed from: Q */
    public void m201646Q(float[] fArr) {
        if (fArr == null || fArr.length != 8) {
            return;
        }
        float f = fArr[4];
        float f2 = fArr[5];
        float f3 = fArr[7];
        float f4 = 1.0f - (f2 + f3);
        float f5 = fArr[6] + f;
        float f6 = f3 + f4;
        float[] fArr2 = this.f184713I;
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
        float[] fArr3 = this.f184711G;
        fArr3[0] = f7;
        fArr3[1] = f10;
        fArr3[2] = f11;
        fArr3[3] = f10;
        fArr3[4] = f7;
        fArr3[5] = f12;
        fArr3[6] = f11;
        fArr3[7] = f12;
    }

    @Override // p149l.lcj, p149l.bcj
    /* JADX INFO: renamed from: i */
    public void mo95685i() {
        super.mo95685i();
    }

    @Override // p149l.bcj
    /* JADX INFO: renamed from: p */
    public String mo95686p() {
        return "precision " + this.f184709E + " float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nvarying vec2 textureCoordinate1;\nvoid main(){\n   vec2 origin_uv = textureCoordinate;\n   vec2 mask_uv = textureCoordinate1;\n   vec4 color1 = texture2D(inputImageTexture0, origin_uv);\n   vec4 color2 = texture2D(inputImageTexture0, vec2(mask_uv.x, mask_uv.y));\n   color1.a = color2.r;    color1.rgb = color1.rgb * color2.r;    gl_FragColor = color1;\n}\n";
    }

    @Override // p149l.bcj
    /* JADX INFO: renamed from: r */
    public String mo95687r() {
        return "attribute vec4 position;\nattribute vec2 inputTextureCoordinate;\nattribute vec2 inputTextureCoordinate1;\nvarying vec2 textureCoordinate;\nvarying vec2 textureCoordinate1;\nvoid main() {\n  textureCoordinate = inputTextureCoordinate;\n  textureCoordinate1 = inputTextureCoordinate1;\n   gl_Position = position;\n}\n";
    }

    @Override // p149l.bcj
    /* JADX INFO: renamed from: u */
    public void mo95688u() {
        super.mo95688u();
        this.f184710F = GLES20.glGetAttribLocation(this.f74924d, "inputTextureCoordinate1");
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(this.f184711G.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f184712H = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(this.f184711G).position(0);
        FloatBuffer floatBufferAsFloatBuffer2 = ByteBuffer.allocateDirect(this.f184713I.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f184714J = floatBufferAsFloatBuffer2;
        floatBufferAsFloatBuffer2.put(this.f184713I).position(0);
    }

    @Override // p149l.bcj
    /* JADX INFO: renamed from: x */
    public void mo101089x() {
        this.f74922b.position(0);
        GLES20.glVertexAttribPointer(this.f74926f, 2, 5126, false, 8, (Buffer) this.f74922b);
        GLES20.glEnableVertexAttribArray(this.f74926f);
        this.f184714J.position(0);
        GLES20.glVertexAttribPointer(this.f74927g, 2, 5126, false, 8, (Buffer) this.f184714J);
        GLES20.glEnableVertexAttribArray(this.f74927g);
        this.f184712H.position(0);
        GLES20.glVertexAttribPointer(this.f184710F, 2, 5126, false, 8, (Buffer) this.f184712H);
        GLES20.glEnableVertexAttribArray(this.f184710F);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.f74928h);
        GLES20.glUniform1i(this.f74925e, 0);
    }
}
