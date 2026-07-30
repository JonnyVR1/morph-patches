package com.coremedia.iso.boxes.fragment;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.googlecode.mp4parser.AbstractFullBox;
import com.meituan.robust.Constants;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.internal.Conversions;
import org.aspectj.runtime.reflect.Factory;
import org.spongycastle.crypto.tls.CipherSuite;
import p149l.azp;
import p149l.bzp;
import p149l.cvc0;
import p149l.czp;
import p149l.yyp;

/* JADX INFO: loaded from: classes.dex */
public class TrackFragmentRandomAccessBox extends AbstractFullBox {
    public static final String TYPE = "tfra";
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
    private List<C1403a> entries;
    private int lengthSizeOfSampleNum;
    private int lengthSizeOfTrafNum;
    private int lengthSizeOfTrunNum;
    private int reserved;
    private long trackId;

    /* JADX INFO: renamed from: com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox$a */
    public static class C1403a {

        /* JADX INFO: renamed from: a */
        private long f5770a;

        /* JADX INFO: renamed from: b */
        private long f5771b;

        /* JADX INFO: renamed from: c */
        private long f5772c;

        /* JADX INFO: renamed from: d */
        private long f5773d;

        /* JADX INFO: renamed from: e */
        private long f5774e;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C1403a c1403a = (C1403a) obj;
            return this.f5771b == c1403a.f5771b && this.f5774e == c1403a.f5774e && this.f5770a == c1403a.f5770a && this.f5772c == c1403a.f5772c && this.f5773d == c1403a.f5773d;
        }

        public int hashCode() {
            long j = this.f5770a;
            long j2 = this.f5771b;
            int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.f5772c;
            int i2 = (i + ((int) (j3 ^ (j3 >>> 32)))) * 31;
            long j4 = this.f5773d;
            int i3 = (i2 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
            long j5 = this.f5774e;
            return i3 + ((int) ((j5 >>> 32) ^ j5));
        }

        public String toString() {
            return "Entry{time=" + this.f5770a + ", moofOffset=" + this.f5771b + ", trafNumber=" + this.f5772c + ", trunNumber=" + this.f5773d + ", sampleNumber=" + this.f5774e + '}';
        }
    }

    static {
        ajc$preClinit();
    }

