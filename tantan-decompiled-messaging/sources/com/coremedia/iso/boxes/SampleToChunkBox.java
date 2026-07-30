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
import p149l.bzp;
import p149l.cvc0;
import p149l.sm4;
import p149l.yyp;

/* JADX INFO: loaded from: classes.dex */
public class SampleToChunkBox extends AbstractFullBox {
    public static final String TYPE = "stsc";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3 = null;
    List<C1399a> entries;

    /* JADX INFO: renamed from: com.coremedia.iso.boxes.SampleToChunkBox$a */
    public static class C1399a {

        /* JADX INFO: renamed from: a */
        long f5758a;

        /* JADX INFO: renamed from: b */
        long f5759b;

        /* JADX INFO: renamed from: c */
        long f5760c;

        public C1399a(long j, long j2, long j3) {
            this.f5758a = j;
            this.f5759b = j2;
            this.f5760c = j3;
        }

        /* JADX INFO: renamed from: a */
        public long m7344a() {
            return this.f5758a;
        }

        /* JADX INFO: renamed from: b */
        public long m7345b() {
            return this.f5760c;
        }

        /* JADX INFO: renamed from: c */
        public long m7346c() {
            return this.f5759b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C1399a c1399a = (C1399a) obj;
            return this.f5758a == c1399a.f5758a && this.f5760c == c1399a.f5760c && this.f5759b == c1399a.f5759b;
        }

        public int hashCode() {
            long j = this.f5758a;
            long j2 = this.f5759b;
            int i = ((((int) (j ^ (j >>> 32))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31;
            long j3 = this.f5760c;
            return i + ((int) ((j3 >>> 32) ^ j3));
        }

        public String toString() {
            return "Entry{firstChunk=" + this.f5758a + ", samplesPerChunk=" + this.f5759b + ", sampleDescriptionIndex=" + this.f5760c + '}';
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
        int iM184929a = sm4.m184929a(yyp.m216558k(byteBuffer));
        this.entries = new ArrayList(iM184929a);
        for (int i = 0; i < iM184929a; i++) {
            this.entries.add(new C1399a(yyp.m216558k(byteBuffer), yyp.m216558k(byteBuffer), yyp.m216558k(byteBuffer)));
        }
    }

    public long[] blowup(int i) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_3, this, this, Conversions.intObject(i)));
        long[] jArr = new long[i];
        LinkedList linkedList = new LinkedList(this.entries);
        Collections.reverse(linkedList);
        Iterator it = linkedList.iterator();
        C1399a c1399a = (C1399a) it.next();
        while (i > 1) {
            jArr[i - 1] = c1399a.m7346c();
            if (i == c1399a.m7344a()) {
                c1399a = (C1399a) it.next();
            }
            i--;
        }
        jArr[0] = c1399a.m7346c();
        return jArr;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        bzp.m104635g(byteBuffer, this.entries.size());
        for (C1399a c1399a : this.entries) {
            bzp.m104635g(byteBuffer, c1399a.m7344a());
            bzp.m104635g(byteBuffer, c1399a.m7346c());
            bzp.m104635g(byteBuffer, c1399a.m7345b());
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return (this.entries.size() * 12) + 8;
    }

    public List<C1399a> getEntries() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.entries;
    }

    public void setEntries(List<C1399a> list) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_1, this, this, list));
        this.entries = list;
    }

    public String toString() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_2, this, this));
        return "SampleToChunkBox[entryCount=" + this.entries.size() + com.clevertap.android.sdk.Constants.AES_SUFFIX;
    }
}
