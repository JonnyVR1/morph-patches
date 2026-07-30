package p153l;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m88120d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\n\u0010\bJ!\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m88121d2 = {"Ll/znx;", "", "<init>", "()V", "", "count", "", Constants.INAPP_DATA_TAG, "(J)Ljava/lang/String;", "c", "e", "", Constants.PRIORITY_MAX, "a", "(JI)Ljava/lang/String;", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class znx {

    @NotNull
    public static final znx INSTANCE = new znx();

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final String m220678a(long count, int max) {
        if (count <= 0) {
            return "0";
        }
        String strM96566a = a9g0.m96566a(count, max);
        strM96566a.getClass();
        return strM96566a;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ String m220679b(long j, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 99;
        }
        return m220678a(j, i);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: c */
    public static final String m220680c(long count) {
        if (count <= 0) {
            return "--";
        }
        return count > 99 ? "99+" : String.valueOf(count);
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: d */
    public static final String m220681d(long count) {
        if (count <= 0) {
            return "--";
        }
        if (count < 1000) {
            return String.valueOf(count);
        }
        return a9g0.m96568c(count / 1000.0d) + "k";
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: e */
    public static final String m220682e(long count) {
        if (count <= 0) {
            return "--";
        }
        if (count >= 999) {
            return "999+";
        }
        return count > 99 ? "99+" : String.valueOf(count);
    }
}
