package p153l;

import android.net.Uri;
import android.text.TextUtils;
import com.hellogroup.fep.base.core.FepManager;
import com.hellogroup.fep.feppkg.internal.core.CheckPolicy;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationClickAction;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m88121d2 = {"Ll/qon;", "", "<init>", "()V", "Companion", "a", "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class qon {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: l.qon$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J=\u0010\u000b\u001a(\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m88121d2 = {"Ll/qon$a;", "", "<init>", "()V", "", "string", "a", "(Ljava/lang/String;)Ljava/lang/String;", BLiveOperationClickAction.scheme, "Ll/bkj0;", "", "b", "(Ljava/lang/String;)Ll/bkj0;", "external_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final String m177307a(@NotNull String string) {
            String str;
            string.getClass();
            bkj0<String, Map<String, String>, String> bkj0VarM177308b = m177308b(string);
            if (bkj0VarM177308b != null && (str = bkj0VarM177308b.f77083c) != null) {
                str.getClass();
                if (StringsKt.m94303P(str, "showH5", false, 2, null)) {
                    String str2 = bkj0VarM177308b.f77082b.get("h5Url");
                    if (!TextUtils.isEmpty(str2)) {
                        String strM206867c = bkj0VarM177308b.f77082b.get("_bid");
                        if (TextUtils.isEmpty(strM206867c)) {
                            strM206867c = wkw.m206867c(str2);
                        }
                        if (!TextUtils.isEmpty(strM206867c)) {
                            FepManager fepManagerM17610a = FepManager.INSTANCE.m17610a();
                            strM206867c.getClass();
                            if (fepManagerM17610a.m17592n(strM206867c, null, null, CheckPolicy.LOCAL_ONLY) != null) {
                                return "1";
                            }
                        }
                    }
                }
            }
            return "0";
        }

        /* JADX INFO: renamed from: b */
        public final bkj0<String, Map<String, String>, String> m177308b(String scheme) {
            Uri uri = Uri.parse(Uri.decode(scheme));
            String host = uri.getHost();
            String path = uri.getPath();
            if (TextUtils.isEmpty(host)) {
                return null;
            }
            HashMap map = new HashMap();
            for (String str : uri.getQueryParameterNames()) {
                map.put(str, uri.getQueryParameter(str));
            }
            String fragment = uri.getFragment();
            if (!TextUtils.isEmpty(fragment) && map.containsKey("url")) {
                map.put("url", ((String) map.get("url")) + "#" + fragment);
            }
            return new bkj0<>(host, map, path);
        }

        public Companion() {
        }
    }
}
