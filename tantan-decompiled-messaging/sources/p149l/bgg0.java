package p149l;

import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class bgg0 implements frg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ emg0 f75431a;

    public bgg0(emg0 emg0Var) {
        this.f75431a = emg0Var;
    }

    @Override // p149l.frg0
    /* JADX INFO: renamed from: a */
    public final void mo101632a() {
        SudLogger.m221565d(this.f75431a.f92210a, "onRecognizeSuccess:");
        LogUtils.file("DoubaoRealSudASRImpl", "onRecognizeSuccess:");
    }

    @Override // p149l.frg0
    /* JADX INFO: renamed from: b */
    public final void mo101633b() {
        LogUtils.file("DoubaoRealSudASRImpl", "db asr onClosed");
        SudLogger.m221565d(this.f75431a.f92210a, "db asr onClosed");
        this.f75431a.stopASR(false);
    }

    @Override // p149l.frg0
    /* JADX INFO: renamed from: c */
    public final void mo101634c(Throwable th) {
        LogUtils.file("DoubaoRealSudASRImpl", "db asr onFailure:" + LogUtils.getErrorInfo(th));
        SudLogger.m221565d(this.f75431a.f92210a, "db asr onFailure:" + LogUtils.getErrorInfo(th));
        emg0 emg0Var = this.f75431a;
        emg0Var.f92217h = true;
        emg0Var.stopASR(false);
    }

    @Override // p149l.frg0
    /* JADX INFO: renamed from: d */
    public final void mo101635d(boolean z, String str, String str2, long j, long j2) {
        LogUtils.file("DoubaoRealSudASRImpl", "onText:" + str);
        SudLogger.m221565d(this.f75431a.f92210a, "onText: " + str);
        this.f75431a.onRecognizingResult(str);
    }
}
