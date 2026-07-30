package p149l;

import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.C2461j;
import com.google.android.gms.measurement.internal.zzno;
import com.google.android.gms.measurement.internal.zzo;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class uox0 implements Callable<List<zzno>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzo f177547a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Bundle f177548b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ clx0 f177549c;

    public uox0(clx0 clx0Var, zzo zzoVar, Bundle bundle) {
        this.f177547a = zzoVar;
        this.f177548b = bundle;
        this.f177549c = clx0Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<zzno> call() throws Exception {
        this.f177549c.f81477a.m15310u0();
        C2461j c2461j = this.f177549c.f81477a;
        zzo zzoVar = this.f177547a;
        Bundle bundle = this.f177548b;
        c2461j.zzl().mo15092h();
        if (!mgy0.m154586a() || !c2461j.m15285d0().m192660z(zzoVar.zza, q8s0.f153233I0) || zzoVar.zza == null) {
            return new ArrayList();
        }
        if (bundle != null) {
            int[] intArray = bundle.getIntArray("uriSources");
            long[] longArray = bundle.getLongArray("uriTimestamps");
            if (intArray != null) {
                if (longArray == null || longArray.length != intArray.length) {
                    c2461j.zzj().m211412A().m123936a("Uri sources and timestamps do not match");
                } else {
                    for (int i = 0; i < intArray.length; i++) {
                        igr0 igr0VarM15290g0 = c2461j.m15290g0();
                        String str = zzoVar.zza;
                        int i2 = intArray[i];
                        long j = longArray[i];
                        Preconditions.checkNotEmpty(str);
                        igr0VarM15290g0.mo15092h();
                        igr0VarM15290g0.m130251o();
                        try {
                            int iDelete = igr0VarM15290g0.m136166v().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[]{str, String.valueOf(i2), String.valueOf(j)});
                            igr0VarM15290g0.zzj().m211416E().m123939d("Pruned " + iDelete + " trigger URIs. appId, source, timestamp", str, Integer.valueOf(i2), Long.valueOf(j));
                        } catch (SQLiteException e) {
                            igr0VarM15290g0.zzj().m211412A().m123938c("Error pruning trigger URIs. appId", xww0.m211405p(str), e);
                        }
                    }
                }
            }
        }
        return c2461j.m15290g0().m136127R0(zzoVar.zza);
    }
}
