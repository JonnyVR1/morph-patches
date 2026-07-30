package p153l;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes6.dex */
public abstract class byr0 implements cyr0 {

    /* JADX INFO: renamed from: b */
    public static final Logger f79049b = Logger.getLogger(byr0.class.getName());

    /* JADX INFO: renamed from: a */
    public final ThreadLocal f79050a = new ayr0(this);

    @Override // p153l.cyr0
    /* JADX INFO: renamed from: a */
    public final fyr0 mo107032a(cpx0 cpx0Var, gyr0 gyr0Var) throws IOException {
        int iMo111834f0;
        long jZzc;
        long jZzb = cpx0Var.zzb();
        ((ByteBuffer) this.f79050a.get()).rewind().limit(8);
        do {
            iMo111834f0 = cpx0Var.mo111834f0((ByteBuffer) this.f79050a.get());
            byte[] bArr = null;
            if (iMo111834f0 == 8) {
                ((ByteBuffer) this.f79050a.get()).rewind();
                long jM123240e = eyr0.m123240e((ByteBuffer) this.f79050a.get());
                if (jM123240e < 8 && jM123240e > 1) {
                    Logger logger = f79049b;
                    Level level = Level.SEVERE;
                    StringBuilder sb = new StringBuilder(80);
                    sb.append("Plausibility check failed: size < 8 (size = ");
                    sb.append(jM123240e);
                    sb.append("). Stop parsing!");
                    logger.logp(level, "com.coremedia.iso.AbstractBoxParser", "parseBox", sb.toString());
                    return null;
                }
                byte[] bArr2 = new byte[4];
                ((ByteBuffer) this.f79050a.get()).get(bArr2);
                try {
                    String str = new String(bArr2, "ISO-8859-1");
                    if (jM123240e == 1) {
                        ((ByteBuffer) this.f79050a.get()).limit(16);
                        cpx0Var.mo111834f0((ByteBuffer) this.f79050a.get());
                        ((ByteBuffer) this.f79050a.get()).position(8);
                        jZzc = eyr0.m123241f((ByteBuffer) this.f79050a.get()) - 16;
                    } else {
                        jZzc = jM123240e == 0 ? cpx0Var.zzc() - cpx0Var.zzb() : jM123240e - 8;
                    }
                    if ("uuid".equals(str)) {
                        ((ByteBuffer) this.f79050a.get()).limit(((ByteBuffer) this.f79050a.get()).limit() + 16);
                        cpx0Var.mo111834f0((ByteBuffer) this.f79050a.get());
                        bArr = new byte[16];
                        for (int iPosition = ((ByteBuffer) this.f79050a.get()).position() - 16; iPosition < ((ByteBuffer) this.f79050a.get()).position(); iPosition++) {
                            bArr[iPosition - (((ByteBuffer) this.f79050a.get()).position() - 16)] = ((ByteBuffer) this.f79050a.get()).get(iPosition);
                        }
                        jZzc -= 16;
                    }
                    long j = jZzc;
                    fyr0 fyr0VarMo107033b = mo107033b(str, bArr, gyr0Var instanceof fyr0 ? ((fyr0) gyr0Var).zza() : "");
                    fyr0VarMo107033b.mo128124d(gyr0Var);
                    ((ByteBuffer) this.f79050a.get()).rewind();
                    fyr0VarMo107033b.mo128123b(cpx0Var, (ByteBuffer) this.f79050a.get(), j, this);
                    return fyr0VarMo107033b;
                } catch (UnsupportedEncodingException e) {
                    iig0.m140070a(e);
                    return null;
                }
            }
        } while (iMo111834f0 >= 0);
        cpx0Var.mo111835l(jZzb);
        vg3.m201207a();
        return null;
    }

    /* JADX INFO: renamed from: b */
    public abstract fyr0 mo107033b(String str, byte[] bArr, String str2);
}
