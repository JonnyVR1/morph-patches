package com.googlecode.mp4parser.boxes.threegpp26244;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.googlecode.mp4parser.AbstractFullBox;
import com.meituan.robust.Constants;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.internal.Conversions;
import org.aspectj.runtime.reflect.Factory;
import org.spongycastle.crypto.tls.CipherSuite;
import p149l.bzp;
import p149l.cvc0;
import p149l.r03;
import p149l.t03;
import p149l.yyp;

/* JADX INFO: loaded from: classes7.dex */
public class SegmentIndexBox extends AbstractFullBox {
    public static final String TYPE = "sidx";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_10 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_11 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_12 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_5 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_6 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_7 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_8 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_9 = null;
    long earliestPresentationTime;
    List<C3445a> entries;
    long firstOffset;
    long referenceId;
    int reserved;
    long timeScale;

    /* JADX INFO: renamed from: com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox$a */
    public static class C3445a {

        /* JADX INFO: renamed from: a */
        byte f11722a;

        /* JADX INFO: renamed from: b */
        int f11723b;

        /* JADX INFO: renamed from: c */
        long f11724c;

        /* JADX INFO: renamed from: d */
        byte f11725d;

        /* JADX INFO: renamed from: e */
        byte f11726e;

        /* JADX INFO: renamed from: f */
        int f11727f;

        /* JADX INFO: renamed from: a */
        public byte m17402a() {
            return this.f11722a;
        }

        /* JADX INFO: renamed from: b */
        public int m17403b() {
            return this.f11723b;
        }

        /* JADX INFO: renamed from: c */
        public int m17404c() {
            return this.f11727f;
        }

        /* JADX INFO: renamed from: d */
        public byte m17405d() {
            return this.f11726e;
        }

        /* JADX INFO: renamed from: e */
        public byte m17406e() {
            return this.f11725d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C3445a c3445a = (C3445a) obj;
            return this.f11722a == c3445a.f11722a && this.f11723b == c3445a.f11723b && this.f11727f == c3445a.f11727f && this.f11726e == c3445a.f11726e && this.f11725d == c3445a.f11725d && this.f11724c == c3445a.f11724c;
        }

        /* JADX INFO: renamed from: f */
        public long m17407f() {
            return this.f11724c;
        }

        /* JADX INFO: renamed from: g */
        public void m17408g(byte b) {
            this.f11722a = b;
        }

        /* JADX INFO: renamed from: h */
        public void m17409h(int i) {
            this.f11723b = i;
        }

        public int hashCode() {
            int i = ((this.f11722a * 31) + this.f11723b) * 31;
            long j = this.f11724c;
            return ((((((i + ((int) (j ^ (j >>> 32)))) * 31) + this.f11725d) * 31) + this.f11726e) * 31) + this.f11727f;
        }

        /* JADX INFO: renamed from: i */
        public void m17410i(int i) {
            this.f11727f = i;
        }

        /* JADX INFO: renamed from: j */
        public void m17411j(byte b) {
            this.f11726e = b;
        }

        /* JADX INFO: renamed from: k */
        public void m17412k(byte b) {
            this.f11725d = b;
        }

        /* JADX INFO: renamed from: l */
        public void m17413l(long j) {
            this.f11724c = j;
        }

        public String toString() {
            return "Entry{referenceType=" + ((int) this.f11722a) + ", referencedSize=" + this.f11723b + ", subsegmentDuration=" + this.f11724c + ", startsWithSap=" + ((int) this.f11725d) + ", sapType=" + ((int) this.f11726e) + ", sapDeltaTime=" + this.f11727f + '}';
        }
    }

    static {
        ajc$preClinit();
    }

