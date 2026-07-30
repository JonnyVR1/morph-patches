package p153l;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.heytap.mcssdk.mode.CommandMessage;
import java.io.File;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001JE\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00042\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004H&¢\u0006\u0004\b\u0007\u0010\bJO\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004H&¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m88121d2 = {"Ll/rk20;", "", "", "url", "", CommandMessage.PARAMS, "headers", "a", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)Ljava/lang/String;", "Ljava/io/File;", FirebaseAnalytics.Param.DESTINATION, "", "b", "(Ljava/lang/String;Ljava/io/File;Ljava/util/Map;Ljava/util/Map;)Z", "FEP_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public interface rk20 {

    /* JADX INFO: renamed from: l.rk20$a */
    @Metadata(m88119bv = {1, 0, 3}, m88122k = 3, m88123mv = {1, 1, 16})
    public static final class C19859a {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: a */
        public static /* synthetic */ boolean m181777a(rk20 rk20Var, String str, File file, Map map, Map map2, int i, Object obj) {
            if (obj != null) {
                pr3.m173429a("Super calls with default arguments not supported in this target, function: downloadFile");
                return false;
            }
            if ((i & 4) != 0) {
                map = null;
            }
            if ((i & 8) != 0) {
                map2 = null;
            }
            return rk20Var.mo130067b(str, file, map, map2);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    String mo130066a(@NotNull String url, @NotNull Map<String, String> params, @Nullable Map<String, String> headers);

    /* JADX INFO: renamed from: b */
    boolean mo130067b(@NotNull String url, @NotNull File destination, @Nullable Map<String, String> params, @Nullable Map<String, String> headers);
}
