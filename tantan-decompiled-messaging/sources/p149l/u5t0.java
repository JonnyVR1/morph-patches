package p149l;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class u5t0 {

    /* JADX INFO: renamed from: a */
    public final boolean f174757a;

    /* JADX INFO: renamed from: b */
    public final int f174758b;

    /* JADX INFO: renamed from: c */
    public final int f174759c;

    /* JADX INFO: renamed from: d */
    public final int f174760d;

    /* JADX INFO: renamed from: e */
    public final String f174761e;

    /* JADX INFO: renamed from: f */
    public final int f174762f;

    /* JADX INFO: renamed from: g */
    public final int f174763g;

    /* JADX INFO: renamed from: h */
    public final int f174764h;

    /* JADX INFO: renamed from: i */
    public final int f174765i;

    /* JADX INFO: renamed from: j */
    public final boolean f174766j;

    /* JADX INFO: renamed from: k */
    public final boolean f174767k;

    /* JADX INFO: renamed from: l */
    public final boolean f174768l;

    /* JADX INFO: renamed from: m */
    public final boolean f174769m;

    /* JADX INFO: renamed from: n */
    public final long f174770n;

    /* JADX INFO: renamed from: o */
    public final long f174771o;

    public u5t0(String str) {
        String string;
        JSONObject jSONObject = null;
        if (str != null) {
            try {
                jSONObject = new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        this.f174757a = m191879a(jSONObject, "aggressive_media_codec_release", m7s0.f131952J);
        this.f174758b = m191880b(jSONObject, "byte_buffer_precache_limit", m7s0.f132299l);
        this.f174759c = m191880b(jSONObject, "exo_cache_buffer_size", m7s0.f132438w);
        this.f174760d = m191880b(jSONObject, "exo_connect_timeout_millis", m7s0.f132247h);
        x6s0 x6s0Var = m7s0.f132234g;
        if (jSONObject != null) {
            try {
                string = jSONObject.getString("exo_player_version");
            } catch (JSONException unused2) {
                string = (String) d1s0.m109677c().m144697a(x6s0Var);
            }
        } else {
            string = (String) d1s0.m109677c().m144697a(x6s0Var);
        }
        this.f174761e = string;
        this.f174762f = m191880b(jSONObject, "exo_read_timeout_millis", m7s0.f132260i);
        this.f174763g = m191880b(jSONObject, "load_check_interval_bytes", m7s0.f132273j);
        this.f174764h = m191880b(jSONObject, "player_precache_limit", m7s0.f132286k);
        this.f174765i = m191880b(jSONObject, "socket_receive_buffer_size", m7s0.f132312m);
        this.f174766j = m191879a(jSONObject, "use_cache_data_source", m7s0.f132265i4);
        m191880b(jSONObject, "min_retry_count", m7s0.f132325n);
        this.f174767k = m191879a(jSONObject, "treat_load_exception_as_non_fatal", m7s0.f132364q);
        this.f174768l = m191879a(jSONObject, "enable_multiple_video_playback", m7s0.f132050R1);
        this.f174769m = m191879a(jSONObject, "use_range_http_data_source", m7s0.f132074T1);
        this.f174770n = m191881c(jSONObject, "range_http_data_source_high_water_mark", m7s0.f132086U1);
        this.f174771o = m191881c(jSONObject, "range_http_data_source_low_water_mark", m7s0.f132098V1);
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m191879a(JSONObject jSONObject, String str, x6s0 x6s0Var) {
        boolean zBooleanValue = ((Boolean) d1s0.m109677c().m144697a(x6s0Var)).booleanValue();
        if (jSONObject != null) {
            try {
                return jSONObject.getBoolean(str);
            } catch (JSONException unused) {
            }
        }
        return zBooleanValue;
    }

    /* JADX INFO: renamed from: b */
    public static final int m191880b(JSONObject jSONObject, String str, x6s0 x6s0Var) {
        if (jSONObject != null) {
            try {
                return jSONObject.getInt(str);
            } catch (JSONException unused) {
            }
        }
        return ((Integer) d1s0.m109677c().m144697a(x6s0Var)).intValue();
    }

    /* JADX INFO: renamed from: c */
    public static final long m191881c(JSONObject jSONObject, String str, x6s0 x6s0Var) {
        if (jSONObject != null) {
            try {
                return jSONObject.getLong(str);
            } catch (JSONException unused) {
            }
        }
        return ((Long) d1s0.m109677c().m144697a(x6s0Var)).longValue();
    }
}
