package p153l;

import android.text.TextUtils;
import com.immomo.mwc.sdk.EventType;
import com.immomo.mwc.sdk.MWCEngine;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class arw {

    /* JADX INFO: renamed from: a */
    public String f72991a;

    /* JADX INFO: renamed from: b */
    public String f72992b;

    /* JADX INFO: renamed from: c */
    public String f72993c;

    /* JADX INFO: renamed from: d */
    private boolean f72994d = false;

    /* JADX INFO: renamed from: l.arw$a */
    public class C15810a implements z84 {
        public C15810a() {
        }

        @Override // p153l.z84
        /* JADX INFO: renamed from: a */
        public void mo99785a(y84 y84Var, Object obj) {
            if (y84Var == null || y84Var.f197939a == 1002) {
                return;
            }
            arw arwVar = arw.this;
            MWCEngine.m20362m("MWCHolder", arwVar.f72991a, "release:trigger:callback:error @url=%s, @error=%s", arwVar.f72993c, y84Var);
        }
    }

    public arw(String str, String str2, String str3) {
        this.f72991a = str2;
        this.f72992b = str;
        this.f72993c = str3;
        MWCEngine.m20360k("MWCHolder", str2, "MWCHolder:created @serviceId=%s, @workerId=%s, @url=%s, @hashCode=%s, @ts=%d", str, str2, str3, Integer.valueOf(hashCode()), Long.valueOf(hrw.m136930a()));
    }

    /* JADX INFO: renamed from: a */
    public void m99784a() {
        if (this.f72994d || TextUtils.isEmpty(this.f72991a)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("url", this.f72993c);
            MWCEngine.m20366q().mo20377b(EventType.MK_DESTROY, this.f72991a, jSONObject, new C15810a());
            MWCEngine.m20358i(this.f72991a);
            this.f72994d = true;
        } catch (Throwable th) {
            MWCEngine.m20362m("MWCHolder", this.f72991a, "holder release exception @error=%s", th);
        }
    }

    public void finalize() throws Throwable {
        m99784a();
        MWCEngine.m20360k("MWCHolder", this.f72991a, "holder finalize success @hashCode=%s", Integer.valueOf(hashCode()));
        super.finalize();
    }
}
