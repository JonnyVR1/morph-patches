package com.momo.mcamera.mask.skin;

import p153l.hs10;

/* JADX INFO: loaded from: classes8.dex */
public class AISkinMixFilter extends hs10 {
    public AISkinMixFilter() {
        super(2);
    }

    @Override // p153l.wej
    public String getFragmentShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nvoid main() {\n    vec4 color1 = texture2D(inputImageTexture0,textureCoordinate);\n    vec4 color2 = texture2D(inputImageTexture1,textureCoordinate);\n    vec4 rColor = vec4((color1.xyz + 2.0 * color2.xyz) - vec3(1., 1., 1.), 1.0);\n    gl_FragColor = mix(rColor, color1, 0.5);}\n";
    }
}
