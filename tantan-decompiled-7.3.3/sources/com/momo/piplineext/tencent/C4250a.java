package com.momo.piplineext.tencent;

/* JADX INFO: renamed from: com.momo.piplineext.tencent.a */
/* JADX INFO: loaded from: classes8.dex */
/* synthetic */ class C4250a {

    /* JADX INFO: renamed from: a */
    static final /* synthetic */ int[] f15207a;

    static {
        int[] iArr = new int[BaseGPUFilter$Rotation.values().length];
        f15207a = iArr;
        try {
            iArr[BaseGPUFilter$Rotation.NORMAL.ordinal()] = 1;
        } catch (NoSuchFieldError unused) {
        }
        try {
            f15207a[BaseGPUFilter$Rotation.ROTATION_90.ordinal()] = 2;
        } catch (NoSuchFieldError unused2) {
        }
        try {
            f15207a[BaseGPUFilter$Rotation.ROTATION_180.ordinal()] = 3;
        } catch (NoSuchFieldError unused3) {
        }
        try {
            f15207a[BaseGPUFilter$Rotation.ROTATION_270.ordinal()] = 4;
        } catch (NoSuchFieldError unused4) {
        }
    }
}
