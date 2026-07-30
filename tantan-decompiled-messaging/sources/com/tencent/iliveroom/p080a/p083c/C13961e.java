package com.tencent.iliveroom.p080a.p083c;

import android.os.Handler;
import android.os.Looper;
import com.tencent.iliveroom.TXILiveRoomDefine;
import com.tencent.iliveroom.TXILiveRoomDelegateAdapter;
import com.tencent.liteav.basic.log.TXCLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* JADX INFO: renamed from: com.tencent.iliveroom.a.c.e */
/* JADX INFO: loaded from: classes2.dex */
public class C13961e extends TXILiveRoomDelegateAdapter {

    /* JADX INFO: renamed from: a */
    private LinkedList<TXILiveRoomDelegateAdapter> f57853a = new LinkedList<>();

    /* JADX INFO: renamed from: b */
    private Handler f57854b = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: a */
    public void m82640a(final TXILiveRoomDelegateAdapter tXILiveRoomDelegateAdapter) {
        if (tXILiveRoomDelegateAdapter != null) {
            this.f57854b.post(new Runnable() { // from class: com.tencent.iliveroom.a.c.e.1
                @Override // java.lang.Runnable
                public void run() {
                    if (C13961e.this.f57853a.contains(tXILiveRoomDelegateAdapter)) {
                        return;
                    }
                    C13961e.this.f57853a.add(tXILiveRoomDelegateAdapter);
                    TXCLog.m82969i("TXRoomDelegate", "TXRoomDelegate->add Delegate size: " + C13961e.this.f57853a.size());
                }
            });
        } else {
            TXCLog.m82966e("TXRoomDelegate", "TXRoomDelegate: add null delegate fail.");
        }
    }

    /* JADX INFO: renamed from: b */
    public void m82641b(final TXILiveRoomDelegateAdapter tXILiveRoomDelegateAdapter) {
        if (tXILiveRoomDelegateAdapter != null) {
            this.f57854b.post(new Runnable() { // from class: com.tencent.iliveroom.a.c.e.12
                @Override // java.lang.Runnable
                public void run() {
                    C13961e.this.f57853a.remove(tXILiveRoomDelegateAdapter);
                    TXCLog.m82969i("TXRoomDelegate", "removeDelegate->remove Delegate size: " + C13961e.this.f57853a.size());
                }
            });
        } else {
            TXCLog.m82966e("TXRoomDelegate", "TXRoomDelegate: remove null delegate fail.");
        }
    }

