package com.immomo.momomediaext.filter.beauty;

import android.content.Context;
import com.momo.mcamera.mask.FaceFilterPipeline;
import com.momo.mcamera.mask.facewarp.BaseFaceWarpFilter;
import com.momo.mcamera.mask.facewarp.BeautyFaceWarpFilter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p149l.etf;
import p149l.fjf0;
import p149l.hjf0;
import p149l.mcj;
import p149l.pjw;
import p149l.ts2;

/* JADX INFO: loaded from: classes7.dex */
public class MomoBeautyFilter extends FaceFilterPipeline {
    private Context context;
    private List<ts2> destroyList = new CopyOnWriteArrayList();
    private ts2 faceLightingFilter;
    private BaseFaceWarpFilter faceWarpFilter;
    private ts2 skinSmoothFilter;
    private fjf0 skinSmoothManager;
    private hjf0 skinWhiteningManager;

    public MomoBeautyFilter(Context context) {
        this.context = context;
        BeautyFaceWarpFilter beautyFaceWarpFilter = new BeautyFaceWarpFilter();
        this.faceWarpFilter = beautyFaceWarpFilter;
        beautyFaceWarpFilter.setMaxFaces(1);
        ((BeautyFaceWarpFilter) this.faceWarpFilter).setEnableWarp(true);
        hjf0 hjf0Var = new hjf0();
        this.skinWhiteningManager = hjf0Var;
        this.faceLightingFilter = hjf0Var.m131372b(context, 1);
        fjf0 fjf0Var = new fjf0();
        this.skinSmoothManager = fjf0Var;
        this.skinSmoothFilter = fjf0Var.m121591a(1);
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.faceWarpFilter);
        arrayList.add(this.skinSmoothFilter);
        arrayList.add(this.faceLightingFilter);
        constructGroupFilter(arrayList);
    }

    private void setSkinLightingLevel(float f) {
        hjf0 hjf0Var = this.skinWhiteningManager;
        if (hjf0Var != null) {
            hjf0Var.m131373c(f);
        }
    }

    private void setSkinSmoothLevel(float f) {
        fjf0 fjf0Var = this.skinSmoothManager;
        if (fjf0Var != null) {
            fjf0Var.m121593c(f);
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

    @Override // p149l.ydk, p149l.mcj, p149l.ccj
    public synchronized void destroy() {
        try {
            super.destroy();
            if (this.destroyList.size() > 0) {
                Iterator<ts2> it = this.destroyList.iterator();
                while (it.hasNext()) {
                    it.next().destroy();
                }
                this.destroyList.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p149l.ydk, p149l.ts2, p149l.jcj
    public void newTextureReady(int i, mcj mcjVar, boolean z) {
        super.newTextureReady(i, mcjVar, z);
        if (this.destroyList.size() > 0) {
            Iterator<ts2> it = this.destroyList.iterator();
            while (it.hasNext()) {
                it.next().destroy();
            }
            this.destroyList.clear();
        }
    }

    @Override // com.momo.mcamera.mask.FaceFilterPipeline, com.momo.mcamera.mask.FaceDetectGroupFilter, p149l.etf
    public void setMMCVInfo(pjw pjwVar) {
        super.setMMCVInfo(pjwVar);
        int size = getFilters().size();
        for (int i = 0; i < size; i++) {
            if (getFilters().get(i) instanceof etf) {
                ((etf) getFilters().get(i)).setMMCVInfo(pjwVar);
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
        fjf0 fjf0Var = this.skinSmoothManager;
        if (fjf0Var != null) {
            float fM121592b = fjf0Var.m121592b();
            ts2 ts2VarM121591a = this.skinSmoothManager.m121591a(z ? 1 : 0);
            ts2 ts2Var = this.skinSmoothFilter;
            if (ts2Var != ts2VarM121591a) {
                if (resetFilter(ts2Var, ts2VarM121591a)) {
                    this.destroyList.add(this.skinSmoothFilter);
                    this.skinSmoothFilter = ts2VarM121591a;
                }
                this.skinSmoothManager.m121593c(fM121592b);
            }
        }
    }

    public void switchWhiteningFilter(boolean z) {
        hjf0 hjf0Var = this.skinWhiteningManager;
        if (hjf0Var != null) {
            float fM131371a = hjf0Var.m131371a();
            ts2 ts2VarM131372b = this.skinWhiteningManager.m131372b(this.context, z ? 1 : 0);
            ts2 ts2Var = this.faceLightingFilter;
            if (ts2Var != ts2VarM131372b) {
                if (resetFilter(ts2Var, ts2VarM131372b)) {
                    this.destroyList.add(this.faceLightingFilter);
                    this.faceLightingFilter = ts2VarM131372b;
                }
                this.skinWhiteningManager.m131373c(fM131371a);
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
