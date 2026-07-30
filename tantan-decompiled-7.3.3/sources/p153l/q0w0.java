package p153l;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class q0w0 implements vuv0 {

    /* JADX INFO: renamed from: a */
    public final Map f155118a;

    public q0w0(Map map) {
        this.f155118a = map;
    }

    @Override // p153l.vuv0
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ void mo99378a(Object obj) {
        try {
            ((JSONObject) obj).put("video_decoders", k6s0.m148569b().m167056k(this.f155118a));
        } catch (JSONException e) {
            d2v0.m113737k("Could not encode video decoder properties: ".concat(String.valueOf(e.getMessage())));
        }
    }
}
