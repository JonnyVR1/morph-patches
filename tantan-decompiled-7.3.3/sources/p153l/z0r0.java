package p153l;

import android.os.Build;
import com.xiaomi.push.C14887g;
import com.xiaomi.push.service.C14995ar;
import com.xiaomi.push.service.C15001ax;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.TimeZone;
import java.util.zip.Adler32;

/* JADX INFO: loaded from: classes2.dex */
public class z0r0 {

    /* JADX INFO: renamed from: a */
    ByteBuffer f202370a = ByteBuffer.allocate(2048);

    /* JADX INFO: renamed from: b */
    private ByteBuffer f202371b = ByteBuffer.allocate(4);

    /* JADX INFO: renamed from: c */
    private Adler32 f202372c = new Adler32();

    /* JADX INFO: renamed from: d */
    private d1r0 f202373d;

    /* JADX INFO: renamed from: e */
    private OutputStream f202374e;

    /* JADX INFO: renamed from: f */
    private int f202375f;

    /* JADX INFO: renamed from: g */
    private int f202376g;

    /* JADX INFO: renamed from: h */
    private byte[] f202377h;

    public z0r0(OutputStream outputStream, d1r0 d1r0Var) {
        this.f202374e = new BufferedOutputStream(outputStream);
        this.f202373d = d1r0Var;
        TimeZone timeZone = TimeZone.getDefault();
        this.f202375f = timeZone.getRawOffset() / 3600000;
        this.f202376g = timeZone.useDaylightTime() ? 1 : 0;
    }

    /* JADX INFO: renamed from: a */
    public int m218148a(w0r0 w0r0Var) {
        int iMo107636x = w0r0Var.mo107636x();
        if (iMo107636x > 32768) {
            ouq0.m169393m("Blob size=" + iMo107636x + " should be less than 32768 Drop blob chid=" + w0r0Var.m204320a() + " id=" + w0r0Var.m204317D());
            return 0;
        }
        this.f202370a.clear();
        int i = iMo107636x + 12;
        if (i > this.f202370a.capacity() || this.f202370a.capacity() > 4096) {
            this.f202370a = ByteBuffer.allocate(i);
        }
        this.f202370a.putShort((short) -15618);
        this.f202370a.putShort((short) 5);
        this.f202370a.putInt(iMo107636x);
        int iPosition = this.f202370a.position();
        this.f202370a = w0r0Var.mo107635d(this.f202370a);
        if (!"CONN".equals(w0r0Var.m204322c())) {
            if (this.f202377h == null) {
                this.f202377h = this.f202373d.m113624X();
            }
            C14995ar.m87725a(this.f202377h, this.f202370a.array(), true, iPosition, iMo107636x);
        }
        this.f202372c.reset();
        this.f202372c.update(this.f202370a.array(), 0, this.f202370a.position());
        this.f202371b.putInt(0, (int) this.f202372c.getValue());
        this.f202374e.write(this.f202370a.array(), 0, this.f202370a.position());
        this.f202374e.write(this.f202371b.array(), 0, 4);
        this.f202374e.flush();
        int iPosition2 = this.f202370a.position() + 4;
        ouq0.m169406z("[Slim] Wrote {cmd=" + w0r0Var.m204322c() + ";chid=" + w0r0Var.m204320a() + ";len=" + iPosition2 + "}");
        return iPosition2;
    }

    /* JADX INFO: renamed from: b */
    public void m218149b() {
        jzq0 jzq0Var = new jzq0();
        jzq0Var.m147701m(106);
        jzq0Var.m147702n(q4r0.m175256a());
        jzq0Var.m147710v(t5r0.m189420d());
        jzq0Var.m147676B(C15001ax.m87743a());
        jzq0Var.m147709u(48);
        jzq0Var.m147681G(this.f202373d.m194106t());
        jzq0Var.m147685K(this.f202373d.mo102237c());
        jzq0Var.m147689O(Locale.getDefault().toString());
        int i = Build.VERSION.SDK_INT;
        jzq0Var.m147675A(i);
        jzq0Var.m147680F(C14887g.m86753b(this.f202373d.m102224F(), "com.xiaomi.xmsf"));
        byte[] bArrMo87540a = this.f202373d.m194098f().mo87540a();
        if (bArrMo87540a != null) {
            jzq0Var.m147705q(gzq0.m133108m(bArrMo87540a));
        }
        w0r0 w0r0Var = new w0r0();
        w0r0Var.m204324h(0);
        w0r0Var.m204328l("CONN", null);
        w0r0Var.m204326j(0L, "xiaomi.com", null);
        w0r0Var.m204330n(jzq0Var.m118923h(), null);
        m218148a(w0r0Var);
        ouq0.m169393m("[slim] open conn: andver=" + i + " sdk=48 tz=" + this.f202375f + ":" + this.f202376g + " Model=" + q4r0.m175256a() + " os=" + Build.VERSION.INCREMENTAL);
    }

    /* JADX INFO: renamed from: c */
    public void m218150c() throws IOException {
        w0r0 w0r0Var = new w0r0();
        w0r0Var.m204328l("CLOSE", null);
        m218148a(w0r0Var);
        this.f202374e.close();
    }
}
