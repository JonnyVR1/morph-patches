package androidx.work.impl;

import androidx.annotation.NonNull;
import androidx.room.C0667b;
import androidx.room.C0670e;
import androidx.room.C0674i;
import androidx.room.RoomDatabase;
import com.clevertap.android.sdk.Constants;
import com.facebook.AuthenticationTokenClaims;
import com.google.android.exoplayer2.offline.DownloadService;
import com.p051p1.mobile.putong.data.User;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import p153l.bj1;
import p153l.bjq0;
import p153l.cjq0;
import p153l.ejq0;
import p153l.fiq0;
import p153l.fjq0;
import p153l.giq0;
import p153l.hiq0;
import p153l.iiq0;
import p153l.iph0;
import p153l.jiq0;
import p153l.jph0;
import p153l.kiq0;
import p153l.liq0;
import p153l.lzh0;
import p153l.miq0;
import p153l.mvd;
import p153l.n7h0;
import p153l.njq0;
import p153l.nvd;
import p153l.o1c;
import p153l.o7h0;
import p153l.sjq0;
import p153l.ua00;
import p153l.ulc0;
import p153l.vjq0;
import p153l.wjq0;
import p153l.xlc0;
import p153l.yp80;
import p153l.zp80;

/* JADX INFO: loaded from: classes.dex */
public final class WorkDatabase_Impl extends WorkDatabase {
    private volatile mvd _dependencyDao;
    private volatile yp80 _preferenceDao;
    private volatile ulc0 _rawWorkInfoDao;
    private volatile iph0 _systemIdInfoDao;
    private volatile bjq0 _workNameDao;
    private volatile ejq0 _workProgressDao;
    private volatile njq0 _workSpecDao;
    private volatile vjq0 _workTagDao;

    @Override // androidx.room.RoomDatabase
    public void clearAllTables() {
        super.assertNotMainThread();
        n7h0 n7h0VarMo3892C = super.getOpenHelper().mo3892C();
        try {
            super.beginTransaction();
            n7h0VarMo3892C.execSQL("PRAGMA defer_foreign_keys = TRUE");
            n7h0VarMo3892C.execSQL("DELETE FROM `Dependency`");
            n7h0VarMo3892C.execSQL("DELETE FROM `WorkSpec`");
            n7h0VarMo3892C.execSQL("DELETE FROM `WorkTag`");
            n7h0VarMo3892C.execSQL("DELETE FROM `SystemIdInfo`");
            n7h0VarMo3892C.execSQL("DELETE FROM `WorkName`");
            n7h0VarMo3892C.execSQL("DELETE FROM `WorkProgress`");
            n7h0VarMo3892C.execSQL("DELETE FROM `Preference`");
            super.setTransactionSuccessful();
        } finally {
            super.endTransaction();
            n7h0VarMo3892C.query("PRAGMA wal_checkpoint(FULL)").close();
            if (!n7h0VarMo3892C.inTransaction()) {
                n7h0VarMo3892C.execSQL("VACUUM");
            }
        }
    }

    @Override // androidx.room.RoomDatabase
    @NonNull
    public C0670e createInvalidationTracker() {
        return new C0670e(this, new HashMap(0), new HashMap(0), "Dependency", "WorkSpec", "WorkTag", "SystemIdInfo", "WorkName", "WorkProgress", "Preference");
    }

    @Override // androidx.room.RoomDatabase
    @NonNull
    public o7h0 createOpenHelper(@NonNull C0667b c0667b) {
        return c0667b.sqliteOpenHelperFactory.mo104496a(o7h0.C19044b.m166340a(c0667b.context).m166344d(c0667b.com.facebook.AuthenticationTokenClaims.JSON_KEY_NAME java.lang.String).m166343c(new C0674i(c0667b, new C0772a(23), "86254750241babac4b8d52996a675549", "1cbd3130fa23b59692c061c594c16cc0")).m166342b());
    }

