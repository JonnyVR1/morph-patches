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
import p153l.f3d0;
import p153l.fse;
import p153l.vtq0;

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
    Vector<C3464a> tags;

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
        int iM17445g = 0;
        for (int i = 0; i < this.tags.size(); i++) {
            iM17445g += this.tags.elementAt(i).m17445g();
        }
        return iM17445g;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long filetimeToMillis(long j) {
        return (j / FILETIME_ONE_MILLISECOND) - FILETIME_EPOCH_DIFF;
    }

    private C3464a getTagByName(String str) {
        for (C3464a c3464a : this.tags) {
            if (c3464a.f11747b.equals(str)) {
                return c3464a;
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
            vtq0.m202761a("Shouldn't happen", e);
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
            vtq0.m202761a("Shouldn't happen", e);
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
                    C3464a c3464a = new C3464a((C3464a) null);
                    c3464a.m17446h(byteBuffer);
                    this.tags.addElement(c3464a);
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
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_1, this, this));
        String[] strArr = new String[this.tags.size()];
        for (int i = 0; i < this.tags.size(); i++) {
            strArr[i] = this.tags.elementAt(i).f11747b;
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
                this.tags.elementAt(i).m17444f(byteBuffer);
            }
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return this.successfulParse ? detailSize() : this.data.limit();
    }

    public Date getFirstDateValue(String str) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_3, this, this, str));
        for (Object obj : getValues(str)) {
            if (obj instanceof Date) {
                return (Date) obj;
            }
        }
        return null;
    }

    public Long getFirstLongValue(String str) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_4, this, this, str));
        for (Object obj : getValues(str)) {
            if (obj instanceof Long) {
                return (Long) obj;
            }
        }
        return null;
    }

    public String getFirstStringValue(String str) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_2, this, this, str));
        for (Object obj : getValues(str)) {
            if (obj instanceof String) {
                return (String) obj;
            }
        }
        return null;
    }

    public Object[] getValues(String str) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_5, this, this, str));
        C3464a tagByName = getTagByName(str);
        if (tagByName == null) {
            return new Object[0];
        }
        Object[] objArr = new Object[tagByName.f11748c.size()];
        for (int i = 0; i < tagByName.f11748c.size(); i++) {
            objArr[i] = ((C3465b) tagByName.f11748c.elementAt(i)).m17453g();
        }
        return objArr;
    }

    public void removeTag(String str) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_6, this, this, str));
        C3464a tagByName = getTagByName(str);
        if (tagByName != null) {
            this.tags.remove(tagByName);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setTagValue(String str, long j) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_10, this, this, str, Conversions.longObject(j)));
        removeTag(str);
        C3464a c3464a = new C3464a(str, null);
        c3464a.f11748c.addElement(new C3465b(j, (C3465b) (0 == true ? 1 : 0)));
        this.tags.addElement(c3464a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setTagValues(String str, String[] strArr) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_7, this, this, str, strArr));
        removeTag(str);
        Object[] objArr = 0;
        C3464a c3464a = new C3464a(str, null);
        for (String str2 : strArr) {
            c3464a.f11748c.addElement(new C3465b(str2, (C3465b) (objArr == true ? 1 : 0)));
        }
        this.tags.addElement(c3464a);
    }

    public String toString() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_0, this, this));
        if (!isParsed()) {
            parseDetails();
        }
        StringBuffer stringBuffer = new StringBuffer("XtraBox[");
        for (C3464a c3464a : this.tags) {
            for (C3465b c3465b : c3464a.f11748c) {
                stringBuffer.append(c3464a.f11747b);
                stringBuffer.append("=");
                stringBuffer.append(c3465b.toString());
                stringBuffer.append(Constants.PACKNAME_END);
            }
        }
        stringBuffer.append(com.clevertap.android.sdk.Constants.AES_SUFFIX);
        return stringBuffer.toString();
    }

    /* JADX INFO: renamed from: com.googlecode.mp4parser.boxes.microsoft.XtraBox$b */
    public static class C3465b {

        /* JADX INFO: renamed from: a */
        public int f11749a;

        /* JADX INFO: renamed from: b */
        public String f11750b;

        /* JADX INFO: renamed from: c */
        public long f11751c;

        /* JADX INFO: renamed from: d */
        public byte[] f11752d;

        /* JADX INFO: renamed from: e */
        public Date f11753e;

        private C3465b(String str) {
            this.f11749a = 8;
            this.f11750b = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: e */
        public void m17451e(ByteBuffer byteBuffer) {
            try {
                byteBuffer.putInt(m17452f());
                byteBuffer.putShort((short) this.f11749a);
                byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
                int i = this.f11749a;
                if (i == 8) {
                    XtraBox.writeUtf16String(byteBuffer, this.f11750b);
                } else if (i == 19) {
                    byteBuffer.putLong(this.f11751c);
                } else if (i != 21) {
                    byteBuffer.put(this.f11752d);
                } else {
                    byteBuffer.putLong(XtraBox.millisToFiletime(this.f11753e.getTime()));
                }
            } finally {
                byteBuffer.order(ByteOrder.BIG_ENDIAN);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: f */
        public int m17452f() {
            int i = this.f11749a;
            if (i == 8) {
                return (this.f11750b.length() * 2) + 8;
            }
            if (i == 19 || i == 21) {
                return 14;
            }
            return this.f11752d.length + 6;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: g */
        public Object m17453g() {
            int i = this.f11749a;
            if (i == 8) {
                return this.f11750b;
            }
            if (i != 19) {
                return i != 21 ? this.f11752d : this.f11753e;
            }
            return new Long(this.f11751c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public void m17454h(ByteBuffer byteBuffer) {
            int i = byteBuffer.getInt() - 6;
            this.f11749a = byteBuffer.getShort();
            byteBuffer.order(ByteOrder.LITTLE_ENDIAN);
            int i2 = this.f11749a;
            if (i2 == 8) {
                this.f11750b = XtraBox.readUtf16String(byteBuffer, i);
            } else if (i2 == 19) {
                this.f11751c = byteBuffer.getLong();
            } else if (i2 != 21) {
                byte[] bArr = new byte[i];
                this.f11752d = bArr;
                byteBuffer.get(bArr);
            } else {
                this.f11753e = new Date(XtraBox.filetimeToMillis(byteBuffer.getLong()));
            }
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        public String toString() {
            int i = this.f11749a;
            if (i == 8) {
                return "[string]" + this.f11750b;
            }
            if (i == 19) {
                return "[long]" + String.valueOf(this.f11751c);
            }
            if (i != 21) {
                return "[GUID](nonParsed)";
            }
            return "[filetime]" + this.f11753e.toString();
        }

        public /* synthetic */ C3465b(C3465b c3465b) {
            this();
        }

        private C3465b() {
        }

        public /* synthetic */ C3465b(String str, C3465b c3465b) {
            this(str);
        }

        private C3465b(long j) {
            this.f11749a = 19;
            this.f11751c = j;
        }

        public /* synthetic */ C3465b(long j, C3465b c3465b) {
            this(j);
        }

        private C3465b(Date date) {
            this.f11749a = 21;
            this.f11753e = date;
        }

        public /* synthetic */ C3465b(Date date, C3465b c3465b) {
            this(date);
        }
    }

    /* JADX INFO: renamed from: com.googlecode.mp4parser.boxes.microsoft.XtraBox$a */
    public static class C3464a {

        /* JADX INFO: renamed from: a */
        private int f11746a;

        /* JADX INFO: renamed from: b */
        private String f11747b;

        /* JADX INFO: renamed from: c */
        private Vector<C3465b> f11748c;

        private C3464a() {
            this.f11748c = new Vector<>();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: f */
        public void m17444f(ByteBuffer byteBuffer) {
            byteBuffer.putInt(m17445g());
            byteBuffer.putInt(this.f11747b.length());
            XtraBox.writeAsciiString(byteBuffer, this.f11747b);
            byteBuffer.putInt(this.f11748c.size());
            for (int i = 0; i < this.f11748c.size(); i++) {
                this.f11748c.elementAt(i).m17451e(byteBuffer);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: g */
        public int m17445g() {
            int length = this.f11747b.length() + 12;
            for (int i = 0; i < this.f11748c.size(); i++) {
                length += this.f11748c.elementAt(i).m17452f();
            }
            return length;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public void m17446h(ByteBuffer byteBuffer) {
            this.f11746a = byteBuffer.getInt();
            this.f11747b = XtraBox.readAsciiString(byteBuffer, byteBuffer.getInt());
            int i = byteBuffer.getInt();
            for (int i2 = 0; i2 < i; i2++) {
                C3465b c3465b = new C3465b((C3465b) null);
                c3465b.m17454h(byteBuffer);
                this.f11748c.addElement(c3465b);
            }
            if (this.f11746a == m17445g()) {
                return;
            }
            fse.m127168a("Improperly handled Xtra tag: Sizes don't match ( ", this.f11746a, "/", m17445g(), ") on ", this.f11747b);
        }

        public String toString() {
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(this.f11747b);
            stringBuffer.append(" [");
            stringBuffer.append(this.f11746a);
            stringBuffer.append("/");
            stringBuffer.append(this.f11748c.size());
            stringBuffer.append("]:\n");
            for (int i = 0; i < this.f11748c.size(); i++) {
                stringBuffer.append("  ");
                stringBuffer.append(this.f11748c.elementAt(i).toString());
                stringBuffer.append(SignParameters.NEW_LINE);
            }
            return stringBuffer.toString();
        }

        public /* synthetic */ C3464a(C3464a c3464a) {
            this();
        }

        public /* synthetic */ C3464a(String str, C3464a c3464a) {
            this(str);
        }

        private C3464a(String str) {
            this();
            this.f11747b = str;
        }
    }

    public XtraBox(String str) {
        super(str);
        this.successfulParse = false;
        this.tags = new Vector<>();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setTagValue(String str, Date date) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_9, this, this, str, date));
        removeTag(str);
        C3464a c3464a = new C3464a(str, null);
        c3464a.f11748c.addElement(new C3465b(date, (C3465b) (0 == true ? 1 : 0)));
        this.tags.addElement(c3464a);
    }

    public void setTagValue(String str, String str2) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_8, this, this, str, str2));
        setTagValues(str, new String[]{str2});
    }
}
