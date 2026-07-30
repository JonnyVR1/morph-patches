package p009l;

import com.p000p1.mobile.putong.core.oms.OmsDialog;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.onlinematch.a;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class vc50 implements cvv.InterfaceC0829c {
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Object m23347d() {
        return "";
    }

    @Override // p009l.cvv.InterfaceC0829c
    /* JADX INFO: renamed from: a */
    public void mo11314a(Map<String, cvv.InterfaceC0828b<Object>> map) {
        map.put("quickchat_user_stats", new cvv.InterfaceC0828b() { // from class: l.rc50
            @Override // p009l.cvv.InterfaceC0828b
            public final Object execute() {
                return vc50.m23347d();
            }
        });
        map.put("fake_status", new cvv.InterfaceC0828b() { // from class: l.sc50
            @Override // p009l.cvv.InterfaceC0828b
            public final Object execute() {
                return this.f20163a.m23352i();
            }
        });
        map.put("remainingtimes", new cvv.InterfaceC0828b() { // from class: l.tc50
            @Override // p009l.cvv.InterfaceC0828b
            public final Object execute() {
                return Integer.valueOf(a.b0());
            }
        });
        map.put("verification_popup_user_times", new cvv.InterfaceC0828b() { // from class: l.uc50
            @Override // p009l.cvv.InterfaceC0828b
            public final Object execute() {
                return this.f21064a.m23353j();
            }
        });
    }

    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final String m23352i() {
        if (CoreModule.c.e0.Z7()) {
            return "unreal";
        }
        return CoreModule.c.e0.Y7() ? "violation" : "";
    }

    /* JADX INFO: renamed from: h */
    public final int m23351h() {
        return ic50.m16316j().m16322f().m17395P(OmsDialog.p_verification_merge_popup.getIdentifier()).totalShownCount;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object m23353j() {
        return Integer.valueOf(m23351h());
    }

    @Override // p009l.cvv.InterfaceC0829c
    /* JADX INFO: renamed from: b */
    public void mo11315b(Map<String, cvv.InterfaceC0827a<Object>> map) {
    }
}
