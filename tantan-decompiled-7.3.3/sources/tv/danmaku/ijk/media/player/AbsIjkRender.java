package tv.danmaku.ijk.media.player;

import android.opengl.GLES20;
import android.util.Log;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import p153l.t9c;

/* JADX INFO: loaded from: classes3.dex */
public abstract class AbsIjkRender implements IjkFilter {
    private static final String TAG = "AbsIjkRender";
    protected int height;
    protected int positionHandle;
    protected int programHandle;
    protected FloatBuffer renderVertices;
    protected int texCoordHandle;
    protected int textureHandle;
    protected int textureIn;
    protected FloatBuffer textureVertices;
    protected int width;

    public AbsIjkRender() {
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.renderVertices = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f}).position(0);
        FloatBuffer floatBufferPut = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer().put(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f});
        this.textureVertices = floatBufferPut;
        floatBufferPut.position(0);
    }

    private int createProgram(String str, String str2) {
        int iLoadShader;
        int iLoadShader2 = loadShader(35633, str);
        if (iLoadShader2 == 0 || (iLoadShader = loadShader(35632, str2)) == 0) {
            return 0;
        }
        int iGlCreateProgram = GLES20.glCreateProgram();
        checkGlError("glCreateProgram");
        if (iGlCreateProgram == 0) {
            t9c.m189743a(TAG, "Could not create program");
        }
        GLES20.glAttachShader(iGlCreateProgram, iLoadShader2);
        checkGlError("glAttachShader");
        GLES20.glAttachShader(iGlCreateProgram, iLoadShader);
        checkGlError("glAttachShader");
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        if (iArr[0] == 1) {
            return iGlCreateProgram;
        }
        t9c.m189743a(TAG, "Could not link program: ");
        t9c.m189743a(TAG, GLES20.glGetProgramInfoLog(iGlCreateProgram));
        GLES20.glDeleteProgram(iGlCreateProgram);
        return 0;
    }

    private int loadShader(int i, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        checkGlError("glCreateShader type=" + i);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        t9c.m189743a(TAG, "Could not compile shader " + i + ":");
        StringBuilder sb = new StringBuilder(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
        sb.append(GLES20.glGetShaderInfoLog(iGlCreateShader));
        t9c.m189743a(TAG, sb.toString());
        GLES20.glDeleteShader(iGlCreateShader);
        return 0;
    }

    public void bindShaderAttributes() {
        GLES20.glBindAttribLocation(this.programHandle, 0, "position");
        GLES20.glBindAttribLocation(this.programHandle, 1, "inputTextureCoordinate");
    }

    public void checkGlError(String str) {
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                return;
            }
            t9c.m189743a(TAG, str + ": glError " + iGlGetError);
        }
    }

    public void disableDrawArray() {
        GLES20.glDisableVertexAttribArray(this.positionHandle);
        GLES20.glDisableVertexAttribArray(this.texCoordHandle);
        GLES20.glBindTexture(3553, 0);
    }

    public String getFragmentShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture;\nvarying vec2 textureCoordinate;\nvoid main() {\n    gl_FragColor = texture2D(inputImageTexture, uv);\n}";
    }

    public int getHeight() {
        return this.height;
    }

    public String getVertexShader() {
        return "attribute vec4 position;\nattribute vec2 inputTextureCoordinate;\nvarying vec2 textureCoordinate;\nvoid main() {\n    textureCoordinate = inputTextureCoordinate;\n    gl_Position = position;\n}\n";
    }

    public int getWidth() {
        return this.width;
    }

    public void initShaderHandles() {
        this.positionHandle = GLES20.glGetAttribLocation(this.programHandle, "position");
        this.texCoordHandle = GLES20.glGetAttribLocation(this.programHandle, "inputTextureCoordinate");
        this.textureHandle = GLES20.glGetUniformLocation(this.programHandle, "inputImageTexture");
    }

    @Override // tv.danmaku.ijk.media.player.IjkFilter
    public void onCreated() {
        this.programHandle = createProgram(getVertexShader(), getFragmentShader());
        bindShaderAttributes();
        initShaderHandles();
    }

    @Override // tv.danmaku.ijk.media.player.IjkFilter
    public void onDrawFrame(int i) {
        if (this.programHandle == 0) {
            onCreated();
        }
        this.textureIn = i;
        GLES20.glViewport(0, 0, this.width, this.height);
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClear(16640);
        GLES20.glUseProgram(this.programHandle);
        passShaderValues();
        GLES20.glDrawArrays(5, 0, 4);
        disableDrawArray();
    }

    @Override // tv.danmaku.ijk.media.player.IjkFilter
    public void onSizeChanged(int i, int i2) {
        this.width = i;
        this.height = i2;
        Log.e("lqdebug", "size changed size changed " + i + ", " + i2);
    }

    public void passShaderValues() {
        GLES20.glEnableVertexAttribArray(this.positionHandle);
        GLES20.glVertexAttribPointer(this.positionHandle, 2, 5126, false, 8, (Buffer) this.renderVertices);
        GLES20.glEnableVertexAttribArray(this.texCoordHandle);
        GLES20.glVertexAttribPointer(this.texCoordHandle, 2, 5126, false, 8, (Buffer) this.textureVertices);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.textureIn);
        GLES20.glUniform1i(this.textureHandle, 0);
    }
}
