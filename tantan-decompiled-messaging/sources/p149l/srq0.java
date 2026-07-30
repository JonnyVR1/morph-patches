package p149l;

import android.text.TextUtils;
import com.xiaomi.push.service.C14842am;
import com.xiaomi.push.service.C14847ar;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.zip.Adler32;

/* JADX INFO: loaded from: classes2.dex */
class srq0 {

    /* JADX INFO: renamed from: a */
    private ByteBuffer f166123a = ByteBuffer.allocate(2048);

    /* JADX INFO: renamed from: b */
    private ByteBuffer f166124b = ByteBuffer.allocate(4);

    /* JADX INFO: renamed from: c */
    private Adler32 f166125c = new Adler32();

    /* JADX INFO: renamed from: d */
    private vrq0 f166126d = new vrq0();

    /* JADX INFO: renamed from: e */
    private InputStream f166127e;

    /* JADX INFO: renamed from: f */
    private xrq0 f166128f;

    /* JADX INFO: renamed from: g */
    private volatile boolean f166129g;

    /* JADX INFO: renamed from: h */
    private byte[] f166130h;

    public srq0(InputStream inputStream, xrq0 xrq0Var) {
        this.f166127e = new BufferedInputStream(inputStream);
        this.f166128f = xrq0Var;
    }

