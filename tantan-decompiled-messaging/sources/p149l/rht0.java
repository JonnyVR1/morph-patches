package p149l;

import android.content.Context;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.ads.internal.client.zzff;
import com.google.android.gms.ads.internal.util.C2075b;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.ads.BinderC2146g1;
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
public final class rht0 extends fet0 {

    /* JADX INFO: renamed from: a */
    public final Context f159479a;

    /* JADX INFO: renamed from: b */
    public final zzcei f159480b;

    /* JADX INFO: renamed from: c */
    public final blu0 f159481c;

    /* JADX INFO: renamed from: d */
    public final l3v0 f159482d;

    /* JADX INFO: renamed from: e */
    public final gbv0 f159483e;

    /* JADX INFO: renamed from: f */
    public final fqu0 f159484f;

    /* JADX INFO: renamed from: g */
    public final m0t0 f159485g;

    /* JADX INFO: renamed from: h */
    public final glu0 f159486h;

    /* JADX INFO: renamed from: i */
    public final dru0 f159487i;

    /* JADX INFO: renamed from: j */
    public final vas0 f159488j;

    /* JADX INFO: renamed from: k */
    public final b5w0 f159489k;

    /* JADX INFO: renamed from: l */
    public final jzv0 f159490l;

    /* JADX INFO: renamed from: m */
    public final n7s0 f159491m;

    /* JADX INFO: renamed from: n */
    public boolean f159492n = false;

    public rht0(Context context, zzcei zzceiVar, blu0 blu0Var, l3v0 l3v0Var, gbv0 gbv0Var, fqu0 fqu0Var, m0t0 m0t0Var, glu0 glu0Var, dru0 dru0Var, vas0 vas0Var, b5w0 b5w0Var, jzv0 jzv0Var, n7s0 n7s0Var) {
        this.f159479a = context;
        this.f159480b = zzceiVar;
        this.f159481c = blu0Var;
        this.f159482d = l3v0Var;
        this.f159483e = gbv0Var;
        this.f159484f = fqu0Var;
        this.f159485g = m0t0Var;
        this.f159486h = glu0Var;
        this.f159487i = dru0Var;
        this.f159488j = vas0Var;
        this.f159489k = b5w0Var;
        this.f159490l = jzv0Var;
        this.f159491m = n7s0Var;
    }

    @Override // p149l.gft0
    /* JADX INFO: renamed from: A */
    public final void mo122258A(String str) {
        this.f159483e.m125340g(str);
    }

    @Override // p149l.gft0
    /* JADX INFO: renamed from: B3 */
    public final synchronized void mo122259B3(float f) {
        vny0.m199082t().m124397d(f);
    }

    @Override // p149l.gft0
    /* JADX INFO: renamed from: C3 */
    public final void mo122260C3(ons0 ons0Var) throws RemoteException {
        this.f159490l.m143957f(ons0Var);
    }

    @Override // p149l.gft0
    /* JADX INFO: renamed from: G7 */
    public final void mo122261G7(zzff zzffVar) throws RemoteException {
        this.f159485g.m152535n(this.f159479a, zzffVar);
    }

    @Override // p149l.gft0
    /* JADX INFO: renamed from: J2 */
    public final void mo122262J2(uyl uylVar, String str) {
        if (uylVar == null) {
            x2t0.m206866d("Wrapped context is null. Failed to open debug menu.");
            return;
        }
        Context context = (Context) s050.m181847P2(uylVar);
        if (context == null) {
            x2t0.m206866d("Context is null. Failed to open debug menu.");
            return;
        }
        wrr0 wrr0Var = new wrr0(context);
        wrr0Var.m205291n(str);
        wrr0Var.m205292o(this.f159480b.zza);
        wrr0Var.m205295r();
    }

