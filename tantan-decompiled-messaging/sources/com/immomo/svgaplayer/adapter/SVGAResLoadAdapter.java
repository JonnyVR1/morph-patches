package com.immomo.svgaplayer.adapter;

import com.immomo.svgaplayer.adaptercallback.SVGAResLoadCallBack;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87230bv = {1, 0, 2}, m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH&¨\u0006\n"}, m87232d2 = {"Lcom/immomo/svgaplayer/adapter/SVGAResLoadAdapter;", "", "loadSVGARes", "", "isHeight", "", "url", "", "callBack", "Lcom/immomo/svgaplayer/adaptercallback/SVGAResLoadCallBack;", "svgalibrary_release"}, m87233k = 1, m87234mv = {1, 1, 10})
public interface SVGAResLoadAdapter {
    void loadSVGARes(boolean isHeight, @NotNull String url, @Nullable SVGAResLoadCallBack callBack);
}
