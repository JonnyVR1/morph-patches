package p153l;

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
import com.google.android.gms.internal.measurement.AbstractC2372u0;
import com.google.android.gms.internal.measurement.C2331a0;
import com.google.android.gms.internal.measurement.C2333b;
import com.google.android.gms.internal.measurement.C2335c;
import com.google.android.gms.internal.measurement.C2336c0;
import com.google.android.gms.internal.measurement.C2337d;
import com.google.android.gms.internal.measurement.C2338d0;
import com.google.android.gms.internal.measurement.C2339e;
import com.google.android.gms.internal.measurement.C2342f0;
import com.google.android.gms.internal.measurement.C2379y;
import com.google.android.gms.internal.measurement.zzfy$zzj;
import com.google.android.gms.measurement.internal.C2476b;
import com.google.android.gms.measurement.internal.C2484j;
import com.google.android.gms.measurement.internal.zzae;
import com.google.android.gms.measurement.internal.zzbf;
import com.google.android.gms.measurement.internal.zzje;
import com.google.android.gms.measurement.internal.zzno;
import com.google.android.gms.measurement.internal.zznt;
import com.google.android.gms.measurement.internal.zzon;
import com.p051p1.mobile.putong.core.data.Active;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class opr0 extends njy0 {

    /* JADX INFO: renamed from: f */
    public static final String[] f148482f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* JADX INFO: renamed from: g */
    public static final String[] f148483g = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* JADX INFO: renamed from: h */
    public static final String[] f148484h = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;", "e_tag", "ALTER TABLE apps ADD COLUMN e_tag TEXT;", "session_stitching_token", "ALTER TABLE apps ADD COLUMN session_stitching_token TEXT;", "sgtm_upload_enabled", "ALTER TABLE apps ADD COLUMN sgtm_upload_enabled INTEGER;", "target_os_version", "ALTER TABLE apps ADD COLUMN target_os_version INTEGER;", "session_stitching_token_hash", "ALTER TABLE apps ADD COLUMN session_stitching_token_hash INTEGER;", "ad_services_version", "ALTER TABLE apps ADD COLUMN ad_services_version INTEGER;", "unmatched_first_open_without_ad_id", "ALTER TABLE apps ADD COLUMN unmatched_first_open_without_ad_id INTEGER;", "npa_metadata_value", "ALTER TABLE apps ADD COLUMN npa_metadata_value INTEGER;", "attribution_eligibility_status", "ALTER TABLE apps ADD COLUMN attribution_eligibility_status INTEGER;", "sgtm_preview_key", "ALTER TABLE apps ADD COLUMN sgtm_preview_key TEXT;", "dma_consent_state", "ALTER TABLE apps ADD COLUMN dma_consent_state INTEGER;", "daily_realtime_dcu_count", "ALTER TABLE apps ADD COLUMN daily_realtime_dcu_count INTEGER;", "bundle_delivery_index", "ALTER TABLE apps ADD COLUMN bundle_delivery_index INTEGER;", "serialized_npa_metadata", "ALTER TABLE apps ADD COLUMN serialized_npa_metadata TEXT;", "unmatched_pfo", "ALTER TABLE apps ADD COLUMN unmatched_pfo INTEGER;", "unmatched_uwa", "ALTER TABLE apps ADD COLUMN unmatched_uwa INTEGER;", "ad_campaign_info", "ALTER TABLE apps ADD COLUMN ad_campaign_info BLOB;", "daily_registered_triggers_count", "ALTER TABLE apps ADD COLUMN daily_registered_triggers_count INTEGER;"};

    /* JADX INFO: renamed from: i */
    public static final String[] f148485i = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* JADX INFO: renamed from: j */
    public static final String[] f148486j = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* JADX INFO: renamed from: k */
    public static final String[] f148487k = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* JADX INFO: renamed from: l */
    public static final String[] f148488l = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* JADX INFO: renamed from: m */
    public static final String[] f148489m = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* JADX INFO: renamed from: n */
    public static final String[] f148490n = {"consent_source", "ALTER TABLE consent_settings ADD COLUMN consent_source INTEGER;", "dma_consent_settings", "ALTER TABLE consent_settings ADD COLUMN dma_consent_settings TEXT;", "storage_consent_at_bundling", "ALTER TABLE consent_settings ADD COLUMN storage_consent_at_bundling TEXT;"};

    /* JADX INFO: renamed from: o */
    public static final String[] f148491o = {"idempotent", "CREATE INDEX IF NOT EXISTS trigger_uris_index ON trigger_uris (app_id);"};

    /* JADX INFO: renamed from: d */
    public final b0s0 f148492d;

    /* JADX INFO: renamed from: e */
    public final xiy0 f148493e;

    public opr0(C2484j c2484j) {
        super(c2484j);
        this.f148493e = new xiy0(zzb());
        this.f148492d = new b0s0(this, zza(), "google_app_measurement.db");
    }

    @WorkerThread
    /* JADX INFO: renamed from: N */
    public static void m168683N(ContentValues contentValues, String str, Object obj) {
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
            wg3.m206174a("Invalid value type");
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0030  */
    @WorkerThread
    /* JADX INFO: renamed from: A */
    public final long m168694A(String str, String[] strArr, long j) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = m168765v().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return j;
                }
                long j2 = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j2;
            } catch (SQLiteException e) {
                zzj().m114558A().m153302c("Database error", str, e);
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
    public final boolean m168695A0(String str, List<Integer> list) {
        Preconditions.checkNotEmpty(str);
        m163482o();
        mo15146h();
        SQLiteDatabase sQLiteDatabaseM168765v = m168765v();
        try {
            long jM168768w0 = m168768w0("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int iMax = Math.max(0, Math.min(2000, mo15139a().m98443q(str, whs0.f189208I)));
            if (jM168768w0 <= iMax) {
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
            return sQLiteDatabaseM168765v.delete("audience_filter_values", sb.toString(), new String[]{str, Integer.toString(iMax)}) > 0;
        } catch (SQLiteException e) {
            zzj().m114558A().m153302c("Database error querying filters. appId", d6x0.m114551p(str), e);
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008c  */
    /* JADX WARN: Not initialized variable reg: 1, insn: 0x0031: MOVE (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]) (LINE:50), block:B:10:0x0031 */
    /* JADX INFO: renamed from: B */
    public final Pair<C2379y, Long> m168696B(String str, Long l2) throws Throwable {
        Cursor cursorRawQuery;
        Cursor cursor;
        mo15146h();
        m163482o();
        Cursor cursor2 = null;
        try {
            try {
                cursorRawQuery = m168765v().rawQuery("select main_event, children_to_process from main_event_params where app_id=? and event_id=?", new String[]{str, String.valueOf(l2)});
                try {
                    if (!cursorRawQuery.moveToFirst()) {
                        zzj().m114562E().m153300a("Main event not found");
                        cursorRawQuery.close();
                        return null;
                    }
                    try {
                        Pair<C2379y, Long> pairCreate = Pair.create((C2379y) ((AbstractC2372u0) ((C2379y.a) vmy0.m201859K(C2379y.m14548V(), cursorRawQuery.getBlob(0))).mo14423H()), Long.valueOf(cursorRawQuery.getLong(1)));
                        cursorRawQuery.close();
                        return pairCreate;
                    } catch (IOException e) {
                        zzj().m114558A().m153303d("Failed to merge main event. appId, eventId", d6x0.m114551p(str), l2, e);
                        cursorRawQuery.close();
                        return null;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    zzj().m114558A().m153301b("Error selecting main event", e);
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
    public final long m168697B0(String str) {
        Preconditions.checkNotEmpty(str);
        return m168694A("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    /* JADX WARN: Code duplicated, block: B:40:0x0119  */
    @WorkerThread
    /* JADX INFO: renamed from: C0 */
    public final zzae m168698C0(String str, String str2) throws Throwable {
        String str3;
        Cursor cursorQuery;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        mo15146h();
        m163482o();
        Cursor cursor = null;
        try {
            cursorQuery = m168765v().query("conditional_properties", new String[]{"origin", "value", Active.TYPE, "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
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
                    Object objM168699D = m168699D(cursorQuery, 1);
                    boolean z = cursorQuery.getInt(2) != 0;
                    String string2 = cursorQuery.getString(3);
                    long j = cursorQuery.getLong(4);
                    vmy0 vmy0VarMo15192i = mo15192i();
                    byte[] blob = cursorQuery.getBlob(5);
                    Parcelable.Creator<zzbf> creator = zzbf.CREATOR;
                    zzbf zzbfVar = (zzbf) vmy0VarMo15192i.m201893x(blob, creator);
                    str3 = str2;
                    try {
                        zzae zzaeVar = new zzae(str, str4, new zzon(str3, cursorQuery.getLong(8), objM168699D, str4), cursorQuery.getLong(6), z, string2, zzbfVar, j, (zzbf) mo15192i().m201893x(cursorQuery.getBlob(7), creator), cursorQuery.getLong(9), (zzbf) mo15192i().m201893x(cursorQuery.getBlob(10), creator));
                        if (cursorQuery.moveToNext()) {
                            zzj().m114558A().m153302c("Got multiple records for conditional property, expected one", d6x0.m114551p(str), mo15141c().m208452g(str3));
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
        zzj().m114558A().m153303d("Error querying conditional property", d6x0.m114551p(str), mo15141c().m208452g(str3), e);
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    @VisibleForTesting
    @WorkerThread
    /* JADX INFO: renamed from: D */
    public final Object m168699D(Cursor cursor, int i) {
        int type = cursor.getType(i);
        if (type == 0) {
            zzj().m114558A().m153300a("Loaded invalid null value from database");
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
            zzj().m114558A().m153301b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
            return null;
        }
        zzj().m114558A().m153300a("Loaded invalid blob type value, ignoring it");
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:53:0x012a  */
    /* JADX WARN: Multi-variable type inference failed */
    @WorkerThread
    /* JADX INFO: renamed from: D0 */
    public final pbs0 m168700D0(String str, String str2, String str3) throws Throwable {
        Cursor cursorQuery;
        Boolean boolValueOf;
        Preconditions.checkNotEmpty(str2);
        Preconditions.checkNotEmpty(str3);
        mo15146h();
        m163482o();
        CursorWrapper cursorWrapper = 0;
        try {
            try {
                cursorQuery = m168765v().query(str, (String[]) new ArrayList(Arrays.asList("lifetime_count", "current_bundle_count", "last_fire_timestamp", "last_bundled_timestamp", "last_bundled_day", "last_sampled_complex_event_id", "last_sampling_rate", "last_exempt_from_sampling", "current_session_count")).toArray(new String[0]), "app_id=? and name=?", new String[]{str2, str3}, null, null, null);
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
                    pbs0 pbs0Var = new pbs0(str2, str3, j, j2, cursorQuery.isNull(8) ? 0L : cursorQuery.getLong(8), j3, j4, lValueOf, lValueOf2, lValueOf3, boolValueOf);
                    if (cursorQuery.moveToNext()) {
                        zzj().m114558A().m153301b("Got multiple records for event aggregates, expected one. appId", d6x0.m114551p(str2));
                    }
                    cursorQuery.close();
                    return pbs0Var;
                } catch (SQLiteException e) {
                    e = e;
                    zzj().m114558A().m153303d("Error querying events. appId", d6x0.m114551p(str2), mo15141c().m208449c(str3), e);
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
    public final <T> T m168701E(String str, String[] strArr, b1s0<T> b1s0Var) throws Throwable {
        Cursor cursorRawQuery;
        ?? r0 = 0;
        try {
            try {
                cursorRawQuery = m168765v().rawQuery(str, strArr);
                try {
                    if (cursorRawQuery.moveToFirst()) {
                        T tMo101502a = b1s0Var.mo101502a(cursorRawQuery);
                        cursorRawQuery.close();
                        return tMo101502a;
                    }
                    zzj().m114562E().m153300a("No data found");
                    cursorRawQuery.close();
                    return null;
                } catch (SQLiteException e) {
                    e = e;
                    zzj().m114558A().m153301b("Error querying database.", e);
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
    public final Bundle m168702E0(String str) throws Throwable {
        Cursor cursorRawQuery;
        Cursor cursor;
        mo15146h();
        m163482o();
        Cursor cursor2 = null;
        try {
            try {
                cursorRawQuery = m168765v().rawQuery("select parameters from default_event_params where app_id=?", new String[]{str});
                try {
                    if (!cursorRawQuery.moveToFirst()) {
                        zzj().m114562E().m153300a("Default event parameters not found");
                        cursorRawQuery.close();
                        return null;
                    }
                    try {
                        C2379y c2379y = (C2379y) ((AbstractC2372u0) ((C2379y.a) vmy0.m201859K(C2379y.m14548V(), cursorRawQuery.getBlob(0))).mo14423H());
                        mo15192i();
                        Bundle bundleM201873v = vmy0.m201873v(c2379y.m14555Y());
                        cursorRawQuery.close();
                        return bundleM201873v;
                    } catch (IOException e) {
                        zzj().m114558A().m153302c("Failed to retrieve default event parameters. appId", d6x0.m114551p(str), e);
                        cursorRawQuery.close();
                        return null;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    zzj().m114558A().m153301b("Error selecting default event parameters", e);
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
    public final String m168703F(long j) throws Throwable {
        Cursor cursorRawQuery;
        mo15146h();
        m163482o();
        ?? r0 = 0;
        try {
            try {
                cursorRawQuery = m168765v().rawQuery("select app_id from apps where app_id in (select distinct app_id from raw_events) and config_fetched_time < ? order by failed_config_fetch_time limit 1;", new String[]{String.valueOf((long) j)});
                try {
                    if (cursorRawQuery.moveToFirst()) {
                        String string = cursorRawQuery.getString(0);
                        cursorRawQuery.close();
                        return string;
                    }
                    zzj().m114562E().m153300a("No expired configs for apps with pending events");
                    cursorRawQuery.close();
                    return null;
                } catch (SQLiteException e) {
                    e = e;
                    zzj().m114558A().m153301b("Error selecting expired configs", e);
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
    public final pbs0 m168704F0(String str, String str2) {
        return m168700D0("events", str, str2);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0030  */
    @WorkerThread
    /* JADX INFO: renamed from: G */
    public final String m168705G(String str, String[] strArr, String str2) {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = m168765v().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return str2;
                }
                String string = cursorRawQuery.getString(0);
                cursorRawQuery.close();
                return string;
            } catch (SQLiteException e) {
                zzj().m114558A().m153302c("Database error", str, e);
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
    public final zqw0 m168706G0(String str) {
        Cursor cursorQuery;
        Boolean boolValueOf;
        Preconditions.checkNotEmpty(str);
        mo15146h();
        m163482o();
        Cursor cursor = null;
        try {
            cursorQuery = m168765v().query("apps", new String[]{"app_instance_id", "gmp_app_id", "resettable_device_id_hash", "last_bundle_index", "last_bundle_start_timestamp", "last_bundle_end_timestamp", "app_version", "app_store", "gmp_version", "dev_cert_hash", "measurement_enabled", "day", "daily_public_events_count", "daily_events_count", "daily_conversions_count", "config_fetched_time", "failed_config_fetch_time", "app_version_int", "firebase_instance_id", "daily_error_events_count", "daily_realtime_events_count", "health_monitor_sample", "android_id", "adid_reporting_enabled", "admob_app_id", "dynamite_version", "safelisted_events", "ga_app_id", "session_stitching_token", "sgtm_upload_enabled", "target_os_version", "session_stitching_token_hash", "ad_services_version", "unmatched_first_open_without_ad_id", "npa_metadata_value", "attribution_eligibility_status", "sgtm_preview_key", "dma_consent_state", "daily_realtime_dcu_count", "bundle_delivery_index", "serialized_npa_metadata", "unmatched_pfo", "unmatched_uwa", "ad_campaign_info"}, "app_id=?", new String[]{str}, null, null, null);
            try {
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    zqw0 zqw0Var = new zqw0(this.f158066b.m15353o0(), str);
                    if (!ziy0.m219953a() || !mo15139a().m98440n(whs0.f189243Z0) || this.f158066b.m15321P(str).m15401m(zzje.zza.ANALYTICS_STORAGE)) {
                        zqw0Var.m221078J(cursorQuery.getString(0));
                    }
                    zqw0Var.m221098Z(cursorQuery.getString(1));
                    if (!ziy0.m219953a() || !mo15139a().m98440n(whs0.f189243Z0) || this.f158066b.m15321P(str).m15401m(zzje.zza.AD_STORAGE)) {
                        zqw0Var.m221110f0(cursorQuery.getString(2));
                    }
                    zqw0Var.m221061A0(cursorQuery.getLong(3));
                    zqw0Var.m221065C0(cursorQuery.getLong(4));
                    zqw0Var.m221148y0(cursorQuery.getLong(5));
                    zqw0Var.m221091S(cursorQuery.getString(6));
                    zqw0Var.m221087O(cursorQuery.getString(7));
                    zqw0Var.m221140u0(cursorQuery.getLong(8));
                    zqw0Var.m221126n0(cursorQuery.getLong(9));
                    zqw0Var.m221080K(cursorQuery.isNull(10) || cursorQuery.getInt(10) != 0);
                    zqw0Var.m221120k0(cursorQuery.getLong(11));
                    zqw0Var.m221108e0(cursorQuery.getLong(12));
                    zqw0Var.m221102b0(cursorQuery.getLong(13));
                    zqw0Var.m221094V(cursorQuery.getLong(14));
                    zqw0Var.m221090R(cursorQuery.getLong(15));
                    zqw0Var.m221136s0(cursorQuery.getLong(16));
                    zqw0Var.m221074H(cursorQuery.isNull(17) ? -2147483648L : cursorQuery.getInt(17));
                    zqw0Var.m221095W(cursorQuery.getString(18));
                    zqw0Var.m221097Y(cursorQuery.getLong(19));
                    zqw0Var.m221114h0(cursorQuery.getLong(20));
                    zqw0Var.m221104c0(cursorQuery.getString(21));
                    zqw0Var.m221113h(cursorQuery.isNull(23) || cursorQuery.getInt(23) != 0);
                    zqw0Var.m221109f(cursorQuery.getString(24));
                    zqw0Var.m221132q0(cursorQuery.isNull(25) ? 0L : cursorQuery.getLong(25));
                    if (!cursorQuery.isNull(26)) {
                        zqw0Var.m221111g(Arrays.asList(cursorQuery.getString(26).split(Constants.SEPARATOR_COMMA, -1)));
                    }
                    if (!ziy0.m219953a() || !mo15139a().m98440n(whs0.f189243Z0) || this.f158066b.m15321P(str).m15401m(zzje.zza.ANALYTICS_STORAGE)) {
                        zqw0Var.m221122l0(cursorQuery.getString(28));
                    }
                    if (gqy0.m131505a() && mo15139a().m98440n(whs0.f189306y0)) {
                        mo15143e();
                        if (hny0.m136291B0(str)) {
                            zqw0Var.m221088P((cursorQuery.isNull(29) || cursorQuery.getInt(29) == 0) ? false : true);
                            zqw0Var.m221144w0(cursorQuery.getLong(39));
                            if (mo15139a().m98440n(whs0.f189308z0)) {
                                zqw0Var.m221128o0(cursorQuery.getString(36));
                            }
                        }
                    }
                    zqw0Var.m221073G0(cursorQuery.getLong(30));
                    zqw0Var.m221069E0(cursorQuery.getLong(31));
                    if (spy0.m187491a() && mo15139a().m98452z(str, whs0.f189209I0)) {
                        zqw0Var.m221101b(cursorQuery.getInt(32));
                        zqw0Var.m221086N(cursorQuery.getLong(35));
                    }
                    zqw0Var.m221092T((cursorQuery.isNull(33) || cursorQuery.getInt(33) == 0) ? false : true);
                    if (cursorQuery.isNull(34)) {
                        boolValueOf = null;
                    } else {
                        boolValueOf = Boolean.valueOf(cursorQuery.getInt(34) != 0);
                    }
                    zqw0Var.m221105d(boolValueOf);
                    zqw0Var.m221084M(cursorQuery.getInt(37));
                    zqw0Var.m221072G(cursorQuery.getInt(38));
                    zqw0Var.m221116i0(cursorQuery.isNull(40) ? "" : (String) Preconditions.checkNotNull(cursorQuery.getString(40)));
                    if (mo15139a().m98440n(whs0.f189239X0)) {
                        if (!cursorQuery.isNull(41)) {
                            zqw0Var.m221107e(Long.valueOf(cursorQuery.getLong(41)));
                        }
                        if (!cursorQuery.isNull(42)) {
                            zqw0Var.m221076I(Long.valueOf(cursorQuery.getLong(42)));
                        }
                    }
                    if (nny0.m164006a() && mo15139a().m98452z(str, whs0.f189235V0)) {
                        zqw0Var.m221115i(cursorQuery.getBlob(43));
                    }
                    zqw0Var.m221145x();
                    if (cursorQuery.moveToNext()) {
                        zzj().m114558A().m153301b("Got multiple records for app, expected one. appId", d6x0.m114551p(str));
                    }
                    cursorQuery.close();
                    return zqw0Var;
                } catch (SQLiteException e) {
                    e = e;
                    zzj().m114558A().m153302c("Error querying app. appId", d6x0.m114551p(str), e);
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
    public final List<Pair<C2336c0, Long>> m168707H(String str, int i, int i2) {
        long jM14218N;
        long jM14218N2;
        mo15146h();
        m163482o();
        int i3 = 1;
        Preconditions.checkArgument(i > 0);
        Preconditions.checkArgument(i2 > 0);
        Preconditions.checkNotEmpty(str);
        Cursor cursor = null;
        try {
            try {
                Cursor cursorQuery = m168765v().query("queue", new String[]{"rowid", "data", "retry_count"}, "app_id=?", new String[]{str}, null, null, "rowid", String.valueOf(i));
                if (!cursorQuery.moveToFirst()) {
                    List<Pair<C2336c0, Long>> list = Collections.EMPTY_LIST;
                    cursorQuery.close();
                    return list;
                }
                ArrayList arrayList = new ArrayList();
                int length = 0;
                while (true) {
                    long j = cursorQuery.getLong(0);
                    try {
                        byte[] bArrM201888d0 = mo15192i().m201888d0(cursorQuery.getBlob(i3));
                        if (!arrayList.isEmpty() && bArrM201888d0.length + length > i2) {
                            break;
                        }
                        try {
                            C2336c0.a aVar = (C2336c0.a) vmy0.m201859K(C2336c0.m13971x2(), bArrM201888d0);
                            if (!arrayList.isEmpty()) {
                                C2336c0 c2336c0 = (C2336c0) ((Pair) arrayList.get(0)).first;
                                C2336c0 c2336c1 = (C2336c0) ((AbstractC2372u0) aVar.mo14423H());
                                if (!c2336c0.m14008b0().equals(c2336c1.m14008b0()) || !c2336c0.m14006a0().equals(c2336c1.m14006a0()) || c2336c0.m14038r0() != c2336c1.m14038r0() || !c2336c0.m14011c0().equals(c2336c1.m14011c0())) {
                                    break;
                                }
                                Iterator<C2342f0> it = c2336c0.m14035p0().iterator();
                                while (true) {
                                    jM14218N = -1;
                                    if (!it.hasNext()) {
                                        jM14218N2 = -1;
                                        break;
                                    }
                                    C2342f0 next = it.next();
                                    if ("_npa".equals(next.m14220X())) {
                                        jM14218N2 = next.m14218N();
                                        break;
                                    }
                                }
                                for (C2342f0 c2342f0 : c2336c1.m14035p0()) {
                                    if ("_npa".equals(c2342f0.m14220X())) {
                                        jM14218N = c2342f0.m14218N();
                                        break;
                                    }
                                }
                                if (jM14218N2 != jM14218N) {
                                    break;
                                }
                            }
                            if (!cursorQuery.isNull(2)) {
                                aVar.m14067I0(cursorQuery.getInt(2));
                            }
                            length += bArrM201888d0.length;
                            arrayList.add(Pair.create((C2336c0) ((AbstractC2372u0) aVar.mo14423H()), Long.valueOf(j)));
                        } catch (IOException e) {
                            zzj().m114558A().m153302c("Failed to merge queued bundle. appId", d6x0.m114551p(str), e);
                        }
                        if (!cursorQuery.moveToNext() || length > i2) {
                            break;
                        }
                        i3 = 1;
                    } catch (IOException e2) {
                        zzj().m114558A().m153302c("Failed to unzip queued bundle. appId", d6x0.m114551p(str), e2);
                    }
                }
                cursorQuery.close();
                return arrayList;
            } catch (SQLiteException e3) {
                zzj().m114558A().m153302c("Error querying bundles. appId", d6x0.m114551p(str), e3);
                List<Pair<C2336c0, Long>> list2 = Collections.EMPTY_LIST;
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
    public final ymy0 m168708H0(String str, String str2) {
        Throwable th;
        String str3;
        String str4;
        SQLiteException sQLiteException;
        Cursor cursorQuery;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        mo15146h();
        m163482o();
        Cursor cursor = null;
        try {
            cursorQuery = m168765v().query("user_attributes", new String[]{"set_timestamp", "value", "origin"}, "app_id=? and name=?", new String[]{str, str2}, null, null, null);
            try {
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    long j = cursorQuery.getLong(0);
                    Object objM168699D = m168699D(cursorQuery, 1);
                    if (objM168699D == null) {
                        cursorQuery.close();
                        return null;
                    }
                    str3 = str;
                    str4 = str2;
                    try {
                        ymy0 ymy0Var = new ymy0(str3, cursorQuery.getString(2), str4, j, objM168699D);
                        if (cursorQuery.moveToNext()) {
                            zzj().m114558A().m153301b("Got multiple records for user property, expected one. appId", d6x0.m114551p(str3));
                        }
                        cursorQuery.close();
                        return ymy0Var;
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
        zzj().m114558A().m153303d("Error querying user property. appId", d6x0.m114551p(str3), mo15141c().m208452g(str4), sQLiteException);
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return null;
    }

    @WorkerThread
    /* JADX INFO: renamed from: I */
    public final List<zzae> m168709I(String str, String str2, String str3) {
        Preconditions.checkNotEmpty(str);
        mo15146h();
        m163482o();
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
        return m168711J(sb.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX INFO: renamed from: I0 */
    public final Map<Integer, List<C2335c>> m168710I0(String str, String str2) {
        m163482o();
        mo15146h();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        l01 l01Var = new l01();
        Cursor cursor = null;
        try {
            try {
                Cursor cursorQuery = m168765v().query("event_filters", new String[]{"audience_id", "data"}, "app_id=? AND event_name=?", new String[]{str, str2}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    Map<Integer, List<C2335c>> map = Collections.EMPTY_MAP;
                    cursorQuery.close();
                    return map;
                }
                do {
                    try {
                        C2335c c2335c = (C2335c) ((AbstractC2372u0) ((C2335c.a) vmy0.m201859K(C2335c.m13885G(), cursorQuery.getBlob(1))).mo14423H());
                        int i = cursorQuery.getInt(0);
                        List arrayList = (List) l01Var.get(Integer.valueOf(i));
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            l01Var.put(Integer.valueOf(i), arrayList);
                        }
                        arrayList.add(c2335c);
                    } catch (IOException e) {
                        zzj().m114558A().m153302c("Failed to merge filter. appId", d6x0.m114551p(str), e);
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                return l01Var;
            } catch (SQLiteException e2) {
                zzj().m114558A().m153302c("Database error querying filters. appId", d6x0.m114551p(str), e2);
                Map<Integer, List<C2335c>> map2 = Collections.EMPTY_MAP;
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
    public final List<zzae> m168711J(String str, String[] strArr) {
        mo15146h();
        m163482o();
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = m168765v().query("conditional_properties", new String[]{com.tencent.connect.common.Constants.JumpUrlConstants.URL_KEY_APPID, "origin", AuthenticationTokenClaims.JSON_KEY_NAME, "value", Active.TYPE, "trigger_event_name", "trigger_timeout", "timed_out_event", "creation_timestamp", "triggered_event", "triggered_timestamp", "time_to_live", "expired_event"}, str, strArr, null, null, "rowid", "1001");
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return arrayList;
                }
                while (arrayList.size() < 1000) {
                    String string = cursorQuery.getString(0);
                    String string2 = cursorQuery.getString(1);
                    String string3 = cursorQuery.getString(2);
                    Object objM168699D = m168699D(cursorQuery, 3);
                    boolean z = cursorQuery.getInt(4) != 0;
                    String string4 = cursorQuery.getString(5);
                    long j = cursorQuery.getLong(6);
                    vmy0 vmy0VarMo15192i = mo15192i();
                    byte[] blob = cursorQuery.getBlob(7);
                    Parcelable.Creator<zzbf> creator = zzbf.CREATOR;
                    zzbf zzbfVar = (zzbf) vmy0VarMo15192i.m201893x(blob, creator);
                    arrayList.add(new zzae(string, string2, new zzon(string3, cursorQuery.getLong(10), objM168699D, string2), cursorQuery.getLong(8), z, string4, zzbfVar, j, (zzbf) mo15192i().m201893x(cursorQuery.getBlob(9), creator), cursorQuery.getLong(11), (zzbf) mo15192i().m201893x(cursorQuery.getBlob(12), creator)));
                    if (!cursorQuery.moveToNext()) {
                        cursorQuery.close();
                        return arrayList;
                    }
                }
                zzj().m114558A().m153301b("Read more than the max allowed conditional properties, ignoring extra", 1000);
                cursorQuery.close();
                return arrayList;
            } catch (SQLiteException e) {
                zzj().m114558A().m153301b("Error querying conditional user property value", e);
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
    public final asr0 m168712J0(String str) {
        Throwable th;
        Cursor cursorQuery;
        Cursor cursor;
        Preconditions.checkNotEmpty(str);
        mo15146h();
        m163482o();
        Cursor cursor2 = null;
        try {
            try {
                cursorQuery = m168765v().query("apps", new String[]{"remote_config", "config_last_modified_time", "e_tag"}, "app_id=?", new String[]{str}, null, null, null);
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    byte[] blob = cursorQuery.getBlob(0);
                    String string = cursorQuery.getString(1);
                    String string2 = cursorQuery.getString(2);
                    if (cursorQuery.moveToNext()) {
                        zzj().m114558A().m153301b("Got multiple records for app config, expected one. appId", d6x0.m114551p(str));
                    }
                    if (blob == null) {
                        cursorQuery.close();
                        return null;
                    }
                    asr0 asr0Var = new asr0(blob, string, string2);
                    cursorQuery.close();
                    return asr0Var;
                } catch (SQLiteException e) {
                    e = e;
                    zzj().m114558A().m153302c("Error querying remote config. appId", d6x0.m114551p(str), e);
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
    public final yvr0 m168713K(long j, String str, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        Preconditions.checkNotEmpty(str);
        mo15146h();
        m163482o();
        String[] strArr = {str};
        yvr0 yvr0Var = new yvr0();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase sQLiteDatabaseM168765v = m168765v();
                Cursor cursorQuery = sQLiteDatabaseM168765v.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count", "daily_realtime_dcu_count", "daily_registered_triggers_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    zzj().m114563F().m153301b("Not updating daily counts, app is not known. appId", d6x0.m114551p(str));
                    cursorQuery.close();
                    return yvr0Var;
                }
                if (cursorQuery.getLong(0) == j) {
                    yvr0Var.f201754b = cursorQuery.getLong(1);
                    yvr0Var.f201753a = cursorQuery.getLong(2);
                    yvr0Var.f201755c = cursorQuery.getLong(3);
                    yvr0Var.f201756d = cursorQuery.getLong(4);
                    yvr0Var.f201757e = cursorQuery.getLong(5);
                    yvr0Var.f201758f = cursorQuery.getLong(6);
                    yvr0Var.f201759g = cursorQuery.getLong(7);
                }
                if (z) {
                    yvr0Var.f201754b += j2;
                }
                if (z2) {
                    yvr0Var.f201753a += j2;
                }
                if (z3) {
                    yvr0Var.f201755c += j2;
                }
                if (z4) {
                    yvr0Var.f201756d += j2;
                }
                if (z5) {
                    yvr0Var.f201757e += j2;
                }
                if (z6) {
                    yvr0Var.f201758f += j2;
                }
                if (z7) {
                    yvr0Var.f201759g += j2;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("day", Long.valueOf(j));
                contentValues.put("daily_public_events_count", Long.valueOf(yvr0Var.f201753a));
                contentValues.put("daily_events_count", Long.valueOf(yvr0Var.f201754b));
                contentValues.put("daily_conversions_count", Long.valueOf(yvr0Var.f201755c));
                contentValues.put("daily_error_events_count", Long.valueOf(yvr0Var.f201756d));
                contentValues.put("daily_realtime_events_count", Long.valueOf(yvr0Var.f201757e));
                contentValues.put("daily_realtime_dcu_count", Long.valueOf(yvr0Var.f201758f));
                contentValues.put("daily_registered_triggers_count", Long.valueOf(yvr0Var.f201759g));
                sQLiteDatabaseM168765v.update("apps", contentValues, "app_id=?", strArr);
                cursorQuery.close();
                return yvr0Var;
            } catch (SQLiteException e) {
                zzj().m114558A().m153302c("Error updating daily counts. appId", d6x0.m114551p(str), e);
                if (0 != 0) {
                    cursor.close();
                }
                return yvr0Var;
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
    public final C2476b m168714K0(String str) {
        Preconditions.checkNotNull(str);
        mo15146h();
        m163482o();
        return C2476b.m15124d(m168705G("select dma_consent_settings from consent_settings where app_id=? limit 1;", new String[]{str}, ""));
    }

    @WorkerThread
    /* JADX INFO: renamed from: L */
    public final yvr0 m168715L(long j, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        return m168713K(j, str, 1L, false, false, z3, false, z5, z6, z7);
    }

    /* JADX INFO: renamed from: L0 */
    public final Map<Integer, List<C2339e>> m168716L0(String str, String str2) {
        m163482o();
        mo15146h();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        l01 l01Var = new l01();
        Cursor cursor = null;
        try {
            try {
                Cursor cursorQuery = m168765v().query("property_filters", new String[]{"audience_id", "data"}, "app_id=? AND property_name=?", new String[]{str, str2}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    Map<Integer, List<C2339e>> map = Collections.EMPTY_MAP;
                    cursorQuery.close();
                    return map;
                }
                do {
                    try {
                        C2339e c2339e = (C2339e) ((AbstractC2372u0) ((C2339e.a) vmy0.m201859K(C2339e.m14184D(), cursorQuery.getBlob(1))).mo14423H());
                        int i = cursorQuery.getInt(0);
                        List arrayList = (List) l01Var.get(Integer.valueOf(i));
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                            l01Var.put(Integer.valueOf(i), arrayList);
                        }
                        arrayList.add(c2339e);
                    } catch (IOException e) {
                        zzj().m114558A().m153302c("Failed to merge filter", d6x0.m114551p(str), e);
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                return l01Var;
            } catch (SQLiteException e2) {
                zzj().m114558A().m153302c("Database error querying filters. appId", d6x0.m114551p(str), e2);
                Map<Integer, List<C2339e>> map2 = Collections.EMPTY_MAP;
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
    public final zzje m168717M0(String str) {
        Preconditions.checkNotNull(str);
        mo15146h();
        m163482o();
        return zzje.m15396q(m168705G("select storage_consent_at_bundling from consent_settings where app_id=? limit 1;", new String[]{str}, ""));
    }

    @WorkerThread
    /* JADX INFO: renamed from: N0 */
    public final void m168718N0(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        mo15146h();
        m163482o();
        try {
            m168765v().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            zzj().m114558A().m153303d("Error deleting user property. appId", d6x0.m114551p(str), mo15141c().m208452g(str2), e);
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: O */
    public final void m168719O(Long l2) {
        mo15146h();
        m163482o();
        Preconditions.checkNotNull(l2);
        if ((!gqy0.m131505a() || mo15139a().m98440n(whs0.f189197C0)) && m168759i0()) {
            if (m168768w0("SELECT COUNT(1) FROM upload_queue WHERE rowid = " + l2 + " AND retry_count =  2147483647 LIMIT 1", null) > 0) {
                zzj().m114563F().m153300a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                m168765v().execSQL("UPDATE upload_queue SET retry_count = retry_count + 1 WHERE rowid = " + l2 + " AND retry_count < 2147483647");
            } catch (SQLiteException e) {
                zzj().m114558A().m153301b("Error incrementing retry count. error", e);
            }
        }
    }

    /* JADX INFO: renamed from: O0 */
    public final zzje m168720O0(String str) {
        Preconditions.checkNotNull(str);
        mo15146h();
        m163482o();
        zzje zzjeVar = (zzje) m168701E("select consent_state, consent_source from consent_settings where app_id=? limit 1;", new String[]{str}, new b1s0() { // from class: l.ltr0
            @Override // p153l.b1s0
            /* JADX INFO: renamed from: a */
            public final Object mo101502a(Cursor cursor) {
                return zzje.m15389f(cursor.getString(0), cursor.getInt(1));
            }
        });
        return zzjeVar == null ? zzje.f10592c : zzjeVar;
    }

    /* JADX INFO: renamed from: P */
    public final void m168721P(String str, Bundle bundle) {
        opr0 opr0Var = this;
        Preconditions.checkNotNull(bundle);
        opr0Var.mo15146h();
        opr0Var.m163482o();
        String str2 = str;
        ixr0 ixr0Var = new ixr0(opr0Var, str2);
        List<evr0> listM142590a = ixr0Var.m142590a();
        while (!listM142590a.isEmpty()) {
            for (evr0 evr0Var : listM142590a) {
                vmy0 vmy0VarMo15192i = opr0Var.mo15192i();
                C2379y c2379y = evr0Var.f96026d;
                Bundle bundle2 = new Bundle();
                for (C2331a0 c2331a0 : c2379y.m14555Y()) {
                    if (c2331a0.m13842c0()) {
                        bundle2.putDouble(c2331a0.m13839Z(), c2331a0.m13835B());
                    } else if (c2331a0.m13843d0()) {
                        bundle2.putFloat(c2331a0.m13839Z(), c2331a0.m13836L());
                    } else if (c2331a0.m13844e0()) {
                        bundle2.putLong(c2331a0.m13839Z(), c2331a0.m13838V());
                    } else if (c2331a0.m13846g0()) {
                        bundle2.putString(c2331a0.m13839Z(), c2331a0.m13840a0());
                    } else if (c2331a0.m13841b0().isEmpty()) {
                        vmy0VarMo15192i.zzj().m114558A().m153301b("Unexpected parameter type for parameter", c2331a0);
                    } else {
                        bundle2.putParcelableArray(c2331a0.m13839Z(), vmy0.m201871c0(c2331a0.m13841b0()));
                    }
                }
                String string = bundle2.getString("_o");
                bundle2.remove("_o");
                String strM14554X = c2379y.m14554X();
                if (string == null) {
                    string = "";
                }
                tax0 tax0Var = new tax0(strM14554X, string, bundle2, c2379y.m14553U());
                opr0Var.mo15143e().m136328H(tax0Var.f172812d, bundle);
                opr0Var.m168739Y(evr0Var.f96023a, new wcs0(opr0Var.f202159a, tax0Var.f172810b, str2, evr0Var.f96026d.m14554X(), evr0Var.f96026d.m14553U(), evr0Var.f96026d.m14552T(), tax0Var.f172812d), evr0Var.f96024b, evr0Var.f96025c);
                opr0Var = this;
                str2 = str;
            }
            listM142590a = ixr0Var.m142590a();
            opr0Var = this;
            str2 = str;
        }
    }

    /* JADX INFO: renamed from: P0 */
    public final void m168722P0(String str, String str2) {
        Preconditions.checkNotEmpty(str2);
        mo15146h();
        m163482o();
        try {
            m168765v().delete(str, "app_id=?", new String[]{str2});
        } catch (SQLiteException e) {
            zzj().m114558A().m153302c("Error deleting snapshot. appId", d6x0.m114551p(str2), e);
        }
    }

    /* JADX INFO: renamed from: Q */
    public final void m168723Q(String str, C2476b c2476b) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(c2476b);
        mo15146h();
        m163482o();
        if (mo15139a().m98440n(whs0.f189229S0)) {
            zzje zzjeVarM168720O0 = m168720O0(str);
            zzje zzjeVar = zzje.f10592c;
            if (zzjeVarM168720O0 == zzjeVar) {
                m168772y0(str, zzjeVar);
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(com.tencent.connect.common.Constants.JumpUrlConstants.URL_KEY_APPID, str);
        contentValues.put("dma_consent_settings", c2476b.m15131j());
        m168727S("consent_settings", com.tencent.connect.common.Constants.JumpUrlConstants.URL_KEY_APPID, contentValues);
    }

    /* JADX WARN: Code duplicated, block: B:61:0x0181  */
    /* JADX WARN: Code duplicated, block: B:72:? A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v2 */
    @WorkerThread
    /* JADX INFO: renamed from: Q0 */
    public final hmy0 m168724Q0(String str) throws Throwable {
        Throwable th;
        Cursor cursorQuery;
        zpw0<Boolean> zpw0Var;
        Preconditions.checkNotEmpty(str);
        mo15146h();
        m163482o();
        ?? r1 = 0;
        if (gqy0.m131505a()) {
            ajr0 ajr0VarMo15139a = mo15139a();
            zpw0Var = whs0.f189197C0;
            if (!ajr0VarMo15139a.m98440n(zpw0Var)) {
                return null;
            }
        }
        try {
            try {
                cursorQuery = m168765v().query("upload_queue", new String[]{"rowId", com.tencent.connect.common.Constants.JumpUrlConstants.URL_KEY_APPID, "measurement_batch", "upload_uri", "upload_headers", "upload_type", "retry_count"}, "app_id=? AND NOT " + m168762t0(), new String[]{str}, null, null, "creation_timestamp ASC", "1");
                try {
                    if (!cursorQuery.moveToFirst()) {
                        cursorQuery.close();
                        return null;
                    }
                    String string = cursorQuery.getString(3);
                    if (TextUtils.isEmpty(string)) {
                        zzj().m114570z().m153300a("Upload uri is null or empty. Destination is unknown. Dropping batch. ");
                        cursorQuery.close();
                        return null;
                    }
                    try {
                        zzfy$zzj.C2389a c2389a = (zzfy$zzj.C2389a) vmy0.m201859K(zzfy$zzj.m14650I(), cursorQuery.getBlob(2));
                        zznt zzntVar = zznt.values()[cursorQuery.getInt(5)];
                        if (zzntVar == zznt.SGTM || zzntVar == zznt.GOOGLE_ANALYTICS) {
                            if (cursorQuery.getInt(6) > 0) {
                                ArrayList arrayList = new ArrayList();
                                Iterator<C2336c0> it = c2389a.m14665D().iterator();
                                while (it.hasNext()) {
                                    C2336c0.a aVarM14417t = it.next().m14417t();
                                    aVarM14417t.m14067I0(cursorQuery.getInt(6));
                                    arrayList.add((C2336c0) ((AbstractC2372u0) aVarM14417t.mo14423H()));
                                }
                                c2389a.m14662A();
                                c2389a.m14668x(arrayList);
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
                                    zzj().m114558A().m153301b("Invalid upload header: ", str2);
                                    break;
                                }
                                map.put(strArrSplit[0], strArrSplit[1]);
                            }
                        }
                        hmy0 hmy0VarM177152a = new qmy0().m177153b(cursorQuery.getLong(0)).m177154c((zzfy$zzj) ((AbstractC2372u0) c2389a.mo14423H())).m177156e(string).m177157f(map).m177155d(zzntVar).m177152a();
                        cursorQuery.close();
                        return hmy0VarM177152a;
                    } catch (IOException e) {
                        zzj().m114558A().m153302c("Failed to queued MeasurementBatch from upload_queue. appId", str, e);
                        cursorQuery.close();
                        return null;
                    }
                } catch (SQLiteException e2) {
                    e = e2;
                    zzj().m114558A().m153302c("Error to querying MeasurementBatch from upload_queue. appId", str, e);
                    if (cursorQuery != null) {
                        cursorQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th2) {
                th = th2;
                r1 = zpw0Var;
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
    public final void m168725R(String str, zzje zzjeVar) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(zzjeVar);
        mo15146h();
        m163482o();
        m168772y0(str, m168720O0(str));
        ContentValues contentValues = new ContentValues();
        contentValues.put(com.tencent.connect.common.Constants.JumpUrlConstants.URL_KEY_APPID, str);
        contentValues.put("storage_consent_at_bundling", zzjeVar.m15410x());
        m168727S("consent_settings", com.tencent.connect.common.Constants.JumpUrlConstants.URL_KEY_APPID, contentValues);
    }

    /* JADX INFO: renamed from: R0 */
    public final List<zzno> m168726R0(String str) {
        Preconditions.checkNotEmpty(str);
        mo15146h();
        m163482o();
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = m168765v().query("trigger_uris", new String[]{"trigger_uri", "timestamp_millis", "source"}, "app_id=?", new String[]{str}, null, null, "rowid", null);
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
                zzj().m114558A().m153302c("Error querying trigger uris. appId", d6x0.m114551p(str), e);
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
    public final void m168727S(String str, String str2, ContentValues contentValues) {
        try {
            SQLiteDatabase sQLiteDatabaseM168765v = m168765v();
            String asString = contentValues.getAsString(str2);
            if (asString == null) {
                zzj().m114559B().m153301b("Value of the primary key is not set.", d6x0.m114551p(str2));
                return;
            }
            if (sQLiteDatabaseM168765v.update(str, contentValues, str2 + " = ?", new String[]{asString}) == 0 && sQLiteDatabaseM168765v.insertWithOnConflict(str, null, contentValues, 5) == -1) {
                zzj().m114558A().m153302c("Failed to insert/update table (got -1). key", d6x0.m114551p(str), d6x0.m114551p(str2));
            }
        } catch (SQLiteException e) {
            zzj().m114558A().m153303d("Error storing into table. key", d6x0.m114551p(str), d6x0.m114551p(str2), e);
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: S0 */
    public final List<ymy0> m168728S0(String str) {
        String str2;
        Preconditions.checkNotEmpty(str);
        mo15146h();
        m163482o();
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = m168765v().query("user_attributes", new String[]{AuthenticationTokenClaims.JSON_KEY_NAME, "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", com.tencent.connect.common.Constants.DEFAULT_UIN);
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
                    Object objM168699D = m168699D(cursorQuery, 3);
                    if (objM168699D == null) {
                        zzj().m114558A().m153301b("Read invalid user property value, ignoring it. appId", d6x0.m114551p(str));
                        str2 = str;
                    } else {
                        str2 = str;
                        arrayList.add(new ymy0(str2, str3, string, j, objM168699D));
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
        zzj().m114558A().m153302c("Error querying user properties. appId", d6x0.m114551p(str2), e);
        List<ymy0> list = Collections.EMPTY_LIST;
        if (cursorQuery != null) {
            cursorQuery.close();
        }
        return list;
    }

    @WorkerThread
    /* JADX INFO: renamed from: T */
    public final void m168729T(String str, List<C2333b> list) {
        boolean z;
        boolean z2;
        Preconditions.checkNotNull(list);
        for (int i = 0; i < list.size(); i++) {
            C2333b.a aVarM14417t = list.get(i).m14417t();
            if (aVarM14417t.m13877v() != 0) {
                for (int i2 = 0; i2 < aVarM14417t.m13877v(); i2++) {
                    C2335c.a aVarM14417t2 = aVarM14417t.m13880y(i2).m14417t();
                    C2335c.a aVar = (C2335c.a) ((AbstractC2372u0.b) aVarM14417t2.clone());
                    String strM128476b = g0y0.m128476b(aVarM14417t2.m13903z());
                    if (strM128476b != null) {
                        aVar.m13901x(strM128476b);
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    for (int i3 = 0; i3 < aVarM14417t2.m13899v(); i3++) {
                        C2337d c2337dM13902y = aVarM14417t2.m13902y(i3);
                        String strM170184a = p0y0.m170184a(c2337dM13902y.m14149I());
                        if (strM170184a != null) {
                            aVar.m13900w(i3, (C2337d) ((AbstractC2372u0) c2337dM13902y.m14417t().m14155v(strM170184a).mo14423H()));
                            z2 = true;
                        }
                    }
                    if (z2) {
                        C2333b.a aVarM13878w = aVarM14417t.m13878w(i2, aVar);
                        list.set(i, (C2333b) ((AbstractC2372u0) aVarM13878w.mo14423H()));
                        aVarM14417t = aVarM13878w;
                    }
                }
            }
            if (aVarM14417t.m13881z() != 0) {
                for (int i4 = 0; i4 < aVarM14417t.m13881z(); i4++) {
                    C2339e c2339eM13876A = aVarM14417t.m13876A(i4);
                    String strM152406a = l0y0.m152406a(c2339eM13876A.m14187G());
                    if (strM152406a != null) {
                        aVarM14417t = aVarM14417t.m13879x(i4, c2339eM13876A.m14417t().m14194v(strM152406a));
                        list.set(i, (C2333b) ((AbstractC2372u0) aVarM14417t.mo14423H()));
                    }
                }
            }
        }
        m163482o();
        mo15146h();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(list);
        SQLiteDatabase sQLiteDatabaseM168765v = m168765v();
        sQLiteDatabaseM168765v.beginTransaction();
        try {
            m163482o();
            mo15146h();
            Preconditions.checkNotEmpty(str);
            SQLiteDatabase sQLiteDatabaseM168765v2 = m168765v();
            sQLiteDatabaseM168765v2.delete("property_filters", "app_id=?", new String[]{str});
            sQLiteDatabaseM168765v2.delete("event_filters", "app_id=?", new String[]{str});
            for (C2333b c2333b : list) {
                m163482o();
                mo15146h();
                Preconditions.checkNotEmpty(str);
                Preconditions.checkNotNull(c2333b);
                if (c2333b.m13874N()) {
                    int iM13875h = c2333b.m13875h();
                    Iterator<C2335c> it = c2333b.m13872L().iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (!it.next().m13896W()) {
                                zzj().m114563F().m153302c("Event filter with no ID. Audience definition ignored. appId, audienceId", d6x0.m114551p(str), Integer.valueOf(iM13875h));
                                break;
                            }
                        } else {
                            Iterator<C2339e> it2 = c2333b.m13873M().iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    Iterator<C2335c> it3 = c2333b.m13872L().iterator();
                                    while (true) {
                                        if (it3.hasNext()) {
                                            if (!m168745b0(str, iM13875h, it3.next())) {
                                                z = false;
                                                break;
                                            }
                                        } else {
                                            z = true;
                                            break;
                                        }
                                    }
                                    if (z) {
                                        Iterator<C2339e> it4 = c2333b.m13873M().iterator();
                                        while (it4.hasNext()) {
                                            if (!m168747c0(str, iM13875h, it4.next())) {
                                                z = false;
                                                break;
                                            }
                                        }
                                    }
                                    if (!z) {
                                        m163482o();
                                        mo15146h();
                                        Preconditions.checkNotEmpty(str);
                                        SQLiteDatabase sQLiteDatabaseM168765v3 = m168765v();
                                        sQLiteDatabaseM168765v3.delete("property_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(iM13875h)});
                                        sQLiteDatabaseM168765v3.delete("event_filters", "app_id=? and audience_id=?", new String[]{str, String.valueOf(iM13875h)});
                                        break;
                                    }
                                    break;
                                }
                                if (!it2.next().m14191M()) {
                                    zzj().m114563F().m153302c("Property filter with no ID. Audience definition ignored. appId, audienceId", d6x0.m114551p(str), Integer.valueOf(iM13875h));
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    zzj().m114563F().m153301b("Audience with no ID. appId", d6x0.m114551p(str));
                }
            }
            ArrayList arrayList = new ArrayList();
            for (C2333b c2333b2 : list) {
                arrayList.add(c2333b2.m13874N() ? Integer.valueOf(c2333b2.m13875h()) : null);
            }
            m168695A0(str, arrayList);
            sQLiteDatabaseM168765v.setTransactionSuccessful();
        } finally {
            sQLiteDatabaseM168765v.endTransaction();
        }
    }

    /* JADX INFO: renamed from: T0 */
    public final Map<Integer, C2338d0> m168730T0(String str) {
        m163482o();
        mo15146h();
        Preconditions.checkNotEmpty(str);
        Cursor cursor = null;
        try {
            try {
                Cursor cursorQuery = m168765v().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    Map<Integer, C2338d0> map = Collections.EMPTY_MAP;
                    cursorQuery.close();
                    return map;
                }
                l01 l01Var = new l01();
                do {
                    int i = cursorQuery.getInt(0);
                    try {
                        l01Var.put(Integer.valueOf(i), (C2338d0) ((AbstractC2372u0) ((C2338d0.a) vmy0.m201859K(C2338d0.m14164U(), cursorQuery.getBlob(1))).mo14423H()));
                    } catch (IOException e) {
                        zzj().m114558A().m153303d("Failed to merge filter results. appId, audienceId, error", d6x0.m114551p(str), Integer.valueOf(i), e);
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                return l01Var;
            } catch (SQLiteException e2) {
                zzj().m114558A().m153302c("Database error querying filter results. appId", d6x0.m114551p(str), e2);
                Map<Integer, C2338d0> map2 = Collections.EMPTY_MAP;
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
    public final void m168731U(String str, pbs0 pbs0Var) {
        Preconditions.checkNotNull(pbs0Var);
        mo15146h();
        m163482o();
        ContentValues contentValues = new ContentValues();
        contentValues.put(com.tencent.connect.common.Constants.JumpUrlConstants.URL_KEY_APPID, pbs0Var.f151417a);
        contentValues.put(AuthenticationTokenClaims.JSON_KEY_NAME, pbs0Var.f151418b);
        contentValues.put("lifetime_count", Long.valueOf(pbs0Var.f151419c));
        contentValues.put("current_bundle_count", Long.valueOf(pbs0Var.f151420d));
        contentValues.put("last_fire_timestamp", Long.valueOf(pbs0Var.f151422f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(pbs0Var.f151423g));
        contentValues.put("last_bundled_day", pbs0Var.f151424h);
        contentValues.put("last_sampled_complex_event_id", pbs0Var.f151425i);
        contentValues.put("last_sampling_rate", pbs0Var.f151426j);
        contentValues.put("current_session_count", Long.valueOf(pbs0Var.f151421e));
        Boolean bool = pbs0Var.f151427k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (m168765v().insertWithOnConflict(str, null, contentValues, 5) == -1) {
                zzj().m114558A().m153301b("Failed to insert/update event aggregates (got -1). appId", d6x0.m114551p(pbs0Var.f151417a));
            }
        } catch (SQLiteException e) {
            zzj().m114558A().m153302c("Error storing event aggregates. appId", d6x0.m114551p(pbs0Var.f151417a), e);
        }
    }

    /* JADX INFO: renamed from: U0 */
    public final Map<Integer, List<C2335c>> m168732U0(String str) {
        Preconditions.checkNotEmpty(str);
        l01 l01Var = new l01();
        Cursor cursor = null;
        try {
            try {
                Cursor cursorQuery = m168765v().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    Map<Integer, List<C2335c>> map = Collections.EMPTY_MAP;
                    cursorQuery.close();
                    return map;
                }
                do {
                    try {
                        C2335c c2335c = (C2335c) ((AbstractC2372u0) ((C2335c.a) vmy0.m201859K(C2335c.m13885G(), cursorQuery.getBlob(1))).mo14423H());
                        if (c2335c.m13895V()) {
                            int i = cursorQuery.getInt(0);
                            List arrayList = (List) l01Var.get(Integer.valueOf(i));
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                l01Var.put(Integer.valueOf(i), arrayList);
                            }
                            arrayList.add(c2335c);
                        }
                    } catch (IOException e) {
                        zzj().m114558A().m153302c("Failed to merge filter. appId", d6x0.m114551p(str), e);
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
                return l01Var;
            } catch (SQLiteException e2) {
                zzj().m114558A().m153302c("Database error querying filters. appId", d6x0.m114551p(str), e2);
                Map<Integer, List<C2335c>> map2 = Collections.EMPTY_MAP;
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
    public final void m168733V(List<Long> list) {
        mo15146h();
        m163482o();
        Preconditions.checkNotNull(list);
        Preconditions.checkNotZero(list.size());
        if (m168759i0()) {
            String str = "(" + TextUtils.join(Constants.SEPARATOR_COMMA, list) + ")";
            if (m168768w0("SELECT COUNT(1) FROM queue WHERE rowid IN " + str + " AND retry_count =  2147483647 LIMIT 1", null) > 0) {
                zzj().m114563F().m153300a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                m168765v().execSQL("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN " + str + " AND (retry_count IS NULL OR retry_count < 2147483647)");
            } catch (SQLiteException e) {
                zzj().m114558A().m153301b("Error incrementing retry count. error", e);
            }
        }
    }

    /* JADX INFO: renamed from: V0 */
    public final Map<Integer, List<Integer>> m168734V0(String str) {
        m163482o();
        mo15146h();
        Preconditions.checkNotEmpty(str);
        l01 l01Var = new l01();
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = m168765v().rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str, str});
                if (!cursorRawQuery.moveToFirst()) {
                    Map<Integer, List<Integer>> map = Collections.EMPTY_MAP;
                    cursorRawQuery.close();
                    return map;
                }
                do {
                    int i = cursorRawQuery.getInt(0);
                    List arrayList = (List) l01Var.get(Integer.valueOf(i));
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        l01Var.put(Integer.valueOf(i), arrayList);
                    }
                    arrayList.add(Integer.valueOf(cursorRawQuery.getInt(1)));
                } while (cursorRawQuery.moveToNext());
                cursorRawQuery.close();
                return l01Var;
            } catch (SQLiteException e) {
                zzj().m114558A().m153302c("Database error querying scoped filters. appId", d6x0.m114551p(str), e);
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
    public final void m168735W(pbs0 pbs0Var) {
        m168731U("events", pbs0Var);
    }

    @WorkerThread
    /* JADX INFO: renamed from: W0 */
    public final void m168736W0() {
        m163482o();
        m168765v().beginTransaction();
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0045  */
    @WorkerThread
    /* JADX INFO: renamed from: X */
    public final void m168737X(zqw0 zqw0Var, boolean z, boolean z2) {
        Preconditions.checkNotNull(zqw0Var);
        mo15146h();
        m163482o();
        String strM221121l = zqw0Var.m221121l();
        Preconditions.checkNotNull(strM221121l);
        ContentValues contentValues = new ContentValues();
        contentValues.put(com.tencent.connect.common.Constants.JumpUrlConstants.URL_KEY_APPID, strM221121l);
        if (!ziy0.m219953a() || !mo15139a().m98440n(whs0.f189243Z0)) {
            contentValues.put("app_instance_id", zqw0Var.m221123m());
        } else if (z) {
            contentValues.put("app_instance_id", (String) null);
        } else if (this.f158066b.m15321P(strM221121l).m15401m(zzje.zza.ANALYTICS_STORAGE)) {
            contentValues.put("app_instance_id", zqw0Var.m221123m());
        }
        contentValues.put("gmp_app_id", zqw0Var.m221131q());
        if (!ziy0.m219953a() || !mo15139a().m98440n(whs0.f189243Z0) || this.f158066b.m15321P(strM221121l).m15401m(zzje.zza.AD_STORAGE)) {
            contentValues.put("resettable_device_id_hash", zqw0Var.m221135s());
        }
        contentValues.put("last_bundle_index", Long.valueOf(zqw0Var.m221071F0()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(zqw0Var.m221075H0()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(zqw0Var.m221067D0()));
        contentValues.put("app_version", zqw0Var.m221127o());
        contentValues.put("app_store", zqw0Var.m221125n());
        contentValues.put("gmp_version", Long.valueOf(zqw0Var.m221150z0()));
        contentValues.put("dev_cert_hash", Long.valueOf(zqw0Var.m221138t0()));
        contentValues.put("measurement_enabled", Boolean.valueOf(zqw0Var.m221060A()));
        contentValues.put("day", Long.valueOf(zqw0Var.m221134r0()));
        contentValues.put("daily_public_events_count", Long.valueOf(zqw0Var.m221124m0()));
        contentValues.put("daily_events_count", Long.valueOf(zqw0Var.m221118j0()));
        contentValues.put("daily_conversions_count", Long.valueOf(zqw0Var.m221106d0()));
        contentValues.put("config_fetched_time", Long.valueOf(zqw0Var.m221100a0()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(zqw0Var.m221146x0()));
        contentValues.put("app_version_int", Long.valueOf(zqw0Var.m221093U()));
        contentValues.put("firebase_instance_id", zqw0Var.m221129p());
        contentValues.put("daily_error_events_count", Long.valueOf(zqw0Var.m221112g0()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(zqw0Var.m221130p0()));
        contentValues.put("health_monitor_sample", zqw0Var.m221133r());
        contentValues.put("android_id", Long.valueOf(zqw0Var.m221089Q()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(zqw0Var.m221149z()));
        contentValues.put("admob_app_id", zqw0Var.m221117j());
        contentValues.put("dynamite_version", Long.valueOf(zqw0Var.m221142v0()));
        if (!ziy0.m219953a() || !mo15139a().m98440n(whs0.f189243Z0) || this.f158066b.m15321P(strM221121l).m15401m(zzje.zza.ANALYTICS_STORAGE)) {
            contentValues.put("session_stitching_token", zqw0Var.m221139u());
        }
        contentValues.put("sgtm_upload_enabled", Boolean.valueOf(zqw0Var.m221064C()));
        contentValues.put("target_os_version", Long.valueOf(zqw0Var.m221079J0()));
        contentValues.put("session_stitching_token_hash", Long.valueOf(zqw0Var.m221077I0()));
        if (spy0.m187491a() && mo15139a().m98452z(strM221121l, whs0.f189209I0)) {
            contentValues.put("ad_services_version", Integer.valueOf(zqw0Var.m221099a()));
            contentValues.put("attribution_eligibility_status", Long.valueOf(zqw0Var.m221096X()));
        }
        contentValues.put("unmatched_first_open_without_ad_id", Boolean.valueOf(zqw0Var.m221066D()));
        contentValues.put("npa_metadata_value", zqw0Var.m221081K0());
        if (gqy0.m131505a() && mo15139a().m98452z(strM221121l, whs0.f189306y0)) {
            mo15143e();
            if (hny0.m136291B0(strM221121l)) {
                contentValues.put("bundle_delivery_index", Long.valueOf(zqw0Var.m221063B0()));
            }
        }
        if (gqy0.m131505a() && mo15139a().m98452z(strM221121l, whs0.f189308z0)) {
            contentValues.put("sgtm_preview_key", zqw0Var.m221141v());
        }
        contentValues.put("dma_consent_state", Integer.valueOf(zqw0Var.m221082L()));
        contentValues.put("daily_realtime_dcu_count", Integer.valueOf(zqw0Var.m221070F()));
        contentValues.put("serialized_npa_metadata", zqw0Var.m221137t());
        List<String> listM221143w = zqw0Var.m221143w();
        if (listM221143w != null) {
            if (listM221143w.isEmpty()) {
                zzj().m114563F().m153301b("Safelisted events should not be an empty list. appId", strM221121l);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(Constants.SEPARATOR_COMMA, listM221143w));
            }
        }
        if (fky0.m126062a() && mo15139a().m98440n(whs0.f189300v0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        if (mo15139a().m98440n(whs0.f189239X0)) {
            contentValues.put("unmatched_pfo", zqw0Var.m221083L0());
            contentValues.put("unmatched_uwa", zqw0Var.m221085M0());
        }
        if (nny0.m164006a() && mo15139a().m98452z(strM221121l, whs0.f189235V0)) {
            contentValues.put("ad_campaign_info", zqw0Var.m221068E());
        }
        try {
            SQLiteDatabase sQLiteDatabaseM168765v = m168765v();
            if (sQLiteDatabaseM168765v.update("apps", contentValues, "app_id = ?", new String[]{strM221121l}) == 0 && sQLiteDatabaseM168765v.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                zzj().m114558A().m153301b("Failed to insert/update app (got -1). appId", d6x0.m114551p(strM221121l));
            }
        } catch (SQLiteException e) {
            zzj().m114558A().m153302c("Error storing app. appId", d6x0.m114551p(strM221121l), e);
        }
    }

    /* JADX INFO: renamed from: X0 */
    public final void m168738X0(String str) {
        mo15146h();
        m163482o();
        try {
            m168765v().execSQL("delete from default_event_params where app_id=?", new String[]{str});
        } catch (SQLiteException e) {
            zzj().m114558A().m153301b("Error clearing default event params", e);
        }
    }

    /* JADX INFO: renamed from: Y */
    public final boolean m168739Y(long j, wcs0 wcs0Var, long j2, boolean z) {
        mo15146h();
        m163482o();
        Preconditions.checkNotNull(wcs0Var);
        Preconditions.checkNotEmpty(wcs0Var.f188495a);
        byte[] bArrM14308g = mo15192i().m201894y(wcs0Var).m14308g();
        ContentValues contentValues = new ContentValues();
        contentValues.put(com.tencent.connect.common.Constants.JumpUrlConstants.URL_KEY_APPID, wcs0Var.f188495a);
        contentValues.put(AuthenticationTokenClaims.JSON_KEY_NAME, wcs0Var.f188496b);
        contentValues.put("timestamp", Long.valueOf(wcs0Var.f188498d));
        contentValues.put("metadata_fingerprint", Long.valueOf(j2));
        contentValues.put("data", bArrM14308g);
        contentValues.put("realtime", Integer.valueOf(z ? 1 : 0));
        try {
            long jUpdate = m168765v().update("raw_events", contentValues, "rowid = ?", new String[]{String.valueOf(j)});
            if (jUpdate == 1) {
                return true;
            }
            zzj().m114558A().m153302c("Failed to update raw event. appId, updatedRows", d6x0.m114551p(wcs0Var.f188495a), Long.valueOf(jUpdate));
            return false;
        } catch (SQLiteException e) {
            zzj().m114558A().m153302c("Error updating raw event. appId", d6x0.m114551p(wcs0Var.f188495a), e);
            return false;
        }
    }

    /* JADX INFO: renamed from: Y0 */
    public final void m168740Y0(String str) {
        pbs0 pbs0VarM168704F0;
        m168722P0("events_snapshot", str);
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = m168765v().query("events", (String[]) Collections.singletonList(AuthenticationTokenClaims.JSON_KEY_NAME).toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return;
                }
                do {
                    String string = cursorQuery.getString(0);
                    if (string != null && (pbs0VarM168704F0 = m168704F0(str, string)) != null) {
                        m168731U("events_snapshot", pbs0VarM168704F0);
                    }
                } while (cursorQuery.moveToNext());
                cursorQuery.close();
            } catch (SQLiteException e) {
                zzj().m114558A().m153302c("Error creating snapshot. appId", d6x0.m114551p(str), e);
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
    public final boolean m168741Z(C2336c0 c2336c0, boolean z) {
        mo15146h();
        m163482o();
        Preconditions.checkNotNull(c2336c0);
        Preconditions.checkNotEmpty(c2336c0.m13975A2());
        Preconditions.checkState(c2336c0.m13988O0());
        m168750d1();
        long jCurrentTimeMillis = zzb().currentTimeMillis();
        if (c2336c0.m14017f2() < jCurrentTimeMillis - ajr0.m98418J() || c2336c0.m14017f2() > ajr0.m98418J() + jCurrentTimeMillis) {
            zzj().m114563F().m153303d("Storing bundle outside of the max uploading time span. appId, now, timestamp", d6x0.m114551p(c2336c0.m13975A2()), Long.valueOf(jCurrentTimeMillis), Long.valueOf(c2336c0.m14017f2()));
        }
        try {
            byte[] bArrM201887b0 = mo15192i().m201887b0(c2336c0.m14308g());
            zzj().m114562E().m153301b("Saving bundle, size", Integer.valueOf(bArrM201887b0.length));
            ContentValues contentValues = new ContentValues();
            contentValues.put(com.tencent.connect.common.Constants.JumpUrlConstants.URL_KEY_APPID, c2336c0.m13975A2());
            contentValues.put("bundle_end_timestamp", Long.valueOf(c2336c0.m14017f2()));
            contentValues.put("data", bArrM201887b0);
            contentValues.put("has_realtime", Integer.valueOf(z ? 1 : 0));
            if (c2336c0.m13997V0()) {
                contentValues.put("retry_count", Integer.valueOf(c2336c0.m13977E1()));
            }
            try {
                if (m168765v().insert("queue", null, contentValues) != -1) {
                    return true;
                }
                zzj().m114558A().m153301b("Failed to insert bundle (got -1). appId", d6x0.m114551p(c2336c0.m13975A2()));
                return false;
            } catch (SQLiteException e) {
                zzj().m114558A().m153302c("Error storing bundle. appId", d6x0.m114551p(c2336c0.m13975A2()), e);
                return false;
            }
        } catch (IOException e2) {
            zzj().m114558A().m153302c("Data loss. Failed to serialize bundle. appId", d6x0.m114551p(c2336c0.m13975A2()), e2);
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:65:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:70:0x0106 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x0108 A[ADDED_TO_REGION] */
    /* JADX INFO: renamed from: Z0 */
    public final void m168742Z0(String str) throws Throwable {
        boolean z;
        pbs0 pbs0VarM168700D0;
        ArrayList arrayList = new ArrayList(Arrays.asList(AuthenticationTokenClaims.JSON_KEY_NAME, "lifetime_count"));
        pbs0 pbs0VarM168704F0 = m168704F0(str, "_f");
        pbs0 pbs0VarM168704F1 = m168704F0(str, "_v");
        m168722P0("events", str);
        boolean z2 = false;
        Cursor cursorQuery = null;
        try {
            cursorQuery = m168765v().query("events_snapshot", (String[]) arrayList.toArray(new String[0]), "app_id=?", new String[]{str}, null, null, null);
            if (!cursorQuery.moveToFirst()) {
                cursorQuery.close();
                if (pbs0VarM168704F0 != null) {
                    m168731U("events", pbs0VarM168704F0);
                } else if (pbs0VarM168704F1 != null) {
                    m168731U("events", pbs0VarM168704F1);
                }
                m168722P0("events_snapshot", str);
                return;
            }
            boolean z3 = false;
            z = false;
            do {
                try {
                    String string = cursorQuery.getString(0);
                    if (mo15139a().m98440n(whs0.f189249b1)) {
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
                    if (string != null && (pbs0VarM168700D0 = m168700D0("events_snapshot", str, string)) != null) {
                        m168731U("events", pbs0VarM168700D0);
                    }
                } catch (SQLiteException e) {
                    e = e;
                    z2 = z3;
                    try {
                        zzj().m114558A().m153302c("Error querying snapshot. appId", d6x0.m114551p(str), e);
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        if (!z2 && pbs0VarM168704F0 != null) {
                            m168731U("events", pbs0VarM168704F0);
                        } else if (!z && pbs0VarM168704F1 != null) {
                            m168731U("events", pbs0VarM168704F1);
                        }
                        m168722P0("events_snapshot", str);
                        return;
                    } catch (Throwable th) {
                        th = th;
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        if (z2 && pbs0VarM168704F0 != null) {
                            m168731U("events", pbs0VarM168704F0);
                        } else if (!z && pbs0VarM168704F1 != null) {
                            m168731U("events", pbs0VarM168704F1);
                        }
                        m168722P0("events_snapshot", str);
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
                            m168731U("events", pbs0VarM168704F1);
                        }
                    } else if (!z) {
                        m168731U("events", pbs0VarM168704F1);
                    }
                    m168722P0("events_snapshot", str);
                    throw th;
                }
            } while (cursorQuery.moveToNext());
            cursorQuery.close();
            if (!z3 && pbs0VarM168704F0 != null) {
                m168731U("events", pbs0VarM168704F0);
            } else if (!z && pbs0VarM168704F1 != null) {
                m168731U("events", pbs0VarM168704F1);
            }
            m168722P0("events_snapshot", str);
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
    public final boolean m168743a0(zzae zzaeVar) {
        Preconditions.checkNotNull(zzaeVar);
        mo15146h();
        m163482o();
        String str = zzaeVar.zza;
        Preconditions.checkNotNull(str);
        if (m168708H0(str, zzaeVar.zzc.zza) == null && m168768w0("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str}) >= 1000) {
            return false;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(com.tencent.connect.common.Constants.JumpUrlConstants.URL_KEY_APPID, str);
        contentValues.put("origin", zzaeVar.zzb);
        contentValues.put(AuthenticationTokenClaims.JSON_KEY_NAME, zzaeVar.zzc.zza);
        m168683N(contentValues, "value", Preconditions.checkNotNull(zzaeVar.zzc.m15413F()));
        contentValues.put(Active.TYPE, Boolean.valueOf(zzaeVar.zze));
        contentValues.put("trigger_event_name", zzaeVar.zzf);
        contentValues.put("trigger_timeout", Long.valueOf(zzaeVar.zzh));
        mo15143e();
        contentValues.put("timed_out_event", hny0.m136311k0(zzaeVar.zzg));
        contentValues.put("creation_timestamp", Long.valueOf(zzaeVar.zzd));
        mo15143e();
        contentValues.put("triggered_event", hny0.m136311k0(zzaeVar.zzi));
        contentValues.put("triggered_timestamp", Long.valueOf(zzaeVar.zzc.zzb));
        contentValues.put("time_to_live", Long.valueOf(zzaeVar.zzj));
        mo15143e();
        contentValues.put("expired_event", hny0.m136311k0(zzaeVar.zzk));
        try {
            if (m168765v().insertWithOnConflict("conditional_properties", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().m114558A().m153301b("Failed to insert/update conditional user property (got -1)", d6x0.m114551p(str));
            return true;
        } catch (SQLiteException e) {
            zzj().m114558A().m153302c("Error storing conditional user property", d6x0.m114551p(str), e);
            return true;
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: a1 */
    public final boolean m168744a1(String str) {
        if (gqy0.m131505a() && !mo15139a().m98440n(whs0.f189197C0)) {
            return false;
        }
        String strM168762t0 = m168762t0();
        StringBuilder sb = new StringBuilder("SELECT COUNT(1) > 0 FROM upload_queue WHERE app_id=? AND NOT ");
        sb.append(strM168762t0);
        return m168768w0(sb.toString(), new String[]{str}) != 0;
    }

    @WorkerThread
    /* JADX INFO: renamed from: b0 */
    public final boolean m168745b0(String str, int i, C2335c c2335c) {
        m163482o();
        mo15146h();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(c2335c);
        if (c2335c.m13890L().isEmpty()) {
            zzj().m114563F().m153303d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", d6x0.m114551p(str), Integer.valueOf(i), String.valueOf(c2335c.m13896W() ? Integer.valueOf(c2335c.m13888E()) : null));
            return false;
        }
        byte[] bArrM14308g = c2335c.m14308g();
        ContentValues contentValues = new ContentValues();
        contentValues.put(com.tencent.connect.common.Constants.JumpUrlConstants.URL_KEY_APPID, str);
        contentValues.put("audience_id", Integer.valueOf(i));
        contentValues.put("filter_id", c2335c.m13896W() ? Integer.valueOf(c2335c.m13888E()) : null);
        contentValues.put("event_name", c2335c.m13890L());
        contentValues.put("session_scoped", c2335c.m13897X() ? Boolean.valueOf(c2335c.m13894U()) : null);
        contentValues.put("data", bArrM14308g);
        try {
            if (m168765v().insertWithOnConflict("event_filters", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().m114558A().m153301b("Failed to insert event filter (got -1). appId", d6x0.m114551p(str));
            return true;
        } catch (SQLiteException e) {
            zzj().m114558A().m153302c("Error storing event filter. appId", d6x0.m114551p(str), e);
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005d  */
    /* JADX INFO: renamed from: b1 */
    public final boolean m168746b1(String str) {
        boolean z;
        boolean z2;
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = m168765v().rawQuery("select timestamp from raw_events where app_id=? and name = '_f' limit 1;", new String[]{str});
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return false;
                }
                z = zzb().currentTimeMillis() < cursorRawQuery.getLong(0) + 15000;
                try {
                    z2 = m168694A("select count(*) from raw_events where app_id=? and name not like '!_%' escape '!' limit 1;", new String[]{str}, 0L) > 0;
                    cursorRawQuery.close();
                } catch (SQLiteException e) {
                    e = e;
                    zzj().m114558A().m153301b("Error checking backfill conditions", e);
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
        zzj().m114558A().m153301b("Error checking backfill conditions", e);
        if (cursorRawQuery != null) {
            cursorRawQuery.close();
        }
        z2 = false;
        if (z) {
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: c0 */
    public final boolean m168747c0(String str, int i, C2339e c2339e) {
        m163482o();
        mo15146h();
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(c2339e);
        if (c2339e.m14187G().isEmpty()) {
            zzj().m114563F().m153303d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", d6x0.m114551p(str), Integer.valueOf(i), String.valueOf(c2339e.m14191M() ? Integer.valueOf(c2339e.m14193h()) : null));
            return false;
        }
        byte[] bArrM14308g = c2339e.m14308g();
        ContentValues contentValues = new ContentValues();
        contentValues.put(com.tencent.connect.common.Constants.JumpUrlConstants.URL_KEY_APPID, str);
        contentValues.put("audience_id", Integer.valueOf(i));
        contentValues.put("filter_id", c2339e.m14191M() ? Integer.valueOf(c2339e.m14193h()) : null);
        contentValues.put("property_name", c2339e.m14187G());
        contentValues.put("session_scoped", c2339e.m14192N() ? Boolean.valueOf(c2339e.m14190L()) : null);
        contentValues.put("data", bArrM14308g);
        try {
            if (m168765v().insertWithOnConflict("property_filters", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().m114558A().m153301b("Failed to insert property filter (got -1). appId", d6x0.m114551p(str));
            return false;
        } catch (SQLiteException e) {
            zzj().m114558A().m153302c("Error storing property filter. appId", d6x0.m114551p(str), e);
            return false;
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: c1 */
    public final void m168748c1() {
        m163482o();
        m168765v().endTransaction();
    }

    @WorkerThread
    /* JADX INFO: renamed from: d0 */
    public final boolean m168749d0(String str, zzfy$zzj zzfy_zzj, String str2, Map<String, String> map, zznt zzntVar) {
        int iDelete;
        mo15146h();
        m163482o();
        Preconditions.checkNotNull(zzfy_zzj);
        Preconditions.checkNotEmpty(str);
        if (gqy0.m131505a() && !mo15139a().m98440n(whs0.f189197C0)) {
            return false;
        }
        mo15146h();
        m163482o();
        if (m168759i0()) {
            long jM219990a = mo15196m().f126671f.m219990a();
            long jElapsedRealtime = zzb().elapsedRealtime();
            if (Math.abs(jElapsedRealtime - jM219990a) > ajr0.m98419K()) {
                mo15196m().f126671f.m219991b(jElapsedRealtime);
                mo15146h();
                m163482o();
                if (m168759i0() && (iDelete = m168765v().delete("upload_queue", m168762t0(), new String[0])) > 0) {
                    zzj().m114562E().m153301b("Deleted stale MeasurementBatch rows from upload_queue. rowsDeleted", Integer.valueOf(iDelete));
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            arrayList.add(entry.getKey() + "=" + entry.getValue());
        }
        byte[] bArrM14308g = zzfy_zzj.m14308g();
        ContentValues contentValues = new ContentValues();
        contentValues.put(com.tencent.connect.common.Constants.JumpUrlConstants.URL_KEY_APPID, str);
        contentValues.put("measurement_batch", bArrM14308g);
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
            if (m168765v().insert("upload_queue", null, contentValues) != -1) {
                return true;
            }
            zzj().m114558A().m153301b("Failed to insert MeasurementBatch (got -1) to upload_queue. appId", str);
            return false;
        } catch (SQLiteException e) {
            zzj().m114558A().m153302c("Error storing MeasurementBatch to upload_queue. appId", str, e);
            return false;
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: d1 */
    public final void m168750d1() {
        int iDelete;
        mo15146h();
        m163482o();
        if (m168759i0()) {
            long jM219990a = mo15196m().f126670e.m219990a();
            long jElapsedRealtime = zzb().elapsedRealtime();
            if (Math.abs(jElapsedRealtime - jM219990a) > ajr0.m98419K()) {
                mo15196m().f126670e.m219991b(jElapsedRealtime);
                mo15146h();
                m163482o();
                if (!m168759i0() || (iDelete = m168765v().delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(zzb().currentTimeMillis()), String.valueOf(ajr0.m98418J())})) <= 0) {
                    return;
                }
                zzj().m114562E().m153301b("Deleted stale rows. rowsDeleted", Integer.valueOf(iDelete));
            }
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: e0 */
    public final boolean m168751e0(String str, zzno zznoVar) {
        mo15146h();
        m163482o();
        Preconditions.checkNotNull(zznoVar);
        Preconditions.checkNotEmpty(str);
        long jCurrentTimeMillis = zzb().currentTimeMillis();
        long j = zznoVar.zzb;
        zpw0<Long> zpw0Var = whs0.f189269i0;
        if (j < jCurrentTimeMillis - zpw0Var.m220931a(null).longValue() || zznoVar.zzb > zpw0Var.m220931a(null).longValue() + jCurrentTimeMillis) {
            zzj().m114563F().m153303d("Storing trigger URI outside of the max retention time span. appId, now, timestamp", d6x0.m114551p(str), Long.valueOf(jCurrentTimeMillis), Long.valueOf(zznoVar.zzb));
        }
        zzj().m114562E().m153300a("Saving trigger URI");
        ContentValues contentValues = new ContentValues();
        contentValues.put(com.tencent.connect.common.Constants.JumpUrlConstants.URL_KEY_APPID, str);
        contentValues.put("trigger_uri", zznoVar.zza);
        contentValues.put("source", Integer.valueOf(zznoVar.zzc));
        contentValues.put("timestamp_millis", Long.valueOf(zznoVar.zzb));
        try {
            if (m168765v().insert("trigger_uris", null, contentValues) != -1) {
                return true;
            }
            zzj().m114558A().m153301b("Failed to insert trigger URI (got -1). appId", d6x0.m114551p(str));
            return false;
        } catch (SQLiteException e) {
            zzj().m114558A().m153302c("Error storing trigger URI. appId", d6x0.m114551p(str), e);
            return false;
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: e1 */
    public final void m168752e1() {
        m163482o();
        m168765v().setTransactionSuccessful();
    }

    /* JADX INFO: renamed from: f0 */
    public final boolean m168753f0(String str, Long l2, long j, C2379y c2379y) {
        mo15146h();
        m163482o();
        Preconditions.checkNotNull(c2379y);
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(l2);
        byte[] bArrM14308g = c2379y.m14308g();
        zzj().m114562E().m153302c("Saving complex main event, appId, data size", mo15141c().m208449c(str), Integer.valueOf(bArrM14308g.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put(com.tencent.connect.common.Constants.JumpUrlConstants.URL_KEY_APPID, str);
        contentValues.put("event_id", l2);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", bArrM14308g);
        try {
            if (m168765v().insertWithOnConflict("main_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().m114558A().m153301b("Failed to insert complex main event (got -1). appId", d6x0.m114551p(str));
            return false;
        } catch (SQLiteException e) {
            zzj().m114558A().m153302c("Error storing complex main event. appId", d6x0.m114551p(str), e);
            return false;
        }
    }

    /* JADX INFO: renamed from: f1 */
    public final boolean m168754f1() {
        return m168768w0("select count(1) > 0 from raw_events", null) != 0;
    }

    /* JADX INFO: renamed from: g0 */
    public final boolean m168755g0(wcs0 wcs0Var, long j, boolean z) {
        mo15146h();
        m163482o();
        Preconditions.checkNotNull(wcs0Var);
        Preconditions.checkNotEmpty(wcs0Var.f188495a);
        byte[] bArrM14308g = mo15192i().m201894y(wcs0Var).m14308g();
        ContentValues contentValues = new ContentValues();
        contentValues.put(com.tencent.connect.common.Constants.JumpUrlConstants.URL_KEY_APPID, wcs0Var.f188495a);
        contentValues.put(AuthenticationTokenClaims.JSON_KEY_NAME, wcs0Var.f188496b);
        contentValues.put("timestamp", Long.valueOf(wcs0Var.f188498d));
        contentValues.put("metadata_fingerprint", Long.valueOf(j));
        contentValues.put("data", bArrM14308g);
        contentValues.put("realtime", Integer.valueOf(z ? 1 : 0));
        try {
            if (m168765v().insert("raw_events", null, contentValues) != -1) {
                return true;
            }
            zzj().m114558A().m153301b("Failed to insert raw event (got -1). appId", d6x0.m114551p(wcs0Var.f188495a));
            return false;
        } catch (SQLiteException e) {
            zzj().m114558A().m153302c("Error storing raw event. appId", d6x0.m114551p(wcs0Var.f188495a), e);
            return false;
        }
    }

    /* JADX INFO: renamed from: g1 */
    public final boolean m168756g1() {
        return m168768w0("select count(1) > 0 from queue where has_realtime = 1", null) != 0;
    }

    @WorkerThread
    /* JADX INFO: renamed from: h0 */
    public final boolean m168757h0(ymy0 ymy0Var) {
        Preconditions.checkNotNull(ymy0Var);
        mo15146h();
        m163482o();
        if (m168708H0(ymy0Var.f200727a, ymy0Var.f200729c) == null) {
            if (hny0.m136294E0(ymy0Var.f200729c)) {
                if (m168768w0("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{ymy0Var.f200727a}) >= mo15139a().m98437k(ymy0Var.f200727a, whs0.f189210J, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(ymy0Var.f200729c) && m168768w0("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{ymy0Var.f200727a, ymy0Var.f200728b}) >= 25) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put(com.tencent.connect.common.Constants.JumpUrlConstants.URL_KEY_APPID, ymy0Var.f200727a);
        contentValues.put("origin", ymy0Var.f200728b);
        contentValues.put(AuthenticationTokenClaims.JSON_KEY_NAME, ymy0Var.f200729c);
        contentValues.put("set_timestamp", Long.valueOf(ymy0Var.f200730d));
        m168683N(contentValues, "value", ymy0Var.f200731e);
        try {
            if (m168765v().insertWithOnConflict("user_attributes", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().m114558A().m153301b("Failed to insert/update user property (got -1). appId", d6x0.m114551p(ymy0Var.f200727a));
            return true;
        } catch (SQLiteException e) {
            zzj().m114558A().m153302c("Error storing user property. appId", d6x0.m114551p(ymy0Var.f200727a), e);
            return true;
        }
    }

    /* JADX INFO: renamed from: h1 */
    public final boolean m168758h1() {
        return m168768w0("select count(1) > 0 from raw_events where realtime = 1", null) != 0;
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: i0 */
    public final boolean m168759i0() {
        return zza().getDatabasePath("google_app_measurement.db").exists();
    }

    @Override // p153l.njy0
    /* JADX INFO: renamed from: r */
    public final boolean mo15198r() {
        return false;
    }

    /* JADX INFO: renamed from: s */
    public final long m168760s() {
        Cursor cursorRawQuery = null;
        try {
            try {
                cursorRawQuery = m168765v().rawQuery("select rowid from raw_events order by rowid desc limit 1;", null);
                if (!cursorRawQuery.moveToFirst()) {
                    cursorRawQuery.close();
                    return -1L;
                }
                long j = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j;
            } catch (SQLiteException e) {
                zzj().m114558A().m153301b("Error querying raw events", e);
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
    public final long m168761t() {
        return m168694A("select max(bundle_end_timestamp) from queue", null, 0L);
    }

    /* JADX INFO: renamed from: t0 */
    public final String m168762t0() {
        long jCurrentTimeMillis = zzb().currentTimeMillis();
        zznt zzntVar = zznt.GOOGLE_SIGNAL;
        return "(" + ("(upload_type = " + zzntVar.zza() + " AND (ABS(creation_timestamp - " + jCurrentTimeMillis + ") > CAST(" + whs0.f189204G.m220931a(null).longValue() + " AS INTEGER)))") + " OR " + ("(upload_type != " + zzntVar.zza() + " AND (ABS(creation_timestamp - " + jCurrentTimeMillis + ") > CAST(" + ajr0.m98418J() + " AS INTEGER)))") + ")";
    }

    @WorkerThread
    /* JADX INFO: renamed from: u */
    public final long m168763u() {
        return m168694A("select max(timestamp) from raw_events", null, 0L);
    }

    @WorkerThread
    /* JADX INFO: renamed from: u0 */
    public final long m168764u0(String str) {
        Preconditions.checkNotEmpty(str);
        mo15146h();
        m163482o();
        return m168694A("select first_open_count from app2 where app_id=?", new String[]{str}, -1L);
    }

    @VisibleForTesting
    @WorkerThread
    /* JADX INFO: renamed from: v */
    public final SQLiteDatabase m168765v() {
        mo15146h();
        try {
            return this.f148492d.getWritableDatabase();
        } catch (SQLiteException e) {
            zzj().m114563F().m153301b("Error opening database", e);
            throw e;
        }
    }

    @VisibleForTesting
    @WorkerThread
    /* JADX INFO: renamed from: v0 */
    public final long m168766v0(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        mo15146h();
        m163482o();
        SQLiteDatabase sQLiteDatabaseM168765v = m168765v();
        sQLiteDatabaseM168765v.beginTransaction();
        long j = 0;
        try {
            try {
                long jM168694A = m168694A("select " + str2 + " from app2 where app_id=?", new String[]{str}, -1L);
                if (jM168694A == -1) {
                    ContentValues contentValues = new ContentValues();
                    contentValues.put(com.tencent.connect.common.Constants.JumpUrlConstants.URL_KEY_APPID, str);
                    contentValues.put("first_open_count", (Integer) 0);
                    contentValues.put("previous_install_count", (Integer) 0);
                    if (sQLiteDatabaseM168765v.insertWithOnConflict("app2", null, contentValues, 5) == -1) {
                        zzj().m114558A().m153302c("Failed to insert column (got -1). appId", d6x0.m114551p(str), str2);
                        return -1L;
                    }
                    jM168694A = 0;
                    zzj().m114558A().m153303d("Error inserting column. appId", d6x0.m114551p(str), str2, e);
                    return j;
                }
                try {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put(com.tencent.connect.common.Constants.JumpUrlConstants.URL_KEY_APPID, str);
                    contentValues2.put(str2, Long.valueOf(1 + jM168694A));
                    if (sQLiteDatabaseM168765v.update("app2", contentValues2, "app_id = ?", new String[]{str}) == 0) {
                        zzj().m114558A().m153302c("Failed to update column (got 0). appId", d6x0.m114551p(str), str2);
                        return -1L;
                    }
                    sQLiteDatabaseM168765v.setTransactionSuccessful();
                    return jM168694A;
                } catch (SQLiteException e) {
                    e = e;
                    j = jM168694A;
                }
            } finally {
                sQLiteDatabaseM168765v.endTransaction();
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
    public final String m168767w() throws Throwable {
        Cursor cursorRawQuery;
        SQLiteDatabase sQLiteDatabaseM168765v = m168765v();
        ?? r1 = 0;
        try {
            try {
                cursorRawQuery = sQLiteDatabaseM168765v.rawQuery("select app_id from queue order by has_realtime desc, rowid asc limit 1;", null);
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
                    zzj().m114558A().m153301b("Database error getting next bundle app id", e);
                    if (cursorRawQuery != null) {
                        cursorRawQuery.close();
                    }
                    return null;
                }
            } catch (Throwable th) {
                th = th;
                r1 = sQLiteDatabaseM168765v;
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
    public final long m168768w0(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor cursorRawQuery = m168765v().rawQuery(str, strArr);
                if (!cursorRawQuery.moveToFirst()) {
                    throw new SQLiteException("Database returned empty set");
                }
                long j = cursorRawQuery.getLong(0);
                cursorRawQuery.close();
                return j;
            } catch (SQLiteException e) {
                zzj().m114558A().m153302c("Database error", str, e);
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
    public final int m168769x(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        mo15146h();
        m163482o();
        try {
            return m168765v().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            zzj().m114558A().m153303d("Error deleting conditional property", d6x0.m114551p(str), mo15141c().m208452g(str2), e);
            return 0;
        }
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0108  */
    @WorkerThread
    /* JADX INFO: renamed from: x0 */
    public final List<ymy0> m168770x0(String str, String str2, String str3) {
        opr0 opr0Var;
        String string;
        Preconditions.checkNotEmpty(str);
        mo15146h();
        m163482o();
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
                        opr0Var = this;
                        opr0Var.zzj().m114558A().m153303d("(2)Error querying user properties", d6x0.m114551p(str), string, e);
                        List<ymy0> list = Collections.EMPTY_LIST;
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
                cursorQuery = m168765v().query("user_attributes", new String[]{AuthenticationTokenClaims.JSON_KEY_NAME, "set_timestamp", "value", "origin"}, sb.toString(), (String[]) arrayList2.toArray(new String[arrayList2.size()]), null, null, "rowid", "1001");
                if (!cursorQuery.moveToFirst()) {
                    cursorQuery.close();
                    return arrayList;
                }
                while (arrayList.size() < 1000) {
                    String string2 = cursorQuery.getString(0);
                    long j = cursorQuery.getLong(1);
                    opr0Var = this;
                    try {
                        Object objM168699D = opr0Var.m168699D(cursorQuery, 2);
                        string = cursorQuery.getString(3);
                        if (objM168699D == null) {
                            opr0Var.zzj().m114558A().m153303d("(2)Read invalid user property value, ignoring it", d6x0.m114551p(str4), string, str3);
                        } else {
                            arrayList.add(new ymy0(str4, string, string2, j, objM168699D));
                        }
                        if (!cursorQuery.moveToNext()) {
                            cursorQuery.close();
                            return arrayList;
                        }
                        str4 = str;
                    } catch (SQLiteException e2) {
                        e = e2;
                        opr0Var.zzj().m114558A().m153303d("(2)Error querying user properties", d6x0.m114551p(str), string, e);
                        List<ymy0> list2 = Collections.EMPTY_LIST;
                        if (cursorQuery != null) {
                            cursorQuery.close();
                        }
                        return list2;
                    }
                }
                zzj().m114558A().m153301b("Read more than the max allowed user properties, ignoring excess", 1000);
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
            opr0Var = this;
            string = str2;
        }
    }

    /* JADX INFO: renamed from: y */
    public final long m168771y(C2336c0 c2336c0) throws IOException {
        mo15146h();
        m163482o();
        Preconditions.checkNotNull(c2336c0);
        Preconditions.checkNotEmpty(c2336c0.m13975A2());
        byte[] bArrM14308g = c2336c0.m14308g();
        long jM201891u = mo15192i().m201891u(bArrM14308g);
        ContentValues contentValues = new ContentValues();
        contentValues.put(com.tencent.connect.common.Constants.JumpUrlConstants.URL_KEY_APPID, c2336c0.m13975A2());
        contentValues.put("metadata_fingerprint", Long.valueOf(jM201891u));
        contentValues.put("metadata", bArrM14308g);
        try {
            m168765v().insertWithOnConflict("raw_events_metadata", null, contentValues, 4);
            return jM201891u;
        } catch (SQLiteException e) {
            zzj().m114558A().m153302c("Error storing raw event metadata. appId", d6x0.m114551p(c2336c0.m13975A2()), e);
            throw e;
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final void m168772y0(String str, zzje zzjeVar) {
        Preconditions.checkNotNull(str);
        Preconditions.checkNotNull(zzjeVar);
        mo15146h();
        m163482o();
        ContentValues contentValues = new ContentValues();
        contentValues.put(com.tencent.connect.common.Constants.JumpUrlConstants.URL_KEY_APPID, str);
        contentValues.put("consent_state", zzjeVar.m15410x());
        contentValues.put("consent_source", Integer.valueOf(zzjeVar.m15399b()));
        m168727S("consent_settings", com.tencent.connect.common.Constants.JumpUrlConstants.URL_KEY_APPID, contentValues);
    }

    /* JADX INFO: renamed from: z */
    public final long m168773z(String str) {
        Preconditions.checkNotEmpty(str);
        mo15146h();
        m163482o();
        try {
            return m168765v().delete("raw_events", "rowid in (select rowid from raw_events where app_id=? order by rowid desc limit -1 offset ?)", new String[]{str, String.valueOf(Math.max(0, Math.min(PlaybackException.CUSTOM_ERROR_CODE_BASE, mo15139a().m98443q(str, whs0.f189289q))))});
        } catch (SQLiteException e) {
            zzj().m114558A().m153302c("Error deleting over the limit events. appId", d6x0.m114551p(str), e);
            return 0L;
        }
    }

    /* JADX INFO: renamed from: z0 */
    public final boolean m168774z0(String str, Bundle bundle) {
        mo15146h();
        m163482o();
        byte[] bArrM14308g = mo15192i().m201894y(new wcs0(this.f202159a, "", str, "dep", 0L, 0L, bundle)).m14308g();
        zzj().m114562E().m153302c("Saving default event parameters, appId, data size", mo15141c().m208449c(str), Integer.valueOf(bArrM14308g.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put(com.tencent.connect.common.Constants.JumpUrlConstants.URL_KEY_APPID, str);
        contentValues.put("parameters", bArrM14308g);
        try {
            if (m168765v().insertWithOnConflict("default_event_params", null, contentValues, 5) != -1) {
                return true;
            }
            zzj().m114558A().m153301b("Failed to insert default event parameters (got -1). appId", d6x0.m114551p(str));
            return false;
        } catch (SQLiteException e) {
            zzj().m114558A().m153302c("Error storing default event parameters. appId", d6x0.m114551p(str), e);
            return false;
        }
    }
}
