package com.momo.mcamera.mask;

import android.text.TextUtils;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.momo.mcamera.mask.segment.AbsSegmentFilter;
import com.momo.mcamera.mask.segment.SegmentFilterFactory;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p149l.etf;
import p149l.jcj;
import p149l.mcj;
import p149l.pjw;
import p149l.q7m;
import p149l.ts2;
import p149l.ydk;
import p149l.zsf;

/* JADX INFO: loaded from: classes7.dex */
public class StickerBlendFilter extends ydk implements q7m, etf, StickerAdjustFilter.IOrderable {
    public StickerMaskFinishListener finishListener;
    private boolean hasShowedThisTrigger;
    private int hiddenFrameCount;
    private boolean isClearsFaceArea;
    public boolean isFixedFilter;
    private boolean isHiddenFrame;
    private boolean isPlaying;
    AbsSegmentFilter segmentFilter;
    SobelFilter sobelFilter;
    public Sticker sticker;
    FaceDetectFilter stickerMaskFilter;
    public StickerStateChangeListener stickerStateChangeListener;
    TriggerBlendFilter triggerBlendFilter;
    public long mStickerDuration = -1;
    private boolean hasShowed = false;
    long startTime = -1;
    private boolean lastShouldShow = true;
    private Map<String, List> coll = new HashMap();
    private boolean needPlayLoop = true;

    public interface StickerMaskFinishListener {
        void stickerRenderFinished();
    }

    public interface StickerStateChangeListener {
        void distortionStateChanged(boolean z, float f, float f2, float f3, float f4);

        void faceDetected(boolean z);

        void playStateChanged(int i, boolean z);

        void stickerGestureTypeChanged(String str, boolean z);

        void stickerStateChanged(int i, int i2);
    }

    public StickerBlendFilter(ts2 ts2Var, Sticker sticker) {
        this.isClearsFaceArea = false;
        this.sticker = sticker;
        this.isClearsFaceArea = sticker.isClearsFaceArea();
        boolean zIsClearsBodyArea = sticker.isClearsBodyArea();
        boolean z = sticker.getStrokeColor() != null;
        int i = zIsClearsBodyArea ? z ? 4 : 3 : 2;
        String stickerType = sticker.getStickerType();
        if (ts2Var instanceof FaceDetectFilter) {
            this.stickerMaskFilter = (FaceDetectFilter) ts2Var;
        }
        NormalFilter normalFilter = new NormalFilter();
        if ("FACE_MASK_TYPE".equals(stickerType)) {
            if (this.sticker.isComic()) {
                this.triggerBlendFilter = new TriggerBlendFilter();
            } else {
                this.triggerBlendFilter = new MultiplyMaskBlendFilter();
            }
        } else if (sticker.getLayerType() != null && sticker.getLayerType().equals("3d")) {
            XEngineBlendFilter xEngineBlendFilter = new XEngineBlendFilter(i);
            this.triggerBlendFilter = xEngineBlendFilter;
            xEngineBlendFilter.setSegmentBody(zIsClearsBodyArea);
            if (this.isClearsFaceArea) {
                this.triggerBlendFilter.setBlend(2);
            }
        } else if (sticker.getLayerType() == null || !sticker.getLayerType().equals("fault")) {
            TriggerBlendFilter triggerBlendFilter = new TriggerBlendFilter(i);
            this.triggerBlendFilter = triggerBlendFilter;
            triggerBlendFilter.setSegmentBody(zIsClearsBodyArea);
            if (sticker.getBlendMode() != null) {
                this.triggerBlendFilter.setBlendType(sticker.getBlendMode().name);
            }
        } else {
            this.triggerBlendFilter = new ArtifactframeFilter();
            ProcessFaultInfo(this.sticker);
        }
        normalFilter.addTarget(this.triggerBlendFilter);
        ts2Var.addTarget(this.triggerBlendFilter);
        if (zIsClearsBodyArea) {
            AbsSegmentFilter absSegmentFilterCreateSegmentFilter = SegmentFilterFactory.createSegmentFilter(sticker.getSegmentType());
            this.segmentFilter = absSegmentFilterCreateSegmentFilter;
            absSegmentFilterCreateSegmentFilter.addTarget(this.triggerBlendFilter);
            if (z) {
                SobelFilter sobelFilter = new SobelFilter();
                this.sobelFilter = sobelFilter;
                this.segmentFilter.addTarget(sobelFilter);
                this.sobelFilter.addTarget(this.triggerBlendFilter);
            }
        }
        this.triggerBlendFilter.registerFilterLocation(normalFilter, 0);
        this.triggerBlendFilter.registerFilterLocation(ts2Var, 1);
        if (zIsClearsBodyArea) {
            this.triggerBlendFilter.registerFilterLocation(this.segmentFilter, 2);
            this.triggerBlendFilter.registerFilterLocation(this.sobelFilter, 3);
        }
        this.triggerBlendFilter.addTarget(this);
        registerInitialFilter(normalFilter);
        registerInitialFilter(ts2Var);
        if (zIsClearsBodyArea) {
            registerInitialFilter(this.segmentFilter);
        }
        registerTerminalFilter(this.triggerBlendFilter);
    }

