package com.momo.mcamera.mask;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.text.TextUtils;
import com.core.glcore.util.ImageUtils;
import com.core.glcore.util.TextureHelper;
import java.io.File;
import java.util.List;
import p149l.mcj;
import p149l.ts2;
import p149l.vjw;

/* JADX INFO: loaded from: classes7.dex */
public class CXSkinWhiteningFilter extends ts2 {
    private static final String UNIFORM_ALPHA = "alpha";
    private static final String UNIFORM_LEVEL_BLACK = "levelBlack";
    private static final String UNIFORM_LEVEL_RANGE_INV = "levelRangeInv";
    private int alphaHandle = 0;
    private int levelBlackHandle = 0;
    private int levelRangeInvHandle = 0;
    private int mTextureHandle1 = 0;
    private int mTextureHandle2 = 0;
    private boolean isInit = false;
    private float alpha = 0.0f;
    private float levelBlack = 0.0f;
    private float levelRangeInv = 1.0f;
    private int mEnhancementCurveTexture = 0;
    private int mEnhancementLookupTexture = 0;
    private String mEnhancementCurvePath = null;
    private String mEnhancementLookupPath = null;
    private Bitmap mEnhancementCurveBitmap = null;
    private Bitmap mEnhancementLookupBitmap = null;

    @Override // p149l.ccj
    public String getFragmentShader() {
        return "precision highp float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nuniform sampler2D inputImageTexture1;\nuniform sampler2D inputImageTexture2;\nuniform float levelBlack;\nuniform float levelRangeInv;\nuniform float alpha;\nvoid main() {\n    vec3 colorOrigin = texture2D(inputImageTexture0,textureCoordinate).rgb;\n    vec3 color = clamp((colorOrigin - vec3(levelBlack)) * levelRangeInv, 0.0, 1.0);\n    vec3 texel;\n    texel.r = texture2D(inputImageTexture2, vec2((color.r * 255.0 + 0.5) / 256.0, 0.5)).r;\n    texel.g = texture2D(inputImageTexture2, vec2((color.g * 255.0 + 0.5) / 256.0, 0.5)).g;\n    texel.b = texture2D(inputImageTexture2, vec2((color.b * 255.0 + 0.5) / 256.0, 0.5)).b;\n    texel.r = texel.r + 0.03;\n    texel.g = texel.g - 0.03;\n    texel.b = texel.b - 0.01;\n    texel = clamp(texel, 0.0, 1.0);\n    texel = mix(color, texel, 0.5);\n    texel = mix(colorOrigin, texel, alpha);\n    \n    float blueColor = texel.b * 15.0;\n    vec2 quad1, quad2;\n    quad1.y = floor(floor(blueColor) * 0.25);\n    quad1.x = floor(blueColor) - (quad1.y * 4.0);\n    quad2.y = floor(ceil(blueColor) * 0.25);\n    quad2.x = ceil(blueColor) - (quad2.y * 4.0);\n    vec2 texPos2, texPos1;\n    texPos2 = texel.rg * 0.234375 + 0.0078125;\n    texPos1 = quad1 * 0.25 + texPos2;\n    texPos2 = quad2 * 0.25 + texPos2;\n    vec4 newColor1 = texture2D(inputImageTexture1, texPos1);\n    vec4 newColor2 = texture2D(inputImageTexture1, texPos2);\n    color = mix(newColor1.rgb, newColor2.rgb, fract(blueColor));\n    color = mix(texel, color, 0.65);\n    gl_FragColor = vec4(mix(colorOrigin, color, alpha*0.9), 1.0);\n}";
    }

    @Override // p149l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.mTextureHandle1 = GLES20.glGetUniformLocation(this.programHandle, "inputImageTexture1");
        this.mTextureHandle2 = GLES20.glGetUniformLocation(this.programHandle, "inputImageTexture2");
        this.alphaHandle = GLES20.glGetUniformLocation(this.programHandle, UNIFORM_ALPHA);
        this.levelBlackHandle = GLES20.glGetUniformLocation(this.programHandle, UNIFORM_LEVEL_BLACK);
        this.levelRangeInvHandle = GLES20.glGetUniformLocation(this.programHandle, UNIFORM_LEVEL_RANGE_INV);
    }

    @Override // p149l.ts2, p149l.jcj
    public void newTextureReady(int i, mcj mcjVar, boolean z) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this.mEnhancementCurveTexture == 0 && !TextUtils.isEmpty(this.mEnhancementCurvePath) && new File(this.mEnhancementCurvePath).exists()) {
            vjw vjwVar = new vjw();
            ImageUtils.decodeMMCVImage(vjwVar, this.mEnhancementCurvePath);
            this.mEnhancementCurveTexture = TextureHelper.bitmapToTexture(vjwVar);
        } else if (this.mEnhancementCurveTexture == 0 && (bitmap = this.mEnhancementCurveBitmap) != null && !bitmap.isRecycled()) {
            this.mEnhancementCurveTexture = TextureHelper.bitmapToTexture(this.mEnhancementCurveBitmap);
        }
        if (this.mEnhancementLookupTexture == 0 && !TextUtils.isEmpty(this.mEnhancementLookupPath) && new File(this.mEnhancementLookupPath).exists()) {
            vjw vjwVar2 = new vjw();
            ImageUtils.decodeMMCVImage(vjwVar2, this.mEnhancementLookupPath);
            this.mEnhancementLookupTexture = TextureHelper.bitmapToTexture(vjwVar2);
        } else if (this.mEnhancementLookupTexture == 0 && (bitmap2 = this.mEnhancementLookupBitmap) != null && !bitmap2.isRecycled()) {
            int iBitmapToTexture = TextureHelper.bitmapToTexture(this.mEnhancementLookupBitmap);
            this.mEnhancementLookupTexture = iBitmapToTexture;
            if (iBitmapToTexture != 0) {
                this.mEnhancementLookupBitmap = null;
            }
        }
        super.newTextureReady(i, mcjVar, z);
    }

    @Override // p149l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        if (this.isInit) {
            GLES20.glActiveTexture(33985);
            GLES20.glBindTexture(3553, this.mEnhancementLookupTexture);
            GLES20.glUniform1i(this.mTextureHandle1, 1);
            GLES20.glActiveTexture(33986);
            GLES20.glBindTexture(3553, this.mEnhancementCurveTexture);
            GLES20.glUniform1i(this.mTextureHandle2, 2);
            GLES20.glUniform1f(this.alphaHandle, this.alpha);
            GLES20.glUniform1f(this.levelBlackHandle, this.levelBlack);
            GLES20.glUniform1f(this.levelRangeInvHandle, this.levelRangeInv);
        }
    }

    public void setAlpha(float f) {
        this.alpha = f;
    }

    public void setImageBitmap(Bitmap bitmap, Bitmap bitmap2) {
        this.mEnhancementCurveBitmap = bitmap;
        this.mEnhancementLookupBitmap = bitmap2;
        if (bitmap == null || bitmap2 == null) {
            return;
        }
        this.isInit = true;
    }

    public void setImagepath(List<String> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        this.mEnhancementCurvePath = list.get(0);
        this.mEnhancementLookupPath = list.get(1);
        this.isInit = true;
    }
}
