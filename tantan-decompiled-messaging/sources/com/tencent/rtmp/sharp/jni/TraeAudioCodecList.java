package com.tencent.rtmp.sharp.jni;

import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes2.dex */
public class TraeAudioCodecList {
    private ArrayList<CodecInfo> _sessionInfoList = new ArrayList<>();
    private ReentrantLock mLock = new ReentrantLock();

    public class CodecInfo {
        public byte[] _tempBufdec;
        public AudioDecoder audioDecoder;
        public long sessionId;

        public CodecInfo() {
        }
    }

    public CodecInfo add(long j) {
        CodecInfo codecInfoFind = find(j);
        if (codecInfoFind != null) {
            return codecInfoFind;
        }
        CodecInfo codecInfo = new CodecInfo();
        codecInfo.sessionId = j;
        codecInfo.audioDecoder = new AudioDecoder();
        codecInfo._tempBufdec = new byte[3840];
        this.mLock.lock();
        this._sessionInfoList.add(codecInfo);
        this.mLock.unlock();
        return find(j);
    }

    public CodecInfo find(long j) {
        CodecInfo codecInfo;
        this.mLock.lock();
        for (int i = 0; i < this._sessionInfoList.size(); i++) {
            codecInfo = this._sessionInfoList.get(i);
            if (codecInfo.sessionId == j) {
                this.mLock.unlock();
                return codecInfo;
            }
        }
        codecInfo = null;
        this.mLock.unlock();
        return codecInfo;
    }

    public void remove(long j) {
        this.mLock.lock();
        for (int i = 0; i < this._sessionInfoList.size(); i++) {
            if (this._sessionInfoList.get(i).sessionId == j) {
                this._sessionInfoList.remove(i);
                break;
            }
        }
        this.mLock.unlock();
    }
}
