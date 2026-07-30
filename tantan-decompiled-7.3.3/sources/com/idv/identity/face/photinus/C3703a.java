package com.idv.identity.face.photinus;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.idv.identity.face.photinus.a */
/* JADX INFO: loaded from: classes7.dex */
final class C3703a {
    /* JADX INFO: renamed from: a */
    public static int[] m18677a(List<Integer> list) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = list.get(i).intValue();
        }
        return iArr;
    }

    /* JADX INFO: renamed from: b */
    public static int m18678b(int i, int i2, float f) {
        if (i == i2) {
            return i;
        }
        float f2 = 1.0f - f;
        return Color.rgb((int) ((Color.red(i) * f2) + (Color.red(i2) * f)), (int) ((Color.green(i) * f2) + (Color.green(i2) * f)), (int) ((Color.blue(i) * f2) + (Color.blue(i2) * f)));
    }

    /* JADX INFO: renamed from: c */
    public static List<Integer> m18679c(List<Integer> list, int i) {
        if (i <= 0) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        int i2 = i + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            arrayList.add(Integer.valueOf(m18678b(-1, -7829368, i3 / i2)));
        }
        arrayList.addAll(list);
        for (int i4 = 0; i4 < i2; i4++) {
            arrayList.add(Integer.valueOf(m18678b(-7829368, -1, i4 / i2)));
        }
        return arrayList;
    }
}
