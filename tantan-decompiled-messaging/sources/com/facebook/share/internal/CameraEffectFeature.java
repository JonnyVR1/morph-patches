package com.facebook.share.internal;

import java.util.Arrays;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(m87231d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\fj\u0002\b\r¨\u0006\u000e"}, m87232d2 = {"Lcom/facebook/share/internal/CameraEffectFeature;", "", "", "", "minVersion", "<init>", "(Ljava/lang/String;II)V", "", "getAction", "()Ljava/lang/String;", "getMinVersion", "()I", "I", "SHARE_CAMERA_EFFECT", "facebook-common_release"}, m87233k = 1, m87234mv = {1, 5, 1}, m87236xi = 48)
public enum CameraEffectFeature {
    SHARE_CAMERA_EFFECT(20170417);

    private final int minVersion;

    CameraEffectFeature(int i) {
        this.minVersion = i;
    }

    /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
    public static CameraEffectFeature[] valuesCustom() {
        CameraEffectFeature[] cameraEffectFeatureArrValuesCustom = values();
        return (CameraEffectFeature[]) Arrays.copyOf(cameraEffectFeatureArrValuesCustom, cameraEffectFeatureArrValuesCustom.length);
    }

    @NotNull
    public String getAction() {
        return "com.facebook.platform.action.request.CAMERA_EFFECT";
    }

    public int getMinVersion() {
        return this.minVersion;
    }
}