    @Override // androidx.work.impl.WorkDatabase
    public mvd dependencyDao() {
        mvd mvdVar;
        if (this._dependencyDao != null) {
            return this._dependencyDao;
        }
        synchronized (this) {
            try {
                if (this._dependencyDao == null) {
                    this._dependencyDao = new nvd(this);
                }
                mvdVar = this._dependencyDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return mvdVar;
    }

    @Override // androidx.room.RoomDatabase
    @NonNull
    public List<ua00> getAutoMigrations(@NonNull Map<Class<? extends bj1>, bj1> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new fiq0());
        arrayList.add(new giq0());
        arrayList.add(new hiq0());
        arrayList.add(new iiq0());
        arrayList.add(new jiq0());
        arrayList.add(new kiq0());
        arrayList.add(new liq0());
        arrayList.add(new miq0());
        return arrayList;
    }

    @Override // androidx.room.RoomDatabase
    @NonNull
    public Set<Class<? extends bj1>> getRequiredAutoMigrationSpecs() {
        return new HashSet();
    }

    @Override // androidx.room.RoomDatabase
    @NonNull
    public Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        HashMap map = new HashMap();
        map.put(njq0.class, sjq0.m186300M());
        map.put(mvd.class, nvd.m164870e());
        map.put(vjq0.class, wjq0.m206730e());
        map.put(iph0.class, jph0.m146500h());
        map.put(bjq0.class, cjq0.m110276c());
        map.put(ejq0.class, fjq0.m125864c());
        map.put(yp80.class, zp80.m220823c());
        map.put(ulc0.class, xlc0.m211608f());
        return map;
    }