    public TrackFragmentRandomAccessBox() {
        super(TYPE);
        this.lengthSizeOfTrafNum = 2;
        this.lengthSizeOfTrunNum = 2;
        this.lengthSizeOfSampleNum = 2;
        this.entries = Collections.EMPTY_LIST;
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("TrackFragmentRandomAccessBox.java", TrackFragmentRandomAccessBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setTrackId", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", Constants.LONG, "trackId", "", Constants.VOID), CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setLengthSizeOfTrafNum", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", Constants.INT, "lengthSizeOfTrafNum", "", Constants.VOID), 149);
        ajc$tjp_10 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getEntries", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", "java.util.List"), 185);
        ajc$tjp_11 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setEntries", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "java.util.List", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "", Constants.VOID), CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA256);
        ajc$tjp_12 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "toString", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", "java.lang.String"), 290);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setLengthSizeOfTrunNum", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", Constants.INT, "lengthSizeOfTrunNum", "", Constants.VOID), 153);
        ajc$tjp_3 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setLengthSizeOfSampleNum", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", Constants.INT, "lengthSizeOfSampleNum", "", Constants.VOID), 157);
        ajc$tjp_4 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getTrackId", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", Constants.LONG), 161);
        ajc$tjp_5 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getReserved", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", Constants.INT), 165);
        ajc$tjp_6 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getLengthSizeOfTrafNum", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", Constants.INT), 169);
        ajc$tjp_7 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getLengthSizeOfTrunNum", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", Constants.INT), CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384);
        ajc$tjp_8 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getLengthSizeOfSampleNum", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", Constants.INT), 177);
        ajc$tjp_9 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getNumberOfEntries", "com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox", "", "", "", Constants.LONG), 181);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.trackId = yyp.m216558k(byteBuffer);
        long jM216558k = yyp.m216558k(byteBuffer);
        this.reserved = (int) (jM216558k >> 6);
        this.lengthSizeOfTrafNum = (((int) (63 & jM216558k)) >> 4) + 1;
        this.lengthSizeOfTrunNum = (((int) (12 & jM216558k)) >> 2) + 1;
        this.lengthSizeOfSampleNum = ((int) (jM216558k & 3)) + 1;
        long jM216558k2 = yyp.m216558k(byteBuffer);
        this.entries = new ArrayList();
        for (int i = 0; i < jM216558k2; i++) {
            C1403a c1403a = new C1403a();
            if (getVersion() == 1) {
                c1403a.f5770a = yyp.m216560m(byteBuffer);
                c1403a.f5771b = yyp.m216560m(byteBuffer);
            } else {
                c1403a.f5770a = yyp.m216558k(byteBuffer);
                c1403a.f5771b = yyp.m216558k(byteBuffer);
            }
            c1403a.f5772c = azp.m99722a(byteBuffer, this.lengthSizeOfTrafNum);
            c1403a.f5773d = azp.m99722a(byteBuffer, this.lengthSizeOfTrunNum);
            c1403a.f5774e = azp.m99722a(byteBuffer, this.lengthSizeOfSampleNum);
            this.entries.add(c1403a);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        bzp.m104635g(byteBuffer, this.trackId);
        bzp.m104635g(byteBuffer, ((long) (this.reserved << 6)) | ((long) (((this.lengthSizeOfTrafNum - 1) & 3) << 4)) | ((long) (((this.lengthSizeOfTrunNum - 1) & 3) << 2)) | ((long) ((this.lengthSizeOfSampleNum - 1) & 3)));
        bzp.m104635g(byteBuffer, this.entries.size());
        for (C1403a c1403a : this.entries) {
            if (getVersion() == 1) {
                bzp.m104637i(byteBuffer, c1403a.f5770a);
                bzp.m104637i(byteBuffer, c1403a.f5771b);
            } else {
                bzp.m104635g(byteBuffer, c1403a.f5770a);
                bzp.m104635g(byteBuffer, c1403a.f5771b);
            }
            czp.m109429a(c1403a.f5772c, byteBuffer, this.lengthSizeOfTrafNum);
            czp.m109429a(c1403a.f5773d, byteBuffer, this.lengthSizeOfTrunNum);
            czp.m109429a(c1403a.f5774e, byteBuffer, this.lengthSizeOfSampleNum);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        int version = getVersion();
        List<C1403a> list = this.entries;
        return 16 + ((long) (version == 1 ? list.size() * 16 : list.size() * 8)) + ((long) (this.lengthSizeOfTrafNum * this.entries.size())) + ((long) (this.lengthSizeOfTrunNum * this.entries.size())) + ((long) (this.lengthSizeOfSampleNum * this.entries.size()));
    }

    public List<C1403a> getEntries() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_10, this, this));
        return Collections.unmodifiableList(this.entries);
    }

    public int getLengthSizeOfSampleNum() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_8, this, this));
        return this.lengthSizeOfSampleNum;
    }

    public int getLengthSizeOfTrafNum() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_6, this, this));
        return this.lengthSizeOfTrafNum;
    }

    public int getLengthSizeOfTrunNum() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_7, this, this));
        return this.lengthSizeOfTrunNum;
    }

    public long getNumberOfEntries() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_9, this, this));
        return this.entries.size();
    }

    public int getReserved() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_5, this, this));
        return this.reserved;
    }

    public long getTrackId() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_4, this, this));
        return this.trackId;
    }

    public void setEntries(List<C1403a> list) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_11, this, this, list));
        this.entries = list;
    }

    public void setLengthSizeOfSampleNum(int i) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_3, this, this, Conversions.intObject(i)));
        this.lengthSizeOfSampleNum = i;
    }

    public void setLengthSizeOfTrafNum(int i) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_1, this, this, Conversions.intObject(i)));
        this.lengthSizeOfTrafNum = i;
    }

    public void setLengthSizeOfTrunNum(int i) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_2, this, this, Conversions.intObject(i)));
        this.lengthSizeOfTrunNum = i;
    }

    public void setTrackId(long j) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_0, this, this, Conversions.longObject(j)));
        this.trackId = j;
    }

    public String toString() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_12, this, this));
        return "TrackFragmentRandomAccessBox{trackId=" + this.trackId + ", entries=" + this.entries + '}';
    }
}
