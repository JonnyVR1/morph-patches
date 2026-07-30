package p149l;

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
public final class rdj0 extends phf0 {

    /* JADX INFO: renamed from: o */
    public final d860 f158941o;

    /* JADX INFO: renamed from: p */
    public final boolean f158942p;

    /* JADX INFO: renamed from: q */
    public final int f158943q;

    /* JADX INFO: renamed from: r */
    public final int f158944r;

    /* JADX INFO: renamed from: s */
    public final String f158945s;

    /* JADX INFO: renamed from: t */
    public final float f158946t;

    /* JADX INFO: renamed from: u */
    public final int f158947u;

    public rdj0(List<byte[]> list) {
        super("Tx3gDecoder");
        this.f158941o = new d860();
        if (list.size() != 1 || (list.get(0).length != 48 && list.get(0).length != 53)) {
            this.f158943q = 0;
            this.f158944r = -1;
            this.f158945s = "sans-serif";
            this.f158942p = false;
            this.f158946t = 0.85f;
            this.f158947u = -1;
            return;
        }
        byte[] bArr = list.get(0);
        this.f158943q = bArr[24];
        this.f158944r = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.f158945s = "Serif".equals(vck0.m197797F(bArr, 43, bArr.length - 43)) ? "serif" : "sans-serif";
        int i = bArr[25] * 20;
        this.f158947u = i;
        boolean z = (bArr[0] & HttpTokens.SPACE) != 0;
        this.f158942p = z;
        if (z) {
            this.f158946t = vck0.m197882p(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i, 0.0f, 0.95f);
        } else {
            this.f158946t = 0.85f;
        }
    }

    /* JADX INFO: renamed from: C */
    public static void m178966C(boolean z) throws SubtitleDecoderException {
        if (!z) {
            throw new SubtitleDecoderException("Unexpected subtitle format.");
        }
    }

    /* JADX INFO: renamed from: D */
    public static void m178967D(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
        if (i != i2) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i >>> 8) | ((i & 255) << 24)), i3, i4, i5 | 33);
        }
    }

    /* JADX INFO: renamed from: E */
    public static void m178968E(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3, int i4, int i5) {
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
    public static void m178969F(SpannableStringBuilder spannableStringBuilder, String str, int i, int i2) {
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i, i2, 16711713);
        }
    }

    /* JADX INFO: renamed from: G */
    public static String m178970G(d860 d860Var) throws SubtitleDecoderException {
        m178966C(d860Var.m110295a() >= 2);
        int iM110285N = d860Var.m110285N();
        if (iM110285N == 0) {
            return "";
        }
        int iM110300f = d860Var.m110300f();
        Charset charsetM110287P = d860Var.m110287P();
        int iM110300f2 = iM110285N - (d860Var.m110300f() - iM110300f);
        if (charsetM110287P == null) {
            charsetM110287P = fs4.f99036c;
        }
        return d860Var.m110277F(iM110300f2, charsetM110287P);
    }

    @Override // p149l.phf0
    /* JADX INFO: renamed from: A */
    public e5g0 mo97681A(byte[] bArr, int i, boolean z) throws SubtitleDecoderException {
        this.f158941o.m110290S(bArr, i);
        String strM178970G = m178970G(this.f158941o);
        if (strM178970G.isEmpty()) {
            return sdj0.f163856b;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(strM178970G);
        m178968E(spannableStringBuilder, this.f158943q, 0, 0, spannableStringBuilder.length(), 16711680);
        m178967D(spannableStringBuilder, this.f158944r, -1, 0, spannableStringBuilder.length(), 16711680);
        m178969F(spannableStringBuilder, this.f158945s, 0, spannableStringBuilder.length());
        float fM197882p = this.f158946t;
        while (this.f158941o.m110295a() >= 8) {
            int iM110300f = this.f158941o.m110300f();
            int iM110311q = this.f158941o.m110311q();
            int iM110311q2 = this.f158941o.m110311q();
            if (iM110311q2 == 1937013100) {
                m178966C(this.f158941o.m110295a() >= 2);
                int iM110285N = this.f158941o.m110285N();
                for (int i2 = 0; i2 < iM110285N; i2++) {
                    m178971B(this.f158941o, spannableStringBuilder);
                }
            } else if (iM110311q2 == 1952608120 && this.f158942p) {
                m178966C(this.f158941o.m110295a() >= 2);
                fM197882p = vck0.m197882p(this.f158941o.m110285N() / this.f158947u, 0.0f, 0.95f);
            }
            this.f158941o.m110292U(iM110300f + iM110311q);
        }
        return new sdj0(new ywb.C21557b().m216325o(spannableStringBuilder).m216318h(fM197882p, 0).m216319i(0).m216311a());
    }

    /* JADX INFO: renamed from: B */
    public final void m178971B(d860 d860Var, SpannableStringBuilder spannableStringBuilder) throws SubtitleDecoderException {
        m178966C(d860Var.m110295a() >= 12);
        int iM110285N = d860Var.m110285N();
        int iM110285N2 = d860Var.m110285N();
        d860Var.m110293V(2);
        int iM110279H = d860Var.m110279H();
        d860Var.m110293V(1);
        int iM110311q = d860Var.m110311q();
        if (iM110285N2 > spannableStringBuilder.length()) {
            jwv.m143689i("Tx3gDecoder", "Truncating styl end (" + iM110285N2 + ") to cueText.length() (" + spannableStringBuilder.length() + ").");
            iM110285N2 = spannableStringBuilder.length();
        }
        int i = iM110285N2;
        if (iM110285N < i) {
            m178968E(spannableStringBuilder, iM110279H, this.f158943q, iM110285N, i, 0);
            m178967D(spannableStringBuilder, iM110311q, this.f158944r, iM110285N, i, 0);
            return;
        }
        jwv.m143689i("Tx3gDecoder", "Ignoring styl with start (" + iM110285N + ") >= end (" + i + ").");
    }
}
