package com.immomo.momomediaext.filter.beauty;

import android.content.Context;
import com.momo.mcamera.mask.FaceFilterPipeline;
import com.momo.mcamera.mask.NormalFilter;
import com.momo.mcamera.mask.facewarp.FaceBeautyID;
import java.util.ArrayList;
import p153l.dfj;
import p153l.gfj;
import p153l.omw;

/* JADX INFO: loaded from: classes7.dex */
public class BeautyFilterAdapter extends FaceFilterPipeline implements IBeautyAdapter {
    private ByteDanceBeautyFilter byteDanceBeautyFilter;
    private Context context;
    private int currentType;
    private ByteDanceHelper.IBeautyErrorListener listener;
    private MomoBeautyFilter momoBeautyFilter;
    private float warpScaleFactor = -1.0f;
    private boolean enableDraw = true;
    private NormalFilter normalFilter = new NormalFilter();
    private BeautyLookupFilter lookupFilter = new BeautyLookupFilter();

    public BeautyFilterAdapter(Context context) {
        this.context = context;
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.normalFilter);
        arrayList.add(this.lookupFilter);
        constructGroupFilter(arrayList);
        this.currentType = -1;
    }

    private void buildByteDanceFilter() {
        if (isByteDanceBeautyFilter()) {
            return;
        }
        if (this.byteDanceBeautyFilter == null) {
            this.byteDanceBeautyFilter = new ByteDanceBeautyFilter(this.context, this.listener);
        }
        if (this.currentType == -1) {
            resetFilter(this.normalFilter, this.byteDanceBeautyFilter);
        } else if (isMomoBeautyFilter()) {
            resetFilter(this.momoBeautyFilter, this.byteDanceBeautyFilter);
        }
    }

    private void buildMomoFilter() {
        if (isMomoBeautyFilter()) {
            return;
        }
        if (this.momoBeautyFilter == null) {
            this.momoBeautyFilter = new MomoBeautyFilter(this.context);
        }
        if (this.currentType == -1) {
            resetFilter(this.normalFilter, this.momoBeautyFilter);
        } else if (isByteDanceBeautyFilter()) {
            resetFilter(this.byteDanceBeautyFilter, this.momoBeautyFilter);
        }
    }

    private void clear() {
        NormalFilter normalFilter = this.normalFilter;
        if (normalFilter != null) {
            normalFilter.destroy();
        }
        MomoBeautyFilter momoBeautyFilter = this.momoBeautyFilter;
        if (momoBeautyFilter != null) {
            momoBeautyFilter.destroy();
        }
        ByteDanceBeautyFilter byteDanceBeautyFilter = this.byteDanceBeautyFilter;
        if (byteDanceBeautyFilter != null) {
            byteDanceBeautyFilter.destroy();
        }
    }

    private boolean isByteDanceBeautyFilter() {
        return this.currentType == 2;
    }

    private boolean isMomoBeautyFilter() {
        int i = this.currentType;
        return i == 0 || i == 1;
    }

    @Override // com.immomo.momomediaext.filter.beauty.IBeautyAdapter
    public void changeFaceWarp(int i, float f, float f2) {
        if (isMomoBeautyFilter()) {
            this.momoBeautyFilter.setWarpType(i);
            this.momoBeautyFilter.updateFaceBeautyValue(FaceBeautyID.THIN_FACE, f);
            this.momoBeautyFilter.updateFaceBeautyValue(FaceBeautyID.BIG_EYE, f2);
        }
    }

    @Override // com.immomo.momomediaext.filter.beauty.IBeautyAdapter
    public void changeLookupFilter(String str) {
        BeautyLookupFilter beautyLookupFilter = this.lookupFilter;
        if (beautyLookupFilter != null) {
            beautyLookupFilter.setLookupPath(str);
        }
    }

    @Override // com.immomo.momomediaext.filter.beauty.IBeautyAdapter
    public void changeWarpScaleFactor(float f) {
        this.warpScaleFactor = f;
        if (isMomoBeautyFilter()) {
            this.momoBeautyFilter.setWarpScaleFactor(f);
        }
    }

    @Override // p153l.ogk, p153l.gfj, p153l.wej
    public synchronized void destroy() {
        super.destroy();
        clear();
    }

    @Override // com.immomo.momomediaext.filter.beauty.IBeautyAdapter
    public void enableDraw(boolean z) {
        this.enableDraw = z;
    }

    @Override // com.immomo.momomediaext.filter.beauty.IBeautyAdapter
    public void forbidBeauty(boolean z) {
        if (isByteDanceBeautyFilter()) {
            this.byteDanceBeautyFilter.forbidBeauty(z);
        }
    }

    @Override // com.immomo.momomediaext.filter.beauty.IBeautyAdapter
    public boolean isBeautyEnable() {
        if (isByteDanceBeautyFilter()) {
            return this.byteDanceBeautyFilter.isByteDanceBeautyEnable();
        }
        return true;
    }

    @Override // com.immomo.momomediaext.filter.beauty.IBeautyAdapter
    public boolean isEnableDraw() {
        return this.enableDraw;
    }

    @Override // p153l.ogk, p153l.jt2, p153l.dfj
    public void newTextureReady(int i, gfj gfjVar, boolean z) {
        if (this.enableDraw) {
            super.newTextureReady(i, gfjVar, z);
            return;
        }
        setWidth(gfjVar.getWidth());
        setHeight(gfjVar.getHeight());
        synchronized (getLockObject()) {
            try {
                for (dfj dfjVar : getRenderTargets()) {
                    this.glFrameBuffer = gfjVar.glFrameBuffer;
                    dfjVar.newTextureReady(i, this, z);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.immomo.momomediaext.filter.beauty.IBeautyAdapter
    public void release() {
        ByteDanceBeautyFilter byteDanceBeautyFilter = this.byteDanceBeautyFilter;
        if (byteDanceBeautyFilter != null) {
            byteDanceBeautyFilter.release();
        }
    }

    public boolean removeBody(String str) {
        if (isByteDanceBeautyFilter()) {
            return this.byteDanceBeautyFilter.removeBody(str);
        }
        return false;
    }

    @Override // com.immomo.momomediaext.filter.beauty.IBeautyAdapter
    public boolean removeMakeup(String str) {
        if (isByteDanceBeautyFilter()) {
            return this.byteDanceBeautyFilter.removeMakeup(str);
        }
        return false;
    }

    @Override // com.immomo.momomediaext.filter.beauty.IBeautyAdapter
    public boolean removeMakeupStyle(String str, String str2) {
        if (isByteDanceBeautyFilter()) {
            return this.byteDanceBeautyFilter.removeMakeupStyle(str, str2);
        }
        return false;
    }

    @Override // com.momo.mcamera.mask.FaceFilterPipeline, com.momo.mcamera.mask.FaceDetectGroupFilter, p153l.suf
    public void setMMCVInfo(omw omwVar) {
        if (isMomoBeautyFilter()) {
            this.momoBeautyFilter.setMMCVInfo(omwVar);
        }
        if (isByteDanceBeautyFilter()) {
            this.byteDanceBeautyFilter.setMMCVInfo(omwVar);
        }
    }

    public void setOnBeautyErrorListener(ByteDanceHelper.IBeautyErrorListener iBeautyErrorListener) {
        this.listener = iBeautyErrorListener;
    }

    @Override // com.immomo.momomediaext.filter.beauty.IBeautyAdapter
    public void setOnDetectCompleteListener(ByteDanceHelper.IFaceDetectCompleteListener iFaceDetectCompleteListener) {
        ByteDanceBeautyFilter byteDanceBeautyFilter = this.byteDanceBeautyFilter;
        if (byteDanceBeautyFilter != null) {
            byteDanceBeautyFilter.setOnDetectCompleteListener(iFaceDetectCompleteListener);
        }
    }

    @Override // com.immomo.momomediaext.filter.beauty.IBeautyAdapter
    public void switchBeauty(int i) {
        if (i == 2) {
            buildByteDanceFilter();
        } else {
            buildMomoFilter();
            this.momoBeautyFilter.changeDokiBeautyFilter(i == 1);
            this.momoBeautyFilter.setWarpScaleFactor(this.warpScaleFactor);
        }
        this.currentType = i;
    }

    @Override // com.immomo.momomediaext.filter.beauty.IBeautyAdapter
    public void switchSmoothFilter(boolean z) {
        if (isMomoBeautyFilter()) {
            this.momoBeautyFilter.switchSmoothFilter(z);
            this.momoBeautyFilter.switchWhiteningFilter(z);
        }
    }

    public boolean updateBeautyBodyValue(String str, String str2, float f) {
        if (isByteDanceBeautyFilter()) {
            return this.byteDanceBeautyFilter.updateBeautyBodyValue(str, str2, f);
        }
        return false;
    }

    @Override // com.immomo.momomediaext.filter.beauty.IBeautyAdapter
    public boolean updateByteDanceFaceBeautyValue(String str, String str2, float f) {
        if (isByteDanceBeautyFilter()) {
            return this.byteDanceBeautyFilter.updateFaceBeautyValue(str, str2, f);
        }
        return false;
    }

    @Override // com.immomo.momomediaext.filter.beauty.IBeautyAdapter
    public boolean updateFaceBeautyValue(String str, float f) {
        if (!isMomoBeautyFilter()) {
            return false;
        }
        this.momoBeautyFilter.updateFaceBeautyValue(str, f);
        return true;
    }

    @Override // com.immomo.momomediaext.filter.beauty.IBeautyAdapter
    public void updateLookupFilterIntensity(float f) {
        BeautyLookupFilter beautyLookupFilter = this.lookupFilter;
        if (beautyLookupFilter != null) {
            beautyLookupFilter.setIntensity(f);
        }
    }

    @Override // com.immomo.momomediaext.filter.beauty.IBeautyAdapter
    public boolean updateMakeupStyleValue(String str, String str2, float f) {
        if (isByteDanceBeautyFilter()) {
            return this.byteDanceBeautyFilter.updateMakeupStyleValue(str, str2, f);
        }
        return false;
    }

    @Override // com.immomo.momomediaext.filter.beauty.IBeautyAdapter
    public boolean updateMakeupValue(String str, String str2, float f) {
        if (isByteDanceBeautyFilter()) {
            return this.byteDanceBeautyFilter.updateMakeupValue(str, str2, f);
        }
        return false;
    }
}
