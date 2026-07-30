package com.momo.mcamera.mask.hotdance;

import android.animation.ValueAnimator;
import android.opengl.GLES20;
import p153l.jt2;

/* JADX INFO: loaded from: classes8.dex */
public class DanceSoulFilter extends jt2 {
    private float percent;
    private final ValueAnimator animator = ValueAnimator.ofFloat(0.0f, 1.0f);
    private int percentHandle = 0;

    public void clear() {
        this.animator.removeAllListeners();
        this.animator.cancel();
    }

    @Override // p153l.wej
    public String getFragmentShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nuniform float percent;\nvoid main(){\n    vec2 uv = textureCoordinate;\n    float maxAlpha = 0.3;\n    float maxScale = 1.8;\n    float alpha = maxAlpha * (1.0 - percent);\n    float scale = 1.0 + (maxScale - 1.0) * percent;\n    float weakX = 0.5 + (uv.x - 0.5) / scale;\n    float weakY = 0.5 + (uv.y - 0.5) / scale;\n    vec4 weakMask = texture2D(inputImageTexture0, vec2(weakX, weakY));\n    vec4 color = texture2D(inputImageTexture0, uv);\n    gl_FragColor = mix(color, weakMask, alpha);\n}\n";
    }

    @Override // p153l.wej
    public void initShaderHandles() {
        super.initShaderHandles();
        this.percentHandle = GLES20.glGetUniformLocation(this.programHandle, "percent");
    }

    public void onMusicBeatDetect() {
        this.animator.removeAllListeners();
        this.animator.setDuration(500L);
        this.animator.setRepeatCount(2);
        this.animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.momo.mcamera.mask.hotdance.DanceSoulFilter.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                DanceSoulFilter.this.percent = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            }
        });
        this.animator.start();
    }

    @Override // p153l.wej
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glUniform1f(this.percentHandle, this.percent);
    }
}
