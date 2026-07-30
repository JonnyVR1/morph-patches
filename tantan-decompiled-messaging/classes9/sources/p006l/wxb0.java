package p006l;

import com.p000p1.mobile.putong.core.api.CoreAudioMatch;
import com.p1.mobile.putong.core.ui.onlinematch.OnlineMatchManager;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Ll/wxb0;", "", "<init>", "()V", "", "a", "()Z", "b", "c", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class wxb0 {

    @NotNull
    public static final wxb0 INSTANCE = new wxb0();

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final boolean m26856a() {
        return m26857b() || m26858c();
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final boolean m26857b() {
        return Intrinsics.d(OnlineMatchManager.z().C(), "matching");
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final boolean m26858c() {
        return sqb0.INSTANCE.m24115f().m24086P() == CoreAudioMatch.AudioMatchStatus.SEARCHING;
    }
}
