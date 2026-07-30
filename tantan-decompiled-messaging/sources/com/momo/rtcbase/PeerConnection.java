package com.momo.rtcbase;

import com.clevertap.android.sdk.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import p149l.ig3;
import p149l.jfd0;
import p149l.qhg0;
import p149l.qkq0;

/* JADX INFO: loaded from: classes8.dex */
public class PeerConnection {
    private final List<MediaStream> localStreams;
    private final long nativePeerConnection;
    private List<RtpReceiver> receivers;
    private List<RtpSender> senders;
    private List<RtpTransceiver> transceivers;

    public enum AdapterType {
        UNKNOWN,
        ETHERNET,
        WIFI,
        CELLULAR,
        VPN,
        LOOPBACK
    }

    public enum BundlePolicy {
        BALANCED,
        MAXBUNDLE,
        MAXCOMPAT
    }

    public enum CandidateNetworkPolicy {
        ALL,
        LOW_COST
    }

    public enum ContinualGatheringPolicy {
        GATHER_ONCE,
        GATHER_CONTINUALLY
    }

    public enum IceConnectionState {
        NEW,
        CHECKING,
        CONNECTED,
        COMPLETED,
        FAILED,
        DISCONNECTED,
        CLOSED;

        @CalledByNative("IceConnectionState")
        public static IceConnectionState fromNativeIndex(int i) {
            return values()[i];
        }
    }

    public enum IceGatheringState {
        NEW,
        GATHERING,
        COMPLETE;

        @CalledByNative("IceGatheringState")
        public static IceGatheringState fromNativeIndex(int i) {
            return values()[i];
        }
    }

    public enum IceTransportsType {
        NONE,
        RELAY,
        NOHOST,
        ALL
    }

    public static class IntervalRange {
        private final int max;
        private final int min;

        public IntervalRange(int i, int i2) {
            this.min = i;
            this.max = i2;
        }

        @CalledByNative("IntervalRange")
        public int getMax() {
            return this.max;
        }

        @CalledByNative("IntervalRange")
        public int getMin() {
            return this.min;
        }
    }

    public enum KeyType {
        RSA,
        ECDSA
    }

    public interface Observer {
        @CalledByNative("Observer")
        void onAddStream(MediaStream mediaStream);

        @CalledByNative("Observer")
        void onAddTrack(RtpReceiver rtpReceiver, MediaStream[] mediaStreamArr);

        @CalledByNative("Observer")
        default void onConnectionChange(PeerConnectionState peerConnectionState) {
        }

        @CalledByNative("Observer")
        void onDataChannel(DataChannel dataChannel);

        @CalledByNative("Observer")
        void onIceCandidate(IceCandidate iceCandidate);

        @CalledByNative("Observer")
        void onIceCandidatesRemoved(IceCandidate[] iceCandidateArr);

        @CalledByNative("Observer")
        void onIceConnectionChange(IceConnectionState iceConnectionState);

        @CalledByNative("Observer")
        void onIceConnectionReceivingChange(boolean z);

        @CalledByNative("Observer")
        void onIceGatheringChange(IceGatheringState iceGatheringState);

        @CalledByNative("Observer")
        void onRemoveStream(MediaStream mediaStream);

        @CalledByNative("Observer")
        void onRenegotiationNeeded();

        @CalledByNative("Observer")
        void onSignalingChange(SignalingState signalingState);

        @CalledByNative("Observer")
        default void onTrack(RtpTransceiver rtpTransceiver) {
        }
    }

    public enum PeerConnectionState {
        NEW,
        CONNECTING,
        CONNECTED,
        DISCONNECTED,
        FAILED,
        CLOSED;

        @CalledByNative("PeerConnectionState")
        public static PeerConnectionState fromNativeIndex(int i) {
            return values()[i];
        }
    }

