package com.effectsar.labcv.effectsdk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public class BefC2Info {
    BefC2CategoryItem[] items;
    int n_classes;

    public static class BefC2CategoryItem {
        float confidence;

        /* JADX INFO: renamed from: id */
        int f5818id;
        int index;
        boolean satisfied;
        float thres;

        public float getConfidence() {
            return this.confidence;
        }

        public int getId() {
            return this.f5818id;
        }

        public int getIndex() {
            return this.index;
        }

        public float getThres() {
            return this.thres;
        }

        public boolean isSatisfied() {
            return this.satisfied;
        }

        public String toString() {
            return "BefC2CategoryItem{index=" + this.index + ", id=" + this.f5818id + ", confidence=" + this.confidence + ", thres=" + this.thres + ", satisfied=" + this.satisfied + '}';
        }
    }

    public BefC2CategoryItem[] getItems() {
        return this.items;
    }

    public int getN_classes() {
        return this.n_classes;
    }

    public String toString() {
        return "BefC2Info{n_classes=" + this.n_classes + ", items=" + Arrays.toString(this.items) + '}';
    }

    public BefC2CategoryItem[] topN(int i) {
        Arrays.sort(this.items, new Comparator<BefC2CategoryItem>() { // from class: com.effectsar.labcv.effectsdk.BefC2Info.1
            @Override // java.util.Comparator
            public int compare(BefC2CategoryItem befC2CategoryItem, BefC2CategoryItem befC2CategoryItem2) {
                float f = befC2CategoryItem2.confidence - befC2CategoryItem.confidence;
                if (f > 0.0f) {
                    return 1;
                }
                return f < 0.0f ? -1 : 0;
            }
        });
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            BefC2CategoryItem befC2CategoryItem = this.items[i2];
            if (befC2CategoryItem.confidence > befC2CategoryItem.thres) {
                arrayList.add(befC2CategoryItem);
            }
        }
        return (BefC2CategoryItem[]) arrayList.toArray(new BefC2CategoryItem[0]);
    }
}
