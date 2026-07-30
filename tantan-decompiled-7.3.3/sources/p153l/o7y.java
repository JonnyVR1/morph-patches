package p153l;

import androidx.annotation.NonNull;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.text.C15493d;
import kotlin.text.StringsKt;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\n\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\t\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\f\u001a\u0004\u0018\u00010\u00042\b\b\u0001\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\u000bR \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u0010"}, m88121d2 = {"Ll/o7y;", "", "<init>", "()V", "", "mimeType", "", "c", "(Ljava/lang/String;)Z", "path", "b", "(Ljava/lang/String;)Ljava/lang/String;", "a", "", "Ljava/util/Map;", "ADDITIONAL_ALLOWED_MIME_TYPES", "fbcore_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class o7y {

    @NotNull
    public static final o7y INSTANCE = new o7y();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @JvmField
    @NotNull
    public static final Map<String, String> ADDITIONAL_ALLOWED_MIME_TYPES = MapsKt.mapOf(TuplesKt.m88129a("mkv", DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_MATROSKA), TuplesKt.m88129a("glb", "model/gltf-binary"));

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: b */
    public static final String m166387b(@NonNull @NotNull String path) {
        path.getClass();
        String strM166389a = INSTANCE.m166389a(path);
        if (strM166389a == null) {
            return null;
        }
        Locale locale = Locale.US;
        locale.getClass();
        String lowerCase = strM166389a.toLowerCase(locale);
        lowerCase.getClass();
        if (lowerCase == null) {
            return null;
        }
        String strM139233a = ib00.m139233a(lowerCase);
        return strM139233a == null ? ADDITIONAL_ALLOWED_MIME_TYPES.get(lowerCase) : strM139233a;
    }

    @JvmStatic
    /* JADX INFO: renamed from: c */
    public static final boolean m166388c(@Nullable String mimeType) {
        if (mimeType != null) {
            return C15493d.m94374J(mimeType, "video/", false, 2, null);
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final String m166389a(@NonNull String path) {
        int iI0 = StringsKt.m94333i0(path, '.', 0, false, 6, null);
        if (iI0 < 0 || iI0 == path.length() - 1) {
            return null;
        }
        return path.substring(iI0 + 1);
    }
}
