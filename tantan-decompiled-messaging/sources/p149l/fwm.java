package p149l;

import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.Constants;
import com.facebook.C1577c;
import com.facebook.GraphRequest;
import com.facebook.internal.C1657e;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.C15386d;
import kotlin.text.Charsets;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0007J\u001b\u0010\b\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\b\u0010\u0007J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\r2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\r2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0007¢\u0006\u0004\b\u0016\u0010\u0015J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0007¢\u0006\u0004\b\u0017\u0010\u0015J#\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0019\u001a\u00020\rH\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ#\u0010\u001f\u001a\u00020\u001e2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010!\u001a\u00020\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b!\u0010\"J+\u0010(\u001a\u00020\u001e2\b\u0010#\u001a\u0004\u0018\u00010\u00062\u0006\u0010%\u001a\u00020$2\b\u0010'\u001a\u0004\u0018\u00010&H\u0007¢\u0006\u0004\b(\u0010)J\u0011\u0010*\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020\r2\u0006\u0010-\u001a\u00020,H\u0007¢\u0006\u0004\b.\u0010/¨\u00060"}, m87232d2 = {"Ll/fwm;", "", "<init>", "()V", "", "e", "", "(Ljava/lang/Throwable;)Ljava/lang/String;", "h", "Ljava/lang/Thread;", "thread", "g", "(Ljava/lang/Thread;)Ljava/lang/String;", "", "j", "(Ljava/lang/Throwable;)Z", "k", "(Ljava/lang/Thread;)Z", "", "Ljava/io/File;", BLiveStormDanmakuGiftResourceType.f44444l, "()[Ljava/io/File;", "m", "n", "filename", "deleteOnException", "Lorg/json/JSONObject;", "o", "(Ljava/lang/String;Z)Lorg/json/JSONObject;", "content", "", "q", "(Ljava/lang/String;Ljava/lang/String;)V", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;)Z", Constants.KEY_KEY, "Lorg/json/JSONArray;", "reports", "Lcom/facebook/GraphRequest$b;", "callback", "p", "(Ljava/lang/String;Lorg/json/JSONArray;Lcom/facebook/GraphRequest$b;)V", "f", "()Ljava/io/File;", "Ljava/lang/StackTraceElement;", "element", RXScreenCaptureService.KEY_INDEX, "(Ljava/lang/StackTraceElement;)Z", "facebook-core_release"}, m87233k = 1, m87234mv = {1, 8, 0}, m87236xi = 48)
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@SourceDebugExtension
public final class fwm {

    @NotNull
    public static final fwm INSTANCE = new fwm();

