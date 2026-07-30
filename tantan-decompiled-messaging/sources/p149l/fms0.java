package p149l;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.charset.Charset;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class fms0 {

    /* JADX INFO: renamed from: a */
    public static final Charset f98369a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: b */
    public static final cms0 f98370b = new ems0();

    /* JADX INFO: renamed from: c */
    public static final ams0 f98371c = new ams0() { // from class: l.dms0
        @Override // p149l.ams0
        /* JADX INFO: renamed from: a */
        public final Object mo97686a(JSONObject jSONObject) {
            return fms0.m122252a(jSONObject);
        }
    };

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ InputStream m122252a(JSONObject jSONObject) throws JSONException {
        return new ByteArrayInputStream(jSONObject.toString().getBytes(f98369a));
    }
}
