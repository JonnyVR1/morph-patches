package p149l;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes6.dex */
public abstract class vor0 implements wor0 {

    /* JADX INFO: renamed from: b */
    public static final Logger f182413b = Logger.getLogger(vor0.class.getName());

    /* JADX INFO: renamed from: a */
    public final ThreadLocal f182414a = new uor0(this);

    @Override // p149l.wor0
    /* JADX INFO: renamed from: a */
    public final zor0 mo199194a(wfx0 wfx0Var, apr0 apr0Var) throws IOException {
        int iMo202996e0;
        long jZzc;
        long jZzb = wfx0Var.zzb();
        ((ByteBuffer) this.f182414a.get()).rewind().limit(8);
        do {
            iMo202996e0 = wfx0Var.mo202996e0((ByteBuffer) this.f182414a.get());
            byte[] bArr = null;
            if (iMo202996e0 == 8) {
                ((ByteBuffer) this.f182414a.get()).rewind();
                long jM215549e = yor0.m215549e((ByteBuffer) this.f182414a.get());
                if (jM215549e < 8 && jM215549e > 1) {
                    Logger logger = f182413b;
                    Level level = Level.SEVERE;
                    StringBuilder sb = new StringBuilder(80);
                    sb.append("Plausibility check failed: size < 8 (size = ");
                    sb.append(jM215549e);
                    sb.append("). Stop parsing!");
                    logger.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb.toString());
                    return null;
                }
                byte[] bArr2 = new byte[4];
                ((ByteBuffer) this.f182414a.get()).get(bArr2);
                try {
                    String str = new String(bArr2, "ISO-8859-1");
                    if (jM215549e == 1) {
                        ((ByteBuffer) this.f182414a.get()).limit(16);
                        wfx0Var.mo202996e0((ByteBuffer) this.f182414a.get());
                        ((ByteBuffer) this.f182414a.get()).position(8);
                        jZzc = yor0.m215550f((ByteBuffer) this.f182414a.get()) - 16;
                    } else {
                        jZzc = jM215549e == 0 ? wfx0Var.zzc() - wfx0Var.zzb() : jM215549e - 8;
                    }
                    if ("uuid".equals(str)) {
                        ((ByteBuffer) this.f182414a.get()).limit(((ByteBuffer) this.f182414a.get()).limit() + 16);
                        wfx0Var.mo202996e0((ByteBuffer) this.f182414a.get());
                        bArr = new byte[16];
                        for (int iPosition = ((ByteBuffer) this.f182414a.get()).position() - 16; iPosition < ((ByteBuffer) this.f182414a.get()).position(); iPosition++) {
                            bArr[iPosition - (((ByteBuffer) this.f182414a.get()).position() - 16)] = ((ByteBuffer) this.f182414a.get()).get(iPosition);
                        }
                        jZzc -= 16;
                    }
                    long j = jZzc;
                    zor0 zor0VarMo100699b = mo100699b(str, bArr, apr0Var instanceof zor0 ? ((zor0) apr0Var).zza() : "");
                    zor0VarMo100699b.mo179150d(apr0Var);
                    ((ByteBuffer) this.f182414a.get()).rewind();
                    zor0VarMo100699b.mo179149b(wfx0Var, (ByteBuffer) this.f182414a.get(), j, this);
                    return zor0VarMo100699b;
                } catch (UnsupportedEncodingException e) {
                    aag0.m95543a(e);
                    return null;
                }
            }
        } while (iMo202996e0 >= 0);
        wfx0Var.mo202997l(jZzb);
        hg3.m130807a();
        return null;
    }

    /* JADX INFO: renamed from: b */
    public abstract zor0 mo100699b(String str, byte[] bArr, String str2);
}
