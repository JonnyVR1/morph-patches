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
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public final class rgr0 implements rfr0 {

    /* JADX INFO: renamed from: g */
    public static final Pattern f159279g = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* JADX INFO: renamed from: a */
    public final boolean f159280a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final qgr0 f159281b;

    /* JADX INFO: renamed from: c */
    public final v6w0 f159282c;

    /* JADX INFO: renamed from: d */
    public Map f159283d;

    /* JADX INFO: renamed from: e */
    public float f159284e;

    /* JADX INFO: renamed from: f */
    public float f159285f;

    public rgr0(@Nullable List list) {
        this.f159284e = -3.4028235E38f;
        this.f159285f = -3.4028235E38f;
        this.f159282c = new v6w0();
        if (list == null || list.isEmpty()) {
            this.f159280a = false;
            this.f159281b = null;
            return;
        }
        this.f159280a = true;
        String strM126058O = ggw0.m126058O((byte[]) list.get(0));
        f5v0.m119533d(strM126058O.startsWith("Format:"));
        qgr0 qgr0VarM174455a = qgr0.m174455a(strM126058O);
        qgr0VarM174455a.getClass();
        this.f159281b = qgr0VarM174455a;
        m179259e(new v6w0((byte[]) list.get(1)), wew0.f185990c);
    }

    /* JADX INFO: renamed from: b */
    private static float m179256b(int i) {
        if (i == 0) {
            return 0.05f;
        }
        if (i != 1) {
            return i != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    /* JADX INFO: renamed from: c */
    public static int m179257c(long j, List list, List list2) {
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
    public static long m179258d(String str) {
        Matcher matcher = f159279g.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String strGroup = matcher.group(1);
        int i = ggw0.f102568a;
        long j = Long.parseLong(strGroup) * 3600000000L;
        long j2 = Long.parseLong(matcher.group(2)) * 60000000;
        return j + j2 + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(4)) * 10000);
    }

    /* JADX WARN: Code duplicated, block: B:118:0x02a7  */
    /* JADX WARN: Code duplicated, block: B:130:0x02d6 A[SYNTHETIC] */
    @Override // p149l.rfr0
    /* JADX INFO: renamed from: a */
    public final void mo101921a(byte[] bArr, int i, int i2, qfr0 qfr0Var, bbv0 bbv0Var) {
        Layout.Alignment alignment;
        int i3;
        int i4;
        int i5;
        Integer num;
        int i6;
        rgr0 rgr0Var = this;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        rgr0Var.f159282c.m197260i(bArr, i + i2);
        rgr0Var.f159282c.m197262k(i);
        Charset charsetM197253b = rgr0Var.f159282c.m197253b();
        if (charsetM197253b == null) {
            charsetM197253b = wew0.f185990c;
        }
        if (!rgr0Var.f159280a) {
            rgr0Var.m179259e(rgr0Var.f159282c, charsetM197253b);
        }
        v6w0 v6w0Var = rgr0Var.f159282c;
        qgr0 qgr0VarM174455a = rgr0Var.f159280a ? rgr0Var.f159281b : null;
        while (true) {
            String strM197250N = v6w0Var.m197250N(charsetM197253b);
            if (strM197250N == null) {
                int i7 = 0;
                while (i7 < arrayList.size()) {
                    List list = (List) arrayList.get(i7);
                    if (!list.isEmpty()) {
                        if (i7 != arrayList.size() - 1) {
                            ohg0.m164364a();
                            return;
                        }
                        bbv0Var.zza(new kfr0(list, ((Long) arrayList2.get(i7)).longValue(), ((Long) arrayList2.get(i7 + 1)).longValue() - ((Long) arrayList2.get(i7)).longValue()));
                    } else if (i7 == 0) {
                        i7 = 0;
                        if (i7 != arrayList.size() - 1) {
                            ohg0.m164364a();
                            return;
                        }
                        bbv0Var.zza(new kfr0(list, ((Long) arrayList2.get(i7)).longValue(), ((Long) arrayList2.get(i7 + 1)).longValue() - ((Long) arrayList2.get(i7)).longValue()));
                    }
                    i7++;
                }
                return;
            }
            if (strM197250N.startsWith("Format:")) {
                qgr0VarM174455a = qgr0.m174455a(strM197250N);
            } else {
                if (strM197250N.startsWith("Dialogue:")) {
                    if (qgr0VarM174455a == null) {
                        svv0.m186111f("SsaParser", "Skipping dialogue line before complete format: ".concat(strM197250N));
                    } else {
                        f5v0.m119533d(strM197250N.startsWith("Dialogue:"));
                        String[] strArrSplit = strM197250N.substring(9).split(Constants.SEPARATOR_COMMA, qgr0VarM174455a.f154374e);
                        if (strArrSplit.length != qgr0VarM174455a.f154374e) {
                            svv0.m186111f("SsaParser", "Skipping dialogue line with fewer columns than format: ".concat(strM197250N));
                        } else {
                            if (m179258d(strArrSplit[qgr0VarM174455a.f154370a]) == -9223372036854775807L) {
                                svv0.m186111f("SsaParser", "Skipping invalid timing: ".concat(strM197250N));
                            } else {
                                long jM179258d = m179258d(strArrSplit[qgr0VarM174455a.f154371b]);
                                if (jM179258d == -9223372036854775807L) {
                                    svv0.m186111f("SsaParser", "Skipping invalid timing: ".concat(strM197250N));
                                } else {
                                    Map map = rgr0Var.f159283d;
                                    ugr0 ugr0Var = (map == null || (i6 = qgr0VarM174455a.f154372c) == -1) ? null : (ugr0) map.get(strArrSplit[i6].trim());
                                    String str = strArrSplit[qgr0VarM174455a.f154373d];
                                    tgr0 tgr0VarM188823a = tgr0.m188823a(str);
                                    String strReplace = tgr0.m188824b(str).replace("\\N", SignParameters.NEW_LINE).replace("\\n", SignParameters.NEW_LINE).replace("\\h", " ");
                                    float f = rgr0Var.f159284e;
                                    float f2 = rgr0Var.f159285f;
                                    SpannableString spannableString = new SpannableString(strReplace);
                                    dtu0 dtu0Var = new dtu0();
                                    dtu0Var.m113594l(spannableString);
                                    if (ugr0Var != null) {
                                        Integer num2 = ugr0Var.f176413c;
                                        if (num2 != null) {
                                            spannableString.setSpan(new ForegroundColorSpan(num2.intValue()), 0, spannableString.length(), 33);
                                        }
                                        if (ugr0Var.f176420j == 3 && (num = ugr0Var.f176414d) != null) {
                                            spannableString.setSpan(new BackgroundColorSpan(num.intValue()), 0, spannableString.length(), 33);
                                        }
                                        float f3 = ugr0Var.f176415e;
                                        if (f3 != -3.4028235E38f && f2 != -3.4028235E38f) {
                                            dtu0Var.m113596n(f3 / f2, 1);
                                        }
                                        boolean z = ugr0Var.f176416f;
                                        boolean z2 = ugr0Var.f176417g;
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
                                        if (ugr0Var.f176418h) {
                                            spannableString.setSpan(new UnderlineSpan(), i5, spannableString.length(), i4);
                                        }
                                        if (ugr0Var.f176419i) {
                                            spannableString.setSpan(new StrikethroughSpan(), i5, spannableString.length(), i4);
                                        }
                                    } else {
                                        v6w0Var = v6w0Var;
                                        qgr0VarM174455a = qgr0VarM174455a;
                                        f = f;
                                    }
                                    int i8 = tgr0VarM188823a.f170124a;
                                    int i9 = i8 != -1 ? i8 : ugr0Var != null ? ugr0Var.f176412b : -1;
                                    switch (i9) {
                                        case 0:
                                        default:
                                            svv0.m186111f("SsaParser", "Unknown alignment: " + i9);
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
                                    dtu0Var.m113595m(alignment);
                                    int i10 = Integer.MIN_VALUE;
                                    switch (i9) {
                                        case 0:
                                        default:
                                            svv0.m186111f("SsaParser", "Unknown alignment: " + i9);
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
                                    dtu0Var.m113591i(i3);
                                    switch (i9) {
                                        case -1:
                                            break;
                                        case 0:
                                        default:
                                            svv0.m186111f("SsaParser", "Unknown alignment: " + i9);
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
                                    dtu0Var.m113588f(i10);
                                    PointF pointF = tgr0VarM188823a.f170125b;
                                    if (pointF == null || f2 == -3.4028235E38f || f == -3.4028235E38f) {
                                        dtu0Var.m113590h(m179256b(dtu0Var.m113584b()));
                                        dtu0Var.m113587e(m179256b(dtu0Var.m113583a()), 0);
                                    } else {
                                        dtu0Var.m113590h(pointF.x / f);
                                        dtu0Var.m113587e(tgr0VarM188823a.f170125b.y / f2, 0);
                                    }
                                    ovu0 ovu0VarM113598p = dtu0Var.m113598p();
                                    int iM179257c = m179257c(jM179258d, arrayList2, arrayList);
                                    for (int iM179257c2 = m179257c(r13, arrayList2, arrayList); iM179257c2 < iM179257c; iM179257c2++) {
                                        ((List) arrayList.get(iM179257c2)).add(ovu0VarM113598p);
                                    }
                                }
                            }
                        }
                    }
                    v6w0Var = v6w0Var;
                    qgr0VarM174455a = qgr0VarM174455a;
                } else {
                    v6w0Var = v6w0Var;
                    qgr0VarM174455a = qgr0VarM174455a;
                }
                rgr0Var = this;
                charsetM197253b = charsetM197253b;
                qgr0VarM174455a = qgr0VarM174455a;
                v6w0Var = v6w0Var;
            }
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: e */
    public final void m179259e(v6w0 v6w0Var, Charset charset) {
        while (true) {
            String strM197250N = v6w0Var.m197250N(charset);
            if (strM197250N == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(strM197250N)) {
                while (true) {
                    String strM197250N2 = v6w0Var.m197250N(charset);
                    if (strM197250N2 == null || (v6w0Var.m197268q() != 0 && v6w0Var.m197267p(charset) == '[')) {
                        break;
                    }
                    String[] strArrSplit = strM197250N2.split(":");
                    if (strArrSplit.length == 2) {
                        String strM174257a = qew0.m174257a(strArrSplit[0].trim());
                        switch (strM174257a.hashCode()) {
                            case 1879649548:
                                if (strM174257a.equals("playresx")) {
                                    this.f159284e = Float.parseFloat(strArrSplit[1].trim());
                                }
                                break;
                            case 1879649549:
                                if (strM174257a.equals("playresy")) {
                                    try {
                                        this.f159285f = Float.parseFloat(strArrSplit[1].trim());
                                    } catch (NumberFormatException unused) {
                                    }
                                }
                                break;
                        }
                    }
                }
            } else if ("[V4+ Styles]".equalsIgnoreCase(strM197250N)) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                sgr0 sgr0VarM184135a = null;
                while (true) {
                    String strM197250N3 = v6w0Var.m197250N(charset);
                    if (strM197250N3 != null && (v6w0Var.m197268q() == 0 || v6w0Var.m197267p(charset) != '[')) {
                        if (strM197250N3.startsWith("Format:")) {
                            sgr0VarM184135a = sgr0.m184135a(strM197250N3);
                        } else if (strM197250N3.startsWith("Style:")) {
                            if (sgr0VarM184135a == null) {
                                svv0.m186111f("SsaParser", "Skipping 'Style:' line before 'Format:' line: ".concat(strM197250N3));
                            } else {
                                ugr0 ugr0VarM193568b = ugr0.m193568b(strM197250N3, sgr0VarM184135a);
                                if (ugr0VarM193568b != null) {
                                    linkedHashMap.put(ugr0VarM193568b.f176411a, ugr0VarM193568b);
                                }
                            }
                        }
                    }
                }
                this.f159283d = linkedHashMap;
            } else if ("[V4 Styles]".equalsIgnoreCase(strM197250N)) {
                svv0.m186110e("SsaParser", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(strM197250N)) {
                return;
            }
        }
    }

    public rgr0() {
        this(null);
    }
}
