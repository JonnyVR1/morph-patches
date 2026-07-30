package com.momo.mcamera.liveprocessor;

import android.text.TextUtils;
import com.momocv.stylizeface.Stylizeface;
import com.momocv.stylizeface.StylizefaceInfo;
import com.momocv.stylizeface.StylizefaceParams;
import java.util.List;
import p149l.pjw;
import p149l.vjw;
import p149l.zsf;

/* JADX INFO: loaded from: classes6.dex */
public class StylizeFaceProcessor implements IProcessor<StylizefaceInfo> {
    private StylizefaceInfo mask;
    private vjw mmFrame;
    private String modelPath;
    private StylizefaceParams params;
    private Stylizeface stylizeFaceProcess;
    private float scaleFactor = -1.0f;
    private volatile boolean isLoading = false;
    private volatile boolean isLoadSuccess = false;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.momo.mcamera.liveprocessor.IProcessor
    public StylizefaceInfo process(pjw pjwVar) {
        if (pjwVar == null) {
            return null;
        }
        if (this.stylizeFaceProcess == null) {
            this.stylizeFaceProcess = new Stylizeface();
        }
        if (!this.isLoading && !this.isLoadSuccess && !TextUtils.isEmpty(this.modelPath)) {
            this.isLoading = true;
            new Thread(new Runnable() { // from class: com.momo.mcamera.liveprocessor.StylizeFaceProcessor.1
                @Override // java.lang.Runnable
                public void run() {
                    StylizeFaceProcessor stylizeFaceProcessor = StylizeFaceProcessor.this;
                    stylizeFaceProcessor.isLoadSuccess = stylizeFaceProcessor.stylizeFaceProcess.LoadModel(StylizeFaceProcessor.this.modelPath);
                    StylizeFaceProcessor.this.isLoading = false;
                }
            }).start();
        }
        if (!this.isLoadSuccess) {
            return null;
        }
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
            for (int i = 0; i < iM169950n; i++) {
                zsf zsfVarM169946j = pjwVar.m169946j(i);
                this.params.orig_landmarks_222_all[i] = zsfVarM169946j.m220023q();
                this.params.eular_all[i] = zsfVarM169946j.m220012c();
            }
            if (this.mmFrame == null) {
                this.mmFrame = new vjw();
            }
            this.mmFrame.m198695h(17);
            this.mmFrame.m198694g(pjwVar.f149900g);
            this.mmFrame.m198693f(pjwVar.f149900g.length);
            this.mmFrame.m198700m(pjwVar.m169956t());
            this.mmFrame.m198697j(pjwVar.m169949m());
            this.mmFrame.m198699l(pjwVar.m169956t());
            pjwVar.m169936B(this.params);
            this.stylizeFaceProcess.ProcessFrame(this.mmFrame.m198689b(), this.params, this.mask);
        } else {
            StylizefaceInfo stylizefaceInfo = this.mask;
            stylizefaceInfo.warp_mat_all = null;
            stylizefaceInfo.mask_all = null;
            stylizefaceInfo.mask_width = 0;
            stylizefaceInfo.mask_height = 0;
        }
        return this.mask;
    }

    @Override // com.momo.mcamera.liveprocessor.IProcessor
    public void release() {
        Stylizeface stylizeface = this.stylizeFaceProcess;
        if (stylizeface != null) {
            stylizeface.Release();
            this.stylizeFaceProcess = null;
            this.mask = null;
        }
        this.isLoading = false;
        this.isLoadSuccess = false;
    }

    @Override // com.momo.mcamera.liveprocessor.IProcessor
    public void setModelPath(List<String> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        this.modelPath = list.get(0);
    }

    public void setScaleFactor(float f) {
        this.scaleFactor = f;
    }
}