    @Override // androidx.work.impl.WorkDatabase
    public yp80 preferenceDao() {
        yp80 yp80Var;
        if (this._preferenceDao != null) {
            return this._preferenceDao;
        }
        synchronized (this) {
            try {
                if (this._preferenceDao == null) {
                    this._preferenceDao = new zp80(this);
                }
                yp80Var = this._preferenceDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return yp80Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public ulc0 rawWorkInfoDao() {
        ulc0 ulc0Var;
        if (this._rawWorkInfoDao != null) {
            return this._rawWorkInfoDao;
        }
        synchronized (this) {
            try {
                if (this._rawWorkInfoDao == null) {
                    this._rawWorkInfoDao = new xlc0(this);
                }
                ulc0Var = this._rawWorkInfoDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ulc0Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public iph0 systemIdInfoDao() {
        iph0 iph0Var;
        if (this._systemIdInfoDao != null) {
            return this._systemIdInfoDao;
        }
        synchronized (this) {
            try {
                if (this._systemIdInfoDao == null) {
                    this._systemIdInfoDao = new jph0(this);
                }
                iph0Var = this._systemIdInfoDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return iph0Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public bjq0 workNameDao() {
        bjq0 bjq0Var;
        if (this._workNameDao != null) {
            return this._workNameDao;
        }
        synchronized (this) {
            try {
                if (this._workNameDao == null) {
                    this._workNameDao = new cjq0(this);
                }
                bjq0Var = this._workNameDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return bjq0Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public ejq0 workProgressDao() {
        ejq0 ejq0Var;
        if (this._workProgressDao != null) {
            return this._workProgressDao;
        }
        synchronized (this) {
            try {
                if (this._workProgressDao == null) {
                    this._workProgressDao = new fjq0(this);
                }
                ejq0Var = this._workProgressDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return ejq0Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public njq0 workSpecDao() {
        njq0 njq0Var;
        if (this._workSpecDao != null) {
            return this._workSpecDao;
        }
        synchronized (this) {
            try {
                if (this._workSpecDao == null) {
                    this._workSpecDao = new sjq0(this);
                }
                njq0Var = this._workSpecDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return njq0Var;
    }

    @Override // androidx.work.impl.WorkDatabase
    public vjq0 workTagDao() {
        vjq0 vjq0Var;
        if (this._workTagDao != null) {
            return this._workTagDao;
        }
        synchronized (this) {
            try {
                if (this._workTagDao == null) {
                    this._workTagDao = new wjq0(this);
                }
                vjq0Var = this._workTagDao;
            } catch (Throwable th) {
                throw th;
            }
        }
        return vjq0Var;
    }

    /* JADX INFO: renamed from: androidx.work.impl.WorkDatabase_Impl$a */
    public class C0772a extends C0674i.b {
        public C0772a(int i) {
            super(i);
        }

        @Override // androidx.room.C0674i.b
        /* JADX INFO: renamed from: a */
        public void mo4007a(@NonNull n7h0 n7h0Var) {
            n7h0Var.execSQL("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            n7h0Var.execSQL("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
            n7h0Var.execSQL("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
            n7h0Var.execSQL("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x'', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
            n7h0Var.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
            n7h0Var.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
            n7h0Var.execSQL("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            n7h0Var.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
            n7h0Var.execSQL("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            n7h0Var.execSQL("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            n7h0Var.execSQL("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
            n7h0Var.execSQL("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
            n7h0Var.execSQL("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
            n7h0Var.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
            n7h0Var.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '86254750241babac4b8d52996a675549')");
        }

        @Override // androidx.room.C0674i.b
        /* JADX INFO: renamed from: b */
        public void mo4008b(@NonNull n7h0 n7h0Var) {
            n7h0Var.execSQL("DROP TABLE IF EXISTS `Dependency`");
            n7h0Var.execSQL("DROP TABLE IF EXISTS `WorkSpec`");
            n7h0Var.execSQL("DROP TABLE IF EXISTS `WorkTag`");
            n7h0Var.execSQL("DROP TABLE IF EXISTS `SystemIdInfo`");
            n7h0Var.execSQL("DROP TABLE IF EXISTS `WorkName`");
            n7h0Var.execSQL("DROP TABLE IF EXISTS `WorkProgress`");
            n7h0Var.execSQL("DROP TABLE IF EXISTS `Preference`");
            List list = ((RoomDatabase) WorkDatabase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((RoomDatabase.AbstractC0658b) it.next()).m3921b(n7h0Var);
                }
            }
        }

        @Override // androidx.room.C0674i.b
        /* JADX INFO: renamed from: c */
        public void mo4009c(@NonNull n7h0 n7h0Var) {
            List list = ((RoomDatabase) WorkDatabase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((RoomDatabase.AbstractC0658b) it.next()).m3920a(n7h0Var);
                }
            }
        }

        @Override // androidx.room.C0674i.b
        /* JADX INFO: renamed from: d */
        public void mo4010d(@NonNull n7h0 n7h0Var) {
            ((RoomDatabase) WorkDatabase_Impl.this).mDatabase = n7h0Var;
            n7h0Var.execSQL("PRAGMA foreign_keys = ON");
            WorkDatabase_Impl.this.internalInitInvalidationTracker(n7h0Var);
            List list = ((RoomDatabase) WorkDatabase_Impl.this).mCallbacks;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((RoomDatabase.AbstractC0658b) it.next()).mo3922c(n7h0Var);
                }
            }
        }

        @Override // androidx.room.C0674i.b
        /* JADX INFO: renamed from: f */
        public void mo4012f(@NonNull n7h0 n7h0Var) {
            o1c.m165591a(n7h0Var);
        }

        @Override // androidx.room.C0674i.b
        @NonNull
        /* JADX INFO: renamed from: g */
        public C0674i.c mo4013g(@NonNull n7h0 n7h0Var) {
            HashMap map = new HashMap(2);
            map.put("work_spec_id", new lzh0.C18511a("work_spec_id", "TEXT", true, 1, null, 1));
            map.put("prerequisite_id", new lzh0.C18511a("prerequisite_id", "TEXT", true, 2, null, 1));
            HashSet hashSet = new HashSet(2);
            hashSet.add(new lzh0.C18513c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            hashSet.add(new lzh0.C18513c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("prerequisite_id"), Arrays.asList("id")));
            HashSet hashSet2 = new HashSet(2);
            hashSet2.add(new lzh0.C18515e("index_Dependency_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            hashSet2.add(new lzh0.C18515e("index_Dependency_prerequisite_id", false, Arrays.asList("prerequisite_id"), Arrays.asList("ASC")));
            lzh0 lzh0Var = new lzh0("Dependency", map, hashSet, hashSet2);
            lzh0 lzh0VarM156433a = lzh0.m156433a(n7h0Var, "Dependency");
            if (!lzh0Var.equals(lzh0VarM156433a)) {
                return new C0674i.c(false, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n" + lzh0Var + "\n Found:\n" + lzh0VarM156433a);
            }
            HashMap map2 = new HashMap(32);
            map2.put("id", new lzh0.C18511a("id", "TEXT", true, 1, null, 1));
            map2.put("state", new lzh0.C18511a("state", "INTEGER", true, 0, null, 1));
            map2.put("worker_class_name", new lzh0.C18511a("worker_class_name", "TEXT", true, 0, null, 1));
            map2.put("input_merger_class_name", new lzh0.C18511a("input_merger_class_name", "TEXT", true, 0, null, 1));
            map2.put("input", new lzh0.C18511a("input", "BLOB", true, 0, null, 1));
            map2.put("output", new lzh0.C18511a("output", "BLOB", true, 0, null, 1));
            map2.put("initial_delay", new lzh0.C18511a("initial_delay", "INTEGER", true, 0, null, 1));
            map2.put("interval_duration", new lzh0.C18511a("interval_duration", "INTEGER", true, 0, null, 1));
            map2.put("flex_duration", new lzh0.C18511a("flex_duration", "INTEGER", true, 0, null, 1));
            map2.put("run_attempt_count", new lzh0.C18511a("run_attempt_count", "INTEGER", true, 0, null, 1));
            map2.put("backoff_policy", new lzh0.C18511a("backoff_policy", "INTEGER", true, 0, null, 1));
            map2.put("backoff_delay_duration", new lzh0.C18511a("backoff_delay_duration", "INTEGER", true, 0, null, 1));
            map2.put("last_enqueue_time", new lzh0.C18511a("last_enqueue_time", "INTEGER", true, 0, User.ID_TEAM_ACCOUNT, 1));
            map2.put("minimum_retention_duration", new lzh0.C18511a("minimum_retention_duration", "INTEGER", true, 0, null, 1));
            map2.put("schedule_requested_at", new lzh0.C18511a("schedule_requested_at", "INTEGER", true, 0, null, 1));
            map2.put("run_in_foreground", new lzh0.C18511a("run_in_foreground", "INTEGER", true, 0, null, 1));
            map2.put("out_of_quota_policy", new lzh0.C18511a("out_of_quota_policy", "INTEGER", true, 0, null, 1));
            map2.put("period_count", new lzh0.C18511a("period_count", "INTEGER", true, 0, "0", 1));
            map2.put("generation", new lzh0.C18511a("generation", "INTEGER", true, 0, "0", 1));
            map2.put("next_schedule_time_override", new lzh0.C18511a("next_schedule_time_override", "INTEGER", true, 0, "9223372036854775807", 1));
            map2.put("next_schedule_time_override_generation", new lzh0.C18511a("next_schedule_time_override_generation", "INTEGER", true, 0, "0", 1));
            map2.put(DownloadService.KEY_STOP_REASON, new lzh0.C18511a(DownloadService.KEY_STOP_REASON, "INTEGER", true, 0, "-256", 1));
            map2.put("trace_tag", new lzh0.C18511a("trace_tag", "TEXT", false, 0, null, 1));
            map2.put("required_network_type", new lzh0.C18511a("required_network_type", "INTEGER", true, 0, null, 1));
            map2.put("required_network_request", new lzh0.C18511a("required_network_request", "BLOB", true, 0, "x''", 1));
            map2.put("requires_charging", new lzh0.C18511a("requires_charging", "INTEGER", true, 0, null, 1));
            map2.put("requires_device_idle", new lzh0.C18511a("requires_device_idle", "INTEGER", true, 0, null, 1));
            map2.put("requires_battery_not_low", new lzh0.C18511a("requires_battery_not_low", "INTEGER", true, 0, null, 1));
            map2.put("requires_storage_not_low", new lzh0.C18511a("requires_storage_not_low", "INTEGER", true, 0, null, 1));
            map2.put("trigger_content_update_delay", new lzh0.C18511a("trigger_content_update_delay", "INTEGER", true, 0, null, 1));
            map2.put("trigger_max_content_delay", new lzh0.C18511a("trigger_max_content_delay", "INTEGER", true, 0, null, 1));
            map2.put("content_uri_triggers", new lzh0.C18511a("content_uri_triggers", "BLOB", true, 0, null, 1));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new lzh0.C18515e("index_WorkSpec_schedule_requested_at", false, Arrays.asList("schedule_requested_at"), Arrays.asList("ASC")));
            hashSet4.add(new lzh0.C18515e("index_WorkSpec_last_enqueue_time", false, Arrays.asList("last_enqueue_time"), Arrays.asList("ASC")));
            lzh0 lzh0Var2 = new lzh0("WorkSpec", map2, hashSet3, hashSet4);
            lzh0 lzh0VarM156433a2 = lzh0.m156433a(n7h0Var, "WorkSpec");
            if (!lzh0Var2.equals(lzh0VarM156433a2)) {
                return new C0674i.c(false, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n" + lzh0Var2 + "\n Found:\n" + lzh0VarM156433a2);
            }
            HashMap map3 = new HashMap(2);
            map3.put("tag", new lzh0.C18511a("tag", "TEXT", true, 1, null, 1));
            map3.put("work_spec_id", new lzh0.C18511a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet5 = new HashSet(1);
            hashSet5.add(new lzh0.C18513c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet6 = new HashSet(1);
            hashSet6.add(new lzh0.C18515e("index_WorkTag_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            lzh0 lzh0Var3 = new lzh0("WorkTag", map3, hashSet5, hashSet6);
            lzh0 lzh0VarM156433a3 = lzh0.m156433a(n7h0Var, "WorkTag");
            if (!lzh0Var3.equals(lzh0VarM156433a3)) {
                return new C0674i.c(false, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n" + lzh0Var3 + "\n Found:\n" + lzh0VarM156433a3);
            }
            HashMap map4 = new HashMap(3);
            map4.put("work_spec_id", new lzh0.C18511a("work_spec_id", "TEXT", true, 1, null, 1));
            map4.put("generation", new lzh0.C18511a("generation", "INTEGER", true, 2, "0", 1));
            map4.put("system_id", new lzh0.C18511a("system_id", "INTEGER", true, 0, null, 1));
            HashSet hashSet7 = new HashSet(1);
            hashSet7.add(new lzh0.C18513c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            lzh0 lzh0Var4 = new lzh0("SystemIdInfo", map4, hashSet7, new HashSet(0));
            lzh0 lzh0VarM156433a4 = lzh0.m156433a(n7h0Var, "SystemIdInfo");
            if (!lzh0Var4.equals(lzh0VarM156433a4)) {
                return new C0674i.c(false, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n" + lzh0Var4 + "\n Found:\n" + lzh0VarM156433a4);
            }
            HashMap map5 = new HashMap(2);
            map5.put(AuthenticationTokenClaims.JSON_KEY_NAME, new lzh0.C18511a(AuthenticationTokenClaims.JSON_KEY_NAME, "TEXT", true, 1, null, 1));
            map5.put("work_spec_id", new lzh0.C18511a("work_spec_id", "TEXT", true, 2, null, 1));
            HashSet hashSet8 = new HashSet(1);
            hashSet8.add(new lzh0.C18513c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            HashSet hashSet9 = new HashSet(1);
            hashSet9.add(new lzh0.C18515e("index_WorkName_work_spec_id", false, Arrays.asList("work_spec_id"), Arrays.asList("ASC")));
            lzh0 lzh0Var5 = new lzh0("WorkName", map5, hashSet8, hashSet9);
            lzh0 lzh0VarM156433a5 = lzh0.m156433a(n7h0Var, "WorkName");
            if (!lzh0Var5.equals(lzh0VarM156433a5)) {
                return new C0674i.c(false, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n" + lzh0Var5 + "\n Found:\n" + lzh0VarM156433a5);
            }
            HashMap map6 = new HashMap(2);
            map6.put("work_spec_id", new lzh0.C18511a("work_spec_id", "TEXT", true, 1, null, 1));
            map6.put("progress", new lzh0.C18511a("progress", "BLOB", true, 0, null, 1));
            HashSet hashSet10 = new HashSet(1);
            hashSet10.add(new lzh0.C18513c("WorkSpec", "CASCADE", "CASCADE", Arrays.asList("work_spec_id"), Arrays.asList("id")));
            lzh0 lzh0Var6 = new lzh0("WorkProgress", map6, hashSet10, new HashSet(0));
            lzh0 lzh0VarM156433a6 = lzh0.m156433a(n7h0Var, "WorkProgress");
            if (!lzh0Var6.equals(lzh0VarM156433a6)) {
                return new C0674i.c(false, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n" + lzh0Var6 + "\n Found:\n" + lzh0VarM156433a6);
            }
            HashMap map7 = new HashMap(2);
            map7.put(Constants.KEY_KEY, new lzh0.C18511a(Constants.KEY_KEY, "TEXT", true, 1, null, 1));
            map7.put("long_value", new lzh0.C18511a("long_value", "INTEGER", false, 0, null, 1));
            lzh0 lzh0Var7 = new lzh0("Preference", map7, new HashSet(0), new HashSet(0));
            lzh0 lzh0VarM156433a7 = lzh0.m156433a(n7h0Var, "Preference");
            if (lzh0Var7.equals(lzh0VarM156433a7)) {
                return new C0674i.c(true, null);
            }
            return new C0674i.c(false, "Preference(androidx.work.impl.model.Preference).\n Expected:\n" + lzh0Var7 + "\n Found:\n" + lzh0VarM156433a7);
        }

        @Override // androidx.room.C0674i.b
        /* JADX INFO: renamed from: e */
        public void mo4011e(@NonNull n7h0 n7h0Var) {
        }
    }
}
