package p153l;

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
public final class xlc0 implements ulc0 {

    /* JADX INFO: renamed from: a */
    public final RoomDatabase f194940a;

    public xlc0(@NonNull RoomDatabase roomDatabase) {
        this.f194940a = roomDatabase;
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ Unit m211606b(xlc0 xlc0Var, HashMap map) {
        xlc0Var.m211609d(map);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Unit m211607c(xlc0 xlc0Var, HashMap map) {
        xlc0Var.m211610e(map);
        return Unit.INSTANCE;
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public static List<Class<?>> m211608f() {
        return Collections.EMPTY_LIST;
    }

    @Override // p153l.ulc0
    /* JADX INFO: renamed from: a */
    public List<mjq0.C18627c> mo196547a(q7h0 q7h0Var) {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        this.f194940a.assertNotSuspendingTransaction();
        Cursor cursorM165592b = o1c.m165592b(this.f194940a, q7h0Var, true, null);
        try {
            int iM213607d = xyb.m213607d(cursorM165592b, "id");
            int iM213607d2 = xyb.m213607d(cursorM165592b, "state");
            int iM213607d3 = xyb.m213607d(cursorM165592b, "output");
            int iM213607d4 = xyb.m213607d(cursorM165592b, "initial_delay");
            int iM213607d5 = xyb.m213607d(cursorM165592b, "interval_duration");
            int iM213607d6 = xyb.m213607d(cursorM165592b, "flex_duration");
            int iM213607d7 = xyb.m213607d(cursorM165592b, "run_attempt_count");
            int iM213607d8 = xyb.m213607d(cursorM165592b, "backoff_policy");
            int iM213607d9 = xyb.m213607d(cursorM165592b, "backoff_delay_duration");
            int iM213607d10 = xyb.m213607d(cursorM165592b, "last_enqueue_time");
            int iM213607d11 = xyb.m213607d(cursorM165592b, "period_count");
            int iM213607d12 = xyb.m213607d(cursorM165592b, "generation");
            int iM213607d13 = xyb.m213607d(cursorM165592b, "next_schedule_time_override");
            int iM213607d14 = xyb.m213607d(cursorM165592b, DownloadService.KEY_STOP_REASON);
            int iM213607d15 = xyb.m213607d(cursorM165592b, "required_network_type");
            int iM213607d16 = xyb.m213607d(cursorM165592b, "required_network_request");
            int iM213607d17 = xyb.m213607d(cursorM165592b, "requires_charging");
            int iM213607d18 = xyb.m213607d(cursorM165592b, "requires_device_idle");
            int iM213607d19 = xyb.m213607d(cursorM165592b, "requires_battery_not_low");
            int iM213607d20 = xyb.m213607d(cursorM165592b, "requires_storage_not_low");
            int iM213607d21 = xyb.m213607d(cursorM165592b, "trigger_content_update_delay");
            int iM213607d22 = xyb.m213607d(cursorM165592b, "trigger_max_content_delay");
            int iM213607d23 = xyb.m213607d(cursorM165592b, "content_uri_triggers");
            HashMap<String, ArrayList<String>> map = new HashMap<>();
            int i5 = iM213607d13;
            HashMap<String, ArrayList<Data>> map2 = new HashMap<>();
            while (cursorM165592b.moveToNext()) {
                int i6 = iM213607d12;
                String string = cursorM165592b.getString(iM213607d);
                if (!map.containsKey(string)) {
                    map.put(string, new ArrayList<>());
                }
                String string2 = cursorM165592b.getString(iM213607d);
                if (!map2.containsKey(string2)) {
                    map2.put(string2, new ArrayList<>());
                }
                iM213607d12 = i6;
                iM213607d11 = iM213607d11;
            }
            int i7 = iM213607d11;
            int i8 = iM213607d12;
            int i9 = -1;
            cursorM165592b.moveToPosition(-1);
            m211610e(map);
            m211609d(map2);
            ArrayList arrayList = new ArrayList(cursorM165592b.getCount());
            while (cursorM165592b.moveToNext()) {
                String string3 = iM213607d == i9 ? null : cursorM165592b.getString(iM213607d);
                WorkInfo.State stateM216423g = iM213607d2 == i9 ? null : yjq0.m216423g(cursorM165592b.getInt(iM213607d2));
                Data dataM4316b = iM213607d3 == i9 ? null : Data.m4316b(cursorM165592b.getBlob(iM213607d3));
                long j = iM213607d4 == i9 ? 0L : cursorM165592b.getLong(iM213607d4);
                long j2 = iM213607d5 == i9 ? 0L : cursorM165592b.getLong(iM213607d5);
                long j3 = iM213607d6 == i9 ? 0L : cursorM165592b.getLong(iM213607d6);
                int i10 = iM213607d7 == i9 ? 0 : cursorM165592b.getInt(iM213607d7);
                BackoffPolicy backoffPolicyM216420d = iM213607d8 == i9 ? null : yjq0.m216420d(cursorM165592b.getInt(iM213607d8));
                long j4 = iM213607d9 == i9 ? 0L : cursorM165592b.getLong(iM213607d9);
                long j5 = iM213607d10 == i9 ? 0L : cursorM165592b.getLong(iM213607d10);
                int i11 = i7;
                if (i11 == i9) {
                    i = i8;
                    i2 = 0;
                } else {
                    i = i8;
                    i2 = cursorM165592b.getInt(i11);
                }
                if (i == i9) {
                    i3 = i5;
                    i4 = 0;
                } else {
                    int i12 = cursorM165592b.getInt(i);
                    i3 = i5;
                    i4 = i12;
                }
                long j6 = i3 == i9 ? 0L : cursorM165592b.getLong(i3);
                int i13 = i3;
                int i14 = iM213607d14;
                int i15 = i14 == i9 ? 0 : cursorM165592b.getInt(i14);
                iM213607d14 = i14;
                int i16 = iM213607d15;
                NetworkType networkTypeM216421e = i16 == i9 ? null : yjq0.m216421e(cursorM165592b.getInt(i16));
                iM213607d15 = i16;
                int i17 = iM213607d16;
                al20 al20VarM216428l = i17 == i9 ? null : yjq0.m216428l(cursorM165592b.getBlob(i17));
                iM213607d16 = i17;
                int i18 = iM213607d17;
                if (i18 == i9) {
                    z = false;
                } else {
                    z = cursorM165592b.getInt(i18) != 0;
                }
                iM213607d17 = i18;
                int i19 = iM213607d18;
                if (i19 == i9) {
                    z2 = false;
                } else {
                    z2 = cursorM165592b.getInt(i19) != 0;
                }
                iM213607d18 = i19;
                int i20 = iM213607d19;
                if (i20 == i9) {
                    z3 = false;
                } else {
                    z3 = cursorM165592b.getInt(i20) != 0;
                }
                iM213607d19 = i20;
                int i21 = iM213607d20;
                if (i21 == i9) {
                    z4 = false;
                } else {
                    z4 = cursorM165592b.getInt(i21) != 0;
                }
                iM213607d20 = i21;
                int i22 = iM213607d21;
                long j7 = i22 == i9 ? 0L : cursorM165592b.getLong(i22);
                iM213607d21 = i22;
                int i23 = iM213607d22;
                long j8 = i23 != i9 ? cursorM165592b.getLong(i23) : 0L;
                iM213607d22 = i23;
                int i24 = iM213607d23;
                HashMap<String, ArrayList<String>> map3 = map;
                arrayList.add(new mjq0.C18627c(string3, stateM216423g, dataM4316b, j, j2, j3, new l06(al20VarM216428l, networkTypeM216421e, z, z2, z3, z4, j7, j8, i24 == i9 ? null : yjq0.m216418b(cursorM165592b.getBlob(i24))), i10, backoffPolicyM216420d, j4, j5, i2, i4, j6, i15, map.get(cursorM165592b.getString(iM213607d)), map2.get(cursorM165592b.getString(iM213607d))));
                iM213607d23 = i24;
                iM213607d2 = iM213607d2;
                map = map3;
                i9 = -1;
                i8 = i;
                i5 = i13;
                i7 = i11;
            }
            return arrayList;
        } finally {
            cursorM165592b.close();
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m211609d(@NonNull HashMap<String, ArrayList<Data>> map) {
        Set<String> setKeySet = map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (map.size() > 999) {
            pwc0.m174056a(map, true, new Function1() { // from class: l.wlc0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return xlc0.m211606b(this.f189669a, (HashMap) obj);
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
        Cursor cursorM165592b = o1c.m165592b(this.f194940a, zkd0VarM220067d, false, null);
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

    /* JADX INFO: renamed from: e */
    public final void m211610e(@NonNull HashMap<String, ArrayList<String>> map) {
        Set<String> setKeySet = map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (map.size() > 999) {
            pwc0.m174056a(map, true, new Function1() { // from class: l.vlc0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return xlc0.m211607c(this.f184560a, (HashMap) obj);
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
        Cursor cursorM165592b = o1c.m165592b(this.f194940a, zkd0VarM220067d, false, null);
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
}
