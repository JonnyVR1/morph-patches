package p153l;

import java.util.ArrayList;
import tech.sud.gip.base.ThreadUtils;
import tech.sud.gip.core.ISudListenerPreloadMGPkg;
import tech.sud.gip.core.PkgDownloadStatus;

/* JADX INFO: loaded from: classes.dex */
public final class vmg0 extends hug0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ukg0 f184713a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ dng0 f184714b;

    public vmg0(dng0 dng0Var, ukg0 ukg0Var) {
        this.f184714b = dng0Var;
        this.f184713a = ukg0Var;
    }

    @Override // p153l.klg0
    /* JADX INFO: renamed from: b */
    public final void mo150365b(String str, bxg0 bxg0Var) {
        dng0 dng0Var = this.f184714b;
        ArrayList arrayList = dng0Var.f89800b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((ISudListenerPreloadMGPkg) obj).onPreloadSuccess(dng0Var.f89799a);
        }
        dng0Var.f89801c = false;
        dng0Var.f89800b.clear();
        qxg0 qxg0Var = dng0Var.f89806h;
        if (qxg0Var != null) {
            qxg0Var.f160046a.f191491a.remove(Long.valueOf(dng0Var.f89799a));
        }
        ukg0 ukg0Var = this.f184713a;
        ukg0Var.f179396e = 0;
        ukg0Var.f179397f = "success";
        ukg0Var.f179405n = bxg0Var;
        String str2 = fug0.f100911a;
        ThreadUtils.postUITask(new nog0(ukg0Var.toString(), false, ukg0Var.f179392a, 0));
    }

    @Override // p153l.klg0
    /* JADX INFO: renamed from: c */
    public final void mo150366c(long j, long j2, PkgDownloadStatus pkgDownloadStatus) {
        dng0 dng0Var = this.f184714b;
        dng0Var.f89804f = j;
        dng0Var.f89805g = j2;
        ArrayList arrayList = dng0Var.f89800b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ISudListenerPreloadMGPkg) arrayList.get(i)).onPreloadStatus(dng0Var.f89799a, j, j2, pkgDownloadStatus);
        }
    }

    @Override // p153l.klg0
    /* JADX INFO: renamed from: e */
    public final void mo150367e(int i, String str, bxg0 bxg0Var) {
        this.f184714b.m117063a(i, str);
        ukg0 ukg0Var = this.f184713a;
        ukg0Var.f179396e = i;
        if (str != null) {
            ukg0Var.f179397f = str;
        }
        ukg0Var.f179405n = bxg0Var;
        String str2 = fug0.f100911a;
        ThreadUtils.postUITask(new nog0(ukg0Var.toString(), false, ukg0Var.f179392a, i));
    }
}
