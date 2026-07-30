package p149l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1871k;
import com.google.android.exoplayer2.ParserException;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class bmp0 implements sqf {

    /* JADX INFO: renamed from: g */
    public static final Pattern f76293g = Pattern.compile("LOCAL:([^,]+)");

    /* JADX INFO: renamed from: h */
    public static final Pattern f76294h = Pattern.compile("MPEGTS:(-?\\d+)");

    /* JADX INFO: renamed from: a */
    @Nullable
    public final String f76295a;

    /* JADX INFO: renamed from: b */
    public final eri0 f76296b;

    /* JADX INFO: renamed from: d */
    public uqf f76298d;

    /* JADX INFO: renamed from: f */
    public int f76300f;

    /* JADX INFO: renamed from: c */
    public final d860 f76297c = new d860();

    /* JADX INFO: renamed from: e */
    public byte[] f76299e = new byte[1024];

    public bmp0(@Nullable String str, eri0 eri0Var) {
        this.f76295a = str;
        this.f76296b = eri0Var;
    }

    @Override // p149l.sqf
    /* JADX INFO: renamed from: a */
    public void mo10975a(long j, long j2) {
        throw new IllegalStateException();
    }

    @Override // p149l.sqf
    /* JADX INFO: renamed from: b */
    public void mo10976b(uqf uqfVar) {
        this.f76298d = uqfVar;
        uqfVar.mo11370k(new hce0.C17275b(-9223372036854775807L));
    }

    @RequiresNonNull({"output"})
    /* JADX INFO: renamed from: c */
    public final m6j0 m102658c(long j) {
        m6j0 m6j0VarMo11362b = this.f76298d.mo11362b(0, 3);
        m6j0VarMo11362b.mo11110b(new C1871k.b().m10346g0("text/vtt").m10337X(this.f76295a).m10350k0(j).m10320G());
        this.f76298d.mo11371l();
        return m6j0VarMo11362b;
    }

    @RequiresNonNull({"output"})
    /* JADX INFO: renamed from: d */
    public final void m102659d() throws ParserException {
        d860 d860Var = new d860(this.f76299e);
        cmp0.m107691e(d860Var);
        long jM117833g = 0;
        long jM107690d = 0;
        for (String strM110313s = d860Var.m110313s(); !TextUtils.isEmpty(strM110313s); strM110313s = d860Var.m110313s()) {
            if (strM110313s.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher = f76293g.matcher(strM110313s);
                if (!matcher.find()) {
                    throw ParserException.createForMalformedContainer("X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(strM110313s), null);
                }
                Matcher matcher2 = f76294h.matcher(strM110313s);
                if (!matcher2.find()) {
                    throw ParserException.createForMalformedContainer("X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(strM110313s), null);
                }
                jM107690d = cmp0.m107690d((String) p11.m167011e(matcher.group(1)));
                jM117833g = eri0.m117833g(Long.parseLong((String) p11.m167011e(matcher2.group(1))));
            }
        }
        Matcher matcherM107687a = cmp0.m107687a(d860Var);
        if (matcherM107687a == null) {
            m102658c(0L);
            return;
        }
        long jM107690d2 = cmp0.m107690d((String) p11.m167011e(matcherM107687a.group(1)));
        long jM117837b = this.f76296b.m117837b(eri0.m117835k((jM117833g + jM107690d2) - jM107690d));
        m6j0 m6j0VarM102658c = m102658c(jM117837b - jM107690d2);
        this.f76297c.m110290S(this.f76299e, this.f76300f);
        m6j0VarM102658c.m153238d(this.f76297c, this.f76300f);
        m6j0VarM102658c.mo11109a(jM117837b, 1, this.f76300f, 0, null);
    }

    @Override // p149l.sqf
    /* JADX INFO: renamed from: f */
    public boolean mo10977f(tqf tqfVar) throws IOException {
        tqfVar.mo150656g(this.f76299e, 0, 6, false);
        this.f76297c.m110290S(this.f76299e, 6);
        if (cmp0.m107688b(this.f76297c)) {
            return true;
        }
        tqfVar.mo150656g(this.f76299e, 6, 3, false);
        this.f76297c.m110290S(this.f76299e, 9);
        return cmp0.m107688b(this.f76297c);
    }

    @Override // p149l.sqf
    /* JADX INFO: renamed from: h */
    public int mo10978h(tqf tqfVar, fd80 fd80Var) throws IOException {
        p11.m167011e(this.f76298d);
        int length = (int) tqfVar.getLength();
        int i = this.f76300f;
        byte[] bArr = this.f76299e;
        if (i == bArr.length) {
            this.f76299e = Arrays.copyOf(bArr, ((length != -1 ? length : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.f76299e;
        int i2 = this.f76300f;
        int i3 = tqfVar.read(bArr2, i2, bArr2.length - i2);
        if (i3 != -1) {
            int i4 = this.f76300f + i3;
            this.f76300f = i4;
            if (length == -1 || i4 != length) {
                return 0;
            }
        }
        m102659d();
        return -1;
    }

    @Override // p149l.sqf
    public void release() {
    }
}