    /* JADX INFO: renamed from: a */
    private ByteBuffer m185698a() throws IOException {
        this.f166123a.clear();
        m185699d(this.f166123a, 8);
        short s = this.f166123a.getShort(0);
        short s2 = this.f166123a.getShort(2);
        if (s != -15618 || s2 != 5) {
            rhg0.m179353a("Malformed Input");
            return null;
        }
        int i = this.f166123a.getInt(4);
        int iPosition = this.f166123a.position();
        if (i > 32768) {
            rhg0.m179353a("Blob size too large");
            return null;
        }
        if (i + 4 > this.f166123a.remaining()) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i + 2048);
            byteBufferAllocate.put(this.f166123a.array(), 0, this.f166123a.arrayOffset() + this.f166123a.position());
            this.f166123a = byteBufferAllocate;
        } else if (this.f166123a.capacity() > 4096 && i < 2048) {
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(2048);
            byteBufferAllocate2.put(this.f166123a.array(), 0, this.f166123a.arrayOffset() + this.f166123a.position());
            this.f166123a = byteBufferAllocate2;
        }
        m185699d(this.f166123a, i);
        this.f166124b.clear();
        m185699d(this.f166124b, 4);
        this.f166124b.position(0);
        int i2 = this.f166124b.getInt();
        this.f166125c.reset();
        this.f166125c.update(this.f166123a.array(), 0, this.f166123a.position());
        if (i2 == ((int) this.f166125c.getValue())) {
            byte[] bArr = this.f166130h;
            if (bArr != null) {
                C14847ar.m86554a(bArr, this.f166123a.array(), true, iPosition, i);
            }
            return this.f166123a;
        }
        ilq0.m137040m("CRC = " + ((int) this.f166125c.getValue()) + " and " + i2);
        rhg0.m179353a("Corrupted Blob bad CRC");
        return null;
    }

    /* JADX INFO: renamed from: d */
    private void m185699d(ByteBuffer byteBuffer, int i) throws IOException {
        int iPosition = byteBuffer.position();
        do {
            int i2 = this.f166127e.read(byteBuffer.array(), iPosition, i);
            if (i2 == -1) {
                hg3.m130807a();
                return;
            } else {
                i -= i2;
                iPosition += i2;
            }
        } while (i > 0);
        byteBuffer.position(iPosition);
    }

    /* JADX INFO: renamed from: f */
    private void m185700f() throws IOException {
        boolean z = false;
        this.f166129g = false;
        qrq0 qrq0VarM185701b = m185701b();
        if ("CONN".equals(qrq0VarM185701b.m176085c())) {
            eqq0 eqq0VarM117761o = eqq0.m117761o(qrq0VarM185701b.m176096p());
            if (eqq0VarM117761o.m117767p()) {
                this.f166128f.m165889j(eqq0VarM117761o.m117762j());
                z = true;
            }
            if (eqq0VarM117761o.m117771t()) {
                aqq0 aqq0VarM117763k = eqq0VarM117761o.m117763k();
                qrq0 qrq0Var = new qrq0();
                qrq0Var.m176092l("SYNC", "CONF");
                qrq0Var.m176094n(aqq0VarM117763k.m215761h(), null);
                this.f166128f.m210708W(qrq0Var);
            }
            ilq0.m137040m("[Slim] CONN: host = " + eqq0VarM117761o.m117768q());
        }
        if (!z) {
            ilq0.m137040m("[Slim] Invalid CONN");
            rhg0.m179353a("Invalid Connection");
            return;
        }
        this.f166130h = this.f166128f.m210709X();
        while (!this.f166129g) {
            qrq0 qrq0VarM185701b2 = m185701b();
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.f166128f.m165879C();
            short sM176087g = qrq0VarM185701b2.m176087g();
            if (sM176087g == 1) {
                this.f166128f.m210708W(qrq0VarM185701b2);
            } else if (sM176087g != 2) {
                if (sM176087g != 3) {
                    ilq0.m137040m("[Slim] unknow blob type " + ((int) qrq0VarM185701b2.m176087g()));
                } else {
                    try {
                        this.f166128f.m210710Y(this.f166126d.m199749a(qrq0VarM185701b2.m176096p(), this.f166128f));
                    } catch (Exception e) {
                        ilq0.m137040m("[Slim] Parse packet from Blob chid=" + qrq0VarM185701b2.m176083a() + "; Id=" + qrq0VarM185701b2.m176080D() + " failure:" + e.getMessage());
                    }
                }
            } else if ("SECMSG".equals(qrq0VarM185701b2.m176085c()) && ((qrq0VarM185701b2.m176083a() == 2 || qrq0VarM185701b2.m176083a() == 3) && TextUtils.isEmpty(qrq0VarM185701b2.m176100t()))) {
                try {
                    atq0 atq0VarM199749a = this.f166126d.m199749a(qrq0VarM185701b2.m176097q(C14842am.m86505a().m86508a(Integer.valueOf(qrq0VarM185701b2.m176083a()).toString(), qrq0VarM185701b2.m176082F()).f62901h), this.f166128f);
                    atq0VarM199749a.f71670j = jCurrentTimeMillis;
                    this.f166128f.m210710Y(atq0VarM199749a);
                } catch (Exception e2) {
                    ilq0.m137040m("[Slim] Parse packet from Blob chid=" + qrq0VarM185701b2.m176083a() + "; Id=" + qrq0VarM185701b2.m176080D() + " failure:" + e2.getMessage());
                }
            } else {
                this.f166128f.m210708W(qrq0VarM185701b2);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public qrq0 m185701b() throws IOException {
        int iPosition;
        try {
            ByteBuffer byteBufferM185698a = m185698a();
            iPosition = byteBufferM185698a.position();
            try {
                byteBufferM185698a.flip();
                byteBufferM185698a.position(8);
                qrq0 wrq0Var = iPosition == 8 ? new wrq0() : qrq0.m176076e(byteBufferM185698a.slice());
                ilq0.m137053z("[Slim] Read {cmd=" + wrq0Var.m176085c() + ";chid=" + wrq0Var.m176083a() + ";len=" + iPosition + "}");
                return wrq0Var;
            } catch (IOException e) {
                e = e;
                if (iPosition == 0) {
                    iPosition = this.f166123a.position();
                }
                StringBuilder sb = new StringBuilder("[Slim] read Blob [");
                byte[] bArrArray = this.f166123a.array();
                if (iPosition > 128) {
                    iPosition = 128;
                }
                sb.append(fjq0.m121623a(bArrArray, 0, iPosition));
                sb.append("] Err:");
                sb.append(e.getMessage());
                ilq0.m137040m(sb.toString());
                throw e;
            }
        } catch (IOException e2) {
            e = e2;
            iPosition = 0;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m185702c() {
        try {
            m185700f();
        } catch (IOException e) {
            if (!this.f166129g) {
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m185703e() {
        this.f166129g = true;
    }
}
