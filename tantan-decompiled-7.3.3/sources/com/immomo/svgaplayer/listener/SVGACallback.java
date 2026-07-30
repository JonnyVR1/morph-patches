package com.immomo.svgaplayer.listener;

import com.p051p1.mobile.putong.feed.data.Frame;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88119bv = {1, 0, 2}, m88120d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&J\u0018\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&¨\u0006\f"}, m88121d2 = {"Lcom/immomo/svgaplayer/listener/SVGACallback;", "", "onFinished", "", "onPause", "onRepeat", "onStart", "onStep", Frame.TYPE, "", "percentage", "", "svgalibrary_release"}, m88122k = 1, m88123mv = {1, 1, 10})
public interface SVGACallback {
    void onFinished();

    void onPause();

    void onRepeat();

    void onStart();

    void onStep(int frame, double percentage);
}
