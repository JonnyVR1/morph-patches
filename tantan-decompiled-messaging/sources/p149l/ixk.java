package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;

/* JADX INFO: loaded from: classes.dex */
public final class ixk {

    /* JADX INFO: renamed from: a */
    private final String f115373a;

    /* JADX INFO: renamed from: b */
    private final String f115374b;

    public ixk(String str, String str2) {
        this.f115373a = str;
        this.f115374b = str2;
    }

    /* JADX INFO: renamed from: a */
    public final String m138849a() {
        return this.f115373a;
    }

    /* JADX INFO: renamed from: b */
    public final String m138850b() {
        return this.f115374b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ixk.class == obj.getClass()) {
            ixk ixkVar = (ixk) obj;
            if (TextUtils.equals(this.f115373a, ixkVar.f115373a) && TextUtils.equals(this.f115374b, ixkVar.f115374b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f115373a.hashCode() * 31) + this.f115374b.hashCode();
    }

    public String toString() {
        return "Header[name=" + this.f115373a + ",value=" + this.f115374b + Constants.AES_SUFFIX;
    }
}
