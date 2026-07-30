package p003l;

import android.opengl.GLES20;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class rqf extends xj10 {

    /* JADX INFO: renamed from: a */
    private int f7039a;

    /* JADX INFO: renamed from: b */
    private int f7040b;

    /* JADX INFO: renamed from: c */
    private int f7041c;

    /* JADX INFO: renamed from: d */
    private int f7042d;

    /* JADX INFO: renamed from: e */
    private float f7043e;

    /* JADX INFO: renamed from: f */
    private float f7044f;

    /* JADX INFO: renamed from: g */
    private float f7045g;

    /* JADX INFO: renamed from: i */
    private boolean f7046i;

    /* JADX INFO: renamed from: j */
    String f7047j;

    public rqf() {
        super(2);
        this.f7047j = "precision highp float;\nvarying vec2 textureCoordinate;\nuniform float threshold;\nuniform float scalar;\nuniform float HLVig;\nuniform bool grayScale;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nconst vec3 LumCoeff = vec3(0.2125, 0.7154, 0.0721);\nvoid main() { \n    vec3 col=texture2D(inputImageTexture0, textureCoordinate).rgb; \n    vec3 blu=texture2D(inputImageTexture1, textureCoordinate).rgb;\n    if(grayScale){\n        float v=col.r*0.299+col.g*0.587+col.b*0.114;\n        float v2=blu.r*0.299+blu.g*0.587+blu.b*0.114+HLVig;\n        float th=max(threshold,v2); \n        if(v>th){ \n            v=(v-th)/(1.0-th)*scalar;\n            gl_FragColor=vec4(v,v,v,1.0); \n        }  else{ \n            gl_FragColor=vec4(0.0,0.0,0.0,1.0); \n        }\n    } else { \n        vec3 thc=max(vec3(threshold),blu+HLVig);\n        col.r=(col.r>thc.r)?((col.r-thc.r)/(1.0-thc.r)*scalar):0.0;\n        col.g=(col.g>thc.g)?((col.g-thc.g)/(1.0-thc.g)*scalar):0.0;\n        col.b=(col.b>thc.b)?((col.b-thc.b)/(1.0-thc.b)*scalar):0.0;\n        gl_FragColor=vec4(col,1.0); \n    }\n }";
        this.f7043e = 0.85f;
        this.f7045g = 0.35f;
        this.f7044f = 15.0f;
        this.f7046i = true;
        setFloatTexture(true);
    }

    @Override // p003l.ccj
    public String getFragmentShader() {
        return this.f7047j;
    }

    @Override // p003l.xj10, p003l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f7039a = GLES20.glGetUniformLocation(this.programHandle, "threshold");
        this.f7040b = GLES20.glGetUniformLocation(this.programHandle, "scalar");
        this.f7041c = GLES20.glGetUniformLocation(this.programHandle, "HLVig");
        this.f7042d = GLES20.glGetUniformLocation(this.programHandle, "grayScale");
    }

    @Override // p003l.xj10, p003l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glUniform1f(this.f7039a, this.f7043e);
        GLES20.glUniform1f(this.f7040b, this.f7044f);
        GLES20.glUniform1f(this.f7041c, this.f7045g);
        GLES20.glUniform1i(this.f7042d, this.f7046i ? 1 : 0);
    }
}
