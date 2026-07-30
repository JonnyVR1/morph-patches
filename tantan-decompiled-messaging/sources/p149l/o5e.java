package p149l;

import androidx.annotation.Nullable;
import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class o5e {

    /* JADX INFO: renamed from: a */
    public final int f141891a;

    /* JADX INFO: renamed from: b */
    public final int f141892b;

    /* JADX INFO: renamed from: c */
    public final String f141893c;

    public o5e(int i, int i2, String str) {
        this.f141891a = i;
        this.f141892b = i2;
        this.f141893c = str;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static o5e m162779a(d860 d860Var) {
        String str;
        d860Var.m110293V(2);
        int iM110279H = d860Var.m110279H();
        int i = iM110279H >> 1;
        int iM110279H2 = ((d860Var.m110279H() >> 3) & 31) | ((iM110279H & 1) << 5);
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
        sb.append(iM110279H2 >= 10 ? "." : ".0");
        sb.append(iM110279H2);
        return new o5e(i, iM110279H2, sb.toString());
    }
}
