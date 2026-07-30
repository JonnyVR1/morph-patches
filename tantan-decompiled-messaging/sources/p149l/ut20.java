package p149l;

import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreLikers;
import com.p046p1.mobile.putong.core.p053ui.seepop.NewLikeView;
import com.p046p1.mobile.putong.data.Counter;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class ut20 extends AbstractC18834o4 {

    /* JADX INFO: renamed from: d */
    public static tpd0 f178220d = new tpd0("new_like_dialog_show_count_" + CoreModule.m29931H().userId(), 0);

    /* JADX INFO: renamed from: a */
    public tpd0 f178221a = new tpd0("app_sission_has_show_new_like_" + CoreModule.m29931H().userId(), 0);

    /* JADX INFO: renamed from: b */
    public zpd0 f178222b = new zpd0("new_like_dilaog_show_rime_" + CoreModule.m29931H().userId(), 0L);

    /* JADX INFO: renamed from: c */
    public zpd0 f178223c = new zpd0("new_like_dilaog_will_show_rime_" + CoreModule.m29931H().userId(), 0L);

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m195274c(z5l.C21640a c21640a) {
        CoreModule.f17545c.f19687u0.f19254k0.put(Long.valueOf(mqi0.m155944o()));
        CoreModule.f17545c.f19687u0.m30425Y6();
        CoreModule.m29935P().m94651a().mo33534l1(c21640a.m217363a(), "p_special_card,p_new_like_notification_popup,click");
    }

    /* JADX INFO: renamed from: d */
    public static void m195275d() {
        f178220d.put(0);
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Boolean mo37497a(final z5l.C21640a c21640a) {
        NewLikeView.m54991E(c21640a.m217363a(), CoreModule.f17545c.f19687u0.m30471r5(), new d30() { // from class: l.tt20
            @Override // p149l.d30
            public final void call() {
                ut20.m195274c(c21640a);
            }
        });
        f178220d.put(Integer.valueOf(f178220d.get().intValue() + 1));
        this.f178221a.put(App.f15373i.get());
        return Boolean.TRUE;
    }

    @Override // p149l.p3m
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean mo37498b(z5l.C21640a c21640a) {
        if (this.f178221a.get().intValue() == App.f15373i.get().intValue()) {
            return false;
        }
        User userM169520na = CoreModule.f17545c.f19639e0.m169520na();
        Counter counterM31484o3 = CoreModule.f17545c.m31484o3();
        CoreLikers.C4719a c4719aM30471r5 = CoreModule.f17545c.f19687u0.m30471r5();
        if (counterM31484o3 != null && c4719aM30471r5 != null && c4719aM30471r5.f19269a == CoreLikers.LikersTriggerBy.new_like_dialog) {
            if (NullChecker.m81303a(userM169520na)) {
                userM169520na.isFemale();
                n3b0.m157733g();
                CoreModule.f17545c.f19639e0.m169502j8(userM169520na);
            }
            c4719aM30471r5.toString();
            if (NullChecker.m81303a(userM169520na) && !userM169520na.isFemale() && n3b0.m157733g() == 0 && CoreModule.f17545c.f19639e0.m169502j8(userM169520na)) {
                if (!mqi0.m155929D(this.f178222b.get().longValue())) {
                    this.f178222b.put(Long.valueOf(mqi0.m155944o()));
                    f178220d.put(0);
                }
                if (f178220d.get().intValue() < 2 && c4719aM30471r5.f19271c > 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
