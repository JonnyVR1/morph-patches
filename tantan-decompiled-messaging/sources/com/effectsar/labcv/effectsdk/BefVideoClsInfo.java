package com.effectsar.labcv.effectsdk;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public class BefVideoClsInfo {
    BefVideoClsType[] classes;
    int n_classes;

    public static class BefVideoClsType {
        float confidence;

        /* JADX INFO: renamed from: id */
        int f5850id;
        float thres;

        public float getConfidence() {
            return this.confidence;
        }

        public int getId() {
            return this.f5850id;
        }

        public float getThres() {
            return this.thres;
        }

        public String toString() {
            return "BefVideoClsType{id=" + this.f5850id + ", confidence=" + this.confidence + ", thres=" + this.thres + '}';
        }
    }

    public BefVideoClsType[] getClasses() {
        return this.classes;
    }

    public int getN_classes() {
        return this.n_classes;
    }

    public String toString() {
        return "BefVideoClsInfo{n_classes=" + this.n_classes + ", classes=" + Arrays.toString(this.classes) + '}';
    }

    public BefVideoClsType[] topN(int i) {
        ArrayList arrayList = new ArrayList();
        Arrays.sort(this.classes, new Comparator<BefVideoClsType>() { // from class: com.effectsar.labcv.effectsdk.BefVideoClsInfo.1
            @Override // java.util.Comparator
            public int compare(BefVideoClsType befVideoClsType, BefVideoClsType befVideoClsType2) {
                float f = befVideoClsType2.confidence - befVideoClsType.confidence;
                if (f > 0.0f) {
                    return 1;
                }
                return f < 0.0f ? -1 : 0;
            }
        });
        for (int i2 = 0; i2 < i; i2++) {
            BefVideoClsType[] befVideoClsTypeArr = this.classes;
            if (i2 >= befVideoClsTypeArr.length) {
                break;
            }
            BefVideoClsType befVideoClsType = befVideoClsTypeArr[i2];
            if (befVideoClsType.confidence > befVideoClsType.thres) {
                arrayList.add(befVideoClsType);
            }
        }
        return (BefVideoClsType[]) arrayList.toArray(new BefVideoClsType[0]);
    }
}
