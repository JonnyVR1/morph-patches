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
import p153l.b1q;
import p153l.f3d0;
import p153l.slk0;
import p153l.y0q;

/* JADX INFO: loaded from: classes7.dex */
public class FontTableBox extends AbstractBox {
    public static final String TYPE = "ftab";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1 = null;
    List<C3469a> entries;

    /* JADX INFO: renamed from: com.googlecode.mp4parser.boxes.threegpp26245.FontTableBox$a */
    public static class C3469a {

        /* JADX INFO: renamed from: a */
        int f11765a;

        /* JADX INFO: renamed from: b */
        String f11766b;

        /* JADX INFO: renamed from: a */
        public void m17469a(ByteBuffer byteBuffer) {
            b1q.m101493e(byteBuffer, this.f11765a);
            b1q.m101498j(byteBuffer, this.f11766b.length());
            byteBuffer.put(slk0.m186593b(this.f11766b));
        }

        /* JADX INFO: renamed from: b */
        public int m17470b() {
            return slk0.m186594c(this.f11766b) + 3;
        }

        /* JADX INFO: renamed from: c */
        public void m17471c(ByteBuffer byteBuffer) {
            this.f11765a = y0q.m213893i(byteBuffer);
            this.f11766b = y0q.m213892h(byteBuffer, y0q.m213898n(byteBuffer));
        }

        public String toString() {
            return "FontRecord{fontId=" + this.f11765a + ", fontname='" + this.f11766b + "'}";
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
        int iM213893i = y0q.m213893i(byteBuffer);
        for (int i = 0; i < iM213893i; i++) {
            C3469a c3469a = new C3469a();
            c3469a.m17471c(byteBuffer);
            this.entries.add(c3469a);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        b1q.m101493e(byteBuffer, this.entries.size());
        Iterator<C3469a> it = this.entries.iterator();
        while (it.hasNext()) {
            it.next().m17469a(byteBuffer);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        Iterator<C3469a> it = this.entries.iterator();
        int iM17470b = 2;
        while (it.hasNext()) {
            iM17470b += it.next().m17470b();
        }
        return iM17470b;
    }

    public List<C3469a> getEntries() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.entries;
    }

    public void setEntries(List<C3469a> list) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_1, this, this, list));
        this.entries = list;
    }
}
