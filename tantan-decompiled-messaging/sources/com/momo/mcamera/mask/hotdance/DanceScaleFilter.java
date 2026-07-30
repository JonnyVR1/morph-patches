package com.momo.mcamera.mask.hotdance;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.opengl.GLES20;
import android.opengl.Matrix;
import com.p046p1.mobile.putong.core.data.IntlMarketToken;
import p149l.ts2;

/* JADX INFO: loaded from: classes7.dex */
public class DanceScaleFilter extends ts2 {
    private int alphaHandle;
    private int flashHandle;
    private float[] matrix = new float[16];
    private float[] matrix1 = new float[16];
    private int matrixHandle = 0;
    private int matrixHandle1 = 0;
    private float scale = 1.0f;
    private float translateX = 0.0f;
    private float translateY = 0.0f;
    private float scale1 = 1.0f;
    private float translateX1 = 0.0f;
    private float translateY1 = 0.0f;
    private float alpha = 0.0f;
    private boolean flash = false;
    private final ValueAnimator animator = ValueAnimator.ofFloat(0.0f, 1.0f, 0.0f);
    private final ValueAnimator alphaAnimator = ValueAnimator.ofFloat(0.0f, 1.0f);
    private final AnimatorSet animatorSet = new AnimatorSet();
    private final ScaleDanceModel[] danceModels = {new ScaleDanceModel(1.0f, 0.9f, 0.0f, 0.05f, 0.0f, 0.05f, 2, 200), new ScaleDanceModel(1.0f, 0.9f, 0.0f, 0.05f, 0.0f, 0.05f, 0, 400), new ScaleDanceModel(1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0, 200)};
    private final AlphaDanceModel[] alphaModels = {new AlphaDanceModel(1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.4f, 0.7f, true, 3, 100), new AlphaDanceModel(1.0f, 0.9f, 0.0f, 0.05f, 0.0f, 0.05f, 1.0f, 1.0f, false, 0, 400), new AlphaDanceModel(1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.8f, true, 0, 200)};

    public void clear() {
        this.animatorSet.removeAllListeners();
        this.animatorSet.cancel();
        this.animator.removeAllListeners();
        this.animator.cancel();
        this.alphaAnimator.removeAllListeners();
        this.alphaAnimator.cancel();
    }

