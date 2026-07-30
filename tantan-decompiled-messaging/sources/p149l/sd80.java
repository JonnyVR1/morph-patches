package p149l;

import com.immomo.velib.anim.model.PostProcessingModel;

/* JADX INFO: loaded from: classes7.dex */
public class sd80 extends xdk implements o0m {

    /* JADX INFO: renamed from: K */
    private dn40 f163816K = new dn40();

    /* JADX INFO: renamed from: J */
    private tij f163815J = new tij(0.0f);

    /* JADX INFO: renamed from: I */
    private eck0 f163814I = new eck0();

    public sd80() {
        this.f163816K.m149300H(this.f163815J);
        this.f163814I.m203361R(this.f163816K, 0);
        this.f163814I.m203361R(this.f163815J, 1);
        this.f163816K.m149300H(this.f163814I);
        this.f163815J.m149300H(this.f163814I);
        this.f163814I.m149300H(this);
        m208317R(this.f163816K);
        m208316Q(this.f163815J);
        m208318S(this.f163814I);
    }

    @Override // p149l.o0m
    /* JADX INFO: renamed from: d */
    public void mo162155d(PostProcessingModel.ParamsModel paramsModel) {
        tij tijVar = this.f163815J;
        if (tijVar != null) {
            tijVar.m189203R(paramsModel == null ? 0.0f : paramsModel.getRadius());
            if (paramsModel != null) {
                paramsModel.getRadius();
            }
        }
        eck0 eck0Var = this.f163814I;
        if (eck0Var != null) {
            eck0Var.m115732T(paramsModel == null ? 0.5f : paramsModel.getScale());
            if (paramsModel != null) {
                paramsModel.getScale();
            }
            this.f163814I.m115733U(paramsModel == null ? 0.02f : paramsModel.getThreshold());
            if (paramsModel == null) {
                return;
            }
            paramsModel.getThreshold();
        }
    }

    @Override // p149l.o0m
    /* JADX INFO: renamed from: f */
    public void mo162156f(String str) {
        eck0 eck0Var = this.f163814I;
        if (eck0Var != null) {
            eck0Var.m115734f(str);
        }
        tij tijVar = this.f163815J;
        if (tijVar != null) {
            tijVar.m189204f(str);
        }
    }
}
