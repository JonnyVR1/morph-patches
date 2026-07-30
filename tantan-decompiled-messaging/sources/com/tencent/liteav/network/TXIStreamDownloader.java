package com.tencent.liteav.network;

import android.content.Context;
import android.os.Bundle;
import com.tencent.liteav.basic.p087b.InterfaceC14007b;
import com.tencent.liteav.basic.structs.C14041a;
import com.tencent.liteav.basic.structs.TXSNALPacket;
import com.tencent.rtmp.TXLiveConstants;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

/* JADX INFO: loaded from: classes2.dex */
public abstract class TXIStreamDownloader {
    protected Context mApplicationContext;
    protected Map<String, String> mHeaders;
    protected InterfaceC14150f mListener = null;
    protected InterfaceC14007b mNotifyListener = null;
    protected InterfaceC14135a mRestartListener = null;
    protected boolean mIsRunning = false;
    protected String mOriginUrl = "";
    public int connectRetryTimes = 0;
    public int connectRetryLimit = 3;
    public int connectRetryInterval = 3;
    protected boolean mEnableMessage = false;
    protected boolean mEnableMetaData = false;
    protected String mFlvSessionKey = "";
    protected String mUserID = "";

    /* JADX INFO: renamed from: com.tencent.liteav.network.TXIStreamDownloader$a */
    public interface InterfaceC14135a {
        void onOldStreamStop();

        void onRestartDownloader();
    }

    public TXIStreamDownloader(Context context) {
        this.mApplicationContext = context;
    }

    public void PushAudioFrame(byte[] bArr, int i, long j, int i2) {
    }

    public void PushVideoFrame(byte[] bArr, int i, long j, long j2, int i2) {
    }

    public int getConnectCountQuic() {
        return 0;
    }

    public int getConnectCountTcp() {
        return 0;
    }

    public String getCurrentStreamUrl() {
        return null;
    }

    public long getCurrentTS() {
        return 0L;
    }

    public TXCStreamDownloader.DownloadStats getDownloadStats() {
        return null;
    }

    public String getFlvSessionKey() {
        return this.mFlvSessionKey;
    }

    public long getLastIFrameTS() {
        return 0L;
    }

    public String getRealStreamUrl() {
        return null;
    }

    public boolean isQuicChannel() {
        return false;
    }

    public void onRecvAudioData(byte[] bArr, int i, int i2, int i3) {
        if (this.mListener != null) {
            C14041a c14041a = new C14041a();
            c14041a.f58459f = bArr;
            c14041a.f58458e = i;
            if (i2 == 10) {
                if (i3 == 1) {
                    c14041a.f58457d = 2;
                } else {
                    c14041a.f58457d = 3;
                }
                if (c14041a.f58457d == 2) {
                    c14041a.f58456c = 16;
                }
            }
            if (i2 == 2) {
                c14041a.f58457d = 5;
            }
            c14041a.f58461h = i2;
            c14041a.f58460g = i3;
            this.mListener.onPullAudio(c14041a);
        }
    }

    public void onRecvMetaData(HashMap<String, String> map) {
        if (map == null || map.size() <= 0 || this.mNotifyListener == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putSerializable("EVT_GET_METADATA", map);
        this.mNotifyListener.onNotifyEvent(2028, bundle);
    }

    public void onRecvSEIData(byte[] bArr) {
        if (bArr == null || bArr.length <= 0 || this.mNotifyListener == null) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putByteArray(TXLiveConstants.EVT_GET_MSG, bArr);
        this.mNotifyListener.onNotifyEvent(2012, bundle);
    }

    public void onRecvVideoData(byte[] bArr, int i, long j, long j2, int i2) {
        if (this.mListener != null) {
            TXSNALPacket tXSNALPacket = new TXSNALPacket();
            tXSNALPacket.nalData = bArr;
            tXSNALPacket.nalType = i;
            tXSNALPacket.dts = j;
            tXSNALPacket.pts = j2;
            tXSNALPacket.codecId = i2;
            this.mListener.onPullNAL(tXSNALPacket);
        }
    }

    public void requestKeyFrame(String str) {
    }

    public void sendNotifyEvent(int i, String str) {
        if (this.mNotifyListener != null) {
            Bundle bundle = new Bundle();
            bundle.putString(TXLiveConstants.EVT_DESCRIPTION, str);
            this.mNotifyListener.onNotifyEvent(i, bundle);
        }
    }

    public void setFlvSessionKey(String str) {
        this.mFlvSessionKey = str;
    }

    public void setHeaders(Map<String, String> map) {
        this.mHeaders = map;
    }

    public void setListener(InterfaceC14150f interfaceC14150f) {
        this.mListener = interfaceC14150f;
    }

    public void setNotifyListener(InterfaceC14007b interfaceC14007b) {
        this.mNotifyListener = interfaceC14007b;
    }

    public void setOriginUrl(String str) {
        this.mOriginUrl = str;
    }

    public void setRestartListener(InterfaceC14135a interfaceC14135a) {
        this.mRestartListener = interfaceC14135a;
    }

    public void setUserID(String str) {
        this.mUserID = str;
    }

    public abstract void startDownload(Vector<C14149e> vector, boolean z, boolean z2, boolean z3, boolean z4);

    public abstract void stopDownload();

    public void sendNotifyEvent(int i) {
        InterfaceC14007b interfaceC14007b = this.mNotifyListener;
        if (interfaceC14007b != null) {
            interfaceC14007b.onNotifyEvent(i, null);
        }
    }
}
