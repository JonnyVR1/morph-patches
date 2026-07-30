package p153l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes3.dex */
public class lc00 extends hs10 {

    /* JADX INFO: renamed from: a */
    int f131242a;

    /* JADX INFO: renamed from: b */
    int f131243b;

    /* JADX INFO: renamed from: c */
    int f131244c;

    /* JADX INFO: renamed from: d */
    float[] f131245d;

    /* JADX INFO: renamed from: e */
    float[] f131246e;

    /* JADX INFO: renamed from: f */
    float[] f131247f;

    /* JADX INFO: renamed from: g */
    String f131248g;

    /* JADX INFO: renamed from: i */
    String f131249i;

    public lc00() {
        super(2);
        this.f131245d = new float[3];
        this.f131246e = new float[3];
        this.f131247f = new float[3];
        this.f131248g = "precision highp float;\nvarying vec2 textureCoordinate;\nuniform sampler2D inputImageTexture0;//原图\nuniform sampler2D inputImageTexture1;//星星\nuniform vec3 uCOLOR;\nuniform vec3 uTONE;\nuniform vec3 uFX;\nconst vec3 LumCoeff = vec3(0.2125, 0.7154, 0.0721);\nconst vec3 AvgLumin = vec3(0.5, 0.5, 0.5);\nvoid main(){ \n    vec3 col2; \n    vec3 col = texture2D(inputImageTexture0, textureCoordinate).rgb; \n    col2 = col * uTONE.y; \n\n    if(uFX.z>0.0) col+=(col-col2)*uFX.z; \n    if(uFX.x>0.0) col = 1.0 - (1.0 - col2*uFX.x) * (1.0 - col); \n\n    col2 = col * uTONE.y; \n    col = pow(mix(AvgLumin, mix(vec3(dot(col2, LumCoeff)), col2, uTONE.x), uTONE.z),uCOLOR); //uTone.x 调节饱和度，0饱和度最低，1饱和度最高。 uTone.z 调节对比度，0对比度最低，1对比度最高\n\n    col = clamp(col,0.0,1.0); \n\n    col += texture2D(inputImageTexture1, textureCoordinate).rgb; \n\n    if(uFX.y>0.0) col*=pow(1.0 - length(0.5 - textureCoordinate) / length(vec2(0.5)),uFX.y); \n\n    gl_FragColor = vec4(col, 1.0); \n}";
        this.f131249i = "precision highp float;\nvarying vec2 TexCoord;\nuniform sampler2D sceneTex;//原图\nuniform sampler2D blurTex;//星星\nuniform sampler2D softTex;//原图的模糊图\nuniform vec3 uCOLOR;\nuniform vec3 uTONE;\nuniform vec3 uFX;\nconst vec3 LumCoeff = vec3(0.2125, 0.7154, 0.0721);\nconst vec3 AvgLumin = vec3(0.5, 0.5, 0.5);\nvoid main(){ \n    vec3 col2; \n    vec3 col = texture2D(sceneTex, TexCoord).rgb; \n    col2 = texture2D(softTex, TexCoord).rgb; \n\n    if(uFX.z>0.0) col+=(col-col2)*uFX.z; \n    if(uFX.x>0.0) col = 1.0 - (1.0 - col2*uFX.x) * (1.0 - col); \n\n    col2 = col * uTONE.y; \n    col = pow(mix(AvgLumin, mix(vec3(dot(col2, LumCoeff)), col2, uTONE.x), uTONE.z),uCOLOR); //uTone.x 调节饱和度，0饱和度最低，1饱和度最高。 uTone.z 调节对比度，0对比度最低，1对比度最高\n\n    col = clamp(col,0.0,1.0); \n\n    col += texture2D(blurTex, TexCoord).rgb; \n\n    if(uFX.y>0.0) col*=pow(1.0 - length(0.5 - TexCoord) / length(vec2(0.5)),uFX.y); \n\n    gl_FragColor = vec4(col, 1.0); \n}";
        setFloatTexture(true);
    }

    /* JADX INFO: renamed from: Q1 */
    public void m153598Q1(float f, float f2, float f3) {
        float[] fArr = this.f131245d;
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
    }

    /* JADX INFO: renamed from: R1 */
    public void m153599R1(float f, float f2, float f3) {
        float[] fArr = this.f131247f;
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
    }

    /* JADX INFO: renamed from: S1 */
    public void m153600S1(float f, float f2, float f3) {
        float[] fArr = this.f131246e;
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
    }

    @Override // p153l.wej
    public String getFragmentShader() {
        return this.f131248g;
    }

    @Override // p153l.wej
    public void initWithGLContext() {
        super.initWithGLContext();
        this.f131242a = GLES20.glGetUniformLocation(this.programHandle, "uCOLOR");
        this.f131243b = GLES20.glGetUniformLocation(this.programHandle, "uTONE");
        this.f131244c = GLES20.glGetUniformLocation(this.programHandle, "uFX");
    }

    @Override // p153l.hs10, p153l.wej
    public void passShaderValues() {
        super.passShaderValues();
        int i = this.f131242a;
        float[] fArr = this.f131245d;
        GLES20.glUniform3f(i, fArr[0], fArr[1], fArr[2]);
        int i2 = this.f131243b;
        float[] fArr2 = this.f131246e;
        GLES20.glUniform3f(i2, fArr2[0], fArr2[1], fArr2[2]);
        int i3 = this.f131244c;
        float[] fArr3 = this.f131247f;
        GLES20.glUniform3f(i3, fArr3[0], fArr3[1], fArr3[2]);
    }
}
