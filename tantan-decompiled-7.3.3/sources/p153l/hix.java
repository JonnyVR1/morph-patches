package p153l;

import com.p051p1.mobile.putong.core.newui.profile.ProfileFrag;
import com.p051p1.mobile.putong.core.newui.profile.newme.revamp.test1.MeTabRevampTest1ViewModel;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m88121d2 = {"Ll/hix;", "", "<init>", "()V", "Lcom/p1/mobile/putong/core/newui/profile/ProfileFrag;", "frag", "Ll/u1b0;", "a", "(Lcom/p1/mobile/putong/core/newui/profile/ProfileFrag;)Ll/u1b0;", "Ll/v1b0;", "b", "(Lcom/p1/mobile/putong/core/newui/profile/ProfileFrag;)Ll/v1b0;", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class hix {

    @NotNull
    public static final hix INSTANCE = new hix();

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final u1b0<?> m135185a(@NotNull ProfileFrag frag) {
        frag.getClass();
        if (d79.m114679g0()) {
            return new ikx(frag);
        }
        return d79.m114681h0() ? new enx(frag) : new so30(frag);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final v1b0<?> m135186b(@NotNull ProfileFrag frag) {
        frag.getClass();
        if (d79.m114679g0()) {
            return new MeTabRevampTest1ViewModel(frag);
        }
        return d79.m114681h0() ? new xnx(frag) : new xp30(frag);
    }
}
