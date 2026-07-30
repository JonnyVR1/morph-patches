package com.tencent.liteav.network;

import android.content.Context;
import android.os.Bundle;
import com.tencent.liteav.basic.p092b.InterfaceC14170b;
import com.tencent.liteav.basic.structs.C14204a;
import com.tencent.liteav.basic.structs.TXSNALPacket;
import com.tencent.rtmp.TXLiveConstants;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

/* JADX INFO: loaded from: classes2.dex */
public abstract class TXIStreamDownloader {
    protected Context mApplicationContext;
    protected Map<String, String> mHeaders;
    protected InterfaceC14313f mListener = null;
    protected InterfaceC14170b mNotifyListener = null;
    protected InterfaceC14298a mRestartListener = null;
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
    public interface InterfaceC14298a {
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
            C14204a c14204a = new C14204a();
            c14204a.f59307f = bArr;
            c14204a.f59306e = i;
            if (i2 == 10) {
                if (i3 == 1) {
                    c14204a.f59305d = 2;
                } else {
                    c14204a.f59305d = 3;
                }
                if (c14204a.f59305d == 2) {
                    c14204a.f59304c = 16;
                }
            }
            if (i2 == 2) {
                c14204a.f59305d = 5;
            }
            c14204a.f59309h = i2;
            c14204a.f59308g = i3;
            this.mListener.onPullAudio(c14204a);
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

    public void setListener(InterfaceC14313f interfaceC14313f) {
        this.mListener = interfaceC14313f;
    }

    public void setNotifyListener(InterfaceC14170b interfaceC14170b) {
        this.mNotifyListener = interfaceC14170b;
    }

    public void setOriginUrl(String str) {
        this.mOriginUrl = str;
    }

    public void setRestartListener(InterfaceC14298a interfaceC14298a) {
        this.mRestartListener = interfaceC14298a;
    }

    public void setUserID(String str) {
        this.mUserID = str;
    }

    public abstract void startDownload(Vector<C14312e> vector, boolean z, boolean z2, boolean z3, boolean z4);

    public abstract void stopDownload();

    public void sendNotifyEvent(int i) {
        InterfaceC14170b interfaceC14170b = this.mNotifyListener;
        if (interfaceC14170b != null) {
            interfaceC14170b.onNotifyEvent(i, null);
        }
    }
}
