package p009l;

import com.p1.mobile.putong.core.ui.onlinematch.a;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class il50 implements cvv.InterfaceC0829c {
    @Override // p009l.cvv.InterfaceC0829c
    /* JADX INFO: renamed from: a */
    public void mo11314a(Map<String, cvv.InterfaceC0828b<Object>> map) {
        map.put("quickchat_balance", new cvv.InterfaceC0828b() { // from class: l.fl50
            @Override // p009l.cvv.InterfaceC0828b
            public final Object execute() {
                return Integer.valueOf(a.b0());
            }
        });
        map.put("quickchat_online_num", new cvv.InterfaceC0828b() { // from class: l.gl50
            @Override // p009l.cvv.InterfaceC0828b
            public final Object execute() {
                return Integer.valueOf(a.Q());
            }
        });
        map.put("quickchat_privilege_available", new cvv.InterfaceC0828b() { // from class: l.hl50
            @Override // p009l.cvv.InterfaceC0828b
            public final Object execute() {
                return Boolean.valueOf(a.U());
            }
        });
    }

    @Override // p009l.cvv.InterfaceC0829c
    /* JADX INFO: renamed from: b */
    public void mo11315b(Map<String, cvv.InterfaceC0827a<Object>> map) {
    }
}