    @Override // p149l.ccj
    public String getFragmentShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nvarying vec2 textureCoordinate1;\nuniform float alpha;\nuniform float flash;\nvoid main(){\n    float offset = 0.02;\n    vec2 uv = textureCoordinate;\n    vec2 uv1 = textureCoordinate1;\n    vec4 color = texture2D(inputImageTexture0, uv);\n    vec4 color1 = texture2D(inputImageTexture0, uv1);\n    color1.r = texture2D(inputImageTexture0, vec2(uv1.x - offset, uv1.y)).r;\n    color1.g = texture2D(inputImageTexture0, vec2(uv1.x, uv1.y)).g;\n    color1.b = texture2D(inputImageTexture0, vec2(uv1.x + offset, uv1.y)).b;\n    vec4 color2 = vec4(1.0, 1.0, 1.0, 1.0);\n    vec4 color3 = mix(color1, color2, flash);\n    gl_FragColor = mix(color, color3, alpha);\n}\n";
    }

    @Override // p149l.ccj
    public String getVertexShader() {
        return "attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\nvarying vec2 textureCoordinate;\nvarying vec2 textureCoordinate1;\nuniform mat4 matrix;\nuniform mat4 matrix1;\nvoid main() {\n  textureCoordinate = (matrix * inputTextureCoordinate).xy;\n  textureCoordinate1 = (matrix1 * inputTextureCoordinate).xy;\n   gl_Position = position;\n}\n";
    }

    @Override // p149l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.matrixHandle = GLES20.glGetUniformLocation(this.programHandle, "matrix");
        this.matrixHandle1 = GLES20.glGetUniformLocation(this.programHandle, "matrix1");
        this.alphaHandle = GLES20.glGetUniformLocation(this.programHandle, "alpha");
        this.flashHandle = GLES20.glGetUniformLocation(this.programHandle, IntlMarketToken.flash);
    }

    public void onMusicBeatDetect(int i) {
        char c;
        if (i == 3) {
            c = 0;
        } else {
            c = i == 4 ? (char) 1 : (char) 2;
        }
        final ScaleDanceModel scaleDanceModel = this.danceModels[c];
        this.animator.removeAllListeners();
        this.animator.setDuration(scaleDanceModel.duration);
        this.animator.setRepeatCount(scaleDanceModel.repeatCount);
        this.animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.momo.mcamera.mask.hotdance.DanceScaleFilter.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                DanceScaleFilter danceScaleFilter = DanceScaleFilter.this;
                ScaleDanceModel scaleDanceModel2 = scaleDanceModel;
                float f = scaleDanceModel2.startScale;
                danceScaleFilter.scale = f + ((scaleDanceModel2.endScale - f) * fFloatValue);
                DanceScaleFilter danceScaleFilter2 = DanceScaleFilter.this;
                ScaleDanceModel scaleDanceModel3 = scaleDanceModel;
                float f2 = scaleDanceModel3.startTranslateX;
                danceScaleFilter2.translateX = f2 + ((scaleDanceModel3.endTranslateX - f2) * fFloatValue);
                DanceScaleFilter danceScaleFilter3 = DanceScaleFilter.this;
                ScaleDanceModel scaleDanceModel4 = scaleDanceModel;
                float f3 = scaleDanceModel4.startTranslateY;
                danceScaleFilter3.translateY = f3 + ((scaleDanceModel4.endTranslateY - f3) * fFloatValue);
            }
        });
        this.animator.addListener(new AnimatorListenerAdapter() { // from class: com.momo.mcamera.mask.hotdance.DanceScaleFilter.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                DanceScaleFilter.this.scale = 1.0f;
                DanceScaleFilter.this.translateX = 0.0f;
                DanceScaleFilter.this.translateY = 0.0f;
            }
        });
        final AlphaDanceModel alphaDanceModel = this.alphaModels[c];
        this.alphaAnimator.removeAllListeners();
        this.alphaAnimator.setDuration(alphaDanceModel.duration);
        this.alphaAnimator.setRepeatCount(alphaDanceModel.repeatCount);
        this.alphaAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.momo.mcamera.mask.hotdance.DanceScaleFilter.3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                DanceScaleFilter danceScaleFilter = DanceScaleFilter.this;
                AlphaDanceModel alphaDanceModel2 = alphaDanceModel;
                float f = alphaDanceModel2.startScale;
                danceScaleFilter.scale1 = f + ((alphaDanceModel2.endScale - f) * fFloatValue);
                DanceScaleFilter danceScaleFilter2 = DanceScaleFilter.this;
                AlphaDanceModel alphaDanceModel3 = alphaDanceModel;
                float f2 = alphaDanceModel3.startTranslateX;
                danceScaleFilter2.translateX1 = f2 + ((alphaDanceModel3.endTranslateX - f2) * fFloatValue);
                DanceScaleFilter danceScaleFilter3 = DanceScaleFilter.this;
                AlphaDanceModel alphaDanceModel4 = alphaDanceModel;
                float f3 = alphaDanceModel4.startTranslateY;
                danceScaleFilter3.translateY1 = f3 + ((alphaDanceModel4.endTranslateY - f3) * fFloatValue);
                DanceScaleFilter danceScaleFilter4 = DanceScaleFilter.this;
                AlphaDanceModel alphaDanceModel5 = alphaDanceModel;
                float f4 = alphaDanceModel5.startAlpha;
                danceScaleFilter4.alpha = f4 + ((alphaDanceModel5.endAlpha - f4) * fFloatValue);
                DanceScaleFilter.this.flash = alphaDanceModel.flash;
            }
        });
        this.alphaAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.momo.mcamera.mask.hotdance.DanceScaleFilter.4
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                DanceScaleFilter.this.alpha = 0.0f;
                DanceScaleFilter.this.flash = false;
            }
        });
        this.animatorSet.play(this.animator).with(this.alphaAnimator);
        this.animatorSet.start();
    }

    @Override // p149l.ccj
    public void passShaderValues() {
        super.passShaderValues();
        Matrix.setIdentityM(this.matrix, 0);
        Matrix.translateM(this.matrix, 0, this.translateX, this.translateY, 0.0f);
        float[] fArr = this.matrix;
        float f = this.scale;
        Matrix.scaleM(fArr, 0, f, f, 1.0f);
        GLES20.glUniformMatrix4fv(this.matrixHandle, 1, false, this.matrix, 0);
        Matrix.setIdentityM(this.matrix1, 0);
        Matrix.translateM(this.matrix1, 0, this.translateX1, this.translateY1, 0.0f);
        float[] fArr2 = this.matrix1;
        float f2 = this.scale1;
        Matrix.scaleM(fArr2, 0, f2, f2, 1.0f);
        GLES20.glUniformMatrix4fv(this.matrixHandle1, 1, false, this.matrix1, 0);
        GLES20.glUniform1f(this.alphaHandle, this.alpha);
        GLES20.glUniform1f(this.flashHandle, this.flash ? 1.0f : 0.0f);
    }
}
