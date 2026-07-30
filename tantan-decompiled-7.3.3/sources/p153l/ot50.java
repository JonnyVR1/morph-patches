package p153l;

import com.p051p1.mobile.putong.core.p058ui.onlinematch.C8772a;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class ot50 implements dxv.InterfaceC16648c {
    @Override // p153l.dxv.InterfaceC16648c
    /* JADX INFO: renamed from: a */
    public void mo110417a(Map<String, dxv.InterfaceC16647b<Object>> map) {
        map.put("quickchat_balance", new dxv.InterfaceC16647b() { // from class: l.lt50
            @Override // p153l.dxv.InterfaceC16647b
            public final Object execute() {
                return Integer.valueOf(C8772a.m51429b0());
            }
        });
        map.put("quickchat_online_num", new dxv.InterfaceC16647b() { // from class: l.mt50
            @Override // p153l.dxv.InterfaceC16647b
            public final Object execute() {
                return Integer.valueOf(C8772a.m51416Q());
            }
        });
        map.put("quickchat_privilege_available", new dxv.InterfaceC16647b() { // from class: l.nt50
            @Override // p153l.dxv.InterfaceC16647b
            public final Object execute() {
                return Boolean.valueOf(C8772a.m51420U());
            }
        });
    }

    @Override // p153l.dxv.InterfaceC16648c
    /* JADX INFO: renamed from: b */
    public void mo110418b(Map<String, dxv.InterfaceC16646a<Object>> map) {
    }
}
