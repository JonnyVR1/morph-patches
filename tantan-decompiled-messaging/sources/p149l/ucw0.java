package p149l;

import android.os.IBinder;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class ucw0 extends qdw0 {

    /* JADX INFO: renamed from: a */
    public final IBinder f175869a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final String f175870b;

    /* JADX INFO: renamed from: c */
    public final int f175871c;

    /* JADX INFO: renamed from: d */
    public final float f175872d;

    /* JADX INFO: renamed from: e */
    public final int f175873e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public final String f175874f;

    public /* synthetic */ ucw0(IBinder iBinder, boolean z, String str, int i, float f, int i2, String str2, int i3, String str3, String str4, String str5, tcw0 tcw0Var) {
        this.f175869a = iBinder;
        this.f175870b = str;
        this.f175871c = i;
        this.f175872d = f;
        this.f175873e = i3;
        this.f175874f = str4;
    }

    @Override // p149l.qdw0
    /* JADX INFO: renamed from: a */
    public final float mo174123a() {
        return this.f175872d;
    }

    @Override // p149l.qdw0
    /* JADX INFO: renamed from: b */
    public final int mo174124b() {
        return 0;
    }

    @Override // p149l.qdw0
    /* JADX INFO: renamed from: c */
    public final int mo174125c() {
        return this.f175871c;
    }

    @Override // p149l.qdw0
    /* JADX INFO: renamed from: d */
    public final int mo174126d() {
        return this.f175873e;
    }

    @Override // p149l.qdw0
    /* JADX INFO: renamed from: e */
    public final IBinder mo174127e() {
        return this.f175869a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof qdw0) {
            qdw0 qdw0Var = (qdw0) obj;
            if (this.f175869a.equals(qdw0Var.mo174127e())) {
                qdw0Var.mo174133k();
                String str = this.f175870b;
                if (str != null ? str.equals(qdw0Var.mo174129g()) : qdw0Var.mo174129g() == null) {
                    if (this.f175871c == qdw0Var.mo174125c() && Float.floatToIntBits(this.f175872d) == Float.floatToIntBits(qdw0Var.mo174123a())) {
                        qdw0Var.mo174124b();
                        qdw0Var.mo174131i();
                        if (this.f175873e == qdw0Var.mo174126d()) {
                            qdw0Var.mo174130h();
                            String str2 = this.f175874f;
                            if (str2 != null ? str2.equals(qdw0Var.mo174128f()) : qdw0Var.mo174128f() == null) {
                                qdw0Var.mo174132j();
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // p149l.qdw0
    @Nullable
    /* JADX INFO: renamed from: f */
    public final String mo174128f() {
        return this.f175874f;
    }

    @Override // p149l.qdw0
    @Nullable
    /* JADX INFO: renamed from: g */
    public final String mo174129g() {
        return this.f175870b;
    }

    @Override // p149l.qdw0
    @Nullable
    /* JADX INFO: renamed from: h */
    public final String mo174130h() {
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.f175869a.hashCode() ^ 1000003;
        String str = this.f175870b;
        int iHashCode2 = (((((((iHashCode * 1000003) ^ 1237) * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f175871c) * 1000003) ^ Float.floatToIntBits(this.f175872d);
        int i = this.f175873e;
        String str2 = this.f175874f;
        return ((((iHashCode2 * 583896283) ^ i) * (-721379959)) ^ (str2 != null ? str2.hashCode() : 0)) * 1000003;
    }

    @Override // p149l.qdw0
    @Nullable
    /* JADX INFO: renamed from: i */
    public final String mo174131i() {
        return null;
    }

    @Override // p149l.qdw0
    @Nullable
    /* JADX INFO: renamed from: j */
    public final String mo174132j() {
        return null;
    }

    @Override // p149l.qdw0
    /* JADX INFO: renamed from: k */
    public final boolean mo174133k() {
        return false;
    }

    public final String toString() {
        return "OverlayDisplayShowRequest{windowToken=" + this.f175869a.toString() + ", stableSessionToken=false, appId=" + this.f175870b + ", layoutGravity=" + this.f175871c + ", layoutVerticalMargin=" + this.f175872d + ", displayMode=0, sessionToken=null, windowWidthPx=" + this.f175873e + ", deeplinkUrl=null, adFieldEnifd=" + this.f175874f + ", thirdPartyAuthCallerId=null}";
    }
}
