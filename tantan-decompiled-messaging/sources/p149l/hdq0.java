package p149l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.io.StringReader;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class hdq0 {

    /* JADX INFO: renamed from: a */
    public static final String[] f107288a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* JADX INFO: renamed from: b */
    public static final String[] f107289b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* JADX INFO: renamed from: c */
    public static final String[] f107290c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    @Nullable
    /* JADX INFO: renamed from: a */
    public static ly00 m130605a(String str) throws IOException {
        try {
            return m130606b(str);
        } catch (ParserException | NumberFormatException | XmlPullParserException unused) {
            jwv.m143689i("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static ly00 m130606b(String str) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (!gdq0.m125588f(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw ParserException.createForMalformedContainer("Couldn't find xmp metadata", null);
        }
        ImmutableList<ly00.C18349a> immutableListM15685of = ImmutableList.m15685of();
        long jM130609e = -9223372036854775807L;
        do {
            xmlPullParserNewPullParser.next();
            if (gdq0.m125588f(xmlPullParserNewPullParser, "rdf:Description")) {
                if (!m130608d(xmlPullParserNewPullParser)) {
                    return null;
                }
                jM130609e = m130609e(xmlPullParserNewPullParser);
                immutableListM15685of = m130607c(xmlPullParserNewPullParser);
            } else if (gdq0.m125588f(xmlPullParserNewPullParser, "Container:Directory")) {
                immutableListM15685of = m130610f(xmlPullParserNewPullParser, "Container", "Item");
            } else if (gdq0.m125588f(xmlPullParserNewPullParser, "GContainer:Directory")) {
                immutableListM15685of = m130610f(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
            }
        } while (!gdq0.m125586d(xmlPullParserNewPullParser, "x:xmpmeta"));
        if (immutableListM15685of.isEmpty()) {
            return null;
        }
        return new ly00(jM130609e, immutableListM15685of);
    }

    /* JADX INFO: renamed from: c */
    public static ImmutableList<ly00.C18349a> m130607c(XmlPullParser xmlPullParser) {
        for (String str : f107290c) {
            String strM125583a = gdq0.m125583a(xmlPullParser, str);
            if (strM125583a != null) {
                return ImmutableList.m15687of(new ly00.C18349a(DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG, "Primary", 0L, 0L), new ly00.C18349a(DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_MPEG_4, "MotionPhoto", Long.parseLong(strM125583a), 0L));
            }
        }
        return ImmutableList.m15685of();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m130608d(XmlPullParser xmlPullParser) {
        for (String str : f107288a) {
            String strM125583a = gdq0.m125583a(xmlPullParser, str);
            if (strM125583a != null) {
                return Integer.parseInt(strM125583a) == 1;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static long m130609e(XmlPullParser xmlPullParser) {
        for (String str : f107289b) {
            String strM125583a = gdq0.m125583a(xmlPullParser, str);
            if (strM125583a != null) {
                long j = Long.parseLong(strM125583a);
                if (j == -1) {
                    return -9223372036854775807L;
                }
                return j;
            }
        }
        return -9223372036854775807L;
    }

    /* JADX INFO: renamed from: f */
    public static ImmutableList<ly00.C18349a> m130610f(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        ImmutableList.C2781a c2781aBuilder = ImmutableList.builder();
        String str3 = str + ":Item";
        String str4 = str + ":Directory";
        do {
            xmlPullParser.next();
            if (gdq0.m125588f(xmlPullParser, str3)) {
                String strM125583a = gdq0.m125583a(xmlPullParser, str2 + ":Mime");
                String strM125583a2 = gdq0.m125583a(xmlPullParser, str2 + ":Semantic");
                String strM125583a3 = gdq0.m125583a(xmlPullParser, str2 + ":Length");
                String strM125583a4 = gdq0.m125583a(xmlPullParser, str2 + ":Padding");
                if (strM125583a == null || strM125583a2 == null) {
                    return ImmutableList.m15685of();
                }
                c2781aBuilder.mo15683a(new ly00.C18349a(strM125583a, strM125583a2, strM125583a3 != null ? Long.parseLong(strM125583a3) : 0L, strM125583a4 != null ? Long.parseLong(strM125583a4) : 0L));
            }
        } while (!gdq0.m125586d(xmlPullParser, str4));
        return c2781aBuilder.m15702m();
    }
}
