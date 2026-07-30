package com.google.android.exoplayer2.source.smoothstreaming.manifest;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.coremedia.iso.boxes.sampleentry.AudioSampleEntry;
import com.google.android.exoplayer2.C1894k;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.drm.DrmInitData;
import com.google.android.exoplayer2.upstream.C2073d;
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
import p153l.C21738z1;
import p153l.bmk0;
import p153l.lc5;
import p153l.t7b0;
import p153l.vtq0;
import p153l.w11;
import p153l.zej0;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class SsManifestParser implements C2073d.a<C2023a> {

    /* JADX INFO: renamed from: a */
    public final XmlPullParserFactory f9053a;

    public static class MissingFieldException extends ParserException {
        public MissingFieldException(String str) {
            super("Missing required field: " + str, null, true, 4);
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser$a */
    public static abstract class AbstractC2018a {

        /* JADX INFO: renamed from: a */
        public final String f9054a;

        /* JADX INFO: renamed from: b */
        public final String f9055b;

        /* JADX INFO: renamed from: c */
        @Nullable
        public final AbstractC2018a f9056c;

        /* JADX INFO: renamed from: d */
        public final List<Pair<String, Object>> f9057d = new LinkedList();

        public AbstractC2018a(@Nullable AbstractC2018a abstractC2018a, String str, String str2) {
            this.f9056c = abstractC2018a;
            this.f9054a = str;
            this.f9055b = str2;
        }

        /* JADX INFO: renamed from: a */
        public void mo11756a(Object obj) {
        }

        /* JADX INFO: renamed from: b */
        public abstract Object mo11757b();

        @Nullable
        /* JADX INFO: renamed from: c */
        public final Object m11758c(String str) {
            for (int i = 0; i < this.f9057d.size(); i++) {
                Pair<String, Object> pair = this.f9057d.get(i);
                if (((String) pair.first).equals(str)) {
                    return pair.second;
                }
            }
            AbstractC2018a abstractC2018a = this.f9056c;
            if (abstractC2018a == null) {
                return null;
            }
            return abstractC2018a.m11758c(str);
        }

        /* JADX INFO: renamed from: d */
        public boolean mo11759d(String str) {
            return false;
        }

        /* JADX INFO: renamed from: e */
        public final AbstractC2018a m11760e(AbstractC2018a abstractC2018a, String str, String str2) {
            if ("QualityLevel".equals(str)) {
                return new C2020c(abstractC2018a, str2);
            }
            if ("Protection".equals(str)) {
                return new C2019b(abstractC2018a, str2);
            }
            if ("StreamIndex".equals(str)) {
                return new C2022e(abstractC2018a, str2);
            }
            return null;
        }

        /* JADX INFO: renamed from: f */
        public final Object m11761f(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
            boolean z = false;
            int i = 0;
            while (true) {
                int eventType = xmlPullParser.getEventType();
                if (eventType == 1) {
                    return null;
                }
                if (eventType == 2) {
                    String name = xmlPullParser.getName();
                    if (this.f9055b.equals(name)) {
                        mo11769n(xmlPullParser);
                        z = true;
                    } else if (z) {
                        if (i > 0) {
                            i++;
                        } else if (mo11759d(name)) {
                            mo11769n(xmlPullParser);
                        } else {
                            AbstractC2018a abstractC2018aM11760e = m11760e(this, name, this.f9054a);
                            if (abstractC2018aM11760e == null) {
                                i = 1;
                            } else {
                                mo11756a(abstractC2018aM11760e.m11761f(xmlPullParser));
                            }
                        }
                    }
                } else if (eventType != 3) {
                    if (eventType == 4 && z && i == 0) {
                        mo11770o(xmlPullParser);
                    }
                } else if (!z) {
                    continue;
                } else if (i > 0) {
                    i--;
                } else {
                    String name2 = xmlPullParser.getName();
                    mo11763h(xmlPullParser);
                    if (!mo11759d(name2)) {
                        return mo11757b();
                    }
                }
                xmlPullParser.next();
            }
        }

        /* JADX INFO: renamed from: g */
        public final boolean m11762g(XmlPullParser xmlPullParser, String str, boolean z) {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            return attributeValue != null ? Boolean.parseBoolean(attributeValue) : z;
        }

        /* JADX INFO: renamed from: h */
        public void mo11763h(XmlPullParser xmlPullParser) {
        }

        /* JADX INFO: renamed from: i */
        public final int m11764i(XmlPullParser xmlPullParser, String str, int i) throws ParserException {
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
        public final long m11765j(XmlPullParser xmlPullParser, String str, long j) throws ParserException {
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
        public final int m11766k(XmlPullParser xmlPullParser, String str) throws ParserException {
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
        public final long m11767l(XmlPullParser xmlPullParser, String str) throws ParserException {
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
        public final String m11768m(XmlPullParser xmlPullParser, String str) throws MissingFieldException {
            String attributeValue = xmlPullParser.getAttributeValue(null, str);
            if (attributeValue != null) {
                return attributeValue;
            }
            throw new MissingFieldException(str);
        }

        /* JADX INFO: renamed from: n */
        public abstract void mo11769n(XmlPullParser xmlPullParser) throws ParserException;

        /* JADX INFO: renamed from: o */
        public void mo11770o(XmlPullParser xmlPullParser) {
        }

        /* JADX INFO: renamed from: p */
        public final void m11771p(String str, @Nullable Object obj) {
            this.f9057d.add(Pair.create(str, obj));
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser$b */
    public static class C2019b extends AbstractC2018a {

        /* JADX INFO: renamed from: e */
        public boolean f9058e;

        /* JADX INFO: renamed from: f */
        public UUID f9059f;

        /* JADX INFO: renamed from: g */
        public byte[] f9060g;

        public C2019b(AbstractC2018a abstractC2018a, String str) {
            super(abstractC2018a, str, "Protection");
        }

        /* JADX INFO: renamed from: q */
        public static zej0[] m11772q(byte[] bArr) {
            return new zej0[]{new zej0(true, null, 8, m11773r(bArr), 0, 0, null)};
        }

        /* JADX INFO: renamed from: r */
        public static byte[] m11773r(byte[] bArr) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < bArr.length; i += 2) {
                sb.append((char) bArr[i]);
            }
            String string = sb.toString();
            byte[] bArrDecode = Base64.decode(string.substring(string.indexOf("<KID>") + 5, string.indexOf("</KID>")), 0);
            m11775t(bArrDecode, 0, 3);
            m11775t(bArrDecode, 1, 2);
            m11775t(bArrDecode, 4, 5);
            m11775t(bArrDecode, 6, 7);
            return bArrDecode;
        }

        /* JADX INFO: renamed from: s */
        public static String m11774s(String str) {
            return (str.charAt(0) == '{' && str.charAt(str.length() - 1) == '}') ? str.substring(1, str.length() - 1) : str;
        }

        /* JADX INFO: renamed from: t */
        public static void m11775t(byte[] bArr, int i, int i2) {
            byte b = bArr[i];
            bArr[i] = bArr[i2];
            bArr[i2] = b;
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.AbstractC2018a
        /* JADX INFO: renamed from: b */
        public Object mo11757b() {
            UUID uuid = this.f9059f;
            return new C2023a.a(uuid, t7b0.m189554a(uuid, this.f9060g), m11772q(this.f9060g));
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.AbstractC2018a
        /* JADX INFO: renamed from: d */
        public boolean mo11759d(String str) {
            return "ProtectionHeader".equals(str);
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.AbstractC2018a
        /* JADX INFO: renamed from: h */
        public void mo11763h(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.f9058e = false;
            }
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.AbstractC2018a
        /* JADX INFO: renamed from: n */
        public void mo11769n(XmlPullParser xmlPullParser) {
            if ("ProtectionHeader".equals(xmlPullParser.getName())) {
                this.f9058e = true;
                this.f9059f = UUID.fromString(m11774s(xmlPullParser.getAttributeValue(null, "SystemID")));
            }
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.AbstractC2018a
        /* JADX INFO: renamed from: o */
        public void mo11770o(XmlPullParser xmlPullParser) {
            if (this.f9058e) {
                this.f9060g = Base64.decode(xmlPullParser.getText(), 0);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser$c */
    public static class C2020c extends AbstractC2018a {

        /* JADX INFO: renamed from: e */
        public C1894k f9061e;

        public C2020c(AbstractC2018a abstractC2018a, String str) {
            super(abstractC2018a, str, "QualityLevel");
        }

        /* JADX INFO: renamed from: q */
        public static List<byte[]> m11776q(String str) {
            ArrayList arrayList = new ArrayList();
            if (!TextUtils.isEmpty(str)) {
                byte[] bArrM105085K = bmk0.m105085K(str);
                byte[][] bArrM153630j = lc5.m153630j(bArrM105085K);
                if (bArrM153630j == null) {
                    arrayList.add(bArrM105085K);
                    return arrayList;
                }
                Collections.addAll(arrayList, bArrM153630j);
            }
            return arrayList;
        }

        @Nullable
        /* JADX INFO: renamed from: r */
        public static String m11777r(String str) {
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

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.AbstractC2018a
        /* JADX INFO: renamed from: b */
        public Object mo11757b() {
            return this.f9061e;
        }

        /* JADX WARN: Code duplicated, block: B:27:0x00b0  */
        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.AbstractC2018a
        /* JADX INFO: renamed from: n */
        public void mo11769n(XmlPullParser xmlPullParser) throws ParserException {
            int i;
            C1894k.b bVar = new C1894k.b();
            String strM11777r = m11777r(m11768m(xmlPullParser, "FourCC"));
            int iIntValue = ((Integer) m11758c("Type")).intValue();
            if (iIntValue == 2) {
                bVar.m10380M(DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_MPEG_4).m10407n0(m11766k(xmlPullParser, "MaxWidth")).m10386S(m11766k(xmlPullParser, "MaxHeight")).m10389V(m11776q(xmlPullParser.getAttributeValue(null, "CodecPrivateData")));
            } else if (iIntValue == 1) {
                if (strM11777r == null) {
                    strM11777r = "audio/mp4a-latm";
                }
                int iM11766k = m11766k(xmlPullParser, "Channels");
                int iM11766k2 = m11766k(xmlPullParser, "SamplingRate");
                List<byte[]> listM11776q = m11776q(xmlPullParser.getAttributeValue(null, "CodecPrivateData"));
                if (listM11776q.isEmpty() && "audio/mp4a-latm".equals(strM11777r)) {
                    listM11776q = Collections.singletonList(C21738z1.m218266a(iM11766k2, iM11766k));
                }
                bVar.m10380M(DLNAProfiles.DLNAMimeTypes.MIME_AUDIO_MPEG_4).m10377J(iM11766k).m10401h0(iM11766k2).m10389V(listM11776q);
            } else if (iIntValue == 3) {
                String str = (String) m11758c("Subtype");
                if (str == null) {
                    i = 0;
                } else if (str.equals("CAPT")) {
                    i = 64;
                } else if (str.equals("DESC")) {
                    i = 1024;
                } else {
                    i = 0;
                }
                bVar.m10380M("application/mp4").m10398e0(i);
            } else {
                bVar.m10380M("application/mp4");
            }
            this.f9061e = bVar.m10388U(xmlPullParser.getAttributeValue(null, "Index")).m10390W((String) m11758c(Constants.KEY_ENCRYPTION_NAME)).m10400g0(strM11777r).m10376I(m11766k(xmlPullParser, "Bitrate")).m10391X((String) m11758c("Language")).m10374G();
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser$d */
    public static class C2021d extends AbstractC2018a {

        /* JADX INFO: renamed from: e */
        public final List<C2023a.b> f9062e;

        /* JADX INFO: renamed from: f */
        public int f9063f;

        /* JADX INFO: renamed from: g */
        public int f9064g;

        /* JADX INFO: renamed from: h */
        public long f9065h;

        /* JADX INFO: renamed from: i */
        public long f9066i;

        /* JADX INFO: renamed from: j */
        public long f9067j;

        /* JADX INFO: renamed from: k */
        public int f9068k;

        /* JADX INFO: renamed from: l */
        public boolean f9069l;

        /* JADX INFO: renamed from: m */
        @Nullable
        public C2023a.a f9070m;

        public C2021d(AbstractC2018a abstractC2018a, String str) {
            super(abstractC2018a, str, "SmoothStreamingMedia");
            this.f9068k = -1;
            this.f9070m = null;
            this.f9062e = new LinkedList();
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.AbstractC2018a
        /* JADX INFO: renamed from: a */
        public void mo11756a(Object obj) {
            if (obj instanceof C2023a.b) {
                this.f9062e.add((C2023a.b) obj);
            } else if (obj instanceof C2023a.a) {
                w11.m204371g(this.f9070m == null);
                this.f9070m = (C2023a.a) obj;
            }
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.AbstractC2018a
        /* JADX INFO: renamed from: b */
        public Object mo11757b() {
            int size = this.f9062e.size();
            C2023a.b[] bVarArr = new C2023a.b[size];
            this.f9062e.toArray(bVarArr);
            if (this.f9070m != null) {
                C2023a.a aVar = this.f9070m;
                DrmInitData drmInitData = new DrmInitData(new DrmInitData.SchemeData(aVar.f9093a, DLNAProfiles.DLNAMimeTypes.MIME_VIDEO_MPEG_4, aVar.f9094b));
                for (int i = 0; i < size; i++) {
                    C2023a.b bVar = bVarArr[i];
                    int i2 = bVar.f9096a;
                    if (i2 == 2 || i2 == 1) {
                        C1894k[] c1894kArr = bVar.f9105j;
                        for (int i3 = 0; i3 < c1894kArr.length; i3++) {
                            c1894kArr[i3] = c1894kArr[i3].m10336b().m10382O(drmInitData).m10374G();
                        }
                    }
                }
            }
            return new C2023a(this.f9063f, this.f9064g, this.f9065h, this.f9066i, this.f9067j, this.f9068k, this.f9069l, this.f9070m, bVarArr);
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.AbstractC2018a
        /* JADX INFO: renamed from: n */
        public void mo11769n(XmlPullParser xmlPullParser) throws ParserException {
            this.f9063f = m11766k(xmlPullParser, "MajorVersion");
            this.f9064g = m11766k(xmlPullParser, "MinorVersion");
            this.f9065h = m11765j(xmlPullParser, "TimeScale", 10000000L);
            this.f9066i = m11767l(xmlPullParser, "Duration");
            this.f9067j = m11765j(xmlPullParser, "DVRWindowLength", 0L);
            this.f9068k = m11764i(xmlPullParser, "LookaheadCount", -1);
            this.f9069l = m11762g(xmlPullParser, "IsLive", false);
            m11771p("TimeScale", Long.valueOf(this.f9065h));
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser$e */
    public static class C2022e extends AbstractC2018a {

        /* JADX INFO: renamed from: e */
        public final String f9071e;

        /* JADX INFO: renamed from: f */
        public final List<C1894k> f9072f;

        /* JADX INFO: renamed from: g */
        public int f9073g;

        /* JADX INFO: renamed from: h */
        public String f9074h;

        /* JADX INFO: renamed from: i */
        public long f9075i;

        /* JADX INFO: renamed from: j */
        public String f9076j;

        /* JADX INFO: renamed from: k */
        public String f9077k;

        /* JADX INFO: renamed from: l */
        public int f9078l;

        /* JADX INFO: renamed from: m */
        public int f9079m;

        /* JADX INFO: renamed from: n */
        public int f9080n;

        /* JADX INFO: renamed from: o */
        public int f9081o;

        /* JADX INFO: renamed from: p */
        public String f9082p;

        /* JADX INFO: renamed from: q */
        public ArrayList<Long> f9083q;

        /* JADX INFO: renamed from: r */
        public long f9084r;

        public C2022e(AbstractC2018a abstractC2018a, String str) {
            super(abstractC2018a, str, "StreamIndex");
            this.f9071e = str;
            this.f9072f = new LinkedList();
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.AbstractC2018a
        /* JADX INFO: renamed from: a */
        public void mo11756a(Object obj) {
            if (obj instanceof C1894k) {
                this.f9072f.add((C1894k) obj);
            }
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.AbstractC2018a
        /* JADX INFO: renamed from: b */
        public Object mo11757b() {
            C1894k[] c1894kArr = new C1894k[this.f9072f.size()];
            this.f9072f.toArray(c1894kArr);
            return new C2023a.b(this.f9071e, this.f9077k, this.f9073g, this.f9074h, this.f9075i, this.f9076j, this.f9078l, this.f9079m, this.f9080n, this.f9081o, this.f9082p, c1894kArr, this.f9083q, this.f9084r);
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.AbstractC2018a
        /* JADX INFO: renamed from: d */
        public boolean mo11759d(String str) {
            return "c".equals(str);
        }

        @Override // com.google.android.exoplayer2.source.smoothstreaming.manifest.SsManifestParser.AbstractC2018a
        /* JADX INFO: renamed from: n */
        public void mo11769n(XmlPullParser xmlPullParser) throws ParserException {
            if ("c".equals(xmlPullParser.getName())) {
                m11779r(xmlPullParser);
            } else {
                m11778q(xmlPullParser);
            }
        }

        /* JADX INFO: renamed from: q */
        public final void m11778q(XmlPullParser xmlPullParser) throws ParserException {
            int iM11780s = m11780s(xmlPullParser);
            this.f9073g = iM11780s;
            m11771p("Type", Integer.valueOf(iM11780s));
            if (this.f9073g == 3) {
                this.f9074h = m11768m(xmlPullParser, "Subtype");
            } else {
                this.f9074h = xmlPullParser.getAttributeValue(null, "Subtype");
            }
            m11771p("Subtype", this.f9074h);
            String attributeValue = xmlPullParser.getAttributeValue(null, Constants.KEY_ENCRYPTION_NAME);
            this.f9076j = attributeValue;
            m11771p(Constants.KEY_ENCRYPTION_NAME, attributeValue);
            this.f9077k = m11768m(xmlPullParser, "Url");
            this.f9078l = m11764i(xmlPullParser, "MaxWidth", -1);
            this.f9079m = m11764i(xmlPullParser, "MaxHeight", -1);
            this.f9080n = m11764i(xmlPullParser, "DisplayWidth", -1);
            this.f9081o = m11764i(xmlPullParser, "DisplayHeight", -1);
            String attributeValue2 = xmlPullParser.getAttributeValue(null, "Language");
            this.f9082p = attributeValue2;
            m11771p("Language", attributeValue2);
            long jM11764i = m11764i(xmlPullParser, "TimeScale", -1);
            this.f9075i = jM11764i;
            if (jM11764i == -1) {
                this.f9075i = ((Long) m11758c("TimeScale")).longValue();
            }
            this.f9083q = new ArrayList<>();
        }

        /* JADX INFO: renamed from: r */
        public final void m11779r(XmlPullParser xmlPullParser) throws ParserException {
            int size = this.f9083q.size();
            long jM11765j = m11765j(xmlPullParser, Constants.KEY_T, -9223372036854775807L);
            int i = 1;
            if (jM11765j == -9223372036854775807L) {
                if (size == 0) {
                    jM11765j = 0;
                } else {
                    if (this.f9084r == -1) {
                        throw ParserException.createForMalformedManifest("Unable to infer start time", null);
                    }
                    jM11765j = this.f9084r + this.f9083q.get(size - 1).longValue();
                }
            }
            this.f9083q.add(Long.valueOf(jM11765j));
            this.f9084r = m11765j(xmlPullParser, Constants.INAPP_DATA_TAG, -9223372036854775807L);
            long jM11765j2 = m11765j(xmlPullParser, "r", 1L);
            if (jM11765j2 > 1 && this.f9084r == -9223372036854775807L) {
                throw ParserException.createForMalformedManifest("Repeated chunk with unspecified duration", null);
            }
            while (true) {
                long j = i;
                if (j >= jM11765j2) {
                    return;
                }
                this.f9083q.add(Long.valueOf((this.f9084r * j) + jM11765j));
                i++;
            }
        }

        /* JADX INFO: renamed from: s */
        public final int m11780s(XmlPullParser xmlPullParser) throws ParserException {
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
            this.f9053a = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e) {
            vtq0.m202761a("Couldn't create XmlPullParserFactory instance", e);
            throw null;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.C2073d.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public C2023a mo11073a(Uri uri, InputStream inputStream) throws IOException {
        try {
            XmlPullParser xmlPullParserNewPullParser = this.f9053a.newPullParser();
            xmlPullParserNewPullParser.setInput(inputStream, null);
            return (C2023a) new C2021d(null, uri.toString()).m11761f(xmlPullParserNewPullParser);
        } catch (XmlPullParserException e) {
            throw ParserException.createForMalformedManifest(null, e);
        }
    }
}
