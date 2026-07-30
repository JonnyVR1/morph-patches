package p153l;

import com.google.android.gms.internal.ads.zzagk;
import com.google.android.gms.internal.ads.zzagt;
import com.google.android.gms.internal.ads.zzbx;
import com.google.android.gms.internal.ads.zzby;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public final class rfr0 {

    /* JADX INFO: renamed from: c */
    public static final Pattern f162859c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* JADX INFO: renamed from: a */
    public int f162860a = -1;

    /* JADX INFO: renamed from: b */
    public int f162861b = -1;

    /* JADX INFO: renamed from: a */
    public final boolean m181279a() {
        return (this.f162860a == -1 || this.f162861b == -1) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m181280b(zzby zzbyVar) {
        for (int i = 0; i < zzbyVar.m13605a(); i++) {
            zzbx zzbxVarM13606b = zzbyVar.m13606b(i);
            if (zzbxVarM13606b instanceof zzagk) {
                zzagk zzagkVar = (zzagk) zzbxVarM13606b;
                if ("iTunSMPB".equals(zzagkVar.zzb) && m181281c(zzagkVar.zzc)) {
                    return true;
                }
            } else if (zzbxVarM13606b instanceof zzagt) {
                zzagt zzagtVar = (zzagt) zzbxVarM13606b;
                if ("com.apple.iTunes".equals(zzagtVar.zza) && "iTunSMPB".equals(zzagtVar.zzb) && m181281c(zzagtVar.zzc)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m181281c(String str) {
        Matcher matcher = f162859c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            int i = mpw0.f137957a;
            int i2 = Integer.parseInt(strGroup, 16);
            int i3 = Integer.parseInt(matcher.group(2), 16);
            if (i2 <= 0 && i3 <= 0) {
                return false;
            }
            this.f162860a = i2;
            this.f162861b = i3;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
