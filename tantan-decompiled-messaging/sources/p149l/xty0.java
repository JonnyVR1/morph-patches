package p149l;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class xty0 {

    /* JADX INFO: renamed from: f */
    public tdw0 f194456f;

    /* JADX INFO: renamed from: c */
    @Nullable
    public q9t0 f194453c = null;

    /* JADX INFO: renamed from: e */
    public boolean f194455e = false;

    /* JADX INFO: renamed from: a */
    @Nullable
    public String f194451a = null;

    /* JADX INFO: renamed from: d */
    @Nullable
    public gdw0 f194454d = null;

    /* JADX INFO: renamed from: b */
    @Nullable
    public String f194452b = null;

    /* JADX INFO: renamed from: a */
    public final synchronized void m211032a(@Nullable q9t0 q9t0Var, Context context) {
        this.f194453c = q9t0Var;
        if (!m211042k(context)) {
            m211037f("Unable to bind", "on_play_store_bind");
            return;
        }
        HashMap map = new HashMap();
        map.put("action", "fetch_completed");
        m211036e("on_play_store_bind", map);
    }

    /* JADX INFO: renamed from: b */
    public final void m211033b() {
        gdw0 gdw0Var;
        if (!this.f194455e || (gdw0Var = this.f194454d) == null) {
            xsu0.m210834k("LastMileDelivery not connected");
        } else {
            gdw0Var.mo125597b(m211043l(), this.f194456f);
            m211035d("onLMDOverlayCollapse");
        }
    }

    /* JADX INFO: renamed from: c */
    public final void m211034c() {
        gdw0 gdw0Var;
        if (!this.f194455e || (gdw0Var = this.f194454d) == null) {
            xsu0.m210834k("LastMileDelivery not connected");
            return;
        }
        edw0 edw0VarM121010c = fdw0.m121010c();
        if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132059Ra)).booleanValue() || TextUtils.isEmpty(this.f194452b)) {
            String str = this.f194451a;
            if (str != null) {
                edw0VarM121010c.mo115837b(str);
            } else {
                m211037f("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            edw0VarM121010c.mo115836a(this.f194452b);
        }
        gdw0Var.mo125599d(edw0VarM121010c.mo115838c(), this.f194456f);
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: d */
    public final void m211035d(String str) {
        m211036e(str, new HashMap());
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: e */
    public final void m211036e(final String str, final Map map) {
        i3t0.f111376e.execute(new Runnable() { // from class: l.vqy0
            @Override // java.lang.Runnable
            public final void run() {
                this.f182685a.m211039h(str, map);
            }
        });
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: f */
    public final void m211037f(String str, String str2) {
        xsu0.m210834k(str);
        if (this.f194453c != null) {
            HashMap map = new HashMap();
            map.put("message", str);
            map.put("action", str2);
            m211036e("onError", map);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m211038g() {
        gdw0 gdw0Var;
        if (!this.f194455e || (gdw0Var = this.f194454d) == null) {
            xsu0.m210834k("LastMileDelivery not connected");
        } else {
            gdw0Var.mo125596a(m211043l(), this.f194456f);
            m211035d("onLMDOverlayExpand");
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m211039h(String str, Map map) {
        q9t0 q9t0Var = this.f194453c;
        if (q9t0Var != null) {
            q9t0Var.mo13674Z(str, map);
        }
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: i */
    public final void m211040i(sdw0 sdw0Var) {
        if (!TextUtils.isEmpty(sdw0Var.mo183574b())) {
            if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132059Ra)).booleanValue()) {
                this.f194451a = sdw0Var.mo183574b();
            }
        }
        switch (sdw0Var.mo183573a()) {
            case 8152:
                m211035d("onLMDOverlayOpened");
                break;
            case 8153:
                m211035d("onLMDOverlayClicked");
                break;
            case 8155:
                m211035d("onLMDOverlayClose");
                break;
            case 8157:
                this.f194451a = null;
                this.f194452b = null;
                this.f194455e = false;
                break;
            case 8160:
            case 8161:
            case 8162:
                HashMap map = new HashMap();
                map.put("error", String.valueOf(sdw0Var.mo183573a()));
                m211036e("onLMDOverlayFailedToOpen", map);
                break;
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m211041j(@Nullable q9t0 q9t0Var, @Nullable qdw0 qdw0Var) {
        if (q9t0Var == null) {
            m211037f("adWebview missing", "onLMDShow");
            return;
        }
        this.f194453c = q9t0Var;
        if (!this.f194455e && !m211042k(q9t0Var.getContext())) {
            m211037f("LMDOverlay not bound", "on_play_store_bind");
            return;
        }
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132059Ra)).booleanValue()) {
            this.f194452b = qdw0Var.mo174129g();
        }
        m211044m();
        gdw0 gdw0Var = this.f194454d;
        if (gdw0Var != null) {
            gdw0Var.mo125598c(qdw0Var, this.f194456f);
        }
    }

    /* JADX INFO: renamed from: k */
    public final synchronized boolean m211042k(Context context) {
        if (!oew0.m164034a(context)) {
            return false;
        }
        try {
            this.f194454d = hdw0.m130615a(context);
        } catch (NullPointerException e) {
            xsu0.m210834k("Error connecting LMD Overlay service");
            vny0.m199079q().m212290w(e, "LastMileDeliveryOverlay.bindLastMileDeliveryService");
        }
        if (this.f194454d == null) {
            this.f194455e = false;
            return false;
        }
        m211044m();
        this.f194455e = true;
        return true;
    }

    /* JADX INFO: renamed from: l */
    public final vdw0 m211043l() {
        udw0 udw0VarM198104c = vdw0.m198104c();
        if (!((Boolean) d1s0.m109677c().m144697a(m7s0.f132059Ra)).booleanValue() || TextUtils.isEmpty(this.f194452b)) {
            String str = this.f194451a;
            if (str != null) {
                udw0VarM198104c.mo193166b(str);
            } else {
                m211037f("Missing session token and/or appId", "onLMDupdate");
            }
        } else {
            udw0VarM198104c.mo193165a(this.f194452b);
        }
        return udw0VarM198104c.mo193167c();
    }

    /* JADX INFO: renamed from: m */
    public final void m211044m() {
        if (this.f194456f == null) {
            this.f194456f = new rsy0(this);
        }
    }
}
