package p149l;

import android.os.Build;
import com.xiaomi.push.C14739g;
import com.xiaomi.push.service.C14847ar;
import com.xiaomi.push.service.C14853ax;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.util.Locale;
import java.util.TimeZone;
import java.util.zip.Adler32;

/* JADX INFO: loaded from: classes2.dex */
public class trq0 {

    /* JADX INFO: renamed from: a */
    ByteBuffer f171834a = ByteBuffer.allocate(2048);

    /* JADX INFO: renamed from: b */
    private ByteBuffer f171835b = ByteBuffer.allocate(4);

    /* JADX INFO: renamed from: c */
    private Adler32 f171836c = new Adler32();

    /* JADX INFO: renamed from: d */
    private xrq0 f171837d;

    /* JADX INFO: renamed from: e */
    private OutputStream f171838e;

    /* JADX INFO: renamed from: f */
    private int f171839f;

    /* JADX INFO: renamed from: g */
    private int f171840g;

    /* JADX INFO: renamed from: h */
    private byte[] f171841h;

    public trq0(OutputStream outputStream, xrq0 xrq0Var) {
        this.f171838e = new BufferedOutputStream(outputStream);
        this.f171837d = xrq0Var;
        TimeZone timeZone = TimeZone.getDefault();
        this.f171839f = timeZone.getRawOffset() / 3600000;
        this.f171840g = timeZone.useDaylightTime() ? 1 : 0;
    }

    /* JADX INFO: renamed from: a */
    public int m190425a(qrq0 qrq0Var) {
        int iMo176104x = qrq0Var.mo176104x();
        if (iMo176104x > 32768) {
            ilq0.m137040m("Blob size=" + iMo176104x + " should be less than 32768 Drop blob chid=" + qrq0Var.m176083a() + " id=" + qrq0Var.m176080D());
            return 0;
        }
        this.f171834a.clear();
        int i = iMo176104x + 12;
        if (i > this.f171834a.capacity() || this.f171834a.capacity() > 4096) {
            this.f171834a = ByteBuffer.allocate(i);
        }
        this.f171834a.putShort((short) -15618);
        this.f171834a.putShort((short) 5);
        this.f171834a.putInt(iMo176104x);
        int iPosition = this.f171834a.position();
        this.f171834a = qrq0Var.mo176086d(this.f171834a);
        if (!"CONN".equals(qrq0Var.m176085c())) {
            if (this.f171841h == null) {
                this.f171841h = this.f171837d.m210709X();
            }
            C14847ar.m86554a(this.f171841h, this.f171834a.array(), true, iPosition, iMo176104x);
        }
        this.f171836c.reset();
        this.f171836c.update(this.f171834a.array(), 0, this.f171834a.position());
        this.f171835b.putInt(0, (int) this.f171836c.getValue());
        this.f171838e.write(this.f171834a.array(), 0, this.f171834a.position());
        this.f171838e.write(this.f171835b.array(), 0, 4);
        this.f171838e.flush();
        int iPosition2 = this.f171834a.position() + 4;
        ilq0.m137053z("[Slim] Wrote {cmd=" + qrq0Var.m176085c() + ";chid=" + qrq0Var.m176083a() + ";len=" + iPosition2 + "}");
        return iPosition2;
    }

    /* JADX INFO: renamed from: b */
    public void m190426b() {
        dqq0 dqq0Var = new dqq0();
        dqq0Var.m113124m(106);
        dqq0Var.m113125n(kvq0.m147391a());
        dqq0Var.m113133v(nwq0.m161881d());
        dqq0Var.m113099B(C14853ax.m86572a());
        dqq0Var.m113132u(48);
        dqq0Var.m113104G(this.f171837d.m165899t());
        dqq0Var.m113108K(this.f171837d.mo165884c());
        dqq0Var.m113112O(Locale.getDefault().toString());
        int i = Build.VERSION.SDK_INT;
        dqq0Var.m113098A(i);
        dqq0Var.m113103F(C14739g.m85582b(this.f171837d.m199894F(), "com.xiaomi.xmsf"));
        byte[] bArrMo86369a = this.f171837d.m165886f().mo86369a();
        if (bArrMo86369a != null) {
            dqq0Var.m113128q(aqq0.m98325m(bArrMo86369a));
        }
        qrq0 qrq0Var = new qrq0();
        qrq0Var.m176088h(0);
        qrq0Var.m176092l("CONN", null);
        qrq0Var.m176090j(0L, "xiaomi.com", null);
        qrq0Var.m176094n(dqq0Var.m215761h(), null);
        m190425a(qrq0Var);
        ilq0.m137040m("[slim] open conn: andver=" + i + " sdk=48 tz=" + this.f171839f + ":" + this.f171840g + " Model=" + kvq0.m147391a() + " os=" + Build.VERSION.INCREMENTAL);
    }

    /* JADX INFO: renamed from: c */
    public void m190427c() throws IOException {
        qrq0 qrq0Var = new qrq0();
        qrq0Var.m176092l("CLOSE", null);
        m190425a(qrq0Var);
        this.f171838e.close();
    }
}
