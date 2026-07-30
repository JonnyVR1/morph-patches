package com.momo.mcamera.mask.cartoon;

import com.core.glcore.util.DetectDelayStopHelper;
import com.immomo.mmutil.task.C3804c;
import com.momocv.cartoonface.Cartoonface;
import com.momocv.cartoonface.CartoonfaceInfo;
import com.momocv.cartoonface.CartoonfaceParams;
import p149l.pjw;
import p149l.vjw;
import p149l.zsf;

/* JADX INFO: loaded from: classes7.dex */
public class CartoonProcess {
    private static volatile boolean isLoadedModel = false;
    public static volatile String path = null;
    private static volatile boolean resetPath = false;
    private static volatile boolean startLoad = false;
    private Cartoonface cartoonProcess;
    private CartoonfaceInfo mask;
    private vjw mmFrame;
    private CartoonfaceParams params;
    private volatile boolean release = true;

    private void loadModel(boolean z) {
        if (z) {
            startLoad = true;
            isLoadedModel = this.cartoonProcess.LoadModel(path);
            if (isLoadedModel) {
                return;
            }
            String.format("cartoon model is invalid:%s", path);
            return;
        }
        if (path == null || startLoad || isLoadedModel) {
            return;
        }
        startLoad = true;
        C3804c.m18444d(2, new Runnable() { // from class: com.momo.mcamera.mask.cartoon.CartoonProcess.1
            @Override // java.lang.Runnable
            public void run() {
                boolean unused = CartoonProcess.isLoadedModel = CartoonProcess.this.cartoonProcess.LoadModel(CartoonProcess.path);
                if (CartoonProcess.isLoadedModel) {
                    return;
                }
                String.format("cartoon model is invalid:%s", CartoonProcess.path);
            }
        });
    }

    public static void resetPath(String str) {
        if (str == null || str.equals(path)) {
            return;
        }
        path = str;
        resetPath = true;
    }

    public void delayRelease() {
        if (this.release) {
            return;
        }
        this.release = true;
        DetectDelayStopHelper.getInstance().delayRelease(DetectDelayStopHelper.TYPE_DETECT_CARTOON, new Runnable() { // from class: com.momo.mcamera.mask.cartoon.CartoonProcess.2
            @Override // java.lang.Runnable
            public void run() {
                CartoonProcess.this.release();
            }
        });
    }

    public synchronized CartoonfaceInfo process(pjw pjwVar, int i, boolean z) {
        try {
            DetectDelayStopHelper.getInstance().cancelRelease(DetectDelayStopHelper.TYPE_DETECT_CARTOON);
            this.release = false;
            if (resetPath) {
                Cartoonface cartoonface = this.cartoonProcess;
                if (cartoonface != null) {
                    cartoonface.Release();
                    this.cartoonProcess = null;
                    this.mask = null;
                }
                isLoadedModel = false;
                startLoad = false;
                resetPath = false;
            }
            if (this.cartoonProcess == null) {
                this.cartoonProcess = new Cartoonface();
            }
            loadModel(z);
            if (this.mask == null) {
                this.mask = new CartoonfaceInfo();
            }
            if (pjwVar.m169950n() >= 1) {
                if (this.params == null) {
                    this.params = new CartoonfaceParams();
                }
                CartoonfaceParams cartoonfaceParams = this.params;
                cartoonfaceParams.fliped_show_ = pjwVar.f149894a;
                cartoonfaceParams.rotate_degree_ = pjwVar.f149895b;
                cartoonfaceParams.restore_degree_ = pjwVar.f149896c;
                if (pjwVar.m169946j(0) != null) {
                    zsf zsfVarM169946j = pjwVar.m169946j(0);
                    this.params.orig_landmarks_222_ = zsfVarM169946j.m220023q();
                    this.params.eular = zsfVarM169946j.m220012c();
                }
                if (this.mmFrame == null) {
                    this.mmFrame = new vjw();
                }
                this.mmFrame.m198695h(i);
                this.mmFrame.m198694g(pjwVar.f149900g);
                this.mmFrame.m198693f(pjwVar.f149900g.length);
                this.mmFrame.m198700m(pjwVar.m169956t());
                this.mmFrame.m198697j(pjwVar.m169949m());
                this.mmFrame.m198699l(pjwVar.m169956t());
                if (isLoadedModel) {
                    pjwVar.m169936B(this.params);
                    this.cartoonProcess.ProcessFrame(this.mmFrame.m198689b(), this.params, this.mask);
                }
            } else {
                CartoonfaceInfo cartoonfaceInfo = this.mask;
                cartoonfaceInfo.warp_mat = null;
                cartoonfaceInfo.mask_ = null;
                cartoonfaceInfo.mask_width = 0;
                cartoonfaceInfo.mask_height = 0;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.mask;
    }

    public synchronized void release() {
        try {
            Cartoonface cartoonface = this.cartoonProcess;
            if (cartoonface != null) {
                cartoonface.Release();
                this.cartoonProcess = null;
                this.mask = null;
            }
            startLoad = false;
            isLoadedModel = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void switchCartoon() {
        this.mask = null;
        startLoad = false;
        isLoadedModel = false;
    }

    public synchronized CartoonfaceInfo process(pjw pjwVar) {
        return process(pjwVar, 17, false);
    }
}
