package com.momo.mcamera.mask;

import android.content.Context;
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
import p149l.q7m;
import p149l.vjw;

/* JADX INFO: loaded from: classes7.dex */
public class StickerMaskFilter extends FaceDetectFilter implements q7m {
    public static final String ATTRIBUTE_DECORATION_SIZE = "decorationSize";
    public static final String ATTRIBUTE_MVP_MATRIX = "uMVPMatrix";
    public static final String ATTRIBUTE_POSITION_2 = "position2";
    static final int COORDS_PER_VERTEX = 2;
    private Context context;
    private int decorateHandler;
    private ShortBuffer drawListBuffer;
    private final short[] drawOrder;
    private FloatBuffer fvertexBuffer;
    private String imagePath;
    private boolean isDraw;
    private boolean isPlaying;
    private int mVPMatrixHandler;
    protected final float[] mViewMatrix;
    private MmcvImageCacheLoader mmcvImageLoader;
    float[] mvpMatrix;
    protected int positionHandle2;
    protected Sticker sticker;
    float stickerScale;
    float[] texData0;
    int textId;
    private FloatBuffer vertexBuffer;
    private final String vertexShaderCode = "uniform mat4 uMVPMatrix;attribute vec4 position;\nattribute vec4   position2 ; attribute vec4 inputTextureCoordinate;\nvarying vec2 textureCoordinate;\nuniform vec2 decorationSize;\nvoid main() {  gl_Position = position;   vec2 coord = position2.xy;  coord = (coord) / decorationSize;\n  textureCoordinate = vec2(1.0 - (coord.x + 0.5),1.0-(coord.y + 0.5));\n}";
    private final String fragmentShaderCode = "precision mediump float;uniform sampler2D inputImageTexture;varying vec2 textureCoordinate;\nvoid main() {   vec4 color1  = texture2D(inputImageTexture,textureCoordinate);\n   gl_FragColor = color1;\n}";
    protected final float[] mProjectionMatrix = new float[16];
    private final int vertexStride = 8;
    protected Object maskListLock = new Object();
    float[] color = {0.2f, 0.70980394f, 0.8980392f, 1.0f};
    float[] color2 = {0.0f, 0.20980392f, 0.19803922f, 1.0f};
    List<float[]> mvpLists = Collections.synchronizedList(new ArrayList());
    private boolean lockTexture = false;

    public StickerMaskFilter(Context context, Sticker sticker, ImageDelegateProvider imageDelegateProvider) {
        float[] fArr = new float[16];
        this.mViewMatrix = fArr;
        short[] sArr = {0, 1, 2, 0, 2, 3};
        this.drawOrder = sArr;
        this.sticker = sticker;
        this.context = context;
        float imageHeight = sticker.getImageHeight() / this.sticker.getImageWidth();
        this.stickerScale = imageHeight;
        this.mmcvImageLoader = new MmcvImageCacheLoader(sticker, context);
        this.isPlaying = true;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        this.vertexBuffer = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(new float[]{-0.5f, imageHeight * 0.5f, -0.5f, (-0.5f) * imageHeight, 0.5f, (-0.5f) * imageHeight, 0.5f, imageHeight * 0.5f});
        this.vertexBuffer.position(0);
        float f = this.stickerScale;
        this.texData0 = new float[]{-0.5f, f * 0.5f, 0.0f, 1.0f, -0.5f, (-0.5f) * f, 0.0f, 1.0f, 0.5f, (-0.5f) * f, 0.0f, 1.0f, 0.5f, f * 0.5f, 0.0f, 1.0f};
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(sArr.length * 2);
        byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
        ShortBuffer shortBufferAsShortBuffer = byteBufferAllocateDirect2.asShortBuffer();
        this.drawListBuffer = shortBufferAsShortBuffer;
        shortBufferAsShortBuffer.put(sArr);
        this.drawListBuffer.position(0);
        Matrix.setIdentityM(fArr, 0);
        fArr[0] = -1.0f;
        this.useCache = false;
    }

