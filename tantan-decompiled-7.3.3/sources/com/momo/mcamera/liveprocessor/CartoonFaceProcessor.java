package com.momo.mcamera.liveprocessor;

import android.text.TextUtils;
import com.momocv.cartoonface.Cartoonface;
import com.momocv.cartoonface.CartoonfaceInfo;
import com.momocv.cartoonface.CartoonfaceParams;
import java.util.List;
import p153l.nuf;
import p153l.omw;
import p153l.umw;

/* JADX INFO: loaded from: classes6.dex */
public class CartoonFaceProcessor implements IProcessor<CartoonfaceInfo> {
    private Cartoonface cartoonProcess;
    private CartoonfaceInfo mask;
    private umw mmFrame;
    private String modelPath;
    private CartoonfaceParams params;
    private volatile boolean isLoading = false;
    private volatile boolean isLoadSuccess = false;
    private float scaleFactor = -1.0f;

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.momo.mcamera.liveprocessor.IProcessor
    public CartoonfaceInfo process(omw omwVar) {
        if (omwVar == null) {
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
        if (omwVar.m168299n() >= 1) {
            if (this.params == null) {
                this.params = new CartoonfaceParams();
            }
            CartoonfaceParams cartoonfaceParams = this.params;
            cartoonfaceParams.fliped_show_ = omwVar.f148014a;
            cartoonfaceParams.rotate_degree_ = omwVar.f148015b;
            cartoonfaceParams.restore_degree_ = omwVar.f148016c;
            cartoonfaceParams.scale_factor_ = this.scaleFactor;
            if (omwVar.m168295j(0) != null) {
                nuf nufVarM168295j = omwVar.m168295j(0);
                this.params.orig_landmarks_222_ = nufVarM168295j.m164786q();
                this.params.eular = nufVarM168295j.m164775c();
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
            this.cartoonProcess.ProcessFrame(this.mmFrame.m196796b(), this.params, this.mask);
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
