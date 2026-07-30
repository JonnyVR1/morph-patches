package p153l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;

/* JADX INFO: loaded from: classes.dex */
public final class yzk {

    /* JADX INFO: renamed from: a */
    private final String f202199a;

    /* JADX INFO: renamed from: b */
    private final String f202200b;

    public yzk(String str, String str2) {
        this.f202199a = str;
        this.f202200b = str2;
    }

    /* JADX INFO: renamed from: a */
    public final String m218023a() {
        return this.f202199a;
    }

    /* JADX INFO: renamed from: b */
    public final String m218024b() {
        return this.f202200b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && yzk.class == obj.getClass()) {
            yzk yzkVar = (yzk) obj;
            if (TextUtils.equals(this.f202199a, yzkVar.f202199a) && TextUtils.equals(this.f202200b, yzkVar.f202200b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f202199a.hashCode() * 31) + this.f202200b.hashCode();
    }

    public String toString() {
        return "Header[name=" + this.f202199a + ",value=" + this.f202200b + Constants.AES_SUFFIX;
    }
}
