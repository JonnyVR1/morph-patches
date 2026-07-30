package p149l;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.ads.internal.util.C2075b;
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
public final class xwr0 {

    /* JADX INFO: renamed from: a */
    public final Object f194757a = new Object();

    /* JADX INFO: renamed from: b */
    public String f194758b = "";

    /* JADX INFO: renamed from: c */
    public String f194759c = "";

    /* JADX INFO: renamed from: d */
    public boolean f194760d = false;

    /* JADX INFO: renamed from: e */
    public boolean f194761e = false;

    /* JADX INFO: renamed from: f */
    @VisibleForTesting
    public String f194762f = "";

    /* JADX INFO: renamed from: g */
    public dru0 f194763g;

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    @VisibleForTesting
    /* JADX INFO: renamed from: o */
    public static final String m211387o(Context context, String str, String str2) {
        HashMap map = new HashMap();
        map.put("User-Agent", vny0.m199080r().m12335E(context, str2));
        gnr gnrVarM198686b = new vjs0(context).m198686b(0, str, map, null);
        try {
            return (String) gnrVarM198686b.get(((Integer) d1s0.m109677c().m144697a(m7s0.f131921G4)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            x2t0.m206867e("Interrupted while retrieving a response from: ".concat(String.valueOf(str)), e);
            gnrVarM198686b.cancel(true);
            return null;
        } catch (TimeoutException e2) {
            x2t0.m206867e("Timeout while retrieving a response from: ".concat(String.valueOf(str)), e2);
            gnrVarM198686b.cancel(true);
            return null;
        } catch (Exception e3) {
            x2t0.m206867e("Error retrieving a response from: ".concat(String.valueOf(str)), e3);
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public final dru0 m211388a() {
        return this.f194763g;
    }

    /* JADX INFO: renamed from: b */
    public final String m211389b() {
        String str;
        synchronized (this.f194757a) {
            str = this.f194759c;
        }
        return str;
    }

    /* JADX INFO: renamed from: c */
    public final void m211390c(Context context) {
        dru0 dru0Var;
        if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132192c9)).booleanValue() || (dru0Var = this.f194763g) == null) {
            return;
        }
        dru0Var.m113346h(new xsr0(this, context), zzdzc.DEBUG_MENU);
    }

    /* JADX INFO: renamed from: d */
    public final void m211391d(Context context, String str, String str2) {
        vny0.m199080r();
        C2075b.m12327t(context, m211402p(context, (String) d1s0.m109677c().m144697a(m7s0.f131873C4), str, str2));
    }

    /* JADX INFO: renamed from: e */
    public final void m211392e(Context context, String str, String str2, String str3) {
        Uri.Builder builderBuildUpon = m211402p(context, (String) d1s0.m109677c().m144697a(m7s0.f131909F4), str3, str).buildUpon();
        builderBuildUpon.appendQueryParameter("debugData", str2);
        vny0.m199080r();
        C2075b.m12318k(context, str, builderBuildUpon.build().toString());
    }

    /* JADX INFO: renamed from: f */
    public final void m211393f(boolean z) {
        synchronized (this.f194757a) {
            try {
                this.f194761e = z;
                if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132192c9)).booleanValue()) {
                    vny0.m199079q().m212279i().mo96942a(z);
                    dru0 dru0Var = this.f194763g;
                    if (dru0Var != null) {
                        dru0Var.m113349k(z);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m211394g(dru0 dru0Var) {
        this.f194763g = dru0Var;
    }

    /* JADX INFO: renamed from: h */
    public final void m211395h(boolean z) {
        synchronized (this.f194757a) {
            this.f194760d = z;
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: i */
    public final void m211396i(Context context, String str, boolean z, boolean z2) {
        if (context instanceof Activity) {
            C2075b.f9714l.post(new mvr0(this, context, str, z, z2));
        } else {
            x2t0.m206868f("Can not create dialog without Activity Context");
        }
    }

    /* JADX INFO: renamed from: j */
    public final boolean m211397j(Context context, String str, String str2) {
        String strM211387o = m211387o(context, m211402p(context, (String) d1s0.m109677c().m144697a(m7s0.f131897E4), str, str2).toString(), str2);
        if (TextUtils.isEmpty(strM211387o)) {
            x2t0.m206864b("Not linked for debug signals.");
            return false;
        }
        try {
            boolean zEquals = "1".equals(new JSONObject(strM211387o.trim()).optString("debug_mode"));
            m211393f(zEquals);
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132192c9)).booleanValue()) {
                aiw0 aiw0VarM212279i = vny0.m199079q().m212279i();
                if (true != zEquals) {
                    str = "";
                }
                aiw0VarM212279i.mo96944c(str);
            }
            return zEquals;
        } catch (JSONException e) {
            x2t0.m206870h("Fail to get debug mode response json.", e);
            return false;
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: k */
    public final boolean m211398k(Context context, String str, String str2) {
        String strM211387o = m211387o(context, m211402p(context, (String) d1s0.m109677c().m144697a(m7s0.f131885D4), str, str2).toString(), str2);
        if (TextUtils.isEmpty(strM211387o)) {
            x2t0.m206864b("Not linked for in app preview.");
            return false;
        }
        try {
            JSONObject jSONObject = new JSONObject(strM211387o.trim());
            String strOptString = jSONObject.optString("gct");
            this.f194762f = jSONObject.optString(NotificationCompat.CATEGORY_STATUS);
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132192c9)).booleanValue()) {
                boolean z = "0".equals(this.f194762f) || "2".equals(this.f194762f);
                m211393f(z);
                aiw0 aiw0VarM212279i = vny0.m199079q().m212279i();
                if (!z) {
                    str = "";
                }
                aiw0VarM212279i.mo96944c(str);
            }
            synchronized (this.f194757a) {
                this.f194759c = strOptString;
            }
            return true;
        } catch (JSONException e) {
            x2t0.m206870h("Fail to get in app preview response json.", e);
            return false;
        }
    }

    /* JADX INFO: renamed from: l */
    public final boolean m211399l() {
        boolean z;
        synchronized (this.f194757a) {
            z = this.f194761e;
        }
        return z;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m211400m() {
        boolean z;
        synchronized (this.f194757a) {
            z = this.f194760d;
        }
        return z;
    }

    /* JADX INFO: renamed from: n */
    public final boolean m211401n(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || !m211400m()) {
            return false;
        }
        x2t0.m206864b("Sending troubleshooting signals to the server.");
        m211392e(context, str, str2, str3);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0066 A[Catch: all -> 0x0029, TryCatch #1 {, blocks: (B:4:0x000b, B:6:0x0013, B:7:0x0018, B:12:0x0032, B:14:0x003a, B:16:0x004f, B:19:0x0061, B:11:0x002b, B:20:0x0066, B:21:0x0068), top: B:28:0x000b, inners: #0, #2 }] */
    /* JADX INFO: renamed from: p */
    public final Uri m211402p(Context context, String str, String str2, String str3) {
        String str4;
        String str5;
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        synchronized (this.f194757a) {
            if (TextUtils.isEmpty(this.f194758b)) {
                vny0.m199080r();
                try {
                    str5 = new String(IOUtils.readInputStreamFully(context.openFileInput("debug_signals_id.txt"), true), "UTF-8");
                } catch (IOException unused) {
                    x2t0.m206864b("Error reading from internal storage.");
                    str5 = "";
                }
                this.f194758b = str5;
                if (TextUtils.isEmpty(str5)) {
                    vny0.m199080r();
                    this.f194758b = UUID.randomUUID().toString();
                    vny0.m199080r();
                    String str6 = this.f194758b;
                    try {
                        FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput("debug_signals_id.txt", 0);
                        fileOutputStreamOpenFileOutput.write(str6.getBytes("UTF-8"));
                        fileOutputStreamOpenFileOutput.close();
                    } catch (Exception e) {
                        x2t0.m206867e("Error writing to file in internal storage.", e);
                    }
                    str4 = this.f194758b;
                } else {
                    str4 = this.f194758b;
                }
            } else {
                str4 = this.f194758b;
            }
            throw th;
        }
        builderBuildUpon.appendQueryParameter("linkedDeviceId", str4);
        builderBuildUpon.appendQueryParameter("adSlotPath", str2);
        builderBuildUpon.appendQueryParameter("afmaVersion", str3);
        return builderBuildUpon.build();
    }
}
