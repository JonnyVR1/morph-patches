package p153l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveUserMask;

/* JADX INFO: loaded from: classes4.dex */
public class coj {

    /* JADX INFO: renamed from: b */
    public BLiveUserMask f82886b;

    /* JADX INFO: renamed from: c */
    public boolean f82887c;

    /* JADX INFO: renamed from: d */
    public String f82888d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public h64 f82889e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public p54 f82890f;

    /* JADX INFO: renamed from: g */
    public String f82891g = "default";

    /* JADX INFO: renamed from: h */
    public boolean f82892h = false;

    /* JADX INFO: renamed from: a */
    public boolean f82885a = false;

    public coj(@NonNull h64 h64Var, @NonNull p54 p54Var, String str) {
        this.f82889e = h64Var;
        this.f82890f = p54Var;
        this.f82888d = str;
    }

    /* JADX INFO: renamed from: a */
    public static coj m111659a(@NonNull h64 h64Var, @NonNull p54 p54Var) {
        return new coj(h64Var, p54Var, BLiveAbsData.MULTI_CALL);
    }

    /* JADX INFO: renamed from: b */
    public static coj m111660b(@NonNull h64 h64Var, @NonNull p54 p54Var) {
        p54Var.f150595d = -1;
        return new coj(h64Var, p54Var, "voice_call");
    }

    /* JADX INFO: renamed from: c */
    public static coj m111661c(@NonNull h64 h64Var, @NonNull p54 p54Var) {
        return new coj(h64Var, p54Var, "voice_call");
    }

    /* JADX INFO: renamed from: d */
    public String m111662d() {
        return this.f82889e.f107997a + this.f82889e.f108000d + this.f82889e.f107999c + this.f82890f.f150592a + this.f82890f.f150595d;
    }

    /* JADX INFO: renamed from: e */
    public boolean m111663e() {
        boolean zM111664f = m111664f();
        p54 p54Var = this.f82890f;
        if (zM111664f) {
            return p54Var.f150595d == 1;
        }
        return p54Var.f150595d == 0;
    }

    /* JADX INFO: renamed from: f */
    public boolean m111664f() {
        return BLiveAbsData.MULTI_CALL.equals(this.f82888d);
    }

    /* JADX INFO: renamed from: g */
    public boolean m111665g(coj cojVar) {
        return TextUtils.equals(this.f82889e.f107997a, cojVar.f82889e.f107997a);
    }

    /* JADX INFO: renamed from: h */
    public boolean m111666h() {
        return this.f82892h;
    }

    /* JADX INFO: renamed from: i */
    public boolean m111667i() {
        return this.f82890f.f150595d == -1 && this.f82887c;
    }

    /* JADX INFO: renamed from: j */
    public void m111668j(boolean z) {
        this.f82892h = z;
    }

    public String toString() {
        return "GiftCallInfo  callUser = " + this.f82889e.toString() + " callParam = " + this.f82890f.toString() + " isSelect = " + this.f82892h;
    }
}
