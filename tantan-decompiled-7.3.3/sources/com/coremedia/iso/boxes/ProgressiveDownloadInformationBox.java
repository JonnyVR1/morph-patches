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
import p153l.b1q;
import p153l.f3d0;
import p153l.y0q;

/* JADX INFO: loaded from: classes.dex */
public class ProgressiveDownloadInformationBox extends AbstractFullBox {
    public static final String TYPE = "pdin";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2 = null;
    List<C1420a> entries;

    /* JADX INFO: renamed from: com.coremedia.iso.boxes.ProgressiveDownloadInformationBox$a */
    public static class C1420a {

        /* JADX INFO: renamed from: a */
        long f5792a;

        /* JADX INFO: renamed from: b */
        long f5793b;

        public C1420a(long j, long j2) {
            this.f5792a = j;
            this.f5793b = j2;
        }

        /* JADX INFO: renamed from: a */
        public long m7391a() {
            return this.f5793b;
        }

        /* JADX INFO: renamed from: b */
        public long m7392b() {
            return this.f5792a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C1420a c1420a = (C1420a) obj;
            return this.f5793b == c1420a.f5793b && this.f5792a == c1420a.f5792a;
        }

        public int hashCode() {
            long j = this.f5792a;
            int i = ((int) (j ^ (j >>> 32))) * 31;
            long j2 = this.f5793b;
            return i + ((int) ((j2 >>> 32) ^ j2));
        }

        public String toString() {
            return "Entry{rate=" + this.f5792a + ", initialDelay=" + this.f5793b + '}';
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
            this.entries.add(new C1420a(y0q.m213895k(byteBuffer), y0q.m213895k(byteBuffer)));
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        for (C1420a c1420a : this.entries) {
            b1q.m101495g(byteBuffer, c1420a.m7392b());
            b1q.m101495g(byteBuffer, c1420a.m7391a());
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return (this.entries.size() * 8) + 4;
    }

    public List<C1420a> getEntries() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.entries;
    }

    public void setEntries(List<C1420a> list) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_1, this, this, list));
        this.entries = list;
    }

    public String toString() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_2, this, this));
        return "ProgressiveDownloadInfoBox{entries=" + this.entries + '}';
    }
}
