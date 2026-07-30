package com.tantanapp.media.ttmediaeffect.anim;

import android.content.Context;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import com.immomo.svgaplayer.SVGAAnimListenerAdapter;
import com.immomo.svgaplayer.SVGAVideoEntity;
import com.immomo.svgaplayer.view.MomoSVGAImageView;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
public class AnimEffectPlayer extends MomoSVGAImageView {
    public AnimEffectPlayer(@Nullable Context context) {
        super(context);
    }

    public void loadAnimWithListener(String str, int i, final AnimListener animListener, boolean z) {
        loadSVGAAnimWithListener(str, i, animListener != null ? new SVGAAnimListenerAdapter() { // from class: com.tantanapp.media.ttmediaeffect.anim.AnimEffectPlayer.1
            @Override // com.immomo.svgaplayer.SVGAAnimListenerAdapter
            public void loadResError(@NonNull String str2) {
                super.loadResError(str2);
                AnimListener animListener2 = animListener;
                if (animListener2 != null) {
                    animListener2.loadResError(str2);
                }
            }

            @Override // com.immomo.svgaplayer.SVGAAnimListenerAdapter, com.immomo.svgaplayer.listener.SVGACallback
            public void onFinished() {
                super.onFinished();
                AnimListener animListener2 = animListener;
                if (animListener2 != null) {
                    animListener2.onFinished();
                }
            }

            @Override // com.immomo.svgaplayer.SVGAAnimListenerAdapter
            public void onLoadSuccess(@NonNull SVGAVideoEntity sVGAVideoEntity) {
                super.onLoadSuccess(sVGAVideoEntity);
                AnimListener animListener2 = animListener;
                if (animListener2 != null) {
                    animListener2.onLoadSuccess(AnimEntity.fromMomoEntity(sVGAVideoEntity));
                }
            }

            @Override // com.immomo.svgaplayer.SVGAAnimListenerAdapter, com.immomo.svgaplayer.listener.SVGACallback
            public void onPause() {
                super.onPause();
                AnimListener animListener2 = animListener;
                if (animListener2 != null) {
                    animListener2.onPause();
                }
            }

            @Override // com.immomo.svgaplayer.SVGAAnimListenerAdapter, com.immomo.svgaplayer.listener.SVGACallback
            public void onRepeat() {
                super.onRepeat();
                AnimListener animListener2 = animListener;
                if (animListener2 != null) {
                    animListener2.onRepeat();
                }
            }

            @Override // com.immomo.svgaplayer.SVGAAnimListenerAdapter, com.immomo.svgaplayer.listener.SVGACallback
            public void onStart() {
                super.onStart();
                AnimListener animListener2 = animListener;
                if (animListener2 != null) {
                    animListener2.onStart();
                }
            }

            @Override // com.immomo.svgaplayer.SVGAAnimListenerAdapter, com.immomo.svgaplayer.listener.SVGACallback
            public void onStep(int i2, double d) {
                super.onStep(i2, d);
                AnimListener animListener2 = animListener;
                if (animListener2 != null) {
                    animListener2.onStep(i2, d);
                }
            }

            @Override // com.immomo.svgaplayer.SVGAAnimListenerAdapter
            public void onLoadSuccess() {
                super.onLoadSuccess();
                AnimListener animListener2 = animListener;
                if (animListener2 != null) {
                    animListener2.onLoadSuccess();
                }
            }
        } : null, z);
    }

    public void startSVGAAnimWithListener(String str, int i, final AnimListener animListener) {
        startSVGAAnimWithListener(str, i, new SVGAAnimListenerAdapter() { // from class: com.tantanapp.media.ttmediaeffect.anim.AnimEffectPlayer.2
            @Override // com.immomo.svgaplayer.SVGAAnimListenerAdapter
            public void loadResError(@NotNull String str2) {
                AnimListener animListener2 = animListener;
                if (animListener2 != null) {
                    animListener2.loadResError(str2);
                }
            }

            @Override // com.immomo.svgaplayer.SVGAAnimListenerAdapter, com.immomo.svgaplayer.listener.SVGACallback
            public void onFinished() {
                AnimListener animListener2 = animListener;
                if (animListener2 != null) {
                    animListener2.onFinished();
                }
            }

            @Override // com.immomo.svgaplayer.SVGAAnimListenerAdapter
            public void onLoadSuccess(@NotNull SVGAVideoEntity sVGAVideoEntity) {
                AnimListener animListener2 = animListener;
                if (animListener2 != null) {
                    animListener2.onLoadSuccess(AnimEntity.fromMomoEntity(sVGAVideoEntity));
                }
            }

            @Override // com.immomo.svgaplayer.SVGAAnimListenerAdapter, com.immomo.svgaplayer.listener.SVGACallback
            public void onPause() {
                AnimListener animListener2 = animListener;
                if (animListener2 != null) {
                    animListener2.onPause();
                }
            }

            @Override // com.immomo.svgaplayer.SVGAAnimListenerAdapter, com.immomo.svgaplayer.listener.SVGACallback
            public void onRepeat() {
                AnimListener animListener2 = animListener;
                if (animListener2 != null) {
                    animListener2.onRepeat();
                }
            }

            @Override // com.immomo.svgaplayer.SVGAAnimListenerAdapter, com.immomo.svgaplayer.listener.SVGACallback
            public void onStart() {
                AnimListener animListener2 = animListener;
                if (animListener2 != null) {
                    animListener2.onStart();
                }
            }

            @Override // com.immomo.svgaplayer.SVGAAnimListenerAdapter, com.immomo.svgaplayer.listener.SVGACallback
            public void onStep(int i2, double d) {
                AnimListener animListener2 = animListener;
                if (animListener2 != null) {
                    animListener2.onStep(i2, d);
                }
            }

            @Override // com.immomo.svgaplayer.SVGAAnimListenerAdapter
            public void onLoadSuccess() {
                AnimListener animListener2 = animListener;
                if (animListener2 != null) {
                    animListener2.onLoadSuccess();
                }
            }
        });
    }

    public AnimEffectPlayer(@Nullable Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public AnimEffectPlayer(@Nullable Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public AnimEffectPlayer(@Nullable Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
