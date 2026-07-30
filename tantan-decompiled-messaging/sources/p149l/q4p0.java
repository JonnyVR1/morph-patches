package p149l;

import com.p046p1.mobile.putong.data.Owner;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, m87232d2 = {"Ll/q4p0;", "", "<init>", "()V", "", "identity", "", "a", "(Ljava/lang/String;)Z", "b", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class q4p0 {

    @NotNull
    public static final q4p0 INSTANCE = new q4p0();

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final boolean m172949a(@NotNull String identity) {
        identity.getClass();
        return Intrinsics.m87488d(Owner.TYPE, identity);
    }

    @JvmStatic
    /* JADX INFO: renamed from: b */
    public static final boolean m172950b(@NotNull String identity) {
        identity.getClass();
        return Intrinsics.m87488d("manager", identity);
    }
}
