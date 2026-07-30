package p153l;

import android.content.Context;
import android.media.AudioFormat;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class xry0 {

    /* JADX INFO: renamed from: a */
    public Boolean f196051a;

    public xry0(@Nullable Context context) {
    }

    /* JADX INFO: renamed from: a */
    public final fpy0 m212945a(sqr0 sqr0Var, w3y0 w3y0Var) {
        sqr0Var.getClass();
        w3y0Var.getClass();
        int i = mpw0.f137957a;
        if (i < 29 || sqr0Var.f170265z == -1) {
            return fpy0.f100230d;
        }
        if (this.f196051a == null) {
            this.f196051a = Boolean.FALSE;
        }
        String str = sqr0Var.f170251l;
        str.getClass();
        int iM96489a = a8t0.m96489a(str, sqr0Var.f170248i);
        if (iM96489a == 0 || i < mpw0.m159423u(iM96489a)) {
            return fpy0.f100230d;
        }
        int iM159424v = mpw0.m159424v(sqr0Var.f170264y);
        if (iM159424v == 0) {
            return fpy0.f100230d;
        }
        try {
            AudioFormat audioFormatM159398K = mpw0.m159398K(sqr0Var.f170265z, iM159424v, iM96489a);
            return i >= 31 ? wry0.m207712a(audioFormatM159398K, w3y0Var.m204797a().f176116a, false) : vry0.m202567a(audioFormatM159398K, w3y0Var.m204797a().f176116a, false);
        } catch (IllegalArgumentException unused) {
            return fpy0.f100230d;
        }
    }

    public xry0() {
    }
}
