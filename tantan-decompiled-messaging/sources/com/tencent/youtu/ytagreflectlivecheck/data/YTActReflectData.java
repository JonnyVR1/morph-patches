package com.tencent.youtu.ytagreflectlivecheck.data;

import com.tencent.youtu.ytagreflectlivecheck.requester.LiveStyleRequester;

/* JADX INFO: loaded from: classes2.dex */
public class YTActReflectData {
    public YTActReflectImage best;
    public YTActReflectImage eye;
    public YTActReflectImage mouth;
    public LiveStyleRequester.SeleceData select_data;

    public YTActReflectData(YTActReflectImage yTActReflectImage, YTActReflectImage yTActReflectImage2, YTActReflectImage yTActReflectImage3, LiveStyleRequester.SeleceData seleceData) {
        this.best = yTActReflectImage;
        this.eye = yTActReflectImage2;
        this.mouth = yTActReflectImage3;
        this.select_data = seleceData;
    }
}
