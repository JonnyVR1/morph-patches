package p153l;

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
public class t5g0 {

    /* JADX INFO: renamed from: c */
    public static final Lock f172206c = new ReentrantLock();

    /* JADX INFO: renamed from: d */
    @Nullable
    public static t5g0 f172207d;

    /* JADX INFO: renamed from: a */
    public final Lock f172208a = new ReentrantLock();

    /* JADX INFO: renamed from: b */
    public final SharedPreferences f172209b;

    @VisibleForTesting
    public t5g0(Context context) {
        this.f172209b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    @NonNull
    @KeepForSdk
    /* JADX INFO: renamed from: b */
    public static t5g0 m189389b(@NonNull Context context) {
        Preconditions.checkNotNull(context);
        f172206c.lock();
        try {
            if (f172207d == null) {
                f172207d = new t5g0(context.getApplicationContext());
            }
            return f172207d;
        } finally {
            f172206c.unlock();
        }
    }

    /* JADX INFO: renamed from: k */
    public static final String m189390k(String str, String str2) {
        return str + ":" + str2;
    }

    @KeepForSdk
    /* JADX INFO: renamed from: a */
    public void m189391a() {
        this.f172208a.lock();
        try {
            this.f172209b.edit().clear().apply();
        } finally {
            this.f172208a.unlock();
        }
    }

    @Nullable
    @KeepForSdk
    /* JADX INFO: renamed from: c */
    public GoogleSignInAccount m189392c() {
        String strM189396g;
        String strM189396g2 = m189396g("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(strM189396g2) && (strM189396g = m189396g(m189390k("googleSignInAccount", strM189396g2))) != null) {
            try {
                return GoogleSignInAccount.m12455n0(strM189396g);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    @Nullable
    @KeepForSdk
    /* JADX INFO: renamed from: d */
    public GoogleSignInOptions m189393d() {
        String strM189396g;
        String strM189396g2 = m189396g("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(strM189396g2) && (strM189396g = m189396g(m189390k("googleSignInOptions", strM189396g2))) != null) {
            try {
                return GoogleSignInOptions.m12468l0(strM189396g);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    @Nullable
    @KeepForSdk
    /* JADX INFO: renamed from: e */
    public String m189394e() {
        return m189396g("refreshToken");
    }

    @KeepForSdk
    /* JADX INFO: renamed from: f */
    public void m189395f(@NonNull GoogleSignInAccount googleSignInAccount, @NonNull GoogleSignInOptions googleSignInOptions) {
        Preconditions.checkNotNull(googleSignInAccount);
        Preconditions.checkNotNull(googleSignInOptions);
        m189399j("defaultGoogleSignInAccount", googleSignInAccount.m12465o0());
        Preconditions.checkNotNull(googleSignInAccount);
        Preconditions.checkNotNull(googleSignInOptions);
        String strM12465o0 = googleSignInAccount.m12465o0();
        m189399j(m189390k("googleSignInAccount", strM12465o0), googleSignInAccount.m12466p0());
        m189399j(m189390k("googleSignInOptions", strM12465o0), googleSignInOptions.m12486p0());
    }

    @Nullable
    /* JADX INFO: renamed from: g */
    public final String m189396g(@NonNull String str) {
        this.f172208a.lock();
        try {
            return this.f172209b.getString(str, null);
        } finally {
            this.f172208a.unlock();
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m189397h(@NonNull String str) {
        this.f172208a.lock();
        try {
            this.f172209b.edit().remove(str).apply();
        } finally {
            this.f172208a.unlock();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m189398i() {
        String strM189396g = m189396g("defaultGoogleSignInAccount");
        m189397h("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(strM189396g)) {
            return;
        }
        m189397h(m189390k("googleSignInAccount", strM189396g));
        m189397h(m189390k("googleSignInOptions", strM189396g));
    }

    /* JADX INFO: renamed from: j */
    public final void m189399j(@NonNull String str, @NonNull String str2) {
        this.f172208a.lock();
        try {
            this.f172209b.edit().putString(str, str2).apply();
        } finally {
            this.f172208a.unlock();
        }
    }
}
