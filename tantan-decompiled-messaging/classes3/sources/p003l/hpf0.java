package p003l;

import android.graphics.PointF;
import android.opengl.GLES20;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class hpf0 extends xj10 {

    /* JADX INFO: renamed from: a */
    private float f4245a;

    /* JADX INFO: renamed from: b */
    private float f4246b;

    /* JADX INFO: renamed from: c */
    private float f4247c;

    /* JADX INFO: renamed from: d */
    private PointF f4248d;

    /* JADX INFO: renamed from: e */
    private int f4249e;

    /* JADX INFO: renamed from: f */
    private int f4250f;

    /* JADX INFO: renamed from: g */
    private int f4251g;

    /* JADX INFO: renamed from: i */
    private int f4252i;

    /* JADX INFO: renamed from: j */
    private boolean f4253j;

    public hpf0() {
        super(2);
        this.f4253j = false;
        this.f4248d = new PointF(0.5f, 0.5f);
        this.f4246b = 1.5707964f;
        this.f4247c = 1.0f;
    }

    /* JADX INFO: renamed from: Q1 */
    public void m4990Q1(PointF pointF, float f) {
        synchronized (getLockObject()) {
            this.f4248d = pointF;
            this.f4246b = f;
            this.f4245a = pointF.x;
        }
    }

    /* JADX INFO: renamed from: R1 */
    public void m4991R1(float f) {
        synchronized (getLockObject()) {
            if (this.f4253j) {
                f = 1.0f - f;
            }
            this.f4245a = f;
        }
    }

    /* JADX INFO: renamed from: S1 */
    public void m4992S1(boolean z) {
        this.f4253j = z;
    }

    @Override // p003l.ccj
    public String getFragmentShader() {
        return this.f4253j ? "precision lowp float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\n uniform float mixturePercent;\n uniform vec2 center;  uniform float tiltShiftRotationAngle; uniform float imageWidthAndHeightRatio; \n void main() {\n     vec4 pic0 = texture2D(inputImageTexture0, textureCoordinate);\n     vec4 pic1 = texture2D(inputImageTexture1, textureCoordinate); \n     vec2 normalizedCenter = center * vec2(imageWidthAndHeightRatio, 1.0); \n     float angleSub = abs(tiltShiftRotationAngle - 3.1415926/2.0); \n           float mixFactor = clamp(0.0,abs((textureCoordinate.y - mixturePercent)/0.01),1.0);\n             if(mixturePercent < 0.02){                gl_FragColor = pic1;              }             else if (textureCoordinate.y >= mixturePercent && textureCoordinate.y <= mixturePercent + 1.0) {\n               gl_FragColor = mix(pic0,pic1,mixFactor);\n             } else {\n               gl_FragColor = pic0;\n             } \n}" : "precision lowp float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\n uniform float mixturePercent;\n uniform vec2 center;  uniform float tiltShiftRotationAngle; uniform float imageWidthAndHeightRatio; \n void main() {\n     vec4 pic0 = texture2D(inputImageTexture0, textureCoordinate);\n     vec4 pic1 = texture2D(inputImageTexture1, textureCoordinate); \n     vec2 normalizedCenter = center * vec2(imageWidthAndHeightRatio, 1.0); \n     float angleSub = abs(tiltShiftRotationAngle - 3.1415926/2.0); \n     if (angleSub <= 0.01) {\n           float mixFactor = clamp(abs((textureCoordinate.x - mixturePercent)/0.01),0.0,1.0);\n             if(mixturePercent < 0.02){                gl_FragColor = pic1;              }             else if (textureCoordinate.x >= mixturePercent && textureCoordinate.x <= mixturePercent + 1.0) {\n               gl_FragColor = mix(pic0,pic1,mixFactor);\n             } else {\n               gl_FragColor = pic0;\n             } \n      } else {\n          float a = -tan(tiltShiftRotationAngle);          float b = normalizedCenter.y - a * normalizedCenter.x;           float mixFactor = clamp((abs(a*textureCoordinate.x - textureCoordinate.y + b)/sqrt(a*a + b*b))/0.01,0.0,1.0);          float d = -tan(tiltShiftRotationAngle) * textureCoordinate.x + normalizedCenter.y + tan(tiltShiftRotationAngle) * normalizedCenter.x;\n          if(tiltShiftRotationAngle >= 3.1415926/2.0){\n              if (d  >= textureCoordinate.y) {\n                    gl_FragColor = mix(pic0,pic1,mixFactor);\n                 } else {\n                    gl_FragColor = pic0;\n                 }\n           }\n           else{\n                 if (d < textureCoordinate.y) {\n                     gl_FragColor = mix(pic0,pic1,mixFactor);\n                 } else {\n                     gl_FragColor = pic0;\n                   }\n            }\n      } }";
    }

    @Override // p003l.xj10, p003l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f4249e = GLES20.glGetUniformLocation(this.programHandle, "mixturePercent");
        this.f4250f = GLES20.glGetUniformLocation(this.programHandle, "imageWidthAndHeightRatio");
        this.f4251g = GLES20.glGetUniformLocation(this.programHandle, "tiltShiftRotationAngle");
        this.f4252i = GLES20.glGetUniformLocation(this.programHandle, "center");
    }

    @Override // p003l.xj10, p003l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glUniform1f(this.f4249e, this.f4245a);
        GLES20.glUniform1f(this.f4250f, this.f4247c);
        GLES20.glUniform1f(this.f4251g, this.f4246b);
        int i = this.f4252i;
        PointF pointF = this.f4248d;
        GLES20.glUniform2f(i, pointF.x, pointF.y);
    }
}
