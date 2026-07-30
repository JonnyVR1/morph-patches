package p153l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1894k;
import com.google.android.exoplayer2.ParserException;
import java.io.IOException;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class fvp0 implements zrf {

    /* JADX INFO: renamed from: g */
    public static final Pattern f101074g = Pattern.compile("LOCAL:([^,]+)");

    /* JADX INFO: renamed from: h */
    public static final Pattern f101075h = Pattern.compile("MPEGTS:(-?\\d+)");

    /* JADX INFO: renamed from: a */
    @Nullable
    public final String f101076a;

    /* JADX INFO: renamed from: b */
    public final h0j0 f101077b;

    /* JADX INFO: renamed from: d */
    public bsf f101079d;

    /* JADX INFO: renamed from: f */
    public int f101081f;

    /* JADX INFO: renamed from: c */
    public final ig60 f101078c = new ig60();

    /* JADX INFO: renamed from: e */
    public byte[] f101080e = new byte[1024];

    public fvp0(@Nullable String str, h0j0 h0j0Var) {
        this.f101076a = str;
        this.f101077b = h0j0Var;
    }

    @Override // p153l.zrf
    /* JADX INFO: renamed from: a */
    public void mo11029a(long j, long j2) {
        throw new IllegalStateException();
    }

    @Override // p153l.zrf
    /* JADX INFO: renamed from: b */
    public void mo11030b(bsf bsfVar) {
        this.f101079d = bsfVar;
        bsfVar.mo11424k(new mke0.C18641b(-9223372036854775807L));
    }

    @RequiresNonNull({"output"})
    /* JADX INFO: renamed from: c */
    public final qfj0 m127696c(long j) {
        qfj0 qfj0VarMo11416b = this.f101079d.mo11416b(0, 3);
        qfj0VarMo11416b.mo11164b(new C1894k.b().m10400g0("text/vtt").m10391X(this.f101076a).m10404k0(j).m10374G());
        this.f101079d.mo11425l();
        return qfj0VarMo11416b;
    }

    @RequiresNonNull({"output"})
    /* JADX INFO: renamed from: d */
    public final void m127697d() throws ParserException {
        ig60 ig60Var = new ig60(this.f101080e);
        gvp0.m132578e(ig60Var);
        long jM133170g = 0;
        long jM132577d = 0;
        for (String strM139829s = ig60Var.m139829s(); !TextUtils.isEmpty(strM139829s); strM139829s = ig60Var.m139829s()) {
            if (strM139829s.startsWith("X-TIMESTAMP-MAP")) {
                Matcher matcher = f101074g.matcher(strM139829s);
                if (!matcher.find()) {
                    throw ParserException.createForMalformedContainer("X-TIMESTAMP-MAP doesn't contain local timestamp: ".concat(strM139829s), null);
                }
                Matcher matcher2 = f101075h.matcher(strM139829s);
                if (!matcher2.find()) {
                    throw ParserException.createForMalformedContainer("X-TIMESTAMP-MAP doesn't contain media timestamp: ".concat(strM139829s), null);
                }
                jM132577d = gvp0.m132577d((String) w11.m204369e(matcher.group(1)));
                jM133170g = h0j0.m133170g(Long.parseLong((String) w11.m204369e(matcher2.group(1))));
            }
        }
        Matcher matcherM132574a = gvp0.m132574a(ig60Var);
        if (matcherM132574a == null) {
            m127696c(0L);
            return;
        }
        long jM132577d2 = gvp0.m132577d((String) w11.m204369e(matcherM132574a.group(1)));
        long jM133174b = this.f101077b.m133174b(h0j0.m133172k((jM133170g + jM132577d2) - jM132577d));
        qfj0 qfj0VarM127696c = m127696c(jM133174b - jM132577d2);
        this.f101078c.m139806S(this.f101080e, this.f101081f);
        qfj0VarM127696c.m176370d(this.f101078c, this.f101081f);
        qfj0VarM127696c.mo11163a(jM133174b, 1, this.f101081f, 0, null);
    }

    @Override // p153l.zrf
    /* JADX INFO: renamed from: f */
    public boolean mo11031f(asf asfVar) throws IOException {
        asfVar.mo99901g(this.f101080e, 0, 6, false);
        this.f101078c.m139806S(this.f101080e, 6);
        if (gvp0.m132575b(this.f101078c)) {
            return true;
        }
        asfVar.mo99901g(this.f101080e, 6, 3, false);
        this.f101078c.m139806S(this.f101080e, 9);
        return gvp0.m132575b(this.f101078c);
    }

    @Override // p153l.zrf
    /* JADX INFO: renamed from: h */
    public int mo11032h(asf asfVar, ll80 ll80Var) throws IOException {
        w11.m204369e(this.f101079d);
        int length = (int) asfVar.getLength();
        int i = this.f101081f;
        byte[] bArr = this.f101080e;
        if (i == bArr.length) {
            this.f101080e = Arrays.copyOf(bArr, ((length != -1 ? length : bArr.length) * 3) / 2);
        }
        byte[] bArr2 = this.f101080e;
        int i2 = this.f101081f;
        int i3 = asfVar.read(bArr2, i2, bArr2.length - i2);
        if (i3 != -1) {
            int i4 = this.f101081f + i3;
            this.f101081f = i4;
            if (length == -1 || i4 != length) {
                return 0;
            }
        }
        m127697d();
        return -1;
    }

    @Override // p153l.zrf
    public void release() {
    }
}
