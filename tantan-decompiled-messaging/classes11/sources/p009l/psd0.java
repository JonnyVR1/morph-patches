package p009l;

import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.ui.greet.d;
import com.p1.mobile.putong.data.Channel;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import kotlin.Metadata;
import l.de80;
import l.j760;
import l.osd0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ll/psd0;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", "act", "Lcom/p1/mobile/putong/data/User;", "user", "", "isFromProfile", "", "a", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/data/User;Z)V", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class psd0 {

    @NotNull
    public static final psd0 INSTANCE = new psd0();

    /* JADX INFO: renamed from: a */
    public final void m20626a(@NotNull Act act, @NotNull User user, boolean isFromProfile) {
        act.getClass();
        user.getClass();
        if (CoreModule.K().sg(((DbObject) user).id)) {
            CoreModule.c.m0.I2.onNext(j760.a(SwipeDirection.RIGHT, (Object) null));
            return;
        }
        d.a aVar = new d.a(((DbObject) user).id, "card");
        aVar.o(isFromProfile ? "p_suggest_user_profile_info_view,e_sayhi_first,click" : "p_suggest_users_home_view,e_sayhi_first,click");
        aVar.d().channel = Channel.get("confession");
        aVar.k(true);
        if (CoreModule.l.a().jj()) {
            de80.INSTANCE.b(act, aVar);
        } else {
            osd0.INSTANCE.k(act, aVar);
        }
    }
}
