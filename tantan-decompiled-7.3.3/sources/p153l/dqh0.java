package p153l;

import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.api.Api;
import kotlin.Metadata;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u001e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0005\u001a\u001f\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a3\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\u001a3\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u000b2\b\b\u0002\u0010\u0007\u001a\u00020\u000b2\b\b\u0002\u0010\b\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001f\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, m88121d2 = {"", "propertyName", "", "defaultValue", Constants.INAPP_DATA_TAG, "(Ljava/lang/String;Z)Z", "", "minValue", "maxValue", "a", "(Ljava/lang/String;III)I", "", "b", "(Ljava/lang/String;JJJ)J", "c", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "kotlinx-coroutines-core"}, m88122k = 5, m88123mv = {1, 9, 0}, m88125xi = 48, m88126xs = "kotlinx/coroutines/internal/SystemPropsKt")
public final /* synthetic */ class dqh0 {
    /* JADX INFO: renamed from: a */
    public static final int m117522a(@NotNull String str, int i, int i2, int i3) {
        return (int) bqh0.m105936c(str, i, i2, i3);
    }

    /* JADX INFO: renamed from: b */
    public static final long m117523b(@NotNull String str, long j, long j2, long j3) {
        String strM105937d = bqh0.m105937d(str);
        if (strM105937d == null) {
            return j;
        }
        Long lP = StringsKt.m94281p(strM105937d);
        if (lP == null) {
            throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + strM105937d + '\'').toString());
        }
        long jLongValue = lP.longValue();
        if (j2 <= jLongValue && jLongValue <= j3) {
            return jLongValue;
        }
        throw new IllegalStateException(("System property '" + str + "' should be in range " + j2 + ".." + j3 + ", but is '" + jLongValue + '\'').toString());
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final String m117524c(@NotNull String str, @NotNull String str2) {
        String strM105937d = bqh0.m105937d(str);
        return strM105937d == null ? str2 : strM105937d;
    }

    /* JADX INFO: renamed from: d */
    public static final boolean m117525d(@NotNull String str, boolean z) {
        String strM105937d = bqh0.m105937d(str);
        return strM105937d != null ? Boolean.parseBoolean(strM105937d) : z;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ int m117526e(String str, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 1;
        }
        if ((i4 & 8) != 0) {
            i3 = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        return bqh0.m105935b(str, i, i2, i3);
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ long m117527f(String str, long j, long j2, long j3, int i, Object obj) {
        if ((i & 4) != 0) {
            j2 = 1;
        }
        long j4 = j2;
        if ((i & 8) != 0) {
            j3 = Long.MAX_VALUE;
        }
        return bqh0.m105936c(str, j, j4, j3);
    }
}
