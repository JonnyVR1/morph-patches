package p153l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzgaf;
import com.p051p1.mobile.putong.data.OMSSwipeMoment;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public final class dqr0 {

    /* JADX INFO: renamed from: d */
    public static final Pattern f90280d = Pattern.compile("\\s+");

    /* JADX INFO: renamed from: e */
    public static final zzgaf f90281e = zzgaf.zzp("auto", "none");

    /* JADX INFO: renamed from: f */
    public static final zzgaf f90282f = zzgaf.zzq("dot", "sesame", "circle");

    /* JADX INFO: renamed from: g */
    public static final zzgaf f90283g = zzgaf.zzp("filled", "open");

    /* JADX INFO: renamed from: h */
    public static final zzgaf f90284h = zzgaf.zzq(OMSSwipeMoment.after, OMSSwipeMoment.before, "outside");

    /* JADX INFO: renamed from: a */
    public final int f90285a;

    /* JADX INFO: renamed from: b */
    public final int f90286b;

    /* JADX INFO: renamed from: c */
    public final int f90287c;

    public dqr0(int i, int i2, int i3) {
        this.f90285a = i;
        this.f90286b = i2;
        this.f90287c = i3;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004d  */
    /* JADX WARN: Code duplicated, block: B:26:0x007b  */
    @Nullable
    /* JADX INFO: renamed from: a */
    public static dqr0 m117567a(@Nullable String str) {
        int i;
        if (str == null) {
            return null;
        }
        String strM207228a = wnw0.m207228a(str.trim());
        if (strM207228a.isEmpty()) {
            return null;
        }
        zzgaf zzgafVarZzm = zzgaf.zzm(TextUtils.split(strM207228a, f90280d));
        String str2 = (String) trw0.m192527a(btw0.m106404b(f90284h, zzgafVarZzm), "outside");
        int iHashCode = str2.hashCode();
        int i2 = 1;
        if (iHashCode != -1106037339) {
            if (iHashCode == 92734940 && str2.equals(OMSSwipeMoment.after)) {
                i = 2;
            } else {
                i = 1;
            }
        } else if (str2.equals("outside")) {
            i = -2;
        } else {
            i = 1;
        }
        xsw0 xsw0VarM106404b = btw0.m106404b(f90281e, zzgafVarZzm);
        int i3 = 0;
        if (xsw0VarM106404b.isEmpty()) {
            xsw0 xsw0VarM106404b2 = btw0.m106404b(f90283g, zzgafVarZzm);
            xsw0 xsw0VarM106404b3 = btw0.m106404b(f90282f, zzgafVarZzm);
            if (xsw0VarM106404b2.isEmpty() && xsw0VarM106404b3.isEmpty()) {
                i2 = -1;
            } else {
                String str3 = (String) trw0.m192527a(xsw0VarM106404b2, "filled");
                i3 = (str3.hashCode() == 3417674 && str3.equals("open")) ? 2 : 1;
                String str4 = (String) trw0.m192527a(xsw0VarM106404b3, "circle");
                int iHashCode2 = str4.hashCode();
                if (iHashCode2 != -905816648) {
                    if (iHashCode2 == 99657 && str4.equals("dot")) {
                        i2 = 2;
                    }
                } else if (str4.equals("sesame")) {
                    i2 = 3;
                }
            }
        } else {
            String str5 = (String) xsw0VarM106404b.iterator().next();
            if (str5.hashCode() == 3387192 && str5.equals("none")) {
                i2 = 0;
            } else {
                i2 = -1;
            }
        }
        return new dqr0(i2, i3, i);
    }
}
