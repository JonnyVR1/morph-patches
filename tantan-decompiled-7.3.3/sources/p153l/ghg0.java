package p153l;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class ghg0 implements vrg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ wyg0 f104123a;

    public ghg0(wyg0 wyg0Var) {
        this.f104123a = wyg0Var;
    }

    @Override // p153l.vrg0
    /* JADX INFO: renamed from: a */
    public final void mo115645a(String str, String str2, String str3, String str4, gfg0 gfg0Var) {
        bfg0 bfg0Var = this.f104123a.f191652m;
        if (bfg0Var != null) {
            hzg0 hzg0Var = new hzg0(bfg0Var);
            dhg0 dhg0Var = bfg0Var.f76491b;
            if (dhg0Var.f88526z == null) {
                dhg0Var.f88526z = new ArrayList();
            }
            dhg0Var.f88526z.add(hzg0Var);
            nhg0.m163094c(str4, hzg0Var);
        }
        gfg0Var.success("{\"ret_code\":0, \"ret_msg\":\"success\"}");
    }
}
