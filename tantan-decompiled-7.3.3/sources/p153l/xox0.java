package p153l;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public abstract class xox0 implements fyr0 {

    /* JADX INFO: renamed from: j */
    public static final ipx0 f195611j = ipx0.m141544b(xox0.class);

    /* JADX INFO: renamed from: a */
    public final String f195612a;

    /* JADX INFO: renamed from: b */
    public gyr0 f195613b;

    /* JADX INFO: renamed from: e */
    public ByteBuffer f195616e;

    /* JADX INFO: renamed from: f */
    public long f195617f;

    /* JADX INFO: renamed from: h */
    public cpx0 f195619h;

    /* JADX INFO: renamed from: g */
    public long f195618g = -1;

    /* JADX INFO: renamed from: i */
    public ByteBuffer f195620i = null;

    /* JADX INFO: renamed from: d */
    public boolean f195615d = true;

    /* JADX INFO: renamed from: c */
    public boolean f195614c = true;

    public xox0(String str) {
        this.f195612a = str;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m212485a() {
        try {
            if (this.f195615d) {
                return;
            }
            try {
                ipx0 ipx0Var = f195611j;
                String str = this.f195612a;
                ipx0Var.mo117432a(str.length() != 0 ? "mem mapping ".concat(str) : new String("mem mapping "));
                this.f195616e = this.f195619h.mo111833c(this.f195617f, this.f195618g);
                this.f195615d = true;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p153l.fyr0
    /* JADX INFO: renamed from: b */
    public final void mo128123b(cpx0 cpx0Var, ByteBuffer byteBuffer, long j, cyr0 cyr0Var) throws IOException {
        this.f195617f = cpx0Var.zzb();
        byteBuffer.remaining();
        this.f195618g = j;
        this.f195619h = cpx0Var;
        cpx0Var.mo111835l(cpx0Var.zzb() + j);
        this.f195615d = false;
        this.f195614c = false;
        m212486e();
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo99380c(ByteBuffer byteBuffer);

    @Override // p153l.fyr0
    /* JADX INFO: renamed from: d */
    public final void mo128124d(gyr0 gyr0Var) {
        this.f195613b = gyr0Var;
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m212486e() {
        try {
            m212485a();
            ipx0 ipx0Var = f195611j;
            String str = this.f195612a;
            ipx0Var.mo117432a(str.length() != 0 ? "parsing details of ".concat(str) : new String("parsing details of "));
            ByteBuffer byteBuffer = this.f195616e;
            if (byteBuffer != null) {
                this.f195614c = true;
                byteBuffer.rewind();
                mo99380c(byteBuffer);
                if (byteBuffer.remaining() > 0) {
                    this.f195620i = byteBuffer.slice();
                }
                this.f195616e = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p153l.fyr0
    public final String zza() {
        return this.f195612a;
    }
}
