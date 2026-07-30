package io.agora.base.internal;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class BuildConfig {
    public static final boolean FEATURE_ENABLE_VIDEO = true;
    public static final boolean FEATURE_RTM_STANDALONE = false;
    public static final List<String> so_list = Arrays.asList("aosl", "agora-ffmpeg", "agora-fdkaac", "agora-soundtouch");

    private BuildConfig() {
        throw new IllegalStateException("Utility class");
    }
}
