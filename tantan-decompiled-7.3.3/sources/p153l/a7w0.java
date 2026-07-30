package p153l;

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
public final class a7w0 {

    /* JADX INFO: renamed from: a */
    public final List f68853a;

    /* JADX INFO: renamed from: b */
    public final t6w0 f68854b;

    /* JADX INFO: renamed from: c */
    public final List f68855c;

    public a7w0(JsonReader jsonReader) throws IllegalStateException, JSONException, IOException, NumberFormatException, AssertionError {
        List arrayList = Collections.EMPTY_LIST;
        ArrayList arrayList2 = new ArrayList();
        jsonReader.beginObject();
        t6w0 t6w0Var = null;
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
                            arrayList.add(new q6w0(jsonReader));
                        }
                        jsonReader.endArray();
                    } else if (strNextName2.equals("common")) {
                        t6w0Var = new t6w0(jsonReader);
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
                    JSONObject jSONObjectM198936h = null;
                    while (jsonReader.hasNext()) {
                        String strNextName3 = jsonReader.nextName();
                        if (AuthenticationTokenClaims.JSON_KEY_NAME.equals(strNextName3)) {
                            strNextString = jsonReader.nextString();
                        } else if (BaseSei.INFO.equals(strNextName3)) {
                            jSONObjectM198936h = v0t0.m198936h(jsonReader);
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    if (strNextString != null) {
                        arrayList2.add(new z6w0(strNextString, jSONObjectM198936h));
                    }
                    jsonReader.endObject();
                }
                jsonReader.endArray();
            }
        }
        this.f68855c = arrayList2;
        this.f68853a = arrayList;
        this.f68854b = t6w0Var == null ? new t6w0(new JsonReader(new StringReader(WeJson.EMPTY_MAP))) : t6w0Var;
    }

    /* JADX INFO: renamed from: a */
    public static a7w0 m96387a(Reader reader) throws zzfgq {
        try {
            try {
                a7w0 a7w0Var = new a7w0(new JsonReader(reader));
                IOUtils.closeQuietly(reader);
                return a7w0Var;
            } catch (Throwable th) {
                IOUtils.closeQuietly(reader);
                throw th;
            }
        } catch (IOException | AssertionError | IllegalStateException | NumberFormatException | JSONException e) {
            throw new zzfgq("unable to parse ServerResponse", e);
        }
    }
}
