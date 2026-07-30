package p149l;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes8.dex */
public class h0m implements i0m {

    /* JADX INFO: renamed from: a */
    public String f105225a;

    public h0m(String str) {
        this.f105225a = str;
        if (TextUtils.isEmpty(str)) {
            this.f105225a = System.currentTimeMillis() + "";
        }
    }

    @Override // p149l.i0m
    public String getOnlyName() {
        return this.f105225a;
    }
}
