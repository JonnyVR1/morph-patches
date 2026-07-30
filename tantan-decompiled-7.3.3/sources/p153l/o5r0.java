package p153l;

import android.content.Context;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public final class o5r0 {

    /* JADX INFO: renamed from: a */
    private String f145105a = null;

    /* JADX INFO: renamed from: b */
    private String f145106b = null;

    /* JADX INFO: renamed from: c */
    private int f145107c = -1;

    public o5r0(Context context) {
    }

    /* JADX INFO: renamed from: a */
    public String m166169a() {
        if (!TextUtils.isEmpty(this.f145105a) && !"0".equals(this.f145105a)) {
            return this.f145105a;
        }
        if (!TextUtils.isEmpty(this.f145106b) && !"0".equals(this.f145106b)) {
            return this.f145106b;
        }
        String strM100920f = n0r0.m161015b().m100920f();
        this.f145105a = strM100920f;
        if (!TextUtils.isEmpty(strM100920f) && !"0".equals(this.f145105a)) {
            return this.f145105a;
        }
        String strM148489g = k5r0.m148477c().m148489g();
        this.f145106b = strM148489g;
        return strM148489g;
    }

    /* JADX INFO: renamed from: b */
    public void m166170b(String str) {
        this.f145105a = str;
        k5r0.m148477c().m148491i(str);
    }

    /* JADX INFO: renamed from: c */
    public boolean m166171c() {
        return this.f145105a != null;
    }
}
