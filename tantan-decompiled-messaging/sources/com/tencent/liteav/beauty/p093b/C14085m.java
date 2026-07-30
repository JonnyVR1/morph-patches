package com.tencent.liteav.beauty.p093b;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import com.tencent.liteav.basic.p088c.C14015h;
import com.tencent.liteav.basic.p088c.C14017j;
import java.nio.FloatBuffer;

/* JADX INFO: renamed from: com.tencent.liteav.beauty.b.m */
/* JADX INFO: loaded from: classes2.dex */
public class C14085m extends C14015h {

    /* JADX INFO: renamed from: A */
    private int f58740A;

    /* JADX INFO: renamed from: B */
    private float[] f58741B;

    /* JADX INFO: renamed from: C */
    private int f58742C;

    /* JADX INFO: renamed from: D */
    private float[] f58743D;

    /* JADX INFO: renamed from: r */
    private float f58744r;

    /* JADX INFO: renamed from: s */
    private Bitmap f58745s;

    /* JADX INFO: renamed from: t */
    private int f58746t;

    /* JADX INFO: renamed from: u */
    private int f58747u;

    /* JADX INFO: renamed from: v */
    private float f58748v;

    /* JADX INFO: renamed from: w */
    private Bitmap f58749w;

    /* JADX INFO: renamed from: x */
    private int f58750x;

    /* JADX INFO: renamed from: y */
    private int f58751y;

    /* JADX INFO: renamed from: z */
    private float f58752z;

