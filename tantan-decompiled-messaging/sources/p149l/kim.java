package p149l;

import android.net.Uri;
import com.clevertap.android.sdk.Constants;
import com.facebook.LoggingBehavior;
import com.facebook.internal.C1657e;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C15386d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u001f\u0010\u0018\u001a\n \u0014*\u0004\u0018\u00010\u00130\u00138\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u00048\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010\u0019¨\u0006\u001b"}, m87232d2 = {"Ll/kim;", "", "<init>", "()V", "Ll/cgi;", "a", "()Ll/cgi;", "Landroid/net/Uri;", "uri", "Ljava/io/InputStream;", "b", "(Landroid/net/Uri;)Ljava/io/InputStream;", "Ljava/net/HttpURLConnection;", "connection", "c", "(Ljava/net/HttpURLConnection;)Ljava/io/InputStream;", "", Constants.INAPP_DATA_TAG, "(Landroid/net/Uri;)Z", "", "kotlin.jvm.PlatformType", "Ljava/lang/String;", "getTAG", "()Ljava/lang/String;", "TAG", "Ll/cgi;", "imageCache", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class kim {

    @NotNull
    public static final kim INSTANCE = new kim();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public static final String TAG = kim.class.getSimpleName();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public static cgi imageCache;

    /* JADX INFO: renamed from: l.kim$a */
    @Metadata(m87231d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u001b\b\u0000\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m87232d2 = {"Ll/kim$a;", "Ljava/io/BufferedInputStream;", "Ljava/io/InputStream;", "stream", "Ljava/net/HttpURLConnection;", "connection", "<init>", "(Ljava/io/InputStream;Ljava/net/HttpURLConnection;)V", "", "close", "()V", "a", "Ljava/net/HttpURLConnection;", "getConnection", "()Ljava/net/HttpURLConnection;", "setConnection", "(Ljava/net/HttpURLConnection;)V", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
    public static final class C18023a extends BufferedInputStream {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        public HttpURLConnection connection;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C18023a(@Nullable InputStream inputStream, @NotNull HttpURLConnection httpURLConnection) {
            super(inputStream, 8192);
            httpURLConnection.getClass();
            this.connection = httpURLConnection;
        }

        @Override // java.io.BufferedInputStream, java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            super.close();
            C1657e.m8858r(this.connection);
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final synchronized cgi m146094a() throws IOException {
        cgi cgiVar;
        try {
            if (imageCache == null) {
                String str = TAG;
                str.getClass();
                imageCache = new cgi(str, new cgi.C16133e());
            }
            cgiVar = imageCache;
            if (cgiVar == null) {
                Intrinsics.m87502r("imageCache");
                cgiVar = null;
            }
        } catch (Throwable th) {
            throw th;
        }
        return cgiVar;
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: b */
    public static final InputStream m146095b(@Nullable Uri uri) {
        if (uri != null && INSTANCE.m146097d(uri)) {
            try {
                cgi cgiVarM146094a = m146094a();
                String string = uri.toString();
                string.getClass();
                return cgi.m106716g(cgiVarM146094a, string, null, 2, null);
            } catch (IOException e) {
                uxv.Companion companion = uxv.INSTANCE;
                LoggingBehavior loggingBehavior = LoggingBehavior.CACHE;
                String str = TAG;
                str.getClass();
                companion.m196206a(loggingBehavior, 5, str, e.toString());
            }
        }
        return null;
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: c */
    public static final InputStream m146096c(@NotNull HttpURLConnection connection) throws IOException {
        connection.getClass();
        if (connection.getResponseCode() != 200) {
            return null;
        }
        Uri uri = Uri.parse(connection.getURL().toString());
        InputStream inputStream = connection.getInputStream();
        try {
            if (INSTANCE.m146097d(uri)) {
                cgi cgiVarM146094a = m146094a();
                String string = uri.toString();
                string.getClass();
                return cgiVarM146094a.m106719h(string, new C18023a(inputStream, connection));
            }
        } catch (IOException unused) {
        }
        return inputStream;
    }

    /* JADX INFO: renamed from: d */
    public final boolean m146097d(Uri uri) {
        String host;
        return (uri == null || (host = uri.getHost()) == null || (!Intrinsics.m87488d(host, "fbcdn.net") && !C15386d.m93489w(host, ".fbcdn.net", false, 2, null) && (!C15386d.m93483J(host, "fbcdn", false, 2, null) || !C15386d.m93489w(host, ".akamaihd.net", false, 2, null)))) ? false : true;
    }
}
