package com.momo.mcamera.mask;

import android.graphics.Bitmap;
import android.graphics.PointF;
import android.opengl.GLES20;
import android.opengl.Matrix;
import com.core.glcore.util.TextureHelper;
import com.momo.mcamera.mask.delegate.ImageDelegateProvider;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p149l.mcj;
import p149l.pjw;

/* JADX INFO: loaded from: classes7.dex */
public class WeexStickerMaskFilter extends FaceDetectFilter {
    public static final String ATTRIBUTE_DECORATION_SIZE = "decorationSize";
    public static final String ATTRIBUTE_POSITION_2 = "position2";
    static final int COORDS_PER_VERTEX = 2;
    private int decorateHandler;
    private ShortBuffer drawListBuffer;
    private FloatBuffer fvertexBuffer;
    private boolean isDraw;
    protected int positionHandle2;
    protected Sticker sticker;
    float stickerScale;
    float[] texData0;
    private FloatBuffer vertexBuffer;
    private final String vertexShaderCode = "attribute vec4 position;\nattribute vec4   position2 ; attribute vec4 inputTextureCoordinate;\nvarying vec2 textureCoordinate;\nuniform vec2 decorationSize;\nvoid main() {  gl_Position = position;   vec2 coord = position2.xy;  coord = (coord) / decorationSize;\n  textureCoordinate = vec2(1.0 - (coord.x + 0.5),1.0-(coord.y + 0.5));\n}";
    private final String fragmentShaderCode = "precision mediump float;uniform sampler2D inputImageTexture;varying vec2 textureCoordinate;\nvoid main() {   vec4 color1  = texture2D(inputImageTexture,textureCoordinate);\n   if (color1.a > 0.0) {color1.rgb = color1.rgb/color1.a;}    gl_FragColor = color1;\n}";
    protected final float[] mProjectionMatrix = new float[16];
    protected final float[] mViewMatrix = new float[16];
    private final short[] drawOrder = {0, 1, 2, 0, 2, 3};
    private final int vertexStride = 8;
    protected Object maskListLock = new Object();
    List<float[]> mvpLists = Collections.synchronizedList(new ArrayList());
    private boolean lockTexture = false;
    private int stickerWidth = 0;
    private int stickerHeight = 0;

    public WeexStickerMaskFilter(Sticker sticker) {
        this.sticker = sticker;
        initCoordinate();
    }

    private void initCoordinate() {
        if (this.stickerWidth == this.sticker.getImageWidth() && this.stickerHeight == this.sticker.getImageHeight()) {
            return;
        }
        this.stickerWidth = this.sticker.getImageWidth();
        this.stickerHeight = this.sticker.getImageHeight();
        float imageHeight = this.sticker.getImageHeight() / this.sticker.getImageWidth();
        this.stickerScale = imageHeight;
        float[] fArr = {-0.5f, imageHeight * 0.5f, -0.5f, (-0.5f) * imageHeight, 0.5f, (-0.5f) * imageHeight, 0.5f, imageHeight * 0.5f};
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        this.vertexBuffer = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(fArr);
        this.vertexBuffer.position(0);
        float f = this.stickerScale;
        this.texData0 = new float[]{-0.5f, f * 0.5f, 0.0f, 1.0f, -0.5f, (-0.5f) * f, 0.0f, 1.0f, 0.5f, (-0.5f) * f, 0.0f, 1.0f, 0.5f, f * 0.5f, 0.0f, 1.0f};
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(this.drawOrder.length * 2);
        byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
        ShortBuffer shortBufferAsShortBuffer = byteBufferAllocateDirect2.asShortBuffer();
        this.drawListBuffer = shortBufferAsShortBuffer;
        shortBufferAsShortBuffer.put(this.drawOrder);
        this.drawListBuffer.position(0);
        Matrix.setIdentityM(this.mViewMatrix, 0);
        this.mViewMatrix[0] = -1.0f;
    }

    @Override // p149l.ccj
    public void bindShaderAttributes() {
        super.bindShaderAttributes();
        GLES20.glBindAttribLocation(this.programHandle, 3, "decorationSize");
    }

    @Override // com.momo.mcamera.mask.FaceDetectFilter
    public void cancelDraw() {
        synchronized (getLockObject()) {
            this.isDraw = false;
        }
    }

