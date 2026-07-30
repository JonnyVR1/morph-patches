package com.tencent.liteav.beauty.p093b;

import android.opengl.GLES20;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.p088c.C14015h;
import com.tencent.liteav.beauty.NativeLoad;

/* JADX INFO: renamed from: com.tencent.liteav.beauty.b.p */
/* JADX INFO: loaded from: classes2.dex */
public class C14088p extends C14015h {

    /* JADX INFO: renamed from: C */
    private static float[] f58757C = {0.1826f, 0.6142f, 0.062f, -0.1006f, -0.3386f, 0.4392f, 0.4392f, -0.3989f, -0.0403f};

    /* JADX INFO: renamed from: D */
    private static float[] f58758D = {0.256816f, 0.504154f, 0.0979137f, -0.148246f, -0.29102f, 0.439266f, 0.439271f, -0.367833f, -0.071438f};

    /* JADX INFO: renamed from: E */
    private static float[] f58759E = {0.0625f, 0.5f, 0.5f};

    /* JADX INFO: renamed from: A */
    private String f58760A;

    /* JADX INFO: renamed from: B */
    private int f58761B;

    /* JADX INFO: renamed from: r */
    private int f58762r;

    /* JADX INFO: renamed from: s */
    private int f58763s;

    /* JADX INFO: renamed from: t */
    private int f58764t;

    /* JADX INFO: renamed from: u */
    private int f58765u;

    /* JADX INFO: renamed from: v */
    private int f58766v;

    /* JADX INFO: renamed from: w */
    private int f58767w;

    /* JADX INFO: renamed from: x */
    private int f58768x;

    /* JADX INFO: renamed from: y */
    private int f58769y;

    /* JADX INFO: renamed from: z */
    private int f58770z;

    public C14088p(int i) {
        super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "varying lowp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}");
        this.f58762r = -1;
        this.f58763s = -1;
        this.f58764t = -1;
        this.f58765u = -1;
        this.f58766v = -1;
        this.f58767w = -1;
        this.f58768x = -1;
        this.f58769y = -1;
        this.f58770z = -1;
        this.f58760A = "RGBA2I420Filter";
        this.f58761B = i;
    }

    @Override // com.tencent.liteav.basic.p088c.C14015h
    /* JADX INFO: renamed from: a */
    public boolean mo82796a() {
        int i = this.f58761B;
        if (1 == i) {
            NativeLoad.getInstance();
            this.f58168a = NativeLoad.nativeLoadGLProgram(8);
            TXCLog.m82969i(this.f58760A, "RGB-->I420 init!");
        } else if (3 == i) {
            TXCLog.m82969i(this.f58760A, "RGB-->NV21 init!");
            NativeLoad.getInstance();
            this.f58168a = NativeLoad.nativeLoadGLProgram(11);
        } else {
            String str = this.f58760A;
            if (2 == i) {
                TXCLog.m82969i(str, "RGBA Format init!");
                return super.mo82796a();
            }
            TXCLog.m82969i(str, "don't support format " + this.f58761B + " use default I420");
            NativeLoad.getInstance();
            this.f58168a = NativeLoad.nativeLoadGLProgram(8);
        }
        if (this.f58168a == 0 || !mo82803b()) {
            this.f58174g = false;
        } else {
            this.f58174g = true;
        }
        mo82804c();
        return this.f58174g;
    }

    @Override // com.tencent.liteav.basic.p088c.C14015h
    /* JADX INFO: renamed from: b */
    public boolean mo82803b() {
        super.mo82803b();
        this.f58762r = GLES20.glGetUniformLocation(this.f58168a, "width");
        this.f58763s = GLES20.glGetUniformLocation(this.f58168a, "height");
        return true;
    }

    @Override // com.tencent.liteav.basic.p088c.C14015h
    /* JADX INFO: renamed from: c */
    public void mo82804c() {
        super.mo82804c();
    }

    @Override // com.tencent.liteav.basic.p088c.C14015h
    /* JADX INFO: renamed from: a */
    public void mo82786a(int i, int i2) {
        if (i > 0 && i2 > 0) {
            if (this.f58173f == i2 && this.f58172e == i) {
                return;
            }
            super.mo82786a(i, i2);
            TXCLog.m82969i(this.f58760A, "RGBA2I420Filter width " + i + " height " + i2);
            m82785a(this.f58762r, (float) i);
            m82785a(this.f58763s, (float) i2);
            return;
        }
        TXCLog.m82966e(this.f58760A, "width or height is error!");
    }
}
