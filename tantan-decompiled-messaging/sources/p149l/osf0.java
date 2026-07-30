package p149l;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.Nullable;
import com.alibaba.sdk.android.oss.signer.SignParameters;
import com.clevertap.android.sdk.Constants;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class osf0 extends phf0 {

    /* JADX INFO: renamed from: t */
    public static final Pattern f145388t = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* JADX INFO: renamed from: o */
    public final boolean f145389o;

    /* JADX INFO: renamed from: p */
    @Nullable
    public final psf0 f145390p;

    /* JADX INFO: renamed from: q */
    public Map<String, qsf0> f145391q;

    /* JADX INFO: renamed from: r */
    public float f145392r;

    /* JADX INFO: renamed from: s */
    public float f145393s;

    public osf0(@Nullable List<byte[]> list) {
        super("SsaDecoder");
        this.f145392r = -3.4028235E38f;
        this.f145393s = -3.4028235E38f;
        if (list == null || list.isEmpty()) {
            this.f145389o = false;
            this.f145390p = null;
            return;
        }
        this.f145389o = true;
        String strM197795E = vck0.m197795E(list.get(0));
        p11.m167007a(strM197795E.startsWith("Format:"));
        this.f145390p = (psf0) p11.m167011e(psf0.m171137a(strM197795E));
        m165764H(new d860(list.get(1)), fs4.f99036c);
    }

    /* JADX INFO: renamed from: B */
    public static int m165753B(long j, List<Long> list, List<List<ywb>> list2) {
        int i;
        int size = list.size() - 1;
        while (true) {
            if (size < 0) {
                i = 0;
                break;
            }
            if (list.get(size).longValue() == j) {
                return size;
            }
            if (list.get(size).longValue() < j) {
                i = size + 1;
                break;
            }
            size--;
        }
        list.add(i, Long.valueOf(j));
        list2.add(i, i == 0 ? new ArrayList() : new ArrayList(list2.get(i - 1)));
        return i;
    }

    /* JADX INFO: renamed from: C */
    public static float m165754C(int i) {
        if (i == 0) {
            return 0.05f;
        }
        if (i != 1) {
            return i != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    /* JADX INFO: renamed from: D */
    public static ywb m165755D(String str, @Nullable qsf0 qsf0Var, qsf0.C19567b c19567b, float f, float f2) {
        SpannableString spannableString = new SpannableString(str);
        ywb.C21557b c21557bM216325o = new ywb.C21557b().m216325o(spannableString);
        if (qsf0Var != null) {
            if (qsf0Var.f156164c != null) {
                spannableString.setSpan(new ForegroundColorSpan(qsf0Var.f156164c.intValue()), 0, spannableString.length(), 33);
            }
            if (qsf0Var.f156171j == 3 && qsf0Var.f156165d != null) {
                spannableString.setSpan(new BackgroundColorSpan(qsf0Var.f156165d.intValue()), 0, spannableString.length(), 33);
            }
            float f3 = qsf0Var.f156166e;
            if (f3 != -3.4028235E38f && f2 != -3.4028235E38f) {
                c21557bM216325o.m216327q(f3 / f2, 1);
            }
            boolean z = qsf0Var.f156167f;
            if (z && qsf0Var.f156168g) {
                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
            } else if (z) {
                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
            } else if (qsf0Var.f156168g) {
                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
            }
            if (qsf0Var.f156169h) {
                spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 33);
            }
            if (qsf0Var.f156170i) {
                spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
            }
        }
        int i = c19567b.f156187a;
        if (i == -1) {
            i = qsf0Var != null ? qsf0Var.f156163b : -1;
        }
        c21557bM216325o.m216326p(m165760N(i)).m216322l(m165759M(i)).m216319i(m165758L(i));
        PointF pointF = c19567b.f156188b;
        if (pointF == null || f2 == -3.4028235E38f || f == -3.4028235E38f) {
            c21557bM216325o.m216321k(m165754C(c21557bM216325o.m216314d()));
            c21557bM216325o.m216318h(m165754C(c21557bM216325o.m216313c()), 0);
        } else {
            c21557bM216325o.m216321k(pointF.x / f);
            c21557bM216325o.m216318h(c19567b.f156188b.y / f2, 0);
        }
        return c21557bM216325o.m216311a();
    }

    /* JADX INFO: renamed from: J */
    public static Map<String, qsf0> m165756J(d860 d860Var, Charset charset) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        qsf0.C19566a c19566aM176253a = null;
        while (true) {
            String strM110314t = d860Var.m110314t(charset);
            if (strM110314t == null || (d860Var.m110295a() != 0 && d860Var.m110302h(charset) == '[')) {
                break;
            }
            if (strM110314t.startsWith("Format:")) {
                c19566aM176253a = qsf0.C19566a.m176253a(strM110314t);
            } else if (strM110314t.startsWith("Style:")) {
                if (c19566aM176253a == null) {
                    jwv.m143689i("SsaDecoder", "Skipping 'Style:' line before 'Format:' line: ".concat(strM110314t));
                } else {
                    qsf0 qsf0VarM176245b = qsf0.m176245b(strM110314t, c19566aM176253a);
                    if (qsf0VarM176245b != null) {
                        linkedHashMap.put(qsf0VarM176245b.f156162a, qsf0VarM176245b);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: K */
    public static long m165757K(String str) {
        Matcher matcher = f145388t.matcher(str.trim());
        if (matcher.matches()) {
            return (Long.parseLong((String) vck0.m197866j(matcher.group(1))) * 3600000000L) + (Long.parseLong((String) vck0.m197866j(matcher.group(2))) * 60000000) + (Long.parseLong((String) vck0.m197866j(matcher.group(3))) * 1000000) + (Long.parseLong((String) vck0.m197866j(matcher.group(4))) * 10000);
        }
        return -9223372036854775807L;
    }

    /* JADX INFO: renamed from: L */
    public static int m165758L(int i) {
        switch (i) {
            case -1:
                return Integer.MIN_VALUE;
            case 0:
            default:
                jwv.m143689i("SsaDecoder", "Unknown alignment: " + i);
                return Integer.MIN_VALUE;
            case 1:
            case 2:
            case 3:
                return 2;
            case 4:
            case 5:
            case 6:
                return 1;
            case 7:
            case 8:
            case 9:
                return 0;
        }
    }

    /* JADX INFO: renamed from: M */
    public static int m165759M(int i) {
        switch (i) {
            case -1:
                return Integer.MIN_VALUE;
            case 0:
            default:
                jwv.m143689i("SsaDecoder", "Unknown alignment: " + i);
                return Integer.MIN_VALUE;
            case 1:
            case 4:
            case 7:
                return 0;
            case 2:
            case 5:
            case 8:
                return 1;
            case 3:
            case 6:
            case 9:
                return 2;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: N */
    public static Layout.Alignment m165760N(int i) {
        switch (i) {
            case -1:
                return null;
            case 0:
            default:
                jwv.m143689i("SsaDecoder", "Unknown alignment: " + i);
                return null;
            case 1:
            case 4:
            case 7:
                return Layout.Alignment.ALIGN_NORMAL;
            case 2:
            case 5:
            case 8:
                return Layout.Alignment.ALIGN_CENTER;
            case 3:
            case 6:
            case 9:
                return Layout.Alignment.ALIGN_OPPOSITE;
        }
    }

    @Override // p149l.phf0
    /* JADX INFO: renamed from: A */
    public e5g0 mo97681A(byte[] bArr, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        d860 d860Var = new d860(bArr, i);
        Charset charsetM165761E = m165761E(d860Var);
        if (!this.f145389o) {
            m165764H(d860Var, charsetM165761E);
        }
        m165763G(d860Var, arrayList, arrayList2, charsetM165761E);
        return new rsf0(arrayList, arrayList2);
    }

    /* JADX INFO: renamed from: E */
    public final Charset m165761E(d860 d860Var) {
        Charset charsetM110287P = d860Var.m110287P();
        return charsetM110287P != null ? charsetM110287P : fs4.f99036c;
    }

    /* JADX INFO: renamed from: F */
    public final void m165762F(String str, psf0 psf0Var, List<List<ywb>> list, List<Long> list2) {
        int i;
        p11.m167007a(str.startsWith("Dialogue:"));
        String[] strArrSplit = str.substring(9).split(Constants.SEPARATOR_COMMA, psf0Var.f151008e);
        if (strArrSplit.length != psf0Var.f151008e) {
            jwv.m143689i("SsaDecoder", "Skipping dialogue line with fewer columns than format: ".concat(str));
            return;
        }
        long jM165757K = m165757K(strArrSplit[psf0Var.f151004a]);
        if (jM165757K == -9223372036854775807L) {
            jwv.m143689i("SsaDecoder", "Skipping invalid timing: ".concat(str));
            return;
        }
        long jM165757K2 = m165757K(strArrSplit[psf0Var.f151005b]);
        if (jM165757K2 == -9223372036854775807L) {
            jwv.m143689i("SsaDecoder", "Skipping invalid timing: ".concat(str));
            return;
        }
        Map<String, qsf0> map = this.f145391q;
        qsf0 qsf0Var = (map == null || (i = psf0Var.f151006c) == -1) ? null : map.get(strArrSplit[i].trim());
        String str2 = strArrSplit[psf0Var.f151007d];
        ywb ywbVarM165755D = m165755D(qsf0.C19567b.m176257d(str2).replace("\\N", SignParameters.NEW_LINE).replace("\\n", SignParameters.NEW_LINE).replace("\\h", " "), qsf0Var, qsf0.C19567b.m176255b(str2), this.f145392r, this.f145393s);
        int iM165753B = m165753B(jM165757K2, list2, list);
        for (int iM165753B2 = m165753B(jM165757K, list2, list); iM165753B2 < iM165753B; iM165753B2++) {
            list.get(iM165753B2).add(ywbVarM165755D);
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m165763G(d860 d860Var, List<List<ywb>> list, List<Long> list2, Charset charset) {
        psf0 psf0VarM171137a = this.f145389o ? this.f145390p : null;
        while (true) {
            String strM110314t = d860Var.m110314t(charset);
            if (strM110314t == null) {
                return;
            }
            if (strM110314t.startsWith("Format:")) {
                psf0VarM171137a = psf0.m171137a(strM110314t);
            } else if (strM110314t.startsWith("Dialogue:")) {
                if (psf0VarM171137a == null) {
                    jwv.m143689i("SsaDecoder", "Skipping dialogue line before complete format: ".concat(strM110314t));
                } else {
                    m165762F(strM110314t, psf0VarM171137a, list, list2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m165764H(d860 d860Var, Charset charset) {
        while (true) {
            String strM110314t = d860Var.m110314t(charset);
            if (strM110314t == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(strM110314t)) {
                m165765I(d860Var, charset);
            } else if ("[V4+ Styles]".equalsIgnoreCase(strM110314t)) {
                this.f145391q = m165756J(d860Var, charset);
            } else if ("[V4 Styles]".equalsIgnoreCase(strM110314t)) {
                jwv.m143686f("SsaDecoder", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(strM110314t)) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m165765I(d860 d860Var, Charset charset) {
        while (true) {
            String strM110314t = d860Var.m110314t(charset);
            if (strM110314t == null) {
                return;
            }
            if (d860Var.m110295a() != 0 && d860Var.m110302h(charset) == '[') {
                return;
            }
            String[] strArrSplit = strM110314t.split(":");
            if (strArrSplit.length == 2) {
                String strM99804e = b11.m99804e(strArrSplit[0].trim());
                strM99804e.getClass();
                if (strM99804e.equals("playresx")) {
                    this.f145392r = Float.parseFloat(strArrSplit[1].trim());
                } else if (strM99804e.equals("playresy")) {
                    try {
                        this.f145393s = Float.parseFloat(strArrSplit[1].trim());
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
    }

    public osf0() {
        this(null);
    }
}
