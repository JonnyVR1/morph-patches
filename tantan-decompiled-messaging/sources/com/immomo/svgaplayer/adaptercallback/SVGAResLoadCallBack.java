package com.immomo.svgaplayer.adaptercallback;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87230bv = {1, 0, 2}, m87231d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, m87232d2 = {"Lcom/immomo/svgaplayer/adaptercallback/SVGAResLoadCallBack;", "", "onResLoadFail", "", "onResLoadSuccess", "filePath", "", "svgalibrary_release"}, m87233k = 1, m87234mv = {1, 1, 10})
public interface SVGAResLoadCallBack {
    void onResLoadFail();

    void onResLoadSuccess(@NotNull String filePath);
}
