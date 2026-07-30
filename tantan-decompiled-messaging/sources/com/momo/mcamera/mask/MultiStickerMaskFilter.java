package com.momo.mcamera.mask;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.RectF;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.text.TextUtils;
import com.core.glcore.p023cv.MMCVBoxes;
import com.core.glcore.util.TextureHelper;
import com.momo.mcamera.mask.bean.AbsolutePosition;
import com.momo.mcamera.util.PointHelper;
import com.momocv.MMBox;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p149l.etf;
import p149l.kqe;
import p149l.mcj;
import p149l.pjw;
import p149l.q7m;
import p149l.ts2;
import p149l.vjw;

/* JADX INFO: loaded from: classes7.dex */
public class MultiStickerMaskFilter extends ts2 implements q7m, etf, StickerAdjustFilter.IOrderable {
    public static final String ATTRIBUTE_DECORATION_SIZE = "decorationSize";
    public static final String ATTRIBUTE_MVP_MATRIX = "uMVPMatrix";
    public static final String ATTRIBUTE_POSITION_3 = "position3";
    protected static final int COORDS_PER_VERTEX = 2;
    protected static final long DEFAULT_DURATION = 30000000;
    public static final int POINTS_LENGTH = 68;
    public static final String UNIFORM_ETC1FLAG = "etc1Flag";
    public static final String UNIFORM_PREMULTI = "isPreMulti";
    protected Context context;
    protected int decorateHandler;
    public ShortBuffer drawListBuffer;
    protected final short[] drawOrder;
    FilterTriggerManager filterTriggerManager;
    public StickerFinishListener finishListener;
    private int isPreMultiHandle;
    private int mETC1Handler;
    protected List<List<StickerItem>> mPollTriggerStickerItemList;
    private int mVPMatrixHandler;
    private MMCVBoxes mmcvBoxes;
    protected int positionHandle3;
    protected float[] textureCoord;
    protected FloatBuffer vertexBufer;
    protected final int vertexStride = 8;
    private boolean lockTexture = false;
    protected final float[] mProjectionMatrix = new float[16];
    float scaleWidthRatio = 1.0f;
    float scaleHeightRatio = 1.0f;
    private boolean isPreMultiMode = false;
    protected int faceIndex = 0;
    private boolean projectionInit = false;
    protected long lastStickerTime = 0;
    private final String vertexShaderCode = "uniform mat4 uMVPMatrix;attribute vec4 position;\nattribute vec4   inputTextureCoordinate ; attribute vec4   position3 ; varying vec2 textureCoordinate;\nvarying vec2 textureCoordinate1;\nuniform vec2 decorationSize;\nuniform mediump float etc1Flag;\nvoid main() {  gl_Position = position;  vec2 coord = inputTextureCoordinate.xy;  if(etc1Flag > 0.5){\n    vec2 coord1 = position3.xy;    textureCoordinate1 = vec2(1.0 - (coord1.x + 0.5),1.0-(coord1.y + 0.5));\n  }else{\n    coord = (coord) / decorationSize;\n   }\n  textureCoordinate = vec2(1.0 - (coord.x + 0.5),1.0-(coord.y + 0.5));\n}";
    private final String fragmentShaderCode = "precision mediump float;uniform sampler2D inputImageTexture0;uniform float etc1Flag;\nuniform int isPreMulti;\nvarying vec2 textureCoordinate;\nvarying vec2 textureCoordinate1;\nvoid main() {   vec4 color1  = texture2D(inputImageTexture0,textureCoordinate);\nif(etc1Flag > 0.5){\n   color1.a  = texture2D(inputImageTexture0,textureCoordinate1).r;\n}else{\n   if(isPreMulti == 1){\n       if (color1.a > 0.0) {color1.rgb = color1.rgb/color1.a;}   }\n}\n   gl_FragColor = color1; }";
    private List<StickerItem> mCurrentStickerItem = null;
    private int mIndex = 0;
    private boolean mLastMmcvBoxIsEmpty = true;
    private int mNoBoxCount = 0;
    private long mCurrentTime = 0;
    int orderedIndex = 0;
    protected List<StickerItem> stickerItemList = new ArrayList();
    protected List<StickerItem> stickerItemDestroyList = new ArrayList();

    public interface StickerFinishListener {
        void stickerRenderFinished(int i, Sticker sticker);
    }

    public MultiStickerMaskFilter(Context context) {
        short[] sArr = {0, 1, 2, 0, 2, 3};
        this.drawOrder = sArr;
        this.context = context;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(sArr.length * 2);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        ShortBuffer shortBufferAsShortBuffer = byteBufferAllocateDirect.asShortBuffer();
        this.drawListBuffer = shortBufferAsShortBuffer;
        shortBufferAsShortBuffer.put(sArr);
        this.drawListBuffer.position(0);
    }

    private void clearMaskWithModeTypeFromList(List<StickerItem> list, int i) {
        for (StickerItem stickerItem : list) {
            if (stickerItem.sticker.getModelType() == i) {
                this.stickerItemDestroyList.add(stickerItem);
            }
        }
    }

    private void drawAbsPostionAdjustResolution(StickerItem stickerItem, FaceDetectFilter.FaceDetectParam faceDetectParam) {
        float imageWidth = (stickerItem.sticker.getImageWidth() / (getWidth() / 2.0f)) * (((float) getWidth()) > 480.0f ? getWidth() / 352.0f : 1.0f);
        AbsolutePosition absolutePos = stickerItem.sticker.getAbsolutePos();
        if (absolutePos == null || absolutePos.getCenter() == null) {
            faceDetectParam.centerPoint = new PointF(0.5f, 0.5f);
        } else {
            faceDetectParam.centerPoint = new PointF(absolutePos.getCenter().f14252x, absolutePos.getCenter().f14253y);
        }
        faceDetectParam.scaleW = imageWidth;
        faceDetectParam.scaleH = imageWidth;
        faceDetectParam.angle = stickerItem.sticker.getDeviceOrientation();
        faceDetectParam.filterTrigerManager = this.filterTriggerManager;
        stickerItem.setDetectParam(faceDetectParam);
    }

