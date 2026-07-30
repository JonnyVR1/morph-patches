package p153l;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import com.google.android.exoplayer2.text.SubtitleDecoderException;
import java.nio.charset.Charset;
import java.util.List;
import org.eclipse.jetty.http.HttpTokens;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class vmj0 extends xpf0 {

    /* JADX INFO: renamed from: o */
    public final ig60 f184719o;

    /* JADX INFO: renamed from: p */
    public final boolean f184720p;

    /* JADX INFO: renamed from: q */
    public final int f184721q;

    /* JADX INFO: renamed from: r */
    public final int f184722r;

    /* JADX INFO: renamed from: s */
    public final String f184723s;

    /* JADX INFO: renamed from: t */
    public final float f184724t;

    /* JADX INFO: renamed from: u */
    public final int f184725u;

    public vmj0(List<byte[]> list) {
        super("Tx3gDecoder");
        this.f184719o = new ig60();
        if (list.size() != 1 || (list.get(0).length != 48 && list.get(0).length != 53)) {
            this.f184721q = 0;
            this.f184722r = -1;
            this.f184723s = "sans-serif";
            this.f184720p = false;
            this.f184724t = 0.85f;
            this.f184725u = -1;
            return;
        }
        byte[] bArr = list.get(0);
        this.f184721q = bArr[24];
        this.f184722r = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f184723s = "Serif".equals(bmk0.m105075F(bArr, 43, bArr.length - 43)) ? "serif" : "sans-serif";
        int i = bArr[25] * 20;
        this.f184725u = i;
        boolean z = (bArr[0] & HttpTokens.SPACE) != 0;
        this.f184720p = z;
        if (z) {
            this.f184724t = bmk0.m105160p(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.0f, 0.95f);
        } else {
            this.f184724t = 0.85f;
        }
    }

    /* JADX INFO: renamed from: C */
    public static void m201747C(boolean z) throws SubtitleDecoderException {
        if (!z) {
            throw new SubtitleDecoderException("Unexpected subtitle format.");
        }
    }

    /* JADX INFO: renamed from: D */
    public static void m201748D(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    /* JADX INFO: renamed from: E */
    public static void m201749E(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            int i6 = i5 | 33;
            boolean z = (i & 1) != 0;
            boolean z2 = (i & 2) != 0;
            if (z) {
                if (z2) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i3, i4, i6);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i3, i4, i6);
                }
            } else if (z2) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i3, i4, i6);
            }
            boolean z3 = (i & 4) != 0;
            if (z3) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i3, i4, i6);
            }
            if (z3 || z || z2) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i3, i4, i6);
        }
    }

    /* JADX INFO: renamed from: F */
    public static void m201750F(SpannableStringBuilder spannableStringBuilder, String str, int i, int i2) {
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i, i2, 16711713);
        }
    }

    /* JADX INFO: renamed from: G */
    public static String m201751G(ig60 ig60Var) throws SubtitleDecoderException {
        m201747C(ig60Var.m139811a() >= 2);
        int iM139801N = ig60Var.m139801N();
        if (iM139801N == 0) {
            return "";
        }
        int iM139816f = ig60Var.m139816f();
        Charset charsetM139803P = ig60Var.m139803P();
        int iM139816f2 = iM139801N - (ig60Var.m139816f() - iM139816f);
        if (charsetM139803P == null) {
            charsetM139803P = et4.f95689c;
        }
        return ig60Var.m139793F(iM139816f2, charsetM139803P);
    }

    @Override // p153l.xpf0
    /* JADX INFO: renamed from: A */
    public mdg0 mo122811A(byte[] bArr, int i, boolean z) throws SubtitleDecoderException {
        this.f184719o.m139806S(bArr, i);
        String strM201751G = m201751G(this.f184719o);
        if (strM201751G.isEmpty()) {
            return wmj0.f189802b;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strM201751G);
        m201749E(spannableStringBuilder, this.f184721q, 0, 0, spannableStringBuilder.length(), 16711680);
        m201748D(spannableStringBuilder, this.f184722r, -1, 0, spannableStringBuilder.length(), 16711680);
        m201750F(spannableStringBuilder, this.f184723s, 0, spannableStringBuilder.length());
        float fM105160p = this.f184724t;
        while (this.f184719o.m139811a() >= 8) {
            int iM139816f = this.f184719o.m139816f();
            int iM139827q = this.f184719o.m139827q();
            int iM139827q2 = this.f184719o.m139827q();
            if (iM139827q2 == 1937013100) {
                m201747C(this.f184719o.m139811a() >= 2);
                int iM139801N = this.f184719o.m139801N();
                for (int i2 = 0; i2 < iM139801N; i2++) {
                    m201752B(this.f184719o, spannableStringBuilder);
                }
            } else if (iM139827q2 == 1952608120 && this.f184720p) {
                m201747C(this.f184719o.m139811a() >= 2);
                fM105160p = bmk0.m105160p(this.f184719o.m139801N() / this.f184725u, 0.0f, 0.95f);
            }
            this.f184719o.m139808U(iM139816f + iM139827q);
        }
        return new wmj0(new myb.C18746b().m160768o(spannableStringBuilder).m160761h(fM105160p, 0).m160762i(0).m160754a());
    }

    /* JADX INFO: renamed from: B */
    public final void m201752B(ig60 ig60Var, SpannableStringBuilder spannableStringBuilder) throws SubtitleDecoderException {
        m201747C(ig60Var.m139811a() >= 12);
        int iM139801N = ig60Var.m139801N();
        int iM139801N2 = ig60Var.m139801N();
        ig60Var.m139809V(2);
        int iM139795H = ig60Var.m139795H();
        ig60Var.m139809V(1);
        int iM139827q = ig60Var.m139827q();
        if (iM139801N2 > spannableStringBuilder.length()) {
            kyv.m152151i("Tx3gDecoder", "Truncating styl end (" + iM139801N2 + ") to cueText.length() (" + spannableStringBuilder.length() + ").");
            iM139801N2 = spannableStringBuilder.length();
        }
        int i = iM139801N2;
        if (iM139801N < i) {
            m201749E(spannableStringBuilder, iM139795H, this.f184721q, iM139801N, i, 0);
            m201748D(spannableStringBuilder, iM139827q, this.f184722r, iM139801N, i, 0);
            return;
        }
        kyv.m152151i("Tx3gDecoder", "Ignoring styl with start (" + iM139801N + ") >= end (" + i + ").");
    }
}
