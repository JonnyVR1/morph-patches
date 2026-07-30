package p149l;

import com.p046p1.mobile.putong.core.p053ui.onlinematch.C8609a;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class il50 implements cvv.InterfaceC16252c {
    @Override // p149l.cvv.InterfaceC16252c
    /* JADX INFO: renamed from: a */
    public void mo95740a(Map<String, cvv.InterfaceC16251b<Object>> map) {
        map.put("quickchat_balance", new cvv.InterfaceC16251b() { // from class: l.fl50
            @Override // p149l.cvv.InterfaceC16251b
            public final Object execute() {
                return Integer.valueOf(C8609a.m50246b0());
            }
        });
        map.put("quickchat_online_num", new cvv.InterfaceC16251b() { // from class: l.gl50
            @Override // p149l.cvv.InterfaceC16251b
            public final Object execute() {
                return Integer.valueOf(C8609a.m50233Q());
            }
        });
        map.put("quickchat_privilege_available", new cvv.InterfaceC16251b() { // from class: l.hl50
            @Override // p149l.cvv.InterfaceC16251b
            public final Object execute() {
                return Boolean.valueOf(C8609a.m50237U());
            }
        });
    }

    @Override // p149l.cvv.InterfaceC16252c
    /* JADX INFO: renamed from: b */
    public void mo95741b(Map<String, cvv.InterfaceC16250a<Object>> map) {
    }
}
