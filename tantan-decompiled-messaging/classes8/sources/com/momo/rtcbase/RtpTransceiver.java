package com.momo.rtcbase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import l.k250;
import l.qkq0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class RtpTransceiver {
    private RtpReceiver cachedReceiver;
    private RtpSender cachedSender;
    private long nativeRtpTransceiver;

    public enum RtpTransceiverDirection {
        SEND_RECV(0),
        SEND_ONLY(1),
        RECV_ONLY(2),
        INACTIVE(3);

        private final int nativeIndex;

        RtpTransceiverDirection(int i) {
            this.nativeIndex = i;
        }

        @CalledByNative("RtpTransceiverDirection")
        public static RtpTransceiverDirection fromNativeIndex(int i) {
            for (RtpTransceiverDirection rtpTransceiverDirection : values()) {
                if (rtpTransceiverDirection.getNativeIndex() == i) {
                    return rtpTransceiverDirection;
                }
            }
            k250.a("Uknown native RtpTransceiverDirection type", i);
            return null;
        }

        @CalledByNative("RtpTransceiverDirection")
        public int getNativeIndex() {
            return this.nativeIndex;
        }
    }

    @CalledByNative
    public RtpTransceiver(long j) {
        this.nativeRtpTransceiver = j;
        this.cachedSender = nativeGetSender(j);
        this.cachedReceiver = nativeGetReceiver(j);
    }

    private void checkRtpTransceiverExists() {
        if (this.nativeRtpTransceiver != 0) {
            return;
        }
        qkq0.a("RtpTransceiver has been disposed.");
    }

    private static native RtpTransceiverDirection nativeCurrentDirection(long j);

    private static native RtpTransceiverDirection nativeDirection(long j);

    private static native MediaStreamTrack.MediaType nativeGetMediaType(long j);

    private static native String nativeGetMid(long j);

    private static native RtpReceiver nativeGetReceiver(long j);

    private static native RtpSender nativeGetSender(long j);

    private static native void nativeSetDirection(long j, RtpTransceiverDirection rtpTransceiverDirection);

    private static native void nativeStop(long j);

    private static native boolean nativeStopped(long j);

    @CalledByNative
    public void dispose() {
        checkRtpTransceiverExists();
        this.cachedSender.dispose();
        this.cachedReceiver.dispose();
        JniCommon.nativeReleaseRef(this.nativeRtpTransceiver);
        this.nativeRtpTransceiver = 0L;
    }

    public RtpTransceiverDirection getCurrentDirection() {
        checkRtpTransceiverExists();
        return nativeCurrentDirection(this.nativeRtpTransceiver);
    }

    public RtpTransceiverDirection getDirection() {
        checkRtpTransceiverExists();
        return nativeDirection(this.nativeRtpTransceiver);
    }

    public MediaStreamTrack.MediaType getMediaType() {
        checkRtpTransceiverExists();
        return nativeGetMediaType(this.nativeRtpTransceiver);
    }

    public String getMid() {
        checkRtpTransceiverExists();
        return nativeGetMid(this.nativeRtpTransceiver);
    }

    public RtpReceiver getReceiver() {
        return this.cachedReceiver;
    }

    public RtpSender getSender() {
        return this.cachedSender;
    }

    public boolean isStopped() {
        checkRtpTransceiverExists();
        return nativeStopped(this.nativeRtpTransceiver);
    }

    public void setDirection(RtpTransceiverDirection rtpTransceiverDirection) {
        checkRtpTransceiverExists();
        nativeSetDirection(this.nativeRtpTransceiver, rtpTransceiverDirection);
    }

    public void stop() {
        checkRtpTransceiverExists();
        nativeStop(this.nativeRtpTransceiver);
    }

    public static final class RtpTransceiverInit {
        private final RtpTransceiverDirection direction;
        private final List<String> streamIds;

        public RtpTransceiverInit(RtpTransceiverDirection rtpTransceiverDirection, List<String> list) {
            this.direction = rtpTransceiverDirection;
            this.streamIds = new ArrayList(list);
        }

        @CalledByNative("RtpTransceiverInit")
        public int getDirectionNativeIndex() {
            return this.direction.getNativeIndex();
        }

        @CalledByNative("RtpTransceiverInit")
        public List<String> getStreamIds() {
            return new ArrayList(this.streamIds);
        }

        public RtpTransceiverInit(RtpTransceiverDirection rtpTransceiverDirection) {
            this(rtpTransceiverDirection, Collections.EMPTY_LIST);
        }

        public RtpTransceiverInit() {
            this(RtpTransceiverDirection.SEND_RECV);
        }
    }
}
