package p149l;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* JADX INFO: loaded from: classes6.dex */
@KeepForSdk
public class jxf0 {

    /* JADX INFO: renamed from: c */
    public static final Lock f120222c = new ReentrantLock();

    /* JADX INFO: renamed from: d */
    @Nullable
    public static jxf0 f120223d;

    /* JADX INFO: renamed from: a */
    public final Lock f120224a = new ReentrantLock();

    /* JADX INFO: renamed from: b */
    public final SharedPreferences f120225b;

    @VisibleForTesting
    public jxf0(Context context) {
        this.f120225b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    @NonNull
    @KeepForSdk
    /* JADX INFO: renamed from: b */
    public static jxf0 m143783b(@NonNull Context context) {
        Preconditions.checkNotNull(context);
        f120222c.lock();
        try {
            if (f120223d == null) {
                f120223d = new jxf0(context.getApplicationContext());
            }
            return f120223d;
        } finally {
            f120222c.unlock();
        }
    }

    /* JADX INFO: renamed from: k */
    public static final String m143784k(String str, String str2) {
        return str + ":" + str2;
    }

    @KeepForSdk
    /* JADX INFO: renamed from: a */
    public void m143785a() {
        this.f120224a.lock();
        try {
            this.f120225b.edit().clear().apply();
        } finally {
            this.f120224a.unlock();
        }
    }

    @Nullable
    @KeepForSdk
    /* JADX INFO: renamed from: c */
    public GoogleSignInAccount m143786c() {
        String strM143790g;
        String strM143790g2 = m143790g("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(strM143790g2) && (strM143790g = m143790g(m143784k("googleSignInAccount", strM143790g2))) != null) {
            try {
                return GoogleSignInAccount.m12401m0(strM143790g);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    @Nullable
    @KeepForSdk
    /* JADX INFO: renamed from: d */
    public GoogleSignInOptions m143787d() {
        String strM143790g;
        String strM143790g2 = m143790g("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(strM143790g2) && (strM143790g = m143790g(m143784k("googleSignInOptions", strM143790g2))) != null) {
            try {
                return GoogleSignInOptions.m12414k0(strM143790g);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    @Nullable
    @KeepForSdk
    /* JADX INFO: renamed from: e */
    public String m143788e() {
        return m143790g("refreshToken");
    }

    @KeepForSdk
    /* JADX INFO: renamed from: f */
    public void m143789f(@NonNull GoogleSignInAccount googleSignInAccount, @NonNull GoogleSignInOptions googleSignInOptions) {
        Preconditions.checkNotNull(googleSignInAccount);
        Preconditions.checkNotNull(googleSignInOptions);
        m143793j("defaultGoogleSignInAccount", googleSignInAccount.m12411n0());
        Preconditions.checkNotNull(googleSignInAccount);
        Preconditions.checkNotNull(googleSignInOptions);
        String strM12411n0 = googleSignInAccount.m12411n0();
        m143793j(m143784k("googleSignInAccount", strM12411n0), googleSignInAccount.m12412o0());
        m143793j(m143784k("googleSignInOptions", strM12411n0), googleSignInOptions.m12432o0());
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public final String m143790g(@NonNull String str) {
        this.f120224a.lock();
        try {
            return this.f120225b.getString(str, null);
        } finally {
            this.f120224a.unlock();
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m143791h(@NonNull String str) {
        this.f120224a.lock();
        try {
            this.f120225b.edit().remove(str).apply();
        } finally {
            this.f120224a.unlock();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m143792i() {
        String strM143790g = m143790g("defaultGoogleSignInAccount");
        m143791h("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(strM143790g)) {
            return;
        }
        m143791h(m143784k("googleSignInAccount", strM143790g));
        m143791h(m143784k("googleSignInOptions", strM143790g));
    }

    /* JADX INFO: renamed from: j */
    public final void m143793j(@NonNull String str, @NonNull String str2) {
        this.f120224a.lock();
        try {
            this.f120225b.edit().putString(str, str2).apply();
        } finally {
            this.f120224a.unlock();
        }
    }
}
