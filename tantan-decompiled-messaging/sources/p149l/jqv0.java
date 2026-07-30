package p149l;

import android.os.Bundle;
import com.p046p1.mobile.putong.data.Device;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class jqv0 implements plv0 {

    /* JADX INFO: renamed from: a */
    public final Bundle f119326a;

    public jqv0(Bundle bundle) {
        this.f119326a = bundle;
    }

    @Override // p149l.plv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo96132a(Object obj) {
        JSONObject jSONObject = (JSONObject) obj;
        if (this.f119326a != null) {
            try {
                prs0.m171065f(prs0.m171065f(jSONObject, Device.TYPE), "play_store").put("parental_controls", exr0.m118703b().m134102j(this.f119326a));
            } catch (JSONException unused) {
                xsu0.m210834k("Failed putting parental controls bundle.");
            }
        }
    }
}
