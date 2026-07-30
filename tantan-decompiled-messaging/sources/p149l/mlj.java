package p149l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveUserMask;

/* JADX INFO: loaded from: classes4.dex */
public class mlj {

    /* JADX INFO: renamed from: b */
    public BLiveUserMask f134441b;

    /* JADX INFO: renamed from: c */
    public boolean f134442c;

    /* JADX INFO: renamed from: d */
    public String f134443d;

    /* JADX INFO: renamed from: e */
    @NonNull
    public i54 f134444e;

    /* JADX INFO: renamed from: f */
    @NonNull
    public q44 f134445f;

    /* JADX INFO: renamed from: g */
    public String f134446g = "default";

    /* JADX INFO: renamed from: h */
    public boolean f134447h = false;

    /* JADX INFO: renamed from: a */
    public boolean f134440a = false;

    public mlj(@NonNull i54 i54Var, @NonNull q44 q44Var, String str) {
        this.f134444e = i54Var;
        this.f134445f = q44Var;
        this.f134443d = str;
    }

    /* JADX INFO: renamed from: a */
    public static mlj m155152a(@NonNull i54 i54Var, @NonNull q44 q44Var) {
        return new mlj(i54Var, q44Var, BLiveAbsData.MULTI_CALL);
    }

    /* JADX INFO: renamed from: b */
    public static mlj m155153b(@NonNull i54 i54Var, @NonNull q44 q44Var) {
        q44Var.f152540d = -1;
        return new mlj(i54Var, q44Var, "voice_call");
    }

    /* JADX INFO: renamed from: c */
    public static mlj m155154c(@NonNull i54 i54Var, @NonNull q44 q44Var) {
        return new mlj(i54Var, q44Var, "voice_call");
    }

    /* JADX INFO: renamed from: d */
    public String m155155d() {
        return this.f134444e.f111520a + this.f134444e.f111523d + this.f134444e.f111522c + this.f134445f.f152537a + this.f134445f.f152540d;
    }

    /* JADX INFO: renamed from: e */
    public boolean m155156e() {
        boolean zM155157f = m155157f();
        q44 q44Var = this.f134445f;
        if (zM155157f) {
            return q44Var.f152540d == 1;
        }
        return q44Var.f152540d == 0;
    }

    /* JADX INFO: renamed from: f */
    public boolean m155157f() {
        return BLiveAbsData.MULTI_CALL.equals(this.f134443d);
    }

    /* JADX INFO: renamed from: g */
    public boolean m155158g(mlj mljVar) {
        return TextUtils.equals(this.f134444e.f111520a, mljVar.f134444e.f111520a);
    }

    /* JADX INFO: renamed from: h */
    public boolean m155159h() {
        return this.f134447h;
    }

    /* JADX INFO: renamed from: i */
    public boolean m155160i() {
        return this.f134445f.f152540d == -1 && this.f134442c;
    }

    /* JADX INFO: renamed from: j */
    public void m155161j(boolean z) {
        this.f134447h = z;
    }

    public String toString() {
        return "GiftCallInfo  callUser = " + this.f134444e.toString() + " callParam = " + this.f134445f.toString() + " isSelect = " + this.f134447h;
    }
}
