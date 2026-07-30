package com.core.glcore.util;

import android.opengl.GLES20;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes.dex */
public class GpuBenmarkRenderer extends GLRenderer {
    private static final String TAG = "TestRenderer";
    private static final String fragmentShader = "precision mediump float;         \nuniform vec4 uColor;             \nvoid main(){                     \n   gl_FragColor = uColor;        \n}";
    private static final String verticesShader = "attribute vec2 vPosition;            \nvoid main(){                         \n   gl_Position = vec4(vPosition,0,1);\n}";
    private GpuRenderListener gpuRenderListener;
    private int program;
    private int uColor;
    private int vPosition;
    private float[] verticals = new float[14400];
    private FloatBuffer vertices;

    private FloatBuffer getVertices() {
        int i = 0;
        for (int i2 = 0; i2 < 180; i2 += 9) {
            double d = 3.141592653589793d;
            double d2 = 180.0d;
            double d3 = (((double) i2) * 3.141592653589793d) / 180.0d;
            int i3 = 0;
            while (i3 < 360) {
                double d4 = (((double) i3) * d) / d2;
                double d5 = d3 + 0.15707963267948966d;
                double d6 = 0.15707963267948966d + d4;
                this.verticals[i] = (float) (FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE + (Math.sin(d5) * 1.0d * Math.cos(d6)));
                this.verticals[i + 1] = (float) (FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE + (Math.cos(d5) * 1.0d));
                this.verticals[i + 2] = (float) ((-1.0d) + (Math.sin(d5) * 1.0d * Math.sin(d6)));
                this.verticals[i + 3] = (float) (FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE + (Math.sin(d3) * 1.0d * Math.cos(d4)));
                this.verticals[i + 4] = (float) (FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE + (Math.cos(d3) * 1.0d));
                this.verticals[i + 5] = (float) ((-1.0d) + (Math.sin(d3) * 1.0d * Math.sin(d4)));
                this.verticals[i + 6] = (float) (FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE + (Math.sin(d3) * 1.0d * Math.cos(d6)));
                this.verticals[i + 7] = (float) (FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE + (Math.cos(d3) * 1.0d));
                this.verticals[i + 8] = (float) ((-1.0d) + (Math.sin(d3) * 1.0d * Math.sin(d6)));
                this.verticals[i + 9] = (float) (FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE + (Math.sin(d5) * 1.0d * Math.cos(d6)));
                this.verticals[i + 10] = (float) (FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE + (Math.cos(d5) * 1.0d));
                this.verticals[i + 11] = (float) ((-1.0d) + (Math.sin(d5) * 1.0d * Math.sin(d6)));
                this.verticals[i + 12] = (float) (FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE + (Math.sin(d5) * 1.0d * Math.cos(d4)));
                this.verticals[i + 13] = (float) (FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE + (Math.cos(d5) * 1.0d));
                this.verticals[i + 14] = (float) ((-1.0d) + (Math.sin(d5) * 1.0d * Math.sin(d4)));
                this.verticals[i + 15] = (float) (FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE + (Math.sin(d3) * 1.0d * Math.cos(d4)));
                int i4 = i + 17;
                this.verticals[i + 16] = (float) (FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE + (Math.cos(d3) * 1.0d));
                i += 18;
                this.verticals[i4] = (float) ((-1.0d) + (1.0d * Math.sin(d3) * Math.sin(d4)));
                i3 += 9;
                d = 3.141592653589793d;
                d2 = 180.0d;
            }
        }
        FloatBuffer floatBufferPut = ByteBuffer.allocateDirect(this.verticals.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer().put(this.verticals);
        this.vertices = floatBufferPut;
        floatBufferPut.position(0);
        return this.vertices;
    }

    @Override // com.core.glcore.util.GLRenderer
    public void onCreated() {
        int iCreateProgram = ShaderUtil.createProgram(verticesShader, fragmentShader);
        this.program = iCreateProgram;
        this.vPosition = GLES20.glGetAttribLocation(iCreateProgram, "vPosition");
        this.uColor = GLES20.glGetUniformLocation(this.program, "uColor");
        this.vertices = getVertices();
    }

    @Override // com.core.glcore.util.GLRenderer
    public void onDestroy() {
    }

    @Override // com.core.glcore.util.GLRenderer
    public void onDrawFrame(GLSurface gLSurface) {
        double dCurrentTimeMillis = System.currentTimeMillis();
        GLES20.glClearColor(1.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16640);
        for (int i = 0; i < 1500; i++) {
            GLES20.glUseProgram(this.program);
            GLES20.glVertexAttribPointer(this.vPosition, 3, 5126, false, 12, (Buffer) this.vertices);
            GLES20.glEnableVertexAttribArray(this.vPosition);
            GLES20.glUniform4f(this.uColor, 0.0f, 1.0f, 0.0f, 1.0f);
            GLES20.glDrawArrays(4, 0, 4800);
        }
        this.gpuRenderListener.getRenderTime(System.currentTimeMillis() - dCurrentTimeMillis);
    }

    @Override // com.core.glcore.util.GLRenderer
    public void onUpdate() {
    }

    public void setGpuRenderListener(GpuRenderListener gpuRenderListener) {
        this.gpuRenderListener = gpuRenderListener;
    }
}
