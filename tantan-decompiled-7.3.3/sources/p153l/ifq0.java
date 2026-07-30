package p153l;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.drm.DrmSession;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class ifq0 {
    /* JADX INFO: renamed from: a */
    public static long m139742a(Map<String, String> map, String str) {
        if (map == null) {
            return -9223372036854775807L;
        }
        try {
            String str2 = map.get(str);
            if (str2 != null) {
                return Long.parseLong(str2);
            }
            return -9223372036854775807L;
        } catch (NumberFormatException unused) {
            return -9223372036854775807L;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static Pair<Long, Long> m139743b(DrmSession drmSession) {
        Map<String, String> mapMo9884f = drmSession.mo9884f();
        if (mapMo9884f == null) {
            return null;
        }
        return new Pair<>(Long.valueOf(m139742a(mapMo9884f, "LicenseDurationRemaining")), Long.valueOf(m139742a(mapMo9884f, "PlaybackDurationRemaining")));
    }
}
