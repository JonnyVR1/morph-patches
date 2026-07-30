package p149l;

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
public final class naq0 implements iaq0 {

    /* JADX INFO: renamed from: a */
    public final RoomDatabase f137929a;

    /* JADX INFO: renamed from: b */
    public final p1f<haq0> f137930b;

    /* JADX INFO: renamed from: c */
    public final o1f<haq0> f137931c;

    /* JADX INFO: renamed from: d */
    public final SharedSQLiteStatement f137932d;

    /* JADX INFO: renamed from: e */
    public final SharedSQLiteStatement f137933e;

    /* JADX INFO: renamed from: f */
    public final SharedSQLiteStatement f137934f;

    /* JADX INFO: renamed from: g */
    public final SharedSQLiteStatement f137935g;

    /* JADX INFO: renamed from: h */
    public final SharedSQLiteStatement f137936h;

    /* JADX INFO: renamed from: i */
    public final SharedSQLiteStatement f137937i;

    /* JADX INFO: renamed from: j */
    public final SharedSQLiteStatement f137938j;

    /* JADX INFO: renamed from: k */
    public final SharedSQLiteStatement f137939k;

    /* JADX INFO: renamed from: l */
    public final SharedSQLiteStatement f137940l;

    /* JADX INFO: renamed from: m */
    public final SharedSQLiteStatement f137941m;

    /* JADX INFO: renamed from: n */
    public final SharedSQLiteStatement f137942n;

    /* JADX INFO: renamed from: o */
    public final SharedSQLiteStatement f137943o;

    /* JADX INFO: renamed from: p */
    public final SharedSQLiteStatement f137944p;

    /* JADX INFO: renamed from: q */
    public final SharedSQLiteStatement f137945q;

    /* JADX INFO: renamed from: r */
    public final SharedSQLiteStatement f137946r;

    /* JADX INFO: renamed from: l.naq0$a */
    public class C18645a extends SharedSQLiteStatement {
        public C18645a(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        @NonNull
        /* JADX INFO: renamed from: e */
        public String mo3932e() {
            return "UPDATE workspec SET run_attempt_count=0 WHERE id=?";
        }
    }

    /* JADX INFO: renamed from: l.naq0$b */
    public class C18646b extends SharedSQLiteStatement {
        public C18646b(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        @NonNull
        /* JADX INFO: renamed from: e */
        public String mo3932e() {
            return "UPDATE workspec SET next_schedule_time_override=? WHERE id=?";
        }
    }

    /* JADX INFO: renamed from: l.naq0$c */
    public class C18647c extends SharedSQLiteStatement {
        public C18647c(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        @NonNull
        /* JADX INFO: renamed from: e */
        public String mo3932e() {
            return "UPDATE workspec SET next_schedule_time_override=9223372036854775807 WHERE (id=? AND next_schedule_time_override_generation=?)";
        }
    }

    /* JADX INFO: renamed from: l.naq0$d */
    public class C18648d extends SharedSQLiteStatement {
        public C18648d(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        @NonNull
        /* JADX INFO: renamed from: e */
        public String mo3932e() {
            return "UPDATE workspec SET schedule_requested_at=? WHERE id=?";
        }
    }

    /* JADX INFO: renamed from: l.naq0$e */
    public class C18649e extends SharedSQLiteStatement {
        public C18649e(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        @NonNull
        /* JADX INFO: renamed from: e */
        public String mo3932e() {
            return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
        }
    }

    /* JADX INFO: renamed from: l.naq0$f */
    public class C18650f extends SharedSQLiteStatement {
        public C18650f(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        @NonNull
        /* JADX INFO: renamed from: e */
        public String mo3932e() {
            return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
        }
    }

    /* JADX INFO: renamed from: l.naq0$g */
    public class C18651g extends SharedSQLiteStatement {
        public C18651g(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        @NonNull
        /* JADX INFO: renamed from: e */
        public String mo3932e() {
            return "UPDATE workspec SET generation=generation+1 WHERE id=?";
        }
    }

    /* JADX INFO: renamed from: l.naq0$h */
    public class C18652h extends SharedSQLiteStatement {
        public C18652h(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        @NonNull
        /* JADX INFO: renamed from: e */
        public String mo3932e() {
            return "UPDATE workspec SET stop_reason=? WHERE id=?";
        }
    }

    /* JADX INFO: renamed from: l.naq0$i */
    public class C18653i extends p1f<haq0> {
        public C18653i(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        @NonNull
        /* JADX INFO: renamed from: e */
        public String mo3932e() {
            return "INSERT OR IGNORE INTO `WorkSpec` (`id`,`state`,`worker_class_name`,`input_merger_class_name`,`input`,`output`,`initial_delay`,`interval_duration`,`flex_duration`,`run_attempt_count`,`backoff_policy`,`backoff_delay_duration`,`last_enqueue_time`,`minimum_retention_duration`,`schedule_requested_at`,`run_in_foreground`,`out_of_quota_policy`,`period_count`,`generation`,`next_schedule_time_override`,`next_schedule_time_override_generation`,`stop_reason`,`trace_tag`,`required_network_type`,`required_network_request`,`requires_charging`,`requires_device_idle`,`requires_battery_not_low`,`requires_storage_not_low`,`trigger_content_update_delay`,`trigger_max_content_delay`,`content_uri_triggers`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        }

        @Override // p149l.p1f
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void mo95569i(@NonNull jzg0 jzg0Var, @NonNull haq0 haq0Var) {
            jzg0Var.bindString(1, haq0Var.id);
            taq0 taq0Var = taq0.INSTANCE;
            jzg0Var.bindLong(2, taq0.m187777k(haq0Var.state));
            jzg0Var.bindString(3, haq0Var.workerClassName);
            jzg0Var.bindString(4, haq0Var.inputMergerClassName);
            jzg0Var.bindBlob(5, Data.m4315g(haq0Var.input));
            jzg0Var.bindBlob(6, Data.m4315g(haq0Var.output));
            jzg0Var.bindLong(7, haq0Var.initialDelay);
            jzg0Var.bindLong(8, haq0Var.intervalDuration);
            jzg0Var.bindLong(9, haq0Var.flexDuration);
            jzg0Var.bindLong(10, haq0Var.runAttemptCount);
            jzg0Var.bindLong(11, taq0.m187767a(haq0Var.backoffPolicy));
            jzg0Var.bindLong(12, haq0Var.backoffDelayDuration);
            jzg0Var.bindLong(13, haq0Var.lastEnqueueTime);
            jzg0Var.bindLong(14, haq0Var.minimumRetentionDuration);
            jzg0Var.bindLong(15, haq0Var.scheduleRequestedAt);
            jzg0Var.bindLong(16, haq0Var.expedited ? 1L : 0L);
            jzg0Var.bindLong(17, taq0.m187775i(haq0Var.outOfQuotaPolicy));
            jzg0Var.bindLong(18, haq0Var.getPeriodCount());
            jzg0Var.bindLong(19, haq0Var.getGeneration());
            jzg0Var.bindLong(20, haq0Var.getNextScheduleTimeOverride());
            jzg0Var.bindLong(21, haq0Var.getNextScheduleTimeOverrideGeneration());
            jzg0Var.bindLong(22, haq0Var.getStopReason());
            if (haq0Var.getTraceTag() == null) {
                jzg0Var.bindNull(23);
            } else {
                jzg0Var.bindString(23, haq0Var.getTraceTag());
            }
            gz5 gz5Var = haq0Var.constraints;
            jzg0Var.bindLong(24, taq0.m187774h(gz5Var.getRequiredNetworkType()));
            jzg0Var.bindBlob(25, taq0.m187769c(gz5Var.getRequiredNetworkRequestCompat()));
            jzg0Var.bindLong(26, gz5Var.getRequiresCharging() ? 1L : 0L);
            jzg0Var.bindLong(27, gz5Var.getRequiresDeviceIdle() ? 1L : 0L);
            jzg0Var.bindLong(28, gz5Var.getRequiresBatteryNotLow() ? 1L : 0L);
            jzg0Var.bindLong(29, gz5Var.getRequiresStorageNotLow() ? 1L : 0L);
            jzg0Var.bindLong(30, gz5Var.getContentTriggerUpdateDelayMillis());
            jzg0Var.bindLong(31, gz5Var.getContentTriggerMaxDelayMillis());
            jzg0Var.bindBlob(32, taq0.m187776j(gz5Var.m128822c()));
        }
    }

    /* JADX INFO: renamed from: l.naq0$j */
    public class CallableC18654j implements Callable<Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ xcd0 f137956a;

        public CallableC18654j(xcd0 xcd0Var) {
            this.f137956a = xcd0Var;
        }

        @Override // java.util.concurrent.Callable
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() throws Exception {
            Boolean boolValueOf;
            Cursor cursorM99746b = b0c.m99746b(naq0.this.f137929a, this.f137956a, false, null);
            try {
                if (cursorM99746b.moveToFirst()) {
                    boolValueOf = Boolean.valueOf(cursorM99746b.getInt(0) != 0);
                } else {
                    boolValueOf = Boolean.FALSE;
                }
                return boolValueOf;
            } finally {
                cursorM99746b.close();
            }
        }

        public void finalize() {
            this.f137956a.release();
        }
    }

    /* JADX INFO: renamed from: l.naq0$k */
    public class C18655k extends o1f<haq0> {
        public C18655k(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        @NonNull
        /* JADX INFO: renamed from: e */
        public String mo3932e() {
            return "UPDATE OR ABORT `WorkSpec` SET `id` = ?,`state` = ?,`worker_class_name` = ?,`input_merger_class_name` = ?,`input` = ?,`output` = ?,`initial_delay` = ?,`interval_duration` = ?,`flex_duration` = ?,`run_attempt_count` = ?,`backoff_policy` = ?,`backoff_delay_duration` = ?,`last_enqueue_time` = ?,`minimum_retention_duration` = ?,`schedule_requested_at` = ?,`run_in_foreground` = ?,`out_of_quota_policy` = ?,`period_count` = ?,`generation` = ?,`next_schedule_time_override` = ?,`next_schedule_time_override_generation` = ?,`stop_reason` = ?,`trace_tag` = ?,`required_network_type` = ?,`required_network_request` = ?,`requires_charging` = ?,`requires_device_idle` = ?,`requires_battery_not_low` = ?,`requires_storage_not_low` = ?,`trigger_content_update_delay` = ?,`trigger_max_content_delay` = ?,`content_uri_triggers` = ? WHERE `id` = ?";
        }

        @Override // p149l.o1f
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void mo158708i(@NonNull jzg0 jzg0Var, @NonNull haq0 haq0Var) {
            jzg0Var.bindString(1, haq0Var.id);
            taq0 taq0Var = taq0.INSTANCE;
            jzg0Var.bindLong(2, taq0.m187777k(haq0Var.state));
            jzg0Var.bindString(3, haq0Var.workerClassName);
            jzg0Var.bindString(4, haq0Var.inputMergerClassName);
            jzg0Var.bindBlob(5, Data.m4315g(haq0Var.input));
            jzg0Var.bindBlob(6, Data.m4315g(haq0Var.output));
            jzg0Var.bindLong(7, haq0Var.initialDelay);
            jzg0Var.bindLong(8, haq0Var.intervalDuration);
            jzg0Var.bindLong(9, haq0Var.flexDuration);
            jzg0Var.bindLong(10, haq0Var.runAttemptCount);
            jzg0Var.bindLong(11, taq0.m187767a(haq0Var.backoffPolicy));
            jzg0Var.bindLong(12, haq0Var.backoffDelayDuration);
            jzg0Var.bindLong(13, haq0Var.lastEnqueueTime);
            jzg0Var.bindLong(14, haq0Var.minimumRetentionDuration);
            jzg0Var.bindLong(15, haq0Var.scheduleRequestedAt);
            jzg0Var.bindLong(16, haq0Var.expedited ? 1L : 0L);
            jzg0Var.bindLong(17, taq0.m187775i(haq0Var.outOfQuotaPolicy));
            jzg0Var.bindLong(18, haq0Var.getPeriodCount());
            jzg0Var.bindLong(19, haq0Var.getGeneration());
            jzg0Var.bindLong(20, haq0Var.getNextScheduleTimeOverride());
            jzg0Var.bindLong(21, haq0Var.getNextScheduleTimeOverrideGeneration());
            jzg0Var.bindLong(22, haq0Var.getStopReason());
            if (haq0Var.getTraceTag() == null) {
                jzg0Var.bindNull(23);
            } else {
                jzg0Var.bindString(23, haq0Var.getTraceTag());
            }
            gz5 gz5Var = haq0Var.constraints;
            jzg0Var.bindLong(24, taq0.m187774h(gz5Var.getRequiredNetworkType()));
            jzg0Var.bindBlob(25, taq0.m187769c(gz5Var.getRequiredNetworkRequestCompat()));
            jzg0Var.bindLong(26, gz5Var.getRequiresCharging() ? 1L : 0L);
            jzg0Var.bindLong(27, gz5Var.getRequiresDeviceIdle() ? 1L : 0L);
            jzg0Var.bindLong(28, gz5Var.getRequiresBatteryNotLow() ? 1L : 0L);
            jzg0Var.bindLong(29, gz5Var.getRequiresStorageNotLow() ? 1L : 0L);
            jzg0Var.bindLong(30, gz5Var.getContentTriggerUpdateDelayMillis());
            jzg0Var.bindLong(31, gz5Var.getContentTriggerMaxDelayMillis());
            jzg0Var.bindBlob(32, taq0.m187776j(gz5Var.m128822c()));
            jzg0Var.bindString(33, haq0Var.id);
        }
    }