    @Override // p149l.ccj
    public void bindShaderAttributes() {
        super.bindShaderAttributes();
        GLES20.glBindAttribLocation(this.programHandle, 2, "uMVPMatrix");
        GLES20.glBindAttribLocation(this.programHandle, 3, "decorationSize");
    }

    @Override // com.momo.mcamera.mask.FaceDetectFilter
    public void cancelDraw() {
        synchronized (getLockObject()) {
            this.isDraw = false;
            this.isPlaying = false;
            this.mmcvImageLoader.cancel();
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
        return "precision mediump float;uniform sampler2D inputImageTexture;varying vec2 textureCoordinate;\nvoid main() {   vec4 color1  = texture2D(inputImageTexture,textureCoordinate);\n   gl_FragColor = color1;\n}";
    }

    public String getImagePathName() {
        return this.imagePath;
    }

    @Override // p149l.ccj
    public String getVertexShader() {
        return "uniform mat4 uMVPMatrix;attribute vec4 position;\nattribute vec4   position2 ; attribute vec4 inputTextureCoordinate;\nvarying vec2 textureCoordinate;\nuniform vec2 decorationSize;\nvoid main() {  gl_Position = position;   vec2 coord = position2.xy;  coord = (coord) / decorationSize;\n  textureCoordinate = vec2(1.0 - (coord.x + 0.5),1.0-(coord.y + 0.5));\n}";
    }

    @Override // p149l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.positionHandle2 = GLES20.glGetAttribLocation(this.programHandle, "position2");
        this.mVPMatrixHandler = GLES20.glGetUniformLocation(this.programHandle, "uMVPMatrix");
        this.decorateHandler = GLES20.glGetUniformLocation(this.programHandle, "decorationSize");
    }

