package com.momo.mcamera.mask.cartoon;

import android.text.TextUtils;
import com.immomo.mmutil.task.C3949c;
import com.momocv.stylizeface.Stylizeface;
import com.momocv.stylizeface.StylizefaceInfo;
import com.momocv.stylizeface.StylizefaceParams;
import p153l.nuf;
import p153l.omw;
import p153l.umw;

/* JADX INFO: loaded from: classes8.dex */
public class StylizeFaceProcess implements IProcess {
    public static final String NAME = "StylizeFaceProcess";
    private static volatile boolean isLoadedModel = false;
    private static volatile String modelPath = "";
    private static volatile boolean startLoad = false;
    private StylizefaceInfo mask;
    private umw mmFrame;
    private StylizefaceParams params;
    private float scaleFactor = -1.0f;
    private Stylizeface stylizeFaceProcess = new Stylizeface();

    private synchronized void asyncLoadModel(final ILoadModelListener iLoadModelListener) {
        if (!TextUtils.isEmpty(modelPath) && !startLoad && !isLoadedModel) {
            startLoad = true;
            C3949c.m19427d(2, new Runnable() { // from class: com.momo.mcamera.mask.cartoon.StylizeFaceProcess.1
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

    public synchronized StylizefaceInfo process(omw omwVar, int i, boolean z) {
        try {
            loadModel(z);
            if (this.mask == null) {
                this.mask = new StylizefaceInfo();
            }
            if (omwVar.m168299n() >= 1) {
                if (this.params == null) {
                    this.params = new StylizefaceParams();
                }
                StylizefaceParams stylizefaceParams = this.params;
                stylizefaceParams.fliped_show_ = omwVar.f148014a;
                stylizefaceParams.rotate_degree_ = omwVar.f148015b;
                stylizefaceParams.restore_degree_ = omwVar.f148016c;
                stylizefaceParams.scale_factor_ = this.scaleFactor;
                int iM168299n = omwVar.m168299n();
                StylizefaceParams stylizefaceParams2 = this.params;
                stylizefaceParams2.orig_landmarks_222_all = new float[iM168299n][];
                stylizefaceParams2.eular_all = new float[iM168299n][];
                for (int i2 = 0; i2 < iM168299n; i2++) {
                    nuf nufVarM168295j = omwVar.m168295j(i2);
                    this.params.orig_landmarks_222_all[i2] = nufVarM168295j.m164786q();
                    this.params.eular_all[i2] = nufVarM168295j.m164775c();
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
                if (isLoadedModel && this.stylizeFaceProcess != null) {
                    omwVar.m168285B(this.params);
                    this.stylizeFaceProcess.ProcessFrame(this.mmFrame.m196796b(), this.params, this.mask);
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
    public synchronized Object process(omw omwVar) {
        return process(omwVar, 17, false);
    }
}
