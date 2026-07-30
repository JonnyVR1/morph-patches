package p153l;

import android.graphics.Bitmap;
import okio.Source;

/* JADX INFO: loaded from: classes.dex */
public final class aig0 {

    /* JADX INFO: renamed from: a */
    public final int f71528a;

    /* JADX INFO: renamed from: b */
    public final Bitmap f71529b;

    /* JADX INFO: renamed from: c */
    public final Source f71530c;

    /* JADX INFO: renamed from: d */
    public final int f71531d;

    public aig0(Bitmap bitmap, Source source, int i, int i2) {
        if ((bitmap != null) == (source != null)) {
            aqg0.m99478a();
            throw null;
        }
        this.f71529b = bitmap;
        this.f71530c = source;
        StringBuilder sb = yuq0.f201657a;
        if (i == 0) {
            mnd0.m159157a("loadedFrom == null");
            throw null;
        }
        this.f71528a = i;
        this.f71531d = i2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public aig0(Source source, int i) {
        this(null, source, i, 0);
        StringBuilder sb = yuq0.f201657a;
        if (source != null) {
        } else {
            mnd0.m159157a("source == null");
            throw null;
        }
    }
}
