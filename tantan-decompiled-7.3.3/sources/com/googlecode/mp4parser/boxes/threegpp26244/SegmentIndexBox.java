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
import p153l.b1q;
import p153l.f3d0;
import p153l.g13;
import p153l.i13;
import p153l.y0q;

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
    List<C3468a> entries;
    long firstOffset;
    long referenceId;
    int reserved;
    long timeScale;

    /* JADX INFO: renamed from: com.googlecode.mp4parser.boxes.threegpp26244.SegmentIndexBox$a */
    public static class C3468a {

        /* JADX INFO: renamed from: a */
        byte f11759a;

        /* JADX INFO: renamed from: b */
        int f11760b;

        /* JADX INFO: renamed from: c */
        long f11761c;

        /* JADX INFO: renamed from: d */
        byte f11762d;

        /* JADX INFO: renamed from: e */
        byte f11763e;

        /* JADX INFO: renamed from: f */
        int f11764f;

        /* JADX INFO: renamed from: a */
        public byte m17457a() {
            return this.f11759a;
        }

        /* JADX INFO: renamed from: b */
        public int m17458b() {
            return this.f11760b;
        }

        /* JADX INFO: renamed from: c */
        public int m17459c() {
            return this.f11764f;
        }

        /* JADX INFO: renamed from: d */
        public byte m17460d() {
            return this.f11763e;
        }

        /* JADX INFO: renamed from: e */
        public byte m17461e() {
            return this.f11762d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C3468a c3468a = (C3468a) obj;
            return this.f11759a == c3468a.f11759a && this.f11760b == c3468a.f11760b && this.f11764f == c3468a.f11764f && this.f11763e == c3468a.f11763e && this.f11762d == c3468a.f11762d && this.f11761c == c3468a.f11761c;
        }

        /* JADX INFO: renamed from: f */
        public long m17462f() {
            return this.f11761c;
        }

        /* JADX INFO: renamed from: g */
        public void m17463g(byte b) {
            this.f11759a = b;
        }

        /* JADX INFO: renamed from: h */
        public void m17464h(int i) {
            this.f11760b = i;
        }

        public int hashCode() {
            int i = ((this.f11759a * 31) + this.f11760b) * 31;
            long j = this.f11761c;
            return ((((((i + ((int) (j ^ (j >>> 32)))) * 31) + this.f11762d) * 31) + this.f11763e) * 31) + this.f11764f;
        }

        /* JADX INFO: renamed from: i */
        public void m17465i(int i) {
            this.f11764f = i;
        }

        /* JADX INFO: renamed from: j */
        public void m17466j(byte b) {
            this.f11763e = b;
        }

        /* JADX INFO: renamed from: k */
        public void m17467k(byte b) {
            this.f11762d = b;
        }

        /* JADX INFO: renamed from: l */
        public void m17468l(long j) {
            this.f11761c = j;
        }

        public String toString() {
            return "Entry{referenceType=" + ((int) this.f11759a) + ", referencedSize=" + this.f11760b + ", subsegmentDuration=" + this.f11761c + ", startsWithSap=" + ((int) this.f11762d) + ", sapType=" + ((int) this.f11763e) + ", sapDeltaTime=" + this.f11764f + '}';
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
        this.referenceId = y0q.m213895k(byteBuffer);
        this.timeScale = y0q.m213895k(byteBuffer);
        if (getVersion() == 0) {
            this.earliestPresentationTime = y0q.m213895k(byteBuffer);
            this.firstOffset = y0q.m213895k(byteBuffer);
        } else {
            this.earliestPresentationTime = y0q.m213897m(byteBuffer);
            this.firstOffset = y0q.m213897m(byteBuffer);
        }
        this.reserved = y0q.m213893i(byteBuffer);
        int iM213893i = y0q.m213893i(byteBuffer);
        for (int i = 0; i < iM213893i; i++) {
            g13 g13Var = new g13(byteBuffer);
            C3468a c3468a = new C3468a();
            c3468a.m17463g((byte) g13Var.m128488a(1));
            c3468a.m17464h(g13Var.m128488a(31));
            c3468a.m17468l(y0q.m213895k(byteBuffer));
            g13 g13Var2 = new g13(byteBuffer);
            c3468a.m17467k((byte) g13Var2.m128488a(1));
            c3468a.m17466j((byte) g13Var2.m128488a(3));
            c3468a.m17465i(g13Var2.m128488a(28));
            this.entries.add(c3468a);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        b1q.m101495g(byteBuffer, this.referenceId);
        b1q.m101495g(byteBuffer, this.timeScale);
        int version = getVersion();
        long j = this.earliestPresentationTime;
        if (version == 0) {
            b1q.m101495g(byteBuffer, j);
            b1q.m101495g(byteBuffer, this.firstOffset);
        } else {
            b1q.m101497i(byteBuffer, j);
            b1q.m101497i(byteBuffer, this.firstOffset);
        }
        b1q.m101493e(byteBuffer, this.reserved);
        b1q.m101493e(byteBuffer, this.entries.size());
        for (C3468a c3468a : this.entries) {
            i13 i13Var = new i13(byteBuffer);
            i13Var.m138073a(c3468a.m17457a(), 1);
            i13Var.m138073a(c3468a.m17458b(), 31);
            b1q.m101495g(byteBuffer, c3468a.m17462f());
            i13 i13Var2 = new i13(byteBuffer);
            i13Var2.m138073a(c3468a.m17461e(), 1);
            i13Var2.m138073a(c3468a.m17460d(), 3);
            i13Var2.m138073a(c3468a.m17459c(), 28);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return ((long) (getVersion() == 0 ? 8 : 16)) + 16 + ((long) (this.entries.size() * 12));
    }

    public long getEarliestPresentationTime() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_6, this, this));
        return this.earliestPresentationTime;
    }

    public List<C3468a> getEntries() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.entries;
    }

    public long getFirstOffset() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_8, this, this));
        return this.firstOffset;
    }

    public long getReferenceId() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_2, this, this));
        return this.referenceId;
    }

    public int getReserved() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_10, this, this));
        return this.reserved;
    }

    public long getTimeScale() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_4, this, this));
        return this.timeScale;
    }

    public void setEarliestPresentationTime(long j) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_7, this, this, Conversions.longObject(j)));
        this.earliestPresentationTime = j;
    }

    public void setEntries(List<C3468a> list) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_1, this, this, list));
        this.entries = list;
    }

    public void setFirstOffset(long j) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_9, this, this, Conversions.longObject(j)));
        this.firstOffset = j;
    }

    public void setReferenceId(long j) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_3, this, this, Conversions.longObject(j)));
        this.referenceId = j;
    }

    public void setReserved(int i) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_11, this, this, Conversions.intObject(i)));
        this.reserved = i;
    }

    public void setTimeScale(long j) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_5, this, this, Conversions.longObject(j)));
        this.timeScale = j;
    }

    public String toString() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_12, this, this));
        return "SegmentIndexBox{entries=" + this.entries + ", referenceId=" + this.referenceId + ", timeScale=" + this.timeScale + ", earliestPresentationTime=" + this.earliestPresentationTime + ", firstOffset=" + this.firstOffset + ", reserved=" + this.reserved + '}';
    }
}
