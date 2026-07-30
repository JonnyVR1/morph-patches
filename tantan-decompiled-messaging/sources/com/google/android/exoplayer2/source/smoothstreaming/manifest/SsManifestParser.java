package com.google.android.exoplayer2.source.smoothstreaming.manifest;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
import com.google.android.exoplayer2.C1871k;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.upstream.C2050d;
import com.googlecode.mp4parser.boxes.AC3SpecificBox;
import com.googlecode.mp4parser.boxes.EC3SpecificBox;
import com.tencent.youtu.sdkkitframework.common.YtVideoEncoder;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.UUID;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p149l.C21594z1;
import p149l.lb5;
import p149l.p11;
import p149l.pkq0;
import p149l.pza0;
import p149l.v5j0;
import p149l.vck0;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class SsManifestParser implements C2050d.a<C2000a> {

    /* JADX INFO: renamed from: a */
    public final XmlPullParserFactory f9016a;

    public static class MissingFieldException extends ParserException {
        public MissingFieldException(String str) {
            super("Missing required field: " + str, null, true, 4);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser$a */
    public static abstract class AbstractC1995a {

        /* JADX INFO: renamed from: a */
        public final String f9017a;

        /* JADX INFO: renamed from: b */
        public final String f9018b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public final AbstractC1995a f9019c;

        /* JADX INFO: renamed from: d */
        public final List<Pair<String, Object>> f9020d = new LinkedList();

        public AbstractC1995a(@Nullable AbstractC1995a abstractC1995a, String str, String str2) {
            this.f9019c = abstractC1995a;
            this.f9017a = str;
            this.f9018b = str2;
        }

        /* JADX INFO: renamed from: a */
        public void mo11702a(Object obj) {
        }

        /* JADX INFO: renamed from: b */
        public abstract Object mo11703b();

        @Nullable
        /* JADX INFO: renamed from: c */
        public final Object m11704c(String str) {
            for (int i = 0; i < this.f9020d.size(); i++) {
                Pair<String, Object> pair = this.f9020d.get(i);
                if (((String) pair.first).equals(str)) {
                    return pair.second;
                }
            }
            AbstractC1995a abstractC1995a = this.f9019c;
            if (abstractC1995a == null) {
                return null;
            }
            return abstractC1995a.m11704c(str);
        }

        /* JADX INFO: renamed from: d */
        public boolean mo11705d(String str) {
            return false;
        }

        /* JADX INFO: renamed from: e */
        public final AbstractC1995a m11706e(AbstractC1995a abstractC1995a, String str, String str2) {
            if ("QualityLevel".equals(str)) {
                return new C1997c(abstractC1995a, str2);
            }
            if ("Protection".equals(str)) {
                return new C1996b(abstractC1995a, str2);
            }
            if ("StreamIndex".equals(str)) {
                return new C1999e(abstractC1995a, str2);
            }
            return null;
        }

        /* JADX INFO: renamed from: f */
        public final Object m11707f(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
            boolean z = false;
            int i = 0;
            while (true) {
                int eventType = xmlPullParser.getEventType();
                if (eventType == 1) {
                    return null;
                }
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    if (this.f9018b.equals(name)) {
                        mo11715n(xmlPullParser);
                        z = true;
                    } else if (z) {
                        if (i > 0) {
                            i++;
                        } else if (mo11705d(name)) {
                            mo11715n(xmlPullParser);
                        } else {
                            AbstractC1995a abstractC1995aM11706e = m11706e(this, name, this.f9017a);
                            if (abstractC1995aM11706e == null) {
                                i = 1;
                            } else {
                                mo11702a(abstractC1995aM11706e.m11707f(xmlPullParser));
                            }
                        }
                    }
                } else if (eventType != 3) {
                    if (eventType == 4 && z && i == 0) {
                        mo11716o(xmlPullParser);
                    }
                } else if (!z) {
                    continue;
                } else if (i > 0) {
                    i--;
                } else {
                    String name2 = xmlPullParser.getName();
                    mo11709h(xmlPullParser);
                    if (!mo11705d(name2)) {
                        return mo11703b();
                    }
                }
                xmlPullParser.next();
            }
        }

        /* JADX INFO: renamed from: g */
        public final boolean m11708g(XmlPullParser xmlPullParser, String str, boolean z) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            return attributeValue != null ? Boolean.parseBoolean(attributeValue) : z;
        }

        /* JADX INFO: renamed from: h */
        public void mo11709h(XmlPullParser xmlPullParser) {
        }

        /* JADX INFO: renamed from: i */
        public final int m11710i(XmlPullParser xmlPullParser, String str, int i) throws ParserException {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                return i;
            }
            try {
                return Integer.parseInt(attributeValue);
            } catch (NumberFormatException e) {
                throw ParserException.createForMalformedManifest(null, e);
            }
        }

        /* JADX INFO: renamed from: j */
        public final long m11711j(XmlPullParser xmlPullParser, String str, long j) throws ParserException {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                return j;
            }
            try {
                return Long.parseLong(attributeValue);
            } catch (NumberFormatException e) {
                throw ParserException.createForMalformedManifest(null, e);
            }
        }

        /* JADX INFO: renamed from: k */
        public final int m11712k(XmlPullParser xmlPullParser, String str) throws ParserException {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                throw new MissingFieldException(str);
            }
            try {
                return Integer.parseInt(attributeValue);
            } catch (NumberFormatException e) {
                throw ParserException.createForMalformedManifest(null, e);
            }
        }

        /* JADX INFO: renamed from: l */
        public final long m11713l(XmlPullParser xmlPullParser, String str) throws ParserException {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue == null) {
                throw new MissingFieldException(str);
            }
            try {
                return Long.parseLong(attributeValue);
            } catch (NumberFormatException e) {
                throw ParserException.createForMalformedManifest(null, e);
            }
        }

        /* JADX INFO: renamed from: m */
        public final String m11714m(XmlPullParser xmlPullParser, String str) throws MissingFieldException {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                return attributeValue;
            }
            throw new MissingFieldException(str);
        }

        /* JADX INFO: renamed from: n */
        public abstract void mo11715n(XmlPullParser xmlPullParser) throws ParserException;

        /* JADX INFO: renamed from: o */
        public void mo11716o(XmlPullParser xmlPullParser) {
        }

        /* JADX INFO: renamed from: p */
        public final void m11717p(String str, @Nullable Object obj) {
            this.f9020d.add(Pair.create(str, obj));
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser$b */
    public static class C1996b extends AbstractC1995a {

        /* JADX INFO: renamed from: e */
        public boolean f9021e;

        /* JADX INFO: renamed from: f */
        public UUID f9022f;

        /* JADX INFO: renamed from: g */
        public byte[] f9023g;

        public C1996b(AbstractC1995a abstractC1995a, String str) {
            super(abstractC1995a, str, "Protection");
        }

        /* JADX INFO: renamed from: q */
        public static v5j0[] m11718q(byte[] bArr) {
            return new v5j0[]{new v5j0(true, null, 8, m11719r(bArr), 0, 0, null)};
        }

        /* JADX INFO: renamed from: r */
        public static byte[] m11719r(byte[] bArr) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < bArr.length; i += 2) {
                sb.append((char) bArr[i]);
            }
            String string = sb.toString();
            byte[] bArrDecode = Base64.decode(string.substring(string.indexOf("<KID>") + 5, string.indexOf("</KID>")), 0);
            m11721t(bArrDecode, 0, 3);
            m11721t(bArrDecode, 1, 2);
            m11721t(bArrDecode, 4, 5);
            m11721t(bArrDecode, 6, 7);
            return bArrDecode;
        }

        /* JADX INFO: renamed from: s */
        public static String m11720s(String str) {
            return (str.charAt(0) == '{' && str.charAt(str.length() - 1) == '}') ? str.substring(1, str.length() - 1) : str;
        }

        /* JADX INFO: renamed from: t */
        public static void m11721t(byte[] bArr, int i, int i2) {
            byte b = bArr[i];
            bArr[i] = bArr[i2];
            bArr[i2] = b;
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.AbstractC1995a
        /* JADX INFO: renamed from: b */
        public Object mo11703b() {
            UUID uuid = this.f9022f;
            return new C2000a.a(uuid, pza0.m172215a(uuid, this.f9023g), m11718q(this.f9023g));
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.AbstractC1995a
        /* JADX INFO: renamed from: d */
        public boolean mo11705d(String str) {
            return "ProtectionHeader".equals(str);
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.AbstractC1995a
        /* JADX INFO: renamed from: h */
        public void mo11709h(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.f9021e = false;
            }
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.AbstractC1995a
        /* JADX INFO: renamed from: n */
        public void mo11715n(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.f9021e = true;
                this.f9022f = UUID.fromString(m11720s(xmlPullParser.getAttributeValue(null, "SystemID")));
            }
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.AbstractC1995a
        /* JADX INFO: renamed from: o */
        public void mo11716o(XmlPullParser xmlPullParser) {
            if (this.f9021e) {
                this.f9023g = Base64.decode(xmlPullParser.getText(), 0);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser$c */
    public static class C1997c extends AbstractC1995a {

        /* JADX INFO: renamed from: e */
        public C1871k f9024e;

        public C1997c(AbstractC1995a abstractC1995a, String str) {
            super(abstractC1995a, str, "QualityLevel");
        }

        /* JADX INFO: renamed from: q */
        public static List<byte[]> m11722q(String str) {
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(str)) {
                byte[] bArrM197807K = vck0.m197807K(str);
                byte[][] bArrM149208j = lb5.m149208j(bArrM197807K);
                if (bArrM149208j == null) {
                    arrayList.add(bArrM197807K);
                    return arrayList;
                }
                Collections.addAll(arrayList, bArrM149208j);
            }
            return arrayList;
        }

        @Nullable
        /* JADX INFO: renamed from: r */
        public static String m11723r(String str) {
            if (str.equalsIgnoreCase("H264") || str.equalsIgnoreCase("X264") || str.equalsIgnoreCase("AVC1") || str.equalsIgnoreCase("DAVC")) {
                return YtVideoEncoder.MIME_TYPE;
            }
            if (str.equalsIgnoreCase("AAC") || str.equalsIgnoreCase("AACL") || str.equalsIgnoreCase("AACH") || str.equalsIgnoreCase("AACP")) {
                return "audio/mp4a-latm";
            }
            if (str.equalsIgnoreCase("TTML") || str.equalsIgnoreCase("DFXP")) {
                return "application/ttml+xml";
            }
            if (str.equalsIgnoreCase(AudioSampleEntry.TYPE8) || str.equalsIgnoreCase(AC3SpecificBox.TYPE)) {
                return "audio/ac3";
            }
            if (str.equalsIgnoreCase(AudioSampleEntry.TYPE9) || str.equalsIgnoreCase(EC3SpecificBox.TYPE)) {
                return "audio/eac3";
            }
            if (str.equalsIgnoreCase("dtsc")) {
                return "audio/vnd.dts";
            }
            if (str.equalsIgnoreCase(AudioSampleEntry.TYPE12) || str.equalsIgnoreCase(AudioSampleEntry.TYPE11)) {
                return "audio/vnd.dts.hd";
            }
            if (str.equalsIgnoreCase(AudioSampleEntry.TYPE13)) {
                return "audio/vnd.dts.hd;profile=lbr";
            }
            if (str.equalsIgnoreCase("opus")) {
                return "audio/opus";
            }
            return null;
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.AbstractC1995a
        /* JADX INFO: renamed from: b */
        public Object mo11703b() {
            return this.f9024e;
        }

        /* JADX WARN: Code duplicated, block: B:27:0x00b0  */
        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.AbstractC1995a
        /* JADX INFO: renamed from: n */
        public void mo11715n(XmlPullParser xmlPullParser) throws ParserException {
            int i;
            C1871k.b bVar = new C1871k.b();
            String strM11723r = m11723r(m11714m(xmlPullParser, "FourCC"));
            int iIntValue = ((Integer) m11704c("Type")).intValue();
            if (iIntValue == 2) {
                bVar.m10326M(DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_MPEG_4).m10353n0(m11712k(xmlPullParser, "MaxWidth")).m10332S(m11712k(xmlPullParser, "MaxHeight")).m10335V(m11722q(xmlPullParser.getAttributeValue(null, "CodecPrivateData")));
            } else if (iIntValue == 1) {
                if (strM11723r == null) {
                    strM11723r = "audio/mp4a-latm";
                }
                int iM11712k = m11712k(xmlPullParser, "Channels");
                int iM11712k2 = m11712k(xmlPullParser, "SamplingRate");
                List<byte[]> listM11722q = m11722q(xmlPullParser.getAttributeValue(null, "CodecPrivateData"));
                if (listM11722q.isEmpty() && "audio/mp4a-latm".equals(strM11723r)) {
                    listM11722q = Collections.singletonList(C21594z1.m216773a(iM11712k2, iM11712k));
                }
                bVar.m10326M(DLNAProfiles.DLNAMimeTypes.MIME_AUDIO_MPEG_4).m10323J(iM11712k).m10347h0(iM11712k2).m10335V(listM11722q);
            } else if (iIntValue == 3) {
                String str = (String) m11704c("Subtype");
                if (str == null) {
                    i = 0;
                } else if (str.equals("CAPT")) {
                    i = 64;
                } else if (str.equals("DESC")) {
                    i = 1024;
                } else {
                    i = 0;
                }
                bVar.m10326M("application/mp4").m10344e0(i);
            } else {
                bVar.m10326M("application/mp4");
            }
            this.f9024e = bVar.m10334U(xmlPullParser.getAttributeValue(null, "Index")).m10336W((String) m11704c(Constants.KEY_ENCRYPTION_NAME)).m10346g0(strM11723r).m10322I(m11712k(xmlPullParser, "Bitrate")).m10337X((String) m11704c("Language")).m10320G();
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser$d */
    public static class C1998d extends AbstractC1995a {

        /* JADX INFO: renamed from: e */
        public final List<C2000a.b> f9025e;

        /* JADX INFO: renamed from: f */
        public int f9026f;

        /* JADX INFO: renamed from: g */
        public int f9027g;

        /* JADX INFO: renamed from: h */
        public long f9028h;

        /* JADX INFO: renamed from: i */
        public long f9029i;

        /* JADX INFO: renamed from: j */
        public long f9030j;

        /* JADX INFO: renamed from: k */
        public int f9031k;

        /* JADX INFO: renamed from: l */
        public boolean f9032l;

        /* JADX INFO: renamed from: m */
        @Nullable
        public C2000a.a f9033m;

        public C1998d(AbstractC1995a abstractC1995a, String str) {
            super(abstractC1995a, str, "SmoothStreamingMedia");
            this.f9031k = -1;
            this.f9033m = null;
            this.f9025e = new LinkedList();
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.AbstractC1995a
        /* JADX INFO: renamed from: a */
        public void mo11702a(Object obj) {
            if (obj instanceof C2000a.b) {
                this.f9025e.add((C2000a.b) obj);
            } else if (obj instanceof C2000a.a) {
                p11.m167013g(this.f9033m == null);
                this.f9033m = (C2000a.a) obj;
            }
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.AbstractC1995a
        /* JADX INFO: renamed from: b */
        public Object mo11703b() {
            int size = this.f9025e.size();
            C2000a.b[] bVarArr = new C2000a.b[size];
            this.f9025e.toArray(bVarArr);
            if (this.f9033m != null) {
                C2000a.a aVar = this.f9033m;
                DrmInitData drmInitData = new DrmInitData(new DrmInitData.SchemeData(aVar.f9056a, DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_MPEG_4, aVar.f9057b));
                for (int i = 0; i < size; i++) {
                    C2000a.b bVar = bVarArr[i];
                    int i2 = bVar.f9059a;
                    if (i2 == 2 || i2 == 1) {
                        C1871k[] c1871kArr = bVar.f9068j;
                        for (int i3 = 0; i3 < c1871kArr.length; i3++) {
                            c1871kArr[i3] = c1871kArr[i3].m10282b().m10328O(drmInitData).m10320G();
                        }
                    }
                }
            }
            return new C2000a(this.f9026f, this.f9027g, this.f9028h, this.f9029i, this.f9030j, this.f9031k, this.f9032l, this.f9033m, bVarArr);
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.AbstractC1995a
        /* JADX INFO: renamed from: n */
        public void mo11715n(XmlPullParser xmlPullParser) throws ParserException {
            this.f9026f = m11712k(xmlPullParser, "MajorVersion");
            this.f9027g = m11712k(xmlPullParser, "MinorVersion");
            this.f9028h = m11711j(xmlPullParser, "TimeScale", 10000000L);
            this.f9029i = m11713l(xmlPullParser, "Duration");
            this.f9030j = m11711j(xmlPullParser, "DVRWindowLength", 0L);
            this.f9031k = m11710i(xmlPullParser, "LookaheadCount", -1);
            this.f9032l = m11708g(xmlPullParser, "IsLive", false);
            m11717p("TimeScale", Long.valueOf(this.f9028h));
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser$e */
    public static class C1999e extends AbstractC1995a {

        /* JADX INFO: renamed from: e */
        public final String f9034e;

        /* JADX INFO: renamed from: f */
        public final List<C1871k> f9035f;

        /* JADX INFO: renamed from: g */
        public int f9036g;

        /* JADX INFO: renamed from: h */
        public String f9037h;

        /* JADX INFO: renamed from: i */
        public long f9038i;

        /* JADX INFO: renamed from: j */
        public String f9039j;

        /* JADX INFO: renamed from: k */
        public String f9040k;

        /* JADX INFO: renamed from: l */
        public int f9041l;

        /* JADX INFO: renamed from: m */
        public int f9042m;

        /* JADX INFO: renamed from: n */
        public int f9043n;

        /* JADX INFO: renamed from: o */
        public int f9044o;

        /* JADX INFO: renamed from: p */
        public String f9045p;

        /* JADX INFO: renamed from: q */
        public ArrayList<Long> f9046q;

        /* JADX INFO: renamed from: r */
        public long f9047r;

        public C1999e(AbstractC1995a abstractC1995a, String str) {
            super(abstractC1995a, str, "StreamIndex");
            this.f9034e = str;
            this.f9035f = new LinkedList();
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.AbstractC1995a
        /* JADX INFO: renamed from: a */
        public void mo11702a(Object obj) {
            if (obj instanceof C1871k) {
                this.f9035f.add((C1871k) obj);
            }
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.AbstractC1995a
        /* JADX INFO: renamed from: b */
        public Object mo11703b() {
            C1871k[] c1871kArr = new C1871k[this.f9035f.size()];
            this.f9035f.toArray(c1871kArr);
            return new C2000a.b(this.f9034e, this.f9040k, this.f9036g, this.f9037h, this.f9038i, this.f9039j, this.f9041l, this.f9042m, this.f9043n, this.f9044o, this.f9045p, c1871kArr, this.f9046q, this.f9047r);
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.AbstractC1995a
        /* JADX INFO: renamed from: d */
        public boolean mo11705d(String str) {
            return "c".equals(str);
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.AbstractC1995a
        /* JADX INFO: renamed from: n */
        public void mo11715n(XmlPullParser xmlPullParser) throws ParserException {
            if ("c".equals(xmlPullParser.getName())) {
                m11725r(xmlPullParser);
            } else {
                m11724q(xmlPullParser);
            }
        }

        /* JADX INFO: renamed from: q */
        public final void m11724q(XmlPullParser xmlPullParser) throws ParserException {
            int iM11726s = m11726s(xmlPullParser);
            this.f9036g = iM11726s;
            m11717p("Type", Integer.valueOf(iM11726s));
            if (this.f9036g == 3) {
                this.f9037h = m11714m(xmlPullParser, "Subtype");
            } else {
                this.f9037h = xmlPullParser.getAttributeValue(null, "Subtype");
            }
            m11717p("Subtype", this.f9037h);
            String attributeValue = xmlPullParser.getAttributeValue(null, Constants.KEY_ENCRYPTION_NAME);
            this.f9039j = attributeValue;
            m11717p(Constants.KEY_ENCRYPTION_NAME, attributeValue);
            this.f9040k = m11714m(xmlPullParser, "Url");
            this.f9041l = m11710i(xmlPullParser, "MaxWidth", -1);
            this.f9042m = m11710i(xmlPullParser, "MaxHeight", -1);
            this.f9043n = m11710i(xmlPullParser, "DisplayWidth", -1);
            this.f9044o = m11710i(xmlPullParser, "DisplayHeight", -1);
            String attributeValue2 = xmlPullParser.getAttributeValue(null, "Language");
            this.f9045p = attributeValue2;
            m11717p("Language", attributeValue2);
            long jM11710i = m11710i(xmlPullParser, "TimeScale", -1);
            this.f9038i = jM11710i;
            if (jM11710i == -1) {
                this.f9038i = ((Long) m11704c("TimeScale")).longValue();
            }
            this.f9046q = new ArrayList<>();
        }

        /* JADX INFO: renamed from: r */
        public final void m11725r(XmlPullParser xmlPullParser) throws ParserException {
            int size = this.f9046q.size();
            long jM11711j = m11711j(xmlPullParser, Constants.KEY_T, -9223372036854775807L);
            int i = 1;
            if (jM11711j == -9223372036854775807L) {
                if (size == 0) {
                    jM11711j = 0;
                } else {
                    if (this.f9047r == -1) {
                        throw ParserException.createForMalformedManifest("Unable to infer start time", null);
                    }
                    jM11711j = this.f9047r + this.f9046q.get(size - 1).longValue();
                }
            }
            this.f9046q.add(Long.valueOf(jM11711j));
            this.f9047r = m11711j(xmlPullParser, Constants.INAPP_DATA_TAG, -9223372036854775807L);
            long jM11711j2 = m11711j(xmlPullParser, "r", 1L);
            if (jM11711j2 > 1 && this.f9047r == -9223372036854775807L) {
                throw ParserException.createForMalformedManifest("Repeated chunk with unspecified duration", null);
            }
            while (true) {
                long j = i;
                if (j >= jM11711j2) {
                    return;
                }
                this.f9046q.add(Long.valueOf((this.f9047r * j) + jM11711j));
                i++;
            }
        }

        /* JADX INFO: renamed from: s */
        public final int m11726s(XmlPullParser xmlPullParser) throws ParserException {
            String attributeValue = xmlPullParser.getAttributeValue(null, "Type");
            if (attributeValue == null) {
                throw new MissingFieldException("Type");
            }
            if ("audio".equalsIgnoreCase(attributeValue)) {
                return 1;
            }
            if ("video".equalsIgnoreCase(attributeValue)) {
                return 2;
            }
            if ("text".equalsIgnoreCase(attributeValue)) {
                return 3;
            }
            throw ParserException.createForMalformedManifest("Invalid key value[" + attributeValue + Constants.AES_SUFFIX, null);
        }
    }

    public SsManifestParser() {
        try {
            this.f9016a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e) {
            pkq0.m170054a("Couldn't create XmlPullParserFactory instance", e);
            throw null;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.C2050d.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C2000a mo11019a(Uri uri, InputStream inputStream) throws IOException {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f9016a.newPullParser();
            xmlPullParserNewPullParser.setInput(inputStream, null);
            return (C2000a) new C1998d(null, uri.toString()).m11707f(xmlPullParserNewPullParser);
        } catch (XmlPullParserException e) {
            throw ParserException.createForMalformedManifest(null, e);
        }
    }
}
