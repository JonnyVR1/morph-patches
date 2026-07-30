package p149l;

import com.google.android.gms.internal.measurement.zzik;

/* JADX INFO: loaded from: classes6.dex */
public final class q5y0 {
    /* JADX INFO: renamed from: a */
    public static String m173104a(zzik zzikVar) {
        n5y0 n5y0Var = new n5y0(zzikVar);
        StringBuilder sb = new StringBuilder(n5y0Var.zza());
        for (int i = 0; i < n5y0Var.zza(); i++) {
            byte bZza = n5y0Var.zza(i);
            if (bZza == 34) {
                sb.append("\\\"");
            } else if (bZza == 39) {
                sb.append("\\'");
            } else if (bZza != 92) {
                switch (bZza) {
                    case 7:
                        sb.append("\\a");
                        break;
                    case 8:
                        sb.append("\\b");
                        break;
                    case 9:
                        sb.append("\\t");
                        break;
                    case 10:
                        sb.append("\\n");
                        break;
                    case 11:
                        sb.append("\\v");
                        break;
                    case 12:
                        sb.append("\\f");
                        break;
                    case 13:
                        sb.append("\\r");
                        break;
                    default:
                        if (bZza < 32 || bZza > 126) {
                            sb.append('\\');
                            sb.append((char) (((bZza >>> 6) & 3) + 48));
                            sb.append((char) (((bZza >>> 3) & 7) + 48));
                            sb.append((char) ((bZza & 7) + 48));
                        } else {
                            sb.append((char) bZza);
                        }
                        break;
                }
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
