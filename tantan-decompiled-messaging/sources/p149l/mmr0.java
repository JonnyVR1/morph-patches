package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;

/* JADX INFO: loaded from: classes6.dex */
public final class mmr0 {

    /* JADX INFO: renamed from: a */
    public final String f134691a;

    /* JADX INFO: renamed from: b */
    public final String f134692b;

    public mmr0(String str, String str2) {
        this.f134691a = str;
        this.f134692b = str2;
    }

    /* JADX INFO: renamed from: a */
    public final String m155486a() {
        return this.f134691a;
    }

    /* JADX INFO: renamed from: b */
    public final String m155487b() {
        return this.f134692b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && mmr0.class == obj.getClass()) {
            mmr0 mmr0Var = (mmr0) obj;
            if (TextUtils.equals(this.f134691a, mmr0Var.f134691a) && TextUtils.equals(this.f134692b, mmr0Var.f134692b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f134691a.hashCode() * 31) + this.f134692b.hashCode();
    }

    public final String toString() {
        return "Header[name=" + this.f134691a + ",value=" + this.f134692b + Constants.AES_SUFFIX;
    }
}
