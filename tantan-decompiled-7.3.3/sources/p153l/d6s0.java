package p153l;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.internal.util.C2098b;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.internal.ads.zzdzc;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class d6s0 {

    /* JADX INFO: renamed from: a */
    public final Object f85399a = new Object();

    /* JADX INFO: renamed from: b */
    public String f85400b = "";

    /* JADX INFO: renamed from: c */
    public String f85401c = "";

    /* JADX INFO: renamed from: d */
    public boolean f85402d = false;

    /* JADX INFO: renamed from: e */
    public boolean f85403e = false;

    /* JADX INFO: renamed from: f */
    @VisibleForTesting
    public String f85404f = "";

    /* JADX INFO: renamed from: g */
    public j0v0 f85405g;

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    @VisibleForTesting
    /* JADX INFO: renamed from: o */
    public static final String m114531o(Context context, String str, String str2) {
        HashMap map = new HashMap();
        map.put("User-Agent", bxy0.m106934r().m12389E(context, str2));
        hpr hprVarM106383b = new bts0(context).m106383b(0, str, map, null);
        try {
            return (String) hprVarM106383b.get(((Integer) jas0.m144075c().m176505a(sgs0.f167992G4)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            dct0.m115296e("Interrupted while retrieving a response from: ".concat(String.valueOf(str)), e);
            hprVarM106383b.cancel(true);
            return null;
        } catch (TimeoutException e2) {
            dct0.m115296e("Timeout while retrieving a response from: ".concat(String.valueOf(str)), e2);
            hprVarM106383b.cancel(true);
            return null;
        } catch (Exception e3) {
            dct0.m115296e("Error retrieving a response from: ".concat(String.valueOf(str)), e3);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final j0v0 m114532a() {
        return this.f85405g;
    }

    /* JADX INFO: renamed from: b */
    public final String m114533b() {
        String str;
        synchronized (this.f85399a) {
            str = this.f85401c;
        }
        return str;
    }

    /* JADX INFO: renamed from: c */
    public final void m114534c(Context context) {
        j0v0 j0v0Var;
        if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168263c9)).booleanValue() || (j0v0Var = this.f85405g) == null) {
            return;
        }
        j0v0Var.m143043h(new d2s0(this, context), zzdzc.DEBUG_MENU);
    }

    /* JADX INFO: renamed from: d */
    public final void m114535d(Context context, String str, String str2) {
        bxy0.m106934r();
        C2098b.m12381t(context, m114546p(context, (String) jas0.m144075c().m176505a(sgs0.f167944C4), str, str2));
    }

    /* JADX INFO: renamed from: e */
    public final void m114536e(Context context, String str, String str2, String str3) {
        Uri.Builder builderBuildUpon = m114546p(context, (String) jas0.m144075c().m176505a(sgs0.f167980F4), str3, str).buildUpon();
        builderBuildUpon.appendQueryParameter("debugData", str2);
        bxy0.m106934r();
        C2098b.m12372k(context, str, builderBuildUpon.build().toString());
    }

    /* JADX INFO: renamed from: f */
    public final void m114537f(boolean z) {
        synchronized (this.f85399a) {
            try {
                this.f85403e = z;
                if (((Boolean) jas0.m144075c().m176505a(sgs0.f168263c9)).booleanValue()) {
                    bxy0.m106933q().m120264i().mo131891a(z);
                    j0v0 j0v0Var = this.f85405g;
                    if (j0v0Var != null) {
                        j0v0Var.m143046k(z);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m114538g(j0v0 j0v0Var) {
        this.f85405g = j0v0Var;
    }

    /* JADX INFO: renamed from: h */
    public final void m114539h(boolean z) {
        synchronized (this.f85399a) {
            this.f85402d = z;
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: i */
    public final void m114540i(Context context, String str, boolean z, boolean z2) {
        if (context instanceof Activity) {
            C2098b.f9751l.post(new s4s0(this, context, str, z, z2));
        } else {
            dct0.m115297f("Can not create dialog without Activity Context");
        }
    }

    /* JADX INFO: renamed from: j */
    public final boolean m114541j(Context context, String str, String str2) {
        String strM114531o = m114531o(context, m114546p(context, (String) jas0.m144075c().m176505a(sgs0.f167968E4), str, str2).toString(), str2);
        if (TextUtils.isEmpty(strM114531o)) {
            dct0.m115293b("Not linked for debug signals.");
            return false;
        }
        try {
            boolean zEquals = "1".equals(new JSONObject(strM114531o.trim()).optString("debug_mode"));
            m114537f(zEquals);
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168263c9)).booleanValue()) {
                grw0 grw0VarM120264i = bxy0.m106933q().m120264i();
                if (true != zEquals) {
                    str = "";
                }
                grw0VarM120264i.mo131893c(str);
            }
            return zEquals;
        } catch (JSONException e) {
            dct0.m115299h("Fail to get debug mode response json.", e);
            return false;
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: k */
    public final boolean m114542k(Context context, String str, String str2) {
        String strM114531o = m114531o(context, m114546p(context, (String) jas0.m144075c().m176505a(sgs0.f167956D4), str, str2).toString(), str2);
        if (TextUtils.isEmpty(strM114531o)) {
            dct0.m115293b("Not linked for in app preview.");
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(strM114531o.trim());
            String strOptString = jSONObject.optString("gct");
            this.f85404f = jSONObject.optString(NotificationCompat.CATEGORY_STATUS);
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168263c9)).booleanValue()) {
                boolean z = "0".equals(this.f85404f) || "2".equals(this.f85404f);
                m114537f(z);
                grw0 grw0VarM120264i = bxy0.m106933q().m120264i();
                if (!z) {
                    str = "";
                }
                grw0VarM120264i.mo131893c(str);
            }
            synchronized (this.f85399a) {
                this.f85401c = strOptString;
            }
            return true;
        } catch (JSONException e) {
            dct0.m115299h("Fail to get in app preview response json.", e);
            return false;
        }
    }

    /* JADX INFO: renamed from: l */
    public final boolean m114543l() {
        boolean z;
        synchronized (this.f85399a) {
            z = this.f85403e;
        }
        return z;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m114544m() {
        boolean z;
        synchronized (this.f85399a) {
            z = this.f85402d;
        }
        return z;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m114545n(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || !m114544m()) {
            return false;
        }
        dct0.m115293b("Sending troubleshooting signals to the server.");
        m114536e(context, str, str2, str3);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0066 A[Catch: all -> 0x0029, TryCatch #1 {, blocks: (B:4:0x000b, B:6:0x0013, B:7:0x0018, B:12:0x0032, B:14:0x003a, B:16:0x004f, B:19:0x0061, B:11:0x002b, B:20:0x0066, B:21:0x0068), top: B:28:0x000b, inners: #0, #2 }] */
    /* JADX INFO: renamed from: p */
    public final Uri m114546p(Context context, String str, String str2, String str3) {
        String str4;
        String str5;
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        synchronized (this.f85399a) {
            if (TextUtils.isEmpty(this.f85400b)) {
                bxy0.m106934r();
                try {
                    str5 = new String(IOUtils.readInputStreamFully(context.openFileInput("debug_signals_id.txt"), true), "UTF-8");
                } catch (IOException unused) {
                    dct0.m115293b("Error reading from internal storage.");
                    str5 = "";
                }
                this.f85400b = str5;
                if (TextUtils.isEmpty(str5)) {
                    bxy0.m106934r();
                    this.f85400b = UUID.randomUUID().toString();
                    bxy0.m106934r();
                    String str6 = this.f85400b;
                    try {
                        FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput("debug_signals_id.txt", 0);
                        fileOutputStreamOpenFileOutput.write(str6.getBytes("UTF-8"));
                        fileOutputStreamOpenFileOutput.close();
                    } catch (Exception e) {
                        dct0.m115296e("Error writing to file in internal storage.", e);
                    }
                    str4 = this.f85400b;
                } else {
                    str4 = this.f85400b;
                }
            } else {
                str4 = this.f85400b;
            }
            throw th;
        }
        builderBuildUpon.appendQueryParameter("linkedDeviceId", str4);
        builderBuildUpon.appendQueryParameter("adSlotPath", str2);
        builderBuildUpon.appendQueryParameter("afmaVersion", str3);
        return builderBuildUpon.build();
    }
}
