package p153l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class dmw0 extends ymw0 {

    /* JADX INFO: renamed from: a */
    public final int f89741a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final String f89742b;

    public /* synthetic */ dmw0(int i, String str, cmw0 cmw0Var) {
        this.f89741a = i;
        this.f89742b = str;
    }

    @Override // p153l.ymw0
    /* JADX INFO: renamed from: a */
    public final int mo117030a() {
        return this.f89741a;
    }

    @Override // p153l.ymw0
    @Nullable
    /* JADX INFO: renamed from: b */
    public final String mo117031b() {
        return this.f89742b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof ymw0) {
            ymw0 ymw0Var = (ymw0) obj;
            if (this.f89741a == ymw0Var.mo117030a() && ((str = this.f89742b) != null ? str.equals(ymw0Var.mo117031b()) : ymw0Var.mo117031b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f89742b;
        return ((this.f89741a ^ 1000003) * 1000003) ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "OverlayDisplayState{statusCode=" + this.f89741a + ", sessionToken=" + this.f89742b + "}";
    }
}
