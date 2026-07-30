package p153l;

import android.os.IBinder;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class amw0 extends wmw0 {

    /* JADX INFO: renamed from: a */
    public final IBinder f72283a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final String f72284b;

    /* JADX INFO: renamed from: c */
    public final int f72285c;

    /* JADX INFO: renamed from: d */
    public final float f72286d;

    /* JADX INFO: renamed from: e */
    public final int f72287e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public final String f72288f;

    public /* synthetic */ amw0(IBinder iBinder, boolean z, String str, int i, float f, int i2, String str2, int i3, String str3, String str4, String str5, zlw0 zlw0Var) {
        this.f72283a = iBinder;
        this.f72284b = str;
        this.f72285c = i;
        this.f72286d = f;
        this.f72287e = i3;
        this.f72288f = str4;
    }

    @Override // p153l.wmw0
    /* JADX INFO: renamed from: a */
    public final float mo98865a() {
        return this.f72286d;
    }

    @Override // p153l.wmw0
    /* JADX INFO: renamed from: b */
    public final int mo98866b() {
        return 0;
    }

    @Override // p153l.wmw0
    /* JADX INFO: renamed from: c */
    public final int mo98867c() {
        return this.f72285c;
    }

    @Override // p153l.wmw0
    /* JADX INFO: renamed from: d */
    public final int mo98868d() {
        return this.f72287e;
    }

    @Override // p153l.wmw0
    /* JADX INFO: renamed from: e */
    public final IBinder mo98869e() {
        return this.f72283a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof wmw0) {
            wmw0 wmw0Var = (wmw0) obj;
            if (this.f72283a.equals(wmw0Var.mo98869e())) {
                wmw0Var.mo98875k();
                String str = this.f72284b;
                if (str != null ? str.equals(wmw0Var.mo98871g()) : wmw0Var.mo98871g() == null) {
                    if (this.f72285c == wmw0Var.mo98867c() && Float.floatToIntBits(this.f72286d) == Float.floatToIntBits(wmw0Var.mo98865a())) {
                        wmw0Var.mo98866b();
                        wmw0Var.mo98873i();
                        if (this.f72287e == wmw0Var.mo98868d()) {
                            wmw0Var.mo98872h();
                            String str2 = this.f72288f;
                            if (str2 != null ? str2.equals(wmw0Var.mo98870f()) : wmw0Var.mo98870f() == null) {
                                wmw0Var.mo98874j();
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // p153l.wmw0
    @Nullable
    /* JADX INFO: renamed from: f */
    public final String mo98870f() {
        return this.f72288f;
    }

    @Override // p153l.wmw0
    @Nullable
    /* JADX INFO: renamed from: g */
    public final String mo98871g() {
        return this.f72284b;
    }

    @Override // p153l.wmw0
    @Nullable
    /* JADX INFO: renamed from: h */
    public final String mo98872h() {
        return null;
    }

    public final int hashCode() {
        int iHashCode = this.f72283a.hashCode() ^ 1000003;
        String str = this.f72284b;
        int iHashCode2 = (((((((iHashCode * 1000003) ^ 1237) * 1000003) ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.f72285c) * 1000003) ^ Float.floatToIntBits(this.f72286d);
        int i = this.f72287e;
        String str2 = this.f72288f;
        return ((((iHashCode2 * 583896283) ^ i) * (-721379959)) ^ (str2 != null ? str2.hashCode() : 0)) * 1000003;
    }

    @Override // p153l.wmw0
    @Nullable
    /* JADX INFO: renamed from: i */
    public final String mo98873i() {
        return null;
    }

    @Override // p153l.wmw0
    @Nullable
    /* JADX INFO: renamed from: j */
    public final String mo98874j() {
        return null;
    }

    @Override // p153l.wmw0
    /* JADX INFO: renamed from: k */
    public final boolean mo98875k() {
        return false;
    }

    public final String toString() {
        return "OverlayDisplayShowRequest{windowToken=" + this.f72283a.toString() + ", stableSessionToken=false, appId=" + this.f72284b + ", layoutGravity=" + this.f72285c + ", layoutVerticalMargin=" + this.f72286d + ", displayMode=0, sessionToken=null, windowWidthPx=" + this.f72287e + ", deeplinkUrl=null, adFieldEnifd=" + this.f72288f + ", thirdPartyAuthCallerId=null}";
    }
}
