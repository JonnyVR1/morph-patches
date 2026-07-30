package p009l;

import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreLikers;
import com.p1.mobile.putong.core.ui.seepop.NewLikeView;
import com.p1.mobile.putong.data.Counter;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.n3b0;
import l.tpd0;
import l.zpd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ut20 extends AbstractC1065o4 {

    /* JADX INFO: renamed from: d */
    public static tpd0 f21327d = new tpd0("new_like_dialog_show_count_" + CoreModule.H().userId(), 0);

    /* JADX INFO: renamed from: a */
    public tpd0 f21328a = new tpd0("app_sission_has_show_new_like_" + CoreModule.H().userId(), 0);

    /* JADX INFO: renamed from: b */
    public zpd0 f21329b = new zpd0("new_like_dilaog_show_rime_" + CoreModule.H().userId(), 0L);

    /* JADX INFO: renamed from: c */
    public zpd0 f21330c = new zpd0("new_like_dilaog_will_show_rime_" + CoreModule.H().userId(), 0L);

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m23159c(z5l.C1346a c1346a) {
        CoreModule.c.u0.k0.put(Long.valueOf(mqi0.m18550o()));
        CoreModule.c.u0.Y6();
        CoreModule.P().a().l1(c1346a.m25611a(), "p_special_card,p_new_like_notification_popup,click");
    }

    /* JADX INFO: renamed from: d */
    public static void m23160d() {
        f21327d.put(0);
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Boolean mo1468a(final z5l.C1346a c1346a) {
        NewLikeView.E(c1346a.m25611a(), CoreModule.c.u0.r5(), new d30() { // from class: l.tt20
            public final void call() {
                ut20.m23159c(c1346a);
            }
        });
        f21327d.put(Integer.valueOf(((Integer) f21327d.get()).intValue() + 1));
        this.f21328a.put((Integer) App.i.get());
        return Boolean.TRUE;
    }

    @Override // p009l.p3m
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean mo1469b(z5l.C1346a c1346a) {
        if (((Integer) this.f21328a.get()).intValue() == ((Integer) App.i.get()).intValue()) {
            return false;
        }
        User userNa = CoreModule.c.e0.na();
        Counter counterO3 = CoreModule.c.o3();
        CoreLikers.a aVarR5 = CoreModule.c.u0.r5();
        if (counterO3 != null && aVarR5 != null && aVarR5.a == CoreLikers.LikersTriggerBy.new_like_dialog) {
            if (NullChecker.a(userNa)) {
                userNa.isFemale();
                n3b0.g();
                CoreModule.c.e0.j8(userNa);
            }
            aVarR5.toString();
            if (NullChecker.a(userNa) && !userNa.isFemale() && n3b0.g() == 0 && CoreModule.c.e0.j8(userNa)) {
                if (!mqi0.m18535D(((Long) this.f21329b.get()).longValue())) {
                    this.f21329b.put(Long.valueOf(mqi0.m18550o()));
                    f21327d.put(0);
                }
                if (((Integer) f21327d.get()).intValue() < 2 && aVarR5.c > 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
