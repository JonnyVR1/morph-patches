package com.momo.mcamera.mask;

import android.opengl.GLES20;
import p153l.h5w;
import p153l.omw;

/* JADX INFO: loaded from: classes8.dex */
public class FaceLookupFilter extends h5w {
    private static final String UNIFORM_ENABLE_LOOKUP = "enable";
    private int enableHandler;
    private boolean enableLookup;

    @Override // p153l.h5w, p153l.wej
    public String getFragmentShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nuniform float enable; void main(){  if(enable == 1){  vec4 texColour = texture2D(inputImageTexture0,textureCoordinate);\n  float blueColor = texColour.b * 63.0;\n  vec2 quad1;\n  quad1.y = floor(floor(blueColor) / 8.0);\n  quad1.x = floor(blueColor) - (quad1.y * 8.0);\n  vec2 quad2;\n  quad2.y = floor(ceil(blueColor) / 8.0);\n  quad2.x = ceil(blueColor) - (quad2.y * 8.0);\n  vec2 texPos1;\n  texPos1.x = (quad1.x * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * texColour.r);\n  texPos1.y = (quad1.y * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * texColour.g);\n  vec2 texPos2;\n  texPos2.x = (quad2.x * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * texColour.r);\n  texPos2.y = (quad2.y * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * texColour.g);\n  vec4 newColor1 = texture2D(inputImageTexture1, texPos1);\n  vec4 newColor2 = texture2D(inputImageTexture1, texPos2);\n  vec4 newColor = mix(newColor1, newColor2, fract(blueColor));\n  gl_FragColor = vec4(newColor.rgb, texColour.a);\n}  else {    gl_FragColor = texture2D(inputImageTexture0,textureCoordinate);\n  }}\n";
    }

    @Override // p153l.h5w, p153l.hs10, p153l.wej
    public void initShaderHandles() {
        super.initShaderHandles();
        this.enableHandler = GLES20.glGetUniformLocation(this.programHandle, UNIFORM_ENABLE_LOOKUP);
    }

    @Override // p153l.h5w, p153l.hs10, p153l.wej
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glUniform1f(this.enableHandler, this.enableLookup ? 1.0f : 0.0f);
    }

    public void setEnableLookup(boolean z) {
        synchronized (getLockObject()) {
            this.enableLookup = z;
        }
    }

    public void setMMCVInfo(omw omwVar) {
    }
}
