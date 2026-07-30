package com.tantanapp.media.ttmediaeffect.video;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.immomo.velib.player.InterfaceC4139d;
import com.immomo.velib.player.VideoEffectView;

/* JADX INFO: loaded from: classes12.dex */
public class VideoEffectPlayer extends VideoEffectView {
    public static final int RENDER_SURFACE_VIEW = 0;
    public static final int RENDER_TEXTURE_VIEW = 1;

    /* JADX INFO: renamed from: com.tantanapp.media.ttmediaeffect.video.VideoEffectPlayer$4 */
    public static /* synthetic */ class C138334 {

        /* JADX INFO: renamed from: $SwitchMap$com$tantanapp$media$ttmediaeffect$video$VideoEffectPlayer$LayoutMode */
        static final /* synthetic */ int[] f57010xe71bec82;

        /* JADX INFO: renamed from: $SwitchMap$com$tantanapp$media$ttmediaeffect$video$VideoEffectPlayer$RenderMode */
        static final /* synthetic */ int[] f57011x19eb1cee;

        static {
            int[] iArr = new int[RenderMode.values().length];
            f57011x19eb1cee = iArr;
            try {
                iArr[RenderMode.SURFACE_VIEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f57011x19eb1cee[RenderMode.TEXTURE_VIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[LayoutMode.values().length];
            f57010xe71bec82 = iArr2;
            try {
                iArr2[LayoutMode.ALIGN_BOTTOM.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f57010xe71bec82[LayoutMode.FIXED_SIZE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f57010xe71bec82[LayoutMode.CENTER_CROP.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public enum LayoutMode {
        CENTER_CROP,
        ALIGN_BOTTOM,
        FIXED_SIZE
    }

    public enum RenderMode {
        SURFACE_VIEW,
        TEXTURE_VIEW
    }

    public VideoEffectPlayer(@NonNull Context context) {
        super(context);
    }

    @Override // com.immomo.velib.player.VideoEffectView
    public void prepare() {
        super.prepare();
    }

    public void setCompletionListener(final IVdieoEffect.OnCompletionListener onCompletionListener) {
        if (onCompletionListener == null) {
            super.setCompletionListener((InterfaceC4139d.b) null);
        } else {
            super.setCompletionListener(new InterfaceC4139d.b() { // from class: com.tantanapp.media.ttmediaeffect.video.VideoEffectPlayer.1
                @Override // com.immomo.velib.player.InterfaceC4139d.b
                public void onCompletion() {
                    onCompletionListener.onCompletion();
                }
            });
        }
    }

    public void setOnErrorListener(final IVdieoEffect.OnErrorListener onErrorListener) {
        if (onErrorListener == null) {
            super.setOnErrorListener((InterfaceC4139d.c) null);
        } else {
            super.setOnErrorListener(new InterfaceC4139d.c() { // from class: com.tantanapp.media.ttmediaeffect.video.VideoEffectPlayer.2
                public boolean onError(InterfaceC4139d interfaceC4139d, int i, int i2) {
                    return onErrorListener.onError(i, i2);
                }

                @Override // com.immomo.velib.player.InterfaceC4139d.c
                public abstract /* synthetic */ boolean onError(InterfaceC4139d interfaceC4139d, int i, String str);
            });
        }
    }

    public void setPositionChangedListener(final IVdieoEffect.OnRenderPositionChangedListener onRenderPositionChangedListener) {
        if (onRenderPositionChangedListener == null) {
            super.setPositionChangedListener((InterfaceC4139d.f) null);
        } else {
            super.setPositionChangedListener(new InterfaceC4139d.f() { // from class: com.tantanapp.media.ttmediaeffect.video.VideoEffectPlayer.3
                @Override // com.immomo.velib.player.InterfaceC4139d.f
                public void renderPositionChanged(long j) {
                    onRenderPositionChangedListener.onRenderPositionChanged(j);
                }
            });
        }
    }

    public void setRenderMode(RenderMode renderMode) {
        int i = C138334.f57011x19eb1cee[renderMode.ordinal()];
        int i2 = 1;
        if (i != 1 && i == 2) {
            i2 = 2;
        }
        super.setRenderMode(i2);
    }

    public void setSurfaceLayoutMode(LayoutMode layoutMode, VideoLocation videoLocation) {
        int i = C138334.f57010xe71bec82[layoutMode.ordinal()];
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 0;
            }
        }
        super.setSurfaceLayoutMode(i2, VideoLocation.toMomoLocation(videoLocation));
    }

    public void setVideoEffectConfig(VideoEffectConfig videoEffectConfig) {
        setEffectConfig(videoEffectConfig == null ? null : videoEffectConfig.toMomoEffectConfig());
    }

    @Override // com.immomo.velib.player.VideoEffectView
    public void start() {
        super.start();
    }

    @Override // com.immomo.velib.player.VideoEffectView
    public void stop() {
        super.stop();
    }

    public VideoEffectPlayer(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VideoEffectPlayer(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public VideoEffectPlayer(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
