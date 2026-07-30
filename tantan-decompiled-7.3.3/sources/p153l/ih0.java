package p153l;

import android.opengl.GLES20;
import com.tantanapp.ijk.media.player.IjkMediaPlayer;

/* JADX INFO: loaded from: classes3.dex */
public class ih0 extends jt2 {

    /* JADX INFO: renamed from: a */
    private int f114837a;

    /* JADX INFO: renamed from: b */
    private int f114838b;

    /* JADX INFO: renamed from: c */
    private int f114839c;

    /* JADX INFO: renamed from: d */
    private int f114840d;

    /* JADX INFO: renamed from: e */
    private int f114841e;

    /* JADX INFO: renamed from: f */
    private int f114842f;

    /* JADX INFO: renamed from: g */
    private int f114843g;

    /* JADX INFO: renamed from: i */
    private float f114844i = 0.0f;

    /* JADX INFO: renamed from: j */
    private float f114845j = 0.0f;

    /* JADX INFO: renamed from: k */
    private float f114846k = 0.0f;

    /* JADX INFO: renamed from: l */
    private float f114847l = 0.0f;

    /* JADX INFO: renamed from: m */
    private float f114848m = 1.0f;

    /* JADX INFO: renamed from: n */
    private float f114849n = 0.0f;

    /* JADX INFO: renamed from: o */
    private float f114850o = 1.0f;

    /* JADX INFO: renamed from: p */
    private boolean f114851p = true;

    /* JADX INFO: renamed from: q */
    private int f114852q = 15;

    /* JADX INFO: renamed from: r */
    private int f114853r = 0;

    /* JADX INFO: renamed from: s */
    private String f114854s = "    float scanLineNumber = floor(uv.y*340.0);\n    float scanLineBrightness = 0.8*sin(fract(uv.y*340.0)*3.14159265358979323);    gl_FragColor = texture2D(inputImageTexture0,uv)*scanLineBrightness;\n";

    /* JADX INFO: renamed from: Q1 */
    public synchronized void m139966Q1() {
        this.f114851p = true;
        this.f114853r = 0;
        this.f114849n = 0.0f;
        this.f114848m = 1.0f;
        this.f114850o = 1.0f;
    }

    @Override // p153l.wej
    public String getFragmentShader() {
        return "precision highp float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nuniform float shiftX;\nuniform float shiftY;\nuniform float shiftW;\nuniform float shiftH;\nuniform float shift;\nuniform float judge;\nuniform float offset;\nvec2 scaleFromCenter(vec2 coord, float scale) {\n  if (scale < 0.0) { return coord; }\n  vec2 scaleCenter = vec2(0.5);\n  return (coord - scaleCenter) * scale + scaleCenter;\n}\nvoid main(){\n    vec2 uv = textureCoordinate;\n    if (judge == 1.0) {\n    uv = scaleFromCenter(uv,offset);\n    if (uv.x > shift) {       gl_FragColor = texture2D(inputImageTexture0,uv);\n    } else {\n" + this.f114854s + "    }\n    } else {\n    if (uv.x < shift) {       if (uv.x >= shiftX - shiftW/2.0 && uv.x <= shiftX + shiftW/2.0 && uv.y > shiftY - shiftH/2.0  && uv.y < shiftY + shiftH/2.0 ) {\n" + this.f114854s + "       } else {\n       uv = scaleFromCenter(uv,offset);\n       gl_FragColor = texture2D(inputImageTexture0,uv);\n       }    } else {\n       uv = scaleFromCenter(uv,offset);\n" + this.f114854s + "    }\n  }\n}\n";
    }

    @Override // p153l.wej
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f114837a = GLES20.glGetUniformLocation(this.programHandle, "shiftX");
        this.f114838b = GLES20.glGetUniformLocation(this.programHandle, "shiftY");
        this.f114839c = GLES20.glGetUniformLocation(this.programHandle, "shiftW");
        this.f114840d = GLES20.glGetUniformLocation(this.programHandle, "shiftH");
        this.f114841e = GLES20.glGetUniformLocation(this.programHandle, "shift");
        this.f114842f = GLES20.glGetUniformLocation(this.programHandle, "judge");
        this.f114843g = GLES20.glGetUniformLocation(this.programHandle, IjkMediaPlayer.OnNativeInvokeListener.ARG_OFFSET);
    }

    @Override // p153l.wej
    public void passShaderValues() {
        super.passShaderValues();
        if (this.f114851p) {
            int i = this.f114853r;
            if (i <= 10) {
                this.f114848m = 0.6f;
                this.f114844i = ((float) Math.random()) * 0.6f;
                this.f114845j = (float) Math.random();
                this.f114846k = ((float) Math.random()) * 0.2f;
                this.f114847l = ((float) Math.random()) * 0.5f;
            } else if (10 < i && i <= 12) {
                this.f114848m = 0.6f;
                this.f114844i = 0.0f;
                this.f114845j = 0.0f;
                this.f114846k = 0.0f;
                this.f114847l = 0.0f;
                this.f114850o -= 0.005f;
            } else if (12 >= i || i > 25) {
                this.f114848m = 0.0f;
                this.f114851p = false;
            } else {
                this.f114849n = 1.0f;
                float f = this.f114850o - 0.005f;
                this.f114850o = f;
                if (f <= 0.8d) {
                    this.f114850o = 0.8f;
                }
            }
        }
        GLES20.glUniform1f(this.f114837a, this.f114844i);
        GLES20.glUniform1f(this.f114838b, this.f114845j);
        GLES20.glUniform1f(this.f114839c, this.f114846k);
        GLES20.glUniform1f(this.f114840d, this.f114847l);
        GLES20.glUniform1f(this.f114841e, this.f114848m);
        GLES20.glUniform1f(this.f114842f, this.f114849n);
        GLES20.glUniform1f(this.f114843g, this.f114850o);
        this.f114853r++;
    }
}
