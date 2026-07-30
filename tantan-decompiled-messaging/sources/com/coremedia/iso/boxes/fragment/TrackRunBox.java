package com.coremedia.iso.boxes.fragment;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.googlecode.mp4parser.AbstractFullBox;
import com.meituan.robust.Constants;
import com.momo.momortc.MMConstants;
import com.p046p1.mobile.putong.data.ResourceDirection;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.internal.Conversions;
import org.aspectj.runtime.reflect.Factory;
import p149l.bzp;
import p149l.cvc0;
import p149l.sm4;
import p149l.tod0;
import p149l.yyp;

/* JADX INFO: loaded from: classes.dex */
public class TrackRunBox extends AbstractFullBox {
    public static final String TYPE = "trun";
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
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_5 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_6 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_7 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_8 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_9 = null;
    private int dataOffset;
    private List<C1404a> entries;
    private tod0 firstSampleFlags;

    /* JADX INFO: renamed from: com.coremedia.iso.boxes.fragment.TrackRunBox$a */
    public static class C1404a {

        /* JADX INFO: renamed from: a */
        private long f5775a;

        /* JADX INFO: renamed from: b */
        private long f5776b;

        /* JADX INFO: renamed from: c */
        private tod0 f5777c;

        /* JADX INFO: renamed from: d */
        private long f5778d;

        /* JADX INFO: renamed from: i */
        public long m7382i() {
            return this.f5778d;
        }

        public String toString() {
            return "Entry{duration=" + this.f5775a + ", size=" + this.f5776b + ", dlags=" + this.f5777c + ", compTimeOffset=" + this.f5778d + '}';
        }
    }

    static {
        ajc$preClinit();
    }

