package com.tencent.liteav.beauty.p098b;

import android.opengl.GLES20;
import com.tencent.liteav.basic.p093c.C14178h;

/* JADX INFO: renamed from: com.tencent.liteav.beauty.b.d */
/* JADX INFO: loaded from: classes2.dex */
public class C14239d extends C14178h {

    /* JADX INFO: renamed from: r */
    private float f59536r;

    /* JADX INFO: renamed from: s */
    private int f59537s;

    /* JADX INFO: renamed from: t */
    private int f59538t;

    public C14239d() {
        super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "precision highp float;  \n \nuniform sampler2D inputImageTexture;  \nvarying highp vec2 textureCoordinate; \nuniform float texelWidthOffset; \nuniform float texelHeightOffset; \nvec2 pos[9]; \n \nvoid main()  \n{  \n\tpos[0] = textureCoordinate + vec2(-texelWidthOffset, -texelHeightOffset); \n\tpos[1] = textureCoordinate + vec2(-texelWidthOffset, 0.0); \n\tpos[2] = textureCoordinate + vec2(-texelWidthOffset, texelHeightOffset); \n\tpos[3] = textureCoordinate + vec2(0.0, -texelHeightOffset); \n\tpos[4] = textureCoordinate + vec2(0.0, 0.0); \n\tpos[5] = textureCoordinate + vec2(0.0, texelHeightOffset); \n\tpos[6] = textureCoordinate + vec2(texelWidthOffset, -texelHeightOffset); \n\tpos[7] = textureCoordinate + vec2(texelWidthOffset, 0.0); \n\tpos[8] = textureCoordinate + vec2(texelWidthOffset, texelHeightOffset); \n\tvec4 fragmentColor = texture2D(inputImageTexture, pos[0]);  \n\tfragmentColor += texture2D(inputImageTexture, pos[1]);  \n\tfragmentColor += texture2D(inputImageTexture, pos[2]);  \n\tfragmentColor += texture2D(inputImageTexture, pos[3]);  \n\tfragmentColor += texture2D(inputImageTexture, pos[4]);  \n\tfragmentColor += texture2D(inputImageTexture, pos[5]);  \n\tfragmentColor += texture2D(inputImageTexture, pos[6]);  \n\tfragmentColor += texture2D(inputImageTexture, pos[7]);  \n\tfragmentColor += texture2D(inputImageTexture, pos[8]);  \n \n\tgl_FragColor = fragmentColor / 9.0;  \n} \n");
        this.f59536r = 2.0f;
    }

    /* JADX INFO: renamed from: a */
    public void m84307a(float f) {
        this.f59536r = f;
        m83968a(this.f59537s, f / this.f59020e);
        m83968a(this.f59538t, this.f59536r / this.f59021f);
    }

    @Override // com.tencent.liteav.basic.p093c.C14178h
    /* JADX INFO: renamed from: b */
    public boolean mo83986b() {
        if (!super.mo83986b()) {
            return false;
        }
        this.f59537s = GLES20.glGetUniformLocation(this.f59016a, "texelWidthOffset");
        this.f59538t = GLES20.glGetUniformLocation(this.f59016a, "texelHeightOffset");
        return true;
    }

    @Override // com.tencent.liteav.basic.p093c.C14178h
    /* JADX INFO: renamed from: a */
    public void mo83969a(int i, int i2) {
        super.mo83969a(i, i2);
        m84307a(this.f59536r);
    }
}