    @Override // com.momo.mcamera.mask.FaceDetectFilter
    public void clearPoints() {
        synchronized (this.maskListLock) {
            this.mvpLists.clear();
        }
    }

    public void deleteTexture() {
        int i = this.texture_in;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.texture_in = 0;
        }
    }

    @Override // p149l.mcj, p149l.ccj
    public void destroy() {
        super.destroy();
        deleteTexture();
    }

    public void draw() {
        GLES20.glUniform2f(this.decorateHandler, 1.0f, this.sticker.getImageHeight() / this.sticker.getImageWidth());
        GLES20.glDrawElements(4, this.drawOrder.length, 5123, this.drawListBuffer);
        GLES20.glDisableVertexAttribArray(this.positionHandle);
    }

    @Override // p149l.mcj
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

    @Override // p149l.ccj
    public String getFragmentShader() {
        return "precision mediump float;uniform sampler2D inputImageTexture;varying vec2 textureCoordinate;\nvoid main() {   vec4 color1  = texture2D(inputImageTexture,textureCoordinate);\n   if (color1.a > 0.0) {color1.rgb = color1.rgb/color1.a;}    gl_FragColor = color1;\n}";
    }

    @Override // p149l.ccj
    public String getVertexShader() {
        return "attribute vec4 position;\nattribute vec4   position2 ; attribute vec4 inputTextureCoordinate;\nvarying vec2 textureCoordinate;\nuniform vec2 decorationSize;\nvoid main() {  gl_Position = position;   vec2 coord = position2.xy;  coord = (coord) / decorationSize;\n  textureCoordinate = vec2(1.0 - (coord.x + 0.5),1.0-(coord.y + 0.5));\n}";
    }

    @Override // p149l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.positionHandle2 = GLES20.glGetAttribLocation(this.programHandle, "position2");
        this.decorateHandler = GLES20.glGetUniformLocation(this.programHandle, "decorationSize");
    }

    @Override // p149l.ts2, p149l.jcj
    public void newTextureReady(int i, mcj mcjVar, boolean z) {
        List<float[]> list;
        if (z) {
            markAsDirty();
        }
        if (!this.lockTexture || this.texture_in <= 0 || (list = this.mvpLists) == null || list.size() <= 0) {
            List<float[]> list2 = this.mvpLists;
            if (list2 == null || list2.size() <= 0) {
                this.isDraw = false;
            } else {
                if (this.isDraw) {
                    ImageDelegateProvider imageProvider = this.sticker.getImageProvider();
                    if (imageProvider != null) {
                        Bitmap realBitmap = imageProvider.getRealBitmap();
                        if (realBitmap != null) {
                            if (realBitmap.getWidth() != this.stickerWidth || realBitmap.getHeight() != this.stickerHeight) {
                                initCoordinate();
                            }
                            deleteTexture();
                            this.texture_in = TextureHelper.bitmapToTexture(realBitmap);
                        } else {
                            clearPoints();
                        }
                    }
                } else {
                    clearPoints();
                }
                if (this.texture_in == 0) {
                    clearPoints();
                }
                this.isDraw = true;
            }
        } else {
            this.isDraw = true;
        }
        setWidth(mcjVar.getWidth());
        setHeight(mcjVar.getHeight());
        float width = getWidth() / getHeight();
        Matrix.orthoM(this.mProjectionMatrix, 0, -1.0f, 1.0f, (-1.0f) / width, 1.0f / width, 3.0f, 7.0f);
        onDrawFrame();
        mcjVar.unlockRenderBuffer();
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
        GLES20.glEnableVertexAttribArray(this.positionHandle);
        GLES20.glEnableVertexAttribArray(this.positionHandle2);
        this.textureVertices[this.curRotation].position(0);
        GLES20.glVertexAttribPointer(this.texCoordHandle, 2, 5126, false, 8, (Buffer) this.textureVertices[this.curRotation]);
        GLES20.glEnableVertexAttribArray(this.texCoordHandle);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.texture_in);
        GLES20.glUniform1i(this.textureHandle, 0);
    }

    @Override // com.momo.mcamera.mask.FaceDetectFilter
    public void resetSticker(Sticker sticker) {
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

    @Override // com.momo.mcamera.mask.FaceDetectFilter, p149l.etf
    public void setMMCVInfo(pjw pjwVar) {
    }
}
