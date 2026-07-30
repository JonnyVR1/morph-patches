package p149l;

import android.opengl.GLES20;
import com.p046p1.mobile.putong.data.OMSSizeType;
import project.android.imageprocessing.model.FilterOptions;

/* JADX INFO: loaded from: classes3.dex */
public class ey00 extends AbstractC17477i4 {

    /* JADX INFO: renamed from: c */
    private int f93711c;

    /* JADX INFO: renamed from: d */
    private int f93712d;

    /* JADX INFO: renamed from: a */
    private final String f93709a = "tile_size";

    /* JADX INFO: renamed from: b */
    private final String f93710b = OMSSizeType.ratio;

    /* JADX INFO: renamed from: e */
    private float f93713e = 0.5f;

    /* JADX INFO: renamed from: f */
    String f93714f = "precision highp float;\nvarying vec2 textureCoordinate;\n\nuniform sampler2D inputImageTexture;\nuniform float tile_size;\nuniform float ratio;\n\nvoid main()\n{\n   vec2 mos_texCoord;\n   if(tile_size > 0.0) {\n       float factor = 25.0 / tile_size;\n       mos_texCoord = floor(textureCoordinate * vec2(factor * ratio, factor))/vec2(factor * ratio, factor);\n   } else {\n       mos_texCoord = textureCoordinate;\n   }\n   gl_FragColor = texture2D(inputImageTexture, mos_texCoord);\n}";

    @Override // p149l.ccj
    public String getFragmentShader() {
        return this.f93714f;
    }

    @Override // p149l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f93712d = GLES20.glGetUniformLocation(this.programHandle, "tile_size");
        this.f93711c = GLES20.glGetUniformLocation(this.programHandle, OMSSizeType.ratio);
    }

    @Override // p149l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glUniform1f(this.f93712d, this.f93713e);
        GLES20.glUniform1f(this.f93711c, getWidth() / getHeight());
    }

    @Override // p149l.AbstractC17477i4
    public void setFilterOptions(FilterOptions filterOptions) {
        super.setFilterOptions(filterOptions);
        this.f93713e = filterOptions.getBlockSize();
    }
}
