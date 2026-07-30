package p149l;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes6.dex */
public abstract class rfx0 implements zor0 {

    /* JADX INFO: renamed from: j */
    public static final cgx0 f159208j = cgx0.m106844b(rfx0.class);

    /* JADX INFO: renamed from: a */
    public final String f159209a;

    /* JADX INFO: renamed from: b */
    public apr0 f159210b;

    /* JADX INFO: renamed from: e */
    public ByteBuffer f159213e;

    /* JADX INFO: renamed from: f */
    public long f159214f;

    /* JADX INFO: renamed from: h */
    public wfx0 f159216h;

    /* JADX INFO: renamed from: g */
    public long f159215g = -1;

    /* JADX INFO: renamed from: i */
    public ByteBuffer f159217i = null;

    /* JADX INFO: renamed from: d */
    public boolean f159212d = true;

    /* JADX INFO: renamed from: c */
    public boolean f159211c = true;

    public rfx0(String str) {
        this.f159209a = str;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m179148a() {
        try {
            if (this.f159212d) {
                return;
            }
            try {
                cgx0 cgx0Var = f159208j;
                String str = this.f159209a;
                cgx0Var.mo106845a(str.length() != 0 ? "mem mapping ".concat(str) : new String("mem mapping "));
                this.f159213e = this.f159216h.mo202995c(this.f159214f, this.f159215g);
                this.f159212d = true;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p149l.zor0
    /* JADX INFO: renamed from: b */
    public final void mo179149b(wfx0 wfx0Var, ByteBuffer byteBuffer, long j, wor0 wor0Var) throws IOException {
        this.f159214f = wfx0Var.zzb();
        byteBuffer.remaining();
        this.f159215g = j;
        this.f159216h = wfx0Var;
        wfx0Var.mo202997l(wfx0Var.zzb() + j);
        this.f159212d = false;
        this.f159211c = false;
        m179151e();
    }

    /* JADX INFO: renamed from: c */
    public abstract void mo108173c(ByteBuffer byteBuffer);

    @Override // p149l.zor0
    /* JADX INFO: renamed from: d */
    public final void mo179150d(apr0 apr0Var) {
        this.f159210b = apr0Var;
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m179151e() {
        try {
            m179148a();
            cgx0 cgx0Var = f159208j;
            String str = this.f159209a;
            cgx0Var.mo106845a(str.length() != 0 ? "parsing details of ".concat(str) : new String("parsing details of "));
            ByteBuffer byteBuffer = this.f159213e;
            if (byteBuffer != null) {
                this.f159211c = true;
                byteBuffer.rewind();
                mo108173c(byteBuffer);
                if (byteBuffer.remaining() > 0) {
                    this.f159217i = byteBuffer.slice();
                }
                this.f159213e = null;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p149l.zor0
    public final String zza() {
        return this.f159209a;
    }
}
