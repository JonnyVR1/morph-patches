package p149l;

import android.opengl.GLES20;
import com.immomo.velib.anim.model.PostProcessingModel;

/* JADX INFO: loaded from: classes7.dex */
public class pd80 extends ss2 implements o0m {

    /* JADX INFO: renamed from: E */
    private float f148283E;

    /* JADX INFO: renamed from: F */
    private int f148284F;

    /* JADX INFO: renamed from: G */
    private String f148285G = "mediump";

    @Override // p149l.o0m
    /* JADX INFO: renamed from: d */
    public void mo162155d(PostProcessingModel.ParamsModel paramsModel) {
        this.f148283E = paramsModel == null ? 1.0f : paramsModel.getContrast();
    }

    @Override // p149l.o0m
    /* JADX INFO: renamed from: f */
    public void mo162156f(String str) {
        this.f148285G = str;
    }

    @Override // p149l.bcj
    /* JADX INFO: renamed from: p */
    public String mo95686p() {
        return "precision " + this.f148285G + " float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nuniform float u_Contrast;\nvoid main(){\n   vec4 color = texture2D(inputImageTexture0,textureCoordinate);\n   gl_FragColor = vec4(((color.rgb - vec3(0.5)) * u_Contrast + vec3(0.5)), color.a);\n}\n";
    }

    @Override // p149l.bcj
    /* JADX INFO: renamed from: u */
    public void mo95688u() {
        super.mo95688u();
        this.f148284F = GLES20.glGetUniformLocation(this.f74924d, "u_Contrast");
    }

    @Override // p149l.bcj
    /* JADX INFO: renamed from: x */
    public void mo101089x() {
        super.mo101089x();
        GLES20.glUniform1f(this.f148284F, this.f148283E);
    }
}
