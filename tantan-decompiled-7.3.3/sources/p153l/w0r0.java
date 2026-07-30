package p153l;

import android.text.TextUtils;
import com.xiaomi.push.service.C14987aj;
import com.xiaomi.push.service.C14995ar;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class w0r0 {

    /* JADX INFO: renamed from: g */
    private static String f186709g = n2r0.m161248a(5) + "-";

    /* JADX INFO: renamed from: h */
    private static long f186710h = 0;

    /* JADX INFO: renamed from: i */
    private static final byte[] f186711i = new byte[0];

    /* JADX INFO: renamed from: a */
    private fzq0 f186712a;

    /* JADX INFO: renamed from: b */
    private short f186713b;

    /* JADX INFO: renamed from: c */
    private byte[] f186714c;

    /* JADX INFO: renamed from: d */
    String f186715d;

    /* JADX INFO: renamed from: e */
    int f186716e;

    /* JADX INFO: renamed from: f */
    private final long f186717f;

    public w0r0() {
        this.f186713b = (short) 2;
        this.f186714c = f186711i;
        this.f186715d = null;
        this.f186717f = System.currentTimeMillis();
        this.f186712a = new fzq0();
        this.f186716e = 1;
    }

    /* JADX INFO: renamed from: C */
    public static synchronized String m204312C() {
        StringBuilder sb;
        sb = new StringBuilder();
        sb.append(f186709g);
        long j = f186710h;
        f186710h = 1 + j;
        sb.append(Long.toString(j));
        return sb.toString();
    }

    /* JADX INFO: renamed from: e */
    public static w0r0 m204313e(ByteBuffer byteBuffer) throws IOException {
        try {
            ByteBuffer byteBufferSlice = byteBuffer.slice();
            short s = byteBufferSlice.getShort(0);
            short s2 = byteBufferSlice.getShort(2);
            int i = byteBufferSlice.getInt(4);
            fzq0 fzq0Var = new fzq0();
            fzq0Var.m118919d(byteBufferSlice.array(), byteBufferSlice.arrayOffset() + 8, s2);
            byte[] bArr = new byte[i];
            byteBufferSlice.position(s2 + 8);
            byteBufferSlice.get(bArr, 0, i);
            return new w0r0(fzq0Var, s, bArr);
        } catch (Exception e) {
            ouq0.m169393m("read Blob err :" + e.getMessage());
            zpg0.m220844a("Malformed Input");
            return null;
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: f */
    public static w0r0 m204314f(g2r0 g2r0Var, String str) {
        int i;
        w0r0 w0r0Var = new w0r0();
        try {
            i = Integer.parseInt(g2r0Var.m128649m());
        } catch (Exception e) {
            ouq0.m169393m("Blob parse chid err " + e.getMessage());
            i = 1;
        }
        w0r0Var.m204324h(i);
        w0r0Var.m204327k(g2r0Var.m128648l());
        w0r0Var.m204316B(g2r0Var.m128653q());
        w0r0Var.m204338v(g2r0Var.m128655s());
        w0r0Var.m204328l("XMLMSG", null);
        try {
            w0r0Var.m204330n(g2r0Var.mo86749d().getBytes("utf8"), str);
            if (TextUtils.isEmpty(str)) {
                w0r0Var.m204329m((short) 3);
            } else {
                w0r0Var.m204329m((short) 2);
                w0r0Var.m204328l("SECMSG", null);
            }
        } catch (UnsupportedEncodingException e2) {
            ouq0.m169393m("Blob setPayload err： " + e2.getMessage());
        }
        return w0r0Var;
    }

    /* JADX INFO: renamed from: A */
    public void m204315A(long j) {
        this.f186712a.m128236B(j);
    }

    /* JADX INFO: renamed from: B */
    public void m204316B(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        int iIndexOf = str.indexOf("@");
        try {
            long j = Long.parseLong(str.substring(0, iIndexOf));
            int iIndexOf2 = str.indexOf("/", iIndexOf);
            String strSubstring = str.substring(iIndexOf + 1, iIndexOf2);
            String strSubstring2 = str.substring(iIndexOf2 + 1);
            this.f186712a.m128263n(j);
            this.f186712a.m128264o(strSubstring);
            this.f186712a.m128271v(strSubstring2);
        } catch (Exception e) {
            ouq0.m169393m("Blob parse user err " + e.getMessage());
        }
    }

    /* JADX INFO: renamed from: D */
    public String m204317D() {
        String strM128245K = this.f186712a.m128245K();
        if ("ID_NOT_AVAILABLE".equals(strM128245K)) {
            return null;
        }
        if (this.f186712a.m128252R()) {
            return strM128245K;
        }
        String strM204312C = m204312C();
        this.f186712a.m128246L(strM204312C);
        return strM204312C;
    }

    /* JADX INFO: renamed from: E */
    public String m204318E() {
        return this.f186715d;
    }

    /* JADX INFO: renamed from: F */
    public String m204319F() {
        if (!this.f186712a.m128272w()) {
            return null;
        }
        return Long.toString(this.f186712a.m128259j()) + "@" + this.f186712a.m128260k() + "/" + this.f186712a.m128268s();
    }

    /* JADX INFO: renamed from: a */
    public int m204320a() {
        return this.f186712a.m128273x();
    }

    /* JADX INFO: renamed from: b */
    public long m204321b() {
        return this.f186717f;
    }

    /* JADX INFO: renamed from: c */
    public String m204322c() {
        return this.f186712a.m128275z();
    }

    /* JADX INFO: renamed from: d */
    public ByteBuffer mo107635d(ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            byteBuffer = ByteBuffer.allocate(mo107636x());
        }
        byteBuffer.putShort(this.f186713b);
        byteBuffer.putShort((short) this.f186712a.mo118916a());
        byteBuffer.putInt(this.f186714c.length);
        int iPosition = byteBuffer.position();
        this.f186712a.m118921f(byteBuffer.array(), byteBuffer.arrayOffset() + iPosition, this.f186712a.mo118916a());
        byteBuffer.position(iPosition + this.f186712a.mo118916a());
        byteBuffer.put(this.f186714c);
        return byteBuffer;
    }

    /* JADX INFO: renamed from: g */
    public short m204323g() {
        return this.f186713b;
    }

    /* JADX INFO: renamed from: h */
    public void m204324h(int i) {
        this.f186712a.m128262m(i);
    }

    /* JADX INFO: renamed from: i */
    public void m204325i(long j) {
        this.f186712a.m128263n(j);
    }

    /* JADX INFO: renamed from: j */
    public void m204326j(long j, String str, String str2) {
        if (j != 0) {
            this.f186712a.m128263n(j);
        }
        if (!TextUtils.isEmpty(str)) {
            this.f186712a.m128264o(str);
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.f186712a.m128271v(str2);
    }

    /* JADX INFO: renamed from: k */
    public void m204327k(String str) {
        this.f186712a.m128246L(str);
    }

    /* JADX INFO: renamed from: l */
    public void m204328l(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            wg3.m206174a("command should not be empty");
            return;
        }
        this.f186712a.m128237C(str);
        this.f186712a.m128261l();
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        this.f186712a.m128242H(str2);
    }

    /* JADX INFO: renamed from: m */
    public void m204329m(short s) {
        this.f186713b = s;
    }

    /* JADX INFO: renamed from: n */
    public void m204330n(byte[] bArr, String str) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        fzq0 fzq0Var = this.f186712a;
        if (zIsEmpty) {
            fzq0Var.m128235A(0);
            this.f186714c = bArr;
        } else {
            fzq0Var.m128235A(1);
            this.f186714c = C14995ar.m87724a(C14995ar.m87722a(str, m204317D()), bArr);
        }
    }

    /* JADX INFO: renamed from: o */
    public boolean m204331o() {
        return this.f186712a.m128255U();
    }

    /* JADX INFO: renamed from: p */
    public byte[] m204332p() {
        return x0r0.m208891a(this, this.f186714c);
    }

    /* JADX INFO: renamed from: q */
    public byte[] m204333q(String str) {
        if (this.f186712a.m128244J() == 1) {
            return x0r0.m208891a(this, C14995ar.m87724a(C14995ar.m87722a(str, m204317D()), this.f186714c));
        }
        if (this.f186712a.m128244J() == 0) {
            return x0r0.m208891a(this, this.f186714c);
        }
        ouq0.m169393m("unknow cipher = " + this.f186712a.m128244J());
        return x0r0.m208891a(this, this.f186714c);
    }

    /* JADX INFO: renamed from: r */
    public int m204334r() {
        return this.f186712a.m128248N();
    }

    /* JADX INFO: renamed from: s */
    public long m204335s() {
        return this.f186712a.m128267r();
    }

    /* JADX INFO: renamed from: t */
    public String m204336t() {
        return this.f186712a.m128240F();
    }

    public String toString() {
        return "Blob [chid=" + m204320a() + "; Id=" + C14987aj.m87667a(m204317D()) + "; cmd=" + m204322c() + "; type=" + ((int) m204323g()) + "; from=" + m204319F() + " ]";
    }

    /* JADX INFO: renamed from: u */
    public void m204337u(long j) {
        this.f186712a.m128270u(j);
    }

    /* JADX INFO: renamed from: v */
    public void m204338v(String str) {
        this.f186715d = str;
    }

    /* JADX INFO: renamed from: w */
    public boolean m204339w() {
        return this.f186712a.m128257W();
    }

    /* JADX INFO: renamed from: x */
    public int mo107636x() {
        return this.f186712a.mo118924i() + 8 + this.f186714c.length;
    }

    /* JADX INFO: renamed from: y */
    public long m204340y() {
        return this.f186712a.m128259j();
    }

    /* JADX INFO: renamed from: z */
    public String m204341z() {
        return this.f186712a.m128249O();
    }

    public w0r0(fzq0 fzq0Var, short s, byte[] bArr) {
        this.f186713b = (short) 2;
        this.f186714c = f186711i;
        this.f186715d = null;
        this.f186717f = System.currentTimeMillis();
        this.f186712a = fzq0Var;
        this.f186713b = s;
        this.f186714c = bArr;
        this.f186716e = 2;
    }
}
