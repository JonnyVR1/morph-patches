package p149l;

import androidx.annotation.Nullable;
import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;

/* JADX INFO: loaded from: classes6.dex */
public final class f5r0 {

    /* JADX INFO: renamed from: a */
    public final String f95199a;

    public f5r0(int i, int i2, String str) {
        this.f95199a = str;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static f5r0 m119516a(v6w0 v6w0Var) {
        String str;
        v6w0Var.m197263l(2);
        int iM197238B = v6w0Var.m197238B();
        int i = iM197238B >> 1;
        int i2 = iM197238B & 1;
        int iM197238B2 = v6w0Var.m197238B() >> 3;
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
        int i3 = iM197238B2 | (i2 << 5);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".0");
        sb.append(i);
        sb.append(i3 >= 10 ? "." : ".0");
        sb.append(i3);
        return new f5r0(i, i3, sb.toString());
    }
}
