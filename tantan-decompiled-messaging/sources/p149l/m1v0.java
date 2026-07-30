package p149l;

import android.os.Bundle;

/* JADX INFO: loaded from: classes6.dex */
public final class m1v0 {

    /* JADX INFO: renamed from: c */
    public static final String f130857c = Integer.toString(0, 36);

    /* JADX INFO: renamed from: d */
    public static final String f130858d = Integer.toString(1, 36);

    /* JADX INFO: renamed from: a */
    public final String f130859a;

    /* JADX INFO: renamed from: b */
    public final int f130860b;

    public m1v0(String str, int i) {
        this.f130859a = str;
        this.f130860b = i;
    }

    /* JADX INFO: renamed from: a */
    public final Bundle m152623a() {
        Bundle bundle = new Bundle();
        bundle.putString(f130857c, this.f130859a);
        bundle.putInt(f130858d, this.f130860b);
        return bundle;
    }
}
