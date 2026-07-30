package com.momo.mcamera.util;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: classes8.dex */
public class BlendFilter {
    public static final String ATTRIBUTE_POSITION = "aVertexCo";
    public static final String ATTRIBUTE_TEXCOORD = "aTextureCo";
    private static final String SHADER_FRAGMENT = "precision mediump float;\nuniform sampler2D inputImageTexture10;\nuniform sampler2D inputImageTexture1;\nvarying vec2 vTextureCo;\nvoid main(){\n   vec4 color1 = texture2D(inputImageTexture10,vTextureCo);\n   vec4 color2 = texture2D(inputImageTexture1,vTextureCo);\n   vec4 outputColor;\n   float a = color1.a + color2.a * (1.0 - color1.a);\n   outputColor.rgb = color1.rgb*(1.0 - color2.a) + color2.rgb*color2.a;\n   outputColor.a = 1.0;\n   gl_FragColor = outputColor;\n}\n";
    private static final String SHADER_VETEX = "attribute vec4 aVertexCo;\nattribute vec2 aTextureCo;\n \nvarying vec2 vTextureCo;\n\nvoid main(){\n    gl_Position = aVertexCo;\n    vTextureCo = aTextureCo;\n}";
    public static final String UNIFORM_TEXTURE0 = "inputImageTexture10";
    protected static final String UNIFORM_TEXTURE1 = "inputImageTexture1";
    public static final String VARYING_TEXCOORD = "vTextureCo";
    private int mGLProgram;
    private int mGLTextureCo;
    private int mGLVertexCo;
    private FloatBuffer mTextureBuffer;
    private FloatBuffer mVertexBuffer;
    private int text1Handle;
    private int textHandle;

    public BlendFilter() {
        initBuffer();
        createProgram();
        initHandles();
    }

    private void bindShaderAttributes(int i) {
        GLES20.glBindAttribLocation(i, 0, ATTRIBUTE_POSITION);
        GLES20.glBindAttribLocation(i, 1, ATTRIBUTE_TEXCOORD);
    }

    private int createGLProgram(String str, String str2) {
        int iLoadShader;
        int iLoadShader2 = GpuUtils.loadShader(35633, str);
        if (iLoadShader2 == 0 || (iLoadShader = GpuUtils.loadShader(35632, str2)) == 0) {
            return 0;
        }
        int iGlCreateProgram = GLES20.glCreateProgram();
        if (iGlCreateProgram != 0) {
            GLES20.glAttachShader(iGlCreateProgram, iLoadShader2);
            GLES20.glAttachShader(iGlCreateProgram, iLoadShader);
            bindShaderAttributes(iGlCreateProgram);
            GLES20.glLinkProgram(iGlCreateProgram);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
            if (iArr[0] != 1) {
                GLES20.glDeleteProgram(iGlCreateProgram);
                return 0;
            }
        }
        return iGlCreateProgram;
    }

    private void initHandles() {
        this.mGLVertexCo = GLES20.glGetAttribLocation(this.mGLProgram, ATTRIBUTE_POSITION);
        this.mGLTextureCo = GLES20.glGetAttribLocation(this.mGLProgram, ATTRIBUTE_TEXCOORD);
        this.textHandle = GLES20.glGetUniformLocation(this.mGLProgram, UNIFORM_TEXTURE0);
        this.text1Handle = GLES20.glGetUniformLocation(this.mGLProgram, "inputImageTexture1");
    }

    public void blend(int i, int i2) {
        GLES20.glUseProgram(this.mGLProgram);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, i);
        GLES20.glUniform1i(this.textHandle, 0);
        GLES20.glActiveTexture(33985);
        GLES20.glBindTexture(3553, i2);
        GLES20.glUniform1i(this.text1Handle, 1);
        GLES20.glEnableVertexAttribArray(this.mGLVertexCo);
        GLES20.glVertexAttribPointer(this.mGLVertexCo, 2, 5126, false, 0, (Buffer) this.mVertexBuffer);
        GLES20.glEnableVertexAttribArray(this.mGLTextureCo);
        GLES20.glVertexAttribPointer(this.mGLTextureCo, 2, 5126, false, 0, (Buffer) this.mTextureBuffer);
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(this.mGLVertexCo);
        GLES20.glDisableVertexAttribArray(this.mGLTextureCo);
    }

    public void createProgram() {
        this.mGLProgram = createGLProgram(SHADER_VETEX, SHADER_FRAGMENT);
    }

    public void initBuffer() {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        this.mVertexBuffer = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(MatrixUtils.getOriginalVertexCo());
        this.mVertexBuffer.position(0);
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer2 = byteBufferAllocateDirect2.asFloatBuffer();
        this.mTextureBuffer = floatBufferAsFloatBuffer2;
        floatBufferAsFloatBuffer2.put(MatrixUtils.getOriginalTextureCo());
        this.mTextureBuffer.position(0);
    }
}
