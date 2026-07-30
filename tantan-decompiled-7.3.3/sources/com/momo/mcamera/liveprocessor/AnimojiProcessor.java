package com.momo.mcamera.liveprocessor;

import android.text.TextUtils;
import com.momocv.SingleFaceInfo;
import com.momocv.facerigv3.FaceRigV3;
import com.momocv.facerigv3.FacerigV3Params;
import java.util.List;
import p153l.evf;
import p153l.omw;
import p153l.umw;

/* JADX INFO: loaded from: classes6.dex */
public class AnimojiProcessor implements IProcessor<evf> {
    private String faceRigPath;
    private FaceRigV3 faceRigV3;
    private umw mmFrame;
    private FacerigV3Params params;
    private evf singleFaceRigInfo;
    private volatile boolean isLoading = false;
    private volatile boolean isLoadSuccess = false;
    private int faceProcessType = 1;

    @Override // com.momo.mcamera.liveprocessor.IProcessor
    public evf process(omw omwVar) {
        SingleFaceInfo singleFaceInfo;
        float[] fArr;
        float[] fArr2;
        if (omwVar == null) {
            return null;
        }
        if (this.faceRigV3 == null) {
            this.faceRigV3 = new FaceRigV3();
        }
        if (!this.isLoading && !this.isLoadSuccess && !TextUtils.isEmpty(this.faceRigPath)) {
            this.isLoading = true;
            new Thread(new Runnable() { // from class: com.momo.mcamera.liveprocessor.AnimojiProcessor.1
                @Override // java.lang.Runnable
                public void run() {
                    AnimojiProcessor animojiProcessor = AnimojiProcessor.this;
                    animojiProcessor.isLoadSuccess = animojiProcessor.faceRigV3.LoadModel(AnimojiProcessor.this.faceRigPath);
                    AnimojiProcessor.this.isLoading = false;
                }
            }).start();
        }
        if (!this.isLoadSuccess) {
            return null;
        }
        if (this.params == null) {
            this.params = new FacerigV3Params();
        }
        FacerigV3Params facerigV3Params = this.params;
        facerigV3Params.rotate_degree_ = omwVar.f148015b;
        facerigV3Params.restore_degree_ = omwVar.f148016c;
        facerigV3Params.fliped_show_ = omwVar.f148014a;
        if (this.mmFrame == null) {
            this.mmFrame = new umw();
        }
        this.mmFrame.m196802h(17);
        this.mmFrame.m196801g(omwVar.f148020g);
        this.mmFrame.m196800f(omwVar.f148020g.length);
        this.mmFrame.m196807m(omwVar.m168305t());
        this.mmFrame.m196804j(omwVar.m168298m());
        this.mmFrame.m196806l(omwVar.m168305t());
        if (this.singleFaceRigInfo == null) {
            this.singleFaceRigInfo = new evf();
        }
        this.singleFaceRigInfo.m122799c(omwVar.f148024k);
        SingleFaceInfo[] singleFaceInfoArr = omwVar.f148024k.facesinfo_;
        if (singleFaceInfoArr != null && singleFaceInfoArr.length > 0 && (fArr = (singleFaceInfo = singleFaceInfoArr[0]).orig_landmarks_96_) != null && fArr.length > 0 && (fArr2 = singleFaceInfo.euler_angles_) != null && fArr2.length > 2) {
            int i = omwVar.f148014a ? 90 : 270;
            if (this.faceProcessType == 0) {
                singleFaceInfo.orig_landmarks_96_ = ByteDanceToMMPointUtils.transBytePoint96ToOriginal96(fArr, i, this.params.fliped_show_, this.mmFrame.m196799e(), this.mmFrame.m196797c(), omwVar.f148003A);
            }
            FacerigV3Params facerigV3Params2 = this.params;
            facerigV3Params2.orig_landmarks_96_ = singleFaceInfo.orig_landmarks_96_;
            facerigV3Params2.face_processor_eulers_ = singleFaceInfo.euler_angles_;
            this.faceRigV3.ProcessFrame(this.mmFrame.m196796b(), this.params, this.singleFaceRigInfo.f96000a);
        }
        return this.singleFaceRigInfo;
    }

    @Override // com.momo.mcamera.liveprocessor.IProcessor
    public void release() {
        FaceRigV3 faceRigV3 = this.faceRigV3;
        if (faceRigV3 != null) {
            faceRigV3.Release();
            this.faceRigV3 = null;
        }
        this.isLoading = false;
        this.isLoadSuccess = false;
    }

    public void setFaceProcessType(int i) {
        this.faceProcessType = i;
    }

    @Override // com.momo.mcamera.liveprocessor.IProcessor
    public void setModelPath(List<String> list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        this.faceRigPath = list.get(0);
    }
}
