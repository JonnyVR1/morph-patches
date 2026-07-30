package p153l;

import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.JsonReader;
import com.appsflyer.AdRevenueScheme;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.util.C2098b;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes6.dex */
public final class kyu0 extends hrs0 {

    /* JADX INFO: renamed from: a */
    public final nyu0 f129357a;

    /* JADX INFO: renamed from: b */
    public final iyu0 f129358b;

    /* JADX INFO: renamed from: c */
    public final Map f129359c = new HashMap();

    public kyu0(nyu0 nyu0Var, iyu0 iyu0Var) {
        this.f129357a = nyu0Var;
        this.f129358b = iyu0Var;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: o8 */
    public static zzl m152142o8(Map map) {
        udy0 udy0Var = new udy0();
        String str = (String) map.get("ad_request");
        if (str == null) {
            return udy0Var.m195585a();
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
                            udy0Var.m195586b(bundle);
                        }
                        break;
                    case -839117230:
                        if (!strNextName.equals("isTestDevice")) {
                            jsonReader.skipValue();
                        } else {
                            udy0Var.m195588d(jsonReader.nextBoolean());
                        }
                        break;
                    case -733436947:
                        if (!strNextName.equals("tagForUnderAgeOfConsent")) {
                            jsonReader.skipValue();
                        } else if (!jsonReader.nextBoolean()) {
                            udy0Var.m195592h(0);
                        } else {
                            udy0Var.m195592h(1);
                        }
                        break;
                    case -99890337:
                        if (!strNextName.equals("httpTimeoutMillis")) {
                            jsonReader.skipValue();
                        } else {
                            udy0Var.m195587c(jsonReader.nextInt());
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
                            udy0Var.m195589e(arrayList);
                        }
                        break;
                    case 597632527:
                        if (!strNextName.equals("maxAdContentRating")) {
                            jsonReader.skipValue();
                        } else {
                            String strNextString = jsonReader.nextString();
                            if (RequestConfiguration.f9677f.contains(strNextString)) {
                                udy0Var.m195590f(strNextString);
                            }
                        }
                        break;
                    case 1411582723:
                        if (!strNextName.equals("tagForChildDirectedTreatment")) {
                            jsonReader.skipValue();
                        } else if (!jsonReader.nextBoolean()) {
                            udy0Var.m195591g(0);
                        } else {
                            udy0Var.m195591g(1);
                        }
                        break;
                    default:
                        jsonReader.skipValue();
                        break;
                }
            }
            jsonReader.endObject();
        } catch (IOException unused) {
            dct0.m115293b("Ad Request json was malformed, parsing ended early.");
        }
        zzl zzlVarM195585a = udy0Var.m195585a();
        Bundle bundle2 = zzlVarM195585a.zzm.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle2 == null) {
            bundle2 = zzlVarM195585a.zzc;
            zzlVarM195585a.zzm.putBundle("com.google.ads.mediation.admob.AdMobAdapter", bundle2);
        }
        return new zzl(zzlVarM195585a.zza, zzlVarM195585a.zzb, bundle2, zzlVarM195585a.zzd, zzlVarM195585a.zze, zzlVarM195585a.zzf, zzlVarM195585a.zzg, zzlVarM195585a.zzh, zzlVarM195585a.zzi, zzlVarM195585a.zzj, zzlVarM195585a.zzk, zzlVarM195585a.zzl, zzlVarM195585a.zzm, zzlVarM195585a.zzn, zzlVarM195585a.zzo, zzlVarM195585a.zzp, zzlVarM195585a.zzq, zzlVarM195585a.zzr, zzlVarM195585a.zzs, zzlVarM195585a.zzt, zzlVarM195585a.zzu, zzlVarM195585a.zzv, zzlVarM195585a.zzw, zzlVarM195585a.zzx, zzlVarM195585a.zzy);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p153l.irs0
    /* JADX INFO: renamed from: i */
    public final void mo141849i(String str) throws RemoteException {
        if (((Boolean) jas0.m144075c().m176505a(sgs0.f167985F9)).booleanValue()) {
            d2v0.m113737k("Received H5 gmsg: ".concat(String.valueOf(str)));
            Uri uri = Uri.parse(str);
            bxy0.m106934r();
            Map mapM12376o = C2098b.m12376o(uri);
            String str2 = (String) mapM12376o.get("action");
            if (TextUtils.isEmpty(str2)) {
                dct0.m115293b("H5 gmsg did not contain an action");
                return;
            }
            int iHashCode = str2.hashCode();
            if (iHashCode != 579053441) {
                if (iHashCode == 871091088 && str2.equals("initialize")) {
                    this.f129359c.clear();
                    this.f129358b.m142726a();
                    return;
                }
            } else if (str2.equals("dispose_all")) {
                Iterator it = this.f129359c.values().iterator();
                while (it.hasNext()) {
                    ((dyu0) it.next()).zza();
                }
                this.f129359c.clear();
                return;
            }
            String str3 = (String) mapM12376o.get("obj_id");
            try {
                Objects.requireNonNull(str3);
                long j = Long.parseLong(str3);
                switch (str2.hashCode()) {
                    case -1790951212:
                        if (str2.equals("show_interstitial_ad")) {
                            dyu0 dyu0Var = (dyu0) this.f129359c.get(Long.valueOf(j));
                            if (dyu0Var != null) {
                                dyu0Var.zzc();
                                return;
                            } else {
                                dct0.m115293b("Could not show H5 ad, object ID does not exist");
                                this.f129358b.m142731f(j);
                                return;
                            }
                        }
                        break;
                    case -1266374734:
                        if (str2.equals("show_rewarded_ad")) {
                            dyu0 dyu0Var2 = (dyu0) this.f129359c.get(Long.valueOf(j));
                            if (dyu0Var2 != null) {
                                dyu0Var2.zzc();
                                return;
                            } else {
                                dct0.m115293b("Could not show H5 ad, object ID does not exist");
                                this.f129358b.m142742q(j);
                                return;
                            }
                        }
                        break;
                    case -257098725:
                        if (str2.equals("load_rewarded_ad")) {
                            dyu0 dyu0Var3 = (dyu0) this.f129359c.get(Long.valueOf(j));
                            if (dyu0Var3 != null) {
                                dyu0Var3.mo118725a(m152142o8(mapM12376o));
                                return;
                            } else {
                                dct0.m115293b("Could not load H5 ad, object ID does not exist");
                                this.f129358b.m142742q(j);
                                return;
                            }
                        }
                        break;
                    case 393881811:
                        if (str2.equals("create_interstitial_ad")) {
                            if (this.f129359c.size() >= ((Integer) jas0.m144075c().m176505a(sgs0.f167997G9)).intValue()) {
                                dct0.m115298g("Could not create H5 ad, too many existing objects");
                                this.f129358b.m142734i(j);
                                return;
                            }
                            Map map = this.f129359c;
                            Long lValueOf = Long.valueOf(j);
                            if (map.containsKey(lValueOf)) {
                                dct0.m115293b("Could not create H5 ad, object ID already exists");
                                this.f129358b.m142734i(j);
                                return;
                            }
                            String str4 = (String) mapM12376o.get(AdRevenueScheme.AD_UNIT);
                            if (TextUtils.isEmpty(str4)) {
                                dct0.m115298g("Could not create H5 ad, missing ad unit id");
                                this.f129358b.m142734i(j);
                                return;
                            }
                            eyu0 eyu0VarZzb = this.f129357a.zzb();
                            eyu0VarZzb.mo123268a(j);
                            eyu0VarZzb.zza(str4);
                            this.f129359c.put(lValueOf, eyu0VarZzb.zzc().zza());
                            this.f129358b.m142733h(j);
                            d2v0.m113737k("Created H5 interstitial #" + j + " with ad unit " + str4);
                            return;
                        }
                        break;
                    case 585513149:
                        if (str2.equals("load_interstitial_ad")) {
                            dyu0 dyu0Var4 = (dyu0) this.f129359c.get(Long.valueOf(j));
                            if (dyu0Var4 != null) {
                                dyu0Var4.mo118725a(m152142o8(mapM12376o));
                                return;
                            } else {
                                dct0.m115293b("Could not load H5 ad, object ID does not exist");
                                this.f129358b.m142731f(j);
                                return;
                            }
                        }
                        break;
                    case 1671767583:
                        if (str2.equals("dispose")) {
                            Map map2 = this.f129359c;
                            Long lValueOf2 = Long.valueOf(j);
                            dyu0 dyu0Var5 = (dyu0) map2.get(lValueOf2);
                            if (dyu0Var5 == null) {
                                dct0.m115293b("Could not dispose H5 ad, object ID does not exist");
                                return;
                            }
                            dyu0Var5.zza();
                            this.f129359c.remove(lValueOf2);
                            d2v0.m113737k("Disposed H5 ad #" + j);
                            return;
                        }
                        break;
                    case 2109237041:
                        if (str2.equals("create_rewarded_ad")) {
                            if (this.f129359c.size() >= ((Integer) jas0.m144075c().m176505a(sgs0.f167997G9)).intValue()) {
                                dct0.m115298g("Could not create H5 ad, too many existing objects");
                                this.f129358b.m142734i(j);
                                return;
                            }
                            Map map3 = this.f129359c;
                            Long lValueOf3 = Long.valueOf(j);
                            if (map3.containsKey(lValueOf3)) {
                                dct0.m115293b("Could not create H5 ad, object ID already exists");
                                this.f129358b.m142734i(j);
                                return;
                            }
                            String str5 = (String) mapM12376o.get(AdRevenueScheme.AD_UNIT);
                            if (TextUtils.isEmpty(str5)) {
                                dct0.m115298g("Could not create H5 ad, missing ad unit id");
                                this.f129358b.m142734i(j);
                                return;
                            }
                            eyu0 eyu0VarZzb2 = this.f129357a.zzb();
                            eyu0VarZzb2.mo123268a(j);
                            eyu0VarZzb2.zza(str5);
                            this.f129359c.put(lValueOf3, eyu0VarZzb2.zzc().zzb());
                            this.f129358b.m142733h(j);
                            d2v0.m113737k("Created H5 rewarded #" + j + " with ad unit " + str5);
                            return;
                        }
                        break;
                }
                dct0.m115293b("H5 gmsg contained invalid action: ".concat(str2));
            } catch (NullPointerException | NumberFormatException unused) {
                dct0.m115293b("H5 gmsg did not contain a valid object id: ".concat(String.valueOf(str3)));
            }
        }
    }

    @Override // p153l.irs0
    public final void zze() {
        this.f129359c.clear();
    }
}
