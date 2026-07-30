package p153l;

import android.net.Uri;
import com.facebook.LoggingBehavior;
import com.facebook.internal.C1680e;
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
@Metadata(m88120d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\t\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000e\u001a\u00020\r2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00072\b\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0011R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0014¨\u0006\u0016"}, m88121d2 = {"Ll/s4k0;", "", "<init>", "()V", "Ll/zii;", "b", "()Ll/zii;", "Landroid/net/Uri;", "uri", "c", "(Landroid/net/Uri;)Landroid/net/Uri;", "fromUri", "toUri", "", "a", "(Landroid/net/Uri;Landroid/net/Uri;)V", "", "Ljava/lang/String;", "tag", "redirectContentTag", "Ll/zii;", "urlRedirectFileLruCache", "facebook-core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class s4k0 {

    @NotNull
    public static final s4k0 INSTANCE = new s4k0();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final String tag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final String redirectContentTag;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public static zii urlRedirectFileLruCache;

    static {
        String strMo88360s = Reflection.m88396b(s4k0.class).mo88360s();
        if (strMo88360s == null) {
            strMo88360s = "UrlRedirectCache";
        }
        tag = strMo88360s;
        redirectContentTag = strMo88360s + "_Redirect";
    }

    @JvmStatic
    /* JADX INFO: renamed from: a */
    public static final void m184564a(@Nullable Uri fromUri, @Nullable Uri toUri) {
        if (fromUri == null || toUri == null) {
            return;
        }
        OutputStream outputStreamM219896i = null;
        try {
            zii ziiVarM184565b = m184565b();
            String string = fromUri.toString();
            string.getClass();
            outputStreamM219896i = ziiVarM184565b.m219896i(string, redirectContentTag);
            String string2 = toUri.toString();
            string2.getClass();
            byte[] bytes = string2.getBytes(Charsets.UTF_8);
            bytes.getClass();
            outputStreamM219896i.write(bytes);
        } catch (IOException e) {
            rzv.INSTANCE.m183847a(LoggingBehavior.CACHE, 4, tag, "IOException when accessing cache: " + e.getMessage());
        } finally {
            C1680e.m8897j(outputStreamM219896i);
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: b */
    public static final synchronized zii m184565b() throws IOException {
        zii ziiVar;
        try {
            ziiVar = urlRedirectFileLruCache;
            if (ziiVar == null) {
                ziiVar = new zii(tag, new zii.C21821e());
            }
            urlRedirectFileLruCache = ziiVar;
        } catch (Throwable th) {
            throw th;
        }
        return ziiVar;
    }

    /* JADX WARN: Not initialized variable reg: 5, insn: 0x007c: MOVE (r0 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]) (LINE:125), block:B:29:0x007c */
    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: c */
    public static final Uri m184566c(@Nullable Uri uri) throws Throwable {
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
                zii ziiVarM184565b = m184565b();
                InputStream inputStreamM219894f = ziiVarM184565b.m219894f(string, redirectContentTag);
                inputStreamReader = null;
                boolean z = false;
                while (inputStreamM219894f != null) {
                    try {
                        InputStreamReader inputStreamReader4 = new InputStreamReader(inputStreamM219894f);
                        try {
                            char[] cArr = new char[128];
                            StringBuilder sb = new StringBuilder();
                            for (int i = inputStreamReader4.read(cArr, 0, 128); i > 0; i = inputStreamReader4.read(cArr, 0, 128)) {
                                sb.append(cArr, 0, i);
                            }
                            C1680e.m8897j(inputStreamReader4);
                            String string2 = sb.toString();
                            if (hashSet.contains(string2)) {
                                if (Intrinsics.m88377d(string2, string)) {
                                    inputStreamReader = inputStreamReader4;
                                    z = true;
                                    break;
                                }
                                rzv.INSTANCE.m183847a(LoggingBehavior.CACHE, 6, tag, "A loop detected in UrlRedirectCache");
                                C1680e.m8897j(inputStreamReader4);
                                return null;
                            }
                            hashSet.add(string2);
                            inputStreamM219894f = ziiVarM184565b.m219894f(string2, redirectContentTag);
                            string = string2;
                            inputStreamReader = inputStreamReader4;
                            z = true;
                        } catch (IOException e) {
                            e = e;
                            inputStreamReader = inputStreamReader4;
                            rzv.INSTANCE.m183847a(LoggingBehavior.CACHE, 4, tag, "IOException when accessing cache: " + e.getMessage());
                        } catch (Throwable th) {
                            th = th;
                            inputStreamReader3 = inputStreamReader4;
                            C1680e.m8897j(inputStreamReader3);
                            throw th;
                        }
                    } catch (IOException e2) {
                        e = e2;
                    }
                }
                if (z) {
                    Uri uri2 = Uri.parse(string);
                    C1680e.m8897j(inputStreamReader);
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
        C1680e.m8897j(inputStreamReader);
        return null;
    }
}
