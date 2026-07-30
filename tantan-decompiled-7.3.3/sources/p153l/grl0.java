package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class grl0 implements dxv.InterfaceC16648c {
    @Override // p153l.dxv.InterfaceC16648c
    /* JADX INFO: renamed from: a */
    public void mo110417a(Map<String, dxv.InterfaceC16647b<Object>> map) {
        map.put("vip_privilege_member", new dxv.InterfaceC16647b() { // from class: l.arl0
            @Override // p153l.dxv.InterfaceC16647b
            public final Object execute() {
                return Boolean.valueOf(CoreModule.f18264c.f20381e0.m116600p9().isVIP());
            }
        });
        map.put("coin_balance", new dxv.InterfaceC16647b() { // from class: l.brl0
            @Override // p153l.dxv.InterfaceC16647b
            public final Object execute() {
                return a5i0.m96120U(CoreModule.f18264c.f20312H0.m155435Y4());
            }
        });
        map.put("coin_superlike_unit_price", new dxv.InterfaceC16647b() { // from class: l.crl0
            @Override // p153l.dxv.InterfaceC16647b
            public final Object execute() {
                return Integer.valueOf(CoreModule.f18264c.f20312H0.m155479z5());
            }
        });
        map.put("coin_boost_unit_price", new dxv.InterfaceC16647b() { // from class: l.drl0
            @Override // p153l.dxv.InterfaceC16647b
            public final Object execute() {
                return Integer.valueOf(CoreModule.f18264c.f20312H0.m155452m4());
            }
        });
        map.put("coin_quickchat_audio_unit_price", new dxv.InterfaceC16647b() { // from class: l.erl0
            @Override // p153l.dxv.InterfaceC16647b
            public final Object execute() {
                return Integer.valueOf(CoreModule.f18264c.f20312H0.m155450l4());
            }
        });
        map.put("coin_quickchat_unit_price", new dxv.InterfaceC16647b() { // from class: l.frl0
            @Override // p153l.dxv.InterfaceC16647b
            public final Object execute() {
                return Integer.valueOf(CoreModule.f18264c.f20312H0.m155442f5());
            }
        });
    }

    @Override // p153l.dxv.InterfaceC16648c
    /* JADX INFO: renamed from: b */
    public void mo110418b(Map<String, dxv.InterfaceC16646a<Object>> map) {
    }
}
