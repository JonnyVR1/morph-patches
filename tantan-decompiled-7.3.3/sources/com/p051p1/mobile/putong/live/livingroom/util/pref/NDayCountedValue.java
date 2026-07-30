package com.p051p1.mobile.putong.live.livingroom.util.pref;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;
import p153l.d3t;
import p153l.hxd0;
import p153l.jyb;
import p153l.pxd0;
import p153l.yau;
import p153l.zrv;

/* JADX INFO: loaded from: classes5.dex */
public class NDayCountedValue {

    /* JADX INFO: renamed from: a */
    public final String f52669a;

    /* JADX INFO: renamed from: b */
    public final pxd0<CountData> f52670b;

    public static final class CountData implements pxd0.InterfaceC19463a<CountData>, Serializable {
        private static final int MAX_SIZE = 31;
        private TreeMap<String, Integer> treeMap;

        private CountData(TreeMap<String, Integer> treeMap) {
            this.treeMap = treeMap;
        }

        @Override // p153l.pxd0.InterfaceC19463a
        public void nullCheck() {
            if (this.treeMap == null) {
                this.treeMap = new TreeMap<>();
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p153l.pxd0.InterfaceC19463a
        public CountData trimAndCopy() {
            d3t.m113901d(this.treeMap, 31, false);
            return new CountData(this.treeMap);
        }
    }

    public NDayCountedValue(String str, boolean z) {
        String str2;
        if (z) {
            str2 = "";
        } else {
            str2 = "_" + zrv.f205799a.m207631D0();
        }
        this.f52669a = getClass().getSimpleName() + str;
        this.f52670b = new pxd0<>(CountData.class, str + "_saved_count" + str2, new CountData(new TreeMap()), true, hxd0.DEFAULT_FILE_NAME);
    }

    /* JADX INFO: renamed from: a */
    public void m77528a() {
        String strM214945m = yau.m214945m();
        CountData countData = (CountData) this.f52670b.m174216a();
        if (countData.treeMap.containsKey(strM214945m)) {
            countData.treeMap.put(strM214945m, Integer.valueOf(((Integer) countData.treeMap.get(strM214945m)).intValue() + 1));
        } else {
            countData.treeMap.put(strM214945m, 1);
        }
        this.f52670b.m174217b(countData);
    }

    /* JADX INFO: renamed from: b */
    public int m77529b(int i) {
        int iIntValue = 0;
        if (i <= 0) {
            return 0;
        }
        Iterator it = d3t.m113900c(((CountData) this.f52670b.m174216a()).treeMap, yau.m214944l(i - 1), yau.m214945m()).values().iterator();
        while (it.hasNext()) {
            iIntValue += ((Integer) it.next()).intValue();
        }
        return iIntValue;
    }

    /* JADX INFO: renamed from: c */
    public int m77530c() {
        String strM214945m = yau.m214945m();
        CountData countData = (CountData) this.f52670b.m174216a();
        if (countData.treeMap.containsKey(strM214945m)) {
            return ((Integer) countData.treeMap.get(strM214945m)).intValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public int m77531d() {
        return jyb.m147513i0(new ArrayList(((CountData) this.f52670b.m174216a()).treeMap.values()));
    }
}
