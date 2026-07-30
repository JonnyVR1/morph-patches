package p153l;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.heytap.mcssdk.mode.CommandMessage;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J-\u0010\f\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0014¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m88121d2 = {"Ll/nj3;", "Ll/qpl;", "Ll/hul;", "mWebView", "<init>", "(Ll/hul;)V", "", "namespace", FirebaseAnalytics.Param.METHOD, "Lorg/json/JSONObject;", CommandMessage.PARAMS, "", "p", "(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Z", "MKBusiness_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public class nj3 extends qpl {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nj3(@NotNull hul hulVar) {
        super(hulVar);
        hulVar.getClass();
    }

    @Override // p153l.qpl
    /* JADX INFO: renamed from: p */
    public boolean mo18018p(@Nullable String namespace, @Nullable String method, @Nullable JSONObject params) {
        if (m177460c() == null || !Intrinsics.m88377d(namespace, "action") || method == null || method.hashCode() != 1811096719 || !method.equals("getUserInfo") || !glw.m130712i(sjw.m186317f(m177461d()))) {
            return false;
        }
        m177463g(params != null ? params.optString("callback") : null, sjw.m186331u());
        return true;
    }
}
