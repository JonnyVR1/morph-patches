package p149l;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.sqlite.CursorWrapper;
import com.google.android.gms.internal.measurement.AbstractC2349u0;
import com.google.android.gms.internal.measurement.C2308a0;
import com.google.android.gms.internal.measurement.C2310b;
import com.google.android.gms.internal.measurement.C2312c;
import com.google.android.gms.internal.measurement.C2313c0;
import com.google.android.gms.internal.measurement.C2314d;
import com.google.android.gms.internal.measurement.C2315d0;
import com.google.android.gms.internal.measurement.C2316e;
import com.google.android.gms.internal.measurement.C2319f0;
import com.google.android.gms.internal.measurement.C2356y;
import com.google.android.gms.internal.measurement.zzfy$zzj;
import com.google.android.gms.measurement.internal.C2453b;
import com.google.android.gms.measurement.internal.C2461j;
import com.google.android.gms.measurement.internal.zzae;
import com.google.android.gms.measurement.internal.zzbf;
import com.google.android.gms.measurement.internal.zzje;
import com.google.android.gms.measurement.internal.zzno;
import com.google.android.gms.measurement.internal.zznt;
import com.google.android.gms.measurement.internal.zzon;
import com.p046p1.mobile.putong.core.data.Active;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class igr0 extends hay0 {

    /* JADX INFO: renamed from: f */
    public static final String[] f113151f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* JADX INFO: renamed from: g */
    public static final String[] f113152g = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* JADX INFO: renamed from: h */
    public static final String[] f113153h = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;"};

    /* JADX INFO: renamed from: i */
    public static final String[] f113154i = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* JADX INFO: renamed from: j */
    public static final String[] f113155j = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* JADX INFO: renamed from: k */
    public static final String[] f113156k = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* JADX INFO: renamed from: l */
    public static final String[] f113157l = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* JADX INFO: renamed from: m */
    public static final String[] f113158m = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* JADX INFO: renamed from: n */
    public static final String[] f113159n = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};

    /* JADX INFO: renamed from: o */
    public static final String[] f113160o = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};

    /* JADX INFO: renamed from: d */
    public final vqr0 f113161d;

    /* JADX INFO: renamed from: e */
    public final r9y0 f113162e;

    public igr0(C2461j c2461j) {
        super(c2461j);
        this.f113162e = new r9y0(zzb());
        this.f113161d = new vqr0(this, zza(), "google_app_measurement.db");
    }

    @WorkerThread
    /* JADX INFO: renamed from: N */
    public static void m136084N(ContentValues contentValues, String str, Object obj) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(obj);
        if (obj instanceof String) {
            contentValues.put(str, (String) obj);
            return;
        }
        if (obj instanceof Long) {
            contentValues.put(str, (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put(str, (Double) obj);
        } else {
            ig3.m135964a("Invalid value type");
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0030  */
    @WorkerThread
    /* JADX INFO: renamed from: A */
    public final long m136095A(String str, String[] strArr, long j) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = m136166v().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return j;
                }
                long j2 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j2;
            } catch (SQLiteException e) {
                zzj().m211412A().m123938c("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        throw th;
    }

    /* JADX INFO: renamed from: A0 */
    public final boolean m136096A0(String str, List<Integer> list) {
        Preconditions.checkNotEmpty(str);
        m130251o();
        mo15092h();
        SQLiteDatabase sQLiteDatabaseM136166v = m136166v();
        try {
            long jM136169w0 = m136169w0("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int iMax = Math.max(0, Math.min(2000, mo15085a().m192651q(str, q8s0.f153232I)));
            if (jM136169w0 <= iMax) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < list.size(); i++) {
                Integer num = list.get(i);
                if (num == null) {
                    return false;
                }
                arrayList.add(Integer.toString(num.intValue()));
            }
            String str2 = "(" + TextUtils.join(Constants.SEPARATOR_COMMA, arrayList) + ")";
            StringBuilder sb = new StringBuilder("audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in ");
            sb.append(str2);
            sb.append(" order by rowid desc limit -1 offset ?)");
            return sQLiteDatabaseM136166v.delete("audience_filter_values", sb.toString(), new String[]{str, Integer.toString(iMax)}) > 0;
        } catch (SQLiteException e) {
            zzj().m211412A().m123938c("Database error querying filters. appId", xww0.m211405p(str), e);
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008c  */
    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0031: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]) (LINE:50), block:B:10:0x0031 */
    /* JADX INFO: renamed from: B */
    public final Pair<C2356y, Long> m136097B(String str, Long l2) throws Throwable {
        Cursor cursorRawQuery;
        Cursor cursor;
        mo15092h();
        m130251o();
        Cursor cursor2 = null;
        try {
            try {
                cursorRawQuery = m136166v().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, String.valueOf(l2)});
                try {
                    if (!cursorRawQuery.moveToFirst()) {
                        zzj().m211416E().m123936a("Main event not found");
                        cursorRawQuery.close();
                        return null;
                    }
                    try {
                        Pair<C2356y, Long> pairCreate = Pair.create((C2356y) ((AbstractC2349u0) ((C2356y.a) pdy0.m168454K(C2356y.m14494V(), cursorRawQuery.getBlob(0))).mo14369H()), Long.valueOf(cursorRawQuery.getLong(1)));
                        cursorRawQuery.close();
                        return pairCreate;
                    } catch (IOException e) {
                        zzj().m211412A().m123939d("Failed to merge main event. appId, eventId", xww0.m211405p(str), l2, e);
                        cursorRawQuery.close();
                        return null;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    zzj().m211412A().m123937b("Error selecting main event", e);
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursorRawQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }

    /* JADX INFO: renamed from: B0 */
    public final long m136098B0(String str) {
        Preconditions.checkNotEmpty(str);
        return m136095A("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0119  */
    @WorkerThread
    /* JADX INFO: renamed from: C0 */
    public final zzae m136099C0(String str, String str2) throws Throwable {
        String str3;
        Cursor cursorQuery;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        mo15092h();
        m130251o();
        Cursor cursor = null;
        try {
            cursorQuery = m136166v().query("conditional_properties", new String[]{"origin", "value", Active.TYPE, "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    String string = cursorQuery.getString(0);
                    if (string == null) {
                        string = "";
                    }
                    String str4 = string;
                    Object objM136100D = m136100D(cursorQuery, 1);
                    boolean z = cursorQuery.getInt(2) != 0;
                    String string2 = cursorQuery.getString(3);
                    long j = cursorQuery.getLong(4);
                    pdy0 pdy0VarMo15138i = mo15138i();
                    byte[] blob = cursorQuery.getBlob(5);
                    Parcelable.Creator<zzbf> creator = zzbf.CREATOR;
                    zzbf zzbfVar = (zzbf) pdy0VarMo15138i.m168488x(blob, creator);
                    str3 = str2;
                    try {
                        zzae zzaeVar = new zzae(str, str4, new zzon(str3, cursorQuery.getLong(8), objM136100D, str4), cursorQuery.getLong(6), z, string2, zzbfVar, j, (zzbf) mo15138i().m168488x(cursorQuery.getBlob(7), creator), cursorQuery.getLong(9), (zzbf) mo15138i().m168488x(cursorQuery.getBlob(10), creator));
                        if (cursorQuery.moveToNext()) {
                            zzj().m211412A().m123938c("Got multiple records for conditional property, expected one", xww0.m211405p(str), mo15087c().m175779g(str3));
                        }
                        cursorQuery.close();
                        return zzaeVar;
                    } catch (SQLiteException e) {
                        e = e;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    str3 = str2;
                }
            } catch (Throwable th) {
                th = th;
                cursor = cursorQuery;
                if (cursor != null) {
                    cursor.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            str3 = str2;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor != null) {
                cursor.close();
            }
            throw th;
        }
        zzj().m211412A().m123939d("Error querying conditional property", xww0.m211405p(str), mo15087c().m175779g(str3), e);
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    @VisibleForTesting
    @WorkerThread
    /* JADX INFO: renamed from: D */
    public final Object m136100D(Cursor cursor, int i) {
        int type = cursor.getType(i);
        if (type == 0) {
            zzj().m211412A().m123936a("Loaded invalid null value from database");
            return null;
        }
        if (type == 1) {
            return Long.valueOf(cursor.getLong(i));
        }
        if (type == 2) {
            return Double.valueOf(cursor.getDouble(i));
        }
        if (type == 3) {
            return cursor.getString(i);
        }
        if (type != 4) {
            zzj().m211412A().m123937b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
            return null;
        }
        zzj().m211412A().m123936a("Loaded invalid blob type value, ignoring it");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x012a  */
    /* JADX WARN: Multi-variable type inference failed */
    @WorkerThread
    /* JADX INFO: renamed from: D0 */
    public final j2s0 m136101D0(String str, String str2, String str3) throws Throwable {
        Cursor cursorQuery;
        Boolean boolValueOf;
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        mo15092h();
        m130251o();
        CursorWrapper cursorWrapper = 0;
        try {
            try {
                cursorQuery = m136166v().query(str, (String[]) new ArrayList(Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count")).toArray(new String[0]), "app_id=? and name=?", new String[]{str2, str3}, null, null, null);
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    long j = cursorQuery.getLong(0);
                    long j2 = cursorQuery.getLong(1);
                    long j3 = cursorQuery.getLong(2);
                    long j4 = cursorQuery.isNull(3) ? 0L : cursorQuery.getLong(3);
                    Long lValueOf = cursorQuery.isNull(4) ? null : Long.valueOf(cursorQuery.getLong(4));
                    Long lValueOf2 = cursorQuery.isNull(5) ? null : Long.valueOf(cursorQuery.getLong(5));
                    Long lValueOf3 = cursorQuery.isNull(6) ? null : Long.valueOf(cursorQuery.getLong(6));
                    if (cursorQuery.isNull(7)) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(cursorQuery.getLong(7) == 1);
                    }
                    j2s0 j2s0Var = new j2s0(str2, str3, j, j2, cursorQuery.isNull(8) ? 0L : cursorQuery.getLong(8), j3, j4, lValueOf, lValueOf2, lValueOf3, boolValueOf);
                    if (cursorQuery.moveToNext()) {
                        zzj().m211412A().m123937b("Got multiple records for event aggregates, expected one. appId", xww0.m211405p(str2));
                    }
                    cursorQuery.close();
                    return j2s0Var;
                } catch (SQLiteException e) {
                    e = e;
                    zzj().m211412A().m123939d("Error querying events. appId", xww0.m211405p(str2), mo15087c().m175776c(str3), e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursorWrapper = "current_bundle_count";
                if (cursorWrapper != 0) {
                    cursorWrapper.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursorWrapper != 0) {
                cursorWrapper.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0046  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    @WorkerThread
    /* JADX INFO: renamed from: E */
    public final <T> T m136102E(String str, String[] strArr, vrr0<T> vrr0Var) throws Throwable {
        Cursor cursorRawQuery;
        ?? r0 = 0;
        try {
            try {
                cursorRawQuery = m136166v().rawQuery(str, strArr);
                try {
                    if (cursorRawQuery.moveToFirst()) {
                        T tMo121887a = vrr0Var.mo121887a(cursorRawQuery);
                        cursorRawQuery.close();
                        return tMo121887a;
                    }
                    zzj().m211416E().m123936a("No data found");
                    cursorRawQuery.close();
                    return null;
                } catch (SQLiteException e) {
                    e = e;
                    zzj().m211412A().m123937b("Error querying database.", e);
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                r0 = str;
                if (r0 != 0) {
                    r0.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursorRawQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (r0 != 0) {
                r0.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0086  */
    /* JADX WARN: Not initialized variable reg: 1, insn: 0x002d: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]) (LINE:46), block:B:10:0x002d */
    /* JADX INFO: renamed from: E0 */
    public final Bundle m136103E0(String str) throws Throwable {
        Cursor cursorRawQuery;
        Cursor cursor;
        mo15092h();
        m130251o();
        Cursor cursor2 = null;
        try {
            try {
                cursorRawQuery = m136166v().rawQuery("select parameters from default_event_params where app_id=?", new String[]{str});
                try {
                    if (!cursorRawQuery.moveToFirst()) {
                        zzj().m211416E().m123936a("Default event parameters not found");
                        cursorRawQuery.close();
                        return null;
                    }
                    try {
                        C2356y c2356y = (C2356y) ((AbstractC2349u0) ((C2356y.a) pdy0.m168454K(C2356y.m14494V(), cursorRawQuery.getBlob(0))).mo14369H());
                        mo15138i();
                        Bundle bundleM168468v = pdy0.m168468v(c2356y.m14501Y());
                        cursorRawQuery.close();
                        return bundleM168468v;
                    } catch (IOException e) {
                        zzj().m211412A().m123938c("Failed to retrieve default event parameters. appId", xww0.m211405p(str), e);
                        cursorRawQuery.close();
                        return null;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    zzj().m211412A().m123937b("Error selecting default event parameters", e);
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor2 = cursor;
                if (cursor2 != null) {
                    cursor2.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursorRawQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (cursor2 != null) {
                cursor2.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0057  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r4v0, types: [long] */
    /* JADX INFO: renamed from: F */
    public final String m136104F(long j) throws Throwable {
        Cursor cursorRawQuery;
        mo15092h();
        m130251o();
        ?? r0 = 0;
        try {
            try {
                cursorRawQuery = m136166v().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[]{String.valueOf((long) j)});
                try {
                    if (cursorRawQuery.moveToFirst()) {
                        String string = cursorRawQuery.getString(0);
                        cursorRawQuery.close();
                        return string;
                    }
                    zzj().m211416E().m123936a("No expired configs for apps with pending events");
                    cursorRawQuery.close();
                    return null;
                } catch (SQLiteException e) {
                    e = e;
                    zzj().m211412A().m123937b("Error selecting expired configs", e);
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                r0 = j;
                if (r0 != 0) {
                    r0.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursorRawQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (r0 != 0) {
                r0.close();
            }
            throw th;
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: F0 */
    public final j2s0 m136105F0(String str, String str2) {
        return m136101D0("events", str, str2);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0030  */
    @WorkerThread
    /* JADX INFO: renamed from: G */
    public final String m136106G(String str, String[] strArr, String str2) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = m136166v().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return str2;
                }
                String string = cursorRawQuery.getString(0);
                cursorRawQuery.close();
                return string;
            } catch (SQLiteException e) {
                zzj().m211412A().m123938c("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        throw th;
    }

    @WorkerThread
    /* JADX INFO: renamed from: G0 */
    public final thw0 m136107G0(String str) {
        Cursor cursorQuery;
        Boolean boolValueOf;
        Preconditions.checkNotEmpty(str);
        mo15092h();
        m130251o();
        Cursor cursor = null;
        try {
            cursorQuery = m136166v().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token", "sgtm_upload_enabled", "target_os_version", "session_stitching_token_hash", "ad_services_version", "unmatched_first_open_without_ad_id", "npa_metadata_value", "attribution_eligibility_status", "sgtm_preview_key", "dma_consent_state", "daily_realtime_dcu_count", "bundle_delivery_index", "serialized_npa_metadata", "unmatched_pfo", "unmatched_uwa", "ad_campaign_info"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    thw0 thw0Var = new thw0(this.f122162b.m15299o0(), str);
                    if (!t9y0.m187687a() || !mo15085a().m192648n(q8s0.f153267Z0) || this.f122162b.m15267P(str).m15347m(zzje.zza.ANALYTICS_STORAGE)) {
                        thw0Var.m188950J(cursorQuery.getString(0));
                    }
                    thw0Var.m188970Z(cursorQuery.getString(1));
                    if (!t9y0.m187687a() || !mo15085a().m192648n(q8s0.f153267Z0) || this.f122162b.m15267P(str).m15347m(zzje.zza.AD_STORAGE)) {
                        thw0Var.m188982f0(cursorQuery.getString(2));
                    }
                    thw0Var.m188933A0(cursorQuery.getLong(3));
                    thw0Var.m188937C0(cursorQuery.getLong(4));
                    thw0Var.m189020y0(cursorQuery.getLong(5));
                    thw0Var.m188963S(cursorQuery.getString(6));
                    thw0Var.m188959O(cursorQuery.getString(7));
                    thw0Var.m189012u0(cursorQuery.getLong(8));
                    thw0Var.m188998n0(cursorQuery.getLong(9));
                    thw0Var.m188952K(cursorQuery.isNull(10) || cursorQuery.getInt(10) != 0);
                    thw0Var.m188992k0(cursorQuery.getLong(11));
                    thw0Var.m188980e0(cursorQuery.getLong(12));
                    thw0Var.m188974b0(cursorQuery.getLong(13));
                    thw0Var.m188966V(cursorQuery.getLong(14));
                    thw0Var.m188962R(cursorQuery.getLong(15));
                    thw0Var.m189008s0(cursorQuery.getLong(16));
                    thw0Var.m188946H(cursorQuery.isNull(17) ? -2147483648L : cursorQuery.getInt(17));
                    thw0Var.m188967W(cursorQuery.getString(18));
                    thw0Var.m188969Y(cursorQuery.getLong(19));
                    thw0Var.m188986h0(cursorQuery.getLong(20));
                    thw0Var.m188976c0(cursorQuery.getString(21));
                    thw0Var.m188985h(cursorQuery.isNull(23) || cursorQuery.getInt(23) != 0);
                    thw0Var.m188981f(cursorQuery.getString(24));
                    thw0Var.m189004q0(cursorQuery.isNull(25) ? 0L : cursorQuery.getLong(25));
                    if (!cursorQuery.isNull(26)) {
                        thw0Var.m188983g(Arrays.asList(cursorQuery.getString(26).split(Constants.SEPARATOR_COMMA, -1)));
                    }
                    if (!t9y0.m187687a() || !mo15085a().m192648n(q8s0.f153267Z0) || this.f122162b.m15267P(str).m15347m(zzje.zza.ANALYTICS_STORAGE)) {
                        thw0Var.m188994l0(cursorQuery.getString(28));
                    }
                    if (ahy0.m96761a() && mo15085a().m192648n(q8s0.f153330y0)) {
                        mo15089e();
                        if (bey0.m101424B0(str)) {
                            thw0Var.m188960P((cursorQuery.isNull(29) || cursorQuery.getInt(29) == 0) ? false : true);
                            thw0Var.m189016w0(cursorQuery.getLong(39));
                            if (mo15085a().m192648n(q8s0.f153332z0)) {
                                thw0Var.m189000o0(cursorQuery.getString(36));
                            }
                        }
                    }
                    thw0Var.m188945G0(cursorQuery.getLong(30));
                    thw0Var.m188941E0(cursorQuery.getLong(31));
                    if (mgy0.m154586a() && mo15085a().m192660z(str, q8s0.f153233I0)) {
                        thw0Var.m188973b(cursorQuery.getInt(32));
                        thw0Var.m188958N(cursorQuery.getLong(35));
                    }
                    thw0Var.m188964T((cursorQuery.isNull(33) || cursorQuery.getInt(33) == 0) ? false : true);
                    if (cursorQuery.isNull(34)) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(cursorQuery.getInt(34) != 0);
                    }
                    thw0Var.m188977d(boolValueOf);
                    thw0Var.m188956M(cursorQuery.getInt(37));
                    thw0Var.m188944G(cursorQuery.getInt(38));
                    thw0Var.m188988i0(cursorQuery.isNull(40) ? "" : (String) Preconditions.checkNotNull(cursorQuery.getString(40)));
                    if (mo15085a().m192648n(q8s0.f153263X0)) {
                        if (!cursorQuery.isNull(41)) {
                            thw0Var.m188979e(Long.valueOf(cursorQuery.getLong(41)));
                        }
                        if (!cursorQuery.isNull(42)) {
                            thw0Var.m188948I(Long.valueOf(cursorQuery.getLong(42)));
                        }
                    }
                    if (hey0.m130716a() && mo15085a().m192660z(str, q8s0.f153259V0)) {
                        thw0Var.m188987i(cursorQuery.getBlob(43));
                    }
                    thw0Var.m189017x();
                    if (cursorQuery.moveToNext()) {
                        zzj().m211412A().m123937b("Got multiple records for app, expected one. appId", xww0.m211405p(str));
                    }
                    cursorQuery.close();
                    return thw0Var;
                } catch (SQLiteException e) {
                    e = e;
                    zzj().m211412A().m123938c("Error querying app. appId", xww0.m211405p(str), e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                cursor = cursorQuery;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursorQuery = null;
        } catch (Throwable th2) {
            th = th2;
        }
        th = th;
        cursor = cursorQuery;
        if (cursor != null) {
            cursor.close();
        }
        throw th;
    }

    @WorkerThread
    /* JADX INFO: renamed from: H */
    public final List<Pair<C2313c0, Long>> m136108H(String str, int i, int i2) {
        long jM14164N;
        long jM14164N2;
        mo15092h();
        m130251o();
        int i3 = 1;
        Preconditions.checkArgument(i > 0);
        Preconditions.checkArgument(i2 > 0);
        Preconditions.checkNotEmpty(str);
        Cursor cursor = null;
        try {
            try {
                Cursor cursorQuery = m136166v().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{str}, null, null, "rowid", String.valueOf(i));
                if (!cursorQuery.moveToFirst()) {
                    List<Pair<C2313c0, Long>> list = Collections.EMPTY_LIST;
                    cursorQuery.close();
                    return list;
                }
                ArrayList arrayList = new ArrayList();
                int length = 0;
                while (true) {
                    long j = cursorQuery.getLong(0);
                    try {
                        byte[] bArrM168483d0 = mo15138i().m168483d0(cursorQuery.getBlob(i3));
                        if (!arrayList.isEmpty() && bArrM168483d0.length + length > i2) {
                            break;
                        }
                        try {
                            C2313c0.a aVar = (C2313c0.a) pdy0.m168454K(C2313c0.m13917x2(), bArrM168483d0);
                            if (!arrayList.isEmpty()) {
                                C2313c0 c2313c0 = (C2313c0) ((Pair) arrayList.get(0)).first;
                                C2313c0 c2313c1 = (C2313c0) ((AbstractC2349u0) aVar.mo14369H());
                                if (!c2313c0.m13954b0().equals(c2313c1.m13954b0()) || !c2313c0.m13952a0().equals(c2313c1.m13952a0()) || c2313c0.m13984r0() != c2313c1.m13984r0() || !c2313c0.m13957c0().equals(c2313c1.m13957c0())) {
                                    break;
                                }
                                Iterator<C2319f0> it = c2313c0.m13981p0().iterator();
                                while (true) {
                                    jM14164N = -1;
                                    if (!it.hasNext()) {
                                        jM14164N2 = -1;
                                        break;
                                    }
                                    C2319f0 next = it.next();
                                    if ("_npa".equals(next.m14166X())) {
                                        jM14164N2 = next.m14164N();
                                        break;
                                    }
                                }
                                for (C2319f0 c2319f0 : c2313c1.m13981p0()) {
                                    if ("_npa".equals(c2319f0.m14166X())) {
                                        jM14164N = c2319f0.m14164N();
                                        break;
                                    }
                                }
                                if (jM14164N2 != jM14164N) {
                                    break;
                                }
                            }
                            if (!cursorQuery.isNull(2)) {
                                aVar.m14013I0(cursorQuery.getInt(2));
                            }
                            length += bArrM168483d0.length;
                            arrayList.add(Pair.create((C2313c0) ((AbstractC2349u0) aVar.mo14369H()), Long.valueOf(j)));
                        } catch (IOException e) {
                            zzj().m211412A().m123938c("Failed to merge queued bundle. appId", xww0.m211405p(str), e);
                        }
                        if (!cursorQuery.moveToNext() || length > i2) {
                            break;
                        }
                        i3 = 1;
                    } catch (IOException e2) {
                        zzj().m211412A().m123938c("Failed to unzip queued bundle. appId", xww0.m211405p(str), e2);
                    }
                }
                cursorQuery.close();
                return arrayList;
            } catch (SQLiteException e3) {
                zzj().m211412A().m123938c("Error querying bundles. appId", xww0.m211405p(str), e3);
                List<Pair<C2313c0, Long>> list2 = Collections.EMPTY_LIST;
                if (0 != 0) {
                    cursor.close();
                }
                return list2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: H0 */
    public final sdy0 m136109H0(String str, String str2) {
        Throwable th;
        String str3;
        String str4;
        SQLiteException sQLiteException;
        Cursor cursorQuery;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        mo15092h();
        m130251o();
        Cursor cursor = null;
        try {
            cursorQuery = m136166v().query("user_attributes", new String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    long j = cursorQuery.getLong(0);
                    Object objM136100D = m136100D(cursorQuery, 1);
                    if (objM136100D == null) {
                        cursorQuery.close();
                        return null;
                    }
                    str3 = str;
                    str4 = str2;
                    try {
                        sdy0 sdy0Var = new sdy0(str3, cursorQuery.getString(2), str4, j, objM136100D);
                        if (cursorQuery.moveToNext()) {
                            zzj().m211412A().m123937b("Got multiple records for user property, expected one. appId", xww0.m211405p(str3));
                        }
                        cursorQuery.close();
                        return sdy0Var;
                    } catch (SQLiteException e) {
                        e = e;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    str3 = str;
                    str4 = str2;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor = cursorQuery;
                if (cursor == null) {
                    throw th;
                }
                cursor.close();
                throw th;
            }
            sQLiteException = e;
        } catch (SQLiteException e3) {
            str3 = str;
            str4 = str2;
            sQLiteException = e3;
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
        }
        zzj().m211412A().m123939d("Error querying user property. appId", xww0.m211405p(str3), mo15087c().m175779g(str4), sQLiteException);
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    @WorkerThread
    /* JADX INFO: renamed from: I */
    public final List<zzae> m136110I(String str, String str2, String str3) {
        Preconditions.checkNotEmpty(str);
        mo15092h();
        m130251o();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(str3 + "*");
            sb.append(" and name glob ?");
        }
        return m136112J(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX INFO: renamed from: I0 */
    public final Map<Integer, List<C2312c>> m136111I0(String str, String str2) {
        m130251o();
        mo15092h();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        e01 e01Var = new e01();
        Cursor cursor = null;
        try {
            try {
                Cursor cursorQuery = m136166v().query("event_filters", new String[]{"audience_id", "data"}, "app_id=? AND event_name=?", new String[]{str, str2}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    Map<Integer, List<C2312c>> map = Collections.EMPTY_MAP;
                    cursorQuery.close();
                    return map;
                }
                do {
                    try {
                        C2312c c2312c = (C2312c) ((AbstractC2349u0) ((C2312c.a) pdy0.m168454K(C2312c.m13831G(), cursorQuery.getBlob(1))).mo14369H());
                        int i = cursorQuery.getInt(0);
                        List arrayList = (List) e01Var.get(Integer.valueOf(i));
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            e01Var.put(Integer.valueOf(i), arrayList);
                        }
                        arrayList.add(c2312c);
                    } catch (IOException e) {
                        zzj().m211412A().m123938c("Failed to merge filter. appId", xww0.m211405p(str), e);
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                return e01Var;
            } catch (SQLiteException e2) {
                zzj().m211412A().m123938c("Database error querying filters. appId", xww0.m211405p(str), e2);
                Map<Integer, List<C2312c>> map2 = Collections.EMPTY_MAP;
                if (0 != 0) {
                    cursor.close();
                }
                return map2;
            }
        } catch (Throwable th) {
            if (0 == 0) {
                throw th;
            }
            cursor.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: J */
    public final List<zzae> m136112J(String str, String[] strArr) {
        mo15092h();
        m130251o();
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = m136166v().query("conditional_properties", new String[]{com.tencent.connect.common.Constants.JumpUrlConstants.URL_KEY_APPID, "origin", AuthenticationTokenClaims.JSON_KEY_NAME, "value", Active.TYPE, "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, str, strArr, null, null, "rowid", "1001");
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return arrayList;
                }
                while (arrayList.size() < 1000) {
                    String string = cursorQuery.getString(0);
                    String string2 = cursorQuery.getString(1);
                    String string3 = cursorQuery.getString(2);
                    Object objM136100D = m136100D(cursorQuery, 3);
                    boolean z = cursorQuery.getInt(4) != 0;
                    String string4 = cursorQuery.getString(5);
                    long j = cursorQuery.getLong(6);
                    pdy0 pdy0VarMo15138i = mo15138i();
                    byte[] blob = cursorQuery.getBlob(7);
                    Parcelable.Creator<zzbf> creator = zzbf.CREATOR;
                    zzbf zzbfVar = (zzbf) pdy0VarMo15138i.m168488x(blob, creator);
                    arrayList.add(new zzae(string, string2, new zzon(string3, cursorQuery.getLong(10), objM136100D, string2), cursorQuery.getLong(8), z, string4, zzbfVar, j, (zzbf) mo15138i().m168488x(cursorQuery.getBlob(9), creator), cursorQuery.getLong(11), (zzbf) mo15138i().m168488x(cursorQuery.getBlob(12), creator)));
                    if (!cursorQuery.moveToNext()) {
                        cursorQuery.close();
                        return arrayList;
                    }
                }
                zzj().m211412A().m123937b("Read more than the max allowed conditional properties, ignoring extra", 1000);
                cursorQuery.close();
                return arrayList;
            } catch (SQLiteException e) {
                zzj().m211412A().m123937b("Error querying conditional user property value", e);
                List<zzae> list = Collections.EMPTY_LIST;
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return list;
            }
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008b  */
    /* JADX WARN: Code duplicated, block: B:38:? A[SYNTHETIC] */
    /* JADX WARN: Not initialized variable reg: 2, insn: 0x005a: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]) (LINE:91), block:B:14:0x0059 */
    @WorkerThread
    /* JADX INFO: renamed from: J0 */
    public final uir0 m136113J0(String str) {
        Throwable th;
        Cursor cursorQuery;
        Cursor cursor;
        Preconditions.checkNotEmpty(str);
        mo15092h();
        m130251o();
        Cursor cursor2 = null;
        try {
            try {
                cursorQuery = m136166v().query("apps", new String[]{"remote_config", "config_last_modified_time", "e_tag"}, "app_id=?", new String[]{str}, null, null, null);
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    byte[] blob = cursorQuery.getBlob(0);
                    String string = cursorQuery.getString(1);
                    String string2 = cursorQuery.getString(2);
                    if (cursorQuery.moveToNext()) {
                        zzj().m211412A().m123937b("Got multiple records for app config, expected one. appId", xww0.m211405p(str));
                    }
                    if (blob == null) {
                        cursorQuery.close();
                        return null;
                    }
                    uir0 uir0Var = new uir0(blob, string, string2);
                    cursorQuery.close();
                    return uir0Var;
                } catch (SQLiteException e) {
                    e = e;
                    zzj().m211412A().m123938c("Error querying remote config. appId", xww0.m211405p(str), e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                cursor2 = cursor;
                if (cursor2 != null) {
                    throw th;
                }
                cursor2.close();
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
            if (cursor2 != null) {
                throw th;
            }
            cursor2.close();
            throw th;
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: K */
    public final smr0 m136114K(long j, String str, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        Preconditions.checkNotEmpty(str);
        mo15092h();
        m130251o();
        String[] strArr = {str};
        smr0 smr0Var = new smr0();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseM136166v = m136166v();
                Cursor cursorQuery = sQLiteDatabaseM136166v.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    zzj().m211417F().m123937b("Not updating daily counts, app is not known. appId", xww0.m211405p(str));
                    cursorQuery.close();
                    return smr0Var;
                }
                if (cursorQuery.getLong(0) == j) {
                    smr0Var.f165371b = cursorQuery.getLong(1);
                    smr0Var.f165370a = cursorQuery.getLong(2);
                    smr0Var.f165372c = cursorQuery.getLong(3);
                    smr0Var.f165373d = cursorQuery.getLong(4);
                    smr0Var.f165374e = cursorQuery.getLong(5);
                    smr0Var.f165375f = cursorQuery.getLong(6);
                    smr0Var.f165376g = cursorQuery.getLong(7);
                }
                if (z) {
                    smr0Var.f165371b += j2;
                }
                if (z2) {
                    smr0Var.f165370a += j2;
                }
                if (z3) {
                    smr0Var.f165372c += j2;
                }
                if (z4) {
                    smr0Var.f165373d += j2;
                }
                if (z5) {
                    smr0Var.f165374e += j2;
                }
                if (z6) {
                    smr0Var.f165375f += j2;
                }
                if (z7) {
                    smr0Var.f165376g += j2;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("day", Long.valueOf(j));
                contentValues.put("daily_public_events_count", Long.valueOf(smr0Var.f165370a));
                contentValues.put("daily_events_count", Long.valueOf(smr0Var.f165371b));
                contentValues.put("daily_conversions_count", Long.valueOf(smr0Var.f165372c));
                contentValues.put("daily_error_events_count", Long.valueOf(smr0Var.f165373d));
                contentValues.put("daily_realtime_events_count", Long.valueOf(smr0Var.f165374e));
                contentValues.put("daily_realtime_dcu_count", Long.valueOf(smr0Var.f165375f));
                contentValues.put("daily_registered_triggers_count", Long.valueOf(smr0Var.f165376g));
                sQLiteDatabaseM136166v.update("apps", contentValues, "app_id=?", strArr);
                cursorQuery.close();
                return smr0Var;
            } catch (SQLiteException e) {
                zzj().m211412A().m123938c("Error updating daily counts. appId", xww0.m211405p(str), e);
                if (0 != 0) {
                    cursor.close();
                }
                return smr0Var;
            }
        } catch (Throwable th) {
            if (0 == 0) {
                throw th;
            }
            cursor.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: K0 */
    public final C2453b m136115K0(String str) {
        Preconditions.checkNotNull(str);
        mo15092h();
        m130251o();
        return C2453b.m15070d(m136106G("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{str}, ""));
    }

    @WorkerThread
    /* JADX INFO: renamed from: L */
    public final smr0 m136116L(long j, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        return m136114K(j, str, 1L, false, false, z3, false, z5, z6, z7);
    }

    /* JADX INFO: renamed from: L0 */
    public final Map<Integer, List<C2316e>> m136117L0(String str, String str2) {
        m130251o();
        mo15092h();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        e01 e01Var = new e01();
        Cursor cursor = null;
        try {
            try {
                Cursor cursorQuery = m136166v().query("property_filters", new String[]{"audience_id", "data"}, "app_id=? AND property_name=?", new String[]{str, str2}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    Map<Integer, List<C2316e>> map = Collections.EMPTY_MAP;
                    cursorQuery.close();
                    return map;
                }
                do {
                    try {
                        C2316e c2316e = (C2316e) ((AbstractC2349u0) ((C2316e.a) pdy0.m168454K(C2316e.m14130D(), cursorQuery.getBlob(1))).mo14369H());
                        int i = cursorQuery.getInt(0);
                        List arrayList = (List) e01Var.get(Integer.valueOf(i));
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            e01Var.put(Integer.valueOf(i), arrayList);
                        }
                        arrayList.add(c2316e);
                    } catch (IOException e) {
                        zzj().m211412A().m123938c("Failed to merge filter", xww0.m211405p(str), e);
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                return e01Var;
            } catch (SQLiteException e2) {
                zzj().m211412A().m123938c("Database error querying filters. appId", xww0.m211405p(str), e2);
                Map<Integer, List<C2316e>> map2 = Collections.EMPTY_MAP;
                if (0 != 0) {
                    cursor.close();
                }
                return map2;
            }
        } catch (Throwable th) {
            if (0 == 0) {
                throw th;
            }
            cursor.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: M0 */
    public final zzje m136118M0(String str) {
        Preconditions.checkNotNull(str);
        mo15092h();
        m130251o();
        return zzje.m15342q(m136106G("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}, ""));
    }

    @WorkerThread
    /* JADX INFO: renamed from: N0 */
    public final void m136119N0(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        mo15092h();
        m130251o();
        try {
            m136166v().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            zzj().m211412A().m123939d("Error deleting user property. appId", xww0.m211405p(str), mo15087c().m175779g(str2), e);
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: O */
    public final void m136120O(Long l2) {
        mo15092h();
        m130251o();
        Preconditions.checkNotNull(l2);
        if ((!ahy0.m96761a() || mo15085a().m192648n(q8s0.f153221C0)) && m136160i0()) {
            if (m136169w0("SELECT COUNT(1) FROM upload_queue WHERE rowid = " + l2 + " AND retry_count =  2147483647 LIMIT 1", null) > 0) {
                zzj().m211417F().m123936a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                m136166v().execSQL("UPDATE upload_queue SET retry_count = retry_count + 1 WHERE rowid = " + l2 + " AND retry_count < 2147483647");
            } catch (SQLiteException e) {
                zzj().m211412A().m123937b("Error incrementing retry count. error", e);
            }
        }
    }

    /* JADX INFO: renamed from: O0 */
    public final zzje m136121O0(String str) {
        Preconditions.checkNotNull(str);
        mo15092h();
        m130251o();
        zzje zzjeVar = (zzje) m136102E("select consent_state, consent_source from consent_settings where app_id=? limit 1;", new String[]{str}, new vrr0() { // from class: l.fkr0
            @Override // p149l.vrr0
            /* JADX INFO: renamed from: a */
            public final Object mo121887a(Cursor cursor) {
                return zzje.m15335f(cursor.getString(0), cursor.getInt(1));
            }
        });
        return zzjeVar == null ? zzje.f10555c : zzjeVar;
    }

    /* JADX INFO: renamed from: P */
    public final void m136122P(String str, Bundle bundle) {
        igr0 igr0Var = this;
        Preconditions.checkNotNull(bundle);
        igr0Var.mo15092h();
        igr0Var.m130251o();
        String str2 = str;
        cor0 cor0Var = new cor0(igr0Var, str2);
        List<ylr0> listM108030a = cor0Var.m108030a();
        while (!listM108030a.isEmpty()) {
            for (ylr0 ylr0Var : listM108030a) {
                pdy0 pdy0VarMo15138i = igr0Var.mo15138i();
                C2356y c2356y = ylr0Var.f198935d;
                Bundle bundle2 = new Bundle();
                for (C2308a0 c2308a0 : c2356y.m14501Y()) {
                    if (c2308a0.m13788c0()) {
                        bundle2.putDouble(c2308a0.m13785Z(), c2308a0.m13781B());
                    } else if (c2308a0.m13789d0()) {
                        bundle2.putFloat(c2308a0.m13785Z(), c2308a0.m13782L());
                    } else if (c2308a0.m13790e0()) {
                        bundle2.putLong(c2308a0.m13785Z(), c2308a0.m13784V());
                    } else if (c2308a0.m13792g0()) {
                        bundle2.putString(c2308a0.m13785Z(), c2308a0.m13786a0());
                    } else if (c2308a0.m13787b0().isEmpty()) {
                        pdy0VarMo15138i.zzj().m211412A().m123937b("Unexpected parameter type for parameter", c2308a0);
                    } else {
                        bundle2.putParcelableArray(c2308a0.m13785Z(), pdy0.m168466c0(c2308a0.m13787b0()));
                    }
                }
                String string = bundle2.getString("_o");
                bundle2.remove("_o");
                String strM14500X = c2356y.m14500X();
                if (string == null) {
                    string = "";
                }
                n1x0 n1x0Var = new n1x0(strM14500X, string, bundle2, c2356y.m14499U());
                igr0Var.mo15089e().m101461H(n1x0Var.f136734d, bundle);
                igr0Var.m136140Y(ylr0Var.f198932a, new q3s0(igr0Var.f165891a, n1x0Var.f136732b, str2, ylr0Var.f198935d.m14500X(), ylr0Var.f198935d.m14499U(), ylr0Var.f198935d.m14498T(), n1x0Var.f136734d), ylr0Var.f198933b, ylr0Var.f198934c);
                igr0Var = this;
                str2 = str;
            }
            listM108030a = cor0Var.m108030a();
            igr0Var = this;
            str2 = str;
        }
    }

    /* JADX INFO: renamed from: P0 */
    public final void m136123P0(String str, String str2) {
        Preconditions.checkNotEmpty(str2);
        mo15092h();
        m130251o();
        try {
            m136166v().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e) {
            zzj().m211412A().m123938c("Error deleting snapshot. appId", xww0.m211405p(str2), e);
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m136124Q(String str, C2453b c2453b) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(c2453b);
        mo15092h();
        m130251o();
        if (mo15085a().m192648n(q8s0.f153253S0)) {
            zzje zzjeVarM136121O0 = m136121O0(str);
            zzje zzjeVar = zzje.f10555c;
            if (zzjeVarM136121O0 == zzjeVar) {
                m136173y0(str, zzjeVar);
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(com.tencent.connect.common.Constants.JumpUrlConstants.URL_KEY_APPID, str);
        contentValues.put("dma_consent_settings", c2453b.m15077j());
        m136128S("consent_settings", com.tencent.connect.common.Constants.JumpUrlConstants.URL_KEY_APPID, contentValues);
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0181  */
    /* JADX WARN: Code duplicated, block: B:72:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v2 */
    @WorkerThread
    /* JADX INFO: renamed from: Q0 */
    public final bdy0 m136125Q0(String str) throws Throwable {
        Throwable th;
        Cursor cursorQuery;
        tgw0<Boolean> tgw0Var;
        Preconditions.checkNotEmpty(str);
        mo15092h();
        m130251o();
        ?? r1 = 0;
        if (ahy0.m96761a()) {
            u9r0 u9r0VarMo15085a = mo15085a();
            tgw0Var = q8s0.f153221C0;
            if (!u9r0VarMo15085a.m192648n(tgw0Var)) {
                return null;
            }
        }
        try {
            try {
                cursorQuery = m136166v().query("upload_queue", new String[]{"rowId", com.tencent.connect.common.Constants.JumpUrlConstants.URL_KEY_APPID, "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count"}, "app_id=? AND NOT " + m136163t0(), new String[]{str}, null, null, "creation_timestamp ASC", "1");
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    String string = cursorQuery.getString(3);
                    if (TextUtils.isEmpty(string)) {
                        zzj().m211424z().m123936a("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
                        cursorQuery.close();
                        return null;
                    }
                    try {
                        zzfy$zzj.C2366a c2366a = (zzfy$zzj.C2366a) pdy0.m168454K(zzfy$zzj.m14596I(), cursorQuery.getBlob(2));
                        zznt zzntVar = zznt.values()[cursorQuery.getInt(5)];
                        if (zzntVar == zznt.SGTM || zzntVar == zznt.GOOGLE_ANALYTICS) {
                            if (cursorQuery.getInt(6) > 0) {
                                ArrayList arrayList = new ArrayList();
                                Iterator<C2313c0> it = c2366a.m14611D().iterator();
                                while (it.hasNext()) {
                                    C2313c0.a aVarM14363t = it.next().m14363t();
                                    aVarM14363t.m14013I0(cursorQuery.getInt(6));
                                    arrayList.add((C2313c0) ((AbstractC2349u0) aVarM14363t.mo14369H()));
                                }
                                c2366a.m14608A();
                                c2366a.m14614x(arrayList);
                            }
                        }
                        HashMap map = new HashMap();
                        String string2 = cursorQuery.getString(4);
                        if (string2 != null) {
                            for (String str2 : string2.split("\r\n")) {
                                if (str2.isEmpty()) {
                                    break;
                                }
                                String[] strArrSplit = str2.split("=", 2);
                                if (strArrSplit.length != 2) {
                                    zzj().m211412A().m123937b("Invalid upload header: ", str2);
                                    break;
                                }
                                map.put(strArrSplit[0], strArrSplit[1]);
                            }
                        }
                        bdy0 bdy0VarM145694a = new kdy0().m145695b(cursorQuery.getLong(0)).m145696c((zzfy$zzj) ((AbstractC2349u0) c2366a.mo14369H())).m145698e(string).m145699f(map).m145697d(zzntVar).m145694a();
                        cursorQuery.close();
                        return bdy0VarM145694a;
                    } catch (IOException e) {
                        zzj().m211412A().m123938c("Failed to queued MeasurementBatch from upload_queue. appId", str, e);
                        cursorQuery.close();
                        return null;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    zzj().m211412A().m123938c("Error to querying MeasurementBatch from upload_queue. appId", str, e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                r1 = tgw0Var;
                if (r1 != 0) {
                    throw th;
                }
                r1.close();
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            cursorQuery = null;
        } catch (Throwable th3) {
            th = th3;
            if (r1 != 0) {
                throw th;
            }
            r1.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m136126R(String str, zzje zzjeVar) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(zzjeVar);
        mo15092h();
        m130251o();
        m136173y0(str, m136121O0(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put(com.tencent.connect.common.Constants.JumpUrlConstants.URL_KEY_APPID, str);
        contentValues.put("storage_consent_at_bundling", zzjeVar.m15356x());
        m136128S("consent_settings", com.tencent.connect.common.Constants.JumpUrlConstants.URL_KEY_APPID, contentValues);
    }

    /* JADX INFO: renamed from: R0 */
    public final List<zzno> m136127R0(String str) {
        Preconditions.checkNotEmpty(str);
        mo15092h();
        m130251o();
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = m136166v().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", "source"}, "app_id=?", new String[]{str}, null, null, "rowid", null);
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return arrayList;
                }
                do {
                    String string = cursorQuery.getString(0);
                    if (string == null) {
                        string = "";
                    }
                    arrayList.add(new zzno(string, cursorQuery.getLong(1), cursorQuery.getInt(2)));
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                return arrayList;
            } catch (SQLiteException e) {
                zzj().m211412A().m123938c("Error querying trigger uris. appId", xww0.m211405p(str), e);
                List<zzno> list = Collections.EMPTY_LIST;
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return list;
            }
        } catch (Throwable th) {
            if (cursorQuery == null) {
                throw th;
            }
            cursorQuery.close();
            throw th;
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: S */
    public final void m136128S(String str, String str2, ContentValues contentValues) {
        try {
            SQLiteDatabase sQLiteDatabaseM136166v = m136166v();
            String asString = contentValues.getAsString(str2);
            if (asString == null) {
                zzj().m211413B().m123937b("Value of the primary key is not set.", xww0.m211405p(str2));
                return;
            }
            if (sQLiteDatabaseM136166v.update(str, contentValues, str2 + " = ?", new String[]{asString}) == 0 && sQLiteDatabaseM136166v.insertWithOnConflict(str, null, contentValues, 5) == -1) {
                zzj().m211412A().m123938c("Failed to insert/update table (got -1). key", xww0.m211405p(str), xww0.m211405p(str2));
            }
        } catch (SQLiteException e) {
            zzj().m211412A().m123939d("Error storing into table. key", xww0.m211405p(str), xww0.m211405p(str2), e);
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: S0 */
    public final List<sdy0> m136129S0(String str) {
        String str2;
        Preconditions.checkNotEmpty(str);
        mo15092h();
        m130251o();
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = m136166v().query("user_attributes", new String[]{AuthenticationTokenClaims.JSON_KEY_NAME, "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", com.tencent.connect.common.Constants.DEFAULT_UIN);
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return arrayList;
                }
                while (true) {
                    String string = cursorQuery.getString(0);
                    String string2 = cursorQuery.getString(1);
                    if (string2 == null) {
                        string2 = "";
                    }
                    String str3 = string2;
                    long j = cursorQuery.getLong(2);
                    Object objM136100D = m136100D(cursorQuery, 3);
                    if (objM136100D == null) {
                        zzj().m211412A().m123937b("Read invalid user property value, ignoring it. appId", xww0.m211405p(str));
                        str2 = str;
                    } else {
                        str2 = str;
                        arrayList.add(new sdy0(str2, str3, string, j, objM136100D));
                    }
                    try {
                        if (!cursorQuery.moveToNext()) {
                            cursorQuery.close();
                            return arrayList;
                        }
                        str = str2;
                    } catch (SQLiteException e) {
                        e = e;
                    }
                }
            } catch (Throwable th) {
                if (cursorQuery == null) {
                    throw th;
                }
                cursorQuery.close();
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            str2 = str;
        }
        zzj().m211412A().m123938c("Error querying user properties. appId", xww0.m211405p(str2), e);
        List<sdy0> list = Collections.EMPTY_LIST;
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return list;
    }

    @WorkerThread
    /* JADX INFO: renamed from: T */
    public final void m136130T(String str, List<C2310b> list) {
        boolean z;
        boolean z2;
        Preconditions.checkNotNull(list);
        for (int i = 0; i < list.size(); i++) {
            C2310b.a aVarM14363t = list.get(i).m14363t();
            if (aVarM14363t.m13823v() != 0) {
                for (int i2 = 0; i2 < aVarM14363t.m13823v(); i2++) {
                    C2312c.a aVarM14363t2 = aVarM14363t.m13826y(i2).m14363t();
                    C2312c.a aVar = (C2312c.a) ((AbstractC2349u0.b) aVarM14363t2.clone());
                    String strM98576b = arx0.m98576b(aVarM14363t2.m13849z());
                    if (strM98576b != null) {
                        aVar.m13847x(strM98576b);
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    for (int i3 = 0; i3 < aVarM14363t2.m13845v(); i3++) {
                        C2314d c2314dM13848y = aVarM14363t2.m13848y(i3);
                        String strM142977a = jrx0.m142977a(c2314dM13848y.m14095I());
                        if (strM142977a != null) {
                            aVar.m13846w(i3, (C2314d) ((AbstractC2349u0) c2314dM13848y.m14363t().m14101v(strM142977a).mo14369H()));
                            z2 = true;
                        }
                    }
                    if (z2) {
                        C2310b.a aVarM13824w = aVarM14363t.m13824w(i2, aVar);
                        list.set(i, (C2310b) ((AbstractC2349u0) aVarM13824w.mo14369H()));
                        aVarM14363t = aVarM13824w;
                    }
                }
            }
            if (aVarM14363t.m13827z() != 0) {
                for (int i4 = 0; i4 < aVarM14363t.m13827z(); i4++) {
                    C2316e c2316eM13822A = aVarM14363t.m13822A(i4);
                    String strM122906a = frx0.m122906a(c2316eM13822A.m14133G());
                    if (strM122906a != null) {
                        aVarM14363t = aVarM14363t.m13825x(i4, c2316eM13822A.m14363t().m14140v(strM122906a));
                        list.set(i, (C2310b) ((AbstractC2349u0) aVarM14363t.mo14369H()));
                    }
                }
            }
        }
        m130251o();
        mo15092h();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(list);
        SQLiteDatabase sQLiteDatabaseM136166v = m136166v();
        sQLiteDatabaseM136166v.beginTransaction();
        try {
            m130251o();
            mo15092h();
            Preconditions.checkNotEmpty(str);
            SQLiteDatabase sQLiteDatabaseM136166v2 = m136166v();
            sQLiteDatabaseM136166v2.delete("property_filters", "app_id=?", new String[]{str});
            sQLiteDatabaseM136166v2.delete("event_filters", "app_id=?", new String[]{str});
            for (C2310b c2310b : list) {
                m130251o();
                mo15092h();
                Preconditions.checkNotEmpty(str);
                Preconditions.checkNotNull(c2310b);
                if (c2310b.m13820N()) {
                    int iM13821h = c2310b.m13821h();
                    Iterator<C2312c> it = c2310b.m13818L().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!it.next().m13842W()) {
                                zzj().m211417F().m123938c("Event filter with no ID. Audience definition ignored. appId, audienceId", xww0.m211405p(str), Integer.valueOf(iM13821h));
                                break;
                            }
                        } else {
                            Iterator<C2316e> it2 = c2310b.m13819M().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    Iterator<C2312c> it3 = c2310b.m13818L().iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            if (!m136146b0(str, iM13821h, it3.next())) {
                                                z = false;
                                                break;
                                            }
                                        } else {
                                            z = true;
                                            break;
                                        }
                                    }
                                    if (z) {
                                        Iterator<C2316e> it4 = c2310b.m13819M().iterator();
                                        while (it4.hasNext()) {
                                            if (!m136148c0(str, iM13821h, it4.next())) {
                                                z = false;
                                                break;
                                            }
                                        }
                                    }
                                    if (!z) {
                                        m130251o();
                                        mo15092h();
                                        Preconditions.checkNotEmpty(str);
                                        SQLiteDatabase sQLiteDatabaseM136166v3 = m136166v();
                                        sQLiteDatabaseM136166v3.delete("property_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(iM13821h)});
                                        sQLiteDatabaseM136166v3.delete("event_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(iM13821h)});
                                        break;
                                    }
                                    break;
                                }
                                if (!it2.next().m14137M()) {
                                    zzj().m211417F().m123938c("Property filter with no ID. Audience definition ignored. appId, audienceId", xww0.m211405p(str), Integer.valueOf(iM13821h));
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    zzj().m211417F().m123937b("Audience with no ID. appId", xww0.m211405p(str));
                }
            }
            ArrayList arrayList = new ArrayList();
            for (C2310b c2310b2 : list) {
                arrayList.add(c2310b2.m13820N() ? Integer.valueOf(c2310b2.m13821h()) : null);
            }
            m136096A0(str, arrayList);
            sQLiteDatabaseM136166v.setTransactionSuccessful();
        } finally {
            sQLiteDatabaseM136166v.endTransaction();
        }
    }

    /* JADX INFO: renamed from: T0 */
    public final Map<Integer, C2315d0> m136131T0(String str) {
        m130251o();
        mo15092h();
        Preconditions.checkNotEmpty(str);
        Cursor cursor = null;
        try {
            try {
                Cursor cursorQuery = m136166v().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    Map<Integer, C2315d0> map = Collections.EMPTY_MAP;
                    cursorQuery.close();
                    return map;
                }
                e01 e01Var = new e01();
                do {
                    int i = cursorQuery.getInt(0);
                    try {
                        e01Var.put(Integer.valueOf(i), (C2315d0) ((AbstractC2349u0) ((C2315d0.a) pdy0.m168454K(C2315d0.m14110U(), cursorQuery.getBlob(1))).mo14369H()));
                    } catch (IOException e) {
                        zzj().m211412A().m123939d("Failed to merge filter results. appId, audienceId, error", xww0.m211405p(str), Integer.valueOf(i), e);
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                return e01Var;
            } catch (SQLiteException e2) {
                zzj().m211412A().m123938c("Database error querying filter results. appId", xww0.m211405p(str), e2);
                Map<Integer, C2315d0> map2 = Collections.EMPTY_MAP;
                if (0 != 0) {
                    cursor.close();
                }
                return map2;
            }
        } catch (Throwable th) {
            if (0 == 0) {
                throw th;
            }
            cursor.close();
            throw th;
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: U */
    public final void m136132U(String str, j2s0 j2s0Var) {
        Preconditions.checkNotNull(j2s0Var);
        mo15092h();
        m130251o();
        ContentValues contentValues = new ContentValues();
        contentValues.put(com.tencent.connect.common.Constants.JumpUrlConstants.URL_KEY_APPID, j2s0Var.f115951a);
        contentValues.put(AuthenticationTokenClaims.JSON_KEY_NAME, j2s0Var.f115952b);
        contentValues.put("lifetime_count", Long.valueOf(j2s0Var.f115953c));
        contentValues.put("current_bundle_count", Long.valueOf(j2s0Var.f115954d));
        contentValues.put("last_fire_timestamp", Long.valueOf(j2s0Var.f115956f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(j2s0Var.f115957g));
        contentValues.put("last_bundled_day", j2s0Var.f115958h);
        contentValues.put("last_sampled_complex_event_id", j2s0Var.f115959i);
        contentValues.put("last_sampling_rate", j2s0Var.f115960j);
        contentValues.put("current_session_count", Long.valueOf(j2s0Var.f115955e));
        Boolean bool = j2s0Var.f115961k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (m136166v().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                zzj().m211412A().m123937b("Failed to insert/update event aggregates (got -1). appId", xww0.m211405p(j2s0Var.f115951a));
            }
        } catch (SQLiteException e) {
            zzj().m211412A().m123938c("Error storing event aggregates. appId", xww0.m211405p(j2s0Var.f115951a), e);
        }
    }

    /* JADX INFO: renamed from: U0 */
    public final Map<Integer, List<C2312c>> m136133U0(String str) {
        Preconditions.checkNotEmpty(str);
        e01 e01Var = new e01();
        Cursor cursor = null;
        try {
            try {
                Cursor cursorQuery = m136166v().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    Map<Integer, List<C2312c>> map = Collections.EMPTY_MAP;
                    cursorQuery.close();
                    return map;
                }
                do {
                    try {
                        C2312c c2312c = (C2312c) ((AbstractC2349u0) ((C2312c.a) pdy0.m168454K(C2312c.m13831G(), cursorQuery.getBlob(1))).mo14369H());
                        if (c2312c.m13841V()) {
                            int i = cursorQuery.getInt(0);
                            List arrayList = (List) e01Var.get(Integer.valueOf(i));
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                e01Var.put(Integer.valueOf(i), arrayList);
                            }
                            arrayList.add(c2312c);
                        }
                    } catch (IOException e) {
                        zzj().m211412A().m123938c("Failed to merge filter. appId", xww0.m211405p(str), e);
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                return e01Var;
            } catch (SQLiteException e2) {
                zzj().m211412A().m123938c("Database error querying filters. appId", xww0.m211405p(str), e2);
                Map<Integer, List<C2312c>> map2 = Collections.EMPTY_MAP;
                if (0 != 0) {
                    cursor.close();
                }
                return map2;
            }
        } catch (Throwable th) {
            if (0 == 0) {
                throw th;
            }
            cursor.close();
            throw th;
        }
    }

    @VisibleForTesting
    @WorkerThread
    /* JADX INFO: renamed from: V */
    public final void m136134V(List<Long> list) {
        mo15092h();
        m130251o();
        Preconditions.checkNotNull(list);
        Preconditions.checkNotZero(list.size());
        if (m136160i0()) {
            String str = "(" + TextUtils.join(Constants.SEPARATOR_COMMA, list) + ")";
            if (m136169w0("SELECT COUNT(1) FROM queue WHERE rowid IN " + str + " AND retry_count =  2147483647 LIMIT 1", null) > 0) {
                zzj().m211417F().m123936a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                m136166v().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + str + " AND (retry_count IS NULL OR retry_count < 2147483647)");
            } catch (SQLiteException e) {
                zzj().m211412A().m123937b("Error incrementing retry count. error", e);
            }
        }
    }

    /* JADX INFO: renamed from: V0 */
    public final Map<Integer, List<Integer>> m136135V0(String str) {
        m130251o();
        mo15092h();
        Preconditions.checkNotEmpty(str);
        e01 e01Var = new e01();
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = m136166v().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str, str});
                if (!cursorRawQuery.moveToFirst()) {
                    Map<Integer, List<Integer>> map = Collections.EMPTY_MAP;
                    cursorRawQuery.close();
                    return map;
                }
                do {
                    int i = cursorRawQuery.getInt(0);
                    List arrayList = (List) e01Var.get(Integer.valueOf(i));
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        e01Var.put(Integer.valueOf(i), arrayList);
                    }
                    arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                } while (cursorRawQuery.moveToNext());
                cursorRawQuery.close();
                return e01Var;
            } catch (SQLiteException e) {
                zzj().m211412A().m123938c("Database error querying scoped filters. appId", xww0.m211405p(str), e);
                Map<Integer, List<Integer>> map2 = Collections.EMPTY_MAP;
                if (0 != 0) {
                    cursor.close();
                }
                return map2;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: W */
    public final void m136136W(j2s0 j2s0Var) {
        m136132U("events", j2s0Var);
    }

    @WorkerThread
    /* JADX INFO: renamed from: W0 */
    public final void m136137W0() {
        m130251o();
        m136166v().beginTransaction();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0045  */
    @WorkerThread
    /* JADX INFO: renamed from: X */
    public final void m136138X(thw0 thw0Var, boolean z, boolean z2) {
        Preconditions.checkNotNull(thw0Var);
        mo15092h();
        m130251o();
        String strM188993l = thw0Var.m188993l();
        Preconditions.checkNotNull(strM188993l);
        ContentValues contentValues = new ContentValues();
        contentValues.put(com.tencent.connect.common.Constants.JumpUrlConstants.URL_KEY_APPID, strM188993l);
        if (!t9y0.m187687a() || !mo15085a().m192648n(q8s0.f153267Z0)) {
            contentValues.put("app_instance_id", thw0Var.m188995m());
        } else if (z) {
            contentValues.put("app_instance_id", (String) null);
        } else if (this.f122162b.m15267P(strM188993l).m15347m(zzje.zza.ANALYTICS_STORAGE)) {
            contentValues.put("app_instance_id", thw0Var.m188995m());
        }
        contentValues.put("gmp_app_id", thw0Var.m189003q());
        if (!t9y0.m187687a() || !mo15085a().m192648n(q8s0.f153267Z0) || this.f122162b.m15267P(strM188993l).m15347m(zzje.zza.AD_STORAGE)) {
            contentValues.put("resettable_device_id_hash", thw0Var.m189007s());
        }
        contentValues.put("last_bundle_index", Long.valueOf(thw0Var.m188943F0()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(thw0Var.m188947H0()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(thw0Var.m188939D0()));
        contentValues.put("app_version", thw0Var.m188999o());
        contentValues.put("app_store", thw0Var.m188997n());
        contentValues.put("gmp_version", Long.valueOf(thw0Var.m189022z0()));
        contentValues.put("dev_cert_hash", Long.valueOf(thw0Var.m189010t0()));
        contentValues.put("measurement_enabled", Boolean.valueOf(thw0Var.m188932A()));
        contentValues.put("day", Long.valueOf(thw0Var.m189006r0()));
        contentValues.put("daily_public_events_count", Long.valueOf(thw0Var.m188996m0()));
        contentValues.put("daily_events_count", Long.valueOf(thw0Var.m188990j0()));
        contentValues.put("daily_conversions_count", Long.valueOf(thw0Var.m188978d0()));
        contentValues.put("config_fetched_time", Long.valueOf(thw0Var.m188972a0()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(thw0Var.m189018x0()));
        contentValues.put("app_version_int", Long.valueOf(thw0Var.m188965U()));
        contentValues.put("firebase_instance_id", thw0Var.m189001p());
        contentValues.put("daily_error_events_count", Long.valueOf(thw0Var.m188984g0()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(thw0Var.m189002p0()));
        contentValues.put("health_monitor_sample", thw0Var.m189005r());
        contentValues.put("android_id", Long.valueOf(thw0Var.m188961Q()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(thw0Var.m189021z()));
        contentValues.put("admob_app_id", thw0Var.m188989j());
        contentValues.put("dynamite_version", Long.valueOf(thw0Var.m189014v0()));
        if (!t9y0.m187687a() || !mo15085a().m192648n(q8s0.f153267Z0) || this.f122162b.m15267P(strM188993l).m15347m(zzje.zza.ANALYTICS_STORAGE)) {
            contentValues.put("session_stitching_token", thw0Var.m189011u());
        }
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(thw0Var.m188936C()));
        contentValues.put("target_os_version", Long.valueOf(thw0Var.m188951J0()));
        contentValues.put("session_stitching_token_hash", Long.valueOf(thw0Var.m188949I0()));
        if (mgy0.m154586a() && mo15085a().m192660z(strM188993l, q8s0.f153233I0)) {
            contentValues.put("ad_services_version", Integer.valueOf(thw0Var.m188971a()));
            contentValues.put("attribution_eligibility_status", Long.valueOf(thw0Var.m188968X()));
        }
        contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(thw0Var.m188938D()));
        contentValues.put("npa_metadata_value", thw0Var.m188953K0());
        if (ahy0.m96761a() && mo15085a().m192660z(strM188993l, q8s0.f153330y0)) {
            mo15089e();
            if (bey0.m101424B0(strM188993l)) {
                contentValues.put("bundle_delivery_index", Long.valueOf(thw0Var.m188935B0()));
            }
        }
        if (ahy0.m96761a() && mo15085a().m192660z(strM188993l, q8s0.f153332z0)) {
            contentValues.put("sgtm_preview_key", thw0Var.m189013v());
        }
        contentValues.put("dma_consent_state", Integer.valueOf(thw0Var.m188954L()));
        contentValues.put("daily_realtime_dcu_count", Integer.valueOf(thw0Var.m188942F()));
        contentValues.put("serialized_npa_metadata", thw0Var.m189009t());
        List<String> listM189015w = thw0Var.m189015w();
        if (listM189015w != null) {
            if (listM189015w.isEmpty()) {
                zzj().m211417F().m123937b("Safelisted events should not be an empty list. appId", strM188993l);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(Constants.SEPARATOR_COMMA, listM189015w));
            }
        }
        if (zay0.m217800a() && mo15085a().m192648n(q8s0.f153324v0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        if (mo15085a().m192648n(q8s0.f153263X0)) {
            contentValues.put("unmatched_pfo", thw0Var.m188955L0());
            contentValues.put("unmatched_uwa", thw0Var.m188957M0());
        }
        if (hey0.m130716a() && mo15085a().m192660z(strM188993l, q8s0.f153259V0)) {
            contentValues.put("ad_campaign_info", thw0Var.m188940E());
        }
        try {
            SQLiteDatabase sQLiteDatabaseM136166v = m136166v();
            if (sQLiteDatabaseM136166v.update("apps", contentValues, "app_id = ?", new String[]{strM188993l}) == 0 && sQLiteDatabaseM136166v.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                zzj().m211412A().m123937b("Failed to insert/update app (got -1). appId", xww0.m211405p(strM188993l));
            }
        } catch (SQLiteException e) {
            zzj().m211412A().m123938c("Error storing app. appId", xww0.m211405p(strM188993l), e);
        }
    }

    /* JADX INFO: renamed from: X0 */
    public final void m136139X0(String str) {
        mo15092h();
        m130251o();
        try {
            m136166v().execSQL("delete from default_event_params where app_id=?", new String[]{str});
        } catch (SQLiteException e) {
            zzj().m211412A().m123937b("Error clearing default event params", e);
        }
    }

    /* JADX INFO: renamed from: Y */
    public final boolean m136140Y(long j, q3s0 q3s0Var, long j2, boolean z) {
        mo15092h();
        m130251o();
        Preconditions.checkNotNull(q3s0Var);
        Preconditions.checkNotEmpty(q3s0Var.f152507a);
        byte[] bArrM14254g = mo15138i().m168489y(q3s0Var).m14254g();
        ContentValues contentValues = new ContentValues();
        contentValues.put(com.tencent.connect.common.Constants.JumpUrlConstants.URL_KEY_APPID, q3s0Var.f152507a);
        contentValues.put(AuthenticationTokenClaims.JSON_KEY_NAME, q3s0Var.f152508b);
        contentValues.put("timestamp", Long.valueOf(q3s0Var.f152510d));
        contentValues.put("metadata_fingerprint", Long.valueOf(j2));
        contentValues.put("data", bArrM14254g);
        contentValues.put("realtime", Integer.valueOf(z ? 1 : 0));
        try {
            long jUpdate = m136166v().update("raw_events", contentValues, "rowid = ?", new String[]{String.valueOf(j)});
            if (jUpdate == 1) {
                return true;
            }
            zzj().m211412A().m123938c("Failed to update raw event. appId, updatedRows", xww0.m211405p(q3s0Var.f152507a), Long.valueOf(jUpdate));
            return false;
        } catch (SQLiteException e) {
            zzj().m211412A().m123938c("Error updating raw event. appId", xww0.m211405p(q3s0Var.f152507a), e);
            return false;
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m136141Y0(String str) {
        j2s0 j2s0VarM136105F0;
        m136123P0("events_snapshot", str);
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = m136166v().query("events", (String[]) Collections.singletonList(AuthenticationTokenClaims.JSON_KEY_NAME).toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return;
                }
                do {
                    String string = cursorQuery.getString(0);
                    if (string != null && (j2s0VarM136105F0 = m136105F0(str, string)) != null) {
                        m136132U("events_snapshot", j2s0VarM136105F0);
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
            } catch (SQLiteException e) {
                zzj().m211412A().m123938c("Error creating snapshot. appId", xww0.m211405p(str), e);
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
            }
        } catch (Throwable th) {
            if (cursorQuery == null) {
                throw th;
            }
            cursorQuery.close();
            throw th;
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: Z */
    public final boolean m136142Z(C2313c0 c2313c0, boolean z) {
        mo15092h();
        m130251o();
        Preconditions.checkNotNull(c2313c0);
        Preconditions.checkNotEmpty(c2313c0.m13921A2());
        Preconditions.checkState(c2313c0.m13934O0());
        m136151d1();
        long jCurrentTimeMillis = zzb().currentTimeMillis();
        if (c2313c0.m13963f2() < jCurrentTimeMillis - u9r0.m192626J() || c2313c0.m13963f2() > u9r0.m192626J() + jCurrentTimeMillis) {
            zzj().m211417F().m123939d("Storing bundle outside of the max uploading time span. appId, now, timestamp", xww0.m211405p(c2313c0.m13921A2()), Long.valueOf(jCurrentTimeMillis), Long.valueOf(c2313c0.m13963f2()));
        }
        try {
            byte[] bArrM168482b0 = mo15138i().m168482b0(c2313c0.m14254g());
            zzj().m211416E().m123937b("Saving bundle, size", Integer.valueOf(bArrM168482b0.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put(com.tencent.connect.common.Constants.JumpUrlConstants.URL_KEY_APPID, c2313c0.m13921A2());
            contentValues.put("bundle_end_timestamp", Long.valueOf(c2313c0.m13963f2()));
            contentValues.put("data", bArrM168482b0);
            contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
            if (c2313c0.m13943V0()) {
                contentValues.put("retry_count", Integer.valueOf(c2313c0.m13923E1()));
            }
            try {
                if (m136166v().insert("queue", null, contentValues) != -1) {
                    return true;
                }
                zzj().m211412A().m123937b("Failed to insert bundle (got -1). appId", xww0.m211405p(c2313c0.m13921A2()));
                return false;
            } catch (SQLiteException e) {
                zzj().m211412A().m123938c("Error storing bundle. appId", xww0.m211405p(c2313c0.m13921A2()), e);
                return false;
            }
        } catch (IOException e2) {
            zzj().m211412A().m123938c("Data loss. Failed to serialize bundle. appId", xww0.m211405p(c2313c0.m13921A2()), e2);
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:65:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:70:0x0106 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x0108 A[ADDED_TO_REGION] */
    /* JADX INFO: renamed from: Z0 */
    public final void m136143Z0(String str) throws Throwable {
        boolean z;
        j2s0 j2s0VarM136101D0;
        ArrayList arrayList = new ArrayList(Arrays.asList(AuthenticationTokenClaims.JSON_KEY_NAME, "lifetime_count"));
        j2s0 j2s0VarM136105F0 = m136105F0(str, "_f");
        j2s0 j2s0VarM136105F1 = m136105F0(str, "_v");
        m136123P0("events", str);
        boolean z2 = false;
        Cursor cursorQuery = null;
        try {
            cursorQuery = m136166v().query("events_snapshot", (String[]) arrayList.toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
            if (!cursorQuery.moveToFirst()) {
                cursorQuery.close();
                if (j2s0VarM136105F0 != null) {
                    m136132U("events", j2s0VarM136105F0);
                } else if (j2s0VarM136105F1 != null) {
                    m136132U("events", j2s0VarM136105F1);
                }
                m136123P0("events_snapshot", str);
                return;
            }
            boolean z3 = false;
            z = false;
            do {
                try {
                    String string = cursorQuery.getString(0);
                    if (mo15085a().m192648n(q8s0.f153273b1)) {
                        if (cursorQuery.getLong(1) >= 1) {
                            if ("_f".equals(string)) {
                                z3 = true;
                            } else if ("_v".equals(string)) {
                                z = true;
                            }
                        }
                    } else if ("_f".equals(string)) {
                        z3 = true;
                    } else if ("_v".equals(string)) {
                        z = true;
                    }
                    if (string != null && (j2s0VarM136101D0 = m136101D0("events_snapshot", str, string)) != null) {
                        m136132U("events", j2s0VarM136101D0);
                    }
                } catch (SQLiteException e) {
                    e = e;
                    z2 = z3;
                    try {
                        zzj().m211412A().m123938c("Error querying snapshot. appId", xww0.m211405p(str), e);
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        if (!z2 && j2s0VarM136105F0 != null) {
                            m136132U("events", j2s0VarM136105F0);
                        } else if (!z && j2s0VarM136105F1 != null) {
                            m136132U("events", j2s0VarM136105F1);
                        }
                        m136123P0("events_snapshot", str);
                        return;
                    } catch (Throwable th) {
                        th = th;
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        if (z2 && j2s0VarM136105F0 != null) {
                            m136132U("events", j2s0VarM136105F0);
                        } else if (!z && j2s0VarM136105F1 != null) {
                            m136132U("events", j2s0VarM136105F1);
                        }
                        m136123P0("events_snapshot", str);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    z2 = z3;
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    if (z2) {
                        if (!z) {
                            m136132U("events", j2s0VarM136105F1);
                        }
                    } else if (!z) {
                        m136132U("events", j2s0VarM136105F1);
                    }
                    m136123P0("events_snapshot", str);
                    throw th;
                }
            } while (cursorQuery.moveToNext());
            cursorQuery.close();
            if (!z3 && j2s0VarM136105F0 != null) {
                m136132U("events", j2s0VarM136105F0);
            } else if (!z && j2s0VarM136105F1 != null) {
                m136132U("events", j2s0VarM136105F1);
            }
            m136123P0("events_snapshot", str);
        } catch (SQLiteException e2) {
            e = e2;
            z = false;
        } catch (Throwable th3) {
            th = th3;
            z = false;
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: a0 */
    public final boolean m136144a0(zzae zzaeVar) {
        Preconditions.checkNotNull(zzaeVar);
        mo15092h();
        m130251o();
        String str = zzaeVar.zza;
        Preconditions.checkNotNull(str);
        if (m136109H0(str, zzaeVar.zzc.zza) == null && m136169w0("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str}) >= 1000) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(com.tencent.connect.common.Constants.JumpUrlConstants.URL_KEY_APPID, str);
        contentValues.put("origin", zzaeVar.zzb);
        contentValues.put(AuthenticationTokenClaims.JSON_KEY_NAME, zzaeVar.zzc.zza);
        m136084N(contentValues, "value", Preconditions.checkNotNull(zzaeVar.zzc.m15359F()));
        contentValues.put(Active.TYPE, Boolean.valueOf(zzaeVar.zze));
        contentValues.put("trigger_event_name", zzaeVar.zzf);
        contentValues.put("trigger_timeout", Long.valueOf(zzaeVar.zzh));
        mo15089e();
        contentValues.put("timed_out_event", bey0.m101444k0(zzaeVar.zzg));
        contentValues.put("creation_timestamp", Long.valueOf(zzaeVar.zzd));
        mo15089e();
        contentValues.put("triggered_event", bey0.m101444k0(zzaeVar.zzi));
        contentValues.put("triggered_timestamp", Long.valueOf(zzaeVar.zzc.zzb));
        contentValues.put("time_to_live", Long.valueOf(zzaeVar.zzj));
        mo15089e();
        contentValues.put("expired_event", bey0.m101444k0(zzaeVar.zzk));
        try {
            if (m136166v().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().m211412A().m123937b("Failed to insert/update conditional user property (got -1)", xww0.m211405p(str));
            return true;
        } catch (SQLiteException e) {
            zzj().m211412A().m123938c("Error storing conditional user property", xww0.m211405p(str), e);
            return true;
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: a1 */
    public final boolean m136145a1(String str) {
        if (ahy0.m96761a() && !mo15085a().m192648n(q8s0.f153221C0)) {
            return false;
        }
        String strM136163t0 = m136163t0();
        StringBuilder sb = new StringBuilder("SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=? AND NOT ");
        sb.append(strM136163t0);
        return m136169w0(sb.toString(), new String[]{str}) != 0;
    }

    @WorkerThread
    /* JADX INFO: renamed from: b0 */
    public final boolean m136146b0(String str, int i, C2312c c2312c) {
        m130251o();
        mo15092h();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(c2312c);
        if (c2312c.m13836L().isEmpty()) {
            zzj().m211417F().m123939d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", xww0.m211405p(str), Integer.valueOf(i), String.valueOf(c2312c.m13842W() ? Integer.valueOf(c2312c.m13834E()) : null));
            return false;
        }
        byte[] bArrM14254g = c2312c.m14254g();
        ContentValues contentValues = new ContentValues();
        contentValues.put(com.tencent.connect.common.Constants.JumpUrlConstants.URL_KEY_APPID, str);
        contentValues.put("audience_id", Integer.valueOf(i));
        contentValues.put("filter_id", c2312c.m13842W() ? Integer.valueOf(c2312c.m13834E()) : null);
        contentValues.put("event_name", c2312c.m13836L());
        contentValues.put("session_scoped", c2312c.m13843X() ? Boolean.valueOf(c2312c.m13840U()) : null);
        contentValues.put("data", bArrM14254g);
        try {
            if (m136166v().insertWithOnConflict("event_filters", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().m211412A().m123937b("Failed to insert event filter (got -1). appId", xww0.m211405p(str));
            return true;
        } catch (SQLiteException e) {
            zzj().m211412A().m123938c("Error storing event filter. appId", xww0.m211405p(str), e);
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005d  */
    /* JADX INFO: renamed from: b1 */
    public final boolean m136147b1(String str) {
        boolean z;
        boolean z2;
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = m136166v().rawQuery("select timestamp from raw_events where app_id=? and name = '_f' limit 1;", new String[]{str});
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return false;
                }
                z = zzb().currentTimeMillis() < cursorRawQuery.getLong(0) + 15000;
                try {
                    z2 = m136095A("select count(*) from raw_events where app_id=? and name not like '!_%' escape '!' limit 1;", new String[]{str}, 0L) > 0;
                    cursorRawQuery.close();
                } catch (SQLiteException e) {
                    e = e;
                    zzj().m211412A().m123937b("Error checking backfill conditions", e);
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    z2 = false;
                }
                return (z || z2) ? false : true;
            } catch (Throwable th) {
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            z = false;
        }
        zzj().m211412A().m123937b("Error checking backfill conditions", e);
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        z2 = false;
        if (z) {
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: c0 */
    public final boolean m136148c0(String str, int i, C2316e c2316e) {
        m130251o();
        mo15092h();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(c2316e);
        if (c2316e.m14133G().isEmpty()) {
            zzj().m211417F().m123939d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", xww0.m211405p(str), Integer.valueOf(i), String.valueOf(c2316e.m14137M() ? Integer.valueOf(c2316e.m14139h()) : null));
            return false;
        }
        byte[] bArrM14254g = c2316e.m14254g();
        ContentValues contentValues = new ContentValues();
        contentValues.put(com.tencent.connect.common.Constants.JumpUrlConstants.URL_KEY_APPID, str);
        contentValues.put("audience_id", Integer.valueOf(i));
        contentValues.put("filter_id", c2316e.m14137M() ? Integer.valueOf(c2316e.m14139h()) : null);
        contentValues.put("property_name", c2316e.m14133G());
        contentValues.put("session_scoped", c2316e.m14138N() ? Boolean.valueOf(c2316e.m14136L()) : null);
        contentValues.put("data", bArrM14254g);
        try {
            if (m136166v().insertWithOnConflict("property_filters", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().m211412A().m123937b("Failed to insert property filter (got -1). appId", xww0.m211405p(str));
            return false;
        } catch (SQLiteException e) {
            zzj().m211412A().m123938c("Error storing property filter. appId", xww0.m211405p(str), e);
            return false;
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: c1 */
    public final void m136149c1() {
        m130251o();
        m136166v().endTransaction();
    }

    @WorkerThread
    /* JADX INFO: renamed from: d0 */
    public final boolean m136150d0(String str, zzfy$zzj zzfy_zzj, String str2, Map<String, String> map, zznt zzntVar) {
        int iDelete;
        mo15092h();
        m130251o();
        Preconditions.checkNotNull(zzfy_zzj);
        Preconditions.checkNotEmpty(str);
        if (ahy0.m96761a() && !mo15085a().m192648n(q8s0.f153221C0)) {
            return false;
        }
        mo15092h();
        m130251o();
        if (m136160i0()) {
            long jM187782a = mo15142m().f89772f.m187782a();
            long jElapsedRealtime = zzb().elapsedRealtime();
            if (Math.abs(jElapsedRealtime - jM187782a) > u9r0.m192627K()) {
                mo15142m().f89772f.m187783b(jElapsedRealtime);
                mo15092h();
                m130251o();
                if (m136160i0() && (iDelete = m136166v().delete("upload_queue", m136163t0(), new String[0])) > 0) {
                    zzj().m211416E().m123937b("Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted", Integer.valueOf(iDelete));
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(entry.getKey() + "=" + entry.getValue());
        }
        byte[] bArrM14254g = zzfy_zzj.m14254g();
        ContentValues contentValues = new ContentValues();
        contentValues.put(com.tencent.connect.common.Constants.JumpUrlConstants.URL_KEY_APPID, str);
        contentValues.put("measurement_batch", bArrM14254g);
        contentValues.put("upload_uri", str2);
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        if (size > 0) {
            sb.append((CharSequence) arrayList.get(0));
            int i = 1;
            while (i < size) {
                sb.append((CharSequence) "\r\n");
                Object obj = arrayList.get(i);
                i++;
                sb.append((CharSequence) obj);
            }
        }
        contentValues.put("upload_headers", sb.toString());
        contentValues.put("upload_type", Integer.valueOf(zzntVar.zza()));
        contentValues.put("creation_timestamp", Long.valueOf(zzb().currentTimeMillis()));
        contentValues.put("retry_count", (Integer) 0);
        try {
            if (m136166v().insert("upload_queue", null, contentValues) != -1) {
                return true;
            }
            zzj().m211412A().m123937b("Failed to insert MeasurementBatch (got -1) to upload_queue. appId", str);
            return false;
        } catch (SQLiteException e) {
            zzj().m211412A().m123938c("Error storing MeasurementBatch to upload_queue. appId", str, e);
            return false;
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: d1 */
    public final void m136151d1() {
        int iDelete;
        mo15092h();
        m130251o();
        if (m136160i0()) {
            long jM187782a = mo15142m().f89771e.m187782a();
            long jElapsedRealtime = zzb().elapsedRealtime();
            if (Math.abs(jElapsedRealtime - jM187782a) > u9r0.m192627K()) {
                mo15142m().f89771e.m187783b(jElapsedRealtime);
                mo15092h();
                m130251o();
                if (!m136160i0() || (iDelete = m136166v().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(zzb().currentTimeMillis()), String.valueOf(u9r0.m192626J())})) <= 0) {
                    return;
                }
                zzj().m211416E().m123937b("Deleted stale rows. rowsDeleted", Integer.valueOf(iDelete));
            }
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: e0 */
    public final boolean m136152e0(String str, zzno zznoVar) {
        mo15092h();
        m130251o();
        Preconditions.checkNotNull(zznoVar);
        Preconditions.checkNotEmpty(str);
        long jCurrentTimeMillis = zzb().currentTimeMillis();
        long j = zznoVar.zzb;
        tgw0<Long> tgw0Var = q8s0.f153293i0;
        if (j < jCurrentTimeMillis - tgw0Var.m188827a(null).longValue() || zznoVar.zzb > tgw0Var.m188827a(null).longValue() + jCurrentTimeMillis) {
            zzj().m211417F().m123939d("Storing trigger URI outside of the max retention time span. appId, now, timestamp", xww0.m211405p(str), Long.valueOf(jCurrentTimeMillis), Long.valueOf(zznoVar.zzb));
        }
        zzj().m211416E().m123936a("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put(com.tencent.connect.common.Constants.JumpUrlConstants.URL_KEY_APPID, str);
        contentValues.put("trigger_uri", zznoVar.zza);
        contentValues.put("source", Integer.valueOf(zznoVar.zzc));
        contentValues.put("timestamp_millis", Long.valueOf(zznoVar.zzb));
        try {
            if (m136166v().insert("trigger_uris", null, contentValues) != -1) {
                return true;
            }
            zzj().m211412A().m123937b("Failed to insert trigger URI (got -1). appId", xww0.m211405p(str));
            return false;
        } catch (SQLiteException e) {
            zzj().m211412A().m123938c("Error storing trigger URI. appId", xww0.m211405p(str), e);
            return false;
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: e1 */
    public final void m136153e1() {
        m130251o();
        m136166v().setTransactionSuccessful();
    }

    /* JADX INFO: renamed from: f0 */
    public final boolean m136154f0(String str, Long l2, long j, C2356y c2356y) {
        mo15092h();
        m130251o();
        Preconditions.checkNotNull(c2356y);
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(l2);
        byte[] bArrM14254g = c2356y.m14254g();
        zzj().m211416E().m123938c("Saving complex main event, appId, data size", mo15087c().m175776c(str), Integer.valueOf(bArrM14254g.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put(com.tencent.connect.common.Constants.JumpUrlConstants.URL_KEY_APPID, str);
        contentValues.put("event_id", l2);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", bArrM14254g);
        try {
            if (m136166v().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().m211412A().m123937b("Failed to insert complex main event (got -1). appId", xww0.m211405p(str));
            return false;
        } catch (SQLiteException e) {
            zzj().m211412A().m123938c("Error storing complex main event. appId", xww0.m211405p(str), e);
            return false;
        }
    }

    /* JADX INFO: renamed from: f1 */
    public final boolean m136155f1() {
        return m136169w0("select count(1) > 0 from raw_events", null) != 0;
    }

    /* JADX INFO: renamed from: g0 */
    public final boolean m136156g0(q3s0 q3s0Var, long j, boolean z) {
        mo15092h();
        m130251o();
        Preconditions.checkNotNull(q3s0Var);
        Preconditions.checkNotEmpty(q3s0Var.f152507a);
        byte[] bArrM14254g = mo15138i().m168489y(q3s0Var).m14254g();
        ContentValues contentValues = new ContentValues();
        contentValues.put(com.tencent.connect.common.Constants.JumpUrlConstants.URL_KEY_APPID, q3s0Var.f152507a);
        contentValues.put(AuthenticationTokenClaims.JSON_KEY_NAME, q3s0Var.f152508b);
        contentValues.put("timestamp", Long.valueOf(q3s0Var.f152510d));
        contentValues.put("metadata_fingerprint", Long.valueOf(j));
        contentValues.put("data", bArrM14254g);
        contentValues.put("realtime", Integer.valueOf(z ? 1 : 0));
        try {
            if (m136166v().insert("raw_events", null, contentValues) != -1) {
                return true;
            }
            zzj().m211412A().m123937b("Failed to insert raw event (got -1). appId", xww0.m211405p(q3s0Var.f152507a));
            return false;
        } catch (SQLiteException e) {
            zzj().m211412A().m123938c("Error storing raw event. appId", xww0.m211405p(q3s0Var.f152507a), e);
            return false;
        }
    }

    /* JADX INFO: renamed from: g1 */
    public final boolean m136157g1() {
        return m136169w0("select count(1) > 0 from queue where has_realtime = 1", null) != 0;
    }

    @WorkerThread
    /* JADX INFO: renamed from: h0 */
    public final boolean m136158h0(sdy0 sdy0Var) {
        Preconditions.checkNotNull(sdy0Var);
        mo15092h();
        m130251o();
        if (m136109H0(sdy0Var.f163920a, sdy0Var.f163922c) == null) {
            if (bey0.m101427E0(sdy0Var.f163922c)) {
                if (m136169w0("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{sdy0Var.f163920a}) >= mo15085a().m192645k(sdy0Var.f163920a, q8s0.f153234J, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(sdy0Var.f163922c) && m136169w0("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{sdy0Var.f163920a, sdy0Var.f163921b}) >= 25) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(com.tencent.connect.common.Constants.JumpUrlConstants.URL_KEY_APPID, sdy0Var.f163920a);
        contentValues.put("origin", sdy0Var.f163921b);
        contentValues.put(AuthenticationTokenClaims.JSON_KEY_NAME, sdy0Var.f163922c);
        contentValues.put("set_timestamp", Long.valueOf(sdy0Var.f163923d));
        m136084N(contentValues, "value", sdy0Var.f163924e);
        try {
            if (m136166v().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().m211412A().m123937b("Failed to insert/update user property (got -1). appId", xww0.m211405p(sdy0Var.f163920a));
            return true;
        } catch (SQLiteException e) {
            zzj().m211412A().m123938c("Error storing user property. appId", xww0.m211405p(sdy0Var.f163920a), e);
            return true;
        }
    }

    /* JADX INFO: renamed from: h1 */
    public final boolean m136159h1() {
        return m136169w0("select count(1) > 0 from raw_events where realtime = 1", null) != 0;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: i0 */
    public final boolean m136160i0() {
        return zza().getDatabasePath("google_app_measurement.db").exists();
    }

    @Override // p149l.hay0
    /* JADX INFO: renamed from: r */
    public final boolean mo15144r() {
        return false;
    }

    /* JADX INFO: renamed from: s */
    public final long m136161s() {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = m136166v().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return -1L;
                }
                long j = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j;
            } catch (SQLiteException e) {
                zzj().m211412A().m123937b("Error querying raw events", e);
                if (cursorRawQuery != null) {
                    cursorRawQuery.close();
                }
                return -1L;
            }
        } catch (Throwable th) {
            if (cursorRawQuery != null) {
                cursorRawQuery.close();
            }
            throw th;
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: t */
    public final long m136162t() {
        return m136095A("select max(bundle_end_timestamp) from queue", null, 0L);
    }

    /* JADX INFO: renamed from: t0 */
    public final String m136163t0() {
        long jCurrentTimeMillis = zzb().currentTimeMillis();
        zznt zzntVar = zznt.GOOGLE_SIGNAL;
        return "(" + ("(upload_type = " + zzntVar.zza() + " AND (ABS(creation_timestamp - " + jCurrentTimeMillis + ") > CAST(" + q8s0.f153228G.m188827a(null).longValue() + " AS INTEGER)))") + " OR " + ("(upload_type != " + zzntVar.zza() + " AND (ABS(creation_timestamp - " + jCurrentTimeMillis + ") > CAST(" + u9r0.m192626J() + " AS INTEGER)))") + ")";
    }

    @WorkerThread
    /* JADX INFO: renamed from: u */
    public final long m136164u() {
        return m136095A("select max(timestamp) from raw_events", null, 0L);
    }

    @WorkerThread
    /* JADX INFO: renamed from: u0 */
    public final long m136165u0(String str) {
        Preconditions.checkNotEmpty(str);
        mo15092h();
        m130251o();
        return m136095A("select first_open_count from app2 where app_id=?", new String[]{str}, -1L);
    }

    @VisibleForTesting
    @WorkerThread
    /* JADX INFO: renamed from: v */
    public final SQLiteDatabase m136166v() {
        mo15092h();
        try {
            return this.f113161d.getWritableDatabase();
        } catch (SQLiteException e) {
            zzj().m211417F().m123937b("Error opening database", e);
            throw e;
        }
    }

    @VisibleForTesting
    @WorkerThread
    /* JADX INFO: renamed from: v0 */
    public final long m136167v0(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        mo15092h();
        m130251o();
        SQLiteDatabase sQLiteDatabaseM136166v = m136166v();
        sQLiteDatabaseM136166v.beginTransaction();
        long j = 0;
        try {
            try {
                long jM136095A = m136095A("select " + str2 + " from app2 where app_id=?", new String[]{str}, -1L);
                if (jM136095A == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(com.tencent.connect.common.Constants.JumpUrlConstants.URL_KEY_APPID, str);
                    contentValues.put("first_open_count", (Integer) 0);
                    contentValues.put("previous_install_count", (Integer) 0);
                    if (sQLiteDatabaseM136166v.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                        zzj().m211412A().m123938c("Failed to insert column (got -1). appId", xww0.m211405p(str), str2);
                        return -1L;
                    }
                    jM136095A = 0;
                    zzj().m211412A().m123939d("Error inserting column. appId", xww0.m211405p(str), str2, e);
                    return j;
                }
                try {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put(com.tencent.connect.common.Constants.JumpUrlConstants.URL_KEY_APPID, str);
                    contentValues2.put(str2, Long.valueOf(1 + jM136095A));
                    if (sQLiteDatabaseM136166v.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                        zzj().m211412A().m123938c("Failed to update column (got 0). appId", xww0.m211405p(str), str2);
                        return -1L;
                    }
                    sQLiteDatabaseM136166v.setTransactionSuccessful();
                    return jM136095A;
                } catch (SQLiteException e) {
                    e = e;
                    j = jM136095A;
                }
            } finally {
                sQLiteDatabaseM136166v.endTransaction();
            }
        } catch (SQLiteException e2) {
            e = e2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x003c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v2 */
    @WorkerThread
    /* JADX INFO: renamed from: w */
    public final String m136168w() throws Throwable {
        Cursor cursorRawQuery;
        SQLiteDatabase sQLiteDatabaseM136166v = m136166v();
        ?? r1 = 0;
        try {
            try {
                cursorRawQuery = sQLiteDatabaseM136166v.rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
                try {
                    if (!cursorRawQuery.moveToFirst()) {
                        cursorRawQuery.close();
                        return null;
                    }
                    String string = cursorRawQuery.getString(0);
                    cursorRawQuery.close();
                    return string;
                } catch (SQLiteException e) {
                    e = e;
                    zzj().m211412A().m123937b("Database error getting next bundle app id", e);
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                r1 = sQLiteDatabaseM136166v;
                if (r1 != 0) {
                    r1.close();
                }
                throw th;
            }
        } catch (SQLiteException e2) {
            e = e2;
            cursorRawQuery = null;
        } catch (Throwable th2) {
            th = th2;
            if (r1 != 0) {
                r1.close();
            }
            throw th;
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: w0 */
    public final long m136169w0(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = m136166v().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j;
            } catch (SQLiteException e) {
                zzj().m211412A().m123938c("Database error", str, e);
                throw e;
            }
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: x */
    public final int m136170x(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        mo15092h();
        m130251o();
        try {
            return m136166v().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            zzj().m211412A().m123939d("Error deleting conditional property", xww0.m211405p(str), mo15087c().m175779g(str2), e);
            return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0108  */
    @WorkerThread
    /* JADX INFO: renamed from: x0 */
    public final List<sdy0> m136171x0(String str, String str2, String str3) {
        igr0 igr0Var;
        String string;
        Preconditions.checkNotEmpty(str);
        mo15092h();
        m130251o();
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                ArrayList arrayList2 = new ArrayList(3);
                String str4 = str;
                arrayList2.add(str4);
                StringBuilder sb = new StringBuilder("app_id=?");
                if (TextUtils.isEmpty(str2)) {
                    string = str2;
                } else {
                    string = str2;
                    try {
                        arrayList2.add(string);
                        sb.append(" and origin=?");
                    } catch (SQLiteException e) {
                        e = e;
                        igr0Var = this;
                        igr0Var.zzj().m211412A().m123939d("(2)Error querying user properties", xww0.m211405p(str), string, e);
                        List<sdy0> list = Collections.EMPTY_LIST;
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return list;
                    }
                }
                if (!TextUtils.isEmpty(str3)) {
                    arrayList2.add(str3 + "*");
                    sb.append(" and name glob ?");
                }
                cursorQuery = m136166v().query("user_attributes", new String[]{AuthenticationTokenClaims.JSON_KEY_NAME, "set_timestamp", "value", "origin"}, sb.toString(), (String[]) arrayList2.toArray(new String[arrayList2.size()]), null, null, "rowid", "1001");
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return arrayList;
                }
                while (arrayList.size() < 1000) {
                    String string2 = cursorQuery.getString(0);
                    long j = cursorQuery.getLong(1);
                    igr0Var = this;
                    try {
                        Object objM136100D = igr0Var.m136100D(cursorQuery, 2);
                        string = cursorQuery.getString(3);
                        if (objM136100D == null) {
                            igr0Var.zzj().m211412A().m123939d("(2)Read invalid user property value, ignoring it", xww0.m211405p(str4), string, str3);
                        } else {
                            arrayList.add(new sdy0(str4, string, string2, j, objM136100D));
                        }
                        if (!cursorQuery.moveToNext()) {
                            cursorQuery.close();
                            return arrayList;
                        }
                        str4 = str;
                    } catch (SQLiteException e2) {
                        e = e2;
                        igr0Var.zzj().m211412A().m123939d("(2)Error querying user properties", xww0.m211405p(str), string, e);
                        List<sdy0> list2 = Collections.EMPTY_LIST;
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return list2;
                    }
                }
                zzj().m211412A().m123937b("Read more than the max allowed user properties, ignoring excess", 1000);
                cursorQuery.close();
                return arrayList;
            } catch (Throwable th) {
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                throw th;
            }
        } catch (SQLiteException e3) {
            e = e3;
            igr0Var = this;
            string = str2;
        }
    }

    /* JADX INFO: renamed from: y */
    public final long m136172y(C2313c0 c2313c0) throws IOException {
        mo15092h();
        m130251o();
        Preconditions.checkNotNull(c2313c0);
        Preconditions.checkNotEmpty(c2313c0.m13921A2());
        byte[] bArrM14254g = c2313c0.m14254g();
        long jM168486u = mo15138i().m168486u(bArrM14254g);
        ContentValues contentValues = new ContentValues();
        contentValues.put(com.tencent.connect.common.Constants.JumpUrlConstants.URL_KEY_APPID, c2313c0.m13921A2());
        contentValues.put("metadata_fingerprint", Long.valueOf(jM168486u));
        contentValues.put("metadata", bArrM14254g);
        try {
            m136166v().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
            return jM168486u;
        } catch (SQLiteException e) {
            zzj().m211412A().m123938c("Error storing raw event metadata. appId", xww0.m211405p(c2313c0.m13921A2()), e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final void m136173y0(String str, zzje zzjeVar) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(zzjeVar);
        mo15092h();
        m130251o();
        ContentValues contentValues = new ContentValues();
        contentValues.put(com.tencent.connect.common.Constants.JumpUrlConstants.URL_KEY_APPID, str);
        contentValues.put("consent_state", zzjeVar.m15356x());
        contentValues.put("consent_source", Integer.valueOf(zzjeVar.m15345b()));
        m136128S("consent_settings", com.tencent.connect.common.Constants.JumpUrlConstants.URL_KEY_APPID, contentValues);
    }

    /* JADX INFO: renamed from: z */
    public final long m136174z(String str) {
        Preconditions.checkNotEmpty(str);
        mo15092h();
        m130251o();
        try {
            return m136166v().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(PlaybackException.CUSTOM_ERROR_CODE_BASE, mo15085a().m192651q(str, q8s0.f153313q))))});
        } catch (SQLiteException e) {
            zzj().m211412A().m123938c("Error deleting over the limit events. appId", xww0.m211405p(str), e);
            return 0L;
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final boolean m136175z0(String str, Bundle bundle) {
        mo15092h();
        m130251o();
        byte[] bArrM14254g = mo15138i().m168489y(new q3s0(this.f165891a, "", str, "dep", 0L, 0L, bundle)).m14254g();
        zzj().m211416E().m123938c("Saving default event parameters, appId, data size", mo15087c().m175776c(str), Integer.valueOf(bArrM14254g.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put(com.tencent.connect.common.Constants.JumpUrlConstants.URL_KEY_APPID, str);
        contentValues.put("parameters", bArrM14254g);
        try {
            if (m136166v().insertWithOnConflict("default_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().m211412A().m123937b("Failed to insert default event parameters (got -1). appId", xww0.m211405p(str));
            return false;
        } catch (SQLiteException e) {
            zzj().m211412A().m123938c("Error storing default event parameters. appId", xww0.m211405p(str), e);
            return false;
        }
    }
}
