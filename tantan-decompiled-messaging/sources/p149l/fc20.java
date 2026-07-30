package p149l;

import com.immomo.android.network.metrics.NetworkMetricsStatistics;
import com.sina.weibo.sdk.auth.Oauth2AccessToken;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87231d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\b\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m87232d2 = {"Ll/ru5;", "", "", "b", "(Ll/ru5;)Ljava/util/Map;", "Lkotlin/Function0;", "", "block", "a", "(Lkotlin/jvm/functions/Function0;)V", "sdk_release"}, m87233k = 2, m87234mv = {1, 4, 0})
public final class fc20 {
    /* JADX INFO: renamed from: a */
    public static final void m120418a(@NotNull Function0<Unit> function0) {
        function0.getClass();
        try {
            function0.invoke();
        } catch (Exception unused) {
            NetworkMetricsStatistics.INSTANCE.m18178f();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final Map<String, String> m120419b(@Nullable ru5 ru5Var) {
        Object objM223820constructorimpl;
        if (ru5Var != null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                objM223820constructorimpl = Result.m223820constructorimpl(MapsKt.mutableMapOf(TuplesKt.m87240a("app", ru5Var.getApp()), TuplesKt.m87240a("ver", ru5Var.getCom.sina.weibo.sdk.constant.WBConstants.AUTH_PARAMS_VERSION java.lang.String()), TuplesKt.m87240a("os", "Android"), TuplesKt.m87240a(Oauth2AccessToken.KEY_UID, ru5Var.m180856g().invoke())));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM223820constructorimpl = Result.m223820constructorimpl(ResultKt.m87238a(th));
            }
            if (Result.m223826isFailureimpl(objM223820constructorimpl)) {
                objM223820constructorimpl = null;
            }
            Map<String, String> map = (Map) objM223820constructorimpl;
            if (map != null) {
                return map;
            }
        }
        return MapsKt.mutableMapOf(TuplesKt.m87240a("os", "Android"));
    }
}
