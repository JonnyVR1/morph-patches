package p149l;

import android.graphics.Bitmap;
import android.opengl.GLES20;

/* JADX INFO: loaded from: classes7.dex */
public class p6k extends yj10 {

    /* JADX INFO: renamed from: I */
    private Bitmap f147416I;

    /* JADX INFO: renamed from: J */
    private int f147417J;

    /* JADX INFO: renamed from: K */
    private boolean f147418K;

    public p6k() {
        super(2);
    }

    /* JADX INFO: renamed from: R */
    public void m167684R(Bitmap bitmap) {
        synchronized (m158947I()) {
            this.f147416I = bitmap;
            this.f147418K = true;
        }
    }

    @Override // p149l.yj10, p149l.us2, p149l.kcj
    /* JADX INFO: renamed from: c */
    public void mo102037c(int i, ncj ncjVar, boolean z) {
        if (this.f198573F.size() < 2 || !ncjVar.equals(this.f198573F.get(0))) {
            m215027O();
            m215029Q(ncjVar, 0);
            m215029Q(this, 1);
        }
        int i2 = this.f147417J;
        if (i2 == 0 || this.f147418K) {
            if (i2 != 0) {
                GLES20.glDeleteTextures(1, new int[]{i2}, 0);
                this.f147417J = 0;
            }
            this.f147417J = mgm.m154569a(this.f147416I);
            this.f147418K = false;
        }
        super.mo102037c(this.f147417J, this, z);
        super.mo102037c(i, ncjVar, z);
    }

    @Override // p149l.yj10, p149l.ncj, p149l.dcj
    /* JADX INFO: renamed from: f */
    public void mo102038f() {
        super.mo102038f();
        int i = this.f147417J;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.f147417J = 0;
        }
        Bitmap bitmap = this.f147416I;
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        this.f147416I.recycle();
        this.f147416I = null;
    }

    @Override // p149l.dcj
    /* JADX INFO: renamed from: m */
    public String mo102573m() {
        return " precision lowp float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\n \n void main() {\n  vec2 textCood = textureCoordinate;  vec2 textCanvas = vec2(textCood.x,1.0 - textCood.y);     vec4 originalImage = texture2D(inputImageTexture0, textCood);\n     vec4 canvasImage = texture2D(inputImageTexture1,textCanvas);\n     \n     if (canvasImage.a > 0.0) {\n         gl_FragColor = originalImage;\n     } else {\n         gl_FragColor = canvasImage;\n     }\n }\n";
    }
}
