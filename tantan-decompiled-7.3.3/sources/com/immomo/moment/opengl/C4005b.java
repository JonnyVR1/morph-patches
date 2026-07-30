package com.immomo.moment.opengl;

import android.opengl.GLES20;
import p153l.l4b0;
import p153l.z3k;

/* JADX INFO: renamed from: com.immomo.moment.opengl.b */
/* JADX INFO: loaded from: classes7.dex */
public class C4005b extends l4b0 {

    /* JADX INFO: renamed from: g */
    private int f14349g;

    /* JADX INFO: renamed from: h */
    private int f14350h;

    /* JADX INFO: renamed from: i */
    private int f14351i;

    public C4005b() {
        super("uniform mat4 uMVPMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uMVPMatrix * aPosition;\n    vTextureCoord = aTextureCoord;\n}\n", "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 vTextureCoord;\nuniform samplerExternalOES sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
    }

    @Override // p153l.l4b0
    /* JADX INFO: renamed from: b */
    public Drawable2d mo20010b() {
        return new Drawable2d(Drawable2d.Prefab.FULL_RECTANGLE);
    }

    @Override // p153l.l4b0
    /* JADX INFO: renamed from: c */
    public void mo20011c() {
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.f129954a, "aPosition");
        this.f14350h = iGlGetAttribLocation;
        z3k.m218484b(iGlGetAttribLocation, "aPosition");
        int iGlGetAttribLocation2 = GLES20.glGetAttribLocation(this.f129954a, "aTextureCoord");
        this.f14351i = iGlGetAttribLocation2;
        z3k.m218484b(iGlGetAttribLocation2, "aTextureCoord");
        int iGlGetUniformLocation = GLES20.glGetUniformLocation(this.f129954a, "uMVPMatrix");
        this.f14349g = iGlGetUniformLocation;
        z3k.m218484b(iGlGetUniformLocation, "uMVPMatrix");
    }
}
