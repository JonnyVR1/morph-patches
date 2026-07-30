package p149l;

import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.AbstractC2349u0;
import com.google.android.gms.internal.measurement.C2308a0;
import com.google.android.gms.internal.measurement.C2356y;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class ovy0 {

    /* JADX INFO: renamed from: a */
    public C2356y f145894a;

    /* JADX INFO: renamed from: b */
    public Long f145895b;

    /* JADX INFO: renamed from: c */
    public long f145896c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ jny0 f145897d;

    public ovy0(jny0 jny0Var) {
        this.f145897d = jny0Var;
    }

    /* JADX INFO: renamed from: a */
    public final C2356y m166211a(String str, C2356y c2356y) {
        Object obj;
        String strM14500X = c2356y.m14500X();
        List<C2308a0> listM14501Y = c2356y.m14501Y();
        this.f145897d.mo15138i();
        Long l2 = (Long) pdy0.m168464Z(c2356y, "_eid");
        boolean z = l2 != null;
        if (z && strM14500X.equals("_ep")) {
            Preconditions.checkNotNull(l2);
            this.f145897d.mo15138i();
            strM14500X = (String) pdy0.m168464Z(c2356y, "_en");
            if (TextUtils.isEmpty(strM14500X)) {
                this.f145897d.zzj().m211414C().m123937b("Extra parameter without an event name. eventId", l2);
                return null;
            }
            if (this.f145894a == null || this.f145895b == null || l2.longValue() != this.f145895b.longValue()) {
                Pair<C2356y, Long> pairM136097B = this.f145897d.mo15140k().m136097B(str, l2);
                if (pairM136097B == null || (obj = pairM136097B.first) == null) {
                    this.f145897d.zzj().m211414C().m123938c("Extra parameter without existing main event. eventName, eventId", strM14500X, l2);
                    return null;
                }
                this.f145894a = (C2356y) obj;
                this.f145896c = ((Long) pairM136097B.second).longValue();
                this.f145897d.mo15138i();
                this.f145895b = (Long) pdy0.m168464Z(this.f145894a, "_eid");
            }
            long j = this.f145896c - 1;
            this.f145896c = j;
            jny0 jny0Var = this.f145897d;
            if (j <= 0) {
                igr0 igr0VarMo15140k = jny0Var.mo15140k();
                igr0VarMo15140k.mo15092h();
                igr0VarMo15140k.zzj().m211416E().m123937b("Clearing complex main event info. appId", str);
                try {
                    igr0VarMo15140k.m136166v().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                } catch (SQLiteException e) {
                    igr0VarMo15140k.zzj().m211412A().m123937b("Error clearing complex main event", e);
                }
            } else {
                jny0Var.mo15140k().m136154f0(str, l2, this.f145896c, this.f145894a);
            }
            ArrayList arrayList = new ArrayList();
            for (C2308a0 c2308a0 : this.f145894a.m14501Y()) {
                this.f145897d.mo15138i();
                if (pdy0.m168469z(c2356y, c2308a0.m13785Z()) == null) {
                    arrayList.add(c2308a0);
                }
            }
            if (arrayList.isEmpty()) {
                this.f145897d.zzj().m211414C().m123937b("No unique parameters in main event. eventName", strM14500X);
            } else {
                arrayList.addAll(listM14501Y);
                listM14501Y = arrayList;
            }
        } else if (z) {
            this.f145895b = l2;
            this.f145894a = c2356y;
            this.f145897d.mo15138i();
            long jLongValue = ((Long) pdy0.m168451C(c2356y, "_epc", 0L)).longValue();
            this.f145896c = jLongValue;
            jny0 jny0Var2 = this.f145897d;
            if (jLongValue <= 0) {
                jny0Var2.zzj().m211414C().m123937b("Complex event with zero extra param count. eventName", strM14500X);
            } else {
                jny0Var2.mo15140k().m136154f0(str, (Long) Preconditions.checkNotNull(l2), this.f145896c, c2356y);
            }
        }
        return (C2356y) ((AbstractC2349u0) c2356y.m14363t().m14510D(strM14500X).m14515M().m14509C(listM14501Y).mo14369H());
    }
}
