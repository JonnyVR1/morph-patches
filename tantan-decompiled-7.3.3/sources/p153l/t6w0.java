package p153l;

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
public final class t6w0 {

    /* JADX INFO: renamed from: a */
    public final List f172367a;

    /* JADX INFO: renamed from: b */
    public final String f172368b;

    /* JADX INFO: renamed from: c */
    public final int f172369c;

    /* JADX INFO: renamed from: d */
    public final String f172370d;

    /* JADX INFO: renamed from: e */
    public final int f172371e;

    /* JADX INFO: renamed from: f */
    public final long f172372f;

    /* JADX INFO: renamed from: g */
    public final boolean f172373g;

    /* JADX INFO: renamed from: h */
    public final String f172374h;

    /* JADX INFO: renamed from: i */
    @Nullable
    public final s6w0 f172375i;

    /* JADX INFO: renamed from: j */
    public final Bundle f172376j;

    /* JADX INFO: renamed from: k */
    public final String f172377k;

    /* JADX INFO: renamed from: l */
    public final String f172378l;

    /* JADX INFO: renamed from: m */
    public final String f172379m;

    /* JADX INFO: renamed from: n */
    public final JSONObject f172380n;

    /* JADX INFO: renamed from: o */
    public final String f172381o;

    /* JADX INFO: renamed from: p */
    public final int f172382p;

    public t6w0(JsonReader jsonReader) throws IllegalStateException, JSONException, IOException, NumberFormatException {
        List listM198932d = Collections.EMPTY_LIST;
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
        s6w0 s6w0Var = null;
        long jNextLong = 0;
        int iMax = 1;
        String strNextString6 = strNextString5;
        String strNextString7 = strNextString6;
        while (jsonReader.hasNext()) {
            String strNextName = jsonReader.nextName();
            String str = strNextString5;
            if ("nofill_urls".equals(strNextName)) {
                listM198932d = v0t0.m198932d(jsonReader);
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
                if (((Boolean) jas0.m144075c().m176505a(sgs0.f168314g8)).booleanValue() && "public_error".equals(strNextName) && jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
                    s6w0Var = new s6w0(jsonReader);
                } else if ("bidding_data".equals(strNextName)) {
                    strNextString7 = jsonReader.nextString();
                } else {
                    if (((Boolean) jas0.m144075c().m176505a(sgs0.f168165U9)).booleanValue() && Objects.equals(strNextName, "topics_should_record_observation")) {
                        jsonReader.nextBoolean();
                    } else {
                        if ("adapter_response_replacement_key".equals(strNextName)) {
                            strNextString5 = jsonReader.nextString();
                        } else if ("response_info_extras".equals(strNextName)) {
                            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168114Q6)).booleanValue()) {
                                try {
                                    Bundle bundleM198929a = v0t0.m198929a(v0t0.m198936h(jsonReader));
                                    if (bundleM198929a != null) {
                                        bundle = bundleM198929a;
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
                            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168315g9)).booleanValue()) {
                                strNextString3 = jsonReader.nextString();
                            } else {
                                jsonReader.skipValue();
                            }
                        } else if ("adRequestUrl".equals(strNextName)) {
                            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168315g9)).booleanValue()) {
                                strNextString2 = jsonReader.nextString();
                            } else {
                                jsonReader.skipValue();
                            }
                        } else {
                            dgs0 dgs0Var = sgs0.f168328h9;
                            if (((Boolean) jas0.m144075c().m176505a(dgs0Var)).booleanValue() && Objects.equals(strNextName, "adResponseBody")) {
                                strNextString4 = jsonReader.nextString();
                            } else if (((Boolean) jas0.m144075c().m176505a(dgs0Var)).booleanValue() && Objects.equals(strNextName, "adResponseHeaders")) {
                                jSONObject = v0t0.m198936h(jsonReader);
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
        this.f172367a = listM198932d;
        this.f172369c = iNextInt;
        this.f172368b = strNextString;
        this.f172370d = strNextString6;
        this.f172371e = iNextInt2;
        this.f172372f = jNextLong;
        this.f172375i = s6w0Var;
        this.f172373g = zNextBoolean;
        this.f172374h = strNextString7;
        this.f172376j = bundle;
        this.f172377k = strNextString2;
        this.f172378l = strNextString3;
        this.f172379m = strNextString4;
        this.f172380n = jSONObject;
        this.f172381o = strNextString5;
        kis0 kis0Var = mjs0.f137160a;
        this.f172382p = ((Long) kis0Var.m149974e()).longValue() > 0 ? ((Long) kis0Var.m149974e()).intValue() : iMax;
    }
}
