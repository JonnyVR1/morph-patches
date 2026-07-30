package p153l;

import android.media.AudioAttributes;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes6.dex */
@RequiresApi(21)
public final class ttx0 {

    /* JADX INFO: renamed from: a */
    public final AudioAttributes f176116a;

    public /* synthetic */ ttx0(w3y0 w3y0Var, vix0 vix0Var) {
        AudioAttributes.Builder usage = new AudioAttributes.Builder().setContentType(0).setFlags(0).setUsage(1);
        int i = mpw0.f137957a;
        if (i >= 29) {
            rxv0.m183567a(usage, 1);
        }
        if (i >= 32) {
            lrw0.m155666a(usage, 0);
        }
        this.f176116a = usage.build();
    }
}
