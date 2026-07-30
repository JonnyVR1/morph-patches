package p153l;

import android.net.Uri;
import com.clevertap.android.sdk.Constants;
import com.hellogroup.fep.grey.internal.FepGreyContext;
import com.heytap.mcssdk.mode.Message;
import com.p074ss.bytertc.engine.type.WarningCode;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 $2\u00020\u0001:\u0001!B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\rJ!\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0011JO\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00042\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\"\u0010\u0019\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0017j\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0001`\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ)\u0010!\u001a\u00020 2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u000b¢\u0006\u0004\b!\u0010\"J\u001d\u0010#\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b#\u0010\t¨\u0006%"}, m88121d2 = {"Ll/kgi;", "", "<init>", "()V", "", "urlString", "Ll/lgi;", Message.RULE, "c", "(Ljava/lang/String;Ll/lgi;)Ljava/lang/String;", "url", "", "h", "(Ljava/lang/String;)Z", "f", "Ll/lgi$a;", "e", "(Ljava/lang/String;Ll/lgi;)Ll/lgi$a;", "", "errorCode", "message", "", "throwable", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "extraInfo", "", "g", "(ILjava/lang/String;Ljava/lang/Throwable;Ljava/util/HashMap;)V", "", "localVer", "justParam", "Ll/ngi;", "a", "(Ljava/lang/String;Ljava/lang/Long;Z)Ll/ngi;", Constants.INAPP_DATA_TAG, "Companion", "FEP_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class kgi {

    /* JADX INFO: renamed from: a */
    private static final Pattern f126613a = Pattern.compile("^[1-9]+[0-9]*.x$");

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ ngi m149747b(kgi kgiVar, String str, Long l2, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return kgiVar.m149753a(str, l2, z);
    }

    /* JADX INFO: renamed from: c */
    private final String m149748c(String urlString, lgi rule) {
        return a6k0.m96331e(urlString, "_fep", "g");
    }

    /* JADX INFO: renamed from: e */
    private final lgi.C18390a m149749e(String url, lgi rule) {
        String str;
        int i;
        if (rule.m154068b() == null) {
            FepGreyContext.INSTANCE.m17746c().m172240a("Version infos is null, rule: " + rule, MapsKt.mapOf(TuplesKt.m88129a("url", url)));
            return null;
        }
        if (rule.getProjectName() != null) {
            Uri uri = Uri.parse(url);
            boolean zM149750f = m149750f(url);
            uri.getClass();
            List<String> pathSegments = uri.getPathSegments();
            if (zM149750f) {
                pathSegments.getClass();
                int size = pathSegments.size();
                int i2 = 0;
                while (true) {
                    if (i2 >= size) {
                        str = null;
                        break;
                    }
                    if (Intrinsics.m88377d(pathSegments.get(i2), "v-") && (i = i2 + 1) < pathSegments.size()) {
                        str = pathSegments.get(i);
                        break;
                    }
                    i2++;
                }
            } else {
                str = "default";
            }
            pgi.m172235f(FepGreyContext.INSTANCE.m17746c(), "Version tag: " + str, MapsKt.mapOf(TuplesKt.m88129a("url", url)), 0, 4, null);
            if (str != null) {
                return rule.m154068b().get(str);
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: f */
    private final boolean m149750f(String url) {
        return StringsKt.m94303P(url, "/v-/", false, 2, null);
    }

    /* JADX INFO: renamed from: g */
    private final void m149751g(int errorCode, String message, Throwable throwable, HashMap<String, Object> extraInfo) {
        FepGreyContext.INSTANCE.m17746c().m172241c(errorCode, message, throwable, extraInfo);
    }

    /* JADX INFO: renamed from: h */
    private final boolean m149752h(String url) {
        try {
            String queryParameter = Uri.parse(url).getQueryParameter("_fep");
            return Intrinsics.m88377d(queryParameter, "g") || Intrinsics.m88377d(queryParameter, "f");
        } catch (Exception unused) {
            return false;
        }
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final ngi m149753a(@NotNull String urlString, @Nullable Long localVer, boolean justParam) {
        Long lMo17612a;
        urlString.getClass();
        ngi ngiVar = new ngi(urlString, 0, 0L, null, null, false, 62, null);
        if (StringsKt.m94329e0(urlString)) {
            pgi.m172239k(FepGreyContext.INSTANCE.m17746c(), "URL is blank, skip processing, url: " + urlString, null, 0, MapsKt.mapOf(TuplesKt.m88129a("url", urlString)), 6, null);
            return ngiVar;
        }
        ggi ggiVar = ggi.INSTANCE;
        if (!ggiVar.m130147b()) {
            pgi.m172235f(FepGreyContext.INSTANCE.m17746c(), "Grey regular is disabled, skip processing, url: " + urlString, MapsKt.mapOf(TuplesKt.m88129a("url", urlString)), 0, 4, null);
            return ngiVar;
        }
        String strM96329a = a6k0.m96329a(urlString);
        if (!StringsKt.m94329e0(strM96329a)) {
            Long lP = StringsKt.m94281p(strM96329a);
            long jLongValue = 0;
            if ((lP != null ? lP.longValue() : 0L) > 1000000) {
                Map<String, ? extends Object> mapMapOf = MapsKt.mapOf(TuplesKt.m88129a("bid", strM96329a), TuplesKt.m88129a("url", urlString));
                if (ggiVar.m130146a(strM96329a, a6k0.INSTANCE.m96337c(urlString))) {
                    FepGreyContext.INSTANCE.m17746c().m172242e("bid or host is in blacklist, url: " + urlString, mapMapOf, WarningCode.WARNING_CODE_INVOKE_ERROR);
                    return ngiVar;
                }
                if (m149752h(urlString)) {
                    pgi.m172239k(FepGreyContext.INSTANCE.m17746c(), "URL already has _fep parameter, skip processing, url: " + urlString, null, 0, mapMapOf, 6, null);
                    return ngiVar;
                }
                FepGreyContext fepGreyContext = FepGreyContext.INSTANCE;
                lgi lgiVarM158334c = fepGreyContext.m17748e().m158334c(strM96329a);
                if (lgiVarM158334c == null) {
                    fepGreyContext.m17746c().m172242e("No matched rule for bid: " + strM96329a + ", url: " + urlString, mapMapOf, -2006);
                    return ngiVar;
                }
                lgi.C18390a c18390aM149749e = m149749e(urlString, lgiVarM158334c);
                if (c18390aM149749e == null) {
                    pgi.m172239k(fepGreyContext.m17746c(), "No matched version for url: " + urlString + ", rule: " + lgiVarM158334c, null, 0, mapMapOf, 6, null);
                    return ngiVar;
                }
                if (localVer != null && localVer.longValue() > 0) {
                    jLongValue = localVer.longValue();
                } else if (!justParam && (lMo17612a = fepGreyContext.m17745b().mo17612a(strM96329a, c18390aM149749e.getTag(), urlString)) != null) {
                    jLongValue = lMo17612a.longValue();
                }
                if (bkw.m104864a(jLongValue, c18390aM149749e.getCom.sina.weibo.sdk.constant.WBConstants.AUTH_PARAMS_VERSION java.lang.String())) {
                    pgi.m172235f(fepGreyContext.m17746c(), "Local version is equal to matched version, skip processing, url: " + urlString, mapMapOf, 0, 4, null);
                    return new ngi(urlString, c18390aM149749e.getType(), jLongValue, c18390aM149749e, lgiVarM158334c, true);
                }
                long j = jLongValue;
                int type = c18390aM149749e.getType();
                if (type == 0) {
                    pgi.m172235f(fepGreyContext.m17746c(), "Apply multi version URL, url: " + urlString, mapMapOf, 0, 4, null);
                    return new ngi(justParam ? m149748c(urlString, lgiVarM158334c) : m149754d(urlString, lgiVarM158334c), type, j, c18390aM149749e, lgiVarM158334c, false, 32, null);
                }
                if (type == 1) {
                    return new ngi(urlString, type, j, c18390aM149749e, null, false, 48, null);
                }
                pgi.m172239k(fepGreyContext.m17746c(), "Unknown version type: " + c18390aM149749e.getType() + ", url: " + urlString, null, 0, mapMapOf, 6, null);
                return ngiVar;
            }
        }
        m149751g(WarningCode.WARNING_CODE_SUBSCRIBE_STREAM_FAILED5XX, "bid is not valid, skip processing, url: " + urlString, null, MapsKt.hashMapOf(new Pair("bid", strM96329a)));
        return ngiVar;
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public final String m149754d(@NotNull String url, @NotNull lgi rule) {
        String strM114836a;
        url.getClass();
        rule.getClass();
        String strM96329a = a6k0.m96329a(url);
        try {
            String projectName = rule.getProjectName();
            if (projectName != null) {
                Uri uri = Uri.parse(url);
                uri.getClass();
                String path = uri.getPath();
                if (path != null && (strM114836a = d8g0.m114836a(path)) != null) {
                    if (!StringsKt.m94303P(strM114836a, "/".concat(projectName), false, 2, null)) {
                        pgi.m172239k(FepGreyContext.INSTANCE.m17746c(), "Grey URL transform skipped: path does not contain projectName", null, 0, MapsKt.mapOf(TuplesKt.m88129a("url", url), TuplesKt.m88129a("projectName", projectName)), 6, null);
                        return url;
                    }
                    boolean zM149750f = m149750f(url);
                    List<String> pathSegments = uri.getPathSegments();
                    Uri.Builder builderBuildUpon = uri.buildUpon();
                    builderBuildUpon.path("");
                    pathSegments.getClass();
                    int size = pathSegments.size();
                    int i = -1;
                    for (int i2 = 0; i2 < size; i2++) {
                        String str = pathSegments.get(i2);
                        builderBuildUpon.appendPath(str);
                        if (zM149750f) {
                            if (i < 0 && Intrinsics.m88377d(str, "v-")) {
                                i = i2 + 1;
                            }
                        } else if (i < 0 && Intrinsics.m88377d(str, projectName)) {
                            int i3 = i2 + 1;
                            if (i3 < pathSegments.size()) {
                                while (i3 < pathSegments.size() && Intrinsics.m88377d(pathSegments.get(i3), projectName)) {
                                    i3++;
                                }
                                i = i3 - 1;
                            } else {
                                i = i2;
                            }
                        }
                        if (i > 0 && i == i2) {
                            if (zM149750f) {
                                String str2 = (String) CollectionsKt.getOrNull(pathSegments, i2);
                                if (str2 != null && f126613a.matcher(str2).matches()) {
                                    builderBuildUpon.appendPath("grey");
                                }
                            } else {
                                builderBuildUpon.appendPath("grey");
                            }
                        }
                    }
                    String string = builderBuildUpon.toString();
                    string.getClass();
                    return string;
                }
            }
            return url;
        } catch (Exception e) {
            m149751g(WarningCode.WARNING_CODE_SUBSCRIBE_STREAM_FAILED404, "Apply multi version URL failed: " + e.getMessage(), e, MapsKt.hashMapOf(new Pair("bid", strM96329a)));
            return url;
        }
    }
}
