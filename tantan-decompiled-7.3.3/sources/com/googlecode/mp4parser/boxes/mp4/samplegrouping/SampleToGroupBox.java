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
import p153l.b1q;
import p153l.f3d0;
import p153l.rn4;
import p153l.y0q;

/* JADX INFO: loaded from: classes7.dex */
public class SampleToGroupBox extends AbstractFullBox {
    public static final String TYPE = "sbgp";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_5 = null;
    List<C3466a> entries;
    private String groupingType;
    private String groupingTypeParameter;

    /* JADX INFO: renamed from: com.googlecode.mp4parser.boxes.mp4.samplegrouping.SampleToGroupBox$a */
    public static class C3466a {

        /* JADX INFO: renamed from: a */
        private long f11754a;

        /* JADX INFO: renamed from: b */
        private int f11755b;

        public C3466a(long j, int i) {
            this.f11754a = j;
            this.f11755b = i;
        }

        /* JADX INFO: renamed from: a */
        public int m17455a() {
            return this.f11755b;
        }

        /* JADX INFO: renamed from: b */
        public long m17456b() {
            return this.f11754a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C3466a c3466a = (C3466a) obj;
            return this.f11755b == c3466a.f11755b && this.f11754a == c3466a.f11754a;
        }

        public int hashCode() {
            long j = this.f11754a;
            return (((int) (j ^ (j >>> 32))) * 31) + this.f11755b;
        }

        public String toString() {
            return "Entry{sampleCount=" + this.f11754a + ", groupDescriptionIndex=" + this.f11755b + '}';
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
        this.groupingType = y0q.m213886b(byteBuffer);
        if (getVersion() == 1) {
            this.groupingTypeParameter = y0q.m213886b(byteBuffer);
        }
        long jM213895k = y0q.m213895k(byteBuffer);
        while (true) {
            long j = jM213895k - 1;
            if (jM213895k <= 0) {
                return;
            }
            this.entries.add(new C3466a(rn4.m182119a(y0q.m213895k(byteBuffer)), rn4.m182119a(y0q.m213895k(byteBuffer))));
            jM213895k = j;
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.put(this.groupingType.getBytes());
        if (getVersion() == 1) {
            byteBuffer.put(this.groupingTypeParameter.getBytes());
        }
        b1q.m101495g(byteBuffer, this.entries.size());
        for (C3466a c3466a : this.entries) {
            b1q.m101495g(byteBuffer, c3466a.m17456b());
            b1q.m101495g(byteBuffer, c3466a.m17455a());
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        int version = getVersion();
        int size = this.entries.size() * 8;
        return version == 1 ? size + 16 : size + 12;
    }

    public List<C3466a> getEntries() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_4, this, this));
        return this.entries;
    }

    public String getGroupingType() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.groupingType;
    }

    public String getGroupingTypeParameter() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_2, this, this));
        return this.groupingTypeParameter;
    }

    public void setEntries(List<C3466a> list) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_5, this, this, list));
        this.entries = list;
    }

    public void setGroupingType(String str) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_1, this, this, str));
        this.groupingType = str;
    }

    public void setGroupingTypeParameter(String str) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_3, this, this, str));
        this.groupingTypeParameter = str;
    }
}
