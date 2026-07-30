package p149l;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.room.RoomDatabase;
import androidx.work.BackoffPolicy;
import androidx.work.Data;
import androidx.work.NetworkType;
import androidx.work.WorkInfo;
import com.google.android.exoplayer2.offline.DownloadService;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class qdc0 implements ndc0 {

    /* JADX INFO: renamed from: a */
    public final RoomDatabase f153904a;

    public qdc0(@NonNull RoomDatabase roomDatabase) {
        this.f153904a = roomDatabase;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Unit m174009b(qdc0 qdc0Var, HashMap map) {
        qdc0Var.m174012d(map);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Unit m174010c(qdc0 qdc0Var, HashMap map) {
        qdc0Var.m174013e(map);
        return Unit.INSTANCE;
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public static List<Class<?>> m174011f() {
        return Collections.EMPTY_LIST;
    }

    @Override // p149l.ndc0
    /* JADX INFO: renamed from: a */
    public List<haq0.C17256c> mo158987a(izg0 izg0Var) {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        this.f153904a.assertNotSuspendingTransaction();
        Cursor cursorM99746b = b0c.m99746b(this.f153904a, izg0Var, true, null);
        try {
            int iM143764d = jxb.m143764d(cursorM99746b, "id");
            int iM143764d2 = jxb.m143764d(cursorM99746b, "state");
            int iM143764d3 = jxb.m143764d(cursorM99746b, "output");
            int iM143764d4 = jxb.m143764d(cursorM99746b, "initial_delay");
            int iM143764d5 = jxb.m143764d(cursorM99746b, "interval_duration");
            int iM143764d6 = jxb.m143764d(cursorM99746b, "flex_duration");
            int iM143764d7 = jxb.m143764d(cursorM99746b, "run_attempt_count");
            int iM143764d8 = jxb.m143764d(cursorM99746b, "backoff_policy");
            int iM143764d9 = jxb.m143764d(cursorM99746b, "backoff_delay_duration");
            int iM143764d10 = jxb.m143764d(cursorM99746b, "last_enqueue_time");
            int iM143764d11 = jxb.m143764d(cursorM99746b, "period_count");
            int iM143764d12 = jxb.m143764d(cursorM99746b, "generation");
            int iM143764d13 = jxb.m143764d(cursorM99746b, "next_schedule_time_override");
            int iM143764d14 = jxb.m143764d(cursorM99746b, DownloadService.KEY_STOP_REASON);
            int iM143764d15 = jxb.m143764d(cursorM99746b, "required_network_type");
            int iM143764d16 = jxb.m143764d(cursorM99746b, "required_network_request");
            int iM143764d17 = jxb.m143764d(cursorM99746b, "requires_charging");
            int iM143764d18 = jxb.m143764d(cursorM99746b, "requires_device_idle");
            int iM143764d19 = jxb.m143764d(cursorM99746b, "requires_battery_not_low");
            int iM143764d20 = jxb.m143764d(cursorM99746b, "requires_storage_not_low");
            int iM143764d21 = jxb.m143764d(cursorM99746b, "trigger_content_update_delay");
            int iM143764d22 = jxb.m143764d(cursorM99746b, "trigger_max_content_delay");
            int iM143764d23 = jxb.m143764d(cursorM99746b, "content_uri_triggers");
            HashMap<String, ArrayList<String>> map = new HashMap<>();
            int i5 = iM143764d13;
            HashMap<String, ArrayList<Data>> map2 = new HashMap<>();
            while (cursorM99746b.moveToNext()) {
                int i6 = iM143764d12;
                String string = cursorM99746b.getString(iM143764d);
                if (!map.containsKey(string)) {
                    map.put(string, new ArrayList<>());
                }
                String string2 = cursorM99746b.getString(iM143764d);
                if (!map2.containsKey(string2)) {
                    map2.put(string2, new ArrayList<>());
                }
                iM143764d12 = i6;
                iM143764d11 = iM143764d11;
            }
            int i7 = iM143764d11;
            int i8 = iM143764d12;
            int i9 = -1;
            cursorM99746b.moveToPosition(-1);
            m174013e(map);
            m174012d(map2);
            ArrayList arrayList = new ArrayList(cursorM99746b.getCount());
            while (cursorM99746b.moveToNext()) {
                String string3 = iM143764d == i9 ? null : cursorM99746b.getString(iM143764d);
                WorkInfo.State stateM187773g = iM143764d2 == i9 ? null : taq0.m187773g(cursorM99746b.getInt(iM143764d2));
                Data dataM4314b = iM143764d3 == i9 ? null : Data.m4314b(cursorM99746b.getBlob(iM143764d3));
                long j = iM143764d4 == i9 ? 0L : cursorM99746b.getLong(iM143764d4);
                long j2 = iM143764d5 == i9 ? 0L : cursorM99746b.getLong(iM143764d5);
                long j3 = iM143764d6 == i9 ? 0L : cursorM99746b.getLong(iM143764d6);
                int i10 = iM143764d7 == i9 ? 0 : cursorM99746b.getInt(iM143764d7);
                BackoffPolicy backoffPolicyM187770d = iM143764d8 == i9 ? null : taq0.m187770d(cursorM99746b.getInt(iM143764d8));
                long j4 = iM143764d9 == i9 ? 0L : cursorM99746b.getLong(iM143764d9);
                long j5 = iM143764d10 == i9 ? 0L : cursorM99746b.getLong(iM143764d10);
                int i11 = i7;
                if (i11 == i9) {
                    i = i8;
                    i2 = 0;
                } else {
                    i = i8;
                    i2 = cursorM99746b.getInt(i11);
                }
                if (i == i9) {
                    i3 = i5;
                    i4 = 0;
                } else {
                    int i12 = cursorM99746b.getInt(i);
                    i3 = i5;
                    i4 = i12;
                }
                long j6 = i3 == i9 ? 0L : cursorM99746b.getLong(i3);
                int i13 = i3;
                int i14 = iM143764d14;
                int i15 = i14 == i9 ? 0 : cursorM99746b.getInt(i14);
                iM143764d14 = i14;
                int i16 = iM143764d15;
                NetworkType networkTypeM187771e = i16 == i9 ? null : taq0.m187771e(cursorM99746b.getInt(i16));
                iM143764d15 = i16;
                int i17 = iM143764d16;
                qc20 qc20VarM187778l = i17 == i9 ? null : taq0.m187778l(cursorM99746b.getBlob(i17));
                iM143764d16 = i17;
                int i18 = iM143764d17;
                if (i18 == i9) {
                    z = false;
                } else {
                    z = cursorM99746b.getInt(i18) != 0;
                }
                iM143764d17 = i18;
                int i19 = iM143764d18;
                if (i19 == i9) {
                    z2 = false;
                } else {
                    z2 = cursorM99746b.getInt(i19) != 0;
                }
                iM143764d18 = i19;
                int i20 = iM143764d19;
                if (i20 == i9) {
                    z3 = false;
                } else {
                    z3 = cursorM99746b.getInt(i20) != 0;
                }
                iM143764d19 = i20;
                int i21 = iM143764d20;
                if (i21 == i9) {
                    z4 = false;
                } else {
                    z4 = cursorM99746b.getInt(i21) != 0;
                }
                iM143764d20 = i21;
                int i22 = iM143764d21;
                long j7 = i22 == i9 ? 0L : cursorM99746b.getLong(i22);
                iM143764d21 = i22;
                int i23 = iM143764d22;
                long j8 = i23 != i9 ? cursorM99746b.getLong(i23) : 0L;
                iM143764d22 = i23;
                int i24 = iM143764d23;
                HashMap<String, ArrayList<String>> map3 = map;
                arrayList.add(new haq0.C17256c(string3, stateM187773g, dataM4314b, j, j2, j3, new gz5(qc20VarM187778l, networkTypeM187771e, z, z2, z3, z4, j7, j8, i24 == i9 ? null : taq0.m187768b(cursorM99746b.getBlob(i24))), i10, backoffPolicyM187770d, j4, j5, i2, i4, j6, i15, map.get(cursorM99746b.getString(iM143764d)), map2.get(cursorM99746b.getString(iM143764d))));
                iM143764d23 = i24;
                iM143764d2 = iM143764d2;
                map = map3;
                i9 = -1;
                i8 = i;
                i5 = i13;
                i7 = i11;
            }
            return arrayList;
        } finally {
            cursorM99746b.close();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m174012d(@NonNull HashMap<String, ArrayList<Data>> map) {
        Set<String> setKeySet = map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (map.size() > 999) {
            koc0.m146693a(map, true, new Function1() { // from class: l.pdc0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return qdc0.m174009b(this.f148293a, (HashMap) obj);
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
        Cursor cursorM99746b = b0c.m99746b(this.f153904a, xcd0VarM208113d, false, null);
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

    /* JADX INFO: renamed from: e */
    public final void m174013e(@NonNull HashMap<String, ArrayList<String>> map) {
        Set<String> setKeySet = map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (map.size() > 999) {
            koc0.m146693a(map, true, new Function1() { // from class: l.odc0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return qdc0.m174010c(this.f143197a, (HashMap) obj);
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
        Cursor cursorM99746b = b0c.m99746b(this.f153904a, xcd0VarM208113d, false, null);
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
}
