package p149l;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes2.dex */
class zvq0 {

    /* JADX INFO: renamed from: a */
    int f205056a = 0;

    /* JADX INFO: renamed from: b */
    String f205057b = "";

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof zvq0)) {
            return false;
        }
        zvq0 zvq0Var = (zvq0) obj;
        return !TextUtils.isEmpty(zvq0Var.f205057b) && zvq0Var.f205057b.equals(this.f205057b);
    }
}
