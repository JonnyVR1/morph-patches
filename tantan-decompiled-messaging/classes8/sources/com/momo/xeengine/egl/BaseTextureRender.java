package com.momo.xeengine.egl;

import android.opengl.GLES20;
import android.opengl.GLES30;
import android.util.Log;
import androidx.annotation.Keep;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
@Keep
public class BaseTextureRender {
    private static float[] mVertexMatrix;
    private final String mFragment;
    private FloatBuffer mTextureBuffer;
    private final String mVertex;
    private FloatBuffer mVertexBuffer;
    private static final float[] DefaultVertexMatrix = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    private static float[] mTextureMatrix = null;
    private static final float[] DefaultTextureMatrix = {1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    private static final float[] TextureCo = {0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 1.0f, 1.0f};
    private static final float[] VertexCo = {-1.0f, -1.0f, -1.0f, 1.0f, 1.0f, -1.0f, 1.0f, 1.0f};
    private final int[] mVBOs = new int[2];
    private final int[] mVAO = new int[1];
    private int mGLProgram = 0;
    private int mGLVertexCo = -1;
    private int mGLTextureCo = -1;
    private int mGLVertexMatrix = -1;
    private int mGLTextureMatrix = -1;
    private int mGLTexture = -1;

    public BaseTextureRender(String str, String str2) {
        this.mVertex = str;
        this.mFragment = str2;
        initBuffer();
    }

    private static void checkError(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError != 0) {
            Log.e("HongjieFu", str + " glError: 0x" + Integer.toHexString(iGlGetError));
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x004c  */
    private int createGLProgram(String str, String str2) {
        int iLoadShader;
        int iLoadShader2 = loadShader(35633, str);
        int i = 0;
        if (iLoadShader2 == 0 || (iLoadShader = loadShader(35632, str2)) == 0) {
            return 0;
        }
        int iGlCreateProgram = GLES20.glCreateProgram();
        if (iGlCreateProgram != 0) {
            GLES20.glAttachShader(iGlCreateProgram, iLoadShader2);
            GLES20.glAttachShader(iGlCreateProgram, iLoadShader);
            GLES20.glLinkProgram(iGlCreateProgram);
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
            if (iArr[0] != 1) {
                Log.e("BaseTextureRender", "Program linking failed: " + GLES20.glGetProgramInfoLog(iGlCreateProgram));
                GLES20.glDeleteProgram(iGlCreateProgram);
            } else {
                i = iGlCreateProgram;
            }
        } else {
            i = iGlCreateProgram;
        }
        if (iLoadShader2 > 0) {
            GLES20.glDeleteShader(iLoadShader2);
        }
        if (iLoadShader > 0) {
            GLES20.glDeleteShader(iLoadShader);
        }
        return i;
    }

    private void createVBOAndVAO() {
        if (this.mGLVertexCo < 0 || this.mGLTextureCo < 0) {
            Log.e("BaseTextureRender", "Invalid attribute locations - Vertex: " + this.mGLVertexCo + ", Texture: " + this.mGLTextureCo);
            return;
        }
        int[] iArr = new int[1];
        int[] iArr2 = new int[1];
        GLES20.glGetIntegerv(34964, iArr, 0);
        GLES20.glGetIntegerv(34229, iArr2, 0);
        GLES20.glGenBuffers(2, this.mVBOs, 0);
        GLES20.glBindBuffer(34962, this.mVBOs[0]);
        GLES20.glBufferData(34962, VertexCo.length * 4, this.mVertexBuffer, 35044);
        GLES20.glBindBuffer(34962, this.mVBOs[1]);
        GLES20.glBufferData(34962, TextureCo.length * 4, this.mTextureBuffer, 35044);
        GLES30.glGenVertexArrays(1, this.mVAO, 0);
        GLES30.glBindVertexArray(this.mVAO[0]);
        GLES20.glBindBuffer(34962, this.mVBOs[0]);
        GLES20.glVertexAttribPointer(this.mGLVertexCo, 2, 5126, false, 0, 0);
        GLES20.glEnableVertexAttribArray(this.mGLVertexCo);
        GLES20.glBindBuffer(34962, this.mVBOs[1]);
        GLES20.glVertexAttribPointer(this.mGLTextureCo, 2, 5126, false, 0, 0);
        GLES20.glEnableVertexAttribArray(this.mGLTextureCo);
        GLES30.glBindVertexArray(iArr2[0]);
        GLES20.glBindBuffer(34962, iArr[0]);
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError != 0) {
            Log.e("BaseTextureRender", "VBO/VAO creation failed with error: 0x" + Integer.toHexString(iGlGetError));
        } else {
            int[] iArr3 = this.mVBOs;
            int i = iArr3[0];
            int i2 = iArr3[1];
            int i3 = this.mVAO[0];
        }
    }

    private void initBuffer() {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        this.mVertexBuffer = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(VertexCo);
        this.mVertexBuffer.position(0);
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer2 = byteBufferAllocateDirect2.asFloatBuffer();
        this.mTextureBuffer = floatBufferAsFloatBuffer2;
        floatBufferAsFloatBuffer2.put(TextureCo);
        this.mTextureBuffer.position(0);
    }

    private int loadShader(int i, String str) {
        if (str == null) {
            Log.e("BaseTextureRender", "Shader source is null");
            return 0;
        }
        int iGlCreateShader = GLES20.glCreateShader(i);
        if (iGlCreateShader != 0) {
            GLES20.glShaderSource(iGlCreateShader, str);
            GLES20.glCompileShader(iGlCreateShader);
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
            if (iArr[0] == 0) {
                Log.e("BaseTextureRender", "Shader compilation failed: " + GLES20.glGetShaderInfoLog(iGlCreateShader));
                GLES20.glDeleteShader(iGlCreateShader);
                return 0;
            }
        }
        return iGlCreateShader;
    }

    private void onBindTexture(int i) {
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, i);
        GLES20.glUniform1i(this.mGLTexture, 0);
    }

