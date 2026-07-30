package com.momo.mcamera.mask;

import android.content.Context;
import android.graphics.PointF;
import android.opengl.ETC1Util;
import android.opengl.GLES20;
import android.opengl.Matrix;
import com.core.glcore.util.FileUtil;
import com.core.glcore.util.TextureHelper;
import com.momo.mcamera.mask.batchbean.BatchFrame;
import com.momo.mcamera.mask.batchbean.BatchSize;
import com.momocv.MMFrame;
import java.io.File;
import java.io.FileInputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p153l.gam;
import p153l.gfj;
import p153l.omw;

/* JADX INFO: loaded from: classes8.dex */
public class StickerEtc1MaskFilter extends FaceDetectFilter implements gam {
    public static final String ATTRIBUTE_DECORATION_SIZE = "decorationSize";
    public static final String ATTRIBUTE_MVP_MATRIX = "uMVPMatrix";
    public static final String ATTRIBUTE_POSITION_2 = "position2";
    public static final String ATTRIBUTE_POSITION_3 = "position3";
    static final int COORDS_PER_VERTEX = 2;
    MMFrame curMMCVImage;
    private int decorateHandler;
    private ShortBuffer drawListBuffer;
    private final short[] drawOrder;
    private Etc1Batch etc1Batch;
    private FloatBuffer fvertexBuffer;
    private boolean isDraw;
    private int mVPMatrixHandler;
    protected final float[] mViewMatrix;
    float[] mvpMatrix;
    protected int positionHandle2;
    protected int positionHandle3;
    protected Sticker sticker;
    float stickerScale;
    float[] texData0;
    int textId;
    private String texturePath;
    private ETC1Util.ETC1Texture texture_Etc1;
    private FloatBuffer vertexBuffer;
    private FloatBuffer vertexBufferAlpha;
    private final String vertexShaderCode = "uniform mat4 uMVPMatrix;attribute vec4 position;\nattribute vec4   position2 ; attribute vec4   position3 ; attribute vec4 inputTextureCoordinate;\nvarying vec2 textureCoordinate;\nvarying vec2 textureCoordinate1;\nuniform vec2 decorationSize;\nvoid main() {  gl_Position = position;  vec2 coord = position2.xy;  vec2 coord1 = position3.xy;  textureCoordinate = vec2(1.0 - (coord.x + 0.5),1.0-(coord.y + 0.5));\n  textureCoordinate1 = vec2(1.0 - (coord1.x + 0.5),1.0 - (coord1.y + 0.5));\n}";
    private final String fragmentShaderCode = "precision mediump float;uniform sampler2D inputImageTexture;varying vec2 textureCoordinate;\nvarying vec2 textureCoordinate1;\nvoid main() {   vec4 color1  = texture2D(inputImageTexture,textureCoordinate);\n   color1.a = texture2D(inputImageTexture,textureCoordinate1).r;\n   gl_FragColor = color1;\n}";
    protected final float[] mProjectionMatrix = new float[16];
    private final int vertexStride = 8;
    protected Object maskListLock = new Object();
    List<float[]> mvpLists = Collections.synchronizedList(new ArrayList());
    private boolean lockTexture = false;
    private long lastFrameTime = -1;
    private int curIndex = 0;

    public StickerEtc1MaskFilter(Context context, Sticker sticker) throws Throwable {
        float[] fArr = new float[16];
        this.mViewMatrix = fArr;
        short[] sArr = {0, 1, 2, 0, 2, 3};
        this.drawOrder = sArr;
        this.sticker = sticker;
        initCoordinate();
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(sArr.length * 2);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        ShortBuffer shortBufferAsShortBuffer = byteBufferAllocateDirect.asShortBuffer();
        this.drawListBuffer = shortBufferAsShortBuffer;
        shortBufferAsShortBuffer.put(sArr);
        this.drawListBuffer.position(0);
        Matrix.setIdentityM(fArr, 0);
        fArr[0] = -1.0f;
        getETC1Texture();
    }

    private ETC1Util.ETC1Texture getETC1Texture() {
        if (this.texturePath == null) {
            String eTC1Path = this.sticker.getETC1Path();
            this.texturePath = eTC1Path;
            this.texture_Etc1 = loadPkmFile(eTC1Path);
        }
        return this.texture_Etc1;
    }

