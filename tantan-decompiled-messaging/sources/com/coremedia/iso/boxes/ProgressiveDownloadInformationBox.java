package com.coremedia.iso.boxes;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.googlecode.mp4parser.AbstractFullBox;
import com.meituan.robust.Constants;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import p149l.bzp;
import p149l.cvc0;
import p149l.yyp;

/* JADX INFO: loaded from: classes.dex */
public class ProgressiveDownloadInformationBox extends AbstractFullBox {
    public static final String TYPE = "pdin";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2 = null;
    List<C1397a> entries;

    /* JADX INFO: renamed from: com.coremedia.iso.boxes.ProgressiveDownloadInformationBox$a */
    public static class C1397a {

        /* JADX INFO: renamed from: a */
        long f5755a;

        /* JADX INFO: renamed from: b */
        long f5756b;

        public C1397a(long j, long j2) {
            this.f5755a = j;
            this.f5756b = j2;
        }

        /* JADX INFO: renamed from: a */
        public long m7337a() {
            return this.f5756b;
        }

        /* JADX INFO: renamed from: b */
        public long m7338b() {
            return this.f5755a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C1397a c1397a = (C1397a) obj;
            return this.f5756b == c1397a.f5756b && this.f5755a == c1397a.f5755a;
        }

        public int hashCode() {
            long j = this.f5755a;
            int i = ((int) (j ^ (j >>> 32))) * 31;
            long j2 = this.f5756b;
            return i + ((int) ((j2 >>> 32) ^ j2));
        }

        public String toString() {
            return "Entry{rate=" + this.f5755a + ", initialDelay=" + this.f5756b + '}';
        }
    }

    static {
        ajc$preClinit();
    }

    public ProgressiveDownloadInformationBox() {
        super(TYPE);
        this.entries = Collections.EMPTY_LIST;
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("ProgressiveDownloadInformationBox.java", ProgressiveDownloadInformationBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getEntries", "com.coremedia.iso.boxes.ProgressiveDownloadInformationBox", "", "", "", "java.util.List"), 38);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setEntries", "com.coremedia.iso.boxes.ProgressiveDownloadInformationBox", "java.util.List", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "", Constants.VOID), 42);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "toString", "com.coremedia.iso.boxes.ProgressiveDownloadInformationBox", "", "", "", "java.lang.String"), 112);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.entries = new LinkedList();
        while (byteBuffer.remaining() >= 8) {
            this.entries.add(new C1397a(yyp.m216558k(byteBuffer), yyp.m216558k(byteBuffer)));
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        for (C1397a c1397a : this.entries) {
            bzp.m104635g(byteBuffer, c1397a.m7338b());
            bzp.m104635g(byteBuffer, c1397a.m7337a());
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return (this.entries.size() * 8) + 4;
    }

    public List<C1397a> getEntries() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.entries;
    }

    public void setEntries(List<C1397a> list) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_1, this, this, list));
        this.entries = list;
    }

    public String toString() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_2, this, this));
        return "ProgressiveDownloadInfoBox{entries=" + this.entries + '}';
    }
}
