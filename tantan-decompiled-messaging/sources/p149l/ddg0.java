package p149l;

import Sudabstract.Sudfor;
import tech.sud.gip.base.ThreadUtils;
import tech.sud.gip.core.PkgDownloadStatus;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class ddg0 implements o7g0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ cdg0 f85596a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ gig0 f85597b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ ngg0 f85598c;

    public ddg0(ngg0 ngg0Var, cdg0 cdg0Var, gig0 gig0Var) {
        this.f85598c = ngg0Var;
        this.f85596a = cdg0Var;
        this.f85597b = gig0Var;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m111008h(String str, cdg0 cdg0Var, int i, tog0 tog0Var) {
        LogUtils.file("RealSudGamePackageManager", "onDownloadFailure error:" + str);
        SudLogger.m221565d(ngg0.f138872d, "onDownloadFailure error:" + str);
        cdg0Var.mo106227e(i, str, tog0Var);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m111009i(cdg0 cdg0Var) {
        LogUtils.file("RealSudGamePackageManager", "onDownloadStart");
        SudLogger.m221565d(ngg0.f138872d, "onDownloadStart");
        cdg0Var.mo106223a();
    }

    @Override // p149l.o7g0
    /* JADX INFO: renamed from: a */
    public final void mo111012a() {
        final cdg0 cdg0Var = this.f85596a;
        ThreadUtils.postUITask(new Runnable() { // from class: l.iag0
            @Override // java.lang.Runnable
            public final void run() {
                ddg0.m111009i(cdg0Var);
            }
        });
    }

    @Override // p149l.o7g0
    /* JADX INFO: renamed from: b */
    public final Sudfor mo111013b() {
        return this.f85597b.f102894b;
    }

    @Override // p149l.o7g0
    /* JADX INFO: renamed from: c */
    public final void mo111014c(final long j, final long j2, final PkgDownloadStatus pkgDownloadStatus) {
        final cdg0 cdg0Var = this.f85596a;
        ThreadUtils.postUITask(new Runnable() { // from class: l.hag0
            @Override // java.lang.Runnable
            public final void run() {
                cdg0Var.mo106225c(j, j2, pkgDownloadStatus);
            }
        });
    }

    @Override // p149l.o7g0
    /* JADX INFO: renamed from: d */
    public final void mo111015d(final long j, final long j2) {
        final cdg0 cdg0Var = this.f85596a;
        ThreadUtils.postUITask(new Runnable() { // from class: l.jag0
            @Override // java.lang.Runnable
            public final void run() {
                cdg0Var.mo106226d(j, j2);
            }
        });
    }

    @Override // p149l.o7g0
    /* JADX INFO: renamed from: e */
    public final void mo111016e(final int i, final String str, final tog0 tog0Var) {
        final cdg0 cdg0Var = this.f85596a;
        ThreadUtils.postUITask(new Runnable() { // from class: l.gag0
            @Override // java.lang.Runnable
            public final void run() {
                ddg0.m111008h(str, cdg0Var, i, tog0Var);
            }
        });
    }

    @Override // p149l.o7g0
    /* JADX INFO: renamed from: f */
    public final void mo111017f(final String str, final long j, final Object obj, final tog0 tog0Var) {
        final cdg0 cdg0Var = this.f85596a;
        ThreadUtils.postUITask(new Runnable() { // from class: l.bag0
            @Override // java.lang.Runnable
            public final void run() {
                this.f74676a.m111018g(str, j, obj, tog0Var, cdg0Var);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m111018g(String str, long j, Object obj, tog0 tog0Var, cdg0 cdg0Var) {
        this.f85598c.mo121853h(str, obj, tog0Var, cdg0Var);
    }
}
