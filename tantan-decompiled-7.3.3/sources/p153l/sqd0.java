package p153l;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.source.rtsp.C2007h;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class sqd0 {

    /* JADX INFO: renamed from: c */
    public static final sqd0 f170157c = new sqd0(0, -9223372036854775807L);

    /* JADX INFO: renamed from: d */
    public static final Pattern f170158d = Pattern.compile("npt[:=]([.\\d]+|now)\\s?-\\s?([.\\d]+)?");

    /* JADX INFO: renamed from: a */
    public final long f170159a;

    /* JADX INFO: renamed from: b */
    public final long f170160b;

    public sqd0(long j, long j2) {
        this.f170159a = j;
        this.f170160b = j2;
    }

    /* JADX INFO: renamed from: b */
    public static String m187513b(long j) {
        return bmk0.m105071D("npt=%.3f-", Double.valueOf(j / 1000.0d));
    }

    /* JADX INFO: renamed from: d */
    public static sqd0 m187514d(String str) throws ParserException {
        long j;
        Matcher matcher = f170158d.matcher(str);
        C2007h.m11703a(matcher.matches(), str);
        String strGroup = matcher.group(1);
        C2007h.m11703a(strGroup != null, str);
        long j2 = ((String) bmk0.m105144j(strGroup)).equals("now") ? 0L : (long) (Float.parseFloat(strGroup) * 1000.0f);
        String strGroup2 = matcher.group(2);
        if (strGroup2 != null) {
            try {
                j = (long) (Float.parseFloat(strGroup2) * 1000.0f);
                C2007h.m11703a(j >= j2, str);
            } catch (NumberFormatException e) {
                throw ParserException.createForMalformedManifest(strGroup2, e);
            }
        } else {
            j = -9223372036854775807L;
        }
        return new sqd0(j2, j);
    }

    /* JADX INFO: renamed from: a */
    public long m187515a() {
        return this.f170160b - this.f170159a;
    }

    /* JADX INFO: renamed from: c */
    public boolean m187516c() {
        return this.f170160b == -9223372036854775807L;
    }
}
