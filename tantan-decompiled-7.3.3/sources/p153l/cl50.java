package p153l;

import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.oms.OmsDialog;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.C8772a;
import com.p051p1.mobile.putong.data.UserStatus;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class cl50 implements dxv.InterfaceC16648c {
    /* JADX INFO: renamed from: d */
    public static /* synthetic */ Object m110414d() {
        return "";
    }

    @Override // p153l.dxv.InterfaceC16648c
    /* JADX INFO: renamed from: a */
    public void mo110417a(Map<String, dxv.InterfaceC16647b<Object>> map) {
        map.put("quickchat_user_stats", new dxv.InterfaceC16647b() { // from class: l.yk50
            @Override // p153l.dxv.InterfaceC16647b
            public final Object execute() {
                return cl50.m110414d();
            }
        });
        map.put("fake_status", new dxv.InterfaceC16647b() { // from class: l.zk50
            @Override // p153l.dxv.InterfaceC16647b
            public final Object execute() {
                return this.f204731a.m110421i();
            }
        });
        map.put("remainingtimes", new dxv.InterfaceC16647b() { // from class: l.al50
            @Override // p153l.dxv.InterfaceC16647b
            public final Object execute() {
                return Integer.valueOf(C8772a.m51429b0());
            }
        });
        map.put("verification_popup_user_times", new dxv.InterfaceC16647b() { // from class: l.bl50
            @Override // p153l.dxv.InterfaceC16647b
            public final Object execute() {
                return this.f77147a.m110422j();
            }
        });
    }

    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public final String m110421i() {
        if (CoreModule.f18264c.f20381e0.m116537Z7()) {
            return "unreal";
        }
        return CoreModule.f18264c.f20381e0.m116533Y7() ? UserStatus.violation : "";
    }

    /* JADX INFO: renamed from: h */
    public final int m110420h() {
        return pk50.m172568j().m172574f().m181652P(OmsDialog.p_verification_merge_popup.getIdentifier()).totalShownCount;
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Object m110422j() {
        return Integer.valueOf(m110420h());
    }

    @Override // p153l.dxv.InterfaceC16648c
    /* JADX INFO: renamed from: b */
    public void mo110418b(Map<String, dxv.InterfaceC16646a<Object>> map) {
    }
}