    private ETC1Util.ETC1Texture loadPkmFile(String str) {
        try {
            return ETC1Util.createTexture(new FileInputStream(new File(str)));
        } catch (Exception unused) {
            return null;
        }
    }

    private void updateETC1Coordinate() {
        if (this.lastFrameTime == -1) {
            this.lastFrameTime = System.currentTimeMillis();
            this.curIndex = this.sticker.getETC1ImageIndex();
        }
        if (System.currentTimeMillis() - this.lastFrameTime > 50) {
            this.curIndex = this.sticker.getETC1ImageIndex();
            this.lastFrameTime = System.currentTimeMillis();
        }
        BatchFrame frame = this.etc1Batch.getBatchStickers().get(this.curIndex).getFrame();
        BatchSize size = this.etc1Batch.getBatchMeta().getSize();
        float imageX = frame.getImageX() / size.getImageBatchWidth();
        float imageY = frame.getImageY() / (size.getImageBatchHeight() * 2);
        float imageX2 = frame.getImageX() / size.getImageBatchWidth();
        float imageY2 = (frame.getImageY() + frame.getImageHeight()) / (size.getImageBatchHeight() * 2);
        float imageX3 = (frame.getImageX() + frame.getImageWidth()) / size.getImageBatchWidth();
        float imageY3 = (frame.getImageY() + frame.getImageHeight()) / (size.getImageBatchHeight() * 2);
        float imageX4 = (frame.getImageX() + frame.getImageWidth()) / size.getImageBatchWidth();
        float imageY4 = frame.getImageY() / (size.getImageBatchHeight() * 2);
        this.stickerScale = frame.getImageHeight() / frame.getImageWidth();
        float f = imageX - 0.5f;
        float f2 = imageX2 - 0.5f;
        float f3 = imageX3 - 0.5f;
        float f4 = imageX4 - 0.5f;
        float[] fArr = {f, 0.5f - imageY, f2, 0.5f - imageY2, f3, 0.5f - imageY3, f4, 0.5f - imageY4};
        float[] fArr2 = {f, -imageY, f2, -imageY2, f3, -imageY3, f4, -imageY4};
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        this.vertexBuffer = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(fArr);
        this.vertexBuffer.position(0);
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer2 = byteBufferAllocateDirect2.asFloatBuffer();
        this.vertexBufferAlpha = floatBufferAsFloatBuffer2;
        floatBufferAsFloatBuffer2.put(fArr2);
        this.vertexBufferAlpha.position(0);
    }

    @Override // p153l.wej
    public void bindShaderAttributes() {
        super.bindShaderAttributes();
        GLES20.glBindAttribLocation(this.programHandle, 2, "uMVPMatrix");
        GLES20.glBindAttribLocation(this.programHandle, 3, "decorationSize");
    }

