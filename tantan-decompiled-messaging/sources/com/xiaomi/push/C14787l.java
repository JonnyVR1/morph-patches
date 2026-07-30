package com.xiaomi.push;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.p046p1.mobile.putong.core.data.Reason;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.tencent.connect.common.Constants;
import com.xiaomi.push.service.C14842am;
import com.xiaomi.push.service.C14847ar;
import com.xiaomi.push.service.C14867i;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;
import p149l.atq0;
import p149l.dtq0;
import p149l.gtq0;
import p149l.ilq0;
import p149l.osq0;
import p149l.ysq0;
import p149l.zsq0;

/* JADX INFO: renamed from: com.xiaomi.push.l */
/* JADX INFO: loaded from: classes2.dex */
public class C14787l {

    /* JADX INFO: renamed from: a */
    private static XmlPullParser f62722a;

    /* JADX INFO: renamed from: com.xiaomi.push.l$a */
    public static class a extends C14785j {
        @Override // com.xiaomi.push.C14785j
        /* JADX INFO: renamed from: B */
        public String mo86255B() {
            return null;
        }
    }

    /* JADX INFO: renamed from: com.xiaomi.push.l$b */
    public static class b extends C14785j {
        @Override // com.xiaomi.push.C14785j
        /* JADX INFO: renamed from: B */
        public String mo86255B() {
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static C14785j m86264a(XmlPullParser xmlPullParser, osq0 osq0Var) throws XmlPullParserException, IOException {
        String attributeValue = xmlPullParser.getAttributeValue("", "id");
        String attributeValue2 = xmlPullParser.getAttributeValue("", "to");
        String attributeValue3 = xmlPullParser.getAttributeValue("", "from");
        String attributeValue4 = xmlPullParser.getAttributeValue("", "chid");
        C14785j.a aVarM86258a = C14785j.a.m86258a(xmlPullParser.getAttributeValue("", "type"));
        HashMap map = new HashMap();
        boolean z = false;
        for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            map.put(attributeName, xmlPullParser.getAttributeValue("", attributeName));
        }
        C14785j bVar = null;
        C14786k c14786kM86266c = null;
        while (!z) {
            int next = xmlPullParser.next();
            if (next == 2) {
                String name = xmlPullParser.getName();
                String namespace = xmlPullParser.getNamespace();
                if (name.equals("error")) {
                    c14786kM86266c = m86266c(xmlPullParser);
                } else {
                    bVar = new C14785j();
                    bVar.m98864i(m86268e(name, namespace, xmlPullParser));
                }
            } else if (next == 3 && xmlPullParser.getName().equals("iq")) {
                z = true;
            }
        }
        if (bVar == null) {
            if (C14785j.a.f62685b == aVarM86258a || C14785j.a.f62686c == aVarM86258a) {
                a aVar = new a();
                aVar.m98868n(attributeValue);
                aVar.m98872r(attributeValue3);
                aVar.m98874t(attributeValue2);
                aVar.m86257z(C14785j.a.f62688e);
                aVar.m98870p(attributeValue4);
                aVar.m98863h(new C14786k(C14786k.a.f62701f));
                osq0Var.mo165894o(aVar);
                ilq0.m137025B("iq usage error. send packet in packet parser.");
                return null;
            }
            bVar = new b();
        }
        bVar.m98868n(attributeValue);
        bVar.m98872r(attributeValue2);
        bVar.m98870p(attributeValue4);
        bVar.m98874t(attributeValue3);
        bVar.m86257z(aVarM86258a);
        bVar.m98863h(c14786kM86266c);
        bVar.m86254A(map);
        return bVar;
    }

    /* JADX INFO: renamed from: b */
    public static C14738fq m86265b(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        C14738fq.b bVarValueOf = C14738fq.b.available;
        String attributeValue = xmlPullParser.getAttributeValue("", "type");
        if (attributeValue != null && !attributeValue.equals("")) {
            try {
                bVarValueOf = C14738fq.b.valueOf(attributeValue);
            } catch (IllegalArgumentException unused) {
                System.err.println("Found invalid presence type ".concat(attributeValue));
            }
        }
        C14738fq c14738fq = new C14738fq(bVarValueOf);
        c14738fq.m98872r(xmlPullParser.getAttributeValue("", "to"));
        c14738fq.m98874t(xmlPullParser.getAttributeValue("", "from"));
        c14738fq.m98870p(xmlPullParser.getAttributeValue("", "chid"));
        String attributeValue2 = xmlPullParser.getAttributeValue("", "id");
        if (attributeValue2 == null) {
            attributeValue2 = "ID_NOT_AVAILABLE";
        }
        c14738fq.m98868n(attributeValue2);
        boolean z = false;
        while (!z) {
            int next = xmlPullParser.next();
            if (next == 2) {
                String name = xmlPullParser.getName();
                String namespace = xmlPullParser.getNamespace();
                if (name.equals(NotificationCompat.CATEGORY_STATUS)) {
                    c14738fq.m85576B(xmlPullParser.nextText());
                } else if (name.equals("priority")) {
                    try {
                        c14738fq.m85579y(Integer.parseInt(xmlPullParser.nextText()));
                    } catch (NumberFormatException unused2) {
                    } catch (IllegalArgumentException unused3) {
                        c14738fq.m85579y(0);
                    }
                } else if (name.equals("show")) {
                    String strNextText = xmlPullParser.nextText();
                    try {
                        c14738fq.m85580z(C14738fq.a.valueOf(strNextText));
                    } catch (IllegalArgumentException unused4) {
                        System.err.println("Found invalid presence mode " + strNextText);
                    }
                } else if (name.equals("error")) {
                    c14738fq.m98863h(m86266c(xmlPullParser));
                } else {
                    c14738fq.m98864i(m86268e(name, namespace, xmlPullParser));
                }
            } else if (next == 3 && xmlPullParser.getName().equals("presence")) {
                z = true;
            }
        }
        return c14738fq;
    }

