package com.momo.mcamera.mask;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.MediaPlayer;
import android.media.SoundPool;
import android.text.TextUtils;
import android.view.MotionEvent;
import androidx.room.RoomDatabase;
import com.core.glcore.datadot.DataDotUtils;
import com.core.glcore.p023cv.MMCVBoxes;
import com.core.glcore.util.BodyLandHelper;
import com.core.glcore.util.FacerigHelper;
import com.core.glcore.util.HandSegmentHelper;
import com.core.glcore.util.SegmentHelper;
import com.core.glcore.util.TietieHeartHelper;
import com.cosmos.mdlog.MDLog;
import com.momo.mcamera.filtermanager.MMPresetFilterStore;
import com.momo.mcamera.mask.bean.AbsolutePosition;
import com.momo.mcamera.mask.bean.EffectFilterItem;
import com.momo.mcamera.mask.bean.ObjectRegion;
import com.momo.mcamera.mask.bean.ViewPortProportion;
import com.momo.mcamera.mask.delegate.GameScoreListener;
import com.momo.mcamera.mask.detect.IDetectManager;
import com.momo.mcamera.mask.express.ExpressDetector;
import com.momo.mcamera.mask.gesture.CVDetector;
import com.momo.mcamera.mask.gesture.GestureDetector;
import com.momo.mcamera.mask.gesture.NewHandGestureDetector;
import com.momo.mcamera.mask.videomix.IVideoTimeoutListener;
import com.momo.mcamera.mask.videomix.VideoMergeGroupFilter;
import com.momo.mcamera.util.MDLogTag;
import com.momo.mcamera.util.PointHelper;
import com.momocv.MMBox;
import com.momocv.MMRect;
import com.momocv.express.ExpressInfo;
import com.sina.weibo.sdk.constant.WBConstants;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p149l.ccj;
import p149l.cnw;
import p149l.e3w;
import p149l.fhc0;
import p149l.fpx;
import p149l.kqe;
import p149l.mcj;
import p149l.pjw;
import p149l.q7m;
import p149l.ts2;
import p149l.vif0;
import p149l.yhf0;
import p149l.zsf;

/* JADX INFO: loaded from: classes7.dex */
public class StickerAdjustFilter extends StickerGroupFilter implements q7m, e3w, IDetectManager.IGestureDetectListener, IDetectManager.IObjectDetectListener, IDetectManager.IExpressDetectListener {
    private static final long DEFAULT_DURATION = 30000000;
    public static final long DEFAULT_LONG_DURATION = 99999999999L;
    private static final int EFFECT_GROUP_ORDERED_INDEX = 1000;
    private static final int MULTI_STICKER_ORDERED_INDEX = 800;
    public static final int POINTS_LENGTH = 68;
    private static final int SOUND_PULL_SIZE = 5;
    private boolean enableSoundPool;
    private ExpressDetector expressDetector;
    private List<Face3DMaskFilter> face3DMaskFilters;
    private List<ccj> filtersToDestroy;
    private StickerMaskFinishListener finishListener;
    private GestureDetectedListener gestureDetectedListener;
    private CVDetector gestureDetector;
    private CVDetector.GestureDetectorListener gestureDetectorListener;
    private float mBigEye;
    private Context mContext;
    private pjw mCurCVInfo;
    EffectGroupFilter mEffectGroupFilter;
    private FaceMaskFilter mFaceMaskFilter;
    private StickerGestureTrackingFilter mGestureTrackingFilter;
    ConcurrentHashMap<String, MaskModel> mGestureTriggerModels;
    private MultiStickerMaskFilter mMultiStickerMaskFilter;
    private NormalFilter mNormalFilter;
    LinkedList<IOrderable> mOrderFilterList;
    public SoundInputFilter mSoundInput;
    ConcurrentHashMap<String, StickerBlendFilter> mStickerFilterMap;
    private List<Sticker> mSwapFacialMaskSticker;
    private ts2 mTerminalFilter;
    private float mThinFace;
    private MMCVBoxes mmcvBoxes;
    private MMRect mmcvRect;
    private cnw playStatusListener;
    private MediaPlayer soundPlayer;
    private SoundPool soundPool;
    private StickerBlendFilter.StickerStateChangeListener stickerStateChangeListener;
    private VideoMergeGroupFilter videoMergeGroupFilter;
    private final String TAG = "StickerAdjustFilter";
    public boolean enableSelfRender = false;
    int lastFacesCnt = 0;
    PointF lastFacePosition = new PointF(0.0f, 0.0f);
    private ArrayList<Integer> soundIds = new ArrayList<>();
    private boolean isCameraFront = false;
    private long startTime = 0;
    private long time = System.currentTimeMillis();
    private int scaleWidth = 0;
    private int scaleHeight = 0;
    private float scaleWidthRatio = 1.0f;
    private float scaleHeightRatio = 1.0f;
    private int groupNumber = 0;
    private boolean useBlendFilter = false;
    private boolean hasExpressionModel = false;
    private boolean isplayStatusTriggered = false;
    private boolean multiSwitchEnable = false;
    private int mCount = 0;
    private Mask mDistorationMask = null;
    private BeautyFace mBeautyFace = null;
    private boolean mFaceBeauty = false;
    private boolean mFaceStateChange = false;
    private float mFaceThinValue = 0.0f;
    private float mBigEyeValue = 0.0f;
    private boolean mFaceBeautyHaveFinish = false;
    private int mPollGroupNum = 0;
    private long mLastRenderTime = 0;
    private yhf0 mLookupFilter = null;
    private Map<Integer, SoundPoolInfo> soundInfoMap = new HashMap();
    private FilterTriggerManager filterTriggerManager = new FilterTriggerManager();

    public interface GestureDetectedListener {
        void gestureDetected(String str);

        void onPreGestureAdded(String str);
    }

    public interface IOrderable {
        int getOrderedIndex();

        void setOrderedIndex(int i);
    }

    public class SoundPoolInfo {
        boolean isLoaded = false;
        Runnable runnable = null;
        int soundId = 0;

        public SoundPoolInfo() {
        }
    }

    public interface StickerMaskFinishListener {
        void stickerRenderFinished(int i, Sticker sticker);
    }

    public StickerAdjustFilter(Context context) {
        this.mContext = context;
        NormalFilter normalFilter = new NormalFilter();
        this.mNormalFilter = normalFilter;
        normalFilter.addTarget(this);
        this.mStickerFilterMap = new ConcurrentHashMap<>();
        this.mOrderFilterList = new LinkedList<>();
        this.mGestureTriggerModels = new ConcurrentHashMap<>();
        registerInitialFilter(this.mNormalFilter);
        registerTerminalFilter(this.mNormalFilter);
        this.mTerminalFilter = this.mNormalFilter;
        this.filtersToDestroy = new ArrayList();
        this.soundPool = new SoundPool(5, 3, 5);
    }

    private void addCommonModel(MaskModel maskModel) {
        if (maskModel.getAdditionalInfo() != null && maskModel.getAdditionalInfo().isComic()) {
            List<Sticker> stickers = maskModel.getStickers();
            ArrayList arrayList = new ArrayList();
            Iterator<Sticker> it = stickers.iterator();
            while (it.hasNext()) {
                Sticker next = it.next();
                if ("FACE_MASK_TYPE".equals(next.getStickerType())) {
                    arrayList.add(next);
                    it.remove();
                }
            }
            stickers.addAll(arrayList);
            maskModel.setStickers(stickers);
        }
        this.mPollGroupNum = maskModel.getPollGroupNum();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (Sticker sticker : maskModel.getStickers()) {
            if (!Sticker.RESOURCE_TYPE_AUDIO_VISUALIZER.equals(sticker.getResourceType())) {
                if (!TextUtils.isEmpty(sticker.getStickerType()) && sticker.getStickerType().equals("FACE_MASK_TYPE")) {
                    sticker.setStickerType("FACE_MASK_TYPE");
                } else if (!TextUtils.isEmpty(sticker.getStickerType()) && sticker.getStickerType().equals("FACE_LOOK_UP_TYPE")) {
                    sticker.setStickerType("FACE_LOOK_UP_TYPE");
                } else if (!TextUtils.isEmpty(sticker.getStickerType()) && sticker.getStickerType().equals("STICKER_TYPE_VOICE")) {
                    sticker.setStickerType("STICKER_TYPE_VOICE");
                } else if (TextUtils.isEmpty(sticker.getStickerType())) {
                    sticker.setStickerType(maskModel.getModelType() + "_" + i3);
                }
                sticker.setModelType(maskModel.getModelType());
                sticker.setFrameRate(maskModel.getFrameRate());
                if (sticker.getDuration() == 0) {
                    sticker.setDuration(maskModel.getDuration() > 0 ? maskModel.getDuration() : DEFAULT_LONG_DURATION);
                }
                if ("3d".equals(sticker.getLayerType())) {
                    this.useBlendFilter = true;
                    sticker.setXengineEsPath(maskModel.getXengineEsPath());
                }
                if (sticker.isClearsBodyArea()) {
                    this.useBlendFilter = true;
                    i++;
                }
                if (isBlendSticker(sticker)) {
                    this.useBlendFilter = true;
                }
                if (!TextUtils.isEmpty(sticker.getSound())) {
                    i2++;
                }
                addSticker(sticker);
                i3++;
            }
        }
        if (i > 0) {
            SegmentHelper.setSegmentCount(i);
        }
        if (!TextUtils.isEmpty(maskModel.getSound())) {
            i2++;
        }
        if (this.enableSoundPool) {
            tryLoadSound(maskModel, i2);
        }
    }