    public static class RTCConfiguration {
        public RtcCertificatePem certificate;
        public List<IceServer> iceServers;
        public TurnCustomizer turnCustomizer;
        public IceTransportsType iceTransportsType = IceTransportsType.ALL;
        public BundlePolicy bundlePolicy = BundlePolicy.BALANCED;
        public RtcpMuxPolicy rtcpMuxPolicy = RtcpMuxPolicy.REQUIRE;
        public TcpCandidatePolicy tcpCandidatePolicy = TcpCandidatePolicy.ENABLED;
        public CandidateNetworkPolicy candidateNetworkPolicy = CandidateNetworkPolicy.ALL;
        public int audioJitterBufferMaxPackets = 50;
        public boolean audioJitterBufferFastAccelerate = false;
        public int iceConnectionReceivingTimeout = -1;
        public int iceBackupCandidatePairPingInterval = -1;
        public KeyType keyType = KeyType.ECDSA;
        public ContinualGatheringPolicy continualGatheringPolicy = ContinualGatheringPolicy.GATHER_ONCE;
        public int iceCandidatePoolSize = 0;
        public boolean pruneTurnPorts = false;
        public boolean presumeWritableWhenFullyRelayed = false;
        public Integer iceCheckIntervalStrongConnectivityMs = null;
        public Integer iceCheckIntervalWeakConnectivityMs = null;
        public Integer iceCheckMinInterval = null;
        public Integer iceUnwritableTimeMs = null;
        public Integer iceUnwritableMinChecks = null;
        public Integer stunCandidateKeepaliveIntervalMs = null;
        public boolean disableIPv6OnWifi = false;
        public int maxIPv6Networks = 5;
        public IntervalRange iceRegatherIntervalRange = null;
        public boolean disableIpv6 = false;
        public boolean enableDscp = false;
        public boolean enableCpuOveruseDetection = true;
        public boolean enableRtpDataChannel = false;
        public boolean suspendBelowMinBitrate = false;
        public Integer screencastMinBitrate = null;
        public Boolean combinedAudioVideoBwe = null;
        public Boolean enableDtlsSrtp = null;
        public AdapterType networkPreference = AdapterType.UNKNOWN;
        public SdpSemantics sdpSemantics = SdpSemantics.PLAN_B;
        public boolean activeResetSrtpParams = false;
        public boolean useMediaTransport = false;
        public boolean useMediaTransportForDataChannels = false;
        public CryptoOptions cryptoOptions = null;

        public RTCConfiguration(List<IceServer> list) {
            this.iceServers = list;
        }

        @CalledByNative("RTCConfiguration")
        public boolean getActiveResetSrtpParams() {
            return this.activeResetSrtpParams;
        }

        @CalledByNative("RTCConfiguration")
        public boolean getAudioJitterBufferFastAccelerate() {
            return this.audioJitterBufferFastAccelerate;
        }

        @CalledByNative("RTCConfiguration")
        public int getAudioJitterBufferMaxPackets() {
            return this.audioJitterBufferMaxPackets;
        }

        @CalledByNative("RTCConfiguration")
        public BundlePolicy getBundlePolicy() {
            return this.bundlePolicy;
        }

        @CalledByNative("RTCConfiguration")
        public CandidateNetworkPolicy getCandidateNetworkPolicy() {
            return this.candidateNetworkPolicy;
        }

        @CalledByNative("RTCConfiguration")
        public RtcCertificatePem getCertificate() {
            return this.certificate;
        }

        @CalledByNative("RTCConfiguration")
        public Boolean getCombinedAudioVideoBwe() {
            return this.combinedAudioVideoBwe;
        }

        @CalledByNative("RTCConfiguration")
        public ContinualGatheringPolicy getContinualGatheringPolicy() {
            return this.continualGatheringPolicy;
        }

        @CalledByNative("RTCConfiguration")
        public CryptoOptions getCryptoOptions() {
            return this.cryptoOptions;
        }

        @CalledByNative("RTCConfiguration")
        public boolean getDisableIPv6OnWifi() {
            return this.disableIPv6OnWifi;
        }

        @CalledByNative("RTCConfiguration")
        public boolean getDisableIpv6() {
            return this.disableIpv6;
        }

        @CalledByNative("RTCConfiguration")
        public boolean getEnableCpuOveruseDetection() {
            return this.enableCpuOveruseDetection;
        }

        @CalledByNative("RTCConfiguration")
        public boolean getEnableDscp() {
            return this.enableDscp;
        }

        @CalledByNative("RTCConfiguration")
        public Boolean getEnableDtlsSrtp() {
            return this.enableDtlsSrtp;
        }

        @CalledByNative("RTCConfiguration")
        public boolean getEnableRtpDataChannel() {
            return this.enableRtpDataChannel;
        }

        @CalledByNative("RTCConfiguration")
        public int getIceBackupCandidatePairPingInterval() {
            return this.iceBackupCandidatePairPingInterval;
        }

