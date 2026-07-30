package com.momo.mcamera.mask;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import p153l.azk0;
import p153l.rej;

/* JADX INFO: loaded from: classes8.dex */
public abstract class GLProgram {
    public static final String ATTRIBUTE_POSITION = "position";
    public static final String ATTRIBUTE_TEXCOORD = "inputTextureCoordinate";
    public static final String UNIFORM_TEXTUREBASE = "inputImageTexture";
    public static final String VARYING_TEXCOORD = "textureCoordinate";
    private FloatBuffer[] mBufferTex;
    private ByteBuffer[] mByteBufferTex;
    protected int mNumCoord;
    protected int mNumTexture;
    protected int[] texCoordHandles;
    protected int[] textureHandles;
    protected boolean initialized = false;
    protected int vertexShaderHandle = 0;
    protected int fragmentShaderHandle = 0;
    protected int programHandle = 0;
    protected int positionHandle = 0;
    protected int width = 0;
    protected int height = 0;
    private int type = 4;
    private ByteBuffer mByteBufferVex = null;
    private FloatBuffer mBufferVex = null;

    public GLProgram(int i, int i2) {
        this.textureHandles = null;
        this.texCoordHandles = null;
        this.mByteBufferTex = null;
        this.mBufferTex = null;
        this.mNumTexture = i;
        this.mNumCoord = i2;
        this.textureHandles = new int[i];
        this.texCoordHandles = new int[i2];
        this.mByteBufferTex = new ByteBuffer[i2];
        this.mBufferTex = new FloatBuffer[i2];
    }

