package com.facebook.fresco.animation.bitmap.preparation.ondemandanimation;

import androidx.annotation.UiThread;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.live.base.data.BLiveResOperation;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\bf\u0018\u00002\u00020\u0001J'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H'¢\u0006\u0004\b\u0007\u0010\bJ-\u0010\f\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH'¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH&¢\u0006\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, m87232d2 = {"Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/c;", "", "", "frameNumber", "width", "height", "Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/FrameResult;", "g", "(III)Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/FrameResult;", "Lkotlin/Function0;", "", "onAnimationLoaded", "e", "(IILkotlin/jvm/functions/Function0;)V", "fps", "f", "(I)V", Constants.INAPP_DATA_TAG, "()V", BLiveResOperation.clear, "animated-drawable_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public interface InterfaceC1603c {

    /* JADX INFO: renamed from: com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.c$a */
    @Metadata(m87233k = 3, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class a {
        /* JADX INFO: renamed from: a */
        public static void m8358a(@NotNull InterfaceC1603c interfaceC1603c) {
        }
    }

    void clear();

    /* JADX INFO: renamed from: d */
    void mo8343d();

    @UiThread
    /* JADX INFO: renamed from: e */
    void mo8344e(int width, int height, @NotNull Function0<Unit> onAnimationLoaded);

    /* JADX INFO: renamed from: f */
    void mo8345f(int fps);

    @UiThread
    @NotNull
    /* JADX INFO: renamed from: g */
    FrameResult mo8346g(int frameNumber, int width, int height);
}
