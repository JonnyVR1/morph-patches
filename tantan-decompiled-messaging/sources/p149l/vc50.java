package p149l;

import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.oms.OmsDialog;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.C8609a;
import com.p046p1.mobile.putong.data.UserStatus;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class vc50 implements cvv.InterfaceC16252c {
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Object m197740d() {
        return "";
    }

    @Override // p149l.cvv.InterfaceC16252c
    /* JADX INFO: renamed from: a */
    public void mo95740a(Map<String, cvv.InterfaceC16251b<Object>> map) {
        map.put("quickchat_user_stats", new cvv.InterfaceC16251b() { // from class: l.rc50
            @Override // p149l.cvv.InterfaceC16251b
            public final Object execute() {
                return vc50.m197740d();
            }
        });
        map.put("fake_status", new cvv.InterfaceC16251b() { // from class: l.sc50
            @Override // p149l.cvv.InterfaceC16251b
            public final Object execute() {
                return this.f163710a.m197745i();
            }
        });
        map.put("remainingtimes", new cvv.InterfaceC16251b() { // from class: l.tc50
            @Override // p149l.cvv.InterfaceC16251b
            public final Object execute() {
                return Integer.valueOf(C8609a.m50246b0());
            }
        });
        map.put("verification_popup_user_times", new cvv.InterfaceC16251b() { // from class: l.uc50
            @Override // p149l.cvv.InterfaceC16251b
            public final Object execute() {
                return this.f175797a.m197746j();
            }
        });
    }

    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final String m197745i() {
        if (CoreModule.f17545c.f19639e0.m169464Z7()) {
            return "unreal";
        }
        return CoreModule.f17545c.f19639e0.m169460Y7() ? UserStatus.violation : "";
    }

    /* JADX INFO: renamed from: h */
    public final int m197744h() {
        return ic50.m135327j().m135333f().m145229P(OmsDialog.p_verification_merge_popup.getIdentifier()).totalShownCount;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object m197746j() {
        return Integer.valueOf(m197744h());
    }

    @Override // p149l.cvv.InterfaceC16252c
    /* JADX INFO: renamed from: b */
    public void mo95741b(Map<String, cvv.InterfaceC16250a<Object>> map) {
    }
}
