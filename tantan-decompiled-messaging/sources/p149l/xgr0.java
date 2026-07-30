package p149l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzgaf;
import com.p046p1.mobile.putong.data.OMSSwipeMoment;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public final class xgr0 {

    /* JADX INFO: renamed from: d */
    public static final Pattern f192785d = Pattern.compile("\\s+");

    /* JADX INFO: renamed from: e */
    public static final zzgaf f192786e = zzgaf.zzp("auto", "none");

    /* JADX INFO: renamed from: f */
    public static final zzgaf f192787f = zzgaf.zzq("dot", "sesame", "circle");

    /* JADX INFO: renamed from: g */
    public static final zzgaf f192788g = zzgaf.zzp("filled", "open");

    /* JADX INFO: renamed from: h */
    public static final zzgaf f192789h = zzgaf.zzq(OMSSwipeMoment.after, OMSSwipeMoment.before, "outside");

    /* JADX INFO: renamed from: a */
    public final int f192790a;

    /* JADX INFO: renamed from: b */
    public final int f192791b;

    /* JADX INFO: renamed from: c */
    public final int f192792c;

    public xgr0(int i, int i2, int i3) {
        this.f192790a = i;
        this.f192791b = i2;
        this.f192792c = i3;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004d  */
    /* JADX WARN: Code duplicated, block: B:26:0x007b  */
    @Nullable
    /* JADX INFO: renamed from: a */
    public static xgr0 m208692a(@Nullable String str) {
        int i;
        if (str == null) {
            return null;
        }
        String strM174257a = qew0.m174257a(str.trim());
        if (strM174257a.isEmpty()) {
            return null;
        }
        zzgaf zzgafVarZzm = zzgaf.zzm(TextUtils.split(strM174257a, f192785d));
        String str2 = (String) niw0.m159575a(vjw0.m198702b(f192789h, zzgafVarZzm), "outside");
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
        rjw0 rjw0VarM198702b = vjw0.m198702b(f192786e, zzgafVarZzm);
        int i3 = 0;
        if (rjw0VarM198702b.isEmpty()) {
            rjw0 rjw0VarM198702b2 = vjw0.m198702b(f192788g, zzgafVarZzm);
            rjw0 rjw0VarM198702b3 = vjw0.m198702b(f192787f, zzgafVarZzm);
            if (rjw0VarM198702b2.isEmpty() && rjw0VarM198702b3.isEmpty()) {
                i2 = -1;
            } else {
                String str3 = (String) niw0.m159575a(rjw0VarM198702b2, "filled");
                i3 = (str3.hashCode() == 3417674 && str3.equals("open")) ? 2 : 1;
                String str4 = (String) niw0.m159575a(rjw0VarM198702b3, "circle");
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
            String str5 = (String) rjw0VarM198702b.iterator().next();
            if (str5.hashCode() == 3387192 && str5.equals("none")) {
                i2 = 0;
            } else {
                i2 = -1;
            }
        }
        return new xgr0(i2, i3, i);
    }
}
