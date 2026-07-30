package p149l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import com.p046p1.mobile.putong.data.OMSSwipeMoment;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class qii0 {

    /* JADX INFO: renamed from: d */
    public static final Pattern f154772d = Pattern.compile("\\s+");

    /* JADX INFO: renamed from: e */
    public static final ImmutableSet<String> f154773e = ImmutableSet.m15770of("auto", "none");

    /* JADX INFO: renamed from: f */
    public static final ImmutableSet<String> f154774f = ImmutableSet.m15771of("dot", "sesame", "circle");

    /* JADX INFO: renamed from: g */
    public static final ImmutableSet<String> f154775g = ImmutableSet.m15770of("filled", "open");

    /* JADX INFO: renamed from: h */
    public static final ImmutableSet<String> f154776h = ImmutableSet.m15771of(OMSSwipeMoment.after, OMSSwipeMoment.before, "outside");

    /* JADX INFO: renamed from: a */
    public final int f154777a;

    /* JADX INFO: renamed from: b */
    public final int f154778b;

    /* JADX INFO: renamed from: c */
    public final int f154779c;

    public qii0(int i, int i2, int i3) {
        this.f154777a = i;
        this.f154778b = i2;
        this.f154779c = i3;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static qii0 m174896a(@Nullable String str) {
        if (str == null) {
            return null;
        }
        String strM99804e = b11.m99804e(str.trim());
        if (strM99804e.isEmpty()) {
            return null;
        }
        return m174897b(ImmutableSet.copyOf(TextUtils.split(strM99804e, f154772d)));
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004b  */
    /* JADX WARN: Code duplicated, block: B:21:0x005e  */
    /* JADX WARN: Code duplicated, block: B:27:0x006e  */
    /* JADX WARN: Code duplicated, block: B:30:0x007a  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:48:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:50:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:53:0x00da  */
    /* JADX WARN: Code duplicated, block: B:56:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ee  */
    /* JADX INFO: renamed from: b */
    public static qii0 m174897b(ImmutableSet<String> immutableSet) {
        int i;
        Sets.AbstractC2919f abstractC2919fM16120e;
        int i2;
        Sets.AbstractC2919f abstractC2919fM16120e2;
        Sets.AbstractC2919f abstractC2919fM16120e3;
        String str;
        int iHashCode;
        int i3;
        String str2;
        int iHashCode2;
        String str3;
        int iHashCode3;
        String str4 = (String) aiq.m96880f(Sets.m16120e(f154776h, immutableSet), "outside");
        int iHashCode4 = str4.hashCode();
        int i4 = 1;
        if (iHashCode4 != -1392885889) {
            if (iHashCode4 != -1106037339) {
                if (iHashCode4 == 92734940 && str4.equals(OMSSwipeMoment.after)) {
                    i = 2;
                }
            } else if (str4.equals("outside")) {
                i = -2;
            }
            abstractC2919fM16120e = Sets.m16120e(f154773e, immutableSet);
            i2 = -1;
            if (!abstractC2919fM16120e.isEmpty()) {
                str3 = (String) abstractC2919fM16120e.iterator().next();
                iHashCode3 = str3.hashCode();
                if (iHashCode3 != 3005871) {
                    str3.equals("auto");
                } else if (iHashCode3 == 3387192 && str3.equals("none")) {
                    i2 = 0;
                }
                return new qii0(i2, 0, i);
            }
            abstractC2919fM16120e2 = Sets.m16120e(f154775g, immutableSet);
            abstractC2919fM16120e3 = Sets.m16120e(f154774f, immutableSet);
            if (!abstractC2919fM16120e2.isEmpty() && abstractC2919fM16120e3.isEmpty()) {
                return new qii0(-1, 0, i);
            }
            str = (String) aiq.m96880f(abstractC2919fM16120e2, "filled");
            iHashCode = str.hashCode();
            if (iHashCode != -1274499742) {
                if (iHashCode == 3417674 && str.equals("open")) {
                    i3 = 2;
                }
                str2 = (String) aiq.m96880f(abstractC2919fM16120e3, "circle");
                iHashCode2 = str2.hashCode();
                if (iHashCode2 != -1360216880) {
                    str2.equals("circle");
                } else if (iHashCode2 != -905816648) {
                    if (iHashCode2 == 99657 && str2.equals("dot")) {
                        i4 = 2;
                    }
                } else if (str2.equals("sesame")) {
                    i4 = 3;
                }
                return new qii0(i4, i3, i);
            }
            str.equals("filled");
            i3 = 1;
            str2 = (String) aiq.m96880f(abstractC2919fM16120e3, "circle");
            iHashCode2 = str2.hashCode();
            if (iHashCode2 != -1360216880) {
                str2.equals("circle");
            } else if (iHashCode2 != -905816648) {
                if (iHashCode2 == 99657) {
                    i4 = 2;
                }
            } else if (str2.equals("sesame")) {
                i4 = 3;
            }
            return new qii0(i4, i3, i);
        }
        str4.equals(OMSSwipeMoment.before);
        i = 1;
        abstractC2919fM16120e = Sets.m16120e(f154773e, immutableSet);
        i2 = -1;
        if (!abstractC2919fM16120e.isEmpty()) {
            str3 = (String) abstractC2919fM16120e.iterator().next();
            iHashCode3 = str3.hashCode();
            if (iHashCode3 != 3005871) {
                str3.equals("auto");
            } else if (iHashCode3 == 3387192) {
                i2 = 0;
            }
            return new qii0(i2, 0, i);
        }
        abstractC2919fM16120e2 = Sets.m16120e(f154775g, immutableSet);
        abstractC2919fM16120e3 = Sets.m16120e(f154774f, immutableSet);
        if (!abstractC2919fM16120e2.isEmpty()) {
        }
        str = (String) aiq.m96880f(abstractC2919fM16120e2, "filled");
        iHashCode = str.hashCode();
        if (iHashCode != -1274499742) {
            if (iHashCode == 3417674) {
                i3 = 2;
            }
            str2 = (String) aiq.m96880f(abstractC2919fM16120e3, "circle");
            iHashCode2 = str2.hashCode();
            if (iHashCode2 != -1360216880) {
                str2.equals("circle");
            } else if (iHashCode2 != -905816648) {
                if (iHashCode2 == 99657) {
                    i4 = 2;
                }
            } else if (str2.equals("sesame")) {
                i4 = 3;
            }
            return new qii0(i4, i3, i);
        }
        str.equals("filled");
        i3 = 1;
        str2 = (String) aiq.m96880f(abstractC2919fM16120e3, "circle");
        iHashCode2 = str2.hashCode();
        if (iHashCode2 != -1360216880) {
            str2.equals("circle");
        } else if (iHashCode2 != -905816648) {
            if (iHashCode2 == 99657) {
                i4 = 2;
            }
        } else if (str2.equals("sesame")) {
            i4 = 3;
        }
        return new qii0(i4, i3, i);
    }
}
