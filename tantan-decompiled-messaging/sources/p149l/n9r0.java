package p149l;

import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzcc;
import com.google.android.gms.internal.ads.zzgaa;
import java.io.IOException;
import java.io.StringReader;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* JADX INFO: loaded from: classes6.dex */
public final class n9r0 {

    /* JADX INFO: renamed from: a */
    public static final String[] f137827a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* JADX INFO: renamed from: b */
    public static final String[] f137828b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* JADX INFO: renamed from: c */
    public static final String[] f137829c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    @Nullable
    /* JADX INFO: renamed from: a */
    public static j9r0 m158565a(String str) throws IOException {
        long j;
        try {
            XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
            xmlPullParserNewPullParser.setInput(new StringReader(str));
            xmlPullParserNewPullParser.next();
            if (!ugw0.m193588c(xmlPullParserNewPullParser, "x:xmpmeta")) {
                throw zzcc.zza("Couldn't find xmp metadata", null);
            }
            zzgaa zzgaaVarZzl = zzgaa.zzl();
            long j2 = -9223372036854775807L;
            do {
                xmlPullParserNewPullParser.next();
                if (ugw0.m193588c(xmlPullParserNewPullParser, "rdf:Description")) {
                    String[] strArr = f137827a;
                    int i = 0;
                    for (int i2 = 0; i2 < 4; i2++) {
                        String strM193586a = ugw0.m193586a(xmlPullParserNewPullParser, strArr[i2]);
                        if (strM193586a != null) {
                            if (Integer.parseInt(strM193586a) != 1) {
                                return null;
                            }
                            String[] strArr2 = f137828b;
                            int i3 = 0;
                            while (true) {
                                if (i3 < 4) {
                                    String strM193586a2 = ugw0.m193586a(xmlPullParserNewPullParser, strArr2[i3]);
                                    if (strM193586a2 != null) {
                                        j = Long.parseLong(strM193586a2);
                                        if (j != -1) {
                                            break;
                                        }
                                        break;
                                    }
                                    i3++;
                                }
                                j = -9223372036854775807L;
                                break;
                            }
                            String[] strArr3 = f137829c;
                            while (true) {
                                if (i >= 2) {
                                    zzgaaVarZzl = zzgaa.zzl();
                                    break;
                                }
                                String strM193586a3 = ugw0.m193586a(xmlPullParserNewPullParser, strArr3[i]);
                                if (strM193586a3 != null) {
                                    zzgaaVarZzl = zzgaa.zzn(new i9r0(DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG, "Primary", 0L, 0L), new i9r0(DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_MPEG_4, "MotionPhoto", Long.parseLong(strM193586a3), 0L));
                                    break;
                                }
                                i++;
                            }
                            j2 = j;
                        }
                    }
                    return null;
                }
                if (ugw0.m193588c(xmlPullParserNewPullParser, "Container:Directory")) {
                    zzgaaVarZzl = m158566b(xmlPullParserNewPullParser, "Container", "Item");
                } else if (ugw0.m193588c(xmlPullParserNewPullParser, "GContainer:Directory")) {
                    zzgaaVarZzl = m158566b(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
                }
            } while (!ugw0.m193587b(xmlPullParserNewPullParser, "x:xmpmeta"));
            if (zzgaaVarZzl.isEmpty()) {
                return null;
            }
            return new j9r0(j2, zzgaaVarZzl);
        } catch (zzcc | NumberFormatException | XmlPullParserException unused) {
            svv0.m186111f("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static zzgaa m158566b(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        ghw0 ghw0Var = new ghw0();
        do {
            String strConcat = str.concat(":Item");
            xmlPullParser.next();
            if (ugw0.m193588c(xmlPullParser, strConcat)) {
                String strConcat2 = str2.concat(":Mime");
                String strConcat3 = str2.concat(":Semantic");
                String strConcat4 = str2.concat(":Length");
                String strConcat5 = str2.concat(":Padding");
                String strM193586a = ugw0.m193586a(xmlPullParser, strConcat2);
                String strM193586a2 = ugw0.m193586a(xmlPullParser, strConcat3);
                String strM193586a3 = ugw0.m193586a(xmlPullParser, strConcat4);
                String strM193586a4 = ugw0.m193586a(xmlPullParser, strConcat5);
                if (strM193586a == null || strM193586a2 == null) {
                    return zzgaa.zzl();
                }
                ghw0Var.m126240g(new i9r0(strM193586a, strM193586a2, strM193586a3 != null ? Long.parseLong(strM193586a3) : 0L, strM193586a4 != null ? Long.parseLong(strM193586a4) : 0L));
            }
        } while (!ugw0.m193587b(xmlPullParser, str.concat(":Directory")));
        return ghw0Var.m126243j();
    }
}
