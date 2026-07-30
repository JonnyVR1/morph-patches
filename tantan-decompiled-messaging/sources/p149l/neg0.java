package p149l;

import java.util.ArrayList;
import tech.sud.gip.base.ThreadUtils;
import tech.sud.gip.core.ISudListenerPreloadMGPkg;
import tech.sud.gip.core.PkgDownloadStatus;

/* JADX INFO: loaded from: classes.dex */
public final class neg0 extends zlg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ mcg0 f138609a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ veg0 f138610b;

    public neg0(veg0 veg0Var, mcg0 mcg0Var) {
        this.f138610b = veg0Var;
        this.f138609a = mcg0Var;
    }

    @Override // p149l.cdg0
    /* JADX INFO: renamed from: b */
    public final void mo106224b(String str, tog0 tog0Var) {
        veg0 veg0Var = this.f138610b;
        ArrayList arrayList = veg0Var.f181189b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((ISudListenerPreloadMGPkg) obj).onPreloadSuccess(veg0Var.f181188a);
        }
        veg0Var.f181190c = false;
        veg0Var.f181189b.clear();
        ipg0 ipg0Var = veg0Var.f181195h;
        if (ipg0Var != null) {
            ipg0Var.f114294a.f144996a.remove(Long.valueOf(veg0Var.f181188a));
        }
        mcg0 mcg0Var = this.f138609a;
        mcg0Var.f133115e = 0;
        mcg0Var.f133116f = "success";
        mcg0Var.f133124n = tog0Var;
        String str2 = xlg0.f193417a;
        ThreadUtils.postUITask(new fgg0(mcg0Var.toString(), false, mcg0Var.f133111a, 0));
    }

    @Override // p149l.cdg0
    /* JADX INFO: renamed from: c */
    public final void mo106225c(long j, long j2, PkgDownloadStatus pkgDownloadStatus) {
        veg0 veg0Var = this.f138610b;
        veg0Var.f181193f = j;
        veg0Var.f181194g = j2;
        ArrayList arrayList = veg0Var.f181189b;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((ISudListenerPreloadMGPkg) arrayList.get(i)).onPreloadStatus(veg0Var.f181188a, j, j2, pkgDownloadStatus);
        }
    }

    @Override // p149l.cdg0
    /* JADX INFO: renamed from: e */
    public final void mo106227e(int i, String str, tog0 tog0Var) {
        this.f138610b.m198181a(i, str);
        mcg0 mcg0Var = this.f138609a;
        mcg0Var.f133115e = i;
        if (str != null) {
            mcg0Var.f133116f = str;
        }
        mcg0Var.f133124n = tog0Var;
        String str2 = xlg0.f193417a;
        ThreadUtils.postUITask(new fgg0(mcg0Var.toString(), false, mcg0Var.f133111a, i));
    }
}
