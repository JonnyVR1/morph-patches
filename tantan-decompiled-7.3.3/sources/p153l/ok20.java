package p153l;

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
@Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u001f\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001b\u0010\b\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, m88121d2 = {"Ll/vv5;", "", "", "b", "(Ll/vv5;)Ljava/util/Map;", "Lkotlin/Function0;", "", "block", "a", "(Lkotlin/jvm/functions/Function0;)V", "sdk_release"}, m88122k = 2, m88123mv = {1, 4, 0})
public final class ok20 {
    /* JADX INFO: renamed from: a */
    public static final void m167975a(@NotNull Function0<Unit> function0) {
        function0.getClass();
        try {
            function0.invoke();
        } catch (Exception unused) {
            NetworkMetricsStatistics.INSTANCE.m19255f();
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final Map<String, String> m167976b(@Nullable vv5 vv5Var) {
        Object objM225066constructorimpl;
        if (vv5Var != null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                objM225066constructorimpl = Result.m225066constructorimpl(MapsKt.mutableMapOf(TuplesKt.m88129a("app", vv5Var.getApp()), TuplesKt.m88129a("ver", vv5Var.getCom.sina.weibo.sdk.constant.WBConstants.AUTH_PARAMS_VERSION java.lang.String()), TuplesKt.m88129a("os", "Android"), TuplesKt.m88129a(Oauth2AccessToken.KEY_UID, vv5Var.m203001g().invoke())));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM225066constructorimpl = Result.m225066constructorimpl(ResultKt.m88127a(th));
            }
            if (Result.m225072isFailureimpl(objM225066constructorimpl)) {
                objM225066constructorimpl = null;
            }
            Map<String, String> map = (Map) objM225066constructorimpl;
            if (map != null) {
                return map;
            }
        }
        return MapsKt.mutableMapOf(TuplesKt.m88129a("os", "Android"));
    }
}
