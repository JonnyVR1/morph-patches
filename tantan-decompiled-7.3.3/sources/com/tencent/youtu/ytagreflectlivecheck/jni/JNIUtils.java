package com.tencent.youtu.ytagreflectlivecheck.jni;

import com.tencent.youtu.ytagreflectlivecheck.jni.cppDefine.Timeval;

/* JADX INFO: loaded from: classes2.dex */
public class JNIUtils {
    public static final String TAG = "LightLiveCheck";

    public static Timeval getTimeval(long j) {
        return new Timeval(j / 1000, (int) ((j * 1000) % 1000000));
    }
}
