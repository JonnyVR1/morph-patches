package p153l;

import android.text.TextUtils;
import com.xiaomi.push.service.C14990am;
import com.xiaomi.push.service.C14995ar;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.zip.Adler32;

/* JADX INFO: loaded from: classes2.dex */
class y0r0 {

    /* JADX INFO: renamed from: a */
    private ByteBuffer f197035a = ByteBuffer.allocate(2048);

    /* JADX INFO: renamed from: b */
    private ByteBuffer f197036b = ByteBuffer.allocate(4);

    /* JADX INFO: renamed from: c */
    private Adler32 f197037c = new Adler32();

    /* JADX INFO: renamed from: d */
    private b1r0 f197038d = new b1r0();

    /* JADX INFO: renamed from: e */
    private InputStream f197039e;

    /* JADX INFO: renamed from: f */
    private d1r0 f197040f;

    /* JADX INFO: renamed from: g */
    private volatile boolean f197041g;

    /* JADX INFO: renamed from: h */
    private byte[] f197042h;

    public y0r0(InputStream inputStream, d1r0 d1r0Var) {
        this.f197039e = new BufferedInputStream(inputStream);
        this.f197040f = d1r0Var;
    }

    /* JADX INFO: renamed from: a */
    private ByteBuffer m213899a() throws IOException {
        this.f197035a.clear();
        m213900d(this.f197035a, 8);
        short s = this.f197035a.getShort(0);
        short s2 = this.f197035a.getShort(2);
        if (s != -15618 || s2 != 5) {
            zpg0.m220844a("Malformed Input");
            return null;
        }
        int i = this.f197035a.getInt(4);
        int iPosition = this.f197035a.position();
        if (i > 32768) {
            zpg0.m220844a("Blob size too large");
            return null;
        }
        if (i + 4 > this.f197035a.remaining()) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i + 2048);
            byteBufferAllocate.put(this.f197035a.array(), 0, this.f197035a.arrayOffset() + this.f197035a.position());
            this.f197035a = byteBufferAllocate;
        } else if (this.f197035a.capacity() > 4096 && i < 2048) {
            ByteBuffer byteBufferAllocate2 = ByteBuffer.allocate(2048);
            byteBufferAllocate2.put(this.f197035a.array(), 0, this.f197035a.arrayOffset() + this.f197035a.position());
            this.f197035a = byteBufferAllocate2;
        }
        m213900d(this.f197035a, i);
        this.f197036b.clear();
        m213900d(this.f197036b, 4);
        this.f197036b.position(0);
        int i2 = this.f197036b.getInt();
        this.f197037c.reset();
        this.f197037c.update(this.f197035a.array(), 0, this.f197035a.position());
        if (i2 == ((int) this.f197037c.getValue())) {
            byte[] bArr = this.f197042h;
            if (bArr != null) {
                C14995ar.m87725a(bArr, this.f197035a.array(), true, iPosition, i);
            }
            return this.f197035a;
        }
        ouq0.m169393m("CRC = " + ((int) this.f197037c.getValue()) + " and " + i2);
        zpg0.m220844a("Corrupted Blob bad CRC");
        return null;
    }

    /* JADX INFO: renamed from: d */
    private void m213900d(ByteBuffer byteBuffer, int i) throws IOException {
        int iPosition = byteBuffer.position();
        do {
            int i2 = this.f197039e.read(byteBuffer.array(), iPosition, i);
            if (i2 == -1) {
                vg3.m201207a();
                return;
            } else {
                i -= i2;
                iPosition += i2;
            }
        } while (i > 0);
        byteBuffer.position(iPosition);
    }

    /* JADX INFO: renamed from: f */
    private void m213901f() throws IOException {
        boolean z = false;
        this.f197041g = false;
        w0r0 w0r0VarM213902b = m213902b();
        if ("CONN".equals(w0r0VarM213902b.m204322c())) {
            kzq0 kzq0VarM152213o = kzq0.m152213o(w0r0VarM213902b.m204332p());
            if (kzq0VarM152213o.m152219p()) {
                this.f197040f.m194100j(kzq0VarM152213o.m152214j());
                z = true;
            }
            if (kzq0VarM152213o.m152223t()) {
                gzq0 gzq0VarM152215k = kzq0VarM152213o.m152215k();
                w0r0 w0r0Var = new w0r0();
                w0r0Var.m204328l("SYNC", "CONF");
                w0r0Var.m204330n(gzq0VarM152215k.m118923h(), null);
                this.f197040f.m113623W(w0r0Var);
            }
            ouq0.m169393m("[Slim] CONN: host = " + kzq0VarM152213o.m152220q());
        }
        if (!z) {
            ouq0.m169393m("[Slim] Invalid CONN");
            zpg0.m220844a("Invalid Connection");
            return;
        }
        this.f197042h = this.f197040f.m113624X();
        while (!this.f197041g) {
            w0r0 w0r0VarM213902b2 = m213902b();
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.f197040f.m194092C();
            short sM204323g = w0r0VarM213902b2.m204323g();
            if (sM204323g == 1) {
                this.f197040f.m113623W(w0r0VarM213902b2);
            } else if (sM204323g != 2) {
                if (sM204323g != 3) {
                    ouq0.m169393m("[Slim] unknow blob type " + ((int) w0r0VarM213902b2.m204323g()));
                } else {
                    try {
                        this.f197040f.m113625Y(this.f197038d.m101501a(w0r0VarM213902b2.m204332p(), this.f197040f));
                    } catch (Exception e) {
                        ouq0.m169393m("[Slim] Parse packet from Blob chid=" + w0r0VarM213902b2.m204320a() + "; Id=" + w0r0VarM213902b2.m204317D() + " failure:" + e.getMessage());
                    }
                }
            } else if ("SECMSG".equals(w0r0VarM213902b2.m204322c()) && ((w0r0VarM213902b2.m204320a() == 2 || w0r0VarM213902b2.m204320a() == 3) && TextUtils.isEmpty(w0r0VarM213902b2.m204336t()))) {
                try {
                    g2r0 g2r0VarM101501a = this.f197038d.m101501a(w0r0VarM213902b2.m204333q(C14990am.m87676a().m87679a(Integer.valueOf(w0r0VarM213902b2.m204320a()).toString(), w0r0VarM213902b2.m204319F()).f63748h), this.f197040f);
                    g2r0VarM101501a.f101883j = jCurrentTimeMillis;
                    this.f197040f.m113625Y(g2r0VarM101501a);
                } catch (Exception e2) {
                    ouq0.m169393m("[Slim] Parse packet from Blob chid=" + w0r0VarM213902b2.m204320a() + "; Id=" + w0r0VarM213902b2.m204317D() + " failure:" + e2.getMessage());
                }
            } else {
                this.f197040f.m113623W(w0r0VarM213902b2);
            }
        }
    }

    /* JADX INFO: renamed from: b */
    public w0r0 m213902b() throws IOException {
        int iPosition;
        try {
            ByteBuffer byteBufferM213899a = m213899a();
            iPosition = byteBufferM213899a.position();
            try {
                byteBufferM213899a.flip();
                byteBufferM213899a.position(8);
                w0r0 c1r0Var = iPosition == 8 ? new c1r0() : w0r0.m204313e(byteBufferM213899a.slice());
                ouq0.m169406z("[Slim] Read {cmd=" + c1r0Var.m204322c() + ";chid=" + c1r0Var.m204320a() + ";len=" + iPosition + "}");
                return c1r0Var;
            } catch (IOException e) {
                e = e;
                if (iPosition == 0) {
                    iPosition = this.f197035a.position();
                }
                StringBuilder sb = new StringBuilder("[Slim] read Blob [");
                byte[] bArrArray = this.f197035a.array();
                if (iPosition > 128) {
                    iPosition = 128;
                }
                sb.append(ksq0.m151279a(bArrArray, 0, iPosition));
                sb.append("] Err:");
                sb.append(e.getMessage());
                ouq0.m169393m(sb.toString());
                throw e;
            }
        } catch (IOException e2) {
            e = e2;
            iPosition = 0;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m213903c() {
        try {
            m213901f();
        } catch (IOException e) {
            if (!this.f197041g) {
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public void m213904e() {
        this.f197041g = true;
    }
}
