package com.tencent.liteav.renderer;

import android.opengl.GLES20;
import android.opengl.Matrix;
import com.tantanapp.ijk.media.player.IjkMediaPlayer;
import com.tencent.liteav.basic.log.TXCLog;
import com.tencent.liteav.basic.structs.TXSVideoFrame;
import com.tencent.liteav.basic.util.C14215f;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import p153l.o4c;

/* JADX INFO: loaded from: classes2.dex */
public class TXCYuvTextureRender {
    private static final int BYTES_PER_FLOAT = 4;
    private static final int INVALID_TEXTURE_ID = -12345;
    private static final int POSITION_COMPONENT_COUNT = 2;
    private static final String TAG = "TXCYuvTextureRender";
    private static final int TEXTURE_COORDINATES_COMPONENT_COUNT = 2;
    private static final String mFragmentShaderCode = "precision highp float;\nvarying vec2 textureCoordinate;\nuniform sampler2D yTexture;\nuniform sampler2D uTexture;\nuniform mat3 convertMatrix;\nuniform vec3 offset;\n\nvoid main()\n{\n    highp vec3 yuvColor;\n    highp vec3 rgbColor;\n\n    // Get the YUV values\n    yuvColor.x = texture2D(yTexture, textureCoordinate).r;\n    yuvColor.y = texture2D(uTexture, vec2(textureCoordinate.x * 0.5, textureCoordinate.y * 0.5)).r;\n    yuvColor.z = texture2D(uTexture, vec2(textureCoordinate.x * 0.5, textureCoordinate.y * 0.5 + 0.5)).r;\n\n    // Do the color transform   \n    yuvColor += offset;\n    rgbColor = convertMatrix * yuvColor; \n\n    gl_FragColor = vec4(rgbColor, 1.0);\n}\n";
    private static final String mVertexShaderCode = "uniform mat4 uMatrix;uniform mat4 uTextureMatrix;attribute vec2 position;attribute vec2 inputTextureCoordinate;varying vec2 textureCoordinate;void main() {vec4 pos  = vec4(position, 0.0, 1.0);gl_Position = uMatrix * pos;textureCoordinate = (uTextureMatrix*vec4(inputTextureCoordinate, 0.0, 0.0)).xy;}";
    private int mHeight;
    private ShortBuffer mIndicesBuffer;
    private int mPositionHandle;
    private int mProgram;
    private FloatBuffer mTextureBuffer;
    private int mTextureCoordinatesHandle;
    private int[] mTextureIds;
    private int mTextureMatrixHandle;
    private int mTextureUnitHandle0;
    private int mTextureUnitHandle1;
    private FloatBuffer mVertexBuffer;
    private int mVertexMatrixHandle;
    private int mWidth;
    private float[] mMVPMatrix = new float[16];
    private float[] mTextureMatrix = new float[16];
    private int mConvertMatrixUniform = -1;
    private int mConvertOffsetUniform = -1;
    private boolean mNeedReLoadFrameBuffer = false;
    private int mFrameBufferTextureID = INVALID_TEXTURE_ID;
    private int mFrameBufferID = INVALID_TEXTURE_ID;
    private int mVideoWidth = 0;
    private int mVideoHeight = 0;
    private final int def_InputType_YUVJ420 = 4;
    private int mRawDataFrameType = -1;
    private float[] mbt601_fullRange_matrix3 = {1.0f, 1.0f, 1.0f, 0.0f, -0.343f, 1.765f, 1.4f, -0.711f, 0.0f};
    private float[] mbt601_videoRange_matrix3 = {1.164f, 1.164f, 1.164f, 0.0f, -0.392f, 2.017f, 1.596f, -0.813f, 0.0f};
    private float[] mbt601_offset_matrix = {0.0f, -0.5f, -0.5f};
    private float[] mbt709_videoRange_matrix3 = {1.164f, 1.164f, 1.164f, 0.0f, -0.213f, 2.112f, 1.793f, -0.533f, 0.0f};
    float[] bt601_videorange_ffmpeg_offset = {-0.0627451f, -0.5019608f, -0.5019608f};
    float[] bt601_videorage_ffmpeg_matrix = {1.1644f, 1.1644f, 1.1644f, 0.0f, -0.3918f, 2.0172f, 1.596f, -0.813f, 0.0f};
    float[] bt601_fullrange_ffmpeg_offset = {0.0f, -0.5019608f, -0.5019608f};
    float[] bt601_fullrage_ffmpeg_matrix = {1.0f, 1.0f, 1.0f, 0.0f, -0.3441f, 1.772f, 1.402f, -0.7141f, 0.0f};
    private short[] mIndices = {0, 1, 2, 1, 3, 2};
    private float[] mVerticesCoordinates = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};

    static {
        C14215f.m84239f();
    }

    public TXCYuvTextureRender() {
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.mTextureBuffer = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(new float[]{0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f});
        this.mTextureBuffer.position(0);
        FloatBuffer floatBufferAsFloatBuffer2 = ByteBuffer.allocateDirect(this.mVerticesCoordinates.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.mVertexBuffer = floatBufferAsFloatBuffer2;
        floatBufferAsFloatBuffer2.put(this.mVerticesCoordinates);
        this.mVertexBuffer.position(0);
        ShortBuffer shortBufferAsShortBuffer = ByteBuffer.allocateDirect(this.mIndices.length * 2).order(ByteOrder.nativeOrder()).asShortBuffer();
        this.mIndicesBuffer = shortBufferAsShortBuffer;
        shortBufferAsShortBuffer.put(this.mIndices);
        this.mIndicesBuffer.position(0);
    }

    private void destroyFrameBuffer() {
        int i = this.mFrameBufferID;
        if (i != INVALID_TEXTURE_ID) {
            GLES20.glDeleteFramebuffers(1, new int[]{i}, 0);
            this.mFrameBufferID = INVALID_TEXTURE_ID;
        }
        int i2 = this.mFrameBufferTextureID;
        if (i2 != INVALID_TEXTURE_ID) {
            GLES20.glDeleteTextures(1, new int[]{i2}, 0);
            this.mFrameBufferTextureID = INVALID_TEXTURE_ID;
        }
    }

    public static native void nativeLoadTexture(ByteBuffer byteBuffer, int i, int i2, int[] iArr);

    private void reloadFrameBuffer() {
        if (this.mNeedReLoadFrameBuffer) {
            String str = TAG;
            TXCLog.m84152i(str, "reloadFrameBuffer. size = " + this.mWidth + "*" + this.mHeight);
            destroyFrameBuffer();
            int[] iArr = new int[1];
            int[] iArr2 = new int[1];
            GLES20.glGenTextures(1, iArr, 0);
            GLES20.glGenFramebuffers(1, iArr2, 0);
            this.mFrameBufferTextureID = iArr[0];
            this.mFrameBufferID = iArr2[0];
            TXCLog.m84147d(str, "frameBuffer id = " + this.mFrameBufferID + ", texture id = " + this.mFrameBufferTextureID);
            GLES20.glBindTexture(3553, this.mFrameBufferTextureID);
            GLES20.glTexImage2D(3553, 0, 6408, this.mWidth, this.mHeight, 0, 6408, 5121, null);
            GLES20.glTexParameterf(3553, 10241, 9729.0f);
            GLES20.glTexParameterf(3553, 10240, 9729.0f);
            GLES20.glTexParameteri(3553, 10242, 33071);
            GLES20.glTexParameteri(3553, 10243, 33071);
            GLES20.glBindFramebuffer(36160, this.mFrameBufferID);
            GLES20.glFramebufferTexture2D(36160, 36064, 3553, this.mFrameBufferTextureID, 0);
            GLES20.glBindTexture(3553, 0);
            GLES20.glBindFramebuffer(36160, 0);
            this.mNeedReLoadFrameBuffer = false;
        }
    }

    public int checkError() {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return iGlGetError;
        }
        o4c.m165980a("gl error=", iGlGetError);
        return 0;
    }

    public void createTexture() {
        int iGlCreateShader = GLES20.glCreateShader(35633);
        checkError();
        GLES20.glShaderSource(iGlCreateShader, mVertexShaderCode);
        checkError();
        GLES20.glCompileShader(iGlCreateShader);
        checkError();
        int iGlCreateShader2 = GLES20.glCreateShader(35632);
        checkError();
        GLES20.glShaderSource(iGlCreateShader2, mFragmentShaderCode);
        checkError();
        GLES20.glCompileShader(iGlCreateShader2);
        this.mProgram = GLES20.glCreateProgram();
        checkError();
        GLES20.glAttachShader(this.mProgram, iGlCreateShader);
        checkError();
        GLES20.glAttachShader(this.mProgram, iGlCreateShader2);
        checkError();
        GLES20.glLinkProgram(this.mProgram);
        checkError();
        GLES20.glDeleteShader(iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader2);
        this.mVertexMatrixHandle = GLES20.glGetUniformLocation(this.mProgram, "uMatrix");
        checkError();
        this.mTextureMatrixHandle = GLES20.glGetUniformLocation(this.mProgram, "uTextureMatrix");
        checkError();
        this.mPositionHandle = GLES20.glGetAttribLocation(this.mProgram, "position");
        checkError();
        this.mTextureCoordinatesHandle = GLES20.glGetAttribLocation(this.mProgram, "inputTextureCoordinate");
        checkError();
        this.mTextureUnitHandle0 = GLES20.glGetUniformLocation(this.mProgram, "yTexture");
        checkError();
        this.mTextureUnitHandle1 = GLES20.glGetUniformLocation(this.mProgram, "uTexture");
        checkError();
        int iGlGetUniformLocation = GLES20.glGetUniformLocation(this.mProgram, IjkMediaPlayer.OnNativeInvokeListener.ARG_OFFSET);
        this.mConvertOffsetUniform = iGlGetUniformLocation;
        GLES20.glUniform3fv(iGlGetUniformLocation, 1, FloatBuffer.wrap(this.bt601_fullrange_ffmpeg_offset));
        int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(this.mProgram, "convertMatrix");
        this.mConvertMatrixUniform = iGlGetUniformLocation2;
        GLES20.glUniformMatrix3fv(iGlGetUniformLocation2, 1, false, this.bt601_fullrage_ffmpeg_matrix, 0);
        int[] iArr = new int[2];
        this.mTextureIds = iArr;
        GLES20.glGenTextures(2, iArr, 0);
    }

    public void drawFrame(TXSVideoFrame tXSVideoFrame) {
        int[] iArr;
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16640);
        Matrix.setIdentityM(this.mMVPMatrix, 0);
        Matrix.setIdentityM(this.mTextureMatrix, 0);
        GLES20.glUseProgram(this.mProgram);
        checkError();
        GLES20.glEnableVertexAttribArray(this.mPositionHandle);
        checkError();
        this.mVertexBuffer.position(0);
        GLES20.glVertexAttribPointer(this.mPositionHandle, 2, 5126, false, 8, (Buffer) this.mVertexBuffer);
        checkError();
        GLES20.glEnableVertexAttribArray(this.mTextureCoordinatesHandle);
        checkError();
        this.mTextureBuffer.position(0);
        GLES20.glVertexAttribPointer(this.mTextureCoordinatesHandle, 2, 5126, false, 8, (Buffer) this.mTextureBuffer);
        checkError();
        GLES20.glUniformMatrix4fv(this.mVertexMatrixHandle, 1, false, this.mMVPMatrix, 0);
        checkError();
        GLES20.glUniformMatrix4fv(this.mTextureMatrixHandle, 1, false, this.mTextureMatrix, 0);
        checkError();
        int i = tXSVideoFrame.frameType;
        int i2 = this.mConvertOffsetUniform;
        if (4 == i) {
            GLES20.glUniform3fv(i2, 1, FloatBuffer.wrap(this.bt601_fullrange_ffmpeg_offset));
            GLES20.glUniformMatrix3fv(this.mConvertMatrixUniform, 1, false, this.bt601_fullrage_ffmpeg_matrix, 0);
            if (i != this.mRawDataFrameType) {
                this.mRawDataFrameType = i;
                TXCLog.m84152i(TAG, " frame type " + i + " matrix_test fullRange");
            }
        } else {
            GLES20.glUniform3fv(i2, 1, FloatBuffer.wrap(this.bt601_videorange_ffmpeg_offset));
            GLES20.glUniformMatrix3fv(this.mConvertMatrixUniform, 1, false, this.bt601_videorage_ffmpeg_matrix, 0);
            if (i != this.mRawDataFrameType) {
                this.mRawDataFrameType = i;
                TXCLog.m84152i(TAG, " frame type " + i + " matrix_test videoRange");
            }
        }
        GLES20.glUniform1i(this.mTextureUnitHandle0, 0);
        checkError();
        GLES20.glUniform1i(this.mTextureUnitHandle1, 1);
        checkError();
        ByteBuffer byteBuffer = tXSVideoFrame.buffer;
        if (byteBuffer != null && (iArr = this.mTextureIds) != null) {
            nativeLoadTexture(byteBuffer, tXSVideoFrame.width, tXSVideoFrame.height, iArr);
        }
        tXSVideoFrame.release();
        GLES20.glDrawElements(4, this.mIndices.length, 5123, this.mIndicesBuffer);
        GLES20.glDisableVertexAttribArray(this.mPositionHandle);
        GLES20.glDisableVertexAttribArray(this.mTextureCoordinatesHandle);
    }

    public int drawToTexture(TXSVideoFrame tXSVideoFrame) {
        reloadFrameBuffer();
        int i = this.mFrameBufferID;
        if (i == INVALID_TEXTURE_ID) {
            TXCLog.m84156w(TAG, "invalid frame buffer id");
            return INVALID_TEXTURE_ID;
        }
        GLES20.glBindFramebuffer(36160, i);
        GLES20.glViewport(0, 0, this.mWidth, this.mHeight);
        drawFrame(tXSVideoFrame);
        GLES20.glBindFramebuffer(36160, 0);
        return this.mFrameBufferTextureID;
    }

    public void flipVertical(boolean z) {
        float[] fArr = z ? new float[]{0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f} : new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.mTextureBuffer = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(fArr);
        this.mTextureBuffer.position(0);
    }

    public void onSurfaceDestroy() {
        int[] iArr = this.mTextureIds;
        if (iArr != null) {
            GLES20.glDeleteTextures(2, iArr, 0);
            this.mTextureIds = null;
        }
        destroyFrameBuffer();
        GLES20.glDeleteProgram(this.mProgram);
    }

    public void setHasFrameBuffer(int i, int i2) {
        if (this.mWidth == i && this.mHeight == i2) {
            return;
        }
        this.mWidth = i;
        this.mHeight = i2;
        this.mNeedReLoadFrameBuffer = true;
    }

    public void setVideoSize(int i, int i2) {
        this.mVideoWidth = i;
        this.mVideoHeight = i2;
    }
}
