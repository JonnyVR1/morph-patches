package com.coremedia.iso.boxes;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.googlecode.mp4parser.AbstractFullBox;
import com.meituan.robust.Constants;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.internal.Conversions;
import org.aspectj.runtime.reflect.Factory;
import p153l.b1q;
import p153l.f3d0;
import p153l.rn4;
import p153l.y0q;

/* JADX INFO: loaded from: classes.dex */
public class SampleToChunkBox extends AbstractFullBox {
    public static final String TYPE = "stsc";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3 = null;
    List<C1422a> entries;

    /* JADX INFO: renamed from: com.coremedia.iso.boxes.SampleToChunkBox$a */
    public static class C1422a {

        /* JADX INFO: renamed from: a */
        long f5795a;

        /* JADX INFO: renamed from: b */
        long f5796b;

        /* JADX INFO: renamed from: c */
        long f5797c;

        public C1422a(long j, long j2, long j3) {
            this.f5795a = j;
            this.f5796b = j2;
            this.f5797c = j3;
        }

        /* JADX INFO: renamed from: a */
        public long m7398a() {
            return this.f5795a;
        }

        /* JADX INFO: renamed from: b */
        public long m7399b() {
            return this.f5797c;
        }

        /* JADX INFO: renamed from: c */
        public long m7400c() {
            return this.f5796b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C1422a c1422a = (C1422a) obj;
            return this.f5795a == c1422a.f5795a && this.f5797c == c1422a.f5797c && this.f5796b == c1422a.f5796b;
        }

        public int hashCode() {
            long j = this.f5795a;
            long j2 = this.f5796b;
            int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.f5797c;
            return i + ((int) ((j3 >>> 32) ^ j3));
        }

        public String toString() {
            return "Entry{firstChunk=" + this.f5795a + ", samplesPerChunk=" + this.f5796b + ", sampleDescriptionIndex=" + this.f5797c + '}';
        }
    }

    static {
        ajc$preClinit();
    }

    public SampleToChunkBox() {
        super(TYPE);
        this.entries = Collections.EMPTY_LIST;
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("SampleToChunkBox.java", SampleToChunkBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getEntries", "com.coremedia.iso.boxes.SampleToChunkBox", "", "", "", "java.util.List"), 47);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setEntries", "com.coremedia.iso.boxes.SampleToChunkBox", "java.util.List", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "", Constants.VOID), 51);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "toString", "com.coremedia.iso.boxes.SampleToChunkBox", "", "", "", "java.lang.String"), 84);
        ajc$tjp_3 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "blowup", "com.coremedia.iso.boxes.SampleToChunkBox", Constants.INT, "chunkCount", "", "[J"), 95);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        int iM182119a = rn4.m182119a(y0q.m213895k(byteBuffer));
        this.entries = new ArrayList(iM182119a);
        for (int i = 0; i < iM182119a; i++) {
            this.entries.add(new C1422a(y0q.m213895k(byteBuffer), y0q.m213895k(byteBuffer), y0q.m213895k(byteBuffer)));
        }
    }

    public long[] blowup(int i) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_3, this, this, Conversions.intObject(i)));
        long[] jArr = new long[i];
        LinkedList linkedList = new LinkedList(this.entries);
        Collections.reverse(linkedList);
        Iterator it = linkedList.iterator();
        C1422a c1422a = (C1422a) it.next();
        while (i > 1) {
            jArr[i - 1] = c1422a.m7400c();
            if (i == c1422a.m7398a()) {
                c1422a = (C1422a) it.next();
            }
            i--;
        }
        jArr[0] = c1422a.m7400c();
        return jArr;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        b1q.m101495g(byteBuffer, this.entries.size());
        for (C1422a c1422a : this.entries) {
            b1q.m101495g(byteBuffer, c1422a.m7398a());
            b1q.m101495g(byteBuffer, c1422a.m7400c());
            b1q.m101495g(byteBuffer, c1422a.m7399b());
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return (this.entries.size() * 12) + 8;
    }

    public List<C1422a> getEntries() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.entries;
    }

    public void setEntries(List<C1422a> list) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_1, this, this, list));
        this.entries = list;
    }

    public String toString() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_2, this, this));
        return "SampleToChunkBox[entryCount=" + this.entries.size() + com.clevertap.android.sdk.Constants.AES_SUFFIX;
    }
}
