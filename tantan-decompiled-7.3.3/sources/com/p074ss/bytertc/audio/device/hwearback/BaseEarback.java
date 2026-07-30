package com.p074ss.bytertc.audio.device.hwearback;

import android.content.Context;
import com.bytedance.realx.base.RXLogging;
import com.p074ss.bytertc.audio.device.webrtc.WebRtcAudioEarBack;

/* JADX INFO: loaded from: classes11.dex */
public abstract class BaseEarback implements IHardWareEarback {
    public static final int RESULT_INVALID_STATE = -2;
    public static final int RESULT_OP_FAILED = -1;
    public static final int RESULT_SUCCESS = 0;
    private static final String TAG = "BaseEarback";
    protected final Context context;
    private volatile EarbackState state = EarbackState.IDLE;
    protected final WebRtcAudioEarBack webRtcAudioEarBack;

    public enum EarbackState {
        IDLE,
        INITIALIZING,
        INITIALIZED,
        RUNNING
    }

    public BaseEarback(Context context, WebRtcAudioEarBack webRtcAudioEarBack) {
        this.context = context;
        this.webRtcAudioEarBack = webRtcAudioEarBack;
    }

    private void changeState(EarbackState earbackState) {
        RXLogging.m5744i(TAG, "changeState: " + this.state + " -> " + earbackState);
        EarbackState earbackState2 = this.state;
        this.state = earbackState;
        if (earbackState2 != earbackState) {
            onStateChanged(earbackState2, earbackState);
        }
    }

    @Override // com.p074ss.bytertc.audio.device.hwearback.IHardWareEarback
    public synchronized int close() {
        RXLogging.m5744i(TAG, "close() with state: " + this.state);
        if (this.state != EarbackState.RUNNING) {
            return -2;
        }
        if (!onClose()) {
            return -1;
        }
        changeState(EarbackState.INITIALIZED);
        return 0;
    }

    public EarbackState getState() {
        return this.state;
    }

    @Override // com.p074ss.bytertc.audio.device.hwearback.IHardWareEarback
    public synchronized int init() {
        try {
            RXLogging.m5744i(TAG, "init() with state: " + this.state);
            if (this.state.ordinal() >= EarbackState.INITIALIZED.ordinal()) {
                this.webRtcAudioEarBack.onHardwareEarbackSupported(isSupport());
            } else if (this.state == EarbackState.INITIALIZING) {
                return 0;
            }
            changeState(EarbackState.INITIALIZING);
            onInit();
            return 0;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.p074ss.bytertc.audio.device.hwearback.IHardWareEarback
    public boolean isSupport() {
        if (this.state.ordinal() < EarbackState.INITIALIZED.ordinal()) {
            return false;
        }
        return onIsSupportCall();
    }

    public abstract boolean onClose();

    public abstract void onInit();

    public synchronized void onInitResult(boolean z) {
        try {
            if (this.state == EarbackState.INITIALIZING) {
                this.state = z ? EarbackState.INITIALIZED : EarbackState.IDLE;
                this.webRtcAudioEarBack.onHardwareEarbackSupported(z && isSupport());
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public abstract boolean onIsSupportCall();

    public abstract boolean onOpen();

    public abstract void onRelease();

    public synchronized void onStateChanged(EarbackState earbackState, EarbackState earbackState2) {
    }

    @Override // com.p074ss.bytertc.audio.device.hwearback.IHardWareEarback
    public synchronized int open() {
        RXLogging.m5744i(TAG, "open() with state: " + this.state);
        EarbackState earbackState = this.state;
        EarbackState earbackState2 = EarbackState.RUNNING;
        if (earbackState == earbackState2) {
            return 0;
        }
        if (this.state == EarbackState.INITIALIZED && isSupport()) {
            if (!onOpen()) {
                return -1;
            }
            changeState(earbackState2);
            return 0;
        }
        return -2;
    }

    @Override // com.p074ss.bytertc.audio.device.hwearback.IHardWareEarback
    public synchronized int release() {
        RXLogging.m5744i(TAG, "release() with state: " + this.state);
        EarbackState earbackState = this.state;
        EarbackState earbackState2 = EarbackState.IDLE;
        if (earbackState == earbackState2) {
            return 0;
        }
        onRelease();
        changeState(earbackState2);
        return 0;
    }
}
