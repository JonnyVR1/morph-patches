package com.coremedia.iso.boxes;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.googlecode.mp4parser.AbstractFullBox;
import com.meituan.robust.Constants;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import p153l.b1q;
import p153l.f3d0;
import p153l.rn4;
import p153l.y0q;

/* JADX INFO: loaded from: classes.dex */
public class SubSampleInformationBox extends AbstractFullBox {
    public static final String TYPE = "subs";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2 = null;
    private List<C1423a> entries;

    /* JADX INFO: renamed from: com.coremedia.iso.boxes.SubSampleInformationBox$a */
    public static class C1423a {

        /* JADX INFO: renamed from: a */
        private long f5798a;

        /* JADX INFO: renamed from: b */
        private List<a> f5799b = new ArrayList();

        /* JADX INFO: renamed from: com.coremedia.iso.boxes.SubSampleInformationBox$a$a */
        public static class a {

            /* JADX INFO: renamed from: a */
            private long f5800a;

            /* JADX INFO: renamed from: b */
            private int f5801b;

            /* JADX INFO: renamed from: c */
            private int f5802c;

            /* JADX INFO: renamed from: d */
            private long f5803d;

            /* JADX INFO: renamed from: a */
            public int m7405a() {
                return this.f5802c;
            }

            /* JADX INFO: renamed from: b */
            public long m7406b() {
                return this.f5803d;
            }

            /* JADX INFO: renamed from: c */
            public int m7407c() {
                return this.f5801b;
            }

            /* JADX INFO: renamed from: d */
            public long m7408d() {
                return this.f5800a;
            }

            /* JADX INFO: renamed from: e */
            public void m7409e(int i) {
                this.f5802c = i;
            }

            /* JADX INFO: renamed from: f */
            public void m7410f(long j) {
                this.f5803d = j;
            }

            /* JADX INFO: renamed from: g */
            public void m7411g(int i) {
                this.f5801b = i;
            }

            /* JADX INFO: renamed from: h */
            public void m7412h(long j) {
                this.f5800a = j;
            }

            public String toString() {
                return "SubsampleEntry{subsampleSize=" + this.f5800a + ", subsamplePriority=" + this.f5801b + ", discardable=" + this.f5802c + ", reserved=" + this.f5803d + '}';
            }
        }

        /* JADX INFO: renamed from: a */
        public long m7401a() {
            return this.f5798a;
        }

        /* JADX INFO: renamed from: b */
        public int m7402b() {
            return this.f5799b.size();
        }

        /* JADX INFO: renamed from: c */
        public List<a> m7403c() {
            return this.f5799b;
        }

        /* JADX INFO: renamed from: d */
        public void m7404d(long j) {
            this.f5798a = j;
        }

        public String toString() {
            return "SampleEntry{sampleDelta=" + this.f5798a + ", subsampleCount=" + this.f5799b.size() + ", subsampleEntries=" + this.f5799b + '}';
        }
    }

    static {
        ajc$preClinit();
    }

    public SubSampleInformationBox() {
        super(TYPE);
        this.entries = new ArrayList();
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("SubSampleInformationBox.java", SubSampleInformationBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getEntries", "com.coremedia.iso.boxes.SubSampleInformationBox", "", "", "", "java.util.List"), 50);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setEntries", "com.coremedia.iso.boxes.SubSampleInformationBox", "java.util.List", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "", Constants.VOID), 54);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "toString", "com.coremedia.iso.boxes.SubSampleInformationBox", "", "", "", "java.lang.String"), 124);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        long jM213895k = y0q.m213895k(byteBuffer);
        for (int i = 0; i < jM213895k; i++) {
            C1423a c1423a = new C1423a();
            c1423a.m7404d(y0q.m213895k(byteBuffer));
            int iM213893i = y0q.m213893i(byteBuffer);
            for (int i2 = 0; i2 < iM213893i; i2++) {
                C1423a.a aVar = new C1423a.a();
                aVar.m7412h(getVersion() == 1 ? y0q.m213895k(byteBuffer) : y0q.m213893i(byteBuffer));
                aVar.m7411g(y0q.m213898n(byteBuffer));
                aVar.m7409e(y0q.m213898n(byteBuffer));
                aVar.m7410f(y0q.m213895k(byteBuffer));
                c1423a.m7403c().add(aVar);
            }
            this.entries.add(c1423a);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        b1q.m101495g(byteBuffer, this.entries.size());
        for (C1423a c1423a : this.entries) {
            b1q.m101495g(byteBuffer, c1423a.m7401a());
            b1q.m101493e(byteBuffer, c1423a.m7402b());
            for (C1423a.a aVar : c1423a.m7403c()) {
                if (getVersion() == 1) {
                    b1q.m101495g(byteBuffer, aVar.m7408d());
                } else {
                    b1q.m101493e(byteBuffer, rn4.m182119a(aVar.m7408d()));
                }
                b1q.m101498j(byteBuffer, aVar.m7407c());
                b1q.m101498j(byteBuffer, aVar.m7405a());
                b1q.m101495g(byteBuffer, aVar.m7406b());
            }
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        long j = 8;
        for (C1423a c1423a : this.entries) {
            j += 6;
            for (int i = 0; i < c1423a.m7403c().size(); i++) {
                j = j + (getVersion() == 1 ? 4L : 2L) + 6;
            }
        }
        return j;
    }

    public List<C1423a> getEntries() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.entries;
    }

    public void setEntries(List<C1423a> list) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_1, this, this, list));
        this.entries = list;
    }

    public String toString() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_2, this, this));
        return "SubSampleInformationBox{entryCount=" + this.entries.size() + ", entries=" + this.entries + '}';
    }
}
