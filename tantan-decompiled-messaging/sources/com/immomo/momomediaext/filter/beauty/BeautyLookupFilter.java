package com.immomo.momomediaext.filter.beauty;

import android.opengl.GLES20;
import android.text.TextUtils;
import com.core.glcore.util.ImageUtils;
import com.core.glcore.util.TextureHelper;
import p149l.mcj;
import p149l.ts2;
import p149l.vjw;

/* JADX INFO: loaded from: classes7.dex */
public class BeautyLookupFilter extends ts2 {
    private int lookupTexture = 0;
    private int lookupTextureHandle = 0;
    private String lookupPath = "";
    private float intensity = 0.0f;
    private int intensityHandle = 0;
    private int originHandle = 0;
    private boolean showOrigin = true;
    private boolean isResourceChanged = false;

    @Override // p149l.ccj
    public String getFragmentShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nuniform sampler2D inputImageTexture1;\nvarying vec2 textureCoordinate;\nuniform float intensity;\nuniform float origin;\nvoid main(){\n  if (origin == 1.0) {\n      gl_FragColor = texture2D(inputImageTexture0,textureCoordinate);\n  } else {\n      vec4 texColour = texture2D(inputImageTexture0,textureCoordinate);\n      float blueColor = texColour.b * 63.0;\n      vec2 quad1;\n      quad1.y = floor(floor(blueColor) / 8.0);\n      quad1.x = floor(blueColor) - (quad1.y * 8.0);\n      vec2 quad2;\n      quad2.y = floor(ceil(blueColor) / 8.0);\n      quad2.x = ceil(blueColor) - (quad2.y * 8.0);\n      vec2 texPos1;\n      texPos1.x = (quad1.x * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * texColour.r);\n      texPos1.y = (quad1.y * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * texColour.g);\n      vec2 texPos2;\n      texPos2.x = (quad2.x * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * texColour.r);\n      texPos2.y = (quad2.y * 0.125) + 0.5/512.0 + ((0.125 - 1.0/512.0) * texColour.g);\n      vec4 newColor1 = texture2D(inputImageTexture1, texPos1);\n      vec4 newColor2 = texture2D(inputImageTexture1, texPos2);\n      vec4 newColor = mix(newColor1, newColor2, fract(blueColor));\n      gl_FragColor = mix(texColour, vec4(newColor.rgb, texColour.a), intensity);\n  }\n}\n";
    }

    @Override // p149l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.intensityHandle = GLES20.glGetUniformLocation(this.programHandle, "intensity");
        this.originHandle = GLES20.glGetUniformLocation(this.programHandle, "origin");
        this.lookupTextureHandle = GLES20.glGetUniformLocation(this.programHandle, "inputImageTexture1");
    }

    @Override // p149l.ts2, p149l.jcj
    public void newTextureReady(int i, mcj mcjVar, boolean z) {
        super.newTextureReady(i, mcjVar, z);
        if (!this.isResourceChanged || TextUtils.isEmpty(this.lookupPath)) {
            return;
        }
        vjw vjwVar = new vjw();
        ImageUtils.decodeMMCVImage(vjwVar, this.lookupPath);
        int i2 = this.lookupTexture;
        if (i2 == 0) {
            this.lookupTexture = TextureHelper.bitmapToTexture(vjwVar);
        } else {
            this.lookupTexture = TextureHelper.loadDataToTexture(i2, vjwVar);
        }
        this.showOrigin = false;
        this.isResourceChanged = false;
    }

    @Override // p149l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glUniform1f(this.intensityHandle, this.intensity);
        GLES20.glUniform1f(this.originHandle, this.showOrigin ? 1.0f : 0.0f);
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, this.lookupTexture);
        GLES20.glUniform1i(this.lookupTextureHandle, 1);
    }

    public void setIntensity(float f) {
        this.intensity = f;
    }

    public void setLookupPath(String str) {
        this.lookupPath = str;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        this.showOrigin = zIsEmpty;
        this.isResourceChanged = !zIsEmpty;
    }
}
