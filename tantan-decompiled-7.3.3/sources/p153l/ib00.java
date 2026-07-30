package p153l;

import android.webkit.MimeTypeMap;
import com.facebook.common.internal.ImmutableMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class ib00 {

    /* JADX INFO: renamed from: a */
    public static final MimeTypeMap f113640a = MimeTypeMap.getSingleton();

    /* JADX INFO: renamed from: b */
    public static final Map<String, String> f113641b = ImmutableMap.m8203of("image/heif", "heif", "image/heic", "heic");

    /* JADX INFO: renamed from: c */
    public static final Map<String, String> f113642c = ImmutableMap.m8203of("heif", "image/heif", "heic", "image/heic");

    /* JADX INFO: renamed from: a */
    public static String m139233a(String str) {
        String str2 = f113642c.get(str);
        return str2 != null ? str2 : f113640a.getMimeTypeFromExtension(str);
    }
}