    private void ProcessFaultInfo(Sticker sticker) {
        if (this.coll.size() > 0 && !this.coll.isEmpty()) {
            this.coll.clear();
        }
        File file = new File(sticker.getImageFolderPath() + "/fault.txt");
        if (!file.exists() || !file.isFile()) {
            return;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    fileInputStream.close();
                    return;
                } else if (!"".equals(line)) {
                    ArrayList arrayList = new ArrayList();
                    String[] strArrSplit = line.split(MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR);
                    arrayList.add(Float.valueOf(Float.parseFloat(strArrSplit[1])));
                    arrayList.add(Float.valueOf(Float.parseFloat(strArrSplit[2])));
                    this.coll.put(strArrSplit[0], arrayList);
                }
            }
        } catch (FileNotFoundException | IOException unused) {
        }
    }

    private void resumeDisplay() {
        FaceDetectFilter faceDetectFilter = this.stickerMaskFilter;
        if (faceDetectFilter != null) {
            faceDetectFilter.resumeBitmapCache();
        }
        if (!this.isClearsFaceArea) {
            this.triggerBlendFilter.setBlend(true);
        }
        startPlay();
    }

    public void cancelDraw() {
        FaceDetectFilter faceDetectFilter = this.stickerMaskFilter;
        if (faceDetectFilter != null) {
            faceDetectFilter.cancelDraw();
        }
    }

    public void clearPoints() {
        FaceDetectFilter faceDetectFilter = this.stickerMaskFilter;
        if (faceDetectFilter != null) {
            faceDetectFilter.clearPoints();
        }
    }

    @Override // p149l.ydk, p149l.mcj, p149l.ccj
    public void destroy() {
        super.destroy();
        cancelDraw();
        this.finishListener = null;
    }

    public long getEscapedTime() {
        long jCurrentTimeMillis = System.currentTimeMillis() - this.startTime;
        long j = this.mStickerDuration;
        return jCurrentTimeMillis >= j ? j : System.currentTimeMillis() - this.startTime;
    }

    @Override // com.momo.mcamera.mask.StickerAdjustFilter.IOrderable
    public int getOrderedIndex() {
        Sticker sticker = this.sticker;
        if (sticker != null) {
            return sticker.getOrderedIndex();
        }
        return 0;
    }

    public void lockTexture() {
        FaceDetectFilter faceDetectFilter = this.stickerMaskFilter;
        if (faceDetectFilter != null) {
            faceDetectFilter.lockTexture();
        }
    }

    @Override // p149l.ydk, p149l.ts2, p149l.jcj
    public void newTextureReady(int i, mcj mcjVar, boolean z) {
        super.newTextureReady(i, mcjVar, z);
        if (!(this.triggerBlendFilter instanceof ArtifactframeFilter) || ((StickerMaskFilter) this.stickerMaskFilter).getImagePathName() == null) {
            return;
        }
        String[] strArrSplit = ((StickerMaskFilter) this.stickerMaskFilter).getImagePathName().split("/");
        if (this.coll.containsKey(strArrSplit[strArrSplit.length - 1])) {
            ((ArtifactframeFilter) this.triggerBlendFilter).setFaultInfo(((Float) this.coll.get(strArrSplit[strArrSplit.length - 1]).get(0)).floatValue(), ((Float) this.coll.get(strArrSplit[strArrSplit.length - 1]).get(1)).floatValue());
        }
    }

    public void pauseBitmapCache() {
        FaceDetectFilter faceDetectFilter = this.stickerMaskFilter;
        if (faceDetectFilter != null) {
            faceDetectFilter.pauseBitmapCache();
        }
    }

    @Override // p149l.ydk, p149l.mcj, p149l.ccj
    public void releaseFrameBuffer() {
        super.releaseFrameBuffer();
        cancelDraw();
    }

    public void resetSticker(Sticker sticker) {
        synchronized (getLockObject()) {
            try {
                clearPoints();
                this.sticker = sticker;
                FaceDetectFilter faceDetectFilter = this.stickerMaskFilter;
                if (faceDetectFilter != null) {
                    faceDetectFilter.resetSticker(sticker);
                    this.startTime = -1L;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void resumeBitmapCache() {
        FaceDetectFilter faceDetectFilter = this.stickerMaskFilter;
        if (faceDetectFilter != null) {
            faceDetectFilter.resumeBitmapCache();
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x007d  */
    /* JADX WARN: Code duplicated, block: B:76:0x0115  */
    /* JADX WARN: Code duplicated, block: B:78:0x011d  */
    /* JADX WARN: Code duplicated, block: B:89:0x013e  */
    /* JADX WARN: Code duplicated, block: B:92:0x0147  */
    public void setDetectParam(FaceDetectFilter.FaceDetectParam faceDetectParam) {
        boolean z;
        FaceDetectFilter faceDetectFilter;
        Sticker sticker;
        Sticker sticker2;
        FaceDetectFilter faceDetectFilter2;
        FilterTriggerManager filterTriggerManager = faceDetectParam.filterTrigerManager;
        boolean zTriggerTypeProcess = filterTriggerManager != null ? filterTriggerManager.triggerTypeProcess(this.sticker, this.stickerStateChangeListener) : true;
        if (zTriggerTypeProcess && (!TextUtils.isEmpty(this.sticker.getObjectTriggerType()) || !TextUtils.isEmpty(this.sticker.getHiddenObjectTriggerType()))) {
            zTriggerTypeProcess = faceDetectParam.filterTrigerManager.objectTriggerTypeProcess(this.sticker, faceDetectParam, false);
        }
        if (this.sticker.getMinHiddenFrameCount() <= 0 || (this.sticker.getHiddenTriggerType() <= 0 && TextUtils.isEmpty(this.sticker.getHiddenObjectTriggerType()))) {
            z = zTriggerTypeProcess;
        } else {
            if (!zTriggerTypeProcess && this.lastShouldShow) {
                this.isHiddenFrame = true;
            }
            if (this.isHiddenFrame) {
                if (this.sticker.getMinHiddenFrameCount() > 0 && this.hiddenFrameCount > this.sticker.getMinHiddenFrameCount() + 2) {
                    this.hiddenFrameCount = 0;
                    this.isHiddenFrame = false;
                }
                if (this.isHiddenFrame) {
                    this.hiddenFrameCount++;
                    z = false;
                } else {
                    z = zTriggerTypeProcess;
                }
            } else {
                z = zTriggerTypeProcess;
            }
        }
        if (this.hasShowedThisTrigger && (this.sticker.isNotHiddenAfterTrigger() || (this.sticker.getLoopStart() > 0 && this.sticker.isAlwaysShow()))) {
            z = true;
        }
        Sticker sticker3 = this.sticker;
        if (sticker3.curIndex == sticker3.getFrameNumber() - 1 && this.sticker.getLoopStart() == -1) {
            this.needPlayLoop = false;
        }
        if (z) {
            if (zTriggerTypeProcess && this.sticker.isNotHiddenAfterTrigger()) {
                Sticker sticker4 = this.sticker;
                if (sticker4.curIndex == sticker4.getFrameNumber() - 1) {
                    this.sticker.curIndex = 0;
                }
            }
            if (!this.needPlayLoop) {
                return;
            }
            FaceDetectFilter faceDetectFilter3 = this.stickerMaskFilter;
            if (faceDetectFilter3 != null) {
                faceDetectFilter3.resumeBitmapCache();
            }
            if (!this.isClearsFaceArea) {
                this.triggerBlendFilter.setBlend(z);
            }
            this.hasShowed = true;
            startPlay();
            this.lastShouldShow = true;
            this.isHiddenFrame = false;
        } else {
            if (this.sticker.isNotHiddenAfterTrigger()) {
                this.lastShouldShow = z;
            }
            if (this.sticker.isNotHiddenAfterTrigger()) {
                Sticker sticker5 = this.sticker;
                if (sticker5.curIndex != sticker5.getFrameNumber() - 1 || this.sticker.curIndex <= 0) {
                    if (this.sticker.isNoBreakLoop()) {
                        sticker2 = this.sticker;
                        if (sticker2.curIndex >= sticker2.getFrameNumber() - 1 && this.hasShowed && this.sticker.curIndex > 0 && this.needPlayLoop) {
                            resumeDisplay();
                        }
                    }
                    if (!this.isClearsFaceArea) {
                        this.triggerBlendFilter.setBlend(false);
                    }
                    faceDetectFilter = this.stickerMaskFilter;
                    if (faceDetectFilter != null) {
                        faceDetectFilter.pauseBitmapCache();
                    }
                    sticker = this.sticker;
                    if (sticker.curIndex == sticker.getFrameNumber() - 1 && (this.sticker.getLoopStart() <= 0 || !this.sticker.isAlwaysShow())) {
                        this.sticker.curIndex = 0;
                    }
                    stopPlay();
                } else {
                    resumeDisplay();
                }
                z = true;
            } else {
                if (this.sticker.isNoBreakLoop()) {
                    sticker2 = this.sticker;
                    if (sticker2.curIndex >= sticker2.getFrameNumber() - 1) {
                    }
                }
                if (!this.isClearsFaceArea) {
                    this.triggerBlendFilter.setBlend(false);
                }
                faceDetectFilter = this.stickerMaskFilter;
                if (faceDetectFilter != null) {
                    faceDetectFilter.pauseBitmapCache();
                }
                sticker = this.sticker;
                if (sticker.curIndex == sticker.getFrameNumber() - 1) {
                    this.sticker.curIndex = 0;
                }
                stopPlay();
            }
        }
        if (z) {
            this.hasShowedThisTrigger = true;
        }
        if (this.stickerStateChangeListener != null && !TextUtils.isEmpty(this.sticker.getObjectTriggerType())) {
            this.stickerStateChangeListener.stickerGestureTypeChanged(this.sticker.getObjectTriggerType(), z);
        }
        if (this.mStickerDuration > -1 && this.startTime != -1 && System.currentTimeMillis() - this.startTime > this.mStickerDuration && (faceDetectFilter2 = this.stickerMaskFilter) != null) {
            faceDetectFilter2.clearPoints();
            StickerMaskFinishListener stickerMaskFinishListener = this.finishListener;
            if (stickerMaskFinishListener != null) {
                stickerMaskFinishListener.stickerRenderFinished();
            }
            stopPlay();
            return;
        }
        FaceDetectFilter faceDetectFilter4 = this.stickerMaskFilter;
        if (faceDetectFilter4 != null) {
            faceDetectFilter4.setDetectParam(faceDetectParam);
        }
        if (this.startTime == -1) {
            this.startTime = System.currentTimeMillis();
        }
    }

    public void setFinishListener(StickerMaskFinishListener stickerMaskFinishListener) {
        this.finishListener = stickerMaskFinishListener;
    }

    @Override // p149l.etf
    public void setMMCVInfo(pjw pjwVar) {
        if (pjwVar == null) {
            return;
        }
        TriggerBlendFilter triggerBlendFilter = this.triggerBlendFilter;
        if (triggerBlendFilter != null) {
            triggerBlendFilter.setMMCVInfo(pjwVar);
        }
        AbsSegmentFilter absSegmentFilter = this.segmentFilter;
        if (absSegmentFilter != null) {
            absSegmentFilter.setMMCVInfo(pjwVar);
        }
        if (this.sobelFilter != null) {
            zsf zsfVarM169946j = pjwVar.m169946j(0);
            if (zsfVarM169946j == null || zsfVarM169946j.m220021o() == null || zsfVarM169946j.m220028v() == null) {
                this.sobelFilter.setSobelEnabled(false);
            } else {
                this.sobelFilter.setSobelEnabled(true);
            }
        }
        if (pjwVar.m169950n() == 0) {
            stopPlay();
        }
    }

    @Override // com.momo.mcamera.mask.StickerAdjustFilter.IOrderable
    public void setOrderedIndex(int i) {
        Sticker sticker = this.sticker;
        if (sticker != null) {
            sticker.setOrderedIndex(i);
        }
    }

    public void setSegmentBody(boolean z) {
        TriggerBlendFilter triggerBlendFilter = this.triggerBlendFilter;
        if (triggerBlendFilter != null) {
            triggerBlendFilter.setSegmentBody(z);
        }
    }

    public void setSegmentStrokeColor(float[] fArr) {
        TriggerBlendFilter triggerBlendFilter = this.triggerBlendFilter;
        if (triggerBlendFilter != null) {
            triggerBlendFilter.setSegmentStrokeColor(fArr);
        }
    }

    public void setSegmentStrokeRadius(int i) {
        TriggerBlendFilter triggerBlendFilter = this.triggerBlendFilter;
        if (triggerBlendFilter != null) {
            triggerBlendFilter.setSegmentStrokeRadius(i);
        }
    }

    @Override // p149l.q7m
    public void setTimeStamp(long j) {
        jcj jcjVar = this.stickerMaskFilter;
        if (jcjVar == null || !(jcjVar instanceof q7m)) {
            return;
        }
        ((q7m) jcjVar).setTimeStamp(j);
    }

    public void startPlay() {
        if (this.isPlaying) {
            return;
        }
        if (this.stickerStateChangeListener != null && this.sticker.getSoundId() > 0) {
            this.stickerStateChangeListener.playStateChanged(this.sticker.getSoundId(), true);
        }
        this.isPlaying = true;
    }

    public void stopPlay() {
        if (this.isPlaying) {
            if (this.stickerStateChangeListener != null && this.sticker.getSoundId() > 0) {
                this.stickerStateChangeListener.playStateChanged(this.sticker.getSoundId(), false);
            }
            this.isPlaying = false;
        }
    }

    public void unlockTexture() {
        FaceDetectFilter faceDetectFilter = this.stickerMaskFilter;
        if (faceDetectFilter != null) {
            faceDetectFilter.unlockTexture();
        }
    }
}
