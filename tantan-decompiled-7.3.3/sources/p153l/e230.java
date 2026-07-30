package p153l;

import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreLikers;
import com.p051p1.mobile.putong.core.p058ui.seepop.NewLikeView;
import com.p051p1.mobile.putong.data.Counter;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes11.dex */
public class e230 extends AbstractC18774n4 {

    /* JADX INFO: renamed from: d */
    public static vxd0 f91696d = new vxd0("new_like_dialog_show_count_" + CoreModule.m30929H().userId(), 0);

    /* JADX INFO: renamed from: a */
    public vxd0 f91697a = new vxd0("app_sission_has_show_new_like_" + CoreModule.m30929H().userId(), 0);

    /* JADX INFO: renamed from: b */
    public byd0 f91698b = new byd0("new_like_dilaog_show_rime_" + CoreModule.m30929H().userId(), 0L);

    /* JADX INFO: renamed from: c */
    public byd0 f91699c = new byd0("new_like_dilaog_will_show_rime_" + CoreModule.m30929H().userId(), 0L);

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m119041c(p8l.C19323a c19323a) {
        CoreModule.f18264c.f20429u0.f19996l0.put(Long.valueOf(pzi0.m174454o()));
        CoreModule.f18264c.f20429u0.m31435c7();
        CoreModule.m30933P().m143405a().mo34537l1(c19323a.m171258a(), "p_special_card,p_new_like_notification_popup,click");
    }

    /* JADX INFO: renamed from: d */
    public static void m119042d() {
        f91696d.put(0);
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public Boolean mo38500a(final p8l.C19323a c19323a) {
        NewLikeView.m56174E(c19323a.m171258a(), CoreModule.f18264c.f20429u0.m31479t5(), new x20() { // from class: l.d230
            @Override // p153l.x20
            public final void call() {
                e230.m119041c(c19323a);
            }
        });
        f91696d.put(Integer.valueOf(f91696d.get().intValue() + 1));
        this.f91697a.put(App.f16092i.get());
        return Boolean.TRUE;
    }

    @Override // p153l.g6m
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public boolean mo38501b(p8l.C19323a c19323a) {
        if (this.f91697a.get().intValue() == App.f16092i.get().intValue()) {
            return false;
        }
        User userM116593na = CoreModule.f18264c.f20381e0.m116593na();
        Counter counterM32487o3 = CoreModule.f18264c.m32487o3();
        CoreLikers.C4870a c4870aM31479t5 = CoreModule.f18264c.f20429u0.m31479t5();
        if (counterM32487o3 != null && c4870aM31479t5 != null && c4870aM31479t5.f20011a == CoreLikers.LikersTriggerBy.new_like_dialog) {
            if (NullChecker.m82486a(userM116593na)) {
                userM116593na.isFemale();
                rbb0.m180735g();
                CoreModule.f18264c.f20381e0.m116575j8(userM116593na);
            }
            c4870aM31479t5.toString();
            if (NullChecker.m82486a(userM116593na) && !userM116593na.isFemale() && rbb0.m180735g() == 0 && CoreModule.f18264c.f20381e0.m116575j8(userM116593na)) {
                if (!pzi0.m174439D(this.f91698b.get().longValue())) {
                    this.f91698b.put(Long.valueOf(pzi0.m174454o()));
                    f91696d.put(0);
                }
                if (f91696d.get().intValue() < 2 && c4870aM31479t5.f20013c > 0) {
                    return true;
                }
            }
        }
        return false;
    }
}
