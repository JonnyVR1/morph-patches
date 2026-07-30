package p153l;

import android.opengl.GLES20;
import com.p051p1.mobile.putong.data.OMSSizeType;
import project.android.imageprocessing.model.FilterOptions;

/* JADX INFO: loaded from: classes3.dex */
public class o610 extends AbstractC17634i4 {

    /* JADX INFO: renamed from: c */
    private int f145133c;

    /* JADX INFO: renamed from: d */
    private int f145134d;

    /* JADX INFO: renamed from: a */
    private final String f145131a = "tile_size";

    /* JADX INFO: renamed from: b */
    private final String f145132b = OMSSizeType.ratio;

    /* JADX INFO: renamed from: e */
    private float f145135e = 0.5f;

    /* JADX INFO: renamed from: f */
    String f145136f = "precision highp float;\nvarying vec2 textureCoordinate;\n\nuniform sampler2D inputImageTexture;\nuniform float tile_size;\nuniform float ratio;\n\nvoid main()\n{\n   vec2 mos_texCoord;\n   if(tile_size > 0.0) {\n       float factor = 25.0 / tile_size;\n       mos_texCoord = floor(textureCoordinate * vec2(factor * ratio, factor))/vec2(factor * ratio, factor);\n   } else {\n       mos_texCoord = textureCoordinate;\n   }\n   gl_FragColor = texture2D(inputImageTexture, mos_texCoord);\n}";

    @Override // p153l.wej
    public String getFragmentShader() {
        return this.f145136f;
    }

    @Override // p153l.wej
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f145134d = GLES20.glGetUniformLocation(this.programHandle, "tile_size");
        this.f145133c = GLES20.glGetUniformLocation(this.programHandle, OMSSizeType.ratio);
    }

    @Override // p153l.wej
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glUniform1f(this.f145134d, this.f145135e);
        GLES20.glUniform1f(this.f145133c, getWidth() / getHeight());
    }

    @Override // p153l.AbstractC17634i4
    public void setFilterOptions(FilterOptions filterOptions) {
        super.setFilterOptions(filterOptions);
        this.f145135e = filterOptions.getBlockSize();
    }
}
