package com.momo.mcamera.mask.hotdance;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.opengl.GLES20;
import android.opengl.Matrix;
import java.util.HashMap;
import p153l.jt2;

/* JADX INFO: loaded from: classes8.dex */
public class DynamicNineGridFilter extends jt2 {
    private int currentType;
    private float[] matrix = new float[16];
    private int matrixHandle = 0;
    private float scale = 1.0f;
    private float translateX = 0.0f;
    private float translateY = 0.0f;
    private final ValueAnimator animator = ValueAnimator.ofFloat(0.0f, 1.0f);
    private final ValueAnimator offsetAnimator = ValueAnimator.ofFloat(0.0f, 1.0f);
    private final AnimatorSet animatorSet = new AnimatorSet();
    private HashMap<Integer, DanceModel[]> map = new HashMap<>();

    public DynamicNineGridFilter() {
        this.map.put(0, new DanceModel[]{new DanceModel(1.0f, 2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 400L), new DanceModel(2.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0.0f, 400L), new DanceModel(1.0f, 1.0f, 0.0f, 1.0f, 0.0f, 0.0f, 400L), new DanceModel(2.0f, 2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 400L)});
        this.map.put(1, new DanceModel[]{new DanceModel(1.0f, 2.0f, 0.0f, -1.0f, 0.0f, 0.0f, 400L), new DanceModel(2.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 400L), new DanceModel(1.0f, 1.0f, 0.0f, -1.0f, 0.0f, 0.0f, 400L), new DanceModel(2.0f, 2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 400L)});
        this.currentType = 0;
    }

    public void clear() {
        this.animatorSet.removeAllListeners();
        this.animatorSet.cancel();
        this.animator.removeAllListeners();
        this.animator.cancel();
        this.offsetAnimator.removeAllListeners();
        this.offsetAnimator.cancel();
    }

    @Override // p153l.wej
    public String getVertexShader() {
        return "attribute vec4 position;\nattribute vec4 inputTextureCoordinate;\nvarying vec2 textureCoordinate;\nuniform mat4 matrix;\nvoid main() {\n  textureCoordinate = (matrix * inputTextureCoordinate).xy;\n   gl_Position = position;\n}\n";
    }

    @Override // p153l.wej
    public void initShaderHandles() {
        super.initShaderHandles();
        this.matrixHandle = GLES20.glGetUniformLocation(this.programHandle, "matrix");
    }

    public void onMusicBeatDetect(int i) {
        DanceModel[] danceModelArr = this.map.get(Integer.valueOf(this.currentType));
        if (danceModelArr == null) {
            return;
        }
        final DanceModel danceModel = i == 1 ? danceModelArr[0] : danceModelArr[1];
        final DanceModel danceModel2 = i == 1 ? danceModelArr[3] : danceModelArr[2];
        this.animator.removeAllListeners();
        this.animator.setDuration(danceModel.duration);
        this.animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.momo.mcamera.mask.hotdance.DynamicNineGridFilter.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                DynamicNineGridFilter dynamicNineGridFilter = DynamicNineGridFilter.this;
                DanceModel danceModel3 = danceModel;
                float f = danceModel3.startScale;
                dynamicNineGridFilter.scale = f + ((danceModel3.endScale - f) * fFloatValue);
                DynamicNineGridFilter dynamicNineGridFilter2 = DynamicNineGridFilter.this;
                DanceModel danceModel4 = danceModel;
                float f2 = danceModel4.startTranslateX;
                dynamicNineGridFilter2.translateX = f2 + ((danceModel4.endTranslateX - f2) * fFloatValue);
                DynamicNineGridFilter dynamicNineGridFilter3 = DynamicNineGridFilter.this;
                DanceModel danceModel5 = danceModel;
                float f3 = danceModel5.startTranslateY;
                dynamicNineGridFilter3.translateY = f3 + ((danceModel5.endTranslateY - f3) * fFloatValue);
            }
        });
        this.offsetAnimator.removeAllListeners();
        this.offsetAnimator.setDuration(danceModel2.duration);
        this.offsetAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.momo.mcamera.mask.hotdance.DynamicNineGridFilter.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                DynamicNineGridFilter dynamicNineGridFilter = DynamicNineGridFilter.this;
                DanceModel danceModel3 = danceModel2;
                float f = danceModel3.startScale;
                dynamicNineGridFilter.scale = f + ((danceModel3.endScale - f) * fFloatValue);
                DynamicNineGridFilter dynamicNineGridFilter2 = DynamicNineGridFilter.this;
                DanceModel danceModel4 = danceModel2;
                float f2 = danceModel4.startTranslateX;
                dynamicNineGridFilter2.translateX = f2 + ((danceModel4.endTranslateX - f2) * fFloatValue);
                DynamicNineGridFilter dynamicNineGridFilter3 = DynamicNineGridFilter.this;
                DanceModel danceModel5 = danceModel2;
                float f3 = danceModel5.startTranslateY;
                dynamicNineGridFilter3.translateY = f3 + ((danceModel5.endTranslateY - f3) * fFloatValue);
            }
        });
        this.offsetAnimator.addListener(new AnimatorListenerAdapter() { // from class: com.momo.mcamera.mask.hotdance.DynamicNineGridFilter.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                DynamicNineGridFilter dynamicNineGridFilter = DynamicNineGridFilter.this;
                dynamicNineGridFilter.currentType = 1 - dynamicNineGridFilter.currentType;
            }
        });
        this.animatorSet.play(this.offsetAnimator).after(this.animator);
        this.animatorSet.start();
    }

    @Override // p153l.wej
    public void passShaderValues() {
        super.passShaderValues();
        Matrix.setIdentityM(this.matrix, 0);
        Matrix.translateM(this.matrix, 0, this.translateX, this.translateY, 0.0f);
        float[] fArr = this.matrix;
        float f = this.scale;
        Matrix.scaleM(fArr, 0, f, f, 1.0f);
        GLES20.glUniformMatrix4fv(this.matrixHandle, 1, false, this.matrix, 0);
    }
}
