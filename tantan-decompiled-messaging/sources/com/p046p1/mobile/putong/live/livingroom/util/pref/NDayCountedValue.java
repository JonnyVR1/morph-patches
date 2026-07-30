package com.p046p1.mobile.putong.live.livingroom.util.pref;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TreeMap;
import p149l.c1t;
import p149l.fpd0;
import p149l.npd0;
import p149l.vwb;
import p149l.x8u;
import p149l.ypv;

/* JADX INFO: loaded from: classes5.dex */
public class NDayCountedValue {

    /* JADX INFO: renamed from: a */
    public final String f51821a;

    /* JADX INFO: renamed from: b */
    public final npd0<CountData> f51822b;

    public static final class CountData implements npd0.InterfaceC18745a<CountData>, Serializable {
        private static final int MAX_SIZE = 31;
        private TreeMap<String, Integer> treeMap;

        private CountData(TreeMap<String, Integer> treeMap) {
            this.treeMap = treeMap;
        }

        @Override // p149l.npd0.InterfaceC18745a
        public void nullCheck() {
            if (this.treeMap == null) {
                this.treeMap = new TreeMap<>();
            }
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p149l.npd0.InterfaceC18745a
        public CountData trimAndCopy() {
            c1t.m104879d(this.treeMap, 31, false);
            return new CountData(this.treeMap);
        }
    }

    public NDayCountedValue(String str, boolean z) {
        String str2;
        if (z) {
            str2 = "";
        } else {
            str2 = "_" + ypv.f199493a.m199309D0();
        }
        this.f51821a = getClass().getSimpleName() + str;
        this.f51822b = new npd0<>(CountData.class, str + "_saved_count" + str2, new CountData(new TreeMap()), true, fpd0.DEFAULT_FILE_NAME);
    }

    /* JADX INFO: renamed from: a */
    public void m76345a() {
        String strM207443m = x8u.m207443m();
        CountData countData = (CountData) this.f51822b.m160473a();
        if (countData.treeMap.containsKey(strM207443m)) {
            countData.treeMap.put(strM207443m, Integer.valueOf(((Integer) countData.treeMap.get(strM207443m)).intValue() + 1));
        } else {
            countData.treeMap.put(strM207443m, 1);
        }
        this.f51822b.m160474b(countData);
    }

    /* JADX INFO: renamed from: b */
    public int m76346b(int i) {
        int iIntValue = 0;
        if (i <= 0) {
            return 0;
        }
        Iterator it = c1t.m104878c(((CountData) this.f51822b.m160473a()).treeMap, x8u.m207442l(i - 1), x8u.m207443m()).values().iterator();
        while (it.hasNext()) {
            iIntValue += ((Integer) it.next()).intValue();
        }
        return iIntValue;
    }

    /* JADX INFO: renamed from: c */
    public int m76347c() {
        String strM207443m = x8u.m207443m();
        CountData countData = (CountData) this.f51822b.m160473a();
        if (countData.treeMap.containsKey(strM207443m)) {
            return ((Integer) countData.treeMap.get(strM207443m)).intValue();
        }
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public int m76348d() {
        return vwb.m200330i0(new ArrayList(((CountData) this.f51822b.m160473a()).treeMap.values()));
    }
}
