package p153l;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class fis0 {

    /* JADX INFO: renamed from: a */
    public final ScheduledExecutorService f99236a;

    /* JADX INFO: renamed from: b */
    public Runnable f99237b;

    /* JADX INFO: renamed from: c */
    public cis0 f99238c;

    /* JADX INFO: renamed from: d */
    public yzb f99239d;

    /* JADX INFO: renamed from: e */
    public String f99240e;

    /* JADX INFO: renamed from: f */
    public long f99241f = 0;

    /* JADX INFO: renamed from: g */
    public long f99242g;

    /* JADX INFO: renamed from: h */
    public JSONArray f99243h;

    /* JADX INFO: renamed from: i */
    public Context f99244i;

    @VisibleForTesting
    public fis0(ScheduledExecutorService scheduledExecutorService) {
        this.f99236a = scheduledExecutorService;
    }

    /* JADX INFO: renamed from: b */
    public final yzb m125716b() {
        return this.f99239d;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: c */
    public final JSONObject m125717c(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("error", str2);
        m125724k(jSONObject);
        return jSONObject;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: d */
    public final JSONObject m125718d(String str, String str2) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("paw_id", str);
        jSONObject.put("signal", str2);
        m125724k(jSONObject);
        return jSONObject;
    }

    /* JADX INFO: renamed from: f */
    public final void m125719f() {
        this.f99241f = bxy0.m106918b().elapsedRealtime() + ((long) ((Integer) jas0.m144075c().m176505a(sgs0.f167925A9)).intValue());
        if (this.f99237b == null) {
            this.f99237b = new Runnable() { // from class: l.dis0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f88707a.m125723j();
                }
            };
        }
        m125723j();
    }

    /* JADX INFO: renamed from: g */
    public final void m125720g(Context context, uzb uzbVar, String str, tzb tzbVar) {
        if (context == null) {
            wg3.m206174a("App Context parameter is null");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            wg3.m206174a("Origin parameter is empty or null");
            return;
        }
        if (uzbVar == null) {
            wg3.m206174a("CustomTabsClient parameter is null");
            return;
        }
        this.f99244i = context;
        this.f99240e = str;
        cis0 cis0Var = new cis0(this, tzbVar);
        this.f99238c = cis0Var;
        yzb yzbVarM198722d = uzbVar.m198722d(cis0Var);
        this.f99239d = yzbVarM198722d;
        if (yzbVarM198722d == null) {
            dct0.m115295d("CustomTabsClient failed to create new session.");
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m125721h(String str) {
        try {
            yzb yzbVar = this.f99239d;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("gsppack", true);
            jSONObject.put("fpt", new Date(this.f99242g).toString());
            m125724k(jSONObject);
            yzbVar.m218018g(jSONObject.toString(), null);
            Bundle bundle = new Bundle();
            bundle.putString("query_info_type", "requester_type_6");
            xvb0.m213213a(this.f99244i, AdFormat.BANNER, new s70.C19999a().m179961b(AdMobAdapter.class, bundle).m184941i(), new eis0(this, str));
        } catch (JSONException e) {
            dct0.m115296e("Error creating JSON: ", e);
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m125722i(long j) {
        this.f99242g = j;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0049, code lost:
    
        if (((java.lang.Boolean) p153l.jas0.m144075c().m176505a(p153l.sgs0.f167937B9)).booleanValue() != false) goto L23;
     */
    /* JADX INFO: renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m125723j() {
        cis0 cis0Var = this.f99238c;
        if (cis0Var == null) {
            dct0.m115295d("PACT callback is not present, please initialize the PawCustomTabsImpl.");
            return;
        }
        if (cis0Var.m109947g().booleanValue()) {
            return;
        }
        if (this.f99240e != null && this.f99239d != null && this.f99236a != null) {
            if (this.f99241f == 0 || bxy0.m106918b().elapsedRealtime() > this.f99241f) {
            }
            this.f99239d.m218019h(Uri.parse(this.f99240e));
            this.f99236a.schedule(this.f99237b, ((Long) jas0.m144075c().m176505a(sgs0.f167949C9)).longValue(), TimeUnit.MILLISECONDS);
            return;
        }
        d2v0.m113737k("PACT max retry connection duration timed out");
    }

    /* JADX INFO: renamed from: k */
    public final void m125724k(JSONObject jSONObject) {
        try {
            if (this.f99243h == null) {
                this.f99243h = new JSONArray((String) jas0.m144075c().m176505a(sgs0.f167973E9));
            }
            jSONObject.put("eids", this.f99243h);
        } catch (JSONException e) {
            dct0.m115296e("Error fetching the PACT active eids JSON: ", e);
        }
    }
}
