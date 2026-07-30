package com.tantanapp.media.ttmediaeffect.anim;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes13.dex */
public interface IAnimListener {
    void loadResError(@NonNull String str);

    void onFinished();

    void onLoadSuccess();

    void onLoadSuccess(@NonNull AnimEntity animEntity);

    void onPause();

    void onRepeat();

    void onStart();

    void onStep(int i, double d);
}