    private void drawAbsolutePostion(StickerItem stickerItem, FaceDetectFilter.FaceDetectParam faceDetectParam) {
        float imageWidth = (stickerItem.sticker.getImageWidth() * getAdjustHeightScale()) / (getWidth() / 2.0f);
        AbsolutePosition absolutePos = stickerItem.sticker.getAbsolutePos();
        if (absolutePos == null || absolutePos.getCenter() == null) {
            faceDetectParam.centerPoint = new PointF(0.5f, 0.5f);
        } else {
            faceDetectParam.centerPoint = new PointF(absolutePos.getCenter().f14252x, absolutePos.getCenter().f14253y);
        }
        if (stickerItem instanceof StickerFixItem) {
            imageWidth = (stickerItem.sticker.getImageWidth() * 2.0f) / getWidth();
            float width = (absolutePos.getCenter().f14252x * absolutePos.getCenter().f14251w) + ((getWidth() - absolutePos.getCenter().f14251w) / 2.0f);
            float f = absolutePos.getCenter().f14253y * absolutePos.getCenter().f14250h;
            faceDetectParam.centerPoint.x = width / getWidth();
            faceDetectParam.centerPoint.y = f / getHeight();
        }
        faceDetectParam.scaleW = imageWidth;
        faceDetectParam.scaleH = imageWidth;
        faceDetectParam.angle = stickerItem.sticker.getDeviceOrientation();
        faceDetectParam.filterTrigerManager = this.filterTriggerManager;
        stickerItem.setDetectParam(faceDetectParam);
    }

    private void drawAbsolutePostionUseStcikerDim(StickerItem stickerItem, FaceDetectFilter.FaceDetectParam faceDetectParam) {
        float imageWidth = (stickerItem.sticker.getImageWidth() * ((getHeight() * 1.0f) / stickerItem.sticker.getBaseDemensionHeight())) / (getWidth() / 2.0f);
        AbsolutePosition absolutePos = stickerItem.sticker.getAbsolutePos();
        if (absolutePos == null || absolutePos.getCenter() == null) {
            faceDetectParam.centerPoint = new PointF(0.5f, 0.5f);
        } else {
            faceDetectParam.centerPoint = new PointF(absolutePos.getCenter().f14252x, absolutePos.getCenter().f14253y);
        }
        faceDetectParam.scaleW = imageWidth;
        faceDetectParam.scaleH = imageWidth;
        faceDetectParam.angle = stickerItem.sticker.getDeviceOrientation();
        faceDetectParam.filterTrigerManager = this.filterTriggerManager;
        stickerItem.setDetectParam(faceDetectParam);
    }

    private void drawFaceSticker(StickerItem stickerItem, FaceDetectFilter.FaceDetectParam faceDetectParam, pjw pjwVar, float[] fArr, float f) {
        PointF centerPoint;
        Sticker sticker = stickerItem.sticker;
        if (!sticker.isGameSticker) {
            stickerItem.clearPoints();
        }
        if (fArr == null || fArr.length <= 0) {
            return;
        }
        float f2 = fArr[sticker.getFacePositionLeft()];
        float f3 = fArr[sticker.getFacePositionLeft() + 68];
        float f4 = fArr[sticker.getFacePositionRight()];
        float f5 = fArr[sticker.getFacePositionRight() + 68];
        PointF pointF = new PointF(f2, f3);
        PointF pointF2 = new PointF(f4, f5);
        PointF pointF3 = new PointF(sticker.getOffsetX() * getAdjustWidthScale(), sticker.getOffsetY() * getAdjustWidthScale());
        PointHelper.rotatePoint(pointF3, f);
        if (sticker.hasCenterPoint()) {
            centerPoint = new PointF(fArr[sticker.getCenterIndex()], fArr[sticker.getCenterIndex() + 68]);
        } else if (sticker.getPointIndexes().length == 1) {
            int i = sticker.getPointIndexes()[0];
            centerPoint = new PointF(fArr[i], fArr[i + 68]);
        } else {
            int i2 = sticker.getPointIndexes()[0];
            int i3 = sticker.getPointIndexes()[1];
            centerPoint = PointHelper.getCenterPoint(new PointF(fArr[i2], fArr[i2 + 68]), new PointF(fArr[i3], fArr[i3 + 68]));
        }
        float f6 = ((float) PointHelper.getmDistancePoint(pointF, pointF2)) / 180.0f;
        float adjustWidthScale = (f6 / getAdjustWidthScale()) * ((sticker.getImageWidth() * getAdjustWidthScale()) / (getWidth() / 2));
        centerPoint.x += (pointF3.x * f6) / getAdjustWidthScale();
        centerPoint.y += (pointF3.y * f6) / getAdjustWidthScale();
        PointF pointF4 = new PointF(centerPoint.x / getWidth(), centerPoint.y / getHeight());
        faceDetectParam.scaleW = adjustWidthScale;
        faceDetectParam.scaleH = adjustWidthScale;
        faceDetectParam.centerPoint = pointF4;
        faceDetectParam.angle = f;
        if (pjwVar.m169950n() > 0) {
            faceDetectParam.points68 = pjwVar.m169946j(0).m220018l();
            faceDetectParam.points96 = pjwVar.m169946j(0).m220019m();
            faceDetectParam.points104 = pjwVar.m169946j(0).m220016j();
            faceDetectParam.warpedPoints104 = pjwVar.m169946j(0).m220032z();
        }
        faceDetectParam.filterTrigerManager = this.filterTriggerManager;
        stickerItem.setDetectParam(faceDetectParam);
    }

