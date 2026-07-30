package com.effectsar.labcv.effectsdk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public class BefC1Info {
    BefC1CategoryItem[] items;

    public static class BefC1CategoryItem {

        /* JADX INFO: renamed from: id */
        int f5854id;
        float prob;
        boolean satisfied;

        public int getId() {
            return this.f5854id;
        }

        public float getProb() {
            return this.prob;
        }

        public boolean isSatisfied() {
            return this.satisfied;
        }

        public String toString() {
            return "BefC1CategoryItem{id=" + this.f5854id + ", prob=" + this.prob + ", satisfied=" + this.satisfied + '}';
        }
    }

    public BefC1CategoryItem[] getItems() {
        return this.items;
    }

    public void setItems(BefC1CategoryItem[] befC1CategoryItemArr) {
        this.items = befC1CategoryItemArr;
    }

    public String toString() {
        return "BefC1Info{items=" + Arrays.toString(this.items) + '}';
    }

    public BefC1CategoryItem[] topN(int i) {
        Arrays.sort(this.items, new Comparator<BefC1CategoryItem>() { // from class: com.effectsar.labcv.effectsdk.BefC1Info.1
            @Override // java.util.Comparator
            public int compare(BefC1CategoryItem befC1CategoryItem, BefC1CategoryItem befC1CategoryItem2) {
                float f = befC1CategoryItem2.prob - befC1CategoryItem.prob;
                if (f > 0.0f) {
                    return 1;
                }
                return f < 0.0f ? -1 : 0;
            }
        });
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            BefC1CategoryItem befC1CategoryItem = this.items[i2];
            if (!befC1CategoryItem.satisfied) {
                break;
            }
            arrayList.add(befC1CategoryItem);
        }
        return (BefC1CategoryItem[]) arrayList.toArray(new BefC1CategoryItem[0]);
    }
}
