package com.coremedia.iso.boxes.fragment;

import com.googlecode.mp4parser.AbstractFullBox;
import com.meituan.robust.Constants;
import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.internal.Conversions;
import org.aspectj.runtime.reflect.Factory;
import org.spongycastle.crypto.tls.CipherSuite;
import p153l.b1q;
import p153l.f3d0;
import p153l.vwd0;
import p153l.y0q;

/* JADX INFO: loaded from: classes.dex */
public class TrackFragmentHeaderBox extends AbstractFullBox {
    public static final String TYPE = "tfhd";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_10 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_11 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_12 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_13 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_14 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_15 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_16 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_17 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_18 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_19 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_20 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_21 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_5 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_6 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_7 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_8 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_9 = null;
    private long baseDataOffset;
    private boolean defaultBaseIsMoof;
    private long defaultSampleDuration;
    private vwd0 defaultSampleFlags;
    private long defaultSampleSize;
    private boolean durationIsEmpty;
    private long sampleDescriptionIndex;
    private long trackId;

    static {
        ajc$preClinit();
    }

    public TrackFragmentHeaderBox() {
        super(TYPE);
        this.baseDataOffset = -1L;
        this.defaultSampleDuration = -1L;
        this.defaultSampleSize = -1L;
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("TrackFragmentHeaderBox.java", TrackFragmentHeaderBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "hasBaseDataOffset", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", Constants.BOOLEAN), 126);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "hasSampleDescriptionIndex", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", Constants.BOOLEAN), 130);
        ajc$tjp_10 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getDefaultSampleFlags", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "com.coremedia.iso.boxes.fragment.SampleFlags"), 166);
        ajc$tjp_11 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "isDurationIsEmpty", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", Constants.BOOLEAN), CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256);
        ajc$tjp_12 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "isDefaultBaseIsMoof", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", Constants.BOOLEAN), CipherSuite.TLS_PSK_WITH_AES_128_CBC_SHA256);
        ajc$tjp_13 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setTrackId", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", Constants.LONG, "trackId", "", Constants.VOID), 178);
        ajc$tjp_14 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setBaseDataOffset", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", Constants.LONG, "baseDataOffset", "", Constants.VOID), 182);
        ajc$tjp_15 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setSampleDescriptionIndex", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", Constants.LONG, "sampleDescriptionIndex", "", Constants.VOID), CipherSuite.TLS_DH_anon_WITH_CAMELLIA_128_CBC_SHA256);
        ajc$tjp_16 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setDefaultSampleDuration", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", Constants.LONG, "defaultSampleDuration", "", Constants.VOID), 200);
        ajc$tjp_17 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setDefaultSampleSize", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", Constants.LONG, "defaultSampleSize", "", Constants.VOID), 205);
        ajc$tjp_18 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setDefaultSampleFlags", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "com.coremedia.iso.boxes.fragment.SampleFlags", "defaultSampleFlags", "", Constants.VOID), 210);
        ajc$tjp_19 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setDurationIsEmpty", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", Constants.BOOLEAN, "durationIsEmpty", "", Constants.VOID), 215);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "hasDefaultSampleDuration", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", Constants.BOOLEAN), 134);
        ajc$tjp_20 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setDefaultBaseIsMoof", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", Constants.BOOLEAN, "defaultBaseIsMoof", "", Constants.VOID), 220);
        ajc$tjp_21 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "toString", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", "java.lang.String"), 226);
        ajc$tjp_3 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "hasDefaultSampleSize", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", Constants.BOOLEAN), CipherSuite.TLS_PSK_WITH_RC4_128_SHA);
        ajc$tjp_4 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "hasDefaultSampleFlags", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", Constants.BOOLEAN), CipherSuite.TLS_DHE_PSK_WITH_RC4_128_SHA);
        ajc$tjp_5 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getTrackId", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", Constants.LONG), CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA);
        ajc$tjp_6 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getBaseDataOffset", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", Constants.LONG), 150);
        ajc$tjp_7 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getSampleDescriptionIndex", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", Constants.LONG), 154);
        ajc$tjp_8 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getDefaultSampleDuration", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", Constants.LONG), 158);
        ajc$tjp_9 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getDefaultSampleSize", "com.coremedia.iso.boxes.fragment.TrackFragmentHeaderBox", "", "", "", Constants.LONG), 162);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.trackId = y0q.m213895k(byteBuffer);
        if ((getFlags() & 1) == 1) {
            this.baseDataOffset = y0q.m213897m(byteBuffer);
        }
        if ((getFlags() & 2) == 2) {
            this.sampleDescriptionIndex = y0q.m213895k(byteBuffer);
        }
        if ((getFlags() & 8) == 8) {
            this.defaultSampleDuration = y0q.m213895k(byteBuffer);
        }
        if ((getFlags() & 16) == 16) {
            this.defaultSampleSize = y0q.m213895k(byteBuffer);
        }
        if ((getFlags() & 32) == 32) {
            this.defaultSampleFlags = new vwd0(byteBuffer);
        }
        if ((getFlags() & 65536) == 65536) {
            this.durationIsEmpty = true;
        }
        if ((getFlags() & 131072) == 131072) {
            this.defaultBaseIsMoof = true;
        }
    }

    public long getBaseDataOffset() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_6, this, this));
        return this.baseDataOffset;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        b1q.m101495g(byteBuffer, this.trackId);
        if ((getFlags() & 1) == 1) {
            b1q.m101497i(byteBuffer, getBaseDataOffset());
        }
        if ((getFlags() & 2) == 2) {
            b1q.m101495g(byteBuffer, getSampleDescriptionIndex());
        }
        if ((getFlags() & 8) == 8) {
            b1q.m101495g(byteBuffer, getDefaultSampleDuration());
        }
        if ((getFlags() & 16) == 16) {
            b1q.m101495g(byteBuffer, getDefaultSampleSize());
        }
        if ((getFlags() & 32) == 32) {
            this.defaultSampleFlags.m203148a(byteBuffer);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        int flags = getFlags();
        long j = (flags & 1) == 1 ? 16L : 8L;
        if ((flags & 2) == 2) {
            j += 4;
        }
        if ((flags & 8) == 8) {
            j += 4;
        }
        if ((flags & 16) == 16) {
            j += 4;
        }
        return (flags & 32) == 32 ? j + 4 : j;
    }

    public long getDefaultSampleDuration() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_8, this, this));
        return this.defaultSampleDuration;
    }

    public vwd0 getDefaultSampleFlags() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_10, this, this));
        return this.defaultSampleFlags;
    }

    public long getDefaultSampleSize() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_9, this, this));
        return this.defaultSampleSize;
    }

    public long getSampleDescriptionIndex() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_7, this, this));
        return this.sampleDescriptionIndex;
    }

    public long getTrackId() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_5, this, this));
        return this.trackId;
    }

    public boolean hasBaseDataOffset() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_0, this, this));
        return (getFlags() & 1) != 0;
    }

    public boolean hasDefaultSampleDuration() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_2, this, this));
        return (getFlags() & 8) != 0;
    }

    public boolean hasDefaultSampleFlags() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_4, this, this));
        return (getFlags() & 32) != 0;
    }

    public boolean hasDefaultSampleSize() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_3, this, this));
        return (getFlags() & 16) != 0;
    }

    public boolean hasSampleDescriptionIndex() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_1, this, this));
        return (getFlags() & 2) != 0;
    }

    public boolean isDefaultBaseIsMoof() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_12, this, this));
        return this.defaultBaseIsMoof;
    }

    public boolean isDurationIsEmpty() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_11, this, this));
        return this.durationIsEmpty;
    }

    public void setBaseDataOffset(long j) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_14, this, this, Conversions.longObject(j)));
        if (j == -1) {
            setFlags(getFlags() & 2147483646);
        } else {
            setFlags(getFlags() | 1);
        }
        this.baseDataOffset = j;
    }

    public void setDefaultBaseIsMoof(boolean z) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_20, this, this, Conversions.booleanObject(z)));
        setFlags(getFlags() | 131072);
        this.defaultBaseIsMoof = z;
    }

    public void setDefaultSampleDuration(long j) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_16, this, this, Conversions.longObject(j)));
        setFlags(getFlags() | 8);
        this.defaultSampleDuration = j;
    }

    public void setDefaultSampleFlags(vwd0 vwd0Var) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_18, this, this, vwd0Var));
        setFlags(getFlags() | 32);
        this.defaultSampleFlags = vwd0Var;
    }

    public void setDefaultSampleSize(long j) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_17, this, this, Conversions.longObject(j)));
        setFlags(getFlags() | 16);
        this.defaultSampleSize = j;
    }

    public void setDurationIsEmpty(boolean z) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_19, this, this, Conversions.booleanObject(z)));
        setFlags(getFlags() | 65536);
        this.durationIsEmpty = z;
    }

    public void setSampleDescriptionIndex(long j) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_15, this, this, Conversions.longObject(j)));
        if (j == -1) {
            setFlags(getFlags() & 2147483645);
        } else {
            setFlags(getFlags() | 2);
        }
        this.sampleDescriptionIndex = j;
    }

    public void setTrackId(long j) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_13, this, this, Conversions.longObject(j)));
        this.trackId = j;
    }

    public String toString() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_21, this, this));
        return "TrackFragmentHeaderBox{trackId=" + this.trackId + ", baseDataOffset=" + this.baseDataOffset + ", sampleDescriptionIndex=" + this.sampleDescriptionIndex + ", defaultSampleDuration=" + this.defaultSampleDuration + ", defaultSampleSize=" + this.defaultSampleSize + ", defaultSampleFlags=" + this.defaultSampleFlags + ", durationIsEmpty=" + this.durationIsEmpty + ", defaultBaseIsMoof=" + this.defaultBaseIsMoof + '}';
    }
}
