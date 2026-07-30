package p149l;

import android.media.AudioAttributes;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes6.dex */
@RequiresApi(21)
public final class nkx0 {

    /* JADX INFO: renamed from: a */
    public final AudioAttributes f139488a;

    public /* synthetic */ nkx0(qux0 qux0Var, p9x0 p9x0Var) {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
        int i = ggw0.f102568a;
        if (i >= 29) {
            lov0.m150813a(usage, 1);
        }
        if (i >= 32) {
            fiw0.m121563a(usage, 0);
        }
        this.f139488a = usage.build();
    }
}
