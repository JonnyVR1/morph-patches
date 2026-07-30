package com.tencent.rtmp.sharp.jni;

import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes2.dex */
public class TraeAudioSessionHost {
    private ArrayList<SessionInfo> _sessionInfoList = new ArrayList<>();
    private ReentrantLock mLock = new ReentrantLock();

    public class SessionInfo {
        public TraeAudioSession _traeAs;
        public long sessionId;

        public SessionInfo() {
        }
    }

    public void add(TraeAudioSession traeAudioSession, long j, Context context) {
        if (find(j) != null) {
            return;
        }
        SessionInfo sessionInfo = new SessionInfo();
        sessionInfo.sessionId = j;
        sessionInfo._traeAs = traeAudioSession;
        this.mLock.lock();
        this._sessionInfoList.add(sessionInfo);
        this.mLock.unlock();
    }

    public SessionInfo find(long j) {
        SessionInfo sessionInfo;
        this.mLock.lock();
        for (int i = 0; i < this._sessionInfoList.size(); i++) {
            sessionInfo = this._sessionInfoList.get(i);
            if (sessionInfo.sessionId == j) {
                this.mLock.unlock();
                return sessionInfo;
            }
        }
        sessionInfo = null;
        this.mLock.unlock();
        return sessionInfo;
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

    public void sendToAudioSessionMessage(Intent intent) {
        this.mLock.lock();
        for (int i = 0; i < this._sessionInfoList.size(); i++) {
            this._sessionInfoList.get(i)._traeAs.onReceiveCallback(intent);
        }
        this.mLock.unlock();
    }
}