    public SegmentIndexBox() {
        super(TYPE);
        this.entries = new ArrayList();
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("SegmentIndexBox.java", SegmentIndexBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getEntries", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "", "", "", "java.util.List"), 128);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setEntries", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "java.util.List", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "", Constants.VOID), CipherSuite.TLS_RSA_WITH_CAMELLIA_256_CBC_SHA);
        ajc$tjp_10 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getReserved", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "", "", "", Constants.INT), CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256);
        ajc$tjp_11 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setReserved", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", Constants.INT, "reserved", "", Constants.VOID), CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256);
        ajc$tjp_12 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "toString", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "", "", "", "java.lang.String"), 298);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getReferenceId", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "", "", "", Constants.LONG), CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA);
        ajc$tjp_3 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setReferenceId", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", Constants.LONG, "referenceId", "", Constants.VOID), 140);
        ajc$tjp_4 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getTimeScale", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "", "", "", Constants.LONG), 144);
        ajc$tjp_5 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setTimeScale", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", Constants.LONG, "timeScale", "", Constants.VOID), 148);
        ajc$tjp_6 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getEarliestPresentationTime", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "", "", "", Constants.LONG), CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA);
        ajc$tjp_7 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setEarliestPresentationTime", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", Constants.LONG, "earliestPresentationTime", "", Constants.VOID), CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256);
        ajc$tjp_8 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getFirstOffset", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", "", "", "", Constants.LONG), 160);
        ajc$tjp_9 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setFirstOffset", "com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox", Constants.LONG, "firstOffset", "", Constants.VOID), CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.referenceId = yyp.m216558k(byteBuffer);
        this.timeScale = yyp.m216558k(byteBuffer);
        if (getVersion() == 0) {
            this.earliestPresentationTime = yyp.m216558k(byteBuffer);
            this.firstOffset = yyp.m216558k(byteBuffer);
        } else {
            this.earliestPresentationTime = yyp.m216560m(byteBuffer);
            this.firstOffset = yyp.m216560m(byteBuffer);
        }
        this.reserved = yyp.m216556i(byteBuffer);
        int iM216556i = yyp.m216556i(byteBuffer);
        for (int i = 0; i < iM216556i; i++) {
            r03 r03Var = new r03(byteBuffer);
            C3445a c3445a = new C3445a();
            c3445a.m17408g((byte) r03Var.m177327a(1));
            c3445a.m17409h(r03Var.m177327a(31));
            c3445a.m17413l(yyp.m216558k(byteBuffer));
            r03 r03Var2 = new r03(byteBuffer);
            c3445a.m17412k((byte) r03Var2.m177327a(1));
            c3445a.m17411j((byte) r03Var2.m177327a(3));
            c3445a.m17410i(r03Var2.m177327a(28));
            this.entries.add(c3445a);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        bzp.m104635g(byteBuffer, this.referenceId);
        bzp.m104635g(byteBuffer, this.timeScale);
        int version = getVersion();
        long j = this.earliestPresentationTime;
        if (version == 0) {
            bzp.m104635g(byteBuffer, j);
            bzp.m104635g(byteBuffer, this.firstOffset);
        } else {
            bzp.m104637i(byteBuffer, j);
            bzp.m104637i(byteBuffer, this.firstOffset);
        }
        bzp.m104633e(byteBuffer, this.reserved);
        bzp.m104633e(byteBuffer, this.entries.size());
        for (C3445a c3445a : this.entries) {
            t03 t03Var = new t03(byteBuffer);
            t03Var.m186811a(c3445a.m17402a(), 1);
            t03Var.m186811a(c3445a.m17403b(), 31);
            bzp.m104635g(byteBuffer, c3445a.m17407f());
            t03 t03Var2 = new t03(byteBuffer);
            t03Var2.m186811a(c3445a.m17406e(), 1);
            t03Var2.m186811a(c3445a.m17405d(), 3);
            t03Var2.m186811a(c3445a.m17404c(), 28);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return ((long) (getVersion() == 0 ? 8 : 16)) + 16 + ((long) (this.entries.size() * 12));
    }

    public long getEarliestPresentationTime() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_6, this, this));
        return this.earliestPresentationTime;
    }

    public List<C3445a> getEntries() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.entries;
    }

    public long getFirstOffset() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_8, this, this));
        return this.firstOffset;
    }

    public long getReferenceId() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_2, this, this));
        return this.referenceId;
    }

    public int getReserved() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_10, this, this));
        return this.reserved;
    }

    public long getTimeScale() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_4, this, this));
        return this.timeScale;
    }

    public void setEarliestPresentationTime(long j) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_7, this, this, Conversions.longObject(j)));
        this.earliestPresentationTime = j;
    }

    public void setEntries(List<C3445a> list) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_1, this, this, list));
        this.entries = list;
    }

    public void setFirstOffset(long j) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_9, this, this, Conversions.longObject(j)));
        this.firstOffset = j;
    }

    public void setReferenceId(long j) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_3, this, this, Conversions.longObject(j)));
        this.referenceId = j;
    }

    public void setReserved(int i) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_11, this, this, Conversions.intObject(i)));
        this.reserved = i;
    }

    public void setTimeScale(long j) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_5, this, this, Conversions.longObject(j)));
        this.timeScale = j;
    }

    public String toString() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_12, this, this));
        return "SegmentIndexBox{entries=" + this.entries + ", referenceId=" + this.referenceId + ", timeScale=" + this.timeScale + ", earliestPresentationTime=" + this.earliestPresentationTime + ", firstOffset=" + this.firstOffset + ", reserved=" + this.reserved + '}';
    }
}