    private void drawFixedSticker(StickerItem stickerItem, FaceDetectFilter.FaceDetectParam faceDetectParam) {
        Sticker sticker = stickerItem.sticker;
        PointF pointF = new PointF((getWidth() / 2.0f) / getWidth(), (sticker.isShowTop() ? (sticker.getImageHeight() * getAdjustHeightScale()) / 2.0f : getHeight() - ((sticker.getImageHeight() * getAdjustHeightScale()) / 2.0f)) / getHeight());
        float imageWidth = (stickerItem.sticker.getImageWidth() * getAdjustHeightScale()) / (getWidth() / 2.0f);
        faceDetectParam.scaleW = imageWidth;
        faceDetectParam.scaleH = imageWidth;
        faceDetectParam.centerPoint = pointF;
        faceDetectParam.angle = sticker.getDeviceOrientation();
        faceDetectParam.filterTrigerManager = this.filterTriggerManager;
        stickerItem.setDetectParam(faceDetectParam);
    }

    private void drawFullScreenFixed(StickerItem stickerItem, FaceDetectFilter.FaceDetectParam faceDetectParam) {
        float f = 2.0f;
        PointF pointF = new PointF((getWidth() / 2.0f) / getWidth(), (((getHeight() - (stickerItem.sticker.getImageHeight() * getAdjustHeightScale())) / 2.0f) + ((stickerItem.sticker.getImageHeight() * getAdjustHeightScale()) / 2.0f)) / getHeight());
        if (stickerItem.sticker.getImageWidth() <= 360 && getWidth() != 720) {
            f = 1.5f;
        }
        float f2 = f;
        faceDetectParam.scaleW = f;
        faceDetectParam.scaleH = f2;
        faceDetectParam.centerPoint = pointF;
        faceDetectParam.angle = stickerItem.sticker.getDeviceOrientation();
        faceDetectParam.filterTrigerManager = this.filterTriggerManager;
        stickerItem.setDetectParam(faceDetectParam);
    }

    private void drawGestureFilter(StickerItem stickerItem, FaceDetectFilter.FaceDetectParam faceDetectParam) {
        if (stickerItem.sticker.isDonotTrack()) {
            drawGestureFixedFilter(stickerItem, faceDetectParam);
        }
    }

    private void drawGestureFixedFilter(StickerItem stickerItem, FaceDetectFilter.FaceDetectParam faceDetectParam) {
        if (stickerItem.sticker.getObjectTriggerType() == null) {
            return;
        }
        MMCVBoxes mMCVBoxes = this.mmcvBoxes;
        if (mMCVBoxes == null || mMCVBoxes.getDetectResult() == null) {
            faceDetectParam.filterTrigerManager = this.filterTriggerManager;
            faceDetectParam.centerPoint = new PointF(0.0f, 0.0f);
            stickerItem.setDetectParam(faceDetectParam);
            return;
        }
        String objectTriggerType = stickerItem.sticker.getObjectTriggerType();
        faceDetectParam.triggerType = objectTriggerType;
        if (TextUtils.isEmpty(objectTriggerType)) {
            return;
        }
        for (MMBox mMBox : this.mmcvBoxes.getDetectResult()) {
            if (faceDetectParam.triggerType.equals(mMBox.class_name_)) {
                int i = mMBox.f14764x_;
                int i2 = mMBox.f14765y_;
                faceDetectParam.gestureRect = new RectF(i, i2, i + mMBox.width_, i2 + mMBox.height_);
                faceDetectParam.filterTrigerManager = this.filterTriggerManager;
                faceDetectParam.centerPoint = new PointF(0.0f, 0.0f);
                stickerItem.setDetectParam(faceDetectParam);
            }
        }
    }

    private void drawScaleCenterCrop(StickerItem stickerItem, FaceDetectFilter.FaceDetectParam faceDetectParam) {
        float imageWidth = stickerItem.sticker.getImageWidth() / (getWidth() / 2.0f);
        float imageWidth2 = stickerItem.sticker.getImageWidth();
        float imageHeight = stickerItem.sticker.getImageHeight();
        float height = ((float) getHeight()) * imageWidth2 > ((float) getWidth()) * imageHeight ? (getHeight() / imageHeight) * imageWidth : (getWidth() / imageWidth2) * imageWidth;
        faceDetectParam.scaleW = height;
        faceDetectParam.scaleH = height;
        faceDetectParam.centerPoint = new PointF(0.5f, 0.5f);
        faceDetectParam.angle = stickerItem.sticker.getDeviceOrientation();
        faceDetectParam.filterTrigerManager = this.filterTriggerManager;
        stickerItem.setDetectParam(faceDetectParam);
    }

    private void drawScaleToFill(StickerItem stickerItem, FaceDetectFilter.FaceDetectParam faceDetectParam) {
        float imageWidth = stickerItem.sticker.getImageWidth() / (getWidth() / 2.0f);
        faceDetectParam.scaleH = (getHeight() / stickerItem.sticker.getImageHeight()) * imageWidth;
        faceDetectParam.scaleW = (getWidth() / stickerItem.sticker.getImageWidth()) * imageWidth;
        faceDetectParam.centerPoint = new PointF(0.5f, 0.5f);
        faceDetectParam.angle = stickerItem.sticker.getDeviceOrientation();
        faceDetectParam.filterTrigerManager = this.filterTriggerManager;
        stickerItem.setDetectParam(faceDetectParam);
    }

