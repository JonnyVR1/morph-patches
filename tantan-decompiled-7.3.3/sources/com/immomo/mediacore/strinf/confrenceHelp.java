package com.immomo.mediacore.strinf;

import com.immomo.mediacore.sink.SinkBase;
import com.immomo.mediacore.sink.ijkStreamerUtil;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public abstract class confrenceHelp implements NotifyCenter {
    private int mCaptureType = 1;
    private int[] mCaptureTypeMap = new int[4];
    private List<SinkBase.PlaybackDateCallback> mPlaybackDateCallback = new ArrayList();
    private List<SinkBase.RecordDateCallback> mRecordDateCallback = new ArrayList();
    private List<SinkBase.PcmDateCallback> mPcmDateCallback = new ArrayList();
    private ijkStreamerUtil.JsonDateCallback mJsonDateCallback = null;
    private ijkStreamerUtil.ExternAudioDevStatusCallback mADevStatusCallback = null;

    public ijkStreamerUtil.ExternAudioDevStatusCallback getExternAudioDevStatusCallback() {
        return this.mADevStatusCallback;
    }

    public ijkStreamerUtil.JsonDateCallback getJsonDateCallback() {
        return this.mJsonDateCallback;
    }

    public List getPcmDateCallback() {
        return this.mPcmDateCallback;
    }

    public List getPlaybackDateCallback() {
        return this.mPlaybackDateCallback;
    }

    public List getRecordDateCallback() {
        return this.mRecordDateCallback;
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public int getStreamerCaptureType(int i) {
        if (i > 3) {
            i = 0;
        }
        return this.mCaptureTypeMap[i];
    }

    public void postPcmData(long j, byte[] bArr, int i, boolean z) {
        ArrayList<SinkBase.PcmDateCallback> arrayList = new ArrayList();
        arrayList.addAll(this.mPcmDateCallback);
        for (SinkBase.PcmDateCallback pcmDateCallback : arrayList) {
            long j2 = j;
            byte[] bArr2 = bArr;
            int i2 = i;
            boolean z2 = z;
            if (pcmDateCallback != null) {
                pcmDateCallback.onPcmDateCallback(j2, bArr2, i2, z2);
            }
            j = j2;
            bArr = bArr2;
            i = i2;
            z = z2;
        }
    }

    public void postPlaybackData(long j, byte[] bArr, int i, boolean z) {
        for (SinkBase.PlaybackDateCallback playbackDateCallback : this.mPlaybackDateCallback) {
            long j2 = j;
            byte[] bArr2 = bArr;
            int i2 = i;
            boolean z2 = z;
            if (playbackDateCallback != null) {
                playbackDateCallback.onPlaybackFrame(j2, bArr2, i2, z2);
            }
            j = j2;
            bArr = bArr2;
            i = i2;
            z = z2;
        }
    }

    public void postRecordFrame(byte[] bArr, int i, boolean z) {
        for (SinkBase.RecordDateCallback recordDateCallback : this.mRecordDateCallback) {
            if (recordDateCallback != null) {
                recordDateCallback.onRecordFrame(bArr, i, z);
            }
        }
    }

    public void release() {
        List<SinkBase.RecordDateCallback> list = this.mRecordDateCallback;
        if (list != null) {
            list.clear();
            this.mRecordDateCallback = null;
        }
        List<SinkBase.PlaybackDateCallback> list2 = this.mPlaybackDateCallback;
        if (list2 != null) {
            list2.clear();
            this.mPlaybackDateCallback = null;
        }
        List<SinkBase.PcmDateCallback> list3 = this.mPcmDateCallback;
        if (list3 != null) {
            list3.clear();
            this.mPcmDateCallback = null;
        }
        if (this.mADevStatusCallback != null) {
            this.mADevStatusCallback = null;
        }
    }

    public void removePcmDataCallback(SinkBase.PcmDateCallback pcmDateCallback) {
        List<SinkBase.PcmDateCallback> list = this.mPcmDateCallback;
        if (list == null || pcmDateCallback == null || !list.contains(pcmDateCallback)) {
            return;
        }
        this.mPcmDateCallback.remove(pcmDateCallback);
    }

    public void removePlaybackDateCallback(SinkBase.PlaybackDateCallback playbackDateCallback) {
        List<SinkBase.PlaybackDateCallback> list = this.mPlaybackDateCallback;
        if (list == null || playbackDateCallback == null || !list.contains(playbackDateCallback)) {
            return;
        }
        this.mPlaybackDateCallback.remove(playbackDateCallback);
    }

    public void removeRecordDateCallback(SinkBase.RecordDateCallback recordDateCallback) {
        List<SinkBase.RecordDateCallback> list = this.mRecordDateCallback;
        if (list == null || recordDateCallback == null || !list.contains(recordDateCallback)) {
            return;
        }
        this.mRecordDateCallback.remove(recordDateCallback);
    }

    public final void setExternAudioDevStatusCallback(ijkStreamerUtil.ExternAudioDevStatusCallback externAudioDevStatusCallback) {
        this.mADevStatusCallback = externAudioDevStatusCallback;
    }

    public void setJsonDataCallback(ijkStreamerUtil.JsonDateCallback jsonDateCallback) {
        this.mJsonDateCallback = jsonDateCallback;
    }

    public void setPcmDataCallback(SinkBase.PcmDateCallback pcmDateCallback) {
        List<SinkBase.PcmDateCallback> list = this.mPcmDateCallback;
        if (list == null || pcmDateCallback == null || list.contains(pcmDateCallback)) {
            return;
        }
        this.mPcmDateCallback.add(pcmDateCallback);
    }

    public void setPlaybackDateCallback(SinkBase.PlaybackDateCallback playbackDateCallback) {
        List<SinkBase.PlaybackDateCallback> list = this.mPlaybackDateCallback;
        if (list == null || playbackDateCallback == null || list.contains(playbackDateCallback)) {
            return;
        }
        this.mPlaybackDateCallback.add(playbackDateCallback);
    }

    public void setRecordDateCallback(SinkBase.RecordDateCallback recordDateCallback) {
        List<SinkBase.RecordDateCallback> list = this.mRecordDateCallback;
        if (list == null || recordDateCallback == null || list.contains(recordDateCallback)) {
            return;
        }
        this.mRecordDateCallback.add(recordDateCallback);
    }

    @Override // com.immomo.mediacore.strinf.NotifyCenter
    public void setStreamerCaptureType(int i, int i2) {
        this.mCaptureType = i2;
        if (i2 != 1 && i2 != 2) {
            this.mCaptureType = 1;
        }
        if (i > 3) {
            i = 0;
        }
        this.mCaptureTypeMap[i] = this.mCaptureType;
    }
}
