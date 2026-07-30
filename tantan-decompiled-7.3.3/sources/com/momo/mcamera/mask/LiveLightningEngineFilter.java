package com.momo.mcamera.mask;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.opengl.GLES20;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import com.core.glcore.util.DetectDelayStopHelper;
import com.core.glcore.util.HandSegmentHelper;
import com.core.glcore.util.SegmentHelper;
import com.cosmos.mdlog.MDLog;
import com.effectsar.labcv.effectsdk.PortraitMatting;
import com.immomo.mmutil.task.C3949c;
import com.momo.mcamera.mask.cartoon.CartoonMutex;
import com.momo.mcamera.mask.cartoon.CartoonProcess;
import com.momo.mcamera.mask.facewarp.FaceWarpProcessor;
import com.momo.mcamera.mask.segment.ByteDanceSegmentHelper;
import com.momo.mcamera.mask.segment.SegmentFilterFactory;
import com.momo.xeengine.event.DataEvent;
import com.momo.xeengine.event.IXEventDispatcher;
import com.momo.xeengine.lightningrender.ILightningRender;
import com.momo.xeengine.lightningrender.LightningRenderBuilder;
import com.momo.xeengine.lightningrender.StickerModel;
import com.momo.xeengine.p049cv.bean.CVSegmentInfo;
import com.momo.xeengine.script.ScriptBridge;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Map;
import p153l.j8g0;
import p153l.lej;
import p153l.lnw;
import p153l.muf;
import p153l.omw;
import p153l.sej;
import p153l.umw;
import p153l.wej;

/* JADX INFO: loaded from: classes8.dex */
public class LiveLightningEngineFilter extends FaceDetectFilter {
    private int antialias;
    private CartoonMutex cartoonMutex;
    private CartoonProcess cartoonProcess;
    private boolean clearFaceInfo;
    private int cropHeight;
    private int cropWidth;
    private boolean delayInit;
    private boolean delayLoadForLive;
    private boolean enableBeautyFace;
    private volatile boolean enableRenderBeauty;
    private LightningEngineHelper engineHelper;
    private String engineRootPath;
    private FaceWarpProcessor faceWarpProcessor;
    private Runnable initCallback;
    private boolean isCapture;
    private boolean isDrawBackGround;
    private boolean isHandSegMent;
    private boolean isHeartProgressDetector;
    private volatile boolean isSegment;
    private ILightningRender lightningRender;
    private HashMap<String, AdditionalInfo> mAdditionalInfos;
    private Capture3DImageListener mCapture3DImageListener;
    private Rect mCaptureRect;
    private Map<String, Float> map;
    umw mmcvFrame;
    omw mmcvInfo;
    lnw params;
    private String segmentType;
    private long threadID;

    public LiveLightningEngineFilter(Context context, boolean z, boolean z2) {
        this.antialias = 1;
        this.isCapture = false;
        this.isDrawBackGround = true;
        this.mCapture3DImageListener = null;
        this.mCaptureRect = null;
        this.mAdditionalInfos = new HashMap<>();
        this.isSegment = false;
        this.segmentType = "momo";
        this.enableBeautyFace = true;
        this.delayInit = false;
        this.clearFaceInfo = false;
        this.engineRootPath = "";
        this.delayLoadForLive = false;
        this.enableRenderBeauty = true;
        this.initCallback = null;
        this.threadID = -1L;
        this.map = new HashMap();
        this.mmcvFrame = new umw();
        this.params = new lnw(4);
        this.delayLoadForLive = z2;
        LightningRenderBuilder lightningRenderBuilder = new LightningRenderBuilder();
        lightningRenderBuilder.setDelay(z2);
        this.lightningRender = lightningRenderBuilder.build();
        FaceWarpProcessor faceWarpProcessor = new FaceWarpProcessor();
        this.faceWarpProcessor = faceWarpProcessor;
        faceWarpProcessor.setWarpType(104);
        this.cartoonProcess = new CartoonProcess();
        this.enableDepthBuffer = true;
        this.useCache = false;
        if (z) {
            this.delayInit = true;
        } else {
            this.lightningRender.init();
            Runnable runnable = this.initCallback;
            if (runnable != null) {
                runnable.run();
            }
            this.lightningRender.getLogger().setLogEnable(true);
            this.engineHelper = new LightningEngineHelper(this.lightningRender);
        }
        this.cartoonMutex = new CartoonMutex();
    }

