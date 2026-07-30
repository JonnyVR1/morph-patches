package p149l;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.source.rtsp.C1984h;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class pid0 {

    /* JADX INFO: renamed from: c */
    public static final pid0 f149541c = new pid0(0, -9223372036854775807L);

    /* JADX INFO: renamed from: d */
    public static final Pattern f149542d = Pattern.compile("npt[:=]([.\\d]+|now)\\s?-\\s?([.\\d]+)?");

    /* JADX INFO: renamed from: a */
    public final long f149543a;

    /* JADX INFO: renamed from: b */
    public final long f149544b;

    public pid0(long j, long j2) {
        this.f149543a = j;
        this.f149544b = j2;
    }

    /* JADX INFO: renamed from: b */
    public static String m169592b(long j) {
        return vck0.m197793D("npt=%.3f-", Double.valueOf(j / 1000.0d));
    }

    /* JADX INFO: renamed from: d */
    public static pid0 m169593d(String str) throws ParserException {
        long j;
        Matcher matcher = f149542d.matcher(str);
        C1984h.m11649a(matcher.matches(), str);
        String strGroup = matcher.group(1);
        C1984h.m11649a(strGroup != null, str);
        long j2 = ((String) vck0.m197866j(strGroup)).equals("now") ? 0L : (long) (Float.parseFloat(strGroup) * 1000.0f);
        String strGroup2 = matcher.group(2);
        if (strGroup2 != null) {
            try {
                j = (long) (Float.parseFloat(strGroup2) * 1000.0f);
                C1984h.m11649a(j >= j2, str);
            } catch (NumberFormatException e) {
                throw ParserException.createForMalformedManifest(strGroup2, e);
            }
        } else {
            j = -9223372036854775807L;
        }
        return new pid0(j2, j);
    }

    /* JADX INFO: renamed from: a */
    public long m169594a() {
        return this.f149544b - this.f149543a;
    }

    /* JADX INFO: renamed from: c */
    public boolean m169595c() {
        return this.f149544b == -9223372036854775807L;
    }
}
