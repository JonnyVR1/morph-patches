package p153l;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes8.dex */
public class b3m implements c3m {

    /* JADX INFO: renamed from: a */
    public String f74787a;

    public b3m(String str) {
        this.f74787a = str;
        if (TextUtils.isEmpty(str)) {
            this.f74787a = System.currentTimeMillis() + "";
        }
    }

    @Override // p153l.c3m
    public String getOnlyName() {
        return this.f74787a;
    }
}