    private void get3DRenderImage() {
        final ByteBuffer byteBufferAllocate;
        Rect rect = this.mCaptureRect;
        if (rect != null) {
            int i = rect.right;
            int i2 = rect.left;
            int i3 = i - i2;
            this.cropWidth = i3;
            int i4 = rect.bottom;
            int i5 = rect.top;
            int i6 = i4 - i5;
            this.cropHeight = i6;
            int i7 = (this.height - i5) - i6;
            byteBufferAllocate = ByteBuffer.allocate(i3 * i6 * 4);
            byteBufferAllocate.position(0);
            GLES20.glReadPixels(i2, i7, this.cropWidth, this.cropHeight, 6408, 5121, byteBufferAllocate);
        } else {
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(getWidth() * getHeight() * 4);
            byteBufferAllocate2.position(0);
            GLES20.glReadPixels(0, 0, getWidth(), getHeight(), 6408, 5121, byteBufferAllocate2);
            byteBufferAllocate = byteBufferAllocate2;
        }
        byteBufferAllocate.position(0);
        this.isCapture = false;
        C3949c.m19427d(2, new Runnable() { // from class: com.momo.mcamera.mask.LiveLightningEngineFilter.1
            @Override // java.lang.Runnable
            public void run() {
                Rect rect2 = LiveLightningEngineFilter.this.mCaptureRect;
                LiveLightningEngineFilter liveLightningEngineFilter = LiveLightningEngineFilter.this;
                Bitmap bitmapCreateBitmap = rect2 != null ? Bitmap.createBitmap(liveLightningEngineFilter.cropWidth, LiveLightningEngineFilter.this.cropHeight, Bitmap.Config.ARGB_8888) : Bitmap.createBitmap(((wej) liveLightningEngineFilter).width, ((wej) LiveLightningEngineFilter.this).height, Bitmap.Config.ARGB_8888);
                bitmapCreateBitmap.copyPixelsFromBuffer(byteBufferAllocate);
                if (LiveLightningEngineFilter.this.mCapture3DImageListener != null) {
                    Matrix matrix = new Matrix();
                    matrix.postScale(1.0f, -1.0f);
                    matrix.postRotate(0.0f);
                    Rect rect3 = LiveLightningEngineFilter.this.mCaptureRect;
                    LiveLightningEngineFilter liveLightningEngineFilter2 = LiveLightningEngineFilter.this;
                    LiveLightningEngineFilter.this.mCapture3DImageListener.get3DRenderImage(rect3 != null ? Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, liveLightningEngineFilter2.cropWidth, LiveLightningEngineFilter.this.cropHeight, matrix, true) : Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, ((wej) liveLightningEngineFilter2).width, ((wej) LiveLightningEngineFilter.this).height, matrix, true));
                }
            }
        });
    }

    private StickerModel makeEngineModel(MaskModel maskModel, Sticker sticker) {
        String string;
        StickerModel stickerModel = new StickerModel();
        String xengineSearchPath = maskModel.getXengineSearchPath();
        if (xengineSearchPath != null && !xengineSearchPath.isEmpty()) {
            String xengineEsPath = maskModel.getXengineEsPath();
            StringBuilder sb = new StringBuilder();
            sb.append(xengineEsPath);
            String str = File.separator;
            sb.append(str);
            sb.append(maskModel.getXengineSearchPath());
            sb.append(str);
            sb.append(sticker.getImagePreName());
            sb.append(str);
            string = sb.toString();
        } else if (maskModel.getFolderPath() != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(maskModel.getFolderPath());
            String str2 = File.separator;
            sb2.append(str2);
            sb2.append(sticker.getImagePreName());
            sb2.append(str2);
            string = sb2.toString();
        } else {
            string = sticker.getImagePreName() + File.separator;
        }
        stickerModel.setAssetPath(string);
        stickerModel.setStickerId(j8g0.m143833c(string));
        stickerModel.setBusinessType(String.valueOf(maskModel.getModelType()));
        stickerModel.setDuration(maskModel.getDuration() > 0 ? maskModel.getDuration() : -1L);
        return stickerModel;
    }

    private void processHandSegment() {
        ILightningRender iLightningRender = this.lightningRender;
        if (iLightningRender == null || iLightningRender.getEventDispatcher() == null) {
            return;
        }
        IXEventDispatcher eventDispatcher = this.lightningRender.getEventDispatcher();
        if (!this.isHandSegMent) {
            eventDispatcher.dispatchSegmentInfo(new CVSegmentInfo());
            return;
        }
        CVSegmentInfo cvSegmentInfo = HandSegmentHelper.getCvSegmentInfo();
        if (cvSegmentInfo != null && cvSegmentInfo.getWarpMat() != null && cvSegmentInfo.getDatas() != null) {
            cvSegmentInfo.setFlipShowX(this.mmcvInfo.f148014a);
        }
        eventDispatcher.dispatchSegmentInfo(cvSegmentInfo);
    }

    private void processSegment() {
        if (TextUtils.equals(this.segmentType, SegmentFilterFactory.BYTEDANCE)) {
            processSegmentByByteDance();
        } else {
            processSegmentByMomo();
        }
    }

    private void processSegmentByByteDance() {
        byte[] bArr;
        omw omwVar = this.mmcvInfo;
        if (omwVar == null || (bArr = omwVar.f148020g) == null) {
            MDLog.m7445e("lclc", "mmcv is null or mmcv.frameInfo is null");
            return;
        }
        int iM168298m = omwVar.m168298m();
        int iM168305t = this.mmcvInfo.m168305t();
        omw omwVar2 = this.mmcvInfo;
        PortraitMatting.MattingMask mattingMaskProcess = ByteDanceSegmentHelper.process(bArr, iM168298m, iM168305t, omwVar2.f148017d, omwVar2.f148014a);
        if (mattingMaskProcess != null) {
            this.engineHelper.setSegmentInfo(mattingMaskProcess.getBuffer(), mattingMaskProcess.getHeight(), mattingMaskProcess.getWidth());
        }
    }

    private void processSegmentByMomo() {
        omw omwVar = this.mmcvInfo;
        if (omwVar == null || omwVar.f148020g == null) {
            MDLog.m7445e("LightingRending", "mmcv is null or mmcv.frameInfo is null");
            return;
        }
        lnw lnwVar = new lnw(4);
        this.mmcvFrame.m196802h(17);
        this.mmcvFrame.m196801g(this.mmcvInfo.f148020g);
        this.mmcvFrame.m196800f(this.mmcvInfo.f148020g.length);
        this.mmcvFrame.m196807m(this.mmcvInfo.m168305t());
        this.mmcvFrame.m196804j(this.mmcvInfo.m168298m());
        this.mmcvFrame.m196806l(this.mmcvInfo.m168305t());
        lnwVar.m155021p(SegmentHelper.isFrontCamera());
        lnwVar.m154993A(SegmentHelper.getRotateDegree());
        lnwVar.m155031z(SegmentHelper.getRestoreDegree());
        this.engineHelper.setSegmentInfo(SegmentHelper.processInfo(this.mmcvFrame, lnwVar));
    }

    public void add3DMaskModel(MaskModel maskModel) {
        CartoonProcess cartoonProcess;
        String string;
        String folderPath = maskModel.getFolderPath();
        String xengineSearchPath = maskModel.getXengineSearchPath();
        if (xengineSearchPath != null && !xengineSearchPath.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            sb.append(maskModel.getXengineEsPath());
            String str = File.separator;
            sb.append(str);
            sb.append(xengineSearchPath);
            sb.append(str);
            folderPath = sb.toString();
        } else if (folderPath != null) {
            folderPath = folderPath + File.separator;
        }
        if (folderPath != null) {
            addLibraryPath(folderPath);
        }
        boolean z = false;
        for (Sticker sticker : maskModel.getStickers()) {
            int iIndexOf = maskModel.getStickers().indexOf(sticker);
            if (sticker.getStickerType() == null || sticker.getStickerType().isEmpty()) {
                sticker.setStickerType(maskModel.getModelType() + "_" + iIndexOf);
            }
            if (xengineSearchPath != null && !xengineSearchPath.isEmpty()) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(maskModel.getXengineEsPath());
                String str2 = File.separator;
                sb2.append(str2);
                sb2.append(xengineSearchPath);
                sb2.append(str2);
                sb2.append(sticker.getImagePreName());
                sb2.append(str2);
                string = sb2.toString();
            } else if (maskModel.getFolderPath() != null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(maskModel.getFolderPath());
                String str3 = File.separator;
                sb3.append(str3);
                sb3.append(sticker.getImagePreName());
                sb3.append(str3);
                string = sb3.toString();
            } else {
                string = null;
            }
            if (string != null) {
                addLibraryPath(string);
            }
            addEnginStickerModel(makeEngineModel(maskModel, sticker));
            if (sticker.getMask() != null && sticker.getMask().getType() != null && !MaskModel.faceWarpTypeSet.contains(sticker.getMask().getType())) {
                setFaceWarpMapParams(sticker.getMask().getType(), sticker.getMask().getStrength());
                z = true;
            }
        }
        if (!z) {
            clearFaceWarpMapParams();
        }
        setAdditionalInfo(maskModel.getName(), maskModel.getAdditionalInfo());
        if (maskModel.getAdditionalInfo().isCartoonFaceEnable() && (cartoonProcess = this.cartoonProcess) != null) {
            cartoonProcess.switchCartoon();
        }
        this.cartoonMutex.addMaskModel(maskModel, this.lightningRender, this.faceWarpProcessor);
    }

    public void addEnginStickerModel(StickerModel stickerModel, ILightningRender.StickerListener stickerListener) {
        ILightningRender iLightningRender = this.lightningRender;
        if (iLightningRender != null) {
            iLightningRender.getStickerLevel().add(stickerModel);
            this.lightningRender.getStickerLevel().addListener(stickerListener);
        }
    }

    public void addLibraryPath(String str) {
        ILightningRender iLightningRender = this.lightningRender;
        if (iLightningRender != null) {
            iLightningRender.addLibraryPath(str);
        }
    }

    public void addMakeup(String str) {
        if (this.lightningRender == null || this.cartoonMutex.interceptMakeupPath(str)) {
            return;
        }
        this.lightningRender.addLibraryPath(str);
        this.lightningRender.getMakeupLevel().addEffect(str);
    }

    @Override // com.momo.mcamera.mask.FaceDetectFilter
    public void cancelDraw() {
    }

    public void changeOrigin(boolean z) {
    }

    public boolean checkCurrentThread() {
        long j = this.threadID;
        return j != -1 && j == Thread.currentThread().getId();
    }

    public void clearAllEngineStickerModel() {
        ILightningRender iLightningRender = this.lightningRender;
        if (iLightningRender != null) {
            iLightningRender.getStickerLevel().removeAll();
        }
        this.cartoonMutex.revertMicroBodyMakeupValues(this.lightningRender, this.faceWarpProcessor);
        this.faceWarpProcessor.clearFaceWarpMapParams();
        this.isSegment = false;
        this.isHandSegMent = false;
    }

    public void clearEngineStickerModelWidthId(String str) {
        ILightningRender iLightningRender = this.lightningRender;
        if (iLightningRender != null) {
            iLightningRender.getStickerLevel().removeByID(str);
        }
    }

    public void clearEngineStickerModelWithBussineType(String str) {
        ILightningRender iLightningRender = this.lightningRender;
        if (iLightningRender != null) {
            iLightningRender.getStickerLevel().removeByBusinessType(str);
        }
    }

    public void clearFaceWarpMapParams() {
        FaceWarpProcessor faceWarpProcessor = this.faceWarpProcessor;
        if (faceWarpProcessor != null) {
            faceWarpProcessor.clearFaceWarpMapParams();
        }
    }

    public void clearLookup0() {
        ILightningRender iLightningRender = this.lightningRender;
        if (iLightningRender != null) {
            iLightningRender.getLookupLevel().clear(0);
        }
    }

    public void clearLookup1() {
        ILightningRender iLightningRender = this.lightningRender;
        if (iLightningRender != null) {
            iLightningRender.getLookupLevel().clear(1);
        }
    }

    @Override // com.momo.mcamera.mask.FaceDetectFilter
    public void clearPoints() {
    }

    public boolean containMakeup() {
        ILightningRender iLightningRender = this.lightningRender;
        if (iLightningRender == null) {
            return false;
        }
        return iLightningRender.getMakeupLevel().isEffectActive();
    }

    public boolean delayInit() {
        if (this.engineHelper != null) {
            return false;
        }
        this.lightningRender.init();
        Runnable runnable = this.initCallback;
        if (runnable != null) {
            runnable.run();
        }
        this.lightningRender.getLogger().setLogEnable(true);
        if (!TextUtils.isEmpty(this.engineRootPath)) {
            this.lightningRender.addLibraryPath(this.engineRootPath);
        }
        this.engineHelper = new LightningEngineHelper(this.lightningRender);
        return true;
    }

    @Override // p153l.gfj, p153l.wej
    public void destroy() {
        super.destroy();
        ILightningRender iLightningRender = this.lightningRender;
        if (iLightningRender != null) {
            iLightningRender.release();
        }
        FaceWarpProcessor faceWarpProcessor = this.faceWarpProcessor;
        if (faceWarpProcessor != null) {
            faceWarpProcessor.release();
        }
        CartoonProcess cartoonProcess = this.cartoonProcess;
        if (cartoonProcess != null) {
            cartoonProcess.release();
        }
    }

    public void drawBgFrame() {
        int i = this.width;
        int i2 = this.antialias;
        GLES20.glViewport(0, 0, i * i2, this.height * i2);
        GLES20.glClearColor(getBackgroundRed(), getBackgroundGreen(), getBackgroundBlue(), getBackgroundAlpha());
        GLES20.glClear(16640);
        GLES20.glUseProgram(this.programHandle);
        passShaderValues();
        GLES20.glDrawArrays(5, 0, 4);
        GLES20.glDisableVertexAttribArray(this.positionHandle);
        GLES20.glDisableVertexAttribArray(this.texCoordHandle);
    }

    @Override // p153l.gfj
    public void drawSub() {
        DetectDelayStopHelper.getInstance().onNewFrame();
        if (this.isCapture) {
            this.isDrawBackGround = false;
        } else {
            this.isDrawBackGround = true;
        }
        if (this.isDrawBackGround) {
            drawBgFrame();
        }
        GLES20.glViewport(0, 0, this.width, this.height);
        GLES20.glEnable(3089);
        int width = getWidth() * this.antialias;
        int height = getHeight() * this.antialias;
        if (this.isSegment) {
            processSegment();
        }
        if (this.isHandSegMent) {
            processHandSegment();
        }
        initThreadID();
        if (checkCurrentThread() && this.enableRenderBeauty && this.lightningRender.renderTest(width, height)) {
            this.lightningRender.render(width, height);
        }
        GLES20.glDisable(2884);
        GLES20.glDisable(3089);
        if (this.isCapture && !this.isDrawBackGround) {
            get3DRenderImage();
        }
        if (this.mmcvInfo == null && !this.clearFaceInfo) {
            this.clearFaceInfo = true;
            this.engineHelper.clearFaceInfos();
        }
        this.mmcvInfo = null;
    }

    public void enableAntialias(boolean z) {
        this.antialias = z ? 2 : 1;
    }

    public void enableBeautyFace(boolean z) {
        ILightningRender iLightningRender = this.lightningRender;
        if (iLightningRender != null) {
            this.enableBeautyFace = z;
            iLightningRender.getBeautyLevel().setEnable(z);
            this.lightningRender.getLookupLevel().setEnable(z);
        }
    }

    public void enableBeautyFace1(boolean z) {
        ILightningRender iLightningRender = this.lightningRender;
        if (iLightningRender != null) {
            this.enableBeautyFace = z;
            if (z) {
                Float f = this.map.get("skin_smooth");
                this.lightningRender.getBeautyLevel().setFaceBeautyValue("skin_smooth", f == null ? 0.0f : f.floatValue());
                this.lightningRender.getBeautyLevel().setFaceBeautyValue("skin_whitening", f != null ? f.floatValue() : 0.0f);
            } else {
                iLightningRender.getBeautyLevel().setFaceBeautyValue("skin_smooth", 0.0f);
                this.lightningRender.getBeautyLevel().setFaceBeautyValue("skin_whitening", 0.0f);
            }
            this.lightningRender.getLookupLevel().setEnable(z);
        }
    }

    public void enableRenderBeauty(boolean z) {
        this.enableRenderBeauty = z;
    }

    public LightningEngineHelper getEngineDispather() {
        return this.engineHelper;
    }

    public ILightningRender getLightningRender() {
        return this.lightningRender;
    }

    public ScriptBridge getScriptBridge() {
        ILightningRender iLightningRender = this.lightningRender;
        if (iLightningRender == null) {
            return null;
        }
        return iLightningRender.getScriptBridge();
    }

    @Deprecated
    public ILightningRender getXEDirector() {
        return this.lightningRender;
    }

    public void handEvent(MotionEvent motionEvent, View view) {
        LightningEngineHelper lightningEngineHelper = this.engineHelper;
        if (lightningEngineHelper != null) {
            lightningEngineHelper.handEvent(motionEvent, view);
        }
    }

    @Override // p153l.gfj
    public void initFBO() {
        lej lejVar = this.glFrameBuffer;
        if (lejVar != null) {
            lejVar.m153898e();
        }
        if (this.useCache) {
            this.glFrameBuffer = sej.m185545d().m185548c(getWidth() * this.antialias, getHeight() * this.antialias);
        } else {
            this.glFrameBuffer = new lej(getWidth() * this.antialias, getHeight() * this.antialias);
        }
        boolean z = this.enableDepthBuffer;
        lej lejVar2 = this.glFrameBuffer;
        if (z) {
            lejVar2.m153894a(getWidth() * this.antialias, getHeight() * this.antialias);
        } else {
            lejVar2.m153895b(getWidth() * this.antialias, getHeight() * this.antialias);
        }
        int iGlCheckFramebufferStatus = GLES20.glCheckFramebufferStatus(36160);
        if (iGlCheckFramebufferStatus != 36053) {
            StringBuilder sb = new StringBuilder();
            sb.append(this);
            muf.m160142a(sb, iGlCheckFramebufferStatus, GLES20.glGetError());
        } else if (this.delayInit) {
            delayInit();
            this.delayInit = false;
        }
    }

    public void initThreadID() {
        if (this.threadID == -1) {
            this.threadID = Thread.currentThread().getId();
        }
    }

    public void loadWrapConfig(String str) {
        FaceWarpProcessor faceWarpProcessor = this.faceWarpProcessor;
        if (faceWarpProcessor != null) {
            faceWarpProcessor.loadWrapConfig(str);
        }
    }

    @Override // p153l.gfj, p153l.wej
    public void releaseFrameBuffer() {
        super.releaseFrameBuffer();
        this.mmcvInfo = null;
        this.antialias = 1;
    }

    public void removeMakeupAll() {
        if (this.lightningRender == null || this.cartoonMutex.interceptRemoveAllMakeup()) {
            return;
        }
        this.lightningRender.getMakeupLevel().removeAll();
    }

    public void removeMakeupWithType(String str) {
        if (this.lightningRender == null || this.cartoonMutex.interceptRemoveMakeup(str)) {
            return;
        }
        this.lightningRender.getMakeupLevel().removeWithType(str);
    }

    @Override // com.momo.mcamera.mask.FaceDetectFilter
    public void resetSticker(Sticker sticker) {
    }

    public void sendEvent(DataEvent dataEvent) {
        this.lightningRender.sendEvent(dataEvent);
    }

    public void setAdditionalInfo(String str, AdditionalInfo additionalInfo) {
        HashMap<String, AdditionalInfo> map = this.mAdditionalInfos;
        if (additionalInfo == null) {
            map.remove(str);
        } else {
            map.put(str, additionalInfo);
            if (additionalInfo.isBodySegmentDetectEnable()) {
                this.isSegment = true;
            } else {
                this.isSegment = false;
                this.isHandSegMent = additionalInfo.isHandSegmentDetector();
            }
            this.isHeartProgressDetector = additionalInfo.isHeartProgressDetector();
        }
        for (Map.Entry<String, AdditionalInfo> entry : this.mAdditionalInfos.entrySet()) {
            if (entry.getValue() != null && entry.getValue().isBodySegmentDetectEnable()) {
                this.isSegment = true;
                return;
            }
        }
    }

    public void setBodyBeautyEnable(boolean z) {
        ILightningRender iLightningRender = this.lightningRender;
        if (iLightningRender != null) {
            iLightningRender.setBeautyBodyEnable(z);
        }
    }

    public void setCapture(boolean z, Rect rect) {
        this.isCapture = z;
        this.mCaptureRect = rect;
    }

    public void setCapture3DImageListener(Capture3DImageListener capture3DImageListener) {
        this.mCapture3DImageListener = capture3DImageListener;
    }

    public void setCartoonFaceEnable(boolean z) {
        ILightningRender iLightningRender = this.lightningRender;
        if (iLightningRender != null) {
            iLightningRender.setCartoonFaceEnable(z);
        }
        CartoonMutex cartoonMutex = this.cartoonMutex;
        if (cartoonMutex != null) {
            cartoonMutex.setCartoonFaceEnable(z);
        }
    }

    public void setDeblurEnable(boolean z) {
    }

    public void setDeblurParams(float f, float f2, float f3) {
    }

    public void setEngineRootPath(String str) {
        ILightningRender iLightningRender = this.lightningRender;
        if (iLightningRender != null) {
            iLightningRender.addLibraryPath(str);
            this.engineRootPath = str;
        }
    }

    public void setFaceBeautyValue(String str, float f) {
        if (TextUtils.equals("skin_smooth", str) || TextUtils.equals("skin_whitening", str) || TextUtils.equals("skin_ruddy", str) || TextUtils.equals("eye_brighten", str) || TextUtils.equals("teeth_whiten", str) || TextUtils.equals("skin_sharpen", str) || TextUtils.equals("remove_nasolabial_floads", str) || TextUtils.equals("remove_pouch", str)) {
            if (this.lightningRender != null) {
                this.map.put(str, Float.valueOf(f));
                this.lightningRender.getBeautyLevel().setFaceBeautyValue(str, f);
                return;
            }
            return;
        }
        if (this.faceWarpProcessor == null || this.cartoonMutex.interceptMicro(str, f)) {
            return;
        }
        this.faceWarpProcessor.setFaceBeautyValue(str, f);
    }

    public void setFaceWarpMapParams(String str, float f) {
        FaceWarpProcessor faceWarpProcessor = this.faceWarpProcessor;
        if (faceWarpProcessor != null) {
            faceWarpProcessor.setMapParams(str, f);
        }
    }

    public void setFaceWarpType(int i) {
        FaceWarpProcessor faceWarpProcessor = this.faceWarpProcessor;
        if (faceWarpProcessor != null) {
            faceWarpProcessor.setWarpType(i);
        }
    }

    public void setFullSmoothEnable(boolean z) {
        ILightningRender iLightningRender = this.lightningRender;
        if (iLightningRender != null) {
            iLightningRender.getBeautyLevel().setFullSmoothEnable(z);
        }
    }

    public void setInitCallback(Runnable runnable) {
        this.initCallback = runnable;
    }

    public void setLookup0Intensity(float f) {
        ILightningRender iLightningRender = this.lightningRender;
        if (iLightningRender != null) {
            iLightningRender.getLookupLevel().setIntensity(0, f);
        }
    }

    public void setLookup0Path(String str) {
        if (this.lightningRender != null) {
            if (TextUtils.isEmpty(str)) {
                clearLookup0();
                return;
            }
            String strSubstring = str.substring(0, str.lastIndexOf("/"));
            int iLastIndexOf = strSubstring.lastIndexOf("/");
            String strSubstring2 = strSubstring.substring(0, iLastIndexOf);
            String strSubstring3 = str.substring(iLastIndexOf + 1);
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(strSubstring3)) {
                return;
            }
            this.lightningRender.addLibraryPath(strSubstring2);
            this.lightningRender.getLookupLevel().setPath(0, strSubstring3);
            this.lightningRender.getLookupLevel().setIntensity(1.0f);
        }
    }

    public void setLookup1Intensity(float f) {
        ILightningRender iLightningRender = this.lightningRender;
        if (iLightningRender != null) {
            iLightningRender.getLookupLevel().setIntensity(1, f);
        }
    }

    public void setLookup1Path(String str) {
        if (this.lightningRender == null || str == null) {
            return;
        }
        String strSubstring = str.substring(0, str.lastIndexOf("/"));
        int iLastIndexOf = strSubstring.lastIndexOf("/");
        String strSubstring2 = strSubstring.substring(0, iLastIndexOf);
        String strSubstring3 = str.substring(iLastIndexOf + 1);
        this.lightningRender.addLibraryPath(strSubstring2);
        this.lightningRender.getLookupLevel().setPath(1, strSubstring3);
        this.lightningRender.getLookupLevel().setIntensity(1.0f);
    }

    @Deprecated
    public void setLookupIntensity(float f) {
        ILightningRender iLightningRender = this.lightningRender;
        if (iLightningRender != null) {
            iLightningRender.getLookupLevel().setIntensity(f);
        }
    }

    @Deprecated
    public void setLookupPath(String str) {
        setLookup0Path(str);
    }

    public void setMMCVInfo(omw omwVar, int i, boolean z) {
        if (this.enableBeautyFace && !this.cartoonMutex.interceptMicroProcess()) {
            this.faceWarpProcessor.process(omwVar);
        }
        LightningEngineHelper lightningEngineHelper = this.engineHelper;
        if (lightningEngineHelper != null) {
            lightningEngineHelper.setFaceInfo(omwVar);
        }
        this.mmcvInfo = omwVar;
        this.clearFaceInfo = false;
    }

    public void setMakeupIntensity(String str, float f) {
        if (this.lightningRender == null || this.cartoonMutex.interceptMakeup(str, f)) {
            return;
        }
        this.lightningRender.getMakeupLevel().setEffectIntensity(str, f);
    }

    public void setSegmentType(String str) {
        this.segmentType = str;
    }

    public void setSkinSmoothVersion(int i) {
        ILightningRender iLightningRender = this.lightningRender;
        if (iLightningRender != null) {
            iLightningRender.getBeautyLevel().setFullSmoothEnable(i == 1);
            this.lightningRender.getBeautyLevel().setSkinSmoothVersion(i);
        }
    }

    public void setSkinWhiteVersion(int i) {
        ILightningRender iLightningRender = this.lightningRender;
        if (iLightningRender != null) {
            iLightningRender.getBeautyLevel().setSkinWhiteningVersion(i);
        }
    }

    public void setTextureData(String str, byte[] bArr, int i, int i2) {
        ILightningRender iLightningRender = this.lightningRender;
        if (iLightningRender != null) {
            iLightningRender.getStickerLevel().setTextureData(str, bArr, i, i2);
        }
    }

    public void setWarpScaleFactor(float f) {
        FaceWarpProcessor faceWarpProcessor = this.faceWarpProcessor;
        if (faceWarpProcessor != null) {
            faceWarpProcessor.setScaleFactor(f);
        }
    }

    public void setWhitenV3SubVersion(int i) {
        ILightningRender iLightningRender = this.lightningRender;
        if (iLightningRender != null) {
            iLightningRender.getBeautyLevel().setWhitenV3SubVersion(i);
        }
    }

    @Deprecated
    public void switchDoki(boolean z) {
        ILightningRender iLightningRender = this.lightningRender;
        if (iLightningRender != null) {
            iLightningRender.getBeautyLevel().setSkinSmoothVersion(z ? 1 : 0);
        }
    }

    public boolean touchHitTest(float f, float f2, int i, int i2) {
        LightningEngineHelper lightningEngineHelper = this.engineHelper;
        if (lightningEngineHelper != null) {
            return lightningEngineHelper.touchHitTest(f, f2, i, i2);
        }
        return false;
    }

    public void addEnginStickerModel(StickerModel stickerModel) {
        ILightningRender iLightningRender = this.lightningRender;
        if (iLightningRender != null) {
            iLightningRender.getStickerLevel().add(stickerModel);
        }
    }

    @Override // com.momo.mcamera.mask.FaceDetectFilter, p153l.suf
    public void setMMCVInfo(omw omwVar) {
        setMMCVInfo(omwVar, 17, false);
    }

    public LiveLightningEngineFilter(Context context, boolean z) {
        this(context, z, false);
    }

    public LiveLightningEngineFilter(Context context) {
        this(context, false);
    }
}
