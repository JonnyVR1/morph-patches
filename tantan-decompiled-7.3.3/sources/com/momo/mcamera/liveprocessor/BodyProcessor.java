package com.momo.mcamera.liveprocessor;

import android.text.TextUtils;
import com.momocv.bodylandmark.BodyLandmark;
import com.momocv.bodylandmark.BodyLandmarkParams;
import com.momocv.bodylandmark.BodyLandmarkPostInfo;
import java.util.List;
import p153l.lnw;
import p153l.omw;
import p153l.umw;

/* JADX INFO: loaded from: classes6.dex */
public class BodyProcessor implements IProcessor<BodyLandmarkPostInfo> {
    private static BodyLandmark bodyLandmark;
    private BodyLandmarkPostInfo bodyLandmarkPostInfo;
    private umw mmFrame;
    private String modelPath;
    private lnw params;
    private volatile boolean isLoading = false;
    private volatile boolean isLoadSuccess = false;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.momo.mcamera.liveprocessor.IProcessor
    public BodyLandmarkPostInfo process(omw omwVar) {
        if (omwVar == null) {
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
            this.mmFrame = new umw();
        }
        this.mmFrame.m196802h(17);
        this.mmFrame.m196801g(omwVar.f148020g);
        this.mmFrame.m196800f(omwVar.f148020g.length);
        this.mmFrame.m196807m(omwVar.m168305t());
        this.mmFrame.m196804j(omwVar.m168298m());
        this.mmFrame.m196806l(omwVar.m168305t());
        if (this.params == null) {
            this.params = new lnw(5);
        }
        this.params.m155021p(omwVar.f148014a);
        this.params.m154993A(omwVar.f148015b);
        this.params.m155031z(omwVar.f148016c);
        this.params.m155000H(true);
        if (this.bodyLandmarkPostInfo == null) {
            this.bodyLandmarkPostInfo = new BodyLandmarkPostInfo();
        }
        bodyLandmark.ProcessFrame(this.mmFrame.m196796b(), (BodyLandmarkParams) this.params.m155008c(), this.bodyLandmarkPostInfo);
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
