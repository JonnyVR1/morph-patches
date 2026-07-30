package com.immomo.svgaplayer;

import com.immomo.svgaplayer.listener.SVGACallback;
import com.p051p1.mobile.putong.feed.data.Frame;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(m88119bv = {1, 0, 2}, m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0000\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\nH\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016¨\u0006\u0013"}, m88121d2 = {"Lcom/immomo/svgaplayer/SVGAAnimListenerAdapter;", "Lcom/immomo/svgaplayer/listener/SVGACallback;", "()V", "loadResError", "", "msg", "", "onFinished", "onLoadSuccess", "videoItem", "Lcom/immomo/svgaplayer/SVGAVideoEntity;", "onPause", "onRepeat", "onStart", "onStep", Frame.TYPE, "", "percentage", "", "svgalibrary_release"}, m88122k = 1, m88123mv = {1, 1, 10})
public abstract class SVGAAnimListenerAdapter implements SVGACallback {
    public void loadResError(@NotNull String msg) {
        msg.getClass();
    }

    @Override // com.immomo.svgaplayer.listener.SVGACallback
    public void onFinished() {
    }

    public void onLoadSuccess(@NotNull SVGAVideoEntity videoItem) {
        videoItem.getClass();
        onLoadSuccess();
    }

    @Override // com.immomo.svgaplayer.listener.SVGACallback
    public void onPause() {
    }

    @Override // com.immomo.svgaplayer.listener.SVGACallback
    public void onRepeat() {
    }

    @Override // com.immomo.svgaplayer.listener.SVGACallback
    public void onStart() {
    }

    @Override // com.immomo.svgaplayer.listener.SVGACallback
    public void onStep(int frame, double percentage) {
    }

    public void onLoadSuccess() {
    }
}
