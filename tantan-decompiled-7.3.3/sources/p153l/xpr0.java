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
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public final class xpr0 implements xor0 {

    /* JADX INFO: renamed from: g */
    public static final Pattern f195734g = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* JADX INFO: renamed from: a */
    public final boolean f195735a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final wpr0 f195736b;

    /* JADX INFO: renamed from: c */
    public final bgw0 f195737c;

    /* JADX INFO: renamed from: d */
    public Map f195738d;

    /* JADX INFO: renamed from: e */
    public float f195739e;

    /* JADX INFO: renamed from: f */
    public float f195740f;

    public xpr0(@Nullable List list) {
        this.f195739e = -3.4028235E38f;
        this.f195740f = -3.4028235E38f;
        this.f195737c = new bgw0();
        if (list == null || list.isEmpty()) {
            this.f195735a = false;
            this.f195736b = null;
            return;
        }
        this.f195735a = true;
        String strM159402O = mpw0.m159402O((byte[]) list.get(0));
        lev0.m153956d(strM159402O.startsWith("Format:"));
        wpr0 wpr0VarM207497a = wpr0.m207497a(strM159402O);
        wpr0VarM207497a.getClass();
        this.f195736b = wpr0VarM207497a;
        m212679e(new bgw0((byte[]) list.get(1)), cow0.f82931c);
    }

    /* JADX INFO: renamed from: b */
    private static float m212676b(int i) {
        if (i == 0) {
            return 0.05f;
        }
        if (i != 1) {
            return i != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    /* JADX INFO: renamed from: c */
    public static int m212677c(long j, List list, List list2) {
        int i;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                i = 0;
                break;
            }
            if (((Long) list.get(size)).longValue() == j) {
                return size;
            }
            if (((Long) list.get(size)).longValue() < j) {
                i = size + 1;
                break;
            }
        }
        list.add(i, Long.valueOf(j));
        list2.add(i, i == 0 ? new ArrayList() : new ArrayList((Collection) list2.get(i - 1)));
        return i;
    }

    /* JADX INFO: renamed from: d */
    public static long m212678d(String str) {
        Matcher matcher = f195734g.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String strGroup = matcher.group(1);
        int i = mpw0.f137957a;
        long j = Long.parseLong(strGroup) * 3600000000L;
        long j2 = Long.parseLong(matcher.group(2)) * 60000000;
        return j + j2 + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(4)) * 10000);
    }

    /* JADX WARN: Code duplicated, block: B:118:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:130:0x02d6 A[SYNTHETIC] */
    @Override // p153l.xor0
    /* JADX INFO: renamed from: a */
    public final void mo105973a(byte[] bArr, int i, int i2, wor0 wor0Var, hkv0 hkv0Var) {
        Layout.Alignment alignment;
        int i3;
        int i4;
        int i5;
        Integer num;
        int i6;
        xpr0 xpr0Var = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        xpr0Var.f195737c.m104267i(bArr, i + i2);
        xpr0Var.f195737c.m104269k(i);
        Charset charsetM104260b = xpr0Var.f195737c.m104260b();
        if (charsetM104260b == null) {
            charsetM104260b = cow0.f82931c;
        }
        if (!xpr0Var.f195735a) {
            xpr0Var.m212679e(xpr0Var.f195737c, charsetM104260b);
        }
        bgw0 bgw0Var = xpr0Var.f195737c;
        wpr0 wpr0VarM207497a = xpr0Var.f195735a ? xpr0Var.f195736b : null;
        while (true) {
            String strM104257N = bgw0Var.m104257N(charsetM104260b);
            if (strM104257N == null) {
                int i7 = 0;
                while (i7 < arrayList.size()) {
                    List list = (List) arrayList.get(i7);
                    if (!list.isEmpty()) {
                        if (i7 != arrayList.size() - 1) {
                            wpg0.m207458a();
                            return;
                        }
                        hkv0Var.zza(new qor0(list, ((Long) arrayList2.get(i7)).longValue(), ((Long) arrayList2.get(i7 + 1)).longValue() - ((Long) arrayList2.get(i7)).longValue()));
                    } else if (i7 == 0) {
                        i7 = 0;
                        if (i7 != arrayList.size() - 1) {
                            wpg0.m207458a();
                            return;
                        }
                        hkv0Var.zza(new qor0(list, ((Long) arrayList2.get(i7)).longValue(), ((Long) arrayList2.get(i7 + 1)).longValue() - ((Long) arrayList2.get(i7)).longValue()));
                    }
                    i7++;
                }
                return;
            }
            if (strM104257N.startsWith("Format:")) {
                wpr0VarM207497a = wpr0.m207497a(strM104257N);
            } else {
                if (strM104257N.startsWith("Dialogue:")) {
                    if (wpr0VarM207497a == null) {
                        y4w0.m214278f("SsaParser", "Skipping dialogue line before complete format: ".concat(strM104257N));
                    } else {
                        lev0.m153956d(strM104257N.startsWith("Dialogue:"));
                        String[] strArrSplit = strM104257N.substring(9).split(Constants.SEPARATOR_COMMA, wpr0VarM207497a.f190343e);
                        if (strArrSplit.length != wpr0VarM207497a.f190343e) {
                            y4w0.m214278f("SsaParser", "Skipping dialogue line with fewer columns than format: ".concat(strM104257N));
                        } else {
                            if (m212678d(strArrSplit[wpr0VarM207497a.f190339a]) == -9223372036854775807L) {
                                y4w0.m214278f("SsaParser", "Skipping invalid timing: ".concat(strM104257N));
                            } else {
                                long jM212678d = m212678d(strArrSplit[wpr0VarM207497a.f190340b]);
                                if (jM212678d == -9223372036854775807L) {
                                    y4w0.m214278f("SsaParser", "Skipping invalid timing: ".concat(strM104257N));
                                } else {
                                    Map map = xpr0Var.f195738d;
                                    aqr0 aqr0Var = (map == null || (i6 = wpr0VarM207497a.f190341c) == -1) ? null : (aqr0) map.get(strArrSplit[i6].trim());
                                    String str = strArrSplit[wpr0VarM207497a.f190342d];
                                    zpr0 zpr0VarM220928a = zpr0.m220928a(str);
                                    String strReplace = zpr0.m220929b(str).replace("\\N", SignParameters.NEW_LINE).replace("\\n", SignParameters.NEW_LINE).replace("\\h", " ");
                                    float f = xpr0Var.f195739e;
                                    float f2 = xpr0Var.f195740f;
                                    SpannableString spannableString = new SpannableString(strReplace);
                                    j2v0 j2v0Var = new j2v0();
                                    j2v0Var.m143277l(spannableString);
                                    if (aqr0Var != null) {
                                        Integer num2 = aqr0Var.f72840c;
                                        if (num2 != null) {
                                            spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                        }
                                        if (aqr0Var.f72847j == 3 && (num = aqr0Var.f72841d) != null) {
                                            spannableString.setSpan(new BackgroundColorSpan(num.intValue()), 0, spannableString.length(), 33);
                                        }
                                        float f3 = aqr0Var.f72842e;
                                        if (f3 != -3.4028235E38f && f2 != -3.4028235E38f) {
                                            j2v0Var.m143279n(f3 / f2, 1);
                                        }
                                        boolean z = aqr0Var.f72843f;
                                        boolean z2 = aqr0Var.f72844g;
                                        if (!z) {
                                            i4 = 33;
                                            i5 = 0;
                                            if (z2) {
                                                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
                                            }
                                        } else if (z2) {
                                            i4 = 33;
                                            i5 = 0;
                                            spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
                                        } else {
                                            i4 = 33;
                                            i5 = 0;
                                            spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
                                        }
                                        if (aqr0Var.f72845h) {
                                            spannableString.setSpan(new UnderlineSpan(), i5, spannableString.length(), i4);
                                        }
                                        if (aqr0Var.f72846i) {
                                            spannableString.setSpan(new StrikethroughSpan(), i5, spannableString.length(), i4);
                                        }
                                    } else {
                                        bgw0Var = bgw0Var;
                                        wpr0VarM207497a = wpr0VarM207497a;
                                        f = f;
                                    }
                                    int i8 = zpr0VarM220928a.f205527a;
                                    int i9 = i8 != -1 ? i8 : aqr0Var != null ? aqr0Var.f72839b : -1;
                                    switch (i9) {
                                        case 0:
                                        default:
                                            y4w0.m214278f("SsaParser", "Unknown alignment: " + i9);
                                        case -1:
                                            alignment = null;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            alignment = Layout.Alignment.ALIGN_NORMAL;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            alignment = Layout.Alignment.ALIGN_CENTER;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            alignment = Layout.Alignment.ALIGN_OPPOSITE;
                                            break;
                                    }
                                    j2v0Var.m143278m(alignment);
                                    int i10 = Integer.MIN_VALUE;
                                    switch (i9) {
                                        case 0:
                                        default:
                                            y4w0.m214278f("SsaParser", "Unknown alignment: " + i9);
                                        case -1:
                                            i3 = Integer.MIN_VALUE;
                                            break;
                                        case 1:
                                        case 4:
                                        case 7:
                                            i3 = 0;
                                            break;
                                        case 2:
                                        case 5:
                                        case 8:
                                            i3 = 1;
                                            break;
                                        case 3:
                                        case 6:
                                        case 9:
                                            i3 = 2;
                                            break;
                                    }
                                    j2v0Var.m143274i(i3);
                                    switch (i9) {
                                        case -1:
                                            break;
                                        case 0:
                                        default:
                                            y4w0.m214278f("SsaParser", "Unknown alignment: " + i9);
                                            break;
                                        case 1:
                                        case 2:
                                        case 3:
                                            i10 = 2;
                                            break;
                                        case 4:
                                        case 5:
                                        case 6:
                                            i10 = 1;
                                            break;
                                        case 7:
                                        case 8:
                                        case 9:
                                            i10 = 0;
                                            break;
                                    }
                                    j2v0Var.m143271f(i10);
                                    PointF pointF = zpr0VarM220928a.f205528b;
                                    if (pointF == null || f2 == -3.4028235E38f || f == -3.4028235E38f) {
                                        j2v0Var.m143273h(m212676b(j2v0Var.m143267b()));
                                        j2v0Var.m143270e(m212676b(j2v0Var.m143266a()), 0);
                                    } else {
                                        j2v0Var.m143273h(pointF.x / f);
                                        j2v0Var.m143270e(zpr0VarM220928a.f205528b.y / f2, 0);
                                    }
                                    u4v0 u4v0VarM143281p = j2v0Var.m143281p();
                                    int iM212677c = m212677c(jM212678d, arrayList2, arrayList);
                                    for (int iM212677c2 = m212677c(r13, arrayList2, arrayList); iM212677c2 < iM212677c; iM212677c2++) {
                                        ((List) arrayList.get(iM212677c2)).add(u4v0VarM143281p);
                                    }
                                }
                            }
                        }
                    }
                    bgw0Var = bgw0Var;
                    wpr0VarM207497a = wpr0VarM207497a;
                } else {
                    bgw0Var = bgw0Var;
                    wpr0VarM207497a = wpr0VarM207497a;
                }
                xpr0Var = this;
                charsetM104260b = charsetM104260b;
                wpr0VarM207497a = wpr0VarM207497a;
                bgw0Var = bgw0Var;
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: e */
    public final void m212679e(bgw0 bgw0Var, Charset charset) {
        while (true) {
            String strM104257N = bgw0Var.m104257N(charset);
            if (strM104257N == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(strM104257N)) {
                while (true) {
                    String strM104257N2 = bgw0Var.m104257N(charset);
                    if (strM104257N2 == null || (bgw0Var.m104275q() != 0 && bgw0Var.m104274p(charset) == '[')) {
                        break;
                    }
                    String[] strArrSplit = strM104257N2.split(":");
                    if (strArrSplit.length == 2) {
                        String strM207228a = wnw0.m207228a(strArrSplit[0].trim());
                        switch (strM207228a.hashCode()) {
                            case 1879649548:
                                if (strM207228a.equals("playresx")) {
                                    this.f195739e = Float.parseFloat(strArrSplit[1].trim());
                                }
                                break;
                            case 1879649549:
                                if (strM207228a.equals("playresy")) {
                                    try {
                                        this.f195740f = Float.parseFloat(strArrSplit[1].trim());
                                    } catch (NumberFormatException unused) {
                                    }
                                }
                                break;
                        }
                    }
                }
            } else if ("[V4+ Styles]".equalsIgnoreCase(strM104257N)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                ypr0 ypr0VarM217032a = null;
                while (true) {
                    String strM104257N3 = bgw0Var.m104257N(charset);
                    if (strM104257N3 != null && (bgw0Var.m104275q() == 0 || bgw0Var.m104274p(charset) != '[')) {
                        if (strM104257N3.startsWith("Format:")) {
                            ypr0VarM217032a = ypr0.m217032a(strM104257N3);
                        } else if (strM104257N3.startsWith("Style:")) {
                            if (ypr0VarM217032a == null) {
                                y4w0.m214278f("SsaParser", "Skipping 'Style:' line before 'Format:' line: ".concat(strM104257N3));
                            } else {
                                aqr0 aqr0VarM99550b = aqr0.m99550b(strM104257N3, ypr0VarM217032a);
                                if (aqr0VarM99550b != null) {
                                    linkedHashMap.put(aqr0VarM99550b.f72838a, aqr0VarM99550b);
                                }
                            }
                        }
                    }
                }
                this.f195738d = linkedHashMap;
            } else if ("[V4 Styles]".equalsIgnoreCase(strM104257N)) {
                y4w0.m214277e("SsaParser", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(strM104257N)) {
                return;
            }
        }
    }

    public xpr0() {
        this(null);
    }
}
