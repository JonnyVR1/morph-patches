package p153l;

import android.opengl.GLES20;
import android.util.Log;
import com.cosmos.mdlog.MDLog;
import java.nio.Buffer;
import java.nio.FloatBuffer;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class pt2 {
    public static final String ATTRIBUTE_POSITION = "position";
    public static final String ATTRIBUTE_TEXCOORD = "inputTextureCoordinate";
    public static final String UNIFORM_TEXTURE0 = "inputImageTexture0";
    public static final String UNIFORM_TEXTUREBASE = "inputImageTexture";
    public static final String VARYING_TEXCOORD = "textureCoordinate";
    protected int renderHeight;
    protected int renderWidth;
    protected int texCoordHandle;
    protected int textureHandle;
    protected boolean initialized = false;
    protected int vertexShaderHandle = 0;
    protected int fragmentShaderHandle = 0;
    protected int programHandle = 0;
    protected int positionHandle = 0;
    private int curRotation = 0;
    protected lim geometryAttrInfo = new lim();

    public void bindShaderAttributes() {
        GLES20.glBindAttribLocation(this.programHandle, 0, "position");
        GLES20.glBindAttribLocation(this.programHandle, 1, "inputTextureCoordinate");
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
        GLES20.glDisableVertexAttribArray(this.texCoordHandle);
        GLES20.glBindTexture(3553, 0);
    }

    public void drawFrame(int[] iArr) {
        if (iArr == null) {
            MDLog.m7445e("EsProgram", "Input textures is null, invalid !!");
            return;
        }
        if (!this.initialized) {
            initWithGLContext();
            this.initialized = true;
        }
        subDrawSub(iArr);
    }

    public String getSubFrameShader() {
        return "precision mediump float;\nuniform sampler2D inputImageTexture0;\nvarying vec2 textureCoordinate;\nvoid main(){\n   gl_FragColor = texture2D(inputImageTexture0,textureCoordinate);\n}\n";
    }

    public String getSubVertexShader() {
        return "attribute vec4 position;\nattribute vec2 inputTextureCoordinate;\nvarying vec2 textureCoordinate;\nvoid main() {\n  textureCoordinate = inputTextureCoordinate;\n   gl_Position = position;\n}\n";
    }

    public void initShaderHandles() {
        this.textureHandle = GLES20.glGetUniformLocation(this.programHandle, "inputImageTexture0");
        this.positionHandle = GLES20.glGetAttribLocation(this.programHandle, "position");
        this.texCoordHandle = GLES20.glGetAttribLocation(this.programHandle, "inputTextureCoordinate");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x003e  */
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
                Log.e("BasicProgram", strGlGetShaderInfoLog);
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
                Log.e("BasicProgram", strGlGetShaderInfoLog);
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

    public void passShaderValues(int[] iArr) {
        lim limVar = this.geometryAttrInfo;
        if (limVar != null) {
            FloatBuffer renderVertices = limVar.getRenderVertices();
            renderVertices.position(0);
            GLES20.glVertexAttribPointer(this.positionHandle, 2, 5126, false, 8, (Buffer) renderVertices);
            GLES20.glEnableVertexAttribArray(this.positionHandle);
            FloatBuffer textureVertices = this.geometryAttrInfo.getTextureVertices(this.curRotation);
            textureVertices.position(0);
            GLES20.glVertexAttribPointer(this.texCoordHandle, 2, 5126, false, 8, (Buffer) textureVertices);
            GLES20.glEnableVertexAttribArray(this.texCoordHandle);
        }
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, iArr[0]);
        GLES20.glUniform1i(this.textureHandle, 0);
    }

    public void setCurRotation(int i) {
        this.curRotation = i / 90;
    }

    public void setRenderSize(int i, int i2) {
        this.renderWidth = i;
        this.renderHeight = i2;
    }

    public void subDrawSub(int[] iArr) {
        GLES20.glUseProgram(this.programHandle);
        passShaderValues(iArr);
        GLES20.glDrawArrays(5, 0, 4);
        disableDrawArray();
    }
}
