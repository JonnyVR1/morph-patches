package com.momo.xeengine.egl;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
@Keep
public class TextureRender extends BaseTextureRender {

    /* JADX INFO: renamed from: ps */
    private static final String f272ps = "precision mediump float;\nvarying vec2 vTextureCo;\nuniform sampler2D uTexture;\nvoid main() {\n    gl_FragColor = texture2D(uTexture, vTextureCo);\n}";

    /* JADX INFO: renamed from: vs */
    private static final String f273vs = "attribute vec4 aVertexCo;\nattribute vec2 aTextureCo;\nuniform mat4 uVertexMatrix;\nuniform mat4 uTextureMatrix;\nvarying vec2 vTextureCo;\nvoid main(){\n    gl_Position = uVertexMatrix * aVertexCo;\n    vTextureCo = (uTextureMatrix * vec4(aTextureCo,0,1)).xy;\n}";

    public TextureRender() {
        super(f273vs, f272ps);
        create();
    }
}
