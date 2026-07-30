package p149l;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzcjw;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class lru0 implements dfy0, fbt0 {

    /* JADX INFO: renamed from: a */
    public final Context f129768a;

    /* JADX INFO: renamed from: b */
    public final zzcei f129769b;

    /* JADX INFO: renamed from: c */
    public dru0 f129770c;

    /* JADX INFO: renamed from: d */
    public q9t0 f129771d;

    /* JADX INFO: renamed from: e */
    public boolean f129772e;

    /* JADX INFO: renamed from: f */
    public boolean f129773f;

    /* JADX INFO: renamed from: g */
    public long f129774g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public ewt0 f129775h;

    /* JADX INFO: renamed from: i */
    public boolean f129776i;

    public lru0(Context context, zzcei zzceiVar) {
        this.f129768a = context;
        this.f129769b = zzceiVar;
    }

    @Override // p149l.dfy0
    /* JADX INFO: renamed from: P2 */
    public final synchronized void mo102681P2() {
        this.f129773f = true;
        m151510f("");
    }

    @Override // p149l.fbt0
    /* JADX INFO: renamed from: a */
    public final synchronized void mo96131a(boolean z, int i, String str, String str2) {
        if (z) {
            xsu0.m210834k("Ad inspector loaded.");
            this.f129772e = true;
            m151510f("");
            return;
        }
        x2t0.m206869g("Ad inspector failed to load.");
        try {
            vny0.m199079q().m212290w(new Exception("Failed to load UI. Error code: " + i + ", Description: " + str + ", Failing URL: " + str2), "InspectorUi.onAdWebViewFinishedLoading 0");
            ewt0 ewt0Var = this.f129775h;
            if (ewt0Var != null) {
                ewt0Var.mo103601o5(pzv0.m172256d(17, null, null));
            }
        } catch (RemoteException e) {
            vny0.m199079q().m212290w(e, "InspectorUi.onAdWebViewFinishedLoading 1");
        }
        this.f129776i = true;
        this.f129771d.destroy();
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final Activity m151506b() {
        q9t0 q9t0Var = this.f129771d;
        if (q9t0Var == null || q9t0Var.mo13670V()) {
            return null;
        }
        return this.f129771d.zzi();
    }

    /* JADX INFO: renamed from: c */
    public final void m151507c(dru0 dru0Var) {
        this.f129770c = dru0Var;
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m151508d(String str) {
        JSONObject jSONObjectM113343e = this.f129770c.m113343e();
        if (!TextUtils.isEmpty(str)) {
            try {
                jSONObjectM113343e.put("redirectUrl", str);
            } catch (JSONException unused) {
            }
        }
        this.f129771d.mo13677b("window.inspectorInfo", jSONObjectM113343e.toString());
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m151509e(ewt0 ewt0Var, ohs0 ohs0Var, hhs0 hhs0Var) {
        if (m151511g(ewt0Var)) {
            try {
                vny0.m199062B();
                q9t0 q9t0VarM110631a = dat0.m110631a(this.f129768a, rbt0.m178692a(), "", false, false, null, null, this.f129769b, null, null, null, z2s0.m216992a(), null, null, null, null);
                this.f129771d = q9t0VarM110631a;
                hbt0 hbt0VarZzN = q9t0VarM110631a.zzN();
                if (hbt0VarZzN == null) {
                    x2t0.m206869g("Failed to obtain a web view for the ad inspector");
                    try {
                        vny0.m199079q().m212290w(new NullPointerException("Failed to obtain a web view for the ad inspector"), "InspectorUi.openInspector 2");
                        ewt0Var.mo103601o5(pzv0.m172256d(17, "Failed to obtain a web view for the ad inspector", null));
                        return;
                    } catch (RemoteException e) {
                        vny0.m199079q().m212290w(e, "InspectorUi.openInspector 3");
                        return;
                    }
                }
                this.f129775h = ewt0Var;
                hbt0VarZzN.zzN(null, null, null, null, null, false, null, null, null, null, null, null, null, null, ohs0Var, null, new nhs0(this.f129768a), hhs0Var, null);
                hbt0VarZzN.zzB(this);
                this.f129771d.loadUrl((String) d1s0.m109677c().m144697a(m7s0.f132021O8));
                vny0.m199073k();
                a8y0.m95388a(this.f129768a, new AdOverlayInfoParcel(this, this.f129771d, 1, this.f129769b), true);
                this.f129774g = vny0.m199064b().currentTimeMillis();
            } catch (zzcjw e2) {
                x2t0.m206870h("Failed to obtain a web view for the ad inspector", e2);
                try {
                    vny0.m199079q().m212290w(e2, "InspectorUi.openInspector 0");
                    ewt0Var.mo103601o5(pzv0.m172256d(17, "Failed to obtain a web view for the ad inspector", null));
                } catch (RemoteException e3) {
                    vny0.m199079q().m212290w(e3, "InspectorUi.openInspector 1");
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m151510f(final String str) {
        if (this.f129772e && this.f129773f) {
            i3t0.f111376e.execute(new Runnable() { // from class: l.kru0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f124396a.m151508d(str);
                }
            });
        }
    }

    /* JADX INFO: renamed from: g */
    public final synchronized boolean m151511g(ewt0 ewt0Var) {
        if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132009N8)).booleanValue()) {
            x2t0.m206869g("Ad inspector had an internal error.");
            try {
                ewt0Var.mo103601o5(pzv0.m172256d(16, null, null));
            } catch (RemoteException unused) {
            }
            return false;
        }
        if (this.f129770c == null) {
            x2t0.m206869g("Ad inspector had an internal error.");
            try {
                vny0.m199079q().m212290w(new NullPointerException("InspectorManager null"), "InspectorUi.shouldOpenUi");
                ewt0Var.mo103601o5(pzv0.m172256d(16, null, null));
            } catch (RemoteException unused2) {
            }
            return false;
        }
        if (!this.f129772e && !this.f129773f) {
            if (vny0.m199064b().currentTimeMillis() >= this.f129774g + ((long) ((Integer) d1s0.m109677c().m144697a(m7s0.f132045Q8)).intValue())) {
                return true;
            }
        }
        x2t0.m206869g("Ad inspector cannot be opened because it is already open.");
        try {
            ewt0Var.mo103601o5(pzv0.m172256d(19, null, null));
        } catch (RemoteException unused3) {
        }
        return false;
    }

    @Override // p149l.dfy0
    /* JADX INFO: renamed from: m5 */
    public final synchronized void mo102687m5(int i) {
        this.f129771d.destroy();
        if (!this.f129776i) {
            xsu0.m210834k("Inspector closed.");
            ewt0 ewt0Var = this.f129775h;
            if (ewt0Var != null) {
                try {
                    ewt0Var.mo103601o5(null);
                } catch (RemoteException unused) {
                }
            }
        }
        this.f129773f = false;
        this.f129772e = false;
        this.f129774g = 0L;
        this.f129776i = false;
        this.f129775h = null;
    }

    @Override // p149l.dfy0
    /* JADX INFO: renamed from: M6 */
    public final void mo102678M6() {
    }

    @Override // p149l.dfy0
    /* JADX INFO: renamed from: O */
    public final void mo102679O() {
    }

    @Override // p149l.dfy0
    /* JADX INFO: renamed from: g7 */
    public final void mo102683g7() {
    }

    @Override // p149l.dfy0
    /* JADX INFO: renamed from: m4 */
    public final void mo102686m4() {
    }
}
