package p153l;

import androidx.annotation.Nullable;
import com.coremedia.iso.boxes.sampleentry.VisualSampleEntry;

/* JADX INFO: loaded from: classes6.dex */
public final class ler0 {

    /* JADX INFO: renamed from: a */
    public final String f131786a;

    public ler0(int i, int i2, String str) {
        this.f131786a = str;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static ler0 m153936a(bgw0 bgw0Var) {
        String str;
        bgw0Var.m104270l(2);
        int iM104245B = bgw0Var.m104245B();
        int i = iM104245B >> 1;
        int i2 = iM104245B & 1;
        int iM104245B2 = bgw0Var.m104245B() >> 3;
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
        int i3 = iM104245B2 | (i2 << 5);
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(".0");
        sb.append(i);
        sb.append(i3 >= 10 ? "." : ".0");
        sb.append(i3);
        return new ler0(i, i3, sb.toString());
    }
}
