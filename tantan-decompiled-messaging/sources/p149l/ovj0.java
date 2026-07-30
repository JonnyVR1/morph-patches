package p149l;

import android.net.Uri;
import com.facebook.LoggingBehavior;
import com.facebook.internal.C1657e;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000e\u001a\u00020\r2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0014¨\u0006\u0016"}, m87232d2 = {"Ll/ovj0;", "", "<init>", "()V", "Ll/cgi;", "b", "()Ll/cgi;", "Landroid/net/Uri;", "uri", "c", "(Landroid/net/Uri;)Landroid/net/Uri;", "fromUri", "toUri", "", "a", "(Landroid/net/Uri;Landroid/net/Uri;)V", "", "Ljava/lang/String;", "tag", "redirectContentTag", "Ll/cgi;", "urlRedirectFileLruCache", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
public final class ovj0 {

    @NotNull
    public static final ovj0 INSTANCE = new ovj0();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final String tag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final String redirectContentTag;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public static cgi urlRedirectFileLruCache;

    static {
        String strMo87471s = Reflection.m87507b(ovj0.class).mo87471s();
        if (strMo87471s == null) {
            strMo87471s = "UrlRedirectCache";
        }
        tag = strMo87471s;
        redirectContentTag = strMo87471s + "_Redirect";
    }

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m166197a(@Nullable Uri fromUri, @Nullable Uri toUri) {
        if (fromUri == null || toUri == null) {
            return;
        }
        OutputStream outputStreamM106720i = null;
        try {
            cgi cgiVarM166198b = m166198b();
            String string = fromUri.toString();
            string.getClass();
            outputStreamM106720i = cgiVarM166198b.m106720i(string, redirectContentTag);
            String string2 = toUri.toString();
            string2.getClass();
            byte[] bytes = string2.getBytes(Charsets.UTF_8);
            bytes.getClass();
            outputStreamM106720i.write(bytes);
        } catch (IOException e) {
            uxv.INSTANCE.m196206a(LoggingBehavior.CACHE, 4, tag, "IOException when accessing cache: " + e.getMessage());
        } finally {
            C1657e.m8843j(outputStreamM106720i);
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final synchronized cgi m166198b() throws IOException {
        cgi cgiVar;
        try {
            cgiVar = urlRedirectFileLruCache;
            if (cgiVar == null) {
                cgiVar = new cgi(tag, new cgi.C16133e());
            }
            urlRedirectFileLruCache = cgiVar;
        } catch (Throwable th) {
            throw th;
        }
        return cgiVar;
    }

    /* JADX WARN: Not initialized variable reg: 5, insn: 0x007c: MOVE (r0 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]) (LINE:125), block:B:29:0x007c */
    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: c */
    public static final Uri m166199c(@Nullable Uri uri) throws Throwable {
        InputStreamReader inputStreamReader;
        InputStreamReader inputStreamReader2;
        InputStreamReader inputStreamReader3 = null;
        if (uri == null) {
            return null;
        }
        String string = uri.toString();
        string.getClass();
        HashSet hashSet = new HashSet();
        hashSet.add(string);
        try {
            try {
                cgi cgiVarM166198b = m166198b();
                InputStream inputStreamM106718f = cgiVarM166198b.m106718f(string, redirectContentTag);
                inputStreamReader = null;
                boolean z = false;
                while (inputStreamM106718f != null) {
                    try {
                        InputStreamReader inputStreamReader4 = new InputStreamReader(inputStreamM106718f);
                        try {
                            char[] cArr = new char[128];
                            StringBuilder sb = new StringBuilder();
                            for (int i = inputStreamReader4.read(cArr, 0, 128); i > 0; i = inputStreamReader4.read(cArr, 0, 128)) {
                                sb.append(cArr, 0, i);
                            }
                            C1657e.m8843j(inputStreamReader4);
                            String string2 = sb.toString();
                            if (hashSet.contains(string2)) {
                                if (Intrinsics.m87488d(string2, string)) {
                                    inputStreamReader = inputStreamReader4;
                                    z = true;
                                    break;
                                }
                                uxv.INSTANCE.m196206a(LoggingBehavior.CACHE, 6, tag, "A loop detected in UrlRedirectCache");
                                C1657e.m8843j(inputStreamReader4);
                                return null;
                            }
                            hashSet.add(string2);
                            inputStreamM106718f = cgiVarM166198b.m106718f(string2, redirectContentTag);
                            string = string2;
                            inputStreamReader = inputStreamReader4;
                            z = true;
                        } catch (IOException e) {
                            e = e;
                            inputStreamReader = inputStreamReader4;
                            uxv.INSTANCE.m196206a(LoggingBehavior.CACHE, 4, tag, "IOException when accessing cache: " + e.getMessage());
                        } catch (Throwable th) {
                            th = th;
                            inputStreamReader3 = inputStreamReader4;
                            C1657e.m8843j(inputStreamReader3);
                            throw th;
                        }
                    } catch (IOException e2) {
                        e = e2;
                    }
                }
                if (z) {
                    Uri uri2 = Uri.parse(string);
                    C1657e.m8843j(inputStreamReader);
                    return uri2;
                }
            } catch (Throwable th2) {
                th = th2;
                inputStreamReader3 = inputStreamReader2;
            }
        } catch (IOException e3) {
            e = e3;
            inputStreamReader = null;
        } catch (Throwable th3) {
            th = th3;
        }
        C1657e.m8843j(inputStreamReader);
        return null;
    }
}