    @Override // com.momo.mcamera.mask.FaceDetectFilter
    public void lockTexture() {
        synchronized (getLockObject()) {
            this.lockTexture = true;
        }
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
                if (!this.isDraw) {
                    clearPoints();
                } else if (this.isPlaying) {
                    vjw mmcvImage = this.mmcvImageLoader.getMmcvImage(this.context);
                    this.imagePath = this.mmcvImageLoader.imagePath;
                    if (mmcvImage == null || mmcvImage.m198688a() == null) {
                        Bitmap delegateBitmap = this.mmcvImageLoader.getDelegateBitmap();
                        if (delegateBitmap != null) {
                            deleteTexture();
                            this.texture_in = TextureHelper.bitmapToTexture(delegateBitmap);
                        } else {
                            clearPoints();
                        }
                    } else {
                        int i2 = this.texture_in;
                        if (i2 == 0) {
                            this.texture_in = TextureHelper.bitmapToTexture(mmcvImage);
                        } else {
                            this.texture_in = TextureHelper.loadDataToTexture(i2, mmcvImage);
                        }
                    }
                } else {
                    deleteTexture();
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
    public void pauseBitmapCache() {
        synchronized (getLockObject()) {
            this.isPlaying = false;
        }
    }

    @Override // com.momo.mcamera.mask.FaceDetectFilter
    public void resetSticker(Sticker sticker) {
        synchronized (getLockObject()) {
            try {
                this.sticker = sticker;
                cancelDraw();
                float imageHeight = this.sticker.getImageHeight() / this.sticker.getImageWidth();
                this.stickerScale = imageHeight;
                float[] fArr = {-0.5f, imageHeight * 0.5f, -0.5f, (-0.5f) * imageHeight, 0.5f, (-0.5f) * imageHeight, 0.5f, imageHeight * 0.5f};
                this.texData0 = new float[]{-0.5f, imageHeight * 0.5f, 0.0f, 1.0f, -0.5f, (-0.5f) * imageHeight, 0.0f, 1.0f, 0.5f, (-0.5f) * imageHeight, 0.0f, 1.0f, 0.5f, imageHeight * 0.5f, 0.0f, 1.0f};
                FloatBuffer floatBuffer = this.vertexBuffer;
                if (floatBuffer != null) {
                    floatBuffer.clear();
                    this.drawListBuffer.clear();
                }
                ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(32);
                byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
                FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
                this.vertexBuffer = floatBufferAsFloatBuffer;
                floatBufferAsFloatBuffer.put(fArr);
                this.vertexBuffer.position(0);
                ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect(this.drawOrder.length * 2);
                byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
                ShortBuffer shortBufferAsShortBuffer = byteBufferAllocateDirect2.asShortBuffer();
                this.drawListBuffer = shortBufferAsShortBuffer;
                shortBufferAsShortBuffer.put(this.drawOrder);
                this.drawListBuffer.position(0);
                this.mmcvImageLoader = new MmcvImageCacheLoader(sticker, this.context);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.mcamera.mask.FaceDetectFilter
    public void resumeBitmapCache() {
        synchronized (getLockObject()) {
            this.isPlaying = true;
        }
    }

    @Override // com.momo.mcamera.mask.FaceDetectFilter
    public void setDetectParam(FaceDetectFilter.FaceDetectParam faceDetectParam) {
        setParamForMatrix(faceDetectParam.scaleW, faceDetectParam.scaleH, faceDetectParam.centerPoint, faceDetectParam.angle, faceDetectParam.points68, faceDetectParam.points96, faceDetectParam.points104, faceDetectParam.filterTrigerManager);
    }

    public void setParamForMatrix(float f, float f2, PointF pointF, float f3, float[] fArr, float[] fArr2, float[] fArr3, FilterTriggerManager filterTriggerManager) {
        float imageHeight;
        int height;
        float f4 = f2;
        synchronized (this.maskListLock) {
            try {
                if (pointF == null) {
                    return;
                }
                float f5 = -((pointF.x * 2.0f) - 1.0f);
                float f6 = ((-pointF.y) * 2.0f) + 1.0f;
                pointF.x = f5;
                pointF.y = f6;
                float[] fArr4 = new float[16];
                float[] fArr5 = new float[16];
                Matrix.setIdentityM(fArr5, 0);
                float f7 = 0.0f;
                Matrix.translateM(fArr5, 0, -f5, f6, 0.0f);
                Matrix.multiplyMM(fArr4, 0, this.mViewMatrix, 0, this.mProjectionMatrix, 0);
                Matrix.multiplyMM(fArr4, 0, fArr5, 0, fArr4, 0);
                Matrix.rotateM(fArr4, 0, f3, 0.0f, 0.0f, 1.0f);
                Matrix.scaleM(fArr4, 0, f * 1.0f, f4 * 1.0f, 1.0f);
                Matrix.multiplyMM(fArr5, 0, fArr4, 0, this.texData0, 0);
                if (this.sticker.isComic()) {
                    if (f3 == 0.0f) {
                        if (getHeight() > 960 || getHeight() / getWidth() == 1.0f) {
                            imageHeight = this.sticker.getImageHeight();
                            height = getHeight();
                        } else {
                            f4 *= 0.75f;
                            imageHeight = this.sticker.getImageHeight();
                            height = getHeight();
                        }
                    } else if (getHeight() > 960 || getHeight() / getWidth() == 1.0f) {
                        f4 = -f4;
                        imageHeight = this.sticker.getImageHeight();
                        height = getHeight();
                    } else {
                        f4 *= -0.75f;
                        imageHeight = this.sticker.getImageHeight();
                        height = getHeight();
                    }
                    f7 = (f4 * (imageHeight / height)) / 2.0f;
                }
                this.mvpLists.add(new float[]{fArr5[0], fArr5[1] - f7, fArr5[4], fArr5[5] - f7, fArr5[8], fArr5[9] - f7, fArr5[12], fArr5[13] - f7});
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setTextId(int i) {
        this.textId = i;
    }

    @Override // p149l.q7m
    public void setTimeStamp(long j) {
        MmcvImageCacheLoader mmcvImageCacheLoader = this.mmcvImageLoader;
        if (mmcvImageCacheLoader != null) {
            mmcvImageCacheLoader.setRenderTime(j);
        }
    }

    @Override // com.momo.mcamera.mask.FaceDetectFilter
    public void unlockTexture() {
        synchronized (getLockObject()) {
            this.lockTexture = false;
        }
    }

    @Override // com.momo.mcamera.mask.FaceDetectFilter, p149l.etf
    public void setMMCVInfo(pjw pjwVar) {
    }
}