    private void drawSubStickerItem(StickerItem stickerItem) {
        synchronized (stickerItem.getLockObject()) {
            try {
                stickerItem.imageWidth = getWidth();
                stickerItem.imageHeight = getHeight();
                List<float[]> list = stickerItem.mvpLists;
                boolean z = false;
                if (list == null || list.size() <= 0 || !stickerItem.isDraw) {
                    if (stickerItem.sticker.getLoopStart() <= 0 || !stickerItem.sticker.isAlwaysShow()) {
                        stickerItem.sticker.curIndex = 0;
                    }
                } else if (stickerItem instanceof StickerETC1Item) {
                    StickerETC1Item stickerETC1Item = (StickerETC1Item) stickerItem;
                    if (stickerETC1Item.etc1_texture_sticker == 0) {
                        stickerETC1Item.etc1_texture_sticker = TextureHelper.etc1ToTexture(stickerETC1Item.texture);
                    }
                    stickerETC1Item.updateETC1Coordinate();
                    z = true;
                } else {
                    vjw mmcvImage = stickerItem.getMmcvImage(this.context);
                    if (mmcvImage == null || mmcvImage.m198688a() == null) {
                        Bitmap bitmap = stickerItem.getBitmap();
                        if (bitmap != null && !bitmap.isRecycled()) {
                            int i = stickerItem.texture_sticker;
                            if (i > 0) {
                                TextureHelper.updateBitmap(bitmap, i);
                            } else {
                                stickerItem.texture_sticker = TextureHelper.bitmapToTexture(bitmap);
                            }
                        }
                    } else {
                        int i2 = stickerItem.texture_sticker;
                        if (i2 == 0) {
                            stickerItem.texture_sticker = TextureHelper.bitmapToTexture(mmcvImage);
                        } else {
                            stickerItem.texture_sticker = TextureHelper.loadDataToTexture(i2, mmcvImage);
                        }
                    }
                }
                if (stickerItem.isDraw && (stickerItem.texture_sticker != 0 || z)) {
                    this.isPreMultiMode = stickerItem.sticker.isPreMultiAlpha();
                    Iterator<float[]> it = stickerItem.mvpLists.iterator();
                    while (it.hasNext()) {
                        passStickerShaderValues(stickerItem, it.next());
                        drawStick(stickerItem.getStickerAspectRatio());
                    }
                    stickerItem.clearPoints();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void drawSubStickerItemByAll(StickerItem stickerItem) {
        if (stickerItem.getEffectTimeBean() == null || !stickerItem.sticker.isHaniSticker) {
            drawSubStickerItem(stickerItem);
        } else {
            if (this.mCurrentTime < stickerItem.getEffectTimeBean().f124252a || this.mCurrentTime > stickerItem.getEffectTimeBean().f124253b) {
                return;
            }
            drawSubStickerItem(stickerItem);
        }
    }

    private boolean judgeHaveSameSticker(Sticker sticker, StickerItem stickerItem) {
        if (!(stickerItem instanceof StickerDelegateItem) || stickerItem.sticker.getImageProvider() == null) {
            removeStickerItem(stickerItem);
            return false;
        }
        ((StickerDelegateItem) stickerItem).replaceSticker(sticker);
        return true;
    }

    private void removeHaniStickerFromList(List<StickerItem> list, int i) {
        for (StickerItem stickerItem : list) {
            if ((stickerItem instanceof StickerHaniItem) && ((StickerHaniItem) stickerItem).sticker.getModelType() == i) {
                this.stickerItemDestroyList.add(stickerItem);
                return;
            }
        }
    }

    private void removeStickerFromList(List<StickerItem> list, String str) {
        for (StickerItem stickerItem : list) {
            if (str.equals(stickerItem.sticker.getStickerType())) {
                this.stickerItemDestroyList.add(stickerItem);
            }
        }
    }

    private void setHanniStickerParamInItemList(List<StickerItem> list, FaceDetectFilter.FaceDetectParam faceDetectParam, int i) {
        StickerHaniItem stickerHaniItem = null;
        boolean z = false;
        for (int i2 = 0; i2 < list.size(); i2++) {
            StickerItem stickerItem = list.get(i2);
            if (stickerItem instanceof StickerHaniItem) {
                stickerHaniItem = (StickerHaniItem) stickerItem;
                if (stickerHaniItem.sticker.getModelType() == i) {
                    stickerHaniItem.setDetectParam(faceDetectParam);
                    list.remove(stickerItem);
                    z = true;
                    break;
                }
            }
        }
        if (!z || stickerHaniItem == null) {
            return;
        }
        list.add(stickerHaniItem);
    }

    private void updateFaceInfoBySingleItem(pjw pjwVar, float f, float[] fArr, boolean z, StickerItem stickerItem) {
        stickerItem.setCurrentTime(this.lastStickerTime);
        Sticker sticker = stickerItem.sticker;
        FaceDetectFilter.FaceDetectParam faceDetectParam = new FaceDetectFilter.FaceDetectParam();
        if (!z) {
            drawAllStickers(stickerItem, faceDetectParam, z);
            return;
        }
        faceDetectParam.mmcvBoxes = this.mmcvBoxes;
        if (drawAllStickers(stickerItem, faceDetectParam, z) || sticker.getType() != 0) {
            return;
        }
        drawFaceSticker(stickerItem, faceDetectParam, pjwVar, fArr, f);
    }

    public void addSticker(Sticker sticker, StickerBlendFilter.StickerStateChangeListener stickerStateChangeListener) {
        StickerItem stickerHaniItem;
        if (sticker != null) {
            if (sticker.getEtcTextureBatch() != null) {
                stickerHaniItem = new StickerETC1Item(sticker, this.context);
            } else if (!TextUtils.isEmpty(sticker.getStickerType()) && sticker.getStickerType().startsWith("weex")) {
                stickerHaniItem = new StickerDelegateItem(sticker, this.context);
            } else if (sticker.isGameSticker) {
                stickerHaniItem = new StickerGameItem(sticker, this.context);
            } else if ("STICKER_TYPE_GAME_FIX_TYPE".equals(sticker.getStickerType())) {
                stickerHaniItem = new StickerFixItem(sticker, this.context);
            } else {
                boolean z = sticker.isHaniSticker;
                Context context = this.context;
                stickerHaniItem = z ? new StickerHaniItem(sticker, context) : new StickerItem(sticker, context);
            }
            stickerHaniItem.setStickerStateChangeListener(stickerStateChangeListener);
            if (sticker.getDuration() > 0) {
                stickerHaniItem.mStickerDuration = sticker.getDuration();
            } else {
                stickerHaniItem.mStickerDuration = DEFAULT_DURATION;
            }
            addSticker(stickerHaniItem);
        }
    }

    @Override // p149l.ccj
    public void bindShaderAttributes() {
        super.bindShaderAttributes();
        GLES20.glBindAttribLocation(this.programHandle, 2, "uMVPMatrix");
        GLES20.glBindAttribLocation(this.programHandle, 3, "decorationSize");
    }

    public void clearMaskWithModelType(int i) {
        List<StickerItem> list = this.stickerItemList;
        if (list != null && list.size() > 0) {
            clearMaskWithModeTypeFromList(this.stickerItemList, i);
        }
        List<List<StickerItem>> list2 = this.mPollTriggerStickerItemList;
        if (list2 == null || list2.size() <= 0) {
            return;
        }
        Iterator<List<StickerItem>> it = this.mPollTriggerStickerItemList.iterator();
        while (it.hasNext()) {
            clearMaskWithModeTypeFromList(it.next(), i);
        }
        this.mPollTriggerStickerItemList.clear();
        this.mPollTriggerStickerItemList = null;
    }

    @Override // p149l.mcj, p149l.ccj
    public void destroy() {
        super.destroy();
        List<StickerItem> list = this.stickerItemList;
        if (list != null && list.size() > 0) {
            Iterator<StickerItem> it = this.stickerItemList.iterator();
            while (it.hasNext()) {
                it.next().destroy();
            }
            this.stickerItemList.clear();
        }
        List<List<StickerItem>> list2 = this.mPollTriggerStickerItemList;
        if (list2 != null && list2.size() > 0) {
            for (List<StickerItem> list3 : this.mPollTriggerStickerItemList) {
                Iterator<StickerItem> it2 = list3.iterator();
                while (it2.hasNext()) {
                    it2.next().destroy();
                }
                list3.clear();
            }
            this.mPollTriggerStickerItemList.clear();
        }
        List<StickerItem> list4 = this.stickerItemDestroyList;
        if (list4 == null || list4.size() <= 0) {
            return;
        }
        Iterator<StickerItem> it3 = this.stickerItemDestroyList.iterator();
        while (it3.hasNext()) {
            it3.next().destroy();
        }
        this.stickerItemDestroyList.clear();
    }

    public boolean drawAllStickers(StickerItem stickerItem, FaceDetectFilter.FaceDetectParam faceDetectParam, boolean z) {
        Sticker sticker = stickerItem.sticker;
        if (!TextUtils.isEmpty(sticker.getLayerType()) && sticker.getLayerType().equals("object_follower")) {
            stickerItem.clearPoints();
            drawGestureFilter(stickerItem, faceDetectParam);
        } else if (!sticker.isAlwaysShow() && !z) {
            stickerItem.clearPoints();
        } else if (sticker.getType() == 1) {
            stickerItem.clearPoints();
            drawFixedSticker(stickerItem, faceDetectParam);
        } else if (sticker.getType() == 2) {
            stickerItem.clearPoints();
            drawFullScreenFixed(stickerItem, faceDetectParam);
        } else if (sticker.getType() == 3) {
            stickerItem.clearPoints();
            drawScaleToFill(stickerItem, faceDetectParam);
        } else if (sticker.getType() == 99) {
            stickerItem.clearPoints();
            drawScaleCenterCrop(stickerItem, faceDetectParam);
        } else if (sticker.getType() == 5) {
            stickerItem.clearPoints();
            drawAbsolutePostion(stickerItem, faceDetectParam);
        } else if (sticker.getType() == 6) {
            stickerItem.clearPoints();
            drawAbsolutePostionUseStcikerDim(stickerItem, faceDetectParam);
        } else if (sticker.getType() == 7) {
            stickerItem.clearPoints();
            drawAbsPostionAdjustResolution(stickerItem, faceDetectParam);
        } else {
            if (!sticker.isNotHiddenAfterTrigger() || z) {
                return false;
            }
            stickerItem.setDetectParam(faceDetectParam);
        }
        return true;
    }

    public void drawBackgroundImage() {
        this.renderVertices.position(0);
        GLES20.glVertexAttribPointer(this.positionHandle, 2, 5126, false, 8, (Buffer) this.renderVertices);
        GLES20.glEnableVertexAttribArray(this.positionHandle);
        GLES20.glUniform2f(this.decorateHandler, 1.0f, 1.0f);
        setUseETC1(false);
        if (this.textureCoord == null) {
            this.textureCoord = new float[8];
        }
        this.textureVertices[this.curRotation].position(0);
        this.textureVertices[this.curRotation].get(this.textureCoord);
        if (this.vertexBufer == null) {
            this.vertexBufer = ByteBuffer.allocateDirect(this.textureCoord.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        }
        for (int i = 0; i < 8; i++) {
            float[] fArr = this.textureCoord;
            fArr[i] = (fArr[i] * (-1.0f)) + 0.5f;
        }
        this.vertexBufer.position(0);
        this.vertexBufer.put(this.textureCoord);
        this.vertexBufer.position(0);
        GLES20.glVertexAttribPointer(this.texCoordHandle, 2, 5126, false, 8, (Buffer) this.vertexBufer);
        GLES20.glEnableVertexAttribArray(this.texCoordHandle);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(3553, this.texture_in);
        GLES20.glUniform1i(this.textureHandle, 0);
        GLES20.glDrawArrays(5, 0, 4);
        disableDrawArray();
        GLES20.glDisableVertexAttribArray(this.positionHandle3);
    }

    public void drawStick(float f) {
        GLES20.glUniform2f(this.decorateHandler, 1.0f, f);
        GLES20.glDrawElements(4, this.drawOrder.length, 5123, this.drawListBuffer);
        disableDrawArray();
        GLES20.glDisableVertexAttribArray(this.positionHandle3);
    }

    @Override // p149l.mcj
    public void drawSub() {
        GLES20.glViewport(0, 0, getWidth(), getHeight());
        GLES20.glUseProgram(this.programHandle);
        GLES20.glClearColor(1.0f, 1.0f, 1.0f, 0.0f);
        GLES20.glClear(16640);
        drawBackgroundImage();
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        if (this.stickerItemDestroyList.size() > 0) {
            ArrayList<StickerItem> arrayList = new ArrayList(this.stickerItemDestroyList);
            for (StickerItem stickerItem : arrayList) {
                stickerItem.destroy();
                this.stickerItemDestroyList.remove(stickerItem);
                List<List<StickerItem>> list = this.mPollTriggerStickerItemList;
                if (list != null && list.size() > 0) {
                    for (List<StickerItem> list2 : this.mPollTriggerStickerItemList) {
                        if (list2.contains(stickerItem)) {
                            list2.remove(stickerItem);
                        }
                    }
                }
                this.stickerItemList.remove(stickerItem);
            }
            arrayList.clear();
        }
        List<StickerItem> list3 = this.stickerItemList;
        if (list3 != null && list3.size() > 0) {
            Iterator<StickerItem> it = this.stickerItemList.iterator();
            while (it.hasNext()) {
                drawSubStickerItemByAll(it.next());
            }
        }
        List<StickerItem> list4 = this.mCurrentStickerItem;
        if (list4 != null && list4.size() > 0) {
            Iterator<StickerItem> it2 = this.mCurrentStickerItem.iterator();
            while (it2.hasNext()) {
                drawSubStickerItemByAll(it2.next());
            }
        }
        GLES20.glDisable(3042);
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

    @Override // p149l.ccj
    public String getFragmentShader() {
        return "precision mediump float;uniform sampler2D inputImageTexture0;uniform float etc1Flag;\nuniform int isPreMulti;\nvarying vec2 textureCoordinate;\nvarying vec2 textureCoordinate1;\nvoid main() {   vec4 color1  = texture2D(inputImageTexture0,textureCoordinate);\nif(etc1Flag > 0.5){\n   color1.a  = texture2D(inputImageTexture0,textureCoordinate1).r;\n}else{\n   if(isPreMulti == 1){\n       if (color1.a > 0.0) {color1.rgb = color1.rgb/color1.a;}   }\n}\n   gl_FragColor = color1; }";
    }

    @Override // com.momo.mcamera.mask.StickerAdjustFilter.IOrderable
    public int getOrderedIndex() {
        return this.orderedIndex;
    }

    public float getScaleHeightRatio() {
        return this.scaleHeightRatio;
    }

    public float getScaleWidthRatio() {
        return this.scaleWidthRatio;
    }

    public int getStickerItemListSize() {
        synchronized (getLockObject()) {
            try {
                int size = 0;
                if (this.stickerItemList == null) {
                    return 0;
                }
                List<List<StickerItem>> list = this.mPollTriggerStickerItemList;
                if (list != null && list.size() > 0) {
                    Iterator<List<StickerItem>> it = this.mPollTriggerStickerItemList.iterator();
                    while (it.hasNext()) {
                        size += it.next().size();
                    }
                }
                return this.stickerItemList.size() + size;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p149l.ccj
    public String getVertexShader() {
        return "uniform mat4 uMVPMatrix;attribute vec4 position;\nattribute vec4   inputTextureCoordinate ; attribute vec4   position3 ; varying vec2 textureCoordinate;\nvarying vec2 textureCoordinate1;\nuniform vec2 decorationSize;\nuniform mediump float etc1Flag;\nvoid main() {  gl_Position = position;  vec2 coord = inputTextureCoordinate.xy;  if(etc1Flag > 0.5){\n    vec2 coord1 = position3.xy;    textureCoordinate1 = vec2(1.0 - (coord1.x + 0.5),1.0-(coord1.y + 0.5));\n  }else{\n    coord = (coord) / decorationSize;\n   }\n  textureCoordinate = vec2(1.0 - (coord.x + 0.5),1.0-(coord.y + 0.5));\n}";
    }

    @Override // p149l.mcj, p149l.ccj
    public void handleSizeChange() {
        super.handleSizeChange();
        if (getHeight() <= 0 || getWidth() <= 0) {
            return;
        }
        float width = getWidth() / getHeight();
        Matrix.orthoM(this.mProjectionMatrix, 0, -1.0f, 1.0f, (-1.0f) / width, 1.0f / width, 3.0f, 7.0f);
        this.projectionInit = true;
    }

    @Override // p149l.ccj
    public void initShaderHandles() {
        super.initShaderHandles();
        this.positionHandle3 = GLES20.glGetAttribLocation(this.programHandle, "position3");
        this.mVPMatrixHandler = GLES20.glGetUniformLocation(this.programHandle, "uMVPMatrix");
        this.decorateHandler = GLES20.glGetUniformLocation(this.programHandle, "decorationSize");
        this.mETC1Handler = GLES20.glGetUniformLocation(this.programHandle, UNIFORM_ETC1FLAG);
        this.isPreMultiHandle = GLES20.glGetUniformLocation(this.programHandle, UNIFORM_PREMULTI);
    }

    public boolean isHaveSameSticker(Sticker sticker) {
        if (TextUtils.isEmpty(sticker.getStickerType())) {
            return false;
        }
        for (StickerItem stickerItem : this.stickerItemList) {
            if (sticker.getStickerType().equals(stickerItem.sticker.getStickerType())) {
                return judgeHaveSameSticker(sticker, stickerItem);
            }
        }
        List<List<StickerItem>> list = this.mPollTriggerStickerItemList;
        if (list != null && list.size() > 0) {
            Iterator<List<StickerItem>> it = this.mPollTriggerStickerItemList.iterator();
            while (it.hasNext()) {
                for (StickerItem stickerItem2 : it.next()) {
                    if (stickerItem2.sticker.getStickerType().equals(sticker.getStickerType())) {
                        return judgeHaveSameSticker(sticker, stickerItem2);
                    }
                }
            }
        }
        return false;
    }

    @Override // p149l.ts2, p149l.jcj
    public void newTextureReady(int i, mcj mcjVar, boolean z) {
        if (z) {
            markAsDirty();
        }
        this.inputFrameBuffer = mcjVar.glFrameBuffer;
        this.texture_in = i;
        setWidth(mcjVar.getWidth());
        setHeight(mcjVar.getHeight());
        onDrawFrame();
        mcjVar.unlockRenderBuffer();
    }

    public void passStickerShaderValues(StickerItem stickerItem, float[] fArr) {
        if (stickerItem.fvertexBuffer == null) {
            ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
            byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
            stickerItem.fvertexBuffer = byteBufferAllocateDirect.asFloatBuffer();
        }
        stickerItem.fvertexBuffer.position(0);
        stickerItem.fvertexBuffer.put(fArr);
        stickerItem.fvertexBuffer.position(0);
        boolean z = stickerItem instanceof StickerETC1Item;
        if (z) {
            setUseETC1(true);
        } else {
            setUseETC1(false);
        }
        GLES20.glUniform1i(this.isPreMultiHandle, this.isPreMultiMode ? 1 : 0);
        GLES20.glVertexAttribPointer(this.positionHandle, 2, 5126, false, 8, (Buffer) stickerItem.fvertexBuffer);
        GLES20.glVertexAttribPointer(this.texCoordHandle, 2, 5126, false, 8, (Buffer) stickerItem.vertexBuffer);
        GLES20.glVertexAttribPointer(this.positionHandle3, 2, 5126, false, 8, (Buffer) stickerItem.vertexBuffer2);
        GLES20.glEnableVertexAttribArray(this.positionHandle);
        GLES20.glEnableVertexAttribArray(this.texCoordHandle);
        GLES20.glEnableVertexAttribArray(this.positionHandle3);
        GLES20.glActiveTexture(33984);
        if (z) {
            GLES20.glBindTexture(3553, ((StickerETC1Item) stickerItem).etc1_texture_sticker);
        } else {
            GLES20.glBindTexture(3553, stickerItem.texture_sticker);
        }
        GLES20.glUniform1i(this.textureHandle, 0);
    }

    public void removeHaniSticker(int i) {
        List<StickerItem> list = this.stickerItemList;
        if (list != null && list.size() > 0) {
            removeHaniStickerFromList(this.stickerItemList, i);
        }
        List<List<StickerItem>> list2 = this.mPollTriggerStickerItemList;
        if (list2 == null || list2.size() <= 0) {
            return;
        }
        Iterator<List<StickerItem>> it = this.mPollTriggerStickerItemList.iterator();
        while (it.hasNext()) {
            removeHaniStickerFromList(it.next(), i);
        }
    }

    public void removeSticker(String str) {
        List<StickerItem> list = this.stickerItemList;
        if (list != null && list.size() > 0) {
            removeStickerFromList(this.stickerItemList, str);
        }
        List<List<StickerItem>> list2 = this.mPollTriggerStickerItemList;
        if (list2 == null || list2.size() <= 0) {
            return;
        }
        Iterator<List<StickerItem>> it = this.mPollTriggerStickerItemList.iterator();
        while (it.hasNext()) {
            removeStickerFromList(it.next(), str);
        }
    }

    public void removeStickerItem(StickerItem stickerItem) {
        synchronized (getLockObject()) {
            this.stickerItemDestroyList.add(stickerItem);
        }
    }

    public void setDeviceOrientation(int i) {
        Iterator<StickerItem> it = this.stickerItemList.iterator();
        while (it.hasNext()) {
            Sticker sticker = it.next().sticker;
            if (sticker != null) {
                sticker.setDeviceOrientation(i);
            }
        }
    }

    public void setDownVelocity(float f) {
        for (StickerItem stickerItem : this.stickerItemList) {
            if (stickerItem instanceof StickerGameItem) {
                ((StickerGameItem) stickerItem).downVelocity = f;
            }
        }
        List<List<StickerItem>> list = this.mPollTriggerStickerItemList;
        if (list == null || list.size() <= 0) {
            return;
        }
        Iterator<List<StickerItem>> it = this.mPollTriggerStickerItemList.iterator();
        while (it.hasNext()) {
            for (StickerItem stickerItem2 : it.next()) {
                if (stickerItem2 instanceof StickerGameItem) {
                    ((StickerGameItem) stickerItem2).downVelocity = f;
                }
            }
        }
    }

    public void setEffectTimeInfoByHaniId(kqe kqeVar, int i) {
        List<StickerItem> list = this.stickerItemList;
        if (list == null || list.size() <= 0) {
            return;
        }
        for (StickerItem stickerItem : this.stickerItemList) {
            if (stickerItem.sticker.getModelType() == i) {
                stickerItem.setEffectTimeInfo(kqeVar);
            }
        }
    }

    public void setFilterTriggerManager(FilterTriggerManager filterTriggerManager) {
        this.filterTriggerManager = filterTriggerManager;
    }

    public void setHaniStickerParam(FaceDetectFilter.FaceDetectParam faceDetectParam, int i) {
        setHanniStickerParamInItemList(this.stickerItemList, faceDetectParam, i);
        List<List<StickerItem>> list = this.mPollTriggerStickerItemList;
        if (list == null || list.size() <= 0) {
            return;
        }
        Iterator<List<StickerItem>> it = this.mPollTriggerStickerItemList.iterator();
        while (it.hasNext()) {
            setHanniStickerParamInItemList(it.next(), faceDetectParam, i);
        }
    }

    public void setMMCVInfo(pjw pjwVar) {
        this.lastStickerTime = System.currentTimeMillis();
        if (!this.projectionInit && getWidth() > 0 && getHeight() > 0) {
            float width = getWidth() / getHeight();
            Matrix.orthoM(this.mProjectionMatrix, 0, -1.0f, 1.0f, (-1.0f) / width, 1.0f / width, 3.0f, 7.0f);
            this.projectionInit = true;
        }
        if (pjwVar.m169950n() <= 0) {
            updateFaceInfo(pjwVar, 0.0f, null, false);
            return;
        }
        int i = this.faceIndex;
        if (i != 0 && i < pjwVar.m169950n()) {
            updateFaceInfo(pjwVar, pjwVar.m169946j(this.faceIndex).m220015f(), pjwVar.m169946j(this.faceIndex).m220018l(), true);
            return;
        }
        for (int iM169950n = pjwVar.m169950n() - 1; iM169950n >= 0; iM169950n--) {
            updateFaceInfo(pjwVar, pjwVar.m169946j(iM169950n).m220015f(), pjwVar.m169946j(iM169950n).m220018l(), true);
        }
    }

    public void setMainFaceIndex(int i) {
        this.faceIndex = i;
    }

    public void setMmcvBoxes(MMCVBoxes mMCVBoxes) {
        List<List<StickerItem>> list;
        List<List<StickerItem>> list2;
        this.mmcvBoxes = mMCVBoxes;
        if (mMCVBoxes != null && this.mCurrentStickerItem == null && (list2 = this.mPollTriggerStickerItemList) != null && list2.size() > 0 && this.mmcvBoxes.getDetectResult()[0].class_name_.equals(this.mPollTriggerStickerItemList.get(0).get(0).sticker.getObjectTriggerType())) {
            this.mCurrentStickerItem = this.mPollTriggerStickerItemList.get(this.mIndex);
            this.mLastMmcvBoxIsEmpty = false;
            return;
        }
        if (mMCVBoxes == null || (list = this.mPollTriggerStickerItemList) == null || list.size() <= 0 || this.mmcvBoxes.getDetectResult().length <= 0 || !this.mmcvBoxes.getDetectResult()[0].class_name_.equals(this.mPollTriggerStickerItemList.get(0).get(0).sticker.getObjectTriggerType())) {
            if (this.mNoBoxCount == 3) {
                this.mLastMmcvBoxIsEmpty = true;
                this.mNoBoxCount = 0;
            }
            this.mNoBoxCount++;
            return;
        }
        if (this.mLastMmcvBoxIsEmpty) {
            int i = this.mIndex + 1;
            this.mIndex = i;
            List<List<StickerItem>> list3 = this.mPollTriggerStickerItemList;
            this.mCurrentStickerItem = list3.get(i % list3.size());
        }
        this.mLastMmcvBoxIsEmpty = false;
    }

    @Override // com.momo.mcamera.mask.StickerAdjustFilter.IOrderable
    public void setOrderedIndex(int i) {
        this.orderedIndex = i;
    }

    public void setPollGroupNumber(int i) {
        this.mPollTriggerStickerItemList = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            this.mPollTriggerStickerItemList.add(new ArrayList());
        }
    }

    public void setScaleHeightRatio(float f) {
        this.scaleHeightRatio = f;
    }

    public void setScaleWidthRatio(float f) {
        this.scaleWidthRatio = f;
    }

    public void setStickerFinishListener(StickerFinishListener stickerFinishListener) {
        this.finishListener = stickerFinishListener;
    }

    public void setTimeStamp(long j) {
        this.mCurrentTime = j;
        Iterator<StickerItem> it = this.stickerItemList.iterator();
        while (it.hasNext()) {
            it.next().setRenderTime(j);
        }
        List<List<StickerItem>> list = this.mPollTriggerStickerItemList;
        if (list == null || list.size() <= 0) {
            return;
        }
        Iterator<List<StickerItem>> it2 = this.mPollTriggerStickerItemList.iterator();
        while (it2.hasNext()) {
            Iterator<StickerItem> it3 = it2.next().iterator();
            while (it3.hasNext()) {
                it3.next().setRenderTime(j);
            }
        }
    }

    public void setUseETC1(boolean z) {
        int i = this.mETC1Handler;
        if (z) {
            GLES20.glUniform1f(i, 1.0f);
        } else {
            GLES20.glUniform1f(i, 0.0f);
        }
    }

    public void updateFaceInfo(pjw pjwVar, float f, float[] fArr, boolean z) {
        List<StickerItem> list;
        Iterator<StickerItem> it = this.stickerItemList.iterator();
        while (it.hasNext()) {
            MultiStickerMaskFilter multiStickerMaskFilter = this;
            pjw pjwVar2 = pjwVar;
            float f2 = f;
            float[] fArr2 = fArr;
            multiStickerMaskFilter.updateFaceInfoBySingleItem(pjwVar2, f2, fArr2, z, it.next());
            this = multiStickerMaskFilter;
            pjwVar = pjwVar2;
            f = f2;
            fArr = fArr2;
        }
        MultiStickerMaskFilter multiStickerMaskFilter2 = this;
        pjw pjwVar3 = pjwVar;
        float f3 = f;
        float[] fArr3 = fArr;
        if (multiStickerMaskFilter2.mPollTriggerStickerItemList == null || (list = multiStickerMaskFilter2.mCurrentStickerItem) == null) {
            return;
        }
        Iterator<StickerItem> it2 = list.iterator();
        while (it2.hasNext()) {
            multiStickerMaskFilter2.updateFaceInfoBySingleItem(pjwVar3, f3, fArr3, z, it2.next());
        }
    }

    public void addSticker(final StickerItem stickerItem) {
        if (stickerItem != null) {
            stickerItem.setProjectionMatrix(this.mProjectionMatrix);
            stickerItem.setFinishListener(new StickerBlendFilter.StickerMaskFinishListener() { // from class: com.momo.mcamera.mask.MultiStickerMaskFilter.1
                @Override // com.momo.mcamera.mask.StickerBlendFilter.StickerMaskFinishListener
                public void stickerRenderFinished() {
                    MultiStickerMaskFilter.this.removeStickerItem(stickerItem);
                    MultiStickerMaskFilter multiStickerMaskFilter = MultiStickerMaskFilter.this;
                    if (multiStickerMaskFilter.finishListener != null) {
                        int size = multiStickerMaskFilter.stickerItemList.size() - MultiStickerMaskFilter.this.stickerItemDestroyList.size();
                        StickerFinishListener stickerFinishListener = MultiStickerMaskFilter.this.finishListener;
                        if (size <= 0) {
                            size = 0;
                        }
                        stickerFinishListener.stickerRenderFinished(size, stickerItem.sticker);
                    }
                }
            });
            if (stickerItem.sticker.getPollTrigger()) {
                List<List<StickerItem>> list = this.mPollTriggerStickerItemList;
                if (list == null || list.size() <= 0) {
                    return;
                }
                this.mPollTriggerStickerItemList.get(stickerItem.sticker.getGroupNum()).add(stickerItem);
                return;
            }
            this.stickerItemList.add(stickerItem);
        }
    }
}
