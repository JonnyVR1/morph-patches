package p153l;

import android.text.TextUtils;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class dhv0 {

    /* JADX INFO: renamed from: a */
    public final String f88556a;

    /* JADX INFO: renamed from: b */
    public final String f88557b;

    /* JADX INFO: renamed from: c */
    public int f88558c;

    /* JADX INFO: renamed from: d */
    public long f88559d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public final Integer f88560e;

    public dhv0(String str, String str2, int i, long j, @Nullable Integer num) {
        this.f88556a = str;
        this.f88557b = str2;
        this.f88558c = i;
        this.f88559d = j;
        this.f88560e = num;
    }

    public final String toString() {
        String str = this.f88556a + "." + this.f88558c + "." + this.f88559d;
        if (!TextUtils.isEmpty(this.f88557b)) {
            str = str + "." + this.f88557b;
        }
        if (!((Boolean) jas0.m144075c().m176505a(sgs0.f167941C1)).booleanValue() || this.f88560e == null || TextUtils.isEmpty(this.f88557b)) {
            return str;
        }
        return str + "." + this.f88560e;
    }
}
