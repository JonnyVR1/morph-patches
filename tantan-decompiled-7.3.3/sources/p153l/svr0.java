package p153l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;

/* JADX INFO: loaded from: classes6.dex */
public final class svr0 {

    /* JADX INFO: renamed from: a */
    public final String f170869a;

    /* JADX INFO: renamed from: b */
    public final String f170870b;

    public svr0(String str, String str2) {
        this.f170869a = str;
        this.f170870b = str2;
    }

    /* JADX INFO: renamed from: a */
    public final String m188224a() {
        return this.f170869a;
    }

    /* JADX INFO: renamed from: b */
    public final String m188225b() {
        return this.f170870b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && svr0.class == obj.getClass()) {
            svr0 svr0Var = (svr0) obj;
            if (TextUtils.equals(this.f170869a, svr0Var.f170869a) && TextUtils.equals(this.f170870b, svr0Var.f170870b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f170869a.hashCode() * 31) + this.f170870b.hashCode();
    }

    public final String toString() {
        return "Header[name=" + this.f170869a + ",value=" + this.f170870b + Constants.AES_SUFFIX;
    }
}
