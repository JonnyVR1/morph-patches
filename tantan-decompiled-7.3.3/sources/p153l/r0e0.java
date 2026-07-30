package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.p058ui.greet.C8523d;
import com.p051p1.mobile.putong.data.Channel;
import com.p051p1.mobile.putong.data.User;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m88121d2 = {"Ll/r0e0;", "", "<init>", "()V", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/data/User;", "user", "", "isFromProfile", "", "a", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/data/User;Z)V", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class r0e0 {

    @NotNull
    public static final r0e0 INSTANCE = new r0e0();

    /* JADX INFO: renamed from: a */
    public final void m179216a(@NotNull Act act, @NotNull User user, boolean isFromProfile) {
        act.getClass();
        user.getClass();
        if (CoreModule.m30930K().mo31822sg(user.f56859id)) {
            CoreModule.f18264c.f20405m0.f20088I2.m137019l(pf60.m172085a(SwipeDirection.RIGHT, null));
            return;
        }
        C8523d.a aVar = new C8523d.a(user.f56859id, "card");
        aVar.m47101o(isFromProfile ? "p_suggest_user_profile_info_view,e_sayhi_first,click" : "p_suggest_users_home_view,e_sayhi_first,click");
        aVar.m47090d().channel = Channel.get(Channel.confession);
        aVar.m47097k(true);
        if (CoreModule.f18273l.m143405a().mo34529jj()) {
            km80.INSTANCE.m150415b(act, aVar);
        } else {
            q0e0.INSTANCE.m174706k(act, aVar);
        }
    }
}
