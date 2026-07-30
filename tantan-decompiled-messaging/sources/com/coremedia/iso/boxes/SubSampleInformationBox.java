package com.coremedia.iso.boxes;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.googlecode.mp4parser.AbstractFullBox;
import com.meituan.robust.Constants;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import p149l.bzp;
import p149l.cvc0;
import p149l.sm4;
import p149l.yyp;

/* JADX INFO: loaded from: classes.dex */
public class SubSampleInformationBox extends AbstractFullBox {
    public static final String TYPE = "subs";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2 = null;
    private List<C1400a> entries;

    /* JADX INFO: renamed from: com.coremedia.iso.boxes.SubSampleInformationBox$a */
    public static class C1400a {

        /* JADX INFO: renamed from: a */
        private long f5761a;

        /* JADX INFO: renamed from: b */
        private List<a> f5762b = new ArrayList();

        /* JADX INFO: renamed from: com.coremedia.iso.boxes.SubSampleInformationBox$a$a */
        public static class a {

            /* JADX INFO: renamed from: a */
            private long f5763a;

            /* JADX INFO: renamed from: b */
            private int f5764b;

            /* JADX INFO: renamed from: c */
            private int f5765c;

            /* JADX INFO: renamed from: d */
            private long f5766d;

            /* JADX INFO: renamed from: a */
            public int m7351a() {
                return this.f5765c;
            }

            /* JADX INFO: renamed from: b */
            public long m7352b() {
                return this.f5766d;
            }

            /* JADX INFO: renamed from: c */
            public int m7353c() {
                return this.f5764b;
            }

            /* JADX INFO: renamed from: d */
            public long m7354d() {
                return this.f5763a;
            }

            /* JADX INFO: renamed from: e */
            public void m7355e(int i) {
                this.f5765c = i;
            }

            /* JADX INFO: renamed from: f */
            public void m7356f(long j) {
                this.f5766d = j;
            }

            /* JADX INFO: renamed from: g */
            public void m7357g(int i) {
                this.f5764b = i;
            }

            /* JADX INFO: renamed from: h */
            public void m7358h(long j) {
                this.f5763a = j;
            }

            public String toString() {
                return "SubsampleEntry{subsampleSize=" + this.f5763a + ", subsamplePriority=" + this.f5764b + ", discardable=" + this.f5765c + ", reserved=" + this.f5766d + '}';
            }
        }

        /* JADX INFO: renamed from: a */
        public long m7347a() {
            return this.f5761a;
        }

        /* JADX INFO: renamed from: b */
        public int m7348b() {
            return this.f5762b.size();
        }

        /* JADX INFO: renamed from: c */
        public List<a> m7349c() {
            return this.f5762b;
        }

        /* JADX INFO: renamed from: d */
        public void m7350d(long j) {
            this.f5761a = j;
        }

        public String toString() {
            return "SampleEntry{sampleDelta=" + this.f5761a + ", subsampleCount=" + this.f5762b.size() + ", subsampleEntries=" + this.f5762b + '}';
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
        long jM216558k = yyp.m216558k(byteBuffer);
        for (int i = 0; i < jM216558k; i++) {
            C1400a c1400a = new C1400a();
            c1400a.m7350d(yyp.m216558k(byteBuffer));
            int iM216556i = yyp.m216556i(byteBuffer);
            for (int i2 = 0; i2 < iM216556i; i2++) {
                C1400a.a aVar = new C1400a.a();
                aVar.m7358h(getVersion() == 1 ? yyp.m216558k(byteBuffer) : yyp.m216556i(byteBuffer));
                aVar.m7357g(yyp.m216561n(byteBuffer));
                aVar.m7355e(yyp.m216561n(byteBuffer));
                aVar.m7356f(yyp.m216558k(byteBuffer));
                c1400a.m7349c().add(aVar);
            }
            this.entries.add(c1400a);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        bzp.m104635g(byteBuffer, this.entries.size());
        for (C1400a c1400a : this.entries) {
            bzp.m104635g(byteBuffer, c1400a.m7347a());
            bzp.m104633e(byteBuffer, c1400a.m7348b());
            for (C1400a.a aVar : c1400a.m7349c()) {
                if (getVersion() == 1) {
                    bzp.m104635g(byteBuffer, aVar.m7354d());
                } else {
                    bzp.m104633e(byteBuffer, sm4.m184929a(aVar.m7354d()));
                }
                bzp.m104638j(byteBuffer, aVar.m7353c());
                bzp.m104638j(byteBuffer, aVar.m7351a());
                bzp.m104635g(byteBuffer, aVar.m7352b());
            }
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        long j = 8;
        for (C1400a c1400a : this.entries) {
            j += 6;
            for (int i = 0; i < c1400a.m7349c().size(); i++) {
                j = j + (getVersion() == 1 ? 4L : 2L) + 6;
            }
        }
        return j;
    }

    public List<C1400a> getEntries() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.entries;
    }

    public void setEntries(List<C1400a> list) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_1, this, this, list));
        this.entries = list;
    }

    public String toString() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_2, this, this));
        return "SubSampleInformationBox{entryCount=" + this.entries.size() + ", entries=" + this.entries + '}';
    }
}
