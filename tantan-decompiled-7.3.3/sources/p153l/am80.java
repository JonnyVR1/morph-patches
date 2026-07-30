package p153l;

import android.opengl.GLES20;
import com.immomo.velib.anim.model.PostProcessingModel;

/* JADX INFO: loaded from: classes7.dex */
public class am80 extends it2 implements i3m {

    /* JADX INFO: renamed from: E */
    private float f72210E;

    /* JADX INFO: renamed from: F */
    private int f72211F;

    /* JADX INFO: renamed from: G */
    private String f72212G = "mediump";

    @Override // p153l.i3m
    /* JADX INFO: renamed from: d */
    public void mo98815d(PostProcessingModel.ParamsModel paramsModel) {
        this.f72210E = paramsModel == null ? 1.0f : paramsModel.getSaturation();
    }

    @Override // p153l.i3m
    /* JADX INFO: renamed from: f */
    public void mo98816f(String str) {
        this.f72212G = str;
    }

    @Override // p153l.vej
    /* JADX INFO: renamed from: p */
    public String mo97356p() {
        return "precision " + this.f72212G + " float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nuniform float u_Saturation;\nconst vec3 luminanceWeighting = vec3(0.2125, 0.7154, 0.0721);\nvoid main(){\n   vec4 color = texture2D(inputImageTexture0,textureCoordinate);\n   float luminance = dot(color.rgb, luminanceWeighting);\n   vec3 greyScaleColor = vec3(luminance);\n   gl_FragColor = vec4(mix(greyScaleColor, color.rgb, u_Saturation), color.a);\n}\n";
    }

    @Override // p153l.vej
    /* JADX INFO: renamed from: u */
    public void mo97358u() {
        super.mo97358u();
        this.f72211F = GLES20.glGetUniformLocation(this.f183782d, "u_Saturation");
    }

    @Override // p153l.vej
    /* JADX INFO: renamed from: x */
    public void mo97359x() {
        super.mo97359x();
        GLES20.glUniform1f(this.f72211F, this.f72210E);
    }
}