    @Override // p149l.gft0
    /* JADX INFO: renamed from: R1 */
    public final synchronized void mo122263R1(String str) {
        m7s0.m153417a(this.f159479a);
        if (!TextUtils.isEmpty(str)) {
            if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132052R3)).booleanValue()) {
                vny0.m199065c().m199909a(this.f159479a, this.f159480b, str, null, this.f159489k);
            }
        }
    }

    @Override // p149l.gft0
    /* JADX INFO: renamed from: X */
    public final void mo122264X(boolean z) throws RemoteException {
        try {
            fcw0.m120480j(this.f159479a).m120486o(z);
        } catch (IOException e) {
            throw new RemoteException(e.getMessage());
        }
    }

    @Override // p149l.gft0
    /* JADX INFO: renamed from: X4 */
    public final void mo122265X4(ewt0 ewt0Var) throws RemoteException {
        this.f159487i.m113346h(ewt0Var, zzdzc.API);
    }

    @Override // p149l.gft0
    /* JADX INFO: renamed from: b */
    public final synchronized boolean mo122266b() {
        return vny0.m199082t().m124398e();
    }

    @Override // p149l.gft0
    /* JADX INFO: renamed from: b5 */
    public final void mo122267b5(fjs0 fjs0Var) throws RemoteException {
        this.f159484f.m122764s(fjs0Var);
    }

    @Override // p149l.gft0
    /* JADX INFO: renamed from: j6 */
    public final void mo122268j6(@Nullable String str, uyl uylVar) {
        String strM12297R;
        Runnable runnable;
        m7s0.m153417a(this.f159479a);
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132124X3)).booleanValue()) {
            try {
                vny0.m199080r();
                strM12297R = C2075b.m12297R(this.f159479a);
            } catch (RemoteException e) {
                vny0.m199079q().m212290w(e, "NonagonMobileAdsSettingManager_AppId");
                strM12297R = "";
            }
        } else {
            strM12297R = "";
        }
        boolean z = true;
        String str2 = true == TextUtils.isEmpty(strM12297R) ? str : strM12297R;
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        boolean zBooleanValue = ((Boolean) d1s0.m109677c().m144697a(m7s0.f132052R3)).booleanValue();
        x6s0 x6s0Var = m7s0.f132037Q0;
        boolean zBooleanValue2 = zBooleanValue | ((Boolean) d1s0.m109677c().m144697a(x6s0Var)).booleanValue();
        if (((Boolean) d1s0.m109677c().m144697a(x6s0Var)).booleanValue()) {
            final Runnable runnable2 = (Runnable) s050.m181847P2(uylVar);
            runnable = new Runnable() { // from class: l.pht0
                @Override // java.lang.Runnable
                public final void run() {
                    rmw0 rmw0Var = i3t0.f111376e;
                    final rht0 rht0Var = this.f149051a;
                    final Runnable runnable3 = runnable2;
                    rmw0Var.execute(new Runnable() { // from class: l.qht0
                        @Override // java.lang.Runnable
                        public final void run() {
                            rht0Var.m179465o8(runnable3);
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
            vny0.m199065c().m199909a(this.f159479a, this.f159480b, str2, runnable3, this.f159489k);
        }
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m179464k() {
        this.f159488j.m197649a(new BinderC2146g1());
    }

    @VisibleForTesting
    /* JADX INFO: renamed from: o8 */
    public final void m179465o8(Runnable runnable) {
        Preconditions.checkMainThread("Adapters must be initialized on the main thread.");
        Map mapM182046e = vny0.m199079q().m212279i().zzh().m182046e();
        if (mapM182046e.isEmpty()) {
            return;
        }
        if (runnable != null) {
            try {
                runnable.run();
            } catch (Throwable th) {
                x2t0.m206870h("Could not initialize rewarded ads.", th);
                return;
            }
        }
        if (this.f159481c.m102564d()) {
            HashMap map = new HashMap();
            Iterator it = mapM182046e.values().iterator();
            while (it.hasNext()) {
                for (hns0 hns0Var : ((ins0) it.next()).f114039a) {
                    String str = hns0Var.f108692k;
                    for (String str2 : hns0Var.f108684c) {
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
                    m3v0 m3v0VarMo148409a = this.f159482d.mo148409a(str3, jSONObject);
                    if (m3v0VarMo148409a != null) {
                        lzv0 lzv0Var = (lzv0) m3v0VarMo148409a.f131187b;
                        if (!lzv0Var.m152373c() && lzv0Var.m152372b()) {
                            lzv0Var.m152385o(this.f159479a, (q5v0) m3v0VarMo148409a.f131188c, (List) entry.getValue());
                            x2t0.m206864b("Initialized rewarded video mediation adapter " + str3);
                        }
                    }
                } catch (zzfho e) {
                    x2t0.m206870h("Failed to initialize rewarded video mediation adapter \"" + str3 + "\"", e);
                }
            }
        }
    }

    @Override // p149l.gft0
    /* JADX INFO: renamed from: p6 */
    public final void mo122269p6(String str) {
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132335n9)).booleanValue()) {
            vny0.m199079q().m212292y(str);
        }
    }

    @Override // p149l.gft0
    /* JADX INFO: renamed from: u4 */
    public final synchronized void mo122270u4(boolean z) {
        vny0.m199082t().m124396c(z);
    }

    @VisibleForTesting
    public final void zzb() {
        if (vny0.m199079q().m212279i().mo96949h()) {
            String strZzl = vny0.m199079q().m212279i().zzl();
            if (vny0.m199083u().m211397j(this.f159479a, strZzl, this.f159480b.zza)) {
                return;
            }
            vny0.m199079q().m212279i().mo96942a(false);
            vny0.m199079q().m212279i().mo96944c("");
        }
    }

    public final /* synthetic */ void zzd() {
        szv0.m186801b(this.f159479a, true);
    }

    @Override // p149l.gft0
    public final synchronized float zze() {
        return vny0.m199082t().m124395a();
    }

    @Override // p149l.gft0
    public final String zzf() {
        return this.f159480b.zza;
    }

    @Override // p149l.gft0
    public final List zzg() throws RemoteException {
        return this.f159484f.m122756g();
    }

    @Override // p149l.gft0
    public final void zzi() {
        this.f159484f.m122757l();
    }

    @Override // p149l.gft0
    public final synchronized void zzk() {
        if (this.f159492n) {
            x2t0.m206869g("Mobile ads is initialized already.");
            return;
        }
        m7s0.m153417a(this.f159479a);
        this.f159491m.m158161a();
        vny0.m199079q().m212288u(this.f159479a, this.f159480b);
        vny0.m199067e().m100029i(this.f159479a);
        this.f159492n = true;
        this.f159484f.m122763r();
        this.f159483e.m125338e();
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132076T3)).booleanValue()) {
            this.f159486h.m126919c();
        }
        this.f159487i.m113345g();
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132192c9)).booleanValue()) {
            i3t0.f111372a.execute(new Runnable() { // from class: l.mht0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f133909a.zzb();
                }
            });
        }
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f132413ta)).booleanValue()) {
            i3t0.f111372a.execute(new Runnable() { // from class: l.oht0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f144047a.m179464k();
                }
            });
        }
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131919G2)).booleanValue()) {
            i3t0.f111372a.execute(new Runnable() { // from class: l.nht0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f139033a.zzd();
                }
            });
        }
    }
}
