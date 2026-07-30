package p149l;

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
public final class q0w0 implements p0w0 {

    /* JADX INFO: renamed from: a */
    public final Object[] f152086a;

    public q0w0(zzl zzlVar, String str, int i, String str2, zzw zzwVar) {
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
            arrayList.add(m172362a(zzlVar.zzc));
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
            arrayList.add(m172362a(zzlVar.zzm));
        }
        if (hashSet.contains("customTargeting")) {
            arrayList.add(m172362a(zzlVar.zzn));
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
        this.f152086a = arrayList.toArray();
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static String m172362a(@Nullable Bundle bundle) {
        String strM172362a;
        if (bundle == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        Iterator it = new TreeSet(bundle.keySet()).iterator();
        while (it.hasNext()) {
            Object obj = bundle.get((String) it.next());
            if (obj == null) {
                strM172362a = "null";
            } else {
                strM172362a = obj instanceof Bundle ? m172362a((Bundle) obj) : obj.toString();
            }
            sb.append(strM172362a);
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q0w0) {
            return Arrays.equals(this.f152086a, ((q0w0) obj).f152086a);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f152086a);
    }

    public final String toString() {
        Object[] objArr = this.f152086a;
        return "[PoolKey#" + Arrays.hashCode(objArr) + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + Arrays.toString(objArr) + Constants.AES_SUFFIX;
    }
}
