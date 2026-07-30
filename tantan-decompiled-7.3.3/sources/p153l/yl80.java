package p153l;

import android.opengl.GLES20;
import com.immomo.velib.anim.model.PostProcessingModel;

/* JADX INFO: loaded from: classes7.dex */
public class yl80 extends it2 implements i3m {

    /* JADX INFO: renamed from: E */
    private float f200536E;

    /* JADX INFO: renamed from: F */
    private int f200537F;

    /* JADX INFO: renamed from: G */
    private String f200538G = "mediump";

    @Override // p153l.i3m
    /* JADX INFO: renamed from: d */
    public void mo98815d(PostProcessingModel.ParamsModel paramsModel) {
        this.f200536E = paramsModel == null ? 1.0f : paramsModel.getContrast();
    }

    @Override // p153l.i3m
    /* JADX INFO: renamed from: f */
    public void mo98816f(String str) {
        this.f200538G = str;
    }

    @Override // p153l.vej
    /* JADX INFO: renamed from: p */
    public String mo97356p() {
        return "precision " + this.f200538G + " float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nuniform float u_Contrast;\nvoid main(){\n   vec4 color = texture2D(inputImageTexture0,textureCoordinate);\n   gl_FragColor = vec4(((color.rgb - vec3(0.5)) * u_Contrast + vec3(0.5)), color.a);\n}\n";
    }

    @Override // p153l.vej
    /* JADX INFO: renamed from: u */
    public void mo97358u() {
        super.mo97358u();
        this.f200537F = GLES20.glGetUniformLocation(this.f183782d, "u_Contrast");
    }

    @Override // p153l.vej
    /* JADX INFO: renamed from: x */
    public void mo97359x() {
        super.mo97359x();
        GLES20.glUniform1f(this.f200537F, this.f200536E);
    }
}
