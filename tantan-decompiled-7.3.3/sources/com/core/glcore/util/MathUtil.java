package com.core.glcore.util;

/* JADX INFO: loaded from: classes.dex */
public class MathUtil {
    public static int clamp(int i, int i2, int i3) {
        if (i > i3) {
            return i3;
        }
        return i < i2 ? i2 : i;
    }
}
