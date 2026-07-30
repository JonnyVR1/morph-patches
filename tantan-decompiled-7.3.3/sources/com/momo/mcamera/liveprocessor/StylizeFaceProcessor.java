package com.momo.mcamera.liveprocessor;

import android.text.TextUtils;
import com.momocv.stylizeface.Stylizeface;
import com.momocv.stylizeface.StylizefaceInfo;
import com.momocv.stylizeface.StylizefaceParams;
import java.util.List;
import p153l.nuf;
import p153l.omw;
import p153l.umw;

/* JADX INFO: loaded from: classes6.dex */
public class StylizeFaceProcessor implements IProcessor<StylizefaceInfo> {
    private StylizefaceInfo mask;
    private umw mmFrame;
    private String modelPath;
    private StylizefaceParams params;
    private Stylizeface stylizeFaceProcess;
    private float scaleFactor = -1.0f;
    private volatile boolean isLoading = false;
    private volatile boolean isLoadSuccess = false;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.momo.mcamera.liveprocessor.IProcessor
    public StylizefaceInfo process(omw omwVar) {
        if (omwVar == null) {
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
            for (int i = 0; i < iM168299n; i++) {
                nuf nufVarM168295j = omwVar.m168295j(i);
                this.params.orig_landmarks_222_all[i] = nufVarM168295j.m164786q();
                this.params.eular_all[i] = nufVarM168295j.m164775c();
            }
            if (this.mmFrame == null) {
                this.mmFrame = new umw();
            }
            this.mmFrame.m196802h(17);
            this.mmFrame.m196801g(omwVar.f148020g);
            this.mmFrame.m196800f(omwVar.f148020g.length);
            this.mmFrame.m196807m(omwVar.m168305t());
            this.mmFrame.m196804j(omwVar.m168298m());
            this.mmFrame.m196806l(omwVar.m168305t());
            omwVar.m168285B(this.params);
            this.stylizeFaceProcess.ProcessFrame(this.mmFrame.m196796b(), this.params, this.mask);
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
