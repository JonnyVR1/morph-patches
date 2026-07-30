package p149l;

import android.os.Bundle;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.InterfaceC1863e;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.xiaomi.push.service.C14864f;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class oi3 {
    /* JADX INFO: renamed from: a */
    public static HashMap<String, String> m164492a(Bundle bundle) {
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
    public static ImmutableMap<String, String> m164493b(Bundle bundle) {
        return bundle == Bundle.EMPTY ? ImmutableMap.m15715of() : ImmutableMap.copyOf((Map) m164492a(bundle));
    }

    /* JADX INFO: renamed from: c */
    public static void m164494c(@Nullable Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader((ClassLoader) vck0.m197866j(oi3.class.getClassLoader()));
        }
    }

    /* JADX INFO: renamed from: d */
    public static <T extends InterfaceC1863e> ImmutableList<T> m164495d(InterfaceC1863e.a<T> aVar, List<Bundle> list) {
        ImmutableList.C2781a c2781aBuilder = ImmutableList.builder();
        for (int i = 0; i < list.size(); i++) {
            c2781aBuilder.mo15683a(aVar.mo9980a((Bundle) p11.m167011e(list.get(i))));
        }
        return c2781aBuilder.m15702m();
    }

    /* JADX INFO: renamed from: e */
    public static <T extends InterfaceC1863e> SparseArray<T> m164496e(InterfaceC1863e.a<T> aVar, SparseArray<Bundle> sparseArray) {
        C14864f.AnonymousClass2 anonymousClass2 = (SparseArray<T>) new SparseArray(sparseArray.size());
        for (int i = 0; i < sparseArray.size(); i++) {
            anonymousClass2.put(sparseArray.keyAt(i), aVar.mo9980a(sparseArray.valueAt(i)));
        }
        return anonymousClass2;
    }

    /* JADX INFO: renamed from: f */
    public static Bundle m164497f(Bundle bundle, String str, Bundle bundle2) {
        Bundle bundle3 = bundle.getBundle(str);
        return bundle3 != null ? bundle3 : bundle2;
    }

    /* JADX INFO: renamed from: g */
    public static ArrayList<Integer> m164498g(Bundle bundle, String str, ArrayList<Integer> arrayList) {
        ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(str);
        return integerArrayList != null ? integerArrayList : arrayList;
    }

    /* JADX INFO: renamed from: h */
    public static Bundle m164499h(Map<String, String> map) {
        Bundle bundle = new Bundle();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            bundle.putString(entry.getKey(), entry.getValue());
        }
        return bundle;
    }

    /* JADX INFO: renamed from: i */
    public static <T extends InterfaceC1863e> ArrayList<Bundle> m164500i(Collection<T> collection) {
        ArrayList<Bundle> arrayList = new ArrayList<>(collection.size());
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toBundle());
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: j */
    public static <T extends InterfaceC1863e> SparseArray<Bundle> m164501j(SparseArray<T> sparseArray) {
        SparseArray<Bundle> sparseArray2 = new SparseArray<>(sparseArray.size());
        for (int i = 0; i < sparseArray.size(); i++) {
            sparseArray2.put(sparseArray.keyAt(i), sparseArray.valueAt(i).toBundle());
        }
        return sparseArray2;
    }
}
