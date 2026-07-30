package p153l;

import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.AbstractC2372u0;
import com.google.android.gms.internal.measurement.C2331a0;
import com.google.android.gms.internal.measurement.C2379y;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class u4z0 {

    /* JADX INFO: renamed from: a */
    public C2379y f177568a;

    /* JADX INFO: renamed from: b */
    public Long f177569b;

    /* JADX INFO: renamed from: c */
    public long f177570c;

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ pwy0 f177571d;

    public u4z0(pwy0 pwy0Var) {
        this.f177571d = pwy0Var;
    }

    /* JADX INFO: renamed from: a */
    public final C2379y m194519a(String str, C2379y c2379y) {
        Object obj;
        String strM14554X = c2379y.m14554X();
        List<C2331a0> listM14555Y = c2379y.m14555Y();
        this.f177571d.mo15192i();
        Long l2 = (Long) vmy0.m201869Z(c2379y, "_eid");
        boolean z = l2 != null;
        if (z && strM14554X.equals("_ep")) {
            Preconditions.checkNotNull(l2);
            this.f177571d.mo15192i();
            strM14554X = (String) vmy0.m201869Z(c2379y, "_en");
            if (TextUtils.isEmpty(strM14554X)) {
                this.f177571d.zzj().m114560C().m153301b("Extra parameter without an event name. eventId", l2);
                return null;
            }
            if (this.f177568a == null || this.f177569b == null || l2.longValue() != this.f177569b.longValue()) {
                Pair<C2379y, Long> pairM168696B = this.f177571d.mo15194k().m168696B(str, l2);
                if (pairM168696B == null || (obj = pairM168696B.first) == null) {
                    this.f177571d.zzj().m114560C().m153302c("Extra parameter without existing main event. eventName, eventId", strM14554X, l2);
                    return null;
                }
                this.f177568a = (C2379y) obj;
                this.f177570c = ((Long) pairM168696B.second).longValue();
                this.f177571d.mo15192i();
                this.f177569b = (Long) vmy0.m201869Z(this.f177568a, "_eid");
            }
            long j = this.f177570c - 1;
            this.f177570c = j;
            pwy0 pwy0Var = this.f177571d;
            if (j <= 0) {
                opr0 opr0VarMo15194k = pwy0Var.mo15194k();
                opr0VarMo15194k.mo15146h();
                opr0VarMo15194k.zzj().m114562E().m153301b("Clearing complex main event info. appId", str);
                try {
                    opr0VarMo15194k.m168765v().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                } catch (SQLiteException e) {
                    opr0VarMo15194k.zzj().m114558A().m153301b("Error clearing complex main event", e);
                }
            } else {
                pwy0Var.mo15194k().m168753f0(str, l2, this.f177570c, this.f177568a);
            }
            ArrayList arrayList = new ArrayList();
            for (C2331a0 c2331a0 : this.f177568a.m14555Y()) {
                this.f177571d.mo15192i();
                if (vmy0.m201874z(c2379y, c2331a0.m13839Z()) == null) {
                    arrayList.add(c2331a0);
                }
            }
            if (arrayList.isEmpty()) {
                this.f177571d.zzj().m114560C().m153301b("No unique parameters in main event. eventName", strM14554X);
            } else {
                arrayList.addAll(listM14555Y);
                listM14555Y = arrayList;
            }
        } else if (z) {
            this.f177569b = l2;
            this.f177568a = c2379y;
            this.f177571d.mo15192i();
            long jLongValue = ((Long) vmy0.m201856C(c2379y, "_epc", 0L)).longValue();
            this.f177570c = jLongValue;
            pwy0 pwy0Var2 = this.f177571d;
            if (jLongValue <= 0) {
                pwy0Var2.zzj().m114560C().m153301b("Complex event with zero extra param count. eventName", strM14554X);
            } else {
                pwy0Var2.mo15194k().m168753f0(str, (Long) Preconditions.checkNotNull(l2), this.f177570c, c2379y);
            }
        }
        return (C2379y) ((AbstractC2372u0) c2379y.m14417t().m14564D(strM14554X).m14569M().m14563C(listM14555Y).mo14423H());
    }
}
