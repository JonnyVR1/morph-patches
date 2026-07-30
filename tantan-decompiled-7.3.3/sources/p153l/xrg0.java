package p153l;

import tech.sud.gip.asr.base.BaseRealSudASRImpl;

/* JADX INFO: loaded from: classes.dex */
public final class xrg0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ mug0 f195908a;

    public xrg0(mug0 mug0Var) {
        this.f195908a = mug0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        mug0 mug0Var = this.f195908a;
        mug0Var.startASR(((BaseRealSudASRImpl) mug0Var).mLanguage);
        this.f195908a.f138818g = null;
    }
}
