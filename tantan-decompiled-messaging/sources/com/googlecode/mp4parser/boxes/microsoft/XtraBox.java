package com.googlecode.mp4parser.boxes.microsoft;

import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.facebook.AuthenticationTokenClaims;
import com.googlecode.mp4parser.AbstractBox;
import com.meituan.robust.Constants;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Date;
import java.util.Vector;
import org.apache.commons.codec.CharEncoding;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.internal.Conversions;
import org.aspectj.runtime.reflect.Factory;
import p149l.bre;
import p149l.cvc0;
import p149l.pkq0;

/* JADX INFO: loaded from: classes7.dex */
public class XtraBox extends AbstractBox {
    private static final long FILETIME_EPOCH_DIFF = 11644473600000L;
    private static final long FILETIME_ONE_MILLISECOND = 10000;
    public static final int MP4_XTRA_BT_FILETIME = 21;
    public static final int MP4_XTRA_BT_GUID = 72;
    public static final int MP4_XTRA_BT_INT64 = 19;
    public static final int MP4_XTRA_BT_UNICODE = 8;
    public static final String TYPE = "Xtra";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_10 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_5 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_6 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_7 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_8 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_9 = null;
    ByteBuffer data;
    private boolean successfulParse;
    Vector<C3441a> tags;

    static {
        ajc$preClinit();
    }

