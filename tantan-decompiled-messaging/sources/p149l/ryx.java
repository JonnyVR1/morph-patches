package p149l;

import androidx.annotation.NonNull;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.text.C15386d;
import kotlin.text.StringsKt;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\f\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u000bR \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u0010"}, m87232d2 = {"Ll/ryx;", "", "<init>", "()V", "", "mimeType", "", "c", "(Ljava/lang/String;)Z", "path", "b", "(Ljava/lang/String;)Ljava/lang/String;", "a", "", "Ljava/util/Map;", "ADDITIONAL_ALLOWED_MIME_TYPES", "fbcore_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class ryx {

    @NotNull
    public static final ryx INSTANCE = new ryx();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public static final Map<String, String> ADDITIONAL_ALLOWED_MIME_TYPES = MapsKt.mapOf(TuplesKt.m87240a("mkv", DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_MATROSKA), TuplesKt.m87240a("glb", "model/gltf-binary"));

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: b */
    public static final String m181715b(@NonNull @NotNull String path) {
        path.getClass();
        String strM181717a = INSTANCE.m181717a(path);
        if (strM181717a == null) {
            return null;
        }
        Locale locale = Locale.US;
        locale.getClass();
        String lowerCase = strM181717a.toLowerCase(locale);
        lowerCase.getClass();
        if (lowerCase == null) {
            return null;
        }
        String strM148253a = l200.m148253a(lowerCase);
        return strM148253a == null ? ADDITIONAL_ALLOWED_MIME_TYPES.get(lowerCase) : strM148253a;
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final boolean m181716c(@Nullable String mimeType) {
        if (mimeType != null) {
            return C15386d.m93483J(mimeType, "video/", false, 2, null);
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final String m181717a(@NonNull String path) {
        int iI0 = StringsKt.m93442i0(path, '.', 0, false, 6, null);
        if (iI0 < 0 || iI0 == path.length() - 1) {
            return null;
        }
        return path.substring(iI0 + 1);
    }
}
