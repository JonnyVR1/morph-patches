package com.momo.mcamera.mask;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PointF;
import android.opengl.GLES20;
import android.opengl.Matrix;
import com.core.glcore.util.ImageUtils;
import com.core.glcore.util.TextureHelper;
import com.momo.mcamera.mask.delegate.ImageDelegateProvider;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import p153l.gam;
import p153l.gfj;
import p153l.omw;
import p153l.umw;

/* JADX INFO: loaded from: classes8.dex */
public class StickerHaniMaskFilter extends FaceDetectFilter implements gam {
    public static final String ATTRIBUTE_DECORATION_SIZE = "decorationSize";
    public static final String ATTRIBUTE_MVP_MATRIX = "uMVPMatrix";
    public static final String ATTRIBUTE_POSITION_2 = "position2";
    static final int COORDS_PER_VERTEX = 2;
    private Context context;
    umw curMMCVImage;
    FaceDetectFilter.FaceDetectParam currentParam;
    private int decorateHandler;
    private ShortBuffer drawListBuffer;
    private final short[] drawOrder;
    private int frameRate;
    private FloatBuffer fvertexBuffer;
    private ImageDelegateProvider imageDelegateProvider;
    private int mVPMatrixHandler;
    protected final float[] mViewMatrix;
    float[] mvpMatrix;
    protected int positionHandle2;
    protected Sticker sticker;
    private StickerBitmapCache stickerBitmapCache;
    private int stickerCount;
    float stickerScale;
    float[] texData0;
    int textId;
    private FloatBuffer vertexBuffer;
    private int stickerIndex = 0;
    private final String vertexShaderCode = "uniform mat4 uMVPMatrix;attribute vec4 position;\nattribute vec4   position2 ; attribute vec4 inputTextureCoordinate;\nvarying vec2 textureCoordinate;\nuniform vec2 decorationSize;\nvoid main() {  gl_Position = position;   vec2 coord = position2.xy;  coord = (coord) / decorationSize;\n  textureCoordinate = vec2(1.0 - (coord.x + 0.5),1.0-(coord.y + 0.5));\n}";
    private final String fragmentShaderCode = "precision mediump float;uniform sampler2D inputImageTexture0;varying vec2 textureCoordinate;\nvoid main() {   vec4 color1  = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 color2 = vec4(0.0,1.0,1.0,0.5);\n   vec4 outputColor;\n   float a = color1.a + color2.a * (1.0 - color1.a);\n   outputColor.r = (color1.r * color1.a + color2.r * color2.a * (1.0 - color1.a))/a;\n   outputColor.g = (color1.g * color1.a + color2.g * color2.a * (1.0 - color1.a))/a;\n   outputColor.b = (color1.b * color1.a + color2.b * color2.a * (1.0 - color1.a))/a;\n   outputColor.a = a;\n   gl_FragColor = color1;\n}";
    protected final float[] mProjectionMatrix = new float[16];
    private final int vertexStride = 8;
    protected Object maskListLock = new Object();
    float[] color = {0.2f, 0.70980394f, 0.8980392f, 1.0f};
    float[] color2 = {0.0f, 0.20980392f, 0.19803922f, 1.0f};
    private boolean isDraw = true;
    private boolean lockTexture = false;
    umw mmcvImage = null;
    private long startTime = 0;

    public StickerHaniMaskFilter(Context context, Sticker sticker, ImageDelegateProvider imageDelegateProvider) {
        float[] fArr = new float[16];
        this.mViewMatrix = fArr;
        short[] sArr = {0, 1, 2, 0, 2, 3};
        this.drawOrder = sArr;
        this.stickerCount = sticker.getFrameNumber();
        this.frameRate = sticker.getFrameRate();
        this.sticker = sticker;
        this.context = context;
        this.imageDelegateProvider = imageDelegateProvider;
        float imageHeight = sticker.getImageHeight() / this.sticker.getImageWidth();
        this.stickerScale = imageHeight;
        float[] fArr2 = {-0.5f, imageHeight * 0.5f, -0.5f, (-0.5f) * imageHeight, 0.5f, (-0.5f) * imageHeight, 0.5f, imageHeight * 0.5f};
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(32);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        this.vertexBuffer = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(fArr2);
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
    }

