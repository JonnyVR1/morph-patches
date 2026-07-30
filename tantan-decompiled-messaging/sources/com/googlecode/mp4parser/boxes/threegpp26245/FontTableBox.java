package com.googlecode.mp4parser.boxes.threegpp26245;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.googlecode.mp4parser.AbstractBox;
import com.meituan.robust.Constants;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import p149l.bzp;
import p149l.cvc0;
import p149l.mck0;
import p149l.yyp;

/* JADX INFO: loaded from: classes7.dex */
public class FontTableBox extends AbstractBox {
    public static final String TYPE = "ftab";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1 = null;
    List<C3446a> entries;

    /* JADX INFO: renamed from: com.googlecode.mp4parser.boxes.threegpp26245.FontTableBox$a */
    public static class C3446a {

        /* JADX INFO: renamed from: a */
        int f11728a;

        /* JADX INFO: renamed from: b */
        String f11729b;

        /* JADX INFO: renamed from: a */
        public void m17414a(ByteBuffer byteBuffer) {
            bzp.m104633e(byteBuffer, this.f11728a);
            bzp.m104638j(byteBuffer, this.f11729b.length());
            byteBuffer.put(mck0.m154017b(this.f11729b));
        }

        /* JADX INFO: renamed from: b */
        public int m17415b() {
            return mck0.m154018c(this.f11729b) + 3;
        }

        /* JADX INFO: renamed from: c */
        public void m17416c(ByteBuffer byteBuffer) {
            this.f11728a = yyp.m216556i(byteBuffer);
            this.f11729b = yyp.m216555h(byteBuffer, yyp.m216561n(byteBuffer));
        }

        public String toString() {
            return "FontRecord{fontId=" + this.f11728a + ", fontname='" + this.f11729b + "'}";
        }
    }

    static {
        ajc$preClinit();
    }

    public FontTableBox() {
        super(TYPE);
        this.entries = new LinkedList();
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("FontTableBox.java", FontTableBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getEntries", "com.googlecode.mp4parser.boxes.threegpp26245.FontTableBox", "", "", "", "java.util.List"), 52);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setEntries", "com.googlecode.mp4parser.boxes.threegpp26245.FontTableBox", "java.util.List", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "", Constants.VOID), 56);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        int iM216556i = yyp.m216556i(byteBuffer);
        for (int i = 0; i < iM216556i; i++) {
            C3446a c3446a = new C3446a();
            c3446a.m17416c(byteBuffer);
            this.entries.add(c3446a);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        bzp.m104633e(byteBuffer, this.entries.size());
        Iterator<C3446a> it = this.entries.iterator();
        while (it.hasNext()) {
            it.next().m17414a(byteBuffer);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        Iterator<C3446a> it = this.entries.iterator();
        int iM17415b = 2;
        while (it.hasNext()) {
            iM17415b += it.next().m17415b();
        }
        return iM17415b;
    }

    public List<C3446a> getEntries() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.entries;
    }

    public void setEntries(List<C3446a> list) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_1, this, this, list));
        this.entries = list;
    }
}
