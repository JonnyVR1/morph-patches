package com.p074ss.bytertc.engine.video;

import android.graphics.Bitmap;
import com.p074ss.bytertc.engine.data.RemoteStreamKey;
import com.p074ss.bytertc.engine.data.StreamIndex;

/* JADX INFO: loaded from: classes11.dex */
public interface ISnapshotResultCallback {
    void onTakeLocalSnapshotResult(long j, StreamIndex streamIndex, Bitmap bitmap, int i);

    void onTakeRemoteSnapshotResult(long j, RemoteStreamKey remoteStreamKey, Bitmap bitmap, int i);
}
