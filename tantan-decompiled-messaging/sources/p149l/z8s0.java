package p149l;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class z8s0 {

    /* JADX INFO: renamed from: a */
    public final ScheduledExecutorService f202201a;

    /* JADX INFO: renamed from: b */
    public Runnable f202202b;

    /* JADX INFO: renamed from: c */
    public w8s0 f202203c;

    /* JADX INFO: renamed from: d */
    public kyb f202204d;

    /* JADX INFO: renamed from: e */
    public String f202205e;

    /* JADX INFO: renamed from: f */
    public long f202206f = 0;

    /* JADX INFO: renamed from: g */
    public long f202207g;

    /* JADX INFO: renamed from: h */
    public JSONArray f202208h;

    /* JADX INFO: renamed from: i */
    public Context f202209i;

    @VisibleForTesting
    public z8s0(ScheduledExecutorService scheduledExecutorService) {
        this.f202201a = scheduledExecutorService;
    }

    /* JADX INFO: renamed from: b */
    public final kyb m217625b() {
        return this.f202204d;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: c */
    public final JSONObject m217626c(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("error", str2);
        m217633k(jSONObject);
        return jSONObject;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: d */
    public final JSONObject m217627d(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("signal", str2);
        m217633k(jSONObject);
        return jSONObject;
    }

    /* JADX INFO: renamed from: f */
    public final void m217628f() {
        this.f202206f = vny0.m199064b().elapsedRealtime() + ((long) ((Integer) d1s0.m109677c().m144697a(m7s0.f131854A9)).intValue());
        if (this.f202202b == null) {
            this.f202202b = new Runnable() { // from class: l.x8s0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f191544a.m217632j();
                }
            };
        }
        m217632j();
    }

    /* JADX INFO: renamed from: g */
    public final void m217629g(Context context, gyb gybVar, String str, fyb fybVar) {
        if (context == null) {
            ig3.m135964a("App Context parameter is null");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            ig3.m135964a("Origin parameter is empty or null");
            return;
        }
        if (gybVar == null) {
            ig3.m135964a("CustomTabsClient parameter is null");
            return;
        }
        this.f202209i = context;
        this.f202205e = str;
        w8s0 w8s0Var = new w8s0(this, fybVar);
        this.f202203c = w8s0Var;
        kyb kybVarM128690d = gybVar.m128690d(w8s0Var);
        this.f202204d = kybVarM128690d;
        if (kybVarM128690d == null) {
            x2t0.m206866d("CustomTabsClient failed to create new session.");
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m217630h(String str) {
        try {
            kyb kybVar = this.f202204d;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("gsppack", true);
            jSONObject.put("fpt", new Date(this.f202207g).toString());
            m217633k(jSONObject);
            kybVar.m147847g(jSONObject.toString(), null);
            Bundle bundle = new Bundle();
            bundle.putString("query_info_type", "requester_type_6");
            tnb0.m189769a(this.f202209i, AdFormat.BANNER, new w70.C20817a().m191883b(AdMobAdapter.class, bundle).m201999i(), new y8s0(this, str));
        } catch (JSONException e) {
            x2t0.m206867e("Error creating JSON: ", e);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m217631i(long j) {
        this.f202207g = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        if (((java.lang.Boolean) p149l.d1s0.m109677c().m144697a(p149l.m7s0.f131866B9)).booleanValue() != false) goto L23;
     */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m217632j() {
        /*
            r4 = this;
            l.w8s0 r0 = r4.f202203c
            if (r0 != 0) goto La
            java.lang.String r4 = "PACT callback is not present, please initialize the PawCustomTabsImpl."
            p149l.x2t0.m206866d(r4)
            return
        La:
            java.lang.Boolean r0 = r0.m202201g()
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L15
            return
        L15:
            java.lang.String r0 = r4.f202205e
            if (r0 == 0) goto L70
            l.kyb r0 = r4.f202204d
            if (r0 == 0) goto L70
            java.util.concurrent.ScheduledExecutorService r0 = r4.f202201a
            if (r0 == 0) goto L70
            long r0 = r4.f202206f
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L2a
            goto L39
        L2a:
            com.google.android.gms.common.util.Clock r0 = p149l.vny0.m199064b()
            long r0 = r0.elapsedRealtime()
            long r2 = r4.f202206f
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L39
            goto L4b
        L39:
            l.x6s0 r0 = p149l.m7s0.f131866B9
            l.k7s0 r1 = p149l.d1s0.m109677c()
            java.lang.Object r0 = r1.m144697a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L70
        L4b:
            l.kyb r0 = r4.f202204d
            java.lang.String r1 = r4.f202205e
            android.net.Uri r1 = android.net.Uri.parse(r1)
            r0.m147848h(r1)
            java.util.concurrent.ScheduledExecutorService r0 = r4.f202201a
            java.lang.Runnable r4 = r4.f202202b
            l.x6s0 r1 = p149l.m7s0.f131878C9
            l.k7s0 r2 = p149l.d1s0.m109677c()
            java.lang.Object r1 = r2.m144697a(r1)
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            r0.schedule(r4, r1, r3)
            return
        L70:
            java.lang.String r4 = "PACT max retry connection duration timed out"
            p149l.xsu0.m210834k(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p149l.z8s0.m217632j():void");
    }

    /* JADX INFO: renamed from: k */
    public final void m217633k(JSONObject jSONObject) {
        try {
            if (this.f202208h == null) {
                this.f202208h = new JSONArray((String) d1s0.m109677c().m144697a(m7s0.f131902E9));
            }
            jSONObject.put("eids", this.f202208h);
        } catch (JSONException e) {
            x2t0.m206867e("Error fetching the PACT active eids JSON: ", e);
        }
    }
}
