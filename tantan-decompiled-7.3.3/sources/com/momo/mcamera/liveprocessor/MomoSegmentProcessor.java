package com.momo.mcamera.liveprocessor;

import android.text.TextUtils;
import com.momocv.segmentation.Segmentation;
import com.momocv.segmentation.SegmentationInfo;
import com.momocv.segmentation.SegmentationParams;
import java.util.Arrays;
import java.util.List;
import p153l.lnw;
import p153l.omw;
import p153l.umw;

/* JADX INFO: loaded from: classes6.dex */
public class MomoSegmentProcessor implements IProcessor<SegmentationInfo> {
    private SegmentationInfo info;
    private umw mmFrame;
    private String modelPath;
    private lnw params;
    private Segmentation segmentation;
    private volatile boolean isLoading = false;
    private volatile boolean isLoadSuccess = false;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.momo.mcamera.liveprocessor.IProcessor
    public SegmentationInfo process(omw omwVar) {
        if (omwVar == null) {
            return null;
        }
        if (this.segmentation == null) {
            this.segmentation = new Segmentation();
        }
        if (!this.isLoading && !this.isLoadSuccess && !TextUtils.isEmpty(this.modelPath)) {
            this.isLoading = true;
            new Thread(new Runnable() { // from class: com.momo.mcamera.liveprocessor.MomoSegmentProcessor.1
                @Override // java.lang.Runnable
                public void run() {
                    MomoSegmentProcessor momoSegmentProcessor = MomoSegmentProcessor.this;
                    momoSegmentProcessor.isLoadSuccess = momoSegmentProcessor.segmentation.LoadModel(MomoSegmentProcessor.this.modelPath);
                    MomoSegmentProcessor.this.isLoading = false;
                }
            }).start();
        }
        if (!this.isLoadSuccess) {
            return null;
        }
        if (this.params == null) {
            this.params = new lnw(4);
        }
        this.params.m155021p(omwVar.f148014a);
        this.params.m154993A(omwVar.f148015b);
        this.params.m155031z(omwVar.f148016c);
        if (this.mmFrame == null) {
            this.mmFrame = new umw();
        }
        this.mmFrame.m196802h(17);
        this.mmFrame.m196801g(omwVar.f148020g);
        this.mmFrame.m196800f(omwVar.f148020g.length);
        this.mmFrame.m196807m(omwVar.m168305t());
        this.mmFrame.m196804j(omwVar.m168298m());
        this.mmFrame.m196806l(omwVar.m168305t());
        if (this.info == null) {
            this.info = new SegmentationInfo();
        }
        byte[] bArr = this.info.mask_;
        if (bArr == null || bArr.length != this.mmFrame.m196799e() * this.mmFrame.m196797c()) {
            this.info.mask_ = new byte[this.mmFrame.m196799e() * this.mmFrame.m196797c()];
            Arrays.fill(this.info.mask_, (byte) -1);
        }
        omwVar.m168285B(this.params.m155008c());
        this.segmentation.ProcessFrame(this.mmFrame.m196796b(), (SegmentationParams) this.params.m155008c(), this.info);
        return this.info;
    }

    @Override // com.momo.mcamera.liveprocessor.IProcessor
    public void release() {
        Segmentation segmentation = this.segmentation;
        if (segmentation != null) {
            segmentation.Release();
            this.segmentation = null;
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
}
