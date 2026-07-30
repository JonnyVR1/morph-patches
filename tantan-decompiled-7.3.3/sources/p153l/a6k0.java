package p153l;

import android.net.Uri;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.net.URL;
import java.util.List;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C15493d;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000.C0799b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\u000b\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\nJ-\u0010\u000f\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\bJ\u0017\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0012\u0010\bJ\u0017\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0013\u0010\nJ3\u0010\u0016\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u00152\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001b\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0019\u001a\u00020\u00182\b\u0010\u001a\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u00042\b\u0010\u001d\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001e\u0010\nR\u001f\u0010$\u001a\n  *\u0004\u0018\u00010\u001f0\u001f8\u0006¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, m88121d2 = {"Ll/a6k0;", "", "<init>", "()V", "", "url", "", RXScreenCaptureService.KEY_INDEX, "(Ljava/lang/String;)Z", "f", "(Ljava/lang/String;)Ljava/lang/String;", "a", "urlStr", "appendKey", "value", "e", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "h", "g", "j", "bidOld", "Lkotlin/Pair;", "b", "(Ljava/lang/String;Ljava/lang/String;)Lkotlin/Pair;", "Landroid/net/Uri;", "uri", Constants.KEY_KEY, Constants.INAPP_DATA_TAG, "(Landroid/net/Uri;Ljava/lang/String;)Ljava/lang/String;", "source", "c", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "Ljava/util/regex/Pattern;", "getPATTERN_V_X", "()Ljava/util/regex/Pattern;", "PATTERN_V_X", "HelloFoundation_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class a6k0 {
    public static final a6k0 INSTANCE = new a6k0();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final Pattern PATTERN_V_X = Pattern.compile("^[1-9]+[0-9]*.x$");

    private a6k0() {
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m96329a(@Nullable String url) {
        if (url != null) {
            try {
                String queryParameter = Uri.parse(url).getQueryParameter("_bid");
                if (queryParameter != null) {
                    return queryParameter;
                }
            } catch (Exception unused) {
            }
        }
        return "";
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final Pair<String, String> m96330b(@Nullable String url, @Nullable String bidOld) {
        String strM96336j;
        if (url == null || StringsKt.m94329e0(url)) {
            strM96336j = null;
        } else {
            strM96336j = m96336j(url);
            if (bidOld == null || StringsKt.m94329e0(bidOld)) {
                bidOld = m96329a(url);
            }
        }
        if (bidOld == null || StringsKt.m94329e0(bidOld)) {
            return new Pair<>(bidOld, strM96336j);
        }
        if (strM96336j == null || StringsKt.m94329e0(strM96336j)) {
            strM96336j = "default";
        }
        return new Pair<>(bidOld, strM96336j);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: e */
    public static final String m96331e(@Nullable String urlStr, @Nullable String appendKey, @Nullable String value) {
        if (TextUtils.isEmpty(urlStr)) {
            return "";
        }
        Uri uri = Uri.parse(urlStr);
        uri.getClass();
        String str = uri.getPort() != -1 ? ":" + uri.getPort() : "";
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(uri.getScheme()).authority(Intrinsics.m88385l(uri.getHost(), str)).path(uri.getPath());
        boolean z = false;
        for (String str2 : uri.getQueryParameterNames()) {
            if (TextUtils.equals(str2, appendKey)) {
                z = true;
            }
            builder.appendQueryParameter(str2, INSTANCE.m96338d(uri, str2));
        }
        if (!z) {
            builder.appendQueryParameter(appendKey, value);
        }
        String encodedFragment = uri.getEncodedFragment();
        if (!TextUtils.isEmpty(encodedFragment)) {
            builder.encodedFragment(encodedFragment);
        }
        String string = builder.build().toString();
        string.getClass();
        return string;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: f */
    public static final String m96332f(@Nullable String url) {
        Uri uri = Uri.parse(url);
        String host = uri.getHost();
        String path = uri.getPath();
        if (path == null) {
            Intrinsics.m88386m();
        }
        if (!C15493d.m94374J(path, "/", false, 2, null)) {
            path = "/" + path;
        }
        return host + path;
    }

    @JvmStatic
    /* JADX INFO: renamed from: g */
    public static final boolean m96333g(@NotNull String url) {
        url.getClass();
        if (TextUtils.isEmpty(url)) {
            return false;
        }
        Uri uri = Uri.parse(url);
        uri.getClass();
        String scheme = uri.getScheme();
        if (TextUtils.isEmpty(scheme) || !StringsKt.m94303P(url, "_bid=", false, 2, null)) {
            return false;
        }
        if (scheme == null) {
            Intrinsics.m88386m();
        }
        if (scheme == null) {
            C0799b.m4641a("null cannot be cast to non-null type kotlin.CharSequence");
            return false;
        }
        String string = StringsKt.m94324Z0(scheme).toString();
        if (C15493d.m94381x(string, "http", true) || C15493d.m94381x(string, "https", true)) {
            return StringsKt.m94334j0(url, ".jpg", 0, false, 6, null) > 0 || StringsKt.m94334j0(url, ".jpeg", 0, false, 6, null) > 0 || StringsKt.m94334j0(url, ".png", 0, false, 6, null) > 0 || StringsKt.m94334j0(url, ".webp", 0, false, 6, null) > 0 || StringsKt.m94334j0(url, ".gif", 0, false, 6, null) > 0 || StringsKt.m94334j0(url, ".bmp", 0, false, 6, null) > 0;
        }
        return false;
    }

    @JvmStatic
    /* JADX INFO: renamed from: h */
    public static final boolean m96334h(@NotNull String url) {
        url.getClass();
        return false;
    }

    @JvmStatic
    /* JADX INFO: renamed from: i */
    public static final boolean m96335i(@NotNull String url) {
        url.getClass();
        return C15493d.m94374J(url, "local://", false, 2, null);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: j */
    public static final String m96336j(@NotNull String url) {
        int i;
        url.getClass();
        try {
            Uri uri = Uri.parse(url);
            uri.getClass();
            List<String> pathSegments = uri.getPathSegments();
            if (pathSegments != null) {
                int size = pathSegments.size();
                for (int i2 = 0; i2 < size; i2++) {
                    if (Intrinsics.m88377d(pathSegments.get(i2), "v-") && (i = i2 + 1) < pathSegments.size()) {
                        String str = pathSegments.get(i);
                        if (PATTERN_V_X.matcher(str).matches()) {
                            str.getClass();
                            return StringsKt.m94316V0(str, ".", null, 2, null);
                        }
                    }
                }
            }
        } catch (Exception unused) {
        }
        return "default";
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public final String m96337c(@Nullable String source) {
        try {
            String host = new URL(source).getHost();
            host.getClass();
            return host;
        } catch (Exception unused) {
            return "";
        }
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final String m96338d(@NotNull Uri uri, @Nullable String key) {
        uri.getClass();
        try {
            List<String> queryParameters = uri.getQueryParameters(key);
            return queryParameters.size() > 0 ? queryParameters.get(0) : uri.getQueryParameter(key);
        } catch (Exception unused) {
            return "";
        }
    }
}
