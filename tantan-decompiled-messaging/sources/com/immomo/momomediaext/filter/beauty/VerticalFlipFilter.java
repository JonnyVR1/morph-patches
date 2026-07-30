package com.immomo.momomediaext.filter.beauty;

import p149l.ts2;

/* JADX INFO: loaded from: classes7.dex */
public class VerticalFlipFilter extends ts2 {
    @Override // p149l.ccj
    public String getFragmentShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nvoid main(){\n   vec2 uv = textureCoordinate;\n   gl_FragColor = texture2D(inputImageTexture0, vec2(uv.x, 1.0 - uv.y));\n}\n";
    }
}
