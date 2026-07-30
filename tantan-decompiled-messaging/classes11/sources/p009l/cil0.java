package p009l;

import com.p1.mobile.putong.core.CoreModule;
import java.util.Map;
import l.swh0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class cil0 implements cvv.InterfaceC0829c {
    @Override // p009l.cvv.InterfaceC0829c
    /* JADX INFO: renamed from: a */
    public void mo11314a(Map<String, cvv.InterfaceC0828b<Object>> map) {
        map.put("vip_privilege_member", new cvv.InterfaceC0828b() { // from class: l.whl0
            @Override // p009l.cvv.InterfaceC0828b
            public final Object execute() {
                return Boolean.valueOf(CoreModule.c.e0.p9().isVIP());
            }
        });
        map.put("coin_balance", new cvv.InterfaceC0828b() { // from class: l.xhl0
            @Override // p009l.cvv.InterfaceC0828b
            public final Object execute() {
                return swh0.U(CoreModule.c.H0.Y4());
            }
        });
        map.put("coin_superlike_unit_price", new cvv.InterfaceC0828b() { // from class: l.yhl0
            @Override // p009l.cvv.InterfaceC0828b
            public final Object execute() {
                return Integer.valueOf(CoreModule.c.H0.z5());
            }
        });
        map.put("coin_boost_unit_price", new cvv.InterfaceC0828b() { // from class: l.zhl0
            @Override // p009l.cvv.InterfaceC0828b
            public final Object execute() {
                return Integer.valueOf(CoreModule.c.H0.m4());
            }
        });
        map.put("coin_quickchat_audio_unit_price", new cvv.InterfaceC0828b() { // from class: l.ail0
            @Override // p009l.cvv.InterfaceC0828b
            public final Object execute() {
                return Integer.valueOf(CoreModule.c.H0.l4());
            }
        });
        map.put("coin_quickchat_unit_price", new cvv.InterfaceC0828b() { // from class: l.bil0
            @Override // p009l.cvv.InterfaceC0828b
            public final Object execute() {
                return Integer.valueOf(CoreModule.c.H0.f5());
            }
        });
    }

    @Override // p009l.cvv.InterfaceC0829c
    /* JADX INFO: renamed from: b */
    public void mo11315b(Map<String, cvv.InterfaceC0827a<Object>> map) {
    }
}
