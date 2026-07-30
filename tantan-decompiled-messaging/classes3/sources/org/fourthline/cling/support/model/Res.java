package org.fourthline.cling.support.model;

import java.net.URI;
import org.seamless.util.MimeType;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class Res {
    protected Long bitrate;
    protected Long bitsPerSample;
    protected Long colorDepth;
    protected String duration;
    protected URI importUri;
    protected Long nrAudioChannels;
    protected String protection;
    protected ProtocolInfo protocolInfo;
    protected String resolution;
    protected Long sampleFrequency;
    protected Long size;
    protected String value;

    public Res(URI uri, ProtocolInfo protocolInfo, Long l2, String str, Long l3, Long l4, Long l5, Long l6, Long l7, String str2, String str3, String str4) {
        this.importUri = uri;
        this.protocolInfo = protocolInfo;
        this.size = l2;
        this.duration = str;
        this.bitrate = l3;
        this.sampleFrequency = l4;
        this.bitsPerSample = l5;
        this.nrAudioChannels = l6;
        this.colorDepth = l7;
        this.protection = str2;
        this.resolution = str3;
        this.value = str4;
    }

    public Long getBitrate() {
        return this.bitrate;
    }

    public Long getBitsPerSample() {
        return this.bitsPerSample;
    }

    public Long getColorDepth() {
        return this.colorDepth;
    }

    public String getDuration() {
        return this.duration;
    }

    public URI getImportUri() {
        return this.importUri;
    }

    public Long getNrAudioChannels() {
        return this.nrAudioChannels;
    }

    public String getProtection() {
        return this.protection;
    }

    public ProtocolInfo getProtocolInfo() {
        return this.protocolInfo;
    }

    public String getResolution() {
        return this.resolution;
    }

    public int getResolutionX() {
        if (getResolution() == null || getResolution().split("x").length != 2) {
            return 0;
        }
        return Integer.valueOf(getResolution().split("x")[0]).intValue();
    }

    public int getResolutionY() {
        if (getResolution() == null || getResolution().split("x").length != 2) {
            return 0;
        }
        return Integer.valueOf(getResolution().split("x")[1]).intValue();
    }

    public Long getSampleFrequency() {
        return this.sampleFrequency;
    }

    public Long getSize() {
        return this.size;
    }

    public String getValue() {
        return this.value;
    }

    public void setBitrate(Long l2) {
        this.bitrate = l2;
    }

    public void setBitsPerSample(Long l2) {
        this.bitsPerSample = l2;
    }

    public void setColorDepth(Long l2) {
        this.colorDepth = l2;
    }

    public void setDuration(String str) {
        this.duration = str;
    }

    public void setImportUri(URI uri) {
        this.importUri = uri;
    }

    public void setNrAudioChannels(Long l2) {
        this.nrAudioChannels = l2;
    }

    public void setProtection(String str) {
        this.protection = str;
    }

    public void setProtocolInfo(ProtocolInfo protocolInfo) {
        this.protocolInfo = protocolInfo;
    }

    public void setResolution(int i, int i2) {
        this.resolution = i + "x" + i2;
    }

    public void setSampleFrequency(Long l2) {
        this.sampleFrequency = l2;
    }

    public void setSize(Long l2) {
        this.size = l2;
    }

    public void setValue(String str) {
        this.value = str;
    }

    public void setResolution(String str) {
        this.resolution = str;
    }

    public Res(String str, Long l2, String str2, Long l3, String str3) {
        this(new ProtocolInfo(Protocol.HTTP_GET, "*", str, "*"), l2, str2, l3, str3);
    }

    public Res(MimeType mimeType, Long l2, String str, Long l3, String str2) {
        this(new ProtocolInfo(mimeType), l2, str, l3, str2);
    }

    public Res(MimeType mimeType, Long l2, String str) {
        this(new ProtocolInfo(mimeType), l2, str);
    }

    public Res(ProtocolInfo protocolInfo, Long l2, String str) {
        this.protocolInfo = protocolInfo;
        this.size = l2;
        this.value = str;
    }

    public Res(ProtocolInfo protocolInfo, Long l2, String str, Long l3, String str2) {
        this.protocolInfo = protocolInfo;
        this.size = l2;
        this.duration = str;
        this.bitrate = l3;
        this.value = str2;
    }

    public Res() {
    }
}
