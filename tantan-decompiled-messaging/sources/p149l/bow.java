package p149l;

import android.text.TextUtils;
import com.immomo.mwc.sdk.EventType;
import com.immomo.mwc.sdk.MWCEngine;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class bow {

    /* JADX INFO: renamed from: a */
    public String f76568a;

    /* JADX INFO: renamed from: b */
    public String f76569b;

    /* JADX INFO: renamed from: c */
    public String f76570c;

    /* JADX INFO: renamed from: d */
    private boolean f76571d = false;

    /* JADX INFO: renamed from: l.bow$a */
    public class C15920a implements a84 {
        public C15920a() {
        }

        @Override // p149l.a84
        /* JADX INFO: renamed from: a */
        public void mo95332a(z74 z74Var, Object obj) {
            if (z74Var == null || z74Var.f201987a == 1002) {
                return;
            }
            bow bowVar = bow.this;
            MWCEngine.m19382m("MWCHolder", bowVar.f76568a, "release:trigger:callback:error @url=%s, @error=%s", bowVar.f76570c, z74Var);
        }
    }

    public bow(String str, String str2, String str3) {
        this.f76568a = str2;
        this.f76569b = str;
        this.f76570c = str3;
        MWCEngine.m19380k("MWCHolder", str2, "MWCHolder:created @serviceId=%s, @workerId=%s, @url=%s, @hashCode=%s, @ts=%d", str, str2, str3, Integer.valueOf(hashCode()), Long.valueOf(iow.m137389a()));
    }

    /* JADX INFO: renamed from: a */
    public void m102991a() {
        if (this.f76571d || TextUtils.isEmpty(this.f76568a)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("url", this.f76570c);
            MWCEngine.m19386q().mo19397b(EventType.MK_DESTROY, this.f76568a, jSONObject, new C15920a());
            MWCEngine.m19378i(this.f76568a);
            this.f76571d = true;
        } catch (Throwable th) {
            MWCEngine.m19382m("MWCHolder", this.f76568a, "holder release exception @error=%s", th);
        }
    }

    public void finalize() throws Throwable {
        m102991a();
        MWCEngine.m19380k("MWCHolder", this.f76568a, "holder finalize success @hashCode=%s", Integer.valueOf(hashCode()));
        super.finalize();
    }
}
