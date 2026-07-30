package p153l;

import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class srs0 extends jwr0 {

    /* JADX INFO: renamed from: m */
    public final tct0 f170368m;

    /* JADX INFO: renamed from: n */
    public final cct0 f170369n;

    public srs0(String str, Map map, tct0 tct0Var) {
        super(0, str, new vqs0(tct0Var));
        this.f170368m = tct0Var;
        cct0 cct0Var = new cct0(null);
        this.f170369n = cct0Var;
        cct0Var.m109072d(str, "GET", null, null);
    }

    @Override // p153l.jwr0
    /* JADX INFO: renamed from: j */
    public final pwr0 mo147200j(vvr0 vvr0Var) {
        return pwr0.m174088b(vvr0Var, dxr0.m118509b(vvr0Var));
    }

    @Override // p153l.jwr0
    /* JADX INFO: renamed from: s */
    public final /* bridge */ /* synthetic */ void mo147206s(Object obj) {
        vvr0 vvr0Var = (vvr0) obj;
        this.f170369n.m109074f(vvr0Var.f185981c, vvr0Var.f185979a);
        byte[] bArr = vvr0Var.f185980b;
        if (cct0.m109067k() && bArr != null) {
            this.f170369n.m109076h(bArr);
        }
        this.f170368m.m190494b(vvr0Var);
    }
}
