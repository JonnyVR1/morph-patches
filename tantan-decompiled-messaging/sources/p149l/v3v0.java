package p149l;

import android.os.Bundle;

/* JADX INFO: loaded from: classes6.dex */
public final class v3v0 {

    /* JADX INFO: renamed from: d */
    public static final String f179851d = Integer.toString(0, 36);

    /* JADX INFO: renamed from: e */
    public static final String f179852e = Integer.toString(1, 36);

    /* JADX INFO: renamed from: f */
    public static final String f179853f = Integer.toString(2, 36);

    /* JADX INFO: renamed from: a */
    public final int f179854a;

    /* JADX INFO: renamed from: b */
    public final int f179855b;

    /* JADX INFO: renamed from: c */
    public final int f179856c;

    public v3v0(int i, int i2, int i3) {
        this.f179854a = i;
        this.f179855b = i2;
        this.f179856c = i3;
    }

    /* JADX INFO: renamed from: a */
    public final Bundle m196874a() {
        Bundle bundle = new Bundle();
        bundle.putInt(f179851d, this.f179854a);
        bundle.putInt(f179852e, this.f179855b);
        bundle.putInt(f179853f, this.f179856c);
        return bundle;
    }
}
