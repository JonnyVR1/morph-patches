package com.momo.mcamera.mask.hotdance;

import android.animation.ValueAnimator;
import android.opengl.GLES20;
import com.tantanapp.ijk.media.player.IjkMediaPlayer;
import p153l.jt2;

/* JADX INFO: loaded from: classes8.dex */
public class DanceOffsetFilter extends jt2 {
    private float offset = 0.0f;
    private int offsetHandle = 0;
    private final ValueAnimator animator = ValueAnimator.ofFloat(0.0f, 1.0f, 0.0f);

    public void clear() {
        this.animator.removeAllListeners();
        this.animator.cancel();
    }

    @Override // p153l.wej
    public String getFragmentShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nuniform float offset;\nvoid main(){\n    float offsetX = offset * 0.05;\n    vec2 uv = textureCoordinate;\n    vec4 color = texture2D(inputImageTexture0, vec2(uv.x + offsetX, uv.y));\n    vec4 color1 = texture2D(inputImageTexture0, vec2(uv.x - offsetX, uv.y));\n    gl_FragColor = mix(color, color1, 0.5);\n}\n";
    }

    @Override // p153l.wej
    public void initShaderHandles() {
        super.initShaderHandles();
        this.offsetHandle = GLES20.glGetUniformLocation(this.programHandle, IjkMediaPlayer.OnNativeInvokeListener.ARG_OFFSET);
    }

    public void onMusicBeatDetect() {
        this.animator.removeAllListeners();
        this.animator.setDuration(1000L);
        this.animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.momo.mcamera.mask.hotdance.DanceOffsetFilter.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                DanceOffsetFilter.this.offset = ((Float) valueAnimator.getAnimatedValue()).floatValue();
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
