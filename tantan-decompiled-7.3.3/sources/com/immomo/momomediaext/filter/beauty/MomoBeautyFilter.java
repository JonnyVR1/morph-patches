package com.immomo.momomediaext.filter.beauty;

import android.content.Context;
import com.momo.mcamera.mask.FaceFilterPipeline;
import com.momo.mcamera.mask.facewarp.BaseFaceWarpFilter;
import com.momo.mcamera.mask.facewarp.BeautyFaceWarpFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p153l.gfj;
import p153l.jt2;
import p153l.omw;
import p153l.orf0;
import p153l.qrf0;
import p153l.suf;

/* JADX INFO: loaded from: classes7.dex */
public class MomoBeautyFilter extends FaceFilterPipeline {
    private Context context;
    private List<jt2> destroyList = new CopyOnWriteArrayList();
    private jt2 faceLightingFilter;
    private BaseFaceWarpFilter faceWarpFilter;
    private jt2 skinSmoothFilter;
    private orf0 skinSmoothManager;
    private qrf0 skinWhiteningManager;

    public MomoBeautyFilter(Context context) {
        this.context = context;
        BeautyFaceWarpFilter beautyFaceWarpFilter = new BeautyFaceWarpFilter();
        this.faceWarpFilter = beautyFaceWarpFilter;
        beautyFaceWarpFilter.setMaxFaces(1);
        ((BeautyFaceWarpFilter) this.faceWarpFilter).setEnableWarp(true);
        qrf0 qrf0Var = new qrf0();
        this.skinWhiteningManager = qrf0Var;
        this.faceLightingFilter = qrf0Var.m177543b(context, 1);
        orf0 orf0Var = new orf0();
        this.skinSmoothManager = orf0Var;
        this.skinSmoothFilter = orf0Var.m168917a(1);
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.faceWarpFilter);
        arrayList.add(this.skinSmoothFilter);
        arrayList.add(this.faceLightingFilter);
        constructGroupFilter(arrayList);
    }

    private void setSkinLightingLevel(float f) {
        qrf0 qrf0Var = this.skinWhiteningManager;
        if (qrf0Var != null) {
            qrf0Var.m177544c(f);
        }
    }

    private void setSkinSmoothLevel(float f) {
        orf0 orf0Var = this.skinSmoothManager;
        if (orf0Var != null) {
            orf0Var.m168919c(f);
        }
    }

    public void changeDokiBeautyFilter(boolean z) {
        BaseFaceWarpFilter baseFaceWarpFilter = this.faceWarpFilter;
        if (z) {
            baseFaceWarpFilter.setWarpType(10);
        } else {
            baseFaceWarpFilter.setWarpType(9);
        }
        switchSmoothFilter(z);
        switchWhiteningFilter(z);
    }

    @Override // p153l.ogk, p153l.gfj, p153l.wej
    public synchronized void destroy() {
        try {
            super.destroy();
            if (this.destroyList.size() > 0) {
                Iterator<jt2> it = this.destroyList.iterator();
                while (it.hasNext()) {
                    it.next().destroy();
                }
                this.destroyList.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p153l.ogk, p153l.jt2, p153l.dfj
    public void newTextureReady(int i, gfj gfjVar, boolean z) {
        super.newTextureReady(i, gfjVar, z);
        if (this.destroyList.size() > 0) {
            Iterator<jt2> it = this.destroyList.iterator();
            while (it.hasNext()) {
                it.next().destroy();
            }
            this.destroyList.clear();
        }
    }

    @Override // com.momo.mcamera.mask.FaceFilterPipeline, com.momo.mcamera.mask.FaceDetectGroupFilter, p153l.suf
    public void setMMCVInfo(omw omwVar) {
        super.setMMCVInfo(omwVar);
        int size = getFilters().size();
        for (int i = 0; i < size; i++) {
            if (getFilters().get(i) instanceof suf) {
                ((suf) getFilters().get(i)).setMMCVInfo(omwVar);
            }
        }
    }

    public void setWarpScaleFactor(float f) {
        BaseFaceWarpFilter baseFaceWarpFilter = this.faceWarpFilter;
        if (baseFaceWarpFilter != null) {
            baseFaceWarpFilter.setScaleFactor(f);
        }
    }

    public void setWarpType(int i) {
        BaseFaceWarpFilter baseFaceWarpFilter = this.faceWarpFilter;
        if (baseFaceWarpFilter != null) {
            baseFaceWarpFilter.setWarpType(i);
        }
    }

    public void switchSmoothFilter(boolean z) {
        orf0 orf0Var = this.skinSmoothManager;
        if (orf0Var != null) {
            float fM168918b = orf0Var.m168918b();
            jt2 jt2VarM168917a = this.skinSmoothManager.m168917a(z ? 1 : 0);
            jt2 jt2Var = this.skinSmoothFilter;
            if (jt2Var != jt2VarM168917a) {
                if (resetFilter(jt2Var, jt2VarM168917a)) {
                    this.destroyList.add(this.skinSmoothFilter);
                    this.skinSmoothFilter = jt2VarM168917a;
                }
                this.skinSmoothManager.m168919c(fM168918b);
            }
        }
    }

    public void switchWhiteningFilter(boolean z) {
        qrf0 qrf0Var = this.skinWhiteningManager;
        if (qrf0Var != null) {
            float fM177542a = qrf0Var.m177542a();
            jt2 jt2VarM177543b = this.skinWhiteningManager.m177543b(this.context, z ? 1 : 0);
            jt2 jt2Var = this.faceLightingFilter;
            if (jt2Var != jt2VarM177543b) {
                if (resetFilter(jt2Var, jt2VarM177543b)) {
                    this.destroyList.add(this.faceLightingFilter);
                    this.faceLightingFilter = jt2VarM177543b;
                }
                this.skinWhiteningManager.m177544c(fM177542a);
            }
        }
    }

    public void updateFaceBeautyValue(String str, float f) {
        if ("skin_whitening".equals(str)) {
            setSkinLightingLevel(f);
            return;
        }
        if ("skin_smooth".equals(str)) {
            setSkinSmoothLevel(f);
            return;
        }
        if (f == 0.0f) {
            f = 0.01f;
        }
        BaseFaceWarpFilter baseFaceWarpFilter = this.faceWarpFilter;
        if (baseFaceWarpFilter != null) {
            baseFaceWarpFilter.changeFaceBeautyValue(str, f);
        }
    }
}
