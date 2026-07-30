package com.tencent.liteav.beauty.p098b;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import com.tencent.liteav.basic.p093c.C14178h;
import com.tencent.liteav.basic.p093c.C14180j;
import java.nio.FloatBuffer;

/* JADX INFO: renamed from: com.tencent.liteav.beauty.b.m */
/* JADX INFO: loaded from: classes2.dex */
public class C14248m extends C14178h {

    /* JADX INFO: renamed from: A */
    private int f59588A;

    /* JADX INFO: renamed from: B */
    private float[] f59589B;

    /* JADX INFO: renamed from: C */
    private int f59590C;

    /* JADX INFO: renamed from: D */
    private float[] f59591D;

    /* JADX INFO: renamed from: r */
    private float f59592r;

    /* JADX INFO: renamed from: s */
    private Bitmap f59593s;

    /* JADX INFO: renamed from: t */
    private int f59594t;

    /* JADX INFO: renamed from: u */
    private int f59595u;

    /* JADX INFO: renamed from: v */
    private float f59596v;

    /* JADX INFO: renamed from: w */
    private Bitmap f59597w;

    /* JADX INFO: renamed from: x */
    private int f59598x;

    /* JADX INFO: renamed from: y */
    private int f59599y;

    /* JADX INFO: renamed from: z */
    private float f59600z;

