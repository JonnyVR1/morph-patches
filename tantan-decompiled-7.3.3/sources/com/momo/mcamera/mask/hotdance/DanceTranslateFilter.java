package com.momo.mcamera.mask.hotdance;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.opengl.GLES20;
import com.tantanapp.ijk.media.player.IjkMediaPlayer;
import p153l.jt2;

/* JADX INFO: loaded from: classes8.dex */
public class DanceTranslateFilter extends jt2 {
    private final ValueAnimator animator = ValueAnimator.ofFloat(0.0f, 1.0f);
    private float offset = 1.0f;
    private int offsetHandle;

    public void clear() {
        this.animator.removeAllListeners();
        this.animator.cancel();
    }

    @Override // p153l.wej
    public String getFragmentShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nuniform float offset;\nvoid main(){\n    vec2 uv = textureCoordinate;\n    vec4 color = texture2D(inputImageTexture0, vec2(uv.x, (1.0 - uv.y) - offset));\n    vec4 color1 = texture2D(inputImageTexture0, vec2(uv.x, uv.y - (1.0 - offset)));\n    vec4 color2 = mix(color, color1, step(1.0 - offset, uv.y));\n    vec4 color3 = texture2D(inputImageTexture0, vec2(uv.x, uv.y + (1.0 - offset)));\n    vec4 color4 = texture2D(inputImageTexture0, vec2(uv.x, (1.0 - uv.y) + offset));\n    vec4 color5 = mix(color3, color4, step(offset, uv.y));\n    gl_FragColor = mix(color2, color5, step(0.5, uv.x));\n}\n";
    }

    @Override // p153l.wej
    public void initShaderHandles() {
        super.initShaderHandles();
        this.offsetHandle = GLES20.glGetUniformLocation(this.programHandle, IjkMediaPlayer.OnNativeInvokeListener.ARG_OFFSET);
    }

    public void onMusicBeatDetect() {
        this.animator.removeAllListeners();
        this.animator.setDuration(800L);
        this.animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.momo.mcamera.mask.hotdance.DanceTranslateFilter.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                DanceTranslateFilter.this.offset = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            }
        });
        this.animator.addListener(new AnimatorListenerAdapter() { // from class: com.momo.mcamera.mask.hotdance.DanceTranslateFilter.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                DanceTranslateFilter.this.offset = 1.0f;
            }
        });
        this.animator.start();
    }

    @Override // p153l.wej
    public void passShaderValues() {
        super.passShaderValues();
        GLES20.glUniform1f(this.offsetHandle, this.offset);
    }
}