        @CalledByNative("RTCConfiguration")
        public int getIceCandidatePoolSize() {
            return this.iceCandidatePoolSize;
        }

        @CalledByNative("RTCConfiguration")
        public Integer getIceCheckIntervalStrongConnectivity() {
            return this.iceCheckIntervalStrongConnectivityMs;
        }

        @CalledByNative("RTCConfiguration")
        public Integer getIceCheckIntervalWeakConnectivity() {
            return this.iceCheckIntervalWeakConnectivityMs;
        }

        @CalledByNative("RTCConfiguration")
        public Integer getIceCheckMinInterval() {
            return this.iceCheckMinInterval;
        }

        @CalledByNative("RTCConfiguration")
        public int getIceConnectionReceivingTimeout() {
            return this.iceConnectionReceivingTimeout;
        }

        @CalledByNative("RTCConfiguration")
        public IntervalRange getIceRegatherIntervalRange() {
            return this.iceRegatherIntervalRange;
        }

        @CalledByNative("RTCConfiguration")
        public List<IceServer> getIceServers() {
            return this.iceServers;
        }

        @CalledByNative("RTCConfiguration")
        public IceTransportsType getIceTransportsType() {
            return this.iceTransportsType;
        }

        @CalledByNative("RTCConfiguration")
        public Integer getIceUnwritableMinChecks() {
            return this.iceUnwritableMinChecks;
        }

        @CalledByNative("RTCConfiguration")
        public Integer getIceUnwritableTimeout() {
            return this.iceUnwritableTimeMs;
        }

        @CalledByNative("RTCConfiguration")
        public KeyType getKeyType() {
            return this.keyType;
        }

        @CalledByNative("RTCConfiguration")
        public int getMaxIPv6Networks() {
            return this.maxIPv6Networks;
        }

        @CalledByNative("RTCConfiguration")
        public AdapterType getNetworkPreference() {
            return this.networkPreference;
        }

        @CalledByNative("RTCConfiguration")
        public boolean getPresumeWritableWhenFullyRelayed() {
            return this.presumeWritableWhenFullyRelayed;
        }

        @CalledByNative("RTCConfiguration")
        public boolean getPruneTurnPorts() {
            return this.pruneTurnPorts;
        }

        @CalledByNative("RTCConfiguration")
        public RtcpMuxPolicy getRtcpMuxPolicy() {
            return this.rtcpMuxPolicy;
        }

        @CalledByNative("RTCConfiguration")
        public Integer getScreencastMinBitrate() {
            return this.screencastMinBitrate;
        }

        @CalledByNative("RTCConfiguration")
        public SdpSemantics getSdpSemantics() {
            return this.sdpSemantics;
        }

        @CalledByNative("RTCConfiguration")
        public Integer getStunCandidateKeepaliveInterval() {
            return this.stunCandidateKeepaliveIntervalMs;
        }

        @CalledByNative("RTCConfiguration")
        public boolean getSuspendBelowMinBitrate() {
            return this.suspendBelowMinBitrate;
        }

        @CalledByNative("RTCConfiguration")
        public TcpCandidatePolicy getTcpCandidatePolicy() {
            return this.tcpCandidatePolicy;
        }

        @CalledByNative("RTCConfiguration")
        public TurnCustomizer getTurnCustomizer() {
            return this.turnCustomizer;
        }

        @CalledByNative("RTCConfiguration")
        public boolean getUseMediaTransport() {
            return this.useMediaTransport;
        }

        @CalledByNative("RTCConfiguration")
        public boolean getUseMediaTransportForDataChannels() {
            return this.useMediaTransportForDataChannels;
        }
    }

    public enum RtcpMuxPolicy {
        NEGOTIATE,
        REQUIRE
    }

    public enum SdpSemantics {
        PLAN_B,
        UNIFIED_PLAN
    }

    public enum SignalingState {
        STABLE,
        HAVE_LOCAL_OFFER,
        HAVE_LOCAL_PRANSWER,
        HAVE_REMOTE_OFFER,
        HAVE_REMOTE_PRANSWER,
        CLOSED;

        @CalledByNative("SignalingState")
        public static SignalingState fromNativeIndex(int i) {
            return values()[i];
        }
    }

    public enum TcpCandidatePolicy {
        ENABLED,
        DISABLED
    }

