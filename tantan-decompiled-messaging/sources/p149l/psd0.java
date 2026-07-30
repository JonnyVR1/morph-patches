package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.p053ui.greet.C8360d;
import com.p046p1.mobile.putong.data.Channel;
import com.p046p1.mobile.putong.data.User;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m87232d2 = {"Ll/psd0;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/data/User;", "user", "", "isFromProfile", "", "a", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/data/User;Z)V", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class psd0 {

    @NotNull
    public static final psd0 INSTANCE = new psd0();

    /* JADX INFO: renamed from: a */
    public final void m171136a(@NotNull Act act, @NotNull User user, boolean isFromProfile) {
        act.getClass();
        user.getClass();
        if (CoreModule.m29932K().mo30819sg(user.f56011id)) {
            CoreModule.f17545c.f19663m0.f19346I2.m132487l(j760.m140076a(SwipeDirection.RIGHT, null));
            return;
        }
        C8360d.a aVar = new C8360d.a(user.f56011id, "card");
        aVar.m45918o(isFromProfile ? "p_suggest_user_profile_info_view,e_sayhi_first,click" : "p_suggest_users_home_view,e_sayhi_first,click");
        aVar.m45907d().channel = Channel.get(Channel.confession);
        aVar.m45914k(true);
        if (CoreModule.f17554l.m94651a().mo33526jj()) {
            de80.INSTANCE.m111180b(act, aVar);
        } else {
            osd0.INSTANCE.m165751k(act, aVar);
        }
    }
}
