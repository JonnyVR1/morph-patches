package p149l;

import android.opengl.GLES20;
import com.tantanapp.ijk.media.player.IjkMediaPlayer;

/* JADX INFO: loaded from: classes3.dex */
public class mh0 extends ts2 {

    /* JADX INFO: renamed from: a */
    private int f133746a;

    /* JADX INFO: renamed from: b */
    private int f133747b;

    /* JADX INFO: renamed from: c */
    private int f133748c;

    /* JADX INFO: renamed from: d */
    private int f133749d;

    /* JADX INFO: renamed from: e */
    private int f133750e;

    /* JADX INFO: renamed from: f */
    private int f133751f;

    /* JADX INFO: renamed from: g */
    private int f133752g;

    /* JADX INFO: renamed from: i */
    private float f133753i = 0.0f;

    /* JADX INFO: renamed from: j */
    private float f133754j = 0.0f;

    /* JADX INFO: renamed from: k */
    private float f133755k = 0.0f;

    /* JADX INFO: renamed from: l */
    private float f133756l = 0.0f;

    /* JADX INFO: renamed from: m */
    private float f133757m = 1.0f;

    /* JADX INFO: renamed from: n */
    private float f133758n = 0.0f;

    /* JADX INFO: renamed from: o */
    private float f133759o = 1.0f;

    /* JADX INFO: renamed from: p */
    private boolean f133760p = true;

    /* JADX INFO: renamed from: q */
    private int f133761q = 15;

    /* JADX INFO: renamed from: r */
    private int f133762r = 0;

    /* JADX INFO: renamed from: s */
    private String f133763s = "    float scanLineNumber = floor(uv.y*340.0);\n    float scanLineBrightness = 0.8*sin(fract(uv.y*340.0)*3.14159265358979323);    gl_FragColor = texture2D(inputImageTexture0,uv)*scanLineBrightness;\n";

    /* JADX INFO: renamed from: Q1 */
    public synchronized void m154598Q1() {
        this.f133760p = true;
        this.f133762r = 0;
        this.f133758n = 0.0f;
        this.f133757m = 1.0f;
        this.f133759o = 1.0f;
    }

    @Override // p149l.ccj
    public String getFragmentShader() {
        return "precision highp float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nuniform float shiftX;\nuniform float shiftY;\nuniform float shiftW;\nuniform float shiftH;\nuniform float shift;\nuniform float judge;\nuniform float offset;\nvec2 scaleFromCenter(vec2 coord, float scale) {\n  if (scale < 0.0) { return coord; }\n  vec2 scaleCenter = vec2(0.5);\n  return (coord - scaleCenter) * scale + scaleCenter;\n}\nvoid main(){\n    vec2 uv = textureCoordinate;\n    if (judge == 1.0) {\n    uv = scaleFromCenter(uv,offset);\n    if (uv.x > shift) {       gl_FragColor = texture2D(inputImageTexture0,uv);\n    } else {\n" + this.f133763s + "    }\n    } else {\n    if (uv.x < shift) {       if (uv.x >= shiftX - shiftW/2.0 && uv.x <= shiftX + shiftW/2.0 && uv.y > shiftY - shiftH/2.0  && uv.y < shiftY + shiftH/2.0 ) {\n" + this.f133763s + "       } else {\n       uv = scaleFromCenter(uv,offset);\n       gl_FragColor = texture2D(inputImageTexture0,uv);\n       }    } else {\n       uv = scaleFromCenter(uv,offset);\n" + this.f133763s + "    }\n  }\n}\n";
    }

    @Override // p149l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f133746a = GLES20.glGetUniformLocation(this.programHandle, "shiftX");
        this.f133747b = GLES20.glGetUniformLocation(this.programHandle, "shiftY");
        this.f133748c = GLES20.glGetUniformLocation(this.programHandle, "shiftW");
        this.f133749d = GLES20.glGetUniformLocation(this.programHandle, "shiftH");
        this.f133750e = GLES20.glGetUniformLocation(this.programHandle, "shift");
        this.f133751f = GLES20.glGetUniformLocation(this.programHandle, "judge");
        this.f133752g = GLES20.glGetUniformLocation(this.programHandle, IjkMediaPlayer.OnNativeInvokeListener.ARG_OFFSET);
    }

    @Override // p149l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        if (this.f133760p) {
            int i = this.f133762r;
            if (i <= 10) {
                this.f133757m = 0.6f;
                this.f133753i = ((float) Math.random()) * 0.6f;
                this.f133754j = (float) Math.random();
                this.f133755k = ((float) Math.random()) * 0.2f;
                this.f133756l = ((float) Math.random()) * 0.5f;
            } else if (10 < i && i <= 12) {
                this.f133757m = 0.6f;
                this.f133753i = 0.0f;
                this.f133754j = 0.0f;
                this.f133755k = 0.0f;
                this.f133756l = 0.0f;
                this.f133759o -= 0.005f;
            } else if (12 >= i || i > 25) {
                this.f133757m = 0.0f;
                this.f133760p = false;
            } else {
                this.f133758n = 1.0f;
                float f = this.f133759o - 0.005f;
                this.f133759o = f;
                if (f <= 0.8d) {
                    this.f133759o = 0.8f;
                }
            }
        }
        GLES20.glUniform1f(this.f133746a, this.f133753i);
        GLES20.glUniform1f(this.f133747b, this.f133754j);
        GLES20.glUniform1f(this.f133748c, this.f133755k);
        GLES20.glUniform1f(this.f133749d, this.f133756l);
        GLES20.glUniform1f(this.f133750e, this.f133757m);
        GLES20.glUniform1f(this.f133751f, this.f133758n);
        GLES20.glUniform1f(this.f133752g, this.f133759o);
        this.f133762r++;
    }
}