    public enum TlsCertPolicy {
        TLS_CERT_POLICY_SECURE,
        TLS_CERT_POLICY_INSECURE_NO_CHECK
    }

    public PeerConnection(long j) {
        this.localStreams = new ArrayList();
        this.senders = new ArrayList();
        this.receivers = new ArrayList();
        this.transceivers = new ArrayList();
        this.nativePeerConnection = j;
    }

    public static long createNativePeerConnectionObserver(Observer observer) {
        return nativeCreatePeerConnectionObserver(observer);
    }

    private native boolean nativeAddIceCandidate(String str, int i, String str2);

    private native boolean nativeAddLocalStream(long j);

    private native RtpSender nativeAddTrack(long j, List<String> list);

    private native RtpTransceiver nativeAddTransceiverOfType(MediaStreamTrack.MediaType mediaType, RtpTransceiver.RtpTransceiverInit rtpTransceiverInit);

    private native RtpTransceiver nativeAddTransceiverWithTrack(long j, RtpTransceiver.RtpTransceiverInit rtpTransceiverInit);

    private native void nativeClose();

    private native PeerConnectionState nativeConnectionState();

    private native void nativeCreateAnswer(SdpObserver sdpObserver, MediaConstraints mediaConstraints);

    private native DataChannel nativeCreateDataChannel(String str, DataChannel.Init init);

    private native void nativeCreateOffer(SdpObserver sdpObserver, MediaConstraints mediaConstraints);

    private static native long nativeCreatePeerConnectionObserver(Observer observer);

    private native RtpSender nativeCreateSender(String str, String str2);

    private static native void nativeFreeOwnedPeerConnection(long j);

    private native RtcCertificatePem nativeGetCertificate();

    private native SessionDescription nativeGetLocalDescription();

    private native long nativeGetNativePeerConnection();

    private native List<RtpReceiver> nativeGetReceivers();

    private native SessionDescription nativeGetRemoteDescription();

    private native List<RtpSender> nativeGetSenders();

    private native List<RtpTransceiver> nativeGetTransceivers();

    private native IceConnectionState nativeIceConnectionState();

    private native IceGatheringState nativeIceGatheringState();

    private native void nativeNewGetStats(RTCStatsCollectorCallback rTCStatsCollectorCallback);

    private native boolean nativeOldGetStats(StatsObserver statsObserver, long j);

    private native boolean nativeRemoveIceCandidates(IceCandidate[] iceCandidateArr);

    private native void nativeRemoveLocalStream(long j);

    private native boolean nativeRemoveTrack(long j);

    private native void nativeSetAudioPlayout(boolean z);

    private native void nativeSetAudioRecording(boolean z);

    private native boolean nativeSetBitrate(Integer num, Integer num2, Integer num3);

    private native boolean nativeSetConfiguration(RTCConfiguration rTCConfiguration);

    private native void nativeSetLocalDescription(SdpObserver sdpObserver, SessionDescription sessionDescription);

    private native void nativeSetRemoteDescription(SdpObserver sdpObserver, SessionDescription sessionDescription);

    private native SignalingState nativeSignalingState();

    private native boolean nativeStartRtcEventLog(int i, int i2);

    private native void nativeStopRtcEventLog();

    public boolean addIceCandidate(IceCandidate iceCandidate) {
        return nativeAddIceCandidate(iceCandidate.sdpMid, iceCandidate.sdpMLineIndex, iceCandidate.sdp);
    }

    public boolean addStream(MediaStream mediaStream) {
        if (!nativeAddLocalStream(mediaStream.getNativeMediaStream())) {
            return false;
        }
        this.localStreams.add(mediaStream);
        return true;
    }

    public RtpSender addTrack(MediaStreamTrack mediaStreamTrack, List<String> list) {
        if (mediaStreamTrack == null || list == null) {
            jfd0.m141176a("No MediaStreamTrack specified in addTrack.");
            return null;
        }
        RtpSender rtpSenderNativeAddTrack = nativeAddTrack(mediaStreamTrack.getNativeMediaStreamTrack(), list);
        if (rtpSenderNativeAddTrack != null) {
            this.senders.add(rtpSenderNativeAddTrack);
            return rtpSenderNativeAddTrack;
        }
        qkq0.m175383a("C++ addTrack failed.");
        return null;
    }

