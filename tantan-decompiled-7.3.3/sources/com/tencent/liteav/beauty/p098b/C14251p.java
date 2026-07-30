package com.tencent.liteav.beauty.p098b;

import android.opengl.GLES20;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.p093c.C14178h;
import com.tencent.liteav.beauty.NativeLoad;

/* JADX INFO: renamed from: com.tencent.liteav.beauty.b.p */
/* JADX INFO: loaded from: classes2.dex */
public class C14251p extends C14178h {

    /* JADX INFO: renamed from: C */
    private static float[] f59605C = {0.1826f, 0.6142f, 0.062f, -0.1006f, -0.3386f, 0.4392f, 0.4392f, -0.3989f, -0.0403f};

    /* JADX INFO: renamed from: D */
    private static float[] f59606D = {0.256816f, 0.504154f, 0.0979137f, -0.148246f, -0.29102f, 0.439266f, 0.439271f, -0.367833f, -0.071438f};

    /* JADX INFO: renamed from: E */
    private static float[] f59607E = {0.0625f, 0.5f, 0.5f};

    /* JADX INFO: renamed from: A */
    private String f59608A;

    /* JADX INFO: renamed from: B */
    private int f59609B;

    /* JADX INFO: renamed from: r */
    private int f59610r;

    /* JADX INFO: renamed from: s */
    private int f59611s;

    /* JADX INFO: renamed from: t */
    private int f59612t;

    /* JADX INFO: renamed from: u */
    private int f59613u;

    /* JADX INFO: renamed from: v */
    private int f59614v;

    /* JADX INFO: renamed from: w */
    private int f59615w;

    /* JADX INFO: renamed from: x */
    private int f59616x;

    /* JADX INFO: renamed from: y */
    private int f59617y;

    /* JADX INFO: renamed from: z */
    private int f59618z;

    public C14251p(int i) {
        super("attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\n \nvarying vec2 textureCoordinate;\n \nvoid main()\n{\n    gl_Position = position;\n    textureCoordinate = inputTextureCoordinate.xy;\n}", "varying lowp vec2 textureCoordinate;\n \nuniform sampler2D inputImageTexture;\n \nvoid main()\n{\n     gl_FragColor = texture2D(inputImageTexture, textureCoordinate);\n}");
        this.f59610r = -1;
        this.f59611s = -1;
        this.f59612t = -1;
        this.f59613u = -1;
        this.f59614v = -1;
        this.f59615w = -1;
        this.f59616x = -1;
        this.f59617y = -1;
        this.f59618z = -1;
        this.f59608A = "RGBA2I420Filter";
        this.f59609B = i;
    }

    @Override // com.tencent.liteav.basic.p093c.C14178h
    /* JADX INFO: renamed from: a */
    public boolean mo83979a() {
        int i = this.f59609B;
        if (1 == i) {
            NativeLoad.getInstance();
            this.f59016a = NativeLoad.nativeLoadGLProgram(8);
            TXCLog.m84152i(this.f59608A, "RGB-->I420 init!");
        } else if (3 == i) {
            TXCLog.m84152i(this.f59608A, "RGB-->NV21 init!");
            NativeLoad.getInstance();
            this.f59016a = NativeLoad.nativeLoadGLProgram(11);
        } else {
            String str = this.f59608A;
            if (2 == i) {
                TXCLog.m84152i(str, "RGBA Format init!");
                return super.mo83979a();
            }
            TXCLog.m84152i(str, "don't support format " + this.f59609B + " use default I420");
            NativeLoad.getInstance();
            this.f59016a = NativeLoad.nativeLoadGLProgram(8);
        }
        if (this.f59016a == 0 || !mo83986b()) {
            this.f59022g = false;
        } else {
            this.f59022g = true;
        }
        mo83987c();
        return this.f59022g;
    }

    @Override // com.tencent.liteav.basic.p093c.C14178h
    /* JADX INFO: renamed from: b */
    public boolean mo83986b() {
        super.mo83986b();
        this.f59610r = GLES20.glGetUniformLocation(this.f59016a, "width");
        this.f59611s = GLES20.glGetUniformLocation(this.f59016a, "height");
        return true;
    }

    @Override // com.tencent.liteav.basic.p093c.C14178h
    /* JADX INFO: renamed from: c */
    public void mo83987c() {
        super.mo83987c();
    }

    @Override // com.tencent.liteav.basic.p093c.C14178h
    /* JADX INFO: renamed from: a */
    public void mo83969a(int i, int i2) {
        if (i > 0 && i2 > 0) {
            if (this.f59021f == i2 && this.f59020e == i) {
                return;
            }
            super.mo83969a(i, i2);
            TXCLog.m84152i(this.f59608A, "RGBA2I420Filter width " + i + " height " + i2);
            m83968a(this.f59610r, (float) i);
            m83968a(this.f59611s, (float) i2);
            return;
        }
        TXCLog.m84149e(this.f59608A, "width or height is error!");
    }
}
