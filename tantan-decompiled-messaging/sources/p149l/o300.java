package p149l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes3.dex */
public class o300 extends xj10 {

    /* JADX INFO: renamed from: a */
    int f141577a;

    /* JADX INFO: renamed from: b */
    int f141578b;

    /* JADX INFO: renamed from: c */
    int f141579c;

    /* JADX INFO: renamed from: d */
    float[] f141580d;

    /* JADX INFO: renamed from: e */
    float[] f141581e;

    /* JADX INFO: renamed from: f */
    float[] f141582f;

    /* JADX INFO: renamed from: g */
    String f141583g;

    /* JADX INFO: renamed from: i */
    String f141584i;

    public o300() {
        super(2);
        this.f141580d = new float[3];
        this.f141581e = new float[3];
        this.f141582f = new float[3];
        this.f141583g = "precision highp float;\nvarying vec2 textureCoordinate;\nuniform sampler2D inputImageTexture0;//原图\nuniform sampler2D inputImageTexture1;//星星\nuniform vec3 uCOLOR;\nuniform vec3 uTONE;\nuniform vec3 uFX;\nconst vec3 LumCoeff = vec3(0.2125, 0.7154, 0.0721);\nconst vec3 AvgLumin = vec3(0.5, 0.5, 0.5);\nvoid main(){ \n    vec3 col2; \n    vec3 col = texture2D(inputImageTexture0, textureCoordinate).rgb; \n    col2 = col * uTONE.y; \n\n    if(uFX.z>0.0) col+=(col-col2)*uFX.z; \n    if(uFX.x>0.0) col = 1.0 - (1.0 - col2*uFX.x) * (1.0 - col); \n\n    col2 = col * uTONE.y; \n    col = pow(mix(AvgLumin, mix(vec3(dot(col2, LumCoeff)), col2, uTONE.x), uTONE.z),uCOLOR); //uTone.x 调节饱和度，0饱和度最低，1饱和度最高。 uTone.z 调节对比度，0对比度最低，1对比度最高\n\n    col = clamp(col,0.0,1.0); \n\n    col += texture2D(inputImageTexture1, textureCoordinate).rgb; \n\n    if(uFX.y>0.0) col*=pow(1.0 - length(0.5 - textureCoordinate) / length(vec2(0.5)),uFX.y); \n\n    gl_FragColor = vec4(col, 1.0); \n}";
        this.f141584i = "precision highp float;\nvarying vec2 TexCoord;\nuniform sampler2D sceneTex;//原图\nuniform sampler2D blurTex;//星星\nuniform sampler2D softTex;//原图的模糊图\nuniform vec3 uCOLOR;\nuniform vec3 uTONE;\nuniform vec3 uFX;\nconst vec3 LumCoeff = vec3(0.2125, 0.7154, 0.0721);\nconst vec3 AvgLumin = vec3(0.5, 0.5, 0.5);\nvoid main(){ \n    vec3 col2; \n    vec3 col = texture2D(sceneTex, TexCoord).rgb; \n    col2 = texture2D(softTex, TexCoord).rgb; \n\n    if(uFX.z>0.0) col+=(col-col2)*uFX.z; \n    if(uFX.x>0.0) col = 1.0 - (1.0 - col2*uFX.x) * (1.0 - col); \n\n    col2 = col * uTONE.y; \n    col = pow(mix(AvgLumin, mix(vec3(dot(col2, LumCoeff)), col2, uTONE.x), uTONE.z),uCOLOR); //uTone.x 调节饱和度，0饱和度最低，1饱和度最高。 uTone.z 调节对比度，0对比度最低，1对比度最高\n\n    col = clamp(col,0.0,1.0); \n\n    col += texture2D(blurTex, TexCoord).rgb; \n\n    if(uFX.y>0.0) col*=pow(1.0 - length(0.5 - TexCoord) / length(vec2(0.5)),uFX.y); \n\n    gl_FragColor = vec4(col, 1.0); \n}";
        setFloatTexture(true);
    }

    /* JADX INFO: renamed from: Q1 */
    public void m162328Q1(float f, float f2, float f3) {
        float[] fArr = this.f141580d;
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
    }

    /* JADX INFO: renamed from: R1 */
    public void m162329R1(float f, float f2, float f3) {
        float[] fArr = this.f141582f;
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
    }

    /* JADX INFO: renamed from: S1 */
    public void m162330S1(float f, float f2, float f3) {
        float[] fArr = this.f141581e;
        fArr[0] = f;
        fArr[1] = f2;
        fArr[2] = f3;
    }

    @Override // p149l.ccj
    public String getFragmentShader() {
        return this.f141583g;
    }

    @Override // p149l.ccj
    public void initWithGLContext() {
        super.initWithGLContext();
        this.f141577a = GLES20.glGetUniformLocation(this.programHandle, "uCOLOR");
        this.f141578b = GLES20.glGetUniformLocation(this.programHandle, "uTONE");
        this.f141579c = GLES20.glGetUniformLocation(this.programHandle, "uFX");
    }

    @Override // p149l.xj10, p149l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        int i = this.f141577a;
        float[] fArr = this.f141580d;
        GLES20.glUniform3f(i, fArr[0], fArr[1], fArr[2]);
        int i2 = this.f141578b;
        float[] fArr2 = this.f141581e;
        GLES20.glUniform3f(i2, fArr2[0], fArr2[1], fArr2[2]);
        int i3 = this.f141579c;
        float[] fArr3 = this.f141582f;
        GLES20.glUniform3f(i3, fArr3[0], fArr3[1], fArr3[2]);
    }
}