    public TrackRunBox() {
        super(TYPE);
        this.entries = new ArrayList();
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("TrackRunBox.java", TrackRunBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getEntries", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "java.util.List"), 57);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setDataOffset", "com.coremedia.iso.boxes.fragment.TrackRunBox", Constants.INT, "dataOffset", "", Constants.VOID), 120);
        ajc$tjp_10 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setDataOffsetPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", Constants.BOOLEAN, ResourceDirection.f38808v, "", Constants.VOID), 267);
        ajc$tjp_11 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setSampleSizePresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", Constants.BOOLEAN, ResourceDirection.f38808v, "", Constants.VOID), 275);
        ajc$tjp_12 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setSampleDurationPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", Constants.BOOLEAN, ResourceDirection.f38808v, "", Constants.VOID), 283);
        ajc$tjp_13 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setSampleFlagsPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", Constants.BOOLEAN, ResourceDirection.f38808v, "", Constants.VOID), 292);
        ajc$tjp_14 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setSampleCompositionTimeOffsetPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", Constants.BOOLEAN, ResourceDirection.f38808v, "", Constants.VOID), 300);
        ajc$tjp_15 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getDataOffset", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", Constants.INT), 309);
        ajc$tjp_16 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getFirstSampleFlags", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "com.coremedia.iso.boxes.fragment.SampleFlags"), 313);
        ajc$tjp_17 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setFirstSampleFlags", "com.coremedia.iso.boxes.fragment.TrackRunBox", "com.coremedia.iso.boxes.fragment.SampleFlags", "firstSampleFlags", "", Constants.VOID), 317);
        ajc$tjp_18 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "toString", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "java.lang.String"), 327);
        ajc$tjp_19 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setEntries", "com.coremedia.iso.boxes.fragment.TrackRunBox", "java.util.List", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "", Constants.VOID), 342);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getSampleCompositionTimeOffsets", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", "[J"), MMConstants.ERR_WATERMARK_READ);
        ajc$tjp_3 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getSampleCount", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", Constants.LONG), 238);
        ajc$tjp_4 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "isDataOffsetPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", Constants.BOOLEAN), 242);
        ajc$tjp_5 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "isFirstSampleFlagsPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", Constants.BOOLEAN), 246);
        ajc$tjp_6 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "isSampleSizePresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", Constants.BOOLEAN), 251);
        ajc$tjp_7 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "isSampleDurationPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", Constants.BOOLEAN), 255);
        ajc$tjp_8 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "isSampleFlagsPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", Constants.BOOLEAN), 259);
        ajc$tjp_9 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "isSampleCompositionTimeOffsetPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", "", "", "", Constants.BOOLEAN), 263);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        long jM216558k = yyp.m216558k(byteBuffer);
        if ((getFlags() & 1) == 1) {
            this.dataOffset = sm4.m184929a(yyp.m216558k(byteBuffer));
        } else {
            this.dataOffset = -1;
        }
        if ((getFlags() & 4) == 4) {
            this.firstSampleFlags = new tod0(byteBuffer);
        }
        for (int i = 0; i < jM216558k; i++) {
            C1404a c1404a = new C1404a();
            if ((getFlags() & 256) == 256) {
                c1404a.f5775a = yyp.m216558k(byteBuffer);
            }
            if ((getFlags() & 512) == 512) {
                c1404a.f5776b = yyp.m216558k(byteBuffer);
            }
            if ((getFlags() & 1024) == 1024) {
                c1404a.f5777c = new tod0(byteBuffer);
            }
            if ((getFlags() & 2048) == 2048) {
                c1404a.f5778d = byteBuffer.getInt();
            }
            this.entries.add(c1404a);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        bzp.m104635g(byteBuffer, this.entries.size());
        int flags = getFlags();
        if ((flags & 1) == 1) {
            bzp.m104635g(byteBuffer, this.dataOffset);
        }
        if ((flags & 4) == 4) {
            this.firstSampleFlags.m189875a(byteBuffer);
        }
        for (C1404a c1404a : this.entries) {
            if ((flags & 256) == 256) {
                bzp.m104635g(byteBuffer, c1404a.f5775a);
            }
            if ((flags & 512) == 512) {
                bzp.m104635g(byteBuffer, c1404a.f5776b);
            }
            if ((flags & 1024) == 1024) {
                c1404a.f5777c.m189875a(byteBuffer);
            }
            if ((flags & 2048) == 2048) {
                if (getVersion() == 0) {
                    bzp.m104635g(byteBuffer, c1404a.f5778d);
                } else {
                    byteBuffer.putInt((int) c1404a.f5778d);
                }
            }
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        int flags = getFlags();
        long j = (flags & 1) == 1 ? 12L : 8L;
        if ((flags & 4) == 4) {
            j += 4;
        }
        long j2 = (flags & 256) == 256 ? 4L : 0L;
        if ((flags & 512) == 512) {
            j2 += 4;
        }
        if ((flags & 1024) == 1024) {
            j2 += 4;
        }
        if ((flags & 2048) == 2048) {
            j2 += 4;
        }
        return j + (j2 * ((long) this.entries.size()));
    }

    public int getDataOffset() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_15, this, this));
        return this.dataOffset;
    }

    public List<C1404a> getEntries() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.entries;
    }

    public tod0 getFirstSampleFlags() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_16, this, this));
        return this.firstSampleFlags;
    }

    public long[] getSampleCompositionTimeOffsets() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_2, this, this));
        if (!isSampleCompositionTimeOffsetPresent()) {
            return null;
        }
        int size = this.entries.size();
        long[] jArr = new long[size];
        for (int i = 0; i < size; i++) {
            jArr[i] = this.entries.get(i).m7382i();
        }
        return jArr;
    }

    public long getSampleCount() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_3, this, this));
        return this.entries.size();
    }

    public boolean isDataOffsetPresent() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_4, this, this));
        return (getFlags() & 1) == 1;
    }

    public boolean isFirstSampleFlagsPresent() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_5, this, this));
        return (getFlags() & 4) == 4;
    }

    public boolean isSampleCompositionTimeOffsetPresent() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_9, this, this));
        return (getFlags() & 2048) == 2048;
    }

    public boolean isSampleDurationPresent() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_7, this, this));
        return (getFlags() & 256) == 256;
    }

    public boolean isSampleFlagsPresent() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_8, this, this));
        return (getFlags() & 1024) == 1024;
    }

    public boolean isSampleSizePresent() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_6, this, this));
        return (getFlags() & 512) == 512;
    }

    public void setDataOffset(int i) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_1, this, this, Conversions.intObject(i)));
        if (i == -1) {
            setFlags(getFlags() & 16777214);
        } else {
            setFlags(getFlags() | 1);
        }
        this.dataOffset = i;
    }

    public void setDataOffsetPresent(boolean z) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_10, this, this, Conversions.booleanObject(z)));
        if (z) {
            setFlags(getFlags() | 1);
        } else {
            setFlags(getFlags() & 16777214);
        }
    }

    public void setEntries(List<C1404a> list) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_19, this, this, list));
        this.entries = list;
    }

    public void setFirstSampleFlags(tod0 tod0Var) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_17, this, this, tod0Var));
        if (tod0Var == null) {
            setFlags(getFlags() & 16777211);
        } else {
            setFlags(getFlags() | 4);
        }
        this.firstSampleFlags = tod0Var;
    }

    public void setSampleCompositionTimeOffsetPresent(boolean z) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_14, this, this, Conversions.booleanObject(z)));
        if (z) {
            setFlags(getFlags() | 2048);
        } else {
            setFlags(getFlags() & 16775167);
        }
    }

    public void setSampleDurationPresent(boolean z) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_12, this, this, Conversions.booleanObject(z)));
        if (z) {
            setFlags(getFlags() | 256);
        } else {
            setFlags(getFlags() & 16776959);
        }
    }

    public void setSampleFlagsPresent(boolean z) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_13, this, this, Conversions.booleanObject(z)));
        if (z) {
            setFlags(getFlags() | 1024);
        } else {
            setFlags(getFlags() & 16776191);
        }
    }

    public void setSampleSizePresent(boolean z) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_11, this, this, Conversions.booleanObject(z)));
        if (z) {
            setFlags(getFlags() | 512);
        } else {
            setFlags(getFlags() & 16776703);
        }
    }

    public String toString() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_18, this, this));
        return "TrackRunBox{sampleCount=" + this.entries.size() + ", dataOffset=" + this.dataOffset + ", dataOffsetPresent=" + isDataOffsetPresent() + ", sampleSizePresent=" + isSampleSizePresent() + ", sampleDurationPresent=" + isSampleDurationPresent() + ", sampleFlagsPresentPresent=" + isSampleFlagsPresent() + ", sampleCompositionTimeOffsetPresent=" + isSampleCompositionTimeOffsetPresent() + ", firstSampleFlags=" + this.firstSampleFlags + '}';
    }
}
