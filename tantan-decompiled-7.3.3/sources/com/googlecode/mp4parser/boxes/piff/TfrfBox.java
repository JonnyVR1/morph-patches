package com.googlecode.mp4parser.boxes.piff;

import com.googlecode.mp4parser.AbstractFullBox;
import com.meituan.robust.Constants;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import p153l.b1q;
import p153l.f3d0;
import p153l.y0q;

/* JADX INFO: loaded from: classes7.dex */
public class TfrfBox extends AbstractFullBox {
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2 = null;
    public List<C3467a> entries;

    /* JADX INFO: renamed from: com.googlecode.mp4parser.boxes.piff.TfrfBox$a */
    public class C3467a {

        /* JADX INFO: renamed from: a */
        long f11756a;

        /* JADX INFO: renamed from: b */
        long f11757b;

        public C3467a() {
        }

        public String toString() {
            return "Entry{fragmentAbsoluteTime=" + this.f11756a + ", fragmentAbsoluteDuration=" + this.f11757b + '}';
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
        int iM213898n = y0q.m213898n(byteBuffer);
        for (int i = 0; i < iM213898n; i++) {
            C3467a c3467a = new C3467a();
            if (getVersion() == 1) {
                c3467a.f11756a = y0q.m213897m(byteBuffer);
                c3467a.f11757b = y0q.m213897m(byteBuffer);
            } else {
                c3467a.f11756a = y0q.m213895k(byteBuffer);
                c3467a.f11757b = y0q.m213895k(byteBuffer);
            }
            this.entries.add(c3467a);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        b1q.m101498j(byteBuffer, this.entries.size());
        for (C3467a c3467a : this.entries) {
            if (getVersion() == 1) {
                b1q.m101497i(byteBuffer, c3467a.f11756a);
                b1q.m101497i(byteBuffer, c3467a.f11757b);
            } else {
                b1q.m101495g(byteBuffer, c3467a.f11756a);
                b1q.m101495g(byteBuffer, c3467a.f11757b);
            }
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return (this.entries.size() * (getVersion() == 1 ? 16 : 8)) + 5;
    }

    public List<C3467a> getEntries() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_1, this, this));
        return this.entries;
    }

    public long getFragmentCount() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.entries.size();
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public byte[] getUserType() {
        return new byte[]{-44, -128, 126, -14, -54, 57, 70, -107, -114, 84, 38, -53, -98, 70, -89, -97};
    }

    public String toString() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_2, this, this));
        return "TfrfBox{entries=" + this.entries + '}';
    }
}
