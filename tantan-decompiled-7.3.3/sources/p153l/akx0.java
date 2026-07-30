package p153l;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class akx0 {

    /* JADX INFO: renamed from: j */
    public static final /* synthetic */ int f72046j = 0;

    /* JADX INFO: renamed from: a */
    public final Uri f72047a;

    /* JADX INFO: renamed from: b */
    public final int f72048b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public final byte[] f72049c;

    /* JADX INFO: renamed from: d */
    public final Map f72050d;

    /* JADX INFO: renamed from: e */
    @Deprecated
    public final long f72051e;

    /* JADX INFO: renamed from: f */
    public final long f72052f;

    /* JADX INFO: renamed from: g */
    public final long f72053g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public final String f72054h;

    /* JADX INFO: renamed from: i */
    public final int f72055i;

    static {
        cts0.m112551b("media3.datasource");
    }

    public akx0(Uri uri, long j, int i, @Nullable byte[] bArr, Map map, long j2, long j3, @Nullable String str, int i2, @Nullable Object obj) {
        long j4 = j + j2;
        boolean z = false;
        lev0.m153956d(j4 >= 0);
        lev0.m153956d(j2 >= 0);
        if (j3 > 0) {
            z = true;
        } else if (j3 == -1) {
            j3 = -1;
            z = true;
        }
        lev0.m153956d(z);
        this.f72047a = uri;
        this.f72048b = 1;
        this.f72049c = null;
        this.f72050d = Collections.unmodifiableMap(new HashMap(map));
        this.f72052f = j2;
        this.f72051e = j4;
        this.f72053g = j3;
        this.f72054h = null;
        this.f72055i = i2;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m98632a(int i) {
        return (this.f72055i & i) == i;
    }

    public final String toString() {
        return "DataSpec[GET " + String.valueOf(this.f72047a) + ", " + this.f72052f + ", " + this.f72053g + ", null, " + this.f72055i + Constants.AES_SUFFIX;
    }

    public akx0(Uri uri) {
        this(uri, 0L, 1, null, Collections.EMPTY_MAP, 0L, -1L, null, 0, null);
    }

    @Deprecated
    public akx0(Uri uri, @Nullable byte[] bArr, long j, long j2, long j3, @Nullable String str, int i) {
        this(uri, j - j2, 1, null, Collections.EMPTY_MAP, j2, j3, null, i, null);
    }
}
