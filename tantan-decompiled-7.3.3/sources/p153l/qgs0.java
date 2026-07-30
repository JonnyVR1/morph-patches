package p153l;

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
public final class qgs0 implements SharedPreferences.OnSharedPreferenceChangeListener {

    /* JADX INFO: renamed from: g */
    public Context f157457g;

    /* JADX INFO: renamed from: a */
    public final Object f157451a = new Object();

    /* JADX INFO: renamed from: b */
    public final ConditionVariable f157452b = new ConditionVariable();

    /* JADX INFO: renamed from: c */
    public volatile boolean f157453c = false;

    /* JADX INFO: renamed from: d */
    @VisibleForTesting
    public volatile boolean f157454d = false;

    /* JADX INFO: renamed from: e */
    @Nullable
    public SharedPreferences f157455e = null;

    /* JADX INFO: renamed from: f */
    public Bundle f157456f = new Bundle();

    /* JADX INFO: renamed from: h */
    public JSONObject f157458h = new JSONObject();

    /* JADX INFO: renamed from: a */
    public final Object m176505a(final dgs0 dgs0Var) {
        if (!this.f157452b.block(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS)) {
            synchronized (this.f157451a) {
                try {
                    if (!this.f157454d) {
                        throw new IllegalStateException("Flags.initialize() was not called!");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        if (!this.f157453c || this.f157455e == null) {
            synchronized (this.f157451a) {
                if (this.f157453c && this.f157455e != null) {
                }
                return dgs0Var.m115749m();
            }
        }
        if (dgs0Var.m115747e() != 2) {
            return (dgs0Var.m115747e() == 1 && this.f157458h.has(dgs0Var.m115750n())) ? dgs0Var.mo97724a(this.f157458h) : xgs0.m210936a(new fpw0() { // from class: l.hgs0
                @Override // p153l.fpw0
                public final Object zza() {
                    return this.f109437a.m176506b(dgs0Var);
                }
            });
        }
        Bundle bundle = this.f157456f;
        return bundle == null ? dgs0Var.m115749m() : dgs0Var.mo97725b(bundle);
    }

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Object m176506b(dgs0 dgs0Var) {
        return dgs0Var.mo97726c(this.f157455e);
    }

    /* JADX INFO: renamed from: c */
    public final void m176507c(Context context) {
        if (this.f157453c) {
            return;
        }
        synchronized (this.f157451a) {
            try {
                if (this.f157453c) {
                    return;
                }
                if (!this.f157454d) {
                    this.f157454d = true;
                }
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                this.f157457g = context;
                try {
                    this.f157456f = Wrappers.packageManager(context).getApplicationInfo(this.f157457g.getPackageName(), 128).metaData;
                } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
                }
                try {
                    Context context2 = this.f157457g;
                    Context remoteContext = GooglePlayServicesUtilLight.getRemoteContext(context2);
                    if (remoteContext != null || context2 == null || (remoteContext = context2.getApplicationContext()) != null) {
                        context2 = remoteContext;
                    }
                    if (context2 == null) {
                        this.f157454d = false;
                        this.f157452b.open();
                        return;
                    }
                    jas0.m144074b();
                    SharedPreferences sharedPreferencesM125528a = fgs0.m125528a(context2);
                    this.f157455e = sharedPreferencesM125528a;
                    if (sharedPreferencesM125528a != null) {
                        sharedPreferencesM125528a.registerOnSharedPreferenceChangeListener(this);
                    }
                    zjs0.m219985c(new igs0(this, this.f157455e));
                    m176508d(this.f157455e);
                    this.f157453c = true;
                    this.f157454d = false;
                    this.f157452b.open();
                } catch (Throwable th) {
                    this.f157454d = false;
                    this.f157452b.open();
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m176508d(final SharedPreferences sharedPreferences) {
        if (sharedPreferences == null) {
            return;
        }
        try {
            this.f157458h = new JSONObject((String) xgs0.m210936a(new fpw0() { // from class: l.ggs0
                @Override // p153l.fpw0
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
            m176508d(sharedPreferences);
        }
    }
}