    /* JADX INFO: renamed from: l.naq0$l */
    public class C18656l extends SharedSQLiteStatement {
        public C18656l(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        @NonNull
        /* JADX INFO: renamed from: e */
        public String mo3932e() {
            return "DELETE FROM workspec WHERE id=?";
        }
    }

    /* JADX INFO: renamed from: l.naq0$m */
    public class C18657m extends SharedSQLiteStatement {
        public C18657m(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        @NonNull
        /* JADX INFO: renamed from: e */
        public String mo3932e() {
            return "UPDATE workspec SET state=? WHERE id=?";
        }
    }

    /* JADX INFO: renamed from: l.naq0$n */
    public class C18658n extends SharedSQLiteStatement {
        public C18658n(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        @NonNull
        /* JADX INFO: renamed from: e */
        public String mo3932e() {
            return "UPDATE workspec SET stop_reason = CASE WHEN state=1 THEN 1 ELSE -256 END, state=5 WHERE id=?";
        }
    }

    /* JADX INFO: renamed from: l.naq0$o */
    public class C18659o extends SharedSQLiteStatement {
        public C18659o(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        @NonNull
        /* JADX INFO: renamed from: e */
        public String mo3932e() {
            return "UPDATE workspec SET period_count=period_count+1 WHERE id=?";
        }
    }

    /* JADX INFO: renamed from: l.naq0$p */
    public class C18660p extends SharedSQLiteStatement {
        public C18660p(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        @NonNull
        /* JADX INFO: renamed from: e */
        public String mo3932e() {
            return "UPDATE workspec SET output=? WHERE id=?";
        }
    }

    /* JADX INFO: renamed from: l.naq0$q */
    public class C18661q extends SharedSQLiteStatement {
        public C18661q(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        @NonNull
        /* JADX INFO: renamed from: e */
        public String mo3932e() {
            return "UPDATE workspec SET last_enqueue_time=? WHERE id=?";
        }
    }

    /* JADX INFO: renamed from: l.naq0$r */
    public class C18662r extends SharedSQLiteStatement {
        public C18662r(RoomDatabase roomDatabase) {
            super(roomDatabase);
        }

        @Override // androidx.room.SharedSQLiteStatement
        @NonNull
        /* JADX INFO: renamed from: e */
        public String mo3932e() {
            return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
        }
    }

    public naq0(@NonNull RoomDatabase roomDatabase) {
        this.f137929a = roomDatabase;
        this.f137930b = new C18653i(roomDatabase);
        this.f137931c = new C18655k(roomDatabase);
        this.f137932d = new C18656l(roomDatabase);
        this.f137933e = new C18657m(roomDatabase);
        this.f137934f = new C18658n(roomDatabase);
        this.f137935g = new C18659o(roomDatabase);
        this.f137936h = new C18660p(roomDatabase);
        this.f137937i = new C18661q(roomDatabase);
        this.f137938j = new C18662r(roomDatabase);
        this.f137939k = new C18645a(roomDatabase);
        this.f137940l = new C18646b(roomDatabase);
        this.f137941m = new C18647c(roomDatabase);
        this.f137942n = new C18648d(roomDatabase);
        this.f137943o = new C18649e(roomDatabase);
        this.f137944p = new C18650f(roomDatabase);
        this.f137945q = new C18651g(roomDatabase);
        this.f137946r = new C18652h(roomDatabase);
    }