    public RtpTransceiver addTransceiver(MediaStreamTrack mediaStreamTrack, RtpTransceiver.RtpTransceiverInit rtpTransceiverInit) {
        if (mediaStreamTrack == null) {
            jfd0.m141176a("No MediaStreamTrack specified for addTransceiver.");
            return null;
        }
        if (rtpTransceiverInit == null) {
            rtpTransceiverInit = new RtpTransceiver.RtpTransceiverInit();
        }
        RtpTransceiver rtpTransceiverNativeAddTransceiverWithTrack = nativeAddTransceiverWithTrack(mediaStreamTrack.getNativeMediaStreamTrack(), rtpTransceiverInit);
        if (rtpTransceiverNativeAddTransceiverWithTrack != null) {
            this.transceivers.add(rtpTransceiverNativeAddTransceiverWithTrack);
            return rtpTransceiverNativeAddTransceiverWithTrack;
        }
        qkq0.m175383a("C++ addTransceiver failed.");
        return null;
    }

    public void close() {
        nativeClose();
    }

    public PeerConnectionState connectionState() {
        return nativeConnectionState();
    }

    public void createAnswer(SdpObserver sdpObserver, MediaConstraints mediaConstraints) {
        nativeCreateAnswer(sdpObserver, mediaConstraints);
    }

    public DataChannel createDataChannel(String str, DataChannel.Init init) {
        return nativeCreateDataChannel(str, init);
    }

    public void createOffer(SdpObserver sdpObserver, MediaConstraints mediaConstraints) {
        nativeCreateOffer(sdpObserver, mediaConstraints);
    }

    public RtpSender createSender(String str, String str2) {
        RtpSender rtpSenderNativeCreateSender = nativeCreateSender(str, str2);
        if (rtpSenderNativeCreateSender != null) {
            this.senders.add(rtpSenderNativeCreateSender);
        }
        return rtpSenderNativeCreateSender;
    }

    public void dispose() {
        close();
        for (MediaStream mediaStream : this.localStreams) {
            nativeRemoveLocalStream(mediaStream.getNativeMediaStream());
            mediaStream.dispose();
        }
        this.localStreams.clear();
        Iterator<RtpSender> it = this.senders.iterator();
        while (it.hasNext()) {
            it.next().dispose();
        }
        this.senders.clear();
        Iterator<RtpReceiver> it2 = this.receivers.iterator();
        while (it2.hasNext()) {
            it2.next().dispose();
        }
        Iterator<RtpTransceiver> it3 = this.transceivers.iterator();
        while (it3.hasNext()) {
            it3.next().dispose();
        }
        this.transceivers.clear();
        this.receivers.clear();
        nativeFreeOwnedPeerConnection(this.nativePeerConnection);
    }

    public RtcCertificatePem getCertificate() {
        return nativeGetCertificate();
    }

    public SessionDescription getLocalDescription() {
        return nativeGetLocalDescription();
    }

    @CalledByNative
    public long getNativeOwnedPeerConnection() {
        return this.nativePeerConnection;
    }

    public long getNativePeerConnection() {
        return nativeGetNativePeerConnection();
    }

    public List<RtpReceiver> getReceivers() {
        Iterator<RtpReceiver> it = this.receivers.iterator();
        while (it.hasNext()) {
            it.next().dispose();
        }
        List<RtpReceiver> listNativeGetReceivers = nativeGetReceivers();
        this.receivers = listNativeGetReceivers;
        return Collections.unmodifiableList(listNativeGetReceivers);
    }

    public SessionDescription getRemoteDescription() {
        return nativeGetRemoteDescription();
    }

    public List<RtpSender> getSenders() {
        Iterator<RtpSender> it = this.senders.iterator();
        while (it.hasNext()) {
            it.next().dispose();
        }
        List<RtpSender> listNativeGetSenders = nativeGetSenders();
        this.senders = listNativeGetSenders;
        return Collections.unmodifiableList(listNativeGetSenders);
    }

    @Deprecated
    public boolean getStats(StatsObserver statsObserver, MediaStreamTrack mediaStreamTrack) {
        return nativeOldGetStats(statsObserver, mediaStreamTrack == null ? 0L : mediaStreamTrack.getNativeMediaStreamTrack());
    }