    @Override // com.momo.mcamera.mask.FaceDetectFilter
    public void cancelDraw() {
        this.isDraw = false;
        int i = this.texture_in;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.texture_in = 0;
        }
    }

    @Override // com.momo.mcamera.mask.FaceDetectFilter
    public void clearPoints() {
        synchronized (this.maskListLock) {
            this.mvpLists.clear();
        }
    }

    @Override // p153l.gfj, p153l.wej
    public void destroy() {
        super.destroy();
        int i = this.texture_in;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.texture_in = 0;
        }
    }

    public void draw() {
        GLES20.glUniform2f(this.decorateHandler, 1.0f, this.sticker.getImageHeight() / this.sticker.getImageWidth());
        GLES20.glDrawElements(4, this.drawOrder.length, 5123, this.drawListBuffer);
        GLES20.glDisableVertexAttribArray(this.positionHandle);
    }

    @Override // p153l.gfj
    public void drawSub() {
        GLES20.glViewport(0, 0, getWidth(), getHeight());
        GLES20.glUseProgram(this.programHandle);
        GLES20.glClear(16640);
        GLES20.glClearColor(getBackgroundRed(), getBackgroundGreen(), getBackgroundBlue(), getBackgroundAlpha());
        synchronized (this.maskListLock) {
            try {
                Iterator<float[]> it = this.mvpLists.iterator();
                while (it.hasNext()) {
                    passShaderValues(it.next());
                    draw();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p153l.wej
    public String getFragmentShader() {
        return "precision mediump float;uniform sampler2D inputImageTexture;varying vec2 textureCoordinate;\nvarying vec2 textureCoordinate1;\nvoid main() {   vec4 color1  = texture2D(inputImageTexture,textureCoordinate);\n   color1.a = texture2D(inputImageTexture,textureCoordinate1).r;\n   gl_FragColor = color1;\n}";
    }

    @Override // p153l.wej
    public String getVertexShader() {
        return "uniform mat4 uMVPMatrix;attribute vec4 position;\nattribute vec4   position2 ; attribute vec4   position3 ; attribute vec4 inputTextureCoordinate;\nvarying vec2 textureCoordinate;\nvarying vec2 textureCoordinate1;\nuniform vec2 decorationSize;\nvoid main() {  gl_Position = position;  vec2 coord = position2.xy;  vec2 coord1 = position3.xy;  textureCoordinate = vec2(1.0 - (coord.x + 0.5),1.0-(coord.y + 0.5));\n  textureCoordinate1 = vec2(1.0 - (coord1.x + 0.5),1.0 - (coord1.y + 0.5));\n}";
    }

    public void initCoordinate() throws Throwable {
        String string;
        try {
            string = FileUtil.readString(new File(this.sticker.getETC1JsonPath()));
        } catch (Exception e) {
            e.printStackTrace();
            string = null;
        }
        if (string == null) {
            return;
        }
        this.etc1Batch = Etc1Batch.getEffectModel(string);
        updateETC1Coordinate();
        float f = this.stickerScale;
        this.texData0 = new float[]{-0.5f, f * 0.5f, 0.0f, 1.0f, -0.5f, (-0.5f) * f, 0.0f, 1.0f, 0.5f, (-0.5f) * f, 0.0f, 1.0f, 0.5f, f * 0.5f, 0.0f, 1.0f};
    }

    @Override // p153l.wej
    public void initShaderHandles() {
        super.initShaderHandles();
        this.positionHandle2 = GLES20.glGetAttribLocation(this.programHandle, "position2");
        this.positionHandle3 = GLES20.glGetAttribLocation(this.programHandle, "position3");
        this.mVPMatrixHandler = GLES20.glGetUniformLocation(this.programHandle, "uMVPMatrix");
        this.decorateHandler = GLES20.glGetUniformLocation(this.programHandle, "decorationSize");
    }

    @Override // com.momo.mcamera.mask.FaceDetectFilter
    public void lockTexture() {
        synchronized (getLockObject()) {
            this.lockTexture = true;
        }
    }

    @Override // p153l.jt2, p153l.dfj
    public void newTextureReady(int i, gfj gfjVar, boolean z) {
        List<float[]> list;
        if (z) {
            markAsDirty();
        }
        if (!this.lockTexture || this.texture_in <= 0 || (list = this.mvpLists) == null || list.size() <= 0) {
            List<float[]> list2 = this.mvpLists;
            if (list2 == null || list2.size() <= 0) {
                this.isDraw = false;
            } else {
                if (!this.isDraw) {
                    clearPoints();
                }
                ETC1Util.ETC1Texture eTC1Texture = this.texture_Etc1;
                if (eTC1Texture != null) {
                    if (this.texture_in == 0) {
                        this.texture_in = TextureHelper.etc1ToTexture(eTC1Texture);
                    }
                    updateETC1Coordinate();
                    this.isDraw = true;
                } else {
                    this.isDraw = false;
                }
            }
        } else {
            this.isDraw = true;
        }
        setWidth(gfjVar.getWidth());
        setHeight(gfjVar.getHeight());
        float width = getWidth() / getHeight();
        Matrix.orthoM(this.mProjectionMatrix, 0, -1.0f, 1.0f, (-1.0f) / width, 1.0f / width, 3.0f, 7.0f);
        onDrawFrame();
        gfjVar.unlockRenderBuffer();
    }

    public void passShaderValues(float[] fArr) {
        this.renderVertices.position(0);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        this.fvertexBuffer = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(fArr);
        this.fvertexBuffer.position(0);
        GLES20.glVertexAttribPointer(this.positionHandle, 2, 5126, false, 8, (Buffer) this.fvertexBuffer);
        GLES20.glVertexAttribPointer(this.positionHandle2, 2, 5126, false, 8, (Buffer) this.vertexBuffer);
        GLES20.glVertexAttribPointer(this.positionHandle3, 2, 5126, false, 8, (Buffer) this.vertexBufferAlpha);
        GLES20.glEnableVertexAttribArray(this.positionHandle);
        GLES20.glEnableVertexAttribArray(this.positionHandle2);
        GLES20.glEnableVertexAttribArray(this.positionHandle3);
        this.textureVertices[this.curRotation].position(0);
        GLES20.glVertexAttribPointer(this.texCoordHandle, 2, 5126, false, 8, (Buffer) this.textureVertices[this.curRotation]);
        GLES20.glEnableVertexAttribArray(this.texCoordHandle);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.texture_in);
        GLES20.glUniform1i(this.textureHandle, 0);
    }

    @Override // com.momo.mcamera.mask.FaceDetectFilter
    public void pauseBitmapCache() {
    }

    @Override // com.momo.mcamera.mask.FaceDetectFilter
    public void resetSticker(Sticker sticker) {
        synchronized (getLockObject()) {
            try {
                this.sticker = sticker;
                int i = this.texture_in;
                if (i != 0) {
                    GLES20.glDeleteTextures(1, new int[]{i}, 0);
                    this.texture_in = 0;
                }
                FloatBuffer floatBuffer = this.vertexBuffer;
                if (floatBuffer != null && this.vertexBufferAlpha != null) {
                    floatBuffer.clear();
                    this.vertexBufferAlpha.clear();
                    this.drawListBuffer.clear();
                }
                initCoordinate();
                ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(this.drawOrder.length * 2);
                byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
                ShortBuffer shortBufferAsShortBuffer = byteBufferAllocateDirect.asShortBuffer();
                this.drawListBuffer = shortBufferAsShortBuffer;
                shortBufferAsShortBuffer.put(this.drawOrder);
                this.drawListBuffer.position(0);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.mcamera.mask.FaceDetectFilter
    public void resumeBitmapCache() {
    }

    @Override // com.momo.mcamera.mask.FaceDetectFilter
    public void setDetectParam(FaceDetectFilter.FaceDetectParam faceDetectParam) {
        setParamForMatrix(faceDetectParam.scaleW, faceDetectParam.scaleH, faceDetectParam.centerPoint, faceDetectParam.angle, faceDetectParam.points68, faceDetectParam.points96, faceDetectParam.points104, faceDetectParam.filterTrigerManager);
    }

    public void setParamForMatrix(float f, float f2, PointF pointF, float f3, float[] fArr, float[] fArr2, float[] fArr3, FilterTriggerManager filterTriggerManager) {
        synchronized (this.maskListLock) {
            try {
                if (pointF == null) {
                    return;
                }
                float f4 = -((pointF.x * 2.0f) - 1.0f);
                float f5 = ((-pointF.y) * 2.0f) + 1.0f;
                pointF.x = f4;
                pointF.y = f5;
                float[] fArr4 = new float[16];
                float[] fArr5 = new float[16];
                Matrix.setIdentityM(fArr5, 0);
                Matrix.translateM(fArr5, 0, -f4, f5, 0.0f);
                Matrix.multiplyMM(fArr4, 0, this.mViewMatrix, 0, this.mProjectionMatrix, 0);
                Matrix.multiplyMM(fArr4, 0, fArr5, 0, fArr4, 0);
                Matrix.rotateM(fArr4, 0, f3, 0.0f, 0.0f, 1.0f);
                Matrix.scaleM(fArr4, 0, f * 1.0f, f2 * 1.0f, 1.0f);
                Matrix.multiplyMM(fArr5, 0, fArr4, 0, this.texData0, 0);
                this.mvpLists.add(new float[]{fArr5[0], fArr5[1], fArr5[4], fArr5[5], fArr5[8], fArr5[9], fArr5[12], fArr5[13]});
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setTextId(int i) {
        this.textId = i;
    }

    @Override // p153l.gam
    public void setTimeStamp(long j) {
    }

    @Override // com.momo.mcamera.mask.FaceDetectFilter
    public void unlockTexture() {
        synchronized (getLockObject()) {
            this.lockTexture = false;
        }
    }

    @Override // com.momo.mcamera.mask.FaceDetectFilter, p153l.suf
    public void setMMCVInfo(omw omwVar) {
    }
}
