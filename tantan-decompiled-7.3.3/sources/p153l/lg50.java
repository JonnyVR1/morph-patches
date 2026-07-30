package p153l;

import com.google.android.exoplayer2.ParserException;
import java.io.IOException;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class lg50 {

    /* JADX INFO: renamed from: a */
    public int f131931a;

    /* JADX INFO: renamed from: b */
    public int f131932b;

    /* JADX INFO: renamed from: c */
    public long f131933c;

    /* JADX INFO: renamed from: d */
    public long f131934d;

    /* JADX INFO: renamed from: e */
    public long f131935e;

    /* JADX INFO: renamed from: f */
    public long f131936f;

    /* JADX INFO: renamed from: g */
    public int f131937g;

    /* JADX INFO: renamed from: h */
    public int f131938h;

    /* JADX INFO: renamed from: i */
    public int f131939i;

    /* JADX INFO: renamed from: j */
    public final int[] f131940j = new int[255];

    /* JADX INFO: renamed from: k */
    public final ig60 f131941k = new ig60(255);

    /* JADX INFO: renamed from: a */
    public boolean m154060a(asf asfVar, boolean z) throws IOException {
        m154061b();
        this.f131941k.m139804Q(27);
        if (!csf.m112177b(asfVar, this.f131941k.m139815e(), 0, 27, z) || this.f131941k.m139797J() != 1332176723) {
            return false;
        }
        int iM139795H = this.f131941k.m139795H();
        this.f131931a = iM139795H;
        if (iM139795H != 0) {
            if (z) {
                return false;
            }
            throw ParserException.createForUnsupportedContainerFeature("unsupported bit stream revision");
        }
        this.f131932b = this.f131941k.m139795H();
        this.f131933c = this.f131941k.m139832v();
        this.f131934d = this.f131941k.m139834x();
        this.f131935e = this.f131941k.m139834x();
        this.f131936f = this.f131941k.m139834x();
        int iM139795H2 = this.f131941k.m139795H();
        this.f131937g = iM139795H2;
        this.f131938h = iM139795H2 + 27;
        this.f131941k.m139804Q(iM139795H2);
        if (!csf.m112177b(asfVar, this.f131941k.m139815e(), 0, this.f131937g, z)) {
            return false;
        }
        for (int i = 0; i < this.f131937g; i++) {
            this.f131940j[i] = this.f131941k.m139795H();
            this.f131939i += this.f131940j[i];
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public void m154061b() {
        this.f131931a = 0;
        this.f131932b = 0;
        this.f131933c = 0L;
        this.f131934d = 0L;
        this.f131935e = 0L;
        this.f131936f = 0L;
        this.f131937g = 0;
        this.f131938h = 0;
        this.f131939i = 0;
    }

    /* JADX INFO: renamed from: c */
    public boolean m154062c(asf asfVar) throws IOException {
        return m154063d(asfVar, -1L);
    }

    /* JADX INFO: renamed from: d */
    public boolean m154063d(asf asfVar, long j) throws IOException {
        w11.m204365a(asfVar.getPosition() == asfVar.mo99903k());
        this.f131941k.m139804Q(4);
        while (true) {
            if ((j != -1 && asfVar.getPosition() + 4 >= j) || !csf.m112177b(asfVar, this.f131941k.m139815e(), 0, 4, true)) {
                break;
            }
            this.f131941k.m139808U(0);
            if (this.f131941k.m139797J() == 1332176723) {
                asfVar.mo99902h();
                return true;
            }
            asfVar.mo99905o(1);
        }
        do {
            if (j != -1 && asfVar.getPosition() >= j) {
                break;
            }
        } while (asfVar.skip(1) != -1);
        return false;
    }
}
