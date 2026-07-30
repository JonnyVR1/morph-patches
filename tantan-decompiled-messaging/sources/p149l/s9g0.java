package p149l;

import android.graphics.Bitmap;
import okio.Source;

/* JADX INFO: loaded from: classes.dex */
public final class s9g0 {

    /* JADX INFO: renamed from: a */
    public final int f163179a;

    /* JADX INFO: renamed from: b */
    public final Bitmap f163180b;

    /* JADX INFO: renamed from: c */
    public final Source f163181c;

    /* JADX INFO: renamed from: d */
    public final int f163182d;

    public s9g0(Bitmap bitmap, Source source, int i, int i2) {
        if ((bitmap != null) == (source != null)) {
            shg0.m184191a();
            throw null;
        }
        this.f163180b = bitmap;
        this.f163181c = source;
        StringBuilder sb = slq0.f165256a;
        if (i == 0) {
            jfd0.m141176a("loadedFrom == null");
            throw null;
        }
        this.f163179a = i;
        this.f163182d = i2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public s9g0(Source source, int i) {
        this(null, source, i, 0);
        StringBuilder sb = slq0.f165256a;
        if (source != null) {
        } else {
            jfd0.m141176a("source == null");
            throw null;
        }
    }
}
