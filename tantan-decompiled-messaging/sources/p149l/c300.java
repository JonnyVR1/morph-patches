package p149l;

import android.opengl.GLES20;
import project.android.imageprocessing.model.FilterOptions;

/* JADX INFO: loaded from: classes3.dex */
public class c300 extends AbstractC17477i4 {

    /* JADX INFO: renamed from: a */
    private int f78426a;

    /* JADX INFO: renamed from: b */
    private int f78427b;

    @Override // p149l.ccj
    public String getFragmentShader() {
        return "precision mediump float;\n\nvarying vec2 textureCoordinate;\nuniform sampler2D inputImageTexture0;\nuniform float number;\n\nfloat pick(float val) {\n    if (val > 0.5) {\n        val = val - 0.5;\n    }\n    return val * 2.0;\n}\n\nfloat permutation(float val, float offset, float num, float base, float max) {\n    while (val > base) {\n        val = val - base;\n    }\n    return offset + val * num * max;\n}\n\nvoid main() {\n    vec2 uv = textureCoordinate;\n    if (number == 1.0) {\n        if(uv.x > 0.5) {\n            uv.x = 1.0 - uv.x;\n        }\n        uv.x = uv.x + 0.25;\n    } else if (number == 2.0) {\n        float base = 1.0 / number;\n        uv.y = permutation(uv.y, base, number, base, base);\n    } else if (number == 3.0) {\n        uv = vec2(pick(uv.x), pick(uv.y));\n        if(textureCoordinate.x > 0.5) {\n            uv.x = 1.0 - uv.x;\n        }\n        if(textureCoordinate.y <= 0.5) {\n            uv.y = 1.0 - uv.y;\n        }\n    }\n    vec4 result = texture2D(inputImageTexture0, uv);\n    gl_FragColor = result;\n\n}\n";
    }

    @Override // p149l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f78426a = GLES20.glGetUniformLocation(this.programHandle, "number");
    }

    @Override // p149l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glUniform1f(this.f78426a, this.f78427b);
    }

    @Override // p149l.AbstractC17477i4
    public void setFilterOptions(FilterOptions filterOptions) {
        super.setFilterOptions(filterOptions);
        this.f78427b = filterOptions.getType();
    }
}
