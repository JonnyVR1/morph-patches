package com.googlecode.mp4parser.boxes.mp4.samplegrouping;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.googlecode.mp4parser.AbstractFullBox;
import com.meituan.robust.Constants;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.List;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.spongycastle.crypto.tls.CipherSuite;
import p149l.bzp;
import p149l.cvc0;
import p149l.sm4;
import p149l.yyp;

/* JADX INFO: loaded from: classes7.dex */
public class SampleToGroupBox extends AbstractFullBox {
    public static final String TYPE = "sbgp";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_5 = null;
    List<C3443a> entries;
    private String groupingType;
    private String groupingTypeParameter;

    /* JADX INFO: renamed from: com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox$a */
    public static class C3443a {

        /* JADX INFO: renamed from: a */
        private long f11717a;

        /* JADX INFO: renamed from: b */
        private int f11718b;

        public C3443a(long j, int i) {
            this.f11717a = j;
            this.f11718b = i;
        }

        /* JADX INFO: renamed from: a */
        public int m17400a() {
            return this.f11718b;
        }

        /* JADX INFO: renamed from: b */
        public long m17401b() {
            return this.f11717a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C3443a c3443a = (C3443a) obj;
            return this.f11718b == c3443a.f11718b && this.f11717a == c3443a.f11717a;
        }

        public int hashCode() {
            long j = this.f11717a;
            return (((int) (j ^ (j >>> 32))) * 31) + this.f11718b;
        }

        public String toString() {
            return "Entry{sampleCount=" + this.f11717a + ", groupDescriptionIndex=" + this.f11718b + '}';
        }
    }

    static {
        ajc$preClinit();
    }

    public SampleToGroupBox() {
        super(TYPE);
        this.entries = new LinkedList();
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("SampleToGroupBox.java", SampleToGroupBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getGroupingType", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox", "", "", "", "java.lang.String"), 150);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setGroupingType", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox", "java.lang.String", "groupingType", "", Constants.VOID), 154);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getGroupingTypeParameter", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox", "", "", "", "java.lang.String"), 158);
        ajc$tjp_3 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setGroupingTypeParameter", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox", "java.lang.String", "groupingTypeParameter", "", Constants.VOID), 162);
        ajc$tjp_4 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getEntries", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox", "", "", "", "java.util.List"), 166);
        ajc$tjp_5 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setEntries", "com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox", "java.util.List", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "", Constants.VOID), CipherSuite.TLS_DHE_PSK_WITH_AES_128_GCM_SHA256);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.groupingType = yyp.m216549b(byteBuffer);
        if (getVersion() == 1) {
            this.groupingTypeParameter = yyp.m216549b(byteBuffer);
        }
        long jM216558k = yyp.m216558k(byteBuffer);
        while (true) {
            long j = jM216558k - 1;
            if (jM216558k <= 0) {
                return;
            }
            this.entries.add(new C3443a(sm4.m184929a(yyp.m216558k(byteBuffer)), sm4.m184929a(yyp.m216558k(byteBuffer))));
            jM216558k = j;
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.put(this.groupingType.getBytes());
        if (getVersion() == 1) {
            byteBuffer.put(this.groupingTypeParameter.getBytes());
        }
        bzp.m104635g(byteBuffer, this.entries.size());
        for (C3443a c3443a : this.entries) {
            bzp.m104635g(byteBuffer, c3443a.m17401b());
            bzp.m104635g(byteBuffer, c3443a.m17400a());
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        int version = getVersion();
        int size = this.entries.size() * 8;
        return version == 1 ? size + 16 : size + 12;
    }

    public List<C3443a> getEntries() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_4, this, this));
        return this.entries;
    }

    public String getGroupingType() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.groupingType;
    }

    public String getGroupingTypeParameter() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_2, this, this));
        return this.groupingTypeParameter;
    }

    public void setEntries(List<C3443a> list) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_5, this, this, list));
        this.entries = list;
    }

    public void setGroupingType(String str) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_1, this, this, str));
        this.groupingType = str;
    }

    public void setGroupingTypeParameter(String str) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_3, this, this, str));
        this.groupingTypeParameter = str;
    }
}
