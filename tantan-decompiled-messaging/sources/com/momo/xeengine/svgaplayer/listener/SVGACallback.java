package com.momo.xeengine.svgaplayer.listener;

import com.p046p1.mobile.putong.feed.data.Frame;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(m87230bv = {1, 0, 3}, m87231d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, m87232d2 = {"Lcom/momo/xeengine/svgaplayer/listener/SVGACallback;", "", "onFinished", "", "onPause", "onRepeat", "onStart", "onStep", Frame.TYPE, "", "percentage", "", "gift_player_release"}, m87233k = 1, m87234mv = {1, 1, 15})
public interface SVGACallback {
    void onFinished();

    void onPause();

    void onRepeat();

    void onStart();

    void onStep(int frame, double percentage);
}
