package p149l;

import android.opengl.GLES20;
import com.immomo.velib.anim.model.PostProcessingModel;

/* JADX INFO: loaded from: classes7.dex */
public class rd80 extends ss2 implements o0m {

    /* JADX INFO: renamed from: E */
    private float f158897E;

    /* JADX INFO: renamed from: F */
    private int f158898F;

    /* JADX INFO: renamed from: G */
    private String f158899G = "mediump";

    @Override // p149l.o0m
    /* JADX INFO: renamed from: d */
    public void mo162155d(PostProcessingModel.ParamsModel paramsModel) {
        this.f158897E = paramsModel == null ? 1.0f : paramsModel.getSaturation();
    }

    @Override // p149l.o0m
    /* JADX INFO: renamed from: f */
    public void mo162156f(String str) {
        this.f158899G = str;
    }

    @Override // p149l.bcj
    /* JADX INFO: renamed from: p */
    public String mo95686p() {
        return "precision " + this.f158899G + " float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nuniform float u_Saturation;\nconst vec3 luminanceWeighting = vec3(0.2125, 0.7154, 0.0721);\nvoid main(){\n   vec4 color = texture2D(inputImageTexture0,textureCoordinate);\n   float luminance = dot(color.rgb, luminanceWeighting);\n   vec3 greyScaleColor = vec3(luminance);\n   gl_FragColor = vec4(mix(greyScaleColor, color.rgb, u_Saturation), color.a);\n}\n";
    }

    @Override // p149l.bcj
    /* JADX INFO: renamed from: u */
    public void mo95688u() {
        super.mo95688u();
        this.f158898F = GLES20.glGetUniformLocation(this.f74924d, "u_Saturation");
    }

    @Override // p149l.bcj
    /* JADX INFO: renamed from: x */
    public void mo101089x() {
        super.mo101089x();
        GLES20.glUniform1f(this.f158898F, this.f158897E);
    }
}
