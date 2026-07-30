package p153l;

import android.database.sqlite.SQLiteException;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.measurement.internal.C2484j;
import com.google.android.gms.measurement.internal.zzno;
import com.google.android.gms.measurement.internal.zzo;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes6.dex */
public final class ayx0 implements Callable<List<zzno>> {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zzo f74057a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ Bundle f74058b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ iux0 f74059c;

    public ayx0(iux0 iux0Var, zzo zzoVar, Bundle bundle) {
        this.f74057a = zzoVar;
        this.f74058b = bundle;
        this.f74059c = iux0Var;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ List<zzno> call() throws Exception {
        this.f74059c.f116991a.m15364u0();
        C2484j c2484j = this.f74059c.f116991a;
        zzo zzoVar = this.f74057a;
        Bundle bundle = this.f74058b;
        c2484j.zzl().mo15146h();
        if (!spy0.m187491a() || !c2484j.m15339d0().m98452z(zzoVar.zza, whs0.f189209I0) || zzoVar.zza == null) {
            return new ArrayList();
        }
        if (bundle != null) {
            int[] intArray = bundle.getIntArray("uriSources");
            long[] longArray = bundle.getLongArray("uriTimestamps");
            if (intArray != null) {
                if (longArray == null || longArray.length != intArray.length) {
                    c2484j.zzj().m114558A().m153300a("Uri sources and timestamps do not match");
                } else {
                    for (int i = 0; i < intArray.length; i++) {
                        opr0 opr0VarM15344g0 = c2484j.m15344g0();
                        String str = zzoVar.zza;
                        int i2 = intArray[i];
                        long j = longArray[i];
                        Preconditions.checkNotEmpty(str);
                        opr0VarM15344g0.mo15146h();
                        opr0VarM15344g0.m163482o();
                        try {
                            int iDelete = opr0VarM15344g0.m168765v().delete("trigger_uris", "app_id=? and source=? and timestamp_millis<=?", new String[]{str, String.valueOf(i2), String.valueOf(j)});
                            opr0VarM15344g0.zzj().m114562E().m153303d("Pruned " + iDelete + " trigger URIs. appId, source, timestamp", str, Integer.valueOf(i2), Long.valueOf(j));
                        } catch (SQLiteException e) {
                            opr0VarM15344g0.zzj().m114558A().m153302c("Error pruning trigger URIs. appId", d6x0.m114551p(str), e);
                        }
                    }
                }
            }
        }
        return c2484j.m15344g0().m168726R0(zzoVar.zza);
    }
}
