package p153l;

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
public final class tir0 {

    /* JADX INFO: renamed from: a */
    public static final String[] f174499a = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};

    /* JADX INFO: renamed from: b */
    public static final String[] f174500b = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};

    /* JADX INFO: renamed from: c */
    public static final String[] f174501c = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    @Nullable
    /* JADX INFO: renamed from: a */
    public static pir0 m191349a(String str) throws IOException {
        long j;
        try {
            XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
            xmlPullParserNewPullParser.setInput(new StringReader(str));
            xmlPullParserNewPullParser.next();
            if (!aqw0.m99560c(xmlPullParserNewPullParser, "x:xmpmeta")) {
                throw zzcc.zza("Couldn't find xmp metadata", null);
            }
            zzgaa zzgaaVarZzl = zzgaa.zzl();
            long j2 = -9223372036854775807L;
            do {
                xmlPullParserNewPullParser.next();
                if (aqw0.m99560c(xmlPullParserNewPullParser, "rdf:Description")) {
                    String[] strArr = f174499a;
                    int i = 0;
                    for (int i2 = 0; i2 < 4; i2++) {
                        String strM99558a = aqw0.m99558a(xmlPullParserNewPullParser, strArr[i2]);
                        if (strM99558a != null) {
                            if (Integer.parseInt(strM99558a) != 1) {
                                return null;
                            }
                            String[] strArr2 = f174500b;
                            int i3 = 0;
                            while (true) {
                                if (i3 < 4) {
                                    String strM99558a2 = aqw0.m99558a(xmlPullParserNewPullParser, strArr2[i3]);
                                    if (strM99558a2 != null) {
                                        j = Long.parseLong(strM99558a2);
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
                            String[] strArr3 = f174501c;
                            while (true) {
                                if (i >= 2) {
                                    zzgaaVarZzl = zzgaa.zzl();
                                    break;
                                }
                                String strM99558a3 = aqw0.m99558a(xmlPullParserNewPullParser, strArr3[i]);
                                if (strM99558a3 != null) {
                                    zzgaaVarZzl = zzgaa.zzn(new oir0(DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG, "Primary", 0L, 0L), new oir0(DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_MPEG_4, "MotionPhoto", Long.parseLong(strM99558a3), 0L));
                                    break;
                                }
                                i++;
                            }
                            j2 = j;
                        }
                    }
                    return null;
                }
                if (aqw0.m99560c(xmlPullParserNewPullParser, "Container:Directory")) {
                    zzgaaVarZzl = m191350b(xmlPullParserNewPullParser, "Container", "Item");
                } else if (aqw0.m99560c(xmlPullParserNewPullParser, "GContainer:Directory")) {
                    zzgaaVarZzl = m191350b(xmlPullParserNewPullParser, "GContainer", "GContainerItem");
                }
            } while (!aqw0.m99559b(xmlPullParserNewPullParser, "x:xmpmeta"));
            if (zzgaaVarZzl.isEmpty()) {
                return null;
            }
            return new pir0(j2, zzgaaVarZzl);
        } catch (zzcc | NumberFormatException | XmlPullParserException unused) {
            y4w0.m214278f("MotionPhotoXmpParser", "Ignoring unexpected XMP metadata");
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public static zzgaa m191350b(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        mqw0 mqw0Var = new mqw0();
        do {
            String strConcat = str.concat(":Item");
            xmlPullParser.next();
            if (aqw0.m99560c(xmlPullParser, strConcat)) {
                String strConcat2 = str2.concat(":Mime");
                String strConcat3 = str2.concat(":Semantic");
                String strConcat4 = str2.concat(":Length");
                String strConcat5 = str2.concat(":Padding");
                String strM99558a = aqw0.m99558a(xmlPullParser, strConcat2);
                String strM99558a2 = aqw0.m99558a(xmlPullParser, strConcat3);
                String strM99558a3 = aqw0.m99558a(xmlPullParser, strConcat4);
                String strM99558a4 = aqw0.m99558a(xmlPullParser, strConcat5);
                if (strM99558a == null || strM99558a2 == null) {
                    return zzgaa.zzl();
                }
                mqw0Var.m159613g(new oir0(strM99558a, strM99558a2, strM99558a3 != null ? Long.parseLong(strM99558a3) : 0L, strM99558a4 != null ? Long.parseLong(strM99558a4) : 0L));
            }
        } while (!aqw0.m99559b(xmlPullParser, str.concat(":Directory")));
        return mqw0Var.m159616j();
    }
}
