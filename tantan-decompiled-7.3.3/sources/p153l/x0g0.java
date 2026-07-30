package p153l;

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
public final class x0g0 extends xpf0 {

    /* JADX INFO: renamed from: t */
    public static final Pattern f191893t = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* JADX INFO: renamed from: o */
    public final boolean f191894o;

    /* JADX INFO: renamed from: p */
    @Nullable
    public final y0g0 f191895p;

    /* JADX INFO: renamed from: q */
    public Map<String, z0g0> f191896q;

    /* JADX INFO: renamed from: r */
    public float f191897r;

    /* JADX INFO: renamed from: s */
    public float f191898s;

    public x0g0(@Nullable List<byte[]> list) {
        super("SsaDecoder");
        this.f191897r = -3.4028235E38f;
        this.f191898s = -3.4028235E38f;
        if (list == null || list.isEmpty()) {
            this.f191894o = false;
            this.f191895p = null;
            return;
        }
        this.f191894o = true;
        String strM105073E = bmk0.m105073E(list.get(0));
        w11.m204365a(strM105073E.startsWith("Format:"));
        this.f191895p = (y0g0) w11.m204369e(y0g0.m213848a(strM105073E));
        m208836H(new ig60(list.get(1)), et4.f95689c);
    }

    /* JADX INFO: renamed from: B */
    public static int m208825B(long j, List<Long> list, List<List<myb>> list2) {
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
    public static float m208826C(int i) {
        if (i == 0) {
            return 0.05f;
        }
        if (i != 1) {
            return i != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    /* JADX INFO: renamed from: D */
    public static myb m208827D(String str, @Nullable z0g0 z0g0Var, z0g0.C21729b c21729b, float f, float f2) {
        SpannableString spannableString = new SpannableString(str);
        myb.C18746b c18746bM160768o = new myb.C18746b().m160768o(spannableString);
        if (z0g0Var != null) {
            if (z0g0Var.f202311c != null) {
                spannableString.setSpan(new ForegroundColorSpan(z0g0Var.f202311c.intValue()), 0, spannableString.length(), 33);
            }
            if (z0g0Var.f202318j == 3 && z0g0Var.f202312d != null) {
                spannableString.setSpan(new BackgroundColorSpan(z0g0Var.f202312d.intValue()), 0, spannableString.length(), 33);
            }
            float f3 = z0g0Var.f202313e;
            if (f3 != -3.4028235E38f && f2 != -3.4028235E38f) {
                c18746bM160768o.m160770q(f3 / f2, 1);
            }
            boolean z = z0g0Var.f202314f;
            if (z && z0g0Var.f202315g) {
                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
            } else if (z) {
                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
            } else if (z0g0Var.f202315g) {
                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
            }
            if (z0g0Var.f202316h) {
                spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 33);
            }
            if (z0g0Var.f202317i) {
                spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
            }
        }
        int i = c21729b.f202334a;
        if (i == -1) {
            i = z0g0Var != null ? z0g0Var.f202310b : -1;
        }
        c18746bM160768o.m160769p(m208832N(i)).m160765l(m208831M(i)).m160762i(m208830L(i));
        PointF pointF = c21729b.f202335b;
        if (pointF == null || f2 == -3.4028235E38f || f == -3.4028235E38f) {
            c18746bM160768o.m160764k(m208826C(c18746bM160768o.m160757d()));
            c18746bM160768o.m160761h(m208826C(c18746bM160768o.m160756c()), 0);
        } else {
            c18746bM160768o.m160764k(pointF.x / f);
            c18746bM160768o.m160761h(c21729b.f202335b.y / f2, 0);
        }
        return c18746bM160768o.m160754a();
    }

    /* JADX INFO: renamed from: J */
    public static Map<String, z0g0> m208828J(ig60 ig60Var, Charset charset) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        z0g0.C21728a c21728aM218120a = null;
        while (true) {
            String strM139830t = ig60Var.m139830t(charset);
            if (strM139830t == null || (ig60Var.m139811a() != 0 && ig60Var.m139818h(charset) == '[')) {
                break;
            }
            if (strM139830t.startsWith("Format:")) {
                c21728aM218120a = z0g0.C21728a.m218120a(strM139830t);
            } else if (strM139830t.startsWith("Style:")) {
                if (c21728aM218120a == null) {
                    kyv.m152151i("SsaDecoder", "Skipping 'Style:' line before 'Format:' line: ".concat(strM139830t));
                } else {
                    z0g0 z0g0VarM218112b = z0g0.m218112b(strM139830t, c21728aM218120a);
                    if (z0g0VarM218112b != null) {
                        linkedHashMap.put(z0g0VarM218112b.f202309a, z0g0VarM218112b);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: K */
    public static long m208829K(String str) {
        Matcher matcher = f191893t.matcher(str.trim());
        if (matcher.matches()) {
            return (Long.parseLong((String) bmk0.m105144j(matcher.group(1))) * 3600000000L) + (Long.parseLong((String) bmk0.m105144j(matcher.group(2))) * 60000000) + (Long.parseLong((String) bmk0.m105144j(matcher.group(3))) * 1000000) + (Long.parseLong((String) bmk0.m105144j(matcher.group(4))) * 10000);
        }
        return -9223372036854775807L;
    }

    /* JADX INFO: renamed from: L */
    public static int m208830L(int i) {
        switch (i) {
            case -1:
                return Integer.MIN_VALUE;
            case 0:
            default:
                kyv.m152151i("SsaDecoder", "Unknown alignment: " + i);
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
    public static int m208831M(int i) {
        switch (i) {
            case -1:
                return Integer.MIN_VALUE;
            case 0:
            default:
                kyv.m152151i("SsaDecoder", "Unknown alignment: " + i);
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
    public static Layout.Alignment m208832N(int i) {
        switch (i) {
            case -1:
                return null;
            case 0:
            default:
                kyv.m152151i("SsaDecoder", "Unknown alignment: " + i);
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

    @Override // p153l.xpf0
    /* JADX INFO: renamed from: A */
    public mdg0 mo122811A(byte[] bArr, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ig60 ig60Var = new ig60(bArr, i);
        Charset charsetM208833E = m208833E(ig60Var);
        if (!this.f191894o) {
            m208836H(ig60Var, charsetM208833E);
        }
        m208835G(ig60Var, arrayList, arrayList2, charsetM208833E);
        return new a1g0(arrayList, arrayList2);
    }

    /* JADX INFO: renamed from: E */
    public final Charset m208833E(ig60 ig60Var) {
        Charset charsetM139803P = ig60Var.m139803P();
        return charsetM139803P != null ? charsetM139803P : et4.f95689c;
    }

    /* JADX INFO: renamed from: F */
    public final void m208834F(String str, y0g0 y0g0Var, List<List<myb>> list, List<Long> list2) {
        int i;
        w11.m204365a(str.startsWith("Dialogue:"));
        String[] strArrSplit = str.substring(9).split(Constants.SEPARATOR_COMMA, y0g0Var.f196974e);
        if (strArrSplit.length != y0g0Var.f196974e) {
            kyv.m152151i("SsaDecoder", "Skipping dialogue line with fewer columns than format: ".concat(str));
            return;
        }
        long jM208829K = m208829K(strArrSplit[y0g0Var.f196970a]);
        if (jM208829K == -9223372036854775807L) {
            kyv.m152151i("SsaDecoder", "Skipping invalid timing: ".concat(str));
            return;
        }
        long jM208829K2 = m208829K(strArrSplit[y0g0Var.f196971b]);
        if (jM208829K2 == -9223372036854775807L) {
            kyv.m152151i("SsaDecoder", "Skipping invalid timing: ".concat(str));
            return;
        }
        Map<String, z0g0> map = this.f191896q;
        z0g0 z0g0Var = (map == null || (i = y0g0Var.f196972c) == -1) ? null : map.get(strArrSplit[i].trim());
        String str2 = strArrSplit[y0g0Var.f196973d];
        myb mybVarM208827D = m208827D(z0g0.C21729b.m218124d(str2).replace("\\N", SignParameters.NEW_LINE).replace("\\n", SignParameters.NEW_LINE).replace("\\h", " "), z0g0Var, z0g0.C21729b.m218122b(str2), this.f191897r, this.f191898s);
        int iM208825B = m208825B(jM208829K2, list2, list);
        for (int iM208825B2 = m208825B(jM208829K, list2, list); iM208825B2 < iM208825B; iM208825B2++) {
            list.get(iM208825B2).add(mybVarM208827D);
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m208835G(ig60 ig60Var, List<List<myb>> list, List<Long> list2, Charset charset) {
        y0g0 y0g0VarM213848a = this.f191894o ? this.f191895p : null;
        while (true) {
            String strM139830t = ig60Var.m139830t(charset);
            if (strM139830t == null) {
                return;
            }
            if (strM139830t.startsWith("Format:")) {
                y0g0VarM213848a = y0g0.m213848a(strM139830t);
            } else if (strM139830t.startsWith("Dialogue:")) {
                if (y0g0VarM213848a == null) {
                    kyv.m152151i("SsaDecoder", "Skipping dialogue line before complete format: ".concat(strM139830t));
                } else {
                    m208834F(strM139830t, y0g0VarM213848a, list, list2);
                }
            }
        }
    }

    /* JADX INFO: renamed from: H */
    public final void m208836H(ig60 ig60Var, Charset charset) {
        while (true) {
            String strM139830t = ig60Var.m139830t(charset);
            if (strM139830t == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(strM139830t)) {
                m208837I(ig60Var, charset);
            } else if ("[V4+ Styles]".equalsIgnoreCase(strM139830t)) {
                this.f191896q = m208828J(ig60Var, charset);
            } else if ("[V4 Styles]".equalsIgnoreCase(strM139830t)) {
                kyv.m152148f("SsaDecoder", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(strM139830t)) {
                return;
            }
        }
    }

    /* JADX INFO: renamed from: I */
    public final void m208837I(ig60 ig60Var, Charset charset) {
        while (true) {
            String strM139830t = ig60Var.m139830t(charset);
            if (strM139830t == null) {
                return;
            }
            if (ig60Var.m139811a() != 0 && ig60Var.m139818h(charset) == '[') {
                return;
            }
            String[] strArrSplit = strM139830t.split(":");
            if (strArrSplit.length == 2) {
                String strM138051e = i11.m138051e(strArrSplit[0].trim());
                strM138051e.getClass();
                if (strM138051e.equals("playresx")) {
                    this.f191897r = Float.parseFloat(strArrSplit[1].trim());
                } else if (strM138051e.equals("playresy")) {
                    try {
                        this.f191898s = Float.parseFloat(strArrSplit[1].trim());
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
    }

    public x0g0() {
        this(null);
    }
}
