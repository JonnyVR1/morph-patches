package p153l;

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
public final class ess0 implements tvr0 {

    /* JADX INFO: renamed from: a */
    public volatile jrs0 f95652a;

    /* JADX INFO: renamed from: b */
    public final Context f95653b;

    public ess0(Context context) {
        this.f95653b = context;
    }

    /* JADX INFO: renamed from: c */
    public static /* bridge */ /* synthetic */ void m122392c(ess0 ess0Var) {
        if (ess0Var.f95652a == null) {
            return;
        }
        ess0Var.f95652a.disconnect();
        Binder.flushPendingCommands();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.tvr0
    @Nullable
    /* JADX INFO: renamed from: a */
    public final vvr0 mo122393a(jwr0 jwr0Var) throws zzaqj {
        Parcelable.Creator<zzboq> creator = zzboq.CREATOR;
        Map mapMo147203p = jwr0Var.mo147203p();
        int size = mapMo147203p.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i = 0;
        int i2 = 0;
        for (Map.Entry entry : mapMo147203p.entrySet()) {
            strArr[i2] = (String) entry.getKey();
            strArr2[i2] = (String) entry.getValue();
            i2++;
        }
        zzboq zzboqVar = new zzboq(jwr0Var.m147202o(), strArr, strArr2);
        long jElapsedRealtime = bxy0.m106918b().elapsedRealtime();
        try {
            tct0 tct0Var = new tct0();
            this.f95652a = new jrs0(this.f95653b, bxy0.m106938v().m213967b(), new css0(this, tct0Var), new dss0(this, tct0Var));
            this.f95652a.checkAvailabilityAndConnect();
            qrs0 qrs0Var = new qrs0(this, zzboqVar);
            xvw0 xvw0Var = oct0.f146733a;
            hpr hprVarM173988o = pvw0.m173988o(pvw0.m173987n(tct0Var, qrs0Var, xvw0Var), ((Integer) jas0.m144075c().m176505a(sgs0.f168478t4)).intValue(), TimeUnit.MILLISECONDS, oct0.f146736d);
            hprVarM173988o.addListener(new rrs0(this), xvw0Var);
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) hprVarM173988o.get();
            d2v0.m113737k("Http assets remote cache took " + (bxy0.m106918b().elapsedRealtime() - jElapsedRealtime) + "ms");
            zzbos zzbosVar = (zzbos) new zzbzc(parcelFileDescriptor).m13609g(zzbos.CREATOR);
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
                    return new vvr0(zzbosVar.zzc, zzbosVar.zzd, map, zzbosVar.zzg, zzbosVar.zzh);
                }
                map.put(strArr3[i], zzbosVar.zzf[i]);
                i++;
            }
        } catch (InterruptedException | ExecutionException unused) {
            d2v0.m113737k("Http assets remote cache took " + (bxy0.m106918b().elapsedRealtime() - jElapsedRealtime) + "ms");
            return null;
        } catch (Throwable th) {
            d2v0.m113737k("Http assets remote cache took " + (bxy0.m106918b().elapsedRealtime() - jElapsedRealtime) + "ms");
            throw th;
        }
    }
}
