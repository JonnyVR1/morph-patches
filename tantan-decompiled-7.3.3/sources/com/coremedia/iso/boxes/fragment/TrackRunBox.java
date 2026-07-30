package com.coremedia.iso.boxes.fragment;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.googlecode.mp4parser.AbstractFullBox;
import com.meituan.robust.Constants;
import com.momo.momortc.MMConstants;
import com.p051p1.mobile.putong.data.ResourceDirection;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.internal.Conversions;
import org.aspectj.runtime.reflect.Factory;
import p153l.b1q;
import p153l.f3d0;
import p153l.rn4;
import p153l.vwd0;
import p153l.y0q;

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
    private List<C1427a> entries;
    private vwd0 firstSampleFlags;

    /* JADX INFO: renamed from: com.coremedia.iso.boxes.fragment.TrackRunBox$a */
    public static class C1427a {

        /* JADX INFO: renamed from: a */
        private long f5812a;

        /* JADX INFO: renamed from: b */
        private long f5813b;

        /* JADX INFO: renamed from: c */
        private vwd0 f5814c;

        /* JADX INFO: renamed from: d */
        private long f5815d;

        /* JADX INFO: renamed from: i */
        public long m7436i() {
            return this.f5815d;
        }

        public String toString() {
            return "Entry{duration=" + this.f5812a + ", size=" + this.f5813b + ", dlags=" + this.f5814c + ", compTimeOffset=" + this.f5815d + '}';
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
        ajc$tjp_10 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setDataOffsetPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", Constants.BOOLEAN, ResourceDirection.f39656v, "", Constants.VOID), 267);
        ajc$tjp_11 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setSampleSizePresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", Constants.BOOLEAN, ResourceDirection.f39656v, "", Constants.VOID), 275);
        ajc$tjp_12 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setSampleDurationPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", Constants.BOOLEAN, ResourceDirection.f39656v, "", Constants.VOID), 283);
        ajc$tjp_13 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setSampleFlagsPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", Constants.BOOLEAN, ResourceDirection.f39656v, "", Constants.VOID), 292);
        ajc$tjp_14 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setSampleCompositionTimeOffsetPresent", "com.coremedia.iso.boxes.fragment.TrackRunBox", Constants.BOOLEAN, ResourceDirection.f39656v, "", Constants.VOID), 300);
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
        long jM213895k = y0q.m213895k(byteBuffer);
        if ((getFlags() & 1) == 1) {
            this.dataOffset = rn4.m182119a(y0q.m213895k(byteBuffer));
        } else {
            this.dataOffset = -1;
        }
        if ((getFlags() & 4) == 4) {
            this.firstSampleFlags = new vwd0(byteBuffer);
        }
        for (int i = 0; i < jM213895k; i++) {
            C1427a c1427a = new C1427a();
            if ((getFlags() & 256) == 256) {
                c1427a.f5812a = y0q.m213895k(byteBuffer);
            }
            if ((getFlags() & 512) == 512) {
                c1427a.f5813b = y0q.m213895k(byteBuffer);
            }
            if ((getFlags() & 1024) == 1024) {
                c1427a.f5814c = new vwd0(byteBuffer);
            }
            if ((getFlags() & 2048) == 2048) {
                c1427a.f5815d = byteBuffer.getInt();
            }
            this.entries.add(c1427a);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        b1q.m101495g(byteBuffer, this.entries.size());
        int flags = getFlags();
        if ((flags & 1) == 1) {
            b1q.m101495g(byteBuffer, this.dataOffset);
        }
        if ((flags & 4) == 4) {
            this.firstSampleFlags.m203148a(byteBuffer);
        }
        for (C1427a c1427a : this.entries) {
            if ((flags & 256) == 256) {
                b1q.m101495g(byteBuffer, c1427a.f5812a);
            }
            if ((flags & 512) == 512) {
                b1q.m101495g(byteBuffer, c1427a.f5813b);
            }
            if ((flags & 1024) == 1024) {
                c1427a.f5814c.m203148a(byteBuffer);
            }
            if ((flags & 2048) == 2048) {
                if (getVersion() == 0) {
                    b1q.m101495g(byteBuffer, c1427a.f5815d);
                } else {
                    byteBuffer.putInt((int) c1427a.f5815d);
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
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_15, this, this));
        return this.dataOffset;
    }

    public List<C1427a> getEntries() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.entries;
    }

    public vwd0 getFirstSampleFlags() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_16, this, this));
        return this.firstSampleFlags;
    }

    public long[] getSampleCompositionTimeOffsets() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_2, this, this));
        if (!isSampleCompositionTimeOffsetPresent()) {
            return null;
        }
        int size = this.entries.size();
        long[] jArr = new long[size];
        for (int i = 0; i < size; i++) {
            jArr[i] = this.entries.get(i).m7436i();
        }
        return jArr;
    }

    public long getSampleCount() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_3, this, this));
        return this.entries.size();
    }

    public boolean isDataOffsetPresent() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_4, this, this));
        return (getFlags() & 1) == 1;
    }

    public boolean isFirstSampleFlagsPresent() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_5, this, this));
        return (getFlags() & 4) == 4;
    }

    public boolean isSampleCompositionTimeOffsetPresent() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_9, this, this));
        return (getFlags() & 2048) == 2048;
    }

    public boolean isSampleDurationPresent() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_7, this, this));
        return (getFlags() & 256) == 256;
    }

    public boolean isSampleFlagsPresent() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_8, this, this));
        return (getFlags() & 1024) == 1024;
    }

    public boolean isSampleSizePresent() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_6, this, this));
        return (getFlags() & 512) == 512;
    }

    public void setDataOffset(int i) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_1, this, this, Conversions.intObject(i)));
        if (i == -1) {
            setFlags(getFlags() & 16777214);
        } else {
            setFlags(getFlags() | 1);
        }
        this.dataOffset = i;
    }

    public void setDataOffsetPresent(boolean z) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_10, this, this, Conversions.booleanObject(z)));
        if (z) {
            setFlags(getFlags() | 1);
        } else {
            setFlags(getFlags() & 16777214);
        }
    }

    public void setEntries(List<C1427a> list) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_19, this, this, list));
        this.entries = list;
    }

    public void setFirstSampleFlags(vwd0 vwd0Var) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_17, this, this, vwd0Var));
        if (vwd0Var == null) {
            setFlags(getFlags() & 16777211);
        } else {
            setFlags(getFlags() | 4);
        }
        this.firstSampleFlags = vwd0Var;
    }

    public void setSampleCompositionTimeOffsetPresent(boolean z) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_14, this, this, Conversions.booleanObject(z)));
        if (z) {
            setFlags(getFlags() | 2048);
        } else {
            setFlags(getFlags() & 16775167);
        }
    }

    public void setSampleDurationPresent(boolean z) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_12, this, this, Conversions.booleanObject(z)));
        if (z) {
            setFlags(getFlags() | 256);
        } else {
            setFlags(getFlags() & 16776959);
        }
    }

    public void setSampleFlagsPresent(boolean z) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_13, this, this, Conversions.booleanObject(z)));
        if (z) {
            setFlags(getFlags() | 1024);
        } else {
            setFlags(getFlags() & 16776191);
        }
    }

    public void setSampleSizePresent(boolean z) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_11, this, this, Conversions.booleanObject(z)));
        if (z) {
            setFlags(getFlags() | 512);
        } else {
            setFlags(getFlags() & 16776703);
        }
    }

    public String toString() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_18, this, this));
        return "TrackRunBox{sampleCount=" + this.entries.size() + ", dataOffset=" + this.dataOffset + ", dataOffsetPresent=" + isDataOffsetPresent() + ", sampleSizePresent=" + isSampleSizePresent() + ", sampleDurationPresent=" + isSampleDurationPresent() + ", sampleFlagsPresentPresent=" + isSampleFlagsPresent() + ", sampleCompositionTimeOffsetPresent=" + isSampleCompositionTimeOffsetPresent() + ", firstSampleFlags=" + this.firstSampleFlags + '}';
    }
}