    public C14085m(float f, Bitmap bitmap, float f2, Bitmap bitmap2, float f3) {
        this("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "varying highp vec2 textureCoordinate;\n \n uniform sampler2D inputImageTexture;\n uniform sampler2D inputImageTexture2; // lookup texture 1\n uniform sampler2D inputImageTexture3; // lookup texture 2\n \n \n uniform lowp vec3 v3_params;\n uniform lowp vec2 v2_texs;\n \n \n void main()\n {\n     lowp vec4 textureColor = texture2D(inputImageTexture, textureCoordinate);\n     \n     mediump float blueColor = textureColor.b * 63.0;\n     \n     mediump vec2 quad1;\n     quad1.y = floor(floor(blueColor) / 8.0);\n     quad1.x = floor(blueColor) - (quad1.y * 8.0);\n     \n     mediump vec2 quad2;\n     quad2.y = floor(ceil(blueColor) / 8.0);\n     quad2.x = ceil(blueColor) - (quad2.y * 8.0);\n     \n     highp vec2 texPos1;\n     texPos1.x = (quad1.x * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * textureColor.r);\n     texPos1.y = (quad1.y * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * textureColor.g);\n     \n     highp vec2 texPos2;\n     texPos2.x = (quad2.x * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * textureColor.r);\n     texPos2.y = (quad2.y * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * textureColor.g);\n     \n     lowp vec4 newColor1;\n     lowp vec4 newColor2;\n     if(textureCoordinate.x <= v3_params.x) { \n       if(v2_texs.x == 1.0) { \n         newColor1 = texture2D(inputImageTexture2, texPos1);\n         newColor2 = texture2D(inputImageTexture2, texPos2);\n         lowp vec4 newColor = mix(newColor1, newColor2, fract(blueColor));\n         gl_FragColor = mix(textureColor, vec4(newColor.rgb, textureColor.w), v3_params.y);\n       } else { \n         gl_FragColor = textureColor;\n       } \n     } else {\n       if(v2_texs.y == 1.0) { \n         newColor1 = texture2D(inputImageTexture3, texPos1);\n         newColor2 = texture2D(inputImageTexture3, texPos2);\n         lowp vec4 newColor = mix(newColor1, newColor2, fract(blueColor));\n         gl_FragColor = mix(textureColor, vec4(newColor.rgb, textureColor.w), v3_params.z);\n       } else { \n         gl_FragColor = textureColor;\n       } \n     }\n }");
        this.f58741B = new float[3];
        this.f58743D = new float[2];
        this.f58744r = f;
        this.f58745s = bitmap;
        this.f58749w = bitmap2;
        this.f58748v = f2;
        this.f58752z = f3;
    }

    /* JADX INFO: renamed from: a */
    public void m83148a(float f, float f2, float f3) {
        this.f58744r = f;
        this.f58748v = f2;
        this.f58752z = f3;
        float[] fArr = this.f58741B;
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
    }

    @Override // com.tencent.liteav.basic.p088c.C14015h
    /* JADX INFO: renamed from: b */
    public boolean mo82803b() {
        this.f58746t = GLES20.glGetUniformLocation(m82818p(), "inputImageTexture2");
        this.f58750x = GLES20.glGetUniformLocation(m82818p(), "inputImageTexture3");
        this.f58740A = GLES20.glGetUniformLocation(m82818p(), "v3_params");
        this.f58742C = GLES20.glGetUniformLocation(m82818p(), "v2_texs");
        return super.mo82803b();
    }

    @Override // com.tencent.liteav.basic.p088c.C14015h
    /* JADX INFO: renamed from: c */
    public void mo82804c() {
        super.mo82804c();
        m83149a(this.f58744r, this.f58745s, this.f58748v, this.f58749w, this.f58752z);
    }

    @Override // com.tencent.liteav.basic.p088c.C14015h
    /* JADX INFO: renamed from: e */
    public void mo82807e() {
        super.mo82807e();
        GLES20.glDeleteTextures(2, new int[]{this.f58747u, this.f58751y}, 0);
        this.f58747u = -1;
        this.f58751y = -1;
    }

    @Override // com.tencent.liteav.basic.p088c.C14015h
    /* JADX INFO: renamed from: i */
    public void mo82811i() {
        if (this.f58747u != -1) {
            GLES20.glActiveTexture(33987);
            GLES20.glBindTexture(3553, this.f58747u);
            GLES20.glUniform1i(this.f58746t, 3);
        }
        if (this.f58751y != -1) {
            GLES20.glActiveTexture(33988);
            GLES20.glBindTexture(3553, this.f58751y);
            GLES20.glUniform1i(this.f58750x, 4);
        }
        GLES20.glUniform2fv(this.f58742C, 1, FloatBuffer.wrap(this.f58743D));
        GLES20.glUniform3fv(this.f58740A, 1, FloatBuffer.wrap(this.f58741B));
    }

    @Override // com.tencent.liteav.basic.p088c.C14015h
    /* JADX INFO: renamed from: j */
    public void mo82812j() {
        if (this.f58747u != -1) {
            GLES20.glActiveTexture(33987);
            GLES20.glBindTexture(3553, 0);
            GLES20.glActiveTexture(33984);
        }
        if (this.f58751y != -1) {
            GLES20.glActiveTexture(33988);
            GLES20.glBindTexture(3553, 0);
            GLES20.glActiveTexture(33984);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m83149a(float f, final Bitmap bitmap, float f2, final Bitmap bitmap2, float f3) {
        m83148a(f, f2, f3);
        m82792a(new Runnable() { // from class: com.tencent.liteav.beauty.b.m.1
            @Override // java.lang.Runnable
            public void run() {
                C14085m.this.f58745s = bitmap;
                C14085m.this.f58749w = bitmap2;
                Bitmap bitmap3 = bitmap;
                C14085m c14085m = C14085m.this;
                if (bitmap3 != null) {
                    c14085m.f58747u = C14017j.m82824a(bitmap3, c14085m.f58747u, false);
                    C14085m.this.f58743D[0] = 1.0f;
                } else {
                    if (c14085m.f58747u != -1) {
                        GLES20.glDeleteTextures(1, new int[]{C14085m.this.f58747u}, 0);
                    }
                    C14085m.this.f58747u = -1;
                    C14085m.this.f58743D[0] = 0.0f;
                }
                Bitmap bitmap4 = bitmap2;
                C14085m c14085m2 = C14085m.this;
                if (bitmap4 != null) {
                    c14085m2.f58751y = C14017j.m82824a(bitmap4, c14085m2.f58751y, false);
                    C14085m.this.f58743D[1] = 1.0f;
                } else {
                    if (c14085m2.f58751y != -1) {
                        GLES20.glDeleteTextures(1, new int[]{C14085m.this.f58751y}, 0);
                    }
                    C14085m.this.f58751y = -1;
                    C14085m.this.f58743D[1] = 0.0f;
                }
            }
        });
    }

    /* JADX INFO: renamed from: a */
    public void m83147a(float f) {
        m83148a(this.f58744r, f, 0.0f);
    }

    public C14085m(String str, String str2) {
        super(str, str2);
        this.f58747u = -1;
        this.f58751y = -1;
    }

    public C14085m() {
        this.f58747u = -1;
        this.f58751y = -1;
    }
}
