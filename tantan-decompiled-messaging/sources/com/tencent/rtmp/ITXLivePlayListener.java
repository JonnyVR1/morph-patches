package com.tencent.rtmp;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
public interface ITXLivePlayListener {
    void onNetStatus(Bundle bundle);

    void onPlayEvent(int i, Bundle bundle);
}
