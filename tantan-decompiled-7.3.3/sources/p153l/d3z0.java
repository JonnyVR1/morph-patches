package p153l;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class d3z0 {

    /* JADX INFO: renamed from: f */
    public zmw0 f84993f;

    /* JADX INFO: renamed from: c */
    @Nullable
    public wit0 f84990c = null;

    /* JADX INFO: renamed from: e */
    public boolean f84992e = false;

    /* JADX INFO: renamed from: a */
    @Nullable
    public String f84988a = null;

    /* JADX INFO: renamed from: d */
    @Nullable
    public mmw0 f84991d = null;

    /* JADX INFO: renamed from: b */
    @Nullable
    public String f84989b = null;

    /* JADX INFO: renamed from: a */
    public final synchronized void m114058a(@Nullable wit0 wit0Var, Context context) {
        this.f84990c = wit0Var;
        if (!m114068k(context)) {
            m114063f("Unable to bind", "on_play_store_bind");
            return;
        }
        HashMap map = new HashMap();
        map.put("action", "fetch_completed");
        m114062e("on_play_store_bind", map);
    }

    /* JADX INFO: renamed from: b */
    public final void m114059b() {
        mmw0 mmw0Var;
        if (!this.f84992e || (mmw0Var = this.f84991d) == null) {
            d2v0.m113737k("LastMileDelivery not connected");
        } else {
            mmw0Var.mo159102b(m114069l(), this.f84993f);
            m114061d("onLMDOverlayCollapse");
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m114060c() {
        mmw0 mmw0Var;
        if (!this.f84992e || (mmw0Var = this.f84991d) == null) {
            d2v0.m113737k("LastMileDelivery not connected");
            return;
        }
        kmw0 kmw0VarM154892c = lmw0.m154892c();
        if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168130Ra)).booleanValue() || TextUtils.isEmpty(this.f84989b)) {
            String str = this.f84988a;
            if (str != null) {
                kmw0VarM154892c.mo150493b(str);
            } else {
                m114063f("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            kmw0VarM154892c.mo150492a(this.f84989b);
        }
        mmw0Var.mo159104d(kmw0VarM154892c.mo150494c(), this.f84993f);
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: d */
    public final void m114061d(String str) {
        m114062e(str, new HashMap());
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: e */
    public final void m114062e(final String str, final Map map) {
        oct0.f146737e.execute(new Runnable() { // from class: l.b0z0
            @Override // java.lang.Runnable
            public final void run() {
                this.f74304a.m114065h(str, map);
            }
        });
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: f */
    public final void m114063f(String str, String str2) {
        d2v0.m113737k(str);
        if (this.f84990c != null) {
            HashMap map = new HashMap();
            map.put("message", str);
            map.put("action", str2);
            m114062e("onError", map);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m114064g() {
        mmw0 mmw0Var;
        if (!this.f84992e || (mmw0Var = this.f84991d) == null) {
            d2v0.m113737k("LastMileDelivery not connected");
        } else {
            mmw0Var.mo159101a(m114069l(), this.f84993f);
            m114061d("onLMDOverlayExpand");
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m114065h(String str, Map map) {
        wit0 wit0Var = this.f84990c;
        if (wit0Var != null) {
            wit0Var.mo13728Z(str, map);
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: i */
    public final void m114066i(ymw0 ymw0Var) {
        if (!TextUtils.isEmpty(ymw0Var.mo117031b())) {
            if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168130Ra)).booleanValue()) {
                this.f84988a = ymw0Var.mo117031b();
            }
        }
        switch (ymw0Var.mo117030a()) {
            case 8152:
                m114061d("onLMDOverlayOpened");
                break;
            case 8153:
                m114061d("onLMDOverlayClicked");
                break;
            case 8155:
                m114061d("onLMDOverlayClose");
                break;
            case 8157:
                this.f84988a = null;
                this.f84989b = null;
                this.f84992e = false;
                break;
            case 8160:
            case 8161:
            case 8162:
                HashMap map = new HashMap();
                map.put("error", String.valueOf(ymw0Var.mo117030a()));
                m114062e("onLMDOverlayFailedToOpen", map);
                break;
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m114067j(@Nullable wit0 wit0Var, @Nullable wmw0 wmw0Var) {
        if (wit0Var == null) {
            m114063f("adWebview missing", "onLMDShow");
            return;
        }
        this.f84990c = wit0Var;
        if (!this.f84992e && !m114068k(wit0Var.getContext())) {
            m114063f("LMDOverlay not bound", "on_play_store_bind");
            return;
        }
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168130Ra)).booleanValue()) {
            this.f84989b = wmw0Var.mo98871g();
        }
        m114070m();
        mmw0 mmw0Var = this.f84991d;
        if (mmw0Var != null) {
            mmw0Var.mo159103c(wmw0Var, this.f84993f);
        }
    }

    /* JADX INFO: renamed from: k */
    public final synchronized boolean m114068k(Context context) {
        if (!unw0.m196957a(context)) {
            return false;
        }
        try {
            this.f84991d = nmw0.m163845a(context);
        } catch (NullPointerException e) {
            d2v0.m113737k("Error connecting LMD Overlay service");
            bxy0.m106933q().m120275w(e, "LastMileDeliveryOverlay.bindLastMileDeliveryService");
        }
        if (this.f84991d == null) {
            this.f84992e = false;
            return false;
        }
        m114070m();
        this.f84992e = true;
        return true;
    }

    /* JADX INFO: renamed from: l */
    public final bnw0 m114069l() {
        anw0 anw0VarM105629c = bnw0.m105629c();
        if (!((Boolean) jas0.m144075c().m176505a(sgs0.f168130Ra)).booleanValue() || TextUtils.isEmpty(this.f84989b)) {
            String str = this.f84988a;
            if (str != null) {
                anw0VarM105629c.mo99039b(str);
            } else {
                m114063f("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            anw0VarM105629c.mo99038a(this.f84989b);
        }
        return anw0VarM105629c.mo99040c();
    }

    /* JADX INFO: renamed from: m */
    public final void m114070m() {
        if (this.f84993f == null) {
            this.f84993f = new x1z0(this);
        }
    }
}
