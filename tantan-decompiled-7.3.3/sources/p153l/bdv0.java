package p153l;

import android.os.Bundle;

/* JADX INFO: loaded from: classes6.dex */
public final class bdv0 {

    /* JADX INFO: renamed from: d */
    public static final String f76300d = Integer.toString(0, 36);

    /* JADX INFO: renamed from: e */
    public static final String f76301e = Integer.toString(1, 36);

    /* JADX INFO: renamed from: f */
    public static final String f76302f = Integer.toString(2, 36);

    /* JADX INFO: renamed from: a */
    public final int f76303a;

    /* JADX INFO: renamed from: b */
    public final int f76304b;

    /* JADX INFO: renamed from: c */
    public final int f76305c;

    public bdv0(int i, int i2, int i3) {
        this.f76303a = i;
        this.f76304b = i2;
        this.f76305c = i3;
    }

    /* JADX INFO: renamed from: a */
    public final Bundle m103641a() {
        Bundle bundle = new Bundle();
        bundle.putInt(f76300d, this.f76303a);
        bundle.putInt(f76301e, this.f76304b);
        bundle.putInt(f76302f, this.f76305c);
        return bundle;
    }
}
