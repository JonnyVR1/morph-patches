package p153l;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.room.CoroutinesRoom;
import androidx.room.RoomDatabase;
import androidx.room.SharedSQLiteStatement;
import androidx.work.BackoffPolicy;
import androidx.work.Data;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo;
import com.google.android.exoplayer2.offline.DownloadService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class sjq0 implements njq0 {

    /* JADX INFO: renamed from: a */
    public final RoomDatabase f169132a;

    /* JADX INFO: renamed from: b */
    public final u2f<mjq0> f169133b;

    /* JADX INFO: renamed from: c */
    public final t2f<mjq0> f169134c;

    /* JADX INFO: renamed from: d */
    public final SharedSQLiteStatement f169135d;

    /* JADX INFO: renamed from: e */
    public final SharedSQLiteStatement f169136e;

    /* JADX INFO: renamed from: f */
    public final SharedSQLiteStatement f169137f;

    /* JADX INFO: renamed from: g */
    public final SharedSQLiteStatement f169138g;

    /* JADX INFO: renamed from: h */
    public final SharedSQLiteStatement f169139h;

    /* JADX INFO: renamed from: i */
    public final SharedSQLiteStatement f169140i;

    /* JADX INFO: renamed from: j */
    public final SharedSQLiteStatement f169141j;

    /* JADX INFO: renamed from: k */
    public final SharedSQLiteStatement f169142k;

    /* JADX INFO: renamed from: l */
    public final SharedSQLiteStatement f169143l;

    /* JADX INFO: renamed from: m */
    public final SharedSQLiteStatement f169144m;

    /* JADX INFO: renamed from: n */
    public final SharedSQLiteStatement f169145n;

    /* JADX INFO: renamed from: o */
    public final SharedSQLiteStatement f169146o;

    /* JADX INFO: renamed from: p */
    public final SharedSQLiteStatement f169147p;

    /* JADX INFO: renamed from: q */
    public final SharedSQLiteStatement f169148q;

    /* JADX INFO: renamed from: r */
    public final SharedSQLiteStatement f169149r;

    /* JADX INFO: renamed from: l.sjq0$a */
    public class C20064a extends SharedSQLiteStatement {
        public C20064a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        @NonNull
        /* JADX INFO: renamed from: e */
        public String mo3934e() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    /* JADX INFO: renamed from: l.sjq0$b */
    public class C20065b extends SharedSQLiteStatement {
        public C20065b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        @NonNull
        /* JADX INFO: renamed from: e */
        public String mo3934e() {
            return "UPDATE workspec SET next_schedule_time_override=? WHERE id=?";
        }
    }

    /* JADX INFO: renamed from: l.sjq0$c */
    public class C20066c extends SharedSQLiteStatement {
        public C20066c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        @NonNull
        /* JADX INFO: renamed from: e */
        public String mo3934e() {
            return "UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)";
        }
    }

    /* JADX INFO: renamed from: l.sjq0$d */
    public class C20067d extends SharedSQLiteStatement {
        public C20067d(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        @NonNull
        /* JADX INFO: renamed from: e */
        public String mo3934e() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    /* JADX INFO: renamed from: l.sjq0$e */
    public class C20068e extends SharedSQLiteStatement {
        public C20068e(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        @NonNull
        /* JADX INFO: renamed from: e */
        public String mo3934e() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    /* JADX INFO: renamed from: l.sjq0$f */
    public class C20069f extends SharedSQLiteStatement {
        public C20069f(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        @NonNull
        /* JADX INFO: renamed from: e */
        public String mo3934e() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    /* JADX INFO: renamed from: l.sjq0$g */
    public class C20070g extends SharedSQLiteStatement {
        public C20070g(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        @NonNull
        /* JADX INFO: renamed from: e */
        public String mo3934e() {
            return "UPDATE workspec SET generation=generation+1 WHERE id=?";
        }
    }

    /* JADX INFO: renamed from: l.sjq0$h */
    public class C20071h extends SharedSQLiteStatement {
        public C20071h(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        @NonNull
        /* JADX INFO: renamed from: e */
        public String mo3934e() {
            return "UPDATE workspec SET stop_reason=? WHERE id=?";
        }
    }

    /* JADX INFO: renamed from: l.sjq0$i */
    public class C20072i extends u2f<mjq0> {
        public C20072i(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        @NonNull
        /* JADX INFO: renamed from: e */
        public String mo3934e() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // p153l.u2f
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void mo110277i(@NonNull r7h0 r7h0Var, @NonNull mjq0 mjq0Var) {
            r7h0Var.bindString(1, mjq0Var.id);
            yjq0 yjq0Var = yjq0.INSTANCE;
            r7h0Var.bindLong(2, yjq0.m216427k(mjq0Var.state));
            r7h0Var.bindString(3, mjq0Var.workerClassName);
            r7h0Var.bindString(4, mjq0Var.inputMergerClassName);
            r7h0Var.bindBlob(5, Data.m4317g(mjq0Var.input));
            r7h0Var.bindBlob(6, Data.m4317g(mjq0Var.output));
            r7h0Var.bindLong(7, mjq0Var.initialDelay);
            r7h0Var.bindLong(8, mjq0Var.intervalDuration);
            r7h0Var.bindLong(9, mjq0Var.flexDuration);
            r7h0Var.bindLong(10, mjq0Var.runAttemptCount);
            r7h0Var.bindLong(11, yjq0.m216417a(mjq0Var.backoffPolicy));
            r7h0Var.bindLong(12, mjq0Var.backoffDelayDuration);
            r7h0Var.bindLong(13, mjq0Var.lastEnqueueTime);
            r7h0Var.bindLong(14, mjq0Var.minimumRetentionDuration);
            r7h0Var.bindLong(15, mjq0Var.scheduleRequestedAt);
            r7h0Var.bindLong(16, mjq0Var.expedited ? 1L : 0L);
            r7h0Var.bindLong(17, yjq0.m216425i(mjq0Var.outOfQuotaPolicy));
            r7h0Var.bindLong(18, mjq0Var.getPeriodCount());
            r7h0Var.bindLong(19, mjq0Var.getGeneration());
            r7h0Var.bindLong(20, mjq0Var.getNextScheduleTimeOverride());
            r7h0Var.bindLong(21, mjq0Var.getNextScheduleTimeOverrideGeneration());
            r7h0Var.bindLong(22, mjq0Var.getStopReason());
            if (mjq0Var.getTraceTag() == null) {
                r7h0Var.bindNull(23);
            } else {
                r7h0Var.bindString(23, mjq0Var.getTraceTag());
            }
            l06 l06Var = mjq0Var.constraints;
            r7h0Var.bindLong(24, yjq0.m216424h(l06Var.getRequiredNetworkType()));
            r7h0Var.bindBlob(25, yjq0.m216419c(l06Var.getRequiredNetworkRequestCompat()));
            r7h0Var.bindLong(26, l06Var.getRequiresCharging() ? 1L : 0L);
            r7h0Var.bindLong(27, l06Var.getRequiresDeviceIdle() ? 1L : 0L);
            r7h0Var.bindLong(28, l06Var.getRequiresBatteryNotLow() ? 1L : 0L);
            r7h0Var.bindLong(29, l06Var.getRequiresStorageNotLow() ? 1L : 0L);
            r7h0Var.bindLong(30, l06Var.getContentTriggerUpdateDelayMillis());
            r7h0Var.bindLong(31, l06Var.getContentTriggerMaxDelayMillis());
            r7h0Var.bindBlob(32, yjq0.m216426j(l06Var.m152309c()));
        }
    }

    /* JADX INFO: renamed from: l.sjq0$j */
    public class CallableC20073j implements Callable<Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ zkd0 f169159a;

        public CallableC20073j(zkd0 zkd0Var) {
            this.f169159a = zkd0Var;
        }

        @Override // java.util.concurrent.Callable
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() throws Exception {
            Boolean boolValueOf;
            Cursor cursorM165592b = o1c.m165592b(sjq0.this.f169132a, this.f169159a, false, null);
            try {
                if (cursorM165592b.moveToFirst()) {
                    boolValueOf = Boolean.valueOf(cursorM165592b.getInt(0) != 0);
                } else {
                    boolValueOf = Boolean.FALSE;
                }
                return boolValueOf;
            } finally {
                cursorM165592b.close();
            }
        }

        public void finalize() {
            this.f169159a.release();
        }
    }

    /* JADX INFO: renamed from: l.sjq0$k */
    public class C20074k extends t2f<mjq0> {
        public C20074k(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        @NonNull
        /* JADX INFO: renamed from: e */
        public String mo3934e() {
            return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`next_schedule_time_override` = ?,`next_schedule_time_override_generation` = ?,`stop_reason` = ?,`trace_tag` = ?,`required_network_type` = ?,`required_network_request` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
        }

        @Override // p153l.t2f
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void mo186305i(@NonNull r7h0 r7h0Var, @NonNull mjq0 mjq0Var) {
            r7h0Var.bindString(1, mjq0Var.id);
            yjq0 yjq0Var = yjq0.INSTANCE;
            r7h0Var.bindLong(2, yjq0.m216427k(mjq0Var.state));
            r7h0Var.bindString(3, mjq0Var.workerClassName);
            r7h0Var.bindString(4, mjq0Var.inputMergerClassName);
            r7h0Var.bindBlob(5, Data.m4317g(mjq0Var.input));
            r7h0Var.bindBlob(6, Data.m4317g(mjq0Var.output));
            r7h0Var.bindLong(7, mjq0Var.initialDelay);
            r7h0Var.bindLong(8, mjq0Var.intervalDuration);
            r7h0Var.bindLong(9, mjq0Var.flexDuration);
            r7h0Var.bindLong(10, mjq0Var.runAttemptCount);
            r7h0Var.bindLong(11, yjq0.m216417a(mjq0Var.backoffPolicy));
            r7h0Var.bindLong(12, mjq0Var.backoffDelayDuration);
            r7h0Var.bindLong(13, mjq0Var.lastEnqueueTime);
            r7h0Var.bindLong(14, mjq0Var.minimumRetentionDuration);
            r7h0Var.bindLong(15, mjq0Var.scheduleRequestedAt);
            r7h0Var.bindLong(16, mjq0Var.expedited ? 1L : 0L);
            r7h0Var.bindLong(17, yjq0.m216425i(mjq0Var.outOfQuotaPolicy));
            r7h0Var.bindLong(18, mjq0Var.getPeriodCount());
            r7h0Var.bindLong(19, mjq0Var.getGeneration());
            r7h0Var.bindLong(20, mjq0Var.getNextScheduleTimeOverride());
            r7h0Var.bindLong(21, mjq0Var.getNextScheduleTimeOverrideGeneration());
            r7h0Var.bindLong(22, mjq0Var.getStopReason());
            if (mjq0Var.getTraceTag() == null) {
                r7h0Var.bindNull(23);
            } else {
                r7h0Var.bindString(23, mjq0Var.getTraceTag());
            }
            l06 l06Var = mjq0Var.constraints;
            r7h0Var.bindLong(24, yjq0.m216424h(l06Var.getRequiredNetworkType()));
            r7h0Var.bindBlob(25, yjq0.m216419c(l06Var.getRequiredNetworkRequestCompat()));
            r7h0Var.bindLong(26, l06Var.getRequiresCharging() ? 1L : 0L);
            r7h0Var.bindLong(27, l06Var.getRequiresDeviceIdle() ? 1L : 0L);
            r7h0Var.bindLong(28, l06Var.getRequiresBatteryNotLow() ? 1L : 0L);
            r7h0Var.bindLong(29, l06Var.getRequiresStorageNotLow() ? 1L : 0L);
            r7h0Var.bindLong(30, l06Var.getContentTriggerUpdateDelayMillis());
            r7h0Var.bindLong(31, l06Var.getContentTriggerMaxDelayMillis());
            r7h0Var.bindBlob(32, yjq0.m216426j(l06Var.m152309c()));
            r7h0Var.bindString(33, mjq0Var.id);
        }
    }

    /* JADX INFO: renamed from: l.sjq0$l */
    public class C20075l extends SharedSQLiteStatement {
        public C20075l(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        @NonNull
        /* JADX INFO: renamed from: e */
        public String mo3934e() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    /* JADX INFO: renamed from: l.sjq0$m */
    public class C20076m extends SharedSQLiteStatement {
        public C20076m(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        @NonNull
        /* JADX INFO: renamed from: e */
        public String mo3934e() {
            return "UPDATE workspec SET state=? WHERE id=?";
        }
    }

    /* JADX INFO: renamed from: l.sjq0$n */
    public class C20077n extends SharedSQLiteStatement {
        public C20077n(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        @NonNull
        /* JADX INFO: renamed from: e */
        public String mo3934e() {
            return "UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?";
        }
    }

    /* JADX INFO: renamed from: l.sjq0$o */
    public class C20078o extends SharedSQLiteStatement {
        public C20078o(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        @NonNull
        /* JADX INFO: renamed from: e */
        public String mo3934e() {
            return "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
        }
    }

    /* JADX INFO: renamed from: l.sjq0$p */
    public class C20079p extends SharedSQLiteStatement {
        public C20079p(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        @NonNull
        /* JADX INFO: renamed from: e */
        public String mo3934e() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    /* JADX INFO: renamed from: l.sjq0$q */
    public class C20080q extends SharedSQLiteStatement {
        public C20080q(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        @NonNull
        /* JADX INFO: renamed from: e */
        public String mo3934e() {
            return "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
        }
    }

    /* JADX INFO: renamed from: l.sjq0$r */
    public class C20081r extends SharedSQLiteStatement {
        public C20081r(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        @NonNull
        /* JADX INFO: renamed from: e */
        public String mo3934e() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    public sjq0(@NonNull RoomDatabase roomDatabase) {
        this.f169132a = roomDatabase;
        this.f169133b = new C20072i(roomDatabase);
        this.f169134c = new C20074k(roomDatabase);
        this.f169135d = new C20075l(roomDatabase);
        this.f169136e = new C20076m(roomDatabase);
        this.f169137f = new C20077n(roomDatabase);
        this.f169138g = new C20078o(roomDatabase);
        this.f169139h = new C20079p(roomDatabase);
        this.f169140i = new C20080q(roomDatabase);
        this.f169141j = new C20081r(roomDatabase);
        this.f169142k = new C20064a(roomDatabase);
        this.f169143l = new C20065b(roomDatabase);
        this.f169144m = new C20066c(roomDatabase);
        this.f169145n = new C20067d(roomDatabase);
        this.f169146o = new C20068e(roomDatabase);
        this.f169147p = new C20069f(roomDatabase);
        this.f169148q = new C20070g(roomDatabase);
        this.f169149r = new C20071h(roomDatabase);
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ Unit m186297H(sjq0 sjq0Var, HashMap map) {
        sjq0Var.m186301J(map);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ Unit m186298I(sjq0 sjq0Var, HashMap map) {
        sjq0Var.m186302K(map);
        return Unit.INSTANCE;
    }

    @NonNull
    /* JADX INFO: renamed from: M */
    public static List<Class<?>> m186300M() {
        return Collections.EMPTY_LIST;
    }

    @Override // p153l.njq0
    /* JADX INFO: renamed from: A */
    public aui<Boolean> mo163429A() {
        return CoroutinesRoom.m3906a(this.f169132a, false, new String[]{"workspec"}, new CallableC20073j(zkd0.m220067d("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0)));
    }

    @Override // p153l.njq0
    /* JADX INFO: renamed from: B */
    public List<mjq0> mo163430B(int i) throws Throwable {
        zkd0 zkd0Var;
        zkd0 zkd0VarM220067d = zkd0.m220067d("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))", 1);
        zkd0VarM220067d.bindLong(1, i);
        this.f169132a.assertNotSuspendingTransaction();
        Cursor cursorM165592b = o1c.m165592b(this.f169132a, zkd0VarM220067d, false, null);
        try {
            int iM213608e = xyb.m213608e(cursorM165592b, "id");
            int iM213608e2 = xyb.m213608e(cursorM165592b, "state");
            int iM213608e3 = xyb.m213608e(cursorM165592b, "worker_class_name");
            int iM213608e4 = xyb.m213608e(cursorM165592b, "input_merger_class_name");
            int iM213608e5 = xyb.m213608e(cursorM165592b, "input");
            int iM213608e6 = xyb.m213608e(cursorM165592b, "output");
            int iM213608e7 = xyb.m213608e(cursorM165592b, "initial_delay");
            int iM213608e8 = xyb.m213608e(cursorM165592b, "interval_duration");
            int iM213608e9 = xyb.m213608e(cursorM165592b, "flex_duration");
            int iM213608e10 = xyb.m213608e(cursorM165592b, "run_attempt_count");
            int iM213608e11 = xyb.m213608e(cursorM165592b, "backoff_policy");
            int iM213608e12 = xyb.m213608e(cursorM165592b, "backoff_delay_duration");
            int iM213608e13 = xyb.m213608e(cursorM165592b, "last_enqueue_time");
            int iM213608e14 = xyb.m213608e(cursorM165592b, "minimum_retention_duration");
            zkd0Var = zkd0VarM220067d;
            try {
                int iM213608e15 = xyb.m213608e(cursorM165592b, "schedule_requested_at");
                int iM213608e16 = xyb.m213608e(cursorM165592b, "run_in_foreground");
                int iM213608e17 = xyb.m213608e(cursorM165592b, "out_of_quota_policy");
                int iM213608e18 = xyb.m213608e(cursorM165592b, "period_count");
                int iM213608e19 = xyb.m213608e(cursorM165592b, "generation");
                int iM213608e20 = xyb.m213608e(cursorM165592b, "next_schedule_time_override");
                int iM213608e21 = xyb.m213608e(cursorM165592b, "next_schedule_time_override_generation");
                int iM213608e22 = xyb.m213608e(cursorM165592b, DownloadService.KEY_STOP_REASON);
                int iM213608e23 = xyb.m213608e(cursorM165592b, "trace_tag");
                int iM213608e24 = xyb.m213608e(cursorM165592b, "required_network_type");
                int iM213608e25 = xyb.m213608e(cursorM165592b, "required_network_request");
                int iM213608e26 = xyb.m213608e(cursorM165592b, "requires_charging");
                int iM213608e27 = xyb.m213608e(cursorM165592b, "requires_device_idle");
                int iM213608e28 = xyb.m213608e(cursorM165592b, "requires_battery_not_low");
                int iM213608e29 = xyb.m213608e(cursorM165592b, "requires_storage_not_low");
                int iM213608e30 = xyb.m213608e(cursorM165592b, "trigger_content_update_delay");
                int iM213608e31 = xyb.m213608e(cursorM165592b, "trigger_max_content_delay");
                int iM213608e32 = xyb.m213608e(cursorM165592b, "content_uri_triggers");
                int i2 = iM213608e14;
                ArrayList arrayList = new ArrayList(cursorM165592b.getCount());
                while (cursorM165592b.moveToNext()) {
                    String string = cursorM165592b.getString(iM213608e);
                    WorkInfo.State stateM216423g = yjq0.m216423g(cursorM165592b.getInt(iM213608e2));
                    String string2 = cursorM165592b.getString(iM213608e3);
                    String string3 = cursorM165592b.getString(iM213608e4);
                    Data dataM4316b = Data.m4316b(cursorM165592b.getBlob(iM213608e5));
                    Data dataM4316b2 = Data.m4316b(cursorM165592b.getBlob(iM213608e6));
                    long j = cursorM165592b.getLong(iM213608e7);
                    long j2 = cursorM165592b.getLong(iM213608e8);
                    long j3 = cursorM165592b.getLong(iM213608e9);
                    int i3 = cursorM165592b.getInt(iM213608e10);
                    BackoffPolicy backoffPolicyM216420d = yjq0.m216420d(cursorM165592b.getInt(iM213608e11));
                    long j4 = cursorM165592b.getLong(iM213608e12);
                    long j5 = cursorM165592b.getLong(iM213608e13);
                    int i4 = i2;
                    long j6 = cursorM165592b.getLong(i4);
                    int i5 = iM213608e;
                    int i6 = iM213608e15;
                    long j7 = cursorM165592b.getLong(i6);
                    iM213608e15 = i6;
                    int i7 = iM213608e16;
                    boolean z = cursorM165592b.getInt(i7) != 0;
                    iM213608e16 = i7;
                    int i8 = iM213608e17;
                    OutOfQuotaPolicy outOfQuotaPolicyM216422f = yjq0.m216422f(cursorM165592b.getInt(i8));
                    iM213608e17 = i8;
                    int i9 = iM213608e18;
                    int i10 = cursorM165592b.getInt(i9);
                    iM213608e18 = i9;
                    int i11 = iM213608e19;
                    int i12 = cursorM165592b.getInt(i11);
                    iM213608e19 = i11;
                    int i13 = iM213608e20;
                    long j8 = cursorM165592b.getLong(i13);
                    iM213608e20 = i13;
                    int i14 = iM213608e21;
                    int i15 = cursorM165592b.getInt(i14);
                    iM213608e21 = i14;
                    int i16 = iM213608e22;
                    int i17 = cursorM165592b.getInt(i16);
                    iM213608e22 = i16;
                    int i18 = iM213608e23;
                    String string4 = cursorM165592b.isNull(i18) ? null : cursorM165592b.getString(i18);
                    iM213608e23 = i18;
                    int i19 = iM213608e24;
                    NetworkType networkTypeM216421e = yjq0.m216421e(cursorM165592b.getInt(i19));
                    iM213608e24 = i19;
                    int i20 = iM213608e25;
                    al20 al20VarM216428l = yjq0.m216428l(cursorM165592b.getBlob(i20));
                    iM213608e25 = i20;
                    int i21 = iM213608e26;
                    boolean z2 = cursorM165592b.getInt(i21) != 0;
                    iM213608e26 = i21;
                    int i22 = iM213608e27;
                    boolean z3 = cursorM165592b.getInt(i22) != 0;
                    iM213608e27 = i22;
                    int i23 = iM213608e28;
                    boolean z4 = cursorM165592b.getInt(i23) != 0;
                    iM213608e28 = i23;
                    int i24 = iM213608e29;
                    boolean z5 = cursorM165592b.getInt(i24) != 0;
                    iM213608e29 = i24;
                    int i25 = iM213608e30;
                    long j9 = cursorM165592b.getLong(i25);
                    iM213608e30 = i25;
                    int i26 = iM213608e31;
                    long j10 = cursorM165592b.getLong(i26);
                    iM213608e31 = i26;
                    int i27 = iM213608e32;
                    iM213608e32 = i27;
                    arrayList.add(new mjq0(string, stateM216423g, string2, string3, dataM4316b, dataM4316b2, j, j2, j3, new l06(al20VarM216428l, networkTypeM216421e, z2, z3, z4, z5, j9, j10, yjq0.m216418b(cursorM165592b.getBlob(i27))), i3, backoffPolicyM216420d, j4, j5, j6, j7, z, outOfQuotaPolicyM216422f, i10, i12, j8, i15, i17, string4));
                    iM213608e = i5;
                    i2 = i4;
                }
                cursorM165592b.close();
                zkd0Var.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorM165592b.close();
                zkd0Var.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            zkd0Var = zkd0VarM220067d;
        }
    }

    @Override // p153l.njq0
    /* JADX INFO: renamed from: C */
    public void mo163431C(String str, Data data) {
        this.f169132a.assertNotSuspendingTransaction();
        r7h0 r7h0VarM3931b = this.f169139h.m3931b();
        r7h0VarM3931b.bindBlob(1, Data.m4317g(data));
        r7h0VarM3931b.bindString(2, str);
        try {
            this.f169132a.beginTransaction();
            try {
                r7h0VarM3931b.executeUpdateDelete();
                this.f169132a.setTransactionSuccessful();
                this.f169132a.endTransaction();
                this.f169139h.m3937h(r7h0VarM3931b);
            } catch (Throwable th) {
                this.f169132a.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            this.f169139h.m3937h(r7h0VarM3931b);
            throw th2;
        }
    }

    @Override // p153l.njq0
    /* JADX INFO: renamed from: D */
    public List<mjq0> mo163432D() throws Throwable {
        zkd0 zkd0Var;
        zkd0 zkd0VarM220067d = zkd0.m220067d("SELECT * FROM workspec WHERE state=1", 0);
        this.f169132a.assertNotSuspendingTransaction();
        Cursor cursorM165592b = o1c.m165592b(this.f169132a, zkd0VarM220067d, false, null);
        try {
            int iM213608e = xyb.m213608e(cursorM165592b, "id");
            int iM213608e2 = xyb.m213608e(cursorM165592b, "state");
            int iM213608e3 = xyb.m213608e(cursorM165592b, "worker_class_name");
            int iM213608e4 = xyb.m213608e(cursorM165592b, "input_merger_class_name");
            int iM213608e5 = xyb.m213608e(cursorM165592b, "input");
            int iM213608e6 = xyb.m213608e(cursorM165592b, "output");
            int iM213608e7 = xyb.m213608e(cursorM165592b, "initial_delay");
            int iM213608e8 = xyb.m213608e(cursorM165592b, "interval_duration");
            int iM213608e9 = xyb.m213608e(cursorM165592b, "flex_duration");
            int iM213608e10 = xyb.m213608e(cursorM165592b, "run_attempt_count");
            int iM213608e11 = xyb.m213608e(cursorM165592b, "backoff_policy");
            int iM213608e12 = xyb.m213608e(cursorM165592b, "backoff_delay_duration");
            int iM213608e13 = xyb.m213608e(cursorM165592b, "last_enqueue_time");
            int iM213608e14 = xyb.m213608e(cursorM165592b, "minimum_retention_duration");
            zkd0Var = zkd0VarM220067d;
            try {
                int iM213608e15 = xyb.m213608e(cursorM165592b, "schedule_requested_at");
                int iM213608e16 = xyb.m213608e(cursorM165592b, "run_in_foreground");
                int iM213608e17 = xyb.m213608e(cursorM165592b, "out_of_quota_policy");
                int iM213608e18 = xyb.m213608e(cursorM165592b, "period_count");
                int iM213608e19 = xyb.m213608e(cursorM165592b, "generation");
                int iM213608e20 = xyb.m213608e(cursorM165592b, "next_schedule_time_override");
                int iM213608e21 = xyb.m213608e(cursorM165592b, "next_schedule_time_override_generation");
                int iM213608e22 = xyb.m213608e(cursorM165592b, DownloadService.KEY_STOP_REASON);
                int iM213608e23 = xyb.m213608e(cursorM165592b, "trace_tag");
                int iM213608e24 = xyb.m213608e(cursorM165592b, "required_network_type");
                int iM213608e25 = xyb.m213608e(cursorM165592b, "required_network_request");
                int iM213608e26 = xyb.m213608e(cursorM165592b, "requires_charging");
                int iM213608e27 = xyb.m213608e(cursorM165592b, "requires_device_idle");
                int iM213608e28 = xyb.m213608e(cursorM165592b, "requires_battery_not_low");
                int iM213608e29 = xyb.m213608e(cursorM165592b, "requires_storage_not_low");
                int iM213608e30 = xyb.m213608e(cursorM165592b, "trigger_content_update_delay");
                int iM213608e31 = xyb.m213608e(cursorM165592b, "trigger_max_content_delay");
                int iM213608e32 = xyb.m213608e(cursorM165592b, "content_uri_triggers");
                int i = iM213608e14;
                ArrayList arrayList = new ArrayList(cursorM165592b.getCount());
                while (cursorM165592b.moveToNext()) {
                    String string = cursorM165592b.getString(iM213608e);
                    WorkInfo.State stateM216423g = yjq0.m216423g(cursorM165592b.getInt(iM213608e2));
                    String string2 = cursorM165592b.getString(iM213608e3);
                    String string3 = cursorM165592b.getString(iM213608e4);
                    Data dataM4316b = Data.m4316b(cursorM165592b.getBlob(iM213608e5));
                    Data dataM4316b2 = Data.m4316b(cursorM165592b.getBlob(iM213608e6));
                    long j = cursorM165592b.getLong(iM213608e7);
                    long j2 = cursorM165592b.getLong(iM213608e8);
                    long j3 = cursorM165592b.getLong(iM213608e9);
                    int i2 = cursorM165592b.getInt(iM213608e10);
                    BackoffPolicy backoffPolicyM216420d = yjq0.m216420d(cursorM165592b.getInt(iM213608e11));
                    long j4 = cursorM165592b.getLong(iM213608e12);
                    long j5 = cursorM165592b.getLong(iM213608e13);
                    int i3 = i;
                    long j6 = cursorM165592b.getLong(i3);
                    int i4 = iM213608e;
                    int i5 = iM213608e15;
                    long j7 = cursorM165592b.getLong(i5);
                    iM213608e15 = i5;
                    int i6 = iM213608e16;
                    boolean z = cursorM165592b.getInt(i6) != 0;
                    iM213608e16 = i6;
                    int i7 = iM213608e17;
                    OutOfQuotaPolicy outOfQuotaPolicyM216422f = yjq0.m216422f(cursorM165592b.getInt(i7));
                    iM213608e17 = i7;
                    int i8 = iM213608e18;
                    int i9 = cursorM165592b.getInt(i8);
                    iM213608e18 = i8;
                    int i10 = iM213608e19;
                    int i11 = cursorM165592b.getInt(i10);
                    iM213608e19 = i10;
                    int i12 = iM213608e20;
                    long j8 = cursorM165592b.getLong(i12);
                    iM213608e20 = i12;
                    int i13 = iM213608e21;
                    int i14 = cursorM165592b.getInt(i13);
                    iM213608e21 = i13;
                    int i15 = iM213608e22;
                    int i16 = cursorM165592b.getInt(i15);
                    iM213608e22 = i15;
                    int i17 = iM213608e23;
                    String string4 = cursorM165592b.isNull(i17) ? null : cursorM165592b.getString(i17);
                    iM213608e23 = i17;
                    int i18 = iM213608e24;
                    NetworkType networkTypeM216421e = yjq0.m216421e(cursorM165592b.getInt(i18));
                    iM213608e24 = i18;
                    int i19 = iM213608e25;
                    al20 al20VarM216428l = yjq0.m216428l(cursorM165592b.getBlob(i19));
                    iM213608e25 = i19;
                    int i20 = iM213608e26;
                    boolean z2 = cursorM165592b.getInt(i20) != 0;
                    iM213608e26 = i20;
                    int i21 = iM213608e27;
                    boolean z3 = cursorM165592b.getInt(i21) != 0;
                    iM213608e27 = i21;
                    int i22 = iM213608e28;
                    boolean z4 = cursorM165592b.getInt(i22) != 0;
                    iM213608e28 = i22;
                    int i23 = iM213608e29;
                    boolean z5 = cursorM165592b.getInt(i23) != 0;
                    iM213608e29 = i23;
                    int i24 = iM213608e30;
                    long j9 = cursorM165592b.getLong(i24);
                    iM213608e30 = i24;
                    int i25 = iM213608e31;
                    long j10 = cursorM165592b.getLong(i25);
                    iM213608e31 = i25;
                    int i26 = iM213608e32;
                    iM213608e32 = i26;
                    arrayList.add(new mjq0(string, stateM216423g, string2, string3, dataM4316b, dataM4316b2, j, j2, j3, new l06(al20VarM216428l, networkTypeM216421e, z2, z3, z4, z5, j9, j10, yjq0.m216418b(cursorM165592b.getBlob(i26))), i2, backoffPolicyM216420d, j4, j5, j6, j7, z, outOfQuotaPolicyM216422f, i9, i11, j8, i14, i16, string4));
                    iM213608e = i4;
                    i = i3;
                }
                cursorM165592b.close();
                zkd0Var.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorM165592b.close();
                zkd0Var.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            zkd0Var = zkd0VarM220067d;
        }
    }

    @Override // p153l.njq0
    /* JADX INFO: renamed from: E */
    public List<mjq0.C18627c> mo163433E(String str) {
        zkd0 zkd0VarM220067d = zkd0.m220067d("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        zkd0VarM220067d.bindString(1, str);
        this.f169132a.assertNotSuspendingTransaction();
        this.f169132a.beginTransaction();
        try {
            Cursor cursorM165592b = o1c.m165592b(this.f169132a, zkd0VarM220067d, true, null);
            try {
                HashMap<String, ArrayList<String>> map = new HashMap<>();
                HashMap<String, ArrayList<Data>> map2 = new HashMap<>();
                while (cursorM165592b.moveToNext()) {
                    String string = cursorM165592b.getString(0);
                    if (!map.containsKey(string)) {
                        map.put(string, new ArrayList<>());
                    }
                    String string2 = cursorM165592b.getString(0);
                    if (!map2.containsKey(string2)) {
                        map2.put(string2, new ArrayList<>());
                    }
                }
                cursorM165592b.moveToPosition(-1);
                m186302K(map);
                m186301J(map2);
                ArrayList arrayList = new ArrayList(cursorM165592b.getCount());
                while (cursorM165592b.moveToNext()) {
                    String string3 = cursorM165592b.getString(0);
                    WorkInfo.State stateM216423g = yjq0.m216423g(cursorM165592b.getInt(1));
                    Data dataM4316b = Data.m4316b(cursorM165592b.getBlob(2));
                    int i = cursorM165592b.getInt(3);
                    int i2 = cursorM165592b.getInt(4);
                    arrayList.add(new mjq0.C18627c(string3, stateM216423g, dataM4316b, cursorM165592b.getLong(14), cursorM165592b.getLong(15), cursorM165592b.getLong(16), new l06(yjq0.m216428l(cursorM165592b.getBlob(6)), yjq0.m216421e(cursorM165592b.getInt(5)), cursorM165592b.getInt(7) != 0, cursorM165592b.getInt(8) != 0, cursorM165592b.getInt(9) != 0, cursorM165592b.getInt(10) != 0, cursorM165592b.getLong(11), cursorM165592b.getLong(12), yjq0.m216418b(cursorM165592b.getBlob(13))), i, yjq0.m216420d(cursorM165592b.getInt(17)), cursorM165592b.getLong(18), cursorM165592b.getLong(19), cursorM165592b.getInt(20), i2, cursorM165592b.getLong(21), cursorM165592b.getInt(22), map.get(cursorM165592b.getString(0)), map2.get(cursorM165592b.getString(0))));
                }
                this.f169132a.setTransactionSuccessful();
                cursorM165592b.close();
                zkd0VarM220067d.release();
                this.f169132a.endTransaction();
                return arrayList;
            } catch (Throwable th) {
                cursorM165592b.close();
                zkd0VarM220067d.release();
                throw th;
            }
        } catch (Throwable th2) {
            this.f169132a.endTransaction();
            throw th2;
        }
    }

    @Override // p153l.njq0
    /* JADX INFO: renamed from: F */
    public int mo163434F(String str) {
        this.f169132a.assertNotSuspendingTransaction();
        r7h0 r7h0VarM3931b = this.f169141j.m3931b();
        r7h0VarM3931b.bindString(1, str);
        try {
            this.f169132a.beginTransaction();
            try {
                int iExecuteUpdateDelete = r7h0VarM3931b.executeUpdateDelete();
                this.f169132a.setTransactionSuccessful();
                this.f169132a.endTransaction();
                this.f169141j.m3937h(r7h0VarM3931b);
                return iExecuteUpdateDelete;
            } catch (Throwable th) {
                this.f169132a.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            this.f169141j.m3937h(r7h0VarM3931b);
            throw th2;
        }
    }

    @Override // p153l.njq0
    /* JADX INFO: renamed from: G */
    public List<mjq0.C18627c> mo163435G(List<String> list) {
        StringBuilder sbM133931b = h8g0.m133931b();
        sbM133931b.append("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (");
        int size = list.size();
        h8g0.m133930a(sbM133931b, size);
        sbM133931b.append(")");
        zkd0 zkd0VarM220067d = zkd0.m220067d(sbM133931b.toString(), size);
        Iterator<String> it = list.iterator();
        int i = 1;
        while (it.hasNext()) {
            zkd0VarM220067d.bindString(i, it.next());
            i++;
        }
        this.f169132a.assertNotSuspendingTransaction();
        this.f169132a.beginTransaction();
        try {
            Cursor cursorM165592b = o1c.m165592b(this.f169132a, zkd0VarM220067d, true, null);
            try {
                HashMap<String, ArrayList<String>> map = new HashMap<>();
                HashMap<String, ArrayList<Data>> map2 = new HashMap<>();
                while (cursorM165592b.moveToNext()) {
                    String string = cursorM165592b.getString(0);
                    if (!map.containsKey(string)) {
                        map.put(string, new ArrayList<>());
                    }
                    String string2 = cursorM165592b.getString(0);
                    if (!map2.containsKey(string2)) {
                        map2.put(string2, new ArrayList<>());
                    }
                }
                cursorM165592b.moveToPosition(-1);
                m186302K(map);
                m186301J(map2);
                ArrayList arrayList = new ArrayList(cursorM165592b.getCount());
                while (cursorM165592b.moveToNext()) {
                    arrayList.add(new mjq0.C18627c(cursorM165592b.getString(0), yjq0.m216423g(cursorM165592b.getInt(1)), Data.m4316b(cursorM165592b.getBlob(2)), cursorM165592b.getLong(14), cursorM165592b.getLong(15), cursorM165592b.getLong(16), new l06(yjq0.m216428l(cursorM165592b.getBlob(6)), yjq0.m216421e(cursorM165592b.getInt(5)), cursorM165592b.getInt(7) != 0, cursorM165592b.getInt(8) != 0, cursorM165592b.getInt(9) != 0, cursorM165592b.getInt(10) != 0, cursorM165592b.getLong(11), cursorM165592b.getLong(12), yjq0.m216418b(cursorM165592b.getBlob(13))), cursorM165592b.getInt(3), yjq0.m216420d(cursorM165592b.getInt(17)), cursorM165592b.getLong(18), cursorM165592b.getLong(19), cursorM165592b.getInt(20), cursorM165592b.getInt(4), cursorM165592b.getLong(21), cursorM165592b.getInt(22), map.get(cursorM165592b.getString(0)), map2.get(cursorM165592b.getString(0))));
                }
                this.f169132a.setTransactionSuccessful();
                cursorM165592b.close();
                zkd0VarM220067d.release();
                this.f169132a.endTransaction();
                return arrayList;
            } catch (Throwable th) {
                cursorM165592b.close();
                zkd0VarM220067d.release();
                throw th;
            }
        } catch (Throwable th2) {
            this.f169132a.endTransaction();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m186301J(@NonNull HashMap<String, ArrayList<Data>> map) {
        Set<String> setKeySet = map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (map.size() > 999) {
            pwc0.m174056a(map, true, new Function1() { // from class: l.rjq0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return sjq0.m186297H(this.f163500a, (HashMap) obj);
                }
            });
            return;
        }
        StringBuilder sbM133931b = h8g0.m133931b();
        sbM133931b.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int size = setKeySet.size();
        h8g0.m133930a(sbM133931b, size);
        sbM133931b.append(")");
        zkd0 zkd0VarM220067d = zkd0.m220067d(sbM133931b.toString(), size);
        Iterator<String> it = setKeySet.iterator();
        int i = 1;
        while (it.hasNext()) {
            zkd0VarM220067d.bindString(i, it.next());
            i++;
        }
        Cursor cursorM165592b = o1c.m165592b(this.f169132a, zkd0VarM220067d, false, null);
        try {
            int iM213607d = xyb.m213607d(cursorM165592b, "work_spec_id");
            if (iM213607d == -1) {
                cursorM165592b.close();
                return;
            }
            while (cursorM165592b.moveToNext()) {
                ArrayList<Data> arrayList = map.get(cursorM165592b.getString(iM213607d));
                if (arrayList != null) {
                    arrayList.add(Data.m4316b(cursorM165592b.getBlob(0)));
                }
            }
            cursorM165592b.close();
        } catch (Throwable th) {
            cursorM165592b.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m186302K(@NonNull HashMap<String, ArrayList<String>> map) {
        Set<String> setKeySet = map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (map.size() > 999) {
            pwc0.m174056a(map, true, new Function1() { // from class: l.qjq0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return sjq0.m186298I(this.f158029a, (HashMap) obj);
                }
            });
            return;
        }
        StringBuilder sbM133931b = h8g0.m133931b();
        sbM133931b.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int size = setKeySet.size();
        h8g0.m133930a(sbM133931b, size);
        sbM133931b.append(")");
        zkd0 zkd0VarM220067d = zkd0.m220067d(sbM133931b.toString(), size);
        Iterator<String> it = setKeySet.iterator();
        int i = 1;
        while (it.hasNext()) {
            zkd0VarM220067d.bindString(i, it.next());
            i++;
        }
        Cursor cursorM165592b = o1c.m165592b(this.f169132a, zkd0VarM220067d, false, null);
        try {
            int iM213607d = xyb.m213607d(cursorM165592b, "work_spec_id");
            if (iM213607d == -1) {
                cursorM165592b.close();
                return;
            }
            while (cursorM165592b.moveToNext()) {
                ArrayList<String> arrayList = map.get(cursorM165592b.getString(iM213607d));
                if (arrayList != null) {
                    arrayList.add(cursorM165592b.getString(0));
                }
            }
            cursorM165592b.close();
        } catch (Throwable th) {
            cursorM165592b.close();
            throw th;
        }
    }

    @Override // p153l.njq0
    /* JADX INFO: renamed from: a */
    public void mo163436a() {
        this.f169132a.assertNotSuspendingTransaction();
        r7h0 r7h0VarM3931b = this.f169147p.m3931b();
        try {
            this.f169132a.beginTransaction();
            try {
                r7h0VarM3931b.executeUpdateDelete();
                this.f169132a.setTransactionSuccessful();
                this.f169132a.endTransaction();
                this.f169147p.m3937h(r7h0VarM3931b);
            } catch (Throwable th) {
                this.f169132a.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            this.f169147p.m3937h(r7h0VarM3931b);
            throw th2;
        }
    }

    @Override // p153l.njq0
    /* JADX INFO: renamed from: b */
    public void mo163437b(String str, int i) {
        this.f169132a.assertNotSuspendingTransaction();
        r7h0 r7h0VarM3931b = this.f169149r.m3931b();
        r7h0VarM3931b.bindLong(1, i);
        r7h0VarM3931b.bindString(2, str);
        try {
            this.f169132a.beginTransaction();
            try {
                r7h0VarM3931b.executeUpdateDelete();
                this.f169132a.setTransactionSuccessful();
                this.f169132a.endTransaction();
                this.f169149r.m3937h(r7h0VarM3931b);
            } catch (Throwable th) {
                this.f169132a.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            this.f169149r.m3937h(r7h0VarM3931b);
            throw th2;
        }
    }

    @Override // p153l.njq0
    /* JADX INFO: renamed from: c */
    public List<String> mo163438c(String str) {
        zkd0 zkd0VarM220067d = zkd0.m220067d("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        zkd0VarM220067d.bindString(1, str);
        this.f169132a.assertNotSuspendingTransaction();
        Cursor cursorM165592b = o1c.m165592b(this.f169132a, zkd0VarM220067d, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorM165592b.getCount());
            while (cursorM165592b.moveToNext()) {
                arrayList.add(cursorM165592b.getString(0));
            }
            cursorM165592b.close();
            zkd0VarM220067d.release();
            return arrayList;
        } catch (Throwable th) {
            cursorM165592b.close();
            zkd0VarM220067d.release();
            throw th;
        }
    }

    @Override // p153l.njq0
    /* JADX INFO: renamed from: d */
    public WorkInfo.State mo163439d(String str) {
        zkd0 zkd0VarM220067d = zkd0.m220067d("SELECT state FROM workspec WHERE id=?", 1);
        zkd0VarM220067d.bindString(1, str);
        this.f169132a.assertNotSuspendingTransaction();
        WorkInfo.State stateM216423g = null;
        Cursor cursorM165592b = o1c.m165592b(this.f169132a, zkd0VarM220067d, false, null);
        try {
            if (cursorM165592b.moveToFirst()) {
                Integer numValueOf = cursorM165592b.isNull(0) ? null : Integer.valueOf(cursorM165592b.getInt(0));
                if (numValueOf != null) {
                    yjq0 yjq0Var = yjq0.INSTANCE;
                    stateM216423g = yjq0.m216423g(numValueOf.intValue());
                }
            }
            return stateM216423g;
        } finally {
            cursorM165592b.close();
            zkd0VarM220067d.release();
        }
    }

    @Override // p153l.njq0
    public void delete(String str) {
        this.f169132a.assertNotSuspendingTransaction();
        r7h0 r7h0VarM3931b = this.f169135d.m3931b();
        r7h0VarM3931b.bindString(1, str);
        try {
            this.f169132a.beginTransaction();
            try {
                r7h0VarM3931b.executeUpdateDelete();
                this.f169132a.setTransactionSuccessful();
                this.f169132a.endTransaction();
                this.f169135d.m3937h(r7h0VarM3931b);
            } catch (Throwable th) {
                this.f169132a.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            this.f169135d.m3937h(r7h0VarM3931b);
            throw th2;
        }
    }

    @Override // p153l.njq0
    /* JADX INFO: renamed from: e */
    public int mo163440e(String str) {
        this.f169132a.assertNotSuspendingTransaction();
        r7h0 r7h0VarM3931b = this.f169137f.m3931b();
        r7h0VarM3931b.bindString(1, str);
        try {
            this.f169132a.beginTransaction();
            try {
                int iExecuteUpdateDelete = r7h0VarM3931b.executeUpdateDelete();
                this.f169132a.setTransactionSuccessful();
                this.f169132a.endTransaction();
                this.f169137f.m3937h(r7h0VarM3931b);
                return iExecuteUpdateDelete;
            } catch (Throwable th) {
                this.f169132a.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            this.f169137f.m3937h(r7h0VarM3931b);
            throw th2;
        }
    }

    @Override // p153l.njq0
    /* JADX INFO: renamed from: f */
    public List<String> mo163441f(String str) {
        zkd0 zkd0VarM220067d = zkd0.m220067d("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        zkd0VarM220067d.bindString(1, str);
        this.f169132a.assertNotSuspendingTransaction();
        Cursor cursorM165592b = o1c.m165592b(this.f169132a, zkd0VarM220067d, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorM165592b.getCount());
            while (cursorM165592b.moveToNext()) {
                arrayList.add(cursorM165592b.getString(0));
            }
            cursorM165592b.close();
            zkd0VarM220067d.release();
            return arrayList;
        } catch (Throwable th) {
            cursorM165592b.close();
            zkd0VarM220067d.release();
            throw th;
        }
    }

    @Override // p153l.njq0
    /* JADX INFO: renamed from: g */
    public List<Data> mo163442g(String str) {
        zkd0 zkd0VarM220067d = zkd0.m220067d("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        zkd0VarM220067d.bindString(1, str);
        this.f169132a.assertNotSuspendingTransaction();
        Cursor cursorM165592b = o1c.m165592b(this.f169132a, zkd0VarM220067d, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorM165592b.getCount());
            while (cursorM165592b.moveToNext()) {
                arrayList.add(Data.m4316b(cursorM165592b.getBlob(0)));
            }
            cursorM165592b.close();
            zkd0VarM220067d.release();
            return arrayList;
        } catch (Throwable th) {
            cursorM165592b.close();
            zkd0VarM220067d.release();
            throw th;
        }
    }

    @Override // p153l.njq0
    /* JADX INFO: renamed from: h */
    public List<mjq0.C18627c> mo163443h(String str) {
        zkd0 zkd0VarM220067d = zkd0.m220067d("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        zkd0VarM220067d.bindString(1, str);
        this.f169132a.assertNotSuspendingTransaction();
        this.f169132a.beginTransaction();
        try {
            Cursor cursorM165592b = o1c.m165592b(this.f169132a, zkd0VarM220067d, true, null);
            try {
                HashMap<String, ArrayList<String>> map = new HashMap<>();
                HashMap<String, ArrayList<Data>> map2 = new HashMap<>();
                while (cursorM165592b.moveToNext()) {
                    String string = cursorM165592b.getString(0);
                    if (!map.containsKey(string)) {
                        map.put(string, new ArrayList<>());
                    }
                    String string2 = cursorM165592b.getString(0);
                    if (!map2.containsKey(string2)) {
                        map2.put(string2, new ArrayList<>());
                    }
                }
                cursorM165592b.moveToPosition(-1);
                m186302K(map);
                m186301J(map2);
                ArrayList arrayList = new ArrayList(cursorM165592b.getCount());
                while (cursorM165592b.moveToNext()) {
                    String string3 = cursorM165592b.getString(0);
                    WorkInfo.State stateM216423g = yjq0.m216423g(cursorM165592b.getInt(1));
                    Data dataM4316b = Data.m4316b(cursorM165592b.getBlob(2));
                    int i = cursorM165592b.getInt(3);
                    int i2 = cursorM165592b.getInt(4);
                    arrayList.add(new mjq0.C18627c(string3, stateM216423g, dataM4316b, cursorM165592b.getLong(14), cursorM165592b.getLong(15), cursorM165592b.getLong(16), new l06(yjq0.m216428l(cursorM165592b.getBlob(6)), yjq0.m216421e(cursorM165592b.getInt(5)), cursorM165592b.getInt(7) != 0, cursorM165592b.getInt(8) != 0, cursorM165592b.getInt(9) != 0, cursorM165592b.getInt(10) != 0, cursorM165592b.getLong(11), cursorM165592b.getLong(12), yjq0.m216418b(cursorM165592b.getBlob(13))), i, yjq0.m216420d(cursorM165592b.getInt(17)), cursorM165592b.getLong(18), cursorM165592b.getLong(19), cursorM165592b.getInt(20), i2, cursorM165592b.getLong(21), cursorM165592b.getInt(22), map.get(cursorM165592b.getString(0)), map2.get(cursorM165592b.getString(0))));
                }
                this.f169132a.setTransactionSuccessful();
                cursorM165592b.close();
                zkd0VarM220067d.release();
                this.f169132a.endTransaction();
                return arrayList;
            } catch (Throwable th) {
                cursorM165592b.close();
                zkd0VarM220067d.release();
                throw th;
            }
        } catch (Throwable th2) {
            this.f169132a.endTransaction();
            throw th2;
        }
    }

    @Override // p153l.njq0
    /* JADX INFO: renamed from: i */
    public List<mjq0> mo163444i(int i) throws Throwable {
        zkd0 zkd0Var;
        zkd0 zkd0VarM220067d = zkd0.m220067d("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?", 1);
        zkd0VarM220067d.bindLong(1, i);
        this.f169132a.assertNotSuspendingTransaction();
        Cursor cursorM165592b = o1c.m165592b(this.f169132a, zkd0VarM220067d, false, null);
        try {
            int iM213608e = xyb.m213608e(cursorM165592b, "id");
            int iM213608e2 = xyb.m213608e(cursorM165592b, "state");
            int iM213608e3 = xyb.m213608e(cursorM165592b, "worker_class_name");
            int iM213608e4 = xyb.m213608e(cursorM165592b, "input_merger_class_name");
            int iM213608e5 = xyb.m213608e(cursorM165592b, "input");
            int iM213608e6 = xyb.m213608e(cursorM165592b, "output");
            int iM213608e7 = xyb.m213608e(cursorM165592b, "initial_delay");
            int iM213608e8 = xyb.m213608e(cursorM165592b, "interval_duration");
            int iM213608e9 = xyb.m213608e(cursorM165592b, "flex_duration");
            int iM213608e10 = xyb.m213608e(cursorM165592b, "run_attempt_count");
            int iM213608e11 = xyb.m213608e(cursorM165592b, "backoff_policy");
            int iM213608e12 = xyb.m213608e(cursorM165592b, "backoff_delay_duration");
            int iM213608e13 = xyb.m213608e(cursorM165592b, "last_enqueue_time");
            int iM213608e14 = xyb.m213608e(cursorM165592b, "minimum_retention_duration");
            zkd0Var = zkd0VarM220067d;
            try {
                int iM213608e15 = xyb.m213608e(cursorM165592b, "schedule_requested_at");
                int iM213608e16 = xyb.m213608e(cursorM165592b, "run_in_foreground");
                int iM213608e17 = xyb.m213608e(cursorM165592b, "out_of_quota_policy");
                int iM213608e18 = xyb.m213608e(cursorM165592b, "period_count");
                int iM213608e19 = xyb.m213608e(cursorM165592b, "generation");
                int iM213608e20 = xyb.m213608e(cursorM165592b, "next_schedule_time_override");
                int iM213608e21 = xyb.m213608e(cursorM165592b, "next_schedule_time_override_generation");
                int iM213608e22 = xyb.m213608e(cursorM165592b, DownloadService.KEY_STOP_REASON);
                int iM213608e23 = xyb.m213608e(cursorM165592b, "trace_tag");
                int iM213608e24 = xyb.m213608e(cursorM165592b, "required_network_type");
                int iM213608e25 = xyb.m213608e(cursorM165592b, "required_network_request");
                int iM213608e26 = xyb.m213608e(cursorM165592b, "requires_charging");
                int iM213608e27 = xyb.m213608e(cursorM165592b, "requires_device_idle");
                int iM213608e28 = xyb.m213608e(cursorM165592b, "requires_battery_not_low");
                int iM213608e29 = xyb.m213608e(cursorM165592b, "requires_storage_not_low");
                int iM213608e30 = xyb.m213608e(cursorM165592b, "trigger_content_update_delay");
                int iM213608e31 = xyb.m213608e(cursorM165592b, "trigger_max_content_delay");
                int iM213608e32 = xyb.m213608e(cursorM165592b, "content_uri_triggers");
                int i2 = iM213608e14;
                ArrayList arrayList = new ArrayList(cursorM165592b.getCount());
                while (cursorM165592b.moveToNext()) {
                    String string = cursorM165592b.getString(iM213608e);
                    WorkInfo.State stateM216423g = yjq0.m216423g(cursorM165592b.getInt(iM213608e2));
                    String string2 = cursorM165592b.getString(iM213608e3);
                    String string3 = cursorM165592b.getString(iM213608e4);
                    Data dataM4316b = Data.m4316b(cursorM165592b.getBlob(iM213608e5));
                    Data dataM4316b2 = Data.m4316b(cursorM165592b.getBlob(iM213608e6));
                    long j = cursorM165592b.getLong(iM213608e7);
                    long j2 = cursorM165592b.getLong(iM213608e8);
                    long j3 = cursorM165592b.getLong(iM213608e9);
                    int i3 = cursorM165592b.getInt(iM213608e10);
                    BackoffPolicy backoffPolicyM216420d = yjq0.m216420d(cursorM165592b.getInt(iM213608e11));
                    long j4 = cursorM165592b.getLong(iM213608e12);
                    long j5 = cursorM165592b.getLong(iM213608e13);
                    int i4 = i2;
                    long j6 = cursorM165592b.getLong(i4);
                    int i5 = iM213608e;
                    int i6 = iM213608e15;
                    long j7 = cursorM165592b.getLong(i6);
                    iM213608e15 = i6;
                    int i7 = iM213608e16;
                    boolean z = cursorM165592b.getInt(i7) != 0;
                    iM213608e16 = i7;
                    int i8 = iM213608e17;
                    OutOfQuotaPolicy outOfQuotaPolicyM216422f = yjq0.m216422f(cursorM165592b.getInt(i8));
                    iM213608e17 = i8;
                    int i9 = iM213608e18;
                    int i10 = cursorM165592b.getInt(i9);
                    iM213608e18 = i9;
                    int i11 = iM213608e19;
                    int i12 = cursorM165592b.getInt(i11);
                    iM213608e19 = i11;
                    int i13 = iM213608e20;
                    long j8 = cursorM165592b.getLong(i13);
                    iM213608e20 = i13;
                    int i14 = iM213608e21;
                    int i15 = cursorM165592b.getInt(i14);
                    iM213608e21 = i14;
                    int i16 = iM213608e22;
                    int i17 = cursorM165592b.getInt(i16);
                    iM213608e22 = i16;
                    int i18 = iM213608e23;
                    String string4 = cursorM165592b.isNull(i18) ? null : cursorM165592b.getString(i18);
                    iM213608e23 = i18;
                    int i19 = iM213608e24;
                    NetworkType networkTypeM216421e = yjq0.m216421e(cursorM165592b.getInt(i19));
                    iM213608e24 = i19;
                    int i20 = iM213608e25;
                    al20 al20VarM216428l = yjq0.m216428l(cursorM165592b.getBlob(i20));
                    iM213608e25 = i20;
                    int i21 = iM213608e26;
                    boolean z2 = cursorM165592b.getInt(i21) != 0;
                    iM213608e26 = i21;
                    int i22 = iM213608e27;
                    boolean z3 = cursorM165592b.getInt(i22) != 0;
                    iM213608e27 = i22;
                    int i23 = iM213608e28;
                    boolean z4 = cursorM165592b.getInt(i23) != 0;
                    iM213608e28 = i23;
                    int i24 = iM213608e29;
                    boolean z5 = cursorM165592b.getInt(i24) != 0;
                    iM213608e29 = i24;
                    int i25 = iM213608e30;
                    long j9 = cursorM165592b.getLong(i25);
                    iM213608e30 = i25;
                    int i26 = iM213608e31;
                    long j10 = cursorM165592b.getLong(i26);
                    iM213608e31 = i26;
                    int i27 = iM213608e32;
                    iM213608e32 = i27;
                    arrayList.add(new mjq0(string, stateM216423g, string2, string3, dataM4316b, dataM4316b2, j, j2, j3, new l06(al20VarM216428l, networkTypeM216421e, z2, z3, z4, z5, j9, j10, yjq0.m216418b(cursorM165592b.getBlob(i27))), i3, backoffPolicyM216420d, j4, j5, j6, j7, z, outOfQuotaPolicyM216422f, i10, i12, j8, i15, i17, string4));
                    iM213608e = i5;
                    i2 = i4;
                }
                cursorM165592b.close();
                zkd0Var.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorM165592b.close();
                zkd0Var.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            zkd0Var = zkd0VarM220067d;
        }
    }

    @Override // p153l.njq0
    /* JADX INFO: renamed from: j */
    public int mo163445j(WorkInfo.State state, String str) {
        this.f169132a.assertNotSuspendingTransaction();
        r7h0 r7h0VarM3931b = this.f169136e.m3931b();
        r7h0VarM3931b.bindLong(1, yjq0.m216427k(state));
        r7h0VarM3931b.bindString(2, str);
        try {
            this.f169132a.beginTransaction();
            try {
                int iExecuteUpdateDelete = r7h0VarM3931b.executeUpdateDelete();
                this.f169132a.setTransactionSuccessful();
                this.f169132a.endTransaction();
                this.f169136e.m3937h(r7h0VarM3931b);
                return iExecuteUpdateDelete;
            } catch (Throwable th) {
                this.f169132a.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            this.f169136e.m3937h(r7h0VarM3931b);
            throw th2;
        }
    }

    @Override // p153l.njq0
    /* JADX INFO: renamed from: k */
    public void mo163446k(String str, long j) {
        this.f169132a.assertNotSuspendingTransaction();
        r7h0 r7h0VarM3931b = this.f169140i.m3931b();
        r7h0VarM3931b.bindLong(1, j);
        r7h0VarM3931b.bindString(2, str);
        try {
            this.f169132a.beginTransaction();
            try {
                r7h0VarM3931b.executeUpdateDelete();
                this.f169132a.setTransactionSuccessful();
                this.f169132a.endTransaction();
                this.f169140i.m3937h(r7h0VarM3931b);
            } catch (Throwable th) {
                this.f169132a.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            this.f169140i.m3937h(r7h0VarM3931b);
            throw th2;
        }
    }

    @Override // p153l.njq0
    /* JADX INFO: renamed from: l */
    public List<String> mo163447l() {
        zkd0 zkd0VarM220067d = zkd0.m220067d("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)", 0);
        this.f169132a.assertNotSuspendingTransaction();
        Cursor cursorM165592b = o1c.m165592b(this.f169132a, zkd0VarM220067d, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorM165592b.getCount());
            while (cursorM165592b.moveToNext()) {
                arrayList.add(cursorM165592b.getString(0));
            }
            cursorM165592b.close();
            zkd0VarM220067d.release();
            return arrayList;
        } catch (Throwable th) {
            cursorM165592b.close();
            zkd0VarM220067d.release();
            throw th;
        }
    }

    @Override // p153l.njq0
    /* JADX INFO: renamed from: m */
    public List<mjq0> mo163448m() throws Throwable {
        zkd0 zkd0Var;
        zkd0 zkd0VarM220067d = zkd0.m220067d("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time", 0);
        this.f169132a.assertNotSuspendingTransaction();
        Cursor cursorM165592b = o1c.m165592b(this.f169132a, zkd0VarM220067d, false, null);
        try {
            int iM213608e = xyb.m213608e(cursorM165592b, "id");
            int iM213608e2 = xyb.m213608e(cursorM165592b, "state");
            int iM213608e3 = xyb.m213608e(cursorM165592b, "worker_class_name");
            int iM213608e4 = xyb.m213608e(cursorM165592b, "input_merger_class_name");
            int iM213608e5 = xyb.m213608e(cursorM165592b, "input");
            int iM213608e6 = xyb.m213608e(cursorM165592b, "output");
            int iM213608e7 = xyb.m213608e(cursorM165592b, "initial_delay");
            int iM213608e8 = xyb.m213608e(cursorM165592b, "interval_duration");
            int iM213608e9 = xyb.m213608e(cursorM165592b, "flex_duration");
            int iM213608e10 = xyb.m213608e(cursorM165592b, "run_attempt_count");
            int iM213608e11 = xyb.m213608e(cursorM165592b, "backoff_policy");
            int iM213608e12 = xyb.m213608e(cursorM165592b, "backoff_delay_duration");
            int iM213608e13 = xyb.m213608e(cursorM165592b, "last_enqueue_time");
            int iM213608e14 = xyb.m213608e(cursorM165592b, "minimum_retention_duration");
            zkd0Var = zkd0VarM220067d;
            try {
                int iM213608e15 = xyb.m213608e(cursorM165592b, "schedule_requested_at");
                int iM213608e16 = xyb.m213608e(cursorM165592b, "run_in_foreground");
                int iM213608e17 = xyb.m213608e(cursorM165592b, "out_of_quota_policy");
                int iM213608e18 = xyb.m213608e(cursorM165592b, "period_count");
                int iM213608e19 = xyb.m213608e(cursorM165592b, "generation");
                int iM213608e20 = xyb.m213608e(cursorM165592b, "next_schedule_time_override");
                int iM213608e21 = xyb.m213608e(cursorM165592b, "next_schedule_time_override_generation");
                int iM213608e22 = xyb.m213608e(cursorM165592b, DownloadService.KEY_STOP_REASON);
                int iM213608e23 = xyb.m213608e(cursorM165592b, "trace_tag");
                int iM213608e24 = xyb.m213608e(cursorM165592b, "required_network_type");
                int iM213608e25 = xyb.m213608e(cursorM165592b, "required_network_request");
                int iM213608e26 = xyb.m213608e(cursorM165592b, "requires_charging");
                int iM213608e27 = xyb.m213608e(cursorM165592b, "requires_device_idle");
                int iM213608e28 = xyb.m213608e(cursorM165592b, "requires_battery_not_low");
                int iM213608e29 = xyb.m213608e(cursorM165592b, "requires_storage_not_low");
                int iM213608e30 = xyb.m213608e(cursorM165592b, "trigger_content_update_delay");
                int iM213608e31 = xyb.m213608e(cursorM165592b, "trigger_max_content_delay");
                int iM213608e32 = xyb.m213608e(cursorM165592b, "content_uri_triggers");
                int i = iM213608e14;
                ArrayList arrayList = new ArrayList(cursorM165592b.getCount());
                while (cursorM165592b.moveToNext()) {
                    String string = cursorM165592b.getString(iM213608e);
                    WorkInfo.State stateM216423g = yjq0.m216423g(cursorM165592b.getInt(iM213608e2));
                    String string2 = cursorM165592b.getString(iM213608e3);
                    String string3 = cursorM165592b.getString(iM213608e4);
                    Data dataM4316b = Data.m4316b(cursorM165592b.getBlob(iM213608e5));
                    Data dataM4316b2 = Data.m4316b(cursorM165592b.getBlob(iM213608e6));
                    long j = cursorM165592b.getLong(iM213608e7);
                    long j2 = cursorM165592b.getLong(iM213608e8);
                    long j3 = cursorM165592b.getLong(iM213608e9);
                    int i2 = cursorM165592b.getInt(iM213608e10);
                    BackoffPolicy backoffPolicyM216420d = yjq0.m216420d(cursorM165592b.getInt(iM213608e11));
                    long j4 = cursorM165592b.getLong(iM213608e12);
                    long j5 = cursorM165592b.getLong(iM213608e13);
                    int i3 = i;
                    long j6 = cursorM165592b.getLong(i3);
                    int i4 = iM213608e;
                    int i5 = iM213608e15;
                    long j7 = cursorM165592b.getLong(i5);
                    iM213608e15 = i5;
                    int i6 = iM213608e16;
                    boolean z = cursorM165592b.getInt(i6) != 0;
                    iM213608e16 = i6;
                    int i7 = iM213608e17;
                    OutOfQuotaPolicy outOfQuotaPolicyM216422f = yjq0.m216422f(cursorM165592b.getInt(i7));
                    iM213608e17 = i7;
                    int i8 = iM213608e18;
                    int i9 = cursorM165592b.getInt(i8);
                    iM213608e18 = i8;
                    int i10 = iM213608e19;
                    int i11 = cursorM165592b.getInt(i10);
                    iM213608e19 = i10;
                    int i12 = iM213608e20;
                    long j8 = cursorM165592b.getLong(i12);
                    iM213608e20 = i12;
                    int i13 = iM213608e21;
                    int i14 = cursorM165592b.getInt(i13);
                    iM213608e21 = i13;
                    int i15 = iM213608e22;
                    int i16 = cursorM165592b.getInt(i15);
                    iM213608e22 = i15;
                    int i17 = iM213608e23;
                    String string4 = cursorM165592b.isNull(i17) ? null : cursorM165592b.getString(i17);
                    iM213608e23 = i17;
                    int i18 = iM213608e24;
                    NetworkType networkTypeM216421e = yjq0.m216421e(cursorM165592b.getInt(i18));
                    iM213608e24 = i18;
                    int i19 = iM213608e25;
                    al20 al20VarM216428l = yjq0.m216428l(cursorM165592b.getBlob(i19));
                    iM213608e25 = i19;
                    int i20 = iM213608e26;
                    boolean z2 = cursorM165592b.getInt(i20) != 0;
                    iM213608e26 = i20;
                    int i21 = iM213608e27;
                    boolean z3 = cursorM165592b.getInt(i21) != 0;
                    iM213608e27 = i21;
                    int i22 = iM213608e28;
                    boolean z4 = cursorM165592b.getInt(i22) != 0;
                    iM213608e28 = i22;
                    int i23 = iM213608e29;
                    boolean z5 = cursorM165592b.getInt(i23) != 0;
                    iM213608e29 = i23;
                    int i24 = iM213608e30;
                    long j9 = cursorM165592b.getLong(i24);
                    iM213608e30 = i24;
                    int i25 = iM213608e31;
                    long j10 = cursorM165592b.getLong(i25);
                    iM213608e31 = i25;
                    int i26 = iM213608e32;
                    iM213608e32 = i26;
                    arrayList.add(new mjq0(string, stateM216423g, string2, string3, dataM4316b, dataM4316b2, j, j2, j3, new l06(al20VarM216428l, networkTypeM216421e, z2, z3, z4, z5, j9, j10, yjq0.m216418b(cursorM165592b.getBlob(i26))), i2, backoffPolicyM216420d, j4, j5, j6, j7, z, outOfQuotaPolicyM216422f, i9, i11, j8, i14, i16, string4));
                    iM213608e = i4;
                    i = i3;
                }
                cursorM165592b.close();
                zkd0Var.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorM165592b.close();
                zkd0Var.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            zkd0Var = zkd0VarM220067d;
        }
    }

    @Override // p153l.njq0
    /* JADX INFO: renamed from: n */
    public int mo163449n(String str) {
        this.f169132a.assertNotSuspendingTransaction();
        r7h0 r7h0VarM3931b = this.f169142k.m3931b();
        r7h0VarM3931b.bindString(1, str);
        try {
            this.f169132a.beginTransaction();
            try {
                int iExecuteUpdateDelete = r7h0VarM3931b.executeUpdateDelete();
                this.f169132a.setTransactionSuccessful();
                this.f169132a.endTransaction();
                this.f169142k.m3937h(r7h0VarM3931b);
                return iExecuteUpdateDelete;
            } catch (Throwable th) {
                this.f169132a.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            this.f169142k.m3937h(r7h0VarM3931b);
            throw th2;
        }
    }

    @Override // p153l.njq0
    /* JADX INFO: renamed from: o */
    public void mo163450o(mjq0 mjq0Var) {
        this.f169132a.assertNotSuspendingTransaction();
        this.f169132a.beginTransaction();
        try {
            this.f169133b.m194261j(mjq0Var);
            this.f169132a.setTransactionSuccessful();
        } finally {
            this.f169132a.endTransaction();
        }
    }

    @Override // p153l.njq0
    /* JADX INFO: renamed from: p */
    public int mo163451p() {
        zkd0 zkd0VarM220067d = zkd0.m220067d("Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)", 0);
        this.f169132a.assertNotSuspendingTransaction();
        Cursor cursorM165592b = o1c.m165592b(this.f169132a, zkd0VarM220067d, false, null);
        try {
            return cursorM165592b.moveToFirst() ? cursorM165592b.getInt(0) : 0;
        } finally {
            cursorM165592b.close();
            zkd0VarM220067d.release();
        }
    }

    @Override // p153l.njq0
    /* JADX INFO: renamed from: q */
    public void mo163452q(String str, int i) {
        this.f169132a.assertNotSuspendingTransaction();
        r7h0 r7h0VarM3931b = this.f169144m.m3931b();
        r7h0VarM3931b.bindString(1, str);
        r7h0VarM3931b.bindLong(2, i);
        try {
            this.f169132a.beginTransaction();
            try {
                r7h0VarM3931b.executeUpdateDelete();
                this.f169132a.setTransactionSuccessful();
                this.f169132a.endTransaction();
                this.f169144m.m3937h(r7h0VarM3931b);
            } catch (Throwable th) {
                this.f169132a.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            this.f169144m.m3937h(r7h0VarM3931b);
            throw th2;
        }
    }

    @Override // p153l.njq0
    /* JADX INFO: renamed from: r */
    public void mo163453r(String str) {
        this.f169132a.assertNotSuspendingTransaction();
        r7h0 r7h0VarM3931b = this.f169138g.m3931b();
        r7h0VarM3931b.bindString(1, str);
        try {
            this.f169132a.beginTransaction();
            try {
                r7h0VarM3931b.executeUpdateDelete();
                this.f169132a.setTransactionSuccessful();
                this.f169132a.endTransaction();
                this.f169138g.m3937h(r7h0VarM3931b);
            } catch (Throwable th) {
                this.f169132a.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            this.f169138g.m3937h(r7h0VarM3931b);
            throw th2;
        }
    }

    @Override // p153l.njq0
    /* JADX INFO: renamed from: s */
    public List<mjq0> mo163454s(long j) throws Throwable {
        zkd0 zkd0Var;
        zkd0 zkd0VarM220067d = zkd0.m220067d("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC", 1);
        zkd0VarM220067d.bindLong(1, j);
        this.f169132a.assertNotSuspendingTransaction();
        Cursor cursorM165592b = o1c.m165592b(this.f169132a, zkd0VarM220067d, false, null);
        try {
            int iM213608e = xyb.m213608e(cursorM165592b, "id");
            int iM213608e2 = xyb.m213608e(cursorM165592b, "state");
            int iM213608e3 = xyb.m213608e(cursorM165592b, "worker_class_name");
            int iM213608e4 = xyb.m213608e(cursorM165592b, "input_merger_class_name");
            int iM213608e5 = xyb.m213608e(cursorM165592b, "input");
            int iM213608e6 = xyb.m213608e(cursorM165592b, "output");
            int iM213608e7 = xyb.m213608e(cursorM165592b, "initial_delay");
            int iM213608e8 = xyb.m213608e(cursorM165592b, "interval_duration");
            int iM213608e9 = xyb.m213608e(cursorM165592b, "flex_duration");
            int iM213608e10 = xyb.m213608e(cursorM165592b, "run_attempt_count");
            int iM213608e11 = xyb.m213608e(cursorM165592b, "backoff_policy");
            int iM213608e12 = xyb.m213608e(cursorM165592b, "backoff_delay_duration");
            int iM213608e13 = xyb.m213608e(cursorM165592b, "last_enqueue_time");
            int iM213608e14 = xyb.m213608e(cursorM165592b, "minimum_retention_duration");
            zkd0Var = zkd0VarM220067d;
            try {
                int iM213608e15 = xyb.m213608e(cursorM165592b, "schedule_requested_at");
                int iM213608e16 = xyb.m213608e(cursorM165592b, "run_in_foreground");
                int iM213608e17 = xyb.m213608e(cursorM165592b, "out_of_quota_policy");
                int iM213608e18 = xyb.m213608e(cursorM165592b, "period_count");
                int iM213608e19 = xyb.m213608e(cursorM165592b, "generation");
                int iM213608e20 = xyb.m213608e(cursorM165592b, "next_schedule_time_override");
                int iM213608e21 = xyb.m213608e(cursorM165592b, "next_schedule_time_override_generation");
                int iM213608e22 = xyb.m213608e(cursorM165592b, DownloadService.KEY_STOP_REASON);
                int iM213608e23 = xyb.m213608e(cursorM165592b, "trace_tag");
                int iM213608e24 = xyb.m213608e(cursorM165592b, "required_network_type");
                int iM213608e25 = xyb.m213608e(cursorM165592b, "required_network_request");
                int iM213608e26 = xyb.m213608e(cursorM165592b, "requires_charging");
                int iM213608e27 = xyb.m213608e(cursorM165592b, "requires_device_idle");
                int iM213608e28 = xyb.m213608e(cursorM165592b, "requires_battery_not_low");
                int iM213608e29 = xyb.m213608e(cursorM165592b, "requires_storage_not_low");
                int iM213608e30 = xyb.m213608e(cursorM165592b, "trigger_content_update_delay");
                int iM213608e31 = xyb.m213608e(cursorM165592b, "trigger_max_content_delay");
                int iM213608e32 = xyb.m213608e(cursorM165592b, "content_uri_triggers");
                int i = iM213608e14;
                ArrayList arrayList = new ArrayList(cursorM165592b.getCount());
                while (cursorM165592b.moveToNext()) {
                    String string = cursorM165592b.getString(iM213608e);
                    WorkInfo.State stateM216423g = yjq0.m216423g(cursorM165592b.getInt(iM213608e2));
                    String string2 = cursorM165592b.getString(iM213608e3);
                    String string3 = cursorM165592b.getString(iM213608e4);
                    Data dataM4316b = Data.m4316b(cursorM165592b.getBlob(iM213608e5));
                    Data dataM4316b2 = Data.m4316b(cursorM165592b.getBlob(iM213608e6));
                    long j2 = cursorM165592b.getLong(iM213608e7);
                    long j3 = cursorM165592b.getLong(iM213608e8);
                    long j4 = cursorM165592b.getLong(iM213608e9);
                    int i2 = cursorM165592b.getInt(iM213608e10);
                    BackoffPolicy backoffPolicyM216420d = yjq0.m216420d(cursorM165592b.getInt(iM213608e11));
                    long j5 = cursorM165592b.getLong(iM213608e12);
                    long j6 = cursorM165592b.getLong(iM213608e13);
                    int i3 = i;
                    long j7 = cursorM165592b.getLong(i3);
                    int i4 = iM213608e;
                    int i5 = iM213608e15;
                    long j8 = cursorM165592b.getLong(i5);
                    iM213608e15 = i5;
                    int i6 = iM213608e16;
                    boolean z = cursorM165592b.getInt(i6) != 0;
                    iM213608e16 = i6;
                    int i7 = iM213608e17;
                    OutOfQuotaPolicy outOfQuotaPolicyM216422f = yjq0.m216422f(cursorM165592b.getInt(i7));
                    iM213608e17 = i7;
                    int i8 = iM213608e18;
                    int i9 = cursorM165592b.getInt(i8);
                    iM213608e18 = i8;
                    int i10 = iM213608e19;
                    int i11 = cursorM165592b.getInt(i10);
                    iM213608e19 = i10;
                    int i12 = iM213608e20;
                    long j9 = cursorM165592b.getLong(i12);
                    iM213608e20 = i12;
                    int i13 = iM213608e21;
                    int i14 = cursorM165592b.getInt(i13);
                    iM213608e21 = i13;
                    int i15 = iM213608e22;
                    int i16 = cursorM165592b.getInt(i15);
                    iM213608e22 = i15;
                    int i17 = iM213608e23;
                    String string4 = cursorM165592b.isNull(i17) ? null : cursorM165592b.getString(i17);
                    iM213608e23 = i17;
                    int i18 = iM213608e24;
                    NetworkType networkTypeM216421e = yjq0.m216421e(cursorM165592b.getInt(i18));
                    iM213608e24 = i18;
                    int i19 = iM213608e25;
                    al20 al20VarM216428l = yjq0.m216428l(cursorM165592b.getBlob(i19));
                    iM213608e25 = i19;
                    int i20 = iM213608e26;
                    boolean z2 = cursorM165592b.getInt(i20) != 0;
                    iM213608e26 = i20;
                    int i21 = iM213608e27;
                    boolean z3 = cursorM165592b.getInt(i21) != 0;
                    iM213608e27 = i21;
                    int i22 = iM213608e28;
                    boolean z4 = cursorM165592b.getInt(i22) != 0;
                    iM213608e28 = i22;
                    int i23 = iM213608e29;
                    boolean z5 = cursorM165592b.getInt(i23) != 0;
                    iM213608e29 = i23;
                    int i24 = iM213608e30;
                    long j10 = cursorM165592b.getLong(i24);
                    iM213608e30 = i24;
                    int i25 = iM213608e31;
                    long j11 = cursorM165592b.getLong(i25);
                    iM213608e31 = i25;
                    int i26 = iM213608e32;
                    iM213608e32 = i26;
                    arrayList.add(new mjq0(string, stateM216423g, string2, string3, dataM4316b, dataM4316b2, j2, j3, j4, new l06(al20VarM216428l, networkTypeM216421e, z2, z3, z4, z5, j10, j11, yjq0.m216418b(cursorM165592b.getBlob(i26))), i2, backoffPolicyM216420d, j5, j6, j7, j8, z, outOfQuotaPolicyM216422f, i9, i11, j9, i14, i16, string4));
                    iM213608e = i4;
                    i = i3;
                }
                cursorM165592b.close();
                zkd0Var.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorM165592b.close();
                zkd0Var.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            zkd0Var = zkd0VarM220067d;
        }
    }

    @Override // p153l.njq0
    /* JADX INFO: renamed from: t */
    public List<mjq0> mo163455t() throws Throwable {
        zkd0 zkd0Var;
        zkd0 zkd0VarM220067d = zkd0.m220067d("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.f169132a.assertNotSuspendingTransaction();
        Cursor cursorM165592b = o1c.m165592b(this.f169132a, zkd0VarM220067d, false, null);
        try {
            int iM213608e = xyb.m213608e(cursorM165592b, "id");
            int iM213608e2 = xyb.m213608e(cursorM165592b, "state");
            int iM213608e3 = xyb.m213608e(cursorM165592b, "worker_class_name");
            int iM213608e4 = xyb.m213608e(cursorM165592b, "input_merger_class_name");
            int iM213608e5 = xyb.m213608e(cursorM165592b, "input");
            int iM213608e6 = xyb.m213608e(cursorM165592b, "output");
            int iM213608e7 = xyb.m213608e(cursorM165592b, "initial_delay");
            int iM213608e8 = xyb.m213608e(cursorM165592b, "interval_duration");
            int iM213608e9 = xyb.m213608e(cursorM165592b, "flex_duration");
            int iM213608e10 = xyb.m213608e(cursorM165592b, "run_attempt_count");
            int iM213608e11 = xyb.m213608e(cursorM165592b, "backoff_policy");
            int iM213608e12 = xyb.m213608e(cursorM165592b, "backoff_delay_duration");
            int iM213608e13 = xyb.m213608e(cursorM165592b, "last_enqueue_time");
            int iM213608e14 = xyb.m213608e(cursorM165592b, "minimum_retention_duration");
            zkd0Var = zkd0VarM220067d;
            try {
                int iM213608e15 = xyb.m213608e(cursorM165592b, "schedule_requested_at");
                int iM213608e16 = xyb.m213608e(cursorM165592b, "run_in_foreground");
                int iM213608e17 = xyb.m213608e(cursorM165592b, "out_of_quota_policy");
                int iM213608e18 = xyb.m213608e(cursorM165592b, "period_count");
                int iM213608e19 = xyb.m213608e(cursorM165592b, "generation");
                int iM213608e20 = xyb.m213608e(cursorM165592b, "next_schedule_time_override");
                int iM213608e21 = xyb.m213608e(cursorM165592b, "next_schedule_time_override_generation");
                int iM213608e22 = xyb.m213608e(cursorM165592b, DownloadService.KEY_STOP_REASON);
                int iM213608e23 = xyb.m213608e(cursorM165592b, "trace_tag");
                int iM213608e24 = xyb.m213608e(cursorM165592b, "required_network_type");
                int iM213608e25 = xyb.m213608e(cursorM165592b, "required_network_request");
                int iM213608e26 = xyb.m213608e(cursorM165592b, "requires_charging");
                int iM213608e27 = xyb.m213608e(cursorM165592b, "requires_device_idle");
                int iM213608e28 = xyb.m213608e(cursorM165592b, "requires_battery_not_low");
                int iM213608e29 = xyb.m213608e(cursorM165592b, "requires_storage_not_low");
                int iM213608e30 = xyb.m213608e(cursorM165592b, "trigger_content_update_delay");
                int iM213608e31 = xyb.m213608e(cursorM165592b, "trigger_max_content_delay");
                int iM213608e32 = xyb.m213608e(cursorM165592b, "content_uri_triggers");
                int i = iM213608e14;
                ArrayList arrayList = new ArrayList(cursorM165592b.getCount());
                while (cursorM165592b.moveToNext()) {
                    String string = cursorM165592b.getString(iM213608e);
                    WorkInfo.State stateM216423g = yjq0.m216423g(cursorM165592b.getInt(iM213608e2));
                    String string2 = cursorM165592b.getString(iM213608e3);
                    String string3 = cursorM165592b.getString(iM213608e4);
                    Data dataM4316b = Data.m4316b(cursorM165592b.getBlob(iM213608e5));
                    Data dataM4316b2 = Data.m4316b(cursorM165592b.getBlob(iM213608e6));
                    long j = cursorM165592b.getLong(iM213608e7);
                    long j2 = cursorM165592b.getLong(iM213608e8);
                    long j3 = cursorM165592b.getLong(iM213608e9);
                    int i2 = cursorM165592b.getInt(iM213608e10);
                    BackoffPolicy backoffPolicyM216420d = yjq0.m216420d(cursorM165592b.getInt(iM213608e11));
                    long j4 = cursorM165592b.getLong(iM213608e12);
                    long j5 = cursorM165592b.getLong(iM213608e13);
                    int i3 = i;
                    long j6 = cursorM165592b.getLong(i3);
                    int i4 = iM213608e;
                    int i5 = iM213608e15;
                    long j7 = cursorM165592b.getLong(i5);
                    iM213608e15 = i5;
                    int i6 = iM213608e16;
                    boolean z = cursorM165592b.getInt(i6) != 0;
                    iM213608e16 = i6;
                    int i7 = iM213608e17;
                    OutOfQuotaPolicy outOfQuotaPolicyM216422f = yjq0.m216422f(cursorM165592b.getInt(i7));
                    iM213608e17 = i7;
                    int i8 = iM213608e18;
                    int i9 = cursorM165592b.getInt(i8);
                    iM213608e18 = i8;
                    int i10 = iM213608e19;
                    int i11 = cursorM165592b.getInt(i10);
                    iM213608e19 = i10;
                    int i12 = iM213608e20;
                    long j8 = cursorM165592b.getLong(i12);
                    iM213608e20 = i12;
                    int i13 = iM213608e21;
                    int i14 = cursorM165592b.getInt(i13);
                    iM213608e21 = i13;
                    int i15 = iM213608e22;
                    int i16 = cursorM165592b.getInt(i15);
                    iM213608e22 = i15;
                    int i17 = iM213608e23;
                    String string4 = cursorM165592b.isNull(i17) ? null : cursorM165592b.getString(i17);
                    iM213608e23 = i17;
                    int i18 = iM213608e24;
                    NetworkType networkTypeM216421e = yjq0.m216421e(cursorM165592b.getInt(i18));
                    iM213608e24 = i18;
                    int i19 = iM213608e25;
                    al20 al20VarM216428l = yjq0.m216428l(cursorM165592b.getBlob(i19));
                    iM213608e25 = i19;
                    int i20 = iM213608e26;
                    boolean z2 = cursorM165592b.getInt(i20) != 0;
                    iM213608e26 = i20;
                    int i21 = iM213608e27;
                    boolean z3 = cursorM165592b.getInt(i21) != 0;
                    iM213608e27 = i21;
                    int i22 = iM213608e28;
                    boolean z4 = cursorM165592b.getInt(i22) != 0;
                    iM213608e28 = i22;
                    int i23 = iM213608e29;
                    boolean z5 = cursorM165592b.getInt(i23) != 0;
                    iM213608e29 = i23;
                    int i24 = iM213608e30;
                    long j9 = cursorM165592b.getLong(i24);
                    iM213608e30 = i24;
                    int i25 = iM213608e31;
                    long j10 = cursorM165592b.getLong(i25);
                    iM213608e31 = i25;
                    int i26 = iM213608e32;
                    iM213608e32 = i26;
                    arrayList.add(new mjq0(string, stateM216423g, string2, string3, dataM4316b, dataM4316b2, j, j2, j3, new l06(al20VarM216428l, networkTypeM216421e, z2, z3, z4, z5, j9, j10, yjq0.m216418b(cursorM165592b.getBlob(i26))), i2, backoffPolicyM216420d, j4, j5, j6, j7, z, outOfQuotaPolicyM216422f, i9, i11, j8, i14, i16, string4));
                    iM213608e = i4;
                    i = i3;
                }
                cursorM165592b.close();
                zkd0Var.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorM165592b.close();
                zkd0Var.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            zkd0Var = zkd0VarM220067d;
        }
    }

    @Override // p153l.njq0
    /* JADX INFO: renamed from: u */
    public mjq0.C18627c mo163456u(String str) {
        zkd0 zkd0VarM220067d = zkd0.m220067d("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id=?", 1);
        zkd0VarM220067d.bindString(1, str);
        this.f169132a.assertNotSuspendingTransaction();
        this.f169132a.beginTransaction();
        try {
            mjq0.C18627c c18627c = null;
            Cursor cursorM165592b = o1c.m165592b(this.f169132a, zkd0VarM220067d, true, null);
            try {
                HashMap<String, ArrayList<String>> map = new HashMap<>();
                HashMap<String, ArrayList<Data>> map2 = new HashMap<>();
                while (cursorM165592b.moveToNext()) {
                    String string = cursorM165592b.getString(0);
                    if (!map.containsKey(string)) {
                        map.put(string, new ArrayList<>());
                    }
                    String string2 = cursorM165592b.getString(0);
                    if (!map2.containsKey(string2)) {
                        map2.put(string2, new ArrayList<>());
                    }
                }
                cursorM165592b.moveToPosition(-1);
                m186302K(map);
                m186301J(map2);
                if (cursorM165592b.moveToFirst()) {
                    String string3 = cursorM165592b.getString(0);
                    WorkInfo.State stateM216423g = yjq0.m216423g(cursorM165592b.getInt(1));
                    Data dataM4316b = Data.m4316b(cursorM165592b.getBlob(2));
                    int i = cursorM165592b.getInt(3);
                    int i2 = cursorM165592b.getInt(4);
                    c18627c = new mjq0.C18627c(string3, stateM216423g, dataM4316b, cursorM165592b.getLong(14), cursorM165592b.getLong(15), cursorM165592b.getLong(16), new l06(yjq0.m216428l(cursorM165592b.getBlob(6)), yjq0.m216421e(cursorM165592b.getInt(5)), cursorM165592b.getInt(7) != 0, cursorM165592b.getInt(8) != 0, cursorM165592b.getInt(9) != 0, cursorM165592b.getInt(10) != 0, cursorM165592b.getLong(11), cursorM165592b.getLong(12), yjq0.m216418b(cursorM165592b.getBlob(13))), i, yjq0.m216420d(cursorM165592b.getInt(17)), cursorM165592b.getLong(18), cursorM165592b.getLong(19), cursorM165592b.getInt(20), i2, cursorM165592b.getLong(21), cursorM165592b.getInt(22), map.get(cursorM165592b.getString(0)), map2.get(cursorM165592b.getString(0)));
                }
                this.f169132a.setTransactionSuccessful();
                cursorM165592b.close();
                zkd0VarM220067d.release();
                this.f169132a.endTransaction();
                return c18627c;
            } catch (Throwable th) {
                cursorM165592b.close();
                zkd0VarM220067d.release();
                throw th;
            }
        } catch (Throwable th2) {
            this.f169132a.endTransaction();
            throw th2;
        }
    }

    @Override // p153l.njq0
    /* JADX INFO: renamed from: v */
    public mjq0 mo163457v(String str) throws Throwable {
        zkd0 zkd0Var;
        mjq0 mjq0Var;
        zkd0 zkd0VarM220067d = zkd0.m220067d("SELECT * FROM workspec WHERE id=?", 1);
        zkd0VarM220067d.bindString(1, str);
        this.f169132a.assertNotSuspendingTransaction();
        Cursor cursorM165592b = o1c.m165592b(this.f169132a, zkd0VarM220067d, false, null);
        try {
            int iM213608e = xyb.m213608e(cursorM165592b, "id");
            int iM213608e2 = xyb.m213608e(cursorM165592b, "state");
            int iM213608e3 = xyb.m213608e(cursorM165592b, "worker_class_name");
            int iM213608e4 = xyb.m213608e(cursorM165592b, "input_merger_class_name");
            int iM213608e5 = xyb.m213608e(cursorM165592b, "input");
            int iM213608e6 = xyb.m213608e(cursorM165592b, "output");
            int iM213608e7 = xyb.m213608e(cursorM165592b, "initial_delay");
            int iM213608e8 = xyb.m213608e(cursorM165592b, "interval_duration");
            int iM213608e9 = xyb.m213608e(cursorM165592b, "flex_duration");
            int iM213608e10 = xyb.m213608e(cursorM165592b, "run_attempt_count");
            int iM213608e11 = xyb.m213608e(cursorM165592b, "backoff_policy");
            int iM213608e12 = xyb.m213608e(cursorM165592b, "backoff_delay_duration");
            int iM213608e13 = xyb.m213608e(cursorM165592b, "last_enqueue_time");
            int iM213608e14 = xyb.m213608e(cursorM165592b, "minimum_retention_duration");
            zkd0Var = zkd0VarM220067d;
            try {
                int iM213608e15 = xyb.m213608e(cursorM165592b, "schedule_requested_at");
                int iM213608e16 = xyb.m213608e(cursorM165592b, "run_in_foreground");
                int iM213608e17 = xyb.m213608e(cursorM165592b, "out_of_quota_policy");
                int iM213608e18 = xyb.m213608e(cursorM165592b, "period_count");
                int iM213608e19 = xyb.m213608e(cursorM165592b, "generation");
                int iM213608e20 = xyb.m213608e(cursorM165592b, "next_schedule_time_override");
                int iM213608e21 = xyb.m213608e(cursorM165592b, "next_schedule_time_override_generation");
                int iM213608e22 = xyb.m213608e(cursorM165592b, DownloadService.KEY_STOP_REASON);
                int iM213608e23 = xyb.m213608e(cursorM165592b, "trace_tag");
                int iM213608e24 = xyb.m213608e(cursorM165592b, "required_network_type");
                int iM213608e25 = xyb.m213608e(cursorM165592b, "required_network_request");
                int iM213608e26 = xyb.m213608e(cursorM165592b, "requires_charging");
                int iM213608e27 = xyb.m213608e(cursorM165592b, "requires_device_idle");
                int iM213608e28 = xyb.m213608e(cursorM165592b, "requires_battery_not_low");
                int iM213608e29 = xyb.m213608e(cursorM165592b, "requires_storage_not_low");
                int iM213608e30 = xyb.m213608e(cursorM165592b, "trigger_content_update_delay");
                int iM213608e31 = xyb.m213608e(cursorM165592b, "trigger_max_content_delay");
                int iM213608e32 = xyb.m213608e(cursorM165592b, "content_uri_triggers");
                if (cursorM165592b.moveToFirst()) {
                    mjq0Var = new mjq0(cursorM165592b.getString(iM213608e), yjq0.m216423g(cursorM165592b.getInt(iM213608e2)), cursorM165592b.getString(iM213608e3), cursorM165592b.getString(iM213608e4), Data.m4316b(cursorM165592b.getBlob(iM213608e5)), Data.m4316b(cursorM165592b.getBlob(iM213608e6)), cursorM165592b.getLong(iM213608e7), cursorM165592b.getLong(iM213608e8), cursorM165592b.getLong(iM213608e9), new l06(yjq0.m216428l(cursorM165592b.getBlob(iM213608e25)), yjq0.m216421e(cursorM165592b.getInt(iM213608e24)), cursorM165592b.getInt(iM213608e26) != 0, cursorM165592b.getInt(iM213608e27) != 0, cursorM165592b.getInt(iM213608e28) != 0, cursorM165592b.getInt(iM213608e29) != 0, cursorM165592b.getLong(iM213608e30), cursorM165592b.getLong(iM213608e31), yjq0.m216418b(cursorM165592b.getBlob(iM213608e32))), cursorM165592b.getInt(iM213608e10), yjq0.m216420d(cursorM165592b.getInt(iM213608e11)), cursorM165592b.getLong(iM213608e12), cursorM165592b.getLong(iM213608e13), cursorM165592b.getLong(iM213608e14), cursorM165592b.getLong(iM213608e15), cursorM165592b.getInt(iM213608e16) != 0, yjq0.m216422f(cursorM165592b.getInt(iM213608e17)), cursorM165592b.getInt(iM213608e18), cursorM165592b.getInt(iM213608e19), cursorM165592b.getLong(iM213608e20), cursorM165592b.getInt(iM213608e21), cursorM165592b.getInt(iM213608e22), cursorM165592b.isNull(iM213608e23) ? null : cursorM165592b.getString(iM213608e23));
                } else {
                    mjq0Var = null;
                }
                cursorM165592b.close();
                zkd0Var.release();
                return mjq0Var;
            } catch (Throwable th) {
                th = th;
                cursorM165592b.close();
                zkd0Var.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            zkd0Var = zkd0VarM220067d;
        }
    }

    @Override // p153l.njq0
    /* JADX INFO: renamed from: w */
    public int mo163458w() {
        this.f169132a.assertNotSuspendingTransaction();
        r7h0 r7h0VarM3931b = this.f169146o.m3931b();
        try {
            this.f169132a.beginTransaction();
            try {
                int iExecuteUpdateDelete = r7h0VarM3931b.executeUpdateDelete();
                this.f169132a.setTransactionSuccessful();
                this.f169132a.endTransaction();
                this.f169146o.m3937h(r7h0VarM3931b);
                return iExecuteUpdateDelete;
            } catch (Throwable th) {
                this.f169132a.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            this.f169146o.m3937h(r7h0VarM3931b);
            throw th2;
        }
    }

    @Override // p153l.njq0
    /* JADX INFO: renamed from: x */
    public void mo163459x(mjq0 mjq0Var) {
        this.f169132a.assertNotSuspendingTransaction();
        this.f169132a.beginTransaction();
        try {
            this.f169134c.m188967j(mjq0Var);
            this.f169132a.setTransactionSuccessful();
        } finally {
            this.f169132a.endTransaction();
        }
    }

    @Override // p153l.njq0
    /* JADX INFO: renamed from: y */
    public int mo163460y(String str, long j) {
        this.f169132a.assertNotSuspendingTransaction();
        r7h0 r7h0VarM3931b = this.f169145n.m3931b();
        r7h0VarM3931b.bindLong(1, j);
        r7h0VarM3931b.bindString(2, str);
        try {
            this.f169132a.beginTransaction();
            try {
                int iExecuteUpdateDelete = r7h0VarM3931b.executeUpdateDelete();
                this.f169132a.setTransactionSuccessful();
                this.f169132a.endTransaction();
                this.f169145n.m3937h(r7h0VarM3931b);
                return iExecuteUpdateDelete;
            } catch (Throwable th) {
                this.f169132a.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            this.f169145n.m3937h(r7h0VarM3931b);
            throw th2;
        }
    }

    @Override // p153l.njq0
    /* JADX INFO: renamed from: z */
    public List<mjq0.C18626b> mo163461z(String str) {
        zkd0 zkd0VarM220067d = zkd0.m220067d("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        zkd0VarM220067d.bindString(1, str);
        this.f169132a.assertNotSuspendingTransaction();
        Cursor cursorM165592b = o1c.m165592b(this.f169132a, zkd0VarM220067d, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorM165592b.getCount());
            while (cursorM165592b.moveToNext()) {
                arrayList.add(new mjq0.C18626b(cursorM165592b.getString(0), yjq0.m216423g(cursorM165592b.getInt(1))));
            }
            cursorM165592b.close();
            zkd0VarM220067d.release();
            return arrayList;
        } catch (Throwable th) {
            cursorM165592b.close();
            zkd0VarM220067d.release();
            throw th;
        }
    }
}
