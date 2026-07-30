package p153l;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresPermission;
import androidx.annotation.Size;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.ShowFirstParty;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
@ShowFirstParty
@KeepForSdk
public class ax0 {

    /* JADX INFO: renamed from: a */
    public final zyu0 f73807a;

    /* JADX INFO: renamed from: l.ax0$a */
    @ShowFirstParty
    @KeepForSdk
    public interface InterfaceC15854a extends t0y0 {
    }

    public ax0(zyu0 zyu0Var) {
        this.f73807a = zyu0Var;
    }

    @NonNull
    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    @KeepForSdk
    /* JADX INFO: renamed from: k */
    public static ax0 m100723k(@NonNull Context context, @NonNull String str, @NonNull String str2, @Nullable String str3, @NonNull Bundle bundle) {
        return zyu0.m222158j(context, str, str2, str3, bundle).m222165F();
    }

    @KeepForSdk
    /* JADX INFO: renamed from: a */
    public void m100724a(@NonNull @Size(min = 1) String str) {
        this.f73807a.m222167H(str);
    }

    @KeepForSdk
    /* JADX INFO: renamed from: b */
    public void m100725b(@NonNull @Size(max = 24, min = 1) String str, @Nullable String str2, @Nullable Bundle bundle) {
        this.f73807a.m222200s(str, str2, bundle);
    }

    @KeepForSdk
    /* JADX INFO: renamed from: c */
    public void m100726c(@NonNull @Size(min = 1) String str) {
        this.f73807a.m222173O(str);
    }

    @KeepForSdk
    /* JADX INFO: renamed from: d */
    public long m100727d() {
        return this.f73807a.m222186b();
    }

    @Nullable
    @KeepForSdk
    /* JADX INFO: renamed from: e */
    public String m100728e() {
        return this.f73807a.m222175R();
    }

    @Nullable
    @KeepForSdk
    /* JADX INFO: renamed from: f */
    public String m100729f() {
        return this.f73807a.m222179V();
    }

    @NonNull
    @KeepForSdk
    @WorkerThread
    /* JADX INFO: renamed from: g */
    public List<Bundle> m100730g(@Nullable String str, @Nullable @Size(max = 23, min = 1) String str2) {
        return this.f73807a.m222189e(str, str2);
    }

    @Nullable
    @KeepForSdk
    /* JADX INFO: renamed from: h */
    public String m100731h() {
        return this.f73807a.m222180W();
    }

    @Nullable
    @KeepForSdk
    /* JADX INFO: renamed from: i */
    public String m100732i() {
        return this.f73807a.m222181X();
    }

    @Nullable
    @KeepForSdk
    /* JADX INFO: renamed from: j */
    public String m100733j() {
        return this.f73807a.m222182Y();
    }

    @KeepForSdk
    @WorkerThread
    /* JADX INFO: renamed from: l */
    public int m100734l(@NonNull @Size(min = 1) String str) {
        return this.f73807a.m222184a(str);
    }

    @NonNull
    @KeepForSdk
    @WorkerThread
    /* JADX INFO: renamed from: m */
    public Map<String, Object> m100735m(@Nullable String str, @Nullable @Size(max = 24, min = 1) String str2, boolean z) {
        return this.f73807a.m222190f(str, str2, z);
    }

    @KeepForSdk
    /* JADX INFO: renamed from: n */
    public void m100736n(@NonNull String str, @NonNull String str2, @Nullable Bundle bundle) {
        this.f73807a.m222169J(str, str2, bundle);
    }

    @KeepForSdk
    /* JADX INFO: renamed from: o */
    public void m100737o(@NonNull Bundle bundle) {
        this.f73807a.m222187c(bundle, false);
    }

    @Nullable
    @KeepForSdk
    /* JADX INFO: renamed from: p */
    public Bundle m100738p(@NonNull Bundle bundle) {
        return this.f73807a.m222187c(bundle, true);
    }

    @ShowFirstParty
    @KeepForSdk
    /* JADX INFO: renamed from: q */
    public void m100739q(@NonNull InterfaceC15854a interfaceC15854a) {
        this.f73807a.m222162A(interfaceC15854a);
    }

    @KeepForSdk
    /* JADX INFO: renamed from: r */
    public void m100740r(@NonNull Bundle bundle) {
        this.f73807a.m222196o(bundle);
    }

    @KeepForSdk
    /* JADX INFO: renamed from: s */
    public void m100741s(@NonNull Bundle bundle) {
        this.f73807a.m222166G(bundle);
    }

    @KeepForSdk
    /* JADX INFO: renamed from: t */
    public void m100742t(@NonNull Activity activity, @Nullable @Size(max = 36, min = 1) String str, @Nullable @Size(max = 36, min = 1) String str2) {
        this.f73807a.m222194m(activity, str, str2);
    }

    @KeepForSdk
    /* JADX INFO: renamed from: u */
    public void m100743u(@NonNull String str, @NonNull String str2, @NonNull Object obj) {
        this.f73807a.m222203v(str, str2, obj, true);
    }

    /* JADX INFO: renamed from: v */
    public final void m100744v(boolean z) {
        this.f73807a.m222164C(z);
    }
}
