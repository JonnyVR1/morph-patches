package p153l;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a3\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000*\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m88121d2 = {"", "", "stack", "a", "(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;", "FEP_release"}, m88122k = 2, m88123mv = {1, 4, 0})
public final class xgi {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final Map<String, String> m210888a(@NotNull Map<String, String> map, @Nullable String str) {
        map.getClass();
        if (str != null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                String str2 = map.get("stack_info");
                if (str2 == null) {
                    map.put("stack_info", str);
                } else {
                    map.put("stack_info", str2 + "_____" + str);
                }
                Result.m225066constructorimpl(Unit.INSTANCE);
                return map;
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                Result.m225066constructorimpl(ResultKt.m88127a(th));
            }
        }
        return map;
    }
}