    /* JADX INFO: renamed from: c */
    public static C14786k m86266c(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
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
                        arrayList.add(m86268e(name, namespace, xmlPullParser));
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
        return new C14786k(Integer.parseInt(attributeValue), attributeValue2, str2, str, strNextText, arrayList);
    }

    /* JADX INFO: renamed from: d */
    private static String m86267d(XmlPullParser xmlPullParser) {
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
    public static ysq0 m86268e(String str, String str2, XmlPullParser xmlPullParser) {
        Object objM128001a = gtq0.m127999c().m128001a("all", "xm:chat");
        if (objM128001a == null || !(objM128001a instanceof C14867i)) {
            return null;
        }
        return ((C14867i) objM128001a).m86670b(xmlPullParser);
    }

    /* JADX INFO: renamed from: f */
    public static atq0 m86269f(XmlPullParser xmlPullParser) throws XmlPullParserException, C14737fi, IOException {
        String attributeValue;
        boolean z = false;
        String strNextText = null;
        if ("1".equals(xmlPullParser.getAttributeValue("", BLiveStormDanmakuGiftResourceType.f44446s))) {
            String attributeValue2 = xmlPullParser.getAttributeValue("", "chid");
            String attributeValue3 = xmlPullParser.getAttributeValue("", "id");
            String attributeValue4 = xmlPullParser.getAttributeValue("", "from");
            String attributeValue5 = xmlPullParser.getAttributeValue("", "to");
            String attributeValue6 = xmlPullParser.getAttributeValue("", "type");
            C14842am.b bVarM86508a = C14842am.m86505a().m86508a(attributeValue2, attributeValue5);
            if (bVarM86508a == null) {
                bVarM86508a = C14842am.m86505a().m86508a(attributeValue2, attributeValue4);
            }
            if (bVarM86508a == null) {
                throw new C14737fi("the channel id is wrong while receiving a encrypted message");
            }
            atq0 atq0VarM86269f = null;
            while (!z) {
                int next = xmlPullParser.next();
                if (next == 2) {
                    if (!BLiveStormDanmakuGiftResourceType.f44446s.equals(xmlPullParser.getName())) {
                        throw new C14737fi("error while receiving a encrypted message with wrong format");
                    }
                    if (xmlPullParser.next() != 4) {
                        throw new C14737fi("error while receiving a encrypted message with wrong format");
                    }
                    String text = xmlPullParser.getText();
                    if ("5".equals(attributeValue2) || Constants.VIA_SHARE_TYPE_INFO.equals(attributeValue2)) {
                        zsq0 zsq0Var = new zsq0();
                        zsq0Var.m98870p(attributeValue2);
                        zsq0Var.m220059D(true);
                        zsq0Var.m98874t(attributeValue4);
                        zsq0Var.m98872r(attributeValue5);
                        zsq0Var.m98868n(attributeValue3);
                        zsq0Var.m220067L(attributeValue6);
                        ysq0 ysq0Var = new ysq0(BLiveStormDanmakuGiftResourceType.f44446s, null, null, null);
                        ysq0Var.m215925f(text);
                        zsq0Var.m98864i(ysq0Var);
                        return zsq0Var;
                    }
                    m86271h(C14847ar.m86552a(C14847ar.m86551a(bVarM86508a.f62901h, attributeValue3), text));
                    f62722a.next();
                    atq0VarM86269f = m86269f(f62722a);
                } else if (next == 3 && xmlPullParser.getName().equals("message")) {
                    z = true;
                }
            }
            if (atq0VarM86269f != null) {
                return atq0VarM86269f;
            }
            throw new C14737fi("error while receiving a encrypted message with wrong format");
        }
        zsq0 zsq0Var2 = new zsq0();
        String attributeValue7 = xmlPullParser.getAttributeValue("", "id");
        if (attributeValue7 == null) {
            attributeValue7 = "ID_NOT_AVAILABLE";
        }
        zsq0Var2.m98868n(attributeValue7);
        zsq0Var2.m98872r(xmlPullParser.getAttributeValue("", "to"));
        zsq0Var2.m98874t(xmlPullParser.getAttributeValue("", "from"));
        zsq0Var2.m98870p(xmlPullParser.getAttributeValue("", "chid"));
        zsq0Var2.m220074y(xmlPullParser.getAttributeValue("", "appid"));
        try {
            attributeValue = xmlPullParser.getAttributeValue("", "transient");
        } catch (Exception unused) {
            attributeValue = null;
        }
        try {
            String attributeValue8 = xmlPullParser.getAttributeValue("", "seq");
            if (!TextUtils.isEmpty(attributeValue8)) {
                zsq0Var2.m220058C(attributeValue8);
            }
        } catch (Exception unused2) {
        }
        try {
            String attributeValue9 = xmlPullParser.getAttributeValue("", "mseq");
            if (!TextUtils.isEmpty(attributeValue9)) {
                zsq0Var2.m220061F(attributeValue9);
            }
        } catch (Exception unused3) {
        }
        try {
            String attributeValue10 = xmlPullParser.getAttributeValue("", "fseq");
            if (!TextUtils.isEmpty(attributeValue10)) {
                zsq0Var2.m220063H(attributeValue10);
            }
        } catch (Exception unused4) {
        }
        try {
            String attributeValue11 = xmlPullParser.getAttributeValue("", NotificationCompat.CATEGORY_STATUS);
            if (!TextUtils.isEmpty(attributeValue11)) {
                zsq0Var2.m220065J(attributeValue11);
            }
        } catch (Exception unused5) {
        }
        zsq0Var2.m220056A(!TextUtils.isEmpty(attributeValue) && attributeValue.equalsIgnoreCase("true"));
        zsq0Var2.m220067L(xmlPullParser.getAttributeValue("", "type"));
        String strM86272i = m86272i(xmlPullParser);
        if (strM86272i == null || "".equals(strM86272i.trim())) {
            atq0.m98857x();
        } else {
            zsq0Var2.m220073R(strM86272i);
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
                    m86272i(xmlPullParser);
                    zsq0Var2.m220069N(m86267d(xmlPullParser));
                } else if (name.equals("body")) {
                    String attributeValue12 = xmlPullParser.getAttributeValue("", "encode");
                    String strM86267d = m86267d(xmlPullParser);
                    if (TextUtils.isEmpty(attributeValue12)) {
                        zsq0Var2.m220071P(strM86267d);
                    } else {
                        zsq0Var2.m220075z(strM86267d, attributeValue12);
                    }
                } else if (name.equals("thread")) {
                    if (strNextText == null) {
                        strNextText = xmlPullParser.nextText();
                    }
                } else if (name.equals("error")) {
                    zsq0Var2.m98863h(m86266c(xmlPullParser));
                } else {
                    zsq0Var2.m98864i(m86268e(name, namespace, xmlPullParser));
                }
            } else if (next2 == 3 && xmlPullParser.getName().equals("message")) {
                z = true;
            }
        }
        zsq0Var2.m220072Q(strNextText);
        return zsq0Var2;
    }

