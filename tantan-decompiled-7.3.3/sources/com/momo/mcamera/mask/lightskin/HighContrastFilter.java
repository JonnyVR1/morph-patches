package com.momo.mcamera.mask.lightskin;

import p153l.hs10;

/* JADX INFO: loaded from: classes8.dex */
public class HighContrastFilter extends hs10 {
    public HighContrastFilter() {
        super(2);
    }

    @Override // p153l.wej
    public String getFragmentShader() {
        return "varying highp vec2 textureCoordinate;\nuniform sampler2D inputImageTexture0; \nuniform sampler2D inputImageTexture1; \n \n void main() \n{ \n    lowp vec3 iColor = texture2D(inputImageTexture0, textureCoordinate).rgb;\n    lowp vec3 meanColor = texture2D(inputImageTexture1, textureCoordinate).rgb;\n    highp vec3 diffColor = (iColor - meanColor) * 7.07;\n    diffColor = min(diffColor * diffColor, 1.0);\n    gl_FragColor = vec4(diffColor, 1.0);\n}";
    }
}
