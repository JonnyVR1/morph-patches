package p003l;

import android.opengl.GLES20;
import project.android.imageprocessing.model.FilterOptions;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class cwb extends AbstractC0341i4 {

    /* JADX INFO: renamed from: c */
    private int f2845c;

    /* JADX INFO: renamed from: d */
    private int f2846d;

    /* JADX INFO: renamed from: a */
    final String f2843a = "textureSize";

    /* JADX INFO: renamed from: b */
    final String f2844b = "tile_size";

    /* JADX INFO: renamed from: e */
    private float f2847e = 5.0f;

    /* JADX INFO: renamed from: f */
    String f2848f = "precision highp float;\n\nuniform sampler2D inputImageTexture;\nvarying vec2 textureCoordinate;\n uniform vec2 textureSize;\n\nuniform float tile_size;\nvec4 fragColor;\n\nvoid main()\n{\n     float lum = length(texture2D(inputImageTexture, textureCoordinate).rgb);\n     fragColor = vec4(1.0, 1.0, 1.0, 1.0);\n     \n     if (lum < 1.00) {\n         if (mod(floor(textureCoordinate.x*textureSize.y + textureCoordinate.y*textureSize.x), tile_size) == 0.0) {\n             fragColor = vec4(0.0, 0.0, 0.0, 1.0);\n         }\n     }\n     \n     if (lum < 0.75) {\n         if (mod(floor(textureCoordinate.x*textureSize.y - textureCoordinate.y*textureSize.x), tile_size) == 0.0) {\n             fragColor = vec4(0.0, 0.0, 0.0, 1.0);\n         }\n     }\n     \n     if (lum < 0.50) {\n         if (mod(floor(textureCoordinate.x*textureSize.y + textureCoordinate.y*textureSize.x -tile_size/2.), tile_size) == 0.0) {\n             fragColor = vec4(0.0, 0.0, 0.0, 1.0);\n         }\n     }\n     \n     if (lum < 0.3) {\n         if (mod(floor(textureCoordinate.x*textureSize.y - textureCoordinate.y*textureSize.x -tile_size/2.), tile_size) == 0.0) {\n             fragColor = vec4(0.0, 0.0, 0.0, 1.0);\n         }\n     }\n     gl_FragColor = fragColor;\n}\n";

    @Override // p003l.ccj
    public String getFragmentShader() {
        return this.f2848f;
    }

    @Override // p003l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f2845c = GLES20.glGetUniformLocation(this.programHandle, "textureSize");
        this.f2846d = GLES20.glGetUniformLocation(this.programHandle, "tile_size");
    }

    @Override // p003l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glUniform2f(this.f2845c, getWidth(), getHeight());
        GLES20.glUniform1f(this.f2846d, this.f2847e);
    }

    @Override // p003l.AbstractC0341i4
    public void setFilterOptions(FilterOptions filterOptions) {
        super.setFilterOptions(filterOptions);
        this.f2847e = filterOptions.getAmount() * 10.0f;
    }
}
