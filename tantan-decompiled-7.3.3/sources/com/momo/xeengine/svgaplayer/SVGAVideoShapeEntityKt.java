package com.momo.xeengine.svgaplayer;

import android.graphics.Path;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m88119bv = {1, 0, 3}, m88120d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m88121d2 = {"sharedPath", "Landroid/graphics/Path;", "getSharedPath", "()Landroid/graphics/Path;", "gift_player_release"}, m88122k = 2, m88123mv = {1, 1, 15})
public final class SVGAVideoShapeEntityKt {

    @NotNull
    private static final Path sharedPath = new Path();

    @NotNull
    public static final Path getSharedPath() {
        return sharedPath;
    }
}
