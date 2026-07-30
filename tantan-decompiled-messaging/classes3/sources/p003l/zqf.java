package p003l;

import android.opengl.GLES20;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class zqf extends ts2 {

    /* JADX INFO: renamed from: a */
    private int f9400a;

    /* JADX INFO: renamed from: b */
    private int f9401b;

    @Override // p003l.ccj
    public String getFragmentShader() {
        return "precision highp float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nuniform float width;\nuniform float height;\nconst float PI = 3.1415926535;\n\nvoid main(){\n    vec2 uv = textureCoordinate;\n    float aspectRatio = height/width;\n    float aperture = 178.0;\n    float apertureHalf = 0.5 * aperture * (PI / 180.0);\n    float maxFactor = sin(apertureHalf);    vec2 xy = 1.5 * uv * vec2(1.0,aspectRatio) - 0.75*vec2(1.0,aspectRatio);\n    float d = length(xy);\n    if (d < (2.0-maxFactor))\n    {\n      d = length(xy * maxFactor);\n      float z = sqrt(1.0 - d * d);\n      float r = atan(d, z) / PI;\n      float phi = atan(xy.y, xy.x);\n      \n      uv.x = 1.5*r * cos(phi) + 0.5;\n      uv.y = r * sin(phi) + 0.5;\n    gl_FragColor = texture2D(inputImageTexture0, uv); \n    } else {\n    gl_FragColor = vec4(0.0, 0.0, 0.0, 1);    }\n}";
    }

    @Override // p003l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.f9400a = GLES20.glGetUniformLocation(this.programHandle, IjkMediaMeta.IJKM_KEY_WIDTH);
        this.f9401b = GLES20.glGetUniformLocation(this.programHandle, IjkMediaMeta.IJKM_KEY_HEIGHT);
    }

    @Override // p003l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        if (getWidth() == 0 || getHeight() == 0) {
            return;
        }
        GLES20.glUniform1f(this.f9400a, getWidth());
        GLES20.glUniform1f(this.f9401b, getHeight());
    }
}
