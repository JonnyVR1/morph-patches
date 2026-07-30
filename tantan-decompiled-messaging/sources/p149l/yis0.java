package p149l;

import android.content.Context;
import android.os.Binder;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzaqj;
import com.google.android.gms.internal.ads.zzboq;
import com.google.android.gms.internal.ads.zzbos;
import com.google.android.gms.internal.ads.zzbzc;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class yis0 implements nmr0 {

    /* JADX INFO: renamed from: a */
    public volatile dis0 f198545a;

    /* JADX INFO: renamed from: b */
    public final Context f198546b;

    public yis0(Context context) {
        this.f198546b = context;
    }

    /* JADX INFO: renamed from: c */
    public static /* bridge */ /* synthetic */ void m215022c(yis0 yis0Var) {
        if (yis0Var.f198545a == null) {
            return;
        }
        yis0Var.f198545a.disconnect();
        Binder.flushPendingCommands();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.nmr0
    @Nullable
    /* JADX INFO: renamed from: a */
    public final pmr0 mo104509a(dnr0 dnr0Var) throws zzaqj {
        Parcelable.Creator<zzboq> creator = zzboq.CREATOR;
        Map mapMo112665p = dnr0Var.mo112665p();
        int size = mapMo112665p.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i = 0;
        int i2 = 0;
        for (Map.Entry entry : mapMo112665p.entrySet()) {
            strArr[i2] = (String) entry.getKey();
            strArr2[i2] = (String) entry.getValue();
            i2++;
        }
        zzboq zzboqVar = new zzboq(dnr0Var.m112664o(), strArr, strArr2);
        long jElapsedRealtime = vny0.m199064b().elapsedRealtime();
        try {
            n3t0 n3t0Var = new n3t0();
            this.f198545a = new dis0(this.f198546b, vny0.m199084v().m185773b(), new wis0(this, n3t0Var), new xis0(this, n3t0Var));
            this.f198545a.checkAvailabilityAndConnect();
            kis0 kis0Var = new kis0(this, zzboqVar);
            rmw0 rmw0Var = i3t0.f111372a;
            gnr gnrVarM142242o = jmw0.m142242o(jmw0.m142241n(n3t0Var, kis0Var, rmw0Var), ((Integer) d1s0.m109677c().m144697a(m7s0.f132407t4)).intValue(), TimeUnit.MILLISECONDS, i3t0.f111375d);
            gnrVarM142242o.addListener(new lis0(this), rmw0Var);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) gnrVarM142242o.get();
            xsu0.m210834k("Http assets remote cache took " + (vny0.m199064b().elapsedRealtime() - jElapsedRealtime) + "ms");
            zzbos zzbosVar = (zzbos) new zzbzc(parcelFileDescriptor).m13555g(zzbos.CREATOR);
            if (zzbosVar == null) {
                return null;
            }
            if (zzbosVar.zza) {
                throw new zzaqj(zzbosVar.zzb);
            }
            if (zzbosVar.zze.length != zzbosVar.zzf.length) {
                return null;
            }
            HashMap map = new HashMap();
            while (true) {
                String[] strArr3 = zzbosVar.zze;
                if (i >= strArr3.length) {
                    return new pmr0(zzbosVar.zzc, zzbosVar.zzd, map, zzbosVar.zzg, zzbosVar.zzh);
                }
                map.put(strArr3[i], zzbosVar.zzf[i]);
                i++;
            }
        } catch (InterruptedException | ExecutionException unused) {
            xsu0.m210834k("Http assets remote cache took " + (vny0.m199064b().elapsedRealtime() - jElapsedRealtime) + "ms");
            return null;
        } catch (Throwable th) {
            xsu0.m210834k("Http assets remote cache took " + (vny0.m199064b().elapsedRealtime() - jElapsedRealtime) + "ms");
            throw th;
        }
    }
}
