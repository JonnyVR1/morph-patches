package p153l;

import com.p051p1.mobile.putong.core.api.CoreAudioMatch;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.OnlineMatchManager;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, m88121d2 = {"Ll/a6c0;", "", "<init>", "()V", "", "a", "()Z", "b", "c", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class a6c0 {

    @NotNull
    public static final a6c0 INSTANCE = new a6c0();

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final boolean m96321a() {
        return m96322b() || m96323c();
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final boolean m96322b() {
        return Intrinsics.m88377d(OnlineMatchManager.m51326z().m51329C(), "matching");
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final boolean m96323c() {
        return wyb0.INSTANCE.m208572f().m208543P() == CoreAudioMatch.AudioMatchStatus.SEARCHING;
    }
}