    private String attributeCoord() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.texCoordHandles.length; i++) {
            sb.append("attribute vec2 inputTextureCoordinate" + i + ";\n");
            sb.append("varying vec2 textureCoordinate" + i + ";\n");
        }
        return sb.toString();
    }

    private String setVaryCoord() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.texCoordHandles.length; i++) {
            sb.append(" textureCoordinate" + i + " =  inputTextureCoordinate" + i + ";\n");
        }
        return sb.toString();
    }

    public void bindShaderAttributes() {
        int i = 0;
        GLES20.glBindAttribLocation(this.programHandle, 0, "position");
        while (i < this.texCoordHandles.length) {
            int i2 = i + 1;
            GLES20.glBindAttribLocation(this.programHandle, i2, "inputTextureCoordinate" + i);
            i = i2;
        }
    }

    public void destroy() {
        int i = this.programHandle;
        if (i != 0) {
            GLES20.glDeleteProgram(i);
            this.programHandle = 0;
        }
        int i2 = this.vertexShaderHandle;
        if (i2 != 0) {
            GLES20.glDeleteShader(i2);
            this.vertexShaderHandle = 0;
        }
        int i3 = this.fragmentShaderHandle;
        if (i3 != 0) {
            GLES20.glDeleteShader(i3);
            this.fragmentShaderHandle = 0;
        }
        this.initialized = false;
    }

    public void disableDrawArray() {
        GLES20.glDisableVertexAttribArray(this.positionHandle);
        int i = 0;
        while (true) {
            int[] iArr = this.texCoordHandles;
            if (i >= iArr.length) {
                GLES20.glBindTexture(3553, 0);
                return;
            } else {
                GLES20.glDisableVertexAttribArray(iArr[i]);
                i++;
            }
        }
    }

    public void drawFrame(float[][] fArr, int[] iArr) {
        if (!this.initialized) {
            initWithGLContext();
            this.initialized = true;
        }
        subDrawSub(fArr, iArr);
    }

    public abstract String getSubFrameShader();

    public String getSubVertexShader() {
        return "attribute vec4 position;\n" + attributeCoord() + "void main() {\n" + setVaryCoord() + "   gl_Position = position;\n}\n";
    }

    public void initCoord(float[][] fArr) {
        int i = 0;
        float[] fArr2 = fArr[0];
        ByteBuffer byteBuffer = this.mByteBufferVex;
        if (byteBuffer == null || byteBuffer.capacity() != fArr2.length * 4) {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(fArr2.length * 4);
            this.mByteBufferVex = byteBufferAllocateDirect;
            byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        }
        if (this.mBufferVex == null) {
            this.mBufferVex = this.mByteBufferVex.asFloatBuffer();
        }
        this.mBufferVex.clear();
        this.mBufferVex.put(fArr2);
        this.mBufferVex.flip();
        GLES20.glVertexAttribPointer(this.positionHandle, 2, 5126, false, 0, (Buffer) this.mBufferVex);
        GLES20.glEnableVertexAttribArray(this.positionHandle);
        while (true) {
            ByteBuffer[] byteBufferArr = this.mByteBufferTex;
            if (i >= byteBufferArr.length) {
                return;
            }
            int i2 = i + 1;
            float[] fArr3 = fArr[i2];
            if (byteBufferArr[i] == null) {
                byteBufferArr[i] = ByteBuffer.allocateDirect(fArr3.length * 4);
                this.mByteBufferTex[i].order(ByteOrder.nativeOrder());
            }
            FloatBuffer[] floatBufferArr = this.mBufferTex;
            if (floatBufferArr[i] == null) {
                floatBufferArr[i] = this.mByteBufferTex[i].asFloatBuffer();
            }
            this.mBufferTex[i].clear();
            this.mBufferTex[i].put(fArr3);
            this.mBufferTex[i].flip();
            GLES20.glVertexAttribPointer(this.texCoordHandles[i], 2, 5126, false, 0, (Buffer) this.mBufferTex[i]);
            GLES20.glEnableVertexAttribArray(this.texCoordHandles[i]);
            i = i2;
        }
    }

    public void initShaderHandles() {
        this.positionHandle = GLES20.glGetAttribLocation(this.programHandle, "position");
        int i = 0;
        while (true) {
            int[] iArr = this.textureHandles;
            if (i >= iArr.length) {
                break;
            }
            iArr[i] = GLES20.glGetUniformLocation(this.programHandle, "inputImageTexture" + i);
            i++;
        }
        for (int i2 = 0; i2 < this.textureHandles.length; i2++) {
            this.texCoordHandles[i2] = GLES20.glGetAttribLocation(this.programHandle, "inputTextureCoordinate" + i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0039  */
    public void initWithGLContext() {
        String strGlGetShaderInfoLog;
        String subVertexShader = getSubVertexShader();
        String subFrameShader = getSubFrameShader();
        int iGlCreateShader = GLES20.glCreateShader(35633);
        this.vertexShaderHandle = iGlCreateShader;
        if (iGlCreateShader != 0) {
            GLES20.glShaderSource(iGlCreateShader, subVertexShader);
            GLES20.glCompileShader(this.vertexShaderHandle);
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(this.vertexShaderHandle, 35713, iArr, 0);
            if (iArr[0] == 0) {
                strGlGetShaderInfoLog = GLES20.glGetShaderInfoLog(this.vertexShaderHandle);
                GLES20.glDeleteShader(this.vertexShaderHandle);
                this.vertexShaderHandle = 0;
            } else {
                strGlGetShaderInfoLog = "none";
            }
        } else {
            strGlGetShaderInfoLog = "none";
        }
        if (this.vertexShaderHandle == 0) {
            rej.m181032a(this, ": Could not create vertex shader. Reason: ", strGlGetShaderInfoLog);
            return;
        }
        int iGlCreateShader2 = GLES20.glCreateShader(35632);
        this.fragmentShaderHandle = iGlCreateShader2;
        if (iGlCreateShader2 != 0) {
            GLES20.glShaderSource(iGlCreateShader2, subFrameShader);
            GLES20.glCompileShader(this.fragmentShaderHandle);
            int[] iArr2 = new int[1];
            GLES20.glGetShaderiv(this.fragmentShaderHandle, 35713, iArr2, 0);
            if (iArr2[0] == 0) {
                strGlGetShaderInfoLog = GLES20.glGetShaderInfoLog(this.fragmentShaderHandle);
                GLES20.glDeleteShader(this.fragmentShaderHandle);
                this.fragmentShaderHandle = 0;
            }
        }
        if (this.fragmentShaderHandle == 0) {
            rej.m181032a(this, ": Could not create fragment shader. Reason: ", strGlGetShaderInfoLog);
            return;
        }
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.programHandle = iGlCreateProgram;
        if (iGlCreateProgram != 0) {
            GLES20.glAttachShader(iGlCreateProgram, this.vertexShaderHandle);
            GLES20.glAttachShader(this.programHandle, this.fragmentShaderHandle);
            bindShaderAttributes();
            GLES20.glLinkProgram(this.programHandle);
            int[] iArr3 = new int[1];
            GLES20.glGetProgramiv(this.programHandle, 35714, iArr3, 0);
            if (iArr3[0] == 0) {
                GLES20.glDeleteProgram(this.programHandle);
                this.programHandle = 0;
            }
        }
        if (this.programHandle == 0) {
            azk0.m101074a("Could not create program.");
            return;
        }
        GLES20.glDeleteShader(this.vertexShaderHandle);
        GLES20.glDeleteShader(this.fragmentShaderHandle);
        this.vertexShaderHandle = 0;
        this.fragmentShaderHandle = 0;
        initShaderHandles();
    }

    public void passShaderValues(float[][] fArr, int[] iArr) {
        if (fArr != null && fArr.length > 0) {
            initCoord(fArr);
        }
        int i = 0;
        int i2 = 0;
        while (i < iArr.length) {
            switch (i) {
                case 0:
                    i2 = 33985;
                    break;
                case 1:
                    i2 = 33986;
                    break;
                case 2:
                    i2 = 33987;
                    break;
                case 3:
                    i2 = 33988;
                    break;
                case 4:
                    i2 = 33989;
                    break;
                case 5:
                    i2 = 33990;
                    break;
                case 6:
                    i2 = 33991;
                    break;
                case 7:
                    i2 = 33992;
                    break;
                case 8:
                    i2 = 33993;
                    break;
            }
            GLES20.glActiveTexture(i2);
            GLES20.glBindTexture(3553, iArr[i]);
            int i3 = this.textureHandles[i];
            i++;
            GLES20.glUniform1i(i3, i);
        }
    }

    public void setDrawType(int i) {
        this.type = i;
    }

    public void setRenderSize(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    public void subDrawSub(float[][] fArr, int[] iArr) {
        GLES20.glUseProgram(this.programHandle);
        int length = (fArr == null || fArr.length <= 0) ? 0 : fArr[0].length / 6;
        passShaderValues(fArr, iArr);
        GLES20.glDrawArrays(this.type, 0, length * 3);
        disableDrawArray();
    }
}
