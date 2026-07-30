package p149l;

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
public class tw0 {

    /* JADX INFO: renamed from: a */
    public final tpu0 f172355a;

    /* JADX INFO: renamed from: l.tw0$a */
    @ShowFirstParty
    @KeepForSdk
    public interface InterfaceC20300a extends nrx0 {
    }

    public tw0(tpu0 tpu0Var) {
        this.f172355a = tpu0Var;
    }

    @NonNull
    @RequiresPermission(allOf = {"android.permission.INTERNET", "android.permission.ACCESS_NETWORK_STATE", "android.permission.WAKE_LOCK"})
    @KeepForSdk
    /* JADX INFO: renamed from: k */
    public static tw0 m190825k(@NonNull Context context, @NonNull String str, @NonNull String str2, @Nullable String str3, @NonNull Bundle bundle) {
        return tpu0.m190015j(context, str, str2, str3, bundle).m190022F();
    }

    @KeepForSdk
    /* JADX INFO: renamed from: a */
    public void m190826a(@NonNull @Size(min = 1) String str) {
        this.f172355a.m190024H(str);
    }

    @KeepForSdk
    /* JADX INFO: renamed from: b */
    public void m190827b(@NonNull @Size(max = 24, min = 1) String str, @Nullable String str2, @Nullable Bundle bundle) {
        this.f172355a.m190057s(str, str2, bundle);
    }

    @KeepForSdk
    /* JADX INFO: renamed from: c */
    public void m190828c(@NonNull @Size(min = 1) String str) {
        this.f172355a.m190030O(str);
    }

    @KeepForSdk
    /* JADX INFO: renamed from: d */
    public long m190829d() {
        return this.f172355a.m190043b();
    }

    @Nullable
    @KeepForSdk
    /* JADX INFO: renamed from: e */
    public String m190830e() {
        return this.f172355a.m190032R();
    }

    @Nullable
    @KeepForSdk
    /* JADX INFO: renamed from: f */
    public String m190831f() {
        return this.f172355a.m190036V();
    }

    @NonNull
    @KeepForSdk
    @WorkerThread
    /* JADX INFO: renamed from: g */
    public List<Bundle> m190832g(@Nullable String str, @Nullable @Size(max = 23, min = 1) String str2) {
        return this.f172355a.m190046e(str, str2);
    }

    @Nullable
    @KeepForSdk
    /* JADX INFO: renamed from: h */
    public String m190833h() {
        return this.f172355a.m190037W();
    }

    @Nullable
    @KeepForSdk
    /* JADX INFO: renamed from: i */
    public String m190834i() {
        return this.f172355a.m190038X();
    }

    @Nullable
    @KeepForSdk
    /* JADX INFO: renamed from: j */
    public String m190835j() {
        return this.f172355a.m190039Y();
    }

    @KeepForSdk
    @WorkerThread
    /* JADX INFO: renamed from: l */
    public int m190836l(@NonNull @Size(min = 1) String str) {
        return this.f172355a.m190041a(str);
    }

    @NonNull
    @KeepForSdk
    @WorkerThread
    /* JADX INFO: renamed from: m */
    public Map<String, Object> m190837m(@Nullable String str, @Nullable @Size(max = 24, min = 1) String str2, boolean z) {
        return this.f172355a.m190047f(str, str2, z);
    }

    @KeepForSdk
    /* JADX INFO: renamed from: n */
    public void m190838n(@NonNull String str, @NonNull String str2, @Nullable Bundle bundle) {
        this.f172355a.m190026J(str, str2, bundle);
    }

    @KeepForSdk
    /* JADX INFO: renamed from: o */
    public void m190839o(@NonNull Bundle bundle) {
        this.f172355a.m190044c(bundle, false);
    }

    @Nullable
    @KeepForSdk
    /* JADX INFO: renamed from: p */
    public Bundle m190840p(@NonNull Bundle bundle) {
        return this.f172355a.m190044c(bundle, true);
    }

    @ShowFirstParty
    @KeepForSdk
    /* JADX INFO: renamed from: q */
    public void m190841q(@NonNull InterfaceC20300a interfaceC20300a) {
        this.f172355a.m190019A(interfaceC20300a);
    }

    @KeepForSdk
    /* JADX INFO: renamed from: r */
    public void m190842r(@NonNull Bundle bundle) {
        this.f172355a.m190053o(bundle);
    }

    @KeepForSdk
    /* JADX INFO: renamed from: s */
    public void m190843s(@NonNull Bundle bundle) {
        this.f172355a.m190023G(bundle);
    }

    @KeepForSdk
    /* JADX INFO: renamed from: t */
    public void m190844t(@NonNull Activity activity, @Nullable @Size(max = 36, min = 1) String str, @Nullable @Size(max = 36, min = 1) String str2) {
        this.f172355a.m190051m(activity, str, str2);
    }

    @KeepForSdk
    /* JADX INFO: renamed from: u */
    public void m190845u(@NonNull String str, @NonNull String str2, @NonNull Object obj) {
        this.f172355a.m190060v(str, str2, obj, true);
    }

    /* JADX INFO: renamed from: v */
    public final void m190846v(boolean z) {
        this.f172355a.m190021C(z);
    }
}
