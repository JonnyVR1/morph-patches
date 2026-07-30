package p153l;

import android.text.TextUtils;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class hxy0 {

    /* JADX INFO: renamed from: a */
    public final String f112083a;

    /* JADX INFO: renamed from: b */
    public final boolean f112084b;

    /* JADX INFO: renamed from: c */
    public final boolean f112085c;

    public hxy0(String str, boolean z, boolean z2) {
        this.f112083a = str;
        this.f112084b = z;
        this.f112085c = z2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && obj.getClass() == hxy0.class) {
            hxy0 hxy0Var = (hxy0) obj;
            if (TextUtils.equals(this.f112083a, hxy0Var.f112083a) && this.f112084b == hxy0Var.f112084b && this.f112085c == hxy0Var.f112085c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.f112083a.hashCode() + 31) * 31) + (true != this.f112084b ? 1237 : 1231)) * 31) + (true != this.f112085c ? 1237 : 1231);
    }
}