    private umw decodeOneFrameByImage(String str) {
        if (this.mmcvImage == null) {
            this.mmcvImage = new umw();
            Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(str);
            if (this.mmcvImage.m196795a() == null) {
                this.mmcvImage.m196801g(new byte[bitmapDecodeFile.getHeight() * bitmapDecodeFile.getHeight() * 4]);
            }
            bitmapDecodeFile.recycle();
        }
        ImageUtils.decodeMMCVImage(this.mmcvImage, str);
        return this.mmcvImage;
    }

    @Override // p153l.wej
    public void bindShaderAttributes() {
        super.bindShaderAttributes();
        GLES20.glBindAttribLocation(this.programHandle, 2, "position2");
    }

    @Override // com.momo.mcamera.mask.FaceDetectFilter
    public void cancelDraw() {
        StickerBitmapCache stickerBitmapCache = this.stickerBitmapCache;
        if (stickerBitmapCache != null) {
            stickerBitmapCache.cancel();
            this.stickerBitmapCache = null;
        }
    }

    @Override // com.momo.mcamera.mask.FaceDetectFilter
    public void clearPoints() {
    }

    @Override // p153l.gfj, p153l.wej
    public void destroy() {
        super.destroy();
        int i = this.texture_in;
        if (i != 0) {
            GLES20.glDeleteTextures(1, new int[]{i}, 0);
            this.texture_in = 0;
        }
        if (this.mmcvImage != null) {
            this.mmcvImage = null;
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
        FaceDetectFilter.FaceDetectParam faceDetectParam = this.currentParam;
        float f = faceDetectParam.scaleW;
        float f2 = faceDetectParam.scaleH;
        FaceDetectFilter.FaceDetectParam faceDetectParam2 = this.currentParam;
        PointF pointF = new PointF(faceDetectParam2.f14962cX, faceDetectParam2.f14963cY);
        FaceDetectFilter.FaceDetectParam faceDetectParam3 = this.currentParam;
        setParamForMatrix(f, f2, pointF, faceDetectParam3.angle, faceDetectParam3.points68, faceDetectParam3.points96, faceDetectParam3.points104, faceDetectParam3.filterTrigerManager);
        float[] fArr = this.mvpMatrix;
        if (fArr == null || fArr.length != 8) {
            return;
        }
        passShaderValues(fArr);
        draw();
    }

    @Override // p153l.wej
    public String getFragmentShader() {
        return "precision mediump float;uniform sampler2D inputImageTexture0;varying vec2 textureCoordinate;\nvoid main() {   vec4 color1  = texture2D(inputImageTexture0,textureCoordinate);\n   vec4 color2 = vec4(0.0,1.0,1.0,0.5);\n   vec4 outputColor;\n   float a = color1.a + color2.a * (1.0 - color1.a);\n   outputColor.r = (color1.r * color1.a + color2.r * color2.a * (1.0 - color1.a))/a;\n   outputColor.g = (color1.g * color1.a + color2.g * color2.a * (1.0 - color1.a))/a;\n   outputColor.b = (color1.b * color1.a + color2.b * color2.a * (1.0 - color1.a))/a;\n   outputColor.a = a;\n   gl_FragColor = color1;\n}";
    }

    @Override // p153l.wej
    public String getVertexShader() {
        return "uniform mat4 uMVPMatrix;attribute vec4 position;\nattribute vec4   position2 ; attribute vec4 inputTextureCoordinate;\nvarying vec2 textureCoordinate;\nuniform vec2 decorationSize;\nvoid main() {  gl_Position = position;   vec2 coord = position2.xy;  coord = (coord) / decorationSize;\n  textureCoordinate = vec2(1.0 - (coord.x + 0.5),1.0-(coord.y + 0.5));\n}";
    }

    @Override // p153l.wej
    public void initShaderHandles() {
        super.initShaderHandles();
        this.positionHandle2 = GLES20.glGetAttribLocation(this.programHandle, "position2");
        this.mVPMatrixHandler = GLES20.glGetUniformLocation(this.programHandle, "uMVPMatrix");
        this.decorateHandler = GLES20.glGetUniformLocation(this.programHandle, "decorationSize");
    }

    @Override // com.momo.mcamera.mask.FaceDetectFilter
    public void lockTexture() {
    }

    @Override // p153l.jt2, p153l.dfj
    public void newTextureReady(int i, gfj gfjVar, boolean z) {
        StickerHaniMaskFilter stickerHaniMaskFilter;
        boolean z2;
        if (z) {
            markAsDirty();
        }
        if (this.mvpMatrix == null) {
            FaceDetectFilter.FaceDetectParam faceDetectParam = this.currentParam;
            float f = faceDetectParam.scaleW;
            float f2 = faceDetectParam.scaleH;
            FaceDetectFilter.FaceDetectParam faceDetectParam2 = this.currentParam;
            PointF pointF = new PointF(faceDetectParam2.f14962cX, faceDetectParam2.f14963cY);
            FaceDetectFilter.FaceDetectParam faceDetectParam3 = this.currentParam;
            stickerHaniMaskFilter = this;
            stickerHaniMaskFilter.setParamForMatrix(f, f2, pointF, faceDetectParam3.angle, faceDetectParam3.points68, faceDetectParam3.points96, faceDetectParam3.points104, faceDetectParam3.filterTrigerManager);
        } else {
            stickerHaniMaskFilter = this;
        }
        if (!stickerHaniMaskFilter.lockTexture || stickerHaniMaskFilter.texture_in <= 0 || stickerHaniMaskFilter.mvpMatrix == null) {
            if (stickerHaniMaskFilter.mvpMatrix != null) {
                umw umwVarDecodeOneFrameByImage = stickerHaniMaskFilter.decodeOneFrameByImage(stickerHaniMaskFilter.sticker.getImagePathByIndex(stickerHaniMaskFilter.context, stickerHaniMaskFilter.stickerIndex));
                if (umwVarDecodeOneFrameByImage != null) {
                    stickerHaniMaskFilter.curMMCVImage = umwVarDecodeOneFrameByImage;
                    z2 = true;
                } else {
                    z2 = false;
                }
                umw umwVar = stickerHaniMaskFilter.curMMCVImage;
                if (umwVar == null || umwVar == null || umwVar.m196795a().length <= 0) {
                    if (stickerHaniMaskFilter.curMMCVImage != null) {
                        stickerHaniMaskFilter.curMMCVImage = null;
                    }
                    if (umwVarDecodeOneFrameByImage != null || stickerHaniMaskFilter.imageDelegateProvider == null) {
                        stickerHaniMaskFilter.clearPoints();
                    } else {
                        StickerBitmapCache stickerBitmapCache = stickerHaniMaskFilter.stickerBitmapCache;
                        Bitmap realBitmap = stickerBitmapCache != null ? stickerBitmapCache.getRealBitmap() : null;
                        if (realBitmap != null) {
                            int i2 = stickerHaniMaskFilter.texture_in;
                            if (i2 != 0) {
                                GLES20.glDeleteTextures(1, new int[]{i2}, 0);
                                stickerHaniMaskFilter.texture_in = 0;
                            }
                            stickerHaniMaskFilter.texture_in = TextureHelper.bitmapToTexture(realBitmap);
                        } else {
                            stickerHaniMaskFilter.clearPoints();
                        }
                    }
                } else if (z2) {
                    int i3 = stickerHaniMaskFilter.texture_in;
                    umw umwVar2 = stickerHaniMaskFilter.curMMCVImage;
                    if (i3 == 0) {
                        stickerHaniMaskFilter.texture_in = TextureHelper.bitmapToTexture(umwVar2);
                    } else {
                        stickerHaniMaskFilter.texture_in = TextureHelper.loadDataToTexture(i3, umwVar2);
                    }
                }
            } else {
                stickerHaniMaskFilter.mvpMatrix = null;
            }
        }
        stickerHaniMaskFilter.setWidth(gfjVar.getWidth());
        stickerHaniMaskFilter.setHeight(gfjVar.getHeight());
        float width = stickerHaniMaskFilter.getWidth() / stickerHaniMaskFilter.getHeight();
        Matrix.orthoM(stickerHaniMaskFilter.mProjectionMatrix, 0, -1.0f, 1.0f, (-1.0f) / width, 1.0f / width, 3.0f, 7.0f);
        stickerHaniMaskFilter.onDrawFrame();
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
        GLES20.glEnableVertexAttribArray(this.positionHandle);
        GLES20.glEnableVertexAttribArray(this.positionHandle2);
        this.textureVertices[this.curRotation].position(0);
        int i = this.texCoordHandle;
        if (i >= 0) {
            GLES20.glVertexAttribPointer(i, 2, 5126, false, 8, (Buffer) this.textureVertices[this.curRotation]);
            GLES20.glEnableVertexAttribArray(this.texCoordHandle);
        }
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.texture_in);
        GLES20.glUniform1i(this.textureHandle, 0);
    }

