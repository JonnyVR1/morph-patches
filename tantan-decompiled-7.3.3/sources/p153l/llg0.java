package p153l;

import Sudabstract.Sudfor;
import tech.sud.gip.base.ThreadUtils;
import tech.sud.gip.core.PkgDownloadStatus;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes2.dex */
public final class llg0 implements wfg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ klg0 f132548a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ oqg0 f132549b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ vog0 f132550c;

    public llg0(vog0 vog0Var, klg0 klg0Var, oqg0 oqg0Var) {
        this.f132550c = vog0Var;
        this.f132548a = klg0Var;
        this.f132549b = oqg0Var;
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m154714h(String str, klg0 klg0Var, int i, bxg0 bxg0Var) {
        LogUtils.file("RealSudGamePackageManager", "onDownloadFailure error:" + str);
        SudLogger.m222811d(vog0.f185041d, "onDownloadFailure error:" + str);
        klg0Var.mo150367e(i, str, bxg0Var);
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ void m154715i(klg0 klg0Var) {
        LogUtils.file("RealSudGamePackageManager", "onDownloadStart");
        SudLogger.m222811d(vog0.f185041d, "onDownloadStart");
        klg0Var.mo137227a();
    }

    @Override // p153l.wfg0
    /* JADX INFO: renamed from: a */
    public final void mo154718a() {
        final klg0 klg0Var = this.f132548a;
        ThreadUtils.postUITask(new Runnable() { // from class: l.qig0
            @Override // java.lang.Runnable
            public final void run() {
                llg0.m154715i(klg0Var);
            }
        });
    }

    @Override // p153l.wfg0
    /* JADX INFO: renamed from: b */
    public final Sudfor mo154719b() {
        return this.f132549b.f148589b;
    }

    @Override // p153l.wfg0
    /* JADX INFO: renamed from: c */
    public final void mo154720c(final long j, final long j2, final PkgDownloadStatus pkgDownloadStatus) {
        final klg0 klg0Var = this.f132548a;
        ThreadUtils.postUITask(new Runnable() { // from class: l.pig0
            @Override // java.lang.Runnable
            public final void run() {
                klg0Var.mo150366c(j, j2, pkgDownloadStatus);
            }
        });
    }

    @Override // p153l.wfg0
    /* JADX INFO: renamed from: d */
    public final void mo154721d(final long j, final long j2) {
        final klg0 klg0Var = this.f132548a;
        ThreadUtils.postUITask(new Runnable() { // from class: l.rig0
            @Override // java.lang.Runnable
            public final void run() {
                klg0Var.mo137228d(j, j2);
            }
        });
    }

    @Override // p153l.wfg0
    /* JADX INFO: renamed from: e */
    public final void mo154722e(final int i, final String str, final bxg0 bxg0Var) {
        final klg0 klg0Var = this.f132548a;
        ThreadUtils.postUITask(new Runnable() { // from class: l.oig0
            @Override // java.lang.Runnable
            public final void run() {
                llg0.m154714h(str, klg0Var, i, bxg0Var);
            }
        });
    }

    @Override // p153l.wfg0
    /* JADX INFO: renamed from: f */
    public final void mo154723f(final String str, final long j, final Object obj, final bxg0 bxg0Var) {
        final klg0 klg0Var = this.f132548a;
        ThreadUtils.postUITask(new Runnable() { // from class: l.jig0
            @Override // java.lang.Runnable
            public final void run() {
                this.f121080a.m154724g(str, j, obj, bxg0Var, klg0Var);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m154724g(String str, long j, Object obj, bxg0 bxg0Var, klg0 klg0Var) {
        this.f132550c.mo164597h(str, obj, bxg0Var, klg0Var);
    }
}
