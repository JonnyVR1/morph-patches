package p149l;

import com.p046p1.mobile.putong.core.api.CoreAudioMatch;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.OnlineMatchManager;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, m87232d2 = {"Ll/wxb0;", "", "<init>", "()V", "", "a", "()Z", "b", "c", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class wxb0 {

    @NotNull
    public static final wxb0 INSTANCE = new wxb0();

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final boolean m205979a() {
        return m205980b() || m205981c();
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final boolean m205980b() {
        return Intrinsics.m87488d(OnlineMatchManager.m50143z().m50146C(), "matching");
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final boolean m205981c() {
        return sqb0.INSTANCE.m185577f().m185548P() == CoreAudioMatch.AudioMatchStatus.SEARCHING;
    }
}
