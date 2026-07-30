package p153l;

import android.graphics.PointF;
import android.opengl.GLES20;

/* JADX INFO: loaded from: classes3.dex */
public class qxf0 extends hs10 {

    /* JADX INFO: renamed from: a */
    private float f160037a;

    /* JADX INFO: renamed from: b */
    private float f160038b;

    /* JADX INFO: renamed from: c */
    private float f160039c;

    /* JADX INFO: renamed from: d */
    private PointF f160040d;

    /* JADX INFO: renamed from: e */
    private int f160041e;

    /* JADX INFO: renamed from: f */
    private int f160042f;

    /* JADX INFO: renamed from: g */
    private int f160043g;

    /* JADX INFO: renamed from: i */
    private int f160044i;

    /* JADX INFO: renamed from: j */
    private boolean f160045j;

    public qxf0() {
        super(2);
        this.f160045j = false;
        this.f160040d = new PointF(0.5f, 0.5f);
        this.f160038b = 1.5707964f;
        this.f160039c = 1.0f;
    }

    /* JADX INFO: renamed from: Q1 */
    public void m178599Q1(PointF pointF, float f) {
        synchronized (getLockObject()) {
            this.f160040d = pointF;
            this.f160038b = f;
            this.f160037a = pointF.x;
        }
    }

    /* JADX INFO: renamed from: R1 */
    public void m178600R1(float f) {
        synchronized (getLockObject()) {
            if (this.f160045j) {
                f = 1.0f - f;
            }
            this.f160037a = f;
        }
    }

    /* JADX INFO: renamed from: S1 */
    public void m178601S1(boolean z) {
        this.f160045j = z;
    }

    @Override // p153l.wej
    public String getFragmentShader() {
        return this.f160045j ? "precision lowp float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\n uniform float mixturePercent;\n uniform vec2 center;  uniform float tiltShiftRotationAngle; uniform float imageWidthAndHeightRatio; \n void main() {\n     vec4 pic0 = texture2D(inputImageTexture0, textureCoordinate);\n     vec4 pic1 = texture2D(inputImageTexture1, textureCoordinate); \n     vec2 normalizedCenter = center * vec2(imageWidthAndHeightRatio, 1.0); \n     float angleSub = abs(tiltShiftRotationAngle - 3.1415926/2.0); \n           float mixFactor = clamp(0.0,abs((textureCoordinate.y - mixturePercent)/0.01),1.0);\n             if(mixturePercent < 0.02){                gl_FragColor = pic1;              }             else if (textureCoordinate.y >= mixturePercent && textureCoordinate.y <= mixturePercent + 1.0) {\n               gl_FragColor = mix(pic0,pic1,mixFactor);\n             } else {\n               gl_FragColor = pic0;\n             } \n}" : "precision lowp float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\n uniform float mixturePercent;\n uniform vec2 center;  uniform float tiltShiftRotationAngle; uniform float imageWidthAndHeightRatio; \n void main() {\n     vec4 pic0 = texture2D(inputImageTexture0, textureCoordinate);\n     vec4 pic1 = texture2D(inputImageTexture1, textureCoordinate); \n     vec2 normalizedCenter = center * vec2(imageWidthAndHeightRatio, 1.0); \n     float angleSub = abs(tiltShiftRotationAngle - 3.1415926/2.0); \n     if (angleSub <= 0.01) {\n           float mixFactor = clamp(abs((textureCoordinate.x - mixturePercent)/0.01),0.0,1.0);\n             if(mixturePercent < 0.02){                gl_FragColor = pic1;              }             else if (textureCoordinate.x >= mixturePercent && textureCoordinate.x <= mixturePercent + 1.0) {\n               gl_FragColor = mix(pic0,pic1,mixFactor);\n             } else {\n               gl_FragColor = pic0;\n             } \n      } else {\n          float a = -tan(tiltShiftRotationAngle);          float b = normalizedCenter.y - a * normalizedCenter.x;           float mixFactor = clamp((abs(a*textureCoordinate.x - textureCoordinate.y + b)/sqrt(a*a + b*b))/0.01,0.0,1.0);          float d = -tan(tiltShiftRotationAngle) * textureCoordinate.x + normalizedCenter.y + tan(tiltShiftRotationAngle) * normalizedCenter.x;\n          if(tiltShiftRotationAngle >= 3.1415926/2.0){\n              if (d  >= textureCoordinate.y) {\n                    gl_FragColor = mix(pic0,pic1,mixFactor);\n                 } else {\n                    gl_FragColor = pic0;\n                 }\n           }\n           else{\n                 if (d < textureCoordinate.y) {\n                     gl_FragColor = mix(pic0,pic1,mixFactor);\n                 } else {\n                     gl_FragColor = pic0;\n                   }\n            }\n      } }";
    }

    @Override // p153l.hs10, p153l.wej
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f160041e = GLES20.glGetUniformLocation(this.programHandle, "mixturePercent");
        this.f160042f = GLES20.glGetUniformLocation(this.programHandle, "imageWidthAndHeightRatio");
        this.f160043g = GLES20.glGetUniformLocation(this.programHandle, "tiltShiftRotationAngle");
        this.f160044i = GLES20.glGetUniformLocation(this.programHandle, "center");
    }

    @Override // p153l.hs10, p153l.wej
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glUniform1f(this.f160041e, this.f160037a);
        GLES20.glUniform1f(this.f160042f, this.f160039c);
        GLES20.glUniform1f(this.f160043g, this.f160038b);
        int i = this.f160044i;
        PointF pointF = this.f160040d;
        GLES20.glUniform2f(i, pointF.x, pointF.y);
    }
}
