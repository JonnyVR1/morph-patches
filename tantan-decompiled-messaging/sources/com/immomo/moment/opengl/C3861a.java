package com.immomo.moment.opengl;

import android.opengl.GLES20;
import p149l.hwa0;
import p149l.j1k;

/* JADX INFO: renamed from: com.immomo.moment.opengl.a */
/* JADX INFO: loaded from: classes7.dex */
public class C3861a extends hwa0 {

    /* JADX INFO: renamed from: g */
    protected int f13652g;

    /* JADX INFO: renamed from: h */
    protected int f13653h;

    /* JADX INFO: renamed from: i */
    protected int f13654i;

    public C3861a() {
        super("uniform mat4 uMVPMatrix;\nattribute vec4 aPosition;\nattribute vec2 aTextureCoord;\nvarying vec2 vTextureCoord;\nvoid main() {\n    gl_Position = uMVPMatrix * aPosition;\n    vTextureCoord = aTextureCoord;\n}\n", "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform sampler2D sTexture;\nvoid main() {\n    gl_FragColor = texture2D(sTexture, vTextureCoord);\n}\n");
    }

    @Override // p149l.hwa0
    /* JADX INFO: renamed from: b */
    public Drawable2d mo19030b() {
        return new Drawable2d(Drawable2d.Prefab.FULL_RECTANGLE);
    }

    @Override // p149l.hwa0
    /* JADX INFO: renamed from: c */
    public void mo19031c() {
        int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.f109744a, "aPosition");
        this.f13653h = iGlGetAttribLocation;
        j1k.m139325b(iGlGetAttribLocation, "aPosition");
        int iGlGetAttribLocation2 = GLES20.glGetAttribLocation(this.f109744a, "aTextureCoord");
        this.f13654i = iGlGetAttribLocation2;
        j1k.m139325b(iGlGetAttribLocation2, "aTextureCoord");
        int iGlGetUniformLocation = GLES20.glGetUniformLocation(this.f109744a, "uMVPMatrix");
        this.f13652g = iGlGetUniformLocation;
        j1k.m139325b(iGlGetUniformLocation, "uMVPMatrix");
    }
}
