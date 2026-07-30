package p149l;

import android.webkit.MimeTypeMap;
import com.facebook.common.internal.ImmutableMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class l200 {

    /* JADX INFO: renamed from: a */
    public static final MimeTypeMap f125700a = MimeTypeMap.getSingleton();

    /* JADX INFO: renamed from: b */
    public static final Map<String, String> f125701b = ImmutableMap.m8149of("image/heif", "heif", "image/heic", "heic");

    /* JADX INFO: renamed from: c */
    public static final Map<String, String> f125702c = ImmutableMap.m8149of("heif", "image/heif", "heic", "image/heic");

    /* JADX INFO: renamed from: a */
    public static String m148253a(String str) {
        String str2 = f125702c.get(str);
        return str2 != null ? str2 : f125700a.getMimeTypeFromExtension(str);
    }
}
