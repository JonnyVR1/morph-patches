package com.google.firebase.platforminfo;

import androidx.annotation.Nullable;
import kotlin.KotlinVersion;

/* JADX INFO: loaded from: classes7.dex */
public final class KotlinDetector {
    private KotlinDetector() {
    }

    @Nullable
    public static String detectVersion() {
        try {
            return KotlinVersion.f64056e.toString();
        } catch (NoClassDefFoundError unused) {
            return null;
        }
    }
}
