package p149l;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class uax0 {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ int f175647j = 0;

    /* JADX INFO: renamed from: a */
    public final Uri f175648a;

    /* JADX INFO: renamed from: b */
    public final int f175649b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final byte[] f175650c;

    /* JADX INFO: renamed from: d */
    public final Map f175651d;

    /* JADX INFO: renamed from: e */
    @Deprecated
    public final long f175652e;

    /* JADX INFO: renamed from: f */
    public final long f175653f;

    /* JADX INFO: renamed from: g */
    public final long f175654g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public final String f175655h;

    /* JADX INFO: renamed from: i */
    public final int f175656i;

    static {
        wjs0.m203497b("media3.datasource");
    }

    public uax0(Uri uri, long j, int i, @Nullable byte[] bArr, Map map, long j2, long j3, @Nullable String str, int i2, @Nullable Object obj) {
        long j4 = j + j2;
        boolean z = false;
        f5v0.m119533d(j4 >= 0);
        f5v0.m119533d(j2 >= 0);
        if (j3 > 0) {
            z = true;
        } else if (j3 == -1) {
            j3 = -1;
            z = true;
        }
        f5v0.m119533d(z);
        this.f175648a = uri;
        this.f175649b = 1;
        this.f175650c = null;
        this.f175651d = Collections.unmodifiableMap(new HashMap(map));
        this.f175653f = j2;
        this.f175652e = j4;
        this.f175654g = j3;
        this.f175655h = null;
        this.f175656i = i2;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m192805a(int i) {
        return (this.f175656i & i) == i;
    }

    public final String toString() {
        return "DataSpec[GET " + String.valueOf(this.f175648a) + ", " + this.f175653f + ", " + this.f175654g + ", null, " + this.f175656i + Constants.AES_SUFFIX;
    }

    public uax0(Uri uri) {
        this(uri, 0L, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 0, null);
    }

    @Deprecated
    public uax0(Uri uri, @Nullable byte[] bArr, long j, long j2, long j3, @Nullable String str, int i) {
        this(uri, j - j2, 1, null, Collections.EMPTY_MAP, j2, j3, null, i, null);
    }
}
