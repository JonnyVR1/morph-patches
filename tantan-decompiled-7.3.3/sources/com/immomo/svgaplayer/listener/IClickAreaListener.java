package com.immomo.svgaplayer.listener;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88119bv = {1, 0, 2}, m88120d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J0\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H&¨\u0006\u000b"}, m88121d2 = {"Lcom/immomo/svgaplayer/listener/IClickAreaListener;", "", "onResponseArea", "", Constants.KEY_KEY, "", "x0", "", "y0", "x1", "y1", "svgalibrary_release"}, m88122k = 1, m88123mv = {1, 1, 10})
public interface IClickAreaListener {
    void onResponseArea(@NotNull String key, int x0, int y0, int x1, int y1);
}
