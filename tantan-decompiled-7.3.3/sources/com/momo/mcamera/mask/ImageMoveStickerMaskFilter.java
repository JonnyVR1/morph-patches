package com.momo.mcamera.mask;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.opengl.GLES20;
import android.opengl.Matrix;
import com.core.glcore.util.TextureHelper;
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
import p153l.jt2;
import p153l.umw;

/* JADX INFO: loaded from: classes8.dex */
public class ImageMoveStickerMaskFilter extends jt2 implements gam {
    public static final String ATTRIBUTE_DECORATION_SIZE = "decorationSize";
    public static final String ATTRIBUTE_POSITION_2 = "position2";
    static final int COORDS_PER_VERTEX = 2;
    private Context context;
    private int decorateHandler;
    private ShortBuffer drawListBuffer;
    private FloatBuffer fvertexBuffer;
    private String imagePath;
    private boolean isDraw;
    private MmcvImageCacheLoader mmcvImageLoader;
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
    private boolean isPost = false;
    private float PositionX = 0.5f;

    public ImageMoveStickerMaskFilter(Context context, Sticker sticker) {
        this.sticker = sticker;
        this.context = context;
        initCoordinate();
    }

    private void drawPositionSetFixed() {
        float f = 2.0f;
        PointF pointF = new PointF((getWidth() / 2.0f) / getWidth(), (((getHeight() - (this.sticker.getImageHeight() * getAdjustHeightScale())) / 2.0f) + ((this.sticker.getImageHeight() * getAdjustHeightScale()) / 2.0f)) / getHeight());
        if (this.sticker.getImageWidth() <= 360 && getWidth() != 720) {
            f = 1.5f;
        }
        setParamForMatrix(f, f, pointF, 0.0f);
    }

    private void drawPositionSetScaleSize() {
        setParamForMatrix(1.0f, 1.0f, new PointF(this.PositionX, 0.5f), 0.0f);
    }

    private void initCoordinate() {
        updateSticker(this.sticker);
    }

    @Override // p153l.wej
    public void bindShaderAttributes() {
        super.bindShaderAttributes();
        GLES20.glBindAttribLocation(this.programHandle, 3, "decorationSize");
    }

    public void cancelDraw() {
        synchronized (getLockObject()) {
            this.isDraw = false;
        }
    }

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

    @Override // p153l.gfj, p153l.wej
    public void destroy() {
        super.destroy();
        deleteTexture();
        clearPoints();
    }

    public void draw() {
        GLES20.glUniform2f(this.decorateHandler, 1.0f, this.sticker.getImageHeight() / this.sticker.getImageWidth());
        GLES20.glDrawElements(4, this.drawOrder.length, 5123, this.drawListBuffer);
        GLES20.glDisableVertexAttribArray(this.positionHandle);
    }

    @Override // p153l.gfj
    public void drawSub() {
        List<float[]> list = this.mvpLists;
        if (list == null || list.size() <= 0) {
            if (this.isPost) {
                drawPositionSetScaleSize();
            } else {
                drawPositionSetFixed();
            }
        }
        if (this.texture_in == 0) {
            return;
        }
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

    public float getAdjustHeightScale() {
        if (getHeight() == 640.0f) {
            return 1.0f;
        }
        return (getHeight() * 1.0f) / 640.0f;
    }

    public float getAdjustWidthScale() {
        if (getWidth() == 480.0f) {
            return 1.0f;
        }
        return getWidth() / 480.0f;
    }

    @Override // p153l.wej
    public String getFragmentShader() {
        return "precision mediump float;uniform sampler2D inputImageTexture;varying vec2 textureCoordinate;\nvoid main() {   vec4 color1  = texture2D(inputImageTexture,textureCoordinate);\n   if (color1.a > 0.0) {color1.rgb = color1.rgb/color1.a;}    gl_FragColor = color1;\n}";
    }

    @Override // p153l.wej
    public String getVertexShader() {
        return "attribute vec4 position;\nattribute vec4   position2 ; attribute vec4 inputTextureCoordinate;\nvarying vec2 textureCoordinate;\nuniform vec2 decorationSize;\nvoid main() {  gl_Position = position;   vec2 coord = position2.xy;  coord = (coord) / decorationSize;\n  textureCoordinate = vec2(1.0 - (coord.x + 0.5),1.0-(coord.y + 0.5));\n}";
    }

    @Override // p153l.wej
    public void initShaderHandles() {
        super.initShaderHandles();
        this.positionHandle2 = GLES20.glGetAttribLocation(this.programHandle, "position2");
        this.decorateHandler = GLES20.glGetUniformLocation(this.programHandle, "decorationSize");
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
                if (this.isDraw) {
                    umw mmcvImage = this.mmcvImageLoader.getMmcvImage(this.context);
                    this.imagePath = this.mmcvImageLoader.imagePath;
                    if (mmcvImage == null || mmcvImage.m196795a() == null) {
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
        GLES20.glEnableVertexAttribArray(this.positionHandle);
        GLES20.glEnableVertexAttribArray(this.positionHandle2);
        this.textureVertices[this.curRotation].position(0);
        GLES20.glVertexAttribPointer(this.texCoordHandle, 2, 5126, false, 8, (Buffer) this.textureVertices[this.curRotation]);
        GLES20.glEnableVertexAttribArray(this.texCoordHandle);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.texture_in);
        GLES20.glUniform1i(this.textureHandle, 0);
    }

    public void setParamForMatrix(float f, float f2, PointF pointF, float f3) {
        synchronized (this.maskListLock) {
            try {
                if (pointF == null) {
                    return;
                }
                float f4 = -((pointF.x * 2.0f) - 1.0f);
                float f5 = ((-pointF.y) * 2.0f) + 1.0f;
                pointF.x = f4;
                pointF.y = f5;
                float[] fArr = new float[16];
                float[] fArr2 = new float[16];
                Matrix.setIdentityM(fArr2, 0);
                Matrix.translateM(fArr2, 0, -f4, f5, 0.0f);
                Matrix.multiplyMM(fArr, 0, this.mViewMatrix, 0, this.mProjectionMatrix, 0);
                Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr, 0);
                Matrix.rotateM(fArr, 0, f3, 0.0f, 0.0f, 1.0f);
                Matrix.scaleM(fArr, 0, f * 1.0f, f2 * 1.0f, 1.0f);
                Matrix.multiplyMM(fArr2, 0, fArr, 0, this.texData0, 0);
                this.mvpLists.add(new float[]{fArr2[0], fArr2[1], fArr2[4], fArr2[5], fArr2[8], fArr2[9], fArr2[12], fArr2[13]});
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setPosition(float f) {
        this.PositionX = f;
    }

    public void setPostWatermark(boolean z) {
        this.isPost = z;
    }

    @Override // p153l.gam
    public void setTimeStamp(long j) {
        MmcvImageCacheLoader mmcvImageCacheLoader = this.mmcvImageLoader;
        if (mmcvImageCacheLoader != null) {
            mmcvImageCacheLoader.setRenderTime(j);
        }
    }

    public void updateSticker(Sticker sticker) {
        if (sticker == null) {
            return;
        }
        this.sticker = sticker;
        this.mmcvImageLoader = new MmcvImageCacheLoader(sticker, this.context);
        if (this.stickerWidth == sticker.getImageWidth() && this.stickerHeight == sticker.getImageHeight()) {
            return;
        }
        this.stickerWidth = sticker.getImageWidth();
        this.stickerHeight = sticker.getImageHeight();
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
}
