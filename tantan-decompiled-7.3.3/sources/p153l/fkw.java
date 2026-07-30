package p153l;

import com.clevertap.android.sdk.Constants;
import java.util.HashMap;
import java.util.TreeSet;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.text.C15493d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88120d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\t\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fR0\u0010\u0012\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\rj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e`\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00040\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, m88121d2 = {"Ll/fkw;", "", "<init>", "()V", "", "path", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;)Ljava/lang/String;", "md5", "e", "", "c", "(Ljava/lang/String;)Z", "Ljava/util/HashMap;", "Ll/dkw;", "Lkotlin/collections/HashMap;", "a", "Ljava/util/HashMap;", "data", "Ljava/util/TreeSet;", "b", "Ljava/util/TreeSet;", "whitePaths", "MKCore_release"}, m88122k = 1, m88123mv = {1, 4, 0})
public final class fkw {
    public static final fkw INSTANCE = new fkw();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private static final HashMap<String, dkw> data = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private static TreeSet<String> whitePaths = new TreeSet<>();

    private fkw() {
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final String m126058d(@NotNull String path) {
        path.getClass();
        if (!C15493d.m94374J(path, "/", false, 2, null)) {
            path = "/" + path;
        }
        return "https://mk.localfile.immomo.com" + path;
    }

    @JvmStatic
    @Nullable
    /* JADX INFO: renamed from: e */
    public static final String m126059e(@Nullable String md5) {
        dkw dkwVar;
        if (md5 == null || (dkwVar = data.get(md5)) == null) {
            return null;
        }
        return dkwVar.getMkFilePath();
    }

    /* JADX INFO: renamed from: c */
    public final boolean m126060c(@Nullable String path) {
        if (path != null) {
            return whitePaths.contains(path);
        }
        return false;
    }
}
