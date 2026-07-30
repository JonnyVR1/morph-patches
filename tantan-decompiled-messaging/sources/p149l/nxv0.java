package p149l;

import android.os.Bundle;
import android.util.JsonReader;
import android.util.JsonToken;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class nxv0 {

    /* JADX INFO: renamed from: a */
    public final List f141054a;

    /* JADX INFO: renamed from: b */
    public final String f141055b;

    /* JADX INFO: renamed from: c */
    public final int f141056c;

    /* JADX INFO: renamed from: d */
    public final String f141057d;

    /* JADX INFO: renamed from: e */
    public final int f141058e;

    /* JADX INFO: renamed from: f */
    public final long f141059f;

    /* JADX INFO: renamed from: g */
    public final boolean f141060g;

    /* JADX INFO: renamed from: h */
    public final String f141061h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public final mxv0 f141062i;

    /* JADX INFO: renamed from: j */
    public final Bundle f141063j;

    /* JADX INFO: renamed from: k */
    public final String f141064k;

    /* JADX INFO: renamed from: l */
    public final String f141065l;

    /* JADX INFO: renamed from: m */
    public final String f141066m;

    /* JADX INFO: renamed from: n */
    public final JSONObject f141067n;

    /* JADX INFO: renamed from: o */
    public final String f141068o;

    /* JADX INFO: renamed from: p */
    public final int f141069p;

    public nxv0(JsonReader jsonReader) throws IllegalStateException, JSONException, IOException, NumberFormatException {
        List listM171063d = Collections.EMPTY_LIST;
        Bundle bundle = new Bundle();
        JSONObject jSONObject = new JSONObject();
        jsonReader.beginObject();
        String strNextString = "";
        String strNextString2 = "";
        String strNextString3 = strNextString2;
        String strNextString4 = strNextString3;
        String strNextString5 = strNextString4;
        boolean zNextBoolean = false;
        int iNextInt = 0;
        int iNextInt2 = 0;
        mxv0 mxv0Var = null;
        long jNextLong = 0;
        int iMax = 1;
        String strNextString6 = strNextString5;
        String strNextString7 = strNextString6;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            String str = strNextString5;
            if ("nofill_urls".equals(strNextName)) {
                listM171063d = prs0.m171063d(jsonReader);
            } else if ("refresh_interval".equals(strNextName)) {
                iNextInt = jsonReader.nextInt();
            } else if ("gws_query_id".equals(strNextName)) {
                strNextString = jsonReader.nextString();
            } else if ("analytics_query_ad_event_id".equals(strNextName)) {
                strNextString6 = jsonReader.nextString();
            } else if ("is_idless".equals(strNextName)) {
                zNextBoolean = jsonReader.nextBoolean();
            } else if ("response_code".equals(strNextName)) {
                iNextInt2 = jsonReader.nextInt();
            } else if ("latency".equals(strNextName)) {
                jNextLong = jsonReader.nextLong();
            } else {
                JSONObject jSONObject2 = jSONObject;
                if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132243g8)).booleanValue() && "public_error".equals(strNextName) && jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                    mxv0Var = new mxv0(jsonReader);
                } else if ("bidding_data".equals(strNextName)) {
                    strNextString7 = jsonReader.nextString();
                } else {
                    if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132094U9)).booleanValue() && Objects.equals(strNextName, "topics_should_record_observation")) {
                        jsonReader.nextBoolean();
                    } else {
                        if ("adapter_response_replacement_key".equals(strNextName)) {
                            strNextString5 = jsonReader.nextString();
                        } else if ("response_info_extras".equals(strNextName)) {
                            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132043Q6)).booleanValue()) {
                                try {
                                    Bundle bundleM171060a = prs0.m171060a(prs0.m171067h(jsonReader));
                                    if (bundleM171060a != null) {
                                        bundle = bundleM171060a;
                                    }
                                } catch (IOException | JSONException unused) {
                                    strNextString5 = str;
                                    jSONObject = jSONObject2;
                                } catch (IllegalStateException unused2) {
                                    jsonReader.skipValue();
                                    strNextString5 = str;
                                    jSONObject = jSONObject2;
                                }
                            } else {
                                jsonReader.skipValue();
                            }
                        } else if ("adRequestPostBody".equals(strNextName)) {
                            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132244g9)).booleanValue()) {
                                strNextString3 = jsonReader.nextString();
                            } else {
                                jsonReader.skipValue();
                            }
                        } else if ("adRequestUrl".equals(strNextName)) {
                            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132244g9)).booleanValue()) {
                                strNextString2 = jsonReader.nextString();
                            } else {
                                jsonReader.skipValue();
                            }
                        } else {
                            x6s0 x6s0Var = m7s0.f132257h9;
                            if (((Boolean) d1s0.m109677c().m144697a(x6s0Var)).booleanValue() && Objects.equals(strNextName, "adResponseBody")) {
                                strNextString4 = jsonReader.nextString();
                            } else if (((Boolean) d1s0.m109677c().m144697a(x6s0Var)).booleanValue() && Objects.equals(strNextName, "adResponseHeaders")) {
                                jSONObject = prs0.m171067h(jsonReader);
                            } else {
                                if (Objects.equals(strNextName, "max_parallel_renderers")) {
                                    iMax = Math.max(1, jsonReader.nextInt());
                                } else {
                                    jsonReader.skipValue();
                                }
                                strNextString5 = str;
                                jSONObject = jSONObject2;
                            }
                        }
                        jSONObject = jSONObject2;
                    }
                    strNextString5 = str;
                    jSONObject = jSONObject2;
                }
                strNextString5 = str;
                jSONObject = jSONObject2;
            }
            strNextString5 = str;
        }
        jsonReader.endObject();
        this.f141054a = listM171063d;
        this.f141056c = iNextInt;
        this.f141055b = strNextString;
        this.f141057d = strNextString6;
        this.f141058e = iNextInt2;
        this.f141059f = jNextLong;
        this.f141062i = mxv0Var;
        this.f141060g = zNextBoolean;
        this.f141061h = strNextString7;
        this.f141063j = bundle;
        this.f141064k = strNextString2;
        this.f141065l = strNextString3;
        this.f141066m = strNextString4;
        this.f141067n = jSONObject;
        this.f141068o = strNextString5;
        e9s0 e9s0Var = gas0.f101702a;
        this.f141069p = ((Long) e9s0Var.m115379e()).longValue() > 0 ? ((Long) e9s0Var.m115379e()).intValue() : iMax;
    }
}
