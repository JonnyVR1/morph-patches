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
import p153l.a1q;
import p153l.b1q;
import p153l.c1q;
import p153l.f3d0;
import p153l.y0q;

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
    private List<C1426a> entries;
    private int lengthSizeOfSampleNum;
    private int lengthSizeOfTrafNum;
    private int lengthSizeOfTrunNum;
    private int reserved;
    private long trackId;

    /* JADX INFO: renamed from: com.coremedia.iso.boxes.fragment.TrackFragmentRandomAccessBox$a */
    public static class C1426a {

        /* JADX INFO: renamed from: a */
        private long f5807a;

        /* JADX INFO: renamed from: b */
        private long f5808b;

        /* JADX INFO: renamed from: c */
        private long f5809c;

        /* JADX INFO: renamed from: d */
        private long f5810d;

        /* JADX INFO: renamed from: e */
        private long f5811e;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C1426a c1426a = (C1426a) obj;
            return this.f5808b == c1426a.f5808b && this.f5811e == c1426a.f5811e && this.f5807a == c1426a.f5807a && this.f5809c == c1426a.f5809c && this.f5810d == c1426a.f5810d;
        }

        public int hashCode() {
            long j = this.f5807a;
            long j2 = this.f5808b;
            int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.f5809c;
            int i2 = (i + ((int) (j3 ^ (j3 >>> 32)))) * 31;
            long j4 = this.f5810d;
            int i3 = (i2 + ((int) (j4 ^ (j4 >>> 32)))) * 31;
            long j5 = this.f5811e;
            return i3 + ((int) ((j5 >>> 32) ^ j5));
        }

        public String toString() {
            return "Entry{time=" + this.f5807a + ", moofOffset=" + this.f5808b + ", trafNumber=" + this.f5809c + ", trunNumber=" + this.f5810d + ", sampleNumber=" + this.f5811e + '}';
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
        this.trackId = y0q.m213895k(byteBuffer);
        long jM213895k = y0q.m213895k(byteBuffer);
        this.reserved = (int) (jM213895k >> 6);
        this.lengthSizeOfTrafNum = (((int) (63 & jM213895k)) >> 4) + 1;
        this.lengthSizeOfTrunNum = (((int) (12 & jM213895k)) >> 2) + 1;
        this.lengthSizeOfSampleNum = ((int) (jM213895k & 3)) + 1;
        long jM213895k2 = y0q.m213895k(byteBuffer);
        this.entries = new ArrayList();
        for (int i = 0; i < jM213895k2; i++) {
            C1426a c1426a = new C1426a();
            if (getVersion() == 1) {
                c1426a.f5807a = y0q.m213897m(byteBuffer);
                c1426a.f5808b = y0q.m213897m(byteBuffer);
            } else {
                c1426a.f5807a = y0q.m213895k(byteBuffer);
                c1426a.f5808b = y0q.m213895k(byteBuffer);
            }
            c1426a.f5809c = a1q.m95539a(byteBuffer, this.lengthSizeOfTrafNum);
            c1426a.f5810d = a1q.m95539a(byteBuffer, this.lengthSizeOfTrunNum);
            c1426a.f5811e = a1q.m95539a(byteBuffer, this.lengthSizeOfSampleNum);
            this.entries.add(c1426a);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        b1q.m101495g(byteBuffer, this.trackId);
        b1q.m101495g(byteBuffer, ((long) (this.reserved << 6)) | ((long) (((this.lengthSizeOfTrafNum - 1) & 3) << 4)) | ((long) (((this.lengthSizeOfTrunNum - 1) & 3) << 2)) | ((long) ((this.lengthSizeOfSampleNum - 1) & 3)));
        b1q.m101495g(byteBuffer, this.entries.size());
        for (C1426a c1426a : this.entries) {
            if (getVersion() == 1) {
                b1q.m101497i(byteBuffer, c1426a.f5807a);
                b1q.m101497i(byteBuffer, c1426a.f5808b);
            } else {
                b1q.m101495g(byteBuffer, c1426a.f5807a);
                b1q.m101495g(byteBuffer, c1426a.f5808b);
            }
            c1q.m107634a(c1426a.f5809c, byteBuffer, this.lengthSizeOfTrafNum);
            c1q.m107634a(c1426a.f5810d, byteBuffer, this.lengthSizeOfTrunNum);
            c1q.m107634a(c1426a.f5811e, byteBuffer, this.lengthSizeOfSampleNum);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        int version = getVersion();
        List<C1426a> list = this.entries;
        return 16 + ((long) (version == 1 ? list.size() * 16 : list.size() * 8)) + ((long) (this.lengthSizeOfTrafNum * this.entries.size())) + ((long) (this.lengthSizeOfTrunNum * this.entries.size())) + ((long) (this.lengthSizeOfSampleNum * this.entries.size()));
    }

    public List<C1426a> getEntries() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_10, this, this));
        return Collections.unmodifiableList(this.entries);
    }

    public int getLengthSizeOfSampleNum() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_8, this, this));
        return this.lengthSizeOfSampleNum;
    }

    public int getLengthSizeOfTrafNum() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_6, this, this));
        return this.lengthSizeOfTrafNum;
    }

    public int getLengthSizeOfTrunNum() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_7, this, this));
        return this.lengthSizeOfTrunNum;
    }

    public long getNumberOfEntries() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_9, this, this));
        return this.entries.size();
    }

    public int getReserved() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_5, this, this));
        return this.reserved;
    }

    public long getTrackId() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_4, this, this));
        return this.trackId;
    }

    public void setEntries(List<C1426a> list) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_11, this, this, list));
        this.entries = list;
    }

    public void setLengthSizeOfSampleNum(int i) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_3, this, this, Conversions.intObject(i)));
        this.lengthSizeOfSampleNum = i;
    }

    public void setLengthSizeOfTrafNum(int i) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_1, this, this, Conversions.intObject(i)));
        this.lengthSizeOfTrafNum = i;
    }

    public void setLengthSizeOfTrunNum(int i) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_2, this, this, Conversions.intObject(i)));
        this.lengthSizeOfTrunNum = i;
    }

    public void setTrackId(long j) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_0, this, this, Conversions.longObject(j)));
        this.trackId = j;
    }

    public String toString() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_12, this, this));
        return "TrackFragmentRandomAccessBox{trackId=" + this.trackId + ", entries=" + this.entries + '}';
    }
}
