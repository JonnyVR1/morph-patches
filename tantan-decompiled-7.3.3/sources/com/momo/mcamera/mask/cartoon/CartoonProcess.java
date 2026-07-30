package com.momo.mcamera.mask.cartoon;

import com.core.glcore.util.DetectDelayStopHelper;
import com.immomo.mmutil.task.C3949c;
import com.momocv.cartoonface.Cartoonface;
import com.momocv.cartoonface.CartoonfaceInfo;
import com.momocv.cartoonface.CartoonfaceParams;
import p153l.nuf;
import p153l.omw;
import p153l.umw;

/* JADX INFO: loaded from: classes8.dex */
public class CartoonProcess {
    private static volatile boolean isLoadedModel = false;
    public static volatile String path = null;
    private static volatile boolean resetPath = false;
    private static volatile boolean startLoad = false;
    private Cartoonface cartoonProcess;
    private CartoonfaceInfo mask;
    private umw mmFrame;
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
        C3949c.m19427d(2, new Runnable() { // from class: com.momo.mcamera.mask.cartoon.CartoonProcess.1
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

    public synchronized CartoonfaceInfo process(omw omwVar, int i, boolean z) {
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
            if (omwVar.m168299n() >= 1) {
                if (this.params == null) {
                    this.params = new CartoonfaceParams();
                }
                CartoonfaceParams cartoonfaceParams = this.params;
                cartoonfaceParams.fliped_show_ = omwVar.f148014a;
                cartoonfaceParams.rotate_degree_ = omwVar.f148015b;
                cartoonfaceParams.restore_degree_ = omwVar.f148016c;
                if (omwVar.m168295j(0) != null) {
                    nuf nufVarM168295j = omwVar.m168295j(0);
                    this.params.orig_landmarks_222_ = nufVarM168295j.m164786q();
                    this.params.eular = nufVarM168295j.m164775c();
                }
                if (this.mmFrame == null) {
                    this.mmFrame = new umw();
                }
                this.mmFrame.m196802h(i);
                this.mmFrame.m196801g(omwVar.f148020g);
                this.mmFrame.m196800f(omwVar.f148020g.length);
                this.mmFrame.m196807m(omwVar.m168305t());
                this.mmFrame.m196804j(omwVar.m168298m());
                this.mmFrame.m196806l(omwVar.m168305t());
                if (isLoadedModel) {
                    omwVar.m168285B(this.params);
                    this.cartoonProcess.ProcessFrame(this.mmFrame.m196796b(), this.params, this.mask);
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

    public synchronized CartoonfaceInfo process(omw omwVar) {
        return process(omwVar, 17, false);
    }
}
