package p153l;

import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class jog0 implements nzg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ mug0 f122000a;

    public jog0(mug0 mug0Var) {
        this.f122000a = mug0Var;
    }

    @Override // p153l.nzg0
    /* JADX INFO: renamed from: a */
    public final void mo122353a() {
        SudLogger.m222811d(this.f122000a.f138812a, "onRecognizeSuccess:");
        LogUtils.file("DoubaoRealSudASRImpl", "onRecognizeSuccess:");
    }

    @Override // p153l.nzg0
    /* JADX INFO: renamed from: b */
    public final void mo122354b() {
        LogUtils.file("DoubaoRealSudASRImpl", "db asr onClosed");
        SudLogger.m222811d(this.f122000a.f138812a, "db asr onClosed");
        this.f122000a.stopASR(false);
    }

    @Override // p153l.nzg0
    /* JADX INFO: renamed from: c */
    public final void mo122355c(Throwable th) {
        LogUtils.file("DoubaoRealSudASRImpl", "db asr onFailure:" + LogUtils.getErrorInfo(th));
        SudLogger.m222811d(this.f122000a.f138812a, "db asr onFailure:" + LogUtils.getErrorInfo(th));
        mug0 mug0Var = this.f122000a;
        mug0Var.f138819h = true;
        mug0Var.stopASR(false);
    }

    @Override // p153l.nzg0
    /* JADX INFO: renamed from: d */
    public final void mo122356d(boolean z, String str, String str2, long j, long j2) {
        LogUtils.file("DoubaoRealSudASRImpl", "onText:" + str);
        SudLogger.m222811d(this.f122000a.f138812a, "onText: " + str);
        this.f122000a.onRecognizingResult(str);
    }
}
