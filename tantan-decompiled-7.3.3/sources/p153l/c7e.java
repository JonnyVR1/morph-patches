package p153l;

import androidx.annotation.Nullable;
import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class c7e {

    /* JADX INFO: renamed from: a */
    public final int f80106a;

    /* JADX INFO: renamed from: b */
    public final int f80107b;

    /* JADX INFO: renamed from: c */
    public final String f80108c;

    public c7e(int i, int i2, String str) {
        this.f80106a = i;
        this.f80107b = i2;
        this.f80108c = str;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static c7e m108303a(ig60 ig60Var) {
        String str;
        ig60Var.m139809V(2);
        int iM139795H = ig60Var.m139795H();
        int i = iM139795H >> 1;
        int iM139795H2 = ((ig60Var.m139795H() >> 3) & 31) | ((iM139795H & 1) << 5);
        if (i == 4 || i == 5 || i == 7) {
            str = "dvhe";
        } else if (i == 8) {
            str = VisualSampleEntry.TYPE7;
        } else {
            if (i != 9) {
                return null;
            }
            str = VisualSampleEntry.TYPE4;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".0");
        sb.append(i);
        sb.append(iM139795H2 >= 10 ? "." : ".0");
        sb.append(iM139795H2);
        return new c7e(i, iM139795H2, sb.toString());
    }
}
