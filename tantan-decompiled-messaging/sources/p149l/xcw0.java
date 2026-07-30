package p149l;

import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class xcw0 extends sdw0 {

    /* JADX INFO: renamed from: a */
    public final int f192282a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final String f192283b;

    public /* synthetic */ xcw0(int i, String str, wcw0 wcw0Var) {
        this.f192282a = i;
        this.f192283b = str;
    }

    @Override // p149l.sdw0
    /* JADX INFO: renamed from: a */
    public final int mo183573a() {
        return this.f192282a;
    }

    @Override // p149l.sdw0
    @Nullable
    /* JADX INFO: renamed from: b */
    public final String mo183574b() {
        return this.f192283b;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof sdw0) {
            sdw0 sdw0Var = (sdw0) obj;
            if (this.f192282a == sdw0Var.mo183573a() && ((str = this.f192283b) != null ? str.equals(sdw0Var.mo183574b()) : sdw0Var.mo183574b() == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.f192283b;
        return ((this.f192282a ^ 1000003) * 1000003) ^ (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "OverlayDisplayState{statusCode=" + this.f192282a + ", sessionToken=" + this.f192283b + "}";
    }
}