    public List<RtpTransceiver> getTransceivers() {
        Iterator<RtpTransceiver> it = this.transceivers.iterator();
        while (it.hasNext()) {
            it.next().dispose();
        }
        List<RtpTransceiver> listNativeGetTransceivers = nativeGetTransceivers();
        this.transceivers = listNativeGetTransceivers;
        return Collections.unmodifiableList(listNativeGetTransceivers);
    }

    public IceConnectionState iceConnectionState() {
        return nativeIceConnectionState();
    }

    public IceGatheringState iceGatheringState() {
        return nativeIceGatheringState();
    }

    public boolean removeIceCandidates(IceCandidate[] iceCandidateArr) {
        return nativeRemoveIceCandidates(iceCandidateArr);
    }

    public void removeStream(MediaStream mediaStream) {
        nativeRemoveLocalStream(mediaStream.getNativeMediaStream());
        this.localStreams.remove(mediaStream);
    }

    public boolean removeTrack(RtpSender rtpSender) {
        if (rtpSender != null) {
            return nativeRemoveTrack(rtpSender.getNativeRtpSender());
        }
        jfd0.m141176a("No RtpSender specified for removeTrack.");
        return false;
    }

    public void setAudioPlayout(boolean z) {
        nativeSetAudioPlayout(z);
    }

    public void setAudioRecording(boolean z) {
        nativeSetAudioRecording(z);
    }

    public boolean setBitrate(Integer num, Integer num2, Integer num3) {
        return nativeSetBitrate(num, num2, num3);
    }

    public boolean setConfiguration(RTCConfiguration rTCConfiguration) {
        return nativeSetConfiguration(rTCConfiguration);
    }

    public void setLocalDescription(SdpObserver sdpObserver, SessionDescription sessionDescription) {
        nativeSetLocalDescription(sdpObserver, sessionDescription);
    }

    public void setRemoteDescription(SdpObserver sdpObserver, SessionDescription sessionDescription) {
        nativeSetRemoteDescription(sdpObserver, sessionDescription);
    }

    public SignalingState signalingState() {
        return nativeSignalingState();
    }

    public boolean startRtcEventLog(int i, int i2) {
        return nativeStartRtcEventLog(i, i2);
    }

    public void stopRtcEventLog() {
        nativeStopRtcEventLog();
    }

    public static class IceServer {
        public final String hostname;
        public final String password;
        public final List<String> tlsAlpnProtocols;
        public final TlsCertPolicy tlsCertPolicy;
        public final List<String> tlsEllipticCurves;

        @Deprecated
        public final String uri;
        public final List<String> urls;
        public final String username;

        public static class Builder {
            private String hostname;
            private String password;
            private List<String> tlsAlpnProtocols;
            private TlsCertPolicy tlsCertPolicy;
            private List<String> tlsEllipticCurves;
            private final List<String> urls;
            private String username;

            private Builder(List<String> list) {
                this.username = "";
                this.password = "";
                this.tlsCertPolicy = TlsCertPolicy.TLS_CERT_POLICY_SECURE;
                this.hostname = "";
                if (list == null || list.isEmpty()) {
                    qhg0.m174539a("urls == null || urls.isEmpty(): ", list);
                    throw null;
                }
                this.urls = list;
            }

            public IceServer createIceServer() {
                return new IceServer(this.urls.get(0), this.urls, this.username, this.password, this.tlsCertPolicy, this.hostname, this.tlsAlpnProtocols, this.tlsEllipticCurves);
            }

            public Builder setHostname(String str) {
                this.hostname = str;
                return this;
            }

            public Builder setPassword(String str) {
                this.password = str;
                return this;
            }

            public Builder setTlsAlpnProtocols(List<String> list) {
                this.tlsAlpnProtocols = list;
                return this;
            }

            public Builder setTlsCertPolicy(TlsCertPolicy tlsCertPolicy) {
                this.tlsCertPolicy = tlsCertPolicy;
                return this;
            }

            public Builder setTlsEllipticCurves(List<String> list) {
                this.tlsEllipticCurves = list;
                return this;
            }

            public Builder setUsername(String str) {
                this.username = str;
                return this;
            }
        }