    /* JADX INFO: renamed from: a */
    public static boolean m123530a(File file, String str) {
        str.getClass();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return new Regex(String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"analysis_log_"}, 1))).matches(str);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m123531b(File file, String str) {
        str.getClass();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return new Regex(String.format("^(%s|%s|%s)[0-9]+.json$", Arrays.copyOf(new Object[]{"crash_log_", "shield_log_", "thread_check_log_"}, 3))).matches(str);
    }

    /* JADX INFO: renamed from: c */
    public static boolean m123532c(File file, String str) {
        str.getClass();
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return new Regex(String.format("^%s[0-9]+.json$", Arrays.copyOf(new Object[]{"anr_log_"}, 1))).matches(str);
    }

    @JvmStatic
    /* JADX INFO: renamed from: d */
    public static final boolean m123533d(@Nullable String filename) {
        File fileM123535f = m123535f();
        if (fileM123535f == null || filename == null) {
            return false;
        }
        return new File(fileM123535f, filename).delete();
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: e */
    public static final String m123534e(@Nullable Throwable e) {
        if (e == null) {
            return null;
        }
        return e.getCause() == null ? e.toString() : String.valueOf(e.getCause());
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: f */
    public static final File m123535f() {
        File file = new File(C1577c.m8047l().getCacheDir(), "instrument");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: g */
    public static final String m123536g(@NotNull Thread thread) {
        thread.getClass();
        StackTraceElement[] stackTrace = thread.getStackTrace();
        JSONArray jSONArray = new JSONArray();
        stackTrace.getClass();
        for (StackTraceElement stackTraceElement : stackTrace) {
            jSONArray.put(stackTraceElement.toString());
        }
        return jSONArray.toString();
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: h */
    public static final String m123537h(@Nullable Throwable e) {
        Throwable th = null;
        if (e == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        while (e != null && e != th) {
            StackTraceElement[] stackTrace = e.getStackTrace();
            stackTrace.getClass();
            for (StackTraceElement stackTraceElement : stackTrace) {
                jSONArray.put(stackTraceElement.toString());
            }
            th = e;
            e = e.getCause();
        }
        return jSONArray.toString();
    }

    @JvmStatic
    /* JADX INFO: renamed from: i */
    public static final boolean m123538i(@NotNull StackTraceElement element) {
        element.getClass();
        String className = element.getClassName();
        className.getClass();
        if (C15386d.m93483J(className, "com.facebook", false, 2, null)) {
            return true;
        }
        String className2 = element.getClassName();
        className2.getClass();
        return C15386d.m93483J(className2, "com.meta", false, 2, null);
    }

    @JvmStatic
    /* JADX INFO: renamed from: j */
    public static final boolean m123539j(@Nullable Throwable e) {
        if (e == null) {
            return false;
        }
        Throwable th = null;
        while (e != null && e != th) {
            StackTraceElement[] stackTrace = e.getStackTrace();
            stackTrace.getClass();
            for (StackTraceElement stackTraceElement : stackTrace) {
                stackTraceElement.getClass();
                if (m123538i(stackTraceElement)) {
                    return true;
                }
            }
            th = e;
            e = e.getCause();
        }
        return false;
    }

    @JvmStatic
    /* JADX INFO: renamed from: k */
    public static final boolean m123540k(@Nullable Thread thread) {
        StackTraceElement[] stackTrace;
        if (thread != null && (stackTrace = thread.getStackTrace()) != null) {
            for (StackTraceElement stackTraceElement : stackTrace) {
                stackTraceElement.getClass();
                if (m123538i(stackTraceElement)) {
                    String className = stackTraceElement.getClassName();
                    className.getClass();
                    if (!C15386d.m93483J(className, "com.facebook.appevents.codeless", false, 2, null)) {
                        String className2 = stackTraceElement.getClassName();
                        className2.getClass();
                        if (!C15386d.m93483J(className2, "com.facebook.appevents.suggestedevents", false, 2, null)) {
                            return true;
                        }
                    }
                    String methodName = stackTraceElement.getMethodName();
                    methodName.getClass();
                    if (C15386d.m93483J(methodName, "onClick", false, 2, null)) {
                        continue;
                    } else {
                        String methodName2 = stackTraceElement.getMethodName();
                        methodName2.getClass();
                        if (C15386d.m93483J(methodName2, "onItemClick", false, 2, null)) {
                            continue;
                        } else {
                            String methodName3 = stackTraceElement.getMethodName();
                            methodName3.getClass();
                            if (!C15386d.m93483J(methodName3, "onTouch", false, 2, null)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: l */
    public static final File[] m123541l() {
        File fileM123535f = m123535f();
        if (fileM123535f == null) {
            return new File[0];
        }
        File[] fileArrListFiles = fileM123535f.listFiles(new FilenameFilter() { // from class: l.dwm
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return fwm.m123532c(file, str);
            }
        });
        return fileArrListFiles == null ? new File[0] : fileArrListFiles;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: m */
    public static final File[] m123542m() {
        File fileM123535f = m123535f();
        if (fileM123535f == null) {
            return new File[0];
        }
        File[] fileArrListFiles = fileM123535f.listFiles(new FilenameFilter() { // from class: l.ewm
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return fwm.m123530a(file, str);
            }
        });
        return fileArrListFiles == null ? new File[0] : fileArrListFiles;
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: n */
    public static final File[] m123543n() {
        File fileM123535f = m123535f();
        if (fileM123535f == null) {
            return new File[0];
        }
        File[] fileArrListFiles = fileM123535f.listFiles(new FilenameFilter() { // from class: l.cwm
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return fwm.m123531b(file, str);
            }
        });
        return fileArrListFiles == null ? new File[0] : fileArrListFiles;
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: o */
    public static final JSONObject m123544o(@Nullable String filename, boolean deleteOnException) {
        File fileM123535f = m123535f();
        if (fileM123535f != null && filename != null) {
            try {
                return new JSONObject(C1657e.m8860s0(new FileInputStream(new File(fileM123535f, filename))));
            } catch (Exception unused) {
                if (deleteOnException) {
                    m123533d(filename);
                }
            }
        }
        return null;
    }

    @JvmStatic
    /* JADX INFO: renamed from: p */
    public static final void m123545p(@Nullable String key, @NotNull JSONArray reports, @Nullable GraphRequest.InterfaceC1516b callback) {
        reports.getClass();
        if (reports.length() == 0) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(key, reports.toString());
            JSONObject jSONObjectM8810D = C1657e.m8810D();
            if (jSONObjectM8810D != null) {
                Iterator<String> itKeys = jSONObjectM8810D.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    jSONObject.put(next, jSONObjectM8810D.get(next));
                }
            }
            GraphRequest.Companion companion = GraphRequest.INSTANCE;
            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
            companion.m7587z(null, String.format("%s/instruments", Arrays.copyOf(new Object[]{C1577c.m8048m()}, 1)), jSONObject, callback).m7526k();
        } catch (JSONException unused) {
        }
    }

    @JvmStatic
    /* JADX INFO: renamed from: q */
    public static final void m123546q(@Nullable String filename, @Nullable String content) {
        File fileM123535f = m123535f();
        if (fileM123535f == null || filename == null || content == null) {
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(fileM123535f, filename));
            byte[] bytes = content.getBytes(Charsets.UTF_8);
            bytes.getClass();
            fileOutputStream.write(bytes);
            fileOutputStream.close();
        } catch (Exception unused) {
        }
    }
}
