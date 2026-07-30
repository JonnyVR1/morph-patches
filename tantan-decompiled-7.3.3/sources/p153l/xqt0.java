package p153l;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.client.zzff;
import com.google.android.gms.ads.internal.util.C2098b;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.BinderC2169g1;
import com.google.android.gms.internal.ads.zzcei;
import com.google.android.gms.internal.ads.zzdzc;
import com.google.android.gms.internal.ads.zzfho;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class xqt0 extends lnt0 {

    /* JADX INFO: renamed from: a */
    public final Context f195828a;

    /* JADX INFO: renamed from: b */
    public final zzcei f195829b;

    /* JADX INFO: renamed from: c */
    public final huu0 f195830c;

    /* JADX INFO: renamed from: d */
    public final rcv0 f195831d;

    /* JADX INFO: renamed from: e */
    public final mkv0 f195832e;

    /* JADX INFO: renamed from: f */
    public final lzu0 f195833f;

    /* JADX INFO: renamed from: g */
    public final s9t0 f195834g;

    /* JADX INFO: renamed from: h */
    public final muu0 f195835h;

    /* JADX INFO: renamed from: i */
    public final j0v0 f195836i;

    /* JADX INFO: renamed from: j */
    public final bks0 f195837j;

    /* JADX INFO: renamed from: k */
    public final hew0 f195838k;

    /* JADX INFO: renamed from: l */
    public final p8w0 f195839l;

    /* JADX INFO: renamed from: m */
    public final tgs0 f195840m;

    /* JADX INFO: renamed from: n */
    public boolean f195841n = false;

    public xqt0(Context context, zzcei zzceiVar, huu0 huu0Var, rcv0 rcv0Var, mkv0 mkv0Var, lzu0 lzu0Var, s9t0 s9t0Var, muu0 muu0Var, j0v0 j0v0Var, bks0 bks0Var, hew0 hew0Var, p8w0 p8w0Var, tgs0 tgs0Var) {
        this.f195828a = context;
        this.f195829b = zzceiVar;
        this.f195830c = huu0Var;
        this.f195831d = rcv0Var;
        this.f195832e = mkv0Var;
        this.f195833f = lzu0Var;
        this.f195834g = s9t0Var;
        this.f195835h = muu0Var;
        this.f195836i = j0v0Var;
        this.f195837j = bks0Var;
        this.f195838k = hew0Var;
        this.f195839l = p8w0Var;
        this.f195840m = tgs0Var;
    }

    @Override // p153l.mot0
    /* JADX INFO: renamed from: A */
    public final void mo156007A(String str) {
        this.f195832e.m158830g(str);
    }

    @Override // p153l.mot0
    /* JADX INFO: renamed from: B3 */
    public final synchronized void mo156008B3(float f) {
        bxy0.m106936t().m157992d(f);
    }

    @Override // p153l.mot0
    /* JADX INFO: renamed from: C3 */
    public final void mo156009C3(uws0 uws0Var) throws RemoteException {
        this.f195839l.m171285f(uws0Var);
    }

    @Override // p153l.mot0
    /* JADX INFO: renamed from: G7 */
    public final void mo156010G7(zzff zzffVar) throws RemoteException {
        this.f195834g.m185239n(this.f195828a, zzffVar);
    }

    @Override // p153l.mot0
    /* JADX INFO: renamed from: J2 */
    public final void mo156011J2(p1m p1mVar, String str) {
        if (p1mVar == null) {
            dct0.m115295d("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) h950.m134037P2(p1mVar);
        if (context == null) {
            dct0.m115295d("Context is null. Failed to open debug menu.");
            return;
        }
        c1s0 c1s0Var = new c1s0(context);
        c1s0Var.m107651n(str);
        c1s0Var.m107652o(this.f195829b.zza);
        c1s0Var.m107655r();
    }

    @Override // p153l.mot0
    /* JADX INFO: renamed from: R1 */
    public final synchronized void mo156012R1(String str) {
        sgs0.m185829a(this.f195828a);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) jas0.m144075c().m176505a(sgs0.f168123R3)).booleanValue()) {
                bxy0.m106919c().m102251a(this.f195828a, this.f195829b, str, null, this.f195838k);
            }
        }
    }

    @Override // p153l.mot0
    /* JADX INFO: renamed from: X */
    public final void mo156013X(boolean z) throws RemoteException {
        try {
            llw0.m154791j(this.f195828a).m154797o(z);
        } catch (IOException e) {
            throw new RemoteException(e.getMessage());
        }
    }

    @Override // p153l.mot0
    /* JADX INFO: renamed from: X4 */
    public final void mo156014X4(k5u0 k5u0Var) throws RemoteException {
        this.f195836i.m143043h(k5u0Var, zzdzc.API);
    }

    @Override // p153l.mot0
    /* JADX INFO: renamed from: b */
    public final synchronized boolean mo156015b() {
        return bxy0.m106936t().m157993e();
    }

    @Override // p153l.mot0
    /* JADX INFO: renamed from: b5 */
    public final void mo156016b5(lss0 lss0Var) throws RemoteException {
        this.f195833f.m156495s(lss0Var);
    }

    @Override // p153l.mot0
    /* JADX INFO: renamed from: j6 */
    public final void mo156017j6(@Nullable String str, p1m p1mVar) {
        String strM12351R;
        Runnable runnable;
        sgs0.m185829a(this.f195828a);
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168195X3)).booleanValue()) {
            try {
                bxy0.m106934r();
                strM12351R = C2098b.m12351R(this.f195828a);
            } catch (RemoteException e) {
                bxy0.m106933q().m120275w(e, "NonagonMobileAdsSettingManager_AppId");
                strM12351R = "";
            }
        } else {
            strM12351R = "";
        }
        boolean z = true;
        String str2 = true == TextUtils.isEmpty(strM12351R) ? str : strM12351R;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        boolean zBooleanValue = ((Boolean) jas0.m144075c().m176505a(sgs0.f168123R3)).booleanValue();
        dgs0 dgs0Var = sgs0.f168108Q0;
        boolean zBooleanValue2 = zBooleanValue | ((Boolean) jas0.m144075c().m176505a(dgs0Var)).booleanValue();
        if (((Boolean) jas0.m144075c().m176505a(dgs0Var)).booleanValue()) {
            final Runnable runnable2 = (Runnable) h950.m134037P2(p1mVar);
            runnable = new Runnable() { // from class: l.vqt0
                @Override // java.lang.Runnable
                public final void run() {
                    xvw0 xvw0Var = oct0.f146737e;
                    final xqt0 xqt0Var = this.f185398a;
                    final Runnable runnable3 = runnable2;
                    xvw0Var.execute(new Runnable() { // from class: l.wqt0
                        @Override // java.lang.Runnable
                        public final void run() {
                            xqt0Var.m212742o8(runnable3);
                        }
                    });
                }
            };
        } else {
            runnable = null;
            z = zBooleanValue2;
        }
        Runnable runnable3 = runnable;
        if (z) {
            bxy0.m106919c().m102251a(this.f195828a, this.f195829b, str2, runnable3, this.f195838k);
        }
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m212741k() {
        this.f195837j.m104844a(new BinderC2169g1());
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: o8 */
    public final void m212742o8(Runnable runnable) {
        Preconditions.checkMainThread("Adapters must be initialized on the main thread.");
        Map mapM214927e = bxy0.m106933q().m120264i().zzh().m214927e();
        if (mapM214927e.isEmpty()) {
            return;
        }
        if (runnable != null) {
            try {
                runnable.run();
            } catch (Throwable th) {
                dct0.m115299h("Could not initialize rewarded ads.", th);
                return;
            }
        }
        if (this.f195830c.m137256d()) {
            HashMap map = new HashMap();
            Iterator it = mapM214927e.values().iterator();
            while (it.hasNext()) {
                for (nws0 nws0Var : ((ows0) it.next()).f149561a) {
                    String str = nws0Var.f144019k;
                    for (String str2 : nws0Var.f144011c) {
                        if (!map.containsKey(str2)) {
                            map.put(str2, new ArrayList());
                        }
                        if (str != null) {
                            ((List) map.get(str2)).add(str);
                        }
                    }
                }
            }
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : map.entrySet()) {
                String str3 = (String) entry.getKey();
                try {
                    scv0 scv0VarMo115957a = this.f195831d.mo115957a(str3, jSONObject);
                    if (scv0VarMo115957a != null) {
                        r8w0 r8w0Var = (r8w0) scv0VarMo115957a.f167348b;
                        if (!r8w0Var.m180257c() && r8w0Var.m180256b()) {
                            r8w0Var.m180269o(this.f195828a, (wev0) scv0VarMo115957a.f167349c, (List) entry.getValue());
                            dct0.m115293b("Initialized rewarded video mediation adapter " + str3);
                        }
                    }
                } catch (zzfho e) {
                    dct0.m115299h("Failed to initialize rewarded video mediation adapter \"" + str3 + "\"", e);
                }
            }
        }
    }

    @Override // p153l.mot0
    /* JADX INFO: renamed from: p6 */
    public final void mo156018p6(String str) {
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168406n9)).booleanValue()) {
            bxy0.m106933q().m120277y(str);
        }
    }

    @Override // p153l.mot0
    /* JADX INFO: renamed from: u4 */
    public final synchronized void mo156019u4(boolean z) {
        bxy0.m106936t().m157991c(z);
    }

    @VisibleForTesting
    public final void zzb() {
        if (bxy0.m106933q().m120264i().mo131898h()) {
            String strZzl = bxy0.m106933q().m120264i().zzl();
            if (bxy0.m106937u().m114541j(this.f195828a, strZzl, this.f195829b.zza)) {
                return;
            }
            bxy0.m106933q().m120264i().mo131891a(false);
            bxy0.m106933q().m120264i().mo131893c("");
        }
    }

    public final /* synthetic */ void zzd() {
        y8w0.m214781b(this.f195828a, true);
    }

    @Override // p153l.mot0
    public final synchronized float zze() {
        return bxy0.m106936t().m157990a();
    }

    @Override // p153l.mot0
    public final String zzf() {
        return this.f195829b.zza;
    }

    @Override // p153l.mot0
    public final List zzg() throws RemoteException {
        return this.f195833f.m156487g();
    }

    @Override // p153l.mot0
    public final void zzi() {
        this.f195833f.m156488l();
    }

    @Override // p153l.mot0
    public final synchronized void zzk() {
        if (this.f195841n) {
            dct0.m115298g("Mobile ads is initialized already.");
            return;
        }
        sgs0.m185829a(this.f195828a);
        this.f195840m.m191107a();
        bxy0.m106933q().m120273u(this.f195828a, this.f195829b);
        bxy0.m106921e().m134424i(this.f195828a);
        this.f195841n = true;
        this.f195833f.m156494r();
        this.f195832e.m158828e();
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168147T3)).booleanValue()) {
            this.f195835h.m160246c();
        }
        this.f195836i.m143042g();
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168263c9)).booleanValue()) {
            oct0.f146733a.execute(new Runnable() { // from class: l.sqt0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f170268a.zzb();
                }
            });
        }
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f168484ta)).booleanValue()) {
            oct0.f146733a.execute(new Runnable() { // from class: l.uqt0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f180506a.m212741k();
                }
            });
        }
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f167990G2)).booleanValue()) {
            oct0.f146733a.execute(new Runnable() { // from class: l.tqt0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f175776a.zzd();
                }
            });
        }
    }
}
