package p153l;

import android.os.Bundle;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.InterfaceC1886e;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.xiaomi.push.service.C15012f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class cj3 {
    /* JADX INFO: renamed from: a */
    public static HashMap<String, String> m110051a(Bundle bundle) {
        HashMap<String, String> map = new HashMap<>();
        if (bundle != Bundle.EMPTY) {
            for (String str : bundle.keySet()) {
                String string = bundle.getString(str);
                if (string != null) {
                    map.put(str, string);
                }
            }
        }
        return map;
    }

    /* JADX INFO: renamed from: b */
    public static ImmutableMap<String, String> m110052b(Bundle bundle) {
        return bundle == Bundle.EMPTY ? ImmutableMap.m15769of() : ImmutableMap.copyOf((Map) m110051a(bundle));
    }

    /* JADX INFO: renamed from: c */
    public static void m110053c(@Nullable Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader((ClassLoader) bmk0.m105144j(cj3.class.getClassLoader()));
        }
    }

    /* JADX INFO: renamed from: d */
    public static <T extends InterfaceC1886e> ImmutableList<T> m110054d(InterfaceC1886e.a<T> aVar, List<Bundle> list) {
        ImmutableList.C2804a c2804aBuilder = ImmutableList.builder();
        for (int i = 0; i < list.size(); i++) {
            c2804aBuilder.mo15737a(aVar.mo10034a((Bundle) w11.m204369e(list.get(i))));
        }
        return c2804aBuilder.m15756m();
    }

    /* JADX INFO: renamed from: e */
    public static <T extends InterfaceC1886e> SparseArray<T> m110055e(InterfaceC1886e.a<T> aVar, SparseArray<Bundle> sparseArray) {
        C15012f.AnonymousClass2 anonymousClass2 = (SparseArray<T>) new SparseArray(sparseArray.size());
        for (int i = 0; i < sparseArray.size(); i++) {
            anonymousClass2.put(sparseArray.keyAt(i), aVar.mo10034a(sparseArray.valueAt(i)));
        }
        return anonymousClass2;
    }

    /* JADX INFO: renamed from: f */
    public static Bundle m110056f(Bundle bundle, String str, Bundle bundle2) {
        Bundle bundle3 = bundle.getBundle(str);
        return bundle3 != null ? bundle3 : bundle2;
    }

    /* JADX INFO: renamed from: g */
    public static ArrayList<Integer> m110057g(Bundle bundle, String str, ArrayList<Integer> arrayList) {
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(str);
        return integerArrayList != null ? integerArrayList : arrayList;
    }

    /* JADX INFO: renamed from: h */
    public static Bundle m110058h(Map<String, String> map) {
        Bundle bundle = new Bundle();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            bundle.putString(entry.getKey(), entry.getValue());
        }
        return bundle;
    }

    /* JADX INFO: renamed from: i */
    public static <T extends InterfaceC1886e> ArrayList<Bundle> m110059i(Collection<T> collection) {
        ArrayList<Bundle> arrayList = new ArrayList<>(collection.size());
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toBundle());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: j */
    public static <T extends InterfaceC1886e> SparseArray<Bundle> m110060j(SparseArray<T> sparseArray) {
        SparseArray<Bundle> sparseArray2 = new SparseArray<>(sparseArray.size());
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), sparseArray.valueAt(i).toBundle());
        }
        return sparseArray2;
    }
}
