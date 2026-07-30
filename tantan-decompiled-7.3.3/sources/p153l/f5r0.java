package p153l;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
class f5r0 {

    /* JADX INFO: renamed from: a */
    int f97335a = 0;

    /* JADX INFO: renamed from: b */
    String f97336b = "";

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof f5r0)) {
            return false;
        }
        f5r0 f5r0Var = (f5r0) obj;
        return !TextUtils.isEmpty(f5r0Var.f97336b) && f5r0Var.f97336b.equals(this.f97336b);
    }
}
