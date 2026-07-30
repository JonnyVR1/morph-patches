package p149l;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class krv0 implements plv0 {

    /* JADX INFO: renamed from: a */
    public final Map f124399a;

    public krv0(Map map) {
        this.f124399a = map;
    }

    @Override // p149l.plv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo96132a(Object obj) {
        try {
            ((JSONObject) obj).put("video_decoders", exr0.m118703b().m134103k(this.f124399a));
        } catch (JSONException e) {
            xsu0.m210834k("Could not encode video decoder properties: ".concat(String.valueOf(e.getMessage())));
        }
    }
}
