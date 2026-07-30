package p149l;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.google.android.gms.internal.ads.zzgaa;
import java.nio.charset.Charset;
import java.util.List;
import org.eclipse.jetty.http.HttpTokens;

/* JADX INFO: loaded from: classes6.dex */
public final class ghr0 implements rfr0 {

    /* JADX INFO: renamed from: a */
    public final v6w0 f102679a = new v6w0();

    /* JADX INFO: renamed from: b */
    public final boolean f102680b;

    /* JADX INFO: renamed from: c */
    public final int f102681c;

    /* JADX INFO: renamed from: d */
    public final int f102682d;

    /* JADX INFO: renamed from: e */
    public final String f102683e;

    /* JADX INFO: renamed from: f */
    public final float f102684f;

    /* JADX INFO: renamed from: g */
    public final int f102685g;

    public ghr0(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.f102681c = 0;
            this.f102682d = -1;
            this.f102683e = "sans-serif";
            this.f102680b = false;
            this.f102684f = 0.85f;
            this.f102685g = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.f102681c = bArr[24];
        this.f102682d = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f102683e = true == "Serif".equals(ggw0.m126059a(bArr, 43, bArr.length + (-43))) ? "serif" : "sans-serif";
        int i = bArr[25] * 20;
        this.f102685g = i;
        boolean z = (bArr[0] & HttpTokens.SPACE) != 0;
        this.f102680b = z;
        if (z) {
            this.f102684f = Math.max(0.0f, Math.min(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.95f));
        } else {
            this.f102684f = 0.85f;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m126186b(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m126187c(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            int i7 = i & 1;
            int i8 = i & 2;
            boolean z = true;
            if (i7 != 0) {
                if (i8 != 0) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                    z = false;
                }
            } else if (i8 != 0) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
            } else {
                z = false;
            }
            if ((i & 4) != 0) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            } else {
                if (i7 != 0 || z) {
                    return;
                }
                spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.rfr0
    /* JADX INFO: renamed from: a */
    public final void mo101921a(byte[] bArr, int i, int i2, qfr0 qfr0Var, bbv0 bbv0Var) {
        String strM197252a;
        int i3;
        this.f102679a.m197260i(bArr, i + i2);
        this.f102679a.m197262k(i);
        v6w0 v6w0Var = this.f102679a;
        int i4 = 1;
        int i5 = 0;
        int i6 = 2;
        f5v0.m119533d(v6w0Var.m197268q() >= 2);
        int iM197242F = v6w0Var.m197242F();
        if (iM197242F == 0) {
            strM197252a = "";
        } else {
            int iM197270s = v6w0Var.m197270s();
            Charset charsetM197253b = v6w0Var.m197253b();
            int iM197270s2 = v6w0Var.m197270s() - iM197270s;
            if (charsetM197253b == null) {
                charsetM197253b = wew0.f185990c;
            }
            strM197252a = v6w0Var.m197252a(iM197242F - iM197270s2, charsetM197253b);
        }
        if (strM197252a.isEmpty()) {
            bbv0Var.zza(new kfr0(zzgaa.zzl(), -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strM197252a);
        m126187c(spannableStringBuilder, this.f102681c, 0, 0, spannableStringBuilder.length(), 16711680);
        m126186b(spannableStringBuilder, this.f102682d, -1, 0, spannableStringBuilder.length(), 16711680);
        String str = this.f102683e;
        int length = spannableStringBuilder.length();
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float fMax = this.f102684f;
        while (true) {
            v6w0 v6w0Var2 = this.f102679a;
            if (v6w0Var2.m197268q() < 8) {
                dtu0 dtu0Var = new dtu0();
                dtu0Var.m113594l(spannableStringBuilder);
                dtu0Var.m113587e(fMax, 0);
                dtu0Var.m113588f(0);
                bbv0Var.zza(new kfr0(zzgaa.zzm(dtu0Var.m113598p()), -9223372036854775807L, -9223372036854775807L));
                return;
            }
            int iM197270s3 = v6w0Var2.m197270s();
            int iM197273v = v6w0Var2.m197273v();
            int iM197273v2 = this.f102679a.m197273v();
            if (iM197273v2 == 1937013100) {
                f5v0.m119533d(this.f102679a.m197268q() >= i6 ? i4 : i5);
                int iM197242F2 = this.f102679a.m197242F();
                int i7 = i5;
                while (i7 < iM197242F2) {
                    v6w0 v6w0Var3 = this.f102679a;
                    f5v0.m119533d(v6w0Var3.m197268q() >= 12 ? i4 : i5);
                    int iM197242F3 = v6w0Var3.m197242F();
                    int iM197242F4 = v6w0Var3.m197242F();
                    v6w0Var3.m197263l(i6);
                    int iM197238B = v6w0Var3.m197238B();
                    v6w0Var3.m197263l(i4);
                    int iM197273v3 = v6w0Var3.m197273v();
                    if (iM197242F4 > spannableStringBuilder.length()) {
                        svv0.m186111f("Tx3gParser", "Truncating styl end (" + iM197242F4 + ") to cueText.length() (" + spannableStringBuilder.length() + ").");
                        iM197242F4 = spannableStringBuilder.length();
                    }
                    if (iM197242F3 >= iM197242F4) {
                        svv0.m186111f("Tx3gParser", "Ignoring styl with start (" + iM197242F3 + ") >= end (" + iM197242F4 + ").");
                    } else {
                        int i8 = iM197242F4;
                        m126187c(spannableStringBuilder, iM197238B, this.f102681c, iM197242F3, i8, 0);
                        m126186b(spannableStringBuilder, iM197273v3, this.f102682d, iM197242F3, i8, 0);
                    }
                    i7++;
                    i4 = 1;
                    i5 = 0;
                    i6 = 2;
                }
                i3 = i6;
            } else if (iM197273v2 == 1952608120 && this.f102680b) {
                i3 = 2;
                f5v0.m119533d(this.f102679a.m197268q() >= 2);
                fMax = Math.max(0.0f, Math.min(this.f102679a.m197242F() / this.f102685g, 0.95f));
            } else {
                i3 = 2;
            }
            this.f102679a.m197262k(iM197270s3 + iM197273v);
            i6 = i3;
            i4 = 1;
            i5 = 0;
        }
    }
}