    /* JADX INFO: renamed from: g */
    public static dtq0 m86270g(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        dtq0 dtq0Var = null;
        boolean z = false;
        while (!z) {
            int next = xmlPullParser.next();
            if (next == 2) {
                dtq0Var = new dtq0(xmlPullParser.getName());
            } else if (next == 3 && xmlPullParser.getName().equals("error")) {
                z = true;
            }
        }
        return dtq0Var;
    }

    /* JADX INFO: renamed from: h */
    private static void m86271h(byte[] bArr) throws XmlPullParserException {
        if (f62722a == null) {
            try {
                XmlPullParser xmlPullParserNewPullParser = XmlPullParserFactory.newInstance().newPullParser();
                f62722a = xmlPullParserNewPullParser;
                xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", true);
            } catch (XmlPullParserException e) {
                e.printStackTrace();
            }
        }
        f62722a.setInput(new InputStreamReader(new ByteArrayInputStream(bArr)));
    }

    /* JADX INFO: renamed from: i */
    private static String m86272i(XmlPullParser xmlPullParser) {
        for (int i = 0; i < xmlPullParser.getAttributeCount(); i++) {
            String attributeName = xmlPullParser.getAttributeName(i);
            if ("xml:lang".equals(attributeName) || ("lang".equals(attributeName) && "xml".equals(xmlPullParser.getAttributePrefix(i)))) {
                return xmlPullParser.getAttributeValue(i);
            }
        }
        return null;
    }
}
