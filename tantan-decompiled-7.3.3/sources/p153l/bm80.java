package p153l;

import com.immomo.velib.anim.model.PostProcessingModel;

/* JADX INFO: loaded from: classes7.dex */
public class bm80 extends ngk implements i3m {

    /* JADX INFO: renamed from: K */
    private rv40 f77277K = new rv40();

    /* JADX INFO: renamed from: J */
    private mlj f77276J = new mlj(0.0f);

    /* JADX INFO: renamed from: I */
    private klk0 f77275I = new klk0();

    public bm80() {
        this.f77277K.m125376H(this.f77276J);
        this.f77275I.m131954R(this.f77277K, 0);
        this.f77275I.m131954R(this.f77276J, 1);
        this.f77277K.m125376H(this.f77275I);
        this.f77276J.m125376H(this.f77275I);
        this.f77275I.m125376H(this);
        m162986R(this.f77277K);
        m162985Q(this.f77276J);
        m162987S(this.f77275I);
    }

    @Override // p153l.i3m
    /* JADX INFO: renamed from: d */
    public void mo98815d(PostProcessingModel.ParamsModel paramsModel) {
        mlj mljVar = this.f77276J;
        if (mljVar != null) {
            mljVar.m158895R(paramsModel == null ? 0.0f : paramsModel.getRadius());
            if (paramsModel != null) {
                paramsModel.getRadius();
            }
        }
        klk0 klk0Var = this.f77275I;
        if (klk0Var != null) {
            klk0Var.m150388T(paramsModel == null ? 0.5f : paramsModel.getScale());
            if (paramsModel != null) {
                paramsModel.getScale();
            }
            this.f77275I.m150389U(paramsModel == null ? 0.02f : paramsModel.getThreshold());
            if (paramsModel == null) {
                return;
            }
            paramsModel.getThreshold();
        }
    }

    @Override // p153l.i3m
    /* JADX INFO: renamed from: f */
    public void mo98816f(String str) {
        klk0 klk0Var = this.f77275I;
        if (klk0Var != null) {
            klk0Var.m150390f(str);
        }
        mlj mljVar = this.f77276J;
        if (mljVar != null) {
            mljVar.m158896f(str);
        }
    }
}
