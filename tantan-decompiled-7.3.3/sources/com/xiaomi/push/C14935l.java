package com.xiaomi.push;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.p051p1.mobile.putong.core.data.Reason;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.tencent.connect.common.Constants;
import com.xiaomi.push.service.C14990am;
import com.xiaomi.push.service.C14995ar;
import com.xiaomi.push.service.C15015i;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p153l.e2r0;
import p153l.f2r0;
import p153l.g2r0;
import p153l.j2r0;
import p153l.m2r0;
import p153l.ouq0;
import p153l.u1r0;

/* JADX INFO: renamed from: com.xiaomi.push.l */
/* JADX INFO: loaded from: classes2.dex */
public class C14935l {

    /* JADX INFO: renamed from: a */
    private static XmlPullParser f63569a;

    /* JADX INFO: renamed from: com.xiaomi.push.l$a */
    public static class a extends C14933j {
        @Override // com.xiaomi.push.C14933j
        /* JADX INFO: renamed from: B */
        public String mo87426B() {
            return null;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.push.l$b */
    public static class b extends C14933j {
        @Override // com.xiaomi.push.C14933j
        /* JADX INFO: renamed from: B */
        public String mo87426B() {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C14933j m87435a(XmlPullParser xmlPullParser, u1r0 u1r0Var) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue("", "id");
        String attributeValue2 = xmlPullParser.getAttributeValue("", "to");
        String attributeValue3 = xmlPullParser.getAttributeValue("", "from");
        String attributeValue4 = xmlPullParser.getAttributeValue("", "chid");
        C14933j.a aVarM87429a = C14933j.a.m87429a(xmlPullParser.getAttributeValue("", "type"));
        HashMap map = new HashMap();
        boolean z = false;
        for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            map.put(attributeName, xmlPullParser.getAttributeValue("", attributeName));
        }
        C14933j bVar = null;
        C14934k c14934kM87437c = null;
        while (!z) {
            int next = xmlPullParser.next();
            if (next == 2) {
                String name = xmlPullParser.getName();
                String namespace = xmlPullParser.getNamespace();
                if (name.equals("error")) {
                    c14934kM87437c = m87437c(xmlPullParser);
                } else {
                    bVar = new C14933j();
                    bVar.m128646i(m87439e(name, namespace, xmlPullParser));
                }
            } else if (next == 3 && xmlPullParser.getName().equals("iq")) {
                z = true;
            }
        }
        if (bVar == null) {
            if (C14933j.a.f63532b == aVarM87429a || C14933j.a.f63533c == aVarM87429a) {
                a aVar = new a();
                aVar.m128650n(attributeValue);
                aVar.m128654r(attributeValue3);
                aVar.m128656t(attributeValue2);
                aVar.m87428z(C14933j.a.f63535e);
                aVar.m128652p(attributeValue4);
                aVar.m128645h(new C14934k(C14934k.a.f63548f));
                u1r0Var.mo113628o(aVar);
                ouq0.m169378B("iq usage error. send packet in packet parser.");
                return null;
            }
            bVar = new b();
        }
        bVar.m128650n(attributeValue);
        bVar.m128654r(attributeValue2);
        bVar.m128652p(attributeValue4);
        bVar.m128656t(attributeValue3);
        bVar.m87428z(aVarM87429a);
        bVar.m128645h(c14934kM87437c);
        bVar.m87425A(map);
        return bVar;
    }

    /* JADX INFO: renamed from: b */
    public static C14886fq m87436b(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        C14886fq.b bVarValueOf = C14886fq.b.available;
        String attributeValue = xmlPullParser.getAttributeValue("", "type");
        if (attributeValue != null && !attributeValue.equals("")) {
            try {
                bVarValueOf = C14886fq.b.valueOf(attributeValue);
            } catch (IllegalArgumentException unused) {
                System.err.println("Found invalid presence type ".concat(attributeValue));
            }
        }
        C14886fq c14886fq = new C14886fq(bVarValueOf);
        c14886fq.m128654r(xmlPullParser.getAttributeValue("", "to"));
        c14886fq.m128656t(xmlPullParser.getAttributeValue("", "from"));
        c14886fq.m128652p(xmlPullParser.getAttributeValue("", "chid"));
        String attributeValue2 = xmlPullParser.getAttributeValue("", "id");
        if (attributeValue2 == null) {
            attributeValue2 = "ID_NOT_AVAILABLE";
        }
        c14886fq.m128650n(attributeValue2);
        boolean z = false;
        while (!z) {
            int next = xmlPullParser.next();
            if (next == 2) {
                String name = xmlPullParser.getName();
                String namespace = xmlPullParser.getNamespace();
                if (name.equals(NotificationCompat.CATEGORY_STATUS)) {
                    c14886fq.m86747B(xmlPullParser.nextText());
                } else if (name.equals("priority")) {
                    try {
                        c14886fq.m86750y(Integer.parseInt(xmlPullParser.nextText()));
                    } catch (NumberFormatException unused2) {
                    } catch (IllegalArgumentException unused3) {
                        c14886fq.m86750y(0);
                    }
                } else if (name.equals("show")) {
                    String strNextText = xmlPullParser.nextText();
                    try {
                        c14886fq.m86751z(C14886fq.a.valueOf(strNextText));
                    } catch (IllegalArgumentException unused4) {
                        System.err.println("Found invalid presence mode " + strNextText);
                    }
                } else if (name.equals("error")) {
                    c14886fq.m128645h(m87437c(xmlPullParser));
                } else {
                    c14886fq.m128646i(m87439e(name, namespace, xmlPullParser));
                }
            } else if (next == 3 && xmlPullParser.getName().equals("presence")) {
                z = true;
            }
        }
        return c14886fq;
    }

    /* JADX INFO: renamed from: c */
    public static C14934k m87437c(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        String attributeValue = User.ID_TEAM_ACCOUNT;
        String str = null;
        boolean z = false;
        String attributeValue2 = null;
        String attributeValue3 = null;
        for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
            if (xmlPullParser.getAttributeName(i).equals("code")) {
                attributeValue = xmlPullParser.getAttributeValue("", "code");
            }
            if (xmlPullParser.getAttributeName(i).equals("type")) {
                attributeValue2 = xmlPullParser.getAttributeValue("", "type");
            }
            if (xmlPullParser.getAttributeName(i).equals(Reason.TYPE)) {
                attributeValue3 = xmlPullParser.getAttributeValue("", Reason.TYPE);
            }
        }
        String str2 = attributeValue3;
        String strNextText = null;
        while (!z) {
            int next = xmlPullParser.next();
            if (next == 2) {
                if (xmlPullParser.getName().equals("text")) {
                    strNextText = xmlPullParser.nextText();
                } else {
                    String name = xmlPullParser.getName();
                    String namespace = xmlPullParser.getNamespace();
                    if ("urn:ietf:params:xml:ns:xmpp-stanzas".equals(namespace)) {
                        str = name;
                    } else {
                        arrayList.add(m87439e(name, namespace, xmlPullParser));
                    }
                }
            } else if (next == 3) {
                if (xmlPullParser.getName().equals("error")) {
                    z = true;
                }
            } else if (next == 4) {
                strNextText = xmlPullParser.getText();
            }
        }
        if (attributeValue2 == null) {
            attributeValue2 = "cancel";
        }
        return new C14934k(Integer.parseInt(attributeValue), attributeValue2, str2, str, strNextText, arrayList);
    }