    @Override // com.momo.mcamera.mask.FaceDetectFilter
    public void pauseBitmapCache() {
        synchronized (getLockObject()) {
            try {
                StickerBitmapCache stickerBitmapCache = this.stickerBitmapCache;
                if (stickerBitmapCache != null) {
                    stickerBitmapCache.pauseCache();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.mcamera.mask.FaceDetectFilter
    public void resetSticker(Sticker sticker) {
        synchronized (getLockObject()) {
            try {
                this.sticker = sticker;
                if (this.stickerBitmapCache != null) {
                    cancelDraw();
                }
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
                this.stickerBitmapCache = new StickerBitmapCache(sticker, this.context, this.imageDelegateProvider);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.mcamera.mask.FaceDetectFilter
    public void resumeBitmapCache() {
        synchronized (getLockObject()) {
            try {
                StickerBitmapCache stickerBitmapCache = this.stickerBitmapCache;
                if (stickerBitmapCache != null) {
                    stickerBitmapCache.resumeCache();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.mcamera.mask.FaceDetectFilter
    public void setDetectParam(FaceDetectFilter.FaceDetectParam faceDetectParam) {
        synchronized (getLockObject()) {
            FaceDetectFilter.FaceDetectParam faceDetectParam2 = new FaceDetectFilter.FaceDetectParam();
            faceDetectParam2.centerPoint = faceDetectParam.centerPoint;
            faceDetectParam2.scaleW = faceDetectParam.scaleW;
            faceDetectParam2.scaleH = faceDetectParam.scaleH;
            faceDetectParam2.angle = faceDetectParam.angle;
            PointF pointF = faceDetectParam.centerPoint;
            faceDetectParam2.f14962cX = pointF.x;
            faceDetectParam2.f14963cY = pointF.y;
            this.currentParam = faceDetectParam2;
        }
    }

    public void setParamForMatrix(float f, float f2, PointF pointF, float f3, float[] fArr, float[] fArr2, float[] fArr3, FilterTriggerManager filterTriggerManager) {
        synchronized (this.maskListLock) {
            try {
                if (this.currentParam == null) {
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
                this.mvpMatrix = new float[]{fArr5[0], fArr5[1], fArr5[4], fArr5[5], fArr5[8], fArr5[9], fArr5[12], fArr5[13]};
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
        if (j < this.startTime) {
            this.startTime = j;
        }
        if (this.startTime == 0) {
            this.startTime = j;
        }
        this.stickerIndex = ((int) ((j - this.startTime) / ((long) (1000 / this.frameRate)))) % this.stickerCount;
    }

    @Override // com.momo.mcamera.mask.FaceDetectFilter
    public void unlockTexture() {
    }

    @Override // com.momo.mcamera.mask.FaceDetectFilter, p153l.suf
    public void setMMCVInfo(omw omwVar) {
    }
}
