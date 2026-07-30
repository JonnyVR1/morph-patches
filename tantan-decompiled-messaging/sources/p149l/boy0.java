package p149l;

import android.text.TextUtils;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class boy0 {

    /* JADX INFO: renamed from: a */
    public final String f76580a;

    /* JADX INFO: renamed from: b */
    public final boolean f76581b;

    /* JADX INFO: renamed from: c */
    public final boolean f76582c;

    public boy0(String str, boolean z, boolean z2) {
        this.f76580a = str;
        this.f76581b = z;
        this.f76582c = z2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == boy0.class) {
            boy0 boy0Var = (boy0) obj;
            if (TextUtils.equals(this.f76580a, boy0Var.f76580a) && this.f76581b == boy0Var.f76581b && this.f76582c == boy0Var.f76582c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f76580a.hashCode() + 31) * 31) + (true != this.f76581b ? 1237 : 1231)) * 31) + (true != this.f76582c ? 1237 : 1231);
    }
}
