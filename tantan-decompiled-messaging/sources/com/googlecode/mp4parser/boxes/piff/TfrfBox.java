package com.googlecode.mp4parser.boxes.piff;

import com.googlecode.mp4parser.AbstractFullBox;
import com.meituan.robust.Constants;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import p149l.bzp;
import p149l.cvc0;
import p149l.yyp;

/* JADX INFO: loaded from: classes7.dex */
public class TfrfBox extends AbstractFullBox {
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2 = null;
    public List<C3444a> entries;

    /* JADX INFO: renamed from: com.googlecode.mp4parser.boxes.piff.TfrfBox$a */
    public class C3444a {

        /* JADX INFO: renamed from: a */
        long f11719a;

        /* JADX INFO: renamed from: b */
        long f11720b;

        public C3444a() {
        }

        public String toString() {
            return "Entry{fragmentAbsoluteTime=" + this.f11719a + ", fragmentAbsoluteDuration=" + this.f11720b + '}';
        }
    }

    static {
        ajc$preClinit();
    }

    public TfrfBox() {
        super("uuid");
        this.entries = new ArrayList();
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("TfrfBox.java", TfrfBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getFragmentCount", "com.googlecode.mp4parser.boxes.piff.TfrfBox", "", "", "", Constants.LONG), 91);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getEntries", "com.googlecode.mp4parser.boxes.piff.TfrfBox", "", "", "", "java.util.List"), 95);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "toString", "com.googlecode.mp4parser.boxes.piff.TfrfBox", "", "", "", "java.lang.String"), 100);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        int iM216561n = yyp.m216561n(byteBuffer);
        for (int i = 0; i < iM216561n; i++) {
            C3444a c3444a = new C3444a();
            if (getVersion() == 1) {
                c3444a.f11719a = yyp.m216560m(byteBuffer);
                c3444a.f11720b = yyp.m216560m(byteBuffer);
            } else {
                c3444a.f11719a = yyp.m216558k(byteBuffer);
                c3444a.f11720b = yyp.m216558k(byteBuffer);
            }
            this.entries.add(c3444a);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        bzp.m104638j(byteBuffer, this.entries.size());
        for (C3444a c3444a : this.entries) {
            if (getVersion() == 1) {
                bzp.m104637i(byteBuffer, c3444a.f11719a);
                bzp.m104637i(byteBuffer, c3444a.f11720b);
            } else {
                bzp.m104635g(byteBuffer, c3444a.f11719a);
                bzp.m104635g(byteBuffer, c3444a.f11720b);
            }
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return (this.entries.size() * (getVersion() == 1 ? 16 : 8)) + 5;
    }

    public List<C3444a> getEntries() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_1, this, this));
        return this.entries;
    }

    public long getFragmentCount() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.entries.size();
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public byte[] getUserType() {
        return new byte[]{-44, -128, 126, -14, -54, 57, 70, -107, -114, 84, 38, -53, -98, 70, -89, -97};
    }

    public String toString() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_2, this, this));
        return "TfrfBox{entries=" + this.entries + '}';
    }
}