        private IceServer(String str, List<String> list, String str2, String str3, TlsCertPolicy tlsCertPolicy, String str4, List<String> list2, List<String> list3) {
            if (str == null || list == null || list.isEmpty()) {
                ig3.m135964a("uri == null || urls == null || urls.isEmpty()");
                throw null;
            }
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                if (it.next() == null) {
                    qhg0.m174539a("urls element is null: ", list);
                    throw null;
                }
            }
            if (str2 == null) {
                ig3.m135964a("username == null");
                throw null;
            }
            if (str3 == null) {
                ig3.m135964a("password == null");
                throw null;
            }
            if (str4 == null) {
                ig3.m135964a("hostname == null");
                throw null;
            }
            this.uri = str;
            this.urls = list;
            this.username = str2;
            this.password = str3;
            this.tlsCertPolicy = tlsCertPolicy;
            this.hostname = str4;
            this.tlsAlpnProtocols = list2;
            this.tlsEllipticCurves = list3;
        }

        public static Builder builder(String str) {
            return new Builder(Collections.singletonList(str));
        }

        @CalledByNative("IceServer")
        public String getHostname() {
            return this.hostname;
        }

        @CalledByNative("IceServer")
        public String getPassword() {
            return this.password;
        }

        @CalledByNative("IceServer")
        public List<String> getTlsAlpnProtocols() {
            return this.tlsAlpnProtocols;
        }

        @CalledByNative("IceServer")
        public TlsCertPolicy getTlsCertPolicy() {
            return this.tlsCertPolicy;
        }

        @CalledByNative("IceServer")
        public List<String> getTlsEllipticCurves() {
            return this.tlsEllipticCurves;
        }

        @CalledByNative("IceServer")
        public List<String> getUrls() {
            return this.urls;
        }

        @CalledByNative("IceServer")
        public String getUsername() {
            return this.username;
        }

        public String toString() {
            return this.urls + " [" + this.username + ":" + this.password + "] [" + this.tlsCertPolicy + "] [" + this.hostname + "] [" + this.tlsAlpnProtocols + "] [" + this.tlsEllipticCurves + Constants.AES_SUFFIX;
        }

        public static Builder builder(List<String> list) {
            return new Builder(list);
        }

        @Deprecated
        public IceServer(String str) {
            this(str, "", "");
        }

        @Deprecated
        public IceServer(String str, String str2, String str3) {
            this(str, str2, str3, TlsCertPolicy.TLS_CERT_POLICY_SECURE);
        }

        @Deprecated
        public IceServer(String str, String str2, String str3, TlsCertPolicy tlsCertPolicy) {
            this(str, str2, str3, tlsCertPolicy, "");
        }

        @Deprecated
        public IceServer(String str, String str2, String str3, TlsCertPolicy tlsCertPolicy, String str4) {
            this(str, Collections.singletonList(str), str2, str3, tlsCertPolicy, str4, null, null);
        }
    }

    public void getStats(RTCStatsCollectorCallback rTCStatsCollectorCallback) {
        nativeNewGetStats(rTCStatsCollectorCallback);
    }

    public RtpSender addTrack(MediaStreamTrack mediaStreamTrack) {
        return addTrack(mediaStreamTrack, Collections.EMPTY_LIST);
    }

    public PeerConnection(NativePeerConnectionFactory nativePeerConnectionFactory) {
        this(nativePeerConnectionFactory.createNativePeerConnection());
    }

    public RtpTransceiver addTransceiver(MediaStreamTrack mediaStreamTrack) {
        return addTransceiver(mediaStreamTrack, new RtpTransceiver.RtpTransceiverInit());
    }

    public RtpTransceiver addTransceiver(MediaStreamTrack.MediaType mediaType) {
        return addTransceiver(mediaType, new RtpTransceiver.RtpTransceiverInit());
    }

    public RtpTransceiver addTransceiver(MediaStreamTrack.MediaType mediaType, RtpTransceiver.RtpTransceiverInit rtpTransceiverInit) {
        if (mediaType != null) {
            if (rtpTransceiverInit == null) {
                rtpTransceiverInit = new RtpTransceiver.RtpTransceiverInit();
            }
            RtpTransceiver rtpTransceiverNativeAddTransceiverOfType = nativeAddTransceiverOfType(mediaType, rtpTransceiverInit);
            if (rtpTransceiverNativeAddTransceiverOfType != null) {
                this.transceivers.add(rtpTransceiverNativeAddTransceiverOfType);
                return rtpTransceiverNativeAddTransceiverOfType;
            }
            qkq0.m175383a("C++ addTransceiver failed.");
            return null;
        }
        jfd0.m141176a("No MediaType specified for addTransceiver.");
        return null;
    }
}
