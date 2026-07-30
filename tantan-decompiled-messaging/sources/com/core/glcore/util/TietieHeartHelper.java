package com.core.glcore.util;

import com.momo.xeengine.cv.bean.XETTHeartInfo.XETTHeartDataBlock;
import com.momo.xeengine.p044cv.bean.XETTHeartInfo;
import com.momocv.tietieheart.TietieHeart;
import com.momocv.tietieheart.TietieHeartInfo;
import com.momocv.tietieheart.TietieHeartParams;
import java.util.ArrayList;
import java.util.Objects;
import p149l.pjw;
import p149l.vjw;
import p149l.zsf;

/* JADX INFO: loaded from: classes.dex */
public class TietieHeartHelper {
    private static volatile TietieHeartHelper instance;
    private TietieHeart tietieHeartProcess;
    private TietieHeartInfo ttHeartInfo;
    private final float[] ttHeartMatrix = {1.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 1.0f};
    private XETTHeartInfo xeTTHeart;

    private TietieHeartHelper() {
    }

    public static TietieHeartHelper getInstance() {
        if (instance == null) {
            synchronized (TietieHeartHelper.class) {
                try {
                    if (instance == null) {
                        instance = new TietieHeartHelper();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return instance;
    }

    public TietieHeartInfo getTtHeartInfo() {
        return this.ttHeartInfo;
    }

    public XETTHeartInfo getXeTTHeart() {
        return this.xeTTHeart;
    }

    public synchronized TietieHeartInfo process(pjw pjwVar, int i) {
        try {
            DetectDelayStopHelper.getInstance().cancelRelease(DetectDelayStopHelper.TYPE_DETECT_CARTOON);
            if (this.tietieHeartProcess == null) {
                this.tietieHeartProcess = new TietieHeart();
            }
            if (this.ttHeartInfo == null) {
                this.ttHeartInfo = new TietieHeartInfo();
            }
            if (pjwVar == null || pjwVar.m169950n() < 1) {
                TietieHeartInfo tietieHeartInfo = this.ttHeartInfo;
                tietieHeartInfo.warp_mat = null;
                tietieHeartInfo.mask_ = null;
                tietieHeartInfo.mask_width = 0;
                tietieHeartInfo.mask_height = 0;
            } else {
                TietieHeartParams tietieHeartParams = new TietieHeartParams();
                tietieHeartParams.fliped_show_ = pjwVar.f149894a;
                tietieHeartParams.rotate_degree_ = pjwVar.f149895b;
                tietieHeartParams.restore_degree_ = pjwVar.f149896c;
                zsf zsfVarM169946j = pjwVar.m169946j(0);
                if (zsfVarM169946j != null) {
                    float[] fArrM220012c = zsfVarM169946j.m220012c();
                    if (pjwVar.f149894a && fArrM220012c != null && fArrM220012c.length > 1) {
                        fArrM220012c[1] = -fArrM220012c[1];
                    }
                    tietieHeartParams.eular = fArrM220012c;
                }
                if (pjwVar.m169946j(0) != null) {
                    tietieHeartParams.orig_landmarks_222_ = pjwVar.m169946j(0).m220023q();
                }
                vjw vjwVar = new vjw();
                vjwVar.m198695h(i);
                vjwVar.m198694g(pjwVar.f149900g);
                vjwVar.m198693f(pjwVar.f149900g.length);
                vjwVar.m198700m(pjwVar.m169956t());
                vjwVar.m198697j(pjwVar.m169949m());
                vjwVar.m198699l(pjwVar.m169956t());
                pjwVar.m169936B(tietieHeartParams);
                this.tietieHeartProcess.ProcessFrame(vjwVar.m198689b(), tietieHeartParams, this.ttHeartInfo);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.ttHeartInfo;
    }

    public synchronized void release() {
        try {
            TietieHeart tietieHeart = this.tietieHeartProcess;
            if (tietieHeart != null) {
                tietieHeart.Release();
                this.tietieHeartProcess = null;
            }
            this.ttHeartInfo = null;
            this.xeTTHeart = null;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void setTtHeartInfo(pjw pjwVar, TietieHeartInfo tietieHeartInfo) {
        byte[] bArr;
        float[][] fArr;
        float[] fArr2;
        if (tietieHeartInfo == null || (bArr = tietieHeartInfo.mask_) == null || bArr.length <= 0 || tietieHeartInfo.mask_width <= 0 || tietieHeartInfo.mask_height <= 0 || (fArr = tietieHeartInfo.alpha_all) == null || fArr.length <= 0 || (fArr2 = tietieHeartInfo.warp_mat) == null || fArr2.length < 6) {
            this.xeTTHeart = null;
            return;
        }
        if (this.xeTTHeart == null) {
            this.xeTTHeart = new XETTHeartInfo();
        }
        this.xeTTHeart.setDatas(tietieHeartInfo.mask_);
        this.xeTTHeart.setHeight(tietieHeartInfo.mask_height);
        this.xeTTHeart.setWidth(tietieHeartInfo.mask_width);
        this.xeTTHeart.setLength(tietieHeartInfo.mask_.length);
        ArrayList arrayList = new ArrayList();
        float[][] fArr3 = tietieHeartInfo.alpha_all;
        if (fArr3.length <= tietieHeartInfo.cx_all.length && fArr3.length <= tietieHeartInfo.cy_all.length && fArr3.length <= tietieHeartInfo.ddistance_cns_alpha_sort_all.length && fArr3.length <= tietieHeartInfo.intensity_all.length) {
            for (int i = 0; i < tietieHeartInfo.alpha_all.length; i++) {
                XETTHeartInfo xETTHeartInfo = this.xeTTHeart;
                Objects.requireNonNull(xETTHeartInfo);
                XETTHeartInfo.XETTHeartDataBlock xETTHeartDataBlock = xETTHeartInfo.new XETTHeartDataBlock();
                float[] fArr4 = tietieHeartInfo.alpha_all[i];
                xETTHeartDataBlock.f14570cx = tietieHeartInfo.cx_all[i];
                xETTHeartDataBlock.f14571cy = tietieHeartInfo.cy_all[i];
                xETTHeartDataBlock.intensity = tietieHeartInfo.intensity_all[i];
                xETTHeartDataBlock.setDistances(tietieHeartInfo.ddistance_cns_alpha_sort_all[i]);
                xETTHeartDataBlock.setAlphas(fArr4);
                arrayList.add(xETTHeartDataBlock);
            }
        }
        this.xeTTHeart.setDataBlocks(arrayList);
        float[] fArr5 = this.ttHeartMatrix;
        float[] fArr6 = tietieHeartInfo.warp_mat;
        fArr5[0] = fArr6[0];
        fArr5[3] = fArr6[1];
        fArr5[6] = fArr6[2];
        fArr5[1] = fArr6[3];
        fArr5[4] = fArr6[4];
        fArr5[7] = fArr6[5];
        this.xeTTHeart.setWarpMat(fArr5);
        this.xeTTHeart.setFlipShowX(pjwVar.f149894a);
    }

    public void setXeTTHeart(XETTHeartInfo xETTHeartInfo) {
        this.xeTTHeart = xETTHeartInfo;
    }

    public synchronized TietieHeartInfo process(pjw pjwVar) {
        return process(pjwVar, 17);
    }

    public void setTtHeartInfo(TietieHeartInfo tietieHeartInfo) {
        this.ttHeartInfo = tietieHeartInfo;
    }
}
