package p153l;

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
public final class mqr0 implements xor0 {

    /* JADX INFO: renamed from: a */
    public final bgw0 f138152a = new bgw0();

    /* JADX INFO: renamed from: b */
    public final boolean f138153b;

    /* JADX INFO: renamed from: c */
    public final int f138154c;

    /* JADX INFO: renamed from: d */
    public final int f138155d;

    /* JADX INFO: renamed from: e */
    public final String f138156e;

    /* JADX INFO: renamed from: f */
    public final float f138157f;

    /* JADX INFO: renamed from: g */
    public final int f138158g;

    public mqr0(List list) {
        if (list.size() != 1 || (((byte[]) list.get(0)).length != 48 && ((byte[]) list.get(0)).length != 53)) {
            this.f138154c = 0;
            this.f138155d = -1;
            this.f138156e = "sans-serif";
            this.f138153b = false;
            this.f138157f = 0.85f;
            this.f138158g = -1;
            return;
        }
        byte[] bArr = (byte[]) list.get(0);
        this.f138154c = bArr[24];
        this.f138155d = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f138156e = true == "Serif".equals(mpw0.m159403a(bArr, 43, bArr.length + (-43))) ? "serif" : "sans-serif";
        int i = bArr[25] * 20;
        this.f138158g = i;
        boolean z = (bArr[0] & HttpTokens.SPACE) != 0;
        this.f138153b = z;
        if (z) {
            this.f138157f = Math.max(0.0f, Math.min(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.95f));
        } else {
            this.f138157f = 0.85f;
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m159597b(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m159598c(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
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
    @Override // p153l.xor0
    /* JADX INFO: renamed from: a */
    public final void mo105973a(byte[] bArr, int i, int i2, wor0 wor0Var, hkv0 hkv0Var) {
        String strM104259a;
        int i3;
        this.f138152a.m104267i(bArr, i + i2);
        this.f138152a.m104269k(i);
        bgw0 bgw0Var = this.f138152a;
        int i4 = 1;
        int i5 = 0;
        int i6 = 2;
        lev0.m153956d(bgw0Var.m104275q() >= 2);
        int iM104249F = bgw0Var.m104249F();
        if (iM104249F == 0) {
            strM104259a = "";
        } else {
            int iM104277s = bgw0Var.m104277s();
            Charset charsetM104260b = bgw0Var.m104260b();
            int iM104277s2 = bgw0Var.m104277s() - iM104277s;
            if (charsetM104260b == null) {
                charsetM104260b = cow0.f82931c;
            }
            strM104259a = bgw0Var.m104259a(iM104249F - iM104277s2, charsetM104260b);
        }
        if (strM104259a.isEmpty()) {
            hkv0Var.zza(new qor0(zzgaa.zzl(), -9223372036854775807L, -9223372036854775807L));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strM104259a);
        m159598c(spannableStringBuilder, this.f138154c, 0, 0, spannableStringBuilder.length(), 16711680);
        m159597b(spannableStringBuilder, this.f138155d, -1, 0, spannableStringBuilder.length(), 16711680);
        String str = this.f138156e;
        int length = spannableStringBuilder.length();
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), 0, length, 16711713);
        }
        float fMax = this.f138157f;
        while (true) {
            bgw0 bgw0Var2 = this.f138152a;
            if (bgw0Var2.m104275q() < 8) {
                j2v0 j2v0Var = new j2v0();
                j2v0Var.m143277l(spannableStringBuilder);
                j2v0Var.m143270e(fMax, 0);
                j2v0Var.m143271f(0);
                hkv0Var.zza(new qor0(zzgaa.zzm(j2v0Var.m143281p()), -9223372036854775807L, -9223372036854775807L));
                return;
            }
            int iM104277s3 = bgw0Var2.m104277s();
            int iM104280v = bgw0Var2.m104280v();
            int iM104280v2 = this.f138152a.m104280v();
            if (iM104280v2 == 1937013100) {
                lev0.m153956d(this.f138152a.m104275q() >= i6 ? i4 : i5);
                int iM104249F2 = this.f138152a.m104249F();
                int i7 = i5;
                while (i7 < iM104249F2) {
                    bgw0 bgw0Var3 = this.f138152a;
                    lev0.m153956d(bgw0Var3.m104275q() >= 12 ? i4 : i5);
                    int iM104249F3 = bgw0Var3.m104249F();
                    int iM104249F4 = bgw0Var3.m104249F();
                    bgw0Var3.m104270l(i6);
                    int iM104245B = bgw0Var3.m104245B();
                    bgw0Var3.m104270l(i4);
                    int iM104280v3 = bgw0Var3.m104280v();
                    if (iM104249F4 > spannableStringBuilder.length()) {
                        y4w0.m214278f("Tx3gParser", "Truncating styl end (" + iM104249F4 + ") to cueText.length() (" + spannableStringBuilder.length() + ").");
                        iM104249F4 = spannableStringBuilder.length();
                    }
                    if (iM104249F3 >= iM104249F4) {
                        y4w0.m214278f("Tx3gParser", "Ignoring styl with start (" + iM104249F3 + ") >= end (" + iM104249F4 + ").");
                    } else {
                        int i8 = iM104249F4;
                        m159598c(spannableStringBuilder, iM104245B, this.f138154c, iM104249F3, i8, 0);
                        m159597b(spannableStringBuilder, iM104280v3, this.f138155d, iM104249F3, i8, 0);
                    }
                    i7++;
                    i4 = 1;
                    i5 = 0;
                    i6 = 2;
                }
                i3 = i6;
            } else if (iM104280v2 == 1952608120 && this.f138153b) {
                i3 = 2;
                lev0.m153956d(this.f138152a.m104275q() >= 2);
                fMax = Math.max(0.0f, Math.min(this.f138152a.m104249F() / this.f138158g, 0.95f));
            } else {
                i3 = 2;
            }
            this.f138152a.m104269k(iM104277s3 + iM104280v);
            i6 = i3;
            i4 = 1;
            i5 = 0;
        }
    }
}
