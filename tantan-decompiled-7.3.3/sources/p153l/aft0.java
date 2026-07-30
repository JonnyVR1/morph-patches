package p153l;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class aft0 {

    /* JADX INFO: renamed from: a */
    public final boolean f71052a;

    /* JADX INFO: renamed from: b */
    public final int f71053b;

    /* JADX INFO: renamed from: c */
    public final int f71054c;

    /* JADX INFO: renamed from: d */
    public final int f71055d;

    /* JADX INFO: renamed from: e */
    public final String f71056e;

    /* JADX INFO: renamed from: f */
    public final int f71057f;

    /* JADX INFO: renamed from: g */
    public final int f71058g;

    /* JADX INFO: renamed from: h */
    public final int f71059h;

    /* JADX INFO: renamed from: i */
    public final int f71060i;

    /* JADX INFO: renamed from: j */
    public final boolean f71061j;

    /* JADX INFO: renamed from: k */
    public final boolean f71062k;

    /* JADX INFO: renamed from: l */
    public final boolean f71063l;

    /* JADX INFO: renamed from: m */
    public final boolean f71064m;

    /* JADX INFO: renamed from: n */
    public final long f71065n;

    /* JADX INFO: renamed from: o */
    public final long f71066o;

    public aft0(String str) {
        String string;
        JSONObject jSONObject = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        this.f71052a = m97549a(jSONObject, "aggressive_media_codec_release", sgs0.f168023J);
        this.f71053b = m97550b(jSONObject, "byte_buffer_precache_limit", sgs0.f168370l);
        this.f71054c = m97550b(jSONObject, "exo_cache_buffer_size", sgs0.f168509w);
        this.f71055d = m97550b(jSONObject, "exo_connect_timeout_millis", sgs0.f168318h);
        dgs0 dgs0Var = sgs0.f168305g;
        if (jSONObject != null) {
            try {
                string = jSONObject.getString("exo_player_version");
            } catch (JSONException unused2) {
                string = (String) jas0.m144075c().m176505a(dgs0Var);
            }
        } else {
            string = (String) jas0.m144075c().m176505a(dgs0Var);
        }
        this.f71056e = string;
        this.f71057f = m97550b(jSONObject, "exo_read_timeout_millis", sgs0.f168331i);
        this.f71058g = m97550b(jSONObject, "load_check_interval_bytes", sgs0.f168344j);
        this.f71059h = m97550b(jSONObject, "player_precache_limit", sgs0.f168357k);
        this.f71060i = m97550b(jSONObject, "socket_receive_buffer_size", sgs0.f168383m);
        this.f71061j = m97549a(jSONObject, "use_cache_data_source", sgs0.f168336i4);
        m97550b(jSONObject, "min_retry_count", sgs0.f168396n);
        this.f71062k = m97549a(jSONObject, "treat_load_exception_as_non_fatal", sgs0.f168435q);
        this.f71063l = m97549a(jSONObject, "enable_multiple_video_playback", sgs0.f168121R1);
        this.f71064m = m97549a(jSONObject, "use_range_http_data_source", sgs0.f168145T1);
        this.f71065n = m97551c(jSONObject, "range_http_data_source_high_water_mark", sgs0.f168157U1);
        this.f71066o = m97551c(jSONObject, "range_http_data_source_low_water_mark", sgs0.f168169V1);
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m97549a(JSONObject jSONObject, String str, dgs0 dgs0Var) {
        boolean zBooleanValue = ((Boolean) jas0.m144075c().m176505a(dgs0Var)).booleanValue();
        if (jSONObject != null) {
            try {
                return jSONObject.getBoolean(str);
            } catch (JSONException unused) {
            }
        }
        return zBooleanValue;
    }

    /* JADX INFO: renamed from: b */
    public static final int m97550b(JSONObject jSONObject, String str, dgs0 dgs0Var) {
        if (jSONObject != null) {
            try {
                return jSONObject.getInt(str);
            } catch (JSONException unused) {
            }
        }
        return ((Integer) jas0.m144075c().m176505a(dgs0Var)).intValue();
    }

    /* JADX INFO: renamed from: c */
    public static final long m97551c(JSONObject jSONObject, String str, dgs0 dgs0Var) {
        if (jSONObject != null) {
            try {
                return jSONObject.getLong(str);
            } catch (JSONException unused) {
            }
        }
        return ((Long) jas0.m144075c().m176505a(dgs0Var)).longValue();
    }
}
