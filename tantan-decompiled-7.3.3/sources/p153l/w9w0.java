package p153l;

import android.location.Location;
import android.os.Bundle;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.google.android.gms.ads.internal.client.zzl;
import com.google.android.gms.ads.internal.client.zzw;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes6.dex */
public final class w9w0 implements v9w0 {

    /* JADX INFO: renamed from: a */
    public final Object[] f188069a;

    public w9w0(zzl zzlVar, String str, int i, String str2, zzw zzwVar) {
        HashSet hashSet = new HashSet(Arrays.asList(str2.split(Constants.SEPARATOR_COMMA)));
        ArrayList arrayList = new ArrayList();
        arrayList.add(str2);
        arrayList.add(str);
        if (hashSet.contains("networkType")) {
            arrayList.add(Integer.valueOf(i));
        }
        if (hashSet.contains("birthday")) {
            arrayList.add(Long.valueOf(zzlVar.zzb));
        }
        if (hashSet.contains("extras")) {
            arrayList.add(m205631a(zzlVar.zzc));
        } else if (hashSet.contains("npa")) {
            arrayList.add(zzlVar.zzc.getString("npa"));
        }
        if (hashSet.contains("gender")) {
            arrayList.add(Integer.valueOf(zzlVar.zzd));
        }
        if (hashSet.contains("keywords")) {
            List list = zzlVar.zze;
            if (list != null) {
                arrayList.add(list.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("isTestDevice")) {
            arrayList.add(Boolean.valueOf(zzlVar.zzf));
        }
        if (hashSet.contains("tagForChildDirectedTreatment")) {
            arrayList.add(Integer.valueOf(zzlVar.zzg));
        }
        if (hashSet.contains("manualImpressionsEnabled")) {
            arrayList.add(Boolean.valueOf(zzlVar.zzh));
        }
        if (hashSet.contains("publisherProvidedId")) {
            arrayList.add(zzlVar.zzi);
        }
        if (hashSet.contains("location")) {
            Location location = zzlVar.zzk;
            if (location != null) {
                arrayList.add(location.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("contentUrl")) {
            arrayList.add(zzlVar.zzl);
        }
        if (hashSet.contains("networkExtras")) {
            arrayList.add(m205631a(zzlVar.zzm));
        }
        if (hashSet.contains("customTargeting")) {
            arrayList.add(m205631a(zzlVar.zzn));
        }
        if (hashSet.contains("categoryExclusions")) {
            List list2 = zzlVar.zzo;
            if (list2 != null) {
                arrayList.add(list2.toString());
            } else {
                arrayList.add(null);
            }
        }
        if (hashSet.contains("requestAgent")) {
            arrayList.add(zzlVar.zzp);
        }
        if (hashSet.contains("requestPackage")) {
            arrayList.add(zzlVar.zzq);
        }
        if (hashSet.contains("isDesignedForFamilies")) {
            arrayList.add(Boolean.valueOf(zzlVar.zzr));
        }
        if (hashSet.contains("tagForUnderAgeOfConsent")) {
            arrayList.add(Integer.valueOf(zzlVar.zzt));
        }
        if (hashSet.contains("maxAdContentRating")) {
            arrayList.add(zzlVar.zzu);
        }
        if (hashSet.contains(Constants.KEY_ORIENTATION)) {
            if (zzwVar != null) {
                arrayList.add(Integer.valueOf(zzwVar.zza));
            } else {
                arrayList.add(null);
            }
        }
        this.f188069a = arrayList.toArray();
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static String m205631a(@Nullable Bundle bundle) {
        String strM205631a;
        if (bundle == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        while (it.hasNext()) {
            Object obj = bundle.get((String) it.next());
            if (obj == null) {
                strM205631a = "null";
            } else {
                strM205631a = obj instanceof Bundle ? m205631a((Bundle) obj) : obj.toString();
            }
            sb.append(strM205631a);
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w9w0) {
            return Arrays.equals(this.f188069a, ((w9w0) obj).f188069a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f188069a);
    }

    public final String toString() {
        Object[] objArr = this.f188069a;
        return "[PoolKey#" + Arrays.hashCode(objArr) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + Arrays.toString(objArr) + Constants.AES_SUFFIX;
    }
}
