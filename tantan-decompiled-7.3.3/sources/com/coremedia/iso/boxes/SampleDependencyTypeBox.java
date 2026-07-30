package com.coremedia.iso.boxes;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.googlecode.mp4parser.AbstractFullBox;
import com.meituan.robust.Constants;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.spongycastle.crypto.tls.CipherSuite;
import p153l.b1q;
import p153l.f3d0;
import p153l.y0q;

/* JADX INFO: loaded from: classes.dex */
public class SampleDependencyTypeBox extends AbstractFullBox {
    public static final String TYPE = "sdtp";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2 = null;
    private List<C1421a> entries;

    /* JADX INFO: renamed from: com.coremedia.iso.boxes.SampleDependencyTypeBox$a */
    public static class C1421a {

        /* JADX INFO: renamed from: a */
        private int f5794a;

        public C1421a(int i) {
            this.f5794a = i;
        }

        /* JADX INFO: renamed from: b */
        public int m7394b() {
            return (this.f5794a >> 6) & 3;
        }

        /* JADX INFO: renamed from: c */
        public int m7395c() {
            return (this.f5794a >> 4) & 3;
        }

        /* JADX INFO: renamed from: d */
        public int m7396d() {
            return this.f5794a & 3;
        }

        /* JADX INFO: renamed from: e */
        public int m7397e() {
            return (this.f5794a >> 2) & 3;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.f5794a == ((C1421a) obj).f5794a;
        }

        public int hashCode() {
            return this.f5794a;
        }

        public String toString() {
            return "Entry{reserved=" + m7394b() + ", sampleDependsOn=" + m7395c() + ", sampleIsDependentOn=" + m7397e() + ", sampleHasRedundancy=" + m7396d() + '}';
        }
    }

    static {
        ajc$preClinit();
    }

    public SampleDependencyTypeBox() {
        super(TYPE);
        this.entries = new ArrayList();
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("SampleDependencyTypeBox.java", SampleDependencyTypeBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getEntries", "com.coremedia.iso.boxes.SampleDependencyTypeBox", "", "", "", "java.util.List"), CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setEntries", "com.coremedia.iso.boxes.SampleDependencyTypeBox", "java.util.List", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "", Constants.VOID), CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "toString", "com.coremedia.iso.boxes.SampleDependencyTypeBox", "", "", "", "java.lang.String"), 148);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        while (byteBuffer.remaining() > 0) {
            this.entries.add(new C1421a(y0q.m213898n(byteBuffer)));
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        Iterator<C1421a> it = this.entries.iterator();
        while (it.hasNext()) {
            b1q.m101498j(byteBuffer, it.next().f5794a);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return this.entries.size() + 4;
    }

    public List<C1421a> getEntries() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.entries;
    }

    public void setEntries(List<C1421a> list) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_1, this, this, list));
        this.entries = list;
    }

    public String toString() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_2, this, this));
        return "SampleDependencyTypeBox{entries=" + this.entries + '}';
    }
}
