package p153l;

import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\b\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0003"}, m88121d2 = {"", "a", "(Ljava/lang/String;)Ljava/lang/String;", "FEP_release"}, m88122k = 2, m88123mv = {1, 4, 0})
public final class jhi {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m144902a(@NotNull String str) {
        str.getClass();
        if (!StringsKt.m94303P(str, ".", false, 2, null)) {
            Long lP = StringsKt.m94281p(str);
            long jLongValue = lP != null ? lP.longValue() : 0L;
            return (jLongValue < 1000000000 || jLongValue % 10 == 0) ? "default" : String.valueOf(jLongValue / 1000000000);
        }
        String str2 = (String) CollectionsKt.firstOrNull(StringsKt.split$default(str, new String[]{"."}, false, 0, 6, null));
        if (str2 == null) {
            str2 = "";
        }
        return StringsKt.m94329e0(str2) ? "default" : str2;
    }
}
