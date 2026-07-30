package p003l;

import android.opengl.GLES20;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import l.ujw;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class ccj {
    public static final String ATTRIBUTE_POSITION = "position";
    public static final String ATTRIBUTE_TEXCOORD = "inputTextureCoordinate";
    public static final String UNIFORM_TEXTURE0 = "inputImageTexture0";
    protected static final String UNIFORM_TEXTUREBASE = "inputImageTexture";
    public static final String VARYING_TEXCOORD = "textureCoordinate";
    private float alpha;
    private float blue;
    protected int curRotation;
    private boolean customSizeSet;
    private int fragmentShaderHandle;
    private float green;
    protected int height;
    private boolean initialized;
    protected int mDisplayMode;
    protected int positionHandle;
    protected int programHandle;
    private float red;
    protected FloatBuffer renderVertices;
    private boolean sizeChanged;
    protected int texCoordHandle;
    protected int textureHandle;
    public FloatBuffer[] textureVertices;
    protected int texture_in;
    private int vertexShaderHandle;
    protected int width;
    protected boolean useNewViewPort = false;
    private int mInputWidth = 0;
    private int mInputHeight = 0;

    public ccj() {
        this.mDisplayMode = 1;
        this.initialized = false;
        setRenderVertices(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
        FloatBuffer[] floatBufferArr = new FloatBuffer[4];
        this.textureVertices = floatBufferArr;
        floatBufferArr[0] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.textureVertices[0].put(new float[]{0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f}).position(0);
        this.textureVertices[1] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.textureVertices[1].put(new float[]{0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f}).position(0);
        this.textureVertices[2] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.textureVertices[2].put(new float[]{1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f}).position(0);
        this.textureVertices[3] = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.textureVertices[3].put(new float[]{1.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f}).position(0);
        this.curRotation = 0;
        this.texture_in = 0;
        this.customSizeSet = false;
        this.initialized = false;
        this.sizeChanged = false;
        this.mDisplayMode = 1;
    }

    public void bindShaderAttributes() {
        GLES20.glBindAttribLocation(this.programHandle, 0, "position");
        GLES20.glBindAttribLocation(this.programHandle, 1, "inputTextureCoordinate");
    }

    public void destroy() {
        this.initialized = false;
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
    }

    public void disableDrawArray() {
        GLES20.glDisableVertexAttribArray(this.positionHandle);
        GLES20.glDisableVertexAttribArray(this.texCoordHandle);
        GLES20.glBindTexture(3553, 0);
    }

    public void drawFrame() {
        int i;
        int i2;
        if (this.mDisplayMode == 1) {
            GLES20.glViewport(0, 0, this.width, this.height);
            GLES20.glClearColor(getBackgroundRed(), getBackgroundGreen(), getBackgroundBlue(), getBackgroundAlpha());
            GLES20.glClear(16640);
        } else {
            int i3 = this.height;
            int i4 = this.mInputWidth;
            int i5 = this.mInputHeight;
            int i6 = (int) (i3 * ((i4 * 1.0f) / i5));
            int i7 = this.width;
            int i8 = (int) (i7 * ((i5 * 1.0f) / i4));
            if (i6 < i7) {
                i2 = (i7 - i6) / 2;
                i8 = i3;
                i = 0;
            } else if (i8 < i3) {
                i = (i3 - i8) / 2;
                i6 = i7;
                i2 = 0;
            } else {
                i8 = i3;
                i = 0;
                i6 = i7;
                i2 = 0;
            }
            GLES20.glViewport(i2, i, i6 + 1, i8);
            GLES20.glClearColor(getBackgroundRed(), getBackgroundGreen(), getBackgroundBlue(), getBackgroundAlpha());
            GLES20.glClear(16640);
        }
        GLES20.glUseProgram(this.programHandle);
        passShaderValues();
        GLES20.glDrawArrays(5, 0, 4);
        disableDrawArray();
    }

    public float getBackgroundAlpha() {
        return this.alpha;
    }

    public float getBackgroundBlue() {
        return this.blue;
    }

    public float getBackgroundGreen() {
        return this.green;
    }

    public float getBackgroundRed() {
        return this.red;
    }

    public String getFragmentShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nvoid main(){\n   gl_FragColor = texture2D(inputImageTexture0,textureCoordinate);\n}\n";
    }

    public int getHeight() {
        return this.height;
    }

    public String getVertexShader() {
        return "attribute vec4 position;\nattribute vec2 inputTextureCoordinate;\nvarying vec2 textureCoordinate;\nvoid main() {\n  textureCoordinate = inputTextureCoordinate;\n   gl_Position = position;\n}\n";
    }

    public int getWidth() {
        return this.width;
    }

    public void initShaderHandles() {
        this.textureHandle = GLES20.glGetUniformLocation(this.programHandle, "inputImageTexture0");
        this.positionHandle = GLES20.glGetAttribLocation(this.programHandle, "position");
        this.texCoordHandle = GLES20.glGetAttribLocation(this.programHandle, "inputTextureCoordinate");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0039  */
    public void initWithGLContext() {
        String strGlGetShaderInfoLog;
        String vertexShader = getVertexShader();
        String fragmentShader = getFragmentShader();
        int iGlCreateShader = GLES20.glCreateShader(35633);
        this.vertexShaderHandle = iGlCreateShader;
        if (iGlCreateShader != 0) {
            GLES20.glShaderSource(iGlCreateShader, vertexShader);
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
            ujw.a(this, ": Could not create vertex shader. Reason: ", strGlGetShaderInfoLog);
            return;
        }
        int iGlCreateShader2 = GLES20.glCreateShader(35632);
        this.fragmentShaderHandle = iGlCreateShader2;
        if (iGlCreateShader2 != 0) {
            GLES20.glShaderSource(iGlCreateShader2, fragmentShader);
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
            ujw.a(this, ": Could not create fragment shader. Reason: ", strGlGetShaderInfoLog);
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
        if (this.programHandle != 0) {
            initShaderHandles();
        } else {
            upk0.m8197a("Could not create program.");
        }
    }

    public void onDrawFrame() {
        if (!this.initialized) {
            initWithGLContext();
            this.initialized = true;
        }
        if (this.sizeChanged) {
            handleSizeChange();
            this.sizeChanged = false;
        }
        drawFrame();
    }

    public void passShaderValues() {
        this.renderVertices.position(0);
        GLES20.glVertexAttribPointer(this.positionHandle, 2, 5126, false, 8, (Buffer) this.renderVertices);
        GLES20.glEnableVertexAttribArray(this.positionHandle);
        this.textureVertices[this.curRotation].position(0);
        GLES20.glVertexAttribPointer(this.texCoordHandle, 2, 5126, false, 8, (Buffer) this.textureVertices[this.curRotation]);
        GLES20.glEnableVertexAttribArray(this.texCoordHandle);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.texture_in);
        GLES20.glUniform1i(this.textureHandle, 0);
    }

    public void reInitialize() {
        this.initialized = false;
    }

    public void releaseFrameBuffer() {
        this.initialized = false;
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
    }

    public void resetClockDegrees() {
        int i = this.curRotation;
        if (i == 1 || i == 3) {
            int i2 = this.width;
            this.width = this.height;
            this.height = i2;
        }
        this.curRotation = 0;
    }

    public void rotateClockwise90Degrees(int i) {
        this.curRotation = (this.curRotation + i) % 4;
        if (i % 2 == 1) {
            int i2 = this.width;
            this.width = this.height;
            this.height = i2;
        }
    }

    public void rotateCounterClockwise90Degrees(int i) {
        this.curRotation = (this.curRotation + (4 - (i % 4))) % 4;
        if (i % 2 == 1) {
            int i2 = this.width;
            this.width = this.height;
            this.height = i2;
        }
    }

    public void setBackgroundAlpha(float f) {
        this.alpha = f;
    }

    public void setBackgroundBlue(float f) {
        this.blue = f;
    }

    public void setBackgroundColour(float f, float f2, float f3, float f4) {
        setBackgroundRed(f);
        setBackgroundGreen(f2);
        setBackgroundBlue(f3);
        setBackgroundAlpha(f4);
    }

    public void setBackgroundGreen(float f) {
        this.green = f;
    }

    public void setBackgroundRed(float f) {
        this.red = f;
    }

    public void setDisplayMode(int i, int i2, int i3) {
        this.mDisplayMode = i3;
        this.mInputHeight = i2;
        this.mInputWidth = i;
    }

    public void setHeight(int i) {
        if (this.customSizeSet || this.height == i) {
            return;
        }
        this.height = i;
        this.sizeChanged = true;
    }

    public void setRenderSize(int i, int i2) {
        if (this.curRotation % 2 == 1) {
            i2 = i;
            i = i2;
        }
        if (!this.customSizeSet || this.width != i || this.height != i2) {
            this.sizeChanged = true;
        }
        this.width = i;
        this.height = i2;
        this.customSizeSet = true;
    }

    public void setRenderVertices(float[] fArr) {
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(fArr.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.renderVertices = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(fArr).position(0);
    }

    public void setWidth(int i) {
        if (this.customSizeSet || this.width == i) {
            return;
        }
        this.width = i;
        this.sizeChanged = true;
    }

    public void handleSizeChange() {
    }
}
