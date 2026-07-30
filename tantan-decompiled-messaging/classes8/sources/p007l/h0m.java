package p007l;

import android.text.TextUtils;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class h0m implements i0m {

    /* JADX INFO: renamed from: a */
    public String f2806a;

    public h0m(String str) {
        this.f2806a = str;
        if (TextUtils.isEmpty(str)) {
            this.f2806a = System.currentTimeMillis() + "";
        }
    }

    @Override // p007l.i0m
    public String getOnlyName() {
        return this.f2806a;
    }
}
