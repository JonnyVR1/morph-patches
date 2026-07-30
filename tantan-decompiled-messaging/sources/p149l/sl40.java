package p149l;

import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m87232d2 = {"Ll/sl40;", "", "<init>", "()V", "", "nonce", "", "a", "(Ljava/lang/String;)Z", "facebook-common_release"}, m87233k = 1, m87234mv = {1, 5, 1}, m87236xi = 48)
public final class sl40 {

    @NotNull
    public static final sl40 INSTANCE = new sl40();

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final boolean m184756a(@Nullable String nonce) {
        if (nonce == null || nonce.length() == 0) {
            return false;
        }
        return !(StringsKt.m93435b0(nonce, ' ', 0, false, 6, null) >= 0);
    }
}