    /* JADX INFO: renamed from: H */
    public static /* synthetic */ Unit m158700H(naq0 naq0Var, HashMap map) {
        naq0Var.m158704J(map);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: I */
    public static /* synthetic */ Unit m158701I(naq0 naq0Var, HashMap map) {
        naq0Var.m158705K(map);
        return Unit.INSTANCE;
    }

    @NonNull
    /* JADX INFO: renamed from: M */
    public static List<Class<?>> m158703M() {
        return Collections.EMPTY_LIST;
    }

    @Override // p149l.iaq0
    /* JADX INFO: renamed from: A */
    public eri<Boolean> mo135162A() {
        return CoroutinesRoom.m3904a(this.f137929a, false, new String[]{"workspec"}, new CallableC18654j(xcd0.m208113d("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1", 0)));
    }

    @Override // p149l.iaq0
    /* JADX INFO: renamed from: B */
    public List<haq0> mo135163B(int i) throws Throwable {
        xcd0 xcd0Var;
        xcd0 xcd0VarM208113d = xcd0.m208113d("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY last_enqueue_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND LENGTH(content_uri_triggers)=0 AND state NOT IN (2, 3, 5))", 1);
        xcd0VarM208113d.bindLong(1, i);
        this.f137929a.assertNotSuspendingTransaction();
        Cursor cursorM99746b = b0c.m99746b(this.f137929a, xcd0VarM208113d, false, null);
        try {
            int iM143765e = jxb.m143765e(cursorM99746b, "id");
            int iM143765e2 = jxb.m143765e(cursorM99746b, "state");
            int iM143765e3 = jxb.m143765e(cursorM99746b, "worker_class_name");
            int iM143765e4 = jxb.m143765e(cursorM99746b, "input_merger_class_name");
            int iM143765e5 = jxb.m143765e(cursorM99746b, "input");
            int iM143765e6 = jxb.m143765e(cursorM99746b, "output");
            int iM143765e7 = jxb.m143765e(cursorM99746b, "initial_delay");
            int iM143765e8 = jxb.m143765e(cursorM99746b, "interval_duration");
            int iM143765e9 = jxb.m143765e(cursorM99746b, "flex_duration");
            int iM143765e10 = jxb.m143765e(cursorM99746b, "run_attempt_count");
            int iM143765e11 = jxb.m143765e(cursorM99746b, "backoff_policy");
            int iM143765e12 = jxb.m143765e(cursorM99746b, "backoff_delay_duration");
            int iM143765e13 = jxb.m143765e(cursorM99746b, "last_enqueue_time");
            int iM143765e14 = jxb.m143765e(cursorM99746b, "minimum_retention_duration");
            xcd0Var = xcd0VarM208113d;
            try {
                int iM143765e15 = jxb.m143765e(cursorM99746b, "schedule_requested_at");
                int iM143765e16 = jxb.m143765e(cursorM99746b, "run_in_foreground");
                int iM143765e17 = jxb.m143765e(cursorM99746b, "out_of_quota_policy");
                int iM143765e18 = jxb.m143765e(cursorM99746b, "period_count");
                int iM143765e19 = jxb.m143765e(cursorM99746b, "generation");
                int iM143765e20 = jxb.m143765e(cursorM99746b, "next_schedule_time_override");
                int iM143765e21 = jxb.m143765e(cursorM99746b, "next_schedule_time_override_generation");
                int iM143765e22 = jxb.m143765e(cursorM99746b, DownloadService.KEY_STOP_REASON);
                int iM143765e23 = jxb.m143765e(cursorM99746b, "trace_tag");
                int iM143765e24 = jxb.m143765e(cursorM99746b, "required_network_type");
                int iM143765e25 = jxb.m143765e(cursorM99746b, "required_network_request");
                int iM143765e26 = jxb.m143765e(cursorM99746b, "requires_charging");
                int iM143765e27 = jxb.m143765e(cursorM99746b, "requires_device_idle");
                int iM143765e28 = jxb.m143765e(cursorM99746b, "requires_battery_not_low");
                int iM143765e29 = jxb.m143765e(cursorM99746b, "requires_storage_not_low");
                int iM143765e30 = jxb.m143765e(cursorM99746b, "trigger_content_update_delay");
                int iM143765e31 = jxb.m143765e(cursorM99746b, "trigger_max_content_delay");
                int iM143765e32 = jxb.m143765e(cursorM99746b, "content_uri_triggers");
                int i2 = iM143765e14;
                ArrayList arrayList = new ArrayList(cursorM99746b.getCount());
                while (cursorM99746b.moveToNext()) {
                    String string = cursorM99746b.getString(iM143765e);
                    WorkInfo.State stateM187773g = taq0.m187773g(cursorM99746b.getInt(iM143765e2));
                    String string2 = cursorM99746b.getString(iM143765e3);
                    String string3 = cursorM99746b.getString(iM143765e4);
                    Data dataM4314b = Data.m4314b(cursorM99746b.getBlob(iM143765e5));
                    Data dataM4314b2 = Data.m4314b(cursorM99746b.getBlob(iM143765e6));
                    long j = cursorM99746b.getLong(iM143765e7);
                    long j2 = cursorM99746b.getLong(iM143765e8);
                    long j3 = cursorM99746b.getLong(iM143765e9);
                    int i3 = cursorM99746b.getInt(iM143765e10);
                    BackoffPolicy backoffPolicyM187770d = taq0.m187770d(cursorM99746b.getInt(iM143765e11));
                    long j4 = cursorM99746b.getLong(iM143765e12);
                    long j5 = cursorM99746b.getLong(iM143765e13);
                    int i4 = i2;
                    long j6 = cursorM99746b.getLong(i4);
                    int i5 = iM143765e;
                    int i6 = iM143765e15;
                    long j7 = cursorM99746b.getLong(i6);
                    iM143765e15 = i6;
                    int i7 = iM143765e16;
                    boolean z = cursorM99746b.getInt(i7) != 0;
                    iM143765e16 = i7;
                    int i8 = iM143765e17;
                    OutOfQuotaPolicy outOfQuotaPolicyM187772f = taq0.m187772f(cursorM99746b.getInt(i8));
                    iM143765e17 = i8;
                    int i9 = iM143765e18;
                    int i10 = cursorM99746b.getInt(i9);
                    iM143765e18 = i9;
                    int i11 = iM143765e19;
                    int i12 = cursorM99746b.getInt(i11);
                    iM143765e19 = i11;
                    int i13 = iM143765e20;
                    long j8 = cursorM99746b.getLong(i13);
                    iM143765e20 = i13;
                    int i14 = iM143765e21;
                    int i15 = cursorM99746b.getInt(i14);
                    iM143765e21 = i14;
                    int i16 = iM143765e22;
                    int i17 = cursorM99746b.getInt(i16);
                    iM143765e22 = i16;
                    int i18 = iM143765e23;
                    String string4 = cursorM99746b.isNull(i18) ? null : cursorM99746b.getString(i18);
                    iM143765e23 = i18;
                    int i19 = iM143765e24;
                    NetworkType networkTypeM187771e = taq0.m187771e(cursorM99746b.getInt(i19));
                    iM143765e24 = i19;
                    int i20 = iM143765e25;
                    qc20 qc20VarM187778l = taq0.m187778l(cursorM99746b.getBlob(i20));
                    iM143765e25 = i20;
                    int i21 = iM143765e26;
                    boolean z2 = cursorM99746b.getInt(i21) != 0;
                    iM143765e26 = i21;
                    int i22 = iM143765e27;
                    boolean z3 = cursorM99746b.getInt(i22) != 0;
                    iM143765e27 = i22;
                    int i23 = iM143765e28;
                    boolean z4 = cursorM99746b.getInt(i23) != 0;
                    iM143765e28 = i23;
                    int i24 = iM143765e29;
                    boolean z5 = cursorM99746b.getInt(i24) != 0;
                    iM143765e29 = i24;
                    int i25 = iM143765e30;
                    long j9 = cursorM99746b.getLong(i25);
                    iM143765e30 = i25;
                    int i26 = iM143765e31;
                    long j10 = cursorM99746b.getLong(i26);
                    iM143765e31 = i26;
                    int i27 = iM143765e32;
                    iM143765e32 = i27;
                    arrayList.add(new haq0(string, stateM187773g, string2, string3, dataM4314b, dataM4314b2, j, j2, j3, new gz5(qc20VarM187778l, networkTypeM187771e, z2, z3, z4, z5, j9, j10, taq0.m187768b(cursorM99746b.getBlob(i27))), i3, backoffPolicyM187770d, j4, j5, j6, j7, z, outOfQuotaPolicyM187772f, i10, i12, j8, i15, i17, string4));
                    iM143765e = i5;
                    i2 = i4;
                }
                cursorM99746b.close();
                xcd0Var.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorM99746b.close();
                xcd0Var.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            xcd0Var = xcd0VarM208113d;
        }
    }

    @Override // p149l.iaq0
    /* JADX INFO: renamed from: C */
    public void mo135164C(String str, Data data) {
        this.f137929a.assertNotSuspendingTransaction();
        jzg0 jzg0VarM3929b = this.f137936h.m3929b();
        jzg0VarM3929b.bindBlob(1, Data.m4315g(data));
        jzg0VarM3929b.bindString(2, str);
        try {
            this.f137929a.beginTransaction();
            try {
                jzg0VarM3929b.executeUpdateDelete();
                this.f137929a.setTransactionSuccessful();
                this.f137929a.endTransaction();
                this.f137936h.m3935h(jzg0VarM3929b);
            } catch (Throwable th) {
                this.f137929a.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            this.f137936h.m3935h(jzg0VarM3929b);
            throw th2;
        }
    }

    @Override // p149l.iaq0
    /* JADX INFO: renamed from: D */
    public List<haq0> mo135165D() throws Throwable {
        xcd0 xcd0Var;
        xcd0 xcd0VarM208113d = xcd0.m208113d("SELECT * FROM workspec WHERE state=1", 0);
        this.f137929a.assertNotSuspendingTransaction();
        Cursor cursorM99746b = b0c.m99746b(this.f137929a, xcd0VarM208113d, false, null);
        try {
            int iM143765e = jxb.m143765e(cursorM99746b, "id");
            int iM143765e2 = jxb.m143765e(cursorM99746b, "state");
            int iM143765e3 = jxb.m143765e(cursorM99746b, "worker_class_name");
            int iM143765e4 = jxb.m143765e(cursorM99746b, "input_merger_class_name");
            int iM143765e5 = jxb.m143765e(cursorM99746b, "input");
            int iM143765e6 = jxb.m143765e(cursorM99746b, "output");
            int iM143765e7 = jxb.m143765e(cursorM99746b, "initial_delay");
            int iM143765e8 = jxb.m143765e(cursorM99746b, "interval_duration");
            int iM143765e9 = jxb.m143765e(cursorM99746b, "flex_duration");
            int iM143765e10 = jxb.m143765e(cursorM99746b, "run_attempt_count");
            int iM143765e11 = jxb.m143765e(cursorM99746b, "backoff_policy");
            int iM143765e12 = jxb.m143765e(cursorM99746b, "backoff_delay_duration");
            int iM143765e13 = jxb.m143765e(cursorM99746b, "last_enqueue_time");
            int iM143765e14 = jxb.m143765e(cursorM99746b, "minimum_retention_duration");
            xcd0Var = xcd0VarM208113d;
            try {
                int iM143765e15 = jxb.m143765e(cursorM99746b, "schedule_requested_at");
                int iM143765e16 = jxb.m143765e(cursorM99746b, "run_in_foreground");
                int iM143765e17 = jxb.m143765e(cursorM99746b, "out_of_quota_policy");
                int iM143765e18 = jxb.m143765e(cursorM99746b, "period_count");
                int iM143765e19 = jxb.m143765e(cursorM99746b, "generation");
                int iM143765e20 = jxb.m143765e(cursorM99746b, "next_schedule_time_override");
                int iM143765e21 = jxb.m143765e(cursorM99746b, "next_schedule_time_override_generation");
                int iM143765e22 = jxb.m143765e(cursorM99746b, DownloadService.KEY_STOP_REASON);
                int iM143765e23 = jxb.m143765e(cursorM99746b, "trace_tag");
                int iM143765e24 = jxb.m143765e(cursorM99746b, "required_network_type");
                int iM143765e25 = jxb.m143765e(cursorM99746b, "required_network_request");
                int iM143765e26 = jxb.m143765e(cursorM99746b, "requires_charging");
                int iM143765e27 = jxb.m143765e(cursorM99746b, "requires_device_idle");
                int iM143765e28 = jxb.m143765e(cursorM99746b, "requires_battery_not_low");
                int iM143765e29 = jxb.m143765e(cursorM99746b, "requires_storage_not_low");
                int iM143765e30 = jxb.m143765e(cursorM99746b, "trigger_content_update_delay");
                int iM143765e31 = jxb.m143765e(cursorM99746b, "trigger_max_content_delay");
                int iM143765e32 = jxb.m143765e(cursorM99746b, "content_uri_triggers");
                int i = iM143765e14;
                ArrayList arrayList = new ArrayList(cursorM99746b.getCount());
                while (cursorM99746b.moveToNext()) {
                    String string = cursorM99746b.getString(iM143765e);
                    WorkInfo.State stateM187773g = taq0.m187773g(cursorM99746b.getInt(iM143765e2));
                    String string2 = cursorM99746b.getString(iM143765e3);
                    String string3 = cursorM99746b.getString(iM143765e4);
                    Data dataM4314b = Data.m4314b(cursorM99746b.getBlob(iM143765e5));
                    Data dataM4314b2 = Data.m4314b(cursorM99746b.getBlob(iM143765e6));
                    long j = cursorM99746b.getLong(iM143765e7);
                    long j2 = cursorM99746b.getLong(iM143765e8);
                    long j3 = cursorM99746b.getLong(iM143765e9);
                    int i2 = cursorM99746b.getInt(iM143765e10);
                    BackoffPolicy backoffPolicyM187770d = taq0.m187770d(cursorM99746b.getInt(iM143765e11));
                    long j4 = cursorM99746b.getLong(iM143765e12);
                    long j5 = cursorM99746b.getLong(iM143765e13);
                    int i3 = i;
                    long j6 = cursorM99746b.getLong(i3);
                    int i4 = iM143765e;
                    int i5 = iM143765e15;
                    long j7 = cursorM99746b.getLong(i5);
                    iM143765e15 = i5;
                    int i6 = iM143765e16;
                    boolean z = cursorM99746b.getInt(i6) != 0;
                    iM143765e16 = i6;
                    int i7 = iM143765e17;
                    OutOfQuotaPolicy outOfQuotaPolicyM187772f = taq0.m187772f(cursorM99746b.getInt(i7));
                    iM143765e17 = i7;
                    int i8 = iM143765e18;
                    int i9 = cursorM99746b.getInt(i8);
                    iM143765e18 = i8;
                    int i10 = iM143765e19;
                    int i11 = cursorM99746b.getInt(i10);
                    iM143765e19 = i10;
                    int i12 = iM143765e20;
                    long j8 = cursorM99746b.getLong(i12);
                    iM143765e20 = i12;
                    int i13 = iM143765e21;
                    int i14 = cursorM99746b.getInt(i13);
                    iM143765e21 = i13;
                    int i15 = iM143765e22;
                    int i16 = cursorM99746b.getInt(i15);
                    iM143765e22 = i15;
                    int i17 = iM143765e23;
                    String string4 = cursorM99746b.isNull(i17) ? null : cursorM99746b.getString(i17);
                    iM143765e23 = i17;
                    int i18 = iM143765e24;
                    NetworkType networkTypeM187771e = taq0.m187771e(cursorM99746b.getInt(i18));
                    iM143765e24 = i18;
                    int i19 = iM143765e25;
                    qc20 qc20VarM187778l = taq0.m187778l(cursorM99746b.getBlob(i19));
                    iM143765e25 = i19;
                    int i20 = iM143765e26;
                    boolean z2 = cursorM99746b.getInt(i20) != 0;
                    iM143765e26 = i20;
                    int i21 = iM143765e27;
                    boolean z3 = cursorM99746b.getInt(i21) != 0;
                    iM143765e27 = i21;
                    int i22 = iM143765e28;
                    boolean z4 = cursorM99746b.getInt(i22) != 0;
                    iM143765e28 = i22;
                    int i23 = iM143765e29;
                    boolean z5 = cursorM99746b.getInt(i23) != 0;
                    iM143765e29 = i23;
                    int i24 = iM143765e30;
                    long j9 = cursorM99746b.getLong(i24);
                    iM143765e30 = i24;
                    int i25 = iM143765e31;
                    long j10 = cursorM99746b.getLong(i25);
                    iM143765e31 = i25;
                    int i26 = iM143765e32;
                    iM143765e32 = i26;
                    arrayList.add(new haq0(string, stateM187773g, string2, string3, dataM4314b, dataM4314b2, j, j2, j3, new gz5(qc20VarM187778l, networkTypeM187771e, z2, z3, z4, z5, j9, j10, taq0.m187768b(cursorM99746b.getBlob(i26))), i2, backoffPolicyM187770d, j4, j5, j6, j7, z, outOfQuotaPolicyM187772f, i9, i11, j8, i14, i16, string4));
                    iM143765e = i4;
                    i = i3;
                }
                cursorM99746b.close();
                xcd0Var.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorM99746b.close();
                xcd0Var.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            xcd0Var = xcd0VarM208113d;
        }
    }

    @Override // p149l.iaq0
    /* JADX INFO: renamed from: E */
    public List<haq0.C17256c> mo135166E(String str) {
        xcd0 xcd0VarM208113d = xcd0.m208113d("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN\n            (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        xcd0VarM208113d.bindString(1, str);
        this.f137929a.assertNotSuspendingTransaction();
        this.f137929a.beginTransaction();
        try {
            Cursor cursorM99746b = b0c.m99746b(this.f137929a, xcd0VarM208113d, true, null);
            try {
                HashMap<String, ArrayList<String>> map = new HashMap<>();
                HashMap<String, ArrayList<Data>> map2 = new HashMap<>();
                while (cursorM99746b.moveToNext()) {
                    String string = cursorM99746b.getString(0);
                    if (!map.containsKey(string)) {
                        map.put(string, new ArrayList<>());
                    }
                    String string2 = cursorM99746b.getString(0);
                    if (!map2.containsKey(string2)) {
                        map2.put(string2, new ArrayList<>());
                    }
                }
                cursorM99746b.moveToPosition(-1);
                m158705K(map);
                m158704J(map2);
                ArrayList arrayList = new ArrayList(cursorM99746b.getCount());
                while (cursorM99746b.moveToNext()) {
                    String string3 = cursorM99746b.getString(0);
                    WorkInfo.State stateM187773g = taq0.m187773g(cursorM99746b.getInt(1));
                    Data dataM4314b = Data.m4314b(cursorM99746b.getBlob(2));
                    int i = cursorM99746b.getInt(3);
                    int i2 = cursorM99746b.getInt(4);
                    arrayList.add(new haq0.C17256c(string3, stateM187773g, dataM4314b, cursorM99746b.getLong(14), cursorM99746b.getLong(15), cursorM99746b.getLong(16), new gz5(taq0.m187778l(cursorM99746b.getBlob(6)), taq0.m187771e(cursorM99746b.getInt(5)), cursorM99746b.getInt(7) != 0, cursorM99746b.getInt(8) != 0, cursorM99746b.getInt(9) != 0, cursorM99746b.getInt(10) != 0, cursorM99746b.getLong(11), cursorM99746b.getLong(12), taq0.m187768b(cursorM99746b.getBlob(13))), i, taq0.m187770d(cursorM99746b.getInt(17)), cursorM99746b.getLong(18), cursorM99746b.getLong(19), cursorM99746b.getInt(20), i2, cursorM99746b.getLong(21), cursorM99746b.getInt(22), map.get(cursorM99746b.getString(0)), map2.get(cursorM99746b.getString(0))));
                }
                this.f137929a.setTransactionSuccessful();
                cursorM99746b.close();
                xcd0VarM208113d.release();
                this.f137929a.endTransaction();
                return arrayList;
            } catch (Throwable th) {
                cursorM99746b.close();
                xcd0VarM208113d.release();
                throw th;
            }
        } catch (Throwable th2) {
            this.f137929a.endTransaction();
            throw th2;
        }
    }

    @Override // p149l.iaq0
    /* JADX INFO: renamed from: F */
    public int mo135167F(String str) {
        this.f137929a.assertNotSuspendingTransaction();
        jzg0 jzg0VarM3929b = this.f137938j.m3929b();
        jzg0VarM3929b.bindString(1, str);
        try {
            this.f137929a.beginTransaction();
            try {
                int iExecuteUpdateDelete = jzg0VarM3929b.executeUpdateDelete();
                this.f137929a.setTransactionSuccessful();
                this.f137929a.endTransaction();
                this.f137938j.m3935h(jzg0VarM3929b);
                return iExecuteUpdateDelete;
            } catch (Throwable th) {
                this.f137929a.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            this.f137938j.m3935h(jzg0VarM3929b);
            throw th2;
        }
    }

    @Override // p149l.iaq0
    /* JADX INFO: renamed from: G */
    public List<haq0.C17256c> mo135168G(List<String> list) {
        StringBuilder sbM94424b = a0g0.m94424b();
        sbM94424b.append("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (");
        int size = list.size();
        a0g0.m94423a(sbM94424b, size);
        sbM94424b.append(")");
        xcd0 xcd0VarM208113d = xcd0.m208113d(sbM94424b.toString(), size);
        Iterator<String> it = list.iterator();
        int i = 1;
        while (it.hasNext()) {
            xcd0VarM208113d.bindString(i, it.next());
            i++;
        }
        this.f137929a.assertNotSuspendingTransaction();
        this.f137929a.beginTransaction();
        try {
            Cursor cursorM99746b = b0c.m99746b(this.f137929a, xcd0VarM208113d, true, null);
            try {
                HashMap<String, ArrayList<String>> map = new HashMap<>();
                HashMap<String, ArrayList<Data>> map2 = new HashMap<>();
                while (cursorM99746b.moveToNext()) {
                    String string = cursorM99746b.getString(0);
                    if (!map.containsKey(string)) {
                        map.put(string, new ArrayList<>());
                    }
                    String string2 = cursorM99746b.getString(0);
                    if (!map2.containsKey(string2)) {
                        map2.put(string2, new ArrayList<>());
                    }
                }
                cursorM99746b.moveToPosition(-1);
                m158705K(map);
                m158704J(map2);
                ArrayList arrayList = new ArrayList(cursorM99746b.getCount());
                while (cursorM99746b.moveToNext()) {
                    arrayList.add(new haq0.C17256c(cursorM99746b.getString(0), taq0.m187773g(cursorM99746b.getInt(1)), Data.m4314b(cursorM99746b.getBlob(2)), cursorM99746b.getLong(14), cursorM99746b.getLong(15), cursorM99746b.getLong(16), new gz5(taq0.m187778l(cursorM99746b.getBlob(6)), taq0.m187771e(cursorM99746b.getInt(5)), cursorM99746b.getInt(7) != 0, cursorM99746b.getInt(8) != 0, cursorM99746b.getInt(9) != 0, cursorM99746b.getInt(10) != 0, cursorM99746b.getLong(11), cursorM99746b.getLong(12), taq0.m187768b(cursorM99746b.getBlob(13))), cursorM99746b.getInt(3), taq0.m187770d(cursorM99746b.getInt(17)), cursorM99746b.getLong(18), cursorM99746b.getLong(19), cursorM99746b.getInt(20), cursorM99746b.getInt(4), cursorM99746b.getLong(21), cursorM99746b.getInt(22), map.get(cursorM99746b.getString(0)), map2.get(cursorM99746b.getString(0))));
                }
                this.f137929a.setTransactionSuccessful();
                cursorM99746b.close();
                xcd0VarM208113d.release();
                this.f137929a.endTransaction();
                return arrayList;
            } catch (Throwable th) {
                cursorM99746b.close();
                xcd0VarM208113d.release();
                throw th;
            }
        } catch (Throwable th2) {
            this.f137929a.endTransaction();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m158704J(@NonNull HashMap<String, ArrayList<Data>> map) {
        Set<String> setKeySet = map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (map.size() > 999) {
            koc0.m146693a(map, true, new Function1() { // from class: l.maq0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return naq0.m158700H(this.f132946a, (HashMap) obj);
                }
            });
            return;
        }
        StringBuilder sbM94424b = a0g0.m94424b();
        sbM94424b.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        int size = setKeySet.size();
        a0g0.m94423a(sbM94424b, size);
        sbM94424b.append(")");
        xcd0 xcd0VarM208113d = xcd0.m208113d(sbM94424b.toString(), size);
        Iterator<String> it = setKeySet.iterator();
        int i = 1;
        while (it.hasNext()) {
            xcd0VarM208113d.bindString(i, it.next());
            i++;
        }
        Cursor cursorM99746b = b0c.m99746b(this.f137929a, xcd0VarM208113d, false, null);
        try {
            int iM143764d = jxb.m143764d(cursorM99746b, "work_spec_id");
            if (iM143764d == -1) {
                cursorM99746b.close();
                return;
            }
            while (cursorM99746b.moveToNext()) {
                ArrayList<Data> arrayList = map.get(cursorM99746b.getString(iM143764d));
                if (arrayList != null) {
                    arrayList.add(Data.m4314b(cursorM99746b.getBlob(0)));
                }
            }
            cursorM99746b.close();
        } catch (Throwable th) {
            cursorM99746b.close();
            throw th;
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m158705K(@NonNull HashMap<String, ArrayList<String>> map) {
        Set<String> setKeySet = map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (map.size() > 999) {
            koc0.m146693a(map, true, new Function1() { // from class: l.laq0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return naq0.m158701I(this.f127235a, (HashMap) obj);
                }
            });
            return;
        }
        StringBuilder sbM94424b = a0g0.m94424b();
        sbM94424b.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        int size = setKeySet.size();
        a0g0.m94423a(sbM94424b, size);
        sbM94424b.append(")");
        xcd0 xcd0VarM208113d = xcd0.m208113d(sbM94424b.toString(), size);
        Iterator<String> it = setKeySet.iterator();
        int i = 1;
        while (it.hasNext()) {
            xcd0VarM208113d.bindString(i, it.next());
            i++;
        }
        Cursor cursorM99746b = b0c.m99746b(this.f137929a, xcd0VarM208113d, false, null);
        try {
            int iM143764d = jxb.m143764d(cursorM99746b, "work_spec_id");
            if (iM143764d == -1) {
                cursorM99746b.close();
                return;
            }
            while (cursorM99746b.moveToNext()) {
                ArrayList<String> arrayList = map.get(cursorM99746b.getString(iM143764d));
                if (arrayList != null) {
                    arrayList.add(cursorM99746b.getString(0));
                }
            }
            cursorM99746b.close();
        } catch (Throwable th) {
            cursorM99746b.close();
            throw th;
        }
    }

    @Override // p149l.iaq0
    /* JADX INFO: renamed from: a */
    public void mo135169a() {
        this.f137929a.assertNotSuspendingTransaction();
        jzg0 jzg0VarM3929b = this.f137944p.m3929b();
        try {
            this.f137929a.beginTransaction();
            try {
                jzg0VarM3929b.executeUpdateDelete();
                this.f137929a.setTransactionSuccessful();
                this.f137929a.endTransaction();
                this.f137944p.m3935h(jzg0VarM3929b);
            } catch (Throwable th) {
                this.f137929a.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            this.f137944p.m3935h(jzg0VarM3929b);
            throw th2;
        }
    }

    @Override // p149l.iaq0
    /* JADX INFO: renamed from: b */
    public void mo135170b(String str, int i) {
        this.f137929a.assertNotSuspendingTransaction();
        jzg0 jzg0VarM3929b = this.f137946r.m3929b();
        jzg0VarM3929b.bindLong(1, i);
        jzg0VarM3929b.bindString(2, str);
        try {
            this.f137929a.beginTransaction();
            try {
                jzg0VarM3929b.executeUpdateDelete();
                this.f137929a.setTransactionSuccessful();
                this.f137929a.endTransaction();
                this.f137946r.m3935h(jzg0VarM3929b);
            } catch (Throwable th) {
                this.f137929a.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            this.f137946r.m3935h(jzg0VarM3929b);
            throw th2;
        }
    }

    @Override // p149l.iaq0
    /* JADX INFO: renamed from: c */
    public List<String> mo135171c(String str) {
        xcd0 xcd0VarM208113d = xcd0.m208113d("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        xcd0VarM208113d.bindString(1, str);
        this.f137929a.assertNotSuspendingTransaction();
        Cursor cursorM99746b = b0c.m99746b(this.f137929a, xcd0VarM208113d, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorM99746b.getCount());
            while (cursorM99746b.moveToNext()) {
                arrayList.add(cursorM99746b.getString(0));
            }
            cursorM99746b.close();
            xcd0VarM208113d.release();
            return arrayList;
        } catch (Throwable th) {
            cursorM99746b.close();
            xcd0VarM208113d.release();
            throw th;
        }
    }

    @Override // p149l.iaq0
    /* JADX INFO: renamed from: d */
    public WorkInfo.State mo135172d(String str) {
        xcd0 xcd0VarM208113d = xcd0.m208113d("SELECT state FROM workspec WHERE id=?", 1);
        xcd0VarM208113d.bindString(1, str);
        this.f137929a.assertNotSuspendingTransaction();
        WorkInfo.State stateM187773g = null;
        Cursor cursorM99746b = b0c.m99746b(this.f137929a, xcd0VarM208113d, false, null);
        try {
            if (cursorM99746b.moveToFirst()) {
                Integer numValueOf = cursorM99746b.isNull(0) ? null : Integer.valueOf(cursorM99746b.getInt(0));
                if (numValueOf != null) {
                    taq0 taq0Var = taq0.INSTANCE;
                    stateM187773g = taq0.m187773g(numValueOf.intValue());
                }
            }
            return stateM187773g;
        } finally {
            cursorM99746b.close();
            xcd0VarM208113d.release();
        }
    }

    @Override // p149l.iaq0
    public void delete(String str) {
        this.f137929a.assertNotSuspendingTransaction();
        jzg0 jzg0VarM3929b = this.f137932d.m3929b();
        jzg0VarM3929b.bindString(1, str);
        try {
            this.f137929a.beginTransaction();
            try {
                jzg0VarM3929b.executeUpdateDelete();
                this.f137929a.setTransactionSuccessful();
                this.f137929a.endTransaction();
                this.f137932d.m3935h(jzg0VarM3929b);
            } catch (Throwable th) {
                this.f137929a.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            this.f137932d.m3935h(jzg0VarM3929b);
            throw th2;
        }
    }

    @Override // p149l.iaq0
    /* JADX INFO: renamed from: e */
    public int mo135173e(String str) {
        this.f137929a.assertNotSuspendingTransaction();
        jzg0 jzg0VarM3929b = this.f137934f.m3929b();
        jzg0VarM3929b.bindString(1, str);
        try {
            this.f137929a.beginTransaction();
            try {
                int iExecuteUpdateDelete = jzg0VarM3929b.executeUpdateDelete();
                this.f137929a.setTransactionSuccessful();
                this.f137929a.endTransaction();
                this.f137934f.m3935h(jzg0VarM3929b);
                return iExecuteUpdateDelete;
            } catch (Throwable th) {
                this.f137929a.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            this.f137934f.m3935h(jzg0VarM3929b);
            throw th2;
        }
    }

    @Override // p149l.iaq0
    /* JADX INFO: renamed from: f */
    public List<String> mo135174f(String str) {
        xcd0 xcd0VarM208113d = xcd0.m208113d("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)", 1);
        xcd0VarM208113d.bindString(1, str);
        this.f137929a.assertNotSuspendingTransaction();
        Cursor cursorM99746b = b0c.m99746b(this.f137929a, xcd0VarM208113d, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorM99746b.getCount());
            while (cursorM99746b.moveToNext()) {
                arrayList.add(cursorM99746b.getString(0));
            }
            cursorM99746b.close();
            xcd0VarM208113d.release();
            return arrayList;
        } catch (Throwable th) {
            cursorM99746b.close();
            xcd0VarM208113d.release();
            throw th;
        }
    }

    @Override // p149l.iaq0
    /* JADX INFO: renamed from: g */
    public List<Data> mo135175g(String str) {
        xcd0 xcd0VarM208113d = xcd0.m208113d("SELECT output FROM workspec WHERE id IN\n             (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)", 1);
        xcd0VarM208113d.bindString(1, str);
        this.f137929a.assertNotSuspendingTransaction();
        Cursor cursorM99746b = b0c.m99746b(this.f137929a, xcd0VarM208113d, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorM99746b.getCount());
            while (cursorM99746b.moveToNext()) {
                arrayList.add(Data.m4314b(cursorM99746b.getBlob(0)));
            }
            cursorM99746b.close();
            xcd0VarM208113d.release();
            return arrayList;
        } catch (Throwable th) {
            cursorM99746b.close();
            xcd0VarM208113d.release();
            throw th;
        }
    }

    @Override // p149l.iaq0
    /* JADX INFO: renamed from: h */
    public List<haq0.C17256c> mo135176h(String str) {
        xcd0 xcd0VarM208113d = xcd0.m208113d("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        xcd0VarM208113d.bindString(1, str);
        this.f137929a.assertNotSuspendingTransaction();
        this.f137929a.beginTransaction();
        try {
            Cursor cursorM99746b = b0c.m99746b(this.f137929a, xcd0VarM208113d, true, null);
            try {
                HashMap<String, ArrayList<String>> map = new HashMap<>();
                HashMap<String, ArrayList<Data>> map2 = new HashMap<>();
                while (cursorM99746b.moveToNext()) {
                    String string = cursorM99746b.getString(0);
                    if (!map.containsKey(string)) {
                        map.put(string, new ArrayList<>());
                    }
                    String string2 = cursorM99746b.getString(0);
                    if (!map2.containsKey(string2)) {
                        map2.put(string2, new ArrayList<>());
                    }
                }
                cursorM99746b.moveToPosition(-1);
                m158705K(map);
                m158704J(map2);
                ArrayList arrayList = new ArrayList(cursorM99746b.getCount());
                while (cursorM99746b.moveToNext()) {
                    String string3 = cursorM99746b.getString(0);
                    WorkInfo.State stateM187773g = taq0.m187773g(cursorM99746b.getInt(1));
                    Data dataM4314b = Data.m4314b(cursorM99746b.getBlob(2));
                    int i = cursorM99746b.getInt(3);
                    int i2 = cursorM99746b.getInt(4);
                    arrayList.add(new haq0.C17256c(string3, stateM187773g, dataM4314b, cursorM99746b.getLong(14), cursorM99746b.getLong(15), cursorM99746b.getLong(16), new gz5(taq0.m187778l(cursorM99746b.getBlob(6)), taq0.m187771e(cursorM99746b.getInt(5)), cursorM99746b.getInt(7) != 0, cursorM99746b.getInt(8) != 0, cursorM99746b.getInt(9) != 0, cursorM99746b.getInt(10) != 0, cursorM99746b.getLong(11), cursorM99746b.getLong(12), taq0.m187768b(cursorM99746b.getBlob(13))), i, taq0.m187770d(cursorM99746b.getInt(17)), cursorM99746b.getLong(18), cursorM99746b.getLong(19), cursorM99746b.getInt(20), i2, cursorM99746b.getLong(21), cursorM99746b.getInt(22), map.get(cursorM99746b.getString(0)), map2.get(cursorM99746b.getString(0))));
                }
                this.f137929a.setTransactionSuccessful();
                cursorM99746b.close();
                xcd0VarM208113d.release();
                this.f137929a.endTransaction();
                return arrayList;
            } catch (Throwable th) {
                cursorM99746b.close();
                xcd0VarM208113d.release();
                throw th;
            }
        } catch (Throwable th2) {
            this.f137929a.endTransaction();
            throw th2;
        }
    }

    @Override // p149l.iaq0
    /* JADX INFO: renamed from: i */
    public List<haq0> mo135177i(int i) throws Throwable {
        xcd0 xcd0Var;
        xcd0 xcd0VarM208113d = xcd0.m208113d("SELECT * FROM workspec WHERE state=0 ORDER BY last_enqueue_time LIMIT ?", 1);
        xcd0VarM208113d.bindLong(1, i);
        this.f137929a.assertNotSuspendingTransaction();
        Cursor cursorM99746b = b0c.m99746b(this.f137929a, xcd0VarM208113d, false, null);
        try {
            int iM143765e = jxb.m143765e(cursorM99746b, "id");
            int iM143765e2 = jxb.m143765e(cursorM99746b, "state");
            int iM143765e3 = jxb.m143765e(cursorM99746b, "worker_class_name");
            int iM143765e4 = jxb.m143765e(cursorM99746b, "input_merger_class_name");
            int iM143765e5 = jxb.m143765e(cursorM99746b, "input");
            int iM143765e6 = jxb.m143765e(cursorM99746b, "output");
            int iM143765e7 = jxb.m143765e(cursorM99746b, "initial_delay");
            int iM143765e8 = jxb.m143765e(cursorM99746b, "interval_duration");
            int iM143765e9 = jxb.m143765e(cursorM99746b, "flex_duration");
            int iM143765e10 = jxb.m143765e(cursorM99746b, "run_attempt_count");
            int iM143765e11 = jxb.m143765e(cursorM99746b, "backoff_policy");
            int iM143765e12 = jxb.m143765e(cursorM99746b, "backoff_delay_duration");
            int iM143765e13 = jxb.m143765e(cursorM99746b, "last_enqueue_time");
            int iM143765e14 = jxb.m143765e(cursorM99746b, "minimum_retention_duration");
            xcd0Var = xcd0VarM208113d;
            try {
                int iM143765e15 = jxb.m143765e(cursorM99746b, "schedule_requested_at");
                int iM143765e16 = jxb.m143765e(cursorM99746b, "run_in_foreground");
                int iM143765e17 = jxb.m143765e(cursorM99746b, "out_of_quota_policy");
                int iM143765e18 = jxb.m143765e(cursorM99746b, "period_count");
                int iM143765e19 = jxb.m143765e(cursorM99746b, "generation");
                int iM143765e20 = jxb.m143765e(cursorM99746b, "next_schedule_time_override");
                int iM143765e21 = jxb.m143765e(cursorM99746b, "next_schedule_time_override_generation");
                int iM143765e22 = jxb.m143765e(cursorM99746b, DownloadService.KEY_STOP_REASON);
                int iM143765e23 = jxb.m143765e(cursorM99746b, "trace_tag");
                int iM143765e24 = jxb.m143765e(cursorM99746b, "required_network_type");
                int iM143765e25 = jxb.m143765e(cursorM99746b, "required_network_request");
                int iM143765e26 = jxb.m143765e(cursorM99746b, "requires_charging");
                int iM143765e27 = jxb.m143765e(cursorM99746b, "requires_device_idle");
                int iM143765e28 = jxb.m143765e(cursorM99746b, "requires_battery_not_low");
                int iM143765e29 = jxb.m143765e(cursorM99746b, "requires_storage_not_low");
                int iM143765e30 = jxb.m143765e(cursorM99746b, "trigger_content_update_delay");
                int iM143765e31 = jxb.m143765e(cursorM99746b, "trigger_max_content_delay");
                int iM143765e32 = jxb.m143765e(cursorM99746b, "content_uri_triggers");
                int i2 = iM143765e14;
                ArrayList arrayList = new ArrayList(cursorM99746b.getCount());
                while (cursorM99746b.moveToNext()) {
                    String string = cursorM99746b.getString(iM143765e);
                    WorkInfo.State stateM187773g = taq0.m187773g(cursorM99746b.getInt(iM143765e2));
                    String string2 = cursorM99746b.getString(iM143765e3);
                    String string3 = cursorM99746b.getString(iM143765e4);
                    Data dataM4314b = Data.m4314b(cursorM99746b.getBlob(iM143765e5));
                    Data dataM4314b2 = Data.m4314b(cursorM99746b.getBlob(iM143765e6));
                    long j = cursorM99746b.getLong(iM143765e7);
                    long j2 = cursorM99746b.getLong(iM143765e8);
                    long j3 = cursorM99746b.getLong(iM143765e9);
                    int i3 = cursorM99746b.getInt(iM143765e10);
                    BackoffPolicy backoffPolicyM187770d = taq0.m187770d(cursorM99746b.getInt(iM143765e11));
                    long j4 = cursorM99746b.getLong(iM143765e12);
                    long j5 = cursorM99746b.getLong(iM143765e13);
                    int i4 = i2;
                    long j6 = cursorM99746b.getLong(i4);
                    int i5 = iM143765e;
                    int i6 = iM143765e15;
                    long j7 = cursorM99746b.getLong(i6);
                    iM143765e15 = i6;
                    int i7 = iM143765e16;
                    boolean z = cursorM99746b.getInt(i7) != 0;
                    iM143765e16 = i7;
                    int i8 = iM143765e17;
                    OutOfQuotaPolicy outOfQuotaPolicyM187772f = taq0.m187772f(cursorM99746b.getInt(i8));
                    iM143765e17 = i8;
                    int i9 = iM143765e18;
                    int i10 = cursorM99746b.getInt(i9);
                    iM143765e18 = i9;
                    int i11 = iM143765e19;
                    int i12 = cursorM99746b.getInt(i11);
                    iM143765e19 = i11;
                    int i13 = iM143765e20;
                    long j8 = cursorM99746b.getLong(i13);
                    iM143765e20 = i13;
                    int i14 = iM143765e21;
                    int i15 = cursorM99746b.getInt(i14);
                    iM143765e21 = i14;
                    int i16 = iM143765e22;
                    int i17 = cursorM99746b.getInt(i16);
                    iM143765e22 = i16;
                    int i18 = iM143765e23;
                    String string4 = cursorM99746b.isNull(i18) ? null : cursorM99746b.getString(i18);
                    iM143765e23 = i18;
                    int i19 = iM143765e24;
                    NetworkType networkTypeM187771e = taq0.m187771e(cursorM99746b.getInt(i19));
                    iM143765e24 = i19;
                    int i20 = iM143765e25;
                    qc20 qc20VarM187778l = taq0.m187778l(cursorM99746b.getBlob(i20));
                    iM143765e25 = i20;
                    int i21 = iM143765e26;
                    boolean z2 = cursorM99746b.getInt(i21) != 0;
                    iM143765e26 = i21;
                    int i22 = iM143765e27;
                    boolean z3 = cursorM99746b.getInt(i22) != 0;
                    iM143765e27 = i22;
                    int i23 = iM143765e28;
                    boolean z4 = cursorM99746b.getInt(i23) != 0;
                    iM143765e28 = i23;
                    int i24 = iM143765e29;
                    boolean z5 = cursorM99746b.getInt(i24) != 0;
                    iM143765e29 = i24;
                    int i25 = iM143765e30;
                    long j9 = cursorM99746b.getLong(i25);
                    iM143765e30 = i25;
                    int i26 = iM143765e31;
                    long j10 = cursorM99746b.getLong(i26);
                    iM143765e31 = i26;
                    int i27 = iM143765e32;
                    iM143765e32 = i27;
                    arrayList.add(new haq0(string, stateM187773g, string2, string3, dataM4314b, dataM4314b2, j, j2, j3, new gz5(qc20VarM187778l, networkTypeM187771e, z2, z3, z4, z5, j9, j10, taq0.m187768b(cursorM99746b.getBlob(i27))), i3, backoffPolicyM187770d, j4, j5, j6, j7, z, outOfQuotaPolicyM187772f, i10, i12, j8, i15, i17, string4));
                    iM143765e = i5;
                    i2 = i4;
                }
                cursorM99746b.close();
                xcd0Var.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorM99746b.close();
                xcd0Var.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            xcd0Var = xcd0VarM208113d;
        }
    }

    @Override // p149l.iaq0
    /* JADX INFO: renamed from: j */
    public int mo135178j(WorkInfo.State state, String str) {
        this.f137929a.assertNotSuspendingTransaction();
        jzg0 jzg0VarM3929b = this.f137933e.m3929b();
        jzg0VarM3929b.bindLong(1, taq0.m187777k(state));
        jzg0VarM3929b.bindString(2, str);
        try {
            this.f137929a.beginTransaction();
            try {
                int iExecuteUpdateDelete = jzg0VarM3929b.executeUpdateDelete();
                this.f137929a.setTransactionSuccessful();
                this.f137929a.endTransaction();
                this.f137933e.m3935h(jzg0VarM3929b);
                return iExecuteUpdateDelete;
            } catch (Throwable th) {
                this.f137929a.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            this.f137933e.m3935h(jzg0VarM3929b);
            throw th2;
        }
    }

    @Override // p149l.iaq0
    /* JADX INFO: renamed from: k */
    public void mo135179k(String str, long j) {
        this.f137929a.assertNotSuspendingTransaction();
        jzg0 jzg0VarM3929b = this.f137937i.m3929b();
        jzg0VarM3929b.bindLong(1, j);
        jzg0VarM3929b.bindString(2, str);
        try {
            this.f137929a.beginTransaction();
            try {
                jzg0VarM3929b.executeUpdateDelete();
                this.f137929a.setTransactionSuccessful();
                this.f137929a.endTransaction();
                this.f137937i.m3935h(jzg0VarM3929b);
            } catch (Throwable th) {
                this.f137929a.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            this.f137937i.m3935h(jzg0VarM3929b);
            throw th2;
        }
    }

    @Override // p149l.iaq0
    /* JADX INFO: renamed from: l */
    public List<String> mo135180l() {
        xcd0 xcd0VarM208113d = xcd0.m208113d("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)", 0);
        this.f137929a.assertNotSuspendingTransaction();
        Cursor cursorM99746b = b0c.m99746b(this.f137929a, xcd0VarM208113d, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorM99746b.getCount());
            while (cursorM99746b.moveToNext()) {
                arrayList.add(cursorM99746b.getString(0));
            }
            cursorM99746b.close();
            xcd0VarM208113d.release();
            return arrayList;
        } catch (Throwable th) {
            cursorM99746b.close();
            xcd0VarM208113d.release();
            throw th;
        }
    }

    @Override // p149l.iaq0
    /* JADX INFO: renamed from: m */
    public List<haq0> mo135181m() throws Throwable {
        xcd0 xcd0Var;
        xcd0 xcd0VarM208113d = xcd0.m208113d("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 AND LENGTH(content_uri_triggers)<>0 ORDER BY last_enqueue_time", 0);
        this.f137929a.assertNotSuspendingTransaction();
        Cursor cursorM99746b = b0c.m99746b(this.f137929a, xcd0VarM208113d, false, null);
        try {
            int iM143765e = jxb.m143765e(cursorM99746b, "id");
            int iM143765e2 = jxb.m143765e(cursorM99746b, "state");
            int iM143765e3 = jxb.m143765e(cursorM99746b, "worker_class_name");
            int iM143765e4 = jxb.m143765e(cursorM99746b, "input_merger_class_name");
            int iM143765e5 = jxb.m143765e(cursorM99746b, "input");
            int iM143765e6 = jxb.m143765e(cursorM99746b, "output");
            int iM143765e7 = jxb.m143765e(cursorM99746b, "initial_delay");
            int iM143765e8 = jxb.m143765e(cursorM99746b, "interval_duration");
            int iM143765e9 = jxb.m143765e(cursorM99746b, "flex_duration");
            int iM143765e10 = jxb.m143765e(cursorM99746b, "run_attempt_count");
            int iM143765e11 = jxb.m143765e(cursorM99746b, "backoff_policy");
            int iM143765e12 = jxb.m143765e(cursorM99746b, "backoff_delay_duration");
            int iM143765e13 = jxb.m143765e(cursorM99746b, "last_enqueue_time");
            int iM143765e14 = jxb.m143765e(cursorM99746b, "minimum_retention_duration");
            xcd0Var = xcd0VarM208113d;
            try {
                int iM143765e15 = jxb.m143765e(cursorM99746b, "schedule_requested_at");
                int iM143765e16 = jxb.m143765e(cursorM99746b, "run_in_foreground");
                int iM143765e17 = jxb.m143765e(cursorM99746b, "out_of_quota_policy");
                int iM143765e18 = jxb.m143765e(cursorM99746b, "period_count");
                int iM143765e19 = jxb.m143765e(cursorM99746b, "generation");
                int iM143765e20 = jxb.m143765e(cursorM99746b, "next_schedule_time_override");
                int iM143765e21 = jxb.m143765e(cursorM99746b, "next_schedule_time_override_generation");
                int iM143765e22 = jxb.m143765e(cursorM99746b, DownloadService.KEY_STOP_REASON);
                int iM143765e23 = jxb.m143765e(cursorM99746b, "trace_tag");
                int iM143765e24 = jxb.m143765e(cursorM99746b, "required_network_type");
                int iM143765e25 = jxb.m143765e(cursorM99746b, "required_network_request");
                int iM143765e26 = jxb.m143765e(cursorM99746b, "requires_charging");
                int iM143765e27 = jxb.m143765e(cursorM99746b, "requires_device_idle");
                int iM143765e28 = jxb.m143765e(cursorM99746b, "requires_battery_not_low");
                int iM143765e29 = jxb.m143765e(cursorM99746b, "requires_storage_not_low");
                int iM143765e30 = jxb.m143765e(cursorM99746b, "trigger_content_update_delay");
                int iM143765e31 = jxb.m143765e(cursorM99746b, "trigger_max_content_delay");
                int iM143765e32 = jxb.m143765e(cursorM99746b, "content_uri_triggers");
                int i = iM143765e14;
                ArrayList arrayList = new ArrayList(cursorM99746b.getCount());
                while (cursorM99746b.moveToNext()) {
                    String string = cursorM99746b.getString(iM143765e);
                    WorkInfo.State stateM187773g = taq0.m187773g(cursorM99746b.getInt(iM143765e2));
                    String string2 = cursorM99746b.getString(iM143765e3);
                    String string3 = cursorM99746b.getString(iM143765e4);
                    Data dataM4314b = Data.m4314b(cursorM99746b.getBlob(iM143765e5));
                    Data dataM4314b2 = Data.m4314b(cursorM99746b.getBlob(iM143765e6));
                    long j = cursorM99746b.getLong(iM143765e7);
                    long j2 = cursorM99746b.getLong(iM143765e8);
                    long j3 = cursorM99746b.getLong(iM143765e9);
                    int i2 = cursorM99746b.getInt(iM143765e10);
                    BackoffPolicy backoffPolicyM187770d = taq0.m187770d(cursorM99746b.getInt(iM143765e11));
                    long j4 = cursorM99746b.getLong(iM143765e12);
                    long j5 = cursorM99746b.getLong(iM143765e13);
                    int i3 = i;
                    long j6 = cursorM99746b.getLong(i3);
                    int i4 = iM143765e;
                    int i5 = iM143765e15;
                    long j7 = cursorM99746b.getLong(i5);
                    iM143765e15 = i5;
                    int i6 = iM143765e16;
                    boolean z = cursorM99746b.getInt(i6) != 0;
                    iM143765e16 = i6;
                    int i7 = iM143765e17;
                    OutOfQuotaPolicy outOfQuotaPolicyM187772f = taq0.m187772f(cursorM99746b.getInt(i7));
                    iM143765e17 = i7;
                    int i8 = iM143765e18;
                    int i9 = cursorM99746b.getInt(i8);
                    iM143765e18 = i8;
                    int i10 = iM143765e19;
                    int i11 = cursorM99746b.getInt(i10);
                    iM143765e19 = i10;
                    int i12 = iM143765e20;
                    long j8 = cursorM99746b.getLong(i12);
                    iM143765e20 = i12;
                    int i13 = iM143765e21;
                    int i14 = cursorM99746b.getInt(i13);
                    iM143765e21 = i13;
                    int i15 = iM143765e22;
                    int i16 = cursorM99746b.getInt(i15);
                    iM143765e22 = i15;
                    int i17 = iM143765e23;
                    String string4 = cursorM99746b.isNull(i17) ? null : cursorM99746b.getString(i17);
                    iM143765e23 = i17;
                    int i18 = iM143765e24;
                    NetworkType networkTypeM187771e = taq0.m187771e(cursorM99746b.getInt(i18));
                    iM143765e24 = i18;
                    int i19 = iM143765e25;
                    qc20 qc20VarM187778l = taq0.m187778l(cursorM99746b.getBlob(i19));
                    iM143765e25 = i19;
                    int i20 = iM143765e26;
                    boolean z2 = cursorM99746b.getInt(i20) != 0;
                    iM143765e26 = i20;
                    int i21 = iM143765e27;
                    boolean z3 = cursorM99746b.getInt(i21) != 0;
                    iM143765e27 = i21;
                    int i22 = iM143765e28;
                    boolean z4 = cursorM99746b.getInt(i22) != 0;
                    iM143765e28 = i22;
                    int i23 = iM143765e29;
                    boolean z5 = cursorM99746b.getInt(i23) != 0;
                    iM143765e29 = i23;
                    int i24 = iM143765e30;
                    long j9 = cursorM99746b.getLong(i24);
                    iM143765e30 = i24;
                    int i25 = iM143765e31;
                    long j10 = cursorM99746b.getLong(i25);
                    iM143765e31 = i25;
                    int i26 = iM143765e32;
                    iM143765e32 = i26;
                    arrayList.add(new haq0(string, stateM187773g, string2, string3, dataM4314b, dataM4314b2, j, j2, j3, new gz5(qc20VarM187778l, networkTypeM187771e, z2, z3, z4, z5, j9, j10, taq0.m187768b(cursorM99746b.getBlob(i26))), i2, backoffPolicyM187770d, j4, j5, j6, j7, z, outOfQuotaPolicyM187772f, i9, i11, j8, i14, i16, string4));
                    iM143765e = i4;
                    i = i3;
                }
                cursorM99746b.close();
                xcd0Var.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorM99746b.close();
                xcd0Var.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            xcd0Var = xcd0VarM208113d;
        }
    }

    @Override // p149l.iaq0
    /* JADX INFO: renamed from: n */
    public int mo135182n(String str) {
        this.f137929a.assertNotSuspendingTransaction();
        jzg0 jzg0VarM3929b = this.f137939k.m3929b();
        jzg0VarM3929b.bindString(1, str);
        try {
            this.f137929a.beginTransaction();
            try {
                int iExecuteUpdateDelete = jzg0VarM3929b.executeUpdateDelete();
                this.f137929a.setTransactionSuccessful();
                this.f137929a.endTransaction();
                this.f137939k.m3935h(jzg0VarM3929b);
                return iExecuteUpdateDelete;
            } catch (Throwable th) {
                this.f137929a.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            this.f137939k.m3935h(jzg0VarM3929b);
            throw th2;
        }
    }

    @Override // p149l.iaq0
    /* JADX INFO: renamed from: o */
    public void mo135183o(haq0 haq0Var) {
        this.f137929a.assertNotSuspendingTransaction();
        this.f137929a.beginTransaction();
        try {
            this.f137930b.m167058j(haq0Var);
            this.f137929a.setTransactionSuccessful();
        } finally {
            this.f137929a.endTransaction();
        }
    }

    @Override // p149l.iaq0
    /* JADX INFO: renamed from: p */
    public int mo135184p() {
        xcd0 xcd0VarM208113d = xcd0.m208113d("Select COUNT(*) FROM workspec WHERE LENGTH(content_uri_triggers)<>0 AND state NOT IN (2, 3, 5)", 0);
        this.f137929a.assertNotSuspendingTransaction();
        Cursor cursorM99746b = b0c.m99746b(this.f137929a, xcd0VarM208113d, false, null);
        try {
            return cursorM99746b.moveToFirst() ? cursorM99746b.getInt(0) : 0;
        } finally {
            cursorM99746b.close();
            xcd0VarM208113d.release();
        }
    }

    @Override // p149l.iaq0
    /* JADX INFO: renamed from: q */
    public void mo135185q(String str, int i) {
        this.f137929a.assertNotSuspendingTransaction();
        jzg0 jzg0VarM3929b = this.f137941m.m3929b();
        jzg0VarM3929b.bindString(1, str);
        jzg0VarM3929b.bindLong(2, i);
        try {
            this.f137929a.beginTransaction();
            try {
                jzg0VarM3929b.executeUpdateDelete();
                this.f137929a.setTransactionSuccessful();
                this.f137929a.endTransaction();
                this.f137941m.m3935h(jzg0VarM3929b);
            } catch (Throwable th) {
                this.f137929a.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            this.f137941m.m3935h(jzg0VarM3929b);
            throw th2;
        }
    }

    @Override // p149l.iaq0
    /* JADX INFO: renamed from: r */
    public void mo135186r(String str) {
        this.f137929a.assertNotSuspendingTransaction();
        jzg0 jzg0VarM3929b = this.f137935g.m3929b();
        jzg0VarM3929b.bindString(1, str);
        try {
            this.f137929a.beginTransaction();
            try {
                jzg0VarM3929b.executeUpdateDelete();
                this.f137929a.setTransactionSuccessful();
                this.f137929a.endTransaction();
                this.f137935g.m3935h(jzg0VarM3929b);
            } catch (Throwable th) {
                this.f137929a.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            this.f137935g.m3935h(jzg0VarM3929b);
            throw th2;
        }
    }

    @Override // p149l.iaq0
    /* JADX INFO: renamed from: s */
    public List<haq0> mo135187s(long j) throws Throwable {
        xcd0 xcd0Var;
        xcd0 xcd0VarM208113d = xcd0.m208113d("SELECT * FROM workspec WHERE last_enqueue_time >= ? AND state IN (2, 3, 5) ORDER BY last_enqueue_time DESC", 1);
        xcd0VarM208113d.bindLong(1, j);
        this.f137929a.assertNotSuspendingTransaction();
        Cursor cursorM99746b = b0c.m99746b(this.f137929a, xcd0VarM208113d, false, null);
        try {
            int iM143765e = jxb.m143765e(cursorM99746b, "id");
            int iM143765e2 = jxb.m143765e(cursorM99746b, "state");
            int iM143765e3 = jxb.m143765e(cursorM99746b, "worker_class_name");
            int iM143765e4 = jxb.m143765e(cursorM99746b, "input_merger_class_name");
            int iM143765e5 = jxb.m143765e(cursorM99746b, "input");
            int iM143765e6 = jxb.m143765e(cursorM99746b, "output");
            int iM143765e7 = jxb.m143765e(cursorM99746b, "initial_delay");
            int iM143765e8 = jxb.m143765e(cursorM99746b, "interval_duration");
            int iM143765e9 = jxb.m143765e(cursorM99746b, "flex_duration");
            int iM143765e10 = jxb.m143765e(cursorM99746b, "run_attempt_count");
            int iM143765e11 = jxb.m143765e(cursorM99746b, "backoff_policy");
            int iM143765e12 = jxb.m143765e(cursorM99746b, "backoff_delay_duration");
            int iM143765e13 = jxb.m143765e(cursorM99746b, "last_enqueue_time");
            int iM143765e14 = jxb.m143765e(cursorM99746b, "minimum_retention_duration");
            xcd0Var = xcd0VarM208113d;
            try {
                int iM143765e15 = jxb.m143765e(cursorM99746b, "schedule_requested_at");
                int iM143765e16 = jxb.m143765e(cursorM99746b, "run_in_foreground");
                int iM143765e17 = jxb.m143765e(cursorM99746b, "out_of_quota_policy");
                int iM143765e18 = jxb.m143765e(cursorM99746b, "period_count");
                int iM143765e19 = jxb.m143765e(cursorM99746b, "generation");
                int iM143765e20 = jxb.m143765e(cursorM99746b, "next_schedule_time_override");
                int iM143765e21 = jxb.m143765e(cursorM99746b, "next_schedule_time_override_generation");
                int iM143765e22 = jxb.m143765e(cursorM99746b, DownloadService.KEY_STOP_REASON);
                int iM143765e23 = jxb.m143765e(cursorM99746b, "trace_tag");
                int iM143765e24 = jxb.m143765e(cursorM99746b, "required_network_type");
                int iM143765e25 = jxb.m143765e(cursorM99746b, "required_network_request");
                int iM143765e26 = jxb.m143765e(cursorM99746b, "requires_charging");
                int iM143765e27 = jxb.m143765e(cursorM99746b, "requires_device_idle");
                int iM143765e28 = jxb.m143765e(cursorM99746b, "requires_battery_not_low");
                int iM143765e29 = jxb.m143765e(cursorM99746b, "requires_storage_not_low");
                int iM143765e30 = jxb.m143765e(cursorM99746b, "trigger_content_update_delay");
                int iM143765e31 = jxb.m143765e(cursorM99746b, "trigger_max_content_delay");
                int iM143765e32 = jxb.m143765e(cursorM99746b, "content_uri_triggers");
                int i = iM143765e14;
                ArrayList arrayList = new ArrayList(cursorM99746b.getCount());
                while (cursorM99746b.moveToNext()) {
                    String string = cursorM99746b.getString(iM143765e);
                    WorkInfo.State stateM187773g = taq0.m187773g(cursorM99746b.getInt(iM143765e2));
                    String string2 = cursorM99746b.getString(iM143765e3);
                    String string3 = cursorM99746b.getString(iM143765e4);
                    Data dataM4314b = Data.m4314b(cursorM99746b.getBlob(iM143765e5));
                    Data dataM4314b2 = Data.m4314b(cursorM99746b.getBlob(iM143765e6));
                    long j2 = cursorM99746b.getLong(iM143765e7);
                    long j3 = cursorM99746b.getLong(iM143765e8);
                    long j4 = cursorM99746b.getLong(iM143765e9);
                    int i2 = cursorM99746b.getInt(iM143765e10);
                    BackoffPolicy backoffPolicyM187770d = taq0.m187770d(cursorM99746b.getInt(iM143765e11));
                    long j5 = cursorM99746b.getLong(iM143765e12);
                    long j6 = cursorM99746b.getLong(iM143765e13);
                    int i3 = i;
                    long j7 = cursorM99746b.getLong(i3);
                    int i4 = iM143765e;
                    int i5 = iM143765e15;
                    long j8 = cursorM99746b.getLong(i5);
                    iM143765e15 = i5;
                    int i6 = iM143765e16;
                    boolean z = cursorM99746b.getInt(i6) != 0;
                    iM143765e16 = i6;
                    int i7 = iM143765e17;
                    OutOfQuotaPolicy outOfQuotaPolicyM187772f = taq0.m187772f(cursorM99746b.getInt(i7));
                    iM143765e17 = i7;
                    int i8 = iM143765e18;
                    int i9 = cursorM99746b.getInt(i8);
                    iM143765e18 = i8;
                    int i10 = iM143765e19;
                    int i11 = cursorM99746b.getInt(i10);
                    iM143765e19 = i10;
                    int i12 = iM143765e20;
                    long j9 = cursorM99746b.getLong(i12);
                    iM143765e20 = i12;
                    int i13 = iM143765e21;
                    int i14 = cursorM99746b.getInt(i13);
                    iM143765e21 = i13;
                    int i15 = iM143765e22;
                    int i16 = cursorM99746b.getInt(i15);
                    iM143765e22 = i15;
                    int i17 = iM143765e23;
                    String string4 = cursorM99746b.isNull(i17) ? null : cursorM99746b.getString(i17);
                    iM143765e23 = i17;
                    int i18 = iM143765e24;
                    NetworkType networkTypeM187771e = taq0.m187771e(cursorM99746b.getInt(i18));
                    iM143765e24 = i18;
                    int i19 = iM143765e25;
                    qc20 qc20VarM187778l = taq0.m187778l(cursorM99746b.getBlob(i19));
                    iM143765e25 = i19;
                    int i20 = iM143765e26;
                    boolean z2 = cursorM99746b.getInt(i20) != 0;
                    iM143765e26 = i20;
                    int i21 = iM143765e27;
                    boolean z3 = cursorM99746b.getInt(i21) != 0;
                    iM143765e27 = i21;
                    int i22 = iM143765e28;
                    boolean z4 = cursorM99746b.getInt(i22) != 0;
                    iM143765e28 = i22;
                    int i23 = iM143765e29;
                    boolean z5 = cursorM99746b.getInt(i23) != 0;
                    iM143765e29 = i23;
                    int i24 = iM143765e30;
                    long j10 = cursorM99746b.getLong(i24);
                    iM143765e30 = i24;
                    int i25 = iM143765e31;
                    long j11 = cursorM99746b.getLong(i25);
                    iM143765e31 = i25;
                    int i26 = iM143765e32;
                    iM143765e32 = i26;
                    arrayList.add(new haq0(string, stateM187773g, string2, string3, dataM4314b, dataM4314b2, j2, j3, j4, new gz5(qc20VarM187778l, networkTypeM187771e, z2, z3, z4, z5, j10, j11, taq0.m187768b(cursorM99746b.getBlob(i26))), i2, backoffPolicyM187770d, j5, j6, j7, j8, z, outOfQuotaPolicyM187772f, i9, i11, j9, i14, i16, string4));
                    iM143765e = i4;
                    i = i3;
                }
                cursorM99746b.close();
                xcd0Var.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorM99746b.close();
                xcd0Var.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            xcd0Var = xcd0VarM208113d;
        }
    }

    @Override // p149l.iaq0
    /* JADX INFO: renamed from: t */
    public List<haq0> mo135188t() throws Throwable {
        xcd0 xcd0Var;
        xcd0 xcd0VarM208113d = xcd0.m208113d("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1", 0);
        this.f137929a.assertNotSuspendingTransaction();
        Cursor cursorM99746b = b0c.m99746b(this.f137929a, xcd0VarM208113d, false, null);
        try {
            int iM143765e = jxb.m143765e(cursorM99746b, "id");
            int iM143765e2 = jxb.m143765e(cursorM99746b, "state");
            int iM143765e3 = jxb.m143765e(cursorM99746b, "worker_class_name");
            int iM143765e4 = jxb.m143765e(cursorM99746b, "input_merger_class_name");
            int iM143765e5 = jxb.m143765e(cursorM99746b, "input");
            int iM143765e6 = jxb.m143765e(cursorM99746b, "output");
            int iM143765e7 = jxb.m143765e(cursorM99746b, "initial_delay");
            int iM143765e8 = jxb.m143765e(cursorM99746b, "interval_duration");
            int iM143765e9 = jxb.m143765e(cursorM99746b, "flex_duration");
            int iM143765e10 = jxb.m143765e(cursorM99746b, "run_attempt_count");
            int iM143765e11 = jxb.m143765e(cursorM99746b, "backoff_policy");
            int iM143765e12 = jxb.m143765e(cursorM99746b, "backoff_delay_duration");
            int iM143765e13 = jxb.m143765e(cursorM99746b, "last_enqueue_time");
            int iM143765e14 = jxb.m143765e(cursorM99746b, "minimum_retention_duration");
            xcd0Var = xcd0VarM208113d;
            try {
                int iM143765e15 = jxb.m143765e(cursorM99746b, "schedule_requested_at");
                int iM143765e16 = jxb.m143765e(cursorM99746b, "run_in_foreground");
                int iM143765e17 = jxb.m143765e(cursorM99746b, "out_of_quota_policy");
                int iM143765e18 = jxb.m143765e(cursorM99746b, "period_count");
                int iM143765e19 = jxb.m143765e(cursorM99746b, "generation");
                int iM143765e20 = jxb.m143765e(cursorM99746b, "next_schedule_time_override");
                int iM143765e21 = jxb.m143765e(cursorM99746b, "next_schedule_time_override_generation");
                int iM143765e22 = jxb.m143765e(cursorM99746b, DownloadService.KEY_STOP_REASON);
                int iM143765e23 = jxb.m143765e(cursorM99746b, "trace_tag");
                int iM143765e24 = jxb.m143765e(cursorM99746b, "required_network_type");
                int iM143765e25 = jxb.m143765e(cursorM99746b, "required_network_request");
                int iM143765e26 = jxb.m143765e(cursorM99746b, "requires_charging");
                int iM143765e27 = jxb.m143765e(cursorM99746b, "requires_device_idle");
                int iM143765e28 = jxb.m143765e(cursorM99746b, "requires_battery_not_low");
                int iM143765e29 = jxb.m143765e(cursorM99746b, "requires_storage_not_low");
                int iM143765e30 = jxb.m143765e(cursorM99746b, "trigger_content_update_delay");
                int iM143765e31 = jxb.m143765e(cursorM99746b, "trigger_max_content_delay");
                int iM143765e32 = jxb.m143765e(cursorM99746b, "content_uri_triggers");
                int i = iM143765e14;
                ArrayList arrayList = new ArrayList(cursorM99746b.getCount());
                while (cursorM99746b.moveToNext()) {
                    String string = cursorM99746b.getString(iM143765e);
                    WorkInfo.State stateM187773g = taq0.m187773g(cursorM99746b.getInt(iM143765e2));
                    String string2 = cursorM99746b.getString(iM143765e3);
                    String string3 = cursorM99746b.getString(iM143765e4);
                    Data dataM4314b = Data.m4314b(cursorM99746b.getBlob(iM143765e5));
                    Data dataM4314b2 = Data.m4314b(cursorM99746b.getBlob(iM143765e6));
                    long j = cursorM99746b.getLong(iM143765e7);
                    long j2 = cursorM99746b.getLong(iM143765e8);
                    long j3 = cursorM99746b.getLong(iM143765e9);
                    int i2 = cursorM99746b.getInt(iM143765e10);
                    BackoffPolicy backoffPolicyM187770d = taq0.m187770d(cursorM99746b.getInt(iM143765e11));
                    long j4 = cursorM99746b.getLong(iM143765e12);
                    long j5 = cursorM99746b.getLong(iM143765e13);
                    int i3 = i;
                    long j6 = cursorM99746b.getLong(i3);
                    int i4 = iM143765e;
                    int i5 = iM143765e15;
                    long j7 = cursorM99746b.getLong(i5);
                    iM143765e15 = i5;
                    int i6 = iM143765e16;
                    boolean z = cursorM99746b.getInt(i6) != 0;
                    iM143765e16 = i6;
                    int i7 = iM143765e17;
                    OutOfQuotaPolicy outOfQuotaPolicyM187772f = taq0.m187772f(cursorM99746b.getInt(i7));
                    iM143765e17 = i7;
                    int i8 = iM143765e18;
                    int i9 = cursorM99746b.getInt(i8);
                    iM143765e18 = i8;
                    int i10 = iM143765e19;
                    int i11 = cursorM99746b.getInt(i10);
                    iM143765e19 = i10;
                    int i12 = iM143765e20;
                    long j8 = cursorM99746b.getLong(i12);
                    iM143765e20 = i12;
                    int i13 = iM143765e21;
                    int i14 = cursorM99746b.getInt(i13);
                    iM143765e21 = i13;
                    int i15 = iM143765e22;
                    int i16 = cursorM99746b.getInt(i15);
                    iM143765e22 = i15;
                    int i17 = iM143765e23;
                    String string4 = cursorM99746b.isNull(i17) ? null : cursorM99746b.getString(i17);
                    iM143765e23 = i17;
                    int i18 = iM143765e24;
                    NetworkType networkTypeM187771e = taq0.m187771e(cursorM99746b.getInt(i18));
                    iM143765e24 = i18;
                    int i19 = iM143765e25;
                    qc20 qc20VarM187778l = taq0.m187778l(cursorM99746b.getBlob(i19));
                    iM143765e25 = i19;
                    int i20 = iM143765e26;
                    boolean z2 = cursorM99746b.getInt(i20) != 0;
                    iM143765e26 = i20;
                    int i21 = iM143765e27;
                    boolean z3 = cursorM99746b.getInt(i21) != 0;
                    iM143765e27 = i21;
                    int i22 = iM143765e28;
                    boolean z4 = cursorM99746b.getInt(i22) != 0;
                    iM143765e28 = i22;
                    int i23 = iM143765e29;
                    boolean z5 = cursorM99746b.getInt(i23) != 0;
                    iM143765e29 = i23;
                    int i24 = iM143765e30;
                    long j9 = cursorM99746b.getLong(i24);
                    iM143765e30 = i24;
                    int i25 = iM143765e31;
                    long j10 = cursorM99746b.getLong(i25);
                    iM143765e31 = i25;
                    int i26 = iM143765e32;
                    iM143765e32 = i26;
                    arrayList.add(new haq0(string, stateM187773g, string2, string3, dataM4314b, dataM4314b2, j, j2, j3, new gz5(qc20VarM187778l, networkTypeM187771e, z2, z3, z4, z5, j9, j10, taq0.m187768b(cursorM99746b.getBlob(i26))), i2, backoffPolicyM187770d, j4, j5, j6, j7, z, outOfQuotaPolicyM187772f, i9, i11, j8, i14, i16, string4));
                    iM143765e = i4;
                    i = i3;
                }
                cursorM99746b.close();
                xcd0Var.release();
                return arrayList;
            } catch (Throwable th) {
                th = th;
                cursorM99746b.close();
                xcd0Var.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            xcd0Var = xcd0VarM208113d;
        }
    }

    @Override // p149l.iaq0
    /* JADX INFO: renamed from: u */
    public haq0.C17256c mo135189u(String str) {
        xcd0 xcd0VarM208113d = xcd0.m208113d("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id=?", 1);
        xcd0VarM208113d.bindString(1, str);
        this.f137929a.assertNotSuspendingTransaction();
        this.f137929a.beginTransaction();
        try {
            haq0.C17256c c17256c = null;
            Cursor cursorM99746b = b0c.m99746b(this.f137929a, xcd0VarM208113d, true, null);
            try {
                HashMap<String, ArrayList<String>> map = new HashMap<>();
                HashMap<String, ArrayList<Data>> map2 = new HashMap<>();
                while (cursorM99746b.moveToNext()) {
                    String string = cursorM99746b.getString(0);
                    if (!map.containsKey(string)) {
                        map.put(string, new ArrayList<>());
                    }
                    String string2 = cursorM99746b.getString(0);
                    if (!map2.containsKey(string2)) {
                        map2.put(string2, new ArrayList<>());
                    }
                }
                cursorM99746b.moveToPosition(-1);
                m158705K(map);
                m158704J(map2);
                if (cursorM99746b.moveToFirst()) {
                    String string3 = cursorM99746b.getString(0);
                    WorkInfo.State stateM187773g = taq0.m187773g(cursorM99746b.getInt(1));
                    Data dataM4314b = Data.m4314b(cursorM99746b.getBlob(2));
                    int i = cursorM99746b.getInt(3);
                    int i2 = cursorM99746b.getInt(4);
                    c17256c = new haq0.C17256c(string3, stateM187773g, dataM4314b, cursorM99746b.getLong(14), cursorM99746b.getLong(15), cursorM99746b.getLong(16), new gz5(taq0.m187778l(cursorM99746b.getBlob(6)), taq0.m187771e(cursorM99746b.getInt(5)), cursorM99746b.getInt(7) != 0, cursorM99746b.getInt(8) != 0, cursorM99746b.getInt(9) != 0, cursorM99746b.getInt(10) != 0, cursorM99746b.getLong(11), cursorM99746b.getLong(12), taq0.m187768b(cursorM99746b.getBlob(13))), i, taq0.m187770d(cursorM99746b.getInt(17)), cursorM99746b.getLong(18), cursorM99746b.getLong(19), cursorM99746b.getInt(20), i2, cursorM99746b.getLong(21), cursorM99746b.getInt(22), map.get(cursorM99746b.getString(0)), map2.get(cursorM99746b.getString(0)));
                }
                this.f137929a.setTransactionSuccessful();
                cursorM99746b.close();
                xcd0VarM208113d.release();
                this.f137929a.endTransaction();
                return c17256c;
            } catch (Throwable th) {
                cursorM99746b.close();
                xcd0VarM208113d.release();
                throw th;
            }
        } catch (Throwable th2) {
            this.f137929a.endTransaction();
            throw th2;
        }
    }

    @Override // p149l.iaq0
    /* JADX INFO: renamed from: v */
    public haq0 mo135190v(String str) throws Throwable {
        xcd0 xcd0Var;
        haq0 haq0Var;
        xcd0 xcd0VarM208113d = xcd0.m208113d("SELECT * FROM workspec WHERE id=?", 1);
        xcd0VarM208113d.bindString(1, str);
        this.f137929a.assertNotSuspendingTransaction();
        Cursor cursorM99746b = b0c.m99746b(this.f137929a, xcd0VarM208113d, false, null);
        try {
            int iM143765e = jxb.m143765e(cursorM99746b, "id");
            int iM143765e2 = jxb.m143765e(cursorM99746b, "state");
            int iM143765e3 = jxb.m143765e(cursorM99746b, "worker_class_name");
            int iM143765e4 = jxb.m143765e(cursorM99746b, "input_merger_class_name");
            int iM143765e5 = jxb.m143765e(cursorM99746b, "input");
            int iM143765e6 = jxb.m143765e(cursorM99746b, "output");
            int iM143765e7 = jxb.m143765e(cursorM99746b, "initial_delay");
            int iM143765e8 = jxb.m143765e(cursorM99746b, "interval_duration");
            int iM143765e9 = jxb.m143765e(cursorM99746b, "flex_duration");
            int iM143765e10 = jxb.m143765e(cursorM99746b, "run_attempt_count");
            int iM143765e11 = jxb.m143765e(cursorM99746b, "backoff_policy");
            int iM143765e12 = jxb.m143765e(cursorM99746b, "backoff_delay_duration");
            int iM143765e13 = jxb.m143765e(cursorM99746b, "last_enqueue_time");
            int iM143765e14 = jxb.m143765e(cursorM99746b, "minimum_retention_duration");
            xcd0Var = xcd0VarM208113d;
            try {
                int iM143765e15 = jxb.m143765e(cursorM99746b, "schedule_requested_at");
                int iM143765e16 = jxb.m143765e(cursorM99746b, "run_in_foreground");
                int iM143765e17 = jxb.m143765e(cursorM99746b, "out_of_quota_policy");
                int iM143765e18 = jxb.m143765e(cursorM99746b, "period_count");
                int iM143765e19 = jxb.m143765e(cursorM99746b, "generation");
                int iM143765e20 = jxb.m143765e(cursorM99746b, "next_schedule_time_override");
                int iM143765e21 = jxb.m143765e(cursorM99746b, "next_schedule_time_override_generation");
                int iM143765e22 = jxb.m143765e(cursorM99746b, DownloadService.KEY_STOP_REASON);
                int iM143765e23 = jxb.m143765e(cursorM99746b, "trace_tag");
                int iM143765e24 = jxb.m143765e(cursorM99746b, "required_network_type");
                int iM143765e25 = jxb.m143765e(cursorM99746b, "required_network_request");
                int iM143765e26 = jxb.m143765e(cursorM99746b, "requires_charging");
                int iM143765e27 = jxb.m143765e(cursorM99746b, "requires_device_idle");
                int iM143765e28 = jxb.m143765e(cursorM99746b, "requires_battery_not_low");
                int iM143765e29 = jxb.m143765e(cursorM99746b, "requires_storage_not_low");
                int iM143765e30 = jxb.m143765e(cursorM99746b, "trigger_content_update_delay");
                int iM143765e31 = jxb.m143765e(cursorM99746b, "trigger_max_content_delay");
                int iM143765e32 = jxb.m143765e(cursorM99746b, "content_uri_triggers");
                if (cursorM99746b.moveToFirst()) {
                    haq0Var = new haq0(cursorM99746b.getString(iM143765e), taq0.m187773g(cursorM99746b.getInt(iM143765e2)), cursorM99746b.getString(iM143765e3), cursorM99746b.getString(iM143765e4), Data.m4314b(cursorM99746b.getBlob(iM143765e5)), Data.m4314b(cursorM99746b.getBlob(iM143765e6)), cursorM99746b.getLong(iM143765e7), cursorM99746b.getLong(iM143765e8), cursorM99746b.getLong(iM143765e9), new gz5(taq0.m187778l(cursorM99746b.getBlob(iM143765e25)), taq0.m187771e(cursorM99746b.getInt(iM143765e24)), cursorM99746b.getInt(iM143765e26) != 0, cursorM99746b.getInt(iM143765e27) != 0, cursorM99746b.getInt(iM143765e28) != 0, cursorM99746b.getInt(iM143765e29) != 0, cursorM99746b.getLong(iM143765e30), cursorM99746b.getLong(iM143765e31), taq0.m187768b(cursorM99746b.getBlob(iM143765e32))), cursorM99746b.getInt(iM143765e10), taq0.m187770d(cursorM99746b.getInt(iM143765e11)), cursorM99746b.getLong(iM143765e12), cursorM99746b.getLong(iM143765e13), cursorM99746b.getLong(iM143765e14), cursorM99746b.getLong(iM143765e15), cursorM99746b.getInt(iM143765e16) != 0, taq0.m187772f(cursorM99746b.getInt(iM143765e17)), cursorM99746b.getInt(iM143765e18), cursorM99746b.getInt(iM143765e19), cursorM99746b.getLong(iM143765e20), cursorM99746b.getInt(iM143765e21), cursorM99746b.getInt(iM143765e22), cursorM99746b.isNull(iM143765e23) ? null : cursorM99746b.getString(iM143765e23));
                } else {
                    haq0Var = null;
                }
                cursorM99746b.close();
                xcd0Var.release();
                return haq0Var;
            } catch (Throwable th) {
                th = th;
                cursorM99746b.close();
                xcd0Var.release();
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            xcd0Var = xcd0VarM208113d;
        }
    }

    @Override // p149l.iaq0
    /* JADX INFO: renamed from: w */
    public int mo135191w() {
        this.f137929a.assertNotSuspendingTransaction();
        jzg0 jzg0VarM3929b = this.f137943o.m3929b();
        try {
            this.f137929a.beginTransaction();
            try {
                int iExecuteUpdateDelete = jzg0VarM3929b.executeUpdateDelete();
                this.f137929a.setTransactionSuccessful();
                this.f137929a.endTransaction();
                this.f137943o.m3935h(jzg0VarM3929b);
                return iExecuteUpdateDelete;
            } catch (Throwable th) {
                this.f137929a.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            this.f137943o.m3935h(jzg0VarM3929b);
            throw th2;
        }
    }

    @Override // p149l.iaq0
    /* JADX INFO: renamed from: x */
    public void mo135192x(haq0 haq0Var) {
        this.f137929a.assertNotSuspendingTransaction();
        this.f137929a.beginTransaction();
        try {
            this.f137931c.m162239j(haq0Var);
            this.f137929a.setTransactionSuccessful();
        } finally {
            this.f137929a.endTransaction();
        }
    }

    @Override // p149l.iaq0
    /* JADX INFO: renamed from: y */
    public int mo135193y(String str, long j) {
        this.f137929a.assertNotSuspendingTransaction();
        jzg0 jzg0VarM3929b = this.f137942n.m3929b();
        jzg0VarM3929b.bindLong(1, j);
        jzg0VarM3929b.bindString(2, str);
        try {
            this.f137929a.beginTransaction();
            try {
                int iExecuteUpdateDelete = jzg0VarM3929b.executeUpdateDelete();
                this.f137929a.setTransactionSuccessful();
                this.f137929a.endTransaction();
                this.f137942n.m3935h(jzg0VarM3929b);
                return iExecuteUpdateDelete;
            } catch (Throwable th) {
                this.f137929a.endTransaction();
                throw th;
            }
        } catch (Throwable th2) {
            this.f137942n.m3935h(jzg0VarM3929b);
            throw th2;
        }
    }

    @Override // p149l.iaq0
    /* JADX INFO: renamed from: z */
    public List<haq0.C17255b> mo135194z(String str) {
        xcd0 xcd0VarM208113d = xcd0.m208113d("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)", 1);
        xcd0VarM208113d.bindString(1, str);
        this.f137929a.assertNotSuspendingTransaction();
        Cursor cursorM99746b = b0c.m99746b(this.f137929a, xcd0VarM208113d, false, null);
        try {
            ArrayList arrayList = new ArrayList(cursorM99746b.getCount());
            while (cursorM99746b.moveToNext()) {
                arrayList.add(new haq0.C17255b(cursorM99746b.getString(0), taq0.m187773g(cursorM99746b.getInt(1))));
            }
            cursorM99746b.close();
            xcd0VarM208113d.release();
            return arrayList;
        } catch (Throwable th) {
            cursorM99746b.close();
            xcd0VarM208113d.release();
            throw th;
        }
    }
}
