package p149l;

import android.util.JsonReader;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.google.android.gms.common.util.IOUtils;
import com.google.android.gms.internal.ads.zzfgq;
import com.immomo.momomediaext.sei.BaseSei;
import com.tencent.youtu.sdkkitframework.common.WeJson;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class uxv0 {

    /* JADX INFO: renamed from: a */
    public final List f178772a;

    /* JADX INFO: renamed from: b */
    public final nxv0 f178773b;

    /* JADX INFO: renamed from: c */
    public final List f178774c;

    public uxv0(JsonReader jsonReader) throws IllegalStateException, JSONException, IOException, NumberFormatException, AssertionError {
        List arrayList = Collections.EMPTY_LIST;
        ArrayList arrayList2 = new ArrayList();
        jsonReader.beginObject();
        nxv0 nxv0Var = null;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            if ("responses".equals(strNextName)) {
                jsonReader.beginArray();
                jsonReader.beginObject();
                while (jsonReader.hasNext()) {
                    String strNextName2 = jsonReader.nextName();
                    if ("ad_configs".equals(strNextName2)) {
                        arrayList = new ArrayList();
                        jsonReader.beginArray();
                        while (jsonReader.hasNext()) {
                            arrayList.add(new kxv0(jsonReader));
                        }
                        jsonReader.endArray();
                    } else if (strNextName2.equals("common")) {
                        nxv0Var = new nxv0(jsonReader);
                    } else {
                        jsonReader.skipValue();
                    }
                }
                jsonReader.endObject();
                jsonReader.endArray();
            } else if (strNextName.equals(Constants.KEY_ACTIONS)) {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    jsonReader.beginObject();
                    String strNextString = null;
                    JSONObject jSONObjectM171067h = null;
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        if (AuthenticationTokenClaims.JSON_KEY_NAME.equals(strNextName3)) {
                            strNextString = jsonReader.nextString();
                        } else if (BaseSei.INFO.equals(strNextName3)) {
                            jSONObjectM171067h = prs0.m171067h(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    if (strNextString != null) {
                        arrayList2.add(new txv0(strNextString, jSONObjectM171067h));
                    }
                    jsonReader.endObject();
                }
                jsonReader.endArray();
            }
        }
        this.f178774c = arrayList2;
        this.f178772a = arrayList;
        this.f178773b = nxv0Var == null ? new nxv0(new JsonReader(new StringReader(WeJson.EMPTY_MAP))) : nxv0Var;
    }

    /* JADX INFO: renamed from: a */
    public static uxv0 m196212a(Reader reader) throws zzfgq {
        try {
            try {
                uxv0 uxv0Var = new uxv0(new JsonReader(reader));
                IOUtils.closeQuietly(reader);
                return uxv0Var;
            } catch (Throwable th) {
                IOUtils.closeQuietly(reader);
                throw th;
            }
        } catch (IOException | AssertionError | IllegalStateException | NumberFormatException | JSONException e) {
            throw new zzfgq("unable to parse ServerResponse", e);
        }
    }
}
