package p149l;

import android.net.Uri;
import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationClickAction;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m87232d2 = {"Ll/qmn;", "", "<init>", "()V", "Companion", "a", "external_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class qmn {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: l.qmn$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J=\u0010\u000b\u001a(\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\n\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\t2\u0006\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, m87232d2 = {"Ll/qmn$a;", "", "<init>", "()V", "", "string", "a", "(Ljava/lang/String;)Ljava/lang/String;", BLiveOperationClickAction.scheme, "Ll/xaj0;", "", "b", "(Ljava/lang/String;)Ll/xaj0;", "external_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final String m175574a(@NotNull String string) {
            String str;
            string.getClass();
            xaj0<String, Map<String, String>, String> xaj0VarM175575b = m175575b(string);
            if (xaj0VarM175575b != null && (str = xaj0VarM175575b.f191753c) != null) {
                str.getClass();
                if (StringsKt.m93412P(str, "showH5", false, 2, null)) {
                    String str2 = xaj0VarM175575b.f191752b.get("h5Url");
                    if (!TextUtils.isEmpty(str2)) {
                        String strM218869b = xaj0VarM175575b.f191752b.get("_bid");
                        if (TextUtils.isEmpty(strM218869b)) {
                            strM218869b = zhw.m218869b(str2);
                        }
                        if (!TextUtils.isEmpty(strM218869b) && yhw.m214862s().m214871t(strM218869b) != null) {
                            return "1";
                        }
                    }
                }
            }
            return "0";
        }

        /* JADX INFO: renamed from: b */
        public final xaj0<String, Map<String, String>, String> m175575b(String scheme) {
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
            return new xaj0<>(host, map, path);
        }

        public Companion() {
        }
    }
}
