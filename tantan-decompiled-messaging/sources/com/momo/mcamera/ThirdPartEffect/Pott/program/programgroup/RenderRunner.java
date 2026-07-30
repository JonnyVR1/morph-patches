package com.momo.mcamera.ThirdPartEffect.Pott.program.programgroup;

import com.cosmos.mdlog.MDLog;
import com.momo.mcamera.ThirdPartEffect.Pott.attrInfo.MMFrameGeomeAttrInfo;
import com.momo.mcamera.util.MDLogTag;
import p149l.igm;
import p149l.n23;

/* JADX INFO: loaded from: classes6.dex */
public class RenderRunner {
    MMFrameGeomeAttrInfo info;
    n23 program;

    public RenderRunner(MMFrameGeomeAttrInfo mMFrameGeomeAttrInfo, n23 n23Var) {
        this.program = n23Var;
        this.info = mMFrameGeomeAttrInfo;
    }

    public static void drawTexture(n23 n23Var, MMFrameGeomeAttrInfo mMFrameGeomeAttrInfo) {
        if (n23Var == null || mMFrameGeomeAttrInfo == null) {
            MDLog.m7399w(MDLogTag.FILTER_TAG, "Input Parameter is invalid !");
            return;
        }
        int[] frameTexture = mMFrameGeomeAttrInfo.getFrameTexture();
        if (frameTexture != null) {
            n23Var.updateGeomtryInfo(mMFrameGeomeAttrInfo);
            n23Var.drawFrame(frameTexture);
        }
    }

    public void recycleData() {
        MMFrameGeomeAttrInfo mMFrameGeomeAttrInfo = this.info;
        if (mMFrameGeomeAttrInfo != null) {
            mMFrameGeomeAttrInfo.recycleResourceInGlThread();
            this.info = null;
        }
        n23 n23Var = this.program;
        if (n23Var != null) {
            n23Var.destroy();
            this.program = null;
        }
    }

    public void renderRunning(long j) {
        MMFrameGeomeAttrInfo mMFrameGeomeAttrInfo = this.info;
        if (mMFrameGeomeAttrInfo == null || this.program == null) {
            MDLog.m7399w(MDLogTag.FILTER_TAG, "Info is null or program is null");
        } else {
            mMFrameGeomeAttrInfo.setTimeStamp(j);
            drawTexture(this.program, this.info);
        }
    }

    public void setTimeStamp(long j) {
        MMFrameGeomeAttrInfo mMFrameGeomeAttrInfo = this.info;
        if (mMFrameGeomeAttrInfo == null) {
            MDLog.m7399w(MDLogTag.FILTER_TAG, "Info is null or program is null");
        } else {
            mMFrameGeomeAttrInfo.setTimeStamp(j);
        }
    }

    public void updateRnederSize(int i, int i2) {
        MMFrameGeomeAttrInfo mMFrameGeomeAttrInfo = this.info;
        if (mMFrameGeomeAttrInfo != null) {
            mMFrameGeomeAttrInfo.setBaseRenderSize(i, i2);
        } else {
            MDLog.m7399w(MDLogTag.FILTER_TAG, "Info is null");
        }
    }

    public static void drawTexture(n23 n23Var, igm igmVar, int i) {
        if (n23Var != null && igmVar != null && i != 0) {
            n23Var.updateGeomtryInfo(igmVar);
            n23Var.drawFrame(new int[]{i});
        } else {
            MDLog.m7399w(MDLogTag.FILTER_TAG, "Input Parameter is invalid !");
        }
    }
}
