package p153l;

import android.net.Uri;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.hellogroup.fep.base.core.FepManager;
import com.hellogroup.fep.feppkg.internal.core.CheckPolicy;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C15493d;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000.C0799b;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\f\u001a\u0004\u0018\u00010\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\f\u0010\nJ\u001b\u0010\r\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\r\u0010\nJ-\u0010\u0011\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J%\u0010\u0019\u001a\u0004\u0018\u00010\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u001c\u001a\u0004\u0018\u00010\u00142\b\u0010\u001b\u001a\u0004\u0018\u00010\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0007¢\u0006\u0004\b\u001c\u0010\u001aJ#\u0010 \u001a\u0004\u0018\u00010\u00142\b\u0010\u001d\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0019\u0010\"\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\"\u0010\nJ\u001b\u0010$\u001a\u0004\u0018\u00010\u00142\b\u0010#\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b$\u0010\u0016R\u0014\u0010&\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010%¨\u0006'"}, m88121d2 = {"Ll/wkw;", "", "<init>", "()V", "", "url", "", "k", "(Ljava/lang/String;)Z", "b", "(Ljava/lang/String;)Ljava/lang/String;", "absoluteUrl", "e", "c", "url_str", "appendKey", "value", "g", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "imageUrl", "Ljava/io/File;", "j", "(Ljava/lang/String;)Ljava/io/File;", "Ll/x4d0;", "resourceResponse", RXScreenCaptureService.KEY_INDEX, "(Ljava/lang/String;Ll/x4d0;)Ljava/io/File;", "urlStr", "f", "dir", "Landroid/net/Uri;", "uri", "a", "(Ljava/io/File;Landroid/net/Uri;)Ljava/io/File;", "h", "bid", Constants.INAPP_DATA_TAG, "Ljava/lang/String;", "TAG", "MKCore_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class wkw {
    public static final wkw INSTANCE = new wkw();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final String TAG = wkw.class.getSimpleName();

    private wkw() {
    }

    /* JADX INFO: renamed from: a */
    private final File m206865a(File dir, Uri uri) {
        File[] fileArrListFiles;
        if (dir != null && dir.exists()) {
            String strM191459a = tjw.INSTANCE.m191459a(uri.getHost(), uri);
            if (strM191459a == null) {
                strM191459a = uri.getHost();
            }
            String path = uri.getPath();
            if (path == null) {
                Intrinsics.m88386m();
            }
            if (!C15493d.m94374J(path, "/", false, 2, null)) {
                path = "/" + path;
            }
            File file = new File(dir, Intrinsics.m88385l(strM191459a, path));
            if (file.exists() && file.length() != 0) {
                if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null && fileArrListFiles.length == 1) {
                    File file2 = fileArrListFiles[0];
                    file2.getClass();
                    String name = file2.getName();
                    name.getClass();
                    if (StringsKt.m94303P(name, "index.html", false, 2, null)) {
                        return fileArrListFiles[0];
                    }
                }
                return file;
            }
        }
        return null;
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: b */
    public static final String m206866b(@Nullable String url) {
        File fileM110398g = ckw.m110398g();
        fileM110398g.getClass();
        File parentFile = fileM110398g.getParentFile();
        if (parentFile == null) {
            return null;
        }
        String parent = parentFile.getParent();
        if (TextUtils.isEmpty(parent)) {
            return null;
        }
        return new File(parent, m206872h(url)).getAbsolutePath();
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: c */
    public static final String m206867c(@Nullable String url) {
        if (TextUtils.isEmpty(url)) {
            return "";
        }
        try {
            return Uri.parse(url).getQueryParameter("_bid");
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: d */
    public static final File m206868d(@Nullable String bid) {
        return FepManager.INSTANCE.m17610a().m17586g(bid, "custom", "9999999999");
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: e */
    public static final String m206869e(@Nullable String absoluteUrl) {
        File parentFile;
        if (absoluteUrl == null || !C15493d.m94374J(absoluteUrl, "/", false, 2, null)) {
            return absoluteUrl;
        }
        File fileM110398g = ckw.m110398g();
        if (fileM110398g != null && (parentFile = fileM110398g.getParentFile()) != null) {
            String parent = parentFile.getParent();
            if (!TextUtils.isEmpty(parent)) {
                parent.getClass();
                if (C15493d.m94374J(absoluteUrl, parent, false, 2, null)) {
                    String strM94370F = C15493d.m94370F(absoluteUrl, parent, "", false, 4, null);
                    if (strM94370F != null) {
                        return "local://".concat(strM94370F.substring(1));
                    }
                    C0799b.m4641a("null cannot be cast to non-null type java.lang.String");
                    return null;
                }
            }
        }
        return absoluteUrl;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0045  */
    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: f */
    public static final File m206870f(@Nullable String urlStr, @Nullable x4d0 resourceResponse) {
        zgi zgiVarM209308e;
        File fileM219625h;
        String name;
        if (resourceResponse != null && !TextUtils.isEmpty(resourceResponse.getBid()) && urlStr != null) {
            Uri uri = Uri.parse(urlStr);
            String strM206867c = m206867c(urlStr);
            if (strM206867c != null && !TextUtils.isEmpty(strM206867c) && (zgiVarM209308e = resourceResponse.m209308e(urlStr, strM206867c, null, CheckPolicy.LOCAL_ONLY)) != null) {
                if (TextUtils.equals(strM206867c, resourceResponse.getBid())) {
                    fileM219625h = resourceResponse.getResourceResultDirectory();
                    if (fileM219625h == null) {
                        fileM219625h = zgiVarM209308e.m219625h();
                        if (fileM219625h != null) {
                            resourceResponse.m209312i(fileM219625h);
                        } else {
                            fileM219625h = null;
                        }
                    }
                } else {
                    fileM219625h = resourceResponse.m209311h().get(strM206867c);
                    if (fileM219625h == null) {
                        fileM219625h = zgiVarM209308e.m219625h();
                        if (fileM219625h != null) {
                            resourceResponse.m209311h().put(strM206867c, fileM219625h);
                        } else {
                            fileM219625h = null;
                        }
                    }
                }
                wkw wkwVar = INSTANCE;
                uri.getClass();
                File fileM206865a = wkwVar.m206865a(fileM219625h, uri);
                if (fileM206865a == null) {
                    fileM206865a = wkwVar.m206865a(m206868d(strM206867c), uri);
                }
                if (fileM206865a != null) {
                    String path = uri.getPath();
                    if (path != null && C15493d.m94380w(path, ".html", false, 2, null) && fileM219625h != null && (name = fileM219625h.getName()) != null && TextUtils.isDigitsOnly(name)) {
                        FepManager.INSTANCE.m17610a().m17597t(zgiVarM209308e);
                    }
                    return fileM206865a;
                }
            }
        }
        return null;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: g */
    public static final String m206871g(@Nullable String url_str, @Nullable String appendKey, @Nullable String value) {
        if (TextUtils.isEmpty(url_str)) {
            return "";
        }
        Uri uri = Uri.parse(url_str);
        uri.getClass();
        String str = uri.getPort() != -1 ? ":" + uri.getPort() : "";
        Uri.Builder builder = new Uri.Builder();
        builder.scheme(uri.getScheme()).authority(Intrinsics.m88385l(uri.getHost(), str)).path(uri.getPath());
        boolean z = false;
        for (String str2 : uri.getQueryParameterNames()) {
            if (TextUtils.equals(str2, appendKey)) {
                z = true;
            }
            builder.appendQueryParameter(str2, a6k0.INSTANCE.m96338d(uri, str2));
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
    /* JADX INFO: renamed from: h */
    public static final String m206872h(@Nullable String url) {
        Uri uri = Uri.parse(url);
        uri.getClass();
        String host = uri.getHost();
        String path = uri.getPath();
        if (path == null) {
            Intrinsics.m88386m();
        }
        if (!C15493d.m94374J(path, "/", false, 2, null)) {
            path = "/" + path;
        }
        return Intrinsics.m88385l(host, path);
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: i */
    public static final File m206873i(@Nullable String imageUrl, @Nullable x4d0 resourceResponse) {
        File fileM206870f = m206870f(imageUrl, resourceResponse);
        return fileM206870f != null ? fileM206870f : m206874j(imageUrl);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: j */
    public static final File m206874j(@Nullable String imageUrl) {
        return new File(ckw.m110402k(), oiw.m167803f(imageUrl));
    }

    @JvmStatic
    /* JADX INFO: renamed from: k */
    public static final boolean m206875k(@NotNull String url) {
        url.getClass();
        return C15493d.m94374J(url, "local://", false, 2, null);
    }
}
