package p153l;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class lvs0 {

    /* JADX INFO: renamed from: a */
    public static final Charset f133728a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: b */
    public static final ivs0 f133729b = new kvs0();

    /* JADX INFO: renamed from: c */
    public static final gvs0 f133730c = new gvs0() { // from class: l.jvs0
        @Override // p153l.gvs0
        /* JADX INFO: renamed from: a */
        public final Object mo124251a(JSONObject jSONObject) {
            return lvs0.m156006a(jSONObject);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ InputStream m156006a(JSONObject jSONObject) throws JSONException {
        return new ByteArrayInputStream(jSONObject.toString().getBytes(f133728a));
    }
}