    /* JADX INFO: renamed from: d */
    private static String m87438d(XmlPullParser xmlPullParser) {
        int depth = xmlPullParser.getDepth();
        String str = "";
        while (true) {
            if (xmlPullParser.next() == 3 && xmlPullParser.getDepth() == depth) {
                return str;
            }
            str = str + xmlPullParser.getText();
        }
    }

    /* JADX INFO: renamed from: e */
    public static e2r0 m87439e(String str, String str2, XmlPullParser xmlPullParser) {
        Object objM156885a = m2r0.m156883c().m156885a("all", "xm:chat");
        if (objM156885a == null || !(objM156885a instanceof C15015i)) {
            return null;
        }
        return ((C15015i) objM156885a).m87841b(xmlPullParser);
    }

    /* JADX INFO: renamed from: f */
    public static g2r0 m87440f(XmlPullParser xmlPullParser) throws XmlPullParserException, C14885fi, IOException {
        String attributeValue;
        boolean z = false;
        String strNextText = null;
        if ("1".equals(xmlPullParser.getAttributeValue("", BLiveStormDanmakuGiftResourceType.f45294s))) {
            String attributeValue2 = xmlPullParser.getAttributeValue("", "chid");
            String attributeValue3 = xmlPullParser.getAttributeValue("", "id");
            String attributeValue4 = xmlPullParser.getAttributeValue("", "from");
            String attributeValue5 = xmlPullParser.getAttributeValue("", "to");
            String attributeValue6 = xmlPullParser.getAttributeValue("", "type");
            C14990am.b bVarM87679a = C14990am.m87676a().m87679a(attributeValue2, attributeValue5);
            if (bVarM87679a == null) {
                bVarM87679a = C14990am.m87676a().m87679a(attributeValue2, attributeValue4);
            }
            if (bVarM87679a == null) {
                throw new C14885fi("the channel id is wrong while receiving a encrypted message");
            }
            g2r0 g2r0VarM87440f = null;
            while (!z) {
                int next = xmlPullParser.next();
                if (next == 2) {
                    if (!BLiveStormDanmakuGiftResourceType.f45294s.equals(xmlPullParser.getName())) {
                        throw new C14885fi("error while receiving a encrypted message with wrong format");
                    }
                    if (xmlPullParser.next() != 4) {
                        throw new C14885fi("error while receiving a encrypted message with wrong format");
                    }
                    String text = xmlPullParser.getText();
                    if ("5".equals(attributeValue2) || Constants.VIA_SHARE_TYPE_INFO.equals(attributeValue2)) {
                        f2r0 f2r0Var = new f2r0();
                        f2r0Var.m128652p(attributeValue2);
                        f2r0Var.m123652D(true);
                        f2r0Var.m128656t(attributeValue4);
                        f2r0Var.m128654r(attributeValue5);
                        f2r0Var.m128650n(attributeValue3);
                        f2r0Var.m123660L(attributeValue6);
                        e2r0 e2r0Var = new e2r0(BLiveStormDanmakuGiftResourceType.f45294s, null, null, null);
                        e2r0Var.m119160f(text);
                        f2r0Var.m128646i(e2r0Var);
                        return f2r0Var;
                    }
                    m87442h(C14995ar.m87723a(C14995ar.m87722a(bVarM87679a.f63748h, attributeValue3), text));
                    f63569a.next();
                    g2r0VarM87440f = m87440f(f63569a);
                } else if (next == 3 && xmlPullParser.getName().equals("message")) {
                    z = true;
                }
            }
            if (g2r0VarM87440f != null) {
                return g2r0VarM87440f;
            }
            throw new C14885fi("error while receiving a encrypted message with wrong format");
        }
        f2r0 f2r0Var2 = new f2r0();
        String attributeValue7 = xmlPullParser.getAttributeValue("", "id");
        if (attributeValue7 == null) {
            attributeValue7 = "ID_NOT_AVAILABLE";
        }
        f2r0Var2.m128650n(attributeValue7);
        f2r0Var2.m128654r(xmlPullParser.getAttributeValue("", "to"));
        f2r0Var2.m128656t(xmlPullParser.getAttributeValue("", "from"));
        f2r0Var2.m128652p(xmlPullParser.getAttributeValue("", "chid"));
        f2r0Var2.m123667y(xmlPullParser.getAttributeValue("", "appid"));
        try {
            attributeValue = xmlPullParser.getAttributeValue("", "transient");
        } catch (Exception unused) {
            attributeValue = null;
        }
        try {
            String attributeValue8 = xmlPullParser.getAttributeValue("", "seq");
            if (!TextUtils.isEmpty(attributeValue8)) {
                f2r0Var2.m123651C(attributeValue8);
            }
        } catch (Exception unused2) {
        }
        try {
            String attributeValue9 = xmlPullParser.getAttributeValue("", "mseq");
            if (!TextUtils.isEmpty(attributeValue9)) {
                f2r0Var2.m123654F(attributeValue9);
            }
        } catch (Exception unused3) {
        }
        try {
            String attributeValue10 = xmlPullParser.getAttributeValue("", "fseq");
            if (!TextUtils.isEmpty(attributeValue10)) {
                f2r0Var2.m123656H(attributeValue10);
            }
        } catch (Exception unused4) {
        }
        try {
            String attributeValue11 = xmlPullParser.getAttributeValue("", NotificationCompat.CATEGORY_STATUS);
            if (!TextUtils.isEmpty(attributeValue11)) {
                f2r0Var2.m123658J(attributeValue11);
            }
        } catch (Exception unused5) {
        }
        f2r0Var2.m123649A(!TextUtils.isEmpty(attributeValue) && attributeValue.equalsIgnoreCase("true"));
        f2r0Var2.m123660L(xmlPullParser.getAttributeValue("", "type"));
        String strM87443i = m87443i(xmlPullParser);
        if (strM87443i == null || "".equals(strM87443i.trim())) {
            g2r0.m128639x();
        } else {
            f2r0Var2.m123666R(strM87443i);
        }
        while (!z) {
            int next2 = xmlPullParser.next();
            if (next2 == 2) {
                String name = xmlPullParser.getName();
                String namespace = xmlPullParser.getNamespace();
                if (TextUtils.isEmpty(namespace)) {
                    namespace = "xm";
                }
                if (name.equals("subject")) {
                    m87443i(xmlPullParser);
                    f2r0Var2.m123662N(m87438d(xmlPullParser));
                } else if (name.equals("body")) {
                    String attributeValue12 = xmlPullParser.getAttributeValue("", "encode");
                    String strM87438d = m87438d(xmlPullParser);
                    if (TextUtils.isEmpty(attributeValue12)) {
                        f2r0Var2.m123664P(strM87438d);
                    } else {
                        f2r0Var2.m123668z(strM87438d, attributeValue12);
                    }
                } else if (name.equals("thread")) {
                    if (strNextText == null) {
                        strNextText = xmlPullParser.nextText();
                    }
                } else if (name.equals("error")) {
                    f2r0Var2.m128645h(m87437c(xmlPullParser));
                } else {
                    f2r0Var2.m128646i(m87439e(name, namespace, xmlPullParser));
                }
            } else if (next2 == 3 && xmlPullParser.getName().equals("message")) {
                z = true;
            }
        }
        f2r0Var2.m123665Q(strNextText);
        return f2r0Var2;
    }

    /* JADX INFO: renamed from: g */
    public static j2r0 m87441g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        j2r0 j2r0Var = null;
        boolean z = false;
        while (!z) {
            int next = xmlPullParser.next();
            if (next == 2) {
                j2r0Var = new j2r0(xmlPullParser.getName());
            } else if (next == 3 && xmlPullParser.getName().equals("error")) {
                z = true;
            }
        }
        return j2r0Var;
    }

    /* JADX INFO: renamed from: h */
    private static void m87442h(byte[] bArr) throws XmlPullParserException {
        if (f63569a == null) {
            try {
                XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
                f63569a = xmlPullParserNewPullParser;
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
            } catch (XmlPullParserException e) {
                e.printStackTrace();
            }
        }
        f63569a.setInput(new InputStreamReader(new ByteArrayInputStream(bArr)));
    }

    /* JADX INFO: renamed from: i */
    private static String m87443i(XmlPullParser xmlPullParser) {
        for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            if ("xml:lang".equals(attributeName) || ("lang".equals(attributeName) && "xml".equals(xmlPullParser.getAttributePrefix(i)))) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }
}
