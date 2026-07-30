package p149l;

import com.google.android.gms.internal.ads.zzagk;
import com.google.android.gms.internal.ads.zzagt;
import com.google.android.gms.internal.ads.zzbx;
import com.google.android.gms.internal.ads.zzby;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public final class l6r0 {

    /* JADX INFO: renamed from: c */
    public static final Pattern f126656c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* JADX INFO: renamed from: a */
    public int f126657a = -1;

    /* JADX INFO: renamed from: b */
    public int f126658b = -1;

    /* JADX INFO: renamed from: a */
    public final boolean m148754a() {
        return (this.f126657a == -1 || this.f126658b == -1) ? false : true;
    }

    /* JADX INFO: renamed from: b */
    public final boolean m148755b(zzby zzbyVar) {
        for (int i = 0; i < zzbyVar.m13551a(); i++) {
            zzbx zzbxVarM13552b = zzbyVar.m13552b(i);
            if (zzbxVarM13552b instanceof zzagk) {
                zzagk zzagkVar = (zzagk) zzbxVarM13552b;
                if ("iTunSMPB".equals(zzagkVar.zzb) && m148756c(zzagkVar.zzc)) {
                    return true;
                }
            } else if (zzbxVarM13552b instanceof zzagt) {
                zzagt zzagtVar = (zzagt) zzbxVarM13552b;
                if ("com.apple.iTunes".equals(zzagtVar.zza) && "iTunSMPB".equals(zzagtVar.zzb) && m148756c(zzagtVar.zzc)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m148756c(String str) {
        Matcher matcher = f126656c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            int i = ggw0.f102568a;
            int i2 = Integer.parseInt(strGroup, 16);
            int i3 = Integer.parseInt(matcher.group(2), 16);
            if (i2 <= 0 && i3 <= 0) {
                return false;
            }
            this.f126657a = i2;
            this.f126658b = i3;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
