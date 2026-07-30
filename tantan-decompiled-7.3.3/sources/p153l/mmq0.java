package p153l;

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
public final class mmq0 {

    /* JADX INFO: renamed from: a */
    public static final String[] f137629a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* JADX INFO: renamed from: b */
    public static final String[] f137630b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* JADX INFO: renamed from: c */
    public static final String[] f137631c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    @Nullable
    /* JADX INFO: renamed from: a */
    public static v610 m159092a(String str) throws IOException {
        try {
            return m159093b(str);
        } catch (ParserException | NumberFormatException | XmlPullParserException unused) {
            kyv.m152151i("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public static v610 m159093b(String str) throws XmlPullParserException, IOException {
        XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.next();
        if (!lmq0.m154887f(xmlPullParserNewPullParser, "x:xmpmeta")) {
            throw ParserException.createForMalformedContainer("Couldn't find xmp metadata", null);
        }
        ImmutableList<v610.C20768a> immutableListM15739of = ImmutableList.m15739of();
        long jM159096e = -9223372036854775807L;
        do {
            xmlPullParserNewPullParser.next();
            if (lmq0.m154887f(xmlPullParserNewPullParser, "rdf:Description")) {
                if (!m159095d(xmlPullParserNewPullParser)) {
                    return null;
                }
                jM159096e = m159096e(xmlPullParserNewPullParser);
                immutableListM15739of = m159094c(xmlPullParserNewPullParser);
            } else if (lmq0.m154887f(xmlPullParserNewPullParser, "Container:Directory")) {
                immutableListM15739of = m159097f(xmlPullParserNewPullParser, "Container", "Item");
            } else if (lmq0.m154887f(xmlPullParserNewPullParser, "GContainer:Directory")) {
                immutableListM15739of = m159097f(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
            }
        } while (!lmq0.m154885d(xmlPullParserNewPullParser, "x:xmpmeta"));
        if (immutableListM15739of.isEmpty()) {
            return null;
        }
        return new v610(jM159096e, immutableListM15739of);
    }

    /* JADX INFO: renamed from: c */
    public static ImmutableList<v610.C20768a> m159094c(XmlPullParser xmlPullParser) {
        for (String str : f137631c) {
            String strM154882a = lmq0.m154882a(xmlPullParser, str);
            if (strM154882a != null) {
                return ImmutableList.m15741of(new v610.C20768a(DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG, "Primary", 0L, 0L), new v610.C20768a(DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_MPEG_4, "MotionPhoto", Long.parseLong(strM154882a), 0L));
            }
        }
        return ImmutableList.m15739of();
    }

    /* JADX INFO: renamed from: d */
    public static boolean m159095d(XmlPullParser xmlPullParser) {
        for (String str : f137629a) {
            String strM154882a = lmq0.m154882a(xmlPullParser, str);
            if (strM154882a != null) {
                return Integer.parseInt(strM154882a) == 1;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: e */
    public static long m159096e(XmlPullParser xmlPullParser) {
        for (String str : f137630b) {
            String strM154882a = lmq0.m154882a(xmlPullParser, str);
            if (strM154882a != null) {
                long j = Long.parseLong(strM154882a);
                if (j == -1) {
                    return -9223372036854775807L;
                }
                return j;
            }
        }
        return -9223372036854775807L;
    }

    /* JADX INFO: renamed from: f */
    public static ImmutableList<v610.C20768a> m159097f(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        ImmutableList.C2804a c2804aBuilder = ImmutableList.builder();
        String str3 = str + ":Item";
        String str4 = str + ":Directory";
        do {
            xmlPullParser.next();
            if (lmq0.m154887f(xmlPullParser, str3)) {
                String strM154882a = lmq0.m154882a(xmlPullParser, str2 + ":Mime");
                String strM154882a2 = lmq0.m154882a(xmlPullParser, str2 + ":Semantic");
                String strM154882a3 = lmq0.m154882a(xmlPullParser, str2 + ":Length");
                String strM154882a4 = lmq0.m154882a(xmlPullParser, str2 + ":Padding");
                if (strM154882a == null || strM154882a2 == null) {
                    return ImmutableList.m15739of();
                }
                c2804aBuilder.mo15737a(new v610.C20768a(strM154882a, strM154882a2, strM154882a3 != null ? Long.parseLong(strM154882a3) : 0L, strM154882a4 != null ? Long.parseLong(strM154882a4) : 0L));
            }
        } while (!lmq0.m154885d(xmlPullParser, str4));
        return c2804aBuilder.m15756m();
    }
}
