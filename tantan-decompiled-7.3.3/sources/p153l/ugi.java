package p153l;

import kotlin.Metadata;
import kotlin.text.C15493d;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0013\u0010\u0001\u001a\u0004\u0018\u00010\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, m88121d2 = {"", "a", "(Ljava/lang/String;)Ljava/lang/String;", "FEP_release"}, m88122k = 2, m88123mv = {1, 4, 0})
public final class ugi {
    @Nullable
    /* JADX INFO: renamed from: a */
    public static final String m195903a(@NotNull String str) {
        str.getClass();
        if (StringsKt.m94329e0(str) || !(C15493d.m94374J(str, "http://", false, 2, null) || C15493d.m94374J(str, "https://", false, 2, null))) {
            return null;
        }
        return str;
    }
}
