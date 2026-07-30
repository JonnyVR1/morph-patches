package p153l;

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
public final class r0v0 implements joy0, lkt0 {

    /* JADX INFO: renamed from: a */
    public final Context f160693a;

    /* JADX INFO: renamed from: b */
    public final zzcei f160694b;

    /* JADX INFO: renamed from: c */
    public j0v0 f160695c;

    /* JADX INFO: renamed from: d */
    public wit0 f160696d;

    /* JADX INFO: renamed from: e */
    public boolean f160697e;

    /* JADX INFO: renamed from: f */
    public boolean f160698f;

    /* JADX INFO: renamed from: g */
    public long f160699g;

    /* JADX INFO: renamed from: h */
    @Nullable
    public k5u0 f160700h;

    /* JADX INFO: renamed from: i */
    public boolean f160701i;

    public r0v0(Context context, zzcei zzceiVar) {
        this.f160693a = context;
        this.f160694b = zzceiVar;
    }

    @Override // p153l.joy0
    /* JADX INFO: renamed from: P2 */
    public final synchronized void mo113755P2() {
        this.f160698f = true;
        m179268f("");
    }

    @Override // p153l.lkt0
    /* JADX INFO: renamed from: a */
    public final synchronized void mo99557a(boolean z, int i, String str, String str2) {
        if (z) {
            d2v0.m113737k("Ad inspector loaded.");
            this.f160697e = true;
            m179268f("");
            return;
        }
        dct0.m115298g("Ad inspector failed to load.");
        try {
            bxy0.m106933q().m120275w(new Exception("Failed to load UI. Error code: " + i + ", Description: " + str + ", Failing URL: " + str2), "InspectorUi.onAdWebViewFinishedLoading 0");
            k5u0 k5u0Var = this.f160700h;
            if (k5u0Var != null) {
                k5u0Var.mo113733o5(v8w0.m200327d(17, null, null));
            }
        } catch (RemoteException e) {
            bxy0.m106933q().m120275w(e, "InspectorUi.onAdWebViewFinishedLoading 1");
        }
        this.f160701i = true;
        this.f160696d.destroy();
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final Activity m179264b() {
        wit0 wit0Var = this.f160696d;
        if (wit0Var == null || wit0Var.mo13724V()) {
            return null;
        }
        return this.f160696d.zzi();
    }

    /* JADX INFO: renamed from: c */
    public final void m179265c(j0v0 j0v0Var) {
        this.f160695c = j0v0Var;
    }

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ void m179266d(String str) {
        JSONObject jSONObjectM143040e = this.f160695c.m143040e();
        if (!TextUtils.isEmpty(str)) {
            try {
                jSONObjectM143040e.put("redirectUrl", str);
            } catch (JSONException unused) {
            }
        }
        this.f160696d.mo13731b("window.inspectorInfo", jSONObjectM143040e.toString());
    }

    /* JADX INFO: renamed from: e */
    public final synchronized void m179267e(k5u0 k5u0Var, uqs0 uqs0Var, nqs0 nqs0Var) {
        if (m179269g(k5u0Var)) {
            try {
                bxy0.m106916B();
                wit0 wit0VarM145141a = jjt0.m145141a(this.f160693a, xkt0.m211415a(), "", false, false, null, null, this.f160694b, null, null, null, fcs0.m125045a(), null, null, null, null);
                this.f160696d = wit0VarM145141a;
                nkt0 nkt0VarZzN = wit0VarM145141a.zzN();
                if (nkt0VarZzN == null) {
                    dct0.m115298g("Failed to obtain a web view for the ad inspector");
                    try {
                        bxy0.m106933q().m120275w(new NullPointerException("Failed to obtain a web view for the ad inspector"), "InspectorUi.openInspector 2");
                        k5u0Var.mo113733o5(v8w0.m200327d(17, "Failed to obtain a web view for the ad inspector", null));
                        return;
                    } catch (RemoteException e) {
                        bxy0.m106933q().m120275w(e, "InspectorUi.openInspector 3");
                        return;
                    }
                }
                this.f160700h = k5u0Var;
                nkt0VarZzN.zzN(null, null, null, null, null, false, null, null, null, null, null, null, null, null, uqs0Var, null, new tqs0(this.f160693a), nqs0Var, null);
                nkt0VarZzN.zzB(this);
                this.f160696d.loadUrl((String) jas0.m144075c().m176505a(sgs0.f168092O8));
                bxy0.m106927k();
                ghy0.m130283a(this.f160693a, new AdOverlayInfoParcel(this, this.f160696d, 1, this.f160694b), true);
                this.f160699g = bxy0.m106918b().currentTimeMillis();
            } catch (zzcjw e2) {
                dct0.m115299h("Failed to obtain a web view for the ad inspector", e2);
                try {
                    bxy0.m106933q().m120275w(e2, "InspectorUi.openInspector 0");
                    k5u0Var.mo113733o5(v8w0.m200327d(17, "Failed to obtain a web view for the ad inspector", null));
                } catch (RemoteException e3) {
                    bxy0.m106933q().m120275w(e3, "InspectorUi.openInspector 1");
                }
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m179268f(final String str) {
        if (this.f160697e && this.f160698f) {
            oct0.f146737e.execute(new Runnable() { // from class: l.q0v0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f155091a.m179266d(str);
                }
            });
        }
    }

    /* JADX INFO: renamed from: g */
    public final synchronized boolean m179269g(k5u0 k5u0Var) {
        if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168080N8)).booleanValue()) {
            dct0.m115298g("Ad inspector had an internal error.");
            try {
                k5u0Var.mo113733o5(v8w0.m200327d(16, null, null));
            } catch (RemoteException unused) {
            }
            return false;
        }
        if (this.f160695c == null) {
            dct0.m115298g("Ad inspector had an internal error.");
            try {
                bxy0.m106933q().m120275w(new NullPointerException("InspectorManager null"), "InspectorUi.shouldOpenUi");
                k5u0Var.mo113733o5(v8w0.m200327d(16, null, null));
            } catch (RemoteException unused2) {
            }
            return false;
        }
        if (!this.f160697e && !this.f160698f) {
            if (bxy0.m106918b().currentTimeMillis() >= this.f160699g + ((long) ((Integer) jas0.m144075c().m176505a(sgs0.f168116Q8)).intValue())) {
                return true;
            }
        }
        dct0.m115298g("Ad inspector cannot be opened because it is already open.");
        try {
            k5u0Var.mo113733o5(v8w0.m200327d(19, null, null));
        } catch (RemoteException unused3) {
        }
        return false;
    }

    @Override // p153l.joy0
    /* JADX INFO: renamed from: m5 */
    public final synchronized void mo113769m5(int i) {
        this.f160696d.destroy();
        if (!this.f160701i) {
            d2v0.m113737k("Inspector closed.");
            k5u0 k5u0Var = this.f160700h;
            if (k5u0Var != null) {
                try {
                    k5u0Var.mo113733o5(null);
                } catch (RemoteException unused) {
                }
            }
        }
        this.f160698f = false;
        this.f160697e = false;
        this.f160699g = 0L;
        this.f160701i = false;
        this.f160700h = null;
    }

    @Override // p153l.joy0
    /* JADX INFO: renamed from: M6 */
    public final void mo113753M6() {
    }

    @Override // p153l.joy0
    /* JADX INFO: renamed from: O */
    public final void mo113754O() {
    }

    @Override // p153l.joy0
    /* JADX INFO: renamed from: g7 */
    public final void mo113765g7() {
    }

    @Override // p153l.joy0
    /* JADX INFO: renamed from: m4 */
    public final void mo113768m4() {
    }
}
