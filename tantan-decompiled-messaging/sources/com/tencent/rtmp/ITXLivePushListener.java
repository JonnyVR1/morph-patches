package com.tencent.rtmp;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public interface ITXLivePushListener {
    void onNetStatus(Bundle bundle);

    void onPushEvent(int i, Bundle bundle);
}
