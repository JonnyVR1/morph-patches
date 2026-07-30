package com.momo.mcamera.mask.videomix;

import android.opengl.GLES20;
import p149l.etf;
import p149l.pjw;
import p149l.xj10;

/* JADX INFO: loaded from: classes7.dex */
public class VideoMergeFilter extends xj10 implements etf {
    private boolean hasFace;
    private int hasFaceHandle;
    private int type;
    private int typeHandle;

    public VideoMergeFilter() {
        super(3);
        this.hasFace = false;
        this.hasFaceHandle = 0;
    }

    @Override // p149l.xj10, p149l.mcj, p149l.ccj
    public synchronized void destroy() {
        super.destroy();
    }

    @Override // p149l.ccj
    public String getFragmentShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nuniform sampler2D inputImageTexture2;\nvarying vec2 textureCoordinate;\nuniform float hasFace;\nuniform float type;\nvoid main(){\n   vec2 uv = textureCoordinate;\n   vec4 color0 = texture2D(inputImageTexture0, uv);\n   vec4 color1 = texture2D(inputImageTexture1, uv);\n   vec4 color2 = texture2D(inputImageTexture2, uv);\n   vec4 color3 = mix(color1, color0, color2.r);\n   vec4 color4 = mix(color0, color3, step(1.0, hasFace));\n   gl_FragColor = mix(color4, color1, step(1.0, type));\n}\n";
    }

    @Override // p149l.xj10, p149l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.hasFaceHandle = GLES20.glGetUniformLocation(this.programHandle, "hasFace");
        this.typeHandle = GLES20.glGetUniformLocation(this.programHandle, "type");
    }

    @Override // p149l.xj10, p149l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glUniform1f(this.hasFaceHandle, this.hasFace ? 1.0f : 0.0f);
        GLES20.glUniform1f(this.typeHandle, this.type);
    }

    @Override // p149l.etf
    public void setMMCVInfo(pjw pjwVar) {
        this.hasFace = true;
    }

    public void setVideoFileConfig(int i) {
        this.type = i;
    }
}