    @Override // com.tencent.iliveroom.TXILiveRoomDelegateAdapter
    public void onClearMixTranscodingConfig(final int i, final String str) {
        TXCLog.m82969i("TXRoomDelegate", "TXRoomDelegate->onClearMixTranscodingConfig err:" + i + ", msg:" + str);
        Runnable runnable = new Runnable() { // from class: com.tencent.iliveroom.a.c.e.21
            @Override // java.lang.Runnable
            public void run() {
                for (TXILiveRoomDelegateAdapter tXILiveRoomDelegateAdapter : C13961e.this.f57853a) {
                    if (tXILiveRoomDelegateAdapter != null) {
                        tXILiveRoomDelegateAdapter.onClearMixTranscodingConfig(i, str);
                    }
                }
            }
        };
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            runnable.run();
        } else {
            this.f57854b.post(runnable);
        }
    }

    @Override // com.tencent.iliveroom.TXILiveRoomDelegateAdapter
    public void onConnectOtherRoom(final long j, final int i, final String str) {
        TXCLog.m82969i("TXRoomDelegate", "TXRoomDelegate->onConnectOtherRoom userId:" + j + ", code:" + i + ", msg:" + str);
        Runnable runnable = new Runnable() { // from class: com.tencent.iliveroom.a.c.e.4
            @Override // java.lang.Runnable
            public void run() {
                for (TXILiveRoomDelegateAdapter tXILiveRoomDelegateAdapter : C13961e.this.f57853a) {
                    if (tXILiveRoomDelegateAdapter != null) {
                        tXILiveRoomDelegateAdapter.onConnectOtherRoom(j, i, str);
                    }
                }
            }
        };
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            runnable.run();
        } else {
            this.f57854b.post(runnable);
        }
    }

    @Override // com.tencent.iliveroom.TXILiveRoomDelegateAdapter
    public void onDetectFacePoints(float[] fArr) {
        Iterator<TXILiveRoomDelegateAdapter> it = this.f57853a.iterator();
        while (it.hasNext()) {
            it.next().onDetectFacePoints(fArr);
        }
    }

    @Override // com.tencent.iliveroom.TXILiveRoomDelegateAdapter
    public void onDisconnectOtherRoom(final int i, final String str) {
        super.onDisconnectOtherRoom(i, str);
        TXCLog.m82969i("TXRoomDelegate", "TXRoomDelegate->onDisconnectOtherRoom code:" + i + ", msg:" + str);
        Runnable runnable = new Runnable() { // from class: com.tencent.iliveroom.a.c.e.5
            @Override // java.lang.Runnable
            public void run() {
                for (TXILiveRoomDelegateAdapter tXILiveRoomDelegateAdapter : C13961e.this.f57853a) {
                    if (tXILiveRoomDelegateAdapter != null) {
                        tXILiveRoomDelegateAdapter.onDisconnectOtherRoom(i, str);
                    }
                }
            }
        };
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            runnable.run();
        } else {
            this.f57854b.post(runnable);
        }
    }

    @Override // com.tencent.iliveroom.TXILiveRoomDelegateAdapter
    public void onError(final long j, final int i, final String str) {
        TXCLog.m82969i("TXRoomDelegate", "TXRoomDelegate->onError user:" + j + ", code:" + i + ", msg:" + str);
        Runnable runnable = new Runnable() { // from class: com.tencent.iliveroom.a.c.e.23
            @Override // java.lang.Runnable
            public void run() {
                for (TXILiveRoomDelegateAdapter tXILiveRoomDelegateAdapter : C13961e.this.f57853a) {
                    if (tXILiveRoomDelegateAdapter != null) {
                        tXILiveRoomDelegateAdapter.onError(j, i, str);
                    }
                }
            }
        };
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            runnable.run();
        } else {
            this.f57854b.post(runnable);
        }
    }

    @Override // com.tencent.iliveroom.TXILiveRoomDelegateAdapter
    public void onEvent(final long j, final int i, final String str) {
        TXCLog.m82969i("TXRoomDelegate", "TXRoomDelegate->onEvent user:" + j + ", code:" + i + ", msg:" + str);
        Runnable runnable = new Runnable() { // from class: com.tencent.iliveroom.a.c.e.25
            @Override // java.lang.Runnable
            public void run() {
                for (TXILiveRoomDelegateAdapter tXILiveRoomDelegateAdapter : C13961e.this.f57853a) {
                    if (tXILiveRoomDelegateAdapter != null) {
                        tXILiveRoomDelegateAdapter.onEvent(j, i, str);
                    }
                }
            }
        };
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            runnable.run();
        } else {
            this.f57854b.post(runnable);
        }
    }

    @Override // com.tencent.iliveroom.TXILiveRoomDelegateAdapter
    public void onJoinRoomFailed(final String str, final int i, final String str2) {
        TXCLog.m82969i("TXRoomDelegate", "TXRoomDelegate->onJoinRoomFailed roomName:" + str + ", code:" + i + ", msg:" + str2);
        Runnable runnable = new Runnable() { // from class: com.tencent.iliveroom.a.c.e.27
            @Override // java.lang.Runnable
            public void run() {
                for (TXILiveRoomDelegateAdapter tXILiveRoomDelegateAdapter : C13961e.this.f57853a) {
                    if (tXILiveRoomDelegateAdapter != null) {
                        tXILiveRoomDelegateAdapter.onJoinRoomFailed(str, i, str2);
                    }
                }
            }
        };
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            runnable.run();
        } else {
            this.f57854b.post(runnable);
        }
    }

    @Override // com.tencent.iliveroom.TXILiveRoomDelegateAdapter
    public void onJoinRoomSuccess(final String str) {
        TXCLog.m82969i("TXRoomDelegate", "TXRoomDelegate->onJoinRoomSuccess roomName:" + str);
        Runnable runnable = new Runnable() { // from class: com.tencent.iliveroom.a.c.e.26
            @Override // java.lang.Runnable
            public void run() {
                for (TXILiveRoomDelegateAdapter tXILiveRoomDelegateAdapter : C13961e.this.f57853a) {
                    if (tXILiveRoomDelegateAdapter != null) {
                        tXILiveRoomDelegateAdapter.onJoinRoomSuccess(str);
                    }
                }
            }
        };
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            runnable.run();
        } else {
            this.f57854b.post(runnable);
        }
    }

    @Override // com.tencent.iliveroom.TXILiveRoomDelegateAdapter
    public void onKickOut(final String str, final long j) {
        TXCLog.m82969i("TXRoomDelegate", "TXRoomDelegate->onKickOut roomName:" + str + " userId:" + j);
        Runnable runnable = new Runnable() { // from class: com.tencent.iliveroom.a.c.e.2
            @Override // java.lang.Runnable
            public void run() {
                for (TXILiveRoomDelegateAdapter tXILiveRoomDelegateAdapter : C13961e.this.f57853a) {
                    if (tXILiveRoomDelegateAdapter != null) {
                        tXILiveRoomDelegateAdapter.onKickOut(str, j);
                    }
                }
            }
        };
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            runnable.run();
        } else {
            this.f57854b.post(runnable);
        }
    }

    @Override // com.tencent.iliveroom.TXILiveRoomDelegateAdapter
    public void onQuitRoomFailed(final String str, final int i, final String str2) {
        TXCLog.m82969i("TXRoomDelegate", "TXRoomDelegate->onQuitRoomFailed roomName:" + str + ", code:" + i + ", msg:" + str2);
        Runnable runnable = new Runnable() { // from class: com.tencent.iliveroom.a.c.e.3
            @Override // java.lang.Runnable
            public void run() {
                for (TXILiveRoomDelegateAdapter tXILiveRoomDelegateAdapter : C13961e.this.f57853a) {
                    if (tXILiveRoomDelegateAdapter != null) {
                        tXILiveRoomDelegateAdapter.onQuitRoomFailed(str, i, str2);
                    }
                }
            }
        };
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            runnable.run();
        } else {
            this.f57854b.post(runnable);
        }
    }

    @Override // com.tencent.iliveroom.TXILiveRoomDelegateAdapter
    public void onQuitRoomSuccess(final String str) {
        TXCLog.m82969i("TXRoomDelegate", "TXRoomDelegate->onQuitRoomSuccess roomName:" + str);
        Runnable runnable = new Runnable() { // from class: com.tencent.iliveroom.a.c.e.28
            @Override // java.lang.Runnable
            public void run() {
                for (TXILiveRoomDelegateAdapter tXILiveRoomDelegateAdapter : C13961e.this.f57853a) {
                    if (tXILiveRoomDelegateAdapter != null) {
                        tXILiveRoomDelegateAdapter.onQuitRoomSuccess(str);
                    }
                }
            }
        };
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            runnable.run();
        } else {
            this.f57854b.post(runnable);
        }
    }

    @Override // com.tencent.iliveroom.TXILiveRoomDelegateAdapter
    public void onRecvMessage(final String str, final long j, final byte[] bArr) {
        Runnable runnable = new Runnable() { // from class: com.tencent.iliveroom.a.c.e.15
            @Override // java.lang.Runnable
            public void run() {
                for (TXILiveRoomDelegateAdapter tXILiveRoomDelegateAdapter : C13961e.this.f57853a) {
                    if (tXILiveRoomDelegateAdapter != null) {
                        tXILiveRoomDelegateAdapter.onRecvMessage(str, j, bArr);
                    }
                }
            }
        };
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            runnable.run();
        } else {
            this.f57854b.post(runnable);
        }
    }

    @Override // com.tencent.iliveroom.TXILiveRoomDelegateAdapter
    public void onRecvStreamMessage(final String str, final long j, final int i, final byte[] bArr) {
        Runnable runnable = new Runnable() { // from class: com.tencent.iliveroom.a.c.e.16
            @Override // java.lang.Runnable
            public void run() {
                for (TXILiveRoomDelegateAdapter tXILiveRoomDelegateAdapter : C13961e.this.f57853a) {
                    if (tXILiveRoomDelegateAdapter != null) {
                        tXILiveRoomDelegateAdapter.onRecvStreamMessage(str, j, i, bArr);
                    }
                }
            }
        };
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            runnable.run();
        } else {
            this.f57854b.post(runnable);
        }
    }

    @Override // com.tencent.iliveroom.TXILiveRoomDelegateAdapter
    public void onRoomAudioMuted(final String str, final long j, final boolean z) {
        TXCLog.m82969i("TXRoomDelegate", "TXRoomDelegate->onRoomAudioMuted roomName:" + str + ", user:" + j);
        Runnable runnable = new Runnable() { // from class: com.tencent.iliveroom.a.c.e.9
            @Override // java.lang.Runnable
            public void run() {
                for (TXILiveRoomDelegateAdapter tXILiveRoomDelegateAdapter : C13961e.this.f57853a) {
                    if (tXILiveRoomDelegateAdapter != null) {
                        tXILiveRoomDelegateAdapter.onRoomAudioMuted(str, j, z);
                    }
                }
            }
        };
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            runnable.run();
        } else {
            this.f57854b.post(runnable);
        }
    }

    @Override // com.tencent.iliveroom.TXILiveRoomDelegateAdapter
    public void onRoomBroadcasterIn(final String str, final long j) {
        TXCLog.m82969i("TXRoomDelegate", "TXRoomDelegate->onRoomBroadcasterIn roomName:" + str + ", user:" + j);
        Runnable runnable = new Runnable() { // from class: com.tencent.iliveroom.a.c.e.6
            @Override // java.lang.Runnable
            public void run() {
                for (TXILiveRoomDelegateAdapter tXILiveRoomDelegateAdapter : C13961e.this.f57853a) {
                    if (tXILiveRoomDelegateAdapter != null) {
                        tXILiveRoomDelegateAdapter.onRoomBroadcasterIn(str, j);
                    }
                }
            }
        };
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            runnable.run();
        } else {
            this.f57854b.post(runnable);
        }
    }

    @Override // com.tencent.iliveroom.TXILiveRoomDelegateAdapter
    public void onRoomBroadcasterOut(final String str, final long j, final int i) {
        TXCLog.m82969i("TXRoomDelegate", "TXRoomDelegate->onRoomBroadcasterOut roomName:" + str + ", user:" + j);
        Runnable runnable = new Runnable() { // from class: com.tencent.iliveroom.a.c.e.7
            @Override // java.lang.Runnable
            public void run() {
                for (TXILiveRoomDelegateAdapter tXILiveRoomDelegateAdapter : C13961e.this.f57853a) {
                    if (tXILiveRoomDelegateAdapter != null) {
                        tXILiveRoomDelegateAdapter.onRoomBroadcasterOut(str, j, i);
                    }
                }
            }
        };
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            runnable.run();
        } else {
            this.f57854b.post(runnable);
        }
    }

    @Override // com.tencent.iliveroom.TXILiveRoomDelegateAdapter
    public void onRoomHasVideo(final String str, final long j) {
        TXCLog.m82969i("TXRoomDelegate", "TXRoomDelegate->onRoomHasVideo roomName:" + str + ", user:" + j);
        Runnable runnable = new Runnable() { // from class: com.tencent.iliveroom.a.c.e.8
            @Override // java.lang.Runnable
            public void run() {
                for (TXILiveRoomDelegateAdapter tXILiveRoomDelegateAdapter : C13961e.this.f57853a) {
                    if (tXILiveRoomDelegateAdapter != null) {
                        tXILiveRoomDelegateAdapter.onRoomHasVideo(str, j);
                    }
                }
            }
        };
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            runnable.run();
        } else {
            this.f57854b.post(runnable);
        }
    }

    @Override // com.tencent.iliveroom.TXILiveRoomDelegateAdapter
    public void onRoomRoleChanged(final String str, final int i, final int i2) {
        TXCLog.m82969i("TXRoomDelegate", "TXRoomDelegate->onRoomRoleChanged roomName:" + str + ", oldRole:" + i + ", newRole: " + i2);
        Runnable runnable = new Runnable() { // from class: com.tencent.iliveroom.a.c.e.11
            @Override // java.lang.Runnable
            public void run() {
                for (TXILiveRoomDelegateAdapter tXILiveRoomDelegateAdapter : C13961e.this.f57853a) {
                    if (tXILiveRoomDelegateAdapter != null) {
                        tXILiveRoomDelegateAdapter.onRoomRoleChanged(str, i, i2);
                    }
                }
            }
        };
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            runnable.run();
        } else {
            this.f57854b.post(runnable);
        }
    }

    @Override // com.tencent.iliveroom.TXILiveRoomDelegateAdapter
    public void onRoomVideoMuted(final String str, final long j, final boolean z) {
        TXCLog.m82969i("TXRoomDelegate", "TXRoomDelegate->onRoomVideoMuted roomName:" + str + ", user:" + j);
        Runnable runnable = new Runnable() { // from class: com.tencent.iliveroom.a.c.e.10
            @Override // java.lang.Runnable
            public void run() {
                for (TXILiveRoomDelegateAdapter tXILiveRoomDelegateAdapter : C13961e.this.f57853a) {
                    if (tXILiveRoomDelegateAdapter != null) {
                        tXILiveRoomDelegateAdapter.onRoomVideoMuted(str, j, z);
                    }
                }
            }
        };
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            runnable.run();
        } else {
            this.f57854b.post(runnable);
        }
    }

    @Override // com.tencent.iliveroom.TXILiveRoomDelegateAdapter
    public void onRoomVideoQosChanged(final String str, final int i, final int i2) {
        TXCLog.m82969i("TXRoomDelegate", "TXRoomDelegate->onRoomVideoQosChanged roomName:" + str + ", fps:" + i + ", bitrate: " + i2);
        Runnable runnable = new Runnable() { // from class: com.tencent.iliveroom.a.c.e.13
            @Override // java.lang.Runnable
            public void run() {
                for (TXILiveRoomDelegateAdapter tXILiveRoomDelegateAdapter : C13961e.this.f57853a) {
                    if (tXILiveRoomDelegateAdapter != null) {
                        tXILiveRoomDelegateAdapter.onRoomVideoQosChanged(str, i, i2);
                    }
                }
            }
        };
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            runnable.run();
        } else {
            this.f57854b.post(runnable);
        }
    }

    @Override // com.tencent.iliveroom.TXILiveRoomDelegateAdapter
    public void onSetMixTranscodingConfig(final int i, final String str) {
        TXCLog.m82969i("TXRoomDelegate", "TXRoomDelegate->onSetMixTranscodingConfig err:" + i + ", msg:" + str);
        Runnable runnable = new Runnable() { // from class: com.tencent.iliveroom.a.c.e.20
            @Override // java.lang.Runnable
            public void run() {
                for (TXILiveRoomDelegateAdapter tXILiveRoomDelegateAdapter : C13961e.this.f57853a) {
                    if (tXILiveRoomDelegateAdapter != null) {
                        tXILiveRoomDelegateAdapter.onSetMixTranscodingConfig(i, str);
                    }
                }
            }
        };
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            runnable.run();
        } else {
            this.f57854b.post(runnable);
        }
    }

    @Override // com.tencent.iliveroom.TXILiveRoomDelegateAdapter
    public void onStartPublishCDNStream(final int i, final String str) {
        TXCLog.m82969i("TXRoomDelegate", "TXRoomDelegate->onStartPublishCDNStream err:" + i + ", msg:" + str);
        Runnable runnable = new Runnable() { // from class: com.tencent.iliveroom.a.c.e.18
            @Override // java.lang.Runnable
            public void run() {
                for (TXILiveRoomDelegateAdapter tXILiveRoomDelegateAdapter : C13961e.this.f57853a) {
                    if (tXILiveRoomDelegateAdapter != null) {
                        tXILiveRoomDelegateAdapter.onStartPublishCDNStream(i, str);
                    }
                }
            }
        };
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            runnable.run();
        } else {
            this.f57854b.post(runnable);
        }
    }

    @Override // com.tencent.iliveroom.TXILiveRoomDelegateAdapter
    public void onStatus(final String str, final ArrayList<TXILiveRoomDefine.TXILiveRoomStatus> arrayList) {
        Runnable runnable = new Runnable() { // from class: com.tencent.iliveroom.a.c.e.14
            @Override // java.lang.Runnable
            public void run() {
                for (TXILiveRoomDelegateAdapter tXILiveRoomDelegateAdapter : C13961e.this.f57853a) {
                    if (tXILiveRoomDelegateAdapter != null) {
                        tXILiveRoomDelegateAdapter.onStatus(str, arrayList);
                    }
                }
            }
        };
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            runnable.run();
        } else {
            this.f57854b.post(runnable);
        }
    }

    @Override // com.tencent.iliveroom.TXILiveRoomDelegateAdapter
    public void onStopPublishCDNStream(final int i, final String str) {
        TXCLog.m82969i("TXRoomDelegate", "TXRoomDelegate->onStopPublishCDNStream err:" + i + ", msg:" + str);
        Runnable runnable = new Runnable() { // from class: com.tencent.iliveroom.a.c.e.19
            @Override // java.lang.Runnable
            public void run() {
                for (TXILiveRoomDelegateAdapter tXILiveRoomDelegateAdapter : C13961e.this.f57853a) {
                    if (tXILiveRoomDelegateAdapter != null) {
                        tXILiveRoomDelegateAdapter.onStopPublishCDNStream(i, str);
                    }
                }
            }
        };
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            runnable.run();
        } else {
            this.f57854b.post(runnable);
        }
    }

    @Override // com.tencent.iliveroom.TXILiveRoomDelegateAdapter
    public void onStreamMessageError(final String str, final long j, final int i, final int i2, final int i3) {
        Runnable runnable = new Runnable() { // from class: com.tencent.iliveroom.a.c.e.17
            @Override // java.lang.Runnable
            public void run() {
                for (TXILiveRoomDelegateAdapter tXILiveRoomDelegateAdapter : C13961e.this.f57853a) {
                    if (tXILiveRoomDelegateAdapter != null) {
                        tXILiveRoomDelegateAdapter.onStreamMessageError(str, j, i, i2, i3);
                    }
                }
            }
        };
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            runnable.run();
        } else {
            this.f57854b.post(runnable);
        }
    }

    @Override // com.tencent.iliveroom.TXILiveRoomDelegateAdapter
    public int onTextureCustomProcess(int i, int i2, int i3) {
        Iterator<TXILiveRoomDelegateAdapter> it = this.f57853a.iterator();
        while (it.hasNext()) {
            i = it.next().onTextureCustomProcess(i, i2, i3);
        }
        return i;
    }

    @Override // com.tencent.iliveroom.TXILiveRoomDelegateAdapter
    public void onTextureDestoryed() {
        Iterator<TXILiveRoomDelegateAdapter> it = this.f57853a.iterator();
        while (it.hasNext()) {
            it.next().onTextureDestoryed();
        }
    }

    @Override // com.tencent.iliveroom.TXILiveRoomDelegateAdapter
    public void onWarning(final long j, final int i, final String str) {
        TXCLog.m82969i("TXRoomDelegate", "TXRoomDelegate->onWarning user:" + j + ", code:" + i + ", msg:" + str);
        Runnable runnable = new Runnable() { // from class: com.tencent.iliveroom.a.c.e.24
            @Override // java.lang.Runnable
            public void run() {
                for (TXILiveRoomDelegateAdapter tXILiveRoomDelegateAdapter : C13961e.this.f57853a) {
                    if (tXILiveRoomDelegateAdapter != null) {
                        tXILiveRoomDelegateAdapter.onWarning(j, i, str);
                    }
                }
            }
        };
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            runnable.run();
        } else {
            this.f57854b.post(runnable);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m82639a() {
        this.f57854b.post(new Runnable() { // from class: com.tencent.iliveroom.a.c.e.22
            @Override // java.lang.Runnable
            public void run() {
                TXCLog.m82969i("TXRoomDelegate", "TXRoomDelegate->clean Delegate");
                C13961e.this.f57853a.clear();
            }
        });
    }
}
