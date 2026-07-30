package p149l;

import android.text.TextUtils;
import com.xiaomi.push.service.C14839aj;
import com.xiaomi.push.service.C14847ar;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class qrq0 {

    /* JADX INFO: renamed from: g */
    private static String f156025g = htq0.m132932a(5) + "-";

    /* JADX INFO: renamed from: h */
    private static long f156026h = 0;

    /* JADX INFO: renamed from: i */
    private static final byte[] f156027i = new byte[0];

    /* JADX INFO: renamed from: a */
    private zpq0 f156028a;

    /* JADX INFO: renamed from: b */
    private short f156029b;

    /* JADX INFO: renamed from: c */
    private byte[] f156030c;

    /* JADX INFO: renamed from: d */
    String f156031d;

    /* JADX INFO: renamed from: e */
    int f156032e;

    /* JADX INFO: renamed from: f */
    private final long f156033f;

    public qrq0() {
        this.f156029b = (short) 2;
        this.f156030c = f156027i;
        this.f156031d = null;
        this.f156033f = System.currentTimeMillis();
        this.f156028a = new zpq0();
        this.f156032e = 1;
    }

    /* JADX INFO: renamed from: C */
    public static synchronized String m176075C() {
        StringBuilder sb;
        sb = new StringBuilder();
        sb.append(f156025g);
        long j = f156026h;
        f156026h = 1 + j;
        sb.append(Long.toString(j));
        return sb.toString();
    }

    /* JADX INFO: renamed from: e */
    public static qrq0 m176076e(ByteBuffer byteBuffer) throws IOException {
        try {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            short s = byteBufferSlice.getShort(0);
            short s2 = byteBufferSlice.getShort(2);
            int i = byteBufferSlice.getInt(4);
            zpq0 zpq0Var = new zpq0();
            zpq0Var.m215758d(byteBufferSlice.array(), byteBufferSlice.arrayOffset() + 8, s2);
            byte[] bArr = new byte[i];
            byteBufferSlice.position(s2 + 8);
            byteBufferSlice.get(bArr, 0, i);
            return new qrq0(zpq0Var, s, bArr);
        } catch (Exception e) {
            ilq0.m137040m("read Blob err :" + e.getMessage());
            rhg0.m179353a("Malformed Input");
            return null;
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: f */
    public static qrq0 m176077f(atq0 atq0Var, String str) {
        int i;
        qrq0 qrq0Var = new qrq0();
        try {
            i = Integer.parseInt(atq0Var.m98867m());
        } catch (Exception e) {
            ilq0.m137040m("Blob parse chid err " + e.getMessage());
            i = 1;
        }
        qrq0Var.m176088h(i);
        qrq0Var.m176091k(atq0Var.m98866l());
        qrq0Var.m176079B(atq0Var.m98871q());
        qrq0Var.m176102v(atq0Var.m98873s());
        qrq0Var.m176092l("XMLMSG", null);
        try {
            qrq0Var.m176094n(atq0Var.mo85578d().getBytes("utf8"), str);
            if (TextUtils.isEmpty(str)) {
                qrq0Var.m176093m((short) 3);
            } else {
                qrq0Var.m176093m((short) 2);
                qrq0Var.m176092l("SECMSG", null);
            }
        } catch (UnsupportedEncodingException e2) {
            ilq0.m137040m("Blob setPayload err： " + e2.getMessage());
        }
        return qrq0Var;
    }

    /* JADX INFO: renamed from: A */
    public void m176078A(long j) {
        this.f156028a.m219701B(j);
    }

    /* JADX INFO: renamed from: B */
    public void m176079B(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int iIndexOf = str.indexOf("@");
        try {
            long j = Long.parseLong(str.substring(0, iIndexOf));
            int iIndexOf2 = str.indexOf("/", iIndexOf);
            String strSubstring = str.substring(iIndexOf + 1, iIndexOf2);
            String strSubstring2 = str.substring(iIndexOf2 + 1);
            this.f156028a.m219728n(j);
            this.f156028a.m219729o(strSubstring);
            this.f156028a.m219736v(strSubstring2);
        } catch (Exception e) {
            ilq0.m137040m("Blob parse user err " + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: D */
    public String m176080D() {
        String strM219710K = this.f156028a.m219710K();
        if ("ID_NOT_AVAILABLE".equals(strM219710K)) {
            return null;
        }
        if (this.f156028a.m219717R()) {
            return strM219710K;
        }
        String strM176075C = m176075C();
        this.f156028a.m219711L(strM176075C);
        return strM176075C;
    }

    /* JADX INFO: renamed from: E */
    public String m176081E() {
        return this.f156031d;
    }

    /* JADX INFO: renamed from: F */
    public String m176082F() {
        if (!this.f156028a.m219737w()) {
            return null;
        }
        return Long.toString(this.f156028a.m219724j()) + "@" + this.f156028a.m219725k() + "/" + this.f156028a.m219733s();
    }

    /* JADX INFO: renamed from: a */
    public int m176083a() {
        return this.f156028a.m219738x();
    }

    /* JADX INFO: renamed from: b */
    public long m176084b() {
        return this.f156033f;
    }

    /* JADX INFO: renamed from: c */
    public String m176085c() {
        return this.f156028a.m219740z();
    }

    /* JADX INFO: renamed from: d */
    public ByteBuffer mo176086d(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            byteBuffer = ByteBuffer.allocate(mo176104x());
        }
        byteBuffer.putShort(this.f156029b);
        byteBuffer.putShort((short) this.f156028a.mo98326a());
        byteBuffer.putInt(this.f156030c.length);
        int iPosition = byteBuffer.position();
        this.f156028a.m215759f(byteBuffer.array(), byteBuffer.arrayOffset() + iPosition, this.f156028a.mo98326a());
        byteBuffer.position(iPosition + this.f156028a.mo98326a());
        byteBuffer.put(this.f156030c);
        return byteBuffer;
    }

    /* JADX INFO: renamed from: g */
    public short m176087g() {
        return this.f156029b;
    }

    /* JADX INFO: renamed from: h */
    public void m176088h(int i) {
        this.f156028a.m219727m(i);
    }

    /* JADX INFO: renamed from: i */
    public void m176089i(long j) {
        this.f156028a.m219728n(j);
    }

    /* JADX INFO: renamed from: j */
    public void m176090j(long j, String str, String str2) {
        if (j != 0) {
            this.f156028a.m219728n(j);
        }
        if (!TextUtils.isEmpty(str)) {
            this.f156028a.m219729o(str);
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.f156028a.m219736v(str2);
    }

    /* JADX INFO: renamed from: k */
    public void m176091k(String str) {
        this.f156028a.m219711L(str);
    }

    /* JADX INFO: renamed from: l */
    public void m176092l(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            ig3.m135964a("command should not be empty");
            return;
        }
        this.f156028a.m219702C(str);
        this.f156028a.m219726l();
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.f156028a.m219707H(str2);
    }

    /* JADX INFO: renamed from: m */
    public void m176093m(short s) {
        this.f156029b = s;
    }

    /* JADX INFO: renamed from: n */
    public void m176094n(byte[] bArr, String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        zpq0 zpq0Var = this.f156028a;
        if (zIsEmpty) {
            zpq0Var.m219700A(0);
            this.f156030c = bArr;
        } else {
            zpq0Var.m219700A(1);
            this.f156030c = C14847ar.m86553a(C14847ar.m86551a(str, m176080D()), bArr);
        }
    }

    /* JADX INFO: renamed from: o */
    public boolean m176095o() {
        return this.f156028a.m219720U();
    }

    /* JADX INFO: renamed from: p */
    public byte[] m176096p() {
        return rrq0.m180567a(this, this.f156030c);
    }

    /* JADX INFO: renamed from: q */
    public byte[] m176097q(String str) {
        if (this.f156028a.m219709J() == 1) {
            return rrq0.m180567a(this, C14847ar.m86553a(C14847ar.m86551a(str, m176080D()), this.f156030c));
        }
        if (this.f156028a.m219709J() == 0) {
            return rrq0.m180567a(this, this.f156030c);
        }
        ilq0.m137040m("unknow cipher = " + this.f156028a.m219709J());
        return rrq0.m180567a(this, this.f156030c);
    }

    /* JADX INFO: renamed from: r */
    public int m176098r() {
        return this.f156028a.m219713N();
    }

    /* JADX INFO: renamed from: s */
    public long m176099s() {
        return this.f156028a.m219732r();
    }

    /* JADX INFO: renamed from: t */
    public String m176100t() {
        return this.f156028a.m219705F();
    }

    public String toString() {
        return "Blob [chid=" + m176083a() + "; Id=" + C14839aj.m86496a(m176080D()) + "; cmd=" + m176085c() + "; type=" + ((int) m176087g()) + "; from=" + m176082F() + " ]";
    }

    /* JADX INFO: renamed from: u */
    public void m176101u(long j) {
        this.f156028a.m219735u(j);
    }

    /* JADX INFO: renamed from: v */
    public void m176102v(String str) {
        this.f156031d = str;
    }

    /* JADX INFO: renamed from: w */
    public boolean m176103w() {
        return this.f156028a.m219722W();
    }

    /* JADX INFO: renamed from: x */
    public int mo176104x() {
        return this.f156028a.mo98329i() + 8 + this.f156030c.length;
    }

    /* JADX INFO: renamed from: y */
    public long m176105y() {
        return this.f156028a.m219724j();
    }

    /* JADX INFO: renamed from: z */
    public String m176106z() {
        return this.f156028a.m219714O();
    }

    public qrq0(zpq0 zpq0Var, short s, byte[] bArr) {
        this.f156029b = (short) 2;
        this.f156030c = f156027i;
        this.f156031d = null;
        this.f156033f = System.currentTimeMillis();
        this.f156028a = zpq0Var;
        this.f156029b = s;
        this.f156030c = bArr;
        this.f156032e = 2;
    }
}
