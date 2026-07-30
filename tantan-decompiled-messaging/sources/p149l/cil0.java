package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class cil0 implements cvv.InterfaceC16252c {
    @Override // p149l.cvv.InterfaceC16252c
    /* JADX INFO: renamed from: a */
    public void mo95740a(Map<String, cvv.InterfaceC16251b<Object>> map) {
        map.put("vip_privilege_member", new cvv.InterfaceC16251b() { // from class: l.whl0
            @Override // p149l.cvv.InterfaceC16251b
            public final Object execute() {
                return Boolean.valueOf(CoreModule.f17545c.f19639e0.m169527p9().isVIP());
            }
        });
        map.put("coin_balance", new cvv.InterfaceC16251b() { // from class: l.xhl0
            @Override // p149l.cvv.InterfaceC16251b
            public final Object execute() {
                return swh0.m186215U(CoreModule.f17545c.f19570H0.m210347Y4());
            }
        });
        map.put("coin_superlike_unit_price", new cvv.InterfaceC16251b() { // from class: l.yhl0
            @Override // p149l.cvv.InterfaceC16251b
            public final Object execute() {
                return Integer.valueOf(CoreModule.f17545c.f19570H0.m210391z5());
            }
        });
        map.put("coin_boost_unit_price", new cvv.InterfaceC16251b() { // from class: l.zhl0
            @Override // p149l.cvv.InterfaceC16251b
            public final Object execute() {
                return Integer.valueOf(CoreModule.f17545c.f19570H0.m210364m4());
            }
        });
        map.put("coin_quickchat_audio_unit_price", new cvv.InterfaceC16251b() { // from class: l.ail0
            @Override // p149l.cvv.InterfaceC16251b
            public final Object execute() {
                return Integer.valueOf(CoreModule.f17545c.f19570H0.m210362l4());
            }
        });
        map.put("coin_quickchat_unit_price", new cvv.InterfaceC16251b() { // from class: l.bil0
            @Override // p149l.cvv.InterfaceC16251b
            public final Object execute() {
                return Integer.valueOf(CoreModule.f17545c.f19570H0.m210354f5());
            }
        });
    }

    @Override // p149l.cvv.InterfaceC16252c
    /* JADX INFO: renamed from: b */
    public void mo95741b(Map<String, cvv.InterfaceC16250a<Object>> map) {
    }
}
