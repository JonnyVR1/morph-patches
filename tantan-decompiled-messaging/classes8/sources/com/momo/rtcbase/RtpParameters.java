package com.momo.rtcbase;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class RtpParameters {
    public final List<Codec> codecs;
    public final List<Encoding> encodings;
    private final List<HeaderExtension> headerExtensions;
    private final Rtcp rtcp;
    public final String transactionId;

    public static class Codec {
        public Integer clockRate;
        MediaStreamTrack.MediaType kind;
        public String name;
        public Integer numChannels;
        public Map<String, String> parameters;
        public int payloadType;

        @CalledByNative("Codec")
        public Codec(int i, String str, MediaStreamTrack.MediaType mediaType, Integer num, Integer num2, Map<String, String> map) {
            this.payloadType = i;
            this.name = str;
            this.kind = mediaType;
            this.clockRate = num;
            this.numChannels = num2;
            this.parameters = map;
        }

        @CalledByNative("Codec")
        public Integer getClockRate() {
            return this.clockRate;
        }

        @CalledByNative("Codec")
        public MediaStreamTrack.MediaType getKind() {
            return this.kind;
        }

        @CalledByNative("Codec")
        public String getName() {
            return this.name;
        }

        @CalledByNative("Codec")
        public Integer getNumChannels() {
            return this.numChannels;
        }

        @CalledByNative("Codec")
        public Map getParameters() {
            return this.parameters;
        }

        @CalledByNative("Codec")
        public int getPayloadType() {
            return this.payloadType;
        }
    }

    public static class Encoding {
        public boolean active;
        public Integer maxBitrateBps;
        public Integer maxFramerate;
        public Integer minBitrateBps;
        public Integer numTemporalLayers;
        public Long ssrc;

        @CalledByNative("Encoding")
        public Encoding(boolean z, Integer num, Integer num2, Integer num3, Integer num4, Long l2) {
            this.active = z;
            this.maxBitrateBps = num;
            this.minBitrateBps = num2;
            this.maxFramerate = num3;
            this.numTemporalLayers = num4;
            this.ssrc = l2;
        }

        @CalledByNative("Encoding")
        public boolean getActive() {
            return this.active;
        }

        @CalledByNative("Encoding")
        public Integer getMaxBitrateBps() {
            return this.maxBitrateBps;
        }

        @CalledByNative("Encoding")
        public Integer getMaxFramerate() {
            return this.maxFramerate;
        }

        @CalledByNative("Encoding")
        public Integer getMinBitrateBps() {
            return this.minBitrateBps;
        }

        @CalledByNative("Encoding")
        public Integer getNumTemporalLayers() {
            return this.numTemporalLayers;
        }

        @CalledByNative("Encoding")
        public Long getSsrc() {
            return this.ssrc;
        }
    }

    public static class HeaderExtension {
        private final boolean encrypted;

        /* JADX INFO: renamed from: id */
        private final int f246id;
        private final String uri;

        @CalledByNative("HeaderExtension")
        public HeaderExtension(String str, int i, boolean z) {
            this.uri = str;
            this.f246id = i;
            this.encrypted = z;
        }

        @CalledByNative("HeaderExtension")
        public boolean getEncrypted() {
            return this.encrypted;
        }

        @CalledByNative("HeaderExtension")
        public int getId() {
            return this.f246id;
        }

        @CalledByNative("HeaderExtension")
        public String getUri() {
            return this.uri;
        }
    }

    public static class Rtcp {
        private final String cname;
        private final boolean reducedSize;

        @CalledByNative("Rtcp")
        public Rtcp(String str, boolean z) {
            this.cname = str;
            this.reducedSize = z;
        }

        @CalledByNative("Rtcp")
        public String getCname() {
            return this.cname;
        }

        @CalledByNative("Rtcp")
        public boolean getReducedSize() {
            return this.reducedSize;
        }
    }

    @CalledByNative
    public RtpParameters(String str, Rtcp rtcp, List<HeaderExtension> list, List<Encoding> list2, List<Codec> list3) {
        this.transactionId = str;
        this.rtcp = rtcp;
        this.headerExtensions = list;
        this.encodings = list2;
        this.codecs = list3;
    }

    @CalledByNative
    public List<Codec> getCodecs() {
        return this.codecs;
    }

    @CalledByNative
    public List<Encoding> getEncodings() {
        return this.encodings;
    }

    @CalledByNative
    public List<HeaderExtension> getHeaderExtensions() {
        return this.headerExtensions;
    }

    @CalledByNative
    public Rtcp getRtcp() {
        return this.rtcp;
    }

    @CalledByNative
    public String getTransactionId() {
        return this.transactionId;
    }
}
