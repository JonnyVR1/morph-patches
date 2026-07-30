package p149l;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class qwx implements kwx {

    /* JADX INFO: renamed from: a */
    public String f156793a;

    /* JADX INFO: renamed from: b */
    public int f156794b;

    /* JADX INFO: renamed from: c */
    public int f156795c;

    public qwx(String str, int i, int i2) {
        this.f156793a = str;
        this.f156794b = i;
        this.f156795c = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qwx)) {
            return false;
        }
        qwx qwxVar = (qwx) obj;
        if (this.f156794b < 0 || qwxVar.f156794b < 0) {
            return TextUtils.equals(this.f156793a, qwxVar.f156793a) && this.f156795c == qwxVar.f156795c;
        }
        return TextUtils.equals(this.f156793a, qwxVar.f156793a) && this.f156794b == qwxVar.f156794b && this.f156795c == qwxVar.f156795c;
    }

    public int hashCode() {
        return w050.m200829b(this.f156793a, Integer.valueOf(this.f156795c));
    }
}
