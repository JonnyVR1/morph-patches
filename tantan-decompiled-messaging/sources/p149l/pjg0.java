package p149l;

import tech.sud.gip.asr.base.BaseRealSudASRImpl;

/* JADX INFO: loaded from: classes.dex */
public final class pjg0 implements Runnable {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ emg0 f149774a;

    public pjg0(emg0 emg0Var) {
        this.f149774a = emg0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        emg0 emg0Var = this.f149774a;
        emg0Var.startASR(((BaseRealSudASRImpl) emg0Var).mLanguage);
        this.f149774a.f92216g = null;
    }
}
