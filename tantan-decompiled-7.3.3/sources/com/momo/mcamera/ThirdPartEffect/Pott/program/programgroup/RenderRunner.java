package com.momo.mcamera.ThirdPartEffect.Pott.program.programgroup;

import com.cosmos.mdlog.MDLog;
import com.momo.mcamera.ThirdPartEffect.Pott.attrInfo.MMFrameGeomeAttrInfo;
import com.momo.mcamera.util.MDLogTag;
import p153l.d33;
import p153l.lim;

/* JADX INFO: loaded from: classes6.dex */
public class RenderRunner {
    MMFrameGeomeAttrInfo info;
    d33 program;

    public RenderRunner(MMFrameGeomeAttrInfo mMFrameGeomeAttrInfo, d33 d33Var) {
        this.program = d33Var;
        this.info = mMFrameGeomeAttrInfo;
    }

    public static void drawTexture(d33 d33Var, MMFrameGeomeAttrInfo mMFrameGeomeAttrInfo) {
        if (d33Var == null || mMFrameGeomeAttrInfo == null) {
            MDLog.m7453w(MDLogTag.FILTER_TAG, "Input Parameter is invalid !");
            return;
        }
        int[] frameTexture = mMFrameGeomeAttrInfo.getFrameTexture();
        if (frameTexture != null) {
            d33Var.updateGeomtryInfo(mMFrameGeomeAttrInfo);
            d33Var.drawFrame(frameTexture);
        }
    }

    public void recycleData() {
        MMFrameGeomeAttrInfo mMFrameGeomeAttrInfo = this.info;
        if (mMFrameGeomeAttrInfo != null) {
            mMFrameGeomeAttrInfo.recycleResourceInGlThread();
            this.info = null;
        }
        d33 d33Var = this.program;
        if (d33Var != null) {
            d33Var.destroy();
            this.program = null;
        }
    }

    public void renderRunning(long j) {
        MMFrameGeomeAttrInfo mMFrameGeomeAttrInfo = this.info;
        if (mMFrameGeomeAttrInfo == null || this.program == null) {
            MDLog.m7453w(MDLogTag.FILTER_TAG, "Info is null or program is null");
        } else {
            mMFrameGeomeAttrInfo.setTimeStamp(j);
            drawTexture(this.program, this.info);
        }
    }

    public void setTimeStamp(long j) {
        MMFrameGeomeAttrInfo mMFrameGeomeAttrInfo = this.info;
        if (mMFrameGeomeAttrInfo == null) {
            MDLog.m7453w(MDLogTag.FILTER_TAG, "Info is null or program is null");
        } else {
            mMFrameGeomeAttrInfo.setTimeStamp(j);
        }
    }

    public void updateRnederSize(int i, int i2) {
        MMFrameGeomeAttrInfo mMFrameGeomeAttrInfo = this.info;
        if (mMFrameGeomeAttrInfo != null) {
            mMFrameGeomeAttrInfo.setBaseRenderSize(i, i2);
        } else {
            MDLog.m7453w(MDLogTag.FILTER_TAG, "Info is null");
        }
    }

    public static void drawTexture(d33 d33Var, lim limVar, int i) {
        if (d33Var != null && limVar != null && i != 0) {
            d33Var.updateGeomtryInfo(limVar);
            d33Var.drawFrame(new int[]{i});
        } else {
            MDLog.m7453w(MDLogTag.FILTER_TAG, "Input Parameter is invalid !");
        }
    }
}