    public C14248m(float f, Bitmap bitmap, float f2, Bitmap bitmap2, float f3) {
        this("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "varying highp vec2 textureCoordinate;\n \n uniform sampler2D inputImageTexture;\n uniform sampler2D inputImageTexture2; // lookup texture 1\n uniform sampler2D inputImageTexture3; // lookup texture 2\n \n \n uniform lowp vec3 v3_params;\n uniform lowp vec2 v2_texs;\n \n \n void main()\n {\n     lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n     \n     mediump float blueColor = textureColor.b * 63.0;\n     \n     mediump vec2 quad1;\n     quad1.y = floor(floor(blueColor) / 8.0);\n     quad1.x = floor(blueColor) - (quad1.y * 8.0);\n     \n     mediump vec2 quad2;\n     quad2.y = floor(ceil(blueColor) / 8.0);\n     quad2.x = ceil(blueColor) - (quad2.y * 8.0);\n     \n     highp vec2 texPos1;\n     texPos1.x = (quad1.x * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * textureColor.r);\n     texPos1.y = (quad1.y * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * textureColor.g);\n     \n     highp vec2 texPos2;\n     texPos2.x = (quad2.x * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * textureColor.r);\n     texPos2.y = (quad2.y * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * textureColor.g);\n     \n     lowp vec4 newColor1;\n     lowp vec4 newColor2;\n     if(textureCoordinate.x <= v3_params.x) { \n       if(v2_texs.x == 1.0) { \n         newColor1 = texture2D(inputImageTexture2, texPos1);\n         newColor2 = texture2D(inputImageTexture2, texPos2);\n         lowp vec4 newColor = mix(newColor1, newColor2, fract(blueColor));\n         gl_FragColor = mix(textureColor, vec4(newColor.rgb, textureColor.w), v3_params.y);\n       } else { \n         gl_FragColor = textureColor;\n       } \n     } else {\n       if(v2_texs.y == 1.0) { \n         newColor1 = texture2D(inputImageTexture3, texPos1);\n         newColor2 = texture2D(inputImageTexture3, texPos2);\n         lowp vec4 newColor = mix(newColor1, newColor2, fract(blueColor));\n         gl_FragColor = mix(textureColor, vec4(newColor.rgb, textureColor.w), v3_params.z);\n       } else { \n         gl_FragColor = textureColor;\n       } \n     }\n }");
        this.f59589B = new float[3];
        this.f59591D = new float[2];
        this.f59592r = f;
        this.f59593s = bitmap;
        this.f59597w = bitmap2;
        this.f59596v = f2;
        this.f59600z = f3;
    }

    /* JADX INFO: renamed from: a */
    public void m84331a(float f, float f2, float f3) {
        this.f59592r = f;
        this.f59596v = f2;
        this.f59600z = f3;
        float[] fArr = this.f59589B;
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
    }

    @Override // com.tencent.liteav.basic.p093c.C14178h
    /* JADX INFO: renamed from: b */
    public boolean mo83986b() {
        this.f59594t = GLES20.glGetUniformLocation(m84001p(), "inputImageTexture2");
        this.f59598x = GLES20.glGetUniformLocation(m84001p(), "inputImageTexture3");
        this.f59588A = GLES20.glGetUniformLocation(m84001p(), "v3_params");
        this.f59590C = GLES20.glGetUniformLocation(m84001p(), "v2_texs");
        return super.mo83986b();
    }

    @Override // com.tencent.liteav.basic.p093c.C14178h
    /* JADX INFO: renamed from: c */
    public void mo83987c() {
        super.mo83987c();
        m84332a(this.f59592r, this.f59593s, this.f59596v, this.f59597w, this.f59600z);
    }

    @Override // com.tencent.liteav.basic.p093c.C14178h
    /* JADX INFO: renamed from: e */
    public void mo83990e() {
        super.mo83990e();
        GLES20.glDeleteTextures(2, new int[]{this.f59595u, this.f59599y}, 0);
        this.f59595u = -1;
        this.f59599y = -1;
    }

    @Override // com.tencent.liteav.basic.p093c.C14178h
    /* JADX INFO: renamed from: i */
    public void mo83994i() {
        if (this.f59595u != -1) {
            GLES20.glActiveTexture(33987);
            GLES20.glBindTexture(3553, this.f59595u);
            GLES20.glUniform1i(this.f59594t, 3);
        }
        if (this.f59599y != -1) {
            GLES20.glActiveTexture(33988);
            GLES20.glBindTexture(3553, this.f59599y);
            GLES20.glUniform1i(this.f59598x, 4);
        }
        GLES20.glUniform2fv(this.f59590C, 1, FloatBuffer.wrap(this.f59591D));
        GLES20.glUniform3fv(this.f59588A, 1, FloatBuffer.wrap(this.f59589B));
    }

    @Override // com.tencent.liteav.basic.p093c.C14178h
    /* JADX INFO: renamed from: j */
    public void mo83995j() {
        if (this.f59595u != -1) {
            GLES20.glActiveTexture(33987);
            GLES20.glBindTexture(3553, 0);
            GLES20.glActiveTexture(33984);
        }
        if (this.f59599y != -1) {
            GLES20.glActiveTexture(33988);
            GLES20.glBindTexture(3553, 0);
            GLES20.glActiveTexture(33984);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m84332a(float f, final Bitmap bitmap, float f2, final Bitmap bitmap2, float f3) {
        m84331a(f, f2, f3);
        m83975a(new Runnable() { // from class: com.tencent.liteav.beauty.b.m.1
            @Override // java.lang.Runnable
            public void run() {
                C14248m.this.f59593s = bitmap;
                C14248m.this.f59597w = bitmap2;
                Bitmap bitmap3 = bitmap;
                C14248m c14248m = C14248m.this;
                if (bitmap3 != null) {
                    c14248m.f59595u = C14180j.m84007a(bitmap3, c14248m.f59595u, false);
                    C14248m.this.f59591D[0] = 1.0f;
                } else {
                    if (c14248m.f59595u != -1) {
                        GLES20.glDeleteTextures(1, new int[]{C14248m.this.f59595u}, 0);
                    }
                    C14248m.this.f59595u = -1;
                    C14248m.this.f59591D[0] = 0.0f;
                }
                Bitmap bitmap4 = bitmap2;
                C14248m c14248m2 = C14248m.this;
                if (bitmap4 != null) {
                    c14248m2.f59599y = C14180j.m84007a(bitmap4, c14248m2.f59599y, false);
                    C14248m.this.f59591D[1] = 1.0f;
                } else {
                    if (c14248m2.f59599y != -1) {
                        GLES20.glDeleteTextures(1, new int[]{C14248m.this.f59599y}, 0);
                    }
                    C14248m.this.f59599y = -1;
                    C14248m.this.f59591D[1] = 0.0f;
                }
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public void m84330a(float f) {
        m84331a(this.f59592r, f, 0.0f);
    }

    public C14248m(String str, String str2) {
        super(str, str2);
        this.f59595u = -1;
        this.f59599y = -1;
    }

    public C14248m() {
        this.f59595u = -1;
        this.f59599y = -1;
    }
}
