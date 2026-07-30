package p149l;

import android.net.Uri;
import androidx.annotation.VisibleForTesting;
import com.clevertap.android.sdk.Constants;
import com.google.android.exoplayer2.ParserException;
import com.google.common.collect.ImmutableList;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class qid0 {

    /* JADX INFO: renamed from: a */
    public final long f154753a;

    /* JADX INFO: renamed from: b */
    public final int f154754b;

    /* JADX INFO: renamed from: c */
    public final Uri f154755c;

    public qid0(long j, int i, Uri uri) {
        this.f154753a = j;
        this.f154754b = i;
        this.f154755c = uri;
    }

    /* JADX INFO: renamed from: a */
    public static ImmutableList<qid0> m174864a(String str, Uri uri) throws ParserException {
        ImmutableList.C2781a c2781a = new ImmutableList.C2781a();
        String[] strArrM197841a1 = vck0.m197841a1(str, Constants.SEPARATOR_COMMA);
        int length = strArrM197841a1.length;
        int i = 0;
        while (i < length) {
            String str2 = strArrM197841a1[i];
            String[] strArrM197841a2 = vck0.m197841a1(str2, com.meituan.robust.Constants.PACKNAME_END);
            int length2 = strArrM197841a2.length;
            int i2 = i;
            long j = -9223372036854775807L;
            int i3 = 0;
            Uri uriM174865b = null;
            int i4 = -1;
            while (true) {
                if (i3 < length2) {
                    String str3 = strArrM197841a2[i3];
                    try {
                        String[] strArrM197844b1 = vck0.m197844b1(str3, "=");
                        String str4 = strArrM197844b1[0];
                        String str5 = strArrM197844b1[1];
                        int iHashCode = str4.hashCode();
                        String[] strArr = strArrM197841a1;
                        if (iHashCode != 113759) {
                            if (iHashCode != 116079) {
                                if (iHashCode != 1524180539 || !str4.equals("rtptime")) {
                                    throw ParserException.createForMalformedManifest(str4, null);
                                }
                                j = Long.parseLong(str5);
                                i3++;
                                strArrM197841a1 = strArr;
                            } else {
                                if (!str4.equals("url")) {
                                    throw ParserException.createForMalformedManifest(str4, null);
                                }
                                uriM174865b = m174865b(str5, uri);
                                i3++;
                                strArrM197841a1 = strArr;
                            }
                        } else {
                            if (!str4.equals("seq")) {
                                throw ParserException.createForMalformedManifest(str4, null);
                            }
                            i4 = Integer.parseInt(str5);
                            i3++;
                            strArrM197841a1 = strArr;
                        }
                    } catch (Exception e) {
                        throw ParserException.createForMalformedManifest(str3, e);
                    }
                } else {
                    String[] strArr2 = strArrM197841a1;
                    if (uriM174865b == null || uriM174865b.getScheme() == null || (i4 == -1 && j == -9223372036854775807L)) {
                        throw ParserException.createForMalformedManifest(str2, null);
                    }
                    c2781a.mo15683a(new qid0(j, i4, uriM174865b));
                    i = i2 + 1;
                    strArrM197841a1 = strArr2;
                }
            }
        }
        return c2781a.m15702m();
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: b */
    public static Uri m174865b(String str, Uri uri) {
        p11.m167007a(((String) p11.m167011e(uri.getScheme())).equals("rtsp"));
        Uri uri2 = Uri.parse(str);
        if (uri2.isAbsolute()) {
            return uri2;
        }
        Uri uri3 = Uri.parse("rtsp://" + str);
        String string = uri.toString();
        if (((String) p11.m167011e(uri3.getHost())).equals(uri.getHost())) {
            return uri3;
        }
        return string.endsWith("/") ? evj0.m118284e(string, str) : evj0.m118284e(string.concat("/"), str);
    }
}
