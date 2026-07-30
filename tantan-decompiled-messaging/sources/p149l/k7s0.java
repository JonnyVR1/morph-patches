package p149l;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.ConditionVariable;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.GooglePlayServicesUtilLight;
import com.google.android.gms.common.wrappers.Wrappers;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class k7s0 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: g */
    public Context f121623g;

    /* JADX INFO: renamed from: a */
    public final Object f121617a = new Object();

    /* JADX INFO: renamed from: b */
    public final ConditionVariable f121618b = new ConditionVariable();

    /* JADX INFO: renamed from: c */
    public volatile boolean f121619c = false;

    /* JADX INFO: renamed from: d */
    @VisibleForTesting
    public volatile boolean f121620d = false;

    /* JADX INFO: renamed from: e */
    @Nullable
    public SharedPreferences f121621e = null;

    /* JADX INFO: renamed from: f */
    public Bundle f121622f = new Bundle();

    /* JADX INFO: renamed from: h */
    public JSONObject f121624h = new JSONObject();

    /* JADX INFO: renamed from: a */
    public final Object m144697a(final x6s0 x6s0Var) {
        if (!this.f121618b.block(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS)) {
            synchronized (this.f121617a) {
                try {
                    if (!this.f121620d) {
                        throw new IllegalStateException("Flags.initialize() was not called!");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (!this.f121619c || this.f121621e == null) {
            synchronized (this.f121617a) {
                if (this.f121619c && this.f121621e != null) {
                }
                return x6s0Var.m207208m();
            }
        }
        if (x6s0Var.m207206e() != 2) {
            return (x6s0Var.m207206e() == 1 && this.f121624h.has(x6s0Var.m207209n())) ? x6s0Var.mo178095a(this.f121624h) : r7s0.m178209a(new zfw0() { // from class: l.b7s0
                @Override // p149l.zfw0
                public final Object zza() {
                    return this.f74013a.m144698b(x6s0Var);
                }
            });
        }
        Bundle bundle = this.f121622f;
        return bundle == null ? x6s0Var.m207208m() : x6s0Var.mo178096b(bundle);
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object m144698b(x6s0 x6s0Var) {
        return x6s0Var.mo178097c(this.f121621e);
    }

    /* JADX INFO: renamed from: c */
    public final void m144699c(Context context) {
        if (this.f121619c) {
            return;
        }
        synchronized (this.f121617a) {
            try {
                if (this.f121619c) {
                    return;
                }
                if (!this.f121620d) {
                    this.f121620d = true;
                }
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                this.f121623g = context;
                try {
                    this.f121622f = Wrappers.packageManager(context).getApplicationInfo(this.f121623g.getPackageName(), 128).metaData;
                } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
                }
                try {
                    Context context2 = this.f121623g;
                    Context remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context2);
                    if (remoteContext != null || context2 == null || (remoteContext = context2.getApplicationContext()) != null) {
                        context2 = remoteContext;
                    }
                    if (context2 == null) {
                        this.f121620d = false;
                        this.f121618b.open();
                        return;
                    }
                    d1s0.m109676b();
                    SharedPreferences sharedPreferencesM217419a = z6s0.m217419a(context2);
                    this.f121621e = sharedPreferencesM217419a;
                    if (sharedPreferencesM217419a != null) {
                        sharedPreferencesM217419a.registerOnSharedPreferenceChangeListener(this);
                    }
                    tas0.m187781c(new c7s0(this, this.f121621e));
                    m144700d(this.f121621e);
                    this.f121619c = true;
                    this.f121620d = false;
                    this.f121618b.open();
                } catch (Throwable th) {
                    this.f121620d = false;
                    this.f121618b.open();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m144700d(final SharedPreferences sharedPreferences) {
        if (sharedPreferences == null) {
            return;
        }
        try {
            this.f121624h = new JSONObject((String) r7s0.m178209a(new zfw0() { // from class: l.a7s0
                @Override // p149l.zfw0
                public final Object zza() {
                    return sharedPreferences.getString("flag_configuration", WeJson.EMPTY_MAP);
                }
            }));
        } catch (JSONException unused) {
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            m144700d(sharedPreferences);
        }
    }
}
