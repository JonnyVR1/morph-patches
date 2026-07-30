package com.p069ss.bytertc.engine.data;

import com.bytedance.realx.base.CalledByNative;
import com.tencent.liteav.TXLiteAVCode;

/* JADX INFO: loaded from: classes13.dex */
public class ForwardStreamStateInfo {
    public ForwardStreamError error;
    public String roomId;
    public ForwardStreamState state;

    public enum ForwardStreamError {
        FORWARD_STREAM_ERROR_OK(0),
        FORWARD_STREAM_ERROR_INVALID_ARGUMENT(TXLiteAVCode.WARNING_MICROPHONE_DEVICE_EMPTY),
        FORWARD_STREAM_ERROR_INVALID_TOKEN(TXLiteAVCode.WARNING_SPEAKER_DEVICE_EMPTY),
        FORWARD_STREAM_ERROR_RESPONSE(TXLiteAVCode.WARNING_MICROPHONE_NOT_AUTHORIZED),
        FORWARD_STREAM_ERROR_REMOTE_KICKED(TXLiteAVCode.WARNING_MICROPHONE_DEVICE_ABNORMAL),
        FORWARD_STREAM_ERROR_NOT_SUPPORT(TXLiteAVCode.WARNING_SPEAKER_DEVICE_ABNORMAL);

        private int value;

        ForwardStreamError(int i) {
            this.value = i;
        }

        public static ForwardStreamError fromId(int i) {
            for (ForwardStreamError forwardStreamError : values()) {
                if (forwardStreamError.value() == i) {
                    return forwardStreamError;
                }
            }
            return null;
        }

        public int value() {
            return this.value;
        }
    }

    public enum ForwardStreamState {
        FORWARD_STREAM_STATE_IDLE(0),
        FORWARD_STREAM_STATE_SUCCESS(1),
        FORWARD_STREAM_STATE_FAILURE(2);

        private int value;

        ForwardStreamState(int i) {
            this.value = i;
        }

        public static ForwardStreamState fromId(int i) {
            for (ForwardStreamState forwardStreamState : values()) {
                if (forwardStreamState.value() == i) {
                    return forwardStreamState;
                }
            }
            return null;
        }

        public int value() {
            return this.value;
        }
    }

    public ForwardStreamStateInfo(String str, ForwardStreamState forwardStreamState, ForwardStreamError forwardStreamError) {
        this.roomId = str;
        this.state = forwardStreamState;
        this.error = forwardStreamError;
    }

    @CalledByNative
    private static ForwardStreamStateInfo create(String str, int i, int i2) {
        return new ForwardStreamStateInfo(str, ForwardStreamState.fromId(i), ForwardStreamError.fromId(i2));
    }
}
