package com.momo.mcamera.mask.cartoon;

import android.text.TextUtils;
import com.immomo.mmutil.task.C3804c;
import com.momocv.stylizeface.Stylizeface;
import com.momocv.stylizeface.StylizefaceInfo;
import com.momocv.stylizeface.StylizefaceParams;
import p149l.pjw;
import p149l.vjw;
import p149l.zsf;

/* JADX INFO: loaded from: classes7.dex */
public class StylizeFaceProcess implements IProcess {
    public static final String NAME = "StylizeFaceProcess";
    private static volatile boolean isLoadedModel = false;
    private static volatile String modelPath = "";
    private static volatile boolean startLoad = false;
    private StylizefaceInfo mask;
    private vjw mmFrame;
    private StylizefaceParams params;
    private float scaleFactor = -1.0f;
    private Stylizeface stylizeFaceProcess = new Stylizeface();

    private synchronized void asyncLoadModel(final ILoadModelListener iLoadModelListener) {
        if (!TextUtils.isEmpty(modelPath) && !startLoad && !isLoadedModel) {
            startLoad = true;
            C3804c.m18444d(2, new Runnable() { // from class: com.momo.mcamera.mask.cartoon.StylizeFaceProcess.1
                @Override // java.lang.Runnable
                public void run() {
                    if (StylizeFaceProcess.this.stylizeFaceProcess != null) {
                        boolean unused = StylizeFaceProcess.isLoadedModel = StylizeFaceProcess.this.stylizeFaceProcess.LoadModel(StylizeFaceProcess.modelPath);
                        if (StylizeFaceProcess.isLoadedModel) {
                            ILoadModelListener iLoadModelListener2 = iLoadModelListener;
                            if (iLoadModelListener2 != null) {
                                iLoadModelListener2.onComplete(StylizeFaceProcess.NAME);
                            }
                        } else {
                            String.format("cartoon model is invalid:%s", StylizeFaceProcess.this.stylizeFaceProcess);
                        }
                        boolean unused2 = StylizeFaceProcess.startLoad = false;
                    }
                }
            });
        }
    }

    private void loadModel(boolean z) {
        if (z) {
            syncLoadModel();
        } else {
            asyncLoadModel(null);
        }
    }

    private void syncLoadModel() {
        Stylizeface stylizeface = this.stylizeFaceProcess;
        if (stylizeface != null) {
            isLoadedModel = stylizeface.LoadModel(modelPath);
            if (isLoadedModel) {
                return;
            }
            String.format("cartoon model is invalid:%s", this.stylizeFaceProcess);
        }
    }

    public void preloadModel(ILoadModelListener iLoadModelListener) {
        asyncLoadModel(iLoadModelListener);
    }

    public synchronized StylizefaceInfo process(pjw pjwVar, int i, boolean z) {
        try {
            loadModel(z);
            if (this.mask == null) {
                this.mask = new StylizefaceInfo();
            }
            if (pjwVar.m169950n() >= 1) {
                if (this.params == null) {
                    this.params = new StylizefaceParams();
                }
                StylizefaceParams stylizefaceParams = this.params;
                stylizefaceParams.fliped_show_ = pjwVar.f149894a;
                stylizefaceParams.rotate_degree_ = pjwVar.f149895b;
                stylizefaceParams.restore_degree_ = pjwVar.f149896c;
                stylizefaceParams.scale_factor_ = this.scaleFactor;
                int iM169950n = pjwVar.m169950n();
                StylizefaceParams stylizefaceParams2 = this.params;
                stylizefaceParams2.orig_landmarks_222_all = new float[iM169950n][];
                stylizefaceParams2.eular_all = new float[iM169950n][];
                for (int i2 = 0; i2 < iM169950n; i2++) {
                    zsf zsfVarM169946j = pjwVar.m169946j(i2);
                    this.params.orig_landmarks_222_all[i2] = zsfVarM169946j.m220023q();
                    this.params.eular_all[i2] = zsfVarM169946j.m220012c();
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
                if (isLoadedModel && this.stylizeFaceProcess != null) {
                    pjwVar.m169936B(this.params);
                    this.stylizeFaceProcess.ProcessFrame(this.mmFrame.m198689b(), this.params, this.mask);
                }
            } else {
                StylizefaceInfo stylizefaceInfo = this.mask;
                stylizefaceInfo.warp_mat_all = null;
                stylizefaceInfo.mask_all = null;
                stylizefaceInfo.mask_width = 0;
                stylizefaceInfo.mask_height = 0;
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.mask;
    }

    @Override // com.momo.mcamera.mask.cartoon.IProcess
    public void release() {
        Stylizeface stylizeface = this.stylizeFaceProcess;
        if (stylizeface != null) {
            stylizeface.Release();
            this.stylizeFaceProcess = null;
            this.mask = null;
        }
        isLoadedModel = false;
        startLoad = false;
    }

    @Override // com.momo.mcamera.mask.cartoon.IProcess
    public void setModelPath(String str) {
        modelPath = str;
    }

    public void setScaleFactor(float f) {
        this.scaleFactor = f;
    }

    @Override // com.momo.mcamera.mask.cartoon.IProcess
    public synchronized Object process(pjw pjwVar) {
        return process(pjwVar, 17, false);
    }
}