    public XtraBox() {
        super(TYPE);
        this.successfulParse = false;
        this.tags = new Vector<>();
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("XtraBox.java", XtraBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "toString", "com.googlecode.mp4parser.boxes.microsoft.XtraBox", "", "", "", "java.lang.String"), 88);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getAllTagNames", "com.googlecode.mp4parser.boxes.microsoft.XtraBox", "", "", "", "[Ljava.lang.String;"), 151);
        ajc$tjp_10 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setTagValue", "com.googlecode.mp4parser.boxes.microsoft.XtraBox", "java.lang.String:long", "name:value", "", Constants.VOID), 289);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getFirstStringValue", "com.googlecode.mp4parser.boxes.microsoft.XtraBox", "java.lang.String", AuthenticationTokenClaims.JSON_KEY_NAME, "", "java.lang.String"), 166);
        ajc$tjp_3 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getFirstDateValue", "com.googlecode.mp4parser.boxes.microsoft.XtraBox", "java.lang.String", AuthenticationTokenClaims.JSON_KEY_NAME, "", "java.util.Date"), 183);
        ajc$tjp_4 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getFirstLongValue", "com.googlecode.mp4parser.boxes.microsoft.XtraBox", "java.lang.String", AuthenticationTokenClaims.JSON_KEY_NAME, "", Constants.LANG_LONG), 200);
        ajc$tjp_5 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getValues", "com.googlecode.mp4parser.boxes.microsoft.XtraBox", "java.lang.String", AuthenticationTokenClaims.JSON_KEY_NAME, "", "[Ljava.lang.Object;"), 216);
        ajc$tjp_6 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "removeTag", "com.googlecode.mp4parser.boxes.microsoft.XtraBox", "java.lang.String", AuthenticationTokenClaims.JSON_KEY_NAME, "", Constants.VOID), 236);
        ajc$tjp_7 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setTagValues", "com.googlecode.mp4parser.boxes.microsoft.XtraBox", "java.lang.String:[Ljava.lang.String;", "name:values", "", Constants.VOID), 249);
        ajc$tjp_8 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setTagValue", "com.googlecode.mp4parser.boxes.microsoft.XtraBox", "java.lang.String:java.lang.String", "name:value", "", Constants.VOID), 265);
        ajc$tjp_9 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setTagValue", "com.googlecode.mp4parser.boxes.microsoft.XtraBox", "java.lang.String:java.util.Date", "name:date", "", Constants.VOID), 276);
    }

    private int detailSize() {
        int iM17390g = 0;
        for (int i = 0; i < this.tags.size(); i++) {
            iM17390g += this.tags.elementAt(i).m17390g();
        }
        return iM17390g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long filetimeToMillis(long j) {
        return (j / FILETIME_ONE_MILLISECOND) - FILETIME_EPOCH_DIFF;
    }

    private C3441a getTagByName(String str) {
        for (C3441a c3441a : this.tags) {
            if (c3441a.f11710b.equals(str)) {
                return c3441a;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long millisToFiletime(long j) {
        return (j + FILETIME_EPOCH_DIFF) * FILETIME_ONE_MILLISECOND;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String readAsciiString(ByteBuffer byteBuffer, int i) {
        byte[] bArr = new byte[i];
        byteBuffer.get(bArr);
        try {
            return new String(bArr, CharEncoding.US_ASCII);
        } catch (UnsupportedEncodingException e) {
            pkq0.m170054a("Shouldn't happen", e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String readUtf16String(ByteBuffer byteBuffer, int i) {
        int i2 = (i / 2) - 1;
        char[] cArr = new char[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            cArr[i3] = byteBuffer.getChar();
        }
        byteBuffer.getChar();
        return new String(cArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void writeAsciiString(ByteBuffer byteBuffer, String str) {
        try {
            byteBuffer.put(str.getBytes(CharEncoding.US_ASCII));
        } catch (UnsupportedEncodingException e) {
            pkq0.m170054a("Shouldn't happen", e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void writeUtf16String(ByteBuffer byteBuffer, String str) {
        for (char c : str.toCharArray()) {
            byteBuffer.putChar(c);
        }
        byteBuffer.putChar((char) 0);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        int iRemaining = byteBuffer.remaining();
        this.data = byteBuffer.slice();
        this.successfulParse = false;
        try {
            try {
                this.tags.clear();
                while (byteBuffer.remaining() > 0) {
                    C3441a c3441a = new C3441a((C3441a) null);
                    c3441a.m17391h(byteBuffer);
                    this.tags.addElement(c3441a);
                }
                int iDetailSize = detailSize();
                if (iRemaining == iDetailSize) {
                    this.successfulParse = true;
                    byteBuffer.order(ByteOrder.BIG_ENDIAN);
                    return;
                }
                throw new RuntimeException("Improperly handled Xtra tag: Calculated sizes don't match ( " + iRemaining + "/" + iDetailSize + ")");
            } catch (Exception e) {
                this.successfulParse = false;
                System.err.println("Malformed Xtra Tag detected: " + e.toString());
                e.printStackTrace();
                byteBuffer.position(byteBuffer.position() + byteBuffer.remaining());
            }
        } catch (Throwable th) {
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
            throw th;
        }
    }

    public String[] getAllTagNames() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_1, this, this));
        String[] strArr = new String[this.tags.size()];
        for (int i = 0; i < this.tags.size(); i++) {
            strArr[i] = this.tags.elementAt(i).f11710b;
        }
        return strArr;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        if (!this.successfulParse) {
            this.data.rewind();
            byteBuffer.put(this.data);
        } else {
            for (int i = 0; i < this.tags.size(); i++) {
                this.tags.elementAt(i).m17389f(byteBuffer);
            }
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return this.successfulParse ? detailSize() : this.data.limit();
    }

    public Date getFirstDateValue(String str) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_3, this, this, str));
        for (Object obj : getValues(str)) {
            if (obj instanceof Date) {
                return (Date) obj;
            }
        }
        return null;
    }

    public Long getFirstLongValue(String str) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_4, this, this, str));
        for (Object obj : getValues(str)) {
            if (obj instanceof Long) {
                return (Long) obj;
            }
        }
        return null;
    }

    public String getFirstStringValue(String str) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_2, this, this, str));
        for (Object obj : getValues(str)) {
            if (obj instanceof String) {
                return (String) obj;
            }
        }
        return null;
    }

    public Object[] getValues(String str) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_5, this, this, str));
        C3441a tagByName = getTagByName(str);
        if (tagByName == null) {
            return new Object[0];
        }
        Object[] objArr = new Object[tagByName.f11711c.size()];
        for (int i = 0; i < tagByName.f11711c.size(); i++) {
            objArr[i] = ((C3442b) tagByName.f11711c.elementAt(i)).m17398g();
        }
        return objArr;
    }

    public void removeTag(String str) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_6, this, this, str));
        C3441a tagByName = getTagByName(str);
        if (tagByName != null) {
            this.tags.remove(tagByName);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setTagValue(String str, long j) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_10, this, this, str, Conversions.longObject(j)));
        removeTag(str);
        C3441a c3441a = new C3441a(str, null);
        c3441a.f11711c.addElement(new C3442b(j, (C3442b) (0 == true ? 1 : 0)));
        this.tags.addElement(c3441a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setTagValues(String str, String[] strArr) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_7, this, this, str, strArr));
        removeTag(str);
        Object[] objArr = 0;
        C3441a c3441a = new C3441a(str, null);
        for (String str2 : strArr) {
            c3441a.f11711c.addElement(new C3442b(str2, (C3442b) (objArr == true ? 1 : 0)));
        }
        this.tags.addElement(c3441a);
    }

    public String toString() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_0, this, this));
        if (!isParsed()) {
            parseDetails();
        }
        StringBuffer stringBuffer = new StringBuffer("XtraBox[");
        for (C3441a c3441a : this.tags) {
            for (C3442b c3442b : c3441a.f11711c) {
                stringBuffer.append(c3441a.f11710b);
                stringBuffer.append("=");
                stringBuffer.append(c3442b.toString());
                stringBuffer.append(Constants.PACKNAME_END);
            }
        }
        stringBuffer.append(com.clevertap.android.sdk.Constants.AES_SUFFIX);
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: com.googlecode.mp4parser.boxes.microsoft.XtraBox$b */
    public static class C3442b {

        /* JADX INFO: renamed from: a */
        public int f11712a;

        /* JADX INFO: renamed from: b */
        public String f11713b;

        /* JADX INFO: renamed from: c */
        public long f11714c;

        /* JADX INFO: renamed from: d */
        public byte[] f11715d;

        /* JADX INFO: renamed from: e */
        public Date f11716e;

        private C3442b(String str) {
            this.f11712a = 8;
            this.f11713b = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: e */
        public void m17396e(ByteBuffer byteBuffer) {
            try {
                byteBuffer.putInt(m17397f());
                byteBuffer.putShort((short) this.f11712a);
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                int i = this.f11712a;
                if (i == 8) {
                    XtraBox.writeUtf16String(byteBuffer, this.f11713b);
                } else if (i == 19) {
                    byteBuffer.putLong(this.f11714c);
                } else if (i != 21) {
                    byteBuffer.put(this.f11715d);
                } else {
                    byteBuffer.putLong(XtraBox.millisToFiletime(this.f11716e.getTime()));
                }
            } finally {
                byteBuffer.order(ByteOrder.BIG_ENDIAN);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: f */
        public int m17397f() {
            int i = this.f11712a;
            if (i == 8) {
                return (this.f11713b.length() * 2) + 8;
            }
            if (i == 19 || i == 21) {
                return 14;
            }
            return this.f11715d.length + 6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: g */
        public Object m17398g() {
            int i = this.f11712a;
            if (i == 8) {
                return this.f11713b;
            }
            if (i != 19) {
                return i != 21 ? this.f11715d : this.f11716e;
            }
            return new Long(this.f11714c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public void m17399h(ByteBuffer byteBuffer) {
            int i = byteBuffer.getInt() - 6;
            this.f11712a = byteBuffer.getShort();
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            int i2 = this.f11712a;
            if (i2 == 8) {
                this.f11713b = XtraBox.readUtf16String(byteBuffer, i);
            } else if (i2 == 19) {
                this.f11714c = byteBuffer.getLong();
            } else if (i2 != 21) {
                byte[] bArr = new byte[i];
                this.f11715d = bArr;
                byteBuffer.get(bArr);
            } else {
                this.f11716e = new Date(XtraBox.filetimeToMillis(byteBuffer.getLong()));
            }
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        public String toString() {
            int i = this.f11712a;
            if (i == 8) {
                return "[string]" + this.f11713b;
            }
            if (i == 19) {
                return "[long]" + String.valueOf(this.f11714c);
            }
            if (i != 21) {
                return "[GUID](nonParsed)";
            }
            return "[filetime]" + this.f11716e.toString();
        }

        public /* synthetic */ C3442b(C3442b c3442b) {
            this();
        }

        private C3442b() {
        }

        public /* synthetic */ C3442b(String str, C3442b c3442b) {
            this(str);
        }

        private C3442b(long j) {
            this.f11712a = 19;
            this.f11714c = j;
        }

        public /* synthetic */ C3442b(long j, C3442b c3442b) {
            this(j);
        }

        private C3442b(Date date) {
            this.f11712a = 21;
            this.f11716e = date;
        }

        public /* synthetic */ C3442b(Date date, C3442b c3442b) {
            this(date);
        }
    }

    /* JADX INFO: renamed from: com.googlecode.mp4parser.boxes.microsoft.XtraBox$a */
    public static class C3441a {

        /* JADX INFO: renamed from: a */
        private int f11709a;

        /* JADX INFO: renamed from: b */
        private String f11710b;

        /* JADX INFO: renamed from: c */
        private Vector<C3442b> f11711c;

        private C3441a() {
            this.f11711c = new Vector<>();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: f */
        public void m17389f(ByteBuffer byteBuffer) {
            byteBuffer.putInt(m17390g());
            byteBuffer.putInt(this.f11710b.length());
            XtraBox.writeAsciiString(byteBuffer, this.f11710b);
            byteBuffer.putInt(this.f11711c.size());
            for (int i = 0; i < this.f11711c.size(); i++) {
                this.f11711c.elementAt(i).m17396e(byteBuffer);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: g */
        public int m17390g() {
            int length = this.f11710b.length() + 12;
            for (int i = 0; i < this.f11711c.size(); i++) {
                length += this.f11711c.elementAt(i).m17397f();
            }
            return length;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public void m17391h(ByteBuffer byteBuffer) {
            this.f11709a = byteBuffer.getInt();
            this.f11710b = XtraBox.readAsciiString(byteBuffer, byteBuffer.getInt());
            int i = byteBuffer.getInt();
            for (int i2 = 0; i2 < i; i2++) {
                C3442b c3442b = new C3442b((C3442b) null);
                c3442b.m17399h(byteBuffer);
                this.f11711c.addElement(c3442b);
            }
            if (this.f11709a == m17390g()) {
                return;
            }
            bre.m103538a("Improperly handled Xtra tag: Sizes don't match ( ", this.f11709a, "/", m17390g(), ") on ", this.f11710b);
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(this.f11710b);
            stringBuffer.append(" [");
            stringBuffer.append(this.f11709a);
            stringBuffer.append("/");
            stringBuffer.append(this.f11711c.size());
            stringBuffer.append("]:\n");
            for (int i = 0; i < this.f11711c.size(); i++) {
                stringBuffer.append("  ");
                stringBuffer.append(this.f11711c.elementAt(i).toString());
                stringBuffer.append(SignParameters.NEW_LINE);
            }
            return stringBuffer.toString();
        }

        public /* synthetic */ C3441a(C3441a c3441a) {
            this();
        }

        public /* synthetic */ C3441a(String str, C3441a c3441a) {
            this(str);
        }

        private C3441a(String str) {
            this();
            this.f11710b = str;
        }
    }

    public XtraBox(String str) {
        super(str);
        this.successfulParse = false;
        this.tags = new Vector<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setTagValue(String str, Date date) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_9, this, this, str, date));
        removeTag(str);
        C3441a c3441a = new C3441a(str, null);
        c3441a.f11711c.addElement(new C3442b(date, (C3442b) (0 == true ? 1 : 0)));
        this.tags.addElement(c3441a);
    }

    public void setTagValue(String str, String str2) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_8, this, this, str, str2));
        setTagValues(str, new String[]{str2});
    }
}
