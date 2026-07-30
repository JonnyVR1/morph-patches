package com.momo.mcamera.liveprocessor;

import android.text.TextUtils;
import com.momocv.cartoonface.Cartoonface;
import com.momocv.cartoonface.CartoonfaceInfo;
import com.momocv.cartoonface.CartoonfaceParams;
import java.util.List;
import p149l.pjw;
import p149l.vjw;
import p149l.zsf;

/* JADX INFO: loaded from: classes6.dex */
public class CartoonFaceProcessor implements IProcessor<CartoonfaceInfo> {
    private Cartoonface cartoonProcess;
    private CartoonfaceInfo mask;
    private vjw mmFrame;
    private String modelPath;
    private CartoonfaceParams params;
    private volatile boolean isLoading = false;
    private volatile boolean isLoadSuccess = false;
    private float scaleFactor = -1.0f;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.momo.mcamera.liveprocessor.IProcessor
    public CartoonfaceInfo process(pjw pjwVar) {
        if (pjwVar == null) {
            return null;
        }
        if (this.cartoonProcess == null) {
            this.cartoonProcess = new Cartoonface();
        }
        if (!this.isLoading && !this.isLoadSuccess && !TextUtils.isEmpty(this.modelPath)) {
            this.isLoading = true;
            new Thread(new Runnable() { // from class: com.momo.mcamera.liveprocessor.CartoonFaceProcessor.1
                @Override // java.lang.Runnable
                public void run() {
                    CartoonFaceProcessor cartoonFaceProcessor = CartoonFaceProcessor.this;
                    cartoonFaceProcessor.isLoadSuccess = cartoonFaceProcessor.cartoonProcess.LoadModel(CartoonFaceProcessor.this.modelPath);
                    CartoonFaceProcessor.this.isLoading = false;
                }
            }).start();
        }
        if (!this.isLoadSuccess) {
            return null;
        }
        if (this.mask == null) {
            this.mask = new CartoonfaceInfo();
        }
        if (pjwVar.m169950n() >= 1) {
            if (this.params == null) {
                this.params = new CartoonfaceParams();
            }
            CartoonfaceParams cartoonfaceParams = this.params;
            cartoonfaceParams.fliped_show_ = pjwVar.f149894a;
            cartoonfaceParams.rotate_degree_ = pjwVar.f149895b;
            cartoonfaceParams.restore_degree_ = pjwVar.f149896c;
            cartoonfaceParams.scale_factor_ = this.scaleFactor;
            if (pjwVar.m169946j(0) != null) {
                zsf zsfVarM169946j = pjwVar.m169946j(0);
                this.params.orig_landmarks_222_ = zsfVarM169946j.m220023q();
                this.params.eular = zsfVarM169946j.m220012c();
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
            this.cartoonProcess.ProcessFrame(this.mmFrame.m198689b(), this.params, this.mask);
        } else {
            CartoonfaceInfo cartoonfaceInfo = this.mask;
            cartoonfaceInfo.warp_mat = null;
            cartoonfaceInfo.mask_ = null;
            cartoonfaceInfo.mask_width = 0;
            cartoonfaceInfo.mask_height = 0;
        }
        return this.mask;
    }

    @Override // com.momo.mcamera.liveprocessor.IProcessor
    public void release() {
        Cartoonface cartoonface = this.cartoonProcess;
        if (cartoonface != null) {
            cartoonface.Release();
            this.cartoonProcess = null;
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
