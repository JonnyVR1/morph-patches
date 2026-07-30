package p149l;

import android.opengl.GLES20;
import com.momo.mcamera.mask.BigEyeFilter;
import project.android.imageprocessing.model.FilterOptions;

/* JADX INFO: loaded from: classes3.dex */
public class cwb extends AbstractC17477i4 {

    /* JADX INFO: renamed from: c */
    private int f82770c;

    /* JADX INFO: renamed from: d */
    private int f82771d;

    /* JADX INFO: renamed from: a */
    final String f82768a = BigEyeFilter.UNIFORM_TEXTURE_SIZE;

    /* JADX INFO: renamed from: b */
    final String f82769b = "tile_size";

    /* JADX INFO: renamed from: e */
    private float f82772e = 5.0f;

    /* JADX INFO: renamed from: f */
    String f82773f = "precision highp float;\n\nuniform sampler2D inputImageTexture;\nvarying vec2 textureCoordinate;\n uniform vec2 textureSize;\n\nuniform float tile_size;\nvec4 fragColor;\n\nvoid main()\n{\n     float lum = length(texture2D(inputImageTexture, textureCoordinate).rgb);\n     fragColor = vec4(1.0, 1.0, 1.0, 1.0);\n     \n     if (lum < 1.00) {\n         if (mod(floor(textureCoordinate.x*textureSize.y + textureCoordinate.y*textureSize.x), tile_size) == 0.0) {\n             fragColor = vec4(0.0, 0.0, 0.0, 1.0);\n         }\n     }\n     \n     if (lum < 0.75) {\n         if (mod(floor(textureCoordinate.x*textureSize.y - textureCoordinate.y*textureSize.x), tile_size) == 0.0) {\n             fragColor = vec4(0.0, 0.0, 0.0, 1.0);\n         }\n     }\n     \n     if (lum < 0.50) {\n         if (mod(floor(textureCoordinate.x*textureSize.y + textureCoordinate.y*textureSize.x -tile_size/2.), tile_size) == 0.0) {\n             fragColor = vec4(0.0, 0.0, 0.0, 1.0);\n         }\n     }\n     \n     if (lum < 0.3) {\n         if (mod(floor(textureCoordinate.x*textureSize.y - textureCoordinate.y*textureSize.x -tile_size/2.), tile_size) == 0.0) {\n             fragColor = vec4(0.0, 0.0, 0.0, 1.0);\n         }\n     }\n     gl_FragColor = fragColor;\n}\n";

    @Override // p149l.ccj
    public String getFragmentShader() {
        return this.f82773f;
    }

    @Override // p149l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f82770c = GLES20.glGetUniformLocation(this.programHandle, BigEyeFilter.UNIFORM_TEXTURE_SIZE);
        this.f82771d = GLES20.glGetUniformLocation(this.programHandle, "tile_size");
    }

    @Override // p149l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glUniform2f(this.f82770c, getWidth(), getHeight());
        GLES20.glUniform1f(this.f82771d, this.f82772e);
    }

    @Override // p149l.AbstractC17477i4
    public void setFilterOptions(FilterOptions filterOptions) {
        super.setFilterOptions(filterOptions);
        this.f82772e = filterOptions.getAmount() * 10.0f;
    }
}