    private void addEffectProcessFilter(MaskModel maskModel) {
        if (this.mEffectGroupFilter == null) {
            EffectGroupFilter effectGroupFilter = new EffectGroupFilter();
            this.mEffectGroupFilter = effectGroupFilter;
            effectGroupFilter.setOrderedIndex(1000);
            this.mEffectGroupFilter.setRenderFinishListener(new EffectGroupFilter.EffectRenderFinishListener() { // from class: com.momo.mcamera.mask.StickerAdjustFilter.5
                @Override // com.momo.mcamera.mask.EffectGroupFilter.EffectRenderFinishListener
                public void onRenderFinish() {
                    StickerAdjustFilter stickerAdjustFilter = StickerAdjustFilter.this;
                    stickerAdjustFilter.removeEffectFilter(stickerAdjustFilter.mEffectGroupFilter);
                    StickerAdjustFilter.this.filtersToDestroy.add(StickerAdjustFilter.this.mEffectGroupFilter);
                    StickerAdjustFilter.this.mEffectGroupFilter = null;
                }
            });
            addOrderableTerminalFilter(this.mEffectGroupFilter);
        }
        for (EffectFilterItem effectFilterItem : maskModel.getEffectList()) {
            effectFilterItem.setModelType(maskModel.getModelType());
            if (effectFilterItem.getDuration() == 0) {
                effectFilterItem.setDuration(maskModel.getDuration());
            }
            this.mEffectGroupFilter.addEffectFilterItem(effectFilterItem);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <T extends ts2 & IOrderable> void addOrderableTerminalFilter(T t) {
        if (t == null) {
            return;
        }
        if (this.mOrderFilterList.size() <= 0) {
            addTerminalFilter(t);
            this.mOrderFilterList.add(t);
            return;
        }
        int orderedIndex = t.getOrderedIndex();
        int size = this.mOrderFilterList.size() - 1;
        for (int i = size; i >= 0; i--) {
            IOrderable iOrderable = this.mOrderFilterList.get(i);
            if (iOrderable.getOrderedIndex() <= orderedIndex) {
                if (i < size) {
                    int i2 = i + 1;
                    if (this.mOrderFilterList.get(i2) != null) {
                        insertSpecifiedPosition((ts2) this.mOrderFilterList.get(i2), t);
                        this.mOrderFilterList.add(i2, t);
                        return;
                    }
                }
                addTerminalFilter(t);
                this.mOrderFilterList.addLast(t);
                return;
            }
            if (i == 0) {
                insertSpecifiedPosition((ts2) iOrderable, t);
                this.mOrderFilterList.addFirst(t);
                return;
            }
        }
    }

    private void addTerminalFilter(ts2 ts2Var) {
        this.mTerminalFilter.removeTarget(this);
        this.mTerminalFilter.addTarget(ts2Var);
        ts2 ts2Var2 = this.mTerminalFilter;
        ts2Var.parentFilter = ts2Var2;
        removeTerminalFilter(ts2Var2);
        registerFilter(this.mTerminalFilter);
        this.mTerminalFilter = ts2Var;
        ts2Var.addTarget(this);
        registerTerminalFilter(this.mTerminalFilter);
    }

    private void addTerminalMultiStickerFilter(ts2 ts2Var) {
        ts2 ts2Var2 = this.mTerminalFilter;
        if (ts2Var2 == this.mEffectGroupFilter) {
            insertSpecifiedPosition(ts2Var2, ts2Var);
        } else {
            addTerminalFilter(ts2Var);
        }
    }

    private int calculateFaceIndex(pjw pjwVar) {
        int iM169950n = pjwVar.m169950n();
        if (iM169950n == 1) {
            return 0;
        }
        boolean z = (pjwVar.f149895b / 90) % 2 == 0;
        float f = 10000.0f;
        if (iM169950n >= this.lastFacesCnt) {
            int i = 0;
            for (int i2 = 0; i2 < iM169950n; i2++) {
                float[] fArrM220018l = pjwVar.m169946j(i2).m220018l();
                float f2 = (float) PointHelper.getmDistancePoint(new PointF(fArrM220018l[0], fArrM220018l[68]), this.lastFacePosition);
                if (f2 < f) {
                    i = i2;
                    f = f2;
                }
            }
            return i;
        }
        float[] fArrM220018l2 = pjwVar.m169946j(0).m220018l();
        float f3 = z ? fArrM220018l2[68] : fArrM220018l2[0];
        int i3 = 0;
        int i4 = -1;
        for (int i5 = 0; i5 < iM169950n; i5++) {
            float[] fArrM220018l3 = pjwVar.m169946j(i5).m220018l();
            if ((!z && fArrM220018l3[0] < f3) || (z && fArrM220018l3[68] < f3)) {
                f3 = z ? fArrM220018l3[68] : fArrM220018l3[0];
                i3 = i5;
            }
            if ((z || fArrM220018l3[0] > this.lastFacePosition.x) && (!z || fArrM220018l3[68] >= this.lastFacePosition.y)) {
                float f4 = (float) PointHelper.getmDistancePoint(new PointF(fArrM220018l3[0], fArrM220018l3[68]), this.lastFacePosition);
                if (f4 < f) {
                    i4 = i5;
                    f = f4;
                }
            }
        }
        return i4 != -1 ? i4 : i3;
    }

    private synchronized void clearAllSoundPoolInfo() {
        MDLog.m7389d("media", "[SoundPool]clear all soundInfo ");
        this.soundInfoMap.clear();
    }

    private StickerBlendFilter createStickerBlendFilter(final Sticker sticker, ts2 ts2Var) {
        StickerBlendFilter stickerBlendFilter = new StickerBlendFilter(ts2Var, sticker);
        stickerBlendFilter.setSegmentBody(sticker.isClearsBodyArea());
        stickerBlendFilter.setSegmentStrokeColor(sticker.getStrokeColor());
        stickerBlendFilter.setSegmentStrokeRadius(sticker.getStrokeRadius());
        stickerBlendFilter.stickerStateChangeListener = new StickerBlendFilter.StickerStateChangeListener() { // from class: com.momo.mcamera.mask.StickerAdjustFilter.9
            @Override // com.momo.mcamera.mask.StickerBlendFilter.StickerStateChangeListener
            public void distortionStateChanged(boolean z, float f, float f2, float f3, float f4) {
            }

            @Override // com.momo.mcamera.mask.StickerBlendFilter.StickerStateChangeListener
            public void faceDetected(boolean z) {
                if (StickerAdjustFilter.this.stickerStateChangeListener != null) {
                    StickerAdjustFilter.this.stickerStateChangeListener.faceDetected(z);
                }
            }

            @Override // com.momo.mcamera.mask.StickerBlendFilter.StickerStateChangeListener
            public void playStateChanged(final int i, boolean z) {
                if (StickerAdjustFilter.this.soundPool != null) {
                    if (z) {
                        StickerAdjustFilter.this.setRunableCalledWhenLoaded(i, new Runnable() { // from class: com.momo.mcamera.mask.StickerAdjustFilter.9.1
                            @Override // java.lang.Runnable
                            public void run() {
                                MDLog.m7389d("media", "[SoundPool] Start play sounds !");
                                sticker.setPlayingSoundId(StickerAdjustFilter.this.soundPool.play(i, 1.0f, 1.0f, 0, sticker.isLoopSound() ? -1 : 0, 1.0f));
                            }
                        });
                    } else if (sticker.getPlayingSoundId() > 0) {
                        StickerAdjustFilter.this.soundPool.pause(sticker.getPlayingSoundId());
                    }
                }
                if (StickerAdjustFilter.this.stickerStateChangeListener != null) {
                    StickerAdjustFilter.this.stickerStateChangeListener.playStateChanged(i, z);
                }
            }

            @Override // com.momo.mcamera.mask.StickerBlendFilter.StickerStateChangeListener
            public void stickerGestureTypeChanged(String str, boolean z) {
                if (StickerAdjustFilter.this.stickerStateChangeListener != null) {
                    StickerAdjustFilter.this.stickerStateChangeListener.stickerGestureTypeChanged(str, z);
                }
            }

            @Override // com.momo.mcamera.mask.StickerBlendFilter.StickerStateChangeListener
            public void stickerStateChanged(int i, int i2) {
                StickerAdjustFilter.this.updateplayStatus(sticker, i, i2);
                if (StickerAdjustFilter.this.stickerStateChangeListener != null) {
                    StickerAdjustFilter.this.stickerStateChangeListener.stickerStateChanged(i, i2);
                }
            }
        };
        return stickerBlendFilter;
    }

    private void drawAbsPostionAdjustResolution(StickerBlendFilter stickerBlendFilter, FaceDetectFilter.FaceDetectParam faceDetectParam) {
        float imageWidth = (stickerBlendFilter.sticker.getImageWidth() / (getWidth() / 2.0f)) * (((float) getWidth()) > 480.0f ? getWidth() / 352.0f : 1.0f);
        AbsolutePosition absolutePos = stickerBlendFilter.sticker.getAbsolutePos();
        if (absolutePos == null || absolutePos.getCenter() == null) {
            faceDetectParam.centerPoint = new PointF(0.5f, 0.5f);
        } else {
            faceDetectParam.centerPoint = new PointF(absolutePos.getCenter().f14252x, absolutePos.getCenter().f14253y);
        }
        faceDetectParam.scaleW = imageWidth;
        faceDetectParam.scaleH = imageWidth;
        faceDetectParam.angle = 0.0f;
        faceDetectParam.filterTrigerManager = this.filterTriggerManager;
        stickerBlendFilter.setDetectParam(faceDetectParam);
    }

    private void drawAbsolutePostion(StickerBlendFilter stickerBlendFilter, FaceDetectFilter.FaceDetectParam faceDetectParam) {
        AbsolutePosition absolutePos = stickerBlendFilter.sticker.getAbsolutePos();
        float imageWidth = (stickerBlendFilter.sticker.getImageWidth() * getAdjustHeightScale()) / (getWidth() / 2.0f);
        if (absolutePos == null || absolutePos.getCenter() == null) {
            faceDetectParam.centerPoint = new PointF(0.5f, 0.5f);
        } else {
            faceDetectParam.centerPoint = new PointF((getWidth() * absolutePos.getCenter().f14252x) / getWidth(), (getHeight() * absolutePos.getCenter().f14253y) / getHeight());
        }
        faceDetectParam.scaleW = imageWidth;
        faceDetectParam.scaleH = imageWidth;
        faceDetectParam.angle = 0.0f;
        faceDetectParam.filterTrigerManager = this.filterTriggerManager;
        stickerBlendFilter.setDetectParam(faceDetectParam);
    }

    private void drawAbsolutePostionUseStcikerDim(StickerBlendFilter stickerBlendFilter, FaceDetectFilter.FaceDetectParam faceDetectParam) {
        AbsolutePosition absolutePos = stickerBlendFilter.sticker.getAbsolutePos();
        float imageWidth = (stickerBlendFilter.sticker.getImageWidth() * ((getHeight() * 1.0f) / stickerBlendFilter.sticker.getBaseDemensionHeight())) / (getWidth() / 2.0f);
        if (absolutePos == null || absolutePos.getCenter() == null) {
            faceDetectParam.centerPoint = new PointF(0.5f, 0.5f);
        } else {
            faceDetectParam.centerPoint = new PointF((getWidth() * absolutePos.getCenter().f14252x) / getWidth(), (getHeight() * absolutePos.getCenter().f14253y) / getHeight());
        }
        faceDetectParam.scaleW = imageWidth;
        faceDetectParam.scaleH = imageWidth;
        faceDetectParam.angle = 0.0f;
        faceDetectParam.filterTrigerManager = this.filterTriggerManager;
        stickerBlendFilter.setDetectParam(faceDetectParam);
    }

    private void drawFixedSticker(StickerBlendFilter stickerBlendFilter, FaceDetectFilter.FaceDetectParam faceDetectParam) {
        Sticker sticker = stickerBlendFilter.sticker;
        PointF pointF = new PointF((getWidth() / 2.0f) / getWidth(), (sticker.isShowTop() ? (sticker.getImageHeight() * getAdjustHeightScale()) / 2.0f : getHeight() - ((sticker.getImageHeight() * getAdjustHeightScale()) / 2.0f)) / getHeight());
        float imageWidth = (sticker.getImageWidth() * getAdjustHeightScale()) / (getWidth() / 2.0f);
        faceDetectParam.scaleW = imageWidth;
        faceDetectParam.scaleH = imageWidth;
        faceDetectParam.centerPoint = pointF;
        faceDetectParam.angle = 0.0f;
        faceDetectParam.filterTrigerManager = this.filterTriggerManager;
        stickerBlendFilter.setDetectParam(faceDetectParam);
    }

    private void drawFullScreenFixed(StickerBlendFilter stickerBlendFilter, FaceDetectFilter.FaceDetectParam faceDetectParam) {
        float f = 2.0f;
        PointF pointF = new PointF((getWidth() / 2.0f) / getWidth(), (((getHeight() - (stickerBlendFilter.sticker.getImageHeight() * getAdjustHeightScale())) / 2.0f) + ((stickerBlendFilter.sticker.getImageHeight() * getAdjustHeightScale()) / 2.0f)) / getHeight());
        if (stickerBlendFilter.sticker.getImageWidth() <= 360 && getWidth() != 720) {
            f = 1.5f;
        }
        float f2 = f;
        faceDetectParam.scaleW = f;
        faceDetectParam.scaleH = f2;
        faceDetectParam.centerPoint = pointF;
        faceDetectParam.angle = 0.0f;
        faceDetectParam.filterTrigerManager = this.filterTriggerManager;
        stickerBlendFilter.setDetectParam(faceDetectParam);
    }

    private void drawGestureFilter(StickerBlendFilter stickerBlendFilter, FaceDetectFilter.FaceDetectParam faceDetectParam) {
        if (stickerBlendFilter.sticker.isDonotTrack()) {
            drawGestureFixedFilter(stickerBlendFilter, faceDetectParam);
        } else {
            drawGestureTrackingFilter(stickerBlendFilter, faceDetectParam);
        }
    }

    private void drawGestureFixedFilter(StickerBlendFilter stickerBlendFilter, FaceDetectFilter.FaceDetectParam faceDetectParam) {
        if (stickerBlendFilter.sticker.getObjectTriggerType() == null) {
            return;
        }
        MMCVBoxes mMCVBoxes = this.mmcvBoxes;
        if (mMCVBoxes == null || mMCVBoxes.getDetectResult() == null || this.mmcvBoxes.getDetectResult().length == 0) {
            faceDetectParam.filterTrigerManager = this.filterTriggerManager;
            faceDetectParam.centerPoint = new PointF(0.0f, 0.0f);
            stickerBlendFilter.setDetectParam(faceDetectParam);
            return;
        }
        faceDetectParam.triggerType = stickerBlendFilter.sticker.getObjectTriggerType();
        for (MMBox mMBox : this.mmcvBoxes.getDetectResult()) {
            if (mMBox.class_index_ > 0 && !TextUtils.isEmpty(mMBox.class_name_) && mMBox.class_name_.equals(faceDetectParam.triggerType)) {
                int i = mMBox.f14764x_;
                int i2 = mMBox.f14765y_;
                faceDetectParam.gestureRect = new RectF(i, i2, i + mMBox.width_, i2 + mMBox.height_);
                faceDetectParam.filterTrigerManager = this.filterTriggerManager;
                faceDetectParam.centerPoint = new PointF(0.0f, 0.0f);
                stickerBlendFilter.setDetectParam(faceDetectParam);
            }
        }
    }

    private void drawGestureTrackingFilter(StickerBlendFilter stickerBlendFilter, FaceDetectFilter.FaceDetectParam faceDetectParam) {
        StickerGestureTrackingFilter stickerGestureTrackingFilter = this.mGestureTrackingFilter;
        if ((stickerGestureTrackingFilter == null || !stickerGestureTrackingFilter.isTrackingInit()) && stickerBlendFilter.sticker.getObjectTriggerType() != null) {
            MMCVBoxes mMCVBoxes = this.mmcvBoxes;
            if (mMCVBoxes == null || mMCVBoxes.getDetectResult() == null || this.mmcvBoxes.getDetectResult().length == 0) {
                faceDetectParam.filterTrigerManager = this.filterTriggerManager;
                faceDetectParam.centerPoint = new PointF(0.0f, 0.0f);
                stickerBlendFilter.setDetectParam(faceDetectParam);
                return;
            }
            faceDetectParam.triggerType = stickerBlendFilter.sticker.getObjectTriggerType();
            for (MMBox mMBox : this.mmcvBoxes.getDetectResult()) {
                if (mMBox.class_index_ > 0 && !TextUtils.isEmpty(mMBox.class_name_) && mMBox.class_name_.equals(faceDetectParam.triggerType)) {
                    int i = mMBox.f14764x_;
                    int i2 = mMBox.f14765y_;
                    RectF rectF = new RectF(i, i2, i + mMBox.width_, i2 + mMBox.height_);
                    faceDetectParam.gestureRect = rectF;
                    this.mmcvRect = new MMRect();
                    if (stickerBlendFilter.sticker.getTrackingRegion() != null) {
                        ObjectRegion trackingRegion = stickerBlendFilter.sticker.getTrackingRegion();
                        RectF rectF2 = new RectF(rectF);
                        this.mmcvRect.f14764x_ = (int) (rectF2.left + (rectF2.width() * trackingRegion.f14252x));
                        this.mmcvRect.f14765y_ = (int) (rectF2.top + (rectF2.height() * trackingRegion.f14253y));
                        MMRect mMRect = this.mmcvRect;
                        mMRect.width_ = (int) (mMRect.f14764x_ + (rectF2.width() * trackingRegion.f14251w));
                        MMRect mMRect2 = this.mmcvRect;
                        mMRect2.height_ = (int) (mMRect2.f14765y_ + (rectF2.height() * trackingRegion.f14250h));
                    } else {
                        MMRect mMRect3 = this.mmcvRect;
                        float f = rectF.left;
                        mMRect3.f14764x_ = (int) f;
                        float f2 = rectF.top;
                        mMRect3.f14765y_ = (int) f2;
                        mMRect3.width_ = (int) (rectF.right - f);
                        mMRect3.height_ = (int) (rectF.bottom - f2);
                    }
                    StickerGestureTrackingFilter stickerGestureTrackingFilter2 = this.mGestureTrackingFilter;
                    if (stickerGestureTrackingFilter2 != null) {
                        stickerGestureTrackingFilter2.setMMCVRect(this.mmcvRect);
                    }
                    faceDetectParam.filterTrigerManager = this.filterTriggerManager;
                    faceDetectParam.centerPoint = new PointF(0.0f, 0.0f);
                    stickerBlendFilter.setDetectParam(faceDetectParam);
                    StickerGestureTrackingFilter stickerGestureTrackingFilter3 = this.mGestureTrackingFilter;
                    if (stickerGestureTrackingFilter3 != null) {
                        stickerGestureTrackingFilter3.startTracking();
                    }
                }
            }
        }
    }

    private void drawPositionSetFixed(StickerBlendFilter stickerBlendFilter, FaceDetectFilter.FaceDetectParam faceDetectParam) {
        float imageWidth = stickerBlendFilter.sticker.getImageWidth() / (getWidth() / 2.0f);
        faceDetectParam.scaleH = (getHeight() / stickerBlendFilter.sticker.getImageHeight()) * imageWidth;
        faceDetectParam.scaleW = (getWidth() / stickerBlendFilter.sticker.getImageWidth()) * imageWidth;
        faceDetectParam.centerPoint = new PointF(0.5f, 0.5f);
        faceDetectParam.angle = 0.0f;
        faceDetectParam.filterTrigerManager = this.filterTriggerManager;
        stickerBlendFilter.setDetectParam(faceDetectParam);
    }

    private void drawScaleCenterCrop(StickerBlendFilter stickerBlendFilter, FaceDetectFilter.FaceDetectParam faceDetectParam) {
        float imageWidth = stickerBlendFilter.sticker.getImageWidth();
        float imageHeight = stickerBlendFilter.sticker.getImageHeight();
        float height = (((float) getHeight()) * imageWidth > ((float) getWidth()) * imageHeight ? getHeight() / imageHeight : getWidth() / imageWidth) * 2.0f;
        faceDetectParam.scaleW = height;
        faceDetectParam.scaleH = height;
        faceDetectParam.centerPoint = new PointF(0.5f, 0.5f);
        faceDetectParam.angle = 0.0f;
        faceDetectParam.filterTrigerManager = this.filterTriggerManager;
        stickerBlendFilter.setDetectParam(faceDetectParam);
    }

    private void drawTrackerSticker(StickerBlendFilter stickerBlendFilter, FaceDetectFilter.FaceDetectParam faceDetectParam) {
        stickerBlendFilter.setDetectParam(faceDetectParam);
    }

    private void insertSpecifiedPosition(ts2 ts2Var, ts2 ts2Var2) {
        ts2 ts2Var3 = ts2Var.parentFilter;
        ts2Var3.removeTarget(ts2Var);
        ts2Var3.addTarget(ts2Var2);
        registerFilter(ts2Var2);
        ts2Var2.parentFilter = ts2Var3;
        ts2Var.parentFilter = ts2Var2;
        ts2Var2.addTarget(ts2Var);
    }

    private boolean isBitmapValid(Bitmap bitmap) {
        return (bitmap == null || bitmap.isRecycled()) ? false : true;
    }

    private boolean isBlendSticker(Sticker sticker) {
        return (sticker.getBlendMode() == null || TextUtils.isEmpty(sticker.getBlendMode().name)) ? false : true;
    }

    private void multiStickerFilterAddListener(final Sticker sticker) {
        this.mMultiStickerMaskFilter.addSticker(sticker, new StickerBlendFilter.StickerStateChangeListener() { // from class: com.momo.mcamera.mask.StickerAdjustFilter.10
            @Override // com.momo.mcamera.mask.StickerBlendFilter.StickerStateChangeListener
            public void distortionStateChanged(boolean z, float f, float f2, float f3, float f4) {
            }

            @Override // com.momo.mcamera.mask.StickerBlendFilter.StickerStateChangeListener
            public void faceDetected(boolean z) {
                if (StickerAdjustFilter.this.stickerStateChangeListener != null) {
                    StickerAdjustFilter.this.stickerStateChangeListener.faceDetected(z);
                }
            }

            @Override // com.momo.mcamera.mask.StickerBlendFilter.StickerStateChangeListener
            public void playStateChanged(final int i, boolean z) {
                if (StickerAdjustFilter.this.soundPool != null) {
                    if (z) {
                        StickerAdjustFilter.this.setRunableCalledWhenLoaded(i, new Runnable() { // from class: com.momo.mcamera.mask.StickerAdjustFilter.10.1
                            @Override // java.lang.Runnable
                            public void run() {
                                MDLog.m7389d("media", "[SoundPool] Start play sounds !");
                                sticker.setPlayingSoundId(StickerAdjustFilter.this.soundPool.play(i, 1.0f, 1.0f, 0, sticker.isLoopSound() ? -1 : 0, 1.0f));
                            }
                        });
                    } else if (sticker.getPlayingSoundId() > 0) {
                        StickerAdjustFilter.this.soundPool.pause(sticker.getPlayingSoundId());
                    }
                }
                StickerAdjustFilter.this.stickerStateChangeListener.playStateChanged(i, z);
            }

            @Override // com.momo.mcamera.mask.StickerBlendFilter.StickerStateChangeListener
            public void stickerGestureTypeChanged(String str, boolean z) {
                if (StickerAdjustFilter.this.stickerStateChangeListener != null) {
                    StickerAdjustFilter.this.stickerStateChangeListener.stickerGestureTypeChanged(str, z);
                }
            }

            @Override // com.momo.mcamera.mask.StickerBlendFilter.StickerStateChangeListener
            public void stickerStateChanged(int i, int i2) {
                StickerAdjustFilter.this.updateplayStatus(sticker, i, i2);
                if (StickerAdjustFilter.this.stickerStateChangeListener != null) {
                    StickerAdjustFilter.this.stickerStateChangeListener.stickerStateChanged(i, i2);
                }
            }
        });
        this.mMultiStickerMaskFilter.setStickerFinishListener(new MultiStickerMaskFilter.StickerFinishListener() { // from class: com.momo.mcamera.mask.StickerAdjustFilter.11
            @Override // com.momo.mcamera.mask.MultiStickerMaskFilter.StickerFinishListener
            public void stickerRenderFinished(int i, Sticker sticker2) {
                if (StickerAdjustFilter.this.finishListener != null) {
                    StickerAdjustFilter.this.finishListener.stickerRenderFinished(i + StickerAdjustFilter.this.mStickerFilterMap.size() + Math.round(StickerAdjustFilter.this.mBigEye) + Math.round(StickerAdjustFilter.this.mThinFace), sticker2);
                }
            }
        });
    }

    private void processDistortionState() {
        MMCVBoxes mMCVBoxes;
        if (this.mDistorationMask != null) {
            if (!this.mFaceStateChange && (mMCVBoxes = this.mmcvBoxes) != null) {
                for (MMBox mMBox : mMCVBoxes.getDetectResult()) {
                    if (mMBox.class_name_.equals(this.mDistorationMask.getHidingObjectTriggerType())) {
                        this.mFaceStateChange = true;
                    }
                }
            }
            if (this.mFaceStateChange) {
                if (this.mDistorationMask.getStrengthStep() == 0.0f && this.mDistorationMask.getStrengthStepB() == 0.0f) {
                    this.mFaceBeauty = true;
                } else if (!this.mFaceBeauty) {
                    float f = this.mFaceThinValue;
                    if (f > 0.0f) {
                        this.mFaceThinValue = f - this.mDistorationMask.getStrengthStep();
                    }
                    float f2 = this.mBigEyeValue;
                    if (f2 > 0.0f) {
                        this.mBigEyeValue = f2 - this.mDistorationMask.getStrengthStepB();
                    }
                    if (this.mFaceThinValue <= 0.0f && this.mBigEyeValue <= 0.0f) {
                        this.mFaceBeauty = true;
                    }
                }
                if (!this.mFaceBeauty || this.mFaceBeautyHaveFinish) {
                    this.stickerStateChangeListener.distortionStateChanged(false, this.mFaceThinValue, this.mBigEyeValue, 0.0f, 0.0f);
                    return;
                }
                if (this.mDistorationMask.getStrengthStep() == 0.0f) {
                    this.mFaceThinValue = this.mBeautyFace.getThinFaceValue();
                } else {
                    this.mFaceThinValue += this.mDistorationMask.getStrengthStep();
                }
                if (this.mDistorationMask.getStrengthStepB() == 0.0f) {
                    this.mBigEyeValue = this.mBeautyFace.getBigEyeValue();
                } else {
                    this.mBigEyeValue += this.mDistorationMask.getStrengthStepB();
                }
                if (this.mFaceThinValue < this.mBeautyFace.getThinFaceValue() || this.mBigEyeValue < this.mBeautyFace.getBigEyeValue()) {
                    this.stickerStateChangeListener.distortionStateChanged(true, this.mFaceThinValue, this.mBigEyeValue, this.mBeautyFace.getSkinSmoothingValue(), this.mBeautyFace.getSkinWhitenValue());
                } else {
                    this.stickerStateChangeListener.distortionStateChanged(true, this.mBeautyFace.getThinFaceValue(), this.mBeautyFace.getBigEyeValue(), this.mBeautyFace.getSkinSmoothingValue(), this.mBeautyFace.getSkinWhitenValue());
                    this.mFaceBeautyHaveFinish = true;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void removeEffectFilter(ts2 ts2Var) {
        this.mOrderFilterList.remove(ts2Var);
        ts2 ts2Var2 = ts2Var.parentFilter;
        ts2Var2.removeTarget(ts2Var);
        if (this.mTerminalFilter == ts2Var) {
            removeTerminalFilter(ts2Var);
            registerTerminalFilter(ts2Var2);
            ts2Var2.addTarget(this);
            this.mTerminalFilter = ts2Var2;
            return;
        }
        removeFilter(ts2Var);
        ts2 ts2Var3 = (ts2) ts2Var.getTargets().get(0);
        ts2Var.removeTarget(ts2Var3);
        ts2Var3.parentFilter = ts2Var2;
        ts2Var2.addTarget(ts2Var3);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void removeStickerBlendFilter(StickerBlendFilter stickerBlendFilter) {
        ts2 ts2Var = stickerBlendFilter.parentFilter;
        ts2Var.removeTarget(stickerBlendFilter);
        if (this.mTerminalFilter == stickerBlendFilter) {
            removeTerminalFilter(stickerBlendFilter);
            registerTerminalFilter(ts2Var);
            ts2Var.addTarget(this);
            this.mTerminalFilter = ts2Var;
            return;
        }
        removeFilter(stickerBlendFilter);
        if (stickerBlendFilter.getTargets().get(0) instanceof StickerBlendFilter) {
            StickerBlendFilter stickerBlendFilter2 = (StickerBlendFilter) stickerBlendFilter.getTargets().get(0);
            stickerBlendFilter2.parentFilter = ts2Var;
            ts2Var.addTarget(stickerBlendFilter2);
        } else {
            ts2 ts2Var2 = (ts2) stickerBlendFilter.getTargets().get(0);
            ts2Var2.parentFilter = ts2Var;
            ts2Var.addTarget(ts2Var2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeStickerFilter(Sticker sticker) {
        synchronized (getLockObject()) {
            try {
                StickerBlendFilter stickerBlendFilter = this.mStickerFilterMap.get(sticker.getStickerType());
                stickerBlendFilter.setFinishListener(null);
                stickerBlendFilter.setFinishListener(null);
                removeStickerBlendFilter(stickerBlendFilter);
                this.mOrderFilterList.remove(stickerBlendFilter);
                this.mStickerFilterMap.remove(sticker.getStickerType());
                this.filtersToDestroy.add(stickerBlendFilter);
                StickerMaskFinishListener stickerMaskFinishListener = this.finishListener;
                if (stickerMaskFinishListener != null) {
                    int i = 1;
                    if (this.mBigEye <= 0.0f && this.mThinFace + 0.0f <= 0.0f) {
                        i = 0;
                    }
                    stickerMaskFinishListener.stickerRenderFinished(this.mStickerFilterMap.size() + i, sticker);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void setRunableCalledWhenLoaded(int i, Runnable runnable) {
        try {
            MDLog.m7389d("media", "[SoundPool] set runable info id = " + i);
            if (i > 0 && runnable != null) {
                SoundPoolInfo soundPoolInfo = this.soundInfoMap.get(Integer.valueOf(i));
                if (soundPoolInfo == null || !soundPoolInfo.isLoaded) {
                    MDLog.m7389d("media", "[SoundPool] sample is not loaded, just update it ");
                    if (soundPoolInfo == null) {
                        soundPoolInfo = new SoundPoolInfo();
                    }
                    soundPoolInfo.soundId = i;
                    soundPoolInfo.runnable = runnable;
                    this.soundInfoMap.put(Integer.valueOf(i), soundPoolInfo);
                } else {
                    MDLog.m7390d("media", "[SoundPool] sample is is loaded , execute runable   + sampleid=", Integer.valueOf(i));
                    runnable.run();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    private void tryLoadSound(MaskModel maskModel, int i) {
        clearAllSoundPoolInfo();
        if (this.soundPool != null) {
            Iterator<Integer> it = this.soundIds.iterator();
            while (it.hasNext()) {
                this.soundPool.unload(it.next().intValue());
            }
            this.soundPool.release();
            SoundPool soundPool = new SoundPool(i, 3, 5);
            this.soundPool = soundPool;
            soundPool.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() { // from class: com.momo.mcamera.mask.StickerAdjustFilter.6
                @Override // android.media.SoundPool.OnLoadCompleteListener
                public void onLoadComplete(SoundPool soundPool2, int i2, int i3) {
                    StickerAdjustFilter.this.updateSoundPoolLoadedStatus(soundPool2, i2, i3);
                }
            });
            for (Sticker sticker : maskModel.getStickers()) {
                if (!TextUtils.isEmpty(sticker.getSound())) {
                    int iLoad = this.soundPool.load(sticker.getSoundPath(), RoomDatabase.MAX_BIND_PARAMETER_CNT);
                    MDLog.m7391e("media", "[SoundPool]load tag is " + iLoad);
                    sticker.setSoundId(iLoad);
                    this.soundIds.add(Integer.valueOf(sticker.getSoundId()));
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void updateSoundPoolLoadedStatus(SoundPool soundPool, int i, int i2) {
        try {
            MDLog.m7389d("media", "update loadedStatus cur id=" + i);
            if (soundPool != null && i > 0 && i2 == 0) {
                SoundPoolInfo soundPoolInfo = this.soundInfoMap.get(Integer.valueOf(i));
                if (soundPoolInfo == null) {
                    SoundPoolInfo soundPoolInfo2 = new SoundPoolInfo();
                    soundPoolInfo2.soundId = i;
                    soundPoolInfo2.isLoaded = true;
                    this.soundInfoMap.put(Integer.valueOf(i), soundPoolInfo2);
                    MDLog.m7389d("media", "[SoundPool]sticker is not playing, so put info to map id=" + i);
                } else {
                    MDLog.m7389d("media", "[SoundPool]sticker is playing now , so execute runable id=" + i);
                    soundPoolInfo.isLoaded = true;
                    Runnable runnable = soundPoolInfo.runnable;
                    if (runnable != null) {
                        runnable.run();
                        soundPoolInfo.runnable = null;
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateplayStatus(Sticker sticker, int i, int i2) {
    }

    public void addFaceDetectFilter(FaceDetectFilter faceDetectFilter) {
        synchronized (getLockObject()) {
        }
    }

    public boolean addGestureMaskModel(String str, MaskModel maskModel) {
        MDLog.m7395i(MDLogTag.FILTER_TAG, "StickerAdjustFilter addGestureMaskModel gestureTriggerType = " + str);
        if (maskModel == null || !FilterTriggerManager.isTriggerRegionMatches(this.mmcvBoxes, str, maskModel, getWidth(), getHeight())) {
            return false;
        }
        GestureDetectedListener gestureDetectedListener = this.gestureDetectedListener;
        if (gestureDetectedListener != null) {
            gestureDetectedListener.onPreGestureAdded(str);
        }
        if (maskModel.addTime != 0 && System.currentTimeMillis() - maskModel.addTime <= maskModel.getDuration() + 1000) {
            return false;
        }
        maskModel.addTime = System.currentTimeMillis();
        maskModel.setDuration(maskModel.getDuration());
        addMaskModel(maskModel);
        this.startTime = 0L;
        return true;
    }

    public void addGestureModel(String str, MaskModel maskModel) {
        MDLog.m7395i(MDLogTag.FILTER_TAG, "StickerAdjustFilter addGestureModel ");
        maskModel.setModelType(4);
        this.mGestureTriggerModels.put(str, maskModel);
        CVDetector cVDetector = this.gestureDetector;
        if (cVDetector != null) {
            cVDetector.setGestureDetectorListener(this.gestureDetectorListener);
            this.gestureDetector.startDetect();
        }
    }

    public void addHaniSticker(MaskModel maskModel, int i) {
        if (this.mMultiStickerMaskFilter == null) {
            MultiStickerMaskFilter multiStickerMaskFilter = new MultiStickerMaskFilter(this.mContext);
            this.mMultiStickerMaskFilter = multiStickerMaskFilter;
            multiStickerMaskFilter.setPollGroupNumber(maskModel.getPollGroupNum());
            addTerminalMultiStickerFilter(this.mMultiStickerMaskFilter);
        }
        if (maskModel == null) {
            return;
        }
        for (Sticker sticker : maskModel.getStickers()) {
            sticker.setStickerType(maskModel.getModelType() + "_" + (TextUtils.isEmpty(sticker.getObjectTriggerType()) ? "" : sticker.getObjectTriggerType()) + i);
            sticker.setModelType(i);
            sticker.setDuration(DEFAULT_LONG_DURATION);
            sticker.setFrameRate(maskModel.getFrameRate());
            sticker.isHaniSticker = true;
            addSticker(sticker);
        }
    }

    public synchronized void addMaskModel(MaskModel maskModel) {
        MDLog.m7395i(MDLogTag.FILTER_TAG, "StickerAdjustFilter addMaskModel ");
        if (maskModel == null) {
            fhc0.m121349a().m121351c(false);
            return;
        }
        fhc0.m121349a().m121351c(true);
        this.useBlendFilter = false;
        int modelType = maskModel.getModelType();
        long j = DEFAULT_LONG_DURATION;
        if (modelType == 0 || maskModel.getModelType() == 7) {
            if (maskModel.getModelType() == 0) {
                clearMaskWithModelType(0);
            }
            if (maskModel.getAdditionalInfo() != null) {
                BodyLandHelper.setUseBodyLand(maskModel.getAdditionalInfo().isBodyDetectEnable());
            }
            this.mPollGroupNum = maskModel.getPollGroupNum();
            if (maskModel.getModelType() == 0) {
                this.hasExpressionModel = false;
                this.multiSwitchEnable = false;
            } else if (maskModel.getModelType() == 7) {
                if (this.hasExpressionModel) {
                    return;
                } else {
                    this.hasExpressionModel = true;
                }
            }
            if (maskModel.getAdditionalInfo() != null && maskModel.getAdditionalInfo().isMultiFaceSwitchEnable()) {
                this.multiSwitchEnable = true;
                DataDotUtils.getInstance().getRecoderDataDotInfo().setCameraEnableMultiFaces(this.multiSwitchEnable);
            }
            if (maskModel.getAdditionalInfo() == null || !maskModel.getAdditionalInfo().isAnimojiDetectEnable()) {
                FacerigHelper.setUseAnimojiFaceRig(false);
            } else {
                FacerigHelper.setUseAnimojiFaceRig(true);
            }
            if (maskModel.getAdditionalInfo() != null && maskModel.getAdditionalInfo().isComic()) {
                List<Sticker> stickers = maskModel.getStickers();
                ArrayList arrayList = new ArrayList();
                for (int i = 0; i < stickers.size(); i++) {
                    if (stickers.get(i).getStickerType().equals("FACE_MASK_TYPE")) {
                        arrayList.add(stickers.get(i));
                        stickers.remove(i);
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    stickers.add((Sticker) it.next());
                }
                maskModel.setStickers(stickers);
            }
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            for (Sticker sticker : maskModel.getStickers()) {
                if (maskModel.getAdditionalInfo() != null && maskModel.getAdditionalInfo().isComic()) {
                    sticker.setComic(true);
                }
                if (TextUtils.isEmpty(sticker.getStickerType()) || (!sticker.getStickerType().equals("STICKER_TYPE_VOICE") && !sticker.getStickerType().equals("FACE_MASK_TYPE") && !sticker.getStickerType().equals("FACE_LOOK_UP_TYPE"))) {
                    MultiStickerMaskFilter multiStickerMaskFilter = this.mMultiStickerMaskFilter;
                    int stickerItemListSize = multiStickerMaskFilter != null ? multiStickerMaskFilter.getStickerItemListSize() + i4 : i4;
                    ConcurrentHashMap<String, StickerBlendFilter> concurrentHashMap = this.mStickerFilterMap;
                    if (concurrentHashMap != null) {
                        stickerItemListSize += concurrentHashMap.size();
                    }
                    sticker.setStickerType(maskModel.getModelType() + "_" + stickerItemListSize);
                    sticker.setDuration(j);
                }
                if (sticker.getStickerType().equals("FACE_LOOK_UP_TYPE")) {
                    for (LookUpModel lookUpModel : maskModel.getLookUpFilters()) {
                        lookUpModel.setPresetFilter(MMPresetFilterStore.getPresetFilterByFolder(this.mContext, sticker.getImageFolderPath() + "/" + lookUpModel.getFolder()));
                        sticker.setStickerType("FACE_LOOK_UP_TYPE");
                        sticker.setTriggerType(lookUpModel.getTriggerType());
                        sticker.setLookUpModel(lookUpModel);
                        sticker.setHiddenTriggerType(lookUpModel.getHiddenTriggerType());
                    }
                }
                if (!TextUtils.isEmpty(sticker.getLayerType()) && sticker.getLayerType().equals("3d")) {
                    sticker.setXengineEsPath(maskModel.getXengineEsPath());
                    this.useBlendFilter = true;
                }
                if (sticker.isClearsBodyArea()) {
                    this.useBlendFilter = true;
                    this.enableSelfRender = false;
                    i2++;
                }
                if (isBlendSticker(sticker)) {
                    this.useBlendFilter = true;
                }
                if (sticker.getAdditionalInfo() != null && sticker.getAdditionalInfo().getFacePositions() != null) {
                    sticker.isCutFaceSticker = true;
                }
                sticker.setModelType(maskModel.getModelType());
                if (!TextUtils.isEmpty(sticker.getSound())) {
                    i3++;
                }
                addSticker(sticker);
                i4++;
                j = DEFAULT_LONG_DURATION;
            }
            FaceMaskFilter faceMaskFilter = this.mFaceMaskFilter;
            if (faceMaskFilter != null) {
                faceMaskFilter.addStickerList(this.mSwapFacialMaskSticker);
            }
            if (i2 > 0) {
                SegmentHelper.setSegmentCount(i2);
            }
            if (!TextUtils.isEmpty(maskModel.getSoundPath())) {
                i3++;
            }
            if (this.enableSoundPool) {
                if (!TextUtils.isEmpty(maskModel.getSound()) && this.soundPlayer == null) {
                    MediaPlayer mediaPlayer = new MediaPlayer();
                    this.soundPlayer = mediaPlayer;
                    mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.momo.mcamera.mask.StickerAdjustFilter.2
                        @Override // android.media.MediaPlayer.OnErrorListener
                        public boolean onError(MediaPlayer mediaPlayer2, int i5, int i6) {
                            MDLog.m7391e(MDLogTag.FILTER_TAG, "Audio Player Error what = " + i5 + " extra = " + i6);
                            return false;
                        }
                    });
                    this.soundPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.momo.mcamera.mask.StickerAdjustFilter.3
                        @Override // android.media.MediaPlayer.OnPreparedListener
                        public void onPrepared(MediaPlayer mediaPlayer2) {
                            MDLog.m7389d(MDLogTag.FILTER_TAG, "Audio Player onPrepared");
                            mediaPlayer2.setLooping(true);
                            mediaPlayer2.start();
                        }
                    });
                    this.soundPlayer.setAudioStreamType(3);
                    try {
                        this.soundPlayer.setDataSource(maskModel.getSoundPath());
                        this.soundPlayer.prepareAsync();
                    } catch (Exception unused) {
                        MDLog.m7391e(MDLogTag.FILTER_TAG, "MediaPlayerDataSourceHelper.setMediaPlayerDataSource Error");
                        this.soundPlayer.release();
                        this.soundPlayer = null;
                    }
                }
                tryLoadSound(maskModel, i3);
            }
        } else if (maskModel.getModelType() == 4) {
            StickerGestureTrackingFilter stickerGestureTrackingFilter = this.mGestureTrackingFilter;
            if (stickerGestureTrackingFilter != null && stickerGestureTrackingFilter.isTrackingInit()) {
                return;
            }
            if (maskModel.getStickers() == null) {
                return;
            }
            clearMaskWithModelType(maskModel.getModelType());
            this.mPollGroupNum = maskModel.getPollGroupNum();
            int i5 = 0;
            int i6 = 0;
            for (Sticker sticker2 : maskModel.getStickers()) {
                sticker2.setStickerType(maskModel.getModelType() + "_" + (TextUtils.isEmpty(sticker2.getObjectTriggerType()) ? "" : sticker2.getObjectTriggerType()) + i6);
                sticker2.setTriggerRegion(maskModel.getTriggerRegion());
                sticker2.setModelType(maskModel.getModelType());
                sticker2.setFrameRate(maskModel.getFrameRate());
                if (!"object_follower".equals(sticker2.getLayerType()) || sticker2.isDonotTrack()) {
                    sticker2.setDuration(maskModel.getDuration());
                } else {
                    sticker2.setDuration(DEFAULT_LONG_DURATION);
                }
                if (!TextUtils.isEmpty(sticker2.getSound())) {
                    i5++;
                }
                addSticker(sticker2);
                i6++;
            }
            if (!TextUtils.isEmpty(maskModel.getSoundPath())) {
                i5++;
            }
            if (this.enableSoundPool) {
                tryLoadSound(maskModel, i5);
            }
        } else if (maskModel.getModelType() == 6) {
            this.mPollGroupNum = maskModel.getPollGroupNum();
            if (this.mMultiStickerMaskFilter == null) {
                MultiStickerGameMaskFilter multiStickerGameMaskFilter = new MultiStickerGameMaskFilter(this.mContext);
                this.mMultiStickerMaskFilter = multiStickerGameMaskFilter;
                addTerminalMultiStickerFilter(multiStickerGameMaskFilter);
            }
            for (Sticker sticker3 : maskModel.getStickers()) {
                sticker3.setDuration(DEFAULT_LONG_DURATION);
                sticker3.setFrameRate(maskModel.getFrameRate());
                String objectTriggerType = sticker3.getObjectTriggerType();
                sticker3.setStickerType(maskModel.getModelType() + "_" + objectTriggerType);
                if (objectTriggerType == null || !objectTriggerType.equals("game_over")) {
                    sticker3.isGameSticker = true;
                    sticker3.setLayerType(Sticker.LAYER_TYPE_FACE);
                    sticker3.setGroupNumber(this.groupNumber);
                    sticker3.setAlwaysShow(true);
                } else {
                    sticker3.setType(5);
                    sticker3.setAlwaysShow(true);
                    AbsolutePosition absolutePosition = new AbsolutePosition();
                    ObjectRegion objectRegion = new ObjectRegion();
                    objectRegion.f14252x = 0.5f;
                    objectRegion.f14253y = 0.25f;
                    objectRegion.f14251w = sticker3.getImageWidth();
                    objectRegion.f14250h = sticker3.getImageHeight();
                    ViewPortProportion viewPortProportion = new ViewPortProportion();
                    viewPortProportion.height = WBConstants.SDK_NEW_PAY_VERSION;
                    viewPortProportion.width = 1080;
                    absolutePosition.setCenter(objectRegion);
                    absolutePosition.setViewport(viewPortProportion);
                    sticker3.setAbsolutePos(absolutePosition);
                }
                addSticker(sticker3);
            }
            this.groupNumber++;
            if (this.enableSoundPool) {
                if (this.soundPool == null) {
                    this.soundPool = new SoundPool(5, 3, 5);
                }
                if (this.soundPool != null) {
                    if (!TextUtils.isEmpty(maskModel.getSound())) {
                        maskModel.setSoundId(this.soundPool.load(maskModel.getSoundPath(), RoomDatabase.MAX_BIND_PARAMETER_CNT));
                        this.soundPool.play(maskModel.getSoundId(), 1.0f, 1.0f, 1, 1, 1.0f);
                        this.soundIds.add(Integer.valueOf(maskModel.getSoundId()));
                    }
                    this.soundPool.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() { // from class: com.momo.mcamera.mask.StickerAdjustFilter.4
                        @Override // android.media.SoundPool.OnLoadCompleteListener
                        public void onLoadComplete(SoundPool soundPool, int i7, int i8) {
                            StickerAdjustFilter.this.updateSoundPoolLoadedStatus(soundPool, i7, i8);
                        }
                    });
                    for (Sticker sticker4 : maskModel.getStickers()) {
                        if (!TextUtils.isEmpty(sticker4.getSound())) {
                            sticker4.setSoundId(this.soundPool.load(sticker4.getSoundPath(), RoomDatabase.MAX_BIND_PARAMETER_CNT));
                            this.soundIds.add(Integer.valueOf(sticker4.getSoundId()));
                        }
                    }
                }
            }
        } else {
            addCommonModel(maskModel);
        }
        if (maskModel.getEffectList() != null) {
            addEffectProcessFilter(maskModel);
        }
        if (maskModel.getDistortionList() != null) {
            for (Mask mask : maskModel.getDistortionList()) {
                if (mask.getHidingObjectTriggerType() != null) {
                    this.mDistorationMask = mask;
                    this.mFaceThinValue = mask.getStrength();
                    this.mBigEyeValue = this.mDistorationMask.getStrengthB();
                    break;
                }
            }
        }
        if (maskModel.getBeautyFace() != null && this.mDistorationMask != null) {
            this.mBeautyFace = maskModel.getBeautyFace();
        }
        if (maskModel.getAdditionalInfo() != null) {
            List<Face3DMaskFilter> list = this.face3DMaskFilters;
            if (list != null && list.size() > 0) {
                for (Face3DMaskFilter face3DMaskFilter : this.face3DMaskFilters) {
                    if (maskModel.getStickers() != null && face3DMaskFilter.getSticker() != null && maskModel.getStickers().contains(face3DMaskFilter.getSticker())) {
                        face3DMaskFilter.setAdditionalInfo(maskModel.getAdditionalInfo());
                    }
                }
            }
            if (maskModel.getAdditionalInfo().isObjectDetectEnable()) {
                startGestureDetect();
            }
        }
        this.useBlendFilter = false;
    }

    public synchronized void addSticker(final Sticker sticker) {
        ts2 weexStickerMaskFilter;
        ts2 ts2Var;
        ts2 normalFilter;
        ts2 stickerGestureMaskFilter;
        SoundInputFilter soundInputFilter;
        synchronized (getLockObject()) {
            try {
                sticker.curIndex = 0;
                if (sticker.isClearsBodyArea()) {
                    this.useBlendFilter = true;
                }
                if (sticker.getTriggerType() > 0) {
                    this.filterTriggerManager.setTriggerType(sticker.getTriggerType());
                }
                if (sticker.getHiddenTriggerType() > 0) {
                    this.filterTriggerManager.setHiddenTriggerType(sticker.getHiddenTriggerType());
                }
                StickerBlendFilter stickerBlendFilter = this.mStickerFilterMap.get(sticker.getStickerType());
                if (stickerBlendFilter == null) {
                    if (sticker.getStickerType().equals("STICKER_TYPE_VOICE")) {
                        soundInputFilter = new SoundInputFilter();
                        this.mSoundInput = soundInputFilter;
                        MDLog.m7395i(MDLogTag.FILTER_TAG, " Sticker Type STICKER_TYPE_VOICE SoundInputFilter !!!");
                    } else if (!TextUtils.isEmpty(sticker.getLayerType()) && sticker.getLayerType().equals("object_follower") && !sticker.isHaniSticker) {
                        stickerGestureMaskFilter = new StickerGestureMaskFilter(this.mContext, sticker);
                        MDLog.m7395i(MDLogTag.FILTER_TAG, " Sticker Type LAYER_TYPE_GESTURE StickerGestureMaskFilter !!!");
                    } else if (sticker.getStickerType().equals("FACE_MASK_TYPE")) {
                        if (this.mSwapFacialMaskSticker == null) {
                            this.mSwapFacialMaskSticker = new ArrayList();
                        }
                        FaceMaskFilter faceMaskFilter = new FaceMaskFilter(sticker);
                        this.mFaceMaskFilter = faceMaskFilter;
                        if (sticker.getMask().swapFacialMask) {
                            this.mSwapFacialMaskSticker.add(sticker);
                        }
                        MDLog.m7395i(MDLogTag.FILTER_TAG, " Sticker Type FACE_MASK_TYPE FaceMaskFilter !!!");
                        ts2Var = faceMaskFilter;
                    } else if (!TextUtils.isEmpty(sticker.getLayerType()) && sticker.getLayerType().equals("3d") && fpx.m122681a()) {
                        if (this.face3DMaskFilters == null) {
                            this.face3DMaskFilters = new ArrayList();
                        }
                        ts2 face3DMaskFilter = new Face3DMaskFilter(sticker, this.isCameraFront, this.mContext);
                        this.face3DMaskFilters.add((Face3DMaskFilter) face3DMaskFilter);
                        MDLog.m7395i(MDLogTag.FILTER_TAG, " Sticker Type FACE_3D_MASK_TYPE Face3DMaskFilter !!!");
                        ts2Var = face3DMaskFilter;
                    } else if (sticker.getStickerType().equals("FACE_LOOK_UP_TYPE")) {
                        if (sticker.getLookUpModel() == null || sticker.getLookUpModel().getPresetFilter() == null) {
                            normalFilter = new NormalFilter();
                        } else {
                            yhf0 filterGroup = sticker.getLookUpModel().getPresetFilter().getFilterGroup();
                            this.mLookupFilter = filterGroup;
                            normalFilter = filterGroup;
                        }
                        MDLog.m7395i(MDLogTag.FILTER_TAG, " Sticker Type FACE_LOOK_UP_TYPE !!!");
                        ts2Var = normalFilter;
                    } else if (Sticker.LAYER_TYPE_VIDEO_FILE.equals(sticker.getLayerType()) && sticker.getVideoFileConfig() != null) {
                        VideoMergeGroupFilter videoMergeGroupFilter = new VideoMergeGroupFilter(this.mContext, sticker.getImageFolderPath() + File.separator + sticker.getImagePreName(), sticker.getVideoFileConfig(), sticker.getDuration());
                        videoMergeGroupFilter.setOnVideoTimeoutListener(new IVideoTimeoutListener() { // from class: com.momo.mcamera.mask.StickerAdjustFilter.7
                            @Override // com.momo.mcamera.mask.videomix.IVideoTimeoutListener
                            public void onTimeout() {
                                StickerAdjustFilter.this.removeStickerFilter(sticker);
                            }
                        });
                        this.videoMergeGroupFilter = videoMergeGroupFilter;
                        MDLog.m7395i(MDLogTag.FILTER_TAG, " Sticker Type LAYER_TYPE_VIDEO_FILE !!!");
                        ts2Var = videoMergeGroupFilter;
                    } else if ((!this.useBlendFilter || (sticker.getStickerType() != null && sticker.getStickerType().startsWith("weex"))) && !sticker.isComic()) {
                        if (this.mMultiStickerMaskFilter == null) {
                            MDLog.m7391e(MDLogTag.FILTER_TAG, "optimization");
                            if (sticker.isCutFaceSticker) {
                                this.mMultiStickerMaskFilter = new MultiStickerCutFaceMaskFilter(this.mContext);
                            } else {
                                this.mMultiStickerMaskFilter = new MultiStickerMaskFilter(this.mContext);
                            }
                            this.mMultiStickerMaskFilter.setOrderedIndex(800);
                            this.mMultiStickerMaskFilter.setPollGroupNumber(this.mPollGroupNum);
                            addOrderableTerminalFilter(this.mMultiStickerMaskFilter);
                        }
                        if (this.mMultiStickerMaskFilter != null) {
                            if (!TextUtils.isEmpty(sticker.getLayerType()) && sticker.getLayerType().equals("native")) {
                                return;
                            }
                            if (this.mMultiStickerMaskFilter.isHaveSameSticker(sticker)) {
                                return;
                            }
                            multiStickerFilterAddListener(sticker);
                            MDLog.m7395i(MDLogTag.FILTER_TAG, " Sticker Type MultiStickerMaskFilter !!!");
                            ts2Var = null;
                        } else if (sticker.getStickerType().startsWith("weex")) {
                            weexStickerMaskFilter = new WeexStickerMaskFilter(sticker);
                            MDLog.m7395i(MDLogTag.FILTER_TAG, " Sticker Type WeexStickerMaskFilter !!!");
                        } else {
                            ts2 stickerEtc1MaskFilter = sticker.getEtcTextureBatch() != null ? new StickerEtc1MaskFilter(this.mContext, sticker) : new StickerMaskFilter(this.mContext, sticker, sticker.getImageProvider());
                            MDLog.m7395i(MDLogTag.FILTER_TAG, " Sticker Type StickerMaskFilter !!!");
                            ts2Var = stickerEtc1MaskFilter;
                        }
                    } else {
                        ts2 stickerEtc1MaskFilter2 = sticker.getEtcTextureBatch() != null ? new StickerEtc1MaskFilter(this.mContext, sticker) : new StickerMaskFilter(this.mContext, sticker, sticker.getImageProvider());
                        MDLog.m7395i(MDLogTag.FILTER_TAG, " Sticker Type StickerMaskFilter !!!");
                        ts2Var = stickerEtc1MaskFilter2;
                    }
                    if (ts2Var != null) {
                        ts2Var = weexStickerMaskFilter;
                        ts2Var = stickerGestureMaskFilter;
                        MDLog.m7395i(MDLogTag.FILTER_TAG, " Sticker Type StickerBlendFilter !!!");
                        StickerBlendFilter stickerBlendFilterCreateStickerBlendFilter = createStickerBlendFilter(sticker, ts2Var);
                        if ("STICKER_TYPE_VOICE".equals(sticker.getStickerType())) {
                            ts2Var = soundInputFilter;
                            stickerBlendFilterCreateStickerBlendFilter.setOrderedIndex(801);
                        }
                        ts2Var = soundInputFilter;
                        this.mStickerFilterMap.put(sticker.getStickerType(), stickerBlendFilterCreateStickerBlendFilter);
                        addOrderableTerminalFilter(stickerBlendFilterCreateStickerBlendFilter);
                        stickerBlendFilterCreateStickerBlendFilter.sticker = sticker;
                        if (sticker.getDuration() > 0) {
                            stickerBlendFilterCreateStickerBlendFilter.mStickerDuration = sticker.getDuration();
                        } else {
                            stickerBlendFilterCreateStickerBlendFilter.mStickerDuration = DEFAULT_DURATION;
                        }
                        stickerBlendFilterCreateStickerBlendFilter.setFinishListener(new StickerBlendFilter.StickerMaskFinishListener() { // from class: com.momo.mcamera.mask.StickerAdjustFilter.8
                            @Override // com.momo.mcamera.mask.StickerBlendFilter.StickerMaskFinishListener
                            public void stickerRenderFinished() {
                                StickerAdjustFilter.this.removeStickerFilter(sticker);
                            }
                        });
                    }
                } else if (sticker.getImageFolderPath() == null || !sticker.getImageFolderPath().equals(stickerBlendFilter.sticker.getImageFolderPath())) {
                    stickerBlendFilter.sticker = sticker;
                    stickerBlendFilter.resetSticker(sticker);
                    if (sticker.getDuration() > 0) {
                        stickerBlendFilter.mStickerDuration = sticker.getDuration();
                    } else {
                        stickerBlendFilter.mStickerDuration = DEFAULT_DURATION;
                    }
                } else if (sticker.getStickerType().equals("FACE_MASK_TYPE") && sticker.getMask().swapFacialMask) {
                    stickerBlendFilter.mStickerDuration = DEFAULT_DURATION;
                    if (sticker.getMask().swapFacialMask) {
                        this.mSwapFacialMaskSticker.add(sticker);
                    }
                } else {
                    stickerBlendFilter.mStickerDuration = (stickerBlendFilter.mStickerDuration - stickerBlendFilter.getEscapedTime()) + sticker.getDuration();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void changeDeviceOrientation(int i) {
        SoundInputFilter soundInputFilter = this.mSoundInput;
        if (soundInputFilter != null) {
            soundInputFilter.resetClockDegrees();
            this.mSoundInput.rotateClockwise90Degrees(i / 90);
        }
        MultiStickerMaskFilter multiStickerMaskFilter = this.mMultiStickerMaskFilter;
        if (multiStickerMaskFilter != null) {
            multiStickerMaskFilter.setDeviceOrientation(i);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public void clearMaskFilters() {
        synchronized (getLockObject()) {
            try {
                this.mPollGroupNum = 0;
                for (StickerBlendFilter stickerBlendFilter : this.mStickerFilterMap.values()) {
                    stickerBlendFilter.setFinishListener(null);
                    stickerBlendFilter.setFinishListener(null);
                    removeStickerBlendFilter(stickerBlendFilter);
                    this.filtersToDestroy.add(stickerBlendFilter);
                    StickerMaskFinishListener stickerMaskFinishListener = this.finishListener;
                    if (stickerMaskFinishListener != null) {
                        int i = 1;
                        if (this.mBigEye <= 0.0f && this.mThinFace + 0.0f <= 0.0f) {
                            i = 0;
                        }
                        stickerMaskFinishListener.stickerRenderFinished(this.mStickerFilterMap.size() + i, stickerBlendFilter.sticker);
                    }
                }
                List<Face3DMaskFilter> list = this.face3DMaskFilters;
                if (list != null && list.size() > 0) {
                    this.face3DMaskFilters.clear();
                    this.face3DMaskFilters = null;
                }
                if (BodyLandHelper.isUseBodyLand()) {
                    BodyLandHelper.setUseBodyLand(false);
                }
                MultiStickerMaskFilter multiStickerMaskFilter = this.mMultiStickerMaskFilter;
                if (multiStickerMaskFilter != null) {
                    ts2 ts2Var = multiStickerMaskFilter.parentFilter;
                    ts2Var.removeTarget(multiStickerMaskFilter);
                    ts2 ts2Var2 = this.mTerminalFilter;
                    ts2 ts2Var3 = this.mMultiStickerMaskFilter;
                    if (ts2Var2 == ts2Var3) {
                        removeTerminalFilter(ts2Var3);
                        registerTerminalFilter(ts2Var);
                        ts2Var.addTarget(this);
                        this.mTerminalFilter = ts2Var;
                    } else {
                        removeFilter(ts2Var3);
                        ts2 ts2Var4 = (ts2) this.mMultiStickerMaskFilter.getTargets().get(0);
                        ts2Var4.parentFilter = ts2Var;
                        ts2Var.addTarget(ts2Var4);
                    }
                    this.filtersToDestroy.add(this.mMultiStickerMaskFilter);
                    this.mMultiStickerMaskFilter = null;
                }
                EffectGroupFilter effectGroupFilter = this.mEffectGroupFilter;
                if (effectGroupFilter != null) {
                    effectGroupFilter.clearAll();
                }
                FaceMaskFilter faceMaskFilter = this.mFaceMaskFilter;
                if (faceMaskFilter != null) {
                    this.filtersToDestroy.add(faceMaskFilter);
                    this.mFaceMaskFilter = null;
                }
                List<Sticker> list2 = this.mSwapFacialMaskSticker;
                if (list2 != null) {
                    list2.clear();
                    this.mSwapFacialMaskSticker = null;
                }
                if (this.mDistorationMask != null) {
                    this.mDistorationMask = null;
                    this.mFaceBeauty = false;
                    this.mFaceStateChange = false;
                    this.mFaceBeautyHaveFinish = false;
                    this.mFaceThinValue = 0.0f;
                    this.mBigEyeValue = 0.0f;
                }
                if (this.mBeautyFace != null) {
                    this.mBeautyFace = null;
                }
                releaseSoundPlayer();
                SegmentHelper.release();
                HandSegmentHelper.release();
                TietieHeartHelper.getInstance().release();
                FacerigHelper.releseFaceRigInfo();
                this.mStickerFilterMap.clear();
                this.mOrderFilterList.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void clearMaskWithModelType(int i) {
        List<Face3DMaskFilter> list;
        synchronized (getLockObject()) {
            try {
                this.mPollGroupNum = 0;
                for (StickerBlendFilter stickerBlendFilter : this.mStickerFilterMap.values()) {
                    if (stickerBlendFilter.sticker.getModelType() == i) {
                        stickerBlendFilter.setFinishListener(null);
                        removeStickerBlendFilter(stickerBlendFilter);
                        this.filtersToDestroy.add(stickerBlendFilter);
                        StickerMaskFinishListener stickerMaskFinishListener = this.finishListener;
                        if (stickerMaskFinishListener != null) {
                            int i2 = 1;
                            if (this.mBigEye <= 0.0f && this.mThinFace + 0.0f <= 0.0f) {
                                i2 = 0;
                            }
                            stickerMaskFinishListener.stickerRenderFinished(this.mStickerFilterMap.size() + i2, stickerBlendFilter.sticker);
                        }
                        this.mStickerFilterMap.remove(stickerBlendFilter.sticker.getStickerType());
                        this.mOrderFilterList.remove(stickerBlendFilter);
                        FaceDetectFilter faceDetectFilter = stickerBlendFilter.stickerMaskFilter;
                        if ((faceDetectFilter instanceof Face3DMaskFilter) && (list = this.face3DMaskFilters) != null) {
                            list.remove(faceDetectFilter);
                        }
                    }
                }
                MultiStickerMaskFilter multiStickerMaskFilter = this.mMultiStickerMaskFilter;
                if (multiStickerMaskFilter != null) {
                    multiStickerMaskFilter.clearMaskWithModelType(i);
                }
                EffectGroupFilter effectGroupFilter = this.mEffectGroupFilter;
                if (effectGroupFilter != null) {
                    effectGroupFilter.clearWithModelType(i);
                }
                if (this.mDistorationMask != null) {
                    this.mDistorationMask = null;
                    this.mFaceBeauty = false;
                    this.mFaceStateChange = false;
                    this.mFaceBeautyHaveFinish = false;
                    this.mFaceThinValue = 0.0f;
                    this.mBigEyeValue = 0.0f;
                }
                if (this.mBeautyFace != null) {
                    this.mBeautyFace = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p149l.ydk, p149l.mcj, p149l.ccj
    public synchronized void destroy() {
        try {
            for (StickerBlendFilter stickerBlendFilter : this.mStickerFilterMap.values()) {
                stickerBlendFilter.cancelDraw();
                stickerBlendFilter.destroy();
            }
            EffectGroupFilter effectGroupFilter = this.mEffectGroupFilter;
            if (effectGroupFilter != null) {
                effectGroupFilter.destroy();
            }
            MultiStickerMaskFilter multiStickerMaskFilter = this.mMultiStickerMaskFilter;
            if (multiStickerMaskFilter != null) {
                multiStickerMaskFilter.destroy();
            }
            super.destroy();
            NormalFilter normalFilter = this.mNormalFilter;
            if (normalFilter != null) {
                normalFilter.destroy();
            }
            CVDetector cVDetector = this.gestureDetector;
            if (cVDetector != null) {
                cVDetector.cancel();
            }
            this.gestureDetectorListener = null;
            stopExpressDetect();
            FacerigHelper.release();
            BodyLandHelper.release();
            SegmentHelper.release();
            HandSegmentHelper.release();
            TietieHeartHelper.getInstance().release();
            FacerigHelper.releseFaceRigInfo();
            releaseSoundPlayer();
            FaceMaskFilter faceMaskFilter = this.mFaceMaskFilter;
            if (faceMaskFilter != null) {
                faceMaskFilter.destroy();
            }
            List<Sticker> list = this.mSwapFacialMaskSticker;
            if (list != null) {
                list.clear();
                this.mSwapFacialMaskSticker = null;
            }
            yhf0 yhf0Var = this.mLookupFilter;
            if (yhf0Var != null) {
                yhf0Var.destroy();
                this.mLookupFilter = null;
            }
            VideoMergeGroupFilter videoMergeGroupFilter = this.videoMergeGroupFilter;
            if (videoMergeGroupFilter != null) {
                videoMergeGroupFilter.destroy();
                this.videoMergeGroupFilter = null;
            }
            List<ccj> list2 = this.filtersToDestroy;
            if (list2 != null && list2.size() > 0) {
                Iterator<ccj> it = this.filtersToDestroy.iterator();
                while (it.hasNext()) {
                    it.next().destroy();
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        List<Face3DMaskFilter> list = this.face3DMaskFilters;
        if (list != null) {
            list.size();
        }
        return false;
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

    public float getBigEye() {
        return this.mBigEye;
    }

    public StickerBlendFilter.StickerStateChangeListener getStickerStateChangeListener() {
        return this.stickerStateChangeListener;
    }

    @Override // p149l.mcj
    public int getTextOutID() {
        ts2 ts2Var = getTerminalFilters().get(0);
        if (ts2Var != null) {
            return ts2Var.getTextOutID();
        }
        return 0;
    }

    public float getThinFace() {
        return this.mThinFace;
    }

    public List<vif0> getViewPortSize() {
        ArrayList arrayList = new ArrayList();
        List<Face3DMaskFilter> list = this.face3DMaskFilters;
        if (list != null && list.size() > 0) {
            Iterator<Face3DMaskFilter> it = this.face3DMaskFilters.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getViewPortSize());
            }
        }
        return arrayList;
    }

    @Override // p149l.mcj
    public void initFBO() {
        super.initFBO();
    }

    public void initGameFixSticker(Bitmap bitmap, Bitmap bitmap2, int i, int i2) {
        MultiStickerMaskFilter multiStickerMaskFilter;
        if (isBitmapValid(bitmap) && isBitmapValid(bitmap2) && (multiStickerMaskFilter = this.mMultiStickerMaskFilter) != null && (multiStickerMaskFilter instanceof MultiStickerGameMaskFilter)) {
            ((MultiStickerGameMaskFilter) multiStickerMaskFilter).initGameFixStickerItem(bitmap, bitmap2, i, i2);
        }
    }

    public void lockTexture() {
        Iterator<StickerBlendFilter> it = this.mStickerFilterMap.values().iterator();
        while (it.hasNext()) {
            it.next().lockTexture();
        }
    }

    @Override // p149l.ydk, p149l.ts2, p149l.jcj
    public void newTextureReady(int i, mcj mcjVar, boolean z) {
        synchronized (getLockObject()) {
            try {
                if (this.scaleWidth == 0) {
                    this.scaleWidth = getWidth();
                    this.scaleWidthRatio = 1.0f;
                } else if (getWidth() > 0) {
                    this.scaleWidthRatio = (this.scaleWidth * 1.0f) / getWidth();
                }
                if (this.scaleHeight == 0) {
                    this.scaleHeight = getHeight();
                    this.scaleHeightRatio = 1.0f;
                } else if (getHeight() > 0) {
                    this.scaleHeightRatio = (this.scaleHeight * 1.0f) / getHeight();
                }
                MultiStickerMaskFilter multiStickerMaskFilter = this.mMultiStickerMaskFilter;
                if (multiStickerMaskFilter != null) {
                    multiStickerMaskFilter.setScaleWidthRatio(this.scaleWidthRatio);
                    this.mMultiStickerMaskFilter.setScaleHeightRatio(this.scaleHeightRatio);
                }
                if (this.enableSelfRender) {
                    if (this.startTime == 0) {
                        this.startTime = System.currentTimeMillis();
                    }
                    setTimeStamp(System.currentTimeMillis() - this.startTime);
                }
                Iterator<ccj> it = this.filtersToDestroy.iterator();
                while (it.hasNext()) {
                    it.next().destroy();
                }
                this.filtersToDestroy.clear();
                super.newTextureReady(i, mcjVar, z);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.momo.mcamera.mask.detect.IDetectManager.IExpressDetectListener
    public void onExpressDetected(ExpressInfo expressInfo) {
    }

    @Override // com.momo.mcamera.mask.detect.IDetectManager.IGestureDetectListener
    public void onGestureDetected(MMCVBoxes mMCVBoxes) {
        if (mMCVBoxes == null || mMCVBoxes.getDetectResult() == null || mMCVBoxes.getDetectResult().length <= 0) {
            this.mmcvBoxes = null;
            StickerGestureTrackingFilter stickerGestureTrackingFilter = this.mGestureTrackingFilter;
            if (stickerGestureTrackingFilter != null) {
                stickerGestureTrackingFilter.gestureMiss();
                return;
            }
            return;
        }
        this.mmcvBoxes = mMCVBoxes;
        for (MMBox mMBox : mMCVBoxes.getDetectResult()) {
            String str = mMBox.class_name_;
            if (mMBox.class_index_ > 0 && !TextUtils.isEmpty(str)) {
                addGestureMaskModel(str);
                GestureDetectedListener gestureDetectedListener = this.gestureDetectedListener;
                if (gestureDetectedListener != null) {
                    gestureDetectedListener.gestureDetected(str);
                }
            }
        }
    }

    @Override // com.momo.mcamera.mask.detect.IDetectManager.IObjectDetectListener
    public void onObjectDetected(MMCVBoxes mMCVBoxes) {
        if (mMCVBoxes == null || mMCVBoxes.getDetectResult() == null || mMCVBoxes.getDetectResult().length <= 0) {
            this.mmcvBoxes = null;
            StickerGestureTrackingFilter stickerGestureTrackingFilter = this.mGestureTrackingFilter;
            if (stickerGestureTrackingFilter != null) {
                stickerGestureTrackingFilter.gestureMiss();
                return;
            }
            return;
        }
        this.mmcvBoxes = mMCVBoxes;
        for (MMBox mMBox : mMCVBoxes.getDetectResult()) {
            String str = mMBox.class_name_;
            if (mMBox.class_index_ > 0 && !TextUtils.isEmpty(str)) {
                addGestureMaskModel(str);
                GestureDetectedListener gestureDetectedListener = this.gestureDetectedListener;
                if (gestureDetectedListener != null) {
                    gestureDetectedListener.gestureDetected(str);
                }
            }
        }
    }

    public void pauseRender() {
        Iterator<StickerBlendFilter> it = this.mStickerFilterMap.values().iterator();
        while (it.hasNext()) {
            it.next().pauseBitmapCache();
        }
    }

    @Override // p149l.ydk, p149l.mcj, p149l.ccj
    public void releaseFrameBuffer() {
        super.releaseFrameBuffer();
    }

    public void releaseSoundPlayer() {
        clearAllSoundPoolInfo();
        if (this.soundPool != null) {
            ArrayList<Integer> arrayList = this.soundIds;
            if (arrayList != null && arrayList.size() > 0) {
                Iterator<Integer> it = this.soundIds.iterator();
                while (it.hasNext()) {
                    this.soundPool.unload(it.next().intValue());
                }
                this.soundIds.clear();
            }
            this.soundPool.release();
        }
        MediaPlayer mediaPlayer = this.soundPlayer;
        if (mediaPlayer != null) {
            mediaPlayer.release();
            this.soundPlayer = null;
        }
    }

    public void removeGestureModel(String str) {
        this.mGestureTriggerModels.remove(str);
        MDLog.m7395i(MDLogTag.FILTER_TAG, "StickerAdjustFilter removeGestureModel ");
    }

    public void removeHaniSticker(int i) {
        synchronized (getLockObject()) {
            try {
                MultiStickerMaskFilter multiStickerMaskFilter = this.mMultiStickerMaskFilter;
                if (multiStickerMaskFilter != null) {
                    multiStickerMaskFilter.removeHaniSticker(i);
                }
                clearMaskWithModelType(i);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void removeSticker(String str) {
        synchronized (getLockObject()) {
            try {
                MultiStickerMaskFilter multiStickerMaskFilter = this.mMultiStickerMaskFilter;
                if (multiStickerMaskFilter != null) {
                    multiStickerMaskFilter.removeSticker(str);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void resumeRender() {
        Iterator<StickerBlendFilter> it = this.mStickerFilterMap.values().iterator();
        while (it.hasNext()) {
            it.next().resumeBitmapCache();
        }
    }

    public void setBigEye(float f) {
        this.mBigEye = f;
    }

    public void setCapture3DImageListener(Capture3DImageListener capture3DImageListener) {
        List<Face3DMaskFilter> list = this.face3DMaskFilters;
        if (list == null || list.size() <= 0) {
            return;
        }
        Iterator<Face3DMaskFilter> it = this.face3DMaskFilters.iterator();
        while (it.hasNext()) {
            it.next().setCapture3DImageListener(capture3DImageListener);
        }
    }

    public void setCapture3DRenderImage(boolean z, Rect rect) {
        List<Face3DMaskFilter> list = this.face3DMaskFilters;
        if (list == null || list.size() <= 0) {
            return;
        }
        Iterator<Face3DMaskFilter> it = this.face3DMaskFilters.iterator();
        while (it.hasNext()) {
            it.next().setCapture(z, rect);
        }
    }

    public void setDefaultCameraDirection(boolean z) {
        this.isCameraFront = z;
    }

    public void setEffectTimeInfoByHaniId(kqe kqeVar, int i) {
        MultiStickerMaskFilter multiStickerMaskFilter = this.mMultiStickerMaskFilter;
        if (multiStickerMaskFilter != null) {
            multiStickerMaskFilter.setEffectTimeInfoByHaniId(kqeVar, i);
        }
    }

    public void setEnableSound(boolean z) {
        this.enableSoundPool = z;
    }

    public void setFinishListener(StickerMaskFinishListener stickerMaskFinishListener) {
        this.finishListener = stickerMaskFinishListener;
    }

    public void setGameScoreListener(GameScoreListener gameScoreListener) {
        MultiStickerMaskFilter multiStickerMaskFilter = this.mMultiStickerMaskFilter;
        if (multiStickerMaskFilter == null || !(multiStickerMaskFilter instanceof MultiStickerGameMaskFilter)) {
            return;
        }
        ((MultiStickerGameMaskFilter) multiStickerMaskFilter).setGameScoreListener(gameScoreListener);
    }

    public void setGameStickerDownVelocity(float f) {
        MultiStickerMaskFilter multiStickerMaskFilter = this.mMultiStickerMaskFilter;
        if (multiStickerMaskFilter != null) {
            multiStickerMaskFilter.setDownVelocity(f);
        }
    }

    public void setGestureDetectInterval(int i) {
        CVDetector cVDetector = this.gestureDetector;
        if (cVDetector != null) {
            cVDetector.setDetectInterval(i);
        }
    }

    public void setGestureDetectedListener(GestureDetectedListener gestureDetectedListener) {
        this.gestureDetectedListener = gestureDetectedListener;
    }

    @Override // p149l.e3w
    public void setIntensity(float f) {
        if (this.mLookupFilter != null) {
            this.mLookupFilter.setIntensity(f);
        }
    }

    public void setIsUseStickerOptimization(boolean z) {
    }

    @Override // com.momo.mcamera.mask.StickerGroupFilter, com.momo.mcamera.mask.FaceDetectGroupFilter, p149l.etf
    public void setMMCVInfo(pjw pjwVar) {
        boolean z;
        int iCalculateFaceIndex;
        int i;
        PointF centerPoint;
        int i2;
        if (pjwVar == null) {
            return;
        }
        this.mCurCVInfo = pjwVar;
        synchronized (getLockObject()) {
            try {
                FaceMaskFilter faceMaskFilter = this.mFaceMaskFilter;
                if (faceMaskFilter != null) {
                    faceMaskFilter.setMMCVInfo(pjwVar);
                }
                ConcurrentHashMap<String, StickerBlendFilter> concurrentHashMap = this.mStickerFilterMap;
                if (concurrentHashMap != null && concurrentHashMap.size() > 0) {
                    for (StickerBlendFilter stickerBlendFilter : this.mStickerFilterMap.values()) {
                        if (stickerBlendFilter.segmentFilter != null) {
                            stickerBlendFilter.setMMCVInfo(pjwVar);
                        }
                    }
                }
                EffectGroupFilter effectGroupFilter = this.mEffectGroupFilter;
                if (effectGroupFilter != null) {
                    effectGroupFilter.setMMCVInfo(pjwVar);
                }
                ExpressDetector expressDetector = this.expressDetector;
                if (expressDetector != null) {
                    expressDetector.setMMCVInfo(pjwVar);
                }
                CVDetector cVDetector = this.gestureDetector;
                if (cVDetector != null) {
                    cVDetector.setMMCVInfo(pjwVar);
                }
                StickerGestureTrackingFilter stickerGestureTrackingFilter = this.mGestureTrackingFilter;
                if (stickerGestureTrackingFilter != null) {
                    stickerGestureTrackingFilter.setMMCVInfo(pjwVar);
                }
                VideoMergeGroupFilter videoMergeGroupFilter = this.videoMergeGroupFilter;
                if (videoMergeGroupFilter != null) {
                    videoMergeGroupFilter.setMMCVInfo(pjwVar);
                }
                processDistortionState();
                char c = 'D';
                int i3 = 1;
                int i4 = 0;
                if (pjwVar.m169950n() <= 0) {
                    this.lastFacesCnt = 0;
                    iCalculateFaceIndex = 0;
                    z = false;
                } else if (this.multiSwitchEnable) {
                    iCalculateFaceIndex = calculateFaceIndex(pjwVar);
                    float[] fArrM220018l = pjwVar.m169946j(iCalculateFaceIndex).m220018l();
                    this.lastFacePosition.set(fArrM220018l[0], fArrM220018l[68]);
                    this.lastFacesCnt = pjwVar.m169950n();
                    z = true;
                } else {
                    z = true;
                    iCalculateFaceIndex = 0;
                }
                this.filterTriggerManager.setTriggerFaceIndex(iCalculateFaceIndex);
                this.filterTriggerManager.adjustStateBy(pjwVar);
                if (this.mMultiStickerMaskFilter != null) {
                    StickerBlendFilter.StickerStateChangeListener stickerStateChangeListener = this.stickerStateChangeListener;
                    if (stickerStateChangeListener != null) {
                        stickerStateChangeListener.faceDetected(z);
                    }
                    this.mMultiStickerMaskFilter.setMainFaceIndex(iCalculateFaceIndex);
                    this.mMultiStickerMaskFilter.setFilterTriggerManager(this.filterTriggerManager);
                    this.mMultiStickerMaskFilter.setMmcvBoxes(this.mmcvBoxes);
                    this.mMultiStickerMaskFilter.setMMCVInfo(pjwVar);
                }
                List<Face3DMaskFilter> list = this.face3DMaskFilters;
                if (list != null && list.size() > 0) {
                    for (Face3DMaskFilter face3DMaskFilter : this.face3DMaskFilters) {
                        if (face3DMaskFilter.needFaceDetect()) {
                            face3DMaskFilter.setMMCVInfo(pjwVar);
                        }
                    }
                }
                int i5 = 6;
                int i6 = 5;
                int i7 = 99;
                int i8 = 3;
                int i9 = 2;
                if (pjwVar.m169950n() == 0) {
                    for (StickerBlendFilter stickerBlendFilter2 : this.mStickerFilterMap.values()) {
                        FaceDetectFilter.FaceDetectParam faceDetectParam = new FaceDetectFilter.FaceDetectParam();
                        if (!TextUtils.isEmpty(stickerBlendFilter2.sticker.getLayerType()) && stickerBlendFilter2.sticker.getLayerType().equals("object_follower")) {
                            stickerBlendFilter2.clearPoints();
                            drawGestureFilter(stickerBlendFilter2, faceDetectParam);
                        } else if (!stickerBlendFilter2.sticker.isAlwaysShow()) {
                            stickerBlendFilter2.clearPoints();
                        } else if (stickerBlendFilter2.sticker.getType() == 1) {
                            stickerBlendFilter2.clearPoints();
                            drawFixedSticker(stickerBlendFilter2, faceDetectParam);
                        } else if (stickerBlendFilter2.sticker.getType() == 2) {
                            stickerBlendFilter2.clearPoints();
                            drawFullScreenFixed(stickerBlendFilter2, faceDetectParam);
                        } else if (stickerBlendFilter2.sticker.getType() == 3) {
                            stickerBlendFilter2.clearPoints();
                            drawPositionSetFixed(stickerBlendFilter2, faceDetectParam);
                        } else if (stickerBlendFilter2.sticker.getType() == 99) {
                            stickerBlendFilter2.clearPoints();
                            drawScaleCenterCrop(stickerBlendFilter2, faceDetectParam);
                        } else if (stickerBlendFilter2.sticker.getType() == 5) {
                            stickerBlendFilter2.clearPoints();
                            drawAbsolutePostion(stickerBlendFilter2, faceDetectParam);
                        } else if (stickerBlendFilter2.sticker.getType() == 6) {
                            stickerBlendFilter2.clearPoints();
                            drawAbsolutePostionUseStcikerDim(stickerBlendFilter2, faceDetectParam);
                        } else if (stickerBlendFilter2.sticker.getType() == 7) {
                            stickerBlendFilter2.clearPoints();
                            drawAbsPostionAdjustResolution(stickerBlendFilter2, faceDetectParam);
                        }
                    }
                    StickerBlendFilter.StickerStateChangeListener stickerStateChangeListener2 = this.stickerStateChangeListener;
                    if (stickerStateChangeListener2 != null) {
                        stickerStateChangeListener2.faceDetected(false);
                    }
                } else {
                    StickerBlendFilter.StickerStateChangeListener stickerStateChangeListener3 = this.stickerStateChangeListener;
                    if (stickerStateChangeListener3 != null) {
                        stickerStateChangeListener3.faceDetected(true);
                    }
                    int iM169950n = pjwVar.m169950n() - 1;
                    while (iM169950n >= 0) {
                        for (StickerBlendFilter stickerBlendFilter3 : this.mStickerFilterMap.values()) {
                            Sticker sticker = stickerBlendFilter3.sticker;
                            char c2 = c;
                            FaceDetectFilter.FaceDetectParam faceDetectParam2 = new FaceDetectFilter.FaceDetectParam();
                            int i10 = i4;
                            faceDetectParam2.mmcvBoxes = this.mmcvBoxes;
                            if (!TextUtils.isEmpty(stickerBlendFilter3.sticker.getLayerType()) && stickerBlendFilter3.sticker.getLayerType().equals("object_follower")) {
                                stickerBlendFilter3.clearPoints();
                                drawGestureFilter(stickerBlendFilter3, faceDetectParam2);
                            } else if (sticker.getType() == i3) {
                                stickerBlendFilter3.clearPoints();
                                drawFixedSticker(stickerBlendFilter3, faceDetectParam2);
                            } else if (sticker.getType() == i9) {
                                stickerBlendFilter3.clearPoints();
                                drawFullScreenFixed(stickerBlendFilter3, faceDetectParam2);
                            } else if (sticker.getType() == i8) {
                                stickerBlendFilter3.clearPoints();
                                drawPositionSetFixed(stickerBlendFilter3, faceDetectParam2);
                            } else if (stickerBlendFilter3.sticker.getType() == i7) {
                                stickerBlendFilter3.clearPoints();
                                drawScaleCenterCrop(stickerBlendFilter3, faceDetectParam2);
                            } else if (stickerBlendFilter3.sticker.getType() == i6) {
                                stickerBlendFilter3.clearPoints();
                                drawAbsolutePostion(stickerBlendFilter3, faceDetectParam2);
                            } else if (stickerBlendFilter3.sticker.getType() == i5) {
                                stickerBlendFilter3.clearPoints();
                                drawAbsolutePostionUseStcikerDim(stickerBlendFilter3, faceDetectParam2);
                            } else if (stickerBlendFilter3.sticker.getType() == 7) {
                                stickerBlendFilter3.clearPoints();
                                drawAbsPostionAdjustResolution(stickerBlendFilter3, faceDetectParam2);
                            } else {
                                if (sticker.getType() == 0) {
                                    stickerBlendFilter3.clearPoints();
                                    zsf zsfVarM169946j = pjwVar.m169946j(iM169950n);
                                    float[] fArrM220018l2 = zsfVarM169946j.m220018l();
                                    float f = fArrM220018l2[sticker.getFacePositionLeft()];
                                    float f2 = fArrM220018l2[sticker.getFacePositionLeft() + 68];
                                    float f3 = fArrM220018l2[sticker.getFacePositionRight()];
                                    float f4 = fArrM220018l2[sticker.getFacePositionRight() + 68];
                                    PointF pointF = new PointF(f, f2);
                                    PointF pointF2 = new PointF(f3, f4);
                                    float fM220015f = zsfVarM169946j.m220015f();
                                    PointF pointF3 = new PointF(sticker.getOffsetX() * getAdjustWidthScale(), sticker.getOffsetY() * getAdjustWidthScale());
                                    rotatePoint(pointF3, fM220015f);
                                    if (sticker.hasCenterPoint()) {
                                        i = i9;
                                        centerPoint = new PointF(fArrM220018l2[sticker.getCenterIndex()], fArrM220018l2[sticker.getCenterIndex() + 68]);
                                    } else {
                                        i = i9;
                                        if (sticker.getPointIndexes().length == i3) {
                                            int i11 = sticker.getPointIndexes()[i10];
                                            centerPoint = new PointF(fArrM220018l2[i11], fArrM220018l2[i11 + 68]);
                                        } else {
                                            int i12 = sticker.getPointIndexes()[i10];
                                            int i13 = sticker.getPointIndexes()[i3];
                                            centerPoint = getCenterPoint(new PointF(fArrM220018l2[i12], fArrM220018l2[i12 + 68]), new PointF(fArrM220018l2[i13], fArrM220018l2[i13 + 68]));
                                        }
                                    }
                                    float f5 = ((float) getmDistancePoint(pointF, pointF2)) / 180.0f;
                                    float adjustWidthScale = (f5 / getAdjustWidthScale()) * ((sticker.getImageWidth() * getAdjustWidthScale()) / (getWidth() / 2));
                                    centerPoint.x += (pointF3.x * f5) / getAdjustWidthScale();
                                    centerPoint.y += (pointF3.y * f5) / getAdjustWidthScale();
                                    PointF pointF4 = new PointF(centerPoint.x / getWidth(), centerPoint.y / getHeight());
                                    faceDetectParam2.scaleW = adjustWidthScale;
                                    faceDetectParam2.scaleH = adjustWidthScale;
                                    if (sticker.isComic()) {
                                        faceDetectParam2.centerPoint = pointF4;
                                        if ((fM220015f > 90.0f || fM220015f < 0.0f) && (fM220015f < 270.0f || fM220015f > 360.0f)) {
                                            faceDetectParam2.angle = 180.0f;
                                        } else {
                                            faceDetectParam2.angle = 0.0f;
                                        }
                                    } else {
                                        faceDetectParam2.centerPoint = pointF4;
                                        faceDetectParam2.angle = fM220015f;
                                    }
                                    faceDetectParam2.points68 = pjwVar.m169946j(i10).m220018l();
                                    faceDetectParam2.points96 = pjwVar.m169946j(i10).m220019m();
                                    faceDetectParam2.points104 = pjwVar.m169946j(i10).m220016j();
                                    float[] fArrM220032z = pjwVar.m169946j(i10).m220032z();
                                    if (fArrM220032z != null && fArrM220032z.length > 0) {
                                        faceDetectParam2.warpedPoints104 = fArrM220032z;
                                    }
                                    faceDetectParam2.filterTrigerManager = this.filterTriggerManager;
                                    i2 = 0;
                                    faceDetectParam2.euler_angles = pjwVar.m169946j(0).m220012c();
                                    stickerBlendFilter3.setDetectParam(faceDetectParam2);
                                }
                                i4 = i2;
                                c = c2;
                                iM169950n = iM169950n;
                                i9 = i;
                                i3 = 1;
                                i5 = 6;
                                i6 = 5;
                                i7 = 99;
                                i8 = 3;
                            }
                            iM169950n = iM169950n;
                            i = i9;
                            i2 = i10;
                            i4 = i2;
                            c = c2;
                            iM169950n = iM169950n;
                            i9 = i;
                            i3 = 1;
                            i5 = 6;
                            i6 = 5;
                            i7 = 99;
                            i8 = 3;
                        }
                        iM169950n--;
                        c = c;
                        i3 = 1;
                        i5 = 6;
                        i6 = 5;
                        i7 = 99;
                        i8 = 3;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setScaleHeight(int i) {
        this.scaleHeight = i;
    }

    public void setScaleWidth(int i) {
        this.scaleWidth = i;
    }

    public void setStickerStateChangeListener(StickerBlendFilter.StickerStateChangeListener stickerStateChangeListener) {
        this.stickerStateChangeListener = stickerStateChangeListener;
    }

    public void setThinFace(float f) {
        this.mThinFace = f;
    }

    @Override // p149l.q7m
    public void setTimeStamp(long j) {
        Iterator<StickerBlendFilter> it = this.mStickerFilterMap.values().iterator();
        while (it.hasNext()) {
            it.next().setTimeStamp(j);
        }
        MultiStickerMaskFilter multiStickerMaskFilter = this.mMultiStickerMaskFilter;
        if (multiStickerMaskFilter != null) {
            multiStickerMaskFilter.setTimeStamp(j);
        }
        if (this.enableSelfRender) {
            setMMCVInfo(new pjw());
        }
        if (this.mEffectGroupFilter != null) {
            if (this.mLastRenderTime == 0) {
                this.mLastRenderTime = System.currentTimeMillis();
            }
            this.mEffectGroupFilter.setTimeStamp(j - this.mLastRenderTime);
        }
    }

    public void setVoiceBytes(byte[] bArr) {
        synchronized (this.listLock) {
            try {
                SoundInputFilter soundInputFilter = this.mSoundInput;
                if (soundInputFilter != null) {
                    soundInputFilter.setSoundBytes(bArr);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void startExpressDetect(String str) {
        MDLog.m7395i(MDLogTag.FILTER_TAG, "StickerAdjustFilter startExpressDetect");
        if (this.expressDetector == null) {
            this.expressDetector = new ExpressDetector();
        }
        this.expressDetector.setModelPath(str);
        this.expressDetector.startDetect();
    }

    public void startGestureDetect(boolean z, int i) {
        MDLog.m7395i(MDLogTag.FILTER_TAG, "StickerAdjustFilter startGestureDetect useNewVersion " + z + " handGestureType = " + i);
        DataDotUtils.getInstance().getRecoderDataDotInfo().setCameraUseHandGesture(true);
        if (this.gestureDetectorListener == null) {
            this.gestureDetectorListener = new CVDetector.GestureDetectorListener() { // from class: com.momo.mcamera.mask.StickerAdjustFilter.1
                @Override // com.momo.mcamera.mask.gesture.CVDetector.GestureDetectorListener
                public void gestureDetect(MMCVBoxes mMCVBoxes) {
                    if (mMCVBoxes == null || mMCVBoxes.getDetectResult() == null || mMCVBoxes.getDetectResult().length <= 0) {
                        StickerAdjustFilter.this.mmcvBoxes = null;
                        if (StickerAdjustFilter.this.mGestureTrackingFilter != null) {
                            StickerAdjustFilter.this.mGestureTrackingFilter.gestureMiss();
                            return;
                        }
                        return;
                    }
                    StickerAdjustFilter.this.mmcvBoxes = mMCVBoxes;
                    for (MMBox mMBox : mMCVBoxes.getDetectResult()) {
                        String str = mMBox.class_name_;
                        if (mMBox.class_index_ > 0 && !TextUtils.isEmpty(str)) {
                            StickerAdjustFilter.this.addGestureMaskModel(str);
                            if (StickerAdjustFilter.this.gestureDetectedListener != null) {
                                StickerAdjustFilter.this.gestureDetectedListener.gestureDetected(str);
                            }
                        }
                    }
                }
            };
        }
        CVDetector cVDetector = this.gestureDetector;
        if (cVDetector == null) {
            if (z) {
                NewHandGestureDetector newHandGestureDetector = new NewHandGestureDetector();
                newHandGestureDetector.setGestureDetectorListener(this.gestureDetectorListener);
                this.gestureDetector = newHandGestureDetector;
            } else {
                this.gestureDetector = new GestureDetector(this.gestureDetectorListener);
            }
        } else if ((cVDetector instanceof GestureDetector) && z) {
            NewHandGestureDetector newHandGestureDetector2 = new NewHandGestureDetector();
            newHandGestureDetector2.setGestureDetectorListener(this.gestureDetectorListener);
            this.gestureDetector = newHandGestureDetector2;
        } else if ((cVDetector instanceof NewHandGestureDetector) && !z) {
            this.gestureDetector = new GestureDetector(this.gestureDetectorListener);
        }
        CVDetector cVDetector2 = this.gestureDetector;
        if (cVDetector2 instanceof NewHandGestureDetector) {
            ((NewHandGestureDetector) cVDetector2).setHandGestureType(i);
        }
        this.gestureDetector.setGestureDetectorListener(this.gestureDetectorListener);
        this.gestureDetector.startDetect();
    }

    public void startPlayingTailMoving() {
        MultiStickerMaskFilter multiStickerMaskFilter = this.mMultiStickerMaskFilter;
        if (multiStickerMaskFilter == null || !(multiStickerMaskFilter instanceof MultiStickerGameMaskFilter)) {
            return;
        }
        ((MultiStickerGameMaskFilter) multiStickerMaskFilter).playingTailMoving();
    }

    public void stopExpressDetect() {
        if (this.expressDetector != null) {
            MDLog.m7395i(MDLogTag.FILTER_TAG, "StickerAdjustFilter stopExpressDetect");
            this.expressDetector.stopDetect();
        }
    }

    public void stopGestureDetect() {
        if (this.gestureDetector != null) {
            MDLog.m7395i(MDLogTag.FILTER_TAG, "StickerAdjustFilter stopGestureDetect ");
            this.mmcvBoxes = null;
            this.gestureDetector.stopDetect();
        }
    }

    public void switchCamera(boolean z) {
        MDLog.m7395i(MDLogTag.FILTER_TAG, "StickerAdjustFilter switchCamera ");
        this.isCameraFront = z;
        List<Face3DMaskFilter> list = this.face3DMaskFilters;
        if (list == null || list.size() <= 0) {
            return;
        }
        Iterator<Face3DMaskFilter> it = this.face3DMaskFilters.iterator();
        while (it.hasNext()) {
            it.next().setCamera(z);
        }
    }

    public void unlockTexture() {
        Iterator<StickerBlendFilter> it = this.mStickerFilterMap.values().iterator();
        while (it.hasNext()) {
            it.next().unlockTexture();
        }
    }

    public void updateGameFixStickerScore(Bitmap bitmap) {
        MultiStickerMaskFilter multiStickerMaskFilter;
        if (isBitmapValid(bitmap) && (multiStickerMaskFilter = this.mMultiStickerMaskFilter) != null && (multiStickerMaskFilter instanceof MultiStickerGameMaskFilter)) {
            ((MultiStickerGameMaskFilter) multiStickerMaskFilter).updateGameFixStickerScore(bitmap);
        }
    }

    public void updateRectForTrigger(PointF pointF, float f, float f2, boolean z, int i) {
        synchronized (getLockObject()) {
            try {
                if (this.mMultiStickerMaskFilter != null) {
                    FaceDetectFilter.FaceDetectParam faceDetectParam = new FaceDetectFilter.FaceDetectParam();
                    faceDetectParam.angle = f;
                    faceDetectParam.centerPoint = new PointF(pointF.x, pointF.y);
                    faceDetectParam.triggerType = "tracking_rect";
                    float f3 = f2 * 0.5f;
                    faceDetectParam.scaleH = f3;
                    faceDetectParam.scaleW = f3;
                    this.mMultiStickerMaskFilter.setHaniStickerParam(faceDetectParam, i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void setplayStatusListener(cnw cnwVar) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addGestureMaskModel(String str) {
        MDLog.m7395i(MDLogTag.FILTER_TAG, "StickerAdjustFilter addGestureMaskModel ");
        addGestureMaskModel(str, this.mGestureTriggerModels.get(str));
    }

    public void startGestureDetect() {
        startGestureDetect(false, 0);
    }
}
