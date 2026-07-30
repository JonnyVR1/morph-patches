package com.momo.mcamera.liveprocessor;

import android.text.TextUtils;
import com.momocv.segmentation.Segmentation;
import com.momocv.segmentation.SegmentationInfo;
import com.momocv.segmentation.SegmentationParams;
import java.util.Arrays;
import java.util.List;
import p149l.mkw;
import p149l.pjw;
import p149l.vjw;

/* JADX INFO: loaded from: classes6.dex */
public class MomoSegmentProcessor implements IProcessor<SegmentationInfo> {
    private SegmentationInfo info;
    private vjw mmFrame;
    private String modelPath;
    private mkw params;
    private Segmentation segmentation;
    private volatile boolean isLoading = false;
    private volatile boolean isLoadSuccess = false;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.momo.mcamera.liveprocessor.IProcessor
    public SegmentationInfo process(pjw pjwVar) {
        if (pjwVar == null) {
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
            this.params = new mkw(4);
        }
        this.params.m155094p(pjwVar.f149894a);
        this.params.m155066A(pjwVar.f149895b);
        this.params.m155104z(pjwVar.f149896c);
        if (this.mmFrame == null) {
            this.mmFrame = new vjw();
        }
        this.mmFrame.m198695h(17);
        this.mmFrame.m198694g(pjwVar.f149900g);
        this.mmFrame.m198693f(pjwVar.f149900g.length);
        this.mmFrame.m198700m(pjwVar.m169956t());
        this.mmFrame.m198697j(pjwVar.m169949m());
        this.mmFrame.m198699l(pjwVar.m169956t());
        if (this.info == null) {
            this.info = new SegmentationInfo();
        }
        byte[] bArr = this.info.mask_;
        if (bArr == null || bArr.length != this.mmFrame.m198692e() * this.mmFrame.m198690c()) {
            this.info.mask_ = new byte[this.mmFrame.m198692e() * this.mmFrame.m198690c()];
            Arrays.fill(this.info.mask_, (byte) -1);
        }
        pjwVar.m169936B(this.params.m155081c());
        this.segmentation.ProcessFrame(this.mmFrame.m198689b(), (SegmentationParams) this.params.m155081c(), this.info);
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
