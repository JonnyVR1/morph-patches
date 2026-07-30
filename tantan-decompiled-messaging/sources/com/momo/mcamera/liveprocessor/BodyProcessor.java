package com.momo.mcamera.liveprocessor;

import android.text.TextUtils;
import com.momocv.bodylandmark.BodyLandmark;
import com.momocv.bodylandmark.BodyLandmarkParams;
import com.momocv.bodylandmark.BodyLandmarkPostInfo;
import java.util.List;
import p149l.mkw;
import p149l.pjw;
import p149l.vjw;

/* JADX INFO: loaded from: classes6.dex */
public class BodyProcessor implements IProcessor<BodyLandmarkPostInfo> {
    private static BodyLandmark bodyLandmark;
    private BodyLandmarkPostInfo bodyLandmarkPostInfo;
    private vjw mmFrame;
    private String modelPath;
    private mkw params;
    private volatile boolean isLoading = false;
    private volatile boolean isLoadSuccess = false;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.momo.mcamera.liveprocessor.IProcessor
    public BodyLandmarkPostInfo process(pjw pjwVar) {
        if (pjwVar == null) {
            return null;
        }
        if (bodyLandmark == null) {
            bodyLandmark = new BodyLandmark();
        }
        if (!this.isLoading && !this.isLoadSuccess && !TextUtils.isEmpty(this.modelPath)) {
            this.isLoading = true;
            new Thread(new Runnable() { // from class: com.momo.mcamera.liveprocessor.BodyProcessor.1
                @Override // java.lang.Runnable
                public void run() {
                    BodyProcessor.this.isLoadSuccess = BodyProcessor.bodyLandmark.LoadModel(BodyProcessor.this.modelPath);
                    BodyProcessor.this.isLoading = false;
                }
            }).start();
        }
        if (!this.isLoadSuccess) {
            return null;
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
        if (this.params == null) {
            this.params = new mkw(5);
        }
        this.params.m155094p(pjwVar.f149894a);
        this.params.m155066A(pjwVar.f149895b);
        this.params.m155104z(pjwVar.f149896c);
        this.params.m155073H(true);
        if (this.bodyLandmarkPostInfo == null) {
            this.bodyLandmarkPostInfo = new BodyLandmarkPostInfo();
        }
        bodyLandmark.ProcessFrame(this.mmFrame.m198689b(), (BodyLandmarkParams) this.params.m155081c(), this.bodyLandmarkPostInfo);
        return this.bodyLandmarkPostInfo;
    }

    @Override // com.momo.mcamera.liveprocessor.IProcessor
    public void release() {
        BodyLandmark bodyLandmark2 = bodyLandmark;
        if (bodyLandmark2 != null) {
            bodyLandmark2.Release();
            bodyLandmark = null;
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
