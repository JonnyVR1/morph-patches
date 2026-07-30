package com.momo.mcamera.liveprocessor;

import android.text.TextUtils;
import com.momocv.SingleFaceInfo;
import com.momocv.facerigv3.FaceRigV3;
import com.momocv.facerigv3.FacerigV3Params;
import java.util.List;
import p149l.pjw;
import p149l.qtf;
import p149l.vjw;

/* JADX INFO: loaded from: classes6.dex */
public class AnimojiProcessor implements IProcessor<qtf> {
    private String faceRigPath;
    private FaceRigV3 faceRigV3;
    private vjw mmFrame;
    private FacerigV3Params params;
    private qtf singleFaceRigInfo;
    private volatile boolean isLoading = false;
    private volatile boolean isLoadSuccess = false;
    private int faceProcessType = 1;

    @Override // com.momo.mcamera.liveprocessor.IProcessor
    public qtf process(pjw pjwVar) {
        SingleFaceInfo singleFaceInfo;
        float[] fArr;
        float[] fArr2;
        if (pjwVar == null) {
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
        facerigV3Params.rotate_degree_ = pjwVar.f149895b;
        facerigV3Params.restore_degree_ = pjwVar.f149896c;
        facerigV3Params.fliped_show_ = pjwVar.f149894a;
        if (this.mmFrame == null) {
            this.mmFrame = new vjw();
        }
        this.mmFrame.m198695h(17);
        this.mmFrame.m198694g(pjwVar.f149900g);
        this.mmFrame.m198693f(pjwVar.f149900g.length);
        this.mmFrame.m198700m(pjwVar.m169956t());
        this.mmFrame.m198697j(pjwVar.m169949m());
        this.mmFrame.m198699l(pjwVar.m169956t());
        if (this.singleFaceRigInfo == null) {
            this.singleFaceRigInfo = new qtf();
        }
        this.singleFaceRigInfo.m176414c(pjwVar.f149904k);
        SingleFaceInfo[] singleFaceInfoArr = pjwVar.f149904k.facesinfo_;
        if (singleFaceInfoArr != null && singleFaceInfoArr.length > 0 && (fArr = (singleFaceInfo = singleFaceInfoArr[0]).orig_landmarks_96_) != null && fArr.length > 0 && (fArr2 = singleFaceInfo.euler_angles_) != null && fArr2.length > 2) {
            int i = pjwVar.f149894a ? 90 : 270;
            if (this.faceProcessType == 0) {
                singleFaceInfo.orig_landmarks_96_ = ByteDanceToMMPointUtils.transBytePoint96ToOriginal96(fArr, i, this.params.fliped_show_, this.mmFrame.m198692e(), this.mmFrame.m198690c(), pjwVar.f149883A);
            }
            FacerigV3Params facerigV3Params2 = this.params;
            facerigV3Params2.orig_landmarks_96_ = singleFaceInfo.orig_landmarks_96_;
            facerigV3Params2.face_processor_eulers_ = singleFaceInfo.euler_angles_;
            this.faceRigV3.ProcessFrame(this.mmFrame.m198689b(), this.params, this.singleFaceRigInfo.f156323a);
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