    private void onClear() {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16640);
    }

    private void onCreate() {
        int iCreateGLProgram = createGLProgram(this.mVertex, this.mFragment);
        this.mGLProgram = iCreateGLProgram;
        if (iCreateGLProgram == 0) {
            Log.e("BaseTextureRender", "Failed to create GL program");
            return;
        }
        this.mGLVertexCo = GLES20.glGetAttribLocation(iCreateGLProgram, "aVertexCo");
        this.mGLTextureCo = GLES20.glGetAttribLocation(this.mGLProgram, "aTextureCo");
        this.mGLVertexMatrix = GLES20.glGetUniformLocation(this.mGLProgram, "uVertexMatrix");
        this.mGLTextureMatrix = GLES20.glGetUniformLocation(this.mGLProgram, "uTextureMatrix");
        this.mGLTexture = GLES20.glGetUniformLocation(this.mGLProgram, "uTexture");
        createVBOAndVAO();
    }

    private void onDraw() {
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(34229, iArr, 0);
        GLES30.glBindVertexArray(this.mVAO[0]);
        GLES20.glDrawArrays(5, 0, 4);
        GLES30.glBindVertexArray(iArr[0]);
    }

    private void onSetExpandData() {
        int i = this.mGLVertexMatrix;
        float[] fArr = mVertexMatrix;
        if (fArr == null) {
            fArr = DefaultVertexMatrix;
        }
        GLES20.glUniformMatrix4fv(i, 1, false, fArr, 0);
        int i2 = this.mGLTextureMatrix;
        float[] fArr2 = mTextureMatrix;
        if (fArr2 == null) {
            fArr2 = DefaultTextureMatrix;
        }
        GLES20.glUniformMatrix4fv(i2, 1, false, fArr2, 0);
    }

    private void onUseProgram() {
        GLES20.glUseProgram(this.mGLProgram);
    }

    public void create() {
        if (this.mVertex == null || this.mFragment == null) {
            return;
        }
        onCreate();
    }

    public void draw(int i) {
        onClear();
        onUseProgram();
        onSetExpandData();
        onBindTexture(i);
        onDraw();
    }

    public boolean isInitialized() {
        if (this.mGLProgram > 0) {
            int[] iArr = this.mVBOs;
            if (iArr[0] > 0 && iArr[1] > 0 && this.mVAO[0] > 0) {
                return true;
            }
        }
        return false;
    }

    public void release() {
        int[] iArr = this.mVAO;
        if (iArr[0] > 0) {
            GLES30.glDeleteVertexArrays(1, iArr, 0);
            this.mVAO[0] = 0;
        }
        int[] iArr2 = this.mVBOs;
        if (iArr2[0] > 0 && iArr2[1] > 0) {
            GLES20.glDeleteBuffers(2, iArr2, 0);
            int[] iArr3 = this.mVBOs;
            iArr3[0] = 0;
            iArr3[1] = 0;
        }
        int i = this.mGLProgram;
        if (i > 0) {
            GLES20.glDeleteProgram(i);
            this.mGLProgram = 0;
        }
    }

    public void draw(int i, float[] fArr) {
        mTextureMatrix = fArr;
        draw(i);
    }
}
