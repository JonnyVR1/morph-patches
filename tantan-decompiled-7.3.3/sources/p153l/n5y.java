package p153l;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class n5y implements h5y {

    /* JADX INFO: renamed from: a */
    public String f140405a;

    /* JADX INFO: renamed from: b */
    public int f140406b;

    /* JADX INFO: renamed from: c */
    public int f140407c;

    public n5y(String str, int i, int i2) {
        this.f140405a = str;
        this.f140406b = i;
        this.f140407c = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n5y)) {
            return false;
        }
        n5y n5yVar = (n5y) obj;
        if (this.f140406b < 0 || n5yVar.f140406b < 0) {
            return TextUtils.equals(this.f140405a, n5yVar.f140405a) && this.f140407c == n5yVar.f140407c;
        }
        return TextUtils.equals(this.f140405a, n5yVar.f140405a) && this.f140406b == n5yVar.f140406b && this.f140407c == n5yVar.f140407c;
    }

    public int hashCode() {
        return l950.m153328b(this.f140405a, Integer.valueOf(this.f140407c));
    }
}
