package p153l;

import android.os.Bundle;

/* JADX INFO: loaded from: classes6.dex */
public final class sav0 {

    /* JADX INFO: renamed from: c */
    public static final String f167074c = Integer.toString(0, 36);

    /* JADX INFO: renamed from: d */
    public static final String f167075d = Integer.toString(1, 36);

    /* JADX INFO: renamed from: a */
    public final String f167076a;

    /* JADX INFO: renamed from: b */
    public final int f167077b;

    public sav0(String str, int i) {
        this.f167076a = str;
        this.f167077b = i;
    }

    /* JADX INFO: renamed from: a */
    public final Bundle m185272a() {
        Bundle bundle = new Bundle();
        bundle.putString(f167074c, this.f167076a);
        bundle.putInt(f167075d, this.f167077b);
        return bundle;
    }
}
