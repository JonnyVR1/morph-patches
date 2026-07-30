package com.immomo.svgaplayer.adapter;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87230bv = {1, 0, 2}, m87231d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H&J\u0018\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, m87232d2 = {"Lcom/immomo/svgaplayer/adapter/SVGAThreadAdapter;", "", "cancelTaskByTag", "", "tag", "executeTaskByTag", "task", "Ljava/lang/Runnable;", "svgalibrary_release"}, m87233k = 1, m87234mv = {1, 1, 10})
public interface SVGAThreadAdapter {
    void cancelTaskByTag(@NotNull Object tag);

    void executeTaskByTag(@NotNull Object tag, @NotNull Runnable task);
}
