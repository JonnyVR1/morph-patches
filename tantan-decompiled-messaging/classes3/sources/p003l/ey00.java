package p003l;

import android.opengl.GLES20;
import project.android.imageprocessing.model.FilterOptions;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ey00 extends AbstractC0341i4 {

    /* JADX INFO: renamed from: c */
    private int f3420c;

    /* JADX INFO: renamed from: d */
    private int f3421d;

    /* JADX INFO: renamed from: a */
    private final String f3418a = "tile_size";

    /* JADX INFO: renamed from: b */
    private final String f3419b = "ratio";

    /* JADX INFO: renamed from: e */
    private float f3422e = 0.5f;

    /* JADX INFO: renamed from: f */
    String f3423f = "precision highp float;\nvarying vec2 textureCoordinate;\n\nuniform sampler2D inputImageTexture;\nuniform float tile_size;\nuniform float ratio;\n\nvoid main()\n{\n   vec2 mos_texCoord;\n   if(tile_size > 0.0) {\n       float factor = 25.0 / tile_size;\n       mos_texCoord = floor(textureCoordinate * vec2(factor * ratio, factor))/vec2(factor * ratio, factor);\n   } else {\n       mos_texCoord = textureCoordinate;\n   }\n   gl_FragColor = texture2D(inputImageTexture, mos_texCoord);\n}";

    @Override // p003l.ccj
    public String getFragmentShader() {
        return this.f3423f;
    }

    @Override // p003l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f3421d = GLES20.glGetUniformLocation(this.programHandle, "tile_size");
        this.f3420c = GLES20.glGetUniformLocation(this.programHandle, "ratio");
    }

    @Override // p003l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glUniform1f(this.f3421d, this.f3422e);
        GLES20.glUniform1f(this.f3420c, getWidth() / getHeight());
    }

    @Override // p003l.AbstractC0341i4
    public void setFilterOptions(FilterOptions filterOptions) {
        super.setFilterOptions(filterOptions);
        this.f3422e = filterOptions.getBlockSize();
    }
}
