package com.immomo.svgaplayer.adapter;

import android.content.Context;
import com.immomo.svgaplayer.adaptercallback.SVGAImgLoadCallBack;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m87230bv = {1, 0, 2}, m87231d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, m87232d2 = {"Lcom/immomo/svgaplayer/adapter/SVGAImgLoadAdapter;", "", "loadSVGAImg", "", "context", "Landroid/content/Context;", "url", "", "callBack", "Lcom/immomo/svgaplayer/adaptercallback/SVGAImgLoadCallBack;", "svgalibrary_release"}, m87233k = 1, m87234mv = {1, 1, 10})
public interface SVGAImgLoadAdapter {
    void loadSVGAImg(@NotNull Context context, @NotNull String url, @NotNull SVGAImgLoadCallBack callBack);
}
