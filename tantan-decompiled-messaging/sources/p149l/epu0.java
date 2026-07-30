package p149l;

import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.JsonReader;
import com.appsflyer.AdRevenueScheme;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.C2075b;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class epu0 extends bis0 {

    /* JADX INFO: renamed from: a */
    public final hpu0 f92714a;

    /* JADX INFO: renamed from: b */
    public final cpu0 f92715b;

    /* JADX INFO: renamed from: c */
    public final Map f92716c = new HashMap();

    public epu0(hpu0 hpu0Var, cpu0 cpu0Var) {
        this.f92714a = hpu0Var;
        this.f92715b = cpu0Var;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: o8 */
    public static zzl m117685o8(Map map) {
        o4y0 o4y0Var = new o4y0();
        String str = (String) map.get("ad_request");
        if (str == null) {
            return o4y0Var.m162735a();
        }
        JsonReader jsonReader = new JsonReader(new StringReader(Uri.decode(str)));
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                String strNextName = jsonReader.nextName();
                switch (strNextName.hashCode()) {
                    case -1289032093:
                        if (!strNextName.equals("extras")) {
                            jsonReader.skipValue();
                        } else {
                            jsonReader.beginObject();
                            Bundle bundle = new Bundle();
                            while (jsonReader.hasNext()) {
                                bundle.putString(jsonReader.nextName(), jsonReader.nextString());
                            }
                            jsonReader.endObject();
                            o4y0Var.m162736b(bundle);
                        }
                        break;
                    case -839117230:
                        if (!strNextName.equals("isTestDevice")) {
                            jsonReader.skipValue();
                        } else {
                            o4y0Var.m162738d(jsonReader.nextBoolean());
                        }
                        break;
                    case -733436947:
                        if (!strNextName.equals("tagForUnderAgeOfConsent")) {
                            jsonReader.skipValue();
                        } else if (!jsonReader.nextBoolean()) {
                            o4y0Var.m162742h(0);
                        } else {
                            o4y0Var.m162742h(1);
                        }
                        break;
                    case -99890337:
                        if (!strNextName.equals("httpTimeoutMillis")) {
                            jsonReader.skipValue();
                        } else {
                            o4y0Var.m162737c(jsonReader.nextInt());
                        }
                        break;
                    case 523149226:
                        if (!strNextName.equals("keywords")) {
                            jsonReader.skipValue();
                        } else {
                            jsonReader.beginArray();
                            ArrayList arrayList = new ArrayList();
                            while (jsonReader.hasNext()) {
                                arrayList.add(jsonReader.nextString());
                            }
                            jsonReader.endArray();
                            o4y0Var.m162739e(arrayList);
                        }
                        break;
                    case 597632527:
                        if (!strNextName.equals("maxAdContentRating")) {
                            jsonReader.skipValue();
                        } else {
                            String strNextString = jsonReader.nextString();
                            if (RequestConfiguration.f9640f.contains(strNextString)) {
                                o4y0Var.m162740f(strNextString);
                            }
                        }
                        break;
                    case 1411582723:
                        if (!strNextName.equals("tagForChildDirectedTreatment")) {
                            jsonReader.skipValue();
                        } else if (!jsonReader.nextBoolean()) {
                            o4y0Var.m162741g(0);
                        } else {
                            o4y0Var.m162741g(1);
                        }
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
        } catch (IOException unused) {
            x2t0.m206864b("Ad Request json was malformed, parsing ended early.");
        }
        zzl zzlVarM162735a = o4y0Var.m162735a();
        Bundle bundle2 = zzlVarM162735a.zzm.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle2 == null) {
            bundle2 = zzlVarM162735a.zzc;
            zzlVarM162735a.zzm.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundle2);
        }
        return new zzl(zzlVarM162735a.zza, zzlVarM162735a.zzb, bundle2, zzlVarM162735a.zzd, zzlVarM162735a.zze, zzlVarM162735a.zzf, zzlVarM162735a.zzg, zzlVarM162735a.zzh, zzlVarM162735a.zzi, zzlVarM162735a.zzj, zzlVarM162735a.zzk, zzlVarM162735a.zzl, zzlVarM162735a.zzm, zzlVarM162735a.zzn, zzlVarM162735a.zzo, zzlVarM162735a.zzp, zzlVarM162735a.zzq, zzlVarM162735a.zzr, zzlVarM162735a.zzs, zzlVarM162735a.zzt, zzlVarM162735a.zzu, zzlVarM162735a.zzv, zzlVarM162735a.zzw, zzlVarM162735a.zzx, zzlVarM162735a.zzy);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p149l.cis0
    /* JADX INFO: renamed from: i */
    public final void mo107097i(String str) throws RemoteException {
        if (((Boolean) d1s0.m109677c().m144697a(m7s0.f131914F9)).booleanValue()) {
            xsu0.m210834k("Received H5 gmsg: ".concat(String.valueOf(str)));
            Uri uri = Uri.parse(str);
            vny0.m199080r();
            Map mapM12322o = C2075b.m12322o(uri);
            String str2 = (String) mapM12322o.get("action");
            if (TextUtils.isEmpty(str2)) {
                x2t0.m206864b("H5 gmsg did not contain an action");
                return;
            }
            int iHashCode = str2.hashCode();
            if (iHashCode != 579053441) {
                if (iHashCode == 871091088 && str2.equals("initialize")) {
                    this.f92716c.clear();
                    this.f92715b.m108176a();
                    return;
                }
            } else if (str2.equals("dispose_all")) {
                Iterator it = this.f92716c.values().iterator();
                while (it.hasNext()) {
                    ((xou0) it.next()).zza();
                }
                this.f92716c.clear();
                return;
            }
            String str3 = (String) mapM12322o.get("obj_id");
            try {
                Objects.requireNonNull(str3);
                long j = Long.parseLong(str3);
                switch (str2.hashCode()) {
                    case -1790951212:
                        if (str2.equals("show_interstitial_ad")) {
                            xou0 xou0Var = (xou0) this.f92716c.get(Long.valueOf(j));
                            if (xou0Var != null) {
                                xou0Var.zzc();
                                return;
                            } else {
                                x2t0.m206864b("Could not show H5 ad, object ID does not exist");
                                this.f92715b.m108181f(j);
                                return;
                            }
                        }
                        break;
                    case -1266374734:
                        if (str2.equals("show_rewarded_ad")) {
                            xou0 xou0Var2 = (xou0) this.f92716c.get(Long.valueOf(j));
                            if (xou0Var2 != null) {
                                xou0Var2.zzc();
                                return;
                            } else {
                                x2t0.m206864b("Could not show H5 ad, object ID does not exist");
                                this.f92715b.m108192q(j);
                                return;
                            }
                        }
                        break;
                    case -257098725:
                        if (str2.equals("load_rewarded_ad")) {
                            xou0 xou0Var3 = (xou0) this.f92716c.get(Long.valueOf(j));
                            if (xou0Var3 != null) {
                                xou0Var3.mo142759a(m117685o8(mapM12322o));
                                return;
                            } else {
                                x2t0.m206864b("Could not load H5 ad, object ID does not exist");
                                this.f92715b.m108192q(j);
                                return;
                            }
                        }
                        break;
                    case 393881811:
                        if (str2.equals("create_interstitial_ad")) {
                            if (this.f92716c.size() >= ((Integer) d1s0.m109677c().m144697a(m7s0.f131926G9)).intValue()) {
                                x2t0.m206869g("Could not create H5 ad, too many existing objects");
                                this.f92715b.m108184i(j);
                                return;
                            }
                            Map map = this.f92716c;
                            Long lValueOf = Long.valueOf(j);
                            if (map.containsKey(lValueOf)) {
                                x2t0.m206864b("Could not create H5 ad, object ID already exists");
                                this.f92715b.m108184i(j);
                                return;
                            }
                            String str4 = (String) mapM12322o.get(AdRevenueScheme.AD_UNIT);
                            if (TextUtils.isEmpty(str4)) {
                                x2t0.m206869g("Could not create H5 ad, missing ad unit id");
                                this.f92715b.m108184i(j);
                                return;
                            }
                            you0 you0VarZzb = this.f92714a.zzb();
                            you0VarZzb.mo183997a(j);
                            you0VarZzb.zza(str4);
                            this.f92716c.put(lValueOf, you0VarZzb.zzc().zza());
                            this.f92715b.m108183h(j);
                            xsu0.m210834k("Created H5 interstitial #" + j + " with ad unit " + str4);
                            return;
                        }
                        break;
                    case 585513149:
                        if (str2.equals("load_interstitial_ad")) {
                            xou0 xou0Var4 = (xou0) this.f92716c.get(Long.valueOf(j));
                            if (xou0Var4 != null) {
                                xou0Var4.mo142759a(m117685o8(mapM12322o));
                                return;
                            } else {
                                x2t0.m206864b("Could not load H5 ad, object ID does not exist");
                                this.f92715b.m108181f(j);
                                return;
                            }
                        }
                        break;
                    case 1671767583:
                        if (str2.equals("dispose")) {
                            Map map2 = this.f92716c;
                            Long lValueOf2 = Long.valueOf(j);
                            xou0 xou0Var5 = (xou0) map2.get(lValueOf2);
                            if (xou0Var5 == null) {
                                x2t0.m206864b("Could not dispose H5 ad, object ID does not exist");
                                return;
                            }
                            xou0Var5.zza();
                            this.f92716c.remove(lValueOf2);
                            xsu0.m210834k("Disposed H5 ad #" + j);
                            return;
                        }
                        break;
                    case 2109237041:
                        if (str2.equals("create_rewarded_ad")) {
                            if (this.f92716c.size() >= ((Integer) d1s0.m109677c().m144697a(m7s0.f131926G9)).intValue()) {
                                x2t0.m206869g("Could not create H5 ad, too many existing objects");
                                this.f92715b.m108184i(j);
                                return;
                            }
                            Map map3 = this.f92716c;
                            Long lValueOf3 = Long.valueOf(j);
                            if (map3.containsKey(lValueOf3)) {
                                x2t0.m206864b("Could not create H5 ad, object ID already exists");
                                this.f92715b.m108184i(j);
                                return;
                            }
                            String str5 = (String) mapM12322o.get(AdRevenueScheme.AD_UNIT);
                            if (TextUtils.isEmpty(str5)) {
                                x2t0.m206869g("Could not create H5 ad, missing ad unit id");
                                this.f92715b.m108184i(j);
                                return;
                            }
                            you0 you0VarZzb2 = this.f92714a.zzb();
                            you0VarZzb2.mo183997a(j);
                            you0VarZzb2.zza(str5);
                            this.f92716c.put(lValueOf3, you0VarZzb2.zzc().zzb());
                            this.f92715b.m108183h(j);
                            xsu0.m210834k("Created H5 rewarded #" + j + " with ad unit " + str5);
                            return;
                        }
                        break;
                }
                x2t0.m206864b("H5 gmsg contained invalid action: ".concat(str2));
            } catch (NullPointerException | NumberFormatException unused) {
                x2t0.m206864b("H5 gmsg did not contain a valid object id: ".concat(String.valueOf(str3)));
            }
        }
    }

    @Override // p149l.cis0
    public final void zze() {
        this.f92716c.clear();
    }
}
