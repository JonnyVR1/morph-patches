package p153l;

import android.opengl.GLES20;
import com.momo.mcamera.mask.BigEyeFilter;
import project.android.imageprocessing.model.FilterOptions;

/* JADX INFO: loaded from: classes3.dex */
public class qxb extends AbstractC17634i4 {

    /* JADX INFO: renamed from: c */
    private int f160028c;

    /* JADX INFO: renamed from: d */
    private int f160029d;

    /* JADX INFO: renamed from: a */
    final String f160026a = BigEyeFilter.UNIFORM_TEXTURE_SIZE;

    /* JADX INFO: renamed from: b */
    final String f160027b = "tile_size";

    /* JADX INFO: renamed from: e */
    private float f160030e = 5.0f;

    /* JADX INFO: renamed from: f */
    String f160031f = "precision highp float;\n\nuniform sampler2D inputImageTexture;\nvarying vec2 textureCoordinate;\n uniform vec2 textureSize;\n\nuniform float tile_size;\nvec4 fragColor;\n\nvoid main()\n{\n     float lum = length(texture2D(inputImageTexture, textureCoordinate).rgb);\n     fragColor = vec4(1.0, 1.0, 1.0, 1.0);\n     \n     if (lum < 1.00) {\n         if (mod(floor(textureCoordinate.x*textureSize.y + textureCoordinate.y*textureSize.x), tile_size) == 0.0) {\n             fragColor = vec4(0.0, 0.0, 0.0, 1.0);\n         }\n     }\n     \n     if (lum < 0.75) {\n         if (mod(floor(textureCoordinate.x*textureSize.y - textureCoordinate.y*textureSize.x), tile_size) == 0.0) {\n             fragColor = vec4(0.0, 0.0, 0.0, 1.0);\n         }\n     }\n     \n     if (lum < 0.50) {\n         if (mod(floor(textureCoordinate.x*textureSize.y + textureCoordinate.y*textureSize.x -tile_size/2.), tile_size) == 0.0) {\n             fragColor = vec4(0.0, 0.0, 0.0, 1.0);\n         }\n     }\n     \n     if (lum < 0.3) {\n         if (mod(floor(textureCoordinate.x*textureSize.y - textureCoordinate.y*textureSize.x -tile_size/2.), tile_size) == 0.0) {\n             fragColor = vec4(0.0, 0.0, 0.0, 1.0);\n         }\n     }\n     gl_FragColor = fragColor;\n}\n";

    @Override // p153l.wej
    public String getFragmentShader() {
        return this.f160031f;
    }

    @Override // p153l.wej
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f160028c = GLES20.glGetUniformLocation(this.programHandle, BigEyeFilter.UNIFORM_TEXTURE_SIZE);
        this.f160029d = GLES20.glGetUniformLocation(this.programHandle, "tile_size");
    }

    @Override // p153l.wej
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glUniform2f(this.f160028c, getWidth(), getHeight());
        GLES20.glUniform1f(this.f160029d, this.f160030e);
    }

    @Override // p153l.AbstractC17634i4
    public void setFilterOptions(FilterOptions filterOptions) {
        super.setFilterOptions(filterOptions);
        this.f160030e = filterOptions.getAmount() * 10.0f;
    }
}
