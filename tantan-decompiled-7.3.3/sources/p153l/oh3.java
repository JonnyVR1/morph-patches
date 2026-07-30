package p153l;

import android.os.Build;
import android.os.ext.SdkExtensions;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import com.clevertap.android.sdk.Constants;
import com.google.android.exoplayer2.PlaybackException;
import java.util.Locale;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\f\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u000e¨\u0006\u0014"}, m88121d2 = {"Ll/oh3;", "", "<init>", "()V", "", "codename", "buildCodename", "", "a", "(Ljava/lang/String;Ljava/lang/String;)Z", "b", "()Z", "c", "", "I", "R_EXTENSION_INT", "S_EXTENSION_INT", "T_EXTENSION_INT", Constants.INAPP_DATA_TAG, "AD_SERVICES_EXTENSION_INT", "core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
public final class oh3 {

    @NotNull
    public static final oh3 INSTANCE = new oh3();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @ChecksSdkIntAtLeast(extension = 30)
    @JvmField
    public static final int R_EXTENSION_INT;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @ChecksSdkIntAtLeast(extension = 31)
    @JvmField
    public static final int S_EXTENSION_INT;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @ChecksSdkIntAtLeast(extension = 33)
    @JvmField
    public static final int T_EXTENSION_INT;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @ChecksSdkIntAtLeast(extension = PlaybackException.CUSTOM_ERROR_CODE_BASE)
    @JvmField
    public static final int AD_SERVICES_EXTENSION_INT;

    /* JADX INFO: renamed from: l.oh3$a */
    @RequiresApi(30)
    @Metadata(m88120d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m88121d2 = {"Ll/oh3$a;", "", "<init>", "()V", "", "extension", "a", "(I)I", "core_release"}, m88122k = 1, m88123mv = {1, 8, 0}, m88125xi = 48)
    public static final class C19132a {

        @NotNull
        public static final C19132a INSTANCE = new C19132a();

        @DoNotInline
        /* JADX INFO: renamed from: a */
        public final int m167688a(int extension) {
            return SdkExtensions.getExtensionVersion(extension);
        }
    }

    static {
        int i = Build.VERSION.SDK_INT;
        R_EXTENSION_INT = i >= 30 ? C19132a.INSTANCE.m167688a(30) : 0;
        S_EXTENSION_INT = i >= 30 ? C19132a.INSTANCE.m167688a(31) : 0;
        T_EXTENSION_INT = i >= 30 ? C19132a.INSTANCE.m167688a(33) : 0;
        AD_SERVICES_EXTENSION_INT = i >= 30 ? C19132a.INSTANCE.m167688a(PlaybackException.CUSTOM_ERROR_CODE_BASE) : 0;
    }

    @JvmStatic
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    @VisibleForTesting
    /* JADX INFO: renamed from: a */
    public static final boolean m167685a(@NotNull String codename, @NotNull String buildCodename) {
        codename.getClass();
        buildCodename.getClass();
        if (Intrinsics.m88377d("REL", buildCodename)) {
            return false;
        }
        Locale locale = Locale.ROOT;
        String upperCase = buildCodename.toUpperCase(locale);
        upperCase.getClass();
        String upperCase2 = codename.toUpperCase(locale);
        upperCase2.getClass();
        return upperCase.compareTo(upperCase2) >= 0;
    }

    @Deprecated
    @JvmStatic
    @ChecksSdkIntAtLeast(api = 34, codename = "UpsideDownCake")
    /* JADX INFO: renamed from: b */
    public static final boolean m167686b() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            return true;
        }
        if (i < 33) {
            return false;
        }
        String str = Build.VERSION.CODENAME;
        str.getClass();
        return m167685a("UpsideDownCake", str);
    }

    @JvmStatic
    @ChecksSdkIntAtLeast(codename = "VanillaIceCream")
    /* JADX INFO: renamed from: c */
    public static final boolean m167687c() {
        if (Build.VERSION.SDK_INT < 34) {
            return false;
        }
        String str = Build.VERSION.CODENAME;
        str.getClass();
        return m167685a("VanillaIceCream", str);
    }
}
