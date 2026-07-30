package p153l;

import android.graphics.Bitmap;
import android.opengl.GLES20;

/* JADX INFO: loaded from: classes6.dex */
public class h9k extends is10 {

    /* JADX INFO: renamed from: I */
    private Bitmap f108410I;

    /* JADX INFO: renamed from: J */
    private int f108411J;

    /* JADX INFO: renamed from: K */
    private boolean f108412K;

    public h9k() {
        super(2);
    }

    /* JADX INFO: renamed from: R */
    public void m134080R(Bitmap bitmap) {
        synchronized (m134800I()) {
            this.f108410I = bitmap;
            this.f108412K = true;
        }
    }

    @Override // p153l.is10, p153l.kt2, p153l.efj
    /* JADX INFO: renamed from: c */
    public void mo96079c(int i, hfj hfjVar, boolean z) {
        if (this.f116620F.size() < 2 || !hfjVar.equals(this.f116620F.get(0))) {
            m141853O();
            m141855Q(hfjVar, 0);
            m141855Q(this, 1);
        }
        int i2 = this.f108411J;
        if (i2 == 0 || this.f108412K) {
            if (i2 != 0) {
                GLES20.glDeleteTextures(1, new int[]{i2}, 0);
                this.f108411J = 0;
            }
            this.f108411J = pim.m172385a(this.f108410I);
            this.f108412K = false;
        }
        super.mo96079c(this.f108411J, this, z);
        super.mo96079c(i, hfjVar, z);
    }

    @Override // p153l.is10, p153l.hfj, p153l.xej
    /* JADX INFO: renamed from: f */
    public void mo96080f() {
        super.mo96080f();
        int i = this.f108411J;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.f108411J = 0;
        }
        Bitmap bitmap = this.f108410I;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        this.f108410I.recycle();
        this.f108410I = null;
    }

    @Override // p153l.xej
    /* JADX INFO: renamed from: m */
    public String mo112466m() {
        return " precision lowp float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\n \n void main() {\n  vec2 textCood = textureCoordinate;  vec2 textCanvas = vec2(textCood.x,1.0 - textCood.y);     vec4 originalImage = texture2D(inputImageTexture0, textCood);\n     vec4 canvasImage = texture2D(inputImageTexture1,textCanvas);\n     \n     if (canvasImage.a > 0.0) {\n         gl_FragColor = originalImage;\n     } else {\n         gl_FragColor = canvasImage;\n     }\n }\n";
    }
}
