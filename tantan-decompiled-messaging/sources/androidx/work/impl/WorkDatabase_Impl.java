package androidx.work.impl;

import androidx.annotation.NonNull;
import androidx.room.C0665b;
import androidx.room.C0668e;
import androidx.room.C0672i;
import androidx.room.RoomDatabase;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.google.android.exoplayer2.offline.DownloadService;
import com.p046p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p149l.a9q0;
import p149l.aaq0;
import p149l.b0c;
import p149l.b9q0;
import p149l.bhh0;
import p149l.c9q0;
import p149l.chh0;
import p149l.d9q0;
import p149l.drh0;
import p149l.e9q0;
import p149l.f9q0;
import p149l.fzg0;
import p149l.g9q0;
import p149l.gzg0;
import p149l.h9q0;
import p149l.iaq0;
import p149l.naq0;
import p149l.ndc0;
import p149l.qaq0;
import p149l.qdc0;
import p149l.raq0;
import p149l.th80;
import p149l.uh80;
import p149l.ui1;
import p149l.w9q0;
import p149l.x100;
import p149l.x9q0;
import p149l.ytd;
import p149l.z9q0;
import p149l.ztd;

/* JADX INFO: loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {
    private volatile ytd _dependencyDao;
    private volatile th80 _preferenceDao;
    private volatile ndc0 _rawWorkInfoDao;
    private volatile bhh0 _systemIdInfoDao;
    private volatile w9q0 _workNameDao;
    private volatile z9q0 _workProgressDao;
    private volatile iaq0 _workSpecDao;
    private volatile qaq0 _workTagDao;

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.assertNotMainThread();
        fzg0 fzg0VarMo3891C = super.getOpenHelper().mo3891C();
        try {
            super.beginTransaction();
            fzg0VarMo3891C.execSQL("PRAGMA defer_foreign_keys = TRUE");
            fzg0VarMo3891C.execSQL("DELETE FROM `Dependency`");
            fzg0VarMo3891C.execSQL("DELETE FROM `WorkSpec`");
            fzg0VarMo3891C.execSQL("DELETE FROM `WorkTag`");
            fzg0VarMo3891C.execSQL("DELETE FROM `SystemIdInfo`");
            fzg0VarMo3891C.execSQL("DELETE FROM `WorkName`");
            fzg0VarMo3891C.execSQL("DELETE FROM `WorkProgress`");
            fzg0VarMo3891C.execSQL("DELETE FROM `Preference`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            fzg0VarMo3891C.query("PRAGMA wal_checkpoint(FULL)").close();
            if (!fzg0VarMo3891C.inTransaction()) {
                fzg0VarMo3891C.execSQL("VACUUM");
            }
        }
    }

    @Override // androidx.room.RoomDatabase
    @NonNull
    public C0668e createInvalidationTracker() {
        return new C0668e(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // androidx.room.RoomDatabase
    @NonNull
    public gzg0 createOpenHelper(@NonNull C0665b c0665b) {
        return c0665b.sqliteOpenHelperFactory.mo112331a(gzg0.C17209b.m128861a(c0665b.context).m128865d(c0665b.com.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String).m128864c(new C0672i(c0665b, new C0770a(23), "86254750241babac4b8d52996a675549", "1cbd3130fa23b59692c061c594c16cc0")).m128863b());
    }

    @Override // androidx.work.impl.WorkDatabase
    public ytd dependencyDao() {
        ytd ytdVar;
        if (this._dependencyDao != null) {
            return this._dependencyDao;
        }
        synchronized (this) {
            try {
                if (this._dependencyDao == null) {
                    this._dependencyDao = new ztd(this);
                }
                ytdVar = this._dependencyDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ytdVar;
    }

    @Override // androidx.room.RoomDatabase
    @NonNull
    public List<x100> getAutoMigrations(@NonNull Map<Class<? extends ui1>, ui1> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new a9q0());
        arrayList.add(new b9q0());
        arrayList.add(new c9q0());
        arrayList.add(new d9q0());
        arrayList.add(new e9q0());
        arrayList.add(new f9q0());
        arrayList.add(new g9q0());
        arrayList.add(new h9q0());
        return arrayList;
    }

    @Override // androidx.room.RoomDatabase
    @NonNull
    public Set<Class<? extends ui1>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    @NonNull
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(iaq0.class, naq0.m158703M());
        map.put(ytd.class, ztd.m220122e());
        map.put(qaq0.class, raq0.m178531e());
        map.put(bhh0.class, chh0.m106878h());
        map.put(w9q0.class, x9q0.m207509c());
        map.put(z9q0.class, aaq0.m95566c());
        map.put(th80.class, uh80.m193702c());
        map.put(ndc0.class, qdc0.m174011f());
        return map;
    }

    @Override // androidx.work.impl.WorkDatabase
    public th80 preferenceDao() {
        th80 th80Var;
        if (this._preferenceDao != null) {
            return this._preferenceDao;
        }
        synchronized (this) {
            try {
                if (this._preferenceDao == null) {
                    this._preferenceDao = new uh80(this);
                }
                th80Var = this._preferenceDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return th80Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public ndc0 rawWorkInfoDao() {
        ndc0 ndc0Var;
        if (this._rawWorkInfoDao != null) {
            return this._rawWorkInfoDao;
        }
        synchronized (this) {
            try {
                if (this._rawWorkInfoDao == null) {
                    this._rawWorkInfoDao = new qdc0(this);
                }
                ndc0Var = this._rawWorkInfoDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ndc0Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public bhh0 systemIdInfoDao() {
        bhh0 bhh0Var;
        if (this._systemIdInfoDao != null) {
            return this._systemIdInfoDao;
        }
        synchronized (this) {
            try {
                if (this._systemIdInfoDao == null) {
                    this._systemIdInfoDao = new chh0(this);
                }
                bhh0Var = this._systemIdInfoDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bhh0Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public w9q0 workNameDao() {
        w9q0 w9q0Var;
        if (this._workNameDao != null) {
            return this._workNameDao;
        }
        synchronized (this) {
            try {
                if (this._workNameDao == null) {
                    this._workNameDao = new x9q0(this);
                }
                w9q0Var = this._workNameDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return w9q0Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public z9q0 workProgressDao() {
        z9q0 z9q0Var;
        if (this._workProgressDao != null) {
            return this._workProgressDao;
        }
        synchronized (this) {
            try {
                if (this._workProgressDao == null) {
                    this._workProgressDao = new aaq0(this);
                }
                z9q0Var = this._workProgressDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z9q0Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public iaq0 workSpecDao() {
        iaq0 iaq0Var;
        if (this._workSpecDao != null) {
            return this._workSpecDao;
        }
        synchronized (this) {
            try {
                if (this._workSpecDao == null) {
                    this._workSpecDao = new naq0(this);
                }
                iaq0Var = this._workSpecDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iaq0Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public qaq0 workTagDao() {
        qaq0 qaq0Var;
        if (this._workTagDao != null) {
            return this._workTagDao;
        }
        synchronized (this) {
            try {
                if (this._workTagDao == null) {
                    this._workTagDao = new raq0(this);
                }
                qaq0Var = this._workTagDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return qaq0Var;
    }

    /* JADX INFO: renamed from: androidx.work.impl.WorkDatabase_Impl$a */
    public class C0770a extends C0672i.b {
        public C0770a(int i) {
            super(i);
        }

        @Override // androidx.room.C0672i.b
        /* JADX INFO: renamed from: a */
        public void mo4005a(@NonNull fzg0 fzg0Var) {
            fzg0Var.execSQL("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            fzg0Var.execSQL("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            fzg0Var.execSQL("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            fzg0Var.execSQL("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x'', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
            fzg0Var.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            fzg0Var.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
            fzg0Var.execSQL("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            fzg0Var.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            fzg0Var.execSQL("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            fzg0Var.execSQL("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            fzg0Var.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            fzg0Var.execSQL("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            fzg0Var.execSQL("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            fzg0Var.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            fzg0Var.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '86254750241babac4b8d52996a675549')");
        }

        @Override // androidx.room.C0672i.b
        /* JADX INFO: renamed from: b */
        public void mo4006b(@NonNull fzg0 fzg0Var) {
            fzg0Var.execSQL("DROP TABLE IF EXISTS `Dependency`");
            fzg0Var.execSQL("DROP TABLE IF EXISTS `WorkSpec`");
            fzg0Var.execSQL("DROP TABLE IF EXISTS `WorkTag`");
            fzg0Var.execSQL("DROP TABLE IF EXISTS `SystemIdInfo`");
            fzg0Var.execSQL("DROP TABLE IF EXISTS `WorkName`");
            fzg0Var.execSQL("DROP TABLE IF EXISTS `WorkProgress`");
            fzg0Var.execSQL("DROP TABLE IF EXISTS `Preference`");
            List list = ((RoomDatabase) WorkDatabase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((RoomDatabase.AbstractC0656b) it.next()).m3919b(fzg0Var);
                }
            }
        }

        @Override // androidx.room.C0672i.b
        /* JADX INFO: renamed from: c */
        public void mo4007c(@NonNull fzg0 fzg0Var) {
            List list = ((RoomDatabase) WorkDatabase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((RoomDatabase.AbstractC0656b) it.next()).m3918a(fzg0Var);
                }
            }
        }

        @Override // androidx.room.C0672i.b
        /* JADX INFO: renamed from: d */
        public void mo4008d(@NonNull fzg0 fzg0Var) {
            ((RoomDatabase) WorkDatabase_Impl.this).mDatabase = fzg0Var;
            fzg0Var.execSQL("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.internalInitInvalidationTracker(fzg0Var);
            List list = ((RoomDatabase) WorkDatabase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((RoomDatabase.AbstractC0656b) it.next()).mo3920c(fzg0Var);
                }
            }
        }

        @Override // androidx.room.C0672i.b
        /* JADX INFO: renamed from: f */
        public void mo4010f(@NonNull fzg0 fzg0Var) {
            b0c.m99745a(fzg0Var);
        }

        @Override // androidx.room.C0672i.b
        @NonNull
        /* JADX INFO: renamed from: g */
        public C0672i.c mo4011g(@NonNull fzg0 fzg0Var) {
            HashMap map = new HashMap(2);
            map.put("work_spec_id", new drh0.C16451a("work_spec_id", "TEXT", true, 1, null, 1));
            map.put("prerequisite_id", new drh0.C16451a("prerequisite_id", "TEXT", true, 2, null, 1));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new drh0.C16453c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            hashSet.add(new drh0.C16453c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new drh0.C16455e("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            hashSet2.add(new drh0.C16455e("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id"), Arrays.asList("ASC")));
            drh0 drh0Var = new drh0("Dependency", map, hashSet, hashSet2);
            drh0 drh0VarM113297a = drh0.m113297a(fzg0Var, "Dependency");
            if (!drh0Var.equals(drh0VarM113297a)) {
                return new C0672i.c(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + drh0Var + "\n Found:\n" + drh0VarM113297a);
            }
            HashMap map2 = new HashMap(32);
            map2.put("id", new drh0.C16451a("id", "TEXT", true, 1, null, 1));
            map2.put("state", new drh0.C16451a("state", "INTEGER", true, 0, null, 1));
            map2.put("worker_class_name", new drh0.C16451a("worker_class_name", "TEXT", true, 0, null, 1));
            map2.put("input_merger_class_name", new drh0.C16451a("input_merger_class_name", "TEXT", true, 0, null, 1));
            map2.put("input", new drh0.C16451a("input", "BLOB", true, 0, null, 1));
            map2.put("output", new drh0.C16451a("output", "BLOB", true, 0, null, 1));
            map2.put("initial_delay", new drh0.C16451a("initial_delay", "INTEGER", true, 0, null, 1));
            map2.put("interval_duration", new drh0.C16451a("interval_duration", "INTEGER", true, 0, null, 1));
            map2.put("flex_duration", new drh0.C16451a("flex_duration", "INTEGER", true, 0, null, 1));
            map2.put("run_attempt_count", new drh0.C16451a("run_attempt_count", "INTEGER", true, 0, null, 1));
            map2.put("backoff_policy", new drh0.C16451a("backoff_policy", "INTEGER", true, 0, null, 1));
            map2.put("backoff_delay_duration", new drh0.C16451a("backoff_delay_duration", "INTEGER", true, 0, null, 1));
            map2.put("last_enqueue_time", new drh0.C16451a("last_enqueue_time", "INTEGER", true, 0, User.ID_TEAM_ACCOUNT, 1));
            map2.put("minimum_retention_duration", new drh0.C16451a("minimum_retention_duration", "INTEGER", true, 0, null, 1));
            map2.put("schedule_requested_at", new drh0.C16451a("schedule_requested_at", "INTEGER", true, 0, null, 1));
            map2.put("run_in_foreground", new drh0.C16451a("run_in_foreground", "INTEGER", true, 0, null, 1));
            map2.put("out_of_quota_policy", new drh0.C16451a("out_of_quota_policy", "INTEGER", true, 0, null, 1));
            map2.put("period_count", new drh0.C16451a("period_count", "INTEGER", true, 0, "0", 1));
            map2.put("generation", new drh0.C16451a("generation", "INTEGER", true, 0, "0", 1));
            map2.put("next_schedule_time_override", new drh0.C16451a("next_schedule_time_override", "INTEGER", true, 0, "9223372036854775807", 1));
            map2.put("next_schedule_time_override_generation", new drh0.C16451a("next_schedule_time_override_generation", "INTEGER", true, 0, "0", 1));
            map2.put(DownloadService.KEY_STOP_REASON, new drh0.C16451a(DownloadService.KEY_STOP_REASON, "INTEGER", true, 0, "-256", 1));
            map2.put("trace_tag", new drh0.C16451a("trace_tag", "TEXT", false, 0, null, 1));
            map2.put("required_network_type", new drh0.C16451a("required_network_type", "INTEGER", true, 0, null, 1));
            map2.put("required_network_request", new drh0.C16451a("required_network_request", "BLOB", true, 0, "x''", 1));
            map2.put("requires_charging", new drh0.C16451a("requires_charging", "INTEGER", true, 0, null, 1));
            map2.put("requires_device_idle", new drh0.C16451a("requires_device_idle", "INTEGER", true, 0, null, 1));
            map2.put("requires_battery_not_low", new drh0.C16451a("requires_battery_not_low", "INTEGER", true, 0, null, 1));
            map2.put("requires_storage_not_low", new drh0.C16451a("requires_storage_not_low", "INTEGER", true, 0, null, 1));
            map2.put("trigger_content_update_delay", new drh0.C16451a("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
            map2.put("trigger_max_content_delay", new drh0.C16451a("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
            map2.put("content_uri_triggers", new drh0.C16451a("content_uri_triggers", "BLOB", true, 0, null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new drh0.C16455e("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at"), Arrays.asList("ASC")));
            hashSet4.add(new drh0.C16455e("index_WorkSpec_last_enqueue_time", false, Arrays.asList("last_enqueue_time"), Arrays.asList("ASC")));
            drh0 drh0Var2 = new drh0("WorkSpec", map2, hashSet3, hashSet4);
            drh0 drh0VarM113297a2 = drh0.m113297a(fzg0Var, "WorkSpec");
            if (!drh0Var2.equals(drh0VarM113297a2)) {
                return new C0672i.c(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + drh0Var2 + "\n Found:\n" + drh0VarM113297a2);
            }
            HashMap map3 = new HashMap(2);
            map3.put("tag", new drh0.C16451a("tag", "TEXT", true, 1, null, 1));
            map3.put("work_spec_id", new drh0.C16451a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new drh0.C16453c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new drh0.C16455e("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            drh0 drh0Var3 = new drh0("WorkTag", map3, hashSet5, hashSet6);
            drh0 drh0VarM113297a3 = drh0.m113297a(fzg0Var, "WorkTag");
            if (!drh0Var3.equals(drh0VarM113297a3)) {
                return new C0672i.c(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + drh0Var3 + "\n Found:\n" + drh0VarM113297a3);
            }
            HashMap map4 = new HashMap(3);
            map4.put("work_spec_id", new drh0.C16451a("work_spec_id", "TEXT", true, 1, null, 1));
            map4.put("generation", new drh0.C16451a("generation", "INTEGER", true, 2, "0", 1));
            map4.put("system_id", new drh0.C16451a("system_id", "INTEGER", true, 0, null, 1));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new drh0.C16453c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            drh0 drh0Var4 = new drh0("SystemIdInfo", map4, hashSet7, new HashSet(0));
            drh0 drh0VarM113297a4 = drh0.m113297a(fzg0Var, "SystemIdInfo");
            if (!drh0Var4.equals(drh0VarM113297a4)) {
                return new C0672i.c(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + drh0Var4 + "\n Found:\n" + drh0VarM113297a4);
            }
            HashMap map5 = new HashMap(2);
            map5.put(AuthenticationTokenClaims.JSON_KEY_NAME, new drh0.C16451a(AuthenticationTokenClaims.JSON_KEY_NAME, "TEXT", true, 1, null, 1));
            map5.put("work_spec_id", new drh0.C16451a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new drh0.C16453c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new drh0.C16455e("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            drh0 drh0Var5 = new drh0("WorkName", map5, hashSet8, hashSet9);
            drh0 drh0VarM113297a5 = drh0.m113297a(fzg0Var, "WorkName");
            if (!drh0Var5.equals(drh0VarM113297a5)) {
                return new C0672i.c(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + drh0Var5 + "\n Found:\n" + drh0VarM113297a5);
            }
            HashMap map6 = new HashMap(2);
            map6.put("work_spec_id", new drh0.C16451a("work_spec_id", "TEXT", true, 1, null, 1));
            map6.put("progress", new drh0.C16451a("progress", "BLOB", true, 0, null, 1));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new drh0.C16453c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            drh0 drh0Var6 = new drh0("WorkProgress", map6, hashSet10, new HashSet(0));
            drh0 drh0VarM113297a6 = drh0.m113297a(fzg0Var, "WorkProgress");
            if (!drh0Var6.equals(drh0VarM113297a6)) {
                return new C0672i.c(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + drh0Var6 + "\n Found:\n" + drh0VarM113297a6);
            }
            HashMap map7 = new HashMap(2);
            map7.put(Constants.KEY_KEY, new drh0.C16451a(Constants.KEY_KEY, "TEXT", true, 1, null, 1));
            map7.put("long_value", new drh0.C16451a("long_value", "INTEGER", false, 0, null, 1));
            drh0 drh0Var7 = new drh0("Preference", map7, new HashSet(0), new HashSet(0));
            drh0 drh0VarM113297a7 = drh0.m113297a(fzg0Var, "Preference");
            if (drh0Var7.equals(drh0VarM113297a7)) {
                return new C0672i.c(true, null);
            }
            return new C0672i.c(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + drh0Var7 + "\n Found:\n" + drh0VarM113297a7);
        }

        @Override // androidx.room.C0672i.b
        /* JADX INFO: renamed from: e */
        public void mo4009e(@NonNull fzg0 fzg0Var) {
        }
    }
}
